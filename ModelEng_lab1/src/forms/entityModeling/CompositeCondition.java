/**
 */
package forms.entityModeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.CompositeCondition#getBooleanOperator <em>Boolean Operator</em>}</li>
 *   <li>{@link forms.entityModeling.CompositeCondition#getComposedConditions <em>Composed Conditions</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getCompositeCondition()
 * @model
 * @generated
 */
public interface CompositeCondition extends Condition {
	/**
	 * Returns the value of the '<em><b>Boolean Operator</b></em>' attribute.
	 * The default value is <code>"AND"</code>.
	 * The literals are from the enumeration {@link forms.entityModeling.BooleanOperators}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Operator</em>' attribute.
	 * @see forms.entityModeling.BooleanOperators
	 * @see #setBooleanOperator(BooleanOperators)
	 * @see forms.entityModeling.EntityModelingPackage#getCompositeCondition_BooleanOperator()
	 * @model default="AND"
	 * @generated
	 */
	BooleanOperators getBooleanOperator();

	/**
	 * Sets the value of the '{@link forms.entityModeling.CompositeCondition#getBooleanOperator <em>Boolean Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Operator</em>' attribute.
	 * @see forms.entityModeling.BooleanOperators
	 * @see #getBooleanOperator()
	 * @generated
	 */
	void setBooleanOperator(BooleanOperators value);

	/**
	 * Returns the value of the '<em><b>Composed Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composed Conditions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composed Conditions</em>' containment reference list.
	 * @see forms.entityModeling.EntityModelingPackage#getCompositeCondition_ComposedConditions()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<Condition> getComposedConditions();

} // CompositeCondition
