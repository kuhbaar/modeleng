/**
 */
package forms;

import forms.entityModeling.Entity;
import forms.entityModeling.Enumeration;
import forms.entityModeling.Form;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EFML model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.EFML_model#getEntities <em>Entities</em>}</li>
 *   <li>{@link forms.EFML_model#getEnumerations <em>Enumerations</em>}</li>
 *   <li>{@link forms.EFML_model#getWelcomeForm <em>Welcome Form</em>}</li>
 *   <li>{@link forms.EFML_model#getForms <em>Forms</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.FormsPackage#getEFML_model()
 * @model
 * @generated
 */
public interface EFML_model extends EObject {
	/**
	 * Returns the value of the '<em><b>Entities</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' containment reference list.
	 * @see forms.FormsPackage#getEFML_model_Entities()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntities();

	/**
	 * Returns the value of the '<em><b>Enumerations</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Enumeration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerations</em>' containment reference list.
	 * @see forms.FormsPackage#getEFML_model_Enumerations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Enumeration> getEnumerations();

	/**
	 * Returns the value of the '<em><b>Welcome Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Welcome Form</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Welcome Form</em>' containment reference.
	 * @see #setWelcomeForm(Form)
	 * @see forms.FormsPackage#getEFML_model_WelcomeForm()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Form getWelcomeForm();

	/**
	 * Sets the value of the '{@link forms.EFML_model#getWelcomeForm <em>Welcome Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Welcome Form</em>' containment reference.
	 * @see #getWelcomeForm()
	 * @generated
	 */
	void setWelcomeForm(Form value);

	/**
	 * Returns the value of the '<em><b>Forms</b></em>' containment reference list.
	 * The list contents are of type {@link forms.entityModeling.Form}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forms</em>' containment reference list.
	 * @see forms.FormsPackage#getEFML_model_Forms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Form> getForms();

} // EFML_model
