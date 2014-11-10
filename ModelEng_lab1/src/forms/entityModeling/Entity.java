/**
 */
package forms.entityModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.Entity#getName <em>Name</em>}</li>
 *   <li>{@link forms.entityModeling.Entity#getId <em>Id</em>}</li>
 *   <li>{@link forms.entityModeling.Entity#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link forms.entityModeling.Entity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link forms.entityModeling.Entity#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getEntity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='NeedIdWhenNoSuperType IdIsMandatory SuperTypeIsNotSelf'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot NeedIdWhenNoSuperType='if self.superType -> isEmpty() then self.id -> notEmpty() else self.id -> isEmpty() endif' IdIsMandatory='if self.id -> notEmpty() then self.id.mandatory = true else true endif' SuperTypeIsNotSelf='self.superType <> self'"
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see forms.entityModeling.EntityModelingPackage#getEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' containment reference.
	 * @see #setId(Attribute)
	 * @see forms.entityModeling.EntityModelingPackage#getEntity_Id()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getId();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Entity#getId <em>Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' containment reference.
	 * @see #getId()
	 * @generated
	 */
	void setId(Attribute value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see forms.entityModeling.EntityModelingPackage#getEntity_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(Entity)
	 * @see forms.entityModeling.EntityModelingPackage#getEntity_SuperType()
	 * @model
	 * @generated
	 */
	Entity getSuperType();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Entity#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(Entity value);

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see forms.entityModeling.EntityModelingPackage#getEntity_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // Entity
