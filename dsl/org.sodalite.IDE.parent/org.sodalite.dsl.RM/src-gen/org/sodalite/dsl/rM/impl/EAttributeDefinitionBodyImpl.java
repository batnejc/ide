/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.rM.EAttributeDefinitionBody;
import org.sodalite.dsl.rM.EDataType;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAttribute Definition Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EAttributeDefinitionBodyImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EAttributeDefinitionBodyImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EAttributeDefinitionBodyImpl#getEntry_schema <em>Entry schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAttributeDefinitionBodyImpl extends MinimalEObjectImpl.Container implements EAttributeDefinitionBody
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected EDataType type;

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
   * The cached value of the '{@link #getEntry_schema() <em>Entry schema</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry_schema()
   * @generated
   * @ordered
   */
  protected EDataType entry_schema;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAttributeDefinitionBodyImpl()
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
    return RMPackage.Literals.EATTRIBUTE_DEFINITION_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (EDataType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.EATTRIBUTE_DEFINITION_BODY__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(EDataType newType)
  {
    EDataType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EATTRIBUTE_DEFINITION_BODY__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EATTRIBUTE_DEFINITION_BODY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EDataType getEntry_schema()
  {
    if (entry_schema != null && entry_schema.eIsProxy())
    {
      InternalEObject oldEntry_schema = (InternalEObject)entry_schema;
      entry_schema = (EDataType)eResolveProxy(oldEntry_schema);
      if (entry_schema != oldEntry_schema)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RMPackage.EATTRIBUTE_DEFINITION_BODY__ENTRY_SCHEMA, oldEntry_schema, entry_schema));
      }
    }
    return entry_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EDataType basicGetEntry_schema()
  {
    return entry_schema;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEntry_schema(EDataType newEntry_schema)
  {
    EDataType oldEntry_schema = entry_schema;
    entry_schema = newEntry_schema;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RMPackage.EATTRIBUTE_DEFINITION_BODY__ENTRY_SCHEMA, oldEntry_schema, entry_schema));
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
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__TYPE:
        if (resolve) return getType();
        return basicGetType();
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__DESCRIPTION:
        return getDescription();
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__ENTRY_SCHEMA:
        if (resolve) return getEntry_schema();
        return basicGetEntry_schema();
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
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__TYPE:
        setType((EDataType)newValue);
        return;
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__ENTRY_SCHEMA:
        setEntry_schema((EDataType)newValue);
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
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__TYPE:
        setType((EDataType)null);
        return;
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__ENTRY_SCHEMA:
        setEntry_schema((EDataType)null);
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
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__TYPE:
        return type != null;
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case RMPackage.EATTRIBUTE_DEFINITION_BODY__ENTRY_SCHEMA:
        return entry_schema != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EAttributeDefinitionBodyImpl
