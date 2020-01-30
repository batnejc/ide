/*
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.sodalite.dsl.ide.contentassist.antlr.internal.InternalAADMParser;
import org.sodalite.dsl.services.AADMGrammarAccess;

public class AADMParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(AADMGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, AADMGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAADM_ModelAccess().getGroup(), "rule__AADM_Model__Group__0");
			builder.put(grammarAccess.getENodeTemplatesAccess().getGroup(), "rule__ENodeTemplates__Group__0");
			builder.put(grammarAccess.getENodeTemplateAccess().getGroup(), "rule__ENodeTemplate__Group__0");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getGroup_0(), "rule__ENodeTemplateBody__Group_0__0");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getGroup_1(), "rule__ENodeTemplateBody__Group_1__0");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getGroup_2(), "rule__ENodeTemplateBody__Group_2__0");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getGroup_3(), "rule__ENodeTemplateBody__Group_3__0");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getGroup_4(), "rule__ENodeTemplateBody__Group_4__0");
			builder.put(grammarAccess.getERequirementsAccess().getGroup(), "rule__ERequirements__Group__0");
			builder.put(grammarAccess.getERequirementAssignmentAccess().getGroup(), "rule__ERequirementAssignment__Group__0");
			builder.put(grammarAccess.getERequirementAssignmentAccess().getGroup_2(), "rule__ERequirementAssignment__Group_2__0");
			builder.put(grammarAccess.getEAttributesAccess().getGroup(), "rule__EAttributes__Group__0");
			builder.put(grammarAccess.getEAttributeAssignmentAccess().getGroup(), "rule__EAttributeAssignment__Group__0");
			builder.put(grammarAccess.getEPropertiesAccess().getGroup(), "rule__EProperties__Group__0");
			builder.put(grammarAccess.getEPropertyAssignmentAccess().getGroup(), "rule__EPropertyAssignment__Group__0");
			builder.put(grammarAccess.getAADM_ModelAccess().getNodeTemplatesAssignment_1(), "rule__AADM_Model__NodeTemplatesAssignment_1");
			builder.put(grammarAccess.getENodeTemplatesAccess().getNodeTemplatesAssignment_1(), "rule__ENodeTemplates__NodeTemplatesAssignment_1");
			builder.put(grammarAccess.getENodeTemplateAccess().getNameAssignment_0(), "rule__ENodeTemplate__NameAssignment_0");
			builder.put(grammarAccess.getENodeTemplateAccess().getNodeAssignment_2(), "rule__ENodeTemplate__NodeAssignment_2");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getTypeAssignment_0_1(), "rule__ENodeTemplateBody__TypeAssignment_0_1");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getDescriptionAssignment_1_1(), "rule__ENodeTemplateBody__DescriptionAssignment_1_1");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getPropertiesAssignment_2_1(), "rule__ENodeTemplateBody__PropertiesAssignment_2_1");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getAtributesAssignment_3_1(), "rule__ENodeTemplateBody__AtributesAssignment_3_1");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getRequirementsAssignment_4_1(), "rule__ENodeTemplateBody__RequirementsAssignment_4_1");
			builder.put(grammarAccess.getERequirementsAccess().getRequirementsAssignment_1(), "rule__ERequirements__RequirementsAssignment_1");
			builder.put(grammarAccess.getERequirementAssignmentAccess().getNameAssignment_0(), "rule__ERequirementAssignment__NameAssignment_0");
			builder.put(grammarAccess.getERequirementAssignmentAccess().getNodeAssignment_2_1(), "rule__ERequirementAssignment__NodeAssignment_2_1");
			builder.put(grammarAccess.getEAttributesAccess().getAttributesAssignment_1(), "rule__EAttributes__AttributesAssignment_1");
			builder.put(grammarAccess.getEAttributeAssignmentAccess().getNameAssignment_0(), "rule__EAttributeAssignment__NameAssignment_0");
			builder.put(grammarAccess.getEAttributeAssignmentAccess().getValueAssignment_2(), "rule__EAttributeAssignment__ValueAssignment_2");
			builder.put(grammarAccess.getEPropertiesAccess().getPropertiesAssignment_1(), "rule__EProperties__PropertiesAssignment_1");
			builder.put(grammarAccess.getEPropertyAssignmentAccess().getNameAssignment_0(), "rule__EPropertyAssignment__NameAssignment_0");
			builder.put(grammarAccess.getEPropertyAssignmentAccess().getValueAssignment_2(), "rule__EPropertyAssignment__ValueAssignment_2");
			builder.put(grammarAccess.getENodeTemplateBodyAccess().getUnorderedGroup(), "rule__ENodeTemplateBody__UnorderedGroup");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private AADMGrammarAccess grammarAccess;

	@Override
	protected InternalAADMParser createParser() {
		InternalAADMParser result = new InternalAADMParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public AADMGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(AADMGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}