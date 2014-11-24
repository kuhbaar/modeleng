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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'welcome'", "'form'", "'handles'", "'{'", "'}'", "'page'", "','", "'with'", "'composite-condition'", "':'", "'('", "')'", "'?'", "'attribute-condition'", "'=='", "'table'", "'edits'", "'list'", "'time-selection-field'", "'date-selection-field'", "'column'", "'selection-field'", "'text-area'", "'text-field'", "'format'", "'.'", "'And'", "'Or'", "'Hide'", "'Show'", "'Enable'", "'Disable'", "'None'"
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
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:77:1: ruleFormModel returns [EObject current=null] : ( () ( (lv_forms_1_0= ruleForm ) )+ ) ;
    public final EObject ruleFormModel() throws RecognitionException {
        EObject current = null;

        EObject lv_forms_1_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:80:28: ( ( () ( (lv_forms_1_0= ruleForm ) )+ ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:1: ( () ( (lv_forms_1_0= ruleForm ) )+ )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:1: ( () ( (lv_forms_1_0= ruleForm ) )+ )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:81:2: () ( (lv_forms_1_0= ruleForm ) )+
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

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:87:2: ( (lv_forms_1_0= ruleForm ) )+
            int cnt1=0;
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
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:122:1: ruleForm returns [EObject current=null] : ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= ruleEString ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_pages_8_0= rulePage ) )* otherlv_9= '}' ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        Token lv_welcomeForm_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_4_0 = null;

        EObject lv_pages_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:125:28: ( ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= ruleEString ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_pages_8_0= rulePage ) )* otherlv_9= '}' ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:1: ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= ruleEString ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_pages_8_0= rulePage ) )* otherlv_9= '}' )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:1: ( ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= ruleEString ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_pages_8_0= rulePage ) )* otherlv_9= '}' )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:126:2: ( (lv_welcomeForm_0_0= 'welcome' ) )? otherlv_1= 'form' ( (lv_name_2_0= RULE_ID ) ) ( (lv_title_3_0= ruleEString ) ) ( (lv_description_4_0= ruleEString ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) otherlv_7= '{' ( (lv_pages_8_0= rulePage ) )* otherlv_9= '}'
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

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:163:2: ( (lv_title_3_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:164:1: (lv_title_3_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:164:1: (lv_title_3_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:165:3: lv_title_3_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormAccess().getTitleEStringParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleForm299);
            lv_title_3_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getFormRule());
              	        }
                     		set(
                     			current, 
                     			"title",
                      		lv_title_3_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:181:2: ( (lv_description_4_0= ruleEString ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:182:1: (lv_description_4_0= ruleEString )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:182:1: (lv_description_4_0= ruleEString )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:183:3: lv_description_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getFormAccess().getDescriptionEStringParserRuleCall_4_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleForm320);
                    lv_description_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getFormRule());
                      	        }
                             		set(
                             			current, 
                             			"description",
                              		lv_description_4_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleForm333); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getFormAccess().getHandlesKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:203:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:204:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:204:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:205:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getFormRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getFormAccess().getEntityEntityCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleForm356);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleForm368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_7());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:222:1: ( (lv_pages_8_0= rulePage ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:223:1: (lv_pages_8_0= rulePage )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:223:1: (lv_pages_8_0= rulePage )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:224:3: lv_pages_8_0= rulePage
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getFormAccess().getPagesPageParserRuleCall_8_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePage_in_ruleForm389);
            	    lv_pages_8_0=rulePage();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getFormRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pages",
            	              		lv_pages_8_0, 
            	              		"Page");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleForm402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getFormAccess().getRightCurlyBracketKeyword_9());
                  
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


    // $ANTLR start "entryRuleEString"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:252:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:253:2: (iv_ruleEString= ruleEString EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:254:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString439);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString450); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:261:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:264:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:265:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString490); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_STRING_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:273:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString516); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                          
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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:288:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:289:2: (iv_rulePage= rulePage EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:290:2: iv_rulePage= rulePage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage561);
            iv_rulePage=rulePage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePage; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage571); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:297:1: rulePage returns [EObject current=null] : (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )* ( (lv_pageElements_5_0= rulePageElement ) ) otherlv_6= '}' (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_title_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_pageElements_3_0 = null;

        EObject lv_pageElements_5_0 = null;

        EObject lv_condition_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:300:28: ( (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )* ( (lv_pageElements_5_0= rulePageElement ) ) otherlv_6= '}' (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:301:1: (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )* ( (lv_pageElements_5_0= rulePageElement ) ) otherlv_6= '}' (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:301:1: (otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )* ( (lv_pageElements_5_0= rulePageElement ) ) otherlv_6= '}' (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )? )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:301:3: otherlv_0= 'page' ( (lv_title_1_0= RULE_STRING ) ) otherlv_2= '{' ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )* ( (lv_pageElements_5_0= rulePageElement ) ) otherlv_6= '}' (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePage608); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPageAccess().getPageKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:305:1: ( (lv_title_1_0= RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:306:1: (lv_title_1_0= RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:306:1: (lv_title_1_0= RULE_STRING )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:307:3: lv_title_1_0= RULE_STRING
            {
            lv_title_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rulePage625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_title_1_0, grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPageRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"title",
                      		lv_title_1_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePage642); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:327:1: ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )*
            loop6:
            do {
                int alt6=2;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:327:2: ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ','
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:327:2: ( (lv_pageElements_3_0= rulePageElement ) )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:328:1: (lv_pageElements_3_0= rulePageElement )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:328:1: (lv_pageElements_3_0= rulePageElement )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:329:3: lv_pageElements_3_0= rulePageElement
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rulePage664);
            	    lv_pageElements_3_0=rulePageElement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPageRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"pageElements",
            	              		lv_pageElements_3_0, 
            	              		"PageElement");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePage676); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getPageAccess().getCommaKeyword_3_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:349:3: ( (lv_pageElements_5_0= rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:350:1: (lv_pageElements_5_0= rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:350:1: (lv_pageElements_5_0= rulePageElement )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:351:3: lv_pageElements_5_0= rulePageElement
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rulePage699);
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

            otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePage711); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:371:1: (otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:371:3: otherlv_7= 'with' ( (lv_condition_8_0= ruleCondition ) )
                    {
                    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePage724); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getPageAccess().getWithKeyword_6_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:375:1: ( (lv_condition_8_0= ruleCondition ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:376:1: (lv_condition_8_0= ruleCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:376:1: (lv_condition_8_0= ruleCondition )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:377:3: lv_condition_8_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_6_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rulePage745);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:401:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:402:2: (iv_ruleCondition= ruleCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:403:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition783);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition793); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:410:1: ruleCondition returns [EObject current=null] : (this_AttributeValueCondition_0= ruleAttributeValueCondition | this_CompositeCondition_1= ruleCompositeCondition ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeValueCondition_0 = null;

        EObject this_CompositeCondition_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:413:28: ( (this_AttributeValueCondition_0= ruleAttributeValueCondition | this_CompositeCondition_1= ruleCompositeCondition ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:414:1: (this_AttributeValueCondition_0= ruleAttributeValueCondition | this_CompositeCondition_1= ruleCompositeCondition )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:414:1: (this_AttributeValueCondition_0= ruleAttributeValueCondition | this_CompositeCondition_1= ruleCompositeCondition )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            else if ( (LA8_0==19) ) {
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:415:5: this_AttributeValueCondition_0= ruleAttributeValueCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCondition840);
                    this_AttributeValueCondition_0=ruleAttributeValueCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AttributeValueCondition_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:425:5: this_CompositeCondition_1= ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_ruleCondition867);
                    this_CompositeCondition_1=ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeCondition_1; 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:441:1: entryRuleCompositeCondition returns [EObject current=null] : iv_ruleCompositeCondition= ruleCompositeCondition EOF ;
    public final EObject entryRuleCompositeCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:442:2: (iv_ruleCompositeCondition= ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:443:2: iv_ruleCompositeCondition= ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition902);
            iv_ruleCompositeCondition=ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition912); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:450:1: ruleCompositeCondition returns [EObject current=null] : (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) ) ;
    public final EObject ruleCompositeCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_conditionID_1_0 = null;

        EObject lv_composedConditions_4_0 = null;

        Enumerator lv_compositionType_5_0 = null;

        EObject lv_composedConditions_6_0 = null;

        Enumerator lv_type_9_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:453:28: ( (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:454:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:454:1: (otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:454:3: otherlv_0= 'composite-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= '(' ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) ) ( (lv_compositionType_5_0= ruleCompositeConditionType ) ) ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) ) otherlv_7= ')' otherlv_8= '?' ( (lv_type_9_0= ruleConditionType ) )
            {
            otherlv_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleCompositeCondition949); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:458:1: ( (lv_conditionID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:459:1: (lv_conditionID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:459:1: (lv_conditionID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:460:3: lv_conditionID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getConditionIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCompositeCondition970);
            lv_conditionID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleCompositeCondition982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeConditionAccess().getColonKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleCompositeCondition994); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:484:1: ( (lv_composedConditions_4_0= ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:485:1: (lv_composedConditions_4_0= ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:485:1: (lv_composedConditions_4_0= ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:486:3: lv_composedConditions_4_0= ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition1015);
            lv_composedConditions_4_0=ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		add(
                     			current, 
                     			"composedConditions",
                      		lv_composedConditions_4_0, 
                      		"AttributeValueCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:502:2: ( (lv_compositionType_5_0= ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:503:1: (lv_compositionType_5_0= ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:503:1: (lv_compositionType_5_0= ruleCompositeConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:504:3: lv_compositionType_5_0= ruleCompositeConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition1036);
            lv_compositionType_5_0=ruleCompositeConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"compositionType",
                      		lv_compositionType_5_0, 
                      		"CompositeConditionType");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:520:2: ( (lv_composedConditions_6_0= ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:521:1: (lv_composedConditions_6_0= ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:521:1: (lv_composedConditions_6_0= ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:522:3: lv_composedConditions_6_0= ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition1057);
            lv_composedConditions_6_0=ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		add(
                     			current, 
                     			"composedConditions",
                      		lv_composedConditions_6_0, 
                      		"AttributeValueCondition");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleCompositeCondition1069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompositeCondition1081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:546:1: ( (lv_type_9_0= ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:547:1: (lv_type_9_0= ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:547:1: (lv_type_9_0= ruleConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:548:3: lv_type_9_0= ruleConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_ruleCompositeCondition1102);
            lv_type_9_0=ruleConditionType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeConditionRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_9_0, 
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
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:572:1: entryRuleAttributeValueCondition returns [EObject current=null] : iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF ;
    public final EObject entryRuleAttributeValueCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueCondition = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:573:2: (iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:574:2: iv_ruleAttributeValueCondition= ruleAttributeValueCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeValueConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition1138);
            iv_ruleAttributeValueCondition=ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeValueCondition; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeValueCondition1148); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:581:1: ruleAttributeValueCondition returns [EObject current=null] : (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) ) ;
    public final EObject ruleAttributeValueCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_conditionID_1_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        Enumerator lv_type_7_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:584:28: ( (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:585:1: (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:585:1: (otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:585:3: otherlv_0= 'attribute-condition' ( (lv_conditionID_1_0= ruleEString ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) otherlv_4= '==' ( (lv_value_5_0= ruleEString ) ) otherlv_6= '?' ( (lv_type_7_0= ruleConditionType ) )
            {
            otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleAttributeValueCondition1185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:589:1: ( (lv_conditionID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:590:1: (lv_conditionID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:590:1: (lv_conditionID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:591:3: lv_conditionID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getConditionIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeValueCondition1206);
            lv_conditionID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeValueConditionRule());
              	        }
                     		set(
                     			current, 
                     			"conditionID",
                      		lv_conditionID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleAttributeValueCondition1218); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:611:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:612:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:612:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:613:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAttributeValueConditionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleAttributeValueCondition1241);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleAttributeValueCondition1253); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:630:1: ( (lv_value_5_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:631:1: (lv_value_5_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:631:1: (lv_value_5_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:632:3: lv_value_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getValueEStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAttributeValueCondition1274);
            lv_value_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAttributeValueConditionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_5_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAttributeValueCondition1286); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:652:1: ( (lv_type_7_0= ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:653:1: (lv_type_7_0= ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:653:1: (lv_type_7_0= ruleConditionType )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:654:3: lv_type_7_0= ruleConditionType
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_ruleAttributeValueCondition1307);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:678:1: entryRulePageElement returns [EObject current=null] : iv_rulePageElement= rulePageElement EOF ;
    public final EObject entryRulePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:679:2: (iv_rulePageElement= rulePageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:680:2: iv_rulePageElement= rulePageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_entryRulePageElement1343);
            iv_rulePageElement=rulePageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageElement1353); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:687:1: rulePageElement returns [EObject current=null] : (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement ) ;
    public final EObject rulePageElement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributePageElement_0 = null;

        EObject this_RelationshipPageElement_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:690:28: ( (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:691:1: (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:691:1: (this_AttributePageElement_0= ruleAttributePageElement | this_RelationshipPageElement_1= ruleRelationshipPageElement )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=29 && LA9_0<=34)) ) {
                alt9=1;
            }
            else if ( (LA9_0==26||LA9_0==28) ) {
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:692:5: this_AttributePageElement_0= ruleAttributePageElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_rulePageElement1400);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:702:5: this_RelationshipPageElement_1= ruleRelationshipPageElement
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_rulePageElement1427);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:718:1: entryRuleRelationshipPageElement returns [EObject current=null] : iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF ;
    public final EObject entryRuleRelationshipPageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationshipPageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:719:2: (iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:720:2: iv_ruleRelationshipPageElement= ruleRelationshipPageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationshipPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement1462);
            iv_ruleRelationshipPageElement=ruleRelationshipPageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationshipPageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipPageElement1472); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:727:1: ruleRelationshipPageElement returns [EObject current=null] : (this_List_0= ruleList | this_Table_1= ruleTable ) ;
    public final EObject ruleRelationshipPageElement() throws RecognitionException {
        EObject current = null;

        EObject this_List_0 = null;

        EObject this_Table_1 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:730:28: ( (this_List_0= ruleList | this_Table_1= ruleTable ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:731:1: (this_List_0= ruleList | this_Table_1= ruleTable )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:731:1: (this_List_0= ruleList | this_Table_1= ruleTable )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:732:5: this_List_0= ruleList
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_ruleRelationshipPageElement1519);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:742:5: this_Table_1= ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_ruleRelationshipPageElement1546);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:758:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:759:2: (iv_ruleTable= ruleTable EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:760:2: iv_ruleTable= ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable1581);
            iv_ruleTable=ruleTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTable; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable1591); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:767:1: ruleTable returns [EObject current=null] : (otherlv_0= 'table' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )* ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= '}' otherlv_10= 'edits' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_columns_8_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:770:28: ( (otherlv_0= 'table' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )* ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= '}' otherlv_10= 'edits' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:1: (otherlv_0= 'table' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )* ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= '}' otherlv_10= 'edits' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:1: (otherlv_0= 'table' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )* ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= '}' otherlv_10= 'edits' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:771:3: otherlv_0= 'table' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )* ( (lv_columns_8_0= ruleColumn ) ) otherlv_9= '}' otherlv_10= 'edits' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleTable1628); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTableAccess().getTableKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:775:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:776:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:776:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:777:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable1649);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTableRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:793:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:794:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:794:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:795:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTable1670);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTableRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTable1682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTableAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:815:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:816:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:816:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:817:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable1705);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleTable1717); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:834:1: ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )*
            loop11:
            do {
                int alt11=2;
                alt11 = dfa11.predict(input);
                switch (alt11) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:834:2: ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ','
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:834:2: ( (lv_columns_6_0= ruleColumn ) )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:835:1: (lv_columns_6_0= ruleColumn )
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:835:1: (lv_columns_6_0= ruleColumn )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:836:3: lv_columns_6_0= ruleColumn
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            	      	    
            	    }
            	    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable1739);
            	    lv_columns_6_0=ruleColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTableRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"columns",
            	              		lv_columns_6_0, 
            	              		"Column");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    otherlv_7=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleTable1751); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getTableAccess().getCommaKeyword_6_1());
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:856:3: ( (lv_columns_8_0= ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:857:1: (lv_columns_8_0= ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:857:1: (lv_columns_8_0= ruleColumn )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:858:3: lv_columns_8_0= ruleColumn
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleTable1774);
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

            otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleTable1786); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8());
                  
            }
            otherlv_10=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleTable1798); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getTableAccess().getEditsKeyword_9());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:882:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:883:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:883:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:884:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTableRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTableAccess().getEditingFormFormCrossReference_10_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTable1821);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:905:1: entryRuleList returns [EObject current=null] : iv_ruleList= ruleList EOF ;
    public final EObject entryRuleList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleList = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:906:2: (iv_ruleList= ruleList EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:907:2: iv_ruleList= ruleList EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList1857);
            iv_ruleList=ruleList();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleList; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList1867); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:914:1: ruleList returns [EObject current=null] : (otherlv_0= 'list' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= 'edits' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleList() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:917:28: ( (otherlv_0= 'list' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= 'edits' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:918:1: (otherlv_0= 'list' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= 'edits' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:918:1: (otherlv_0= 'list' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= 'edits' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:918:3: otherlv_0= 'list' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) otherlv_5= 'edits' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleList1904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getListAccess().getListKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:922:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:923:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:923:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:924:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleList1925);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:940:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:941:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:941:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:942:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleList1946);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getListRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleList1958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getListAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:962:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:963:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:963:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:964:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleList1981);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleList1993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getListAccess().getEditsKeyword_5());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:981:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:982:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:982:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:983:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getListRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getListAccess().getEditingFormFormCrossReference_6_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleList2016);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1004:1: entryRuleAttributePageElement returns [EObject current=null] : iv_ruleAttributePageElement= ruleAttributePageElement EOF ;
    public final EObject entryRuleAttributePageElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePageElement = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1005:2: (iv_ruleAttributePageElement= ruleAttributePageElement EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1006:2: iv_ruleAttributePageElement= ruleAttributePageElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributePageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement2052);
            iv_ruleAttributePageElement=ruleAttributePageElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributePageElement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributePageElement2062); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1013:1: ruleAttributePageElement returns [EObject current=null] : (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField ) ;
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
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1016:28: ( (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1017:1: (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1017:1: (this_TextField_0= ruleTextField | this_TextArea_1= ruleTextArea | this_SelectionField_2= ruleSelectionField | this_Column_3= ruleColumn | this_DateSelectionField_4= ruleDateSelectionField | this_TimeSelectionField_5= ruleTimeSelectionField )
            int alt12=6;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt12=1;
                }
                break;
            case 33:
                {
                alt12=2;
                }
                break;
            case 32:
                {
                alt12=3;
                }
                break;
            case 31:
                {
                alt12=4;
                }
                break;
            case 30:
                {
                alt12=5;
                }
                break;
            case 29:
                {
                alt12=6;
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1018:5: this_TextField_0= ruleTextField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextField_in_ruleAttributePageElement2109);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1028:5: this_TextArea_1= ruleTextArea
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_1()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_ruleAttributePageElement2136);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1038:5: this_SelectionField_2= ruleSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_2()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_ruleAttributePageElement2163);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1048:5: this_Column_3= ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getColumnParserRuleCall_3()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_ruleAttributePageElement2190);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1058:5: this_DateSelectionField_4= ruleDateSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_4()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_ruleAttributePageElement2217);
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
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1068:5: this_TimeSelectionField_5= ruleTimeSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_5()); 
                          
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_ruleAttributePageElement2244);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1084:1: entryRuleTimeSelectionField returns [EObject current=null] : iv_ruleTimeSelectionField= ruleTimeSelectionField EOF ;
    public final EObject entryRuleTimeSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTimeSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1085:2: (iv_ruleTimeSelectionField= ruleTimeSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1086:2: iv_ruleTimeSelectionField= ruleTimeSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTimeSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField2279);
            iv_ruleTimeSelectionField=ruleTimeSelectionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTimeSelectionField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSelectionField2289); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1093:1: ruleTimeSelectionField returns [EObject current=null] : (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTimeSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1096:28: ( (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1097:1: (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1097:1: (otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1097:3: otherlv_0= 'time-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleTimeSelectionField2326); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1101:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1102:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1102:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1103:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeSelectionField2347);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeSelectionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1119:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1120:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1120:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1121:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTimeSelectionField2368);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTimeSelectionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTimeSelectionField2380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTimeSelectionFieldAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1141:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1142:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1142:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1143:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTimeSelectionFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTimeSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTimeSelectionField2403);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1164:1: entryRuleDateSelectionField returns [EObject current=null] : iv_ruleDateSelectionField= ruleDateSelectionField EOF ;
    public final EObject entryRuleDateSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDateSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1165:2: (iv_ruleDateSelectionField= ruleDateSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1166:2: iv_ruleDateSelectionField= ruleDateSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDateSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField2439);
            iv_ruleDateSelectionField=ruleDateSelectionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDateSelectionField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateSelectionField2449); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1173:1: ruleDateSelectionField returns [EObject current=null] : (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleDateSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1176:28: ( (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1177:1: (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1177:1: (otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1177:3: otherlv_0= 'date-selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleDateSelectionField2486); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1181:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1182:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1182:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1183:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDateSelectionField2507);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateSelectionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1199:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1200:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1200:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1201:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDateSelectionField2528);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDateSelectionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDateSelectionField2540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getDateSelectionFieldAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1221:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1222:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1222:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1223:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getDateSelectionFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDateSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleDateSelectionField2563);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1244:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1245:2: (iv_ruleColumn= ruleColumn EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1246:2: iv_ruleColumn= ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getColumnRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn2599);
            iv_ruleColumn=ruleColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleColumn; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn2609); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1253:1: ruleColumn returns [EObject current=null] : (otherlv_0= 'column' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1256:28: ( (otherlv_0= 'column' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1257:1: (otherlv_0= 'column' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1257:1: (otherlv_0= 'column' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1257:3: otherlv_0= 'column' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleColumn2646); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getColumnAccess().getColumnKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1261:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1262:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1262:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1263:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleColumn2667);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColumnRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1279:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1280:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1280:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1281:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleColumn2688);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getColumnRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleColumn2700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getColumnAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1301:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1302:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1302:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1303:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getColumnRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleColumn2723);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1324:1: entryRuleSelectionField returns [EObject current=null] : iv_ruleSelectionField= ruleSelectionField EOF ;
    public final EObject entryRuleSelectionField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectionField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1325:2: (iv_ruleSelectionField= ruleSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1326:2: iv_ruleSelectionField= ruleSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_entryRuleSelectionField2759);
            iv_ruleSelectionField=ruleSelectionField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSelectionField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionField2769); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1333:1: ruleSelectionField returns [EObject current=null] : (otherlv_0= 'selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleSelectionField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1336:28: ( (otherlv_0= 'selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1337:1: (otherlv_0= 'selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1337:1: (otherlv_0= 'selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1337:3: otherlv_0= 'selection-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleSelectionField2806); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1341:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1342:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1342:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1343:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectionField2827);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1359:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1360:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1360:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1361:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSelectionField2848);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSelectionFieldRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleSelectionField2860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSelectionFieldAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1381:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1382:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1382:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1383:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSelectionFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleSelectionField2883);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1404:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1405:2: (iv_ruleTextArea= ruleTextArea EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1406:2: iv_ruleTextArea= ruleTextArea EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextAreaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_entryRuleTextArea2919);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextArea; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextArea2929); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1413:1: ruleTextArea returns [EObject current=null] : (otherlv_0= 'text-area' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1416:28: ( (otherlv_0= 'text-area' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1417:1: (otherlv_0= 'text-area' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1417:1: (otherlv_0= 'text-area' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1417:3: otherlv_0= 'text-area' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) otherlv_3= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleTextArea2966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTextAreaAccess().getTextAreaKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1421:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1422:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1422:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1423:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAreaAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextArea2987);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextAreaRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1439:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1440:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1440:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1441:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAreaAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextArea3008);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextAreaRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTextArea3020); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTextAreaAccess().getHandlesKeyword_3());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1461:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1462:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1462:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1463:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextAreaRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextAreaAccess().getAttributeAttributeCrossReference_4_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTextArea3043);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1484:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1485:2: (iv_ruleTextField= ruleTextField EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1486:2: iv_ruleTextField= ruleTextField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTextFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextField_in_entryRuleTextField3079);
            iv_ruleTextField=ruleTextField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTextField; 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextField3089); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1493:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'text-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) (otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_elementID_1_0 = null;

        AntlrDatatypeRuleToken lv_label_2_0 = null;

        AntlrDatatypeRuleToken lv_format_4_0 = null;


         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1496:28: ( (otherlv_0= 'text-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) (otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1497:1: (otherlv_0= 'text-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) (otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1497:1: (otherlv_0= 'text-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) (otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1497:3: otherlv_0= 'text-field' ( (lv_elementID_1_0= ruleEString ) ) ( (lv_label_2_0= ruleEString ) ) (otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) ) )? otherlv_5= 'handles' ( ( ruleQualifiedName ) )
            {
            otherlv_0=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleTextField3126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1501:1: ( (lv_elementID_1_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1502:1: (lv_elementID_1_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1502:1: (lv_elementID_1_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1503:3: lv_elementID_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextField3147);
            lv_elementID_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
              	        }
                     		set(
                     			current, 
                     			"elementID",
                      		lv_elementID_1_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1519:2: ( (lv_label_2_0= ruleEString ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1520:1: (lv_label_2_0= ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1520:1: (lv_label_2_0= ruleEString )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1521:3: lv_label_2_0= ruleEString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextFieldAccess().getLabelEStringParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextField3168);
            lv_label_2_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
              	        }
                     		set(
                     			current, 
                     			"label",
                      		lv_label_2_0, 
                      		"EString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1537:2: (otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1537:4: otherlv_3= 'format' ( (lv_format_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleTextField3181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getTextFieldAccess().getFormatKeyword_3_0());
                          
                    }
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1541:1: ( (lv_format_4_0= ruleEString ) )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1542:1: (lv_format_4_0= ruleEString )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1542:1: (lv_format_4_0= ruleEString )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1543:3: lv_format_4_0= ruleEString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTextFieldAccess().getFormatEStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleTextField3202);
                    lv_format_4_0=ruleEString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
                      	        }
                             		set(
                             			current, 
                             			"format",
                              		lv_format_4_0, 
                              		"EString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleTextField3216); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTextFieldAccess().getHandlesKeyword_4());
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1563:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1564:1: ( ruleQualifiedName )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1564:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1565:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTextFieldRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTextFieldAccess().getAttributeAttributeCrossReference_5_0()); 
              	    
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_ruleTextField3239);
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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1588:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1589:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1590:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3278);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName3289); if (state.failed) return current;

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
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1597:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1600:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1601:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1601:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1601:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1608:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==36) && (synpred1_InternalForm())) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1608:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1608:2: ( ( '.' )=>kw= '.' )
            	    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1608:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleQualifiedName3357); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleQualifiedName3373); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop14;
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


    // $ANTLR start "ruleCompositeConditionType"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1631:1: ruleCompositeConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) ;
    public final Enumerator ruleCompositeConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1633:28: ( ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1634:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1634:1: ( (enumLiteral_0= 'And' ) | (enumLiteral_1= 'Or' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            else if ( (LA15_0==38) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1634:2: (enumLiteral_0= 'And' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1634:2: (enumLiteral_0= 'And' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1634:4: enumLiteral_0= 'And'
                    {
                    enumLiteral_0=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleCompositeConditionType3434); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1640:6: (enumLiteral_1= 'Or' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1640:6: (enumLiteral_1= 'Or' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1640:8: enumLiteral_1= 'Or'
                    {
                    enumLiteral_1=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleCompositeConditionType3451); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleCompositeConditionType"


    // $ANTLR start "ruleConditionType"
    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1650:1: ruleConditionType returns [Enumerator current=null] : ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) | (enumLiteral_4= 'None' ) ) ;
    public final Enumerator ruleConditionType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1652:28: ( ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) | (enumLiteral_4= 'None' ) ) )
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1653:1: ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) | (enumLiteral_4= 'None' ) )
            {
            // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1653:1: ( (enumLiteral_0= 'Hide' ) | (enumLiteral_1= 'Show' ) | (enumLiteral_2= 'Enable' ) | (enumLiteral_3= 'Disable' ) | (enumLiteral_4= 'None' ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt16=1;
                }
                break;
            case 40:
                {
                alt16=2;
                }
                break;
            case 41:
                {
                alt16=3;
                }
                break;
            case 42:
                {
                alt16=4;
                }
                break;
            case 43:
                {
                alt16=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1653:2: (enumLiteral_0= 'Hide' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1653:2: (enumLiteral_0= 'Hide' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1653:4: enumLiteral_0= 'Hide'
                    {
                    enumLiteral_0=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleConditionType3496); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1659:6: (enumLiteral_1= 'Show' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1659:6: (enumLiteral_1= 'Show' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1659:8: enumLiteral_1= 'Show'
                    {
                    enumLiteral_1=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleConditionType3513); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1665:6: (enumLiteral_2= 'Enable' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1665:6: (enumLiteral_2= 'Enable' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1665:8: enumLiteral_2= 'Enable'
                    {
                    enumLiteral_2=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleConditionType3530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1671:6: (enumLiteral_3= 'Disable' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1671:6: (enumLiteral_3= 'Disable' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1671:8: enumLiteral_3= 'Disable'
                    {
                    enumLiteral_3=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleConditionType3547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1677:6: (enumLiteral_4= 'None' )
                    {
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1677:6: (enumLiteral_4= 'None' )
                    // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1677:8: enumLiteral_4= 'None'
                    {
                    enumLiteral_4=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleConditionType3564); if (state.failed) return current;
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
        // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1608:3: ( '.' )
        // ../at.ac.tuwien.big.forms.form/src-gen/at/ac/tuwien/big/forms/form/parser/antlr/internal/InternalForm.g:1609:2: '.'
        {
        match(input,36,FollowSets000.FOLLOW_36_in_synpred1_InternalForm3348); if (state.failed) return ;

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


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA6_eotS =
        "\142\uffff";
    static final String DFA6_eofS =
        "\142\uffff";
    static final String DFA6_minS =
        "\1\32\30\4\20\15\11\4\2\15\6\17\1\33\1\16\1\4\2\uffff\10\4\1\37"+
        "\6\17\1\33\1\17\1\16\4\4\1\17\2\15\1\4\1\17\1\4\1\37\1\33\1\17\1"+
        "\4\1\17\1\4\1\17";
    static final String DFA6_maxS =
        "\1\42\30\5\2\43\16\15\1\5\10\4\2\15\10\44\1\4\2\uffff\10\4\1\37"+
        "\11\44\1\5\1\4\2\5\1\44\2\15\1\4\1\44\1\4\1\37\1\33\1\44\1\4\1\44"+
        "\1\4\1\44";
    static final String DFA6_acceptS =
        "\75\uffff\1\2\1\1\43\uffff";
    static final String DFA6_specialS =
        "\142\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\10\1\uffff\1\7\1\6\1\5\1\4\1\3\1\2\1\1",
            "\1\12\1\11",
            "\1\14\1\13",
            "\1\16\1\15",
            "\1\20\1\17",
            "\1\22\1\21",
            "\1\24\1\23",
            "\1\26\1\25",
            "\1\30\1\27",
            "\1\32\1\31",
            "\1\32\1\31",
            "\1\34\1\33",
            "\1\34\1\33",
            "\1\36\1\35",
            "\1\36\1\35",
            "\1\40\1\37",
            "\1\40\1\37",
            "\1\42\1\41",
            "\1\42\1\41",
            "\1\44\1\43",
            "\1\44\1\43",
            "\1\46\1\45",
            "\1\46\1\45",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\52\25\uffff\1\51",
            "\1\52\25\uffff\1\51",
            "\1\53",
            "\1\53",
            "\1\54",
            "\1\54",
            "\1\55",
            "\1\55",
            "\1\56",
            "\1\56",
            "\1\57",
            "\1\57",
            "\1\60",
            "\1\60",
            "\1\61",
            "\1\61",
            "\1\63\1\62",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\52",
            "\1\52",
            "\1\75\1\uffff\1\76\22\uffff\1\74",
            "\1\75\1\uffff\1\76\22\uffff\1\77",
            "\1\75\1\uffff\1\76\22\uffff\1\100",
            "\1\75\1\uffff\1\76\22\uffff\1\101",
            "\1\75\1\uffff\1\76\22\uffff\1\102",
            "\1\75\1\uffff\1\76\22\uffff\1\103",
            "\1\105\10\uffff\1\104",
            "\1\107\25\uffff\1\106",
            "\1\110",
            "",
            "",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\75\1\uffff\1\76\22\uffff\1\74",
            "\1\75\1\uffff\1\76\22\uffff\1\77",
            "\1\75\1\uffff\1\76\22\uffff\1\100",
            "\1\75\1\uffff\1\76\22\uffff\1\101",
            "\1\75\1\uffff\1\76\22\uffff\1\102",
            "\1\75\1\uffff\1\76\22\uffff\1\103",
            "\1\105\10\uffff\1\104",
            "\1\75\1\uffff\1\76\22\uffff\1\122",
            "\1\107\25\uffff\1\106",
            "\1\124\1\123",
            "\1\125",
            "\1\127\1\126",
            "\1\127\1\126",
            "\1\75\1\uffff\1\76\22\uffff\1\122",
            "\1\130",
            "\1\130",
            "\1\131",
            "\1\134\1\uffff\1\133\22\uffff\1\132",
            "\1\135",
            "\1\121",
            "\1\136",
            "\1\134\1\uffff\1\133\22\uffff\1\132",
            "\1\137",
            "\1\75\1\uffff\1\76\22\uffff\1\140",
            "\1\141",
            "\1\75\1\uffff\1\76\22\uffff\1\140"
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "()* loopback of 327:1: ( ( (lv_pageElements_3_0= rulePageElement ) ) otherlv_4= ',' )*";
        }
    }
    static final String DFA11_eotS =
        "\14\uffff";
    static final String DFA11_eofS =
        "\14\uffff";
    static final String DFA11_minS =
        "\1\37\3\4\2\15\1\4\1\17\1\4\2\uffff\1\17";
    static final String DFA11_maxS =
        "\1\37\3\5\2\15\1\4\1\44\1\4\2\uffff\1\44";
    static final String DFA11_acceptS =
        "\11\uffff\1\2\1\1\1\uffff";
    static final String DFA11_specialS =
        "\14\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\1",
            "\1\3\1\2",
            "\1\5\1\4",
            "\1\5\1\4",
            "\1\6",
            "\1\6",
            "\1\7",
            "\1\11\1\uffff\1\12\22\uffff\1\10",
            "\1\13",
            "",
            "",
            "\1\11\1\uffff\1\12\22\uffff\1\10"
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "()* loopback of 834:1: ( ( (lv_columns_6_0= ruleColumn ) ) otherlv_7= ',' )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormModel_in_entryRuleFormModel75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormModel85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_ruleFormModel140 = new BitSet(new long[]{0x0000000000001802L});
        public static final BitSet FOLLOW_ruleForm_in_entryRuleForm177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForm187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleForm230 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleForm256 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleForm273 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleForm299 = new BitSet(new long[]{0x0000000000002030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleForm320 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleForm333 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleForm356 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleForm368 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_rulePage_in_ruleForm389 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_15_in_ruleForm402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString490 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage561 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rulePage608 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_STRING_in_rulePage625 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePage642 = new BitSet(new long[]{0x00000007F4000000L});
        public static final BitSet FOLLOW_rulePageElement_in_rulePage664 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePage676 = new BitSet(new long[]{0x00000007F4000000L});
        public static final BitSet FOLLOW_rulePageElement_in_rulePage699 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePage711 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_rulePage724 = new BitSet(new long[]{0x0000000001080000L});
        public static final BitSet FOLLOW_ruleCondition_in_rulePage745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition783 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCondition840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_ruleCondition867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition902 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleCompositeCondition949 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCompositeCondition970 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleCompositeCondition982 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleCompositeCondition994 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition1015 = new BitSet(new long[]{0x0000006000000000L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_ruleCompositeCondition1036 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_ruleCompositeCondition1057 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleCompositeCondition1069 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCompositeCondition1081 = new BitSet(new long[]{0x00000F8000000000L});
        public static final BitSet FOLLOW_ruleConditionType_in_ruleCompositeCondition1102 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition1138 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueCondition1148 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleAttributeValueCondition1185 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeValueCondition1206 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_20_in_ruleAttributeValueCondition1218 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeValueCondition1241 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleAttributeValueCondition1253 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAttributeValueCondition1274 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAttributeValueCondition1286 = new BitSet(new long[]{0x00000F8000000000L});
        public static final BitSet FOLLOW_ruleConditionType_in_ruleAttributeValueCondition1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement1343 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageElement1353 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_rulePageElement1400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_rulePageElement1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement1462 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipPageElement1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_ruleRelationshipPageElement1519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_ruleRelationshipPageElement1546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable1581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable1591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleTable1628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable1649 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTable1670 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTable1682 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable1705 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleTable1717 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable1739 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_ruleTable1751 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleTable1774 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleTable1786 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleTable1798 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTable1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList1857 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList1867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleList1904 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleList1925 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleList1946 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleList1958 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleList1981 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleList1993 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleList2016 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement2052 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributePageElement2062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_ruleAttributePageElement2109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_ruleAttributePageElement2136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_ruleAttributePageElement2163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_ruleAttributePageElement2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_ruleAttributePageElement2217 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_ruleAttributePageElement2244 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField2279 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSelectionField2289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleTimeSelectionField2326 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeSelectionField2347 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTimeSelectionField2368 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTimeSelectionField2380 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTimeSelectionField2403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField2439 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateSelectionField2449 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleDateSelectionField2486 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDateSelectionField2507 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDateSelectionField2528 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDateSelectionField2540 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleDateSelectionField2563 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn2599 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn2609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleColumn2646 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleColumn2667 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleColumn2688 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleColumn2700 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleColumn2723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_entryRuleSelectionField2759 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionField2769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_ruleSelectionField2806 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectionField2827 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSelectionField2848 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleSelectionField2860 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSelectionField2883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea2919 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextArea2929 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleTextArea2966 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextArea2987 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextArea3008 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTextArea3020 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextArea3043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField3079 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextField3089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleTextField3126 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextField3147 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextField3168 = new BitSet(new long[]{0x0000000800002000L});
        public static final BitSet FOLLOW_35_in_ruleTextField3181 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleTextField3202 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleTextField3216 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTextField3239 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3278 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3289 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3329 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_36_in_ruleQualifiedName3357 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName3373 = new BitSet(new long[]{0x0000001000000002L});
        public static final BitSet FOLLOW_37_in_ruleCompositeConditionType3434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleCompositeConditionType3451 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleConditionType3496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleConditionType3513 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleConditionType3530 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleConditionType3547 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleConditionType3564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_synpred1_InternalForm3348 = new BitSet(new long[]{0x0000000000000002L});
    }


}