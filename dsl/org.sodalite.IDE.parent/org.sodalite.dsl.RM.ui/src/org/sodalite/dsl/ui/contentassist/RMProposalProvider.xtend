/*
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.ui.contentassist


import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.text.contentassist.ICompletionProposal
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.Keyword
import org.eclipse.ui.PlatformUI
import org.eclipse.swt.widgets.FileDialog

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */

class RMProposalProvider extends AbstractRMProposalProvider {	
	final String SELF_DESCRIPTION = 
	"A TOSCA orchestrator will interpret this keyword as the Node or Relationship\n" + 
	"Template instance that contains the function at the time the function is evaluated"
	final String SOURCE_DESCRIPTION = 
	"A TOSCA orchestrator will interpret this keyword as the Node Template instance that\n" + 
	"is at the source end of the relationship that contains the referencing function."
	final String TARGET_DESCRIPTION = 
	"A TOSCA orchestratorwill interpret this keyword as the Node Template instance that is\n" + 
	"at the target end of the relationship that contains the referencing function"
	final String HOST_DESCRIPTION = "A TOSCA orchestrator will interpret this keyword to refer\n" + 
	"to the all nodes that “host”the node using this reference (i.e., as identified by its HostedOn relationship)."
	
	// this override filters the keywords for which to create content assist proposals
	override void completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		_completeKeyword(keyword, contentAssistContext, acceptor);
	}

	def void _completeKeyword(Keyword keyword, ContentAssistContext contentAssistContext,
		ICompletionProposalAcceptor acceptor) {
		val ICompletionProposal proposal = createCompletionProposal(keyword.getValue(),
			getKeywordDisplayString(keyword), getImage(keyword), contentAssistContext);
		getPriorityHelper().adjustKeywordPriority(proposal, contentAssistContext.getPrefix());
		acceptor.accept(proposal);
	}
	
	override void completeENodeType_Name(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ENodeType::name property")
		val String proposalText = "tosca.types.id"
		val String displayText = "tosca.types.id"
		val String additionalProposalInfo = "The required id of the node type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEDataType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EDataType::name property")
		val String proposalText = "tosca.datatypes.id"
		val String displayText = "tosca.datatypes.id"
		val String additionalProposalInfo = "The required id of the data type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEArtifactType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EArtifactType::name property")
		val String proposalText = "tosca.artifacts.id"
		val String displayText = "tosca.artifacts.id"
		val String additionalProposalInfo = "The required id of the artifact type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeECapabilityType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ECapabilityType::name property")
		val String proposalText = "tosca.capabilities.id"
		val String displayText = "tosca.capabilities.id"
		val String additionalProposalInfo = "The required id of the capability type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEInterfaceType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for EInterfaceType::name property")
		val String proposalText = "tosca.interfaces.id"
		val String displayText = "tosca.interfaces.id"
		val String additionalProposalInfo = "The required id of the interface type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}

	
	override void completeERelationshipType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for ERelationshipType::name property")
		val String proposalText = "tosca.relationships.id"
		val String displayText = "tosca.relationships.id"
		val String additionalProposalInfo = "The required id of the relationship type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPolicyType_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EPolicyType::name property")
		val String proposalText = "tosca.policies.id"
		val String displayText = "tosca.policies.id"
		val String additionalProposalInfo = "The required id of the policy type"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPropertyDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for EPropertyDefinition::name property")
		val String proposalText = "property_name"
		val String displayText = "property_name"
		val String additionalProposalInfo = "The required id of the property definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEAttributeDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		System.out.println("Invoking content assist for EAttributeDefinition::name property")
		val String proposalText = "attribute_name"
		val String displayText = "attribute_name"
		val String additionalProposalInfo = "The required id of the attribute definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEInterfaceDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EInterfaceDefinition::name property")
		val String proposalText = "interface_name"
		val String displayText = "interface_name"
		val String additionalProposalInfo = "The required id of the interface definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEOperationDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EOperationDefinition::name property")
		val String proposalText = "operation_name"
		val String displayText = "operation_name"
		val String additionalProposalInfo = "The required id of the operation definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEParameterDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EParameterDefinition::name property")
		val String proposalText = "parameter_name"
		val String displayText = "parameter_name"
		val String additionalProposalInfo = "The required id of the parameter definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeECapabilityDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ECapabilityDefinition::name property")
		val String proposalText = "capability_name"
		val String displayText = "capability_name"
		val String additionalProposalInfo = "The required id of the capability definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeERequirementDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ERequirementDefinition::name property")
		val String proposalText = "requirement_name"
		val String displayText = "requirement_name"
		val String additionalProposalInfo = "The required id of the requirement definition"

		createEditableCompletionProposal(proposalText, displayText, context, additionalProposalInfo, acceptor);
	}
	
	override void completeEPropertyDefinitionBody_Required(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EPropertyDefinitionBody::required property")
		createNonEditableCompletionProposal ("true", "true", context, "", acceptor);
		createNonEditableCompletionProposal ("false", "false", context, "", acceptor);
	}
	
	override void completeGetAttributeBody_Entity(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetAttributeBody::entity property")
		createEntityProposals (context, acceptor);
	}
	
	override void completeGetPropertyBody_Entity(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for GetPropertyBody::entity property")
		createEntityProposals (context, acceptor);
	}
	
	override void completeEMapEntry_Key(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EMapEntry::key property")
		createEditableCompletionProposal ("map_key_name", "map_key_name", context, "Key name for map entry", acceptor);
	}
	
	override void completeELIST_List(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for ELIST::list property")
		createEditableCompletionProposal ("\"value\"", "\"value\"", context, "Give a single String value or a comma separate list of String values", acceptor);
	}
	
	override void complete_EMAP(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		System.out.println("Invoking content assist for EMAP::map property")
		createEditableCompletionProposal ("{", "{", context, "Start a Map of key=value entries", acceptor);
	}
	
	override void completeEImplementation_Primary(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// Show file selection dialog to the user. Get path of file selected by the user and provide suggestion
		val input = selectFile ("Select implementation primary file")
		createEditableCompletionProposal (input, input, context, "", acceptor);
	}
	
	override void completeEImplementation_Dependencies(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		// Show file selection dialog to the user. Get path of file selected by the user and provide suggestion
		val input = selectFile ("Select implementation dependency file")
		createEditableCompletionProposal (input, input, context, "", acceptor);
	}
	
	protected def String selectFile (String dialogText){
		var shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell()
		// File standard dialog
		var fileDialog = new FileDialog(shell);
		fileDialog.setText(dialogText);
		//fileDialog.setFilterExtensions(new String[] { "*.txt" });
		// Put in a readable name for the filter
		//fileDialog.setFilterNames(new String[] { "Textfiles(*.txt)" });
		var selected = fileDialog.open();
		System.out.println(dialogText +": " + selected);
		return "\"" + selected + "\""
	}
	
	protected def void createEntityProposals(ContentAssistContext context, ICompletionProposalAcceptor acceptor){
		createNonEditableCompletionProposal ("SELF", "SELF", context, SELF_DESCRIPTION, acceptor);
		createNonEditableCompletionProposal ("SOURCE", "SOURCE", context, SOURCE_DESCRIPTION, acceptor);
		createNonEditableCompletionProposal ("TARGET", "TARGET", context, TARGET_DESCRIPTION, acceptor);
		createNonEditableCompletionProposal ("HOST", "HOST", context, HOST_DESCRIPTION, acceptor);
	}

	protected def void createNonEditableCompletionProposal(String proposalText, String displayText,
		ContentAssistContext context, String additionalProposalInfo, ICompletionProposalAcceptor acceptor) {
		var ICompletionProposal proposal = createCompletionProposal(proposalText, displayText, null, context);
		if (proposal instanceof ConfigurableCompletionProposal) {
			val ConfigurableCompletionProposal configurable = proposal as ConfigurableCompletionProposal;
			configurable.setAdditionalProposalInfo(additionalProposalInfo);
			configurable.setAutoInsertable(false);
		}
		acceptor.accept(proposal)
	}
	
	protected def void createEditableCompletionProposal(String proposalText, String displayText,
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
	
	static enum Boolean{
		True, False
	}

}
