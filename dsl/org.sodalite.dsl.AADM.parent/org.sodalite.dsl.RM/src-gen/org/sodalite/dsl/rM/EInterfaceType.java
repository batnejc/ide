/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInterface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceType#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceType#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceType#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceType()
 * @model
 * @generated
 */
public interface EInterfaceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(EInterfaceType)
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceType_SuperType()
   * @model
   * @generated
   */
  EInterfaceType getSuperType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(EInterfaceType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceType_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceType#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Inputs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inputs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' containment reference.
   * @see #setInputs(EProperties)
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceType_Inputs()
   * @model containment="true"
   * @generated
   */
  EProperties getInputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceType#getInputs <em>Inputs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inputs</em>' containment reference.
   * @see #getInputs()
   * @generated
   */
  void setInputs(EProperties value);

  /**
   * Returns the value of the '<em><b>Operations</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Operations</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operations</em>' containment reference.
   * @see #setOperations(EOperations)
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceType_Operations()
   * @model containment="true"
   * @generated
   */
  EOperations getOperations();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceType#getOperations <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operations</em>' containment reference.
   * @see #getOperations()
   * @generated
   */
  void setOperations(EOperations value);

} // EInterfaceType
