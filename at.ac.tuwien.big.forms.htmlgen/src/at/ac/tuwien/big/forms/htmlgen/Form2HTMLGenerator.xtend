package at.ac.tuwien.big.forms.htmlgen

import java.io.File
import at.ac.tuwien.big.forms.FormModel
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import at.ac.tuwien.big.forms.Form
import at.ac.tuwien.big.forms.Page
import at.ac.tuwien.big.forms.PageElement
import at.ac.tuwien.big.forms.AttributePageElement
import at.ac.tuwien.big.forms.TextField
import at.ac.tuwien.big.forms.TextArea
import at.ac.tuwien.big.forms.SelectionField
import at.ac.tuwien.big.forms.Literal
import at.ac.tuwien.big.forms.TimeSelectionField
import at.ac.tuwien.big.forms.DateSelectionField
import at.ac.tuwien.big.forms.AttributeType
import at.ac.tuwien.big.forms.Table
import at.ac.tuwien.big.forms.Column
import at.ac.tuwien.big.forms.RelationshipPageElement
import at.ac.tuwien.big.forms.List
import at.ac.tuwien.big.forms.CompositeCondition
import at.ac.tuwien.big.forms.Condition
import at.ac.tuwien.big.forms.AttributeValueCondition

class Form2HTMLGenerator implements IGenerator {

	override doGenerate(Resource resource, IFileSystemAccess fsa) {
		
		val listOfModels = resource.resourceSet.resources
		var formModel = null as FormModel
		for(model : listOfModels){
			if(model.contents.get(0) instanceof FormModel)
				formModel = model.contents.get(0) as FormModel
		}
		val name = new File('output.html');
	
		fsa.generateFile(
			name.toString,
			'''<!DOCTYPE html>
				<html lang="en">
				«generateHead(formModel)»
					<body>
           «FOR form : formModel.forms»
            «generateCode(form)»
          «ENDFOR»
					</body>
				</html>'''	
		)
	}
	
	
			
	def generateHead(FormModel formModel) {
		'''<head>
				<title>Form</title>
				<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
				<meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
				<link rel="stylesheet" type="text/css" href="../assets/form.css"/>
				<script src="../assets/jquery-1.10.2.min.js" type="text/javascript"></script>
				<script src="../assets/form.js" type="text/javascript"></script>
				<script type="text/javascript">
				$(document).ready(
				function(){				 
          «FOR form : formModel.forms»
            «registerForm(form)»
          «ENDFOR»
				form.init();
				});
				</script>
			</head>'''
	}
	
	def registerForm(Form form){
	  '''
	  «if(form.welcomeForm)
	  '''
	  form.addWelcomeForm('«form.title»');
	  '''»
          «FOR page : form.pages»
            «FOR pageElement : page.pageElements»
              «registerPE(pageElement, page)»
              «registerCondition(pageElement.condition, null, page)»
            «ENDFOR»
          «ENDFOR»
	  '''
	}
	
	def registerPE(PageElement pe, Page contPage){
	  if(pe instanceof TextField){
	    '''
	    form.addRegularExpression('«pe.elementID»','«pe.format»');
	    '''
	  } else if(pe instanceof RelationshipPageElement){
	    '''
	    form.addRelationshipPageElement ('«contPage.title»','«pe.elementID»','«pe.editingForm.title»','
	    «if(pe instanceof Table) "table" else "list"»','«pe.relationship.lowerBound»','«pe.relationship.upperBound»');
	    '''
	  }
	}
	
	def registerCondition(Condition c, Condition parent, Page contPage){
	  if(c instanceof CompositeCondition){
	    '''
      form.addCompositeCondition('«c.conditionID»', «if(parent==null) "null" else "'"+parent.conditionID+"'"», «c.type»'); 
	    «if(!c.composedConditions.isEmpty())
	     for(cc : c.composedConditions)
	       registerCondition(cc,c, contPage)»
      '''
	  } else if(c instanceof AttributeValueCondition){
	    '''
	    form.addAttributeValueCondition('«c.conditionID»',«if(parent==null) "null" else "'"+parent.conditionID+"'"»,('«contPage.title»'), '«c.value»', '«c.type»');
	    '''
	  }
	}
	
	def generateCode(Form form){
	  '''
	   <div class="form" id="«form.name»">
	     <form action="#" class="register">
	     <h1>«form.title»</h1>
	     <h2>«form.description»</h2>
	        «FOR page : form.pages»
            «generateCode(page)»
          «ENDFOR»
	     </form>
	   </div>
	  '''
	}
	
	def generateCode(Page page){
	  '''
	  <div class="page" id="«page.title»">
	  <fieldset class="row1">
	  <h3>«page.title»</h3>

	       «FOR pageElement : page.pageElements»
            «generateCode(pageElement)»
          «ENDFOR»

	  </fieldset>
	  </div>
	  '''
	}
	
	def generateCode(PageElement pageElement){
	  if(pageElement instanceof AttributePageElement){
	    '''
      <p>
       <label for="«pageElement.elementID»">«pageElement.label»«isMandatory(pageElement,0)»</label>
       «generateAPECode(pageElement)»
      </p>
      '''
	  } else if (pageElement instanceof RelationshipPageElement){
	    '''
	    «generateRPECode(pageElement)»
	    '''
	  }
	}
	
	def generateAPECode(AttributePageElement ape){
   if (ape instanceof TextArea){
	    generateCode(ape);
	  } else if (ape instanceof SelectionField){
	    generateCode(ape);
	  } else if (ape instanceof Column){
	    generateCode(ape);
	  } else {
      '''
      <input type="«generateType(ape)»" id="«ape.elementID»" «isMandatory(ape,1)»/>
      '''
    }
	}
	
	def generateCode(SelectionField ape){
	  '''
      <select id="«ape.elementID»" name="«ape.attribute.name»" «isMandatory(ape,1)»>
      <option value="default"> </option>
      «generateOptions(ape)»
      </select>
      '''
	}
	
	def generateCode(TextArea ape){
	  '''
      <textarea id="«ape.elementID»"></textarea>
    '''
	}
	
	def generateRPECode(RelationshipPageElement rpe){
	  if(rpe instanceof List){
      generateCode(rpe);
	  } else if(rpe instanceof Table){
      generateCode(rpe);
	  }
	}
	
	def generateCode(List rpe){
	    '''
      <div class="list" id="«rpe.elementID»">
       <fieldset class="row1">
         <legend class="legend">«rpe.label» List</legend>
         <ul></ul>
       </fieldset>
      </div>
      '''
	}
	
	def generateCode(Table rpe){
    '''
    <div class="table" id="«rpe.elementID»">
       <fieldset class="row1">
         <legend class="legend">«rpe.label» Table</legend>
     <table>
     <tr id="«rpe.elementID»_header">
      «FOR Column c : rpe.columns»
            «generateCode(c)»
      «ENDFOR»
     </tr>
     </table>
     </fieldset>
      </div>
      '''
  }
  /* TODO
   * Assignment says: "The columns created for a table don’t need this mandatory
   * check because they are not used as an input field and only display entered data."
   * But in the expected output there's "class="mandatory"" in columns?
   * https://tuwel.tuwien.ac.at/mod/forum/discuss.php?d=55220
   */
	def generateCode(Column c){
	  '''
	  <th>«c.label»</th>
	  '''
	}
	def generateType(AttributePageElement ape){
	  if(ape instanceof TextField)
	   '''text'''
	  else if (ape instanceof TimeSelectionField)
	   '''time'''
	  else if(ape instanceof DateSelectionField)
	   '''date'''  
	}
	
	def generateOptions(AttributePageElement ape){
	  if(ape.attribute.type.equals(AttributeType.BOOLEAN)){
	    '''
	    <option value="Yes">Yes</option>
	    <option value="No">No</option>
	    '''
	  } else if(ape.attribute.type.equals(AttributeType.NONE)){
	    '''
	    «FOR Literal l : ape.attribute.enumeration.literals»
            «generateOptions(l)»
      «ENDFOR»
	    '''
	  }
	}
	
	def generateOptions(Literal l){
	  '''
	  <option value="«l.name»">«l.value»</option>
	  '''
	}
	
	def isMandatory(AttributePageElement ape, int purpose){
	  if(ape.attribute.mandatory)
	   if(purpose == 0){
	     return "<span>*</span>";
	     }
	   else
	     return "class=\"mandatory\"";
	}
}