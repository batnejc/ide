/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInterface Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceDefinition#getType <em>Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceDefinition#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EInterfaceDefinition#getOperations <em>Operations</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceDefinition()
 * @model
 * @generated
 */
public interface EInterfaceDefinition extends EObject
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
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EInterfaceType)
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceDefinition_Type()
   * @model
   * @generated
   */
  EInterfaceType getType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceDefinition#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EInterfaceType value);

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
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceDefinition_Inputs()
   * @model containment="true"
   * @generated
   */
  EProperties getInputs();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceDefinition#getInputs <em>Inputs</em>}' containment reference.
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
   * @see org.sodalite.dsl.rM.RMPackage#getEInterfaceDefinition_Operations()
   * @model containment="true"
   * @generated
   */
  EOperations getOperations();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EInterfaceDefinition#getOperations <em>Operations</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operations</em>' containment reference.
   * @see #getOperations()
   * @generated
   */
  void setOperations(EOperations value);

} // EInterfaceDefinition
