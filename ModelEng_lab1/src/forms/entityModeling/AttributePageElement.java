/**
 */
package forms.entityModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.AttributePageElement#getAttributeToEnterValues <em>Attribute To Enter Values</em>}</li>
 *   <li>{@link forms.entityModeling.AttributePageElement#getValueOfAttribute <em>Value Of Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getAttributePageElement()
 * @model abstract="true"
 * @generated
 */
public interface AttributePageElement extends PageElement {
	/**
	 * Returns the value of the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute To Enter Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute To Enter Values</em>' reference.
	 * @see #setAttributeToEnterValues(Attribute)
	 * @see forms.entityModeling.EntityModelingPackage#getAttributePageElement_AttributeToEnterValues()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Attribute getAttributeToEnterValues();

	/**
	 * Sets the value of the '{@link forms.entityModeling.AttributePageElement#getAttributeToEnterValues <em>Attribute To Enter Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute To Enter Values</em>' reference.
	 * @see #getAttributeToEnterValues()
	 * @generated
	 */
	void setAttributeToEnterValues(Attribute value);

	/**
	 * Returns the value of the '<em><b>Value Of Attribute</b></em>' attribute.
	 * The default value is <code>"String"</code>.
	 * The literals are from the enumeration {@link forms.entityModeling.AttributeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Of Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Of Attribute</em>' attribute.
	 * @see forms.entityModeling.AttributeType
	 * @see #setValueOfAttribute(AttributeType)
	 * @see forms.entityModeling.EntityModelingPackage#getAttributePageElement_ValueOfAttribute()
	 * @model default="String"
	 * @generated
	 */
	AttributeType getValueOfAttribute();

	/**
	 * Sets the value of the '{@link forms.entityModeling.AttributePageElement#getValueOfAttribute <em>Value Of Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Of Attribute</em>' attribute.
	 * @see forms.entityModeling.AttributeType
	 * @see #getValueOfAttribute()
	 * @generated
	 */
	void setValueOfAttribute(AttributeType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enterValues();

} // AttributePageElement
