/**
 */
package forms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see forms.FormsPackage
 * @generated
 */
public interface FormsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsFactory eINSTANCE = forms.impl.FormsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EFML model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EFML model</em>'.
	 * @generated
	 */
	EFML_model createEFML_model();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FormsPackage getFormsPackage();

} //FormsFactory
