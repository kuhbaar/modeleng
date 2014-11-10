/**
 */
package forms.entityModeling.impl;

import forms.entityModeling.Attribute;
import forms.entityModeling.AttributePageElement;
import forms.entityModeling.AttributeType;
import forms.entityModeling.EntityModelingPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Page Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.entityModeling.impl.AttributePageElementImpl#getAttributeToEnterValues <em>Attribute To Enter Values</em>}</li>
 *   <li>{@link forms.entityModeling.impl.AttributePageElementImpl#getValueOfAttribute <em>Value Of Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AttributePageElementImpl extends PageElementImpl implements AttributePageElement {
	/**
	 * The cached value of the '{@link #getAttributeToEnterValues() <em>Attribute To Enter Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeToEnterValues()
	 * @generated
	 * @ordered
	 */
	protected Attribute attributeToEnterValues;

	/**
	 * The default value of the '{@link #getValueOfAttribute() <em>Value Of Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOfAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final AttributeType VALUE_OF_ATTRIBUTE_EDEFAULT = AttributeType.STRING;

	/**
	 * The cached value of the '{@link #getValueOfAttribute() <em>Value Of Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueOfAttribute()
	 * @generated
	 * @ordered
	 */
	protected AttributeType valueOfAttribute = VALUE_OF_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributePageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityModelingPackage.Literals.ATTRIBUTE_PAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute getAttributeToEnterValues() {
		if (attributeToEnterValues != null && attributeToEnterValues.eIsProxy()) {
			InternalEObject oldAttributeToEnterValues = (InternalEObject)attributeToEnterValues;
			attributeToEnterValues = (Attribute)eResolveProxy(oldAttributeToEnterValues);
			if (attributeToEnterValues != oldAttributeToEnterValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES, oldAttributeToEnterValues, attributeToEnterValues));
			}
		}
		return attributeToEnterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attribute basicGetAttributeToEnterValues() {
		return attributeToEnterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeToEnterValues(Attribute newAttributeToEnterValues) {
		Attribute oldAttributeToEnterValues = attributeToEnterValues;
		attributeToEnterValues = newAttributeToEnterValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES, oldAttributeToEnterValues, attributeToEnterValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType getValueOfAttribute() {
		return valueOfAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueOfAttribute(AttributeType newValueOfAttribute) {
		AttributeType oldValueOfAttribute = valueOfAttribute;
		valueOfAttribute = newValueOfAttribute == null ? VALUE_OF_ATTRIBUTE_EDEFAULT : newValueOfAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE, oldValueOfAttribute, valueOfAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enterValues() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES:
				if (resolve) return getAttributeToEnterValues();
				return basicGetAttributeToEnterValues();
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE:
				return getValueOfAttribute();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES:
				setAttributeToEnterValues((Attribute)newValue);
				return;
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE:
				setValueOfAttribute((AttributeType)newValue);
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
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES:
				setAttributeToEnterValues((Attribute)null);
				return;
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE:
				setValueOfAttribute(VALUE_OF_ATTRIBUTE_EDEFAULT);
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
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES:
				return attributeToEnterValues != null;
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE:
				return valueOfAttribute != VALUE_OF_ATTRIBUTE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES:
				enterValues();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (valueOfAttribute: ");
		result.append(valueOfAttribute);
		result.append(')');
		return result.toString();
	}

} //AttributePageElementImpl
