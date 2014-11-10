/**
 */
package forms.entityModeling.tests;

import forms.entityModeling.EntityModelingFactory;
import forms.entityModeling.SelectionField;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Selection Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectionFieldTest extends AttributePageElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelectionFieldTest.class);
	}

	/**
	 * Constructs a new Selection Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectionFieldTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Selection Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SelectionField getFixture() {
		return (SelectionField)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EntityModelingFactory.eINSTANCE.createSelectionField());
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

} //SelectionFieldTest
