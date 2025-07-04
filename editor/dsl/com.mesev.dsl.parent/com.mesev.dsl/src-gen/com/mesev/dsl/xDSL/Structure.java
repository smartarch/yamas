/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.Structure#getName <em>Name</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.Structure#getFields <em>Fields</em>}</li>
 * </ul>
 *
 * @see com.mesev.dsl.xDSL.XDSLPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends ParameterType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getStructure_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.Structure#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Fields</b></em>' containment reference list.
   * The list contents are of type {@link com.mesev.dsl.xDSL.Field}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fields</em>' containment reference list.
   * @see com.mesev.dsl.xDSL.XDSLPackage#getStructure_Fields()
   * @model containment="true"
   * @generated
   */
  EList<Field> getFields();

} // Structure
