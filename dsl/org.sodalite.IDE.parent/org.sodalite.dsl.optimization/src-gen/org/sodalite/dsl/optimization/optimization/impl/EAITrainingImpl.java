/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EAITraining;
import org.sodalite.dsl.optimization.optimization.EAITrainingCases;
import org.sodalite.dsl.optimization.optimization.EAITrainingConfig;
import org.sodalite.dsl.optimization.optimization.EAITrainingData;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAI Training</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingImpl#getAitrainingcase <em>Aitrainingcase</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAITrainingImpl extends MinimalEObjectImpl.Container implements EAITraining
{
  /**
   * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfig()
   * @generated
   * @ordered
   */
  protected EAITrainingConfig config;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected EAITrainingData data;

  /**
   * The cached value of the '{@link #getAitrainingcase() <em>Aitrainingcase</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAitrainingcase()
   * @generated
   * @ordered
   */
  protected EAITrainingCases aitrainingcase;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAITrainingImpl()
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
    return OptimizationPackage.Literals.EAI_TRAINING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAITrainingConfig getConfig()
  {
    return config;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConfig(EAITrainingConfig newConfig, NotificationChain msgs)
  {
    EAITrainingConfig oldConfig = config;
    config = newConfig;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING__CONFIG, oldConfig, newConfig);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setConfig(EAITrainingConfig newConfig)
  {
    if (newConfig != config)
    {
      NotificationChain msgs = null;
      if (config != null)
        msgs = ((InternalEObject)config).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING__CONFIG, null, msgs);
      if (newConfig != null)
        msgs = ((InternalEObject)newConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING__CONFIG, null, msgs);
      msgs = basicSetConfig(newConfig, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING__CONFIG, newConfig, newConfig));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAITrainingData getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(EAITrainingData newData, NotificationChain msgs)
  {
    EAITrainingData oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setData(EAITrainingData newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAITrainingCases getAitrainingcase()
  {
    return aitrainingcase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAitrainingcase(EAITrainingCases newAitrainingcase, NotificationChain msgs)
  {
    EAITrainingCases oldAitrainingcase = aitrainingcase;
    aitrainingcase = newAitrainingcase;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING__AITRAININGCASE, oldAitrainingcase, newAitrainingcase);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAitrainingcase(EAITrainingCases newAitrainingcase)
  {
    if (newAitrainingcase != aitrainingcase)
    {
      NotificationChain msgs = null;
      if (aitrainingcase != null)
        msgs = ((InternalEObject)aitrainingcase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING__AITRAININGCASE, null, msgs);
      if (newAitrainingcase != null)
        msgs = ((InternalEObject)newAitrainingcase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING__AITRAININGCASE, null, msgs);
      msgs = basicSetAitrainingcase(newAitrainingcase, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING__AITRAININGCASE, newAitrainingcase, newAitrainingcase));
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
      case OptimizationPackage.EAI_TRAINING__CONFIG:
        return basicSetConfig(null, msgs);
      case OptimizationPackage.EAI_TRAINING__DATA:
        return basicSetData(null, msgs);
      case OptimizationPackage.EAI_TRAINING__AITRAININGCASE:
        return basicSetAitrainingcase(null, msgs);
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
      case OptimizationPackage.EAI_TRAINING__CONFIG:
        return getConfig();
      case OptimizationPackage.EAI_TRAINING__DATA:
        return getData();
      case OptimizationPackage.EAI_TRAINING__AITRAININGCASE:
        return getAitrainingcase();
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
      case OptimizationPackage.EAI_TRAINING__CONFIG:
        setConfig((EAITrainingConfig)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING__DATA:
        setData((EAITrainingData)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING__AITRAININGCASE:
        setAitrainingcase((EAITrainingCases)newValue);
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
      case OptimizationPackage.EAI_TRAINING__CONFIG:
        setConfig((EAITrainingConfig)null);
        return;
      case OptimizationPackage.EAI_TRAINING__DATA:
        setData((EAITrainingData)null);
        return;
      case OptimizationPackage.EAI_TRAINING__AITRAININGCASE:
        setAitrainingcase((EAITrainingCases)null);
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
      case OptimizationPackage.EAI_TRAINING__CONFIG:
        return config != null;
      case OptimizationPackage.EAI_TRAINING__DATA:
        return data != null;
      case OptimizationPackage.EAI_TRAINING__AITRAININGCASE:
        return aitrainingcase != null;
    }
    return super.eIsSet(featureID);
  }

} //EAITrainingImpl
