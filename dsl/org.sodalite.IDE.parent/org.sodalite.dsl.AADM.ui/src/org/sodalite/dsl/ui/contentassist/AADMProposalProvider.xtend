/*******************************************************************************
 * Copyright (c) 2019 Atos Spain S.A.
 * This program and the accompanying materials
 * are made available under the terms of the Apache Public License 2.0 (APL2)
 * which accompanies this distribution, and is available at
 * https://apache.org/licenses/LICENSE-2.0
 *
 * Contributors:
 *     Jesús Gorroñogoitia - Design and implementation
 *******************************************************************************/

package org.sodalite.dsl.ui.contentassist

import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Keyword
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.impl.KeywordImpl
import org.eclipse.xtext.ParserRule
import org.sodalite.dsl.kb_reasoner_client.KBReasonerClient
import org.sodalite.dsl.kb_reasoner_client.types.ReasonerData
import org.sodalite.dsl.kb_reasoner_client.types.Node
import org.sodalite.dsl.kb_reasoner_client.KBReasoner
import org.sodalite.dsl.kb_reasoner_client.types.Attribute
import org.sodalite.dsl.kb_reasoner_client.types.Property
import org.sodalite.dsl.kb_reasoner_client.types.Requirement
import org.sodalite.dsl.aADM.impl.EPropertyAssigmentsImpl
import org.sodalite.dsl.aADM.impl.EAttributeAssigmentsImpl
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentsImpl
import org.sodalite.dsl.aADM.impl.ENodeTemplateBodyImpl
import org.eclipse.jface.preference.IPreferenceStore
import org.sodalite.dsl.ui.preferences.PreferenceConstants
import java.text.MessageFormat
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNodeData
import org.sodalite.dsl.aADM.impl.ERequirementAssignmentImpl
import org.sodalite.dsl.kb_reasoner_client.types.ValidRequirementNode
import java.util.SortedSet
import java.util.TreeSet
import java.util.List
import org.sodalite.dsl.aADM.ENodeTemplate
import java.util.ArrayList
import org.sodalite.dsl.aADM.AADM_Model
import java.nio.file.Path
import java.nio.file.Files
import java.util.Properties
import java.nio.channels.FileChannel
import java.nio.file.StandardOpenOption
import java.nio.channels.FileLock
import java.nio.channels.Channels
import java.nio.file.FileSystems
import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.resources.IResource
import org.sodalite.dsl.ui.preferences.Activator
import org.sodalite.dsl.aADM.impl.ECapabilityAssignmentsImpl
import org.sodalite.dsl.kb_reasoner_client.types.Capability

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class AADMProposalProvider extends AbstractAADMProposalProvider {

	//val keywords = #{'node_templates:'}
	val keywords = #{}
	val assignments = #{'nodeTemplates'}
//	KBReasoner kbclient;
//	new(){
//		val store = 
//	        	new ScopedPreferenceStore(InstanceScope.INSTANCE, "org.sodalite.dsl.AADM.ui") as IPreferenceStore;
//		val kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI) as String;
//		val iacURI = store.getString(PreferenceConstants.KB_REASONER_URI) as String;
//		val xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI) as String;
//		kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI) as KBReasoner;
//		
//		System.out.println (
//			MessageFormat.format(
//				"Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}", kbReasonerURI, iacURI, xoperaURI)
//		);
//	}
	
	def KBReasoner getKBReasoner() {
		// Configure KBReasonerClient endpoint from preference page information
		val IPreferenceStore store = Activator.getDefault().getPreferenceStore();

		val String kbReasonerURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		val String iacURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		val String xoperaURI = store.getString(PreferenceConstants.KB_REASONER_URI);
		val KBReasoner kbclient = new KBReasonerClient(kbReasonerURI, iacURI, xoperaURI);
		System.out.println(
				MessageFormat.format("Sodalite backend configured with [KB Reasoner API: {0}, IaC API: {1}, xOpera {2}",
						kbReasonerURI, iacURI, xoperaURI));
		return kbclient;
	}

	// this override filters the keywords for which to create content assist proposals
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("keyword: " + keyword.value)
		if (keywords.contains(keyword.value))
			return
		else
			_completeKeyword(keyword, contentAssistContext, acceptor);
	}

	override void _completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		proposal.additionalProposalInfo = getAdditionalProposalInfo(keyword)
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}

	def setAdditionalProposalInfo(ICompletionProposal proposal, String info) {
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(info);
		}
	}

	def String getAdditionalProposalInfo(Keyword keyword) {
		if (keyword instanceof KeywordImpl) {
			val keywordImpl = keyword as KeywordImpl
			val rule = findParserRule (keywordImpl)
			
			//ENodeTemplate
			if (rule.name == "ENodeTemplate" && keyword.value == "type:")
				return "The required name of the Node Type the Node Template is based upon"
			else if (rule.name == "ENodeTemplate" && keyword.value == "attributes:")
				return "An optional list of attribute value assignments for the Node Template."
			else if (rule.name == "ENodeTemplate" && keyword.value == "properties:")
				return "An optional list of property value assignments for the Node Template."
			else if (rule.name == "ENodeTemplate" && keyword.value == "requirements:")
				return "An optional sequenced list of requirement assignments for the Node Template."
			
			//ERequirementAssignment
			else if (rule.name == "ERequirementAssignment" && keyword.value == "node:")
				return "The optional reserved keyname used to identify the target node of a relationship.\n specifically, it is used to provide either a: \n\t-Node Template: name that can fulfill the target node requirement.\n\t-Node Type: name that the provider will use to select a type-compatible node template to fulfill the requirement at runtime."
				
			else
				return ""
		}
	}

	def ParserRule findParserRule (EObject obj){
		if (obj === null)
			return null
		else if (obj instanceof ParserRule)
			return obj as ParserRule
		else
			return findParserRule (obj.eContainer) 
	}

	// this override filters the assignments for which to create content assist proposals
	override void completeAssignment(Assignment assignment, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("assignment: " + assignment.feature)
		if (assignments.contains(assignment.feature))
			return
		else
			super.completeAssignment(assignment, contentAssistContext, acceptor);
	}

	// Assignments
	override void completeENodeTemplate_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::name property")
		val String proposalText = "node_template_id"
		val String displayText = "node_template_id"
		val String additionalProposalInfo = "The required id of the node template"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}

	override void completeENodeTemplateBody_Type(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for NodeTemplate::type property")
		
		val ReasonerData<Node> nodes = getKBReasoner().getNodes()
		System.out.println ("Nodes retrieved from KB:")
		for (node: nodes.elements){
			System.out.println ("\tNode: " + node.label)
			val proposalText = node.label
			val displayText = node.label
			val additionalProposalInfo = node.description
			createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);	
		}

		super.completeENodeTemplateBody_Type(model, assignment, context, acceptor)
	}
	
	override void completeEAttributeAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EAttributeAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof EAttributeAssigmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type

		if (resourceId !== null){
			val ReasonerData<Attribute> attributes = getKBReasoner().getAttributes(resourceId)
			if (attributes !== null){}
				System.out.println ("Attributes retrieved from KB for resource: " + resourceId)
				for (attribute: attributes.elements){
					System.out.println ("\tAttribute: " + attribute.uri)
					var attribute_label = attribute.uri.toString.substring(attribute.uri.toString.lastIndexOf('/') + 1, attribute.uri.toString.length)
					proposalText = attribute_label
					displayText = attribute_label
					additionalProposalInfo = attribute.type.label!==null?"Type: " + attribute.type.label:""
					additionalProposalInfo += attribute.description!==null?"\nDescription: " + attribute.description:""
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				}
		}

		proposalText = "attribute_name"
		displayText = "attribute_name"
		additionalProposalInfo = "represents the name of an attribute that would be used to select an attribute\ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship\nTemplate, etc.) which is declared (or reflected from a Property definition) in its declared type \n(e.g., a Node Type, Node Template, Capability Type, etc.). "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPropertyAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EPropertyAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof EPropertyAssigmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type
		
		if (resourceId !== null){
			val ReasonerData<Property> properties = getKBReasoner().getProperties(resourceId)
			if (properties !== null){
				System.out.println ("Properties retrieved from KB for resource: " + resourceId)
				for (property: properties.elements){
				 	System.out.println ("\tProperty: " + property.uri)
				 	var property_label = property.uri.toString.substring(property.uri.toString.lastIndexOf('/') + 1, property.uri.toString.length)
					proposalText = property_label
					displayText = property_label
					additionalProposalInfo = (property.type.label!==null?"Type: " + property.type.label:"") 
					additionalProposalInfo += property.description!==null?"\nDescription: " + property.description:""
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				 }
			}
		}
		
		proposalText = "property_name"
		displayText = "property_name"
		additionalProposalInfo = "represents the name of a property that would be used to select a property \ndefinition with the same name within on a TOSCA entity (e.g., Node Template, Relationship \nTemplate, etc.,) which is declared in its declared type (e.g., a Node Type, Node Template, \nCapability Type, etc.). "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeECapabilityAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for ECapabilityAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof ECapabilityAssignmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type
		
		if (resourceId !== null){
			val ReasonerData<Capability> capabilities = getKBReasoner().getCapabilities(resourceId)
			if (capabilities !== null){
				System.out.println ("Capabilities retrieved from KB for resource: " + resourceId)
				for (capability: capabilities.elements){
					System.out.println ("\nCapability: " + capability.uri)
				 	var property_label = capability.uri.toString.substring(capability.uri.toString.lastIndexOf('/') + 1, capability.uri.toString.length)
					proposalText = property_label
					displayText = property_label
					additionalProposalInfo = ""
					if (capability.type !== null)
						additionalProposalInfo += "\nType: " + capability.type.label
					if (capability.valid_source_types !== null)
						additionalProposalInfo += "\nValid source types:" + capability.valid_source_types 
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				}
			}
		}
		proposalText = "capability_name"
		displayText = "capability_name"
		additionalProposalInfo = "represents the symbolic name of a capability assignment "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeERequirementAssignment_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementAssignment::name property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		
		var resourceId = ""
		if (model instanceof ENodeTemplateBodyImpl)
			resourceId = (model as ENodeTemplateBodyImpl).type
		else if (model instanceof ERequirementAssignmentsImpl)
			resourceId = (model.eContainer as ENodeTemplateBodyImpl).type
		
		if (resourceId !== null){
			val ReasonerData<Requirement> requirements = getKBReasoner().getRequirements(resourceId)
			if (requirements !== null){
				System.out.println ("Requirements retrieved from KB for resource: " + resourceId)
				for (requirement: requirements.elements){
					System.out.println ("\tRequirement: " + requirement.uri)
				 	var property_label = requirement.uri.toString.substring(requirement.uri.toString.lastIndexOf('/') + 1, requirement.uri.toString.length)
					proposalText = property_label
					displayText = property_label
					additionalProposalInfo = ""
					if (requirement.capability !== null)
						additionalProposalInfo += "\nCapability: " + requirement.capability.label
					if (requirement.node !== null)
						additionalProposalInfo += "\nNode: " + requirement.node.label
					if (requirement.occurrences !== null)
						additionalProposalInfo += "\nOccurrences: [" + requirement.occurrences.min + ", " + requirement.occurrences.max + "]"
					createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
				}
			}
		}
		proposalText = "requirement_name"
		displayText = "requirement_name"
		additionalProposalInfo = "represents the symbolic name of a requirement assignment "

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeERequirementAssignment_Node(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementAssignment::node property")
		var String proposalText = ""
		var String displayText = ""
		var String additionalProposalInfo = ""
		val requirementId = (model as ERequirementAssignmentImpl).name
		val nodeType = (model.eContainer.eContainer as ENodeTemplateBodyImpl).type
		
		val AADM_Model rootModel = findModel(model) as AADM_Model
		val String aadmURI = getAADMURI (rootModel); //TODO Use aadmURI to determine if KB suggestion belongs to the local model
		
		//Get valid requirement nodes from KB
		var SortedSet<String> types = new TreeSet<String>()
		val ValidRequirementNodeData vrnd = getKBReasoner().getValidRequirementNodes(requirementId, nodeType);
		if (vrnd !== null){
			System.out.println ("Valid requirement nodes retrieved from KB for requirement: " + requirementId)
			for (ValidRequirementNode vrn: vrnd.elements){
				types.add(vrn.type.label)
				System.out.println ("Valid requirement node: " + vrn.label)
			 	val property_label = vrn.label
			 	displayText = property_label
				proposalText = property_label
				if (existsInAadm(vrn.uri.toString, aadmURI)){
					displayText += " <local>"
				}else{
					displayText += " <in KB>"
				}
				
				additionalProposalInfo = "Node " + vrn.label + " of type " + vrn.type.label + " is available in the KB"
				createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
			}
		}
		
		//Find local nodes that belongs to suggested types
		val List<ENodeTemplate> localnodes = findLocalNodesForTypes(types, model)
		for (ENodeTemplate node: localnodes){
			System.out.println ("Valid requirement local node: " + node.name)
		 	val property_label = node.name
			proposalText = property_label
			displayText = property_label + " <local>"
			additionalProposalInfo = "Node " + node.name + " of type " + node.node.type + " is available in this AADM model"
			createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
		}
	
	}
		
	def existsInAadm(String nodeUri, String aadmUri) {
		return nodeUri.substring(0, nodeUri.lastIndexOf('/')).equals(
			aadmUri.substring(0, aadmUri.lastIndexOf('/'))
		)
	}
		
	def getAADMURI(AADM_Model model) {
		//val String filename = model.eResource.URI.lastSegment
		val String filepath = model.eResource.URI.toString().substring('platform:/resource'.length)
		val IResource resource = ResourcesPlugin.getWorkspace().getRoot().findMember(new org.eclipse.core.runtime.Path(filepath));
		val IProject project = resource.project
		val Path path = getAadmPropertiesFile(resource.toString, project);
		var String uri = null;
		if (Files.exists(path)) {
			val Properties props = new Properties();
			try(val FileChannel channel = FileChannel.open(path, StandardOpenOption.READ);
			val FileLock lock = channel.lock(0L, Long.MAX_VALUE, true)) {
				props.load(Channels.newInputStream(channel));
			}
			uri = props.getProperty("URI");
		}
		
		return uri;
	}
		
	def getAadmPropertiesFile(String filepath, IProject project) {
		//val String filepath = aadmFile.toString();
		val String filename = filepath.substring(filepath.lastIndexOf("/") + 1);
		val String directory = filepath.substring(filepath.indexOf('/', 2) + 1, filepath.lastIndexOf("/"));
		val IFile propertiesFile = project.getFile(directory + "/." + filename + ".properties");
		var String properties_path = propertiesFile.getLocationURI().toString();
		properties_path = properties_path.substring(properties_path.indexOf("/"));
		val Path path = FileSystems.getDefault().getPath(properties_path);
		return path;
	}
	
	
		
	def findLocalNodesForTypes(SortedSet<String> types, EObject reqAssign) {
		val List<ENodeTemplate> nodes = new ArrayList<ENodeTemplate>()
		val AADM_Model model = findModel(reqAssign) as AADM_Model
		for (ENodeTemplate node: model.nodeTemplates.nodeTemplates){
			if (types.contains(node.node.type))
				nodes.add(node)
		}
		return nodes
	}
		
	def findModel(EObject object) {
		if (object.eContainer == null)
			return null
		else if (object.eContainer instanceof AADM_Model)
			return object.eContainer
		else
			return findModel(object.eContainer)
	}

	// Keywords
	override void complete_AADM_Model(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		val String proposalText = "node_templates:"
		val String displayText = "node_templates:"
		val String additionalProposalInfo = "A list of node template definitions for the Topology Template"

		createNonEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}

	// Other stuff
	// This override avoid the default content assist proposal for terminals such as ID
	override void complete_ID(EObject model, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		return
	}

	override protected def void createNonEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
			configurable.setAutoInsertable(false);
		}
		acceptor.accept(proposal)
	}

	override protected def void createEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setSelectionStart(configurable.getReplacementOffset());
			configurable.setSelectionLength(proposalText.length());
			configurable.setAutoInsertable(false);
			configurable.setSimpleLinkedMode(context.getViewer(), '\t', ' ');
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
		}
		acceptor.accept(proposal)
	}

}
