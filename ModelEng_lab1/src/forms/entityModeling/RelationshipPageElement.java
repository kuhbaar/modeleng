/**
 */
package forms.entityModeling;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Page Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.RelationshipPageElement#getRelationshipToEnterValues <em>Relationship To Enter Values</em>}</li>
 *   <li>{@link forms.entityModeling.RelationshipPageElement#getEditingForm <em>Editing Form</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getRelationshipPageElement()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='editingFormEntityAndRelationshipEntityMustBeTheSame'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot editingFormEntityAndRelationshipEntityMustBeTheSame='self.relationshipToEnterValues.target = self.editingForm.entity'"
 * @generated
 */
public interface RelationshipPageElement extends PageElement {
	/**
	 * Returns the value of the '<em><b>Relationship To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship To Enter Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship To Enter Values</em>' reference.
	 * @see #setRelationshipToEnterValues(Relationship)
	 * @see forms.entityModeling.EntityModelingPackage#getRelationshipPageElement_RelationshipToEnterValues()
	 * @model required="true"
	 * @generated
	 */
	Relationship getRelationshipToEnterValues();

	/**
	 * Sets the value of the '{@link forms.entityModeling.RelationshipPageElement#getRelationshipToEnterValues <em>Relationship To Enter Values</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relationship To Enter Values</em>' reference.
	 * @see #getRelationshipToEnterValues()
	 * @generated
	 */
	void setRelationshipToEnterValues(Relationship value);

	/**
	 * Returns the value of the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editing Form</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editing Form</em>' reference.
	 * @see #setEditingForm(Form)
	 * @see forms.entityModeling.EntityModelingPackage#getRelationshipPageElement_EditingForm()
	 * @model required="true"
	 * @generated
	 */
	Form getEditingForm();

	/**
	 * Sets the value of the '{@link forms.entityModeling.RelationshipPageElement#getEditingForm <em>Editing Form</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editing Form</em>' reference.
	 * @see #getEditingForm()
	 * @generated
	 */
	void setEditingForm(Form value);

} // RelationshipPageElement
