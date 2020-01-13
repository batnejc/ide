/**
 * generated by Xtext 2.19.0
 */
package org.sodalite.dsl.rM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EArtifact Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getName <em>Name</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getMime_type <em>Mime type</em>}</li>
 *   <li>{@link org.sodalite.dsl.rM.EArtifactType#getFile_ext <em>File ext</em>}</li>
 * </ul>
 *
 * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType()
 * @model
 * @generated
 */
public interface EArtifactType extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' reference.
   * @see #setSuperType(EArtifactType)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_SuperType()
   * @model
   * @generated
   */
  EArtifactType getSuperType();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getSuperType <em>Super Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(EArtifactType value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Mime type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mime type</em>' attribute.
   * @see #setMime_type(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_Mime_type()
   * @model
   * @generated
   */
  String getMime_type();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getMime_type <em>Mime type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mime type</em>' attribute.
   * @see #getMime_type()
   * @generated
   */
  void setMime_type(String value);

  /**
   * Returns the value of the '<em><b>File ext</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>File ext</em>' attribute.
   * @see #setFile_ext(String)
   * @see org.sodalite.dsl.rM.RMPackage#getEArtifactType_File_ext()
   * @model
   * @generated
   */
  String getFile_ext();

  /**
   * Sets the value of the '{@link org.sodalite.dsl.rM.EArtifactType#getFile_ext <em>File ext</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>File ext</em>' attribute.
   * @see #getFile_ext()
   * @generated
   */
  void setFile_ext(String value);

} // EArtifactType
