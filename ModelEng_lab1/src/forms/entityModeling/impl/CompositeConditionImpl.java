/**
 */
package forms.entityModeling.impl;

import forms.entityModeling.BooleanOperators;
import forms.entityModeling.CompositeCondition;
import forms.entityModeling.Condition;
import forms.entityModeling.EntityModelingPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.entityModeling.impl.CompositeConditionImpl#getBooleanOperator <em>Boolean Operator</em>}</li>
 *   <li>{@link forms.entityModeling.impl.CompositeConditionImpl#getComposedConditions <em>Composed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompositeConditionImpl extends ConditionImpl implements CompositeCondition {
	/**
	 * The default value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected static final BooleanOperators BOOLEAN_OPERATOR_EDEFAULT = BooleanOperators.AND;

	/**
	 * The cached value of the '{@link #getBooleanOperator() <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooleanOperator()
	 * @generated
	 * @ordered
	 */
	protected BooleanOperators booleanOperator = BOOLEAN_OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getComposedConditions() <em>Composed Conditions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposedConditions()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> composedConditions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityModelingPackage.Literals.COMPOSITE_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanOperators getBooleanOperator() {
		return booleanOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooleanOperator(BooleanOperators newBooleanOperator) {
		BooleanOperators oldBooleanOperator = booleanOperator;
		booleanOperator = newBooleanOperator == null ? BOOLEAN_OPERATOR_EDEFAULT : newBooleanOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityModelingPackage.COMPOSITE_CONDITION__BOOLEAN_OPERATOR, oldBooleanOperator, booleanOperator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getComposedConditions() {
		if (composedConditions == null) {
			composedConditions = new EObjectContainmentEList<Condition>(Condition.class, this, EntityModelingPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS);
		}
		return composedConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EntityModelingPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				return ((InternalEList<?>)getComposedConditions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityModelingPackage.COMPOSITE_CONDITION__BOOLEAN_OPERATOR:
				return getBooleanOperator();
			case EntityModelingPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				return getComposedConditions();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityModelingPackage.COMPOSITE_CONDITION__BOOLEAN_OPERATOR:
				setBooleanOperator((BooleanOperators)newValue);
				return;
			case EntityModelingPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				getComposedConditions().clear();
				getComposedConditions().addAll((Collection<? extends Condition>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case EntityModelingPackage.COMPOSITE_CONDITION__BOOLEAN_OPERATOR:
				setBooleanOperator(BOOLEAN_OPERATOR_EDEFAULT);
				return;
			case EntityModelingPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				getComposedConditions().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EntityModelingPackage.COMPOSITE_CONDITION__BOOLEAN_OPERATOR:
				return booleanOperator != BOOLEAN_OPERATOR_EDEFAULT;
			case EntityModelingPackage.COMPOSITE_CONDITION__COMPOSED_CONDITIONS:
				return composedConditions != null && !composedConditions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (booleanOperator: ");
		result.append(booleanOperator);
		result.append(')');
		return result.toString();
	}

} //CompositeConditionImpl
