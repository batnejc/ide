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

import org.sodalite.dsl.optimization.optimization.EAITrainingData;
import org.sodalite.dsl.optimization.optimization.EAITrainingETL;
import org.sodalite.dsl.optimization.optimization.OptimizationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EAI Training Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingDataImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingDataImpl#getBasedata <em>Basedata</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingDataImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingDataImpl#getCount <em>Count</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.impl.EAITrainingDataImpl#getEtl <em>Etl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EAITrainingDataImpl extends MinimalEObjectImpl.Container implements EAITrainingData
{
  /**
   * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected static final String LOCATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLocation()
   * @generated
   * @ordered
   */
  protected String location = LOCATION_EDEFAULT;

  /**
   * The default value of the '{@link #getBasedata() <em>Basedata</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasedata()
   * @generated
   * @ordered
   */
  protected static final String BASEDATA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBasedata() <em>Basedata</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasedata()
   * @generated
   * @ordered
   */
  protected String basedata = BASEDATA_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final int SIZE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected int size = SIZE_EDEFAULT;

  /**
   * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected static final int COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCount()
   * @generated
   * @ordered
   */
  protected int count = COUNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getEtl() <em>Etl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtl()
   * @generated
   * @ordered
   */
  protected EAITrainingETL etl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EAITrainingDataImpl()
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
    return OptimizationPackage.Literals.EAI_TRAINING_DATA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLocation()
  {
    return location;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLocation(String newLocation)
  {
    String oldLocation = location;
    location = newLocation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_DATA__LOCATION, oldLocation, location));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBasedata()
  {
    return basedata;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBasedata(String newBasedata)
  {
    String oldBasedata = basedata;
    basedata = newBasedata;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_DATA__BASEDATA, oldBasedata, basedata));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSize(int newSize)
  {
    int oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_DATA__SIZE, oldSize, size));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getCount()
  {
    return count;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCount(int newCount)
  {
    int oldCount = count;
    count = newCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_DATA__COUNT, oldCount, count));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAITrainingETL getEtl()
  {
    return etl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEtl(EAITrainingETL newEtl, NotificationChain msgs)
  {
    EAITrainingETL oldEtl = etl;
    etl = newEtl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_DATA__ETL, oldEtl, newEtl);
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
  public void setEtl(EAITrainingETL newEtl)
  {
    if (newEtl != etl)
    {
      NotificationChain msgs = null;
      if (etl != null)
        msgs = ((InternalEObject)etl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING_DATA__ETL, null, msgs);
      if (newEtl != null)
        msgs = ((InternalEObject)newEtl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OptimizationPackage.EAI_TRAINING_DATA__ETL, null, msgs);
      msgs = basicSetEtl(newEtl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, OptimizationPackage.EAI_TRAINING_DATA__ETL, newEtl, newEtl));
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
      case OptimizationPackage.EAI_TRAINING_DATA__ETL:
        return basicSetEtl(null, msgs);
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
      case OptimizationPackage.EAI_TRAINING_DATA__LOCATION:
        return getLocation();
      case OptimizationPackage.EAI_TRAINING_DATA__BASEDATA:
        return getBasedata();
      case OptimizationPackage.EAI_TRAINING_DATA__SIZE:
        return getSize();
      case OptimizationPackage.EAI_TRAINING_DATA__COUNT:
        return getCount();
      case OptimizationPackage.EAI_TRAINING_DATA__ETL:
        return getEtl();
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
      case OptimizationPackage.EAI_TRAINING_DATA__LOCATION:
        setLocation((String)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__BASEDATA:
        setBasedata((String)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__SIZE:
        setSize((Integer)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__COUNT:
        setCount((Integer)newValue);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__ETL:
        setEtl((EAITrainingETL)newValue);
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
      case OptimizationPackage.EAI_TRAINING_DATA__LOCATION:
        setLocation(LOCATION_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__BASEDATA:
        setBasedata(BASEDATA_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__COUNT:
        setCount(COUNT_EDEFAULT);
        return;
      case OptimizationPackage.EAI_TRAINING_DATA__ETL:
        setEtl((EAITrainingETL)null);
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
      case OptimizationPackage.EAI_TRAINING_DATA__LOCATION:
        return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
      case OptimizationPackage.EAI_TRAINING_DATA__BASEDATA:
        return BASEDATA_EDEFAULT == null ? basedata != null : !BASEDATA_EDEFAULT.equals(basedata);
      case OptimizationPackage.EAI_TRAINING_DATA__SIZE:
        return size != SIZE_EDEFAULT;
      case OptimizationPackage.EAI_TRAINING_DATA__COUNT:
        return count != COUNT_EDEFAULT;
      case OptimizationPackage.EAI_TRAINING_DATA__ETL:
        return etl != null;
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
    result.append(" (location: ");
    result.append(location);
    result.append(", basedata: ");
    result.append(basedata);
    result.append(", size: ");
    result.append(size);
    result.append(", count: ");
    result.append(count);
    result.append(')');
    return result.toString();
  }

} //EAITrainingDataImpl
