/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.sodalite.dsl.rM.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.sodalite.dsl.rM.RMPackage
 * @generated
 */
public class RMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static RMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = RMPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RMSwitch<Adapter> modelSwitch =
    new RMSwitch<Adapter>()
    {
      @Override
      public Adapter caseRM_Model(RM_Model object)
      {
        return createRM_ModelAdapter();
      }
      @Override
      public Adapter caseEDataTypes(EDataTypes object)
      {
        return createEDataTypesAdapter();
      }
      @Override
      public Adapter caseEDataType(EDataType object)
      {
        return createEDataTypeAdapter();
      }
      @Override
      public Adapter caseEArtifactTypes(EArtifactTypes object)
      {
        return createEArtifactTypesAdapter();
      }
      @Override
      public Adapter caseEArtifactType(EArtifactType object)
      {
        return createEArtifactTypeAdapter();
      }
      @Override
      public Adapter caseECapabilityTypes(ECapabilityTypes object)
      {
        return createECapabilityTypesAdapter();
      }
      @Override
      public Adapter caseECapabilityType(ECapabilityType object)
      {
        return createECapabilityTypeAdapter();
      }
      @Override
      public Adapter caseEInterfaceTypes(EInterfaceTypes object)
      {
        return createEInterfaceTypesAdapter();
      }
      @Override
      public Adapter caseEInterfaceType(EInterfaceType object)
      {
        return createEInterfaceTypeAdapter();
      }
      @Override
      public Adapter caseEPolicyTypes(EPolicyTypes object)
      {
        return createEPolicyTypesAdapter();
      }
      @Override
      public Adapter caseEPolicyType(EPolicyType object)
      {
        return createEPolicyTypeAdapter();
      }
      @Override
      public Adapter caseENodeTypes(ENodeTypes object)
      {
        return createENodeTypesAdapter();
      }
      @Override
      public Adapter caseENodeType(ENodeType object)
      {
        return createENodeTypeAdapter();
      }
      @Override
      public Adapter caseERelationshipTypes(ERelationshipTypes object)
      {
        return createERelationshipTypesAdapter();
      }
      @Override
      public Adapter caseERelationshipType(ERelationshipType object)
      {
        return createERelationshipTypeAdapter();
      }
      @Override
      public Adapter caseEProperties(EProperties object)
      {
        return createEPropertiesAdapter();
      }
      @Override
      public Adapter caseEPropertyDefinition(EPropertyDefinition object)
      {
        return createEPropertyDefinitionAdapter();
      }
      @Override
      public Adapter caseEAttributes(EAttributes object)
      {
        return createEAttributesAdapter();
      }
      @Override
      public Adapter caseEAttributeDefinition(EAttributeDefinition object)
      {
        return createEAttributeDefinitionAdapter();
      }
      @Override
      public Adapter caseEInterfaces(EInterfaces object)
      {
        return createEInterfacesAdapter();
      }
      @Override
      public Adapter caseEInterfaceDefinition(EInterfaceDefinition object)
      {
        return createEInterfaceDefinitionAdapter();
      }
      @Override
      public Adapter caseEOperations(EOperations object)
      {
        return createEOperationsAdapter();
      }
      @Override
      public Adapter caseEOperationDefinition(EOperationDefinition object)
      {
        return createEOperationDefinitionAdapter();
      }
      @Override
      public Adapter caseEInputs(EInputs object)
      {
        return createEInputsAdapter();
      }
      @Override
      public Adapter caseEParameterDefinition(EParameterDefinition object)
      {
        return createEParameterDefinitionAdapter();
      }
      @Override
      public Adapter caseEValueExpression(EValueExpression object)
      {
        return createEValueExpressionAdapter();
      }
      @Override
      public Adapter caseEFunction(EFunction object)
      {
        return createEFunctionAdapter();
      }
      @Override
      public Adapter caseGetAttribute(GetAttribute object)
      {
        return createGetAttributeAdapter();
      }
      @Override
      public Adapter caseGetProperty(GetProperty object)
      {
        return createGetPropertyAdapter();
      }
      @Override
      public Adapter caseECapabilities(ECapabilities object)
      {
        return createECapabilitiesAdapter();
      }
      @Override
      public Adapter caseECapabilityDefinition(ECapabilityDefinition object)
      {
        return createECapabilityDefinitionAdapter();
      }
      @Override
      public Adapter caseEValidSourceType(EValidSourceType object)
      {
        return createEValidSourceTypeAdapter();
      }
      @Override
      public Adapter caseETypeRef(ETypeRef object)
      {
        return createETypeRefAdapter();
      }
      @Override
      public Adapter caseERequirements(ERequirements object)
      {
        return createERequirementsAdapter();
      }
      @Override
      public Adapter caseERequirementDefinition(ERequirementDefinition object)
      {
        return createERequirementDefinitionAdapter();
      }
      @Override
      public Adapter caseEReqOrCap(EReqOrCap object)
      {
        return createEReqOrCapAdapter();
      }
      @Override
      public Adapter caseEConstraints(EConstraints object)
      {
        return createEConstraintsAdapter();
      }
      @Override
      public Adapter caseEConstraint(EConstraint object)
      {
        return createEConstraintAdapter();
      }
      @Override
      public Adapter caseEMaxLength(EMaxLength object)
      {
        return createEMaxLengthAdapter();
      }
      @Override
      public Adapter caseEMinLength(EMinLength object)
      {
        return createEMinLengthAdapter();
      }
      @Override
      public Adapter caseELength(ELength object)
      {
        return createELengthAdapter();
      }
      @Override
      public Adapter caseEValid_Values(EValid_Values object)
      {
        return createEValid_ValuesAdapter();
      }
      @Override
      public Adapter caseEInRange(EInRange object)
      {
        return createEInRangeAdapter();
      }
      @Override
      public Adapter caseELessOrEqual(ELessOrEqual object)
      {
        return createELessOrEqualAdapter();
      }
      @Override
      public Adapter caseELessThan(ELessThan object)
      {
        return createELessThanAdapter();
      }
      @Override
      public Adapter caseEGreaterOrEqual(EGreaterOrEqual object)
      {
        return createEGreaterOrEqualAdapter();
      }
      @Override
      public Adapter caseEGreaterThan(EGreaterThan object)
      {
        return createEGreaterThanAdapter();
      }
      @Override
      public Adapter caseEEqual(EEqual object)
      {
        return createEEqualAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.RM_Model <em>RM Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.RM_Model
   * @generated
   */
  public Adapter createRM_ModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EDataTypes <em>EData Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EDataTypes
   * @generated
   */
  public Adapter createEDataTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EDataType <em>EData Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EDataType
   * @generated
   */
  public Adapter createEDataTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EArtifactTypes <em>EArtifact Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EArtifactTypes
   * @generated
   */
  public Adapter createEArtifactTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EArtifactType <em>EArtifact Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EArtifactType
   * @generated
   */
  public Adapter createEArtifactTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ECapabilityTypes <em>ECapability Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ECapabilityTypes
   * @generated
   */
  public Adapter createECapabilityTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ECapabilityType <em>ECapability Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ECapabilityType
   * @generated
   */
  public Adapter createECapabilityTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EInterfaceTypes <em>EInterface Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EInterfaceTypes
   * @generated
   */
  public Adapter createEInterfaceTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EInterfaceType <em>EInterface Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EInterfaceType
   * @generated
   */
  public Adapter createEInterfaceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EPolicyTypes <em>EPolicy Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EPolicyTypes
   * @generated
   */
  public Adapter createEPolicyTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EPolicyType <em>EPolicy Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EPolicyType
   * @generated
   */
  public Adapter createEPolicyTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ENodeTypes <em>ENode Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ENodeTypes
   * @generated
   */
  public Adapter createENodeTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ENodeType <em>ENode Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ENodeType
   * @generated
   */
  public Adapter createENodeTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ERelationshipTypes <em>ERelationship Types</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ERelationshipTypes
   * @generated
   */
  public Adapter createERelationshipTypesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ERelationshipType <em>ERelationship Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ERelationshipType
   * @generated
   */
  public Adapter createERelationshipTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EProperties <em>EProperties</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EProperties
   * @generated
   */
  public Adapter createEPropertiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EPropertyDefinition <em>EProperty Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EPropertyDefinition
   * @generated
   */
  public Adapter createEPropertyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EAttributes <em>EAttributes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EAttributes
   * @generated
   */
  public Adapter createEAttributesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EAttributeDefinition <em>EAttribute Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EAttributeDefinition
   * @generated
   */
  public Adapter createEAttributeDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EInterfaces <em>EInterfaces</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EInterfaces
   * @generated
   */
  public Adapter createEInterfacesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EInterfaceDefinition <em>EInterface Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EInterfaceDefinition
   * @generated
   */
  public Adapter createEInterfaceDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EOperations <em>EOperations</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EOperations
   * @generated
   */
  public Adapter createEOperationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EOperationDefinition <em>EOperation Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EOperationDefinition
   * @generated
   */
  public Adapter createEOperationDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EInputs <em>EInputs</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EInputs
   * @generated
   */
  public Adapter createEInputsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EParameterDefinition <em>EParameter Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EParameterDefinition
   * @generated
   */
  public Adapter createEParameterDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EValueExpression <em>EValue Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EValueExpression
   * @generated
   */
  public Adapter createEValueExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EFunction <em>EFunction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EFunction
   * @generated
   */
  public Adapter createEFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.GetAttribute <em>Get Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.GetAttribute
   * @generated
   */
  public Adapter createGetAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.GetProperty <em>Get Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.GetProperty
   * @generated
   */
  public Adapter createGetPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ECapabilities <em>ECapabilities</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ECapabilities
   * @generated
   */
  public Adapter createECapabilitiesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ECapabilityDefinition <em>ECapability Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ECapabilityDefinition
   * @generated
   */
  public Adapter createECapabilityDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EValidSourceType <em>EValid Source Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EValidSourceType
   * @generated
   */
  public Adapter createEValidSourceTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ETypeRef <em>EType Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ETypeRef
   * @generated
   */
  public Adapter createETypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ERequirements <em>ERequirements</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ERequirements
   * @generated
   */
  public Adapter createERequirementsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ERequirementDefinition <em>ERequirement Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ERequirementDefinition
   * @generated
   */
  public Adapter createERequirementDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EReqOrCap <em>EReq Or Cap</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EReqOrCap
   * @generated
   */
  public Adapter createEReqOrCapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EConstraints <em>EConstraints</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EConstraints
   * @generated
   */
  public Adapter createEConstraintsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EConstraint <em>EConstraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EConstraint
   * @generated
   */
  public Adapter createEConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EMaxLength <em>EMax Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EMaxLength
   * @generated
   */
  public Adapter createEMaxLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EMinLength <em>EMin Length</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EMinLength
   * @generated
   */
  public Adapter createEMinLengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ELength <em>ELength</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ELength
   * @generated
   */
  public Adapter createELengthAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EValid_Values <em>EValid Values</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EValid_Values
   * @generated
   */
  public Adapter createEValid_ValuesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EInRange <em>EIn Range</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EInRange
   * @generated
   */
  public Adapter createEInRangeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ELessOrEqual <em>ELess Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ELessOrEqual
   * @generated
   */
  public Adapter createELessOrEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.ELessThan <em>ELess Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.ELessThan
   * @generated
   */
  public Adapter createELessThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EGreaterOrEqual <em>EGreater Or Equal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EGreaterOrEqual
   * @generated
   */
  public Adapter createEGreaterOrEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EGreaterThan <em>EGreater Than</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EGreaterThan
   * @generated
   */
  public Adapter createEGreaterThanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.sodalite.dsl.rM.EEqual <em>EEqual</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.sodalite.dsl.rM.EEqual
   * @generated
   */
  public Adapter createEEqualAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //RMAdapterFactory
