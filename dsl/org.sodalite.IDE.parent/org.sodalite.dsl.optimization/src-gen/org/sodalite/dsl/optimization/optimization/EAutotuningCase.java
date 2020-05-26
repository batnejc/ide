/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.optimization.optimization;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAutotuning Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EAutotuningCase#getHpc <em>Hpc</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAutotuningCase()
 * @model
 * @generated
 */
public interface EAutotuningCase extends EOptimizationCases
{
  /**
   * Returns the value of the '<em><b>Hpc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hpc</em>' containment reference.
   * @see #setHpc(EHPC)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEAutotuningCase_Hpc()
   * @model containment="true"
   * @generated
   */
  EHPC getHpc();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EAutotuningCase#getHpc <em>Hpc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Hpc</em>' containment reference.
   * @see #getHpc()
   * @generated
   */
  void setHpc(EHPC value);

} // EAutotuningCase