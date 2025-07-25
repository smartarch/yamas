/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package cz.smartarch.yamas.dsl.xDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Task Configuraiton Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.ExperimentTaskConfiguraitonBody#getParams <em>Params</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.ExperimentTaskConfiguraitonBody#getNotImplemented <em>Not Implemented</em>}</li>
 * </ul>
 *
 * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getExperimentTaskConfiguraitonBody()
 * @model
 * @generated
 */
public interface ExperimentTaskConfiguraitonBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Params</b></em>' containment reference list.
   * The list contents are of type {@link cz.smartarch.yamas.dsl.xDSL.Param}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Params</em>' containment reference list.
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getExperimentTaskConfiguraitonBody_Params()
   * @model containment="true"
   * @generated
   */
  EList<Param> getParams();

  /**
   * Returns the value of the '<em><b>Not Implemented</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Not Implemented</em>' attribute.
   * @see #setNotImplemented(String)
   * @see cz.smartarch.yamas.dsl.xDSL.XDSLPackage#getExperimentTaskConfiguraitonBody_NotImplemented()
   * @model
   * @generated
   */
  String getNotImplemented();

  /**
   * Sets the value of the '{@link cz.smartarch.yamas.dsl.xDSL.ExperimentTaskConfiguraitonBody#getNotImplemented <em>Not Implemented</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Not Implemented</em>' attribute.
   * @see #getNotImplemented()
   * @generated
   */
  void setNotImplemented(String value);

} // ExperimentTaskConfiguraitonBody
