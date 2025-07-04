/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.Interaction#getTasks <em>Tasks</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.Interaction#getNotImplemented <em>Not Implemented</em>}</li>
 * </ul>
 *
 * @see com.mesev.dsl.xDSL.XDSLPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends ExperimentNode
{
  /**
   * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
   * The list contents are of type {@link com.mesev.dsl.xDSL.Action}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tasks</em>' containment reference list.
   * @see com.mesev.dsl.xDSL.XDSLPackage#getInteraction_Tasks()
   * @model containment="true"
   * @generated
   */
  EList<Action> getTasks();

  /**
   * Returns the value of the '<em><b>Not Implemented</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Implemented</em>' attribute.
   * @see #setNotImplemented(String)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getInteraction_NotImplemented()
   * @model
   * @generated
   */
  String getNotImplemented();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.Interaction#getNotImplemented <em>Not Implemented</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Implemented</em>' attribute.
   * @see #getNotImplemented()
   * @generated
   */
  void setNotImplemented(String value);

} // Interaction
