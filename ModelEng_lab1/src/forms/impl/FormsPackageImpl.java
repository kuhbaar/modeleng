/**
 */
package forms.impl;

import forms.EFML_model;
import forms.FormsFactory;
import forms.FormsPackage;

import forms.entityModeling.EntityModelingPackage;

import forms.entityModeling.impl.EntityModelingPackageImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsPackageImpl extends EPackageImpl implements FormsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass efmL_modelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see forms.FormsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FormsPackageImpl() {
		super(eNS_URI, FormsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FormsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FormsPackage init() {
		if (isInited) return (FormsPackage)EPackage.Registry.INSTANCE.getEPackage(FormsPackage.eNS_URI);

		// Obtain or create and register package
		FormsPackageImpl theFormsPackage = (FormsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FormsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FormsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		EntityModelingPackageImpl theEntityModelingPackage = (EntityModelingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(EntityModelingPackage.eNS_URI) instanceof EntityModelingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(EntityModelingPackage.eNS_URI) : EntityModelingPackage.eINSTANCE);

		// Create package meta-data objects
		theFormsPackage.createPackageContents();
		theEntityModelingPackage.createPackageContents();

		// Initialize created meta-data
		theFormsPackage.initializePackageContents();
		theEntityModelingPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFormsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FormsPackage.eNS_URI, theFormsPackage);
		return theFormsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEFML_model() {
		return efmL_modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFML_model_Entities() {
		return (EReference)efmL_modelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFML_model_Enumerations() {
		return (EReference)efmL_modelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFML_model_WelcomeForm() {
		return (EReference)efmL_modelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEFML_model_Forms() {
		return (EReference)efmL_modelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsFactory getFormsFactory() {
		return (FormsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		efmL_modelEClass = createEClass(EFML_MODEL);
		createEReference(efmL_modelEClass, EFML_MODEL__ENTITIES);
		createEReference(efmL_modelEClass, EFML_MODEL__ENUMERATIONS);
		createEReference(efmL_modelEClass, EFML_MODEL__WELCOME_FORM);
		createEReference(efmL_modelEClass, EFML_MODEL__FORMS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EntityModelingPackage theEntityModelingPackage = (EntityModelingPackage)EPackage.Registry.INSTANCE.getEPackage(EntityModelingPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theEntityModelingPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(efmL_modelEClass, EFML_model.class, "EFML_model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEFML_model_Entities(), theEntityModelingPackage.getEntity(), null, "entities", null, 0, -1, EFML_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFML_model_Enumerations(), theEntityModelingPackage.getEnumeration(), null, "enumerations", null, 0, -1, EFML_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFML_model_WelcomeForm(), theEntityModelingPackage.getForm(), null, "welcomeForm", null, 1, 1, EFML_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEFML_model_Forms(), theEntityModelingPackage.getForm(), null, "forms", null, 0, -1, EFML_model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

} //FormsPackageImpl
