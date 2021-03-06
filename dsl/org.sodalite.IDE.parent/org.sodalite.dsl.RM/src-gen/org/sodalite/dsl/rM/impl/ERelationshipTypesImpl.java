/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.sodalite.dsl.rM.ERelationshipType;
import org.sodalite.dsl.rM.ERelationshipTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERelationship Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypesImpl#getRelationshipTypes <em>Relationship Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERelationshipTypesImpl extends MinimalEObjectImpl.Container implements ERelationshipTypes
{
  /**
   * The cached value of the '{@link #getRelationshipTypes() <em>Relationship Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationshipTypes()
   * @generated
   * @ordered
   */
  protected EList<ERelationshipType> relationshipTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ERelationshipTypesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RMPackage.Literals.ERELATIONSHIP_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ERelationshipType> getRelationshipTypes()
  {
    if (relationshipTypes == null)
    {
      relationshipTypes = new EObjectContainmentEList<ERelationshipType>(ERelationshipType.class, this, RMPackage.ERELATIONSHIP_TYPES__RELATIONSHIP_TYPES);
    }
    return relationshipTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RMPackage.ERELATIONSHIP_TYPES__RELATIONSHIP_TYPES:
        return ((InternalEList<?>)getRelationshipTypes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RMPackage.ERELATIONSHIP_TYPES__RELATIONSHIP_TYPES:
        return getRelationshipTypes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RMPackage.ERELATIONSHIP_TYPES__RELATIONSHIP_TYPES:
        getRelationshipTypes().clear();
        getRelationshipTypes().addAll((Collection<? extends ERelationshipType>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RMPackage.ERELATIONSHIP_TYPES__RELATIONSHIP_TYPES:
        getRelationshipTypes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RMPackage.ERELATIONSHIP_TYPES__RELATIONSHIP_TYPES:
        return relationshipTypes != null && !relationshipTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ERelationshipTypesImpl
