package at.ac.tuwien.big.forms.alloygen

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import java.io.File
import at.ac.tuwien.big.forms.EntityModel
import at.ac.tuwien.big.forms.EntityModelElement
import at.ac.tuwien.big.forms.Entity
import at.ac.tuwien.big.forms.Enumeration
import at.ac.tuwien.big.forms.Feature
import at.ac.tuwien.big.forms.Attribute
import at.ac.tuwien.big.forms.Relationship

class Form2AlloyGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		var entityModel = resource.contents.get(0) as EntityModel
		var name = new File(resource.URI.toFileString).name.replace(".forms", ".als");
	
		fsa.generateFile(name,
			'''module ME14
			«FOR entityModelElement : entityModel.entityModelElements»
				«if(entityModelElement instanceof Entity){
					generateCodeForEntity(entityModelElement)
				} else if (entityModelElement instanceof Enumeration){
					generateCodeForEnumeration(entityModelElement)
				}»
          «ENDFOR»
          
          «FOR entityModelElement : entityModel.entityModelElements»
				«if(entityModelElement instanceof Entity){
					generateCodeForWrapperMethod(entityModelElement)
				}»
          «ENDFOR»
			'''
		)
	}
	
	def generateCodeForEntity(Entity entity) {
		'''
		sig «entity.name»«if(entity.superType !=null){" extends "+ entity.superType.name}» {
		«var i = 0»«
		FOR feature : entity.features»
			«{i = i + 1;""}»
			«if(feature instanceof Attribute){
				generateCodeForAttribute(feature, i, entity.features.size)
			} else if(feature instanceof Relationship){
				generateCodeForRelationship(feature, i, entity.features.size)
			} »
        «ENDFOR»
		}
		'''
	}
	
	def generateCodeForAttribute(Attribute attribute, int i, int size) {
		'''   «attribute.name»: «if(attribute.mandatory) "one " else "lone "»'''+
		'''«if(attribute.enumeration != null){attribute.enumeration.name}else{"Int"}»«if(i<size){''','''}»'''
	}
	
	def generateCodeForRelationship(Relationship relationship, int i, int size) {
		'''   «relationship.name»: «
		if(relationship.lowerBound == 0){
			if(relationship.upperBound == 1){"lone "}
			else if(relationship.upperBound == -1){"set "}
			else{"set "}}
		else if(relationship.lowerBound == 1){
			if(relationship.upperBound == 1){"one "}
			else if(relationship.upperBound == -1){"some "}
			else{"set "}
			}
			else{"set "}»«relationship.target.name»«if(i<size){''','''}»'''
	}
	
	
	def generateCodeForEnumeration(Enumeration enumeration) {
		'''enum «enumeration.name»{
		«var i = 0»«
		FOR literal : enumeration.literals»
			«{i = i + 1;""}»
			«literal.name»«if(i<enumeration.literals.size){''','''}» 
	   «ENDFOR»
		}
		'''
	}
	
	def generateCodeForWrapperMethod(Entity entity){
		
		'''«FOR feature : entity.features»
				«if(feature instanceof Relationship){
					generateCodeForBidirectionalConstraint(feature, entity)
				} »
        	«ENDFOR»
        	«FOR feature : entity.features»
				«if(feature instanceof Relationship){
					generateCodeForMultiplicityConstraint(feature, entity)
				} »
        	«ENDFOR»
		'''
		
	}
	
	def generateCodeForBidirectionalConstraint(Relationship relationship, Entity entity){
		'''
		«if(relationship.opposite!=null){
			'''fact {all x: «entity.name»| all y: «relationship.target.name» | y in x.«relationship.name» implies x in y.«relationship.opposite.name»
			   }
			   '''
			}»
		'''
		//fact {all pub: Publication, per: Person | per in pub.authors implies pub in per.publications}
	}
	
	def generateCodeForMultiplicityConstraint(Relationship relationship, Entity entity){
		
		'''
		«if(relationship.lowerBound>1){
			'''
			fact {all x: «entity.name» | #x.«relationship.name» >=«relationship.lowerBound»}
			'''
		}»
		«if(relationship.upperBound>1){
			'''
			fact {all x: «entity.name» | #x.«relationship.name» <=«relationship.upperBound»}
			'''
		}»
		'''
		//fact{all cou: Course | #cou.isEnroledBy >=10}
	}
	
	
}
