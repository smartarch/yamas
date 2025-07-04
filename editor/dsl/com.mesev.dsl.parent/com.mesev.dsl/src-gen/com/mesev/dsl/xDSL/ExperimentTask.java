/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Experiment Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.ExperimentTask#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.ExperimentTask#isConfigured <em>Configured</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.ExperimentTask#getTaskConfiguration <em>Task Configuration</em>}</li>
 * </ul>
 *
 * @see com.mesev.dsl.xDSL.XDSLPackage#getExperimentTask()
 * @model
 * @generated
 */
public interface ExperimentTask extends ExperimentNode
{
  /**
   * Returns the value of the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' attribute.
   * @see #setAbstract(boolean)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getExperimentTask_Abstract()
   * @model
   * @generated
   */
  boolean isAbstract();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.ExperimentTask#isAbstract <em>Abstract</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' attribute.
   * @see #isAbstract()
   * @generated
   */
  void setAbstract(boolean value);

  /**
   * Returns the value of the '<em><b>Configured</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configured</em>' attribute.
   * @see #setConfigured(boolean)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getExperimentTask_Configured()
   * @model
   * @generated
   */
  boolean isConfigured();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.ExperimentTask#isConfigured <em>Configured</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Configured</em>' attribute.
   * @see #isConfigured()
   * @generated
   */
  void setConfigured(boolean value);

  /**
   * Returns the value of the '<em><b>Task Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Configuration</em>' containment reference.
   * @see #setTaskConfiguration(TaskConfigurationBody)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getExperimentTask_TaskConfiguration()
   * @model containment="true"
   * @generated
   */
  TaskConfigurationBody getTaskConfiguration();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.ExperimentTask#getTaskConfiguration <em>Task Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Configuration</em>' containment reference.
   * @see #getTaskConfiguration()
   * @generated
   */
  void setTaskConfiguration(TaskConfigurationBody value);

} // ExperimentTask
