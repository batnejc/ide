/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.optimization.optimization;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EHPCETL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCETL#isPrefetch <em>Prefetch</em>}</li>
 *   <li>{@link org.sodalite.dsl.optimization.optimization.EHPCETL#isCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCETL()
 * @model
 * @generated
 */
public interface EHPCETL extends EObject
{
  /**
   * Returns the value of the '<em><b>Prefetch</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prefetch</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prefetch</em>' attribute.
   * @see #setPrefetch(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCETL_Prefetch()
   * @model
   * @generated
   */
  boolean isPrefetch();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCETL#isPrefetch <em>Prefetch</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prefetch</em>' attribute.
   * @see #isPrefetch()
   * @generated
   */
  void setPrefetch(boolean value);

  /**
   * Returns the value of the '<em><b>Cache</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache</em>' attribute.
   * @see #setCache(boolean)
   * @see org.sodalite.dsl.optimization.optimization.OptimizationPackage#getEHPCETL_Cache()
   * @model
   * @generated
   */
  boolean isCache();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.optimization.optimization.EHPCETL#isCache <em>Cache</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache</em>' attribute.
   * @see #isCache()
   * @generated
   */
  void setCache(boolean value);

} // EHPCETL
