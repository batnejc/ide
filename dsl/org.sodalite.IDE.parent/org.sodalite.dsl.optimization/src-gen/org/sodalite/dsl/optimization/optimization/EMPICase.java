/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMPI Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EMPICase#getMpi <em>Mpi</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEMPICase()
 * @model
 * @generated
 */
public interface EMPICase extends EObject
{
  /**
   * Returns the value of the '<em><b>Mpi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mpi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mpi</em>' containment reference.
   * @see #setMpi(EMPI)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEMPICase_Mpi()
   * @model containment="true"
   * @generated
   */
  EMPI getMpi();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EMPICase#getMpi <em>Mpi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mpi</em>' containment reference.
   * @see #getMpi()
   * @generated
   */
  void setMpi(EMPI value);

} // EMPICase
