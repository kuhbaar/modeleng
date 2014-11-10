/**
 */
package forms.impl;

import forms.EFML_model;
import forms.FormsPackage;

import forms.entityModeling.Entity;
import forms.entityModeling.Enumeration;
import forms.entityModeling.Form;

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
 * An implementation of the model object '<em><b>EFML model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.impl.EFML_modelImpl#getEntities <em>Entities</em>}</li>
 *   <li>{@link forms.impl.EFML_modelImpl#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link forms.impl.EFML_modelImpl#getWelcomeForm <em>Welcome Form</em>}</li>
 *   <li>{@link forms.impl.EFML_modelImpl#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EFML_modelImpl extends MinimalEObjectImpl.Container implements EFML_model {
	/**
	 * The cached value of the '{@link #getEntities() <em>Entities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntities()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entities;

	/**
	 * The cached value of the '{@link #getEnumerations() <em>Enumerations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerations()
	 * @generated
	 * @ordered
	 */
	protected EList<Enumeration> enumerations;

	/**
	 * The cached value of the '{@link #getWelcomeForm() <em>Welcome Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWelcomeForm()
	 * @generated
	 * @ordered
	 */
	protected Form welcomeForm;

	/**
	 * The cached value of the '{@link #getForms() <em>Forms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForms()
	 * @generated
	 * @ordered
	 */
	protected EList<Form> forms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFML_modelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FormsPackage.Literals.EFML_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntities() {
		if (entities == null) {
			entities = new EObjectContainmentEList<Entity>(Entity.class, this, FormsPackage.EFML_MODEL__ENTITIES);
		}
		return entities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Enumeration> getEnumerations() {
		if (enumerations == null) {
			enumerations = new EObjectContainmentEList<Enumeration>(Enumeration.class, this, FormsPackage.EFML_MODEL__ENUMERATIONS);
		}
		return enumerations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Form getWelcomeForm() {
		return welcomeForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWelcomeForm(Form newWelcomeForm, NotificationChain msgs) {
		Form oldWelcomeForm = welcomeForm;
		welcomeForm = newWelcomeForm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FormsPackage.EFML_MODEL__WELCOME_FORM, oldWelcomeForm, newWelcomeForm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWelcomeForm(Form newWelcomeForm) {
		if (newWelcomeForm != welcomeForm) {
			NotificationChain msgs = null;
			if (welcomeForm != null)
				msgs = ((InternalEObject)welcomeForm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FormsPackage.EFML_MODEL__WELCOME_FORM, null, msgs);
			if (newWelcomeForm != null)
				msgs = ((InternalEObject)newWelcomeForm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FormsPackage.EFML_MODEL__WELCOME_FORM, null, msgs);
			msgs = basicSetWelcomeForm(newWelcomeForm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FormsPackage.EFML_MODEL__WELCOME_FORM, newWelcomeForm, newWelcomeForm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Form> getForms() {
		if (forms == null) {
			forms = new EObjectContainmentEList<Form>(Form.class, this, FormsPackage.EFML_MODEL__FORMS);
		}
		return forms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FormsPackage.EFML_MODEL__ENTITIES:
				return ((InternalEList<?>)getEntities()).basicRemove(otherEnd, msgs);
			case FormsPackage.EFML_MODEL__ENUMERATIONS:
				return ((InternalEList<?>)getEnumerations()).basicRemove(otherEnd, msgs);
			case FormsPackage.EFML_MODEL__WELCOME_FORM:
				return basicSetWelcomeForm(null, msgs);
			case FormsPackage.EFML_MODEL__FORMS:
				return ((InternalEList<?>)getForms()).basicRemove(otherEnd, msgs);
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
			case FormsPackage.EFML_MODEL__ENTITIES:
				return getEntities();
			case FormsPackage.EFML_MODEL__ENUMERATIONS:
				return getEnumerations();
			case FormsPackage.EFML_MODEL__WELCOME_FORM:
				return getWelcomeForm();
			case FormsPackage.EFML_MODEL__FORMS:
				return getForms();
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
			case FormsPackage.EFML_MODEL__ENTITIES:
				getEntities().clear();
				getEntities().addAll((Collection<? extends Entity>)newValue);
				return;
			case FormsPackage.EFML_MODEL__ENUMERATIONS:
				getEnumerations().clear();
				getEnumerations().addAll((Collection<? extends Enumeration>)newValue);
				return;
			case FormsPackage.EFML_MODEL__WELCOME_FORM:
				setWelcomeForm((Form)newValue);
				return;
			case FormsPackage.EFML_MODEL__FORMS:
				getForms().clear();
				getForms().addAll((Collection<? extends Form>)newValue);
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
			case FormsPackage.EFML_MODEL__ENTITIES:
				getEntities().clear();
				return;
			case FormsPackage.EFML_MODEL__ENUMERATIONS:
				getEnumerations().clear();
				return;
			case FormsPackage.EFML_MODEL__WELCOME_FORM:
				setWelcomeForm((Form)null);
				return;
			case FormsPackage.EFML_MODEL__FORMS:
				getForms().clear();
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
			case FormsPackage.EFML_MODEL__ENTITIES:
				return entities != null && !entities.isEmpty();
			case FormsPackage.EFML_MODEL__ENUMERATIONS:
				return enumerations != null && !enumerations.isEmpty();
			case FormsPackage.EFML_MODEL__WELCOME_FORM:
				return welcomeForm != null;
			case FormsPackage.EFML_MODEL__FORMS:
				return forms != null && !forms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EFML_modelImpl
