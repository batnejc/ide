/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EParameter Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EParameterDefinition#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EParameterDefinition#getValue <em>Value</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EParameterDefinition#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition()
 * @model
 * @generated
 */
public interface EParameterDefinition extends EObject
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
   * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EParameterDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(EValueExpression)
   * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition_Value()
   * @model containment="true"
   * @generated
   */
  EValueExpression getValue();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EParameterDefinition#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(EValueExpression value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' containment reference.
   * @see #setDefault(EValueExpression)
   * @see org.sodalite.dsl.rM.RMPackage#getEParameterDefinition_Default()
   * @model containment="true"
   * @generated
   */
  EValueExpression getDefault();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EParameterDefinition#getDefault <em>Default</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' containment reference.
   * @see #getDefault()
   * @generated
   */
  void setDefault(EValueExpression value);

} // EParameterDefinition
