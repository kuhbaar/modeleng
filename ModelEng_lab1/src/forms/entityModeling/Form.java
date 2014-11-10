/**
 */
package forms.entityModeling;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.Form#getName <em>Name</em>}</li>
 *   <li>{@link forms.entityModeling.Form#getTitle <em>Title</em>}</li>
 *   <li>{@link forms.entityModeling.Form#getDescription <em>Description</em>}</li>
 *   <li>{@link forms.entityModeling.Form#getEntity <em>Entity</em>}</li>
 *   <li>{@link forms.entityModeling.Form#getPages <em>Pages</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getForm()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkAttributePageElement'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot checkAttributePageElement='self.pages.pageElements -> select(e: PageElement | e.oclIsKindOf(AttributePageElement)) \n\t\t\t-> forAll(e1|if self.entity.superType -> isEmpty() then self.entity.id -> union(self.entity.attributes) -> includes(e1.oclAsType(AttributePageElement).attributeToEnterValues) \n\t\t\t\telse if self.entity.superType.attributes -> isEmpty() \n\t\t\t\t\tthen self.entity.id -> union(self.entity.attributes) -> including(self.entity.superType.id) -> includes(e1.oclAsType(AttributePageElement).attributeToEnterValues) \n\t\t\t\t\telse self.entity.id -> union(self.entity.attributes) -> including(self.entity.superType.id) -> union(self.entity.superType.attributes) -> includes(e1.oclAsType(AttributePageElement).attributeToEnterValues)\n\t\t\t\t\tendif\n\t\t\t\tendif \n\t\t\t)'"
 * @generated
 */
public interface Form extends EObject {
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
	 * @see forms.entityModeling.EntityModelingPackage#getForm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Form#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see forms.entityModeling.EntityModelingPackage#getForm_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Form#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see forms.entityModeling.EntityModelingPackage#getForm_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Form#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see forms.entityModeling.EntityModelingPackage#getForm_Entity()
	 * @model required="true"
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Form#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Page}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pages</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pages</em>' containment reference list.
	 * @see forms.entityModeling.EntityModelingPackage#getForm_Pages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Page> getPages();

} // Form
