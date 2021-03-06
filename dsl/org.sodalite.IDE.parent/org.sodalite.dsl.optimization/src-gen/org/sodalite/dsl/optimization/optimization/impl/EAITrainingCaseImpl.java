/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.sodalite.dsl.optimization.optimization.EAITraining;
import org.sodalite.dsl.optimization.optimization.EAITrainingCase;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAI Training Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingCaseImpl#getAi_training <em>Ai training</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAITrainingCaseImpl extends EOptimizationCasesImpl implements EAITrainingCase
{
  /**
   * The cached value of the '{@link #getAi_training() <em>Ai training</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAi_training()
   * @generated
   * @ordered
   */
  protected EAITraining ai_training;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAITrainingCaseImpl()
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
    return OptimizationPackage.Literals.EAI_TRAINING_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAITraining getAi_training()
  {
    return ai_training;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAi_training(EAITraining newAi_training, NotificationChain msgs)
  {
    EAITraining oldAi_training = ai_training;
    ai_training = newAi_training;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING, oldAi_training, newAi_training);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAi_training(EAITraining newAi_training)
  {
    if (newAi_training != ai_training)
    {
      NotificationChain msgs = null;
      if (ai_training != null)
        msgs = ((InternalEObject)ai_training).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING, null, msgs);
      if (newAi_training != null)
        msgs = ((InternalEObject)newAi_training).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING, null, msgs);
      msgs = basicSetAi_training(newAi_training, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING, newAi_training, newAi_training));
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
      case OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING:
        return basicSetAi_training(null, msgs);
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
      case OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING:
        return getAi_training();
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
      case OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING:
        setAi_training((EAITraining)newValue);
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
      case OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING:
        setAi_training((EAITraining)null);
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
      case OptimizationPackage.EAI_TRAINING_CASE__AI_TRAINING:
        return ai_training != null;
    }
    return super.eIsSet(featureID);
  }

} //EAITrainingCaseImpl
