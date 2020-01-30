/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EValid Source Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EValidSourceType#getSourceTypes <em>Source Types</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EValidSourceType#getSourceType <em>Source Type</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEValidSourceType()
 * @model
 * @generated
 */
public interface EValidSourceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Source Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.ETypeRef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEValidSourceType_SourceTypes()
   * @model containment="true"
   * @generated
   */
  EList<ETypeRef> getSourceTypes();

  /**
   * Returns the value of the '<em><b>Source Type</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.ETypeRef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Source Type</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEValidSourceType_SourceType()
   * @model containment="true"
   * @generated
   */
  EList<ETypeRef> getSourceType();

} // EValidSourceType