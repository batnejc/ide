/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.sodalite.dsl.rM.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RMFactoryImpl extends EFactoryImpl implements RMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static RMFactory init()
  {
    try
    {
      RMFactory theRMFactory = (RMFactory)EPackage.Registry.INSTANCE.getEFactory(RMPackage.eNS_URI);
      if (theRMFactory != null)
      {
        return theRMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new RMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RMFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case RMPackage.RM_MODEL: return createRM_Model();
      case RMPackage.EDATA_TYPES: return createEDataTypes();
      case RMPackage.EDATA_TYPE: return createEDataType();
      case RMPackage.EDATA_TYPE_BODY: return createEDataTypeBody();
      case RMPackage.EARTIFACT_TYPES: return createEArtifactTypes();
      case RMPackage.EARTIFACT_TYPE: return createEArtifactType();
      case RMPackage.EARTIFACT_TYPE_BODY: return createEArtifactTypeBody();
      case RMPackage.ECAPABILITY_TYPES: return createECapabilityTypes();
      case RMPackage.ECAPABILITY_TYPE: return createECapabilityType();
      case RMPackage.ECAPABILITY_TYPE_BODY: return createECapabilityTypeBody();
      case RMPackage.EINTERFACE_TYPES: return createEInterfaceTypes();
      case RMPackage.EINTERFACE_TYPE: return createEInterfaceType();
      case RMPackage.EINTERFACE_TYPE_BODY: return createEInterfaceTypeBody();
      case RMPackage.EPOLICY_TYPES: return createEPolicyTypes();
      case RMPackage.EPOLICY_TYPE: return createEPolicyType();
      case RMPackage.EPOLICY_TYPE_BODY: return createEPolicyTypeBody();
      case RMPackage.ENODE_TYPES: return createENodeTypes();
      case RMPackage.ENODE_TYPE: return createENodeType();
      case RMPackage.ENODE_TYPE_BODY: return createENodeTypeBody();
      case RMPackage.ERELATIONSHIP_TYPES: return createERelationshipTypes();
      case RMPackage.ERELATIONSHIP_TYPE: return createERelationshipType();
      case RMPackage.ERELATIONSHIP_TYPE_BODY: return createERelationshipTypeBody();
      case RMPackage.EPROPERTIES: return createEProperties();
      case RMPackage.EPROPERTY_DEFINITION: return createEPropertyDefinition();
      case RMPackage.EPROPERTY_DEFINITION_BODY: return createEPropertyDefinitionBody();
      case RMPackage.EATTRIBUTES: return createEAttributes();
      case RMPackage.EATTRIBUTE_DEFINITION: return createEAttributeDefinition();
      case RMPackage.EATTRIBUTE_DEFINITION_BODY: return createEAttributeDefinitionBody();
      case RMPackage.EINTERFACES: return createEInterfaces();
      case RMPackage.EINTERFACE_DEFINITION: return createEInterfaceDefinition();
      case RMPackage.EINTERFACE_DEFINITION_BODY: return createEInterfaceDefinitionBody();
      case RMPackage.EOPERATIONS: return createEOperations();
      case RMPackage.EOPERATION_DEFINITION: return createEOperationDefinition();
      case RMPackage.EOPERATION_DEFINITION_BODY: return createEOperationDefinitionBody();
      case RMPackage.EINPUTS: return createEInputs();
      case RMPackage.EPARAMETER_DEFINITION: return createEParameterDefinition();
      case RMPackage.EPARAMETER_DEFINITION_BODY: return createEParameterDefinitionBody();
      case RMPackage.EVALUE_EXPRESSION: return createEValueExpression();
      case RMPackage.EFUNCTION: return createEFunction();
      case RMPackage.GET_ATTRIBUTE: return createGetAttribute();
      case RMPackage.GET_ATTRIBUTE_BODY: return createGetAttributeBody();
      case RMPackage.GET_PROPERTY: return createGetProperty();
      case RMPackage.GET_PROPERTY_BODY: return createGetPropertyBody();
      case RMPackage.ECAPABILITIES: return createECapabilities();
      case RMPackage.ECAPABILITY_DEFINITION: return createECapabilityDefinition();
      case RMPackage.ECAPABILITY_DEFINITION_BODY: return createECapabilityDefinitionBody();
      case RMPackage.EVALID_SOURCE_TYPE: return createEValidSourceType();
      case RMPackage.ETYPE_REF: return createETypeRef();
      case RMPackage.EREQUIREMENTS: return createERequirements();
      case RMPackage.EREQUIREMENT_DEFINITION: return createERequirementDefinition();
      case RMPackage.EREQUIREMENT_DEFINITION_BODY: return createERequirementDefinitionBody();
      case RMPackage.EREQ_OR_CAP: return createEReqOrCap();
      case RMPackage.ECONSTRAINTS: return createEConstraints();
      case RMPackage.ECONSTRAINT: return createEConstraint();
      case RMPackage.EMAX_LENGTH: return createEMaxLength();
      case RMPackage.EMIN_LENGTH: return createEMinLength();
      case RMPackage.ELENGTH: return createELength();
      case RMPackage.EVALID_VALUES: return createEValid_Values();
      case RMPackage.EIN_RANGE: return createEInRange();
      case RMPackage.ELESS_OR_EQUAL: return createELessOrEqual();
      case RMPackage.ELESS_THAN: return createELessThan();
      case RMPackage.EGREATER_OR_EQUAL: return createEGreaterOrEqual();
      case RMPackage.EGREATER_THAN: return createEGreaterThan();
      case RMPackage.EEQUAL: return createEEqual();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RM_Model createRM_Model()
  {
    RM_ModelImpl rM_Model = new RM_ModelImpl();
    return rM_Model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataTypes createEDataTypes()
  {
    EDataTypesImpl eDataTypes = new EDataTypesImpl();
    return eDataTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataType createEDataType()
  {
    EDataTypeImpl eDataType = new EDataTypeImpl();
    return eDataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataTypeBody createEDataTypeBody()
  {
    EDataTypeBodyImpl eDataTypeBody = new EDataTypeBodyImpl();
    return eDataTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EArtifactTypes createEArtifactTypes()
  {
    EArtifactTypesImpl eArtifactTypes = new EArtifactTypesImpl();
    return eArtifactTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EArtifactType createEArtifactType()
  {
    EArtifactTypeImpl eArtifactType = new EArtifactTypeImpl();
    return eArtifactType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EArtifactTypeBody createEArtifactTypeBody()
  {
    EArtifactTypeBodyImpl eArtifactTypeBody = new EArtifactTypeBodyImpl();
    return eArtifactTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilityTypes createECapabilityTypes()
  {
    ECapabilityTypesImpl eCapabilityTypes = new ECapabilityTypesImpl();
    return eCapabilityTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilityType createECapabilityType()
  {
    ECapabilityTypeImpl eCapabilityType = new ECapabilityTypeImpl();
    return eCapabilityType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilityTypeBody createECapabilityTypeBody()
  {
    ECapabilityTypeBodyImpl eCapabilityTypeBody = new ECapabilityTypeBodyImpl();
    return eCapabilityTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaceTypes createEInterfaceTypes()
  {
    EInterfaceTypesImpl eInterfaceTypes = new EInterfaceTypesImpl();
    return eInterfaceTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaceType createEInterfaceType()
  {
    EInterfaceTypeImpl eInterfaceType = new EInterfaceTypeImpl();
    return eInterfaceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaceTypeBody createEInterfaceTypeBody()
  {
    EInterfaceTypeBodyImpl eInterfaceTypeBody = new EInterfaceTypeBodyImpl();
    return eInterfaceTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPolicyTypes createEPolicyTypes()
  {
    EPolicyTypesImpl ePolicyTypes = new EPolicyTypesImpl();
    return ePolicyTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPolicyType createEPolicyType()
  {
    EPolicyTypeImpl ePolicyType = new EPolicyTypeImpl();
    return ePolicyType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPolicyTypeBody createEPolicyTypeBody()
  {
    EPolicyTypeBodyImpl ePolicyTypeBody = new EPolicyTypeBodyImpl();
    return ePolicyTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENodeTypes createENodeTypes()
  {
    ENodeTypesImpl eNodeTypes = new ENodeTypesImpl();
    return eNodeTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENodeType createENodeType()
  {
    ENodeTypeImpl eNodeType = new ENodeTypeImpl();
    return eNodeType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ENodeTypeBody createENodeTypeBody()
  {
    ENodeTypeBodyImpl eNodeTypeBody = new ENodeTypeBodyImpl();
    return eNodeTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERelationshipTypes createERelationshipTypes()
  {
    ERelationshipTypesImpl eRelationshipTypes = new ERelationshipTypesImpl();
    return eRelationshipTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERelationshipType createERelationshipType()
  {
    ERelationshipTypeImpl eRelationshipType = new ERelationshipTypeImpl();
    return eRelationshipType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERelationshipTypeBody createERelationshipTypeBody()
  {
    ERelationshipTypeBodyImpl eRelationshipTypeBody = new ERelationshipTypeBodyImpl();
    return eRelationshipTypeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EProperties createEProperties()
  {
    EPropertiesImpl eProperties = new EPropertiesImpl();
    return eProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyDefinition createEPropertyDefinition()
  {
    EPropertyDefinitionImpl ePropertyDefinition = new EPropertyDefinitionImpl();
    return ePropertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyDefinitionBody createEPropertyDefinitionBody()
  {
    EPropertyDefinitionBodyImpl ePropertyDefinitionBody = new EPropertyDefinitionBodyImpl();
    return ePropertyDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttributes createEAttributes()
  {
    EAttributesImpl eAttributes = new EAttributesImpl();
    return eAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttributeDefinition createEAttributeDefinition()
  {
    EAttributeDefinitionImpl eAttributeDefinition = new EAttributeDefinitionImpl();
    return eAttributeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttributeDefinitionBody createEAttributeDefinitionBody()
  {
    EAttributeDefinitionBodyImpl eAttributeDefinitionBody = new EAttributeDefinitionBodyImpl();
    return eAttributeDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaces createEInterfaces()
  {
    EInterfacesImpl eInterfaces = new EInterfacesImpl();
    return eInterfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaceDefinition createEInterfaceDefinition()
  {
    EInterfaceDefinitionImpl eInterfaceDefinition = new EInterfaceDefinitionImpl();
    return eInterfaceDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInterfaceDefinitionBody createEInterfaceDefinitionBody()
  {
    EInterfaceDefinitionBodyImpl eInterfaceDefinitionBody = new EInterfaceDefinitionBodyImpl();
    return eInterfaceDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperations createEOperations()
  {
    EOperationsImpl eOperations = new EOperationsImpl();
    return eOperations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperationDefinition createEOperationDefinition()
  {
    EOperationDefinitionImpl eOperationDefinition = new EOperationDefinitionImpl();
    return eOperationDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EOperationDefinitionBody createEOperationDefinitionBody()
  {
    EOperationDefinitionBodyImpl eOperationDefinitionBody = new EOperationDefinitionBodyImpl();
    return eOperationDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInputs createEInputs()
  {
    EInputsImpl eInputs = new EInputsImpl();
    return eInputs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EParameterDefinition createEParameterDefinition()
  {
    EParameterDefinitionImpl eParameterDefinition = new EParameterDefinitionImpl();
    return eParameterDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EParameterDefinitionBody createEParameterDefinitionBody()
  {
    EParameterDefinitionBodyImpl eParameterDefinitionBody = new EParameterDefinitionBodyImpl();
    return eParameterDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValueExpression createEValueExpression()
  {
    EValueExpressionImpl eValueExpression = new EValueExpressionImpl();
    return eValueExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EFunction createEFunction()
  {
    EFunctionImpl eFunction = new EFunctionImpl();
    return eFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetAttribute createGetAttribute()
  {
    GetAttributeImpl getAttribute = new GetAttributeImpl();
    return getAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetAttributeBody createGetAttributeBody()
  {
    GetAttributeBodyImpl getAttributeBody = new GetAttributeBodyImpl();
    return getAttributeBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetProperty createGetProperty()
  {
    GetPropertyImpl getProperty = new GetPropertyImpl();
    return getProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GetPropertyBody createGetPropertyBody()
  {
    GetPropertyBodyImpl getPropertyBody = new GetPropertyBodyImpl();
    return getPropertyBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilities createECapabilities()
  {
    ECapabilitiesImpl eCapabilities = new ECapabilitiesImpl();
    return eCapabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilityDefinition createECapabilityDefinition()
  {
    ECapabilityDefinitionImpl eCapabilityDefinition = new ECapabilityDefinitionImpl();
    return eCapabilityDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ECapabilityDefinitionBody createECapabilityDefinitionBody()
  {
    ECapabilityDefinitionBodyImpl eCapabilityDefinitionBody = new ECapabilityDefinitionBodyImpl();
    return eCapabilityDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValidSourceType createEValidSourceType()
  {
    EValidSourceTypeImpl eValidSourceType = new EValidSourceTypeImpl();
    return eValidSourceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ETypeRef createETypeRef()
  {
    ETypeRefImpl eTypeRef = new ETypeRefImpl();
    return eTypeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERequirements createERequirements()
  {
    ERequirementsImpl eRequirements = new ERequirementsImpl();
    return eRequirements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERequirementDefinition createERequirementDefinition()
  {
    ERequirementDefinitionImpl eRequirementDefinition = new ERequirementDefinitionImpl();
    return eRequirementDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ERequirementDefinitionBody createERequirementDefinitionBody()
  {
    ERequirementDefinitionBodyImpl eRequirementDefinitionBody = new ERequirementDefinitionBodyImpl();
    return eRequirementDefinitionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReqOrCap createEReqOrCap()
  {
    EReqOrCapImpl eReqOrCap = new EReqOrCapImpl();
    return eReqOrCap;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConstraints createEConstraints()
  {
    EConstraintsImpl eConstraints = new EConstraintsImpl();
    return eConstraints;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EConstraint createEConstraint()
  {
    EConstraintImpl eConstraint = new EConstraintImpl();
    return eConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EMaxLength createEMaxLength()
  {
    EMaxLengthImpl eMaxLength = new EMaxLengthImpl();
    return eMaxLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EMinLength createEMinLength()
  {
    EMinLengthImpl eMinLength = new EMinLengthImpl();
    return eMinLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELength createELength()
  {
    ELengthImpl eLength = new ELengthImpl();
    return eLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EValid_Values createEValid_Values()
  {
    EValid_ValuesImpl eValid_Values = new EValid_ValuesImpl();
    return eValid_Values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EInRange createEInRange()
  {
    EInRangeImpl eInRange = new EInRangeImpl();
    return eInRange;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELessOrEqual createELessOrEqual()
  {
    ELessOrEqualImpl eLessOrEqual = new ELessOrEqualImpl();
    return eLessOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ELessThan createELessThan()
  {
    ELessThanImpl eLessThan = new ELessThanImpl();
    return eLessThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EGreaterOrEqual createEGreaterOrEqual()
  {
    EGreaterOrEqualImpl eGreaterOrEqual = new EGreaterOrEqualImpl();
    return eGreaterOrEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EGreaterThan createEGreaterThan()
  {
    EGreaterThanImpl eGreaterThan = new EGreaterThanImpl();
    return eGreaterThan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EEqual createEEqual()
  {
    EEqualImpl eEqual = new EEqualImpl();
    return eEqual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RMPackage getRMPackage()
  {
    return (RMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static RMPackage getPackage()
  {
    return RMPackage.eINSTANCE;
  }

} //RMFactoryImpl