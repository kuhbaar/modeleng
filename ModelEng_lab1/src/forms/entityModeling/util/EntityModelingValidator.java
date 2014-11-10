/**
 */
package forms.entityModeling.util;

import forms.entityModeling.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see forms.entityModeling.EntityModelingPackage
 * @generated
 */
public class EntityModelingValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final EntityModelingValidator INSTANCE = new EntityModelingValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "forms.entityModeling";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityModelingValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return EntityModelingPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case EntityModelingPackage.ENTITY:
				return validateEntity((Entity)value, diagnostics, context);
			case EntityModelingPackage.ATTRIBUTE:
				return validateAttribute((Attribute)value, diagnostics, context);
			case EntityModelingPackage.ENUMERATION:
				return validateEnumeration((Enumeration)value, diagnostics, context);
			case EntityModelingPackage.RELATIONSHIP:
				return validateRelationship((Relationship)value, diagnostics, context);
			case EntityModelingPackage.LITERAL:
				return validateLiteral((Literal)value, diagnostics, context);
			case EntityModelingPackage.FORM:
				return validateForm((Form)value, diagnostics, context);
			case EntityModelingPackage.PAGE:
				return validatePage((Page)value, diagnostics, context);
			case EntityModelingPackage.PAGE_ELEMENT:
				return validatePageElement((PageElement)value, diagnostics, context);
			case EntityModelingPackage.ATTRIBUTE_PAGE_ELEMENT:
				return validateAttributePageElement((AttributePageElement)value, diagnostics, context);
			case EntityModelingPackage.RELATIONSHIP_PAGE_ELEMENT:
				return validateRelationshipPageElement((RelationshipPageElement)value, diagnostics, context);
			case EntityModelingPackage.TEXTFIELD:
				return validateTextfield((Textfield)value, diagnostics, context);
			case EntityModelingPackage.TEXTAREA:
				return validateTextarea((Textarea)value, diagnostics, context);
			case EntityModelingPackage.SELECTION_FIELD:
				return validateSelectionField((SelectionField)value, diagnostics, context);
			case EntityModelingPackage.DATE_SELECTION_FIELD:
				return validateDateSelectionField((DateSelectionField)value, diagnostics, context);
			case EntityModelingPackage.TIME_SELECTION_FIELD:
				return validateTimeSelectionField((TimeSelectionField)value, diagnostics, context);
			case EntityModelingPackage.LIST:
				return validateList((List)value, diagnostics, context);
			case EntityModelingPackage.TABLE:
				return validateTable((Table)value, diagnostics, context);
			case EntityModelingPackage.COLUMN:
				return validateColumn((Column)value, diagnostics, context);
			case EntityModelingPackage.CONDITION:
				return validateCondition((Condition)value, diagnostics, context);
			case EntityModelingPackage.ATTRIBUTE_VALUE_CONDITION:
				return validateAttributeValueCondition((AttributeValueCondition)value, diagnostics, context);
			case EntityModelingPackage.COMPOSITE_CONDITION:
				return validateCompositeCondition((CompositeCondition)value, diagnostics, context);
			case EntityModelingPackage.ATTRIBUTE_TYPE:
				return validateAttributeType((AttributeType)value, diagnostics, context);
			case EntityModelingPackage.CONDITION_TYPE:
				return validateConditionType((ConditionType)value, diagnostics, context);
			case EntityModelingPackage.BOOLEAN_OPERATORS:
				return validateBooleanOperators((BooleanOperators)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(entity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_NeedIdWhenNoSuperType(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_IdIsMandatory(entity, diagnostics, context);
		if (result || diagnostics != null) result &= validateEntity_SuperTypeIsNotSelf(entity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the NeedIdWhenNoSuperType constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__NEED_ID_WHEN_NO_SUPER_TYPE__EEXPRESSION = "if self.superType -> isEmpty() then self.id -> notEmpty() else self.id -> isEmpty() endif";

	/**
	 * Validates the NeedIdWhenNoSuperType constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_NeedIdWhenNoSuperType(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "NeedIdWhenNoSuperType",
				 ENTITY__NEED_ID_WHEN_NO_SUPER_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the IdIsMandatory constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__ID_IS_MANDATORY__EEXPRESSION = "if self.id -> notEmpty() then self.id.mandatory = true else true endif";

	/**
	 * Validates the IdIsMandatory constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_IdIsMandatory(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "IdIsMandatory",
				 ENTITY__ID_IS_MANDATORY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the SuperTypeIsNotSelf constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ENTITY__SUPER_TYPE_IS_NOT_SELF__EEXPRESSION = "self.superType <> self";

	/**
	 * Validates the SuperTypeIsNotSelf constraint of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEntity_SuperTypeIsNotSelf(Entity entity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.ENTITY,
				 entity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "SuperTypeIsNotSelf",
				 ENTITY__SUPER_TYPE_IS_NOT_SELF__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(attribute, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(attribute, diagnostics, context);
		if (result || diagnostics != null) result &= validateAttribute_ifEnumerationThenAttributeTypeMustBeNone(attribute, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the ifEnumerationThenAttributeTypeMustBeNone constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ATTRIBUTE__IF_ENUMERATION_THEN_ATTRIBUTE_TYPE_MUST_BE_NONE__EEXPRESSION = "if self.enumerationType -> isEmpty() then self.type <> forms::entityModeling::AttributeType::None else self.type = forms::entityModeling::AttributeType::None endif";

	/**
	 * Validates the ifEnumerationThenAttributeTypeMustBeNone constraint of '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttribute_ifEnumerationThenAttributeTypeMustBeNone(Attribute attribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.ATTRIBUTE,
				 attribute,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "ifEnumerationThenAttributeTypeMustBeNone",
				 ATTRIBUTE__IF_ENUMERATION_THEN_ATTRIBUTE_TYPE_MUST_BE_NONE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnumeration(Enumeration enumeration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(enumeration, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationship, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationship, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationship_lowerBoundUpperBoundConstraints(relationship, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the lowerBoundUpperBoundConstraints constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP__LOWER_BOUND_UPPER_BOUND_CONSTRAINTS__EEXPRESSION = "self.lowerBound >= 0 and (self.upperBound >= self.lowerBound or self.upperBound = -1) ";

	/**
	 * Validates the lowerBoundUpperBoundConstraints constraint of '<em>Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationship_lowerBoundUpperBoundConstraints(Relationship relationship, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.RELATIONSHIP,
				 relationship,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "lowerBoundUpperBoundConstraints",
				 RELATIONSHIP__LOWER_BOUND_UPPER_BOUND_CONSTRAINTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiteral(Literal literal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(literal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(form, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(form, diagnostics, context);
		if (result || diagnostics != null) result &= validateForm_checkAttributePageElement(form, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the checkAttributePageElement constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FORM__CHECK_ATTRIBUTE_PAGE_ELEMENT__EEXPRESSION = "self.pages.pageElements -> select(e: PageElement | e.oclIsKindOf(AttributePageElement)) \n" +
		"\t\t\t-> forAll(e1|if self.entity.superType -> isEmpty() then self.entity.id -> union(self.entity.attributes) -> includes(e1.oclAsType(AttributePageElement).attributeToEnterValues) \n" +
		"\t\t\t\telse if self.entity.superType.attributes -> isEmpty() \n" +
		"\t\t\t\t\tthen self.entity.id -> union(self.entity.attributes) -> including(self.entity.superType.id) -> includes(e1.oclAsType(AttributePageElement).attributeToEnterValues) \n" +
		"\t\t\t\t\telse self.entity.id -> union(self.entity.attributes) -> including(self.entity.superType.id) -> union(self.entity.superType.attributes) -> includes(e1.oclAsType(AttributePageElement).attributeToEnterValues)\n" +
		"\t\t\t\t\tendif\n" +
		"\t\t\t\tendif \n" +
		"\t\t\t)";

	/**
	 * Validates the checkAttributePageElement constraint of '<em>Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForm_checkAttributePageElement(Form form, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.FORM,
				 form,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "checkAttributePageElement",
				 FORM__CHECK_ATTRIBUTE_PAGE_ELEMENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageElement(PageElement pageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributePageElement(AttributePageElement attributePageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributePageElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relationshipPageElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relationshipPageElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_editingFormEntityAndRelationshipEntityMustBeTheSame(relationshipPageElement, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the editingFormEntityAndRelationshipEntityMustBeTheSame constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM_ENTITY_AND_RELATIONSHIP_ENTITY_MUST_BE_THE_SAME__EEXPRESSION = "self.relationshipToEnterValues.target = self.editingForm.entity";

	/**
	 * Validates the editingFormEntityAndRelationshipEntityMustBeTheSame constraint of '<em>Relationship Page Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRelationshipPageElement_editingFormEntityAndRelationshipEntityMustBeTheSame(RelationshipPageElement relationshipPageElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.RELATIONSHIP_PAGE_ELEMENT,
				 relationshipPageElement,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "editingFormEntityAndRelationshipEntityMustBeTheSame",
				 RELATIONSHIP_PAGE_ELEMENT__EDITING_FORM_ENTITY_AND_RELATIONSHIP_ENTITY_MUST_BE_THE_SAME__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextfield(Textfield textfield, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textfield, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextarea(Textarea textarea, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textarea, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionField(SelectionField selectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(selectionField, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(selectionField, diagnostics, context);
		if (result || diagnostics != null) result &= validateSelectionField_onlyAttributesBooleanOrEnum(selectionField, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the onlyAttributesBooleanOrEnum constraint of '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SELECTION_FIELD__ONLY_ATTRIBUTES_BOOLEAN_OR_ENUM__EEXPRESSION = "self.valueOfAttribute = forms::entityModeling::AttributeType::_'Boolean' or self.valueOfAttribute = forms::entityModeling::AttributeType::None";

	/**
	 * Validates the onlyAttributesBooleanOrEnum constraint of '<em>Selection Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectionField_onlyAttributesBooleanOrEnum(SelectionField selectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(EntityModelingPackage.Literals.SELECTION_FIELD,
				 selectionField,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "onlyAttributesBooleanOrEnum",
				 SELECTION_FIELD__ONLY_ATTRIBUTES_BOOLEAN_OR_ENUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDateSelectionField(DateSelectionField dateSelectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dateSelectionField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTimeSelectionField(TimeSelectionField timeSelectionField, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(timeSelectionField, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateList(List list, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(list, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(list, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_editingFormEntityAndRelationshipEntityMustBeTheSame(list, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTable(Table table, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(table, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(table, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelationshipPageElement_editingFormEntityAndRelationshipEntityMustBeTheSame(table, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColumn(Column column, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(column, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCondition(Condition condition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(condition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeValueCondition(AttributeValueCondition attributeValueCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(attributeValueCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompositeCondition(CompositeCondition compositeCondition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compositeCondition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAttributeType(AttributeType attributeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConditionType(ConditionType conditionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanOperators(BooleanOperators booleanOperators, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //EntityModelingValidator
