/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EType Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.ETypeRef#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getETypeRef()
 * @model
 * @generated
 */
public interface ETypeRef extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ENodeType)
   * @see org.sodalite.dsl.rM.RMPackage#getETypeRef_Name()
   * @model
   * @generated
   */
  ENodeType getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.ETypeRef#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ENodeType value);

} // ETypeRef