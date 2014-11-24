package at.ac.tuwien.big.forms.form.serializer;

import at.ac.tuwien.big.forms.AttributeValueCondition;
import at.ac.tuwien.big.forms.Column;
import at.ac.tuwien.big.forms.CompositeCondition;
import at.ac.tuwien.big.forms.DateSelectionField;
import at.ac.tuwien.big.forms.Form;
import at.ac.tuwien.big.forms.FormModel;
import at.ac.tuwien.big.forms.FormsPackage;
import at.ac.tuwien.big.forms.List;
import at.ac.tuwien.big.forms.Page;
import at.ac.tuwien.big.forms.SelectionField;
import at.ac.tuwien.big.forms.Table;
import at.ac.tuwien.big.forms.TextArea;
import at.ac.tuwien.big.forms.TextField;
import at.ac.tuwien.big.forms.TimeSelectionField;
import at.ac.tuwien.big.forms.form.services.FormGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractFormSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FormGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FormsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FormsPackage.ATTRIBUTE_VALUE_CONDITION:
				if(context == grammarAccess.getAttributeValueConditionRule() ||
				   context == grammarAccess.getConditionRule()) {
					sequence_AttributeValueCondition(context, (AttributeValueCondition) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.COLUMN:
				if(context == grammarAccess.getAttributePageElementRule() ||
				   context == grammarAccess.getColumnRule() ||
				   context == grammarAccess.getPageElementRule()) {
					sequence_Column(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.COMPOSITE_CONDITION:
				if(context == grammarAccess.getCompositeConditionRule() ||
				   context == grammarAccess.getConditionRule()) {
					sequence_CompositeCondition(context, (CompositeCondition) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.DATE_SELECTION_FIELD:
				if(context == grammarAccess.getAttributePageElementRule() ||
				   context == grammarAccess.getDateSelectionFieldRule() ||
				   context == grammarAccess.getPageElementRule()) {
					sequence_DateSelectionField(context, (DateSelectionField) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.FORM:
				if(context == grammarAccess.getFormRule()) {
					sequence_Form(context, (Form) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.FORM_MODEL:
				if(context == grammarAccess.getFormModelRule()) {
					sequence_FormModel(context, (FormModel) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.LIST:
				if(context == grammarAccess.getListRule() ||
				   context == grammarAccess.getPageElementRule() ||
				   context == grammarAccess.getRelationshipPageElementRule()) {
					sequence_List(context, (List) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.PAGE:
				if(context == grammarAccess.getPageRule()) {
					sequence_Page(context, (Page) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.SELECTION_FIELD:
				if(context == grammarAccess.getAttributePageElementRule() ||
				   context == grammarAccess.getPageElementRule() ||
				   context == grammarAccess.getSelectionFieldRule()) {
					sequence_SelectionField(context, (SelectionField) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.TABLE:
				if(context == grammarAccess.getPageElementRule() ||
				   context == grammarAccess.getRelationshipPageElementRule() ||
				   context == grammarAccess.getTableRule()) {
					sequence_Table(context, (Table) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.TEXT_AREA:
				if(context == grammarAccess.getAttributePageElementRule() ||
				   context == grammarAccess.getPageElementRule() ||
				   context == grammarAccess.getTextAreaRule()) {
					sequence_TextArea(context, (TextArea) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.TEXT_FIELD:
				if(context == grammarAccess.getAttributePageElementRule() ||
				   context == grammarAccess.getPageElementRule() ||
				   context == grammarAccess.getTextFieldRule()) {
					sequence_TextField(context, (TextField) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.TIME_SELECTION_FIELD:
				if(context == grammarAccess.getAttributePageElementRule() ||
				   context == grammarAccess.getPageElementRule() ||
				   context == grammarAccess.getTimeSelectionFieldRule()) {
					sequence_TimeSelectionField(context, (TimeSelectionField) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (conditionID=EString attribute=[Attribute|QualifiedName] value=EString type=ConditionType)
	 */
	protected void sequence_AttributeValueCondition(EObject context, AttributeValueCondition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FormsPackage.Literals.CONDITION__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormsPackage.Literals.CONDITION__TYPE));
			if(transientValues.isValueTransient(semanticObject, FormsPackage.Literals.CONDITION__CONDITION_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormsPackage.Literals.CONDITION__CONDITION_ID));
			if(transientValues.isValueTransient(semanticObject, FormsPackage.Literals.ATTRIBUTE_VALUE_CONDITION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormsPackage.Literals.ATTRIBUTE_VALUE_CONDITION__VALUE));
			if(transientValues.isValueTransient(semanticObject, FormsPackage.Literals.ATTRIBUTE_VALUE_CONDITION__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormsPackage.Literals.ATTRIBUTE_VALUE_CONDITION__ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeValueConditionAccess().getConditionIDEStringParserRuleCall_1_0(), semanticObject.getConditionID());
		feeder.accept(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeQualifiedNameParserRuleCall_3_0_1(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getAttributeValueConditionAccess().getValueEStringParserRuleCall_5_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString attribute=[Attribute|QualifiedName])
	 */
	protected void sequence_Column(EObject context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         conditionID=EString 
	 *         composedConditions+=AttributeValueCondition 
	 *         compositionType=CompositeConditionType 
	 *         composedConditions+=AttributeValueCondition 
	 *         type=ConditionType
	 *     )
	 */
	protected void sequence_CompositeCondition(EObject context, CompositeCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString attribute=[Attribute|QualifiedName])
	 */
	protected void sequence_DateSelectionField(EObject context, DateSelectionField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     forms+=Form+
	 */
	protected void sequence_FormModel(EObject context, FormModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         welcomeForm?='welcome'? 
	 *         name=ID 
	 *         title=EString 
	 *         description=EString? 
	 *         entity=[Entity|QualifiedName] 
	 *         pages+=Page*
	 *     )
	 */
	protected void sequence_Form(EObject context, Form semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString relationship=[Relationship|QualifiedName] editingForm=[Form|QualifiedName])
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (title=STRING pageElements+=PageElement* pageElements+=PageElement condition=Condition?)
	 */
	protected void sequence_Page(EObject context, Page semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString attribute=[Attribute|QualifiedName])
	 */
	protected void sequence_SelectionField(EObject context, SelectionField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         elementID=EString 
	 *         label=EString 
	 *         relationship=[Relationship|QualifiedName] 
	 *         columns+=Column* 
	 *         columns+=Column 
	 *         editingForm=[Form|QualifiedName]
	 *     )
	 */
	protected void sequence_Table(EObject context, Table semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString attribute=[Attribute|QualifiedName])
	 */
	protected void sequence_TextArea(EObject context, TextArea semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString format=EString? attribute=[Attribute|QualifiedName])
	 */
	protected void sequence_TextField(EObject context, TextField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elementID=EString label=EString attribute=[Attribute|QualifiedName])
	 */
	protected void sequence_TimeSelectionField(EObject context, TimeSelectionField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
