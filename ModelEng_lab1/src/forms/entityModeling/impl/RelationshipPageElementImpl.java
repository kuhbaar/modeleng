/**
 */
package forms.entityModeling.impl;

import forms.entityModeling.EntityModelingPackage;
import forms.entityModeling.Form;
import forms.entityModeling.Relationship;
import forms.entityModeling.RelationshipPageElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Page Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.entityModeling.impl.RelationshipPageElementImpl#getRelationshipToEnterValues <em>Relationship To Enter Values</em>}</li>
 *   <li>{@link forms.entityModeling.impl.RelationshipPageElementImpl#getEditingForm <em>Editing Form</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RelationshipPageElementImpl extends PageElementImpl implements RelationshipPageElement {
	/**
	 * The cached value of the '{@link #getRelationshipToEnterValues() <em>Relationship To Enter Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationshipToEnterValues()
	 * @generated
	 * @ordered
	 */
	protected Relationship relationshipToEnterValues;

	/**
	 * The cached value of the '{@link #getEditingForm() <em>Editing Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditingForm()
	 * @generated
	 * @ordered
	 */
	protected Form editingForm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipPageElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityModelingPackage.Literals.RELATIONSHIP_PAGE_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship getRelationshipToEnterValues() {
		if (relationshipToEnterValues != null && relationshipToEnterValues.eIsProxy()) {
			InternalEObject oldRelationshipToEnterValues = (InternalEObject)relationshipToEnterValues;
			relationshipToEnterValues = (Relationship)eResolveProxy(oldRelationshipToEnterValues);
			if (relationshipToEnterValues != oldRelationshipToEnterValues) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES, oldRelationshipToEnterValues, relationshipToEnterValues));
			}
		}
		return relationshipToEnterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Relationship basicGetRelationshipToEnterValues() {
		return relationshipToEnterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationshipToEnterValues(Relationship newRelationshipToEnterValues) {
		Relationship oldRelationshipToEnterValues = relationshipToEnterValues;
		relationshipToEnterValues = newRelationshipToEnterValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES, oldRelationshipToEnterValues, relationshipToEnterValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getEditingForm() {
		if (editingForm != null && editingForm.eIsProxy()) {
			InternalEObject oldEditingForm = (InternalEObject)editingForm;
			editingForm = (Form)eResolveProxy(oldEditingForm);
			if (editingForm != oldEditingForm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM, oldEditingForm, editingForm));
			}
		}
		return editingForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form basicGetEditingForm() {
		return editingForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditingForm(Form newEditingForm) {
		Form oldEditingForm = editingForm;
		editingForm = newEditingForm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM, oldEditingForm, editingForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES:
				if (resolve) return getRelationshipToEnterValues();
				return basicGetRelationshipToEnterValues();
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				if (resolve) return getEditingForm();
				return basicGetEditingForm();
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
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES:
				setRelationshipToEnterValues((Relationship)newValue);
				return;
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				setEditingForm((Form)newValue);
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
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES:
				setRelationshipToEnterValues((Relationship)null);
				return;
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				setEditingForm((Form)null);
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
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES:
				return relationshipToEnterValues != null;
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM:
				return editingForm != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationshipPageElementImpl
