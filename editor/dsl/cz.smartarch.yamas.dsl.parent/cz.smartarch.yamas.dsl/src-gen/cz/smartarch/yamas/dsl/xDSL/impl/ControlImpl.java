/**
 * generated by Xtext 2.39.0-SNAPSHOT
 */
package cz.smartarch.yamas.dsl.xDSL.impl;

import cz.smartarch.yamas.dsl.xDSL.Control;
import cz.smartarch.yamas.dsl.xDSL.ExperimentFlow;
import cz.smartarch.yamas.dsl.xDSL.XDSLPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.ControlImpl#getFlows <em>Flows</em>}</li>
 *   <li>{@link cz.smartarch.yamas.dsl.xDSL.impl.ControlImpl#getNotImplemented <em>Not Implemented</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlImpl extends MinimalEObjectImpl.Container implements Control
{
  /**
   * The cached value of the '{@link #getFlows() <em>Flows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFlows()
   * @generated
   * @ordered
   */
  protected EList<ExperimentFlow> flows;

  /**
   * The default value of the '{@link #getNotImplemented() <em>Not Implemented</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotImplemented()
   * @generated
   * @ordered
   */
  protected static final String NOT_IMPLEMENTED_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNotImplemented() <em>Not Implemented</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotImplemented()
   * @generated
   * @ordered
   */
  protected String notImplemented = NOT_IMPLEMENTED_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ControlImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XDSLPackage.Literals.CONTROL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<ExperimentFlow> getFlows()
  {
    if (flows == null)
    {
      flows = new EObjectContainmentEList<ExperimentFlow>(ExperimentFlow.class, this, XDSLPackage.CONTROL__FLOWS);
    }
    return flows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getNotImplemented()
  {
    return notImplemented;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNotImplemented(String newNotImplemented)
  {
    String oldNotImplemented = notImplemented;
    notImplemented = newNotImplemented;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XDSLPackage.CONTROL__NOT_IMPLEMENTED, oldNotImplemented, notImplemented));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XDSLPackage.CONTROL__FLOWS:
        return ((InternalEList<?>)getFlows()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XDSLPackage.CONTROL__FLOWS:
        return getFlows();
      case XDSLPackage.CONTROL__NOT_IMPLEMENTED:
        return getNotImplemented();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XDSLPackage.CONTROL__FLOWS:
        getFlows().clear();
        getFlows().addAll((Collection<? extends ExperimentFlow>)newValue);
        return;
      case XDSLPackage.CONTROL__NOT_IMPLEMENTED:
        setNotImplemented((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XDSLPackage.CONTROL__FLOWS:
        getFlows().clear();
        return;
      case XDSLPackage.CONTROL__NOT_IMPLEMENTED:
        setNotImplemented(NOT_IMPLEMENTED_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XDSLPackage.CONTROL__FLOWS:
        return flows != null && !flows.isEmpty();
      case XDSLPackage.CONTROL__NOT_IMPLEMENTED:
        return NOT_IMPLEMENTED_EDEFAULT == null ? notImplemented != null : !NOT_IMPLEMENTED_EDEFAULT.equals(notImplemented);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (notImplemented: ");
    result.append(notImplemented);
    result.append(')');
    return result.toString();
  }

} //ControlImpl
