/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.DataConnection#getComponent <em>Component</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.DataConnection#isFromComponent <em>From Component</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.DataConnection#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see com.mesev.dsl.xDSL.XDSLPackage#getDataConnection()
 * @model
 * @generated
 */
public interface DataConnection extends EObject
{
  /**
   * Returns the value of the '<em><b>Component</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Component</em>' reference.
   * @see #setComponent(ComponentWithData)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getDataConnection_Component()
   * @model
   * @generated
   */
  ComponentWithData getComponent();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.DataConnection#getComponent <em>Component</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Component</em>' reference.
   * @see #getComponent()
   * @generated
   */
  void setComponent(ComponentWithData value);

  /**
   * Returns the value of the '<em><b>From Component</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>From Component</em>' attribute.
   * @see #setFromComponent(boolean)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getDataConnection_FromComponent()
   * @model
   * @generated
   */
  boolean isFromComponent();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.DataConnection#isFromComponent <em>From Component</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From Component</em>' attribute.
   * @see #isFromComponent()
   * @generated
   */
  void setFromComponent(boolean value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(Data)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getDataConnection_Ref()
   * @model
   * @generated
   */
  Data getRef();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.DataConnection#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(Data value);

} // DataConnection
