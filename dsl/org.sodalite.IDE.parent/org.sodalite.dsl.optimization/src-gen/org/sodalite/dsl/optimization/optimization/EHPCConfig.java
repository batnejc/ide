/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EHPC Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCConfig#getParallelisation <em>Parallelisation</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCConfig()
 * @model
 * @generated
 */
public interface EHPCConfig extends EObject
{
  /**
   * Returns the value of the '<em><b>Parallelisation</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parallelisation</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parallelisation</em>' attribute list.
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCConfig_Parallelisation()
   * @model unique="false"
   * @generated
   */
  EList<String> getParallelisation();

} // EHPCConfig
