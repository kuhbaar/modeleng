/**
 */
package forms.entityModeling.impl;

import forms.entityModeling.EntityModelingPackage;
import forms.entityModeling.Textfield;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textfield</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.entityModeling.impl.TextfieldImpl#getAllowedValueFormat <em>Allowed Value Format</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextfieldImpl extends AttributePageElementImpl implements Textfield {
	/**
	 * The default value of the '{@link #getAllowedValueFormat() <em>Allowed Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValueFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOWED_VALUE_FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowedValueFormat() <em>Allowed Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowedValueFormat()
	 * @generated
	 * @ordered
	 */
	protected String allowedValueFormat = ALLOWED_VALUE_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextfieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityModelingPackage.Literals.TEXTFIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowedValueFormat() {
		return allowedValueFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowedValueFormat(String newAllowedValueFormat) {
		String oldAllowedValueFormat = allowedValueFormat;
		allowedValueFormat = newAllowedValueFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityModelingPackage.TEXTFIELD__ALLOWED_VALUE_FORMAT, oldAllowedValueFormat, allowedValueFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityModelingPackage.TEXTFIELD__ALLOWED_VALUE_FORMAT:
				return getAllowedValueFormat();
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
			case EntityModelingPackage.TEXTFIELD__ALLOWED_VALUE_FORMAT:
				setAllowedValueFormat((String)newValue);
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
			case EntityModelingPackage.TEXTFIELD__ALLOWED_VALUE_FORMAT:
				setAllowedValueFormat(ALLOWED_VALUE_FORMAT_EDEFAULT);
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
			case EntityModelingPackage.TEXTFIELD__ALLOWED_VALUE_FORMAT:
				return ALLOWED_VALUE_FORMAT_EDEFAULT == null ? allowedValueFormat != null : !ALLOWED_VALUE_FORMAT_EDEFAULT.equals(allowedValueFormat);
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
		result.append(" (allowedValueFormat: ");
		result.append(allowedValueFormat);
		result.append(')');
		return result.toString();
	}

} //TextfieldImpl
