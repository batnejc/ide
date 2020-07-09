/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EAITrainingETL;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAI Training ETL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingETLImpl#getPrefetch <em>Prefetch</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingETLImpl#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAITrainingETLImpl extends MinimalEObjectImpl.Container implements EAITrainingETL
{
  /**
   * The default value of the '{@link #getPrefetch() <em>Prefetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefetch()
   * @generated
   * @ordered
   */
  protected static final int PREFETCH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPrefetch() <em>Prefetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrefetch()
   * @generated
   * @ordered
   */
  protected int prefetch = PREFETCH_EDEFAULT;

  /**
   * The default value of the '{@link #getCache() <em>Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCache()
   * @generated
   * @ordered
   */
  protected static final int CACHE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCache() <em>Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCache()
   * @generated
   * @ordered
   */
  protected int cache = CACHE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAITrainingETLImpl()
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
    return OptimizationPackage.Literals.EAI_TRAINING_ETL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPrefetch()
  {
    return prefetch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrefetch(int newPrefetch)
  {
    int oldPrefetch = prefetch;
    prefetch = newPrefetch;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_ETL__PREFETCH, oldPrefetch, prefetch));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getCache()
  {
    return cache;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCache(int newCache)
  {
    int oldCache = cache;
    cache = newCache;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_ETL__CACHE, oldCache, cache));
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
      case OptimizationPackage.EAI_TRAINING_ETL__PREFETCH:
        return getPrefetch();
      case OptimizationPackage.EAI_TRAINING_ETL__CACHE:
        return getCache();
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
      case OptimizationPackage.EAI_TRAINING_ETL__PREFETCH:
        setPrefetch((Integer)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_ETL__CACHE:
        setCache((Integer)newValue);
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
      case OptimizationPackage.EAI_TRAINING_ETL__PREFETCH:
        setPrefetch(PREFETCH_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_ETL__CACHE:
        setCache(CACHE_EDEFAULT);
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
      case OptimizationPackage.EAI_TRAINING_ETL__PREFETCH:
        return prefetch != PREFETCH_EDEFAULT;
      case OptimizationPackage.EAI_TRAINING_ETL__CACHE:
        return cache != CACHE_EDEFAULT;
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
    result.append(" (prefetch: ");
    result.append(prefetch);
    result.append(", cache: ");
    result.append(cache);
    result.append(')');
    return result.toString();
  }

} //EAITrainingETLImpl
