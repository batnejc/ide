/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.dsl.rM.EPropertyDefinition;
import org.sodalite.dsl.rM.GetProperty;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.GetPropertyImpl#getProperty <em>Property</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetPropertyImpl extends EFunctionImpl implements GetProperty
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected EPropertyDefinition property;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetPropertyImpl()
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
    return RMPackage.Literals.GET_PROPERTY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EPropertyDefinition getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (EPropertyDefinition)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.GET_PROPERTY__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EPropertyDefinition basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(EPropertyDefinition newProperty)
  {
    EPropertyDefinition oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.GET_PROPERTY__PROPERTY, oldProperty, property));
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
      case RMPackage.GET_PROPERTY__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RMPackage.GET_PROPERTY__PROPERTY:
        setProperty((EPropertyDefinition)newValue);
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
      case RMPackage.GET_PROPERTY__PROPERTY:
        setProperty((EPropertyDefinition)null);
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
      case RMPackage.GET_PROPERTY__PROPERTY:
        return property != null;
    }
    return super.eIsSet(featureID);
  }

} //GetPropertyImpl
