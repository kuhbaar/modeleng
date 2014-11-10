/**
 */
package forms.entityModeling.tests;

import forms.entityModeling.EntityModelingFactory;
import forms.entityModeling.TimeSelectionField;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Time Selection Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TimeSelectionFieldTest extends AttributePageElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TimeSelectionFieldTest.class);
	}

	/**
	 * Constructs a new Time Selection Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeSelectionFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Time Selection Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimeSelectionField getFixture() {
		return (TimeSelectionField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityModelingFactory.eINSTANCE.createTimeSelectionField());
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

} //TimeSelectionFieldTest
