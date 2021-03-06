/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EOPENCL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOPENCL#getCompiler <em>Compiler</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOPENCL#getVersion <em>Version</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EOPENCL#getNumber_of_acc <em>Number of acc</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENCL()
 * @model
 * @generated
 */
public interface EOPENCL extends EObject
{
  /**
   * Returns the value of the '<em><b>Compiler</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Compiler</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Compiler</em>' attribute.
   * @see #setCompiler(String)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENCL_Compiler()
   * @model
   * @generated
   */
  String getCompiler();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOPENCL#getCompiler <em>Compiler</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Compiler</em>' attribute.
   * @see #getCompiler()
   * @generated
   */
  void setCompiler(String value);

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
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENCL_Version()
   * @model
   * @generated
   */
  String getVersion();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOPENCL#getVersion <em>Version</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Version</em>' attribute.
   * @see #getVersion()
   * @generated
   */
  void setVersion(String value);

  /**
   * Returns the value of the '<em><b>Number of acc</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Number of acc</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Number of acc</em>' attribute.
   * @see #setNumber_of_acc(int)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEOPENCL_Number_of_acc()
   * @model
   * @generated
   */
  int getNumber_of_acc();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EOPENCL#getNumber_of_acc <em>Number of acc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Number of acc</em>' attribute.
   * @see #getNumber_of_acc()
   * @generated
   */
  void setNumber_of_acc(int value);

} // EOPENCL
