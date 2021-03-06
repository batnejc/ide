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

import org.sodalite.dsl.rM.EInterfaceType;
import org.sodalite.dsl.rM.EInterfaceTypes;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EInterface Types</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EInterfaceTypesImpl#getInterfaceTypes <em>Interface Types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EInterfaceTypesImpl extends MinimalEObjectImpl.Container implements EInterfaceTypes
{
  /**
   * The cached value of the '{@link #getInterfaceTypes() <em>Interface Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaceTypes()
   * @generated
   * @ordered
   */
  protected EList<EInterfaceType> interfaceTypes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EInterfaceTypesImpl()
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
    return RMPackage.Literals.EINTERFACE_TYPES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<EInterfaceType> getInterfaceTypes()
  {
    if (interfaceTypes == null)
    {
      interfaceTypes = new EObjectContainmentEList<EInterfaceType>(EInterfaceType.class, this, RMPackage.EINTERFACE_TYPES__INTERFACE_TYPES);
    }
    return interfaceTypes;
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
      case RMPackage.EINTERFACE_TYPES__INTERFACE_TYPES:
        return ((InternalEList<?>)getInterfaceTypes()).basicRemove(otherEnd, msgs);
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
      case RMPackage.EINTERFACE_TYPES__INTERFACE_TYPES:
        return getInterfaceTypes();
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
      case RMPackage.EINTERFACE_TYPES__INTERFACE_TYPES:
        getInterfaceTypes().clear();
        getInterfaceTypes().addAll((Collection<? extends EInterfaceType>)newValue);
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
      case RMPackage.EINTERFACE_TYPES__INTERFACE_TYPES:
        getInterfaceTypes().clear();
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
      case RMPackage.EINTERFACE_TYPES__INTERFACE_TYPES:
        return interfaceTypes != null && !interfaceTypes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EInterfaceTypesImpl
