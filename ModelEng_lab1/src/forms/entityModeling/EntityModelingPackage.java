/**
 */
package forms.entityModeling;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * @see forms.entityModeling.EntityModelingFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface EntityModelingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "entityModeling";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://ecore_entityModeling.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ecore_entityModeling";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EntityModelingPackage eINSTANCE = forms.entityModeling.impl.EntityModelingPackageImpl.init();

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.EntityImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ID = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__SUPER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Relationships</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__RELATIONSHIPS = 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.AttributeImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Mandatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MANDATORY = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Enumeration Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__ENUMERATION_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.EnumerationImpl <em>Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.EnumerationImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getEnumeration()
	 * @generated
	 */
	int ENUMERATION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION__LITERALS = 1;

	/**
	 * The number of structural features of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUMERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.RelationshipImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Opposite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__OPPOSITE = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UPPER_BOUND = 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.LiteralImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.FormImpl <em>Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.FormImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getForm()
	 * @generated
	 */
	int FORM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM__PAGES = 4;

	/**
	 * The number of structural features of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.PageImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Page Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__PAGE_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.PageElementImpl <em>Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.PageElementImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getPageElement()
	 * @generated
	 */
	int PAGE_ELEMENT = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT__ELEMENT_ID = 2;

	/**
	 * The number of structural features of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.AttributePageElementImpl <em>Attribute Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.AttributePageElementImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttributePageElement()
	 * @generated
	 */
	int ATTRIBUTE_PAGE_ELEMENT = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__LABEL = PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__CONDITION = PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value Of Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Enter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.RelationshipPageElementImpl <em>Relationship Page Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.RelationshipPageElementImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getRelationshipPageElement()
	 * @generated
	 */
	int RELATIONSHIP_PAGE_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__LABEL = PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__CONDITION = PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID = PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Relationship To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES = PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT = PAGE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relationship Page Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT = PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.TextfieldImpl <em>Textfield</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.TextfieldImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTextfield()
	 * @generated
	 */
	int TEXTFIELD = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD__ATTRIBUTE_TO_ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Value Of Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD__VALUE_OF_ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Allowed Value Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD__ALLOWED_VALUE_FORMAT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Textfield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD___ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES;

	/**
	 * The number of operations of the '<em>Textfield</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTFIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.TextareaImpl <em>Textarea</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.TextareaImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTextarea()
	 * @generated
	 */
	int TEXTAREA = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__ATTRIBUTE_TO_ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Value Of Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA__VALUE_OF_ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Textarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA___ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES;

	/**
	 * The number of operations of the '<em>Textarea</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXTAREA_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.SelectionFieldImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getSelectionField()
	 * @generated
	 */
	int SELECTION_FIELD = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__ATTRIBUTE_TO_ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Value Of Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD__VALUE_OF_ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD___ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES;

	/**
	 * The number of operations of the '<em>Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECTION_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.DateSelectionFieldImpl <em>Date Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.DateSelectionFieldImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getDateSelectionField()
	 * @generated
	 */
	int DATE_SELECTION_FIELD = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__ATTRIBUTE_TO_ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Value Of Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD__VALUE_OF_ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Date Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD___ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES;

	/**
	 * The number of operations of the '<em>Date Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_SELECTION_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.TimeSelectionFieldImpl <em>Time Selection Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.TimeSelectionFieldImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTimeSelectionField()
	 * @generated
	 */
	int TIME_SELECTION_FIELD = 14;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__LABEL = ATTRIBUTE_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__CONDITION = ATTRIBUTE_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__ELEMENT_ID = ATTRIBUTE_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Attribute To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__ATTRIBUTE_TO_ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Value Of Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD__VALUE_OF_ATTRIBUTE = ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE;

	/**
	 * The number of structural features of the '<em>Time Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD_FEATURE_COUNT = ATTRIBUTE_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enter Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD___ENTER_VALUES = ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES;

	/**
	 * The number of operations of the '<em>Time Selection Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_SELECTION_FIELD_OPERATION_COUNT = ATTRIBUTE_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.ListImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getList()
	 * @generated
	 */
	int LIST = 15;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__LABEL = RELATIONSHIP_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONDITION = RELATIONSHIP_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_ID = RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Relationship To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__RELATIONSHIP_TO_ENTER_VALUES = RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__EDITING_FORM = RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM;

	/**
	 * The feature id for the '<em><b>Already Entered Entity</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ALREADY_ENTERED_ENTITY = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_OPERATION_COUNT = RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.TableImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__LABEL = RELATIONSHIP_PAGE_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONDITION = RELATIONSHIP_PAGE_ELEMENT__CONDITION;

	/**
	 * The feature id for the '<em><b>Element ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ELEMENT_ID = RELATIONSHIP_PAGE_ELEMENT__ELEMENT_ID;

	/**
	 * The feature id for the '<em><b>Relationship To Enter Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__RELATIONSHIP_TO_ENTER_VALUES = RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES;

	/**
	 * The feature id for the '<em><b>Editing Form</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__EDITING_FORM = RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__COLUMNS = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = RELATIONSHIP_PAGE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_OPERATION_COUNT = RELATIONSHIP_PAGE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.ColumnImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 17;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__ATTRIBUTE = 0;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.ConditionImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 18;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION_ID = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.AttributeValueConditionImpl <em>Attribute Value Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.AttributeValueConditionImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttributeValueCondition()
	 * @generated
	 */
	int ATTRIBUTE_VALUE_CONDITION = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__TYPE = CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION__VALUE = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute Value Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_VALUE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.impl.CompositeConditionImpl
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getCompositeCondition()
	 * @generated
	 */
	int COMPOSITE_CONDITION = 20;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__TYPE = CONDITION__TYPE;

	/**
	 * The feature id for the '<em><b>Condition ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__CONDITION_ID = CONDITION__CONDITION_ID;

	/**
	 * The feature id for the '<em><b>Boolean Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__BOOLEAN_OPERATOR = CONDITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composed Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION__COMPOSED_CONDITIONS = CONDITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_FEATURE_COUNT = CONDITION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Composite Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_CONDITION_OPERATION_COUNT = CONDITION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link forms.entityModeling.AttributeType <em>Attribute Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.AttributeType
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttributeType()
	 * @generated
	 */
	int ATTRIBUTE_TYPE = 21;

	/**
	 * The meta object id for the '{@link forms.entityModeling.ConditionType <em>Condition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.ConditionType
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getConditionType()
	 * @generated
	 */
	int CONDITION_TYPE = 22;

	/**
	 * The meta object id for the '{@link forms.entityModeling.BooleanOperators <em>Boolean Operators</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see forms.entityModeling.BooleanOperators
	 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getBooleanOperators()
	 * @generated
	 */
	int BOOLEAN_OPERATORS = 23;


	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see forms.entityModeling.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.entityModeling.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the containment reference '{@link forms.entityModeling.Entity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Id</em>'.
	 * @see forms.entityModeling.Entity#getId()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.Entity#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see forms.entityModeling.Entity#getAttributes()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Attributes();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.Entity#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see forms.entityModeling.Entity#getSuperType()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.Entity#getRelationships <em>Relationships</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationships</em>'.
	 * @see forms.entityModeling.Entity#getRelationships()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Relationships();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see forms.entityModeling.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.entityModeling.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Attribute#isMandatory <em>Mandatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mandatory</em>'.
	 * @see forms.entityModeling.Attribute#isMandatory()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Mandatory();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see forms.entityModeling.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.Attribute#getEnumerationType <em>Enumeration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Enumeration Type</em>'.
	 * @see forms.entityModeling.Attribute#getEnumerationType()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_EnumerationType();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Enumeration <em>Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enumeration</em>'.
	 * @see forms.entityModeling.Enumeration
	 * @generated
	 */
	EClass getEnumeration();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Enumeration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.entityModeling.Enumeration#getName()
	 * @see #getEnumeration()
	 * @generated
	 */
	EAttribute getEnumeration_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.Enumeration#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see forms.entityModeling.Enumeration#getLiterals()
	 * @see #getEnumeration()
	 * @generated
	 */
	EReference getEnumeration_Literals();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see forms.entityModeling.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.entityModeling.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see forms.entityModeling.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.Relationship#getOpposite <em>Opposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Opposite</em>'.
	 * @see forms.entityModeling.Relationship#getOpposite()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Opposite();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Relationship#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see forms.entityModeling.Relationship#getLowerBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Relationship#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see forms.entityModeling.Relationship#getUpperBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_UpperBound();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see forms.entityModeling.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Literal#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.entityModeling.Literal#getName()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see forms.entityModeling.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Form <em>Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form</em>'.
	 * @see forms.entityModeling.Form
	 * @generated
	 */
	EClass getForm();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Form#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see forms.entityModeling.Form#getName()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Name();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Form#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see forms.entityModeling.Form#getTitle()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Title();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Form#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see forms.entityModeling.Form#getDescription()
	 * @see #getForm()
	 * @generated
	 */
	EAttribute getForm_Description();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.Form#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entity</em>'.
	 * @see forms.entityModeling.Form#getEntity()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.Form#getPages <em>Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pages</em>'.
	 * @see forms.entityModeling.Form#getPages()
	 * @see #getForm()
	 * @generated
	 */
	EReference getForm_Pages();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see forms.entityModeling.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Page#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see forms.entityModeling.Page#getTitle()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.Page#getPageElements <em>Page Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page Elements</em>'.
	 * @see forms.entityModeling.Page#getPageElements()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_PageElements();

	/**
	 * Returns the meta object for the containment reference '{@link forms.entityModeling.Page#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see forms.entityModeling.Page#getCondition()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Condition();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.PageElement <em>Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Element</em>'.
	 * @see forms.entityModeling.PageElement
	 * @generated
	 */
	EClass getPageElement();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.PageElement#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see forms.entityModeling.PageElement#getLabel()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_Label();

	/**
	 * Returns the meta object for the containment reference '{@link forms.entityModeling.PageElement#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see forms.entityModeling.PageElement#getCondition()
	 * @see #getPageElement()
	 * @generated
	 */
	EReference getPageElement_Condition();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.PageElement#getElementID <em>Element ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element ID</em>'.
	 * @see forms.entityModeling.PageElement#getElementID()
	 * @see #getPageElement()
	 * @generated
	 */
	EAttribute getPageElement_ElementID();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.AttributePageElement <em>Attribute Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Page Element</em>'.
	 * @see forms.entityModeling.AttributePageElement
	 * @generated
	 */
	EClass getAttributePageElement();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.AttributePageElement#getAttributeToEnterValues <em>Attribute To Enter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute To Enter Values</em>'.
	 * @see forms.entityModeling.AttributePageElement#getAttributeToEnterValues()
	 * @see #getAttributePageElement()
	 * @generated
	 */
	EReference getAttributePageElement_AttributeToEnterValues();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.AttributePageElement#getValueOfAttribute <em>Value Of Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Of Attribute</em>'.
	 * @see forms.entityModeling.AttributePageElement#getValueOfAttribute()
	 * @see #getAttributePageElement()
	 * @generated
	 */
	EAttribute getAttributePageElement_ValueOfAttribute();

	/**
	 * Returns the meta object for the '{@link forms.entityModeling.AttributePageElement#enterValues() <em>Enter Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enter Values</em>' operation.
	 * @see forms.entityModeling.AttributePageElement#enterValues()
	 * @generated
	 */
	EOperation getAttributePageElement__EnterValues();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.RelationshipPageElement <em>Relationship Page Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship Page Element</em>'.
	 * @see forms.entityModeling.RelationshipPageElement
	 * @generated
	 */
	EClass getRelationshipPageElement();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.RelationshipPageElement#getRelationshipToEnterValues <em>Relationship To Enter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship To Enter Values</em>'.
	 * @see forms.entityModeling.RelationshipPageElement#getRelationshipToEnterValues()
	 * @see #getRelationshipPageElement()
	 * @generated
	 */
	EReference getRelationshipPageElement_RelationshipToEnterValues();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.RelationshipPageElement#getEditingForm <em>Editing Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Editing Form</em>'.
	 * @see forms.entityModeling.RelationshipPageElement#getEditingForm()
	 * @see #getRelationshipPageElement()
	 * @generated
	 */
	EReference getRelationshipPageElement_EditingForm();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Textfield <em>Textfield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textfield</em>'.
	 * @see forms.entityModeling.Textfield
	 * @generated
	 */
	EClass getTextfield();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Textfield#getAllowedValueFormat <em>Allowed Value Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allowed Value Format</em>'.
	 * @see forms.entityModeling.Textfield#getAllowedValueFormat()
	 * @see #getTextfield()
	 * @generated
	 */
	EAttribute getTextfield_AllowedValueFormat();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Textarea <em>Textarea</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Textarea</em>'.
	 * @see forms.entityModeling.Textarea
	 * @generated
	 */
	EClass getTextarea();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.SelectionField <em>Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Selection Field</em>'.
	 * @see forms.entityModeling.SelectionField
	 * @generated
	 */
	EClass getSelectionField();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.DateSelectionField <em>Date Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Selection Field</em>'.
	 * @see forms.entityModeling.DateSelectionField
	 * @generated
	 */
	EClass getDateSelectionField();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.TimeSelectionField <em>Time Selection Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Selection Field</em>'.
	 * @see forms.entityModeling.TimeSelectionField
	 * @generated
	 */
	EClass getTimeSelectionField();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see forms.entityModeling.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the reference list '{@link forms.entityModeling.List#getAlreadyEnteredEntity <em>Already Entered Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Already Entered Entity</em>'.
	 * @see forms.entityModeling.List#getAlreadyEnteredEntity()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_AlreadyEnteredEntity();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see forms.entityModeling.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.Table#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see forms.entityModeling.Table#getColumns()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Columns();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see forms.entityModeling.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.Column#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see forms.entityModeling.Column#getAttribute()
	 * @see #getColumn()
	 * @generated
	 */
	EReference getColumn_Attribute();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see forms.entityModeling.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Condition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see forms.entityModeling.Condition#getType()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Type();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.Condition#getConditionID <em>Condition ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition ID</em>'.
	 * @see forms.entityModeling.Condition#getConditionID()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ConditionID();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.AttributeValueCondition <em>Attribute Value Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Value Condition</em>'.
	 * @see forms.entityModeling.AttributeValueCondition
	 * @generated
	 */
	EClass getAttributeValueCondition();

	/**
	 * Returns the meta object for the reference '{@link forms.entityModeling.AttributeValueCondition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see forms.entityModeling.AttributeValueCondition#getValue()
	 * @see #getAttributeValueCondition()
	 * @generated
	 */
	EReference getAttributeValueCondition_Value();

	/**
	 * Returns the meta object for class '{@link forms.entityModeling.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Condition</em>'.
	 * @see forms.entityModeling.CompositeCondition
	 * @generated
	 */
	EClass getCompositeCondition();

	/**
	 * Returns the meta object for the attribute '{@link forms.entityModeling.CompositeCondition#getBooleanOperator <em>Boolean Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Operator</em>'.
	 * @see forms.entityModeling.CompositeCondition#getBooleanOperator()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EAttribute getCompositeCondition_BooleanOperator();

	/**
	 * Returns the meta object for the containment reference list '{@link forms.entityModeling.CompositeCondition#getComposedConditions <em>Composed Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composed Conditions</em>'.
	 * @see forms.entityModeling.CompositeCondition#getComposedConditions()
	 * @see #getCompositeCondition()
	 * @generated
	 */
	EReference getCompositeCondition_ComposedConditions();

	/**
	 * Returns the meta object for enum '{@link forms.entityModeling.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attribute Type</em>'.
	 * @see forms.entityModeling.AttributeType
	 * @generated
	 */
	EEnum getAttributeType();

	/**
	 * Returns the meta object for enum '{@link forms.entityModeling.ConditionType <em>Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Condition Type</em>'.
	 * @see forms.entityModeling.ConditionType
	 * @generated
	 */
	EEnum getConditionType();

	/**
	 * Returns the meta object for enum '{@link forms.entityModeling.BooleanOperators <em>Boolean Operators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Boolean Operators</em>'.
	 * @see forms.entityModeling.BooleanOperators
	 * @generated
	 */
	EEnum getBooleanOperators();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EntityModelingFactory getEntityModelingFactory();

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
		 * The meta object literal for the '{@link forms.entityModeling.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.EntityImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ID = eINSTANCE.getEntity_Id();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__ATTRIBUTES = eINSTANCE.getEntity_Attributes();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__SUPER_TYPE = eINSTANCE.getEntity_SuperType();

		/**
		 * The meta object literal for the '<em><b>Relationships</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__RELATIONSHIPS = eINSTANCE.getEntity_Relationships();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.AttributeImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Mandatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MANDATORY = eINSTANCE.getAttribute_Mandatory();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Enumeration Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__ENUMERATION_TYPE = eINSTANCE.getAttribute_EnumerationType();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.EnumerationImpl <em>Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.EnumerationImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getEnumeration()
		 * @generated
		 */
		EClass ENUMERATION = eINSTANCE.getEnumeration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.RelationshipImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__OPPOSITE = eINSTANCE.getRelationship_Opposite();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LOWER_BOUND = eINSTANCE.getRelationship_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UPPER_BOUND = eINSTANCE.getRelationship_UpperBound();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.LiteralImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__NAME = eINSTANCE.getLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.FormImpl <em>Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.FormImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getForm()
		 * @generated
		 */
		EClass FORM = eINSTANCE.getForm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__NAME = eINSTANCE.getForm_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__TITLE = eINSTANCE.getForm_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM__DESCRIPTION = eINSTANCE.getForm_Description();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__ENTITY = eINSTANCE.getForm_Entity();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM__PAGES = eINSTANCE.getForm_Pages();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.PageImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__TITLE = eINSTANCE.getPage_Title();

		/**
		 * The meta object literal for the '<em><b>Page Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__PAGE_ELEMENTS = eINSTANCE.getPage_PageElements();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__CONDITION = eINSTANCE.getPage_Condition();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.PageElementImpl <em>Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.PageElementImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getPageElement()
		 * @generated
		 */
		EClass PAGE_ELEMENT = eINSTANCE.getPageElement();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__LABEL = eINSTANCE.getPageElement_Label();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE_ELEMENT__CONDITION = eINSTANCE.getPageElement_Condition();

		/**
		 * The meta object literal for the '<em><b>Element ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE_ELEMENT__ELEMENT_ID = eINSTANCE.getPageElement_ElementID();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.AttributePageElementImpl <em>Attribute Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.AttributePageElementImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttributePageElement()
		 * @generated
		 */
		EClass ATTRIBUTE_PAGE_ELEMENT = eINSTANCE.getAttributePageElement();

		/**
		 * The meta object literal for the '<em><b>Attribute To Enter Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE_TO_ENTER_VALUES = eINSTANCE.getAttributePageElement_AttributeToEnterValues();

		/**
		 * The meta object literal for the '<em><b>Value Of Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE_PAGE_ELEMENT__VALUE_OF_ATTRIBUTE = eINSTANCE.getAttributePageElement_ValueOfAttribute();

		/**
		 * The meta object literal for the '<em><b>Enter Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ATTRIBUTE_PAGE_ELEMENT___ENTER_VALUES = eINSTANCE.getAttributePageElement__EnterValues();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.RelationshipPageElementImpl <em>Relationship Page Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.RelationshipPageElementImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getRelationshipPageElement()
		 * @generated
		 */
		EClass RELATIONSHIP_PAGE_ELEMENT = eINSTANCE.getRelationshipPageElement();

		/**
		 * The meta object literal for the '<em><b>Relationship To Enter Values</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP_TO_ENTER_VALUES = eINSTANCE.getRelationshipPageElement_RelationshipToEnterValues();

		/**
		 * The meta object literal for the '<em><b>Editing Form</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM = eINSTANCE.getRelationshipPageElement_EditingForm();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.TextfieldImpl <em>Textfield</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.TextfieldImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTextfield()
		 * @generated
		 */
		EClass TEXTFIELD = eINSTANCE.getTextfield();

		/**
		 * The meta object literal for the '<em><b>Allowed Value Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXTFIELD__ALLOWED_VALUE_FORMAT = eINSTANCE.getTextfield_AllowedValueFormat();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.TextareaImpl <em>Textarea</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.TextareaImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTextarea()
		 * @generated
		 */
		EClass TEXTAREA = eINSTANCE.getTextarea();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.SelectionFieldImpl <em>Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.SelectionFieldImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getSelectionField()
		 * @generated
		 */
		EClass SELECTION_FIELD = eINSTANCE.getSelectionField();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.DateSelectionFieldImpl <em>Date Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.DateSelectionFieldImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getDateSelectionField()
		 * @generated
		 */
		EClass DATE_SELECTION_FIELD = eINSTANCE.getDateSelectionField();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.TimeSelectionFieldImpl <em>Time Selection Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.TimeSelectionFieldImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTimeSelectionField()
		 * @generated
		 */
		EClass TIME_SELECTION_FIELD = eINSTANCE.getTimeSelectionField();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.ListImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Already Entered Entity</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ALREADY_ENTERED_ENTITY = eINSTANCE.getList_AlreadyEnteredEntity();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.TableImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__COLUMNS = eINSTANCE.getTable_Columns();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.ColumnImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLUMN__ATTRIBUTE = eINSTANCE.getColumn_Attribute();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.ConditionImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__TYPE = eINSTANCE.getCondition_Type();

		/**
		 * The meta object literal for the '<em><b>Condition ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__CONDITION_ID = eINSTANCE.getCondition_ConditionID();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.AttributeValueConditionImpl <em>Attribute Value Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.AttributeValueConditionImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttributeValueCondition()
		 * @generated
		 */
		EClass ATTRIBUTE_VALUE_CONDITION = eINSTANCE.getAttributeValueCondition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE_VALUE_CONDITION__VALUE = eINSTANCE.getAttributeValueCondition_Value();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.impl.CompositeConditionImpl <em>Composite Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.impl.CompositeConditionImpl
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getCompositeCondition()
		 * @generated
		 */
		EClass COMPOSITE_CONDITION = eINSTANCE.getCompositeCondition();

		/**
		 * The meta object literal for the '<em><b>Boolean Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_CONDITION__BOOLEAN_OPERATOR = eINSTANCE.getCompositeCondition_BooleanOperator();

		/**
		 * The meta object literal for the '<em><b>Composed Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_CONDITION__COMPOSED_CONDITIONS = eINSTANCE.getCompositeCondition_ComposedConditions();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.AttributeType <em>Attribute Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.AttributeType
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getAttributeType()
		 * @generated
		 */
		EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.ConditionType <em>Condition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.ConditionType
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getConditionType()
		 * @generated
		 */
		EEnum CONDITION_TYPE = eINSTANCE.getConditionType();

		/**
		 * The meta object literal for the '{@link forms.entityModeling.BooleanOperators <em>Boolean Operators</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see forms.entityModeling.BooleanOperators
		 * @see forms.entityModeling.impl.EntityModelingPackageImpl#getBooleanOperators()
		 * @generated
		 */
		EEnum BOOLEAN_OPERATORS = eINSTANCE.getBooleanOperators();

	}

} //EntityModelingPackage
