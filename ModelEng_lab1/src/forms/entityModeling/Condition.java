/**
 */
package forms.entityModeling;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.Condition#getType <em>Type</em>}</li>
 *   <li>{@link forms.entityModeling.Condition#getConditionID <em>Condition ID</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"Show"</code>.
	 * The literals are from the enumeration {@link forms.entityModeling.ConditionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see forms.entityModeling.ConditionType
	 * @see #setType(ConditionType)
	 * @see forms.entityModeling.EntityModelingPackage#getCondition_Type()
	 * @model default="Show" required="true"
	 * @generated
	 */
	ConditionType getType();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Condition#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see forms.entityModeling.ConditionType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConditionType value);

	/**
	 * Returns the value of the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition ID</em>' attribute.
	 * @see #setConditionID(String)
	 * @see forms.entityModeling.EntityModelingPackage#getCondition_ConditionID()
	 * @model
	 * @generated
	 */
	String getConditionID();

	/**
	 * Sets the value of the '{@link forms.entityModeling.Condition#getConditionID <em>Condition ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition ID</em>' attribute.
	 * @see #getConditionID()
	 * @generated
	 */
	void setConditionID(String value);

} // Condition
