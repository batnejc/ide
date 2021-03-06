/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.sodalite.dsl.optimization.optimization.EAITrainingConfig;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAI Training Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingConfigImpl#getAi_framework <em>Ai framework</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingConfigImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingConfigImpl#isDistributed_training <em>Distributed training</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingConfigImpl#getLayers <em>Layers</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingConfigImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAITrainingConfigImpl extends MinimalEObjectImpl.Container implements EAITrainingConfig
{
  /**
   * The default value of the '{@link #getAi_framework() <em>Ai framework</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAi_framework()
   * @generated
   * @ordered
   */
  protected static final String AI_FRAMEWORK_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAi_framework() <em>Ai framework</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAi_framework()
   * @generated
   * @ordered
   */
  protected String ai_framework = AI_FRAMEWORK_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #isDistributed_training() <em>Distributed training</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistributed_training()
   * @generated
   * @ordered
   */
  protected static final boolean DISTRIBUTED_TRAINING_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDistributed_training() <em>Distributed training</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDistributed_training()
   * @generated
   * @ordered
   */
  protected boolean distributed_training = DISTRIBUTED_TRAINING_EDEFAULT;

  /**
   * The default value of the '{@link #getLayers() <em>Layers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayers()
   * @generated
   * @ordered
   */
  protected static final int LAYERS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLayers() <em>Layers</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLayers()
   * @generated
   * @ordered
   */
  protected int layers = LAYERS_EDEFAULT;

  /**
   * The default value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected static final int PARAMETERS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected int parameters = PARAMETERS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAITrainingConfigImpl()
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
    return OptimizationPackage.Literals.EAI_TRAINING_CONFIG;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAi_framework()
  {
    return ai_framework;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAi_framework(String newAi_framework)
  {
    String oldAi_framework = ai_framework;
    ai_framework = newAi_framework;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CONFIG__AI_FRAMEWORK, oldAi_framework, ai_framework));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CONFIG__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistributed_training()
  {
    return distributed_training;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDistributed_training(boolean newDistributed_training)
  {
    boolean oldDistributed_training = distributed_training;
    distributed_training = newDistributed_training;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CONFIG__DISTRIBUTED_TRAINING, oldDistributed_training, distributed_training));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLayers()
  {
    return layers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLayers(int newLayers)
  {
    int oldLayers = layers;
    layers = newLayers;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CONFIG__LAYERS, oldLayers, layers));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(int newParameters)
  {
    int oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_CONFIG__PARAMETERS, oldParameters, parameters));
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
      case OptimizationPackage.EAI_TRAINING_CONFIG__AI_FRAMEWORK:
        return getAi_framework();
      case OptimizationPackage.EAI_TRAINING_CONFIG__TYPE:
        return getType();
      case OptimizationPackage.EAI_TRAINING_CONFIG__DISTRIBUTED_TRAINING:
        return isDistributed_training();
      case OptimizationPackage.EAI_TRAINING_CONFIG__LAYERS:
        return getLayers();
      case OptimizationPackage.EAI_TRAINING_CONFIG__PARAMETERS:
        return getParameters();
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
      case OptimizationPackage.EAI_TRAINING_CONFIG__AI_FRAMEWORK:
        setAi_framework((String)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__TYPE:
        setType((String)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__DISTRIBUTED_TRAINING:
        setDistributed_training((Boolean)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__LAYERS:
        setLayers((Integer)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__PARAMETERS:
        setParameters((Integer)newValue);
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
      case OptimizationPackage.EAI_TRAINING_CONFIG__AI_FRAMEWORK:
        setAi_framework(AI_FRAMEWORK_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__DISTRIBUTED_TRAINING:
        setDistributed_training(DISTRIBUTED_TRAINING_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__LAYERS:
        setLayers(LAYERS_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_CONFIG__PARAMETERS:
        setParameters(PARAMETERS_EDEFAULT);
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
      case OptimizationPackage.EAI_TRAINING_CONFIG__AI_FRAMEWORK:
        return AI_FRAMEWORK_EDEFAULT == null ? ai_framework != null : !AI_FRAMEWORK_EDEFAULT.equals(ai_framework);
      case OptimizationPackage.EAI_TRAINING_CONFIG__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case OptimizationPackage.EAI_TRAINING_CONFIG__DISTRIBUTED_TRAINING:
        return distributed_training != DISTRIBUTED_TRAINING_EDEFAULT;
      case OptimizationPackage.EAI_TRAINING_CONFIG__LAYERS:
        return layers != LAYERS_EDEFAULT;
      case OptimizationPackage.EAI_TRAINING_CONFIG__PARAMETERS:
        return parameters != PARAMETERS_EDEFAULT;
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
    result.append(" (ai_framework: ");
    result.append(ai_framework);
    result.append(", type: ");
    result.append(type);
    result.append(", distributed_training: ");
    result.append(distributed_training);
    result.append(", layers: ");
    result.append(layers);
    result.append(", parameters: ");
    result.append(parameters);
    result.append(')');
    return result.toString();
  }

} //EAITrainingConfigImpl
