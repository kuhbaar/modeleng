package at.ac.tuwien.big.forms.entity.serializer;

import at.ac.tuwien.big.forms.Attribute;
import at.ac.tuwien.big.forms.Entity;
import at.ac.tuwien.big.forms.EntityModel;
import at.ac.tuwien.big.forms.Enumeration;
import at.ac.tuwien.big.forms.FormsPackage;
import at.ac.tuwien.big.forms.Literal;
import at.ac.tuwien.big.forms.Relationship;
import at.ac.tuwien.big.forms.entity.services.EntityGrammarAccess;
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
public abstract class AbstractEntitySemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntityGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FormsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FormsPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule() ||
				   context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.ENTITY:
				if(context == grammarAccess.getEntityRule() ||
				   context == grammarAccess.getEntityModelElementRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.ENTITY_MODEL:
				if(context == grammarAccess.getEntityModelRule()) {
					sequence_EntityModel(context, (EntityModel) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.ENUMERATION:
				if(context == grammarAccess.getEntityModelElementRule() ||
				   context == grammarAccess.getEnumerationRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_Enumeration(context, (Enumeration) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.LITERAL:
				if(context == grammarAccess.getLiteralRule()) {
					sequence_Literal(context, (Literal) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getNamedElementRule()) {
					sequence_Literal_NamedElement(context, (Literal) semanticObject); 
					return; 
				}
				else break;
			case FormsPackage.RELATIONSHIP:
				if(context == grammarAccess.getFeatureRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRelationshipRule()) {
					sequence_Relationship(context, (Relationship) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID type=AttributeType enumeration=[Enumeration|QualifiedName]?)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (entityModelElements+=EntityModelElement*)
	 */
	protected void sequence_EntityModel(EObject context, EntityModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Entity|ID]? id=[Attribute|QualifiedName] features+=Feature*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID literals+=Literal+)
	 */
	protected void sequence_Enumeration(EObject context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_Literal(EObject context, Literal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FormsPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormsPackage.Literals.NAMED_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, FormsPackage.Literals.LITERAL__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FormsPackage.Literals.LITERAL__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING name=STRING)
	 */
	protected void sequence_Literal_NamedElement(EObject context, Literal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID target=[Entity|QualifiedName] lowerBound=INT upperBound=INT opposite=[Relationship|QualifiedName]?)
	 */
	protected void sequence_Relationship(EObject context, Relationship semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
