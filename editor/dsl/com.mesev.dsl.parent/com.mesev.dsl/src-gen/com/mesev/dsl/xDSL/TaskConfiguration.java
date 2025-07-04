/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package com.mesev.dsl.xDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.mesev.dsl.xDSL.TaskConfiguration#getTask <em>Task</em>}</li>
 *   <li>{@link com.mesev.dsl.xDSL.TaskConfiguration#getTaskConfiguration <em>Task Configuration</em>}</li>
 * </ul>
 *
 * @see com.mesev.dsl.xDSL.XDSLPackage#getTaskConfiguration()
 * @model
 * @generated
 */
public interface TaskConfiguration extends ComponentWithData
{
  /**
   * Returns the value of the '<em><b>Task</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task</em>' reference.
   * @see #setTask(Task)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getTaskConfiguration_Task()
   * @model
   * @generated
   */
  Task getTask();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.TaskConfiguration#getTask <em>Task</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task</em>' reference.
   * @see #getTask()
   * @generated
   */
  void setTask(Task value);

  /**
   * Returns the value of the '<em><b>Task Configuration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Configuration</em>' containment reference.
   * @see #setTaskConfiguration(TaskConfigurationBody)
   * @see com.mesev.dsl.xDSL.XDSLPackage#getTaskConfiguration_TaskConfiguration()
   * @model containment="true"
   * @generated
   */
  TaskConfigurationBody getTaskConfiguration();

  /**
   * Sets the value of the '{@link com.mesev.dsl.xDSL.TaskConfiguration#getTaskConfiguration <em>Task Configuration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Configuration</em>' containment reference.
   * @see #getTaskConfiguration()
   * @generated
   */
  void setTaskConfiguration(TaskConfigurationBody value);

} // TaskConfiguration
