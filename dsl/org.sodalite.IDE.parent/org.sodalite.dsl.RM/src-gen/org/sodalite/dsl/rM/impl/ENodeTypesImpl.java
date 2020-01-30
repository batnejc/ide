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

import org.sodalite.dsl.rM.ENodeType;
import org.sodalite.dsl.rM.ENodeTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ENode Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ENodeTypesImpl#getNodeTypes <em>Node Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ENodeTypesImpl extends MinimalEObjectImpl.Container implements ENodeTypes
{
  /**
   * The cached value of the '{@link #getNodeTypes() <em>Node Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeTypes()
   * @generated
   * @ordered
   */
  protected EList<ENodeType> nodeTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ENodeTypesImpl()
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
    return RMPackage.Literals.ENODE_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ENodeType> getNodeTypes()
  {
    if (nodeTypes == null)
    {
      nodeTypes = new EObjectContainmentEList<ENodeType>(ENodeType.class, this, RMPackage.ENODE_TYPES__NODE_TYPES);
    }
    return nodeTypes;
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
      case RMPackage.ENODE_TYPES__NODE_TYPES:
        return ((InternalEList<?>)getNodeTypes()).basicRemove(otherEnd, msgs);
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
      case RMPackage.ENODE_TYPES__NODE_TYPES:
        return getNodeTypes();
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
      case RMPackage.ENODE_TYPES__NODE_TYPES:
        getNodeTypes().clear();
        getNodeTypes().addAll((Collection<? extends ENodeType>)newValue);
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
      case RMPackage.ENODE_TYPES__NODE_TYPES:
        getNodeTypes().clear();
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
      case RMPackage.ENODE_TYPES__NODE_TYPES:
        return nodeTypes != null && !nodeTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ENodeTypesImpl