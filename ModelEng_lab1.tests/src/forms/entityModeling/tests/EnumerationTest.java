/**
 */
package forms.entityModeling.tests;

import forms.entityModeling.EntityModelingFactory;
import forms.entityModeling.Enumeration;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EnumerationTest extends TestCase {

	/**
	 * The fixture for this Enumeration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enumeration fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnumerationTest.class);
	}

	/**
	 * Constructs a new Enumeration test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumerationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Enumeration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Enumeration fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Enumeration test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Enumeration getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityModelingFactory.eINSTANCE.createEnumeration());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EnumerationTest
