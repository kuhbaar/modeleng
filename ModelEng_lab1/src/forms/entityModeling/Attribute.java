/**
 */
package forms.entityModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link forms.entityModeling.Attribute#isMandatory <em>Mandatory</em>}</li>
 *   <li>{@link forms.entityModeling.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link forms.entityModeling.Attribute#getEnumerationType <em>Enumeration Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getAttribute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ifEnumerationThenAttributeTypeMustBeNone'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot ifEnumerationThenAttributeTypeMustBeNone='if self.enumerationType -> isEmpty() then self.type <> forms::entityModeling::AttributeType::None else self.type = forms::entityModeling::AttributeType::None endif'"
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see forms.entityModeling.EntityModelingPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mandatory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory</em>' attribute.
	 * @see #setMandatory(boolean)
	 * @see forms.entityModeling.EntityModelingPackage#getAttribute_Mandatory()
	 * @model
	 * @generated
	 */
	boolean isMandatory();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Attribute#isMandatory <em>Mandatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory</em>' attribute.
	 * @see #isMandatory()
	 * @generated
	 */
	void setMandatory(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * The literals are from the enumeration {@link forms.entityModeling.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see forms.entityModeling.AttributeType
	 * @see #setType(AttributeType)
	 * @see forms.entityModeling.EntityModelingPackage#getAttribute_Type()
	 * @model default="String"
	 * @generated
	 */
	AttributeType getType();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Attribute#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see forms.entityModeling.AttributeType
	 * @see #getType()
	 * @generated
	 */
	void setType(AttributeType value);

	/**
	 * Returns the value of the '<em><b>Enumeration Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumeration Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumeration Type</em>' reference.
	 * @see #setEnumerationType(Enumeration)
	 * @see forms.entityModeling.EntityModelingPackage#getAttribute_EnumerationType()
	 * @model
	 * @generated
	 */
	Enumeration getEnumerationType();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Attribute#getEnumerationType <em>Enumeration Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumeration Type</em>' reference.
	 * @see #getEnumerationType()
	 * @generated
	 */
	void setEnumerationType(Enumeration value);

} // Attribute
