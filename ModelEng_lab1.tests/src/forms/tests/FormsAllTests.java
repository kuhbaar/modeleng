/**
 */
package forms.tests;

import forms.entityModeling.tests.EntityModelingTests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Forms</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class FormsAllTests extends TestSuite {

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
		TestSuite suite = new FormsAllTests("Forms Tests");
		suite.addTest(EntityModelingTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormsAllTests(String name) {
		super(name);
	}

} //FormsAllTests
