/**
 */
package forms;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see forms.FormsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface FormsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "forms";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/forms";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "forms";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FormsPackage eINSTANCE = forms.impl.FormsPackageImpl.init();

	/**
	 * The meta object id for the '{@link forms.impl.EFML_modelImpl <em>EFML model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.impl.EFML_modelImpl
	 * @see forms.impl.FormsPackageImpl#getEFML_model()
	 * @generated
	 */
	int EFML_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFML_MODEL__ENTITIES = 0;

	/**
	 * The feature id for the '<em><b>Enumerations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFML_MODEL__ENUMERATIONS = 1;

	/**
	 * The feature id for the '<em><b>Welcome Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFML_MODEL__WELCOME_FORM = 2;

	/**
	 * The feature id for the '<em><b>Forms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFML_MODEL__FORMS = 3;

	/**
	 * The number of structural features of the '<em>EFML model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFML_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>EFML model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFML_MODEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link forms.EFML_model <em>EFML model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EFML model</em>'.
	 * @see forms.EFML_model
	 * @generated
	 */
	EClass getEFML_model();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.EFML_model#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entities</em>'.
	 * @see forms.EFML_model#getEntities()
	 * @see #getEFML_model()
	 * @generated
	 */
	EReference getEFML_model_Entities();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.EFML_model#getEnumerations <em>Enumerations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enumerations</em>'.
	 * @see forms.EFML_model#getEnumerations()
	 * @see #getEFML_model()
	 * @generated
	 */
	EReference getEFML_model_Enumerations();

	/**
	 * Returns the meta object for the containment reference '{@link forms.EFML_model#getWelcomeForm <em>Welcome Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Welcome Form</em>'.
	 * @see forms.EFML_model#getWelcomeForm()
	 * @see #getEFML_model()
	 * @generated
	 */
	EReference getEFML_model_WelcomeForm();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.EFML_model#getForms <em>Forms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Forms</em>'.
	 * @see forms.EFML_model#getForms()
	 * @see #getEFML_model()
	 * @generated
	 */
	EReference getEFML_model_Forms();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FormsFactory getFormsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link forms.impl.EFML_modelImpl <em>EFML model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.impl.EFML_modelImpl
		 * @see forms.impl.FormsPackageImpl#getEFML_model()
		 * @generated
		 */
		EClass EFML_MODEL = eINSTANCE.getEFML_model();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFML_MODEL__ENTITIES = eINSTANCE.getEFML_model_Entities();

		/**
		 * The meta object literal for the '<em><b>Enumerations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFML_MODEL__ENUMERATIONS = eINSTANCE.getEFML_model_Enumerations();

		/**
		 * The meta object literal for the '<em><b>Welcome Form</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFML_MODEL__WELCOME_FORM = eINSTANCE.getEFML_model_WelcomeForm();

		/**
		 * The meta object literal for the '<em><b>Forms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFML_MODEL__FORMS = eINSTANCE.getEFML_model_Forms();

	}

} //FormsPackage
