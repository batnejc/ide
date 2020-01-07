/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EAttributes;
import org.sodalite.dsl.rM.ECapabilityType;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ECapability Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECapabilityTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECapabilityTypeImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECapabilityTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECapabilityTypeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ECapabilityTypeImpl#getAtributes <em>Atributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ECapabilityTypeImpl extends MinimalEObjectImpl.Container implements ECapabilityType
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected ECapabilityType superType;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EProperties properties;

  /**
   * The cached value of the '{@link #getAtributes() <em>Atributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtributes()
   * @generated
   * @ordered
   */
  protected EAttributes atributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ECapabilityTypeImpl()
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
    return RMPackage.Literals.ECAPABILITY_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECapabilityType getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (ECapabilityType)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.ECAPABILITY_TYPE__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ECapabilityType basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(ECapabilityType newSuperType)
  {
    ECapabilityType oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__SUPER_TYPE, oldSuperType, superType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EProperties getProperties()
  {
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProperties(EProperties newProperties, NotificationChain msgs)
  {
    EProperties oldProperties = properties;
    properties = newProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__PROPERTIES, oldProperties, newProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProperties(EProperties newProperties)
  {
    if (newProperties != properties)
    {
      NotificationChain msgs = null;
      if (properties != null)
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECAPABILITY_TYPE__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECAPABILITY_TYPE__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__PROPERTIES, newProperties, newProperties));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttributes getAtributes()
  {
    return atributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAtributes(EAttributes newAtributes, NotificationChain msgs)
  {
    EAttributes oldAtributes = atributes;
    atributes = newAtributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__ATRIBUTES, oldAtributes, newAtributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtributes(EAttributes newAtributes)
  {
    if (newAtributes != atributes)
    {
      NotificationChain msgs = null;
      if (atributes != null)
        msgs = ((InternalEObject)atributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECAPABILITY_TYPE__ATRIBUTES, null, msgs);
      if (newAtributes != null)
        msgs = ((InternalEObject)newAtributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ECAPABILITY_TYPE__ATRIBUTES, null, msgs);
      msgs = basicSetAtributes(newAtributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ECAPABILITY_TYPE__ATRIBUTES, newAtributes, newAtributes));
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
      case RMPackage.ECAPABILITY_TYPE__PROPERTIES:
        return basicSetProperties(null, msgs);
      case RMPackage.ECAPABILITY_TYPE__ATRIBUTES:
        return basicSetAtributes(null, msgs);
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
      case RMPackage.ECAPABILITY_TYPE__NAME:
        return getName();
      case RMPackage.ECAPABILITY_TYPE__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case RMPackage.ECAPABILITY_TYPE__DESCRIPTION:
        return getDescription();
      case RMPackage.ECAPABILITY_TYPE__PROPERTIES:
        return getProperties();
      case RMPackage.ECAPABILITY_TYPE__ATRIBUTES:
        return getAtributes();
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
      case RMPackage.ECAPABILITY_TYPE__NAME:
        setName((String)newValue);
        return;
      case RMPackage.ECAPABILITY_TYPE__SUPER_TYPE:
        setSuperType((ECapabilityType)newValue);
        return;
      case RMPackage.ECAPABILITY_TYPE__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.ECAPABILITY_TYPE__PROPERTIES:
        setProperties((EProperties)newValue);
        return;
      case RMPackage.ECAPABILITY_TYPE__ATRIBUTES:
        setAtributes((EAttributes)newValue);
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
      case RMPackage.ECAPABILITY_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RMPackage.ECAPABILITY_TYPE__SUPER_TYPE:
        setSuperType((ECapabilityType)null);
        return;
      case RMPackage.ECAPABILITY_TYPE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.ECAPABILITY_TYPE__PROPERTIES:
        setProperties((EProperties)null);
        return;
      case RMPackage.ECAPABILITY_TYPE__ATRIBUTES:
        setAtributes((EAttributes)null);
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
      case RMPackage.ECAPABILITY_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RMPackage.ECAPABILITY_TYPE__SUPER_TYPE:
        return superType != null;
      case RMPackage.ECAPABILITY_TYPE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.ECAPABILITY_TYPE__PROPERTIES:
        return properties != null;
      case RMPackage.ECAPABILITY_TYPE__ATRIBUTES:
        return atributes != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //ECapabilityTypeImpl
