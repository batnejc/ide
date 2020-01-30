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
import org.sodalite.dsl.rM.EInterfaces;
import org.sodalite.dsl.rM.EProperties;
import org.sodalite.dsl.rM.ERelationshipType;
import org.sodalite.dsl.rM.ERelationshipTypeBody;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ERelationship Type Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypeBodyImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypeBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypeBodyImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypeBodyImpl#getAtributes <em>Atributes</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypeBodyImpl#getInterfaces <em>Interfaces</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.ERelationshipTypeBodyImpl#getValid_target_types <em>Valid target types</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ERelationshipTypeBodyImpl extends MinimalEObjectImpl.Container implements ERelationshipTypeBody
{
  /**
   * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperType()
   * @generated
   * @ordered
   */
  protected ERelationshipType superType;

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
   * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterfaces()
   * @generated
   * @ordered
   */
  protected EInterfaces interfaces;

  /**
   * The default value of the '{@link #getValid_target_types() <em>Valid target types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValid_target_types()
   * @generated
   * @ordered
   */
  protected static final String VALID_TARGET_TYPES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValid_target_types() <em>Valid target types</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValid_target_types()
   * @generated
   * @ordered
   */
  protected String valid_target_types = VALID_TARGET_TYPES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ERelationshipTypeBodyImpl()
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
    return RMPackage.Literals.ERELATIONSHIP_TYPE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ERelationshipType getSuperType()
  {
    if (superType != null && superType.eIsProxy())
    {
      InternalEObject oldSuperType = (InternalEObject)superType;
      superType = (ERelationshipType)eResolveProxy(oldSuperType);
      if (superType != oldSuperType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.ERELATIONSHIP_TYPE_BODY__SUPER_TYPE, oldSuperType, superType));
      }
    }
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ERelationshipType basicGetSuperType()
  {
    return superType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperType(ERelationshipType newSuperType)
  {
    ERelationshipType oldSuperType = superType;
    superType = newSuperType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__SUPER_TYPE, oldSuperType, superType));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__DESCRIPTION, oldDescription, description));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES, oldProperties, newProperties);
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
        msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES, null, msgs);
      if (newProperties != null)
        msgs = ((InternalEObject)newProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES, null, msgs);
      msgs = basicSetProperties(newProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES, newProperties, newProperties));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES, oldAtributes, newAtributes);
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
        msgs = ((InternalEObject)atributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES, null, msgs);
      if (newAtributes != null)
        msgs = ((InternalEObject)newAtributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES, null, msgs);
      msgs = basicSetAtributes(newAtributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES, newAtributes, newAtributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EInterfaces getInterfaces()
  {
    return interfaces;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterfaces(EInterfaces newInterfaces, NotificationChain msgs)
  {
    EInterfaces oldInterfaces = interfaces;
    interfaces = newInterfaces;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES, oldInterfaces, newInterfaces);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterfaces(EInterfaces newInterfaces)
  {
    if (newInterfaces != interfaces)
    {
      NotificationChain msgs = null;
      if (interfaces != null)
        msgs = ((InternalEObject)interfaces).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES, null, msgs);
      if (newInterfaces != null)
        msgs = ((InternalEObject)newInterfaces).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES, null, msgs);
      msgs = basicSetInterfaces(newInterfaces, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES, newInterfaces, newInterfaces));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValid_target_types()
  {
    return valid_target_types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValid_target_types(String newValid_target_types)
  {
    String oldValid_target_types = valid_target_types;
    valid_target_types = newValid_target_types;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.ERELATIONSHIP_TYPE_BODY__VALID_TARGET_TYPES, oldValid_target_types, valid_target_types));
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
      case RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES:
        return basicSetProperties(null, msgs);
      case RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES:
        return basicSetAtributes(null, msgs);
      case RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES:
        return basicSetInterfaces(null, msgs);
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
      case RMPackage.ERELATIONSHIP_TYPE_BODY__SUPER_TYPE:
        if (resolve) return getSuperType();
        return basicGetSuperType();
      case RMPackage.ERELATIONSHIP_TYPE_BODY__DESCRIPTION:
        return getDescription();
      case RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES:
        return getProperties();
      case RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES:
        return getAtributes();
      case RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES:
        return getInterfaces();
      case RMPackage.ERELATIONSHIP_TYPE_BODY__VALID_TARGET_TYPES:
        return getValid_target_types();
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
      case RMPackage.ERELATIONSHIP_TYPE_BODY__SUPER_TYPE:
        setSuperType((ERelationshipType)newValue);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES:
        setProperties((EProperties)newValue);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES:
        setAtributes((EAttributes)newValue);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES:
        setInterfaces((EInterfaces)newValue);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__VALID_TARGET_TYPES:
        setValid_target_types((String)newValue);
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
      case RMPackage.ERELATIONSHIP_TYPE_BODY__SUPER_TYPE:
        setSuperType((ERelationshipType)null);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES:
        setProperties((EProperties)null);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES:
        setAtributes((EAttributes)null);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES:
        setInterfaces((EInterfaces)null);
        return;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__VALID_TARGET_TYPES:
        setValid_target_types(VALID_TARGET_TYPES_EDEFAULT);
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
      case RMPackage.ERELATIONSHIP_TYPE_BODY__SUPER_TYPE:
        return superType != null;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.ERELATIONSHIP_TYPE_BODY__PROPERTIES:
        return properties != null;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__ATRIBUTES:
        return atributes != null;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__INTERFACES:
        return interfaces != null;
      case RMPackage.ERELATIONSHIP_TYPE_BODY__VALID_TARGET_TYPES:
        return VALID_TARGET_TYPES_EDEFAULT == null ? valid_target_types != null : !VALID_TARGET_TYPES_EDEFAULT.equals(valid_target_types);
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
    result.append(" (description: ");
    result.append(description);
    result.append(", valid_target_types: ");
    result.append(valid_target_types);
    result.append(')');
    return result.toString();
  }

} //ERelationshipTypeBodyImpl
