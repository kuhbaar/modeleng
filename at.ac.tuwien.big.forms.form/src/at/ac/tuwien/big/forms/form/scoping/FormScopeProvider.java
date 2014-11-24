/*
 * generated by Xtext
 */
package at.ac.tuwien.big.forms.form.scoping;

import java.util.Collection;
import java.util.HashSet;

import javax.management.relation.Relation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;

import at.ac.tuwien.big.forms.Attribute;
import at.ac.tuwien.big.forms.AttributePageElement;
import at.ac.tuwien.big.forms.AttributeValueCondition;
import at.ac.tuwien.big.forms.Entity;
import at.ac.tuwien.big.forms.Feature;
import at.ac.tuwien.big.forms.Form;
import at.ac.tuwien.big.forms.FormsPackage;
import at.ac.tuwien.big.forms.Relationship;
import at.ac.tuwien.big.forms.RelationshipPageElement;
import at.ac.tuwien.big.forms.impl.ColumnImpl;
import at.ac.tuwien.big.forms.impl.FormImpl;
import at.ac.tuwien.big.forms.impl.RelationshipPageElementImpl;


/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping
 * on how and when to use it 
 *
 */
public class FormScopeProvider extends org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider {
	//TODO works, but ctrl+space doesnt show the correct scope, https://tuwel.tuwien.ac.at/mod/forum/discuss.php?d=54021
	
	/* An attribute page element has to reference an attribute of the entity the containing form references. */
	// A column of a table can only reference attributes of the entity of the form the table edits.
	public IScope scope_AttributePageElement_attribute(AttributePageElement ape, EReference ref){
		if(ref.equals(FormsPackage.Literals.ATTRIBUTE_PAGE_ELEMENT__ATTRIBUTE)){
			Entity e;
			if(ape instanceof ColumnImpl){
				e = getEditingForm(ape).getEntity();
				System.out.println("GOT Editing Form of Column?! :" + e.getName());
			}
			else
				e = getForm(ape).getEntity();
			return Scopes.scopeFor(getEntitiesAttributes(e));
		}
		return IScope.NULLSCOPE;
	}
	
	// A relationship page element has to reference a relationship of the entity the containing form references.
	public IScope scope_RelationshipPageElement_relationship(RelationshipPageElement rpe, EReference ref){
		if(ref.equals(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP)){
			Entity e = getForm(rpe).getEntity();
			return Scopes.scopeFor(getEntitiesRelationships(e));
		}
		return IScope.NULLSCOPE;
	}
	
	// An attribute value condition has to reference an attribute of the entity the containing form references.
	public IScope scope_AttributeValueCondition_attribute(AttributeValueCondition avc, EReference ref){
		if(ref.equals(FormsPackage.Literals.RELATIONSHIP_PAGE_ELEMENT__RELATIONSHIP)){
			Entity e = getForm(avc).getEntity();
			return Scopes.scopeFor(getEntitiesAttributes(e));
		}
		return IScope.NULLSCOPE;
	}
	
	// A selection field is only allowed to reference an attribute of type Boolean or an attribute which has a reference to an enumeration.
	
	// A relationship page element has to reference a form of the same form model as editing form.
	
	private Form getForm(EObject o) {
		EObject container = o.eContainer();
		while (!(container instanceof FormImpl)){
			if(container == null)
				return null;
			container = container.eContainer();
		}
		return (Form) container;
	}
	
	private Form getEditingForm(EObject o){
		EObject container = o.eContainer();
		while (!(container instanceof RelationshipPageElementImpl)){
			if(container == null)
				return null;
			container = container.eContainer();

		}
		return (Form) ((RelationshipPageElement) container).getEditingForm();
	}
	
	private Collection<Relationship> getEntitiesRelationships(Entity e){
		Collection<Feature> feats = new HashSet<Feature>();
		feats.addAll(e.getFeatures());
		
		Entity st = e.getSuperType();
		
		while(st != null){
			feats.addAll(st.getFeatures());
			st = st.getSuperType();
		}
		
		Collection<Relationship> allRel = new HashSet<Relationship>();
		for (Feature f : feats){
			if(f instanceof Relationship)
				allRel.add((Relationship) f);
		}
		
		return allRel;
	}
	
	private Collection<Attribute> getEntitiesAttributes(Entity e) {
		Collection<Feature> feats = new HashSet<Feature>();
		feats.addAll(e.getFeatures());
		
		Entity st = e.getSuperType();
		
		while(st != null){
			feats.addAll(st.getFeatures());
			st = st.getSuperType();
		}
		
		Collection<Attribute> allAttr = new HashSet<Attribute>();
		for (Feature f : feats){
			if(f instanceof Attribute)
				allAttr.add((Attribute) f);
		}
		
		return allAttr;
	}

}
