/**
 */
package forms.entityModeling.tests;

import forms.entityModeling.DateSelectionField;
import forms.entityModeling.EntityModelingFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Date Selection Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DateSelectionFieldTest extends AttributePageElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DateSelectionFieldTest.class);
	}

	/**
	 * Constructs a new Date Selection Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateSelectionFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Date Selection Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected DateSelectionField getFixture() {
		return (DateSelectionField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityModelingFactory.eINSTANCE.createDateSelectionField());
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

} //DateSelectionFieldTest
