/**
 */
package forms.entityModeling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link forms.entityModeling.List#getAlreadyEnteredEntity <em>Already Entered Entity</em>}</li>
 * </ul>
 * </p>
 *
 * @see forms.entityModeling.EntityModelingPackage#getList()
 * @model
 * @generated
 */
public interface List extends RelationshipPageElement {
	/**
	 * Returns the value of the '<em><b>Already Entered Entity</b></em>' reference list.
	 * The list contents are of type {@link forms.entityModeling.Entity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Already Entered Entity</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Already Entered Entity</em>' reference list.
	 * @see forms.entityModeling.EntityModelingPackage#getList_AlreadyEnteredEntity()
	 * @model
	 * @generated
	 */
	EList<Entity> getAlreadyEnteredEntity();

} // List
