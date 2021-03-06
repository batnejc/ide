package org.sodalite.dsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.sodalite.dsl.services.RMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Relationship_types", "Valid_source_types", "Valid_target_types", "Capability_types", "Greater_or_equal", "Interface_types", "Artifact_types", "Implementation", "Get_attribute", "Less_or_equal", "Relative_path", "Capabilities", "Dependencies", "Derived_from", "Entry_schema", "Get_property", "Greater_than", "Policy_types", "Relationship", "Requirements", "Valid_values", "Constraints", "Description", "Occurrences", "Attributes", "Capability", "Data_types", "Interfaces", "Max_length", "Min_length", "Node_types", "Operations", "Properties", "Attribute", "Get_input", "Less_than", "Mime_type", "File_ext", "In_range", "Property", "Required", "Default", "Primary", "Req_cap", "Entity", "Inputs", "Length", "Status", "Equal", "Value", "Node", "Type", "Comma", "Colon", "LeftSquareBracket", "RightSquareBracket", "RULE_ID", "RULE_QUALIFIED_NAME", "RULE_BOOLEAN", "RULE_ENTITY", "RULE_PRIMITIVE_DATA_TYPE", "RULE_BEGIN", "RULE_END", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Entity=48;
    public static final int RULE_BEGIN=65;
    public static final int Mime_type=40;
    public static final int Node=54;
    public static final int Entry_schema=18;
    public static final int Attributes=28;
    public static final int Occurrences=27;
    public static final int RULE_BOOLEAN=62;
    public static final int Requirements=23;
    public static final int Valid_source_types=5;
    public static final int Node_types=34;
    public static final int Policy_types=21;
    public static final int Equal=52;
    public static final int Primary=46;
    public static final int Dependencies=16;
    public static final int Operations=35;
    public static final int RightSquareBracket=59;
    public static final int Valid_target_types=6;
    public static final int Status=51;
    public static final int RULE_QUALIFIED_NAME=61;
    public static final int Capability=29;
    public static final int RULE_ID=60;
    public static final int Less_than=39;
    public static final int Data_types=30;
    public static final int Artifact_types=10;
    public static final int Interface_types=9;
    public static final int Greater_or_equal=8;
    public static final int Constraints=25;
    public static final int RULE_INT=67;
    public static final int Value=53;
    public static final int RULE_ML_COMMENT=69;
    public static final int LeftSquareBracket=58;
    public static final int Less_or_equal=13;
    public static final int Relative_path=14;
    public static final int Greater_than=20;
    public static final int Get_input=38;
    public static final int RULE_ENTITY=63;
    public static final int RULE_PRIMITIVE_DATA_TYPE=64;
    public static final int RULE_END=66;
    public static final int Description=26;
    public static final int Get_attribute=12;
    public static final int Attribute=37;
    public static final int Get_property=19;
    public static final int Valid_values=24;
    public static final int RULE_STRING=68;
    public static final int Properties=36;
    public static final int Implementation=11;
    public static final int RULE_SL_COMMENT=70;
    public static final int Max_length=32;
    public static final int Comma=56;
    public static final int Required=44;
    public static final int Capability_types=7;
    public static final int Colon=57;
    public static final int EOF=-1;
    public static final int Property=43;
    public static final int Inputs=49;
    public static final int Relationship_types=4;
    public static final int RULE_WS=71;
    public static final int RULE_ANY_OTHER=72;
    public static final int Req_cap=47;
    public static final int Default=45;
    public static final int Interfaces=31;
    public static final int In_range=42;
    public static final int Type=55;
    public static final int Derived_from=17;
    public static final int Length=50;
    public static final int Capabilities=15;
    public static final int Relationship=22;
    public static final int File_ext=41;
    public static final int Min_length=33;

    // delegates
    // delegators


        public InternalRMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRMParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRMParser.g"; }



     	private RMGrammarAccess grammarAccess;

        public InternalRMParser(TokenStream input, RMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RM_Model";
       	}

       	@Override
       	protected RMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRM_Model"
    // InternalRMParser.g:57:1: entryRuleRM_Model returns [EObject current=null] : iv_ruleRM_Model= ruleRM_Model EOF ;
    public final EObject entryRuleRM_Model() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRM_Model = null;


        try {
            // InternalRMParser.g:57:49: (iv_ruleRM_Model= ruleRM_Model EOF )
            // InternalRMParser.g:58:2: iv_ruleRM_Model= ruleRM_Model EOF
            {
             newCompositeNode(grammarAccess.getRM_ModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRM_Model=ruleRM_Model();

            state._fsp--;

             current =iv_ruleRM_Model; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRM_Model"


    // $ANTLR start "ruleRM_Model"
    // InternalRMParser.g:64:1: ruleRM_Model returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* ) ) ) ;
    public final EObject ruleRM_Model() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token this_BEGIN_14=null;
        Token this_END_16=null;
        Token otherlv_17=null;
        Token this_BEGIN_18=null;
        Token this_END_20=null;
        Token otherlv_21=null;
        Token this_BEGIN_22=null;
        Token this_END_24=null;
        Token otherlv_25=null;
        Token this_BEGIN_26=null;
        Token this_END_28=null;
        EObject lv_dataTypes_3_0 = null;

        EObject lv_artifactTypes_7_0 = null;

        EObject lv_capabilityTypes_11_0 = null;

        EObject lv_interfaceTypes_15_0 = null;

        EObject lv_relationshipTypes_19_0 = null;

        EObject lv_nodeTypes_23_0 = null;

        EObject lv_policyTypes_27_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:70:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:71:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:71:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:72:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:72:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:73:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* )
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:76:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:77:5: ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:77:5: ( ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) ) )*
            loop1:
            do {
                int alt1=8;
                int LA1_0 = input.LA(1);

                if ( LA1_0 == Data_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
                    alt1=1;
                }
                else if ( LA1_0 == Artifact_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
                    alt1=2;
                }
                else if ( LA1_0 == Capability_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
                    alt1=3;
                }
                else if ( LA1_0 == Interface_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
                    alt1=4;
                }
                else if ( LA1_0 == Relationship_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
                    alt1=5;
                }
                else if ( LA1_0 == Node_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
                    alt1=6;
                }
                else if ( LA1_0 == Policy_types && getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
                    alt1=7;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRMParser.g:78:3: ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:78:3: ({...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) ) )
            	    // InternalRMParser.g:79:4: {...}? => ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:79:102: ( ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) ) )
            	    // InternalRMParser.g:80:5: ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:83:8: ({...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END ) )
            	    // InternalRMParser.g:83:9: {...}? => (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:83:18: (otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END )
            	    // InternalRMParser.g:83:19: otherlv_1= Data_types this_BEGIN_2= RULE_BEGIN ( (lv_dataTypes_3_0= ruleEDataTypes ) ) this_END_4= RULE_END
            	    {
            	    otherlv_1=(Token)match(input,Data_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_1, grammarAccess.getRM_ModelAccess().getData_typesKeyword_0_0());
            	    							
            	    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_4); 

            	    								newLeafNode(this_BEGIN_2, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_0_1());
            	    							
            	    // InternalRMParser.g:91:8: ( (lv_dataTypes_3_0= ruleEDataTypes ) )
            	    // InternalRMParser.g:92:9: (lv_dataTypes_3_0= ruleEDataTypes )
            	    {
            	    // InternalRMParser.g:92:9: (lv_dataTypes_3_0= ruleEDataTypes )
            	    // InternalRMParser.g:93:10: lv_dataTypes_3_0= ruleEDataTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getDataTypesEDataTypesParserRuleCall_0_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_dataTypes_3_0=ruleEDataTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"dataTypes",
            	    											lv_dataTypes_3_0,
            	    											"org.sodalite.dsl.RM.EDataTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_4=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_4, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_0_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:120:3: ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:120:3: ({...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalRMParser.g:121:4: {...}? => ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:121:102: ( ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) ) )
            	    // InternalRMParser.g:122:5: ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:125:8: ({...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END ) )
            	    // InternalRMParser.g:125:9: {...}? => (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:125:18: (otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END )
            	    // InternalRMParser.g:125:19: otherlv_5= Artifact_types this_BEGIN_6= RULE_BEGIN ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Artifact_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getRM_ModelAccess().getArtifact_typesKeyword_1_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalRMParser.g:133:8: ( (lv_artifactTypes_7_0= ruleEArtifactTypes ) )
            	    // InternalRMParser.g:134:9: (lv_artifactTypes_7_0= ruleEArtifactTypes )
            	    {
            	    // InternalRMParser.g:134:9: (lv_artifactTypes_7_0= ruleEArtifactTypes )
            	    // InternalRMParser.g:135:10: lv_artifactTypes_7_0= ruleEArtifactTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getArtifactTypesEArtifactTypesParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_artifactTypes_7_0=ruleEArtifactTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"artifactTypes",
            	    											lv_artifactTypes_7_0,
            	    											"org.sodalite.dsl.RM.EArtifactTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_8, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:162:3: ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:162:3: ({...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalRMParser.g:163:4: {...}? => ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:163:102: ( ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) ) )
            	    // InternalRMParser.g:164:5: ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:167:8: ({...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END ) )
            	    // InternalRMParser.g:167:9: {...}? => (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:167:18: (otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END )
            	    // InternalRMParser.g:167:19: otherlv_9= Capability_types this_BEGIN_10= RULE_BEGIN ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Capability_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getRM_ModelAccess().getCapability_typesKeyword_2_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:175:8: ( (lv_capabilityTypes_11_0= ruleECapabilityTypes ) )
            	    // InternalRMParser.g:176:9: (lv_capabilityTypes_11_0= ruleECapabilityTypes )
            	    {
            	    // InternalRMParser.g:176:9: (lv_capabilityTypes_11_0= ruleECapabilityTypes )
            	    // InternalRMParser.g:177:10: lv_capabilityTypes_11_0= ruleECapabilityTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getCapabilityTypesECapabilityTypesParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_capabilityTypes_11_0=ruleECapabilityTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"capabilityTypes",
            	    											lv_capabilityTypes_11_0,
            	    											"org.sodalite.dsl.RM.ECapabilityTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_12, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:204:3: ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:204:3: ({...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) ) )
            	    // InternalRMParser.g:205:4: {...}? => ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:205:102: ( ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) ) )
            	    // InternalRMParser.g:206:5: ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:209:8: ({...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END ) )
            	    // InternalRMParser.g:209:9: {...}? => (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:209:18: (otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END )
            	    // InternalRMParser.g:209:19: otherlv_13= Interface_types this_BEGIN_14= RULE_BEGIN ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) ) this_END_16= RULE_END
            	    {
            	    otherlv_13=(Token)match(input,Interface_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_13, grammarAccess.getRM_ModelAccess().getInterface_typesKeyword_3_0());
            	    							
            	    this_BEGIN_14=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_14, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalRMParser.g:217:8: ( (lv_interfaceTypes_15_0= ruleEInterfaceTypes ) )
            	    // InternalRMParser.g:218:9: (lv_interfaceTypes_15_0= ruleEInterfaceTypes )
            	    {
            	    // InternalRMParser.g:218:9: (lv_interfaceTypes_15_0= ruleEInterfaceTypes )
            	    // InternalRMParser.g:219:10: lv_interfaceTypes_15_0= ruleEInterfaceTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getInterfaceTypesEInterfaceTypesParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_interfaceTypes_15_0=ruleEInterfaceTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"interfaceTypes",
            	    											lv_interfaceTypes_15_0,
            	    											"org.sodalite.dsl.RM.EInterfaceTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_16=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_16, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:246:3: ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:246:3: ({...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) ) )
            	    // InternalRMParser.g:247:4: {...}? => ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:247:102: ( ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) ) )
            	    // InternalRMParser.g:248:5: ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:251:8: ({...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END ) )
            	    // InternalRMParser.g:251:9: {...}? => (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:251:18: (otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END )
            	    // InternalRMParser.g:251:19: otherlv_17= Relationship_types this_BEGIN_18= RULE_BEGIN ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) ) this_END_20= RULE_END
            	    {
            	    otherlv_17=(Token)match(input,Relationship_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_17, grammarAccess.getRM_ModelAccess().getRelationship_typesKeyword_4_0());
            	    							
            	    this_BEGIN_18=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_18, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_4_1());
            	    							
            	    // InternalRMParser.g:259:8: ( (lv_relationshipTypes_19_0= ruleERelationshipTypes ) )
            	    // InternalRMParser.g:260:9: (lv_relationshipTypes_19_0= ruleERelationshipTypes )
            	    {
            	    // InternalRMParser.g:260:9: (lv_relationshipTypes_19_0= ruleERelationshipTypes )
            	    // InternalRMParser.g:261:10: lv_relationshipTypes_19_0= ruleERelationshipTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getRelationshipTypesERelationshipTypesParserRuleCall_4_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_relationshipTypes_19_0=ruleERelationshipTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"relationshipTypes",
            	    											lv_relationshipTypes_19_0,
            	    											"org.sodalite.dsl.RM.ERelationshipTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_20=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_20, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:288:3: ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:288:3: ({...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) ) )
            	    // InternalRMParser.g:289:4: {...}? => ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:289:102: ( ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) ) )
            	    // InternalRMParser.g:290:5: ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:293:8: ({...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END ) )
            	    // InternalRMParser.g:293:9: {...}? => (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:293:18: (otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END )
            	    // InternalRMParser.g:293:19: otherlv_21= Node_types this_BEGIN_22= RULE_BEGIN ( (lv_nodeTypes_23_0= ruleENodeTypes ) ) this_END_24= RULE_END
            	    {
            	    otherlv_21=(Token)match(input,Node_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_21, grammarAccess.getRM_ModelAccess().getNode_typesKeyword_5_0());
            	    							
            	    this_BEGIN_22=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_22, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalRMParser.g:301:8: ( (lv_nodeTypes_23_0= ruleENodeTypes ) )
            	    // InternalRMParser.g:302:9: (lv_nodeTypes_23_0= ruleENodeTypes )
            	    {
            	    // InternalRMParser.g:302:9: (lv_nodeTypes_23_0= ruleENodeTypes )
            	    // InternalRMParser.g:303:10: lv_nodeTypes_23_0= ruleENodeTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getNodeTypesENodeTypesParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_nodeTypes_23_0=ruleENodeTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"nodeTypes",
            	    											lv_nodeTypes_23_0,
            	    											"org.sodalite.dsl.RM.ENodeTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_24=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_24, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:330:3: ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:330:3: ({...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) ) )
            	    // InternalRMParser.g:331:4: {...}? => ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "getUnorderedGroupHelper().canSelect(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRMParser.g:331:102: ( ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) ) )
            	    // InternalRMParser.g:332:5: ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getRM_ModelAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRMParser.g:335:8: ({...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END ) )
            	    // InternalRMParser.g:335:9: {...}? => (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRM_Model", "true");
            	    }
            	    // InternalRMParser.g:335:18: (otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END )
            	    // InternalRMParser.g:335:19: otherlv_25= Policy_types this_BEGIN_26= RULE_BEGIN ( (lv_policyTypes_27_0= ruleEPolicyTypes ) ) this_END_28= RULE_END
            	    {
            	    otherlv_25=(Token)match(input,Policy_types,FOLLOW_3); 

            	    								newLeafNode(otherlv_25, grammarAccess.getRM_ModelAccess().getPolicy_typesKeyword_6_0());
            	    							
            	    this_BEGIN_26=(Token)match(input,RULE_BEGIN,FOLLOW_7); 

            	    								newLeafNode(this_BEGIN_26, grammarAccess.getRM_ModelAccess().getBEGINTerminalRuleCall_6_1());
            	    							
            	    // InternalRMParser.g:343:8: ( (lv_policyTypes_27_0= ruleEPolicyTypes ) )
            	    // InternalRMParser.g:344:9: (lv_policyTypes_27_0= ruleEPolicyTypes )
            	    {
            	    // InternalRMParser.g:344:9: (lv_policyTypes_27_0= ruleEPolicyTypes )
            	    // InternalRMParser.g:345:10: lv_policyTypes_27_0= ruleEPolicyTypes
            	    {

            	    										newCompositeNode(grammarAccess.getRM_ModelAccess().getPolicyTypesEPolicyTypesParserRuleCall_6_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_policyTypes_27_0=ruleEPolicyTypes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getRM_ModelRule());
            	    										}
            	    										set(
            	    											current,
            	    											"policyTypes",
            	    											lv_policyTypes_27_0,
            	    											"org.sodalite.dsl.RM.EPolicyTypes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_28=(Token)match(input,RULE_END,FOLLOW_6); 

            	    								newLeafNode(this_END_28, grammarAccess.getRM_ModelAccess().getENDTerminalRuleCall_6_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getRM_ModelAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRM_Model"


    // $ANTLR start "entryRuleEDataTypes"
    // InternalRMParser.g:382:1: entryRuleEDataTypes returns [EObject current=null] : iv_ruleEDataTypes= ruleEDataTypes EOF ;
    public final EObject entryRuleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypes = null;


        try {
            // InternalRMParser.g:382:51: (iv_ruleEDataTypes= ruleEDataTypes EOF )
            // InternalRMParser.g:383:2: iv_ruleEDataTypes= ruleEDataTypes EOF
            {
             newCompositeNode(grammarAccess.getEDataTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypes=ruleEDataTypes();

            state._fsp--;

             current =iv_ruleEDataTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataTypes"


    // $ANTLR start "ruleEDataTypes"
    // InternalRMParser.g:389:1: ruleEDataTypes returns [EObject current=null] : ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) ;
    public final EObject ruleEDataTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_dataTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:395:2: ( ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ ) )
            // InternalRMParser.g:396:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            {
            // InternalRMParser.g:396:2: ( () ( (lv_dataTypes_1_0= ruleEDataType ) )+ )
            // InternalRMParser.g:397:3: () ( (lv_dataTypes_1_0= ruleEDataType ) )+
            {
            // InternalRMParser.g:397:3: ()
            // InternalRMParser.g:398:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypesAccess().getEDataTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:404:3: ( (lv_dataTypes_1_0= ruleEDataType ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_QUALIFIED_NAME||LA2_0==RULE_PRIMITIVE_DATA_TYPE) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRMParser.g:405:4: (lv_dataTypes_1_0= ruleEDataType )
            	    {
            	    // InternalRMParser.g:405:4: (lv_dataTypes_1_0= ruleEDataType )
            	    // InternalRMParser.g:406:5: lv_dataTypes_1_0= ruleEDataType
            	    {

            	    					newCompositeNode(grammarAccess.getEDataTypesAccess().getDataTypesEDataTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_dataTypes_1_0=ruleEDataType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEDataTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"dataTypes",
            	    						lv_dataTypes_1_0,
            	    						"org.sodalite.dsl.RM.EDataType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataTypes"


    // $ANTLR start "entryRuleEDataType"
    // InternalRMParser.g:427:1: entryRuleEDataType returns [EObject current=null] : iv_ruleEDataType= ruleEDataType EOF ;
    public final EObject entryRuleEDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataType = null;


        try {
            // InternalRMParser.g:427:50: (iv_ruleEDataType= ruleEDataType EOF )
            // InternalRMParser.g:428:2: iv_ruleEDataType= ruleEDataType EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataType=ruleEDataType();

            state._fsp--;

             current =iv_ruleEDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataType"


    // $ANTLR start "ruleEDataType"
    // InternalRMParser.g:434:1: ruleEDataType returns [EObject current=null] : ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_data_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:440:2: ( ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:441:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:441:2: ( ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:442:3: ( (lv_name_0_0= ruleEDataTypeName ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_data_3_0= ruleEDataTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:442:3: ( (lv_name_0_0= ruleEDataTypeName ) )
            // InternalRMParser.g:443:4: (lv_name_0_0= ruleEDataTypeName )
            {
            // InternalRMParser.g:443:4: (lv_name_0_0= ruleEDataTypeName )
            // InternalRMParser.g:444:5: lv_name_0_0= ruleEDataTypeName
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getNameEDataTypeNameParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_name_0_0=ruleEDataTypeName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataTypeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.EDataTypeName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEDataTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_10); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEDataTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:469:3: ( (lv_data_3_0= ruleEDataTypeBody ) )
            // InternalRMParser.g:470:4: (lv_data_3_0= ruleEDataTypeBody )
            {
            // InternalRMParser.g:470:4: (lv_data_3_0= ruleEDataTypeBody )
            // InternalRMParser.g:471:5: lv_data_3_0= ruleEDataTypeBody
            {

            					newCompositeNode(grammarAccess.getEDataTypeAccess().getDataEDataTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_data_3_0=ruleEDataTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEDataTypeRule());
            					}
            					set(
            						current,
            						"data",
            						lv_data_3_0,
            						"org.sodalite.dsl.RM.EDataTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEDataTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataType"


    // $ANTLR start "entryRuleEDataTypeBody"
    // InternalRMParser.g:496:1: entryRuleEDataTypeBody returns [EObject current=null] : iv_ruleEDataTypeBody= ruleEDataTypeBody EOF ;
    public final EObject entryRuleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDataTypeBody = null;


        try {
            // InternalRMParser.g:496:54: (iv_ruleEDataTypeBody= ruleEDataTypeBody EOF )
            // InternalRMParser.g:497:2: iv_ruleEDataTypeBody= ruleEDataTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypeBody=ruleEDataTypeBody();

            state._fsp--;

             current =iv_ruleEDataTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataTypeBody"


    // $ANTLR start "ruleEDataTypeBody"
    // InternalRMParser.g:503:1: ruleEDataTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEDataTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_properties_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:509:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:510:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:510:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:511:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:511:3: ()
            // InternalRMParser.g:512:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEDataTypeBodyAccess().getEDataTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:518:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:519:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:519:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:520:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:523:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:524:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:524:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) ) )*
            loop3:
            do {
                int alt3=5;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt3=2;
                }
                else if ( LA3_0 == Constraints && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt3=3;
                }
                else if ( LA3_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt3=4;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalRMParser.g:525:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:525:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:526:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:526:110: ( ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:527:6: ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:530:9: ({...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:530:10: {...}? => (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:530:19: (otherlv_2= Derived_from ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:530:20: otherlv_2= Derived_from ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEDataTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:534:9: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:535:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:535:10: ( ruleEDataTypeName )
            	    // InternalRMParser.g:536:11: ruleEDataTypeName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getSuperTypeEDataTypeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_11);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:556:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:556:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:557:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:557:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:558:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:561:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:561:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:561:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:561:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEDataTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:565:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:566:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:566:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:567:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_11); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEDataTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:589:4: ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:589:4: ({...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:590:5: {...}? => ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:590:110: ( ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:591:6: ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:594:9: ({...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:594:10: {...}? => (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:594:19: (otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:594:20: otherlv_6= Constraints this_BEGIN_7= RULE_BEGIN ( (lv_constraints_8_0= ruleEConstraints ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Constraints,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEDataTypeBodyAccess().getConstraintsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEDataTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:602:9: ( (lv_constraints_8_0= ruleEConstraints ) )
            	    // InternalRMParser.g:603:10: (lv_constraints_8_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:603:10: (lv_constraints_8_0= ruleEConstraints )
            	    // InternalRMParser.g:604:11: lv_constraints_8_0= ruleEConstraints
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getConstraintsEConstraintsParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_constraints_8_0=ruleEConstraints();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.sodalite.dsl.RM.EConstraints");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_11); 

            	    									newLeafNode(this_END_9, grammarAccess.getEDataTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:631:4: ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:631:4: ({...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:632:5: {...}? => ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:632:110: ( ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:633:6: ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:636:9: ({...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:636:10: {...}? => (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEDataTypeBody", "true");
            	    }
            	    // InternalRMParser.g:636:19: (otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:636:20: otherlv_10= Properties this_BEGIN_11= RULE_BEGIN ( (lv_properties_12_0= ruleEProperties ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Properties,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEDataTypeBodyAccess().getPropertiesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEDataTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:644:9: ( (lv_properties_12_0= ruleEProperties ) )
            	    // InternalRMParser.g:645:10: (lv_properties_12_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:645:10: (lv_properties_12_0= ruleEProperties )
            	    // InternalRMParser.g:646:11: lv_properties_12_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEDataTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_12_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEDataTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_12_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_11); 

            	    									newLeafNode(this_END_13, grammarAccess.getEDataTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEDataTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataTypeBody"


    // $ANTLR start "entryRuleEDataTypeName"
    // InternalRMParser.g:684:1: entryRuleEDataTypeName returns [String current=null] : iv_ruleEDataTypeName= ruleEDataTypeName EOF ;
    public final String entryRuleEDataTypeName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDataTypeName = null;


        try {
            // InternalRMParser.g:684:53: (iv_ruleEDataTypeName= ruleEDataTypeName EOF )
            // InternalRMParser.g:685:2: iv_ruleEDataTypeName= ruleEDataTypeName EOF
            {
             newCompositeNode(grammarAccess.getEDataTypeNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDataTypeName=ruleEDataTypeName();

            state._fsp--;

             current =iv_ruleEDataTypeName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDataTypeName"


    // $ANTLR start "ruleEDataTypeName"
    // InternalRMParser.g:691:1: ruleEDataTypeName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleEDataTypeName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_QUALIFIED_NAME_0=null;
        Token this_PRIMITIVE_DATA_TYPE_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:697:2: ( (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE ) )
            // InternalRMParser.g:698:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            {
            // InternalRMParser.g:698:2: (this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME | this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_QUALIFIED_NAME) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_PRIMITIVE_DATA_TYPE) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRMParser.g:699:3: this_QUALIFIED_NAME_0= RULE_QUALIFIED_NAME
                    {
                    this_QUALIFIED_NAME_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

                    			current.merge(this_QUALIFIED_NAME_0);
                    		

                    			newLeafNode(this_QUALIFIED_NAME_0, grammarAccess.getEDataTypeNameAccess().getQUALIFIED_NAMETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:707:3: this_PRIMITIVE_DATA_TYPE_1= RULE_PRIMITIVE_DATA_TYPE
                    {
                    this_PRIMITIVE_DATA_TYPE_1=(Token)match(input,RULE_PRIMITIVE_DATA_TYPE,FOLLOW_2); 

                    			current.merge(this_PRIMITIVE_DATA_TYPE_1);
                    		

                    			newLeafNode(this_PRIMITIVE_DATA_TYPE_1, grammarAccess.getEDataTypeNameAccess().getPRIMITIVE_DATA_TYPETerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDataTypeName"


    // $ANTLR start "entryRuleEArtifactTypes"
    // InternalRMParser.g:718:1: entryRuleEArtifactTypes returns [EObject current=null] : iv_ruleEArtifactTypes= ruleEArtifactTypes EOF ;
    public final EObject entryRuleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypes = null;


        try {
            // InternalRMParser.g:718:55: (iv_ruleEArtifactTypes= ruleEArtifactTypes EOF )
            // InternalRMParser.g:719:2: iv_ruleEArtifactTypes= ruleEArtifactTypes EOF
            {
             newCompositeNode(grammarAccess.getEArtifactTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEArtifactTypes=ruleEArtifactTypes();

            state._fsp--;

             current =iv_ruleEArtifactTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEArtifactTypes"


    // $ANTLR start "ruleEArtifactTypes"
    // InternalRMParser.g:725:1: ruleEArtifactTypes returns [EObject current=null] : ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) ;
    public final EObject ruleEArtifactTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_artifactTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:731:2: ( ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ ) )
            // InternalRMParser.g:732:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            {
            // InternalRMParser.g:732:2: ( () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+ )
            // InternalRMParser.g:733:3: () ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            {
            // InternalRMParser.g:733:3: ()
            // InternalRMParser.g:734:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypesAccess().getEArtifactTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:740:3: ( (lv_artifactTypes_1_0= ruleEArtifactType ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_QUALIFIED_NAME) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalRMParser.g:741:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    {
            	    // InternalRMParser.g:741:4: (lv_artifactTypes_1_0= ruleEArtifactType )
            	    // InternalRMParser.g:742:5: lv_artifactTypes_1_0= ruleEArtifactType
            	    {

            	    					newCompositeNode(grammarAccess.getEArtifactTypesAccess().getArtifactTypesEArtifactTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_artifactTypes_1_0=ruleEArtifactType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEArtifactTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"artifactTypes",
            	    						lv_artifactTypes_1_0,
            	    						"org.sodalite.dsl.RM.EArtifactType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEArtifactTypes"


    // $ANTLR start "entryRuleEArtifactType"
    // InternalRMParser.g:763:1: entryRuleEArtifactType returns [EObject current=null] : iv_ruleEArtifactType= ruleEArtifactType EOF ;
    public final EObject entryRuleEArtifactType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactType = null;


        try {
            // InternalRMParser.g:763:54: (iv_ruleEArtifactType= ruleEArtifactType EOF )
            // InternalRMParser.g:764:2: iv_ruleEArtifactType= ruleEArtifactType EOF
            {
             newCompositeNode(grammarAccess.getEArtifactTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEArtifactType=ruleEArtifactType();

            state._fsp--;

             current =iv_ruleEArtifactType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEArtifactType"


    // $ANTLR start "ruleEArtifactType"
    // InternalRMParser.g:770:1: ruleEArtifactType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEArtifactType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_artifact_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:776:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:777:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:777:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:778:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_artifact_3_0= ruleEArtifactTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:778:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:779:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:779:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:780:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEArtifactTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEArtifactTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEArtifactTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_16); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEArtifactTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:804:3: ( (lv_artifact_3_0= ruleEArtifactTypeBody ) )
            // InternalRMParser.g:805:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            {
            // InternalRMParser.g:805:4: (lv_artifact_3_0= ruleEArtifactTypeBody )
            // InternalRMParser.g:806:5: lv_artifact_3_0= ruleEArtifactTypeBody
            {

            					newCompositeNode(grammarAccess.getEArtifactTypeAccess().getArtifactEArtifactTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_artifact_3_0=ruleEArtifactTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEArtifactTypeRule());
            					}
            					set(
            						current,
            						"artifact",
            						lv_artifact_3_0,
            						"org.sodalite.dsl.RM.EArtifactTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEArtifactTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEArtifactType"


    // $ANTLR start "entryRuleEArtifactTypeBody"
    // InternalRMParser.g:831:1: entryRuleEArtifactTypeBody returns [EObject current=null] : iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF ;
    public final EObject entryRuleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEArtifactTypeBody = null;


        try {
            // InternalRMParser.g:831:58: (iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF )
            // InternalRMParser.g:832:2: iv_ruleEArtifactTypeBody= ruleEArtifactTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEArtifactTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEArtifactTypeBody=ruleEArtifactTypeBody();

            state._fsp--;

             current =iv_ruleEArtifactTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEArtifactTypeBody"


    // $ANTLR start "ruleEArtifactTypeBody"
    // InternalRMParser.g:838:1: ruleEArtifactTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEArtifactTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token lv_mime_type_7_0=null;
        Token otherlv_8=null;
        Token lv_file_ext_9_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:844:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:845:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:845:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:846:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:846:3: ()
            // InternalRMParser.g:847:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEArtifactTypeBodyAccess().getEArtifactTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:853:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:854:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:854:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:855:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:858:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:859:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:859:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) ) )*
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( LA7_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt7=1;
                }
                else if ( LA7_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == Mime_type && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt7=3;
                }
                else if ( LA7_0 == File_ext && getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalRMParser.g:860:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:860:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:861:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:861:114: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:862:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:865:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:865:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:865:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:865:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEArtifactTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:869:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:870:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:870:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:871:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_17); 

            	    											newLeafNode(otherlv_3, grammarAccess.getEArtifactTypeBodyAccess().getSuperTypeEArtifactTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:888:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:888:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:889:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:889:114: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:890:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:893:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:893:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:893:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:893:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:897:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:898:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:898:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:899:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEArtifactTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:921:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:921:4: ({...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:922:5: {...}? => ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:922:114: ( ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:923:6: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:926:9: ({...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:926:10: {...}? => (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:926:19: (otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:926:20: otherlv_6= Mime_type ( (lv_mime_type_7_0= RULE_STRING ) )
            	    {
            	    otherlv_6=(Token)match(input,Mime_type,FOLLOW_12); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:930:9: ( (lv_mime_type_7_0= RULE_STRING ) )
            	    // InternalRMParser.g:931:10: (lv_mime_type_7_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:931:10: (lv_mime_type_7_0= RULE_STRING )
            	    // InternalRMParser.g:932:11: lv_mime_type_7_0= RULE_STRING
            	    {
            	    lv_mime_type_7_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_mime_type_7_0, grammarAccess.getEArtifactTypeBodyAccess().getMime_typeSTRINGTerminalRuleCall_1_2_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"mime_type",
            	    												lv_mime_type_7_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:954:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:954:4: ({...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:955:5: {...}? => ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:955:114: ( ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:956:6: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:959:9: ({...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:959:10: {...}? => ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEArtifactTypeBody", "true");
            	    }
            	    // InternalRMParser.g:959:19: ( (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:959:20: (otherlv_8= File_ext )+ ( (lv_file_ext_9_0= RULE_STRING ) )
            	    {
            	    // InternalRMParser.g:959:20: (otherlv_8= File_ext )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==File_ext) ) {
            	            alt6=1;
            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalRMParser.g:960:10: otherlv_8= File_ext
            	    	    {
            	    	    otherlv_8=(Token)match(input,File_ext,FOLLOW_18); 

            	    	    										newLeafNode(otherlv_8, grammarAccess.getEArtifactTypeBodyAccess().getFile_extKeyword_1_3_0());
            	    	    									

            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	    // InternalRMParser.g:965:9: ( (lv_file_ext_9_0= RULE_STRING ) )
            	    // InternalRMParser.g:966:10: (lv_file_ext_9_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:966:10: (lv_file_ext_9_0= RULE_STRING )
            	    // InternalRMParser.g:967:11: lv_file_ext_9_0= RULE_STRING
            	    {
            	    lv_file_ext_9_0=(Token)match(input,RULE_STRING,FOLLOW_17); 

            	    											newLeafNode(lv_file_ext_9_0, grammarAccess.getEArtifactTypeBodyAccess().getFile_extSTRINGTerminalRuleCall_1_3_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEArtifactTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"file_ext",
            	    												lv_file_ext_9_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEArtifactTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEArtifactTypeBody"


    // $ANTLR start "entryRuleECapabilityTypes"
    // InternalRMParser.g:1000:1: entryRuleECapabilityTypes returns [EObject current=null] : iv_ruleECapabilityTypes= ruleECapabilityTypes EOF ;
    public final EObject entryRuleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypes = null;


        try {
            // InternalRMParser.g:1000:57: (iv_ruleECapabilityTypes= ruleECapabilityTypes EOF )
            // InternalRMParser.g:1001:2: iv_ruleECapabilityTypes= ruleECapabilityTypes EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityTypes=ruleECapabilityTypes();

            state._fsp--;

             current =iv_ruleECapabilityTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityTypes"


    // $ANTLR start "ruleECapabilityTypes"
    // InternalRMParser.g:1007:1: ruleECapabilityTypes returns [EObject current=null] : ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) ;
    public final EObject ruleECapabilityTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilityTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1013:2: ( ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ ) )
            // InternalRMParser.g:1014:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            {
            // InternalRMParser.g:1014:2: ( () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+ )
            // InternalRMParser.g:1015:3: () ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            {
            // InternalRMParser.g:1015:3: ()
            // InternalRMParser.g:1016:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypesAccess().getECapabilityTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1022:3: ( (lv_capabilityTypes_1_0= ruleECapabilityType ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_QUALIFIED_NAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalRMParser.g:1023:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    {
            	    // InternalRMParser.g:1023:4: (lv_capabilityTypes_1_0= ruleECapabilityType )
            	    // InternalRMParser.g:1024:5: lv_capabilityTypes_1_0= ruleECapabilityType
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilityTypesAccess().getCapabilityTypesECapabilityTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_capabilityTypes_1_0=ruleECapabilityType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECapabilityTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"capabilityTypes",
            	    						lv_capabilityTypes_1_0,
            	    						"org.sodalite.dsl.RM.ECapabilityType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityTypes"


    // $ANTLR start "entryRuleECapabilityType"
    // InternalRMParser.g:1045:1: entryRuleECapabilityType returns [EObject current=null] : iv_ruleECapabilityType= ruleECapabilityType EOF ;
    public final EObject entryRuleECapabilityType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityType = null;


        try {
            // InternalRMParser.g:1045:56: (iv_ruleECapabilityType= ruleECapabilityType EOF )
            // InternalRMParser.g:1046:2: iv_ruleECapabilityType= ruleECapabilityType EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityType=ruleECapabilityType();

            state._fsp--;

             current =iv_ruleECapabilityType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityType"


    // $ANTLR start "ruleECapabilityType"
    // InternalRMParser.g:1052:1: ruleECapabilityType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1058:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1059:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1059:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1060:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1060:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1061:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1061:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1062:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getECapabilityTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECapabilityTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_19); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getECapabilityTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1086:3: ( (lv_capability_3_0= ruleECapabilityTypeBody ) )
            // InternalRMParser.g:1087:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            {
            // InternalRMParser.g:1087:4: (lv_capability_3_0= ruleECapabilityTypeBody )
            // InternalRMParser.g:1088:5: lv_capability_3_0= ruleECapabilityTypeBody
            {

            					newCompositeNode(grammarAccess.getECapabilityTypeAccess().getCapabilityECapabilityTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_capability_3_0=ruleECapabilityTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECapabilityTypeRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_3_0,
            						"org.sodalite.dsl.RM.ECapabilityTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getECapabilityTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityType"


    // $ANTLR start "entryRuleECapabilityTypeBody"
    // InternalRMParser.g:1113:1: entryRuleECapabilityTypeBody returns [EObject current=null] : iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF ;
    public final EObject entryRuleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeBody = null;


        try {
            // InternalRMParser.g:1113:60: (iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF )
            // InternalRMParser.g:1114:2: iv_ruleECapabilityTypeBody= ruleECapabilityTypeBody EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityTypeBody=ruleECapabilityTypeBody();

            state._fsp--;

             current =iv_ruleECapabilityTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityTypeBody"


    // $ANTLR start "ruleECapabilityTypeBody"
    // InternalRMParser.g:1120:1: ruleECapabilityTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleECapabilityTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1126:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1127:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1127:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1128:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1128:3: ()
            // InternalRMParser.g:1129:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilityTypeBodyAccess().getECapabilityTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1135:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1136:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1136:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1137:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1140:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1141:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1141:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) )*
            loop9:
            do {
                int alt9=5;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt9=4;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalRMParser.g:1142:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1142:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1143:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1143:116: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1144:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1147:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1147:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1147:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1147:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getECapabilityTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1151:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1152:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1152:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1153:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_20); 

            	    											newLeafNode(otherlv_3, grammarAccess.getECapabilityTypeBodyAccess().getSuperTypeECapabilityTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:1170:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1170:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1171:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1171:116: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1172:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1175:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1175:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1175:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1175:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1179:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1180:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1180:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1181:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getECapabilityTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:1203:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1203:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1204:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1204:116: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1205:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1208:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1208:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1208:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1208:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getECapabilityTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1216:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1217:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1217:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:1218:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_20); 

            	    									newLeafNode(this_END_9, grammarAccess.getECapabilityTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:1245:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1245:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1246:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1246:116: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1247:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1250:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1250:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1250:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1250:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getECapabilityTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getECapabilityTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1258:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:1259:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:1259:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:1260:11: lv_atributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getECapabilityTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_atributes_12_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getECapabilityTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"atributes",
            	    												lv_atributes_12_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_20); 

            	    									newLeafNode(this_END_13, grammarAccess.getECapabilityTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getECapabilityTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityTypeBody"


    // $ANTLR start "entryRuleEInterfaceTypes"
    // InternalRMParser.g:1298:1: entryRuleEInterfaceTypes returns [EObject current=null] : iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF ;
    public final EObject entryRuleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypes = null;


        try {
            // InternalRMParser.g:1298:56: (iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF )
            // InternalRMParser.g:1299:2: iv_ruleEInterfaceTypes= ruleEInterfaceTypes EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceTypes=ruleEInterfaceTypes();

            state._fsp--;

             current =iv_ruleEInterfaceTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceTypes"


    // $ANTLR start "ruleEInterfaceTypes"
    // InternalRMParser.g:1305:1: ruleEInterfaceTypes returns [EObject current=null] : ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) ;
    public final EObject ruleEInterfaceTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaceTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1311:2: ( ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ ) )
            // InternalRMParser.g:1312:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            {
            // InternalRMParser.g:1312:2: ( () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+ )
            // InternalRMParser.g:1313:3: () ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            {
            // InternalRMParser.g:1313:3: ()
            // InternalRMParser.g:1314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypesAccess().getEInterfaceTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1320:3: ( (lv_interfaceTypes_1_0= ruleEInterfaceType ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_QUALIFIED_NAME) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalRMParser.g:1321:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    {
            	    // InternalRMParser.g:1321:4: (lv_interfaceTypes_1_0= ruleEInterfaceType )
            	    // InternalRMParser.g:1322:5: lv_interfaceTypes_1_0= ruleEInterfaceType
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfaceTypesAccess().getInterfaceTypesEInterfaceTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_interfaceTypes_1_0=ruleEInterfaceType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInterfaceTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaceTypes",
            	    						lv_interfaceTypes_1_0,
            	    						"org.sodalite.dsl.RM.EInterfaceType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceTypes"


    // $ANTLR start "entryRuleEInterfaceType"
    // InternalRMParser.g:1343:1: entryRuleEInterfaceType returns [EObject current=null] : iv_ruleEInterfaceType= ruleEInterfaceType EOF ;
    public final EObject entryRuleEInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceType = null;


        try {
            // InternalRMParser.g:1343:55: (iv_ruleEInterfaceType= ruleEInterfaceType EOF )
            // InternalRMParser.g:1344:2: iv_ruleEInterfaceType= ruleEInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceType=ruleEInterfaceType();

            state._fsp--;

             current =iv_ruleEInterfaceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceType"


    // $ANTLR start "ruleEInterfaceType"
    // InternalRMParser.g:1350:1: ruleEInterfaceType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1356:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1357:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1357:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1358:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1358:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1359:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1359:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1360:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEInterfaceTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInterfaceTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_21); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEInterfaceTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1384:3: ( (lv_interface_3_0= ruleEInterfaceTypeBody ) )
            // InternalRMParser.g:1385:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            {
            // InternalRMParser.g:1385:4: (lv_interface_3_0= ruleEInterfaceTypeBody )
            // InternalRMParser.g:1386:5: lv_interface_3_0= ruleEInterfaceTypeBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceTypeAccess().getInterfaceEInterfaceTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_interface_3_0=ruleEInterfaceTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceTypeRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_3_0,
            						"org.sodalite.dsl.RM.EInterfaceTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEInterfaceTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceType"


    // $ANTLR start "entryRuleEInterfaceTypeBody"
    // InternalRMParser.g:1411:1: entryRuleEInterfaceTypeBody returns [EObject current=null] : iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF ;
    public final EObject entryRuleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceTypeBody = null;


        try {
            // InternalRMParser.g:1411:59: (iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF )
            // InternalRMParser.g:1412:2: iv_ruleEInterfaceTypeBody= ruleEInterfaceTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceTypeBody=ruleEInterfaceTypeBody();

            state._fsp--;

             current =iv_ruleEInterfaceTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceTypeBody"


    // $ANTLR start "ruleEInterfaceTypeBody"
    // InternalRMParser.g:1418:1: ruleEInterfaceTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEInterfaceTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        EObject lv_inputs_8_0 = null;

        EObject lv_operations_12_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1424:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1425:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1425:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1426:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1426:3: ()
            // InternalRMParser.g:1427:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfaceTypeBodyAccess().getEInterfaceTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1433:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1434:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1434:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1435:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1438:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1439:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1439:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) ) )*
            loop11:
            do {
                int alt11=5;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt11=2;
                }
                else if ( LA11_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt11=3;
                }
                else if ( LA11_0 == Operations && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt11=4;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRMParser.g:1440:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1440:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1441:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1441:115: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1442:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1445:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1445:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1445:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1445:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEInterfaceTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1449:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1450:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1450:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1451:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_22); 

            	    											newLeafNode(otherlv_3, grammarAccess.getEInterfaceTypeBodyAccess().getSuperTypeEInterfaceTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:1468:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1468:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1469:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1469:115: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1470:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1473:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1473:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1473:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1473:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1477:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1478:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1478:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1479:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEInterfaceTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:1501:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1501:4: ({...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:1502:5: {...}? => ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:1502:115: ( ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:1503:6: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:1506:9: ({...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:1506:10: {...}? => (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1506:19: (otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:1506:20: otherlv_6= Inputs this_BEGIN_7= RULE_BEGIN ( (lv_inputs_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Inputs,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEInterfaceTypeBodyAccess().getInputsKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:1514:9: ( (lv_inputs_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:1515:10: (lv_inputs_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:1515:10: (lv_inputs_8_0= ruleEProperties )
            	    // InternalRMParser.g:1516:11: lv_inputs_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getInputsEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_inputs_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_22); 

            	    									newLeafNode(this_END_9, grammarAccess.getEInterfaceTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:1543:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:1543:4: ({...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:1544:5: {...}? => ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:1544:115: ( ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:1545:6: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:1548:9: ({...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:1548:10: {...}? => (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1548:19: (otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:1548:20: otherlv_10= Operations this_BEGIN_11= RULE_BEGIN ( (lv_operations_12_0= ruleEOperations ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Operations,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getEInterfaceTypeBodyAccess().getOperationsKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getEInterfaceTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:1556:9: ( (lv_operations_12_0= ruleEOperations ) )
            	    // InternalRMParser.g:1557:10: (lv_operations_12_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:1557:10: (lv_operations_12_0= ruleEOperations )
            	    // InternalRMParser.g:1558:11: lv_operations_12_0= ruleEOperations
            	    {

            	    											newCompositeNode(grammarAccess.getEInterfaceTypeBodyAccess().getOperationsEOperationsParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_operations_12_0=ruleEOperations();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEInterfaceTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"operations",
            	    												lv_operations_12_0,
            	    												"org.sodalite.dsl.RM.EOperations");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_22); 

            	    									newLeafNode(this_END_13, grammarAccess.getEInterfaceTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEInterfaceTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceTypeBody"


    // $ANTLR start "entryRuleEPolicyTypes"
    // InternalRMParser.g:1596:1: entryRuleEPolicyTypes returns [EObject current=null] : iv_ruleEPolicyTypes= ruleEPolicyTypes EOF ;
    public final EObject entryRuleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypes = null;


        try {
            // InternalRMParser.g:1596:53: (iv_ruleEPolicyTypes= ruleEPolicyTypes EOF )
            // InternalRMParser.g:1597:2: iv_ruleEPolicyTypes= ruleEPolicyTypes EOF
            {
             newCompositeNode(grammarAccess.getEPolicyTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyTypes=ruleEPolicyTypes();

            state._fsp--;

             current =iv_ruleEPolicyTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyTypes"


    // $ANTLR start "ruleEPolicyTypes"
    // InternalRMParser.g:1603:1: ruleEPolicyTypes returns [EObject current=null] : ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) ;
    public final EObject ruleEPolicyTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_policyTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1609:2: ( ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ ) )
            // InternalRMParser.g:1610:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            {
            // InternalRMParser.g:1610:2: ( () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+ )
            // InternalRMParser.g:1611:3: () ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            {
            // InternalRMParser.g:1611:3: ()
            // InternalRMParser.g:1612:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypesAccess().getEPolicyTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1618:3: ( (lv_policyTypes_1_0= ruleEPolicyType ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_QUALIFIED_NAME) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRMParser.g:1619:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    {
            	    // InternalRMParser.g:1619:4: (lv_policyTypes_1_0= ruleEPolicyType )
            	    // InternalRMParser.g:1620:5: lv_policyTypes_1_0= ruleEPolicyType
            	    {

            	    					newCompositeNode(grammarAccess.getEPolicyTypesAccess().getPolicyTypesEPolicyTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_policyTypes_1_0=ruleEPolicyType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPolicyTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"policyTypes",
            	    						lv_policyTypes_1_0,
            	    						"org.sodalite.dsl.RM.EPolicyType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicyTypes"


    // $ANTLR start "entryRuleEPolicyType"
    // InternalRMParser.g:1641:1: entryRuleEPolicyType returns [EObject current=null] : iv_ruleEPolicyType= ruleEPolicyType EOF ;
    public final EObject entryRuleEPolicyType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyType = null;


        try {
            // InternalRMParser.g:1641:52: (iv_ruleEPolicyType= ruleEPolicyType EOF )
            // InternalRMParser.g:1642:2: iv_ruleEPolicyType= ruleEPolicyType EOF
            {
             newCompositeNode(grammarAccess.getEPolicyTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyType=ruleEPolicyType();

            state._fsp--;

             current =iv_ruleEPolicyType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyType"


    // $ANTLR start "ruleEPolicyType"
    // InternalRMParser.g:1648:1: ruleEPolicyType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPolicyType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_policy_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1654:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1655:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1655:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1656:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_policy_3_0= ruleEPolicyTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1656:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1657:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1657:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1658:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPolicyTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPolicyTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEPolicyTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_23); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEPolicyTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1682:3: ( (lv_policy_3_0= ruleEPolicyTypeBody ) )
            // InternalRMParser.g:1683:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            {
            // InternalRMParser.g:1683:4: (lv_policy_3_0= ruleEPolicyTypeBody )
            // InternalRMParser.g:1684:5: lv_policy_3_0= ruleEPolicyTypeBody
            {

            					newCompositeNode(grammarAccess.getEPolicyTypeAccess().getPolicyEPolicyTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_policy_3_0=ruleEPolicyTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPolicyTypeRule());
            					}
            					set(
            						current,
            						"policy",
            						lv_policy_3_0,
            						"org.sodalite.dsl.RM.EPolicyTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEPolicyTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicyType"


    // $ANTLR start "entryRuleEPolicyTypeBody"
    // InternalRMParser.g:1709:1: entryRuleEPolicyTypeBody returns [EObject current=null] : iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF ;
    public final EObject entryRuleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPolicyTypeBody = null;


        try {
            // InternalRMParser.g:1709:56: (iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF )
            // InternalRMParser.g:1710:2: iv_ruleEPolicyTypeBody= ruleEPolicyTypeBody EOF
            {
             newCompositeNode(grammarAccess.getEPolicyTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPolicyTypeBody=ruleEPolicyTypeBody();

            state._fsp--;

             current =iv_ruleEPolicyTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPolicyTypeBody"


    // $ANTLR start "ruleEPolicyTypeBody"
    // InternalRMParser.g:1716:1: ruleEPolicyTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEPolicyTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:1722:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1723:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1723:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1724:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1724:3: ()
            // InternalRMParser.g:1725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPolicyTypeBodyAccess().getEPolicyTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1731:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:1732:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1732:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:1733:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1736:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )* )
            // InternalRMParser.g:1737:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:1737:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRMParser.g:1738:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1738:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1739:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1739:112: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1740:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1743:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1743:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1743:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1743:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEPolicyTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1747:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1748:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1748:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1749:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_24); 

            	    											newLeafNode(otherlv_3, grammarAccess.getEPolicyTypeBodyAccess().getSuperTypeEPolicyTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:1766:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1766:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1767:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1767:112: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1768:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1771:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1771:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPolicyTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1771:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1771:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1775:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1776:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1776:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1777:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_24); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getEPolicyTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEPolicyTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEPolicyTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPolicyTypeBody"


    // $ANTLR start "entryRuleENodeTypes"
    // InternalRMParser.g:1810:1: entryRuleENodeTypes returns [EObject current=null] : iv_ruleENodeTypes= ruleENodeTypes EOF ;
    public final EObject entryRuleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypes = null;


        try {
            // InternalRMParser.g:1810:51: (iv_ruleENodeTypes= ruleENodeTypes EOF )
            // InternalRMParser.g:1811:2: iv_ruleENodeTypes= ruleENodeTypes EOF
            {
             newCompositeNode(grammarAccess.getENodeTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTypes=ruleENodeTypes();

            state._fsp--;

             current =iv_ruleENodeTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTypes"


    // $ANTLR start "ruleENodeTypes"
    // InternalRMParser.g:1817:1: ruleENodeTypes returns [EObject current=null] : ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) ;
    public final EObject ruleENodeTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_nodeTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1823:2: ( ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ ) )
            // InternalRMParser.g:1824:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            {
            // InternalRMParser.g:1824:2: ( () ( (lv_nodeTypes_1_0= ruleENodeType ) )+ )
            // InternalRMParser.g:1825:3: () ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            {
            // InternalRMParser.g:1825:3: ()
            // InternalRMParser.g:1826:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypesAccess().getENodeTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1832:3: ( (lv_nodeTypes_1_0= ruleENodeType ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_QUALIFIED_NAME) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalRMParser.g:1833:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    {
            	    // InternalRMParser.g:1833:4: (lv_nodeTypes_1_0= ruleENodeType )
            	    // InternalRMParser.g:1834:5: lv_nodeTypes_1_0= ruleENodeType
            	    {

            	    					newCompositeNode(grammarAccess.getENodeTypesAccess().getNodeTypesENodeTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_nodeTypes_1_0=ruleENodeType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getENodeTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"nodeTypes",
            	    						lv_nodeTypes_1_0,
            	    						"org.sodalite.dsl.RM.ENodeType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTypes"


    // $ANTLR start "entryRuleENodeType"
    // InternalRMParser.g:1855:1: entryRuleENodeType returns [EObject current=null] : iv_ruleENodeType= ruleENodeType EOF ;
    public final EObject entryRuleENodeType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeType = null;


        try {
            // InternalRMParser.g:1855:50: (iv_ruleENodeType= ruleENodeType EOF )
            // InternalRMParser.g:1856:2: iv_ruleENodeType= ruleENodeType EOF
            {
             newCompositeNode(grammarAccess.getENodeTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeType=ruleENodeType();

            state._fsp--;

             current =iv_ruleENodeType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeType"


    // $ANTLR start "ruleENodeType"
    // InternalRMParser.g:1862:1: ruleENodeType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleENodeType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_node_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1868:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:1869:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:1869:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:1870:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_node_3_0= ruleENodeTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:1870:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:1871:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:1871:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:1872:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getENodeTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getENodeTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getENodeTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_25); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getENodeTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:1896:3: ( (lv_node_3_0= ruleENodeTypeBody ) )
            // InternalRMParser.g:1897:4: (lv_node_3_0= ruleENodeTypeBody )
            {
            // InternalRMParser.g:1897:4: (lv_node_3_0= ruleENodeTypeBody )
            // InternalRMParser.g:1898:5: lv_node_3_0= ruleENodeTypeBody
            {

            					newCompositeNode(grammarAccess.getENodeTypeAccess().getNodeENodeTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_node_3_0=ruleENodeTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getENodeTypeRule());
            					}
            					set(
            						current,
            						"node",
            						lv_node_3_0,
            						"org.sodalite.dsl.RM.ENodeTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getENodeTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeType"


    // $ANTLR start "entryRuleENodeTypeBody"
    // InternalRMParser.g:1923:1: entryRuleENodeTypeBody returns [EObject current=null] : iv_ruleENodeTypeBody= ruleENodeTypeBody EOF ;
    public final EObject entryRuleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeBody = null;


        try {
            // InternalRMParser.g:1923:54: (iv_ruleENodeTypeBody= ruleENodeTypeBody EOF )
            // InternalRMParser.g:1924:2: iv_ruleENodeTypeBody= ruleENodeTypeBody EOF
            {
             newCompositeNode(grammarAccess.getENodeTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTypeBody=ruleENodeTypeBody();

            state._fsp--;

             current =iv_ruleENodeTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTypeBody"


    // $ANTLR start "ruleENodeTypeBody"
    // InternalRMParser.g:1930:1: ruleENodeTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleENodeTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        Token otherlv_18=null;
        Token this_BEGIN_19=null;
        Token this_END_21=null;
        Token otherlv_22=null;
        Token this_BEGIN_23=null;
        Token this_END_25=null;
        EObject lv_properties_8_0 = null;

        EObject lv_attributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_capabilities_20_0 = null;

        EObject lv_requirements_24_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:1936:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:1937:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:1937:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:1938:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:1938:3: ()
            // InternalRMParser.g:1939:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getENodeTypeBodyAccess().getENodeTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:1945:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:1946:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:1946:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:1947:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:1950:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:1951:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:1951:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) ) )*
            loop15:
            do {
                int alt15=8;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt15=2;
                }
                else if ( LA15_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt15=3;
                }
                else if ( LA15_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt15=4;
                }
                else if ( LA15_0 == Interfaces && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt15=5;
                }
                else if ( LA15_0 == Capabilities && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt15=6;
                }
                else if ( LA15_0 == Requirements && getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
                    alt15=7;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalRMParser.g:1952:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1952:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:1953:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:1953:110: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:1954:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:1957:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:1957:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1957:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:1957:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getENodeTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:1961:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:1962:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:1962:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:1963:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_26); 

            	    											newLeafNode(otherlv_3, grammarAccess.getENodeTypeBodyAccess().getSuperTypeENodeTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:1980:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:1980:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:1981:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:1981:110: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:1982:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:1985:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:1985:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:1985:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:1985:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getENodeTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:1989:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:1990:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:1990:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:1991:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getENodeTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:2013:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2013:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2014:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2014:110: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2015:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2018:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2018:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2018:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2018:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getENodeTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2026:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2027:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2027:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2028:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_26); 

            	    									newLeafNode(this_END_9, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2055:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2055:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2056:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2056:110: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2057:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2060:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2060:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2060:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2060:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_attributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getENodeTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2068:9: ( (lv_attributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2069:10: (lv_attributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2069:10: (lv_attributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2070:11: lv_attributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getAttributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_attributes_12_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"attributes",
            	    												lv_attributes_12_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_26); 

            	    									newLeafNode(this_END_13, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2097:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2097:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2098:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2098:110: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2099:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2102:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2102:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2102:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2102:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getENodeTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2110:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2111:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2111:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2112:11: lv_interfaces_16_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_interfaces_16_0=ruleEInterfaces();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"interfaces",
            	    												lv_interfaces_16_0,
            	    												"org.sodalite.dsl.RM.EInterfaces");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_26); 

            	    									newLeafNode(this_END_17, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:2139:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2139:4: ({...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) ) )
            	    // InternalRMParser.g:2140:5: {...}? => ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2140:110: ( ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) ) )
            	    // InternalRMParser.g:2141:6: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2144:9: ({...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END ) )
            	    // InternalRMParser.g:2144:10: {...}? => (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2144:19: (otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END )
            	    // InternalRMParser.g:2144:20: otherlv_18= Capabilities this_BEGIN_19= RULE_BEGIN ( (lv_capabilities_20_0= ruleECapabilities ) ) this_END_21= RULE_END
            	    {
            	    otherlv_18=(Token)match(input,Capabilities,FOLLOW_3); 

            	    									newLeafNode(otherlv_18, grammarAccess.getENodeTypeBodyAccess().getCapabilitiesKeyword_1_5_0());
            	    								
            	    this_BEGIN_19=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_19, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_5_1());
            	    								
            	    // InternalRMParser.g:2152:9: ( (lv_capabilities_20_0= ruleECapabilities ) )
            	    // InternalRMParser.g:2153:10: (lv_capabilities_20_0= ruleECapabilities )
            	    {
            	    // InternalRMParser.g:2153:10: (lv_capabilities_20_0= ruleECapabilities )
            	    // InternalRMParser.g:2154:11: lv_capabilities_20_0= ruleECapabilities
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getCapabilitiesECapabilitiesParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_capabilities_20_0=ruleECapabilities();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"capabilities",
            	    												lv_capabilities_20_0,
            	    												"org.sodalite.dsl.RM.ECapabilities");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_21=(Token)match(input,RULE_END,FOLLOW_26); 

            	    									newLeafNode(this_END_21, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:2181:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2181:4: ({...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) ) )
            	    // InternalRMParser.g:2182:5: {...}? => ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6)");
            	    }
            	    // InternalRMParser.g:2182:110: ( ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) ) )
            	    // InternalRMParser.g:2183:6: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1(), 6);
            	    					
            	    // InternalRMParser.g:2186:9: ({...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END ) )
            	    // InternalRMParser.g:2186:10: {...}? => (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleENodeTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2186:19: (otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END )
            	    // InternalRMParser.g:2186:20: otherlv_22= Requirements this_BEGIN_23= RULE_BEGIN ( (lv_requirements_24_0= ruleERequirements ) ) this_END_25= RULE_END
            	    {
            	    otherlv_22=(Token)match(input,Requirements,FOLLOW_3); 

            	    									newLeafNode(otherlv_22, grammarAccess.getENodeTypeBodyAccess().getRequirementsKeyword_1_6_0());
            	    								
            	    this_BEGIN_23=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_23, grammarAccess.getENodeTypeBodyAccess().getBEGINTerminalRuleCall_1_6_1());
            	    								
            	    // InternalRMParser.g:2194:9: ( (lv_requirements_24_0= ruleERequirements ) )
            	    // InternalRMParser.g:2195:10: (lv_requirements_24_0= ruleERequirements )
            	    {
            	    // InternalRMParser.g:2195:10: (lv_requirements_24_0= ruleERequirements )
            	    // InternalRMParser.g:2196:11: lv_requirements_24_0= ruleERequirements
            	    {

            	    											newCompositeNode(grammarAccess.getENodeTypeBodyAccess().getRequirementsERequirementsParserRuleCall_1_6_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_requirements_24_0=ruleERequirements();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getENodeTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"requirements",
            	    												lv_requirements_24_0,
            	    												"org.sodalite.dsl.RM.ERequirements");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_25=(Token)match(input,RULE_END,FOLLOW_26); 

            	    									newLeafNode(this_END_25, grammarAccess.getENodeTypeBodyAccess().getENDTerminalRuleCall_1_6_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getENodeTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTypeBody"


    // $ANTLR start "entryRuleERelationshipTypes"
    // InternalRMParser.g:2234:1: entryRuleERelationshipTypes returns [EObject current=null] : iv_ruleERelationshipTypes= ruleERelationshipTypes EOF ;
    public final EObject entryRuleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypes = null;


        try {
            // InternalRMParser.g:2234:59: (iv_ruleERelationshipTypes= ruleERelationshipTypes EOF )
            // InternalRMParser.g:2235:2: iv_ruleERelationshipTypes= ruleERelationshipTypes EOF
            {
             newCompositeNode(grammarAccess.getERelationshipTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelationshipTypes=ruleERelationshipTypes();

            state._fsp--;

             current =iv_ruleERelationshipTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelationshipTypes"


    // $ANTLR start "ruleERelationshipTypes"
    // InternalRMParser.g:2241:1: ruleERelationshipTypes returns [EObject current=null] : ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) ;
    public final EObject ruleERelationshipTypes() throws RecognitionException {
        EObject current = null;

        EObject lv_relationshipTypes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2247:2: ( ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ ) )
            // InternalRMParser.g:2248:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            {
            // InternalRMParser.g:2248:2: ( () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+ )
            // InternalRMParser.g:2249:3: () ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            {
            // InternalRMParser.g:2249:3: ()
            // InternalRMParser.g:2250:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypesAccess().getERelationshipTypesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2256:3: ( (lv_relationshipTypes_1_0= ruleERelationshipType ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_QUALIFIED_NAME) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalRMParser.g:2257:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    {
            	    // InternalRMParser.g:2257:4: (lv_relationshipTypes_1_0= ruleERelationshipType )
            	    // InternalRMParser.g:2258:5: lv_relationshipTypes_1_0= ruleERelationshipType
            	    {

            	    					newCompositeNode(grammarAccess.getERelationshipTypesAccess().getRelationshipTypesERelationshipTypeParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_relationshipTypes_1_0=ruleERelationshipType();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERelationshipTypesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationshipTypes",
            	    						lv_relationshipTypes_1_0,
            	    						"org.sodalite.dsl.RM.ERelationshipType");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERelationshipTypes"


    // $ANTLR start "entryRuleERelationshipType"
    // InternalRMParser.g:2279:1: entryRuleERelationshipType returns [EObject current=null] : iv_ruleERelationshipType= ruleERelationshipType EOF ;
    public final EObject entryRuleERelationshipType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipType = null;


        try {
            // InternalRMParser.g:2279:58: (iv_ruleERelationshipType= ruleERelationshipType EOF )
            // InternalRMParser.g:2280:2: iv_ruleERelationshipType= ruleERelationshipType EOF
            {
             newCompositeNode(grammarAccess.getERelationshipTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelationshipType=ruleERelationshipType();

            state._fsp--;

             current =iv_ruleERelationshipType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelationshipType"


    // $ANTLR start "ruleERelationshipType"
    // InternalRMParser.g:2286:1: ruleERelationshipType returns [EObject current=null] : ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERelationshipType() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_relationship_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2292:2: ( ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2293:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2293:2: ( ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2294:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_relationship_3_0= ruleERelationshipTypeBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2294:3: ( (lv_name_0_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2295:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2295:4: (lv_name_0_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2296:5: lv_name_0_0= RULE_QUALIFIED_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getERelationshipTypeAccess().getNameQUALIFIED_NAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERelationshipTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.QUALIFIED_NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERelationshipTypeAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_27); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERelationshipTypeAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2320:3: ( (lv_relationship_3_0= ruleERelationshipTypeBody ) )
            // InternalRMParser.g:2321:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            {
            // InternalRMParser.g:2321:4: (lv_relationship_3_0= ruleERelationshipTypeBody )
            // InternalRMParser.g:2322:5: lv_relationship_3_0= ruleERelationshipTypeBody
            {

            					newCompositeNode(grammarAccess.getERelationshipTypeAccess().getRelationshipERelationshipTypeBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_relationship_3_0=ruleERelationshipTypeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERelationshipTypeRule());
            					}
            					set(
            						current,
            						"relationship",
            						lv_relationship_3_0,
            						"org.sodalite.dsl.RM.ERelationshipTypeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getERelationshipTypeAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERelationshipType"


    // $ANTLR start "entryRuleERelationshipTypeBody"
    // InternalRMParser.g:2347:1: entryRuleERelationshipTypeBody returns [EObject current=null] : iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF ;
    public final EObject entryRuleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERelationshipTypeBody = null;


        try {
            // InternalRMParser.g:2347:62: (iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF )
            // InternalRMParser.g:2348:2: iv_ruleERelationshipTypeBody= ruleERelationshipTypeBody EOF
            {
             newCompositeNode(grammarAccess.getERelationshipTypeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERelationshipTypeBody=ruleERelationshipTypeBody();

            state._fsp--;

             current =iv_ruleERelationshipTypeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERelationshipTypeBody"


    // $ANTLR start "ruleERelationshipTypeBody"
    // InternalRMParser.g:2354:1: ruleERelationshipTypeBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleERelationshipTypeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_description_5_0=null;
        Token otherlv_6=null;
        Token this_BEGIN_7=null;
        Token this_END_9=null;
        Token otherlv_10=null;
        Token this_BEGIN_11=null;
        Token this_END_13=null;
        Token otherlv_14=null;
        Token this_BEGIN_15=null;
        Token this_END_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_properties_8_0 = null;

        EObject lv_atributes_12_0 = null;

        EObject lv_interfaces_16_0 = null;

        EObject lv_valid_target_types_20_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2360:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:2361:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:2361:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:2362:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:2362:3: ()
            // InternalRMParser.g:2363:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERelationshipTypeBodyAccess().getERelationshipTypeBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2369:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) ) )
            // InternalRMParser.g:2370:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            {
            // InternalRMParser.g:2370:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* ) )
            // InternalRMParser.g:2371:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:2374:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )* )
            // InternalRMParser.g:2375:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            {
            // InternalRMParser.g:2375:6: ( ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) ) )*
            loop17:
            do {
                int alt17=7;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == Derived_from && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }
                else if ( LA17_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt17=3;
                }
                else if ( LA17_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
                    alt17=4;
                }
                else if ( LA17_0 == Interfaces && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
                    alt17=5;
                }
                else if ( LA17_0 == Valid_target_types && getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
                    alt17=6;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalRMParser.g:2376:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2376:4: ({...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:2377:5: {...}? => ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:2377:118: ( ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:2378:6: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:2381:9: ({...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:2381:10: {...}? => (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2381:19: (otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:2381:20: otherlv_2= Derived_from ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_2=(Token)match(input,Derived_from,FOLLOW_7); 

            	    									newLeafNode(otherlv_2, grammarAccess.getERelationshipTypeBodyAccess().getDerived_fromKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:2385:9: ( (otherlv_3= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:2386:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:2386:10: (otherlv_3= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:2387:11: otherlv_3= RULE_QUALIFIED_NAME
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    										
            	    otherlv_3=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_28); 

            	    											newLeafNode(otherlv_3, grammarAccess.getERelationshipTypeBodyAccess().getSuperTypeERelationshipTypeCrossReference_1_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:2404:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2404:4: ({...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2405:5: {...}? => ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:2405:118: ( ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2406:6: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:2409:9: ({...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2409:10: {...}? => (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2409:19: (otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2409:20: otherlv_4= Description ( (lv_description_5_0= RULE_STRING ) )
            	    {
            	    otherlv_4=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_4, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:2413:9: ( (lv_description_5_0= RULE_STRING ) )
            	    // InternalRMParser.g:2414:10: (lv_description_5_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2414:10: (lv_description_5_0= RULE_STRING )
            	    // InternalRMParser.g:2415:11: lv_description_5_0= RULE_STRING
            	    {
            	    lv_description_5_0=(Token)match(input,RULE_STRING,FOLLOW_28); 

            	    											newLeafNode(lv_description_5_0, grammarAccess.getERelationshipTypeBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_5_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:2437:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2437:4: ({...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) ) )
            	    // InternalRMParser.g:2438:5: {...}? => ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:2438:118: ( ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) ) )
            	    // InternalRMParser.g:2439:6: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:2442:9: ({...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END ) )
            	    // InternalRMParser.g:2442:10: {...}? => (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2442:19: (otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END )
            	    // InternalRMParser.g:2442:20: otherlv_6= Properties this_BEGIN_7= RULE_BEGIN ( (lv_properties_8_0= ruleEProperties ) ) this_END_9= RULE_END
            	    {
            	    otherlv_6=(Token)match(input,Properties,FOLLOW_3); 

            	    									newLeafNode(otherlv_6, grammarAccess.getERelationshipTypeBodyAccess().getPropertiesKeyword_1_2_0());
            	    								
            	    this_BEGIN_7=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_7, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:2450:9: ( (lv_properties_8_0= ruleEProperties ) )
            	    // InternalRMParser.g:2451:10: (lv_properties_8_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:2451:10: (lv_properties_8_0= ruleEProperties )
            	    // InternalRMParser.g:2452:11: lv_properties_8_0= ruleEProperties
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getPropertiesEPropertiesParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_properties_8_0=ruleEProperties();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"properties",
            	    												lv_properties_8_0,
            	    												"org.sodalite.dsl.RM.EProperties");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_9=(Token)match(input,RULE_END,FOLLOW_28); 

            	    									newLeafNode(this_END_9, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2479:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2479:4: ({...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) ) )
            	    // InternalRMParser.g:2480:5: {...}? => ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalRMParser.g:2480:118: ( ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) ) )
            	    // InternalRMParser.g:2481:6: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalRMParser.g:2484:9: ({...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END ) )
            	    // InternalRMParser.g:2484:10: {...}? => (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2484:19: (otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END )
            	    // InternalRMParser.g:2484:20: otherlv_10= Attributes this_BEGIN_11= RULE_BEGIN ( (lv_atributes_12_0= ruleEAttributes ) ) this_END_13= RULE_END
            	    {
            	    otherlv_10=(Token)match(input,Attributes,FOLLOW_3); 

            	    									newLeafNode(otherlv_10, grammarAccess.getERelationshipTypeBodyAccess().getAttributesKeyword_1_3_0());
            	    								
            	    this_BEGIN_11=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_11, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_3_1());
            	    								
            	    // InternalRMParser.g:2492:9: ( (lv_atributes_12_0= ruleEAttributes ) )
            	    // InternalRMParser.g:2493:10: (lv_atributes_12_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:2493:10: (lv_atributes_12_0= ruleEAttributes )
            	    // InternalRMParser.g:2494:11: lv_atributes_12_0= ruleEAttributes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getAtributesEAttributesParserRuleCall_1_3_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_atributes_12_0=ruleEAttributes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"atributes",
            	    												lv_atributes_12_0,
            	    												"org.sodalite.dsl.RM.EAttributes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_13=(Token)match(input,RULE_END,FOLLOW_28); 

            	    									newLeafNode(this_END_13, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_3_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2521:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:2521:4: ({...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) ) )
            	    // InternalRMParser.g:2522:5: {...}? => ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalRMParser.g:2522:118: ( ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) ) )
            	    // InternalRMParser.g:2523:6: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalRMParser.g:2526:9: ({...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END ) )
            	    // InternalRMParser.g:2526:10: {...}? => (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2526:19: (otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END )
            	    // InternalRMParser.g:2526:20: otherlv_14= Interfaces this_BEGIN_15= RULE_BEGIN ( (lv_interfaces_16_0= ruleEInterfaces ) ) this_END_17= RULE_END
            	    {
            	    otherlv_14=(Token)match(input,Interfaces,FOLLOW_3); 

            	    									newLeafNode(otherlv_14, grammarAccess.getERelationshipTypeBodyAccess().getInterfacesKeyword_1_4_0());
            	    								
            	    this_BEGIN_15=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_15, grammarAccess.getERelationshipTypeBodyAccess().getBEGINTerminalRuleCall_1_4_1());
            	    								
            	    // InternalRMParser.g:2534:9: ( (lv_interfaces_16_0= ruleEInterfaces ) )
            	    // InternalRMParser.g:2535:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    {
            	    // InternalRMParser.g:2535:10: (lv_interfaces_16_0= ruleEInterfaces )
            	    // InternalRMParser.g:2536:11: lv_interfaces_16_0= ruleEInterfaces
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getInterfacesEInterfacesParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_interfaces_16_0=ruleEInterfaces();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"interfaces",
            	    												lv_interfaces_16_0,
            	    												"org.sodalite.dsl.RM.EInterfaces");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_17=(Token)match(input,RULE_END,FOLLOW_28); 

            	    									newLeafNode(this_END_17, grammarAccess.getERelationshipTypeBodyAccess().getENDTerminalRuleCall_1_4_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:2563:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:2563:4: ({...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:2564:5: {...}? => ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalRMParser.g:2564:118: ( ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) ) )
            	    // InternalRMParser.g:2565:6: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalRMParser.g:2568:9: ({...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket ) )
            	    // InternalRMParser.g:2568:10: {...}? => (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERelationshipTypeBody", "true");
            	    }
            	    // InternalRMParser.g:2568:19: (otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket )
            	    // InternalRMParser.g:2568:20: otherlv_18= Valid_target_types otherlv_19= LeftSquareBracket ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) ) otherlv_21= RightSquareBracket
            	    {
            	    otherlv_18=(Token)match(input,Valid_target_types,FOLLOW_29); 

            	    									newLeafNode(otherlv_18, grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesKeyword_1_5_0());
            	    								
            	    otherlv_19=(Token)match(input,LeftSquareBracket,FOLLOW_7); 

            	    									newLeafNode(otherlv_19, grammarAccess.getERelationshipTypeBodyAccess().getLeftSquareBracketKeyword_1_5_1());
            	    								
            	    // InternalRMParser.g:2576:9: ( (lv_valid_target_types_20_0= ruleEValidTargetTypes ) )
            	    // InternalRMParser.g:2577:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    {
            	    // InternalRMParser.g:2577:10: (lv_valid_target_types_20_0= ruleEValidTargetTypes )
            	    // InternalRMParser.g:2578:11: lv_valid_target_types_20_0= ruleEValidTargetTypes
            	    {

            	    											newCompositeNode(grammarAccess.getERelationshipTypeBodyAccess().getValid_target_typesEValidTargetTypesParserRuleCall_1_5_2_0());
            	    										
            	    pushFollow(FOLLOW_30);
            	    lv_valid_target_types_20_0=ruleEValidTargetTypes();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getERelationshipTypeBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"valid_target_types",
            	    												lv_valid_target_types_20_0,
            	    												"org.sodalite.dsl.RM.EValidTargetTypes");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    otherlv_21=(Token)match(input,RightSquareBracket,FOLLOW_28); 

            	    									newLeafNode(otherlv_21, grammarAccess.getERelationshipTypeBodyAccess().getRightSquareBracketKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getERelationshipTypeBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERelationshipTypeBody"


    // $ANTLR start "entryRuleEValidTargetTypes"
    // InternalRMParser.g:2616:1: entryRuleEValidTargetTypes returns [EObject current=null] : iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF ;
    public final EObject entryRuleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidTargetTypes = null;


        try {
            // InternalRMParser.g:2616:58: (iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF )
            // InternalRMParser.g:2617:2: iv_ruleEValidTargetTypes= ruleEValidTargetTypes EOF
            {
             newCompositeNode(grammarAccess.getEValidTargetTypesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValidTargetTypes=ruleEValidTargetTypes();

            state._fsp--;

             current =iv_ruleEValidTargetTypes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValidTargetTypes"


    // $ANTLR start "ruleEValidTargetTypes"
    // InternalRMParser.g:2623:1: ruleEValidTargetTypes returns [EObject current=null] : ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) ;
    public final EObject ruleEValidTargetTypes() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_targetTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2629:2: ( ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* ) )
            // InternalRMParser.g:2630:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            {
            // InternalRMParser.g:2630:2: ( ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )* )
            // InternalRMParser.g:2631:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            {
            // InternalRMParser.g:2631:3: ( (lv_targetTypes_0_0= ruleECapabilityTypeRef ) )
            // InternalRMParser.g:2632:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            {
            // InternalRMParser.g:2632:4: (lv_targetTypes_0_0= ruleECapabilityTypeRef )
            // InternalRMParser.g:2633:5: lv_targetTypes_0_0= ruleECapabilityTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getTargetTypesECapabilityTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_targetTypes_0_0=ruleECapabilityTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValidTargetTypesRule());
            					}
            					add(
            						current,
            						"targetTypes",
            						lv_targetTypes_0_0,
            						"org.sodalite.dsl.RM.ECapabilityTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRMParser.g:2650:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Comma) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalRMParser.g:2651:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidTargetTypesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:2655:4: ( (lv_sourceType_2_0= ruleECapabilityTypeRef ) )
            	    // InternalRMParser.g:2656:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    {
            	    // InternalRMParser.g:2656:5: (lv_sourceType_2_0= ruleECapabilityTypeRef )
            	    // InternalRMParser.g:2657:6: lv_sourceType_2_0= ruleECapabilityTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidTargetTypesAccess().getSourceTypeECapabilityTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_sourceType_2_0=ruleECapabilityTypeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEValidTargetTypesRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceType",
            	    							lv_sourceType_2_0,
            	    							"org.sodalite.dsl.RM.ECapabilityTypeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEValidTargetTypes"


    // $ANTLR start "entryRuleECapabilityTypeRef"
    // InternalRMParser.g:2679:1: entryRuleECapabilityTypeRef returns [EObject current=null] : iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF ;
    public final EObject entryRuleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityTypeRef = null;


        try {
            // InternalRMParser.g:2679:59: (iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF )
            // InternalRMParser.g:2680:2: iv_ruleECapabilityTypeRef= ruleECapabilityTypeRef EOF
            {
             newCompositeNode(grammarAccess.getECapabilityTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityTypeRef=ruleECapabilityTypeRef();

            state._fsp--;

             current =iv_ruleECapabilityTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityTypeRef"


    // $ANTLR start "ruleECapabilityTypeRef"
    // InternalRMParser.g:2686:1: ruleECapabilityTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleECapabilityTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:2692:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:2693:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:2693:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:2694:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:2694:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:2695:4: otherlv_0= RULE_QUALIFIED_NAME
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getECapabilityTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getECapabilityTypeRefAccess().getNameECapabilityTypeCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityTypeRef"


    // $ANTLR start "entryRuleEProperties"
    // InternalRMParser.g:2709:1: entryRuleEProperties returns [EObject current=null] : iv_ruleEProperties= ruleEProperties EOF ;
    public final EObject entryRuleEProperties() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEProperties = null;


        try {
            // InternalRMParser.g:2709:52: (iv_ruleEProperties= ruleEProperties EOF )
            // InternalRMParser.g:2710:2: iv_ruleEProperties= ruleEProperties EOF
            {
             newCompositeNode(grammarAccess.getEPropertiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEProperties=ruleEProperties();

            state._fsp--;

             current =iv_ruleEProperties; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEProperties"


    // $ANTLR start "ruleEProperties"
    // InternalRMParser.g:2716:1: ruleEProperties returns [EObject current=null] : ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) ;
    public final EObject ruleEProperties() throws RecognitionException {
        EObject current = null;

        EObject lv_properties_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2722:2: ( ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* ) )
            // InternalRMParser.g:2723:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            {
            // InternalRMParser.g:2723:2: ( () ( (lv_properties_1_0= ruleEPropertyDefinition ) )* )
            // InternalRMParser.g:2724:3: () ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            {
            // InternalRMParser.g:2724:3: ()
            // InternalRMParser.g:2725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEPropertiesAccess().getEPropertiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:2731:3: ( (lv_properties_1_0= ruleEPropertyDefinition ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalRMParser.g:2732:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    {
            	    // InternalRMParser.g:2732:4: (lv_properties_1_0= ruleEPropertyDefinition )
            	    // InternalRMParser.g:2733:5: lv_properties_1_0= ruleEPropertyDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEPropertiesAccess().getPropertiesEPropertyDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_properties_1_0=ruleEPropertyDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEPropertiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"properties",
            	    						lv_properties_1_0,
            	    						"org.sodalite.dsl.RM.EPropertyDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEProperties"


    // $ANTLR start "entryRuleEPropertyDefinition"
    // InternalRMParser.g:2754:1: entryRuleEPropertyDefinition returns [EObject current=null] : iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF ;
    public final EObject entryRuleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinition = null;


        try {
            // InternalRMParser.g:2754:60: (iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF )
            // InternalRMParser.g:2755:2: iv_ruleEPropertyDefinition= ruleEPropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getEPropertyDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyDefinition=ruleEPropertyDefinition();

            state._fsp--;

             current =iv_ruleEPropertyDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyDefinition"


    // $ANTLR start "ruleEPropertyDefinition"
    // InternalRMParser.g:2761:1: ruleEPropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEPropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_property_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2767:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:2768:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:2768:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:2769:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_property_3_0= ruleEPropertyDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:2769:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:2770:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:2770:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:2771:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEPropertyDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEPropertyDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_33); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEPropertyDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:2795:3: ( (lv_property_3_0= ruleEPropertyDefinitionBody ) )
            // InternalRMParser.g:2796:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            {
            // InternalRMParser.g:2796:4: (lv_property_3_0= ruleEPropertyDefinitionBody )
            // InternalRMParser.g:2797:5: lv_property_3_0= ruleEPropertyDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEPropertyDefinitionAccess().getPropertyEPropertyDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_property_3_0=ruleEPropertyDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEPropertyDefinitionRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_3_0,
            						"org.sodalite.dsl.RM.EPropertyDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEPropertyDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyDefinition"


    // $ANTLR start "entryRuleEPropertyDefinitionBody"
    // InternalRMParser.g:2822:1: entryRuleEPropertyDefinitionBody returns [EObject current=null] : iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF ;
    public final EObject entryRuleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyDefinitionBody = null;


        try {
            // InternalRMParser.g:2822:64: (iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF )
            // InternalRMParser.g:2823:2: iv_ruleEPropertyDefinitionBody= ruleEPropertyDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEPropertyDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyDefinitionBody=ruleEPropertyDefinitionBody();

            state._fsp--;

             current =iv_ruleEPropertyDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyDefinitionBody"


    // $ANTLR start "ruleEPropertyDefinitionBody"
    // InternalRMParser.g:2829:1: ruleEPropertyDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEPropertyDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token lv_required_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_status_10_0=null;
        Token otherlv_11=null;
        Token this_BEGIN_12=null;
        Token this_END_14=null;
        Token otherlv_15=null;
        EObject lv_default_8_0 = null;

        EObject lv_constraints_13_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:2835:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:2836:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:2836:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:2837:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:2837:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:2838:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:2841:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:2842:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:2842:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt20=0;
            loop20:
            do {
                int alt20=8;
                int LA20_0 = input.LA(1);

                if ( LA20_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt20=1;
                }
                else if ( LA20_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt20=2;
                }
                else if ( LA20_0 == Required && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt20=3;
                }
                else if ( LA20_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt20=4;
                }
                else if ( LA20_0 == Status && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt20=5;
                }
                else if ( LA20_0 == Constraints && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt20=6;
                }
                else if ( LA20_0 == Entry_schema && getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
                    alt20=7;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalRMParser.g:2843:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2843:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:2844:4: {...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:2844:117: ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:2845:5: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:2848:8: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:2848:9: {...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2848:18: (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:2848:19: otherlv_1= Type ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEPropertyDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:2852:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:2853:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:2853:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:2854:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:2874:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2874:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2875:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:2875:117: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2876:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:2879:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2879:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2879:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2879:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_12); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:2883:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:2884:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2884:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:2885:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getEPropertyDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:2907:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2907:3: ({...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) ) )
            	    // InternalRMParser.g:2908:4: {...}? => ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:2908:117: ( ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) ) )
            	    // InternalRMParser.g:2909:5: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:2912:8: ({...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) ) )
            	    // InternalRMParser.g:2912:9: {...}? => (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2912:18: (otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) ) )
            	    // InternalRMParser.g:2912:19: otherlv_5= Required ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    {
            	    otherlv_5=(Token)match(input,Required,FOLLOW_35); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredKeyword_2_0());
            	    							
            	    // InternalRMParser.g:2916:8: ( (lv_required_6_0= RULE_BOOLEAN ) )
            	    // InternalRMParser.g:2917:9: (lv_required_6_0= RULE_BOOLEAN )
            	    {
            	    // InternalRMParser.g:2917:9: (lv_required_6_0= RULE_BOOLEAN )
            	    // InternalRMParser.g:2918:10: lv_required_6_0= RULE_BOOLEAN
            	    {
            	    lv_required_6_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_34); 

            	    										newLeafNode(lv_required_6_0, grammarAccess.getEPropertyDefinitionBodyAccess().getRequiredBOOLEANTerminalRuleCall_2_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"required",
            	    											lv_required_6_0,
            	    											"org.sodalite.dsl.RM.BOOLEAN");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:2940:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2940:3: ({...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:2941:4: {...}? => ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:2941:117: ( ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:2942:5: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:2945:8: ({...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:2945:9: {...}? => (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2945:18: (otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:2945:19: otherlv_7= Default ( (lv_default_8_0= ruleEValueExpression ) )
            	    {
            	    otherlv_7=(Token)match(input,Default,FOLLOW_36); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultKeyword_3_0());
            	    							
            	    // InternalRMParser.g:2949:8: ( (lv_default_8_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:2950:9: (lv_default_8_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:2950:9: (lv_default_8_0= ruleEValueExpression )
            	    // InternalRMParser.g:2951:10: lv_default_8_0= ruleEValueExpression
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_3_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
            	    lv_default_8_0=ruleEValueExpression();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"default",
            	    											lv_default_8_0,
            	    											"org.sodalite.dsl.RM.EValueExpression");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:2974:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:2974:3: ({...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:2975:4: {...}? => ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:2975:117: ( ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:2976:5: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:2979:8: ({...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:2979:9: {...}? => (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:2979:18: (otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:2979:19: otherlv_9= Status ( (lv_status_10_0= RULE_STRING ) )
            	    {
            	    otherlv_9=(Token)match(input,Status,FOLLOW_12); 

            	    								newLeafNode(otherlv_9, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusKeyword_4_0());
            	    							
            	    // InternalRMParser.g:2983:8: ( (lv_status_10_0= RULE_STRING ) )
            	    // InternalRMParser.g:2984:9: (lv_status_10_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:2984:9: (lv_status_10_0= RULE_STRING )
            	    // InternalRMParser.g:2985:10: lv_status_10_0= RULE_STRING
            	    {
            	    lv_status_10_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

            	    										newLeafNode(lv_status_10_0, grammarAccess.getEPropertyDefinitionBodyAccess().getStatusSTRINGTerminalRuleCall_4_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"status",
            	    											lv_status_10_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:3007:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3007:3: ({...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) ) )
            	    // InternalRMParser.g:3008:4: {...}? => ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:3008:117: ( ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) ) )
            	    // InternalRMParser.g:3009:5: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:3012:8: ({...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END ) )
            	    // InternalRMParser.g:3012:9: {...}? => (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3012:18: (otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END )
            	    // InternalRMParser.g:3012:19: otherlv_11= Constraints this_BEGIN_12= RULE_BEGIN ( (lv_constraints_13_0= ruleEConstraints ) ) this_END_14= RULE_END
            	    {
            	    otherlv_11=(Token)match(input,Constraints,FOLLOW_3); 

            	    								newLeafNode(otherlv_11, grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsKeyword_5_0());
            	    							
            	    this_BEGIN_12=(Token)match(input,RULE_BEGIN,FOLLOW_13); 

            	    								newLeafNode(this_BEGIN_12, grammarAccess.getEPropertyDefinitionBodyAccess().getBEGINTerminalRuleCall_5_1());
            	    							
            	    // InternalRMParser.g:3020:8: ( (lv_constraints_13_0= ruleEConstraints ) )
            	    // InternalRMParser.g:3021:9: (lv_constraints_13_0= ruleEConstraints )
            	    {
            	    // InternalRMParser.g:3021:9: (lv_constraints_13_0= ruleEConstraints )
            	    // InternalRMParser.g:3022:10: lv_constraints_13_0= ruleEConstraints
            	    {

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getConstraintsEConstraintsParserRuleCall_5_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_constraints_13_0=ruleEConstraints();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"constraints",
            	    											lv_constraints_13_0,
            	    											"org.sodalite.dsl.RM.EConstraints");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_14=(Token)match(input,RULE_END,FOLLOW_34); 

            	    								newLeafNode(this_END_14, grammarAccess.getEPropertyDefinitionBodyAccess().getENDTerminalRuleCall_5_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // InternalRMParser.g:3049:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3049:3: ({...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3050:4: {...}? => ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6)");
            	    }
            	    // InternalRMParser.g:3050:117: ( ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3051:5: ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup(), 6);
            	    				
            	    // InternalRMParser.g:3054:8: ({...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3054:9: {...}? => (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3054:18: (otherlv_15= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3054:19: otherlv_15= Entry_schema ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_15=(Token)match(input,Entry_schema,FOLLOW_4); 

            	    								newLeafNode(otherlv_15, grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaKeyword_6_0());
            	    							
            	    // InternalRMParser.g:3058:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:3059:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3059:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:3060:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEPropertyDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEPropertyDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_6_1_0());
            	    									
            	    pushFollow(FOLLOW_34);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEPropertyDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEPropertyDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyDefinitionBody"


    // $ANTLR start "entryRuleEAttributes"
    // InternalRMParser.g:3091:1: entryRuleEAttributes returns [EObject current=null] : iv_ruleEAttributes= ruleEAttributes EOF ;
    public final EObject entryRuleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributes = null;


        try {
            // InternalRMParser.g:3091:52: (iv_ruleEAttributes= ruleEAttributes EOF )
            // InternalRMParser.g:3092:2: iv_ruleEAttributes= ruleEAttributes EOF
            {
             newCompositeNode(grammarAccess.getEAttributesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributes=ruleEAttributes();

            state._fsp--;

             current =iv_ruleEAttributes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributes"


    // $ANTLR start "ruleEAttributes"
    // InternalRMParser.g:3098:1: ruleEAttributes returns [EObject current=null] : ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) ;
    public final EObject ruleEAttributes() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3104:2: ( ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* ) )
            // InternalRMParser.g:3105:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            {
            // InternalRMParser.g:3105:2: ( () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )* )
            // InternalRMParser.g:3106:3: () ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            {
            // InternalRMParser.g:3106:3: ()
            // InternalRMParser.g:3107:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEAttributesAccess().getEAttributesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3113:3: ( (lv_attributes_1_0= ruleEAttributeDefinition ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_ID) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalRMParser.g:3114:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    {
            	    // InternalRMParser.g:3114:4: (lv_attributes_1_0= ruleEAttributeDefinition )
            	    // InternalRMParser.g:3115:5: lv_attributes_1_0= ruleEAttributeDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEAttributesAccess().getAttributesEAttributeDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_attributes_1_0=ruleEAttributeDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEAttributesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_1_0,
            	    						"org.sodalite.dsl.RM.EAttributeDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributes"


    // $ANTLR start "entryRuleEAttributeDefinition"
    // InternalRMParser.g:3136:1: entryRuleEAttributeDefinition returns [EObject current=null] : iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF ;
    public final EObject entryRuleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinition = null;


        try {
            // InternalRMParser.g:3136:61: (iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF )
            // InternalRMParser.g:3137:2: iv_ruleEAttributeDefinition= ruleEAttributeDefinition EOF
            {
             newCompositeNode(grammarAccess.getEAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeDefinition=ruleEAttributeDefinition();

            state._fsp--;

             current =iv_ruleEAttributeDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeDefinition"


    // $ANTLR start "ruleEAttributeDefinition"
    // InternalRMParser.g:3143:1: ruleEAttributeDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEAttributeDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3149:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3150:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3150:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3151:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3151:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3152:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3152:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3153:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEAttributeDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_37); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEAttributeDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3177:3: ( (lv_attribute_3_0= ruleEAttributeDefinitionBody ) )
            // InternalRMParser.g:3178:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            {
            // InternalRMParser.g:3178:4: (lv_attribute_3_0= ruleEAttributeDefinitionBody )
            // InternalRMParser.g:3179:5: lv_attribute_3_0= ruleEAttributeDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEAttributeDefinitionAccess().getAttributeEAttributeDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_attribute_3_0=ruleEAttributeDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEAttributeDefinitionRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_3_0,
            						"org.sodalite.dsl.RM.EAttributeDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEAttributeDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeDefinition"


    // $ANTLR start "entryRuleEAttributeDefinitionBody"
    // InternalRMParser.g:3204:1: entryRuleEAttributeDefinitionBody returns [EObject current=null] : iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF ;
    public final EObject entryRuleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEAttributeDefinitionBody = null;


        try {
            // InternalRMParser.g:3204:65: (iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF )
            // InternalRMParser.g:3205:2: iv_ruleEAttributeDefinitionBody= ruleEAttributeDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEAttributeDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEAttributeDefinitionBody=ruleEAttributeDefinitionBody();

            state._fsp--;

             current =iv_ruleEAttributeDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEAttributeDefinitionBody"


    // $ANTLR start "ruleEAttributeDefinitionBody"
    // InternalRMParser.g:3211:1: ruleEAttributeDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEAttributeDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRMParser.g:3217:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3218:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3218:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3219:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3219:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3220:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3223:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3224:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3224:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) ) )+
            int cnt22=0;
            loop22:
            do {
                int alt22=4;
                int LA22_0 = input.LA(1);

                if ( LA22_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt22=1;
                }
                else if ( LA22_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt22=2;
                }
                else if ( LA22_0 == Entry_schema && getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt22=3;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalRMParser.g:3225:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3225:3: ({...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3226:4: {...}? => ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3226:118: ( ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3227:5: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3230:8: ({...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3230:9: {...}? => (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3230:18: (otherlv_1= Type ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3230:19: otherlv_1= Type ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_4); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEAttributeDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3234:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:3235:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3235:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:3236:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getTypeEDataTypeCrossReference_0_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:3256:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3256:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3257:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3257:118: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3258:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3261:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3261:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3261:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3261:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_12); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:3265:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:3266:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3266:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:3267:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getEAttributeDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:3289:3: ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3289:3: ({...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:3290:4: {...}? => ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3290:118: ( ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:3291:5: ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3294:8: ({...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:3294:9: {...}? => (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3294:18: (otherlv_5= Entry_schema ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:3294:19: otherlv_5= Entry_schema ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_5=(Token)match(input,Entry_schema,FOLLOW_4); 

            	    								newLeafNode(otherlv_5, grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaKeyword_2_0());
            	    							
            	    // InternalRMParser.g:3298:8: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:3299:9: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:3299:9: ( ruleEDataTypeName )
            	    // InternalRMParser.g:3300:10: ruleEDataTypeName
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEAttributeDefinitionBodyRule());
            	    										}
            	    									

            	    										newCompositeNode(grammarAccess.getEAttributeDefinitionBodyAccess().getEntry_schemaEDataTypeCrossReference_2_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEAttributeDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEAttributeDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEAttributeDefinitionBody"


    // $ANTLR start "entryRuleEInterfaces"
    // InternalRMParser.g:3331:1: entryRuleEInterfaces returns [EObject current=null] : iv_ruleEInterfaces= ruleEInterfaces EOF ;
    public final EObject entryRuleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaces = null;


        try {
            // InternalRMParser.g:3331:52: (iv_ruleEInterfaces= ruleEInterfaces EOF )
            // InternalRMParser.g:3332:2: iv_ruleEInterfaces= ruleEInterfaces EOF
            {
             newCompositeNode(grammarAccess.getEInterfacesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaces=ruleEInterfaces();

            state._fsp--;

             current =iv_ruleEInterfaces; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaces"


    // $ANTLR start "ruleEInterfaces"
    // InternalRMParser.g:3338:1: ruleEInterfaces returns [EObject current=null] : ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) ;
    public final EObject ruleEInterfaces() throws RecognitionException {
        EObject current = null;

        EObject lv_interfaces_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3344:2: ( ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* ) )
            // InternalRMParser.g:3345:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            {
            // InternalRMParser.g:3345:2: ( () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )* )
            // InternalRMParser.g:3346:3: () ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            {
            // InternalRMParser.g:3346:3: ()
            // InternalRMParser.g:3347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInterfacesAccess().getEInterfacesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3353:3: ( (lv_interfaces_1_0= ruleEInterfaceDefinition ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_ID) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalRMParser.g:3354:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    {
            	    // InternalRMParser.g:3354:4: (lv_interfaces_1_0= ruleEInterfaceDefinition )
            	    // InternalRMParser.g:3355:5: lv_interfaces_1_0= ruleEInterfaceDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInterfacesAccess().getInterfacesEInterfaceDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_interfaces_1_0=ruleEInterfaceDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInterfacesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"interfaces",
            	    						lv_interfaces_1_0,
            	    						"org.sodalite.dsl.RM.EInterfaceDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaces"


    // $ANTLR start "entryRuleEInterfaceDefinition"
    // InternalRMParser.g:3376:1: entryRuleEInterfaceDefinition returns [EObject current=null] : iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF ;
    public final EObject entryRuleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinition = null;


        try {
            // InternalRMParser.g:3376:61: (iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF )
            // InternalRMParser.g:3377:2: iv_ruleEInterfaceDefinition= ruleEInterfaceDefinition EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceDefinition=ruleEInterfaceDefinition();

            state._fsp--;

             current =iv_ruleEInterfaceDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceDefinition"


    // $ANTLR start "ruleEInterfaceDefinition"
    // InternalRMParser.g:3383:1: ruleEInterfaceDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEInterfaceDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_interface_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3389:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3390:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3391:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3391:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3392:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3392:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3393:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEInterfaceDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInterfaceDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_39); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEInterfaceDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3417:3: ( (lv_interface_3_0= ruleEInterfaceDefinitionBody ) )
            // InternalRMParser.g:3418:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            {
            // InternalRMParser.g:3418:4: (lv_interface_3_0= ruleEInterfaceDefinitionBody )
            // InternalRMParser.g:3419:5: lv_interface_3_0= ruleEInterfaceDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEInterfaceDefinitionAccess().getInterfaceEInterfaceDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_interface_3_0=ruleEInterfaceDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionRule());
            					}
            					set(
            						current,
            						"interface",
            						lv_interface_3_0,
            						"org.sodalite.dsl.RM.EInterfaceDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEInterfaceDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceDefinition"


    // $ANTLR start "entryRuleEInterfaceDefinitionBody"
    // InternalRMParser.g:3444:1: entryRuleEInterfaceDefinitionBody returns [EObject current=null] : iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF ;
    public final EObject entryRuleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInterfaceDefinitionBody = null;


        try {
            // InternalRMParser.g:3444:65: (iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF )
            // InternalRMParser.g:3445:2: iv_ruleEInterfaceDefinitionBody= ruleEInterfaceDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInterfaceDefinitionBody=ruleEInterfaceDefinitionBody();

            state._fsp--;

             current =iv_ruleEInterfaceDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInterfaceDefinitionBody"


    // $ANTLR start "ruleEInterfaceDefinitionBody"
    // InternalRMParser.g:3451:1: ruleEInterfaceDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleEInterfaceDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token this_END_6=null;
        Token otherlv_7=null;
        Token this_BEGIN_8=null;
        Token this_END_10=null;
        EObject lv_inputs_5_0 = null;

        EObject lv_operations_9_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3457:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:3458:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:3458:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:3459:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:3459:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:3460:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:3463:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?)
            // InternalRMParser.g:3464:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:3464:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=4;
                int LA24_0 = input.LA(1);

                if ( LA24_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt24=1;
                }
                else if ( LA24_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt24=2;
                }
                else if ( LA24_0 == Operations && getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt24=3;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalRMParser.g:3465:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3465:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:3466:4: {...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:3466:118: ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:3467:5: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:3470:8: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:3470:9: {...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3470:18: (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:3470:19: otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:3474:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:3475:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:3475:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:3476:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_40); 

            	    										newLeafNode(otherlv_2, grammarAccess.getEInterfaceDefinitionBodyAccess().getTypeEInterfaceTypeCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:3493:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3493:3: ({...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) ) )
            	    // InternalRMParser.g:3494:4: {...}? => ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:3494:118: ( ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) ) )
            	    // InternalRMParser.g:3495:5: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:3498:8: ({...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END ) )
            	    // InternalRMParser.g:3498:9: {...}? => (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3498:18: (otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END )
            	    // InternalRMParser.g:3498:19: otherlv_3= Inputs this_BEGIN_4= RULE_BEGIN ( (lv_inputs_5_0= ruleEProperties ) ) this_END_6= RULE_END
            	    {
            	    otherlv_3=(Token)match(input,Inputs,FOLLOW_3); 

            	    								newLeafNode(otherlv_3, grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsKeyword_1_0());
            	    							
            	    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_4, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1());
            	    							
            	    // InternalRMParser.g:3506:8: ( (lv_inputs_5_0= ruleEProperties ) )
            	    // InternalRMParser.g:3507:9: (lv_inputs_5_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:3507:9: (lv_inputs_5_0= ruleEProperties )
            	    // InternalRMParser.g:3508:10: lv_inputs_5_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getInputsEPropertiesParserRuleCall_1_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_inputs_5_0=ruleEProperties();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"inputs",
            	    											lv_inputs_5_0,
            	    											"org.sodalite.dsl.RM.EProperties");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_6=(Token)match(input,RULE_END,FOLLOW_40); 

            	    								newLeafNode(this_END_6, grammarAccess.getEInterfaceDefinitionBodyAccess().getENDTerminalRuleCall_1_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:3535:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3535:3: ({...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) ) )
            	    // InternalRMParser.g:3536:4: {...}? => ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:3536:118: ( ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) ) )
            	    // InternalRMParser.g:3537:5: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:3540:8: ({...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END ) )
            	    // InternalRMParser.g:3540:9: {...}? => (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3540:18: (otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END )
            	    // InternalRMParser.g:3540:19: otherlv_7= Operations this_BEGIN_8= RULE_BEGIN ( (lv_operations_9_0= ruleEOperations ) ) this_END_10= RULE_END
            	    {
            	    otherlv_7=(Token)match(input,Operations,FOLLOW_3); 

            	    								newLeafNode(otherlv_7, grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsKeyword_2_0());
            	    							
            	    this_BEGIN_8=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_8, grammarAccess.getEInterfaceDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:3548:8: ( (lv_operations_9_0= ruleEOperations ) )
            	    // InternalRMParser.g:3549:9: (lv_operations_9_0= ruleEOperations )
            	    {
            	    // InternalRMParser.g:3549:9: (lv_operations_9_0= ruleEOperations )
            	    // InternalRMParser.g:3550:10: lv_operations_9_0= ruleEOperations
            	    {

            	    										newCompositeNode(grammarAccess.getEInterfaceDefinitionBodyAccess().getOperationsEOperationsParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_operations_9_0=ruleEOperations();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getEInterfaceDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"operations",
            	    											lv_operations_9_0,
            	    											"org.sodalite.dsl.RM.EOperations");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_10=(Token)match(input,RULE_END,FOLLOW_40); 

            	    								newLeafNode(this_END_10, grammarAccess.getEInterfaceDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleEInterfaceDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getEInterfaceDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInterfaceDefinitionBody"


    // $ANTLR start "entryRuleEOperations"
    // InternalRMParser.g:3588:1: entryRuleEOperations returns [EObject current=null] : iv_ruleEOperations= ruleEOperations EOF ;
    public final EObject entryRuleEOperations() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperations = null;


        try {
            // InternalRMParser.g:3588:52: (iv_ruleEOperations= ruleEOperations EOF )
            // InternalRMParser.g:3589:2: iv_ruleEOperations= ruleEOperations EOF
            {
             newCompositeNode(grammarAccess.getEOperationsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperations=ruleEOperations();

            state._fsp--;

             current =iv_ruleEOperations; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOperations"


    // $ANTLR start "ruleEOperations"
    // InternalRMParser.g:3595:1: ruleEOperations returns [EObject current=null] : ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) ;
    public final EObject ruleEOperations() throws RecognitionException {
        EObject current = null;

        EObject lv_operations_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3601:2: ( ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* ) )
            // InternalRMParser.g:3602:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            {
            // InternalRMParser.g:3602:2: ( () ( (lv_operations_1_0= ruleEOperationDefinition ) )* )
            // InternalRMParser.g:3603:3: () ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            {
            // InternalRMParser.g:3603:3: ()
            // InternalRMParser.g:3604:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationsAccess().getEOperationsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3610:3: ( (lv_operations_1_0= ruleEOperationDefinition ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalRMParser.g:3611:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    {
            	    // InternalRMParser.g:3611:4: (lv_operations_1_0= ruleEOperationDefinition )
            	    // InternalRMParser.g:3612:5: lv_operations_1_0= ruleEOperationDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEOperationsAccess().getOperationsEOperationDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_operations_1_0=ruleEOperationDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEOperationsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"operations",
            	    						lv_operations_1_0,
            	    						"org.sodalite.dsl.RM.EOperationDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOperations"


    // $ANTLR start "entryRuleEOperationDefinition"
    // InternalRMParser.g:3633:1: entryRuleEOperationDefinition returns [EObject current=null] : iv_ruleEOperationDefinition= ruleEOperationDefinition EOF ;
    public final EObject entryRuleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinition = null;


        try {
            // InternalRMParser.g:3633:61: (iv_ruleEOperationDefinition= ruleEOperationDefinition EOF )
            // InternalRMParser.g:3634:2: iv_ruleEOperationDefinition= ruleEOperationDefinition EOF
            {
             newCompositeNode(grammarAccess.getEOperationDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperationDefinition=ruleEOperationDefinition();

            state._fsp--;

             current =iv_ruleEOperationDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOperationDefinition"


    // $ANTLR start "ruleEOperationDefinition"
    // InternalRMParser.g:3640:1: ruleEOperationDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEOperationDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_operation_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3646:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:3647:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:3647:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:3648:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_operation_3_0= ruleEOperationDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:3648:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:3649:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:3649:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:3650:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEOperationDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEOperationDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEOperationDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_41); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEOperationDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:3674:3: ( (lv_operation_3_0= ruleEOperationDefinitionBody ) )
            // InternalRMParser.g:3675:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            {
            // InternalRMParser.g:3675:4: (lv_operation_3_0= ruleEOperationDefinitionBody )
            // InternalRMParser.g:3676:5: lv_operation_3_0= ruleEOperationDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEOperationDefinitionAccess().getOperationEOperationDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_operation_3_0=ruleEOperationDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEOperationDefinitionRule());
            					}
            					set(
            						current,
            						"operation",
            						lv_operation_3_0,
            						"org.sodalite.dsl.RM.EOperationDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEOperationDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOperationDefinition"


    // $ANTLR start "entryRuleEOperationDefinitionBody"
    // InternalRMParser.g:3701:1: entryRuleEOperationDefinitionBody returns [EObject current=null] : iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF ;
    public final EObject entryRuleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEOperationDefinitionBody = null;


        try {
            // InternalRMParser.g:3701:65: (iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF )
            // InternalRMParser.g:3702:2: iv_ruleEOperationDefinitionBody= ruleEOperationDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEOperationDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEOperationDefinitionBody=ruleEOperationDefinitionBody();

            state._fsp--;

             current =iv_ruleEOperationDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEOperationDefinitionBody"


    // $ANTLR start "ruleEOperationDefinitionBody"
    // InternalRMParser.g:3708:1: ruleEOperationDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEOperationDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_description_3_0=null;
        Token otherlv_4=null;
        Token this_BEGIN_5=null;
        Token this_END_7=null;
        Token otherlv_8=null;
        Token this_BEGIN_9=null;
        Token this_END_11=null;
        EObject lv_inputs_6_0 = null;

        EObject lv_implementation_10_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3714:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:3715:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:3715:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:3716:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:3716:3: ()
            // InternalRMParser.g:3717:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEOperationDefinitionBodyAccess().getEOperationDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:3723:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) ) )
            // InternalRMParser.g:3724:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            {
            // InternalRMParser.g:3724:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* ) )
            // InternalRMParser.g:3725:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:3728:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )* )
            // InternalRMParser.g:3729:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            {
            // InternalRMParser.g:3729:6: ( ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) ) )*
            loop26:
            do {
                int alt26=4;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == Inputs && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt26=2;
                }
                else if ( LA26_0 == Implementation && getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt26=3;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalRMParser.g:3730:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:3730:4: ({...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:3731:5: {...}? => ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:3731:121: ( ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:3732:6: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:3735:9: ({...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:3735:10: {...}? => (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3735:19: (otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:3735:20: otherlv_2= Description ( (lv_description_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,Description,FOLLOW_12); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:3739:9: ( (lv_description_3_0= RULE_STRING ) )
            	    // InternalRMParser.g:3740:10: (lv_description_3_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:3740:10: (lv_description_3_0= RULE_STRING )
            	    // InternalRMParser.g:3741:11: lv_description_3_0= RULE_STRING
            	    {
            	    lv_description_3_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

            	    											newLeafNode(lv_description_3_0, grammarAccess.getEOperationDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"description",
            	    												lv_description_3_0,
            	    												"org.eclipse.xtext.common.Terminals.STRING");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:3763:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3763:4: ({...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) ) )
            	    // InternalRMParser.g:3764:5: {...}? => ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:3764:121: ( ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) ) )
            	    // InternalRMParser.g:3765:6: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:3768:9: ({...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END ) )
            	    // InternalRMParser.g:3768:10: {...}? => (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3768:19: (otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END )
            	    // InternalRMParser.g:3768:20: otherlv_4= Inputs this_BEGIN_5= RULE_BEGIN ( (lv_inputs_6_0= ruleEInputs ) ) this_END_7= RULE_END
            	    {
            	    otherlv_4=(Token)match(input,Inputs,FOLLOW_3); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEOperationDefinitionBodyAccess().getInputsKeyword_1_1_0());
            	    								
            	    this_BEGIN_5=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    									newLeafNode(this_BEGIN_5, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_1_1());
            	    								
            	    // InternalRMParser.g:3776:9: ( (lv_inputs_6_0= ruleEInputs ) )
            	    // InternalRMParser.g:3777:10: (lv_inputs_6_0= ruleEInputs )
            	    {
            	    // InternalRMParser.g:3777:10: (lv_inputs_6_0= ruleEInputs )
            	    // InternalRMParser.g:3778:11: lv_inputs_6_0= ruleEInputs
            	    {

            	    											newCompositeNode(grammarAccess.getEOperationDefinitionBodyAccess().getInputsEInputsParserRuleCall_1_1_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_inputs_6_0=ruleEInputs();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"inputs",
            	    												lv_inputs_6_0,
            	    												"org.sodalite.dsl.RM.EInputs");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_7=(Token)match(input,RULE_END,FOLLOW_42); 

            	    									newLeafNode(this_END_7, grammarAccess.getEOperationDefinitionBodyAccess().getENDTerminalRuleCall_1_1_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:3805:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:3805:4: ({...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) ) )
            	    // InternalRMParser.g:3806:5: {...}? => ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:3806:121: ( ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) ) )
            	    // InternalRMParser.g:3807:6: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:3810:9: ({...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END ) )
            	    // InternalRMParser.g:3810:10: {...}? => (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEOperationDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:3810:19: (otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END )
            	    // InternalRMParser.g:3810:20: otherlv_8= Implementation this_BEGIN_9= RULE_BEGIN ( (lv_implementation_10_0= ruleEImplementation ) ) this_END_11= RULE_END
            	    {
            	    otherlv_8=(Token)match(input,Implementation,FOLLOW_3); 

            	    									newLeafNode(otherlv_8, grammarAccess.getEOperationDefinitionBodyAccess().getImplementationKeyword_1_2_0());
            	    								
            	    this_BEGIN_9=(Token)match(input,RULE_BEGIN,FOLLOW_43); 

            	    									newLeafNode(this_BEGIN_9, grammarAccess.getEOperationDefinitionBodyAccess().getBEGINTerminalRuleCall_1_2_1());
            	    								
            	    // InternalRMParser.g:3818:9: ( (lv_implementation_10_0= ruleEImplementation ) )
            	    // InternalRMParser.g:3819:10: (lv_implementation_10_0= ruleEImplementation )
            	    {
            	    // InternalRMParser.g:3819:10: (lv_implementation_10_0= ruleEImplementation )
            	    // InternalRMParser.g:3820:11: lv_implementation_10_0= ruleEImplementation
            	    {

            	    											newCompositeNode(grammarAccess.getEOperationDefinitionBodyAccess().getImplementationEImplementationParserRuleCall_1_2_2_0());
            	    										
            	    pushFollow(FOLLOW_5);
            	    lv_implementation_10_0=ruleEImplementation();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEOperationDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"implementation",
            	    												lv_implementation_10_0,
            	    												"org.sodalite.dsl.RM.EImplementation");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    this_END_11=(Token)match(input,RULE_END,FOLLOW_42); 

            	    									newLeafNode(this_END_11, grammarAccess.getEOperationDefinitionBodyAccess().getENDTerminalRuleCall_1_2_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEOperationDefinitionBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEOperationDefinitionBody"


    // $ANTLR start "entryRuleEImplementation"
    // InternalRMParser.g:3858:1: entryRuleEImplementation returns [EObject current=null] : iv_ruleEImplementation= ruleEImplementation EOF ;
    public final EObject entryRuleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEImplementation = null;


        try {
            // InternalRMParser.g:3858:56: (iv_ruleEImplementation= ruleEImplementation EOF )
            // InternalRMParser.g:3859:2: iv_ruleEImplementation= ruleEImplementation EOF
            {
             newCompositeNode(grammarAccess.getEImplementationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEImplementation=ruleEImplementation();

            state._fsp--;

             current =iv_ruleEImplementation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEImplementation"


    // $ANTLR start "ruleEImplementation"
    // InternalRMParser.g:3865:1: ruleEImplementation returns [EObject current=null] : ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) ;
    public final EObject ruleEImplementation() throws RecognitionException {
        EObject current = null;

        EObject lv_primary_0_0 = null;

        EObject lv_dependencies_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:3871:2: ( ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? ) )
            // InternalRMParser.g:3872:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            {
            // InternalRMParser.g:3872:2: ( ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )? )
            // InternalRMParser.g:3873:3: ( (lv_primary_0_0= ruleEPrimary ) ) ( (lv_dependencies_1_0= ruleEDependencies ) )?
            {
            // InternalRMParser.g:3873:3: ( (lv_primary_0_0= ruleEPrimary ) )
            // InternalRMParser.g:3874:4: (lv_primary_0_0= ruleEPrimary )
            {
            // InternalRMParser.g:3874:4: (lv_primary_0_0= ruleEPrimary )
            // InternalRMParser.g:3875:5: lv_primary_0_0= ruleEPrimary
            {

            					newCompositeNode(grammarAccess.getEImplementationAccess().getPrimaryEPrimaryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_44);
            lv_primary_0_0=ruleEPrimary();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEImplementationRule());
            					}
            					set(
            						current,
            						"primary",
            						lv_primary_0_0,
            						"org.sodalite.dsl.RM.EPrimary");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRMParser.g:3892:3: ( (lv_dependencies_1_0= ruleEDependencies ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Dependencies) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRMParser.g:3893:4: (lv_dependencies_1_0= ruleEDependencies )
                    {
                    // InternalRMParser.g:3893:4: (lv_dependencies_1_0= ruleEDependencies )
                    // InternalRMParser.g:3894:5: lv_dependencies_1_0= ruleEDependencies
                    {

                    					newCompositeNode(grammarAccess.getEImplementationAccess().getDependenciesEDependenciesParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_dependencies_1_0=ruleEDependencies();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEImplementationRule());
                    					}
                    					set(
                    						current,
                    						"dependencies",
                    						lv_dependencies_1_0,
                    						"org.sodalite.dsl.RM.EDependencies");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEImplementation"


    // $ANTLR start "entryRuleEPrimary"
    // InternalRMParser.g:3915:1: entryRuleEPrimary returns [EObject current=null] : iv_ruleEPrimary= ruleEPrimary EOF ;
    public final EObject entryRuleEPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPrimary = null;


        try {
            // InternalRMParser.g:3915:49: (iv_ruleEPrimary= ruleEPrimary EOF )
            // InternalRMParser.g:3916:2: iv_ruleEPrimary= ruleEPrimary EOF
            {
             newCompositeNode(grammarAccess.getEPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPrimary=ruleEPrimary();

            state._fsp--;

             current =iv_ruleEPrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPrimary"


    // $ANTLR start "ruleEPrimary"
    // InternalRMParser.g:3922:1: ruleEPrimary returns [EObject current=null] : ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) ;
    public final EObject ruleEPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_file_1_0=null;
        Token this_BEGIN_2=null;
        Token otherlv_3=null;
        Token lv_relative_path_4_0=null;
        Token this_END_5=null;


        	enterRule();

        try {
            // InternalRMParser.g:3928:2: ( ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? ) )
            // InternalRMParser.g:3929:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            {
            // InternalRMParser.g:3929:2: ( (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )? )
            // InternalRMParser.g:3930:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) ) (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            {
            // InternalRMParser.g:3930:3: (otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:3931:4: otherlv_0= Primary ( (lv_file_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Primary,FOLLOW_12); 

            				newLeafNode(otherlv_0, grammarAccess.getEPrimaryAccess().getPrimaryKeyword_0_0());
            			
            // InternalRMParser.g:3935:4: ( (lv_file_1_0= RULE_STRING ) )
            // InternalRMParser.g:3936:5: (lv_file_1_0= RULE_STRING )
            {
            // InternalRMParser.g:3936:5: (lv_file_1_0= RULE_STRING )
            // InternalRMParser.g:3937:6: lv_file_1_0= RULE_STRING
            {
            lv_file_1_0=(Token)match(input,RULE_STRING,FOLLOW_45); 

            						newLeafNode(lv_file_1_0, grammarAccess.getEPrimaryAccess().getFileSTRINGTerminalRuleCall_0_1_0());
            					

            						if (current==null) {
            							current = createModelElement(grammarAccess.getEPrimaryRule());
            						}
            						setWithLastConsumed(
            							current,
            							"file",
            							lv_file_1_0,
            							"org.eclipse.xtext.common.Terminals.STRING");
            					

            }


            }


            }

            // InternalRMParser.g:3954:3: (this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_BEGIN) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRMParser.g:3955:4: this_BEGIN_2= RULE_BEGIN otherlv_3= Relative_path ( (lv_relative_path_4_0= RULE_STRING ) ) this_END_5= RULE_END
                    {
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getEPrimaryAccess().getBEGINTerminalRuleCall_1_0());
                    			
                    otherlv_3=(Token)match(input,Relative_path,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getEPrimaryAccess().getRelative_pathKeyword_1_1());
                    			
                    // InternalRMParser.g:3963:4: ( (lv_relative_path_4_0= RULE_STRING ) )
                    // InternalRMParser.g:3964:5: (lv_relative_path_4_0= RULE_STRING )
                    {
                    // InternalRMParser.g:3964:5: (lv_relative_path_4_0= RULE_STRING )
                    // InternalRMParser.g:3965:6: lv_relative_path_4_0= RULE_STRING
                    {
                    lv_relative_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_relative_path_4_0, grammarAccess.getEPrimaryAccess().getRelative_pathSTRINGTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"relative_path",
                    							lv_relative_path_4_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getEPrimaryAccess().getENDTerminalRuleCall_1_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPrimary"


    // $ANTLR start "entryRuleEDependencies"
    // InternalRMParser.g:3990:1: entryRuleEDependencies returns [EObject current=null] : iv_ruleEDependencies= ruleEDependencies EOF ;
    public final EObject entryRuleEDependencies() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencies = null;


        try {
            // InternalRMParser.g:3990:54: (iv_ruleEDependencies= ruleEDependencies EOF )
            // InternalRMParser.g:3991:2: iv_ruleEDependencies= ruleEDependencies EOF
            {
             newCompositeNode(grammarAccess.getEDependenciesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDependencies=ruleEDependencies();

            state._fsp--;

             current =iv_ruleEDependencies; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDependencies"


    // $ANTLR start "ruleEDependencies"
    // InternalRMParser.g:3997:1: ruleEDependencies returns [EObject current=null] : (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) ;
    public final EObject ruleEDependencies() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token this_BEGIN_4=null;
        Token otherlv_5=null;
        Token lv_relative_path_6_0=null;
        Token this_END_7=null;
        EObject lv_files_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4003:2: ( (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? ) )
            // InternalRMParser.g:4004:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            {
            // InternalRMParser.g:4004:2: (otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )? )
            // InternalRMParser.g:4005:3: otherlv_0= Dependencies otherlv_1= LeftSquareBracket ( (lv_files_2_0= ruleEDependencyFiles ) )? otherlv_3= RightSquareBracket (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            {
            otherlv_0=(Token)match(input,Dependencies,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getEDependenciesAccess().getDependenciesKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_47); 

            			newLeafNode(otherlv_1, grammarAccess.getEDependenciesAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:4013:3: ( (lv_files_2_0= ruleEDependencyFiles ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRMParser.g:4014:4: (lv_files_2_0= ruleEDependencyFiles )
                    {
                    // InternalRMParser.g:4014:4: (lv_files_2_0= ruleEDependencyFiles )
                    // InternalRMParser.g:4015:5: lv_files_2_0= ruleEDependencyFiles
                    {

                    					newCompositeNode(grammarAccess.getEDependenciesAccess().getFilesEDependencyFilesParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_files_2_0=ruleEDependencyFiles();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEDependenciesRule());
                    					}
                    					set(
                    						current,
                    						"files",
                    						lv_files_2_0,
                    						"org.sodalite.dsl.RM.EDependencyFiles");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_45); 

            			newLeafNode(otherlv_3, grammarAccess.getEDependenciesAccess().getRightSquareBracketKeyword_3());
            		
            // InternalRMParser.g:4036:3: (this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_BEGIN) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRMParser.g:4037:4: this_BEGIN_4= RULE_BEGIN otherlv_5= Relative_path ( (lv_relative_path_6_0= RULE_STRING ) ) this_END_7= RULE_END
                    {
                    this_BEGIN_4=(Token)match(input,RULE_BEGIN,FOLLOW_46); 

                    				newLeafNode(this_BEGIN_4, grammarAccess.getEDependenciesAccess().getBEGINTerminalRuleCall_4_0());
                    			
                    otherlv_5=(Token)match(input,Relative_path,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getEDependenciesAccess().getRelative_pathKeyword_4_1());
                    			
                    // InternalRMParser.g:4045:4: ( (lv_relative_path_6_0= RULE_STRING ) )
                    // InternalRMParser.g:4046:5: (lv_relative_path_6_0= RULE_STRING )
                    {
                    // InternalRMParser.g:4046:5: (lv_relative_path_6_0= RULE_STRING )
                    // InternalRMParser.g:4047:6: lv_relative_path_6_0= RULE_STRING
                    {
                    lv_relative_path_6_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

                    						newLeafNode(lv_relative_path_6_0, grammarAccess.getEDependenciesAccess().getRelative_pathSTRINGTerminalRuleCall_4_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEDependenciesRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"relative_path",
                    							lv_relative_path_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    this_END_7=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_7, grammarAccess.getEDependenciesAccess().getENDTerminalRuleCall_4_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDependencies"


    // $ANTLR start "entryRuleEDependencyFiles"
    // InternalRMParser.g:4072:1: entryRuleEDependencyFiles returns [EObject current=null] : iv_ruleEDependencyFiles= ruleEDependencyFiles EOF ;
    public final EObject entryRuleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEDependencyFiles = null;


        try {
            // InternalRMParser.g:4072:57: (iv_ruleEDependencyFiles= ruleEDependencyFiles EOF )
            // InternalRMParser.g:4073:2: iv_ruleEDependencyFiles= ruleEDependencyFiles EOF
            {
             newCompositeNode(grammarAccess.getEDependencyFilesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDependencyFiles=ruleEDependencyFiles();

            state._fsp--;

             current =iv_ruleEDependencyFiles; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDependencyFiles"


    // $ANTLR start "ruleEDependencyFiles"
    // InternalRMParser.g:4079:1: ruleEDependencyFiles returns [EObject current=null] : ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleEDependencyFiles() throws RecognitionException {
        EObject current = null;

        Token lv_files_0_0=null;
        Token otherlv_1=null;
        Token lv_files_2_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:4085:2: ( ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* ) )
            // InternalRMParser.g:4086:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            {
            // InternalRMParser.g:4086:2: ( ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )* )
            // InternalRMParser.g:4087:3: ( (lv_files_0_0= RULE_STRING ) ) (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            {
            // InternalRMParser.g:4087:3: ( (lv_files_0_0= RULE_STRING ) )
            // InternalRMParser.g:4088:4: (lv_files_0_0= RULE_STRING )
            {
            // InternalRMParser.g:4088:4: (lv_files_0_0= RULE_STRING )
            // InternalRMParser.g:4089:5: lv_files_0_0= RULE_STRING
            {
            lv_files_0_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            					newLeafNode(lv_files_0_0, grammarAccess.getEDependencyFilesAccess().getFilesSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEDependencyFilesRule());
            					}
            					addWithLastConsumed(
            						current,
            						"files",
            						lv_files_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRMParser.g:4105:3: (otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalRMParser.g:4106:4: otherlv_1= Comma ( (lv_files_2_0= RULE_STRING ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_12); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEDependencyFilesAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:4110:4: ( (lv_files_2_0= RULE_STRING ) )
            	    // InternalRMParser.g:4111:5: (lv_files_2_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:4111:5: (lv_files_2_0= RULE_STRING )
            	    // InternalRMParser.g:4112:6: lv_files_2_0= RULE_STRING
            	    {
            	    lv_files_2_0=(Token)match(input,RULE_STRING,FOLLOW_31); 

            	    						newLeafNode(lv_files_2_0, grammarAccess.getEDependencyFilesAccess().getFilesSTRINGTerminalRuleCall_1_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getEDependencyFilesRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"files",
            	    							lv_files_2_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDependencyFiles"


    // $ANTLR start "entryRuleEInputs"
    // InternalRMParser.g:4133:1: entryRuleEInputs returns [EObject current=null] : iv_ruleEInputs= ruleEInputs EOF ;
    public final EObject entryRuleEInputs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInputs = null;


        try {
            // InternalRMParser.g:4133:48: (iv_ruleEInputs= ruleEInputs EOF )
            // InternalRMParser.g:4134:2: iv_ruleEInputs= ruleEInputs EOF
            {
             newCompositeNode(grammarAccess.getEInputsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInputs=ruleEInputs();

            state._fsp--;

             current =iv_ruleEInputs; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInputs"


    // $ANTLR start "ruleEInputs"
    // InternalRMParser.g:4140:1: ruleEInputs returns [EObject current=null] : ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) ;
    public final EObject ruleEInputs() throws RecognitionException {
        EObject current = null;

        EObject lv_inputs_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4146:2: ( ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* ) )
            // InternalRMParser.g:4147:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            {
            // InternalRMParser.g:4147:2: ( () ( (lv_inputs_1_0= ruleEParameterDefinition ) )* )
            // InternalRMParser.g:4148:3: () ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            {
            // InternalRMParser.g:4148:3: ()
            // InternalRMParser.g:4149:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEInputsAccess().getEInputsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4155:3: ( (lv_inputs_1_0= ruleEParameterDefinition ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_ID) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalRMParser.g:4156:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    {
            	    // InternalRMParser.g:4156:4: (lv_inputs_1_0= ruleEParameterDefinition )
            	    // InternalRMParser.g:4157:5: lv_inputs_1_0= ruleEParameterDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getEInputsAccess().getInputsEParameterDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_inputs_1_0=ruleEParameterDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEInputsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"inputs",
            	    						lv_inputs_1_0,
            	    						"org.sodalite.dsl.RM.EParameterDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInputs"


    // $ANTLR start "entryRuleEParameterDefinition"
    // InternalRMParser.g:4178:1: entryRuleEParameterDefinition returns [EObject current=null] : iv_ruleEParameterDefinition= ruleEParameterDefinition EOF ;
    public final EObject entryRuleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinition = null;


        try {
            // InternalRMParser.g:4178:61: (iv_ruleEParameterDefinition= ruleEParameterDefinition EOF )
            // InternalRMParser.g:4179:2: iv_ruleEParameterDefinition= ruleEParameterDefinition EOF
            {
             newCompositeNode(grammarAccess.getEParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameterDefinition=ruleEParameterDefinition();

            state._fsp--;

             current =iv_ruleEParameterDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParameterDefinition"


    // $ANTLR start "ruleEParameterDefinition"
    // InternalRMParser.g:4185:1: ruleEParameterDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleEParameterDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_parameter_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4191:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:4192:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:4192:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:4193:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:4193:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:4194:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:4194:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:4195:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEParameterDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEParameterDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEParameterDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_48); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getEParameterDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:4219:3: ( (lv_parameter_3_0= ruleEParameterDefinitionBody ) )
            // InternalRMParser.g:4220:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            {
            // InternalRMParser.g:4220:4: (lv_parameter_3_0= ruleEParameterDefinitionBody )
            // InternalRMParser.g:4221:5: lv_parameter_3_0= ruleEParameterDefinitionBody
            {

            					newCompositeNode(grammarAccess.getEParameterDefinitionAccess().getParameterEParameterDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_parameter_3_0=ruleEParameterDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEParameterDefinitionRule());
            					}
            					set(
            						current,
            						"parameter",
            						lv_parameter_3_0,
            						"org.sodalite.dsl.RM.EParameterDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getEParameterDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEParameterDefinition"


    // $ANTLR start "entryRuleEParameterDefinitionBody"
    // InternalRMParser.g:4246:1: entryRuleEParameterDefinitionBody returns [EObject current=null] : iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF ;
    public final EObject entryRuleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEParameterDefinitionBody = null;


        try {
            // InternalRMParser.g:4246:65: (iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF )
            // InternalRMParser.g:4247:2: iv_ruleEParameterDefinitionBody= ruleEParameterDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getEParameterDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEParameterDefinitionBody=ruleEParameterDefinitionBody();

            state._fsp--;

             current =iv_ruleEParameterDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEParameterDefinitionBody"


    // $ANTLR start "ruleEParameterDefinitionBody"
    // InternalRMParser.g:4253:1: ruleEParameterDefinitionBody returns [EObject current=null] : ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleEParameterDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_5_0 = null;

        EObject lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4259:2: ( ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) ) )
            // InternalRMParser.g:4260:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalRMParser.g:4260:2: ( () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) ) )
            // InternalRMParser.g:4261:3: () ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            {
            // InternalRMParser.g:4261:3: ()
            // InternalRMParser.g:4262:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEParameterDefinitionBodyAccess().getEParameterDefinitionBodyAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4268:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) ) )
            // InternalRMParser.g:4269:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            {
            // InternalRMParser.g:4269:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* ) )
            // InternalRMParser.g:4270:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				
            // InternalRMParser.g:4273:5: ( ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )* )
            // InternalRMParser.g:4274:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            {
            // InternalRMParser.g:4274:6: ( ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) ) )*
            loop33:
            do {
                int alt33=4;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == Value && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
                    alt33=2;
                }
                else if ( LA33_0 == Default && getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
                    alt33=3;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalRMParser.g:4275:4: ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4275:4: ({...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) ) )
            	    // InternalRMParser.g:4276:5: {...}? => ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalRMParser.g:4276:121: ( ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) ) )
            	    // InternalRMParser.g:4277:6: ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalRMParser.g:4280:9: ({...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) ) )
            	    // InternalRMParser.g:4280:10: {...}? => (otherlv_2= Type ( ( ruleEDataTypeName ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4280:19: (otherlv_2= Type ( ( ruleEDataTypeName ) ) )
            	    // InternalRMParser.g:4280:20: otherlv_2= Type ( ( ruleEDataTypeName ) )
            	    {
            	    otherlv_2=(Token)match(input,Type,FOLLOW_4); 

            	    									newLeafNode(otherlv_2, grammarAccess.getEParameterDefinitionBodyAccess().getTypeKeyword_1_0_0());
            	    								
            	    // InternalRMParser.g:4284:9: ( ( ruleEDataTypeName ) )
            	    // InternalRMParser.g:4285:10: ( ruleEDataTypeName )
            	    {
            	    // InternalRMParser.g:4285:10: ( ruleEDataTypeName )
            	    // InternalRMParser.g:4286:11: ruleEDataTypeName
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    										

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getTypeEDataTypeCrossReference_1_0_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
            	    ruleEDataTypeName();

            	    state._fsp--;


            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:4306:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4306:4: ({...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4307:5: {...}? => ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalRMParser.g:4307:121: ( ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4308:6: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalRMParser.g:4311:9: ({...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4311:10: {...}? => (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4311:19: (otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4311:20: otherlv_4= Value ( (lv_value_5_0= ruleEValueExpression ) )
            	    {
            	    otherlv_4=(Token)match(input,Value,FOLLOW_36); 

            	    									newLeafNode(otherlv_4, grammarAccess.getEParameterDefinitionBodyAccess().getValueKeyword_1_1_0());
            	    								
            	    // InternalRMParser.g:4315:9: ( (lv_value_5_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4316:10: (lv_value_5_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4316:10: (lv_value_5_0= ruleEValueExpression )
            	    // InternalRMParser.g:4317:11: lv_value_5_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getValueEValueExpressionParserRuleCall_1_1_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
            	    lv_value_5_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"value",
            	    												lv_value_5_0,
            	    												"org.sodalite.dsl.RM.EValueExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:4340:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4340:4: ({...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) ) )
            	    // InternalRMParser.g:4341:5: {...}? => ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalRMParser.g:4341:121: ( ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) ) )
            	    // InternalRMParser.g:4342:6: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalRMParser.g:4345:9: ({...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) ) )
            	    // InternalRMParser.g:4345:10: {...}? => (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleEParameterDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4345:19: (otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) ) )
            	    // InternalRMParser.g:4345:20: otherlv_6= Default ( (lv_default_7_0= ruleEValueExpression ) )
            	    {
            	    otherlv_6=(Token)match(input,Default,FOLLOW_36); 

            	    									newLeafNode(otherlv_6, grammarAccess.getEParameterDefinitionBodyAccess().getDefaultKeyword_1_2_0());
            	    								
            	    // InternalRMParser.g:4349:9: ( (lv_default_7_0= ruleEValueExpression ) )
            	    // InternalRMParser.g:4350:10: (lv_default_7_0= ruleEValueExpression )
            	    {
            	    // InternalRMParser.g:4350:10: (lv_default_7_0= ruleEValueExpression )
            	    // InternalRMParser.g:4351:11: lv_default_7_0= ruleEValueExpression
            	    {

            	    											newCompositeNode(grammarAccess.getEParameterDefinitionBodyAccess().getDefaultEValueExpressionParserRuleCall_1_2_1_0());
            	    										
            	    pushFollow(FOLLOW_49);
            	    lv_default_7_0=ruleEValueExpression();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getEParameterDefinitionBodyRule());
            	    											}
            	    											set(
            	    												current,
            	    												"default",
            	    												lv_default_7_0,
            	    												"org.sodalite.dsl.RM.EValueExpression");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getEParameterDefinitionBodyAccess().getUnorderedGroup_1());
            				

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEParameterDefinitionBody"


    // $ANTLR start "entryRuleEValueExpression"
    // InternalRMParser.g:4385:1: entryRuleEValueExpression returns [EObject current=null] : iv_ruleEValueExpression= ruleEValueExpression EOF ;
    public final EObject entryRuleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValueExpression = null;


        try {
            // InternalRMParser.g:4385:57: (iv_ruleEValueExpression= ruleEValueExpression EOF )
            // InternalRMParser.g:4386:2: iv_ruleEValueExpression= ruleEValueExpression EOF
            {
             newCompositeNode(grammarAccess.getEValueExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValueExpression=ruleEValueExpression();

            state._fsp--;

             current =iv_ruleEValueExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValueExpression"


    // $ANTLR start "ruleEValueExpression"
    // InternalRMParser.g:4392:1: ruleEValueExpression returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_EFunction_1= ruleEFunction ) ;
    public final EObject ruleEValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_EFunction_1 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4398:2: ( (this_ESTRING_0= ruleESTRING | this_EFunction_1= ruleEFunction ) )
            // InternalRMParser.g:4399:2: (this_ESTRING_0= ruleESTRING | this_EFunction_1= ruleEFunction )
            {
            // InternalRMParser.g:4399:2: (this_ESTRING_0= ruleESTRING | this_EFunction_1= ruleEFunction )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==Get_attribute||LA34_0==Get_property||LA34_0==Get_input) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalRMParser.g:4400:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:4409:3: this_EFunction_1= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEValueExpressionAccess().getEFunctionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_1=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEValueExpression"


    // $ANTLR start "entryRuleEFunction"
    // InternalRMParser.g:4421:1: entryRuleEFunction returns [EObject current=null] : iv_ruleEFunction= ruleEFunction EOF ;
    public final EObject entryRuleEFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFunction = null;


        try {
            // InternalRMParser.g:4421:50: (iv_ruleEFunction= ruleEFunction EOF )
            // InternalRMParser.g:4422:2: iv_ruleEFunction= ruleEFunction EOF
            {
             newCompositeNode(grammarAccess.getEFunctionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEFunction=ruleEFunction();

            state._fsp--;

             current =iv_ruleEFunction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFunction"


    // $ANTLR start "ruleEFunction"
    // InternalRMParser.g:4428:1: ruleEFunction returns [EObject current=null] : (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) ;
    public final EObject ruleEFunction() throws RecognitionException {
        EObject current = null;

        EObject this_GetProperty_0 = null;

        EObject this_GetAttribute_1 = null;

        EObject this_GetInput_2 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4434:2: ( (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput ) )
            // InternalRMParser.g:4435:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            {
            // InternalRMParser.g:4435:2: (this_GetProperty_0= ruleGetProperty | this_GetAttribute_1= ruleGetAttribute | this_GetInput_2= ruleGetInput )
            int alt35=3;
            switch ( input.LA(1) ) {
            case Get_property:
                {
                alt35=1;
                }
                break;
            case Get_attribute:
                {
                alt35=2;
                }
                break;
            case Get_input:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalRMParser.g:4436:3: this_GetProperty_0= ruleGetProperty
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetPropertyParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetProperty_0=ruleGetProperty();

                    state._fsp--;


                    			current = this_GetProperty_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:4445:3: this_GetAttribute_1= ruleGetAttribute
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetAttributeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetAttribute_1=ruleGetAttribute();

                    state._fsp--;


                    			current = this_GetAttribute_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:4454:3: this_GetInput_2= ruleGetInput
                    {

                    			newCompositeNode(grammarAccess.getEFunctionAccess().getGetInputParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_GetInput_2=ruleGetInput();

                    state._fsp--;


                    			current = this_GetInput_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFunction"


    // $ANTLR start "entryRuleGetInput"
    // InternalRMParser.g:4466:1: entryRuleGetInput returns [EObject current=null] : iv_ruleGetInput= ruleGetInput EOF ;
    public final EObject entryRuleGetInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetInput = null;


        try {
            // InternalRMParser.g:4466:49: (iv_ruleGetInput= ruleGetInput EOF )
            // InternalRMParser.g:4467:2: iv_ruleGetInput= ruleGetInput EOF
            {
             newCompositeNode(grammarAccess.getGetInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetInput=ruleGetInput();

            state._fsp--;

             current =iv_ruleGetInput; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetInput"


    // $ANTLR start "ruleGetInput"
    // InternalRMParser.g:4473:1: ruleGetInput returns [EObject current=null] : (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleGetInput() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRMParser.g:4479:2: ( (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) ) )
            // InternalRMParser.g:4480:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalRMParser.g:4480:2: (otherlv_0= Get_input ( (otherlv_1= RULE_ID ) ) )
            // InternalRMParser.g:4481:3: otherlv_0= Get_input ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Get_input,FOLLOW_50); 

            			newLeafNode(otherlv_0, grammarAccess.getGetInputAccess().getGet_inputKeyword_0());
            		
            // InternalRMParser.g:4485:3: ( (otherlv_1= RULE_ID ) )
            // InternalRMParser.g:4486:4: (otherlv_1= RULE_ID )
            {
            // InternalRMParser.g:4486:4: (otherlv_1= RULE_ID )
            // InternalRMParser.g:4487:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGetInputRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getGetInputAccess().getInputEParameterDefinitionCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetInput"


    // $ANTLR start "entryRuleGetAttribute"
    // InternalRMParser.g:4502:1: entryRuleGetAttribute returns [EObject current=null] : iv_ruleGetAttribute= ruleGetAttribute EOF ;
    public final EObject entryRuleGetAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttribute = null;


        try {
            // InternalRMParser.g:4502:53: (iv_ruleGetAttribute= ruleGetAttribute EOF )
            // InternalRMParser.g:4503:2: iv_ruleGetAttribute= ruleGetAttribute EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttribute=ruleGetAttribute();

            state._fsp--;

             current =iv_ruleGetAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttribute"


    // $ANTLR start "ruleGetAttribute"
    // InternalRMParser.g:4509:1: ruleGetAttribute returns [EObject current=null] : (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_attribute_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4515:2: ( (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4516:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4516:2: (otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4517:3: otherlv_0= Get_attribute this_BEGIN_1= RULE_BEGIN ( (lv_attribute_2_0= ruleGetAttributeBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_attribute,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetAttributeAccess().getGet_attributeKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetAttributeAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4525:3: ( (lv_attribute_2_0= ruleGetAttributeBody ) )
            // InternalRMParser.g:4526:4: (lv_attribute_2_0= ruleGetAttributeBody )
            {
            // InternalRMParser.g:4526:4: (lv_attribute_2_0= ruleGetAttributeBody )
            // InternalRMParser.g:4527:5: lv_attribute_2_0= ruleGetAttributeBody
            {

            					newCompositeNode(grammarAccess.getGetAttributeAccess().getAttributeGetAttributeBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_attribute_2_0=ruleGetAttributeBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetAttributeRule());
            					}
            					set(
            						current,
            						"attribute",
            						lv_attribute_2_0,
            						"org.sodalite.dsl.RM.GetAttributeBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getGetAttributeAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttribute"


    // $ANTLR start "entryRuleGetAttributeBody"
    // InternalRMParser.g:4552:1: entryRuleGetAttributeBody returns [EObject current=null] : iv_ruleGetAttributeBody= ruleGetAttributeBody EOF ;
    public final EObject entryRuleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetAttributeBody = null;


        try {
            // InternalRMParser.g:4552:57: (iv_ruleGetAttributeBody= ruleGetAttributeBody EOF )
            // InternalRMParser.g:4553:2: iv_ruleGetAttributeBody= ruleGetAttributeBody EOF
            {
             newCompositeNode(grammarAccess.getGetAttributeBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetAttributeBody=ruleGetAttributeBody();

            state._fsp--;

             current =iv_ruleGetAttributeBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetAttributeBody"


    // $ANTLR start "ruleGetAttributeBody"
    // InternalRMParser.g:4559:1: ruleGetAttributeBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetAttributeBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRMParser.g:4565:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4566:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4566:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4567:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4567:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4568:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4571:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4572:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4572:5: ( ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt36=0;
            loop36:
            do {
                int alt36=4;
                int LA36_0 = input.LA(1);

                if ( LA36_0 == Attribute && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
                    alt36=1;
                }
                else if ( LA36_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
                    alt36=2;
                }
                else if ( LA36_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
                    alt36=3;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalRMParser.g:4573:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4573:3: ({...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4574:4: {...}? => ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4574:110: ( ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4575:5: ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4578:8: ({...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4578:9: {...}? => (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4578:18: (otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4578:19: otherlv_1= Attribute ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Attribute,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetAttributeBodyAccess().getAttributeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4582:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4583:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4583:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4584:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_52); 

            	    										newLeafNode(otherlv_2, grammarAccess.getGetAttributeBodyAccess().getAttributeEAttributeDefinitionCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:4601:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4601:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRMParser.g:4602:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4602:110: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRMParser.g:4603:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4606:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRMParser.g:4606:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4606:18: (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRMParser.g:4606:19: otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_53); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetAttributeBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4610:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRMParser.g:4611:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRMParser.g:4611:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRMParser.g:4612:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_52); 

            	    										newLeafNode(lv_entity_4_0, grammarAccess.getGetAttributeBodyAccess().getEntityENTITYTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.RM.ENTITY");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:4634:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4634:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4635:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4635:110: ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4636:5: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4639:8: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4639:9: {...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetAttributeBody", "true");
            	    }
            	    // InternalRMParser.g:4639:18: (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4639:19: otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetAttributeBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:4643:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4644:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4644:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4645:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetAttributeBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_52); 

            	    										newLeafNode(otherlv_6, grammarAccess.getGetAttributeBodyAccess().getReq_capEReqOrCapCrossReference_2_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt36 >= 1 ) break loop36;
                        EarlyExitException eee =
                            new EarlyExitException(36, input);
                        throw eee;
                }
                cnt36++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGetAttributeBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGetAttributeBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetAttributeBody"


    // $ANTLR start "entryRuleGetProperty"
    // InternalRMParser.g:4673:1: entryRuleGetProperty returns [EObject current=null] : iv_ruleGetProperty= ruleGetProperty EOF ;
    public final EObject entryRuleGetProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetProperty = null;


        try {
            // InternalRMParser.g:4673:52: (iv_ruleGetProperty= ruleGetProperty EOF )
            // InternalRMParser.g:4674:2: iv_ruleGetProperty= ruleGetProperty EOF
            {
             newCompositeNode(grammarAccess.getGetPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetProperty=ruleGetProperty();

            state._fsp--;

             current =iv_ruleGetProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetProperty"


    // $ANTLR start "ruleGetProperty"
    // InternalRMParser.g:4680:1: ruleGetProperty returns [EObject current=null] : (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) ;
    public final EObject ruleGetProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_BEGIN_1=null;
        Token this_END_3=null;
        EObject lv_property_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4686:2: ( (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END ) )
            // InternalRMParser.g:4687:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            {
            // InternalRMParser.g:4687:2: (otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END )
            // InternalRMParser.g:4688:3: otherlv_0= Get_property this_BEGIN_1= RULE_BEGIN ( (lv_property_2_0= ruleGetPropertyBody ) ) this_END_3= RULE_END
            {
            otherlv_0=(Token)match(input,Get_property,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGetPropertyAccess().getGet_propertyKeyword_0());
            		
            this_BEGIN_1=(Token)match(input,RULE_BEGIN,FOLLOW_54); 

            			newLeafNode(this_BEGIN_1, grammarAccess.getGetPropertyAccess().getBEGINTerminalRuleCall_1());
            		
            // InternalRMParser.g:4696:3: ( (lv_property_2_0= ruleGetPropertyBody ) )
            // InternalRMParser.g:4697:4: (lv_property_2_0= ruleGetPropertyBody )
            {
            // InternalRMParser.g:4697:4: (lv_property_2_0= ruleGetPropertyBody )
            // InternalRMParser.g:4698:5: lv_property_2_0= ruleGetPropertyBody
            {

            					newCompositeNode(grammarAccess.getGetPropertyAccess().getPropertyGetPropertyBodyParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_property_2_0=ruleGetPropertyBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGetPropertyRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_2_0,
            						"org.sodalite.dsl.RM.GetPropertyBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_3=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_3, grammarAccess.getGetPropertyAccess().getENDTerminalRuleCall_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetProperty"


    // $ANTLR start "entryRuleGetPropertyBody"
    // InternalRMParser.g:4723:1: entryRuleGetPropertyBody returns [EObject current=null] : iv_ruleGetPropertyBody= ruleGetPropertyBody EOF ;
    public final EObject entryRuleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetPropertyBody = null;


        try {
            // InternalRMParser.g:4723:56: (iv_ruleGetPropertyBody= ruleGetPropertyBody EOF )
            // InternalRMParser.g:4724:2: iv_ruleGetPropertyBody= ruleGetPropertyBody EOF
            {
             newCompositeNode(grammarAccess.getGetPropertyBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGetPropertyBody=ruleGetPropertyBody();

            state._fsp--;

             current =iv_ruleGetPropertyBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGetPropertyBody"


    // $ANTLR start "ruleGetPropertyBody"
    // InternalRMParser.g:4730:1: ruleGetPropertyBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleGetPropertyBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_entity_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalRMParser.g:4736:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4737:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4737:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4738:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4738:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4739:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4742:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4743:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4743:5: ( ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) )+
            int cnt37=0;
            loop37:
            do {
                int alt37=4;
                int LA37_0 = input.LA(1);

                if ( LA37_0 == Property && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
                    alt37=1;
                }
                else if ( LA37_0 == Entity && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
                    alt37=2;
                }
                else if ( LA37_0 == Req_cap && getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
                    alt37=3;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalRMParser.g:4744:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4744:3: ({...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4745:4: {...}? => ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4745:109: ( ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4746:5: ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4749:8: ({...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4749:9: {...}? => (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4749:18: (otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4749:19: otherlv_1= Property ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Property,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getGetPropertyBodyAccess().getPropertyKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4753:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4754:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4754:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4755:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_55); 

            	    										newLeafNode(otherlv_2, grammarAccess.getGetPropertyBodyAccess().getPropertyEPropertyDefinitionCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:4772:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4772:3: ({...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) ) )
            	    // InternalRMParser.g:4773:4: {...}? => ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:4773:109: ( ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) ) )
            	    // InternalRMParser.g:4774:5: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:4777:8: ({...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) ) )
            	    // InternalRMParser.g:4777:9: {...}? => (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4777:18: (otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) ) )
            	    // InternalRMParser.g:4777:19: otherlv_3= Entity ( (lv_entity_4_0= RULE_ENTITY ) )
            	    {
            	    otherlv_3=(Token)match(input,Entity,FOLLOW_53); 

            	    								newLeafNode(otherlv_3, grammarAccess.getGetPropertyBodyAccess().getEntityKeyword_1_0());
            	    							
            	    // InternalRMParser.g:4781:8: ( (lv_entity_4_0= RULE_ENTITY ) )
            	    // InternalRMParser.g:4782:9: (lv_entity_4_0= RULE_ENTITY )
            	    {
            	    // InternalRMParser.g:4782:9: (lv_entity_4_0= RULE_ENTITY )
            	    // InternalRMParser.g:4783:10: lv_entity_4_0= RULE_ENTITY
            	    {
            	    lv_entity_4_0=(Token)match(input,RULE_ENTITY,FOLLOW_55); 

            	    										newLeafNode(lv_entity_4_0, grammarAccess.getGetPropertyBodyAccess().getEntityENTITYTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"entity",
            	    											lv_entity_4_0,
            	    											"org.sodalite.dsl.RM.ENTITY");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:4805:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4805:3: ({...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4806:4: {...}? => ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:4806:109: ( ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4807:5: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:4810:8: ({...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4810:9: {...}? => (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGetPropertyBody", "true");
            	    }
            	    // InternalRMParser.g:4810:18: (otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4810:19: otherlv_5= Req_cap ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Req_cap,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getGetPropertyBodyAccess().getReq_capKeyword_2_0());
            	    							
            	    // InternalRMParser.g:4814:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4815:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4815:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4816:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getGetPropertyBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_55); 

            	    										newLeafNode(otherlv_6, grammarAccess.getGetPropertyBodyAccess().getReq_capEReqOrCapCrossReference_2_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt37 >= 1 ) break loop37;
                        EarlyExitException eee =
                            new EarlyExitException(37, input);
                        throw eee;
                }
                cnt37++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleGetPropertyBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getGetPropertyBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGetPropertyBody"


    // $ANTLR start "entryRuleECapabilities"
    // InternalRMParser.g:4844:1: entryRuleECapabilities returns [EObject current=null] : iv_ruleECapabilities= ruleECapabilities EOF ;
    public final EObject entryRuleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilities = null;


        try {
            // InternalRMParser.g:4844:54: (iv_ruleECapabilities= ruleECapabilities EOF )
            // InternalRMParser.g:4845:2: iv_ruleECapabilities= ruleECapabilities EOF
            {
             newCompositeNode(grammarAccess.getECapabilitiesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilities=ruleECapabilities();

            state._fsp--;

             current =iv_ruleECapabilities; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilities"


    // $ANTLR start "ruleECapabilities"
    // InternalRMParser.g:4851:1: ruleECapabilities returns [EObject current=null] : ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) ;
    public final EObject ruleECapabilities() throws RecognitionException {
        EObject current = null;

        EObject lv_capabilities_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4857:2: ( ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* ) )
            // InternalRMParser.g:4858:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            {
            // InternalRMParser.g:4858:2: ( () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )* )
            // InternalRMParser.g:4859:3: () ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            {
            // InternalRMParser.g:4859:3: ()
            // InternalRMParser.g:4860:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getECapabilitiesAccess().getECapabilitiesAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:4866:3: ( (lv_capabilities_1_0= ruleECapabilityDefinition ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==RULE_ID) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalRMParser.g:4867:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    {
            	    // InternalRMParser.g:4867:4: (lv_capabilities_1_0= ruleECapabilityDefinition )
            	    // InternalRMParser.g:4868:5: lv_capabilities_1_0= ruleECapabilityDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getECapabilitiesAccess().getCapabilitiesECapabilityDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_capabilities_1_0=ruleECapabilityDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getECapabilitiesRule());
            	    					}
            	    					add(
            	    						current,
            	    						"capabilities",
            	    						lv_capabilities_1_0,
            	    						"org.sodalite.dsl.RM.ECapabilityDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilities"


    // $ANTLR start "entryRuleECapabilityDefinition"
    // InternalRMParser.g:4889:1: entryRuleECapabilityDefinition returns [EObject current=null] : iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF ;
    public final EObject entryRuleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinition = null;


        try {
            // InternalRMParser.g:4889:62: (iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF )
            // InternalRMParser.g:4890:2: iv_ruleECapabilityDefinition= ruleECapabilityDefinition EOF
            {
             newCompositeNode(grammarAccess.getECapabilityDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityDefinition=ruleECapabilityDefinition();

            state._fsp--;

             current =iv_ruleECapabilityDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityDefinition"


    // $ANTLR start "ruleECapabilityDefinition"
    // InternalRMParser.g:4896:1: ruleECapabilityDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleECapabilityDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_capability_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4902:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:4903:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:4903:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:4904:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:4904:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:4905:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:4905:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:4906:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getECapabilityDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getECapabilityDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_56); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getECapabilityDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:4930:3: ( (lv_capability_3_0= ruleECapabilityDefinitionBody ) )
            // InternalRMParser.g:4931:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            {
            // InternalRMParser.g:4931:4: (lv_capability_3_0= ruleECapabilityDefinitionBody )
            // InternalRMParser.g:4932:5: lv_capability_3_0= ruleECapabilityDefinitionBody
            {

            					newCompositeNode(grammarAccess.getECapabilityDefinitionAccess().getCapabilityECapabilityDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_capability_3_0=ruleECapabilityDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getECapabilityDefinitionRule());
            					}
            					set(
            						current,
            						"capability",
            						lv_capability_3_0,
            						"org.sodalite.dsl.RM.ECapabilityDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getECapabilityDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityDefinition"


    // $ANTLR start "entryRuleECapabilityDefinitionBody"
    // InternalRMParser.g:4957:1: entryRuleECapabilityDefinitionBody returns [EObject current=null] : iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF ;
    public final EObject entryRuleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleECapabilityDefinitionBody = null;


        try {
            // InternalRMParser.g:4957:66: (iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF )
            // InternalRMParser.g:4958:2: iv_ruleECapabilityDefinitionBody= ruleECapabilityDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getECapabilityDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleECapabilityDefinitionBody=ruleECapabilityDefinitionBody();

            state._fsp--;

             current =iv_ruleECapabilityDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleECapabilityDefinitionBody"


    // $ANTLR start "ruleECapabilityDefinitionBody"
    // InternalRMParser.g:4964:1: ruleECapabilityDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleECapabilityDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_description_4_0=null;
        Token otherlv_5=null;
        Token this_BEGIN_6=null;
        Token this_END_8=null;
        Token otherlv_9=null;
        Token this_BEGIN_10=null;
        Token this_END_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_occurrences_start_19_0=null;
        Token otherlv_20=null;
        Token lv_occurrences_end_21_0=null;
        Token otherlv_22=null;
        EObject lv_properties_7_0 = null;

        EObject lv_attributes_11_0 = null;

        EObject lv_valid_source_types_15_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:4970:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:4971:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:4971:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:4972:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:4972:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:4973:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:4976:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:4977:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:4977:5: ( ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) ) )+
            int cnt40=0;
            loop40:
            do {
                int alt40=7;
                int LA40_0 = input.LA(1);

                if ( LA40_0 == Type && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt40=1;
                }
                else if ( LA40_0 == Description && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt40=2;
                }
                else if ( LA40_0 == Properties && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt40=3;
                }
                else if ( LA40_0 == Attributes && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt40=4;
                }
                else if ( LA40_0 == Valid_source_types && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
                    alt40=5;
                }
                else if ( LA40_0 == Occurrences && getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
                    alt40=6;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalRMParser.g:4978:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:4978:3: ({...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:4979:4: {...}? => ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:4979:119: ( ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:4980:5: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:4983:8: ({...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:4983:9: {...}? => (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:4983:18: (otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:4983:19: otherlv_1= Type ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Type,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeKeyword_0_0());
            	    							
            	    // InternalRMParser.g:4987:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:4988:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:4988:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:4989:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_57); 

            	    										newLeafNode(otherlv_2, grammarAccess.getECapabilityDefinitionBodyAccess().getTypeECapabilityTypeCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:5006:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5006:3: ({...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) ) )
            	    // InternalRMParser.g:5007:4: {...}? => ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5007:119: ( ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) ) )
            	    // InternalRMParser.g:5008:5: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5011:8: ({...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) ) )
            	    // InternalRMParser.g:5011:9: {...}? => (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5011:18: (otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) ) )
            	    // InternalRMParser.g:5011:19: otherlv_3= Description ( (lv_description_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,Description,FOLLOW_12); 

            	    								newLeafNode(otherlv_3, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5015:8: ( (lv_description_4_0= RULE_STRING ) )
            	    // InternalRMParser.g:5016:9: (lv_description_4_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5016:9: (lv_description_4_0= RULE_STRING )
            	    // InternalRMParser.g:5017:10: lv_description_4_0= RULE_STRING
            	    {
            	    lv_description_4_0=(Token)match(input,RULE_STRING,FOLLOW_57); 

            	    										newLeafNode(lv_description_4_0, grammarAccess.getECapabilityDefinitionBodyAccess().getDescriptionSTRINGTerminalRuleCall_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"description",
            	    											lv_description_4_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:5039:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5039:3: ({...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) ) )
            	    // InternalRMParser.g:5040:4: {...}? => ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5040:119: ( ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) ) )
            	    // InternalRMParser.g:5041:5: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5044:8: ({...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END ) )
            	    // InternalRMParser.g:5044:9: {...}? => (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5044:18: (otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END )
            	    // InternalRMParser.g:5044:19: otherlv_5= Properties this_BEGIN_6= RULE_BEGIN ( (lv_properties_7_0= ruleEProperties ) ) this_END_8= RULE_END
            	    {
            	    otherlv_5=(Token)match(input,Properties,FOLLOW_3); 

            	    								newLeafNode(otherlv_5, grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesKeyword_2_0());
            	    							
            	    this_BEGIN_6=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_6, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_2_1());
            	    							
            	    // InternalRMParser.g:5052:8: ( (lv_properties_7_0= ruleEProperties ) )
            	    // InternalRMParser.g:5053:9: (lv_properties_7_0= ruleEProperties )
            	    {
            	    // InternalRMParser.g:5053:9: (lv_properties_7_0= ruleEProperties )
            	    // InternalRMParser.g:5054:10: lv_properties_7_0= ruleEProperties
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getPropertiesEPropertiesParserRuleCall_2_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_properties_7_0=ruleEProperties();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"properties",
            	    											lv_properties_7_0,
            	    											"org.sodalite.dsl.RM.EProperties");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_8=(Token)match(input,RULE_END,FOLLOW_57); 

            	    								newLeafNode(this_END_8, grammarAccess.getECapabilityDefinitionBodyAccess().getENDTerminalRuleCall_2_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:5081:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    {
            	    // InternalRMParser.g:5081:3: ({...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) ) )
            	    // InternalRMParser.g:5082:4: {...}? => ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5082:119: ( ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) ) )
            	    // InternalRMParser.g:5083:5: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5086:8: ({...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END ) )
            	    // InternalRMParser.g:5086:9: {...}? => (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5086:18: (otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END )
            	    // InternalRMParser.g:5086:19: otherlv_9= Attributes this_BEGIN_10= RULE_BEGIN ( (lv_attributes_11_0= ruleEAttributes ) ) this_END_12= RULE_END
            	    {
            	    otherlv_9=(Token)match(input,Attributes,FOLLOW_3); 

            	    								newLeafNode(otherlv_9, grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesKeyword_3_0());
            	    							
            	    this_BEGIN_10=(Token)match(input,RULE_BEGIN,FOLLOW_14); 

            	    								newLeafNode(this_BEGIN_10, grammarAccess.getECapabilityDefinitionBodyAccess().getBEGINTerminalRuleCall_3_1());
            	    							
            	    // InternalRMParser.g:5094:8: ( (lv_attributes_11_0= ruleEAttributes ) )
            	    // InternalRMParser.g:5095:9: (lv_attributes_11_0= ruleEAttributes )
            	    {
            	    // InternalRMParser.g:5095:9: (lv_attributes_11_0= ruleEAttributes )
            	    // InternalRMParser.g:5096:10: lv_attributes_11_0= ruleEAttributes
            	    {

            	    										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getAttributesEAttributesParserRuleCall_3_2_0());
            	    									
            	    pushFollow(FOLLOW_5);
            	    lv_attributes_11_0=ruleEAttributes();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										set(
            	    											current,
            	    											"attributes",
            	    											lv_attributes_11_0,
            	    											"org.sodalite.dsl.RM.EAttributes");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }

            	    this_END_12=(Token)match(input,RULE_END,FOLLOW_57); 

            	    								newLeafNode(this_END_12, grammarAccess.getECapabilityDefinitionBodyAccess().getENDTerminalRuleCall_3_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalRMParser.g:5123:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5123:3: ({...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5124:4: {...}? => ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4)");
            	    }
            	    // InternalRMParser.g:5124:119: ( ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5125:5: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 4);
            	    				
            	    // InternalRMParser.g:5128:8: ({...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket ) )
            	    // InternalRMParser.g:5128:9: {...}? => (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5128:18: (otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket )
            	    // InternalRMParser.g:5128:19: otherlv_13= Valid_source_types otherlv_14= LeftSquareBracket ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )? otherlv_16= RightSquareBracket
            	    {
            	    otherlv_13=(Token)match(input,Valid_source_types,FOLLOW_29); 

            	    								newLeafNode(otherlv_13, grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesKeyword_4_0());
            	    							
            	    otherlv_14=(Token)match(input,LeftSquareBracket,FOLLOW_58); 

            	    								newLeafNode(otherlv_14, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_4_1());
            	    							
            	    // InternalRMParser.g:5136:8: ( (lv_valid_source_types_15_0= ruleEValidSourceType ) )?
            	    int alt39=2;
            	    int LA39_0 = input.LA(1);

            	    if ( (LA39_0==RULE_QUALIFIED_NAME) ) {
            	        alt39=1;
            	    }
            	    switch (alt39) {
            	        case 1 :
            	            // InternalRMParser.g:5137:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            {
            	            // InternalRMParser.g:5137:9: (lv_valid_source_types_15_0= ruleEValidSourceType )
            	            // InternalRMParser.g:5138:10: lv_valid_source_types_15_0= ruleEValidSourceType
            	            {

            	            										newCompositeNode(grammarAccess.getECapabilityDefinitionBodyAccess().getValid_source_typesEValidSourceTypeParserRuleCall_4_2_0());
            	            									
            	            pushFollow(FOLLOW_30);
            	            lv_valid_source_types_15_0=ruleEValidSourceType();

            	            state._fsp--;


            	            										if (current==null) {
            	            											current = createModelElementForParent(grammarAccess.getECapabilityDefinitionBodyRule());
            	            										}
            	            										add(
            	            											current,
            	            											"valid_source_types",
            	            											lv_valid_source_types_15_0,
            	            											"org.sodalite.dsl.RM.EValidSourceType");
            	            										afterParserOrEnumRuleCall();
            	            									

            	            }


            	            }
            	            break;

            	    }

            	    otherlv_16=(Token)match(input,RightSquareBracket,FOLLOW_57); 

            	    								newLeafNode(otherlv_16, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_4_3());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalRMParser.g:5165:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5165:3: ({...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5166:4: {...}? => ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5)");
            	    }
            	    // InternalRMParser.g:5166:119: ( ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5167:5: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup(), 5);
            	    				
            	    // InternalRMParser.g:5170:8: ({...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket ) )
            	    // InternalRMParser.g:5170:9: {...}? => (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5170:18: (otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket )
            	    // InternalRMParser.g:5170:19: otherlv_17= Occurrences otherlv_18= LeftSquareBracket ( (lv_occurrences_start_19_0= RULE_STRING ) ) otherlv_20= Comma ( (lv_occurrences_end_21_0= RULE_STRING ) ) otherlv_22= RightSquareBracket
            	    {
            	    otherlv_17=(Token)match(input,Occurrences,FOLLOW_29); 

            	    								newLeafNode(otherlv_17, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrencesKeyword_5_0());
            	    							
            	    otherlv_18=(Token)match(input,LeftSquareBracket,FOLLOW_12); 

            	    								newLeafNode(otherlv_18, grammarAccess.getECapabilityDefinitionBodyAccess().getLeftSquareBracketKeyword_5_1());
            	    							
            	    // InternalRMParser.g:5178:8: ( (lv_occurrences_start_19_0= RULE_STRING ) )
            	    // InternalRMParser.g:5179:9: (lv_occurrences_start_19_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5179:9: (lv_occurrences_start_19_0= RULE_STRING )
            	    // InternalRMParser.g:5180:10: lv_occurrences_start_19_0= RULE_STRING
            	    {
            	    lv_occurrences_start_19_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            	    										newLeafNode(lv_occurrences_start_19_0, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrences_startSTRINGTerminalRuleCall_5_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"occurrences_start",
            	    											lv_occurrences_start_19_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_20=(Token)match(input,Comma,FOLLOW_12); 

            	    								newLeafNode(otherlv_20, grammarAccess.getECapabilityDefinitionBodyAccess().getCommaKeyword_5_3());
            	    							
            	    // InternalRMParser.g:5200:8: ( (lv_occurrences_end_21_0= RULE_STRING ) )
            	    // InternalRMParser.g:5201:9: (lv_occurrences_end_21_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5201:9: (lv_occurrences_end_21_0= RULE_STRING )
            	    // InternalRMParser.g:5202:10: lv_occurrences_end_21_0= RULE_STRING
            	    {
            	    lv_occurrences_end_21_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    										newLeafNode(lv_occurrences_end_21_0, grammarAccess.getECapabilityDefinitionBodyAccess().getOccurrences_endSTRINGTerminalRuleCall_5_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getECapabilityDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"occurrences_end",
            	    											lv_occurrences_end_21_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_22=(Token)match(input,RightSquareBracket,FOLLOW_57); 

            	    								newLeafNode(otherlv_22, grammarAccess.getECapabilityDefinitionBodyAccess().getRightSquareBracketKeyword_5_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt40 >= 1 ) break loop40;
                        EarlyExitException eee =
                            new EarlyExitException(40, input);
                        throw eee;
                }
                cnt40++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleECapabilityDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getECapabilityDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleECapabilityDefinitionBody"


    // $ANTLR start "entryRuleEValidSourceType"
    // InternalRMParser.g:5239:1: entryRuleEValidSourceType returns [EObject current=null] : iv_ruleEValidSourceType= ruleEValidSourceType EOF ;
    public final EObject entryRuleEValidSourceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValidSourceType = null;


        try {
            // InternalRMParser.g:5239:57: (iv_ruleEValidSourceType= ruleEValidSourceType EOF )
            // InternalRMParser.g:5240:2: iv_ruleEValidSourceType= ruleEValidSourceType EOF
            {
             newCompositeNode(grammarAccess.getEValidSourceTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValidSourceType=ruleEValidSourceType();

            state._fsp--;

             current =iv_ruleEValidSourceType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValidSourceType"


    // $ANTLR start "ruleEValidSourceType"
    // InternalRMParser.g:5246:1: ruleEValidSourceType returns [EObject current=null] : ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) ;
    public final EObject ruleEValidSourceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sourceTypes_0_0 = null;

        EObject lv_sourceType_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5252:2: ( ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* ) )
            // InternalRMParser.g:5253:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            {
            // InternalRMParser.g:5253:2: ( ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )* )
            // InternalRMParser.g:5254:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) ) (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            {
            // InternalRMParser.g:5254:3: ( (lv_sourceTypes_0_0= ruleENodeTypeRef ) )
            // InternalRMParser.g:5255:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            {
            // InternalRMParser.g:5255:4: (lv_sourceTypes_0_0= ruleENodeTypeRef )
            // InternalRMParser.g:5256:5: lv_sourceTypes_0_0= ruleENodeTypeRef
            {

            					newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypesENodeTypeRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_sourceTypes_0_0=ruleENodeTypeRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            					}
            					add(
            						current,
            						"sourceTypes",
            						lv_sourceTypes_0_0,
            						"org.sodalite.dsl.RM.ENodeTypeRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRMParser.g:5273:3: (otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==Comma) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalRMParser.g:5274:4: otherlv_1= Comma ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    {
            	    otherlv_1=(Token)match(input,Comma,FOLLOW_7); 

            	    				newLeafNode(otherlv_1, grammarAccess.getEValidSourceTypeAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalRMParser.g:5278:4: ( (lv_sourceType_2_0= ruleENodeTypeRef ) )
            	    // InternalRMParser.g:5279:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    {
            	    // InternalRMParser.g:5279:5: (lv_sourceType_2_0= ruleENodeTypeRef )
            	    // InternalRMParser.g:5280:6: lv_sourceType_2_0= ruleENodeTypeRef
            	    {

            	    						newCompositeNode(grammarAccess.getEValidSourceTypeAccess().getSourceTypeENodeTypeRefParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
            	    lv_sourceType_2_0=ruleENodeTypeRef();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getEValidSourceTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sourceType",
            	    							lv_sourceType_2_0,
            	    							"org.sodalite.dsl.RM.ENodeTypeRef");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEValidSourceType"


    // $ANTLR start "entryRuleENodeTypeRef"
    // InternalRMParser.g:5302:1: entryRuleENodeTypeRef returns [EObject current=null] : iv_ruleENodeTypeRef= ruleENodeTypeRef EOF ;
    public final EObject entryRuleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleENodeTypeRef = null;


        try {
            // InternalRMParser.g:5302:53: (iv_ruleENodeTypeRef= ruleENodeTypeRef EOF )
            // InternalRMParser.g:5303:2: iv_ruleENodeTypeRef= ruleENodeTypeRef EOF
            {
             newCompositeNode(grammarAccess.getENodeTypeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleENodeTypeRef=ruleENodeTypeRef();

            state._fsp--;

             current =iv_ruleENodeTypeRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleENodeTypeRef"


    // $ANTLR start "ruleENodeTypeRef"
    // InternalRMParser.g:5309:1: ruleENodeTypeRef returns [EObject current=null] : ( (otherlv_0= RULE_QUALIFIED_NAME ) ) ;
    public final EObject ruleENodeTypeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:5315:2: ( ( (otherlv_0= RULE_QUALIFIED_NAME ) ) )
            // InternalRMParser.g:5316:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            {
            // InternalRMParser.g:5316:2: ( (otherlv_0= RULE_QUALIFIED_NAME ) )
            // InternalRMParser.g:5317:3: (otherlv_0= RULE_QUALIFIED_NAME )
            {
            // InternalRMParser.g:5317:3: (otherlv_0= RULE_QUALIFIED_NAME )
            // InternalRMParser.g:5318:4: otherlv_0= RULE_QUALIFIED_NAME
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getENodeTypeRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getENodeTypeRefAccess().getNameENodeTypeCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleENodeTypeRef"


    // $ANTLR start "entryRuleERequirements"
    // InternalRMParser.g:5332:1: entryRuleERequirements returns [EObject current=null] : iv_ruleERequirements= ruleERequirements EOF ;
    public final EObject entryRuleERequirements() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirements = null;


        try {
            // InternalRMParser.g:5332:54: (iv_ruleERequirements= ruleERequirements EOF )
            // InternalRMParser.g:5333:2: iv_ruleERequirements= ruleERequirements EOF
            {
             newCompositeNode(grammarAccess.getERequirementsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirements=ruleERequirements();

            state._fsp--;

             current =iv_ruleERequirements; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirements"


    // $ANTLR start "ruleERequirements"
    // InternalRMParser.g:5339:1: ruleERequirements returns [EObject current=null] : ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) ;
    public final EObject ruleERequirements() throws RecognitionException {
        EObject current = null;

        EObject lv_requirements_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5345:2: ( ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* ) )
            // InternalRMParser.g:5346:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            {
            // InternalRMParser.g:5346:2: ( () ( (lv_requirements_1_0= ruleERequirementDefinition ) )* )
            // InternalRMParser.g:5347:3: () ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            {
            // InternalRMParser.g:5347:3: ()
            // InternalRMParser.g:5348:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getERequirementsAccess().getERequirementsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5354:3: ( (lv_requirements_1_0= ruleERequirementDefinition ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalRMParser.g:5355:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    {
            	    // InternalRMParser.g:5355:4: (lv_requirements_1_0= ruleERequirementDefinition )
            	    // InternalRMParser.g:5356:5: lv_requirements_1_0= ruleERequirementDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getERequirementsAccess().getRequirementsERequirementDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_requirements_1_0=ruleERequirementDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getERequirementsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"requirements",
            	    						lv_requirements_1_0,
            	    						"org.sodalite.dsl.RM.ERequirementDefinition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirements"


    // $ANTLR start "entryRuleERequirementDefinition"
    // InternalRMParser.g:5377:1: entryRuleERequirementDefinition returns [EObject current=null] : iv_ruleERequirementDefinition= ruleERequirementDefinition EOF ;
    public final EObject entryRuleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinition = null;


        try {
            // InternalRMParser.g:5377:63: (iv_ruleERequirementDefinition= ruleERequirementDefinition EOF )
            // InternalRMParser.g:5378:2: iv_ruleERequirementDefinition= ruleERequirementDefinition EOF
            {
             newCompositeNode(grammarAccess.getERequirementDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirementDefinition=ruleERequirementDefinition();

            state._fsp--;

             current =iv_ruleERequirementDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirementDefinition"


    // $ANTLR start "ruleERequirementDefinition"
    // InternalRMParser.g:5384:1: ruleERequirementDefinition returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) ;
    public final EObject ruleERequirementDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token this_END_4=null;
        EObject lv_requirement_3_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5390:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END ) )
            // InternalRMParser.g:5391:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            {
            // InternalRMParser.g:5391:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END )
            // InternalRMParser.g:5392:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= Colon this_BEGIN_2= RULE_BEGIN ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) ) this_END_4= RULE_END
            {
            // InternalRMParser.g:5392:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalRMParser.g:5393:4: (lv_name_0_0= RULE_ID )
            {
            // InternalRMParser.g:5393:4: (lv_name_0_0= RULE_ID )
            // InternalRMParser.g:5394:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_0_0, grammarAccess.getERequirementDefinitionAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getERequirementDefinitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionAccess().getColonKeyword_1());
            		
            this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_60); 

            			newLeafNode(this_BEGIN_2, grammarAccess.getERequirementDefinitionAccess().getBEGINTerminalRuleCall_2());
            		
            // InternalRMParser.g:5418:3: ( (lv_requirement_3_0= ruleERequirementDefinitionBody ) )
            // InternalRMParser.g:5419:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            {
            // InternalRMParser.g:5419:4: (lv_requirement_3_0= ruleERequirementDefinitionBody )
            // InternalRMParser.g:5420:5: lv_requirement_3_0= ruleERequirementDefinitionBody
            {

            					newCompositeNode(grammarAccess.getERequirementDefinitionAccess().getRequirementERequirementDefinitionBodyParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_requirement_3_0=ruleERequirementDefinitionBody();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getERequirementDefinitionRule());
            					}
            					set(
            						current,
            						"requirement",
            						lv_requirement_3_0,
            						"org.sodalite.dsl.RM.ERequirementDefinitionBody");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_END_4=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_4, grammarAccess.getERequirementDefinitionAccess().getENDTerminalRuleCall_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirementDefinition"


    // $ANTLR start "entryRuleERequirementDefinitionBody"
    // InternalRMParser.g:5445:1: entryRuleERequirementDefinitionBody returns [EObject current=null] : iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF ;
    public final EObject entryRuleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERequirementDefinitionBody = null;


        try {
            // InternalRMParser.g:5445:67: (iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF )
            // InternalRMParser.g:5446:2: iv_ruleERequirementDefinitionBody= ruleERequirementDefinitionBody EOF
            {
             newCompositeNode(grammarAccess.getERequirementDefinitionBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleERequirementDefinitionBody=ruleERequirementDefinitionBody();

            state._fsp--;

             current =iv_ruleERequirementDefinitionBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleERequirementDefinitionBody"


    // $ANTLR start "ruleERequirementDefinitionBody"
    // InternalRMParser.g:5452:1: ruleERequirementDefinitionBody returns [EObject current=null] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) ;
    public final EObject ruleERequirementDefinitionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_start_9_0=null;
        Token otherlv_10=null;
        Token lv_end_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalRMParser.g:5458:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) ) )
            // InternalRMParser.g:5459:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            {
            // InternalRMParser.g:5459:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) ) )
            // InternalRMParser.g:5460:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            {
            // InternalRMParser.g:5460:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?) )
            // InternalRMParser.g:5461:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            {
             
            			  getUnorderedGroupHelper().enter(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			
            // InternalRMParser.g:5464:4: ( ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?)
            // InternalRMParser.g:5465:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+ {...}?
            {
            // InternalRMParser.g:5465:5: ( ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) ) )+
            int cnt43=0;
            loop43:
            do {
                int alt43=5;
                int LA43_0 = input.LA(1);

                if ( LA43_0 == Capability && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
                    alt43=1;
                }
                else if ( LA43_0 == Node && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
                    alt43=2;
                }
                else if ( LA43_0 == Relationship && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
                    alt43=3;
                }
                else if ( LA43_0 == Occurrences && getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
                    alt43=4;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalRMParser.g:5466:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5466:3: ({...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5467:4: {...}? => ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalRMParser.g:5467:120: ( ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5468:5: ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 0);
            	    				
            	    // InternalRMParser.g:5471:8: ({...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5471:9: {...}? => (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5471:18: (otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5471:19: otherlv_1= Capability ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_1=(Token)match(input,Capability,FOLLOW_7); 

            	    								newLeafNode(otherlv_1, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityKeyword_0_0());
            	    							
            	    // InternalRMParser.g:5475:8: ( (otherlv_2= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5476:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5476:9: (otherlv_2= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5477:10: otherlv_2= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_2=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_61); 

            	    										newLeafNode(otherlv_2, grammarAccess.getERequirementDefinitionBodyAccess().getCapabilityECapabilityTypeCrossReference_0_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalRMParser.g:5494:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5494:3: ({...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5495:4: {...}? => ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalRMParser.g:5495:120: ( ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5496:5: ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 1);
            	    				
            	    // InternalRMParser.g:5499:8: ({...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5499:9: {...}? => (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5499:18: (otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5499:19: otherlv_3= Node ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_3=(Token)match(input,Node,FOLLOW_7); 

            	    								newLeafNode(otherlv_3, grammarAccess.getERequirementDefinitionBodyAccess().getNodeKeyword_1_0());
            	    							
            	    // InternalRMParser.g:5503:8: ( (otherlv_4= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5504:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5504:9: (otherlv_4= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5505:10: otherlv_4= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_4=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_61); 

            	    										newLeafNode(otherlv_4, grammarAccess.getERequirementDefinitionBodyAccess().getNodeENodeTypeCrossReference_1_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalRMParser.g:5522:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    {
            	    // InternalRMParser.g:5522:3: ({...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) ) )
            	    // InternalRMParser.g:5523:4: {...}? => ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2)");
            	    }
            	    // InternalRMParser.g:5523:120: ( ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) ) )
            	    // InternalRMParser.g:5524:5: ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 2);
            	    				
            	    // InternalRMParser.g:5527:8: ({...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) ) )
            	    // InternalRMParser.g:5527:9: {...}? => (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5527:18: (otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) ) )
            	    // InternalRMParser.g:5527:19: otherlv_5= Relationship ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    {
            	    otherlv_5=(Token)match(input,Relationship,FOLLOW_7); 

            	    								newLeafNode(otherlv_5, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipKeyword_2_0());
            	    							
            	    // InternalRMParser.g:5531:8: ( (otherlv_6= RULE_QUALIFIED_NAME ) )
            	    // InternalRMParser.g:5532:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    {
            	    // InternalRMParser.g:5532:9: (otherlv_6= RULE_QUALIFIED_NAME )
            	    // InternalRMParser.g:5533:10: otherlv_6= RULE_QUALIFIED_NAME
            	    {

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    									
            	    otherlv_6=(Token)match(input,RULE_QUALIFIED_NAME,FOLLOW_61); 

            	    										newLeafNode(otherlv_6, grammarAccess.getERequirementDefinitionBodyAccess().getRelationshipERelationshipTypeCrossReference_2_1_0());
            	    									

            	    }


            	    }


            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalRMParser.g:5550:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    {
            	    // InternalRMParser.g:5550:3: ({...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) ) )
            	    // InternalRMParser.g:5551:4: {...}? => ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canSelect(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3)");
            	    }
            	    // InternalRMParser.g:5551:120: ( ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) ) )
            	    // InternalRMParser.g:5552:5: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) )
            	    {

            	    					getUnorderedGroupHelper().select(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup(), 3);
            	    				
            	    // InternalRMParser.g:5555:8: ({...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket ) )
            	    // InternalRMParser.g:5555:9: {...}? => (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "true");
            	    }
            	    // InternalRMParser.g:5555:18: (otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket )
            	    // InternalRMParser.g:5555:19: otherlv_7= Occurrences otherlv_8= LeftSquareBracket ( (lv_start_9_0= RULE_STRING ) ) otherlv_10= Comma ( (lv_end_11_0= RULE_STRING ) ) otherlv_12= RightSquareBracket
            	    {
            	    otherlv_7=(Token)match(input,Occurrences,FOLLOW_29); 

            	    								newLeafNode(otherlv_7, grammarAccess.getERequirementDefinitionBodyAccess().getOccurrencesKeyword_3_0());
            	    							
            	    otherlv_8=(Token)match(input,LeftSquareBracket,FOLLOW_12); 

            	    								newLeafNode(otherlv_8, grammarAccess.getERequirementDefinitionBodyAccess().getLeftSquareBracketKeyword_3_1());
            	    							
            	    // InternalRMParser.g:5563:8: ( (lv_start_9_0= RULE_STRING ) )
            	    // InternalRMParser.g:5564:9: (lv_start_9_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5564:9: (lv_start_9_0= RULE_STRING )
            	    // InternalRMParser.g:5565:10: lv_start_9_0= RULE_STRING
            	    {
            	    lv_start_9_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            	    										newLeafNode(lv_start_9_0, grammarAccess.getERequirementDefinitionBodyAccess().getStartSTRINGTerminalRuleCall_3_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"start",
            	    											lv_start_9_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_10=(Token)match(input,Comma,FOLLOW_12); 

            	    								newLeafNode(otherlv_10, grammarAccess.getERequirementDefinitionBodyAccess().getCommaKeyword_3_3());
            	    							
            	    // InternalRMParser.g:5585:8: ( (lv_end_11_0= RULE_STRING ) )
            	    // InternalRMParser.g:5586:9: (lv_end_11_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5586:9: (lv_end_11_0= RULE_STRING )
            	    // InternalRMParser.g:5587:10: lv_end_11_0= RULE_STRING
            	    {
            	    lv_end_11_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            	    										newLeafNode(lv_end_11_0, grammarAccess.getERequirementDefinitionBodyAccess().getEndSTRINGTerminalRuleCall_3_4_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getERequirementDefinitionBodyRule());
            	    										}
            	    										setWithLastConsumed(
            	    											current,
            	    											"end",
            	    											lv_end_11_0,
            	    											"org.eclipse.xtext.common.Terminals.STRING");
            	    									

            	    }


            	    }

            	    otherlv_12=(Token)match(input,RightSquareBracket,FOLLOW_61); 

            	    								newLeafNode(otherlv_12, grammarAccess.getERequirementDefinitionBodyAccess().getRightSquareBracketKeyword_3_5());
            	    							

            	    }


            	    }

            	     
            	    					getUnorderedGroupHelper().returnFromSelection(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            	    				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup()) ) {
                throw new FailedPredicateException(input, "ruleERequirementDefinitionBody", "getUnorderedGroupHelper().canLeave(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup())");
            }

            }


            }

             
            			  getUnorderedGroupHelper().leave(grammarAccess.getERequirementDefinitionBodyAccess().getUnorderedGroup());
            			

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleERequirementDefinitionBody"


    // $ANTLR start "entryRuleEConstraints"
    // InternalRMParser.g:5624:1: entryRuleEConstraints returns [EObject current=null] : iv_ruleEConstraints= ruleEConstraints EOF ;
    public final EObject entryRuleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraints = null;


        try {
            // InternalRMParser.g:5624:53: (iv_ruleEConstraints= ruleEConstraints EOF )
            // InternalRMParser.g:5625:2: iv_ruleEConstraints= ruleEConstraints EOF
            {
             newCompositeNode(grammarAccess.getEConstraintsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConstraints=ruleEConstraints();

            state._fsp--;

             current =iv_ruleEConstraints; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConstraints"


    // $ANTLR start "ruleEConstraints"
    // InternalRMParser.g:5631:1: ruleEConstraints returns [EObject current=null] : ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) ;
    public final EObject ruleEConstraints() throws RecognitionException {
        EObject current = null;

        EObject lv_constraints_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5637:2: ( ( () ( (lv_constraints_1_0= ruleEConstraint ) )* ) )
            // InternalRMParser.g:5638:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            {
            // InternalRMParser.g:5638:2: ( () ( (lv_constraints_1_0= ruleEConstraint ) )* )
            // InternalRMParser.g:5639:3: () ( (lv_constraints_1_0= ruleEConstraint ) )*
            {
            // InternalRMParser.g:5639:3: ()
            // InternalRMParser.g:5640:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEConstraintsAccess().getEConstraintsAction_0(),
            					current);
            			

            }

            // InternalRMParser.g:5646:3: ( (lv_constraints_1_0= ruleEConstraint ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==Greater_or_equal||LA44_0==Less_or_equal||LA44_0==Greater_than||LA44_0==Valid_values||(LA44_0>=Max_length && LA44_0<=Min_length)||LA44_0==Less_than||LA44_0==In_range||LA44_0==Length||LA44_0==Equal) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalRMParser.g:5647:4: (lv_constraints_1_0= ruleEConstraint )
            	    {
            	    // InternalRMParser.g:5647:4: (lv_constraints_1_0= ruleEConstraint )
            	    // InternalRMParser.g:5648:5: lv_constraints_1_0= ruleEConstraint
            	    {

            	    					newCompositeNode(grammarAccess.getEConstraintsAccess().getConstraintsEConstraintParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_62);
            	    lv_constraints_1_0=ruleEConstraint();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEConstraintsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"constraints",
            	    						lv_constraints_1_0,
            	    						"org.sodalite.dsl.RM.EConstraint");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConstraints"


    // $ANTLR start "entryRuleEConstraint"
    // InternalRMParser.g:5669:1: entryRuleEConstraint returns [EObject current=null] : iv_ruleEConstraint= ruleEConstraint EOF ;
    public final EObject entryRuleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEConstraint = null;


        try {
            // InternalRMParser.g:5669:52: (iv_ruleEConstraint= ruleEConstraint EOF )
            // InternalRMParser.g:5670:2: iv_ruleEConstraint= ruleEConstraint EOF
            {
             newCompositeNode(grammarAccess.getEConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEConstraint=ruleEConstraint();

            state._fsp--;

             current =iv_ruleEConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEConstraint"


    // $ANTLR start "ruleEConstraint"
    // InternalRMParser.g:5676:1: ruleEConstraint returns [EObject current=null] : (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) ;
    public final EObject ruleEConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_EEqual_0 = null;

        EObject this_EGreaterThan_1 = null;

        EObject this_EGreaterOrEqual_2 = null;

        EObject this_ELessThan_3 = null;

        EObject this_ELessOrEqual_4 = null;

        EObject this_EInRange_5 = null;

        EObject this_EValid_Values_6 = null;

        EObject this_ELength_7 = null;

        EObject this_EMinLength_8 = null;

        EObject this_EMaxLength_9 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5682:2: ( (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength ) )
            // InternalRMParser.g:5683:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            {
            // InternalRMParser.g:5683:2: (this_EEqual_0= ruleEEqual | this_EGreaterThan_1= ruleEGreaterThan | this_EGreaterOrEqual_2= ruleEGreaterOrEqual | this_ELessThan_3= ruleELessThan | this_ELessOrEqual_4= ruleELessOrEqual | this_EInRange_5= ruleEInRange | this_EValid_Values_6= ruleEValid_Values | this_ELength_7= ruleELength | this_EMinLength_8= ruleEMinLength | this_EMaxLength_9= ruleEMaxLength )
            int alt45=10;
            switch ( input.LA(1) ) {
            case Equal:
                {
                alt45=1;
                }
                break;
            case Greater_than:
                {
                alt45=2;
                }
                break;
            case Greater_or_equal:
                {
                alt45=3;
                }
                break;
            case Less_than:
                {
                alt45=4;
                }
                break;
            case Less_or_equal:
                {
                alt45=5;
                }
                break;
            case In_range:
                {
                alt45=6;
                }
                break;
            case Valid_values:
                {
                alt45=7;
                }
                break;
            case Length:
                {
                alt45=8;
                }
                break;
            case Min_length:
                {
                alt45=9;
                }
                break;
            case Max_length:
                {
                alt45=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }

            switch (alt45) {
                case 1 :
                    // InternalRMParser.g:5684:3: this_EEqual_0= ruleEEqual
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEEqualParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EEqual_0=ruleEEqual();

                    state._fsp--;


                    			current = this_EEqual_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:5693:3: this_EGreaterThan_1= ruleEGreaterThan
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEGreaterThanParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_EGreaterThan_1=ruleEGreaterThan();

                    state._fsp--;


                    			current = this_EGreaterThan_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:5702:3: this_EGreaterOrEqual_2= ruleEGreaterOrEqual
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEGreaterOrEqualParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EGreaterOrEqual_2=ruleEGreaterOrEqual();

                    state._fsp--;


                    			current = this_EGreaterOrEqual_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRMParser.g:5711:3: this_ELessThan_3= ruleELessThan
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getELessThanParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELessThan_3=ruleELessThan();

                    state._fsp--;


                    			current = this_ELessThan_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalRMParser.g:5720:3: this_ELessOrEqual_4= ruleELessOrEqual
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getELessOrEqualParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELessOrEqual_4=ruleELessOrEqual();

                    state._fsp--;


                    			current = this_ELessOrEqual_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalRMParser.g:5729:3: this_EInRange_5= ruleEInRange
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEInRangeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_EInRange_5=ruleEInRange();

                    state._fsp--;


                    			current = this_EInRange_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalRMParser.g:5738:3: this_EValid_Values_6= ruleEValid_Values
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEValid_ValuesParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_EValid_Values_6=ruleEValid_Values();

                    state._fsp--;


                    			current = this_EValid_Values_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalRMParser.g:5747:3: this_ELength_7= ruleELength
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getELengthParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELength_7=ruleELength();

                    state._fsp--;


                    			current = this_ELength_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalRMParser.g:5756:3: this_EMinLength_8= ruleEMinLength
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEMinLengthParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMinLength_8=ruleEMinLength();

                    state._fsp--;


                    			current = this_EMinLength_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalRMParser.g:5765:3: this_EMaxLength_9= ruleEMaxLength
                    {

                    			newCompositeNode(grammarAccess.getEConstraintAccess().getEMaxLengthParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMaxLength_9=ruleEMaxLength();

                    state._fsp--;


                    			current = this_EMaxLength_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEConstraint"


    // $ANTLR start "entryRuleEMaxLength"
    // InternalRMParser.g:5777:1: entryRuleEMaxLength returns [EObject current=null] : iv_ruleEMaxLength= ruleEMaxLength EOF ;
    public final EObject entryRuleEMaxLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMaxLength = null;


        try {
            // InternalRMParser.g:5777:51: (iv_ruleEMaxLength= ruleEMaxLength EOF )
            // InternalRMParser.g:5778:2: iv_ruleEMaxLength= ruleEMaxLength EOF
            {
             newCompositeNode(grammarAccess.getEMaxLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMaxLength=ruleEMaxLength();

            state._fsp--;

             current =iv_ruleEMaxLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMaxLength"


    // $ANTLR start "ruleEMaxLength"
    // InternalRMParser.g:5784:1: ruleEMaxLength returns [EObject current=null] : (otherlv_0= Max_length ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMaxLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:5790:2: ( (otherlv_0= Max_length ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:5791:2: (otherlv_0= Max_length ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:5791:2: (otherlv_0= Max_length ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:5792:3: otherlv_0= Max_length ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Max_length,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEMaxLengthAccess().getMax_lengthKeyword_0());
            		
            // InternalRMParser.g:5796:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:5797:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:5797:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:5798:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEMaxLengthAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMaxLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMaxLength"


    // $ANTLR start "entryRuleEMinLength"
    // InternalRMParser.g:5818:1: entryRuleEMinLength returns [EObject current=null] : iv_ruleEMinLength= ruleEMinLength EOF ;
    public final EObject entryRuleEMinLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMinLength = null;


        try {
            // InternalRMParser.g:5818:51: (iv_ruleEMinLength= ruleEMinLength EOF )
            // InternalRMParser.g:5819:2: iv_ruleEMinLength= ruleEMinLength EOF
            {
             newCompositeNode(grammarAccess.getEMinLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMinLength=ruleEMinLength();

            state._fsp--;

             current =iv_ruleEMinLength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMinLength"


    // $ANTLR start "ruleEMinLength"
    // InternalRMParser.g:5825:1: ruleEMinLength returns [EObject current=null] : (otherlv_0= Min_length ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEMinLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:5831:2: ( (otherlv_0= Min_length ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:5832:2: (otherlv_0= Min_length ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:5832:2: (otherlv_0= Min_length ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:5833:3: otherlv_0= Min_length ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Min_length,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEMinLengthAccess().getMin_lengthKeyword_0());
            		
            // InternalRMParser.g:5837:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:5838:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:5838:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:5839:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEMinLengthAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMinLengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMinLength"


    // $ANTLR start "entryRuleELength"
    // InternalRMParser.g:5859:1: entryRuleELength returns [EObject current=null] : iv_ruleELength= ruleELength EOF ;
    public final EObject entryRuleELength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELength = null;


        try {
            // InternalRMParser.g:5859:48: (iv_ruleELength= ruleELength EOF )
            // InternalRMParser.g:5860:2: iv_ruleELength= ruleELength EOF
            {
             newCompositeNode(grammarAccess.getELengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELength=ruleELength();

            state._fsp--;

             current =iv_ruleELength; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELength"


    // $ANTLR start "ruleELength"
    // InternalRMParser.g:5866:1: ruleELength returns [EObject current=null] : (otherlv_0= Length ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELength() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:5872:2: ( (otherlv_0= Length ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:5873:2: (otherlv_0= Length ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:5873:2: (otherlv_0= Length ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:5874:3: otherlv_0= Length ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Length,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getELengthAccess().getLengthKeyword_0());
            		
            // InternalRMParser.g:5878:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:5879:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:5879:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:5880:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getELengthAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELengthRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELength"


    // $ANTLR start "entryRuleEValid_Values"
    // InternalRMParser.g:5900:1: entryRuleEValid_Values returns [EObject current=null] : iv_ruleEValid_Values= ruleEValid_Values EOF ;
    public final EObject entryRuleEValid_Values() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEValid_Values = null;


        try {
            // InternalRMParser.g:5900:54: (iv_ruleEValid_Values= ruleEValid_Values EOF )
            // InternalRMParser.g:5901:2: iv_ruleEValid_Values= ruleEValid_Values EOF
            {
             newCompositeNode(grammarAccess.getEValid_ValuesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEValid_Values=ruleEValid_Values();

            state._fsp--;

             current =iv_ruleEValid_Values; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEValid_Values"


    // $ANTLR start "ruleEValid_Values"
    // InternalRMParser.g:5907:1: ruleEValid_Values returns [EObject current=null] : (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) ;
    public final EObject ruleEValid_Values() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_val_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:5913:2: ( (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) ) )
            // InternalRMParser.g:5914:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            {
            // InternalRMParser.g:5914:2: (otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) ) )
            // InternalRMParser.g:5915:3: otherlv_0= Valid_values ( (lv_val_1_0= ruleELIST ) )
            {
            otherlv_0=(Token)match(input,Valid_values,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getEValid_ValuesAccess().getValid_valuesKeyword_0());
            		
            // InternalRMParser.g:5919:3: ( (lv_val_1_0= ruleELIST ) )
            // InternalRMParser.g:5920:4: (lv_val_1_0= ruleELIST )
            {
            // InternalRMParser.g:5920:4: (lv_val_1_0= ruleELIST )
            // InternalRMParser.g:5921:5: lv_val_1_0= ruleELIST
            {

            					newCompositeNode(grammarAccess.getEValid_ValuesAccess().getValELISTParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_val_1_0=ruleELIST();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEValid_ValuesRule());
            					}
            					set(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.sodalite.dsl.RM.ELIST");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEValid_Values"


    // $ANTLR start "entryRuleELIST"
    // InternalRMParser.g:5942:1: entryRuleELIST returns [EObject current=null] : iv_ruleELIST= ruleELIST EOF ;
    public final EObject entryRuleELIST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELIST = null;


        try {
            // InternalRMParser.g:5942:46: (iv_ruleELIST= ruleELIST EOF )
            // InternalRMParser.g:5943:2: iv_ruleELIST= ruleELIST EOF
            {
             newCompositeNode(grammarAccess.getELISTRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELIST=ruleELIST();

            state._fsp--;

             current =iv_ruleELIST; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELIST"


    // $ANTLR start "ruleELIST"
    // InternalRMParser.g:5949:1: ruleELIST returns [EObject current=null] : (otherlv_0= LeftSquareBracket ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= RightSquareBracket ) ;
    public final EObject ruleELIST() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_list_1_0=null;
        Token otherlv_2=null;
        Token lv_list_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalRMParser.g:5955:2: ( (otherlv_0= LeftSquareBracket ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= RightSquareBracket ) )
            // InternalRMParser.g:5956:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= RightSquareBracket )
            {
            // InternalRMParser.g:5956:2: (otherlv_0= LeftSquareBracket ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= RightSquareBracket )
            // InternalRMParser.g:5957:3: otherlv_0= LeftSquareBracket ( (lv_list_1_0= RULE_STRING ) ) (otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) ) )* otherlv_4= RightSquareBracket
            {
            otherlv_0=(Token)match(input,LeftSquareBracket,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getELISTAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalRMParser.g:5961:3: ( (lv_list_1_0= RULE_STRING ) )
            // InternalRMParser.g:5962:4: (lv_list_1_0= RULE_STRING )
            {
            // InternalRMParser.g:5962:4: (lv_list_1_0= RULE_STRING )
            // InternalRMParser.g:5963:5: lv_list_1_0= RULE_STRING
            {
            lv_list_1_0=(Token)match(input,RULE_STRING,FOLLOW_63); 

            					newLeafNode(lv_list_1_0, grammarAccess.getELISTAccess().getListSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELISTRule());
            					}
            					addWithLastConsumed(
            						current,
            						"list",
            						lv_list_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalRMParser.g:5979:3: (otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==Comma) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalRMParser.g:5980:4: otherlv_2= Comma ( (lv_list_3_0= RULE_STRING ) )
            	    {
            	    otherlv_2=(Token)match(input,Comma,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getELISTAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalRMParser.g:5984:4: ( (lv_list_3_0= RULE_STRING ) )
            	    // InternalRMParser.g:5985:5: (lv_list_3_0= RULE_STRING )
            	    {
            	    // InternalRMParser.g:5985:5: (lv_list_3_0= RULE_STRING )
            	    // InternalRMParser.g:5986:6: lv_list_3_0= RULE_STRING
            	    {
            	    lv_list_3_0=(Token)match(input,RULE_STRING,FOLLOW_63); 

            	    						newLeafNode(lv_list_3_0, grammarAccess.getELISTAccess().getListSTRINGTerminalRuleCall_2_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getELISTRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"list",
            	    							lv_list_3_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getELISTAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELIST"


    // $ANTLR start "entryRuleEInRange"
    // InternalRMParser.g:6011:1: entryRuleEInRange returns [EObject current=null] : iv_ruleEInRange= ruleEInRange EOF ;
    public final EObject entryRuleEInRange() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEInRange = null;


        try {
            // InternalRMParser.g:6011:49: (iv_ruleEInRange= ruleEInRange EOF )
            // InternalRMParser.g:6012:2: iv_ruleEInRange= ruleEInRange EOF
            {
             newCompositeNode(grammarAccess.getEInRangeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInRange=ruleEInRange();

            state._fsp--;

             current =iv_ruleEInRange; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInRange"


    // $ANTLR start "ruleEInRange"
    // InternalRMParser.g:6018:1: ruleEInRange returns [EObject current=null] : (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= Comma ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= RightSquareBracket ) ;
    public final EObject ruleEInRange() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_start_2_0=null;
        Token otherlv_3=null;
        Token lv_end_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalRMParser.g:6024:2: ( (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= Comma ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= RightSquareBracket ) )
            // InternalRMParser.g:6025:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= Comma ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= RightSquareBracket )
            {
            // InternalRMParser.g:6025:2: (otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= Comma ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= RightSquareBracket )
            // InternalRMParser.g:6026:3: otherlv_0= In_range otherlv_1= LeftSquareBracket ( (lv_start_2_0= RULE_STRING ) ) otherlv_3= Comma ( (lv_end_4_0= RULE_STRING ) ) otherlv_5= RightSquareBracket
            {
            otherlv_0=(Token)match(input,In_range,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getEInRangeAccess().getIn_rangeKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getEInRangeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalRMParser.g:6034:3: ( (lv_start_2_0= RULE_STRING ) )
            // InternalRMParser.g:6035:4: (lv_start_2_0= RULE_STRING )
            {
            // InternalRMParser.g:6035:4: (lv_start_2_0= RULE_STRING )
            // InternalRMParser.g:6036:5: lv_start_2_0= RULE_STRING
            {
            lv_start_2_0=(Token)match(input,RULE_STRING,FOLLOW_59); 

            					newLeafNode(lv_start_2_0, grammarAccess.getEInRangeAccess().getStartSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"start",
            						lv_start_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,Comma,FOLLOW_12); 

            			newLeafNode(otherlv_3, grammarAccess.getEInRangeAccess().getCommaKeyword_3());
            		
            // InternalRMParser.g:6056:3: ( (lv_end_4_0= RULE_STRING ) )
            // InternalRMParser.g:6057:4: (lv_end_4_0= RULE_STRING )
            {
            // InternalRMParser.g:6057:4: (lv_end_4_0= RULE_STRING )
            // InternalRMParser.g:6058:5: lv_end_4_0= RULE_STRING
            {
            lv_end_4_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

            					newLeafNode(lv_end_4_0, grammarAccess.getEInRangeAccess().getEndSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEInRangeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"end",
            						lv_end_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getEInRangeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInRange"


    // $ANTLR start "entryRuleELessOrEqual"
    // InternalRMParser.g:6082:1: entryRuleELessOrEqual returns [EObject current=null] : iv_ruleELessOrEqual= ruleELessOrEqual EOF ;
    public final EObject entryRuleELessOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessOrEqual = null;


        try {
            // InternalRMParser.g:6082:53: (iv_ruleELessOrEqual= ruleELessOrEqual EOF )
            // InternalRMParser.g:6083:2: iv_ruleELessOrEqual= ruleELessOrEqual EOF
            {
             newCompositeNode(grammarAccess.getELessOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELessOrEqual=ruleELessOrEqual();

            state._fsp--;

             current =iv_ruleELessOrEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELessOrEqual"


    // $ANTLR start "ruleELessOrEqual"
    // InternalRMParser.g:6089:1: ruleELessOrEqual returns [EObject current=null] : (otherlv_0= Less_or_equal ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6095:2: ( (otherlv_0= Less_or_equal ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:6096:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:6096:2: (otherlv_0= Less_or_equal ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:6097:3: otherlv_0= Less_or_equal ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Less_or_equal,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getELessOrEqualAccess().getLess_or_equalKeyword_0());
            		
            // InternalRMParser.g:6101:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:6102:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:6102:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:6103:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getELessOrEqualAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELessOrEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELessOrEqual"


    // $ANTLR start "entryRuleELessThan"
    // InternalRMParser.g:6123:1: entryRuleELessThan returns [EObject current=null] : iv_ruleELessThan= ruleELessThan EOF ;
    public final EObject entryRuleELessThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleELessThan = null;


        try {
            // InternalRMParser.g:6123:50: (iv_ruleELessThan= ruleELessThan EOF )
            // InternalRMParser.g:6124:2: iv_ruleELessThan= ruleELessThan EOF
            {
             newCompositeNode(grammarAccess.getELessThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleELessThan=ruleELessThan();

            state._fsp--;

             current =iv_ruleELessThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleELessThan"


    // $ANTLR start "ruleELessThan"
    // InternalRMParser.g:6130:1: ruleELessThan returns [EObject current=null] : (otherlv_0= Less_than ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleELessThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6136:2: ( (otherlv_0= Less_than ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:6137:2: (otherlv_0= Less_than ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:6137:2: (otherlv_0= Less_than ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:6138:3: otherlv_0= Less_than ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Less_than,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getELessThanAccess().getLess_thanKeyword_0());
            		
            // InternalRMParser.g:6142:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:6143:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:6143:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:6144:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getELessThanAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getELessThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleELessThan"


    // $ANTLR start "entryRuleEGreaterOrEqual"
    // InternalRMParser.g:6164:1: entryRuleEGreaterOrEqual returns [EObject current=null] : iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF ;
    public final EObject entryRuleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterOrEqual = null;


        try {
            // InternalRMParser.g:6164:56: (iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF )
            // InternalRMParser.g:6165:2: iv_ruleEGreaterOrEqual= ruleEGreaterOrEqual EOF
            {
             newCompositeNode(grammarAccess.getEGreaterOrEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGreaterOrEqual=ruleEGreaterOrEqual();

            state._fsp--;

             current =iv_ruleEGreaterOrEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEGreaterOrEqual"


    // $ANTLR start "ruleEGreaterOrEqual"
    // InternalRMParser.g:6171:1: ruleEGreaterOrEqual returns [EObject current=null] : (otherlv_0= Greater_or_equal ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterOrEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6177:2: ( (otherlv_0= Greater_or_equal ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:6178:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:6178:2: (otherlv_0= Greater_or_equal ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:6179:3: otherlv_0= Greater_or_equal ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Greater_or_equal,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterOrEqualAccess().getGreater_or_equalKeyword_0());
            		
            // InternalRMParser.g:6183:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:6184:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:6184:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:6185:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEGreaterOrEqualAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEGreaterOrEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEGreaterOrEqual"


    // $ANTLR start "entryRuleEGreaterThan"
    // InternalRMParser.g:6205:1: entryRuleEGreaterThan returns [EObject current=null] : iv_ruleEGreaterThan= ruleEGreaterThan EOF ;
    public final EObject entryRuleEGreaterThan() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEGreaterThan = null;


        try {
            // InternalRMParser.g:6205:53: (iv_ruleEGreaterThan= ruleEGreaterThan EOF )
            // InternalRMParser.g:6206:2: iv_ruleEGreaterThan= ruleEGreaterThan EOF
            {
             newCompositeNode(grammarAccess.getEGreaterThanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEGreaterThan=ruleEGreaterThan();

            state._fsp--;

             current =iv_ruleEGreaterThan; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEGreaterThan"


    // $ANTLR start "ruleEGreaterThan"
    // InternalRMParser.g:6212:1: ruleEGreaterThan returns [EObject current=null] : (otherlv_0= Greater_than ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEGreaterThan() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6218:2: ( (otherlv_0= Greater_than ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:6219:2: (otherlv_0= Greater_than ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:6219:2: (otherlv_0= Greater_than ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:6220:3: otherlv_0= Greater_than ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Greater_than,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEGreaterThanAccess().getGreater_thanKeyword_0());
            		
            // InternalRMParser.g:6224:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:6225:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:6225:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:6226:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEGreaterThanAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEGreaterThanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEGreaterThan"


    // $ANTLR start "entryRuleEEqual"
    // InternalRMParser.g:6246:1: entryRuleEEqual returns [EObject current=null] : iv_ruleEEqual= ruleEEqual EOF ;
    public final EObject entryRuleEEqual() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEEqual = null;


        try {
            // InternalRMParser.g:6246:47: (iv_ruleEEqual= ruleEEqual EOF )
            // InternalRMParser.g:6247:2: iv_ruleEEqual= ruleEEqual EOF
            {
             newCompositeNode(grammarAccess.getEEqualRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEEqual=ruleEEqual();

            state._fsp--;

             current =iv_ruleEEqual; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEEqual"


    // $ANTLR start "ruleEEqual"
    // InternalRMParser.g:6253:1: ruleEEqual returns [EObject current=null] : (otherlv_0= Equal ( (lv_val_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleEEqual() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_val_1_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6259:2: ( (otherlv_0= Equal ( (lv_val_1_0= RULE_STRING ) ) ) )
            // InternalRMParser.g:6260:2: (otherlv_0= Equal ( (lv_val_1_0= RULE_STRING ) ) )
            {
            // InternalRMParser.g:6260:2: (otherlv_0= Equal ( (lv_val_1_0= RULE_STRING ) ) )
            // InternalRMParser.g:6261:3: otherlv_0= Equal ( (lv_val_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,Equal,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getEEqualAccess().getEqualKeyword_0());
            		
            // InternalRMParser.g:6265:3: ( (lv_val_1_0= RULE_STRING ) )
            // InternalRMParser.g:6266:4: (lv_val_1_0= RULE_STRING )
            {
            // InternalRMParser.g:6266:4: (lv_val_1_0= RULE_STRING )
            // InternalRMParser.g:6267:5: lv_val_1_0= RULE_STRING
            {
            lv_val_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_val_1_0, grammarAccess.getEEqualAccess().getValSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEEqualRule());
            					}
            					setWithLastConsumed(
            						current,
            						"val",
            						lv_val_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEEqual"


    // $ANTLR start "entryRuleEPropertyAssignmentValue"
    // InternalRMParser.g:6287:1: entryRuleEPropertyAssignmentValue returns [EObject current=null] : iv_ruleEPropertyAssignmentValue= ruleEPropertyAssignmentValue EOF ;
    public final EObject entryRuleEPropertyAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEPropertyAssignmentValue = null;


        try {
            // InternalRMParser.g:6287:65: (iv_ruleEPropertyAssignmentValue= ruleEPropertyAssignmentValue EOF )
            // InternalRMParser.g:6288:2: iv_ruleEPropertyAssignmentValue= ruleEPropertyAssignmentValue EOF
            {
             newCompositeNode(grammarAccess.getEPropertyAssignmentValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEPropertyAssignmentValue=ruleEPropertyAssignmentValue();

            state._fsp--;

             current =iv_ruleEPropertyAssignmentValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEPropertyAssignmentValue"


    // $ANTLR start "ruleEPropertyAssignmentValue"
    // InternalRMParser.g:6294:1: ruleEPropertyAssignmentValue returns [EObject current=null] : (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) ;
    public final EObject ruleEPropertyAssignmentValue() throws RecognitionException {
        EObject current = null;

        EObject this_ESTRING_0 = null;

        EObject this_ELIST_1 = null;

        EObject this_EMAP_2 = null;

        EObject this_EFunction_3 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6300:2: ( (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction ) )
            // InternalRMParser.g:6301:2: (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            {
            // InternalRMParser.g:6301:2: (this_ESTRING_0= ruleESTRING | this_ELIST_1= ruleELIST | this_EMAP_2= ruleEMAP | this_EFunction_3= ruleEFunction )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt47=1;
                }
                break;
            case LeftSquareBracket:
                {
                alt47=2;
                }
                break;
            case RULE_BEGIN:
                {
                alt47=3;
                }
                break;
            case Get_attribute:
            case Get_property:
            case Get_input:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // InternalRMParser.g:6302:3: this_ESTRING_0= ruleESTRING
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getESTRINGParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ESTRING_0=ruleESTRING();

                    state._fsp--;


                    			current = this_ESTRING_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalRMParser.g:6311:3: this_ELIST_1= ruleELIST
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getELISTParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ELIST_1=ruleELIST();

                    state._fsp--;


                    			current = this_ELIST_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalRMParser.g:6320:3: this_EMAP_2= ruleEMAP
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getEMAPParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EMAP_2=ruleEMAP();

                    state._fsp--;


                    			current = this_EMAP_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalRMParser.g:6329:3: this_EFunction_3= ruleEFunction
                    {

                    			newCompositeNode(grammarAccess.getEPropertyAssignmentValueAccess().getEFunctionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_EFunction_3=ruleEFunction();

                    state._fsp--;


                    			current = this_EFunction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEPropertyAssignmentValue"


    // $ANTLR start "entryRuleESTRING"
    // InternalRMParser.g:6341:1: entryRuleESTRING returns [EObject current=null] : iv_ruleESTRING= ruleESTRING EOF ;
    public final EObject entryRuleESTRING() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleESTRING = null;


        try {
            // InternalRMParser.g:6341:48: (iv_ruleESTRING= ruleESTRING EOF )
            // InternalRMParser.g:6342:2: iv_ruleESTRING= ruleESTRING EOF
            {
             newCompositeNode(grammarAccess.getESTRINGRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleESTRING=ruleESTRING();

            state._fsp--;

             current =iv_ruleESTRING; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleESTRING"


    // $ANTLR start "ruleESTRING"
    // InternalRMParser.g:6348:1: ruleESTRING returns [EObject current=null] : ( (lv_string_0_0= RULE_STRING ) ) ;
    public final EObject ruleESTRING() throws RecognitionException {
        EObject current = null;

        Token lv_string_0_0=null;


        	enterRule();

        try {
            // InternalRMParser.g:6354:2: ( ( (lv_string_0_0= RULE_STRING ) ) )
            // InternalRMParser.g:6355:2: ( (lv_string_0_0= RULE_STRING ) )
            {
            // InternalRMParser.g:6355:2: ( (lv_string_0_0= RULE_STRING ) )
            // InternalRMParser.g:6356:3: (lv_string_0_0= RULE_STRING )
            {
            // InternalRMParser.g:6356:3: (lv_string_0_0= RULE_STRING )
            // InternalRMParser.g:6357:4: lv_string_0_0= RULE_STRING
            {
            lv_string_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_string_0_0, grammarAccess.getESTRINGAccess().getStringSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getESTRINGRule());
            				}
            				setWithLastConsumed(
            					current,
            					"string",
            					lv_string_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleESTRING"


    // $ANTLR start "entryRuleEMAP"
    // InternalRMParser.g:6376:1: entryRuleEMAP returns [EObject current=null] : iv_ruleEMAP= ruleEMAP EOF ;
    public final EObject entryRuleEMAP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMAP = null;


        try {
            // InternalRMParser.g:6376:45: (iv_ruleEMAP= ruleEMAP EOF )
            // InternalRMParser.g:6377:2: iv_ruleEMAP= ruleEMAP EOF
            {
             newCompositeNode(grammarAccess.getEMAPRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMAP=ruleEMAP();

            state._fsp--;

             current =iv_ruleEMAP; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMAP"


    // $ANTLR start "ruleEMAP"
    // InternalRMParser.g:6383:1: ruleEMAP returns [EObject current=null] : (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) ;
    public final EObject ruleEMAP() throws RecognitionException {
        EObject current = null;

        Token this_BEGIN_0=null;
        Token this_END_2=null;
        EObject lv_map_1_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6389:2: ( (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END ) )
            // InternalRMParser.g:6390:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            {
            // InternalRMParser.g:6390:2: (this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END )
            // InternalRMParser.g:6391:3: this_BEGIN_0= RULE_BEGIN ( (lv_map_1_0= ruleEMapEntry ) )+ this_END_2= RULE_END
            {
            this_BEGIN_0=(Token)match(input,RULE_BEGIN,FOLLOW_50); 

            			newLeafNode(this_BEGIN_0, grammarAccess.getEMAPAccess().getBEGINTerminalRuleCall_0());
            		
            // InternalRMParser.g:6395:3: ( (lv_map_1_0= ruleEMapEntry ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalRMParser.g:6396:4: (lv_map_1_0= ruleEMapEntry )
            	    {
            	    // InternalRMParser.g:6396:4: (lv_map_1_0= ruleEMapEntry )
            	    // InternalRMParser.g:6397:5: lv_map_1_0= ruleEMapEntry
            	    {

            	    					newCompositeNode(grammarAccess.getEMAPAccess().getMapEMapEntryParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_map_1_0=ruleEMapEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEMAPRule());
            	    					}
            	    					add(
            	    						current,
            	    						"map",
            	    						lv_map_1_0,
            	    						"org.sodalite.dsl.RM.EMapEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            this_END_2=(Token)match(input,RULE_END,FOLLOW_2); 

            			newLeafNode(this_END_2, grammarAccess.getEMAPAccess().getENDTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMAP"


    // $ANTLR start "entryRuleEMapEntry"
    // InternalRMParser.g:6422:1: entryRuleEMapEntry returns [EObject current=null] : iv_ruleEMapEntry= ruleEMapEntry EOF ;
    public final EObject entryRuleEMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEMapEntry = null;


        try {
            // InternalRMParser.g:6422:50: (iv_ruleEMapEntry= ruleEMapEntry EOF )
            // InternalRMParser.g:6423:2: iv_ruleEMapEntry= ruleEMapEntry EOF
            {
             newCompositeNode(grammarAccess.getEMapEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEMapEntry=ruleEMapEntry();

            state._fsp--;

             current =iv_ruleEMapEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEMapEntry"


    // $ANTLR start "ruleEMapEntry"
    // InternalRMParser.g:6429:1: ruleEMapEntry returns [EObject current=null] : ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) ) ;
    public final EObject ruleEMapEntry() throws RecognitionException {
        EObject current = null;

        Token lv_key_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalRMParser.g:6435:2: ( ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) ) )
            // InternalRMParser.g:6436:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) )
            {
            // InternalRMParser.g:6436:2: ( ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEPropertyAssignmentValue ) ) )
            // InternalRMParser.g:6437:3: ( (lv_key_0_0= RULE_ID ) ) otherlv_1= Colon ( (lv_value_2_0= ruleEPropertyAssignmentValue ) )
            {
            // InternalRMParser.g:6437:3: ( (lv_key_0_0= RULE_ID ) )
            // InternalRMParser.g:6438:4: (lv_key_0_0= RULE_ID )
            {
            // InternalRMParser.g:6438:4: (lv_key_0_0= RULE_ID )
            // InternalRMParser.g:6439:5: lv_key_0_0= RULE_ID
            {
            lv_key_0_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_key_0_0, grammarAccess.getEMapEntryAccess().getKeyIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEMapEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_0_0,
            						"org.sodalite.dsl.RM.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_64); 

            			newLeafNode(otherlv_1, grammarAccess.getEMapEntryAccess().getColonKeyword_1());
            		
            // InternalRMParser.g:6459:3: ( (lv_value_2_0= ruleEPropertyAssignmentValue ) )
            // InternalRMParser.g:6460:4: (lv_value_2_0= ruleEPropertyAssignmentValue )
            {
            // InternalRMParser.g:6460:4: (lv_value_2_0= ruleEPropertyAssignmentValue )
            // InternalRMParser.g:6461:5: lv_value_2_0= ruleEPropertyAssignmentValue
            {

            					newCompositeNode(grammarAccess.getEMapEntryAccess().getValueEPropertyAssignmentValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleEPropertyAssignmentValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEMapEntryRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.sodalite.dsl.RM.EPropertyAssignmentValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEMapEntry"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000440200692L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001006020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001006020002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0014048301102100L,0x0000000000000004L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000030004020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000030004020002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001014020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001014020002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002000804020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0002000804020002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004020000L,0x0000000000000004L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004020002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001094828000L,0x0000000000000004L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001094828002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001094020040L,0x0000000000000004L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001094020042L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0088300006040000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0088300006040002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000081000L,0x0000000000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0080000004040000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000004040002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0082000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0082000800000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0002000004000800L,0x0000000000000004L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000004000802L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x00A0200000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x00A0200000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0001802000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0001802000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0001880000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0001880000000002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x008000101C000020L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x008000101C000022L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2800000000000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0040000028400000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0040000028400002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0014048301102102L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0900000000000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0400004000081000L,0x0000000000000012L});

}
