package at.ac.tuwien.big.forms.form.parser.antlr.internal; 

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
import at.ac.tuwien.big.forms.form.services.FormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFormParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'welcome'", "'form'", "'\"'", "'handles'", "'{'", "'}'", "'page'", "','", "'with'", "'composite-condition'", "':'", "'attribute-condition'", "'=='", "'?'", "'table'", "'edits'", "'list'", "'time-selection-field'", "'date-selection-field'", "'column'", "'selection-field'", "'text-area'", "'text-field'", "'format'", "'.'", "'0'", "'1'", "'2'", "'3'", "'4'"
    };
    public static final int RULE_ID=4;
    public static final int T__40=40;
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
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalFormParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFormParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFormParser.tokenNames; }
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g"; }



     	private FormGrammarAccess grammarAccess;
     	
        public InternalFormParser(TokenStream input, FormGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "FormModel";	
       	}
       	
       	@Override
       	protected FormGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleFormModel"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:68:1: entryRuleFormModel returns [EObject current=null] : iv_ruleFormModel= ruleFormModel EOF ;
    public final EObject entryRuleFormModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFormModel = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:69:2: (iv_ruleFormModel= ruleFormModel EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:70:2: iv_ruleFormModel= ruleFormModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormModel_in_entryRuleFormModel75);
            iv_ruleFormModel=ruleFormModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFormModel; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormModel85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFormModel"


    // $ANTLR start "ruleFormModel"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:77:1: ruleFormModel returns [EObject current=null] : ( () ( (lv_forms_1_0= ruleForm ) )* ) ;
    public final EObject ruleFormModel() throws RecognitionException {
        EObject current = null;

        EObject lv_forms_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:80:28: ( ( () ( (lv_forms_1_0= ruleForm ) )* ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:1: ( () ( (lv_forms_1_0= ruleForm ) )* )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:1: ( () ( (lv_forms_1_0= ruleForm ) )* )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:2: () ( (lv_forms_1_0= ruleForm ) )*
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:2: ()
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:82:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getFormModelAccess().getFormModelAction_0(),
                          current);
                  
            }

            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:87:2: ( (lv_forms_1_0= ruleForm ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:88:1: (lv_forms_1_0= ruleForm )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:88:1: (lv_forms_1_0= ruleForm )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:89:3: lv_forms_1_0= ruleForm
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_1_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleForm_in_ruleFormModel140);
            	    lv_forms_1_0=ruleForm();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormModelRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"forms",
            	              		lv_forms_1_0, 
            	              		"Form");
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
    // $ANTLR end "ruleFormModel"


    // $ANTLR start "entryRuleForm"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:113:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:114:2: (iv_ruleForm= ruleForm EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:115:2: iv_ruleForm= ruleForm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFormRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_entryRuleForm177);
            iv_ruleForm=ruleForm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleForm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForm187); if (state.failed) return current;

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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:122:1: ruleForm returns [EObject current=null] : ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= '\"' otherlv_6= 'handles' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_pages_9_0= rulePage ) )* otherlv_10= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token lv_welcomeForm_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token lv_title_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_pages_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:125:28: ( ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= '\"' otherlv_6= 'handles' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_pages_9_0= rulePage ) )* otherlv_10= '}' ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:1: ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= '\"' otherlv_6= 'handles' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_pages_9_0= rulePage ) )* otherlv_10= '}' )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:1: ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= '\"' otherlv_6= 'handles' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_pages_9_0= rulePage ) )* otherlv_10= '}' )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:2: ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '\"' ( (lv_title_4_0= RULE_STRING ) ) otherlv_5= '\"' otherlv_6= 'handles' ( ( ruleQualifiedName ) ) otherlv_8= '{' ( (lv_pages_9_0= rulePage ) )* otherlv_10= '}'
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:2: ( (lv_welcomeForm_0_0= 'welcome' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:127:1: (lv_welcomeForm_0_0= 'welcome' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:127:1: (lv_welcomeForm_0_0= 'welcome' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:128:3: lv_welcomeForm_0_0= 'welcome'
                    {
                    lv_welcomeForm_0_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleForm230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_welcomeForm_0_0, grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getFormRule());
                      	        }
                             		setWithLastConsumed(current, "welcomeForm", true, "welcome");
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleForm256); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getFormAccess().getFormKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:145:1: ( (lv_name_2_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:146:1: (lv_name_2_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:146:1: (lv_name_2_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:147:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleForm273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleForm290); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getFormAccess().getQuotationMarkKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:167:1: ( (lv_title_4_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:168:1: (lv_title_4_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:168:1: (lv_title_4_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:169:3: lv_title_4_0= RULE_STRING
            {
            lv_title_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleForm307); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_title_4_0, grammarAccess.getFormAccess().getTitleSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getFormRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"title",
                      		lv_title_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleForm324); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFormAccess().getQuotationMarkKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleForm336); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getFormAccess().getHandlesKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:193:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:194:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:194:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:195:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFormRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormAccess().getEntityEntityCrossReference_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleForm359);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForm371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_8());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:212:1: ( (lv_pages_9_0= rulePage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:213:1: (lv_pages_9_0= rulePage )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:213:1: (lv_pages_9_0= rulePage )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:214:3: lv_pages_9_0= rulePage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormAccess().getPagesPageParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleForm392);
            	    lv_pages_9_0=rulePage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pages",
            	              		lv_pages_9_0, 
            	              		"Page");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleForm405); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRulePage"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:242:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:243:2: (iv_rulePage= rulePage EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:244:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage441);
            iv_rulePage=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage451); if (state.failed) return current;

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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:251:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' otherlv_1= '\"' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= '{' ( ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )? )* otherlv_7= '}' ( (lv_condition_8_0= ruleCondition ) )? ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_title_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_pageElements_5_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:254:28: ( (otherlv_0= 'page' otherlv_1= '\"' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= '{' ( ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )? )* otherlv_7= '}' ( (lv_condition_8_0= ruleCondition ) )? ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:255:1: (otherlv_0= 'page' otherlv_1= '\"' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= '{' ( ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )? )* otherlv_7= '}' ( (lv_condition_8_0= ruleCondition ) )? )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:255:1: (otherlv_0= 'page' otherlv_1= '\"' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= '{' ( ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )? )* otherlv_7= '}' ( (lv_condition_8_0= ruleCondition ) )? )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:255:3: otherlv_0= 'page' otherlv_1= '\"' ( (lv_title_2_0= RULE_STRING ) ) otherlv_3= '\"' otherlv_4= '{' ( ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )? )* otherlv_7= '}' ( (lv_condition_8_0= ruleCondition ) )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage488); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePage500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPageAccess().getQuotationMarkKeyword_1());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:263:1: ( (lv_title_2_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:264:1: (lv_title_2_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:264:1: (lv_title_2_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:3: lv_title_2_0= RULE_STRING
            {
            lv_title_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePage517); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_title_2_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"title",
                      		lv_title_2_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePage534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPageAccess().getQuotationMarkKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePage546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:289:1: ( ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )? )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25||(LA5_0>=27 && LA5_0<=33)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:289:2: ( (lv_pageElements_5_0= rulePageElement ) ) (otherlv_6= ',' )?
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:289:2: ( (lv_pageElements_5_0= rulePageElement ) )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:290:1: (lv_pageElements_5_0= rulePageElement )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:290:1: (lv_pageElements_5_0= rulePageElement )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:291:3: lv_pageElements_5_0= rulePageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_5_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rulePage568);
            	    lv_pageElements_5_0=rulePageElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pageElements",
            	              		lv_pageElements_5_0, 
            	              		"PageElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:307:2: (otherlv_6= ',' )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==18) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:307:4: otherlv_6= ','
            	            {
            	            otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePage581); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getCommaKeyword_5_1());
            	                  
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePage597); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:315:1: ( (lv_condition_8_0= ruleCondition ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:316:1: (lv_condition_8_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:316:1: (lv_condition_8_0= ruleCondition )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:317:3: lv_condition_8_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_7_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rulePage618);
                    lv_condition_8_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPageRule());
                      	        }
                             		set(
                             			current, 
                             			"condition",
                              		lv_condition_8_0, 
                              		"Condition");
                      	        afterParserOrEnumRuleCall();
                      	    
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
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:341:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:342:2: (iv_ruleCondition= ruleCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:343:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition655);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition665); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:350:1: ruleCondition returns [EObject current=null] : ( (otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition ) | (otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AttributeValueCondition_1 = null;

        EObject this_CompositeCondition_3 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:353:28: ( ( (otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition ) | (otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:354:1: ( (otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition ) | (otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:354:1: ( (otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition ) | (otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==20) ) {
                    alt7=2;
                }
                else if ( (LA7_1==22) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:354:2: (otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:354:2: (otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:354:4: otherlv_0= 'with' this_AttributeValueCondition_1= ruleAttributeValueCondition
                    {
                    otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCondition703); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getConditionAccess().getWithKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCondition725);
                    this_AttributeValueCondition_1=ruleAttributeValueCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeValueCondition_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:368:6: (otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:368:6: (otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:368:8: otherlv_2= 'with' this_CompositeCondition_3= ruleCompositeCondition
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCondition744); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getWithKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_ruleCondition766);
                    this_CompositeCondition_3=ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeCondition_3; 
                              afterParserOrEnumRuleCall();
                          
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:389:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:390:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:391:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition802);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition812); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:398:1: ruleCompositeCondition returns [EObject current=null] : (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionID_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:401:28: ( (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:402:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:402:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:402:3: otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':'
            {
            otherlv_0=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCompositeCondition849); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:406:1: ( (lv_conditionID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:407:1: (lv_conditionID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:407:1: (lv_conditionID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:408:3: lv_conditionID_1_0= RULE_ID
            {
            lv_conditionID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCompositeCondition866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_conditionID_1_0, grammarAccess.getCompositeConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCompositeCondition883); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeConditionAccess().getColonKeyword_2());
                  
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:436:1: entryRuleAttributeValueCondition returns [EObject current=null] : iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF ;
    public final EObject entryRuleAttributeValueCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:437:2: (iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:438:2: iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition919);
            iv_ruleAttributeValueCondition=ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeValueCondition929); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributeValueCondition"


    // $ANTLR start "ruleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:445:1: ruleAttributeValueCondition returns [EObject current=null] : (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) ) ;
    public final EObject ruleAttributeValueCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_conditionID_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:448:28: ( (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:449:1: (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:449:1: (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:449:3: otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) )
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleAttributeValueCondition966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:453:1: ( (lv_conditionID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:454:1: (lv_conditionID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:454:1: (lv_conditionID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:455:3: lv_conditionID_1_0= RULE_ID
            {
            lv_conditionID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleAttributeValueCondition983); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_conditionID_1_0, grammarAccess.getAttributeValueConditionAccess().getConditionIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleAttributeValueCondition1000); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:475:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:476:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:476:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:477:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAttributeValueCondition1023);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAttributeValueCondition1035); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:494:1: ( (lv_value_5_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:495:1: (lv_value_5_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:495:1: (lv_value_5_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:496:3: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleAttributeValueCondition1052); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_5_0, grammarAccess.getAttributeValueConditionAccess().getValueSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAttributeValueCondition1069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:516:1: ( (lv_type_7_0= ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:517:1: (lv_type_7_0= ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:517:1: (lv_type_7_0= ruleConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:518:3: lv_type_7_0= ruleConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_ruleAttributeValueCondition1090);
            lv_type_7_0=ruleConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeValueConditionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_7_0, 
                      		"ConditionType");
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleAttributeValueCondition"


    // $ANTLR start "entryRulePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:542:1: entryRulePageElement returns [EObject current=null] : iv_rulePageElement= rulePageElement EOF ;
    public final EObject entryRulePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:543:2: (iv_rulePageElement= rulePageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:544:2: iv_rulePageElement= rulePageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_entryRulePageElement1126);
            iv_rulePageElement=rulePageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageElement1136); if (state.failed) return current;

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
    // $ANTLR end "entryRulePageElement"


    // $ANTLR start "rulePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:551:1: rulePageElement returns [EObject current=null] : (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement ) ;
    public final EObject rulePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributePageElement_0 = null;

        EObject this_RelationshipPageElement_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:554:28: ( (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:555:1: (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:555:1: (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=28 && LA8_0<=33)) ) {
                alt8=1;
            }
            else if ( (LA8_0==25||LA8_0==27) ) {
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:556:5: this_AttributePageElement_0= ruleAttributePageElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_rulePageElement1183);
                    this_AttributePageElement_0=ruleAttributePageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributePageElement_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:566:5: this_RelationshipPageElement_1= ruleRelationshipPageElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_rulePageElement1210);
                    this_RelationshipPageElement_1=ruleRelationshipPageElement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RelationshipPageElement_1; 
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
    // $ANTLR end "rulePageElement"


    // $ANTLR start "entryRuleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:582:1: entryRuleRelationshipPageElement returns [EObject current=null] : iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF ;
    public final EObject entryRuleRelationshipPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipPageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:583:2: (iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:584:2: iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement1245);
            iv_ruleRelationshipPageElement=ruleRelationshipPageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipPageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipPageElement1255); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationshipPageElement"


    // $ANTLR start "ruleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:591:1: ruleRelationshipPageElement returns [EObject current=null] : (this_List_0= ruleList | this_Table_1= ruleTable ) ;
    public final EObject ruleRelationshipPageElement() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Table_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:594:28: ( (this_List_0= ruleList | this_Table_1= ruleTable ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:595:1: (this_List_0= ruleList | this_Table_1= ruleTable )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:595:1: (this_List_0= ruleList | this_Table_1= ruleTable )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==27) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:596:5: this_List_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleRelationshipPageElement1302);
                    this_List_0=ruleList();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_List_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:606:5: this_Table_1= ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleRelationshipPageElement1329);
                    this_Table_1=ruleTable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Table_1; 
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
    // $ANTLR end "ruleRelationshipPageElement"


    // $ANTLR start "entryRuleTable"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:622:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:623:2: (iv_ruleTable= ruleTable EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:624:2: iv_ruleTable= ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable1364);
            iv_ruleTable=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable1374); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:631:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ',' )* otherlv_10= '}' otherlv_11= 'edits' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_columns_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:634:28: ( (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ',' )* otherlv_10= '}' otherlv_11= 'edits' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:635:1: (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ',' )* otherlv_10= '}' otherlv_11= 'edits' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:635:1: (otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ',' )* otherlv_10= '}' otherlv_11= 'edits' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:635:3: otherlv_0= 'table' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ',' )* otherlv_10= '}' otherlv_11= 'edits' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleTable1411); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:639:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:640:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:640:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:641:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTable1428); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getTableAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable1445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTableAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:661:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:662:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:662:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:663:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTable1462); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getTableAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable1479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTableAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable1491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:687:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:688:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:688:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:689:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable1514);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable1526); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:706:1: ( ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ',' )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:706:2: ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= ','
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:706:2: ( (lv_columns_8_0= ruleColumn ) )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:707:1: (lv_columns_8_0= ruleColumn )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:707:1: (lv_columns_8_0= ruleColumn )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:708:3: lv_columns_8_0= ruleColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_8_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable1548);
            	    lv_columns_8_0=ruleColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTableRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_8_0, 
            	              		"Column");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleTable1560); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getCommaKeyword_8_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleTable1574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_9());
                  
            }
            otherlv_11=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable1586); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getTableAccess().getEditsKeyword_10());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:736:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:737:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:737:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:738:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getEditingFormFormCrossReference_11_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable1609);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleList"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:759:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:760:2: (iv_ruleList= ruleList EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:761:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList1645);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList1655); if (state.failed) return current;

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
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:768:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= 'edits' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:28: ( (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= 'edits' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:772:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= 'edits' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:772:1: (otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= 'edits' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:772:3: otherlv_0= 'list' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= 'edits' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleList1692); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:776:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:777:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:777:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:778:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleList1709); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getListAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleList1726); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getListAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:798:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:799:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:799:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:800:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleList1743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getListAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleList1760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getListAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleList1772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:824:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:825:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:825:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:826:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleList1795);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleList1807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getListAccess().getEditsKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:843:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:844:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:844:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:845:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getEditingFormFormCrossReference_8_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleList1830);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:866:1: entryRuleAttributePageElement returns [EObject current=null] : iv_ruleAttributePageElement= ruleAttributePageElement EOF ;
    public final EObject entryRuleAttributePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:867:2: (iv_ruleAttributePageElement= ruleAttributePageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:868:2: iv_ruleAttributePageElement= ruleAttributePageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributePageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement1866);
            iv_ruleAttributePageElement=ruleAttributePageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributePageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributePageElement1876); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAttributePageElement"


    // $ANTLR start "ruleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:875:1: ruleAttributePageElement returns [EObject current=null] : (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField ) ;
    public final EObject ruleAttributePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_TextField_0 = null;

        EObject this_TextArea_1 = null;

        EObject this_SelectionField_2 = null;

        EObject this_Column_3 = null;

        EObject this_DateSelectionField_4 = null;

        EObject this_TimeSelectionField_5 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:878:28: ( (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:879:1: (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:879:1: (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField )
            int alt11=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 31:
                {
                alt11=3;
                }
                break;
            case 30:
                {
                alt11=4;
                }
                break;
            case 29:
                {
                alt11=5;
                }
                break;
            case 28:
                {
                alt11=6;
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:880:5: this_TextField_0= ruleTextField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextField_in_ruleAttributePageElement1923);
                    this_TextField_0=ruleTextField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextField_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:890:5: this_TextArea_1= ruleTextArea
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_ruleAttributePageElement1950);
                    this_TextArea_1=ruleTextArea();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TextArea_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:900:5: this_SelectionField_2= ruleSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_ruleAttributePageElement1977);
                    this_SelectionField_2=ruleSelectionField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SelectionField_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:910:5: this_Column_3= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getColumnParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleAttributePageElement2004);
                    this_Column_3=ruleColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Column_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:920:5: this_DateSelectionField_4= ruleDateSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_ruleAttributePageElement2031);
                    this_DateSelectionField_4=ruleDateSelectionField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_DateSelectionField_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:930:5: this_TimeSelectionField_5= ruleTimeSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_ruleAttributePageElement2058);
                    this_TimeSelectionField_5=ruleTimeSelectionField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_TimeSelectionField_5; 
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
    // $ANTLR end "ruleAttributePageElement"


    // $ANTLR start "entryRuleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:946:1: entryRuleTimeSelectionField returns [EObject current=null] : iv_ruleTimeSelectionField= ruleTimeSelectionField EOF ;
    public final EObject entryRuleTimeSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:947:2: (iv_ruleTimeSelectionField= ruleTimeSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:948:2: iv_ruleTimeSelectionField= ruleTimeSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField2093);
            iv_ruleTimeSelectionField=ruleTimeSelectionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeSelectionField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSelectionField2103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTimeSelectionField"


    // $ANTLR start "ruleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:955:1: ruleTimeSelectionField returns [EObject current=null] : (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTimeSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:958:28: ( (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:959:1: (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:959:1: (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:959:3: otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleTimeSelectionField2140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:963:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:964:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:964:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:965:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTimeSelectionField2157); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getTimeSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeSelectionField2174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTimeSelectionFieldAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:985:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:986:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:986:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:987:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTimeSelectionField2191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getTimeSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeSelectionField2208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTimeSelectionFieldAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTimeSelectionField2220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTimeSelectionFieldAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1011:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1012:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1012:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1013:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSelectionFieldAccess().getAttributeAttributeCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTimeSelectionField2243);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTimeSelectionField"


    // $ANTLR start "entryRuleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1034:1: entryRuleDateSelectionField returns [EObject current=null] : iv_ruleDateSelectionField= ruleDateSelectionField EOF ;
    public final EObject entryRuleDateSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1035:2: (iv_ruleDateSelectionField= ruleDateSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1036:2: iv_ruleDateSelectionField= ruleDateSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField2279);
            iv_ruleDateSelectionField=ruleDateSelectionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateSelectionField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateSelectionField2289); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDateSelectionField"


    // $ANTLR start "ruleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1043:1: ruleDateSelectionField returns [EObject current=null] : (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDateSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1046:28: ( (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1047:1: (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1047:1: (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1047:3: otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleDateSelectionField2326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1051:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1052:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1052:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1053:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDateSelectionField2343); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getDateSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateSelectionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDateSelectionField2360); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getDateSelectionFieldAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1073:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1074:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1074:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1075:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleDateSelectionField2377); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getDateSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getDateSelectionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDateSelectionField2394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getDateSelectionFieldAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDateSelectionField2406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getDateSelectionFieldAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1099:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1100:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1100:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1101:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDateSelectionFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateSelectionFieldAccess().getAttributeAttributeCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDateSelectionField2429);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleDateSelectionField"


    // $ANTLR start "entryRuleColumn"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1122:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1123:2: (iv_ruleColumn= ruleColumn EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1124:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn2465);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn2475); if (state.failed) return current;

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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1131:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1134:28: ( (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1135:1: (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1135:1: (otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1135:3: otherlv_0= 'column' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleColumn2512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1139:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1140:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1140:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1141:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleColumn2529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getColumnAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleColumn2546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1161:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1162:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1162:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1163:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleColumn2563); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getColumnAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleColumn2580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleColumn2592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1187:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1188:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1188:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1189:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleColumn2615);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1210:1: entryRuleSelectionField returns [EObject current=null] : iv_ruleSelectionField= ruleSelectionField EOF ;
    public final EObject entryRuleSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1211:2: (iv_ruleSelectionField= ruleSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1212:2: iv_ruleSelectionField= ruleSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_entryRuleSelectionField2651);
            iv_ruleSelectionField=ruleSelectionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionField2661); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSelectionField"


    // $ANTLR start "ruleSelectionField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1219:1: ruleSelectionField returns [EObject current=null] : (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1222:28: ( (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1223:1: (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1223:1: (otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1223:3: otherlv_0= 'selection-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleSelectionField2698); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1227:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1228:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1228:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1229:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleSelectionField2715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getSelectionFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSelectionField2732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSelectionFieldAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1249:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1250:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1250:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1251:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleSelectionField2749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getSelectionFieldAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSelectionField2766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getSelectionFieldAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleSelectionField2778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSelectionFieldAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1275:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1276:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1276:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1277:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionFieldAccess().getAttributeAttributeCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSelectionField2801);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleSelectionField"


    // $ANTLR start "entryRuleTextArea"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1298:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1299:2: (iv_ruleTextArea= ruleTextArea EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1300:2: iv_ruleTextArea= ruleTextArea EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextAreaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_entryRuleTextArea2837);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextArea; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextArea2847); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1307:1: ruleTextArea returns [EObject current=null] : (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1310:28: ( (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1311:1: (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1311:1: (otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1311:3: otherlv_0= 'text-area' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' otherlv_5= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleTextArea2884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTextAreaAccess().getTextAreaKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1315:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1316:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1316:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1317:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextArea2901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getTextAreaAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextAreaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTextArea2918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTextAreaAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1337:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1338:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1338:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1339:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextArea2935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getTextAreaAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextAreaRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTextArea2952); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTextAreaAccess().getQuotationMarkKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTextArea2964); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTextAreaAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1363:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1364:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1364:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1365:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextAreaRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAreaAccess().getAttributeAttributeCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTextArea2987);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleTextField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1386:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1387:2: (iv_ruleTextField= ruleTextField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1388:2: iv_ruleTextField= ruleTextField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextField_in_entryRuleTextField3023);
            iv_ruleTextField=ruleTextField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextField3033); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1395:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' (otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) ) )? otherlv_7= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_elementID_1_0=null;
        Token otherlv_2=null;
        Token lv_label_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_format_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1398:28: ( (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' (otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) ) )? otherlv_7= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1399:1: (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' (otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) ) )? otherlv_7= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1399:1: (otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' (otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) ) )? otherlv_7= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1399:3: otherlv_0= 'text-field' ( (lv_elementID_1_0= RULE_ID ) ) otherlv_2= '\"' ( (lv_label_3_0= RULE_STRING ) ) otherlv_4= '\"' (otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) ) )? otherlv_7= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTextField3070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1403:1: ( (lv_elementID_1_0= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1404:1: (lv_elementID_1_0= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1404:1: (lv_elementID_1_0= RULE_ID )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1405:3: lv_elementID_1_0= RULE_ID
            {
            lv_elementID_1_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleTextField3087); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_elementID_1_0, grammarAccess.getTextFieldAccess().getElementIDIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTextField3104); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTextFieldAccess().getQuotationMarkKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1425:1: ( (lv_label_3_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1426:1: (lv_label_3_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1426:1: (lv_label_3_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1427:3: lv_label_3_0= RULE_STRING
            {
            lv_label_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextField3121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_label_3_0, grammarAccess.getTextFieldAccess().getLabelSTRINGTerminalRuleCall_3_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTextFieldRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"label",
                      		lv_label_3_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTextField3138); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTextFieldAccess().getQuotationMarkKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1447:1: (otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1447:3: otherlv_5= 'format' ( (lv_format_6_0= RULE_STRING ) )
                    {
                    otherlv_5=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTextField3151); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getFormatKeyword_5_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1451:1: ( (lv_format_6_0= RULE_STRING ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1452:1: (lv_format_6_0= RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1452:1: (lv_format_6_0= RULE_STRING )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1453:3: lv_format_6_0= RULE_STRING
                    {
                    lv_format_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleTextField3168); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_format_6_0, grammarAccess.getTextFieldAccess().getFormatSTRINGTerminalRuleCall_5_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTextFieldRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"format",
                              		lv_format_6_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTextField3187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getTextFieldAccess().getHandlesKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1473:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1474:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1474:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1475:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextFieldAccess().getAttributeAttributeCrossReference_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTextField3210);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1498:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1499:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1500:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3249);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName3260); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1507:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1510:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1511:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1511:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1511:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1518:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==35) && (synpred1_InternalForm())) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1518:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1518:2: ( ( '.' )=>kw= '.' )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1518:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleQualifiedName3328); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3344); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop13;
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


    // $ANTLR start "ruleConditionType"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1543:1: ruleConditionType returns [Enumerator current=null] : ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) ) ;
    public final Enumerator ruleConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1545:28: ( ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1546:1: ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1546:1: ( (enumLiteral_0= '0' ) | (enumLiteral_1= '1' ) | (enumLiteral_2= '2' ) | (enumLiteral_3= '3' ) | (enumLiteral_4= '4' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt14=1;
                }
                break;
            case 37:
                {
                alt14=2;
                }
                break;
            case 38:
                {
                alt14=3;
                }
                break;
            case 39:
                {
                alt14=4;
                }
                break;
            case 40:
                {
                alt14=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1546:2: (enumLiteral_0= '0' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1546:2: (enumLiteral_0= '0' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1546:4: enumLiteral_0= '0'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleConditionType3407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1552:6: (enumLiteral_1= '1' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1552:6: (enumLiteral_1= '1' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1552:8: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleConditionType3424); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1558:6: (enumLiteral_2= '2' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1558:6: (enumLiteral_2= '2' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1558:8: enumLiteral_2= '2'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleConditionType3441); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1564:6: (enumLiteral_3= '3' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1564:6: (enumLiteral_3= '3' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1564:8: enumLiteral_3= '3'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConditionType3458); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1570:6: (enumLiteral_4= '4' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1570:6: (enumLiteral_4= '4' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1570:8: enumLiteral_4= '4'
                    {
                    enumLiteral_4=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConditionType3475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_4, grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                          
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
    // $ANTLR end "ruleConditionType"

    // $ANTLR start synpred1_InternalForm
    public final void synpred1_InternalForm_fragment() throws RecognitionException {   
        // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1518:3: ( '.' )
        // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1519:2: '.'
        {
        match(input,35,FollowSets000.FOLLOW_35_in_synpred1_InternalForm3319); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalForm

    // Delegated rules

    public final boolean synpred1_InternalForm() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalForm_fragment(); // can never throw exception
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
        public static final BitSet FOLLOW_ruleFormModel_in_entryRuleFormModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_ruleFormModel140 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleForm_in_entryRuleForm177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForm187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleForm230 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleForm256 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForm273 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleForm290 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleForm307 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleForm324 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleForm336 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleForm359 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleForm371 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_rulePage_in_ruleForm392 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleForm405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage441 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rulePage488 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePage500 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePage517 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_rulePage534 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePage546 = new BitSet(new long[]{0x00000003FA010000L});
        public static final BitSet FOLLOW_rulePageElement_in_rulePage568 = new BitSet(new long[]{0x00000003FA050000L});
        public static final BitSet FOLLOW_18_in_rulePage581 = new BitSet(new long[]{0x00000003FA010000L});
        public static final BitSet FOLLOW_16_in_rulePage597 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_ruleCondition_in_rulePage618 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition655 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleCondition703 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCondition725 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleCondition744 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleCondition766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition802 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleCompositeCondition849 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeCondition866 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCompositeCondition883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueCondition929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleAttributeValueCondition966 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleAttributeValueCondition983 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleAttributeValueCondition1000 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeValueCondition1023 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAttributeValueCondition1035 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleAttributeValueCondition1052 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleAttributeValueCondition1069 = new BitSet(new long[]{0x000001F000000000L});
        public static final BitSet FOLLOW_ruleConditionType_in_ruleAttributeValueCondition1090 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement1126 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageElement1136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_rulePageElement1183 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_rulePageElement1210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement1245 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipPageElement1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_ruleRelationshipPageElement1302 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleRelationshipPageElement1329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1364 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleTable1411 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTable1428 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable1445 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTable1462 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable1479 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable1491 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable1514 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable1526 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable1548 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleTable1560 = new BitSet(new long[]{0x0000000040010000L});
        public static final BitSet FOLLOW_16_in_ruleTable1574 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleTable1586 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList1645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleList1692 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleList1709 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleList1726 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleList1743 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleList1760 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleList1772 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleList1795 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleList1807 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleList1830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement1866 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributePageElement1876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_ruleAttributePageElement1923 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_ruleAttributePageElement1950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_ruleAttributePageElement1977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleAttributePageElement2004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_ruleAttributePageElement2031 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_ruleAttributePageElement2058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField2093 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSelectionField2103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleTimeSelectionField2140 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTimeSelectionField2157 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTimeSelectionField2174 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTimeSelectionField2191 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTimeSelectionField2208 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTimeSelectionField2220 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTimeSelectionField2243 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField2279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateSelectionField2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleDateSelectionField2326 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDateSelectionField2343 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDateSelectionField2360 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleDateSelectionField2377 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDateSelectionField2394 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleDateSelectionField2406 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDateSelectionField2429 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn2465 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn2475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleColumn2512 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleColumn2529 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleColumn2546 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleColumn2563 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleColumn2580 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleColumn2592 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleColumn2615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_entryRuleSelectionField2651 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionField2661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleSelectionField2698 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleSelectionField2715 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSelectionField2732 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleSelectionField2749 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSelectionField2766 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleSelectionField2778 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelectionField2801 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea2837 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextArea2847 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleTextArea2884 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextArea2901 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTextArea2918 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextArea2935 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTextArea2952 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTextArea2964 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextArea2987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField3023 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextField3033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleTextField3070 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleTextField3087 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTextField3104 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField3121 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTextField3138 = new BitSet(new long[]{0x0000000400004000L});
        public static final BitSet FOLLOW_34_in_ruleTextField3151 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleTextField3168 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTextField3187 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextField3210 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3300 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_35_in_ruleQualifiedName3328 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3344 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_36_in_ruleConditionType3407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleConditionType3424 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleConditionType3441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleConditionType3458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleConditionType3475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_synpred1_InternalForm3319 = new BitSet(new long[]{0x0000000000000002L});
    }


}