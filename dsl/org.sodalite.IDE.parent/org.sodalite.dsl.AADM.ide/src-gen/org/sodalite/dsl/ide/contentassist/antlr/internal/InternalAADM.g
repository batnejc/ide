/*
 * generated by Xtext 2.19.0
 */
grammar InternalAADM;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.sodalite.dsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.sodalite.dsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.sodalite.dsl.services.AADMGrammarAccess;

}
@parser::members {
	private AADMGrammarAccess grammarAccess;

	public void setGrammarAccess(AADMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAADM_Model
entryRuleAADM_Model
:
{ before(grammarAccess.getAADM_ModelRule()); }
	 ruleAADM_Model
{ after(grammarAccess.getAADM_ModelRule()); } 
	 EOF 
;

// Rule AADM_Model
ruleAADM_Model 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAADM_ModelAccess().getGroup()); }
		(rule__AADM_Model__Group__0)?
		{ after(grammarAccess.getAADM_ModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleENodeTemplates
entryRuleENodeTemplates
:
{ before(grammarAccess.getENodeTemplatesRule()); }
	 ruleENodeTemplates
{ after(grammarAccess.getENodeTemplatesRule()); } 
	 EOF 
;

// Rule ENodeTemplates
ruleENodeTemplates 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getENodeTemplatesAccess().getGroup()); }
		(rule__ENodeTemplates__Group__0)
		{ after(grammarAccess.getENodeTemplatesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleENodeTemplate
entryRuleENodeTemplate
:
{ before(grammarAccess.getENodeTemplateRule()); }
	 ruleENodeTemplate
{ after(grammarAccess.getENodeTemplateRule()); } 
	 EOF 
;

// Rule ENodeTemplate
ruleENodeTemplate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getENodeTemplateAccess().getGroup()); }
		(rule__ENodeTemplate__Group__0)
		{ after(grammarAccess.getENodeTemplateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleENodeTemplateBody
entryRuleENodeTemplateBody
:
{ before(grammarAccess.getENodeTemplateBodyRule()); }
	 ruleENodeTemplateBody
{ after(grammarAccess.getENodeTemplateBodyRule()); } 
	 EOF 
;

// Rule ENodeTemplateBody
ruleENodeTemplateBody 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup()); }
		(rule__ENodeTemplateBody__UnorderedGroup)
		{ after(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleERequirements
entryRuleERequirements
:
{ before(grammarAccess.getERequirementsRule()); }
	 ruleERequirements
{ after(grammarAccess.getERequirementsRule()); } 
	 EOF 
;

// Rule ERequirements
ruleERequirements 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getERequirementsAccess().getGroup()); }
		(rule__ERequirements__Group__0)
		{ after(grammarAccess.getERequirementsAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleERequirementAssignment
entryRuleERequirementAssignment
:
{ before(grammarAccess.getERequirementAssignmentRule()); }
	 ruleERequirementAssignment
{ after(grammarAccess.getERequirementAssignmentRule()); } 
	 EOF 
;

// Rule ERequirementAssignment
ruleERequirementAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getERequirementAssignmentAccess().getGroup()); }
		(rule__ERequirementAssignment__Group__0)
		{ after(grammarAccess.getERequirementAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEAttributes
entryRuleEAttributes
:
{ before(grammarAccess.getEAttributesRule()); }
	 ruleEAttributes
{ after(grammarAccess.getEAttributesRule()); } 
	 EOF 
;

// Rule EAttributes
ruleEAttributes 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEAttributesAccess().getGroup()); }
		(rule__EAttributes__Group__0)
		{ after(grammarAccess.getEAttributesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEAttributeAssignment
entryRuleEAttributeAssignment
:
{ before(grammarAccess.getEAttributeAssignmentRule()); }
	 ruleEAttributeAssignment
{ after(grammarAccess.getEAttributeAssignmentRule()); } 
	 EOF 
;

// Rule EAttributeAssignment
ruleEAttributeAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEAttributeAssignmentAccess().getGroup()); }
		(rule__EAttributeAssignment__Group__0)
		{ after(grammarAccess.getEAttributeAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEProperties
entryRuleEProperties
:
{ before(grammarAccess.getEPropertiesRule()); }
	 ruleEProperties
{ after(grammarAccess.getEPropertiesRule()); } 
	 EOF 
;

// Rule EProperties
ruleEProperties 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEPropertiesAccess().getGroup()); }
		(rule__EProperties__Group__0)
		{ after(grammarAccess.getEPropertiesAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEPropertyAssignment
entryRuleEPropertyAssignment
:
{ before(grammarAccess.getEPropertyAssignmentRule()); }
	 ruleEPropertyAssignment
{ after(grammarAccess.getEPropertyAssignmentRule()); } 
	 EOF 
;

// Rule EPropertyAssignment
ruleEPropertyAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEPropertyAssignmentAccess().getGroup()); }
		(rule__EPropertyAssignment__Group__0)
		{ after(grammarAccess.getEPropertyAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AADM_Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AADM_Model__Group__0__Impl
	rule__AADM_Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AADM_Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAADM_ModelAccess().getNode_templatesKeyword_0()); }
	'node_templates{'
	{ after(grammarAccess.getAADM_ModelAccess().getNode_templatesKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AADM_Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AADM_Model__Group__1__Impl
	rule__AADM_Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AADM_Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAADM_ModelAccess().getNodeTemplatesAssignment_1()); }
	(rule__AADM_Model__NodeTemplatesAssignment_1)
	{ after(grammarAccess.getAADM_ModelAccess().getNodeTemplatesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AADM_Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AADM_Model__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AADM_Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAADM_ModelAccess().getRightCurlyBracketKeyword_2()); }
	'}'
	{ after(grammarAccess.getAADM_ModelAccess().getRightCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplates__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplates__Group__0__Impl
	rule__ENodeTemplates__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplates__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplatesAccess().getENodeTemplatesAction_0()); }
	()
	{ after(grammarAccess.getENodeTemplatesAccess().getENodeTemplatesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplates__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplates__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplates__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesAssignment_1()); }
		(rule__ENodeTemplates__NodeTemplatesAssignment_1)
		{ after(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesAssignment_1()); }
		(rule__ENodeTemplates__NodeTemplatesAssignment_1)*
		{ after(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplate__Group__0__Impl
	rule__ENodeTemplate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateAccess().getNameAssignment_0()); }
	(rule__ENodeTemplate__NameAssignment_0)
	{ after(grammarAccess.getENodeTemplateAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplate__Group__1__Impl
	rule__ENodeTemplate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getENodeTemplateAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplate__Group__2__Impl
	rule__ENodeTemplate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateAccess().getNodeAssignment_2()); }
	(rule__ENodeTemplate__NodeAssignment_2)
	{ after(grammarAccess.getENodeTemplateAccess().getNodeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplate__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getENodeTemplateAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplateBody__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_0__0__Impl
	rule__ENodeTemplateBody__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getTypeKeyword_0_0()); }
	'type:'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getTypeKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getTypeAssignment_0_1()); }
	(rule__ENodeTemplateBody__TypeAssignment_0_1)
	{ after(grammarAccess.getENodeTemplateBodyAccess().getTypeAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplateBody__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_1__0__Impl
	rule__ENodeTemplateBody__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getDescriptionKeyword_1_0()); }
	'description:'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getDescriptionKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getDescriptionAssignment_1_1()); }
	(rule__ENodeTemplateBody__DescriptionAssignment_1_1)
	{ after(grammarAccess.getENodeTemplateBodyAccess().getDescriptionAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplateBody__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_2__0__Impl
	rule__ENodeTemplateBody__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getPropertiesKeyword_2_0()); }
	'properties{'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getPropertiesKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_2__1__Impl
	rule__ENodeTemplateBody__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getPropertiesAssignment_2_1()); }
	(rule__ENodeTemplateBody__PropertiesAssignment_2_1)
	{ after(grammarAccess.getENodeTemplateBodyAccess().getPropertiesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getRightCurlyBracketKeyword_2_2()); }
	'}'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getRightCurlyBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplateBody__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_3__0__Impl
	rule__ENodeTemplateBody__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getAttributesKeyword_3_0()); }
	'attributes{'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getAttributesKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_3__1__Impl
	rule__ENodeTemplateBody__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getAtributesAssignment_3_1()); }
	(rule__ENodeTemplateBody__AtributesAssignment_3_1)
	{ after(grammarAccess.getENodeTemplateBodyAccess().getAtributesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getRightCurlyBracketKeyword_3_2()); }
	'}'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getRightCurlyBracketKeyword_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplateBody__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_4__0__Impl
	rule__ENodeTemplateBody__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getRequirementsKeyword_4_0()); }
	'requirements{'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getRequirementsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_4__1__Impl
	rule__ENodeTemplateBody__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getRequirementsAssignment_4_1()); }
	(rule__ENodeTemplateBody__RequirementsAssignment_4_1)
	{ after(grammarAccess.getENodeTemplateBodyAccess().getRequirementsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getENodeTemplateBodyAccess().getRightCurlyBracketKeyword_4_2()); }
	'}'
	{ after(grammarAccess.getENodeTemplateBodyAccess().getRightCurlyBracketKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ERequirements__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirements__Group__0__Impl
	rule__ERequirements__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirements__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementsAccess().getERequirementsAction_0()); }
	()
	{ after(grammarAccess.getERequirementsAccess().getERequirementsAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirements__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirements__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirements__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementsAccess().getRequirementsAssignment_1()); }
	(rule__ERequirements__RequirementsAssignment_1)*
	{ after(grammarAccess.getERequirementsAccess().getRequirementsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ERequirementAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirementAssignment__Group__0__Impl
	rule__ERequirementAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementAssignmentAccess().getNameAssignment_0()); }
	(rule__ERequirementAssignment__NameAssignment_0)
	{ after(grammarAccess.getERequirementAssignmentAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirementAssignment__Group__1__Impl
	rule__ERequirementAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementAssignmentAccess().getLeftCurlyBracketKeyword_1()); }
	'{'
	{ after(grammarAccess.getERequirementAssignmentAccess().getLeftCurlyBracketKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirementAssignment__Group__2__Impl
	rule__ERequirementAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementAssignmentAccess().getGroup_2()); }
	(rule__ERequirementAssignment__Group_2__0)
	{ after(grammarAccess.getERequirementAssignmentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirementAssignment__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementAssignmentAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getERequirementAssignmentAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ERequirementAssignment__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirementAssignment__Group_2__0__Impl
	rule__ERequirementAssignment__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementAssignmentAccess().getNodeKeyword_2_0()); }
	'node:'
	{ after(grammarAccess.getERequirementAssignmentAccess().getNodeKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ERequirementAssignment__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getERequirementAssignmentAccess().getNodeAssignment_2_1()); }
	(rule__ERequirementAssignment__NodeAssignment_2_1)
	{ after(grammarAccess.getERequirementAssignmentAccess().getNodeAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EAttributes__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EAttributes__Group__0__Impl
	rule__EAttributes__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributes__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEAttributesAccess().getEAttributesAction_0()); }
	()
	{ after(grammarAccess.getEAttributesAccess().getEAttributesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributes__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EAttributes__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributes__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEAttributesAccess().getAttributesAssignment_1()); }
	(rule__EAttributes__AttributesAssignment_1)*
	{ after(grammarAccess.getEAttributesAccess().getAttributesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EAttributeAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EAttributeAssignment__Group__0__Impl
	rule__EAttributeAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEAttributeAssignmentAccess().getNameAssignment_0()); }
	(rule__EAttributeAssignment__NameAssignment_0)
	{ after(grammarAccess.getEAttributeAssignmentAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EAttributeAssignment__Group__1__Impl
	rule__EAttributeAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEAttributeAssignmentAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getEAttributeAssignmentAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EAttributeAssignment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEAttributeAssignmentAccess().getValueAssignment_2()); }
	(rule__EAttributeAssignment__ValueAssignment_2)
	{ after(grammarAccess.getEAttributeAssignmentAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EProperties__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EProperties__Group__0__Impl
	rule__EProperties__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EProperties__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropertiesAccess().getEPropertiesAction_0()); }
	()
	{ after(grammarAccess.getEPropertiesAccess().getEPropertiesAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EProperties__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EProperties__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EProperties__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropertiesAccess().getPropertiesAssignment_1()); }
	(rule__EProperties__PropertiesAssignment_1)*
	{ after(grammarAccess.getEPropertiesAccess().getPropertiesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EPropertyAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropertyAssignment__Group__0__Impl
	rule__EPropertyAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropertyAssignmentAccess().getNameAssignment_0()); }
	(rule__EPropertyAssignment__NameAssignment_0)
	{ after(grammarAccess.getEPropertyAssignmentAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropertyAssignment__Group__1__Impl
	rule__EPropertyAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropertyAssignmentAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getEPropertyAssignmentAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EPropertyAssignment__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEPropertyAssignmentAccess().getValueAssignment_2()); }
	(rule__EPropertyAssignment__ValueAssignment_2)
	{ after(grammarAccess.getEPropertyAssignmentAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ENodeTemplateBody__UnorderedGroup
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
	}
:
	rule__ENodeTemplateBody__UnorderedGroup__0
	{getUnorderedGroupHelper().canLeave(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup())}?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__UnorderedGroup__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getENodeTemplateBodyAccess().getGroup_0()); }
					(rule__ENodeTemplateBody__Group_0__0)
					{ after(grammarAccess.getENodeTemplateBodyAccess().getGroup_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getENodeTemplateBodyAccess().getGroup_1()); }
					(rule__ENodeTemplateBody__Group_1__0)
					{ after(grammarAccess.getENodeTemplateBodyAccess().getGroup_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 2);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getENodeTemplateBodyAccess().getGroup_2()); }
					(rule__ENodeTemplateBody__Group_2__0)
					{ after(grammarAccess.getENodeTemplateBodyAccess().getGroup_2()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 3)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 3);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getENodeTemplateBodyAccess().getGroup_3()); }
					(rule__ENodeTemplateBody__Group_3__0)
					{ after(grammarAccess.getENodeTemplateBodyAccess().getGroup_3()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 4)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), 4);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getENodeTemplateBodyAccess().getGroup_4()); }
					(rule__ENodeTemplateBody__Group_4__0)
					{ after(grammarAccess.getENodeTemplateBodyAccess().getGroup_4()); }
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup());
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__UnorderedGroup__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__UnorderedGroup__Impl
	rule__ENodeTemplateBody__UnorderedGroup__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__UnorderedGroup__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__UnorderedGroup__Impl
	rule__ENodeTemplateBody__UnorderedGroup__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__UnorderedGroup__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__UnorderedGroup__Impl
	rule__ENodeTemplateBody__UnorderedGroup__3?
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__UnorderedGroup__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__UnorderedGroup__Impl
	rule__ENodeTemplateBody__UnorderedGroup__4?
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__UnorderedGroup__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ENodeTemplateBody__UnorderedGroup__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__AADM_Model__NodeTemplatesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAADM_ModelAccess().getNodeTemplatesENodeTemplatesParserRuleCall_1_0()); }
		ruleENodeTemplates
		{ after(grammarAccess.getAADM_ModelAccess().getNodeTemplatesENodeTemplatesParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplates__NodeTemplatesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesENodeTemplateParserRuleCall_1_0()); }
		ruleENodeTemplate
		{ after(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesENodeTemplateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getENodeTemplateAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplate__NodeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateAccess().getNodeENodeTemplateBodyParserRuleCall_2_0()); }
		ruleENodeTemplateBody
		{ after(grammarAccess.getENodeTemplateAccess().getNodeENodeTemplateBodyParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__TypeAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateBodyAccess().getTypeQUALIFIED_NAMETerminalRuleCall_0_1_0()); }
		RULE_QUALIFIED_NAME
		{ after(grammarAccess.getENodeTemplateBodyAccess().getTypeQUALIFIED_NAMETerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__DescriptionAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getENodeTemplateBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__PropertiesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateBodyAccess().getPropertiesEPropertiesParserRuleCall_2_1_0()); }
		ruleEProperties
		{ after(grammarAccess.getENodeTemplateBodyAccess().getPropertiesEPropertiesParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__AtributesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateBodyAccess().getAtributesEAttributesParserRuleCall_3_1_0()); }
		ruleEAttributes
		{ after(grammarAccess.getENodeTemplateBodyAccess().getAtributesEAttributesParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ENodeTemplateBody__RequirementsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getENodeTemplateBodyAccess().getRequirementsERequirementsParserRuleCall_4_1_0()); }
		ruleERequirements
		{ after(grammarAccess.getENodeTemplateBodyAccess().getRequirementsERequirementsParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirements__RequirementsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getERequirementsAccess().getRequirementsERequirementAssignmentParserRuleCall_1_0()); }
		ruleERequirementAssignment
		{ after(grammarAccess.getERequirementsAccess().getRequirementsERequirementAssignmentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getERequirementAssignmentAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getERequirementAssignmentAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ERequirementAssignment__NodeAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getERequirementAssignmentAccess().getNodeENodeTemplateCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getERequirementAssignmentAccess().getNodeENodeTemplateIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getERequirementAssignmentAccess().getNodeENodeTemplateIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getERequirementAssignmentAccess().getNodeENodeTemplateCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributes__AttributesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEAttributesAccess().getAttributesEAttributeAssignmentParserRuleCall_1_0()); }
		ruleEAttributeAssignment
		{ after(grammarAccess.getEAttributesAccess().getAttributesEAttributeAssignmentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEAttributeAssignmentAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEAttributeAssignmentAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EAttributeAssignment__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEAttributeAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getEAttributeAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EProperties__PropertiesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyAssignmentParserRuleCall_1_0()); }
		ruleEPropertyAssignment
		{ after(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyAssignmentParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEPropertyAssignmentAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEPropertyAssignmentAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EPropertyAssignment__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEPropertyAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getEPropertyAssignmentAccess().getValueSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_QUALIFIED_NAME : RULE_ID ('.' RULE_ID)+;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'-'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;