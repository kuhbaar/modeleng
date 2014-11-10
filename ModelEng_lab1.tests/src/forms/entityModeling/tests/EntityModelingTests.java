/**
 */
package forms.entityModeling.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>entityModeling</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class EntityModelingTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new EntityModelingTests("entityModeling Tests");
		suite.addTestSuite(TextfieldTest.class);
		suite.addTestSuite(TextareaTest.class);
		suite.addTestSuite(SelectionFieldTest.class);
		suite.addTestSuite(DateSelectionFieldTest.class);
		suite.addTestSuite(TimeSelectionFieldTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModelingTests(String name) {
		super(name);
	}

} //EntityModelingTests
