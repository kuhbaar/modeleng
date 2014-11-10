/**
 */
package forms.entityModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Textfield</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.Textfield#getAllowedValueFormat <em>Allowed Value Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getTextfield()
 * @model
 * @generated
 */
public interface Textfield extends AttributePageElement {
	/**
	 * Returns the value of the '<em><b>Allowed Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Value Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Value Format</em>' attribute.
	 * @see #setAllowedValueFormat(String)
	 * @see forms.entityModeling.EntityModelingPackage#getTextfield_AllowedValueFormat()
	 * @model
	 * @generated
	 */
	String getAllowedValueFormat();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Textfield#getAllowedValueFormat <em>Allowed Value Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Value Format</em>' attribute.
	 * @see #getAllowedValueFormat()
	 * @generated
	 */
	void setAllowedValueFormat(String value);

} // Textfield
