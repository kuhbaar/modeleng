/**
 */
package forms.entityModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.AttributeValueCondition#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getAttributeValueCondition()
 * @model
 * @generated
 */
public interface AttributeValueCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Attribute)
	 * @see forms.entityModeling.EntityModelingPackage#getAttributeValueCondition_Value()
	 * @model
	 * @generated
	 */
	Attribute getValue();

	/**
	 * Sets the value of the '{@link forms.entityModeling.AttributeValueCondition#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Attribute value);

} // AttributeValueCondition
