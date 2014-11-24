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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'entity'", "'extends'", "'{'", "'id'", "','", "'}'", "'attribute'", "'*'", "':'", "'reference'", "'['", "'..'", "']'", "'opposite-of'", "'enum'", "'='", "'-'", "'.'", "'String'", "'Integer'", "'Text'", "'Date'", "'Time'", "'Email'", "'Boolean'", "'Year'", "'None'"
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
    public static final int RULE_STRING=5;
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
    public static final int RULE_INT=6;
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:153:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:154:2: (iv_ruleEntity= ruleEntity EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:155:2: iv_ruleEntity= ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity296);
            iv_ruleEntity=ruleEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEntity; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity306); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:162:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) ) ) otherlv_11= '}' ) ;
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
        Token otherlv_11=null;
        EObject lv_features_8_0 = null;

        EObject lv_features_10_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:165:28: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) ) ) otherlv_11= '}' ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:166:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) ) ) otherlv_11= '}' )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:166:1: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) ) ) otherlv_11= '}' )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:166:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? otherlv_4= '{' otherlv_5= 'id' ( ( ruleQualifiedName ) ) otherlv_7= ',' ( ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleEntity343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:170:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:171:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:171:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:172:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity360); if (state.failed) return current;
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

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:188:2: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:188:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleEntity378); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:192:1: ( (otherlv_3= RULE_ID ) )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:193:1: (otherlv_3= RULE_ID )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:193:1: (otherlv_3= RULE_ID )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:194:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEntityRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEntity398); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEntity412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleEntity424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getIdKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:213:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:214:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:214:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:215:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEntityRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleEntity447);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:232:1: ( ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:232:2: ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )* ( (lv_features_10_0= ruleFeature ) )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:232:2: ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )*
            loop4:
            do {
                int alt4=2;
                alt4 = dfa4.predict(input);
                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:232:3: ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ','
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:232:3: ( (lv_features_8_0= ruleFeature ) )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:233:1: (lv_features_8_0= ruleFeature )
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:233:1: (lv_features_8_0= ruleFeature )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:234:3: lv_features_8_0= ruleFeature
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity482);
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

            	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEntity494); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getCommaKeyword_7_0_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:254:3: ( (lv_features_10_0= ruleFeature ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:255:1: (lv_features_10_0= ruleFeature )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:255:1: (lv_features_10_0= ruleFeature )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:256:3: lv_features_10_0= ruleFeature
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_ruleEntity517);
            lv_features_10_0=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEntityRule());
              	        }
                     		add(
                     			current, 
                     			"features",
                      		lv_features_10_0, 
                      		"Feature");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEntity530); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8());
                  
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:284:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:285:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:286:2: iv_ruleAttribute= ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute566);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttribute; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute576); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:293:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? ) ;
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
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:296:28: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:297:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:297:1: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )? )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:297:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '*' )? otherlv_3= ':' ( (lv_type_4_0= ruleAttributeType ) ) (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleAttribute613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:301:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:302:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:302:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:303:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttribute630); if (state.failed) return current;
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

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:319:2: (otherlv_2= '*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:319:4: otherlv_2= '*'
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleAttribute648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getAsteriskKeyword_2());
                          
                    }

                    }
                    break;

            }

            otherlv_3=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute662); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getColonKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:327:1: ( (lv_type_4_0= ruleAttributeType ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:328:1: (lv_type_4_0= ruleAttributeType )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:328:1: (lv_type_4_0= ruleAttributeType )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:329:3: lv_type_4_0= ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_ruleAttribute683);
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

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:345:2: (otherlv_5= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:345:4: otherlv_5= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleAttribute696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getColonKeyword_5_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:349:1: ( ( ruleQualifiedName ) )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:350:1: ( ruleQualifiedName )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:350:1: ( ruleQualifiedName )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:351:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAttributeRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAttribute719);
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:372:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:373:2: (iv_ruleRelationship= ruleRelationship EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:374:2: iv_ruleRelationship= ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship757);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationship; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship767); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:381:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_lowerBound_5_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:384:28: ( (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:385:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:385:1: (otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )? )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:385:3: otherlv_0= 'reference' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '[' ( (lv_lowerBound_5_0= ruleEInt ) ) otherlv_6= '..' ( (lv_upperBound_7_0= ruleEInt ) ) otherlv_8= ']' (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleRelationship804); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getReferenceKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:389:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:390:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:390:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:391:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleRelationship821); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleRelationship838); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getColonKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:411:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:412:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:412:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:413:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getRelationshipRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleRelationship861);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRelationship873); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:430:1: ( (lv_lowerBound_5_0= ruleEInt ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:431:1: (lv_lowerBound_5_0= ruleEInt )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:431:1: (lv_lowerBound_5_0= ruleEInt )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:432:3: lv_lowerBound_5_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getLowerBoundEIntParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRelationship894);
            lv_lowerBound_5_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"lowerBound",
                      		lv_lowerBound_5_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRelationship906); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getFullStopFullStopKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:452:1: ( (lv_upperBound_7_0= ruleEInt ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:453:1: (lv_upperBound_7_0= ruleEInt )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:453:1: (lv_upperBound_7_0= ruleEInt )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:454:3: lv_upperBound_7_0= ruleEInt
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getRelationshipAccess().getUpperBoundEIntParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRelationship927);
            lv_upperBound_7_0=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getRelationshipRule());
              	        }
                     		set(
                     			current, 
                     			"upperBound",
                      		lv_upperBound_7_0, 
                      		"EInt");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRelationship939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:474:1: (otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:474:3: otherlv_9= 'opposite-of' ( ( ruleQualifiedName ) )
                    {
                    otherlv_9=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRelationship952); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getOppositeOfKeyword_9_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:478:1: ( ( ruleQualifiedName ) )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:479:1: ( ruleQualifiedName )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:479:1: ( ruleQualifiedName )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:480:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRelationshipRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_9_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleRelationship975);
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:501:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:502:2: (iv_ruleFeature= ruleFeature EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:503:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature1013);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature1023); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:510:1: ruleFeature returns [EObject current=null] : (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Attribute_0 = null;

        EObject this_Relationship_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:513:28: ( (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:514:1: (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:514:1: (this_Attribute_0= ruleAttribute | this_Relationship_1= ruleRelationship )
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
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:515:5: this_Attribute_0= ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_ruleFeature1070);
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
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:525:5: this_Relationship_1= ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_ruleFeature1097);
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:541:1: entryRuleEnumeration returns [EObject current=null] : iv_ruleEnumeration= ruleEnumeration EOF ;
    public final EObject entryRuleEnumeration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnumeration = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:542:2: (iv_ruleEnumeration= ruleEnumeration EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:543:2: iv_ruleEnumeration= ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration1132);
            iv_ruleEnumeration=ruleEnumeration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEnumeration; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration1142); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:550:1: ruleEnumeration returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ',' )* ( (lv_literals_5_0= ruleLiteral ) ) otherlv_6= '}' ) ;
    public final EObject ruleEnumeration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:553:28: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ',' )* ( (lv_literals_5_0= ruleLiteral ) ) otherlv_6= '}' ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:554:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ',' )* ( (lv_literals_5_0= ruleLiteral ) ) otherlv_6= '}' )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:554:1: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ',' )* ( (lv_literals_5_0= ruleLiteral ) ) otherlv_6= '}' )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:554:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ',' )* ( (lv_literals_5_0= ruleLiteral ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleEnumeration1179); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:558:1: ( (lv_name_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:559:1: (lv_name_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:559:1: (lv_name_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:560:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEnumeration1196); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleEnumeration1213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:580:1: ( ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ',' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==26) ) {
                        int LA9_2 = input.LA(3);

                        if ( (LA9_2==RULE_STRING) ) {
                            int LA9_3 = input.LA(4);

                            if ( (LA9_3==15) ) {
                                alt9=1;
                            }


                        }


                    }


                }


                switch (alt9) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:580:2: ( (lv_literals_3_0= ruleLiteral ) ) otherlv_4= ','
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:580:2: ( (lv_literals_3_0= ruleLiteral ) )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:581:1: (lv_literals_3_0= ruleLiteral )
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:581:1: (lv_literals_3_0= ruleLiteral )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:582:3: lv_literals_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleEnumeration1235);
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

            	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleEnumeration1247); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getEnumerationAccess().getCommaKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:602:3: ( (lv_literals_5_0= ruleLiteral ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:603:1: (lv_literals_5_0= ruleLiteral )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:603:1: (lv_literals_5_0= ruleLiteral )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:604:3: lv_literals_5_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_ruleEnumeration1270);
            lv_literals_5_0=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEnumerationRule());
              	        }
                     		add(
                     			current, 
                     			"literals",
                      		lv_literals_5_0, 
                      		"Literal");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleEnumeration1282); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5());
                  
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:632:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:633:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:634:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral1318);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral1328); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:641:1: ruleLiteral returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token lv_value_2_0=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:644:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:645:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:645:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:645:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '=' ( (lv_value_2_0= RULE_STRING ) )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:645:2: ( (lv_name_0_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:646:1: (lv_name_0_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:646:1: (lv_name_0_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:647:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleLiteral1370); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleLiteral1387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLiteralAccess().getEqualsSignKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:667:1: ( (lv_value_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:668:1: (lv_value_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:668:1: (lv_value_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:669:3: lv_value_2_0= RULE_STRING
            {
            lv_value_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleLiteral1404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_2_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"STRING");
              	    
            }

            }


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


    // $ANTLR start "entryRuleEInt"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:693:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:694:2: (iv_ruleEInt= ruleEInt EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:695:2: iv_ruleEInt= ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1446);
            iv_ruleEInt=ruleEInt();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEInt.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1457); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:702:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:705:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:706:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:706:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:706:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:706:2: (kw= '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:707:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEInt1496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                  
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:727:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:728:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:729:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1559);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1570); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:736:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:739:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:740:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:740:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:740:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1610); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) && (synpred1_InternalEntity())) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:2: ( ( '.' )=>kw= '.' )
            	    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleQualifiedName1638); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName1654); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:770:1: ruleAttributeType returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) ) ;
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
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:772:28: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) ) )
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:773:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) )
            {
            // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:773:1: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'Integer' ) | (enumLiteral_2= 'Text' ) | (enumLiteral_3= 'Date' ) | (enumLiteral_4= 'Time' ) | (enumLiteral_5= 'Email' ) | (enumLiteral_6= 'Boolean' ) | (enumLiteral_7= 'Year' ) | (enumLiteral_8= 'None' ) )
            int alt12=9;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            case 34:
                {
                alt12=6;
                }
                break;
            case 35:
                {
                alt12=7;
                }
                break;
            case 36:
                {
                alt12=8;
                }
                break;
            case 37:
                {
                alt12=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:773:2: (enumLiteral_0= 'String' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:773:2: (enumLiteral_0= 'String' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:773:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleAttributeType1715); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:779:6: (enumLiteral_1= 'Integer' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:779:6: (enumLiteral_1= 'Integer' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:779:8: enumLiteral_1= 'Integer'
                    {
                    enumLiteral_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleAttributeType1732); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:785:6: (enumLiteral_2= 'Text' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:785:6: (enumLiteral_2= 'Text' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:785:8: enumLiteral_2= 'Text'
                    {
                    enumLiteral_2=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAttributeType1749); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:791:6: (enumLiteral_3= 'Date' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:791:6: (enumLiteral_3= 'Date' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:791:8: enumLiteral_3= 'Date'
                    {
                    enumLiteral_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAttributeType1766); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:797:6: (enumLiteral_4= 'Time' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:797:6: (enumLiteral_4= 'Time' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:797:8: enumLiteral_4= 'Time'
                    {
                    enumLiteral_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleAttributeType1783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:803:6: (enumLiteral_5= 'Email' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:803:6: (enumLiteral_5= 'Email' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:803:8: enumLiteral_5= 'Email'
                    {
                    enumLiteral_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleAttributeType1800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_5, grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:809:6: (enumLiteral_6= 'Boolean' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:809:6: (enumLiteral_6= 'Boolean' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:809:8: enumLiteral_6= 'Boolean'
                    {
                    enumLiteral_6=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleAttributeType1817); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_6, grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                          
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:815:6: (enumLiteral_7= 'Year' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:815:6: (enumLiteral_7= 'Year' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:815:8: enumLiteral_7= 'Year'
                    {
                    enumLiteral_7=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleAttributeType1834); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_7, grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                          
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:821:6: (enumLiteral_8= 'None' )
                    {
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:821:6: (enumLiteral_8= 'None' )
                    // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:821:8: enumLiteral_8= 'None'
                    {
                    enumLiteral_8=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleAttributeType1851); if (state.failed) return current;
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
        // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:747:3: ( '.' )
        // ../at.ac.tuwien.big.forms.entity/src-gen/at/ac/tuwien/big/forms/entity/parser/antlr/internal/InternalEntity.g:748:2: '.'
        {
        match(input,28,FollowSets000.FOLLOW_28_in_synpred1_InternalEntity1629); if (state.failed) return ;

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


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\45\uffff";
    static final String DFA4_eofS =
        "\45\uffff";
    static final String DFA4_minS =
        "\1\21\2\4\1\22\2\23\1\35\1\4\11\17\1\25\1\4\2\uffff\1\4\1\6\1\17"+
        "\1\25\1\6\1\26\1\4\1\6\1\17\1\6\1\27\1\17\1\4\1\17\1\4\1\17";
    static final String DFA4_maxS =
        "\1\24\2\4\3\23\1\45\1\4\11\23\1\34\1\4\2\uffff\1\4\1\33\2\34\1"+
        "\6\1\26\1\4\1\33\1\34\1\6\1\27\1\30\1\4\1\34\1\4\1\34";
    static final String DFA4_acceptS =
        "\23\uffff\1\2\1\1\20\uffff";
    static final String DFA4_specialS =
        "\45\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\7",
            "\1\6",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\21",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\24\1\23\2\uffff\1\22",
            "\1\26\6\uffff\1\25",
            "\1\27",
            "",
            "",
            "\1\30",
            "\1\32\24\uffff\1\31",
            "\1\24\1\23\13\uffff\1\33",
            "\1\26\6\uffff\1\25",
            "\1\32",
            "\1\34",
            "\1\35",
            "\1\37\24\uffff\1\36",
            "\1\24\1\23\13\uffff\1\33",
            "\1\37",
            "\1\40",
            "\1\24\1\23\7\uffff\1\41",
            "\1\42",
            "\1\24\1\23\13\uffff\1\43",
            "\1\44",
            "\1\24\1\23\13\uffff\1\43"
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "()* loopback of 232:2: ( ( (lv_features_8_0= ruleFeature ) ) otherlv_9= ',' )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_ruleEntityModel140 = new BitSet(new long[]{0x0000000002000802L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModelElement187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_ruleEntityModelElement234 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_ruleEntityModelElement261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity296 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleEntity343 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity360 = new BitSet(new long[]{0x0000000000003000L});
        public static final BitSet FOLLOW_12_in_ruleEntity378 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEntity398 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEntity412 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleEntity424 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEntity447 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEntity459 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity482 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEntity494 = new BitSet(new long[]{0x0000000000120000L});
        public static final BitSet FOLLOW_ruleFeature_in_ruleEntity517 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEntity530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute566 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleAttribute613 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttribute630 = new BitSet(new long[]{0x00000000000C0000L});
        public static final BitSet FOLLOW_18_in_ruleAttribute648 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleAttribute662 = new BitSet(new long[]{0x0000003FE0000000L});
        public static final BitSet FOLLOW_ruleAttributeType_in_ruleAttribute683 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_19_in_ruleAttribute696 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute719 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleRelationship804 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleRelationship821 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleRelationship838 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship861 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleRelationship873 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRelationship894 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRelationship906 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRelationship927 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleRelationship939 = new BitSet(new long[]{0x0000000001000002L});
        public static final BitSet FOLLOW_24_in_ruleRelationship952 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleRelationship975 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature1013 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature1023 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_ruleFeature1070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_ruleFeature1097 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration1132 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration1142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleEnumeration1179 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEnumeration1196 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleEnumeration1213 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1235 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleEnumeration1247 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleLiteral_in_ruleEnumeration1270 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleEnumeration1282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1318 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1328 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleLiteral1370 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleLiteral1387 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral1404 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1446 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEInt1496 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1559 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1570 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1610 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_28_in_ruleQualifiedName1638 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName1654 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_29_in_ruleAttributeType1715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleAttributeType1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAttributeType1749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleAttributeType1766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleAttributeType1783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleAttributeType1800 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleAttributeType1817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleAttributeType1834 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleAttributeType1851 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_synpred1_InternalEntity1629 = new BitSet(new long[]{0x0000000000000002L});
    }


}