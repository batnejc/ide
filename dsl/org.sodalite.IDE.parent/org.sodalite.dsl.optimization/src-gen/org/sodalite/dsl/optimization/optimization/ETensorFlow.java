/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETensor Flow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.ETensorFlow#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.ETensorFlow#isXla <em>Xla</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getETensorFlow()
 * @model
 * @generated
 */
public interface ETensorFlow extends EObject
{
  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute.
   * @see #setVersion(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getETensorFlow_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.ETensorFlow#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Xla</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xla</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xla</em>' attribute.
   * @see #setXla(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getETensorFlow_Xla()
   * @model
   * @generated
   */
  boolean isXla();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.ETensorFlow#isXla <em>Xla</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xla</em>' attribute.
   * @see #isXla()
   * @generated
   */
  void setXla(boolean value);

} // ETensorFlow
