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

import org.sodalite.dsl.rM.ETypeRef;
import org.sodalite.dsl.rM.EValidSourceType;
import org.sodalite.dsl.rM.RMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EValid Source Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.impl.EValidSourceTypeImpl#getSourceTypes <em>Source Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.impl.EValidSourceTypeImpl#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EValidSourceTypeImpl extends MinimalEObjectImpl.Container implements EValidSourceType
{
  /**
   * The cached value of the '{@link #getSourceTypes() <em>Source Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceTypes()
   * @generated
   * @ordered
   */
  protected EList<ETypeRef> sourceTypes;

  /**
   * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceType()
   * @generated
   * @ordered
   */
  protected EList<ETypeRef> sourceType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EValidSourceTypeImpl()
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
    return RMPackage.Literals.EVALID_SOURCE_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ETypeRef> getSourceTypes()
  {
    if (sourceTypes == null)
    {
      sourceTypes = new EObjectContainmentEList<ETypeRef>(ETypeRef.class, this, RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPES);
    }
    return sourceTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ETypeRef> getSourceType()
  {
    if (sourceType == null)
    {
      sourceType = new EObjectContainmentEList<ETypeRef>(ETypeRef.class, this, RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPE);
    }
    return sourceType;
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
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPES:
        return ((InternalEList<?>)getSourceTypes()).basicRemove(otherEnd, msgs);
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPE:
        return ((InternalEList<?>)getSourceType()).basicRemove(otherEnd, msgs);
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
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPES:
        return getSourceTypes();
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPE:
        return getSourceType();
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
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPES:
        getSourceTypes().clear();
        getSourceTypes().addAll((Collection<? extends ETypeRef>)newValue);
        return;
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPE:
        getSourceType().clear();
        getSourceType().addAll((Collection<? extends ETypeRef>)newValue);
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
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPES:
        getSourceTypes().clear();
        return;
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPE:
        getSourceType().clear();
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
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPES:
        return sourceTypes != null && !sourceTypes.isEmpty();
      case RMPackage.EVALID_SOURCE_TYPE__SOURCE_TYPE:
        return sourceType != null && !sourceType.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EValidSourceTypeImpl
