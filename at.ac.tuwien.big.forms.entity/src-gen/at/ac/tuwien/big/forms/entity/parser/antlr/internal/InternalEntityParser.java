package at.ac.tuwien.big.forms.entity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.ac.tuwien.big.forms.entity.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'id'", "','", "'}'", "'attribute'", "'*'", "':'", "'reference'", "'['", "'...'", "']'", "'opposite-of'", "'enum'", "'='", "'\"'", "'.'", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'0'"
    };
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalEntityParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEntityParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEntityParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g"; }



     	private EntityGrammarAccess grammarAccess;
     	
        public InternalEntityParser(TokenStream input, EntityGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EntityModel";	
       	}
       	
       	@Override
       	protected EntityGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEntityModel"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:68:1: entryRuleEntityModel returns [EObject current=null] : iv_ruleEntityModel= ruleEntityModel EOF ;
    public final EObject entryRuleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModel = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:69:2: (iv_ruleEntityModel= ruleEntityModel EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:70:2: iv_ruleEntityModel= ruleEntityModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModel_in_entryRuleEntityModel75);
            iv_ruleEntityModel=ruleEntityModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:77:1: ruleEntityModel returns [EObject current=null] : ( () ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* ) ;
    public final EObject ruleEntityModel() throws RecognitionException {
        EObject current = null;

        EObject lv_entityModelElements_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:80:28: ( ( () ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:81:1: ( () ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:81:1: ( () ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )* )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:81:2: () ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )*
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:81:2: ()
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEntityModelAccess().getEntityModelAction_0(),
                          current);
                  
            }

            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:87:2: ( (lv_entityModelElements_1_0= ruleEntityModelElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==25) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:88:1: (lv_entityModelElements_1_0= ruleEntityModelElement )
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:88:1: (lv_entityModelElements_1_0= ruleEntityModelElement )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:89:3: lv_entityModelElements_1_0= ruleEntityModelElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_ruleEntityModel140);
            	    lv_entityModelElements_1_0=ruleEntityModelElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"entityModelElements",
            	              		lv_entityModelElements_1_0, 
            	              		"EntityModelElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntityModelElement"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:113:1: entryRuleEntityModelElement returns [EObject current=null] : iv_ruleEntityModelElement= ruleEntityModelElement EOF ;
    public final EObject entryRuleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityModelElement = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:114:2: (iv_ruleEntityModelElement= ruleEntityModelElement EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:115:2: iv_ruleEntityModelElement= ruleEntityModelElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityModelElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement177);
            iv_ruleEntityModelElement=ruleEntityModelElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntityModelElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityModelElement187); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntityModelElement"


    // $ANTLR start "ruleEntityModelElement"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:122:1: ruleEntityModelElement returns [EObject current=null] : (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration ) ;
    public final EObject ruleEntityModelElement() throws RecognitionException {
        EObject current = null;

        EObject this_Entity_0 = null;

        EObject this_Enumeration_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:125:28: ( (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:126:1: (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:126:1: (this_Entity_0= ruleEntity | this_Enumeration_1= ruleEnumeration )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:127:5: this_Entity_0= ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_ruleEntityModelElement234);
                    this_Entity_0=ruleEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Entity_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:137:5: this_Enumeration_1= ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_ruleEntityModelElement261);
                    this_Enumeration_1=ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Enumeration_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntityModelElement"


    // $ANTLR start "entryRuleEntity"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:155:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:156:2: (iv_ruleEntity= ruleEntity EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:157:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity298);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity308); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:164:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'id' ( ( ruleQualifiedName ) ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_features_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:167:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'id' ( ( ruleQualifiedName ) ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:168:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'id' ( ( ruleQualifiedName ) ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:168:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'id' ( ( ruleQualifiedName ) ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}' )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:168:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' (otherlv_5= 'id' ( ( ruleQualifiedName ) ) ) (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEntity345); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:172:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:173:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:173:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:174:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity362); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:190:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:190:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntity380); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:194:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:195:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:195:1: (otherlv_3= RULE_ID )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:196:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEntityRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity400); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:211:1: (otherlv_5= 'id' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:211:3: otherlv_5= 'id' ( ( ruleQualifiedName ) )
            {
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getIdKeyword_4_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:215:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:216:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:216:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:217:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getIdAttributeCrossReference_4_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEntity450);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:230:3: (otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:230:5: otherlv_7= ',' ( (lv_features_8_0= ruleFeature ) )
            	    {
            	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity464); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_5_0());
            	          
            	    }
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:234:1: ( (lv_features_8_0= ruleFeature ) )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:235:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:235:1: (lv_features_8_0= ruleFeature )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:236:3: lv_features_8_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity485);
            	    lv_features_8_0=ruleFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEntityRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"features",
            	              		lv_features_8_0, 
            	              		"Feature");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity499); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:264:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:265:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:266:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute535);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute545); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:273:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:276:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:277:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:277:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:277:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAttribute582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:281:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:282:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:282:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:283:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute599); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:299:2: (otherlv_2= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:299:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute617); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsteriskKeyword_2());
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute631); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:307:1: ( (lv_type_4_0= ruleAttributeType ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:308:1: (lv_type_4_0= ruleAttributeType )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:308:1: (lv_type_4_0= ruleAttributeType )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:309:3: lv_type_4_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttribute652);
            lv_type_4_0=ruleAttributeType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_4_0, 
                      		"AttributeType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:325:2: (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:325:4: otherlv_5= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute665); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:329:1: ( ( ruleQualifiedName ) )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:330:1: ( ruleQualifiedName )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:330:1: ( ruleQualifiedName )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:331:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAttribute688);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:352:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:353:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:354:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship726);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship736); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:361:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']' ) (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_lowerBound_5_0=null;
        Token otherlv_6=null;
        Token lv_upperBound_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:364:28: ( (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']' ) (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:365:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']' ) (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:365:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']' ) (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:365:3: otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) (otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']' ) (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRelationship773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getReferenceKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:369:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:370:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:370:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:371:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelationship790); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRelationship807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getColonKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:391:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:392:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:392:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:393:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleRelationship830);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:406:2: (otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']' )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:406:4: otherlv_4= '[' ( (lv_lowerBound_5_0= RULE_INT ) ) otherlv_6= '...' ( (lv_upperBound_7_0= RULE_INT ) ) otherlv_8= ']'
            {
            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRelationship843); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:410:1: ( (lv_lowerBound_5_0= RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:411:1: (lv_lowerBound_5_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:411:1: (lv_lowerBound_5_0= RULE_INT )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:412:3: lv_lowerBound_5_0= RULE_INT
            {
            lv_lowerBound_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleRelationship860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_lowerBound_5_0, grammarAccess.getRelationshipAccess().getLowerBoundINTTerminalRuleCall_4_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_5_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRelationship877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getFullStopFullStopFullStopKeyword_4_2());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:432:1: ( (lv_upperBound_7_0= RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:433:1: (lv_upperBound_7_0= RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:433:1: (lv_upperBound_7_0= RULE_INT )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:434:3: lv_upperBound_7_0= RULE_INT
            {
            lv_upperBound_7_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleRelationship894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_upperBound_7_0, grammarAccess.getRelationshipAccess().getUpperBoundINTTerminalRuleCall_4_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRelationship911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_4_4());
                  
            }

            }

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:454:2: (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:454:4: otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRelationship925); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getOppositeOfKeyword_5_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:458:1: ( ( ruleQualifiedName ) )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:459:1: ( ruleQualifiedName )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:459:1: ( ruleQualifiedName )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:460:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleRelationship948);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleFeature"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:481:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:482:2: (iv_ruleFeature= ruleFeature EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:483:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature986);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature996); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:490:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:493:28: ( (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:494:1: (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:494:1: (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            else if ( (LA8_0==20) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:495:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleFeature1043);
                    this_Attribute_0=ruleAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Attribute_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:505:5: this_Relationship_1= ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleFeature1070);
                    this_Relationship_1=ruleRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Relationship_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEnumeration"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:521:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:522:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:523:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration1105);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration1115); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:530:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) )+ otherlv_4= ',' otherlv_5= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_literals_3_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:533:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) )+ otherlv_4= ',' otherlv_5= '}' ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:534:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) )+ otherlv_4= ',' otherlv_5= '}' )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:534:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) )+ otherlv_4= ',' otherlv_5= '}' )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:534:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleLiteral ) )+ otherlv_4= ',' otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumeration1152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:538:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:539:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:539:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:540:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumeration1169); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEnumerationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumeration1186); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:560:1: ( (lv_literals_3_0= ruleLiteral ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:561:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:561:1: (lv_literals_3_0= ruleLiteral )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:562:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleEnumeration1207);
            	    lv_literals_3_0=ruleLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"literals",
            	              		lv_literals_3_0, 
            	              		"Literal");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnumeration1220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEnumeration1232); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleLiteral"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:594:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:595:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:596:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral1268);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral1278); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:603:1: ruleLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '\"' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= '\"' ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_value_3_0=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:606:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '\"' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= '\"' ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:607:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '\"' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= '\"' )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:607:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '\"' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= '\"' )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:607:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' otherlv_2= '\"' ( (lv_value_3_0= RULE_STRING ) ) otherlv_4= '\"'
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:607:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:608:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:608:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:609:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral1320); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLiteral1337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getEqualsSignKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteral1349); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:633:1: ( (lv_value_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:634:1: (lv_value_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:634:1: (lv_value_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:635:3: lv_value_3_0= RULE_STRING
            {
            lv_value_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral1366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_3_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleLiteral1383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getLiteralAccess().getQuotationMarkKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:665:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:666:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:667:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1422);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1433); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:674:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:677:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:678:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:678:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:678:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:685:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) && (synpred1_InternalEntity())) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:685:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:685:2: ( ( '.' )=>kw= '.' )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:685:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleQualifiedName1501); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1517); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleAttributeType"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:708:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= '1' ) | (enumLiteral_1= '2' ) | (enumLiteral_2= '3' ) | (enumLiteral_3= '4' ) | (enumLiteral_4= '5' ) | (enumLiteral_5= '6' ) | (enumLiteral_6= '7' ) | (enumLiteral_7= '8' ) | (enumLiteral_8= '0' ) ) ;
    public final Enumerator ruleAttributeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:710:28: ( ( (enumLiteral_0= '1' ) | (enumLiteral_1= '2' ) | (enumLiteral_2= '3' ) | (enumLiteral_3= '4' ) | (enumLiteral_4= '5' ) | (enumLiteral_5= '6' ) | (enumLiteral_6= '7' ) | (enumLiteral_7= '8' ) | (enumLiteral_8= '0' ) ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:711:1: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '2' ) | (enumLiteral_2= '3' ) | (enumLiteral_3= '4' ) | (enumLiteral_4= '5' ) | (enumLiteral_5= '6' ) | (enumLiteral_6= '7' ) | (enumLiteral_7= '8' ) | (enumLiteral_8= '0' ) )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:711:1: ( (enumLiteral_0= '1' ) | (enumLiteral_1= '2' ) | (enumLiteral_2= '3' ) | (enumLiteral_3= '4' ) | (enumLiteral_4= '5' ) | (enumLiteral_5= '6' ) | (enumLiteral_6= '7' ) | (enumLiteral_7= '8' ) | (enumLiteral_8= '0' ) )
            int alt11=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 32:
                {
                alt11=4;
                }
                break;
            case 33:
                {
                alt11=5;
                }
                break;
            case 34:
                {
                alt11=6;
                }
                break;
            case 35:
                {
                alt11=7;
                }
                break;
            case 36:
                {
                alt11=8;
                }
                break;
            case 37:
                {
                alt11=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:711:2: (enumLiteral_0= '1' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:711:2: (enumLiteral_0= '1' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:711:4: enumLiteral_0= '1'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeType1578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:717:6: (enumLiteral_1= '2' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:717:6: (enumLiteral_1= '2' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:717:8: enumLiteral_1= '2'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeType1595); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:723:6: (enumLiteral_2= '3' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:723:6: (enumLiteral_2= '3' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:723:8: enumLiteral_2= '3'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAttributeType1612); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:729:6: (enumLiteral_3= '4' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:729:6: (enumLiteral_3= '4' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:729:8: enumLiteral_3= '4'
                    {
                    enumLiteral_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAttributeType1629); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:735:6: (enumLiteral_4= '5' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:735:6: (enumLiteral_4= '5' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:735:8: enumLiteral_4= '5'
                    {
                    enumLiteral_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAttributeType1646); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:741:6: (enumLiteral_5= '6' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:741:6: (enumLiteral_5= '6' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:741:8: enumLiteral_5= '6'
                    {
                    enumLiteral_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAttributeType1663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:6: (enumLiteral_6= '7' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:6: (enumLiteral_6= '7' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:8: enumLiteral_6= '7'
                    {
                    enumLiteral_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAttributeType1680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:753:6: (enumLiteral_7= '8' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:753:6: (enumLiteral_7= '8' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:753:8: enumLiteral_7= '8'
                    {
                    enumLiteral_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAttributeType1697); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:759:6: (enumLiteral_8= '0' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:759:6: (enumLiteral_8= '0' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:759:8: enumLiteral_8= '0'
                    {
                    enumLiteral_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAttributeType1714); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_8, grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeType"

    // $ANTLR start synpred1_InternalEntity
    public final void synpred1_InternalEntity_fragment() throws RecognitionException {   
        // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:685:3: ( '.' )
        // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:686:2: '.'
        {
        match(input,28,FollowSets000.FOLLOW_28_in_synpred1_InternalEntity1492); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEntity

    // Delegated rules

    public final boolean synpred1_InternalEntity() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEntity_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_ruleEntityModel140 = new BitSet(new long[]{0x0000000002000802L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModelElement187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleEntityModelElement234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_ruleEntityModelElement261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity298 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEntity345 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity362 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleEntity380 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity400 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEntity414 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEntity427 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity450 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleEntity464 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity485 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_16_in_ruleEntity499 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute535 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute545 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAttribute582 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute599 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute617 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttribute631 = new BitSet(new long[]{0x0000003FE0000000L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute652 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleAttribute665 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute688 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship726 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship736 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleRelationship773 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship790 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRelationship807 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship830 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRelationship843 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleRelationship860 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRelationship877 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleRelationship894 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleRelationship911 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRelationship925 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship948 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature986 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleFeature1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1105 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1115 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnumeration1152 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1169 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEnumeration1186 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1207 = new BitSet(new long[]{0x0000000000008010L});
        public static final BitSet FOLLOW_15_in_ruleEnumeration1220 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEnumeration1232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1268 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1278 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral1320 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLiteral1337 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleLiteral1349 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral1366 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleLiteral1383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1422 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1433 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1473 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleQualifiedName1501 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1517 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeType1578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAttributeType1595 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAttributeType1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAttributeType1629 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAttributeType1646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAttributeType1663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAttributeType1680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAttributeType1697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAttributeType1714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred1_InternalEntity1492 = new BitSet(new long[]{0x0000000000000002L});
    }


}