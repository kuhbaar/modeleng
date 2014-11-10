/**
 */
package forms.entityModeling.impl;

import forms.entityModeling.Entity;
import forms.entityModeling.EntityModelingPackage;
import forms.entityModeling.List;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link forms.entityModeling.impl.ListImpl#getAlreadyEnteredEntity <em>Already Entered Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends RelationshipPageElementImpl implements List {
	/**
	 * The cached value of the '{@link #getAlreadyEnteredEntity() <em>Already Entered Entity</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlreadyEnteredEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> alreadyEnteredEntity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EntityModelingPackage.Literals.LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getAlreadyEnteredEntity() {
		if (alreadyEnteredEntity == null) {
			alreadyEnteredEntity = new EObjectResolvingEList<Entity>(Entity.class, this, EntityModelingPackage.LIST__ALREADY_ENTERED_ENTITY);
		}
		return alreadyEnteredEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EntityModelingPackage.LIST__ALREADY_ENTERED_ENTITY:
				return getAlreadyEnteredEntity();
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
			case EntityModelingPackage.LIST__ALREADY_ENTERED_ENTITY:
				getAlreadyEnteredEntity().clear();
				getAlreadyEnteredEntity().addAll((Collection<? extends Entity>)newValue);
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
			case EntityModelingPackage.LIST__ALREADY_ENTERED_ENTITY:
				getAlreadyEnteredEntity().clear();
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
			case EntityModelingPackage.LIST__ALREADY_ENTERED_ENTITY:
				return alreadyEnteredEntity != null && !alreadyEnteredEntity.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ListImpl
