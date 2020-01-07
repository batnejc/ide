/**
 * generated by Xtext 2.17.1
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EDataTypes#getDataTypes <em>Data Types</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEDataTypes()
 * @model
 * @generated
 */
public interface EDataTypes extends EObject
{
  /**
   * Returns the value of the '<em><b>Data Types</b></em>' containment reference list.
   * The list contents are of type {@link org.sodalite.dsl.rM.EDataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data Types</em>' containment reference list.
   * @see org.sodalite.dsl.rM.RMPackage#getEDataTypes_DataTypes()
   * @model containment="true"
   * @generated
   */
  EList<EDataType> getDataTypes();

} // EDataTypes
