package at.ac.tuwien.big.forms.form.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import at.ac.tuwien.big.forms.form.services.FormGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFormParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'And'", "'Or'", "'Hide'", "'Show'", "'Enable'", "'Disable'", "'None'", "'form'", "'handles'", "'{'", "'}'", "'page'", "','", "'with'", "'composite-condition'", "':'", "'('", "')'", "'?'", "'attribute-condition'", "'=='", "'table'", "'edits'", "'list'", "'time-selection-field'", "'date-selection-field'", "'column'", "'selection-field'", "'text-area'", "'text-field'", "'format'", "'.'", "'welcome'"
    };
    public static final int RULE_ID=5;
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
    public static final int RULE_STRING=4;
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g"; }


     
     	private FormGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(FormGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleFormModel"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:61:1: entryRuleFormModel : ruleFormModel EOF ;
    public final void entryRuleFormModel() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:62:1: ( ruleFormModel EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:63:1: ruleFormModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFormModel_in_entryRuleFormModel67);
            ruleFormModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFormModel74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFormModel"


    // $ANTLR start "ruleFormModel"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:70:1: ruleFormModel : ( ( rule__FormModel__Group__0 ) ) ;
    public final void ruleFormModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:74:2: ( ( ( rule__FormModel__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:75:1: ( ( rule__FormModel__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:75:1: ( ( rule__FormModel__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:76:1: ( rule__FormModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:77:1: ( rule__FormModel__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:77:2: rule__FormModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__FormModel__Group__0_in_ruleFormModel100);
            rule__FormModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFormModel"


    // $ANTLR start "entryRuleForm"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:89:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:90:1: ( ruleForm EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:91:1: ruleForm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_entryRuleForm127);
            ruleForm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleForm134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:98:1: ruleForm : ( ( rule__Form__Group__0 ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:102:2: ( ( ( rule__Form__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:103:1: ( ( rule__Form__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:103:1: ( ( rule__Form__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:104:1: ( rule__Form__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:105:1: ( rule__Form__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:105:2: rule__Form__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__0_in_ruleForm160);
            rule__Form__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleEString"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:117:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:118:1: ( ruleEString EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:119:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString187);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString194); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:126:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:130:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:131:1: ( ( rule__EString__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:131:1: ( ( rule__EString__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:132:1: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:133:1: ( rule__EString__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:133:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString220);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRulePage"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:145:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:146:1: ( rulePage EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:147:1: rulePage EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_entryRulePage247);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePage254); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:154:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:158:2: ( ( ( rule__Page__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:159:1: ( ( rule__Page__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:159:1: ( ( rule__Page__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:160:1: ( rule__Page__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:161:1: ( rule__Page__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:161:2: rule__Page__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0_in_rulePage280);
            rule__Page__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "entryRuleCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:173:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:174:1: ( ruleCondition EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:175:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition307);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition314); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:182:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:186:2: ( ( ( rule__Condition__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:187:1: ( ( rule__Condition__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:187:1: ( ( rule__Condition__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:188:1: ( rule__Condition__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:189:1: ( rule__Condition__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:189:2: rule__Condition__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Condition__Alternatives_in_ruleCondition340);
            rule__Condition__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:201:1: entryRuleCompositeCondition : ruleCompositeCondition EOF ;
    public final void entryRuleCompositeCondition() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:202:1: ( ruleCompositeCondition EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:203:1: ruleCompositeCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition367);
            ruleCompositeCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCompositeCondition374); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompositeCondition"


    // $ANTLR start "ruleCompositeCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:210:1: ruleCompositeCondition : ( ( rule__CompositeCondition__Group__0 ) ) ;
    public final void ruleCompositeCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:214:2: ( ( ( rule__CompositeCondition__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:215:1: ( ( rule__CompositeCondition__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:215:1: ( ( rule__CompositeCondition__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:216:1: ( rule__CompositeCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:217:1: ( rule__CompositeCondition__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:217:2: rule__CompositeCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition400);
            rule__CompositeCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeCondition"


    // $ANTLR start "entryRuleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:229:1: entryRuleAttributeValueCondition : ruleAttributeValueCondition EOF ;
    public final void entryRuleAttributeValueCondition() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:230:1: ( ruleAttributeValueCondition EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:231:1: ruleAttributeValueCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition427);
            ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributeValueCondition434); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValueCondition"


    // $ANTLR start "ruleAttributeValueCondition"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:238:1: ruleAttributeValueCondition : ( ( rule__AttributeValueCondition__Group__0 ) ) ;
    public final void ruleAttributeValueCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:242:2: ( ( ( rule__AttributeValueCondition__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:243:1: ( ( rule__AttributeValueCondition__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:243:1: ( ( rule__AttributeValueCondition__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:244:1: ( rule__AttributeValueCondition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:245:1: ( rule__AttributeValueCondition__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:245:2: rule__AttributeValueCondition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__0_in_ruleAttributeValueCondition460);
            rule__AttributeValueCondition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValueCondition"


    // $ANTLR start "entryRulePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:257:1: entryRulePageElement : rulePageElement EOF ;
    public final void entryRulePageElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:258:1: ( rulePageElement EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:259:1: rulePageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_entryRulePageElement487);
            rulePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePageElement494); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePageElement"


    // $ANTLR start "rulePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:266:1: rulePageElement : ( ( rule__PageElement__Alternatives ) ) ;
    public final void rulePageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:270:2: ( ( ( rule__PageElement__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:271:1: ( ( rule__PageElement__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:271:1: ( ( rule__PageElement__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:272:1: ( rule__PageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageElementAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:273:1: ( rule__PageElement__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:273:2: rule__PageElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__PageElement__Alternatives_in_rulePageElement520);
            rule__PageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePageElement"


    // $ANTLR start "entryRuleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:285:1: entryRuleRelationshipPageElement : ruleRelationshipPageElement EOF ;
    public final void entryRuleRelationshipPageElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:286:1: ( ruleRelationshipPageElement EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:287:1: ruleRelationshipPageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement547);
            ruleRelationshipPageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationshipPageElement554); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRelationshipPageElement"


    // $ANTLR start "ruleRelationshipPageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:294:1: ruleRelationshipPageElement : ( ( rule__RelationshipPageElement__Alternatives ) ) ;
    public final void ruleRelationshipPageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:298:2: ( ( ( rule__RelationshipPageElement__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:299:1: ( ( rule__RelationshipPageElement__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:299:1: ( ( rule__RelationshipPageElement__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:300:1: ( rule__RelationshipPageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipPageElementAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:301:1: ( rule__RelationshipPageElement__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:301:2: rule__RelationshipPageElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__RelationshipPageElement__Alternatives_in_ruleRelationshipPageElement580);
            rule__RelationshipPageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipPageElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRelationshipPageElement"


    // $ANTLR start "entryRuleTable"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:313:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:314:1: ( ruleTable EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:315:1: ruleTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTable_in_entryRuleTable607);
            ruleTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTable614); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:322:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:326:2: ( ( ( rule__Table__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:327:1: ( ( rule__Table__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:327:1: ( ( rule__Table__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:328:1: ( rule__Table__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:329:1: ( rule__Table__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:329:2: rule__Table__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__0_in_ruleTable640);
            rule__Table__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleList"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:341:1: entryRuleList : ruleList EOF ;
    public final void entryRuleList() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:342:1: ( ruleList EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:343:1: ruleList EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleList_in_entryRuleList667);
            ruleList();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleList674); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleList"


    // $ANTLR start "ruleList"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:350:1: ruleList : ( ( rule__List__Group__0 ) ) ;
    public final void ruleList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:354:2: ( ( ( rule__List__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:355:1: ( ( rule__List__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:355:1: ( ( rule__List__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:356:1: ( rule__List__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:357:1: ( rule__List__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:357:2: rule__List__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0_in_ruleList700);
            rule__List__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleList"


    // $ANTLR start "entryRuleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:369:1: entryRuleAttributePageElement : ruleAttributePageElement EOF ;
    public final void entryRuleAttributePageElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:370:1: ( ruleAttributePageElement EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:371:1: ruleAttributePageElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement727);
            ruleAttributePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttributePageElement734); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributePageElement"


    // $ANTLR start "ruleAttributePageElement"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:378:1: ruleAttributePageElement : ( ( rule__AttributePageElement__Alternatives ) ) ;
    public final void ruleAttributePageElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:382:2: ( ( ( rule__AttributePageElement__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:383:1: ( ( rule__AttributePageElement__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:383:1: ( ( rule__AttributePageElement__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:384:1: ( rule__AttributePageElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributePageElementAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:385:1: ( rule__AttributePageElement__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:385:2: rule__AttributePageElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributePageElement__Alternatives_in_ruleAttributePageElement760);
            rule__AttributePageElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributePageElementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributePageElement"


    // $ANTLR start "entryRuleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:397:1: entryRuleTimeSelectionField : ruleTimeSelectionField EOF ;
    public final void entryRuleTimeSelectionField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:398:1: ( ruleTimeSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:399:1: ruleTimeSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField787);
            ruleTimeSelectionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTimeSelectionField794); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTimeSelectionField"


    // $ANTLR start "ruleTimeSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:406:1: ruleTimeSelectionField : ( ( rule__TimeSelectionField__Group__0 ) ) ;
    public final void ruleTimeSelectionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:410:2: ( ( ( rule__TimeSelectionField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:411:1: ( ( rule__TimeSelectionField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:411:1: ( ( rule__TimeSelectionField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:412:1: ( rule__TimeSelectionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:413:1: ( rule__TimeSelectionField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:413:2: rule__TimeSelectionField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__0_in_ruleTimeSelectionField820);
            rule__TimeSelectionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeSelectionField"


    // $ANTLR start "entryRuleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:425:1: entryRuleDateSelectionField : ruleDateSelectionField EOF ;
    public final void entryRuleDateSelectionField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:426:1: ( ruleDateSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:427:1: ruleDateSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField847);
            ruleDateSelectionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDateSelectionField854); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDateSelectionField"


    // $ANTLR start "ruleDateSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:434:1: ruleDateSelectionField : ( ( rule__DateSelectionField__Group__0 ) ) ;
    public final void ruleDateSelectionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:438:2: ( ( ( rule__DateSelectionField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:439:1: ( ( rule__DateSelectionField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:439:1: ( ( rule__DateSelectionField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:440:1: ( rule__DateSelectionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:441:1: ( rule__DateSelectionField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:441:2: rule__DateSelectionField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__0_in_ruleDateSelectionField880);
            rule__DateSelectionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDateSelectionField"


    // $ANTLR start "entryRuleColumn"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:453:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:454:1: ( ruleColumn EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:455:1: ruleColumn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_entryRuleColumn907);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColumn914); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:462:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:466:2: ( ( ( rule__Column__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:467:1: ( ( rule__Column__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:467:1: ( ( rule__Column__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:468:1: ( rule__Column__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:469:1: ( rule__Column__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:469:2: rule__Column__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__0_in_ruleColumn940);
            rule__Column__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:481:1: entryRuleSelectionField : ruleSelectionField EOF ;
    public final void entryRuleSelectionField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:482:1: ( ruleSelectionField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:483:1: ruleSelectionField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_entryRuleSelectionField967);
            ruleSelectionField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSelectionField974); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectionField"


    // $ANTLR start "ruleSelectionField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:490:1: ruleSelectionField : ( ( rule__SelectionField__Group__0 ) ) ;
    public final void ruleSelectionField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:494:2: ( ( ( rule__SelectionField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:495:1: ( ( rule__SelectionField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:495:1: ( ( rule__SelectionField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:496:1: ( rule__SelectionField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:497:1: ( rule__SelectionField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:497:2: rule__SelectionField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__0_in_ruleSelectionField1000);
            rule__SelectionField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectionField"


    // $ANTLR start "entryRuleTextArea"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:509:1: entryRuleTextArea : ruleTextArea EOF ;
    public final void entryRuleTextArea() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:510:1: ( ruleTextArea EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:511:1: ruleTextArea EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_entryRuleTextArea1027);
            ruleTextArea();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextArea1034); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:518:1: ruleTextArea : ( ( rule__TextArea__Group__0 ) ) ;
    public final void ruleTextArea() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:522:2: ( ( ( rule__TextArea__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:523:1: ( ( rule__TextArea__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:523:1: ( ( rule__TextArea__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:524:1: ( rule__TextArea__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:525:1: ( rule__TextArea__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:525:2: rule__TextArea__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__0_in_ruleTextArea1060);
            rule__TextArea__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "entryRuleTextField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:537:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:538:1: ( ruleTextField EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:539:1: ruleTextField EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleTextField_in_entryRuleTextField1087);
            ruleTextField();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleTextField1094); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:546:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:550:2: ( ( ( rule__TextField__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:551:1: ( ( rule__TextField__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:551:1: ( ( rule__TextField__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:552:1: ( rule__TextField__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:553:1: ( rule__TextField__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:553:2: rule__TextField__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__0_in_ruleTextField1120);
            rule__TextField__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:567:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:568:1: ( ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:569:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1149);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName1156); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:576:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:580:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:581:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:581:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:582:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:583:1: ( rule__QualifiedName__Group__0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:583:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1182);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleCompositeConditionType"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:596:1: ruleCompositeConditionType : ( ( rule__CompositeConditionType__Alternatives ) ) ;
    public final void ruleCompositeConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:600:1: ( ( ( rule__CompositeConditionType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:601:1: ( ( rule__CompositeConditionType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:601:1: ( ( rule__CompositeConditionType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:602:1: ( rule__CompositeConditionType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:603:1: ( rule__CompositeConditionType__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:603:2: rule__CompositeConditionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeConditionType__Alternatives_in_ruleCompositeConditionType1219);
            rule__CompositeConditionType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompositeConditionType"


    // $ANTLR start "ruleConditionType"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:615:1: ruleConditionType : ( ( rule__ConditionType__Alternatives ) ) ;
    public final void ruleConditionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:619:1: ( ( ( rule__ConditionType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:620:1: ( ( rule__ConditionType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:620:1: ( ( rule__ConditionType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:621:1: ( rule__ConditionType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:622:1: ( rule__ConditionType__Alternatives )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:622:2: rule__ConditionType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ConditionType__Alternatives_in_ruleConditionType1255);
            rule__ConditionType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditionType"


    // $ANTLR start "rule__EString__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:633:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:637:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:638:1: ( RULE_STRING )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:638:1: ( RULE_STRING )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:639:1: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives1290); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:644:6: ( RULE_ID )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:644:6: ( RULE_ID )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:645:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives1307); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__Condition__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:655:1: rule__Condition__Alternatives : ( ( ruleAttributeValueCondition ) | ( ruleCompositeCondition ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:659:1: ( ( ruleAttributeValueCondition ) | ( ruleCompositeCondition ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==30) ) {
                alt2=1;
            }
            else if ( (LA2_0==25) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:660:1: ( ruleAttributeValueCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:660:1: ( ruleAttributeValueCondition )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:661:1: ruleAttributeValueCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__Condition__Alternatives1339);
                    ruleAttributeValueCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getAttributeValueConditionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:666:6: ( ruleCompositeCondition )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:666:6: ( ruleCompositeCondition )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:667:1: ruleCompositeCondition
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleCompositeCondition_in_rule__Condition__Alternatives1356);
                    ruleCompositeCondition();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionAccess().getCompositeConditionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__PageElement__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:677:1: rule__PageElement__Alternatives : ( ( ruleAttributePageElement ) | ( ruleRelationshipPageElement ) );
    public final void rule__PageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:681:1: ( ( ruleAttributePageElement ) | ( ruleRelationshipPageElement ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=35 && LA3_0<=40)) ) {
                alt3=1;
            }
            else if ( (LA3_0==32||LA3_0==34) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:682:1: ( ruleAttributePageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:682:1: ( ruleAttributePageElement )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:683:1: ruleAttributePageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttributePageElement_in_rule__PageElement__Alternatives1388);
                    ruleAttributePageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageElementAccess().getAttributePageElementParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:688:6: ( ruleRelationshipPageElement )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:688:6: ( ruleRelationshipPageElement )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:689:1: ruleRelationshipPageElement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationshipPageElement_in_rule__PageElement__Alternatives1405);
                    ruleRelationshipPageElement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPageElementAccess().getRelationshipPageElementParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PageElement__Alternatives"


    // $ANTLR start "rule__RelationshipPageElement__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:699:1: rule__RelationshipPageElement__Alternatives : ( ( ruleList ) | ( ruleTable ) );
    public final void rule__RelationshipPageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:703:1: ( ( ruleList ) | ( ruleTable ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:704:1: ( ruleList )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:704:1: ( ruleList )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:705:1: ruleList
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleList_in_rule__RelationshipPageElement__Alternatives1437);
                    ruleList();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipPageElementAccess().getListParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:710:6: ( ruleTable )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:710:6: ( ruleTable )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:711:1: ruleTable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTable_in_rule__RelationshipPageElement__Alternatives1454);
                    ruleTable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getRelationshipPageElementAccess().getTableParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RelationshipPageElement__Alternatives"


    // $ANTLR start "rule__AttributePageElement__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:721:1: rule__AttributePageElement__Alternatives : ( ( ruleTextField ) | ( ruleTextArea ) | ( ruleSelectionField ) | ( ruleColumn ) | ( ruleDateSelectionField ) | ( ruleTimeSelectionField ) );
    public final void rule__AttributePageElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:725:1: ( ( ruleTextField ) | ( ruleTextArea ) | ( ruleSelectionField ) | ( ruleColumn ) | ( ruleDateSelectionField ) | ( ruleTimeSelectionField ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt5=1;
                }
                break;
            case 39:
                {
                alt5=2;
                }
                break;
            case 38:
                {
                alt5=3;
                }
                break;
            case 37:
                {
                alt5=4;
                }
                break;
            case 36:
                {
                alt5=5;
                }
                break;
            case 35:
                {
                alt5=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:726:1: ( ruleTextField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:726:1: ( ruleTextField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:727:1: ruleTextField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextField_in_rule__AttributePageElement__Alternatives1486);
                    ruleTextField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getTextFieldParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:732:6: ( ruleTextArea )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:732:6: ( ruleTextArea )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:733:1: ruleTextArea
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTextArea_in_rule__AttributePageElement__Alternatives1503);
                    ruleTextArea();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getTextAreaParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:738:6: ( ruleSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:738:6: ( ruleSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:739:1: ruleSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleSelectionField_in_rule__AttributePageElement__Alternatives1520);
                    ruleSelectionField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getSelectionFieldParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:744:6: ( ruleColumn )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:744:6: ( ruleColumn )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:745:1: ruleColumn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getColumnParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__AttributePageElement__Alternatives1537);
                    ruleColumn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getColumnParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:750:6: ( ruleDateSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:750:6: ( ruleDateSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:751:1: ruleDateSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleDateSelectionField_in_rule__AttributePageElement__Alternatives1554);
                    ruleDateSelectionField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getDateSelectionFieldParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:756:6: ( ruleTimeSelectionField )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:756:6: ( ruleTimeSelectionField )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:757:1: ruleTimeSelectionField
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleTimeSelectionField_in_rule__AttributePageElement__Alternatives1571);
                    ruleTimeSelectionField();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributePageElementAccess().getTimeSelectionFieldParserRuleCall_5()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributePageElement__Alternatives"


    // $ANTLR start "rule__CompositeConditionType__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:767:1: rule__CompositeConditionType__Alternatives : ( ( ( 'And' ) ) | ( ( 'Or' ) ) );
    public final void rule__CompositeConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:771:1: ( ( ( 'And' ) ) | ( ( 'Or' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:772:1: ( ( 'And' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:772:1: ( ( 'And' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:773:1: ( 'And' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:774:1: ( 'And' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:774:3: 'And'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__CompositeConditionType__Alternatives1604); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeConditionTypeAccess().getAndEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:779:6: ( ( 'Or' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:779:6: ( ( 'Or' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:780:1: ( 'Or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:781:1: ( 'Or' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:781:3: 'Or'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__CompositeConditionType__Alternatives1625); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompositeConditionTypeAccess().getOrEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeConditionType__Alternatives"


    // $ANTLR start "rule__ConditionType__Alternatives"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:791:1: rule__ConditionType__Alternatives : ( ( ( 'Hide' ) ) | ( ( 'Show' ) ) | ( ( 'Enable' ) ) | ( ( 'Disable' ) ) | ( ( 'None' ) ) );
    public final void rule__ConditionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:795:1: ( ( ( 'Hide' ) ) | ( ( 'Show' ) ) | ( ( 'Enable' ) ) | ( ( 'Disable' ) ) | ( ( 'None' ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt7=1;
                }
                break;
            case 14:
                {
                alt7=2;
                }
                break;
            case 15:
                {
                alt7=3;
                }
                break;
            case 16:
                {
                alt7=4;
                }
                break;
            case 17:
                {
                alt7=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:796:1: ( ( 'Hide' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:796:1: ( ( 'Hide' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:797:1: ( 'Hide' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:798:1: ( 'Hide' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:798:3: 'Hide'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__ConditionType__Alternatives1661); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getHideEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:803:6: ( ( 'Show' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:803:6: ( ( 'Show' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:804:1: ( 'Show' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:805:1: ( 'Show' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:805:3: 'Show'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__ConditionType__Alternatives1682); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getShowEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:810:6: ( ( 'Enable' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:810:6: ( ( 'Enable' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:811:1: ( 'Enable' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_2()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:812:1: ( 'Enable' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:812:3: 'Enable'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__ConditionType__Alternatives1703); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getEnableEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:817:6: ( ( 'Disable' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:817:6: ( ( 'Disable' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:818:1: ( 'Disable' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_3()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:819:1: ( 'Disable' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:819:3: 'Disable'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__ConditionType__Alternatives1724); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getDisableEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:824:6: ( ( 'None' ) )
                    {
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:824:6: ( ( 'None' ) )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:825:1: ( 'None' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                    }
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:826:1: ( 'None' )
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:826:3: 'None'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__ConditionType__Alternatives1745); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getConditionTypeAccess().getNoneEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConditionType__Alternatives"


    // $ANTLR start "rule__FormModel__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:838:1: rule__FormModel__Group__0 : rule__FormModel__Group__0__Impl rule__FormModel__Group__1 ;
    public final void rule__FormModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:842:1: ( rule__FormModel__Group__0__Impl rule__FormModel__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:843:2: rule__FormModel__Group__0__Impl rule__FormModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FormModel__Group__0__Impl_in_rule__FormModel__Group__01778);
            rule__FormModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__FormModel__Group__1_in_rule__FormModel__Group__01781);
            rule__FormModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormModel__Group__0"


    // $ANTLR start "rule__FormModel__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:850:1: rule__FormModel__Group__0__Impl : ( () ) ;
    public final void rule__FormModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:854:1: ( ( () ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:855:1: ( () )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:855:1: ( () )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:856:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormModelAction_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:857:1: ()
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:859:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getFormModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormModel__Group__0__Impl"


    // $ANTLR start "rule__FormModel__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:869:1: rule__FormModel__Group__1 : rule__FormModel__Group__1__Impl ;
    public final void rule__FormModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:873:1: ( rule__FormModel__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:874:2: rule__FormModel__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__FormModel__Group__1__Impl_in_rule__FormModel__Group__11839);
            rule__FormModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormModel__Group__1"


    // $ANTLR start "rule__FormModel__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:880:1: rule__FormModel__Group__1__Impl : ( ( ( rule__FormModel__FormsAssignment_1 ) ) ( ( rule__FormModel__FormsAssignment_1 )* ) ) ;
    public final void rule__FormModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:884:1: ( ( ( ( rule__FormModel__FormsAssignment_1 ) ) ( ( rule__FormModel__FormsAssignment_1 )* ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:885:1: ( ( ( rule__FormModel__FormsAssignment_1 ) ) ( ( rule__FormModel__FormsAssignment_1 )* ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:885:1: ( ( ( rule__FormModel__FormsAssignment_1 ) ) ( ( rule__FormModel__FormsAssignment_1 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:886:1: ( ( rule__FormModel__FormsAssignment_1 ) ) ( ( rule__FormModel__FormsAssignment_1 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:886:1: ( ( rule__FormModel__FormsAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:887:1: ( rule__FormModel__FormsAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:888:1: ( rule__FormModel__FormsAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:888:2: rule__FormModel__FormsAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__FormModel__FormsAssignment_1_in_rule__FormModel__Group__1__Impl1868);
            rule__FormModel__FormsAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getFormsAssignment_1()); 
            }

            }

            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:891:1: ( ( rule__FormModel__FormsAssignment_1 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:892:1: ( rule__FormModel__FormsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:893:1: ( rule__FormModel__FormsAssignment_1 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18||LA8_0==43) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:893:2: rule__FormModel__FormsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__FormModel__FormsAssignment_1_in_rule__FormModel__Group__1__Impl1880);
            	    rule__FormModel__FormsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getFormsAssignment_1()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormModel__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:908:1: rule__Form__Group__0 : rule__Form__Group__0__Impl rule__Form__Group__1 ;
    public final void rule__Form__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:912:1: ( rule__Form__Group__0__Impl rule__Form__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:913:2: rule__Form__Group__0__Impl rule__Form__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__01917);
            rule__Form__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__1_in_rule__Form__Group__01920);
            rule__Form__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0"


    // $ANTLR start "rule__Form__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:920:1: rule__Form__Group__0__Impl : ( ( rule__Form__WelcomeFormAssignment_0 )? ) ;
    public final void rule__Form__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:924:1: ( ( ( rule__Form__WelcomeFormAssignment_0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:925:1: ( ( rule__Form__WelcomeFormAssignment_0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:925:1: ( ( rule__Form__WelcomeFormAssignment_0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:926:1: ( rule__Form__WelcomeFormAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormAssignment_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:927:1: ( rule__Form__WelcomeFormAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==43) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:927:2: rule__Form__WelcomeFormAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Form__WelcomeFormAssignment_0_in_rule__Form__Group__0__Impl1947);
                    rule__Form__WelcomeFormAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getWelcomeFormAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__0__Impl"


    // $ANTLR start "rule__Form__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:937:1: rule__Form__Group__1 : rule__Form__Group__1__Impl rule__Form__Group__2 ;
    public final void rule__Form__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:941:1: ( rule__Form__Group__1__Impl rule__Form__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:942:2: rule__Form__Group__1__Impl rule__Form__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__11978);
            rule__Form__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__2_in_rule__Form__Group__11981);
            rule__Form__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1"


    // $ANTLR start "rule__Form__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:949:1: rule__Form__Group__1__Impl : ( 'form' ) ;
    public final void rule__Form__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:953:1: ( ( 'form' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:954:1: ( 'form' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:954:1: ( 'form' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:955:1: 'form'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getFormKeyword_1()); 
            }
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Form__Group__1__Impl2009); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getFormKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__1__Impl"


    // $ANTLR start "rule__Form__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:968:1: rule__Form__Group__2 : rule__Form__Group__2__Impl rule__Form__Group__3 ;
    public final void rule__Form__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:972:1: ( rule__Form__Group__2__Impl rule__Form__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:973:2: rule__Form__Group__2__Impl rule__Form__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__22040);
            rule__Form__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__3_in_rule__Form__Group__22043);
            rule__Form__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2"


    // $ANTLR start "rule__Form__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:980:1: rule__Form__Group__2__Impl : ( ( rule__Form__NameAssignment_2 ) ) ;
    public final void rule__Form__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:984:1: ( ( ( rule__Form__NameAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:985:1: ( ( rule__Form__NameAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:985:1: ( ( rule__Form__NameAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:986:1: ( rule__Form__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:987:1: ( rule__Form__NameAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:987:2: rule__Form__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__NameAssignment_2_in_rule__Form__Group__2__Impl2070);
            rule__Form__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__2__Impl"


    // $ANTLR start "rule__Form__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:997:1: rule__Form__Group__3 : rule__Form__Group__3__Impl rule__Form__Group__4 ;
    public final void rule__Form__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1001:1: ( rule__Form__Group__3__Impl rule__Form__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1002:2: rule__Form__Group__3__Impl rule__Form__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__32100);
            rule__Form__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__4_in_rule__Form__Group__32103);
            rule__Form__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3"


    // $ANTLR start "rule__Form__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1009:1: rule__Form__Group__3__Impl : ( ( rule__Form__TitleAssignment_3 ) ) ;
    public final void rule__Form__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1013:1: ( ( ( rule__Form__TitleAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1014:1: ( ( rule__Form__TitleAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1014:1: ( ( rule__Form__TitleAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1015:1: ( rule__Form__TitleAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1016:1: ( rule__Form__TitleAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1016:2: rule__Form__TitleAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl2130);
            rule__Form__TitleAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getTitleAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__3__Impl"


    // $ANTLR start "rule__Form__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1026:1: rule__Form__Group__4 : rule__Form__Group__4__Impl rule__Form__Group__5 ;
    public final void rule__Form__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1030:1: ( rule__Form__Group__4__Impl rule__Form__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1031:2: rule__Form__Group__4__Impl rule__Form__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__42160);
            rule__Form__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5_in_rule__Form__Group__42163);
            rule__Form__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4"


    // $ANTLR start "rule__Form__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1038:1: rule__Form__Group__4__Impl : ( ( rule__Form__DescriptionAssignment_4 )? ) ;
    public final void rule__Form__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1042:1: ( ( ( rule__Form__DescriptionAssignment_4 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1043:1: ( ( rule__Form__DescriptionAssignment_4 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1043:1: ( ( rule__Form__DescriptionAssignment_4 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1044:1: ( rule__Form__DescriptionAssignment_4 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getDescriptionAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1045:1: ( rule__Form__DescriptionAssignment_4 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( ((LA10_0>=RULE_STRING && LA10_0<=RULE_ID)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1045:2: rule__Form__DescriptionAssignment_4
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Form__DescriptionAssignment_4_in_rule__Form__Group__4__Impl2190);
                    rule__Form__DescriptionAssignment_4();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getDescriptionAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__4__Impl"


    // $ANTLR start "rule__Form__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1055:1: rule__Form__Group__5 : rule__Form__Group__5__Impl rule__Form__Group__6 ;
    public final void rule__Form__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1059:1: ( rule__Form__Group__5__Impl rule__Form__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1060:2: rule__Form__Group__5__Impl rule__Form__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__52221);
            rule__Form__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6_in_rule__Form__Group__52224);
            rule__Form__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5"


    // $ANTLR start "rule__Form__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1067:1: rule__Form__Group__5__Impl : ( 'handles' ) ;
    public final void rule__Form__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1071:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1072:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1072:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1073:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getHandlesKeyword_5()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Form__Group__5__Impl2252); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getHandlesKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__5__Impl"


    // $ANTLR start "rule__Form__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1086:1: rule__Form__Group__6 : rule__Form__Group__6__Impl rule__Form__Group__7 ;
    public final void rule__Form__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1090:1: ( rule__Form__Group__6__Impl rule__Form__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1091:2: rule__Form__Group__6__Impl rule__Form__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__62283);
            rule__Form__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7_in_rule__Form__Group__62286);
            rule__Form__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__6"


    // $ANTLR start "rule__Form__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1098:1: rule__Form__Group__6__Impl : ( ( rule__Form__EntityAssignment_6 ) ) ;
    public final void rule__Form__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1102:1: ( ( ( rule__Form__EntityAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1103:1: ( ( rule__Form__EntityAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1103:1: ( ( rule__Form__EntityAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1104:1: ( rule__Form__EntityAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1105:1: ( rule__Form__EntityAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1105:2: rule__Form__EntityAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__EntityAssignment_6_in_rule__Form__Group__6__Impl2313);
            rule__Form__EntityAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__6__Impl"


    // $ANTLR start "rule__Form__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1115:1: rule__Form__Group__7 : rule__Form__Group__7__Impl rule__Form__Group__8 ;
    public final void rule__Form__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1119:1: ( rule__Form__Group__7__Impl rule__Form__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1120:2: rule__Form__Group__7__Impl rule__Form__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72343);
            rule__Form__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72346);
            rule__Form__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__7"


    // $ANTLR start "rule__Form__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1127:1: rule__Form__Group__7__Impl : ( '{' ) ;
    public final void rule__Form__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1131:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1132:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1132:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1133:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_7()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Form__Group__7__Impl2374); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getLeftCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__7__Impl"


    // $ANTLR start "rule__Form__Group__8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1146:1: rule__Form__Group__8 : rule__Form__Group__8__Impl rule__Form__Group__9 ;
    public final void rule__Form__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1150:1: ( rule__Form__Group__8__Impl rule__Form__Group__9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1151:2: rule__Form__Group__8__Impl rule__Form__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82405);
            rule__Form__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__9_in_rule__Form__Group__82408);
            rule__Form__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__8"


    // $ANTLR start "rule__Form__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1158:1: rule__Form__Group__8__Impl : ( ( rule__Form__PagesAssignment_8 )* ) ;
    public final void rule__Form__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1162:1: ( ( ( rule__Form__PagesAssignment_8 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1163:1: ( ( rule__Form__PagesAssignment_8 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1163:1: ( ( rule__Form__PagesAssignment_8 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1164:1: ( rule__Form__PagesAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesAssignment_8()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1165:1: ( rule__Form__PagesAssignment_8 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1165:2: rule__Form__PagesAssignment_8
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Form__PagesAssignment_8_in_rule__Form__Group__8__Impl2435);
            	    rule__Form__PagesAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getPagesAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__8__Impl"


    // $ANTLR start "rule__Form__Group__9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1175:1: rule__Form__Group__9 : rule__Form__Group__9__Impl ;
    public final void rule__Form__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1179:1: ( rule__Form__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1180:2: rule__Form__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Form__Group__9__Impl_in_rule__Form__Group__92466);
            rule__Form__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__9"


    // $ANTLR start "rule__Form__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1186:1: rule__Form__Group__9__Impl : ( '}' ) ;
    public final void rule__Form__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1190:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1191:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1191:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1192:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Form__Group__9__Impl2494); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__Group__9__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1225:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1229:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1230:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02545);
            rule__Page__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02548);
            rule__Page__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1237:1: rule__Page__Group__0__Impl : ( 'page' ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1241:1: ( ( 'page' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1242:1: ( 'page' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1242:1: ( 'page' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1243:1: 'page'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Page__Group__0__Impl2576); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1256:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1260:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1261:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12607);
            rule__Page__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12610);
            rule__Page__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1268:1: rule__Page__Group__1__Impl : ( ( rule__Page__TitleAssignment_1 ) ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1272:1: ( ( ( rule__Page__TitleAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1273:1: ( ( rule__Page__TitleAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1273:1: ( ( rule__Page__TitleAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1274:1: ( rule__Page__TitleAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1275:1: ( rule__Page__TitleAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1275:2: rule__Page__TitleAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2637);
            rule__Page__TitleAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTitleAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1285:1: rule__Page__Group__2 : rule__Page__Group__2__Impl rule__Page__Group__3 ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1289:1: ( rule__Page__Group__2__Impl rule__Page__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1290:2: rule__Page__Group__2__Impl rule__Page__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22667);
            rule__Page__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22670);
            rule__Page__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1297:1: rule__Page__Group__2__Impl : ( '{' ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1301:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1302:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1302:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1303:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Page__Group__2__Impl2698); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__Page__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1316:1: rule__Page__Group__3 : rule__Page__Group__3__Impl rule__Page__Group__4 ;
    public final void rule__Page__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1320:1: ( rule__Page__Group__3__Impl rule__Page__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1321:2: rule__Page__Group__3__Impl rule__Page__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32729);
            rule__Page__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32732);
            rule__Page__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3"


    // $ANTLR start "rule__Page__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1328:1: rule__Page__Group__3__Impl : ( ( rule__Page__Group_3__0 )* ) ;
    public final void rule__Page__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1332:1: ( ( ( rule__Page__Group_3__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1333:1: ( ( rule__Page__Group_3__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1333:1: ( ( rule__Page__Group_3__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1334:1: ( rule__Page__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1335:1: ( rule__Page__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1335:2: rule__Page__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2759);
            	    rule__Page__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__3__Impl"


    // $ANTLR start "rule__Page__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1345:1: rule__Page__Group__4 : rule__Page__Group__4__Impl rule__Page__Group__5 ;
    public final void rule__Page__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1349:1: ( rule__Page__Group__4__Impl rule__Page__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1350:2: rule__Page__Group__4__Impl rule__Page__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42790);
            rule__Page__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42793);
            rule__Page__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4"


    // $ANTLR start "rule__Page__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1357:1: rule__Page__Group__4__Impl : ( ( rule__Page__PageElementsAssignment_4 ) ) ;
    public final void rule__Page__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1361:1: ( ( ( rule__Page__PageElementsAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1362:1: ( ( rule__Page__PageElementsAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1362:1: ( ( rule__Page__PageElementsAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1363:1: ( rule__Page__PageElementsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1364:1: ( rule__Page__PageElementsAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1364:2: rule__Page__PageElementsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_4_in_rule__Page__Group__4__Impl2820);
            rule__Page__PageElementsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__4__Impl"


    // $ANTLR start "rule__Page__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1374:1: rule__Page__Group__5 : rule__Page__Group__5__Impl rule__Page__Group__6 ;
    public final void rule__Page__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1378:1: ( rule__Page__Group__5__Impl rule__Page__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1379:2: rule__Page__Group__5__Impl rule__Page__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52850);
            rule__Page__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52853);
            rule__Page__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5"


    // $ANTLR start "rule__Page__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1386:1: rule__Page__Group__5__Impl : ( '}' ) ;
    public final void rule__Page__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1390:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1391:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1391:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1392:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Page__Group__5__Impl2881); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__5__Impl"


    // $ANTLR start "rule__Page__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1405:1: rule__Page__Group__6 : rule__Page__Group__6__Impl ;
    public final void rule__Page__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1409:1: ( rule__Page__Group__6__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1410:2: rule__Page__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62912);
            rule__Page__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6"


    // $ANTLR start "rule__Page__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1416:1: rule__Page__Group__6__Impl : ( ( rule__Page__Group_6__0 )? ) ;
    public final void rule__Page__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1420:1: ( ( ( rule__Page__Group_6__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1421:1: ( ( rule__Page__Group_6__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1421:1: ( ( rule__Page__Group_6__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1422:1: ( rule__Page__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getGroup_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1423:1: ( rule__Page__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1423:2: rule__Page__Group_6__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Page__Group_6__0_in_rule__Page__Group__6__Impl2939);
                    rule__Page__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__6__Impl"


    // $ANTLR start "rule__Page__Group_3__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1447:1: rule__Page__Group_3__0 : rule__Page__Group_3__0__Impl rule__Page__Group_3__1 ;
    public final void rule__Page__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1451:1: ( rule__Page__Group_3__0__Impl rule__Page__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1452:2: rule__Page__Group_3__0__Impl rule__Page__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02984);
            rule__Page__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02987);
            rule__Page__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0"


    // $ANTLR start "rule__Page__Group_3__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1459:1: rule__Page__Group_3__0__Impl : ( ( rule__Page__PageElementsAssignment_3_0 ) ) ;
    public final void rule__Page__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1463:1: ( ( ( rule__Page__PageElementsAssignment_3_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1464:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1464:1: ( ( rule__Page__PageElementsAssignment_3_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1465:1: ( rule__Page__PageElementsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsAssignment_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1466:1: ( rule__Page__PageElementsAssignment_3_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1466:2: rule__Page__PageElementsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl3014);
            rule__Page__PageElementsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsAssignment_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__0__Impl"


    // $ANTLR start "rule__Page__Group_3__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1476:1: rule__Page__Group_3__1 : rule__Page__Group_3__1__Impl ;
    public final void rule__Page__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1480:1: ( rule__Page__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1481:2: rule__Page__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__13044);
            rule__Page__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1"


    // $ANTLR start "rule__Page__Group_3__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1487:1: rule__Page__Group_3__1__Impl : ( ',' ) ;
    public final void rule__Page__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1491:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1492:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1492:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1493:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getCommaKeyword_3_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Page__Group_3__1__Impl3072); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getCommaKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_3__1__Impl"


    // $ANTLR start "rule__Page__Group_6__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1510:1: rule__Page__Group_6__0 : rule__Page__Group_6__0__Impl rule__Page__Group_6__1 ;
    public final void rule__Page__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1514:1: ( rule__Page__Group_6__0__Impl rule__Page__Group_6__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1515:2: rule__Page__Group_6__0__Impl rule__Page__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__03107);
            rule__Page__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__03110);
            rule__Page__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__0"


    // $ANTLR start "rule__Page__Group_6__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1522:1: rule__Page__Group_6__0__Impl : ( 'with' ) ;
    public final void rule__Page__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1526:1: ( ( 'with' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1527:1: ( 'with' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1527:1: ( 'with' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1528:1: 'with'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getWithKeyword_6_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Page__Group_6__0__Impl3138); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getWithKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__0__Impl"


    // $ANTLR start "rule__Page__Group_6__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1541:1: rule__Page__Group_6__1 : rule__Page__Group_6__1__Impl ;
    public final void rule__Page__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1545:1: ( rule__Page__Group_6__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1546:2: rule__Page__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__13169);
            rule__Page__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__1"


    // $ANTLR start "rule__Page__Group_6__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1552:1: rule__Page__Group_6__1__Impl : ( ( rule__Page__ConditionAssignment_6_1 ) ) ;
    public final void rule__Page__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1556:1: ( ( ( rule__Page__ConditionAssignment_6_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1557:1: ( ( rule__Page__ConditionAssignment_6_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1557:1: ( ( rule__Page__ConditionAssignment_6_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1558:1: ( rule__Page__ConditionAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionAssignment_6_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1559:1: ( rule__Page__ConditionAssignment_6_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1559:2: rule__Page__ConditionAssignment_6_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Page__ConditionAssignment_6_1_in_rule__Page__Group_6__1__Impl3196);
            rule__Page__ConditionAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getConditionAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group_6__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1573:1: rule__CompositeCondition__Group__0 : rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 ;
    public final void rule__CompositeCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1577:1: ( rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1578:2: rule__CompositeCondition__Group__0__Impl rule__CompositeCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__03230);
            rule__CompositeCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__03233);
            rule__CompositeCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0"


    // $ANTLR start "rule__CompositeCondition__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1585:1: rule__CompositeCondition__Group__0__Impl : ( 'composite-condition' ) ;
    public final void rule__CompositeCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1589:1: ( ( 'composite-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1590:1: ( 'composite-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1590:1: ( 'composite-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1591:1: 'composite-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__CompositeCondition__Group__0__Impl3261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositeConditionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__0__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1604:1: rule__CompositeCondition__Group__1 : rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 ;
    public final void rule__CompositeCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1608:1: ( rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1609:2: rule__CompositeCondition__Group__1__Impl rule__CompositeCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__13292);
            rule__CompositeCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__13295);
            rule__CompositeCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1"


    // $ANTLR start "rule__CompositeCondition__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1616:1: rule__CompositeCondition__Group__1__Impl : ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__CompositeCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1620:1: ( ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1621:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1621:1: ( ( rule__CompositeCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1622:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1623:1: ( rule__CompositeCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1623:2: rule__CompositeCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl3322);
            rule__CompositeCondition__ConditionIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__1__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1633:1: rule__CompositeCondition__Group__2 : rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 ;
    public final void rule__CompositeCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1637:1: ( rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1638:2: rule__CompositeCondition__Group__2__Impl rule__CompositeCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__23352);
            rule__CompositeCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__23355);
            rule__CompositeCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2"


    // $ANTLR start "rule__CompositeCondition__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1645:1: rule__CompositeCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__CompositeCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1649:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1650:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1650:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1651:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getColonKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__CompositeCondition__Group__2__Impl3383); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__2__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1664:1: rule__CompositeCondition__Group__3 : rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 ;
    public final void rule__CompositeCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1668:1: ( rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1669:2: rule__CompositeCondition__Group__3__Impl rule__CompositeCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__33414);
            rule__CompositeCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__33417);
            rule__CompositeCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3"


    // $ANTLR start "rule__CompositeCondition__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1676:1: rule__CompositeCondition__Group__3__Impl : ( '(' ) ;
    public final void rule__CompositeCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1680:1: ( ( '(' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1681:1: ( '(' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1681:1: ( '(' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1682:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,27,FollowSets000.FOLLOW_27_in_rule__CompositeCondition__Group__3__Impl3445); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__3__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1695:1: rule__CompositeCondition__Group__4 : rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 ;
    public final void rule__CompositeCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1699:1: ( rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1700:2: rule__CompositeCondition__Group__4__Impl rule__CompositeCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__43476);
            rule__CompositeCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__43479);
            rule__CompositeCondition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__4"


    // $ANTLR start "rule__CompositeCondition__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1707:1: rule__CompositeCondition__Group__4__Impl : ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) ) ;
    public final void rule__CompositeCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1711:1: ( ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1712:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1712:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1713:1: ( rule__CompositeCondition__ComposedConditionsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1714:1: ( rule__CompositeCondition__ComposedConditionsAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1714:2: rule__CompositeCondition__ComposedConditionsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_4_in_rule__CompositeCondition__Group__4__Impl3506);
            rule__CompositeCondition__ComposedConditionsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__4__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1724:1: rule__CompositeCondition__Group__5 : rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 ;
    public final void rule__CompositeCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1728:1: ( rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1729:2: rule__CompositeCondition__Group__5__Impl rule__CompositeCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__53536);
            rule__CompositeCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__53539);
            rule__CompositeCondition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__5"


    // $ANTLR start "rule__CompositeCondition__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1736:1: rule__CompositeCondition__Group__5__Impl : ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) ) ;
    public final void rule__CompositeCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1740:1: ( ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1741:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1741:1: ( ( rule__CompositeCondition__CompositionTypeAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1742:1: ( rule__CompositeCondition__CompositionTypeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1743:1: ( rule__CompositeCondition__CompositionTypeAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1743:2: rule__CompositeCondition__CompositionTypeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_5_in_rule__CompositeCondition__Group__5__Impl3566);
            rule__CompositeCondition__CompositionTypeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositionTypeAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__5__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1753:1: rule__CompositeCondition__Group__6 : rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 ;
    public final void rule__CompositeCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1757:1: ( rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1758:2: rule__CompositeCondition__Group__6__Impl rule__CompositeCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__63596);
            rule__CompositeCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__63599);
            rule__CompositeCondition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__6"


    // $ANTLR start "rule__CompositeCondition__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1765:1: rule__CompositeCondition__Group__6__Impl : ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) ) ;
    public final void rule__CompositeCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1769:1: ( ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1770:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1770:1: ( ( rule__CompositeCondition__ComposedConditionsAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1771:1: ( rule__CompositeCondition__ComposedConditionsAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1772:1: ( rule__CompositeCondition__ComposedConditionsAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1772:2: rule__CompositeCondition__ComposedConditionsAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_6_in_rule__CompositeCondition__Group__6__Impl3626);
            rule__CompositeCondition__ComposedConditionsAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__6__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1782:1: rule__CompositeCondition__Group__7 : rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8 ;
    public final void rule__CompositeCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1786:1: ( rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1787:2: rule__CompositeCondition__Group__7__Impl rule__CompositeCondition__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__73656);
            rule__CompositeCondition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__8_in_rule__CompositeCondition__Group__73659);
            rule__CompositeCondition__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__7"


    // $ANTLR start "rule__CompositeCondition__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1794:1: rule__CompositeCondition__Group__7__Impl : ( ')' ) ;
    public final void rule__CompositeCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1798:1: ( ( ')' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1799:1: ( ')' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1799:1: ( ')' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1800:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__CompositeCondition__Group__7__Impl3687); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getRightParenthesisKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__7__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1813:1: rule__CompositeCondition__Group__8 : rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9 ;
    public final void rule__CompositeCondition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1817:1: ( rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1818:2: rule__CompositeCondition__Group__8__Impl rule__CompositeCondition__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__8__Impl_in_rule__CompositeCondition__Group__83718);
            rule__CompositeCondition__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__9_in_rule__CompositeCondition__Group__83721);
            rule__CompositeCondition__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__8"


    // $ANTLR start "rule__CompositeCondition__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1825:1: rule__CompositeCondition__Group__8__Impl : ( '?' ) ;
    public final void rule__CompositeCondition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1829:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1830:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1830:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1831:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__CompositeCondition__Group__8__Impl3749); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getQuestionMarkKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__8__Impl"


    // $ANTLR start "rule__CompositeCondition__Group__9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1844:1: rule__CompositeCondition__Group__9 : rule__CompositeCondition__Group__9__Impl ;
    public final void rule__CompositeCondition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1848:1: ( rule__CompositeCondition__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1849:2: rule__CompositeCondition__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__Group__9__Impl_in_rule__CompositeCondition__Group__93780);
            rule__CompositeCondition__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__9"


    // $ANTLR start "rule__CompositeCondition__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1855:1: rule__CompositeCondition__Group__9__Impl : ( ( rule__CompositeCondition__TypeAssignment_9 ) ) ;
    public final void rule__CompositeCondition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1859:1: ( ( ( rule__CompositeCondition__TypeAssignment_9 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1860:1: ( ( rule__CompositeCondition__TypeAssignment_9 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1860:1: ( ( rule__CompositeCondition__TypeAssignment_9 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1861:1: ( rule__CompositeCondition__TypeAssignment_9 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeAssignment_9()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1862:1: ( rule__CompositeCondition__TypeAssignment_9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1862:2: rule__CompositeCondition__TypeAssignment_9
            {
            pushFollow(FollowSets000.FOLLOW_rule__CompositeCondition__TypeAssignment_9_in_rule__CompositeCondition__Group__9__Impl3807);
            rule__CompositeCondition__TypeAssignment_9();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getTypeAssignment_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__Group__9__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1892:1: rule__AttributeValueCondition__Group__0 : rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 ;
    public final void rule__AttributeValueCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1896:1: ( rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1897:2: rule__AttributeValueCondition__Group__0__Impl rule__AttributeValueCondition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__03857);
            rule__AttributeValueCondition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__03860);
            rule__AttributeValueCondition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__0"


    // $ANTLR start "rule__AttributeValueCondition__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1904:1: rule__AttributeValueCondition__Group__0__Impl : ( 'attribute-condition' ) ;
    public final void rule__AttributeValueCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1908:1: ( ( 'attribute-condition' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1909:1: ( 'attribute-condition' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1909:1: ( 'attribute-condition' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1910:1: 'attribute-condition'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__AttributeValueCondition__Group__0__Impl3888); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeConditionKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__0__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1923:1: rule__AttributeValueCondition__Group__1 : rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 ;
    public final void rule__AttributeValueCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1927:1: ( rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1928:2: rule__AttributeValueCondition__Group__1__Impl rule__AttributeValueCondition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__13919);
            rule__AttributeValueCondition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__13922);
            rule__AttributeValueCondition__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__1"


    // $ANTLR start "rule__AttributeValueCondition__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1935:1: rule__AttributeValueCondition__Group__1__Impl : ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) ;
    public final void rule__AttributeValueCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1939:1: ( ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1940:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1940:1: ( ( rule__AttributeValueCondition__ConditionIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1941:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1942:1: ( rule__AttributeValueCondition__ConditionIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1942:2: rule__AttributeValueCondition__ConditionIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl3949);
            rule__AttributeValueCondition__ConditionIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getConditionIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__1__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1952:1: rule__AttributeValueCondition__Group__2 : rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 ;
    public final void rule__AttributeValueCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1956:1: ( rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1957:2: rule__AttributeValueCondition__Group__2__Impl rule__AttributeValueCondition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__23979);
            rule__AttributeValueCondition__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__23982);
            rule__AttributeValueCondition__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__2"


    // $ANTLR start "rule__AttributeValueCondition__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1964:1: rule__AttributeValueCondition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeValueCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1968:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1969:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1969:1: ( ':' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1970:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__AttributeValueCondition__Group__2__Impl4010); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getColonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__2__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1983:1: rule__AttributeValueCondition__Group__3 : rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 ;
    public final void rule__AttributeValueCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1987:1: ( rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1988:2: rule__AttributeValueCondition__Group__3__Impl rule__AttributeValueCondition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__34041);
            rule__AttributeValueCondition__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__34044);
            rule__AttributeValueCondition__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__3"


    // $ANTLR start "rule__AttributeValueCondition__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1995:1: rule__AttributeValueCondition__Group__3__Impl : ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) ;
    public final void rule__AttributeValueCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:1999:1: ( ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2000:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2000:1: ( ( rule__AttributeValueCondition__AttributeAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2001:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2002:1: ( rule__AttributeValueCondition__AttributeAssignment_3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2002:2: rule__AttributeValueCondition__AttributeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl4071);
            rule__AttributeValueCondition__AttributeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__3__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2012:1: rule__AttributeValueCondition__Group__4 : rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 ;
    public final void rule__AttributeValueCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2016:1: ( rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2017:2: rule__AttributeValueCondition__Group__4__Impl rule__AttributeValueCondition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__44101);
            rule__AttributeValueCondition__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__44104);
            rule__AttributeValueCondition__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__4"


    // $ANTLR start "rule__AttributeValueCondition__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2024:1: rule__AttributeValueCondition__Group__4__Impl : ( '==' ) ;
    public final void rule__AttributeValueCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2028:1: ( ( '==' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2029:1: ( '==' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2029:1: ( '==' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2030:1: '=='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__AttributeValueCondition__Group__4__Impl4132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getEqualsSignEqualsSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__4__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2043:1: rule__AttributeValueCondition__Group__5 : rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 ;
    public final void rule__AttributeValueCondition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2047:1: ( rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2048:2: rule__AttributeValueCondition__Group__5__Impl rule__AttributeValueCondition__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__54163);
            rule__AttributeValueCondition__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__54166);
            rule__AttributeValueCondition__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__5"


    // $ANTLR start "rule__AttributeValueCondition__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2055:1: rule__AttributeValueCondition__Group__5__Impl : ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) ;
    public final void rule__AttributeValueCondition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2059:1: ( ( ( rule__AttributeValueCondition__ValueAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2060:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2060:1: ( ( rule__AttributeValueCondition__ValueAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2061:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2062:1: ( rule__AttributeValueCondition__ValueAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2062:2: rule__AttributeValueCondition__ValueAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl4193);
            rule__AttributeValueCondition__ValueAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getValueAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__5__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2072:1: rule__AttributeValueCondition__Group__6 : rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 ;
    public final void rule__AttributeValueCondition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2076:1: ( rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2077:2: rule__AttributeValueCondition__Group__6__Impl rule__AttributeValueCondition__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__64223);
            rule__AttributeValueCondition__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__64226);
            rule__AttributeValueCondition__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__6"


    // $ANTLR start "rule__AttributeValueCondition__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2084:1: rule__AttributeValueCondition__Group__6__Impl : ( '?' ) ;
    public final void rule__AttributeValueCondition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2088:1: ( ( '?' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2089:1: ( '?' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2089:1: ( '?' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2090:1: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__AttributeValueCondition__Group__6__Impl4254); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getQuestionMarkKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__6__Impl"


    // $ANTLR start "rule__AttributeValueCondition__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2103:1: rule__AttributeValueCondition__Group__7 : rule__AttributeValueCondition__Group__7__Impl ;
    public final void rule__AttributeValueCondition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2107:1: ( rule__AttributeValueCondition__Group__7__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2108:2: rule__AttributeValueCondition__Group__7__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__74285);
            rule__AttributeValueCondition__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__7"


    // $ANTLR start "rule__AttributeValueCondition__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2114:1: rule__AttributeValueCondition__Group__7__Impl : ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) ;
    public final void rule__AttributeValueCondition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2118:1: ( ( ( rule__AttributeValueCondition__TypeAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2119:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2119:1: ( ( rule__AttributeValueCondition__TypeAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2120:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2121:1: ( rule__AttributeValueCondition__TypeAssignment_7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2121:2: rule__AttributeValueCondition__TypeAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl4312);
            rule__AttributeValueCondition__TypeAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getTypeAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2147:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2151:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2152:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__04358);
            rule__Table__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1_in_rule__Table__Group__04361);
            rule__Table__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2159:1: rule__Table__Group__0__Impl : ( 'table' ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2163:1: ( ( 'table' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2164:1: ( 'table' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2164:1: ( 'table' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2165:1: 'table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getTableKeyword_0()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Table__Group__0__Impl4389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getTableKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2178:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2182:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2183:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__14420);
            rule__Table__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2_in_rule__Table__Group__14423);
            rule__Table__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2190:1: rule__Table__Group__1__Impl : ( ( rule__Table__ElementIDAssignment_1 ) ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2194:1: ( ( ( rule__Table__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2195:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2195:1: ( ( rule__Table__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2196:1: ( rule__Table__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2197:1: ( rule__Table__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2197:2: rule__Table__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl4450);
            rule__Table__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2207:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2211:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2212:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__24480);
            rule__Table__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3_in_rule__Table__Group__24483);
            rule__Table__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2219:1: rule__Table__Group__2__Impl : ( ( rule__Table__LabelAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2223:1: ( ( ( rule__Table__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2224:1: ( ( rule__Table__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2224:1: ( ( rule__Table__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2225:1: ( rule__Table__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:1: ( rule__Table__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2226:2: rule__Table__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl4510);
            rule__Table__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2236:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2240:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2241:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__34540);
            rule__Table__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4_in_rule__Table__Group__34543);
            rule__Table__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2248:1: rule__Table__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2252:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2253:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2253:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2254:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Table__Group__3__Impl4571); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2267:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2271:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2272:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__44602);
            rule__Table__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5_in_rule__Table__Group__44605);
            rule__Table__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2279:1: rule__Table__Group__4__Impl : ( ( rule__Table__RelationshipAssignment_4 ) ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2283:1: ( ( ( rule__Table__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2284:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2284:1: ( ( rule__Table__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2285:1: ( rule__Table__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2286:1: ( rule__Table__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2286:2: rule__Table__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl4632);
            rule__Table__RelationshipAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRelationshipAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2296:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2300:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2301:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__54662);
            rule__Table__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6_in_rule__Table__Group__54665);
            rule__Table__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2308:1: rule__Table__Group__5__Impl : ( '{' ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2312:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2313:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2313:1: ( '{' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2314:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Table__Group__5__Impl4693); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2327:1: rule__Table__Group__6 : rule__Table__Group__6__Impl rule__Table__Group__7 ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2331:1: ( rule__Table__Group__6__Impl rule__Table__Group__7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2332:2: rule__Table__Group__6__Impl rule__Table__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__64724);
            rule__Table__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7_in_rule__Table__Group__64727);
            rule__Table__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2339:1: rule__Table__Group__6__Impl : ( ( rule__Table__Group_6__0 )* ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2343:1: ( ( ( rule__Table__Group_6__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2344:1: ( ( rule__Table__Group_6__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2344:1: ( ( rule__Table__Group_6__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2345:1: ( rule__Table__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getGroup_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2346:1: ( rule__Table__Group_6__0 )*
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2346:2: rule__Table__Group_6__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl4754);
            	    rule__Table__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group__7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2356:1: rule__Table__Group__7 : rule__Table__Group__7__Impl rule__Table__Group__8 ;
    public final void rule__Table__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2360:1: ( rule__Table__Group__7__Impl rule__Table__Group__8 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2361:2: rule__Table__Group__7__Impl rule__Table__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__74785);
            rule__Table__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__8_in_rule__Table__Group__74788);
            rule__Table__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7"


    // $ANTLR start "rule__Table__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2368:1: rule__Table__Group__7__Impl : ( ( rule__Table__ColumnsAssignment_7 ) ) ;
    public final void rule__Table__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2372:1: ( ( ( rule__Table__ColumnsAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2373:1: ( ( rule__Table__ColumnsAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2373:1: ( ( rule__Table__ColumnsAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2374:1: ( rule__Table__ColumnsAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2375:1: ( rule__Table__ColumnsAssignment_7 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2375:2: rule__Table__ColumnsAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_7_in_rule__Table__Group__7__Impl4815);
            rule__Table__ColumnsAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__7__Impl"


    // $ANTLR start "rule__Table__Group__8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2385:1: rule__Table__Group__8 : rule__Table__Group__8__Impl rule__Table__Group__9 ;
    public final void rule__Table__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2389:1: ( rule__Table__Group__8__Impl rule__Table__Group__9 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2390:2: rule__Table__Group__8__Impl rule__Table__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__8__Impl_in_rule__Table__Group__84845);
            rule__Table__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__9_in_rule__Table__Group__84848);
            rule__Table__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8"


    // $ANTLR start "rule__Table__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2397:1: rule__Table__Group__8__Impl : ( '}' ) ;
    public final void rule__Table__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2401:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2402:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2402:1: ( '}' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2403:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Table__Group__8__Impl4876); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__8__Impl"


    // $ANTLR start "rule__Table__Group__9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2416:1: rule__Table__Group__9 : rule__Table__Group__9__Impl rule__Table__Group__10 ;
    public final void rule__Table__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2420:1: ( rule__Table__Group__9__Impl rule__Table__Group__10 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2421:2: rule__Table__Group__9__Impl rule__Table__Group__10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__9__Impl_in_rule__Table__Group__94907);
            rule__Table__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__10_in_rule__Table__Group__94910);
            rule__Table__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9"


    // $ANTLR start "rule__Table__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2428:1: rule__Table__Group__9__Impl : ( 'edits' ) ;
    public final void rule__Table__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2432:1: ( ( 'edits' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2433:1: ( 'edits' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2433:1: ( 'edits' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2434:1: 'edits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getEditsKeyword_9()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Table__Group__9__Impl4938); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getEditsKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__9__Impl"


    // $ANTLR start "rule__Table__Group__10"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2447:1: rule__Table__Group__10 : rule__Table__Group__10__Impl ;
    public final void rule__Table__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2451:1: ( rule__Table__Group__10__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2452:2: rule__Table__Group__10__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group__10__Impl_in_rule__Table__Group__104969);
            rule__Table__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10"


    // $ANTLR start "rule__Table__Group__10__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2458:1: rule__Table__Group__10__Impl : ( ( rule__Table__EditingFormAssignment_10 ) ) ;
    public final void rule__Table__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2462:1: ( ( ( rule__Table__EditingFormAssignment_10 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2463:1: ( ( rule__Table__EditingFormAssignment_10 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2463:1: ( ( rule__Table__EditingFormAssignment_10 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2464:1: ( rule__Table__EditingFormAssignment_10 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getEditingFormAssignment_10()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2465:1: ( rule__Table__EditingFormAssignment_10 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2465:2: rule__Table__EditingFormAssignment_10
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__EditingFormAssignment_10_in_rule__Table__Group__10__Impl4996);
            rule__Table__EditingFormAssignment_10();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getEditingFormAssignment_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__10__Impl"


    // $ANTLR start "rule__Table__Group_6__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2497:1: rule__Table__Group_6__0 : rule__Table__Group_6__0__Impl rule__Table__Group_6__1 ;
    public final void rule__Table__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2501:1: ( rule__Table__Group_6__0__Impl rule__Table__Group_6__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2502:2: rule__Table__Group_6__0__Impl rule__Table__Group_6__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__05048);
            rule__Table__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__05051);
            rule__Table__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0"


    // $ANTLR start "rule__Table__Group_6__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2509:1: rule__Table__Group_6__0__Impl : ( ( rule__Table__ColumnsAssignment_6_0 ) ) ;
    public final void rule__Table__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2513:1: ( ( ( rule__Table__ColumnsAssignment_6_0 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2514:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2514:1: ( ( rule__Table__ColumnsAssignment_6_0 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2515:1: ( rule__Table__ColumnsAssignment_6_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsAssignment_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2516:1: ( rule__Table__ColumnsAssignment_6_0 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2516:2: rule__Table__ColumnsAssignment_6_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl5078);
            rule__Table__ColumnsAssignment_6_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsAssignment_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__0__Impl"


    // $ANTLR start "rule__Table__Group_6__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2526:1: rule__Table__Group_6__1 : rule__Table__Group_6__1__Impl ;
    public final void rule__Table__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2530:1: ( rule__Table__Group_6__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2531:2: rule__Table__Group_6__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__15108);
            rule__Table__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1"


    // $ANTLR start "rule__Table__Group_6__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2537:1: rule__Table__Group_6__1__Impl : ( ',' ) ;
    public final void rule__Table__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2541:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2542:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2542:1: ( ',' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2543:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getCommaKeyword_6_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Table__Group_6__1__Impl5136); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getCommaKeyword_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group_6__1__Impl"


    // $ANTLR start "rule__List__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2560:1: rule__List__Group__0 : rule__List__Group__0__Impl rule__List__Group__1 ;
    public final void rule__List__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2564:1: ( rule__List__Group__0__Impl rule__List__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2565:2: rule__List__Group__0__Impl rule__List__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__05171);
            rule__List__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1_in_rule__List__Group__05174);
            rule__List__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0"


    // $ANTLR start "rule__List__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2572:1: rule__List__Group__0__Impl : ( 'list' ) ;
    public final void rule__List__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2576:1: ( ( 'list' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2577:1: ( 'list' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2577:1: ( 'list' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2578:1: 'list'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getListKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__List__Group__0__Impl5202); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getListKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__0__Impl"


    // $ANTLR start "rule__List__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2591:1: rule__List__Group__1 : rule__List__Group__1__Impl rule__List__Group__2 ;
    public final void rule__List__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2595:1: ( rule__List__Group__1__Impl rule__List__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2596:2: rule__List__Group__1__Impl rule__List__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__15233);
            rule__List__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2_in_rule__List__Group__15236);
            rule__List__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1"


    // $ANTLR start "rule__List__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2603:1: rule__List__Group__1__Impl : ( ( rule__List__ElementIDAssignment_1 ) ) ;
    public final void rule__List__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2607:1: ( ( ( rule__List__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2608:1: ( ( rule__List__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2608:1: ( ( rule__List__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2609:1: ( rule__List__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2610:1: ( rule__List__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2610:2: rule__List__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl5263);
            rule__List__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__1__Impl"


    // $ANTLR start "rule__List__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2620:1: rule__List__Group__2 : rule__List__Group__2__Impl rule__List__Group__3 ;
    public final void rule__List__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2624:1: ( rule__List__Group__2__Impl rule__List__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2625:2: rule__List__Group__2__Impl rule__List__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__25293);
            rule__List__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3_in_rule__List__Group__25296);
            rule__List__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2"


    // $ANTLR start "rule__List__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2632:1: rule__List__Group__2__Impl : ( ( rule__List__LabelAssignment_2 ) ) ;
    public final void rule__List__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2636:1: ( ( ( rule__List__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2637:1: ( ( rule__List__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2637:1: ( ( rule__List__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2638:1: ( rule__List__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2639:1: ( rule__List__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2639:2: rule__List__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl5323);
            rule__List__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__2__Impl"


    // $ANTLR start "rule__List__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2649:1: rule__List__Group__3 : rule__List__Group__3__Impl rule__List__Group__4 ;
    public final void rule__List__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2653:1: ( rule__List__Group__3__Impl rule__List__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2654:2: rule__List__Group__3__Impl rule__List__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__35353);
            rule__List__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4_in_rule__List__Group__35356);
            rule__List__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3"


    // $ANTLR start "rule__List__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2661:1: rule__List__Group__3__Impl : ( 'handles' ) ;
    public final void rule__List__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2665:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2666:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2666:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2667:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__List__Group__3__Impl5384); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__3__Impl"


    // $ANTLR start "rule__List__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2680:1: rule__List__Group__4 : rule__List__Group__4__Impl rule__List__Group__5 ;
    public final void rule__List__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2684:1: ( rule__List__Group__4__Impl rule__List__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2685:2: rule__List__Group__4__Impl rule__List__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__45415);
            rule__List__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__5_in_rule__List__Group__45418);
            rule__List__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__4"


    // $ANTLR start "rule__List__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2692:1: rule__List__Group__4__Impl : ( ( rule__List__RelationshipAssignment_4 ) ) ;
    public final void rule__List__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2696:1: ( ( ( rule__List__RelationshipAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2697:1: ( ( rule__List__RelationshipAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2697:1: ( ( rule__List__RelationshipAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2698:1: ( rule__List__RelationshipAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2699:1: ( rule__List__RelationshipAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2699:2: rule__List__RelationshipAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl5445);
            rule__List__RelationshipAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRelationshipAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__4__Impl"


    // $ANTLR start "rule__List__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2709:1: rule__List__Group__5 : rule__List__Group__5__Impl rule__List__Group__6 ;
    public final void rule__List__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2713:1: ( rule__List__Group__5__Impl rule__List__Group__6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2714:2: rule__List__Group__5__Impl rule__List__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__5__Impl_in_rule__List__Group__55475);
            rule__List__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__6_in_rule__List__Group__55478);
            rule__List__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__5"


    // $ANTLR start "rule__List__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2721:1: rule__List__Group__5__Impl : ( 'edits' ) ;
    public final void rule__List__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2725:1: ( ( 'edits' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2726:1: ( 'edits' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2726:1: ( 'edits' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2727:1: 'edits'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getEditsKeyword_5()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__List__Group__5__Impl5506); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getEditsKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__5__Impl"


    // $ANTLR start "rule__List__Group__6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2740:1: rule__List__Group__6 : rule__List__Group__6__Impl ;
    public final void rule__List__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2744:1: ( rule__List__Group__6__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2745:2: rule__List__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__Group__6__Impl_in_rule__List__Group__65537);
            rule__List__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__6"


    // $ANTLR start "rule__List__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2751:1: rule__List__Group__6__Impl : ( ( rule__List__EditingFormAssignment_6 ) ) ;
    public final void rule__List__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2755:1: ( ( ( rule__List__EditingFormAssignment_6 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2756:1: ( ( rule__List__EditingFormAssignment_6 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2756:1: ( ( rule__List__EditingFormAssignment_6 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2757:1: ( rule__List__EditingFormAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getEditingFormAssignment_6()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2758:1: ( rule__List__EditingFormAssignment_6 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2758:2: rule__List__EditingFormAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__List__EditingFormAssignment_6_in_rule__List__Group__6__Impl5564);
            rule__List__EditingFormAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getEditingFormAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__Group__6__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2782:1: rule__TimeSelectionField__Group__0 : rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 ;
    public final void rule__TimeSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2786:1: ( rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2787:2: rule__TimeSelectionField__Group__0__Impl rule__TimeSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05608);
            rule__TimeSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05611);
            rule__TimeSelectionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__0"


    // $ANTLR start "rule__TimeSelectionField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2794:1: rule__TimeSelectionField__Group__0__Impl : ( 'time-selection-field' ) ;
    public final void rule__TimeSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2798:1: ( ( 'time-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2799:1: ( 'time-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2799:1: ( 'time-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2800:1: 'time-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__TimeSelectionField__Group__0__Impl5639); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getTimeSelectionFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__0__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2813:1: rule__TimeSelectionField__Group__1 : rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 ;
    public final void rule__TimeSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2817:1: ( rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2818:2: rule__TimeSelectionField__Group__1__Impl rule__TimeSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15670);
            rule__TimeSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15673);
            rule__TimeSelectionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__1"


    // $ANTLR start "rule__TimeSelectionField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2825:1: rule__TimeSelectionField__Group__1__Impl : ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__TimeSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2829:1: ( ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2830:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2830:1: ( ( rule__TimeSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2831:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2832:1: ( rule__TimeSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2832:2: rule__TimeSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5700);
            rule__TimeSelectionField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__1__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2842:1: rule__TimeSelectionField__Group__2 : rule__TimeSelectionField__Group__2__Impl rule__TimeSelectionField__Group__3 ;
    public final void rule__TimeSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2846:1: ( rule__TimeSelectionField__Group__2__Impl rule__TimeSelectionField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2847:2: rule__TimeSelectionField__Group__2__Impl rule__TimeSelectionField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25730);
            rule__TimeSelectionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__3_in_rule__TimeSelectionField__Group__25733);
            rule__TimeSelectionField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__2"


    // $ANTLR start "rule__TimeSelectionField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2854:1: rule__TimeSelectionField__Group__2__Impl : ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__TimeSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2858:1: ( ( ( rule__TimeSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2859:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2859:1: ( ( rule__TimeSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2860:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2861:1: ( rule__TimeSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2861:2: rule__TimeSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5760);
            rule__TimeSelectionField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__2__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2871:1: rule__TimeSelectionField__Group__3 : rule__TimeSelectionField__Group__3__Impl rule__TimeSelectionField__Group__4 ;
    public final void rule__TimeSelectionField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2875:1: ( rule__TimeSelectionField__Group__3__Impl rule__TimeSelectionField__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2876:2: rule__TimeSelectionField__Group__3__Impl rule__TimeSelectionField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__3__Impl_in_rule__TimeSelectionField__Group__35790);
            rule__TimeSelectionField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__4_in_rule__TimeSelectionField__Group__35793);
            rule__TimeSelectionField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__3"


    // $ANTLR start "rule__TimeSelectionField__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2883:1: rule__TimeSelectionField__Group__3__Impl : ( 'handles' ) ;
    public final void rule__TimeSelectionField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2887:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2888:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2888:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2889:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TimeSelectionField__Group__3__Impl5821); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__3__Impl"


    // $ANTLR start "rule__TimeSelectionField__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2902:1: rule__TimeSelectionField__Group__4 : rule__TimeSelectionField__Group__4__Impl ;
    public final void rule__TimeSelectionField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2906:1: ( rule__TimeSelectionField__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2907:2: rule__TimeSelectionField__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__Group__4__Impl_in_rule__TimeSelectionField__Group__45852);
            rule__TimeSelectionField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__4"


    // $ANTLR start "rule__TimeSelectionField__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2913:1: rule__TimeSelectionField__Group__4__Impl : ( ( rule__TimeSelectionField__AttributeAssignment_4 ) ) ;
    public final void rule__TimeSelectionField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2917:1: ( ( ( rule__TimeSelectionField__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2918:1: ( ( rule__TimeSelectionField__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2918:1: ( ( rule__TimeSelectionField__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2919:1: ( rule__TimeSelectionField__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2920:1: ( rule__TimeSelectionField__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2920:2: rule__TimeSelectionField__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TimeSelectionField__AttributeAssignment_4_in_rule__TimeSelectionField__Group__4__Impl5879);
            rule__TimeSelectionField__AttributeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getAttributeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__Group__4__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2940:1: rule__DateSelectionField__Group__0 : rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 ;
    public final void rule__DateSelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2944:1: ( rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2945:2: rule__DateSelectionField__Group__0__Impl rule__DateSelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05919);
            rule__DateSelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05922);
            rule__DateSelectionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__0"


    // $ANTLR start "rule__DateSelectionField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2952:1: rule__DateSelectionField__Group__0__Impl : ( 'date-selection-field' ) ;
    public final void rule__DateSelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2956:1: ( ( 'date-selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2957:1: ( 'date-selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2957:1: ( 'date-selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2958:1: 'date-selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__DateSelectionField__Group__0__Impl5950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getDateSelectionFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__0__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2971:1: rule__DateSelectionField__Group__1 : rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 ;
    public final void rule__DateSelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2975:1: ( rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2976:2: rule__DateSelectionField__Group__1__Impl rule__DateSelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15981);
            rule__DateSelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15984);
            rule__DateSelectionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__1"


    // $ANTLR start "rule__DateSelectionField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2983:1: rule__DateSelectionField__Group__1__Impl : ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__DateSelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2987:1: ( ( ( rule__DateSelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2988:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2988:1: ( ( rule__DateSelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2989:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2990:1: ( rule__DateSelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:2990:2: rule__DateSelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl6011);
            rule__DateSelectionField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__1__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3000:1: rule__DateSelectionField__Group__2 : rule__DateSelectionField__Group__2__Impl rule__DateSelectionField__Group__3 ;
    public final void rule__DateSelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3004:1: ( rule__DateSelectionField__Group__2__Impl rule__DateSelectionField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3005:2: rule__DateSelectionField__Group__2__Impl rule__DateSelectionField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__26041);
            rule__DateSelectionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__3_in_rule__DateSelectionField__Group__26044);
            rule__DateSelectionField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__2"


    // $ANTLR start "rule__DateSelectionField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3012:1: rule__DateSelectionField__Group__2__Impl : ( ( rule__DateSelectionField__LabelAssignment_2 ) ) ;
    public final void rule__DateSelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3016:1: ( ( ( rule__DateSelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3017:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3017:1: ( ( rule__DateSelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3018:1: ( rule__DateSelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3019:1: ( rule__DateSelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3019:2: rule__DateSelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl6071);
            rule__DateSelectionField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__2__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3029:1: rule__DateSelectionField__Group__3 : rule__DateSelectionField__Group__3__Impl rule__DateSelectionField__Group__4 ;
    public final void rule__DateSelectionField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3033:1: ( rule__DateSelectionField__Group__3__Impl rule__DateSelectionField__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3034:2: rule__DateSelectionField__Group__3__Impl rule__DateSelectionField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__3__Impl_in_rule__DateSelectionField__Group__36101);
            rule__DateSelectionField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__4_in_rule__DateSelectionField__Group__36104);
            rule__DateSelectionField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__3"


    // $ANTLR start "rule__DateSelectionField__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3041:1: rule__DateSelectionField__Group__3__Impl : ( 'handles' ) ;
    public final void rule__DateSelectionField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3045:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3046:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3046:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3047:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__DateSelectionField__Group__3__Impl6132); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__3__Impl"


    // $ANTLR start "rule__DateSelectionField__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3060:1: rule__DateSelectionField__Group__4 : rule__DateSelectionField__Group__4__Impl ;
    public final void rule__DateSelectionField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3064:1: ( rule__DateSelectionField__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3065:2: rule__DateSelectionField__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__Group__4__Impl_in_rule__DateSelectionField__Group__46163);
            rule__DateSelectionField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__4"


    // $ANTLR start "rule__DateSelectionField__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3071:1: rule__DateSelectionField__Group__4__Impl : ( ( rule__DateSelectionField__AttributeAssignment_4 ) ) ;
    public final void rule__DateSelectionField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3075:1: ( ( ( rule__DateSelectionField__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3076:1: ( ( rule__DateSelectionField__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3076:1: ( ( rule__DateSelectionField__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3077:1: ( rule__DateSelectionField__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3078:1: ( rule__DateSelectionField__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3078:2: rule__DateSelectionField__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__DateSelectionField__AttributeAssignment_4_in_rule__DateSelectionField__Group__4__Impl6190);
            rule__DateSelectionField__AttributeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getAttributeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3098:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3102:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3103:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__06230);
            rule__Column__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1_in_rule__Column__Group__06233);
            rule__Column__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3110:1: rule__Column__Group__0__Impl : ( 'column' ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3114:1: ( ( 'column' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3115:1: ( 'column' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3115:1: ( 'column' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3116:1: 'column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            }
            match(input,37,FollowSets000.FOLLOW_37_in_rule__Column__Group__0__Impl6261); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getColumnKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3129:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3133:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3134:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__16292);
            rule__Column__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2_in_rule__Column__Group__16295);
            rule__Column__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3141:1: rule__Column__Group__1__Impl : ( ( rule__Column__ElementIDAssignment_1 ) ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3145:1: ( ( ( rule__Column__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3146:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3146:1: ( ( rule__Column__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3147:1: ( rule__Column__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3148:1: ( rule__Column__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3148:2: rule__Column__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl6322);
            rule__Column__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3158:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3162:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3163:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__26352);
            rule__Column__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3_in_rule__Column__Group__26355);
            rule__Column__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3170:1: rule__Column__Group__2__Impl : ( ( rule__Column__LabelAssignment_2 ) ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3174:1: ( ( ( rule__Column__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3175:1: ( ( rule__Column__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3175:1: ( ( rule__Column__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3176:1: ( rule__Column__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3177:1: ( rule__Column__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3177:2: rule__Column__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl6382);
            rule__Column__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3187:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3191:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3192:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__36412);
            rule__Column__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4_in_rule__Column__Group__36415);
            rule__Column__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3199:1: rule__Column__Group__3__Impl : ( 'handles' ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3203:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3204:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3204:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3205:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Column__Group__3__Impl6443); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3218:1: rule__Column__Group__4 : rule__Column__Group__4__Impl ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3222:1: ( rule__Column__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3223:2: rule__Column__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__46474);
            rule__Column__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3229:1: rule__Column__Group__4__Impl : ( ( rule__Column__AttributeAssignment_4 ) ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3233:1: ( ( ( rule__Column__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3234:1: ( ( rule__Column__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3234:1: ( ( rule__Column__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3235:1: ( rule__Column__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3236:1: ( rule__Column__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3236:2: rule__Column__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl6501);
            rule__Column__AttributeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getAttributeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__SelectionField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3256:1: rule__SelectionField__Group__0 : rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 ;
    public final void rule__SelectionField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3260:1: ( rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3261:2: rule__SelectionField__Group__0__Impl rule__SelectionField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__06541);
            rule__SelectionField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__06544);
            rule__SelectionField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__0"


    // $ANTLR start "rule__SelectionField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3268:1: rule__SelectionField__Group__0__Impl : ( 'selection-field' ) ;
    public final void rule__SelectionField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3272:1: ( ( 'selection-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3273:1: ( 'selection-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3273:1: ( 'selection-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3274:1: 'selection-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0()); 
            }
            match(input,38,FollowSets000.FOLLOW_38_in_rule__SelectionField__Group__0__Impl6572); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getSelectionFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__0__Impl"


    // $ANTLR start "rule__SelectionField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3287:1: rule__SelectionField__Group__1 : rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 ;
    public final void rule__SelectionField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3291:1: ( rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3292:2: rule__SelectionField__Group__1__Impl rule__SelectionField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__16603);
            rule__SelectionField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__16606);
            rule__SelectionField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__1"


    // $ANTLR start "rule__SelectionField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3299:1: rule__SelectionField__Group__1__Impl : ( ( rule__SelectionField__ElementIDAssignment_1 ) ) ;
    public final void rule__SelectionField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3303:1: ( ( ( rule__SelectionField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3304:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3304:1: ( ( rule__SelectionField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3305:1: ( rule__SelectionField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3306:1: ( rule__SelectionField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3306:2: rule__SelectionField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl6633);
            rule__SelectionField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__1__Impl"


    // $ANTLR start "rule__SelectionField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3316:1: rule__SelectionField__Group__2 : rule__SelectionField__Group__2__Impl rule__SelectionField__Group__3 ;
    public final void rule__SelectionField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3320:1: ( rule__SelectionField__Group__2__Impl rule__SelectionField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3321:2: rule__SelectionField__Group__2__Impl rule__SelectionField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__26663);
            rule__SelectionField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__3_in_rule__SelectionField__Group__26666);
            rule__SelectionField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__2"


    // $ANTLR start "rule__SelectionField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3328:1: rule__SelectionField__Group__2__Impl : ( ( rule__SelectionField__LabelAssignment_2 ) ) ;
    public final void rule__SelectionField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3332:1: ( ( ( rule__SelectionField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3333:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3333:1: ( ( rule__SelectionField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3334:1: ( rule__SelectionField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3335:1: ( rule__SelectionField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3335:2: rule__SelectionField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl6693);
            rule__SelectionField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__2__Impl"


    // $ANTLR start "rule__SelectionField__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3345:1: rule__SelectionField__Group__3 : rule__SelectionField__Group__3__Impl rule__SelectionField__Group__4 ;
    public final void rule__SelectionField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3349:1: ( rule__SelectionField__Group__3__Impl rule__SelectionField__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3350:2: rule__SelectionField__Group__3__Impl rule__SelectionField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__3__Impl_in_rule__SelectionField__Group__36723);
            rule__SelectionField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__4_in_rule__SelectionField__Group__36726);
            rule__SelectionField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__3"


    // $ANTLR start "rule__SelectionField__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3357:1: rule__SelectionField__Group__3__Impl : ( 'handles' ) ;
    public final void rule__SelectionField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3361:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3362:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3362:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3363:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__SelectionField__Group__3__Impl6754); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__3__Impl"


    // $ANTLR start "rule__SelectionField__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3376:1: rule__SelectionField__Group__4 : rule__SelectionField__Group__4__Impl ;
    public final void rule__SelectionField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3380:1: ( rule__SelectionField__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3381:2: rule__SelectionField__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__Group__4__Impl_in_rule__SelectionField__Group__46785);
            rule__SelectionField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__4"


    // $ANTLR start "rule__SelectionField__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3387:1: rule__SelectionField__Group__4__Impl : ( ( rule__SelectionField__AttributeAssignment_4 ) ) ;
    public final void rule__SelectionField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3391:1: ( ( ( rule__SelectionField__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3392:1: ( ( rule__SelectionField__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3392:1: ( ( rule__SelectionField__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3393:1: ( rule__SelectionField__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3394:1: ( rule__SelectionField__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3394:2: rule__SelectionField__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__SelectionField__AttributeAssignment_4_in_rule__SelectionField__Group__4__Impl6812);
            rule__SelectionField__AttributeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getAttributeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__Group__4__Impl"


    // $ANTLR start "rule__TextArea__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3414:1: rule__TextArea__Group__0 : rule__TextArea__Group__0__Impl rule__TextArea__Group__1 ;
    public final void rule__TextArea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3418:1: ( rule__TextArea__Group__0__Impl rule__TextArea__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3419:2: rule__TextArea__Group__0__Impl rule__TextArea__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__06852);
            rule__TextArea__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__06855);
            rule__TextArea__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__0"


    // $ANTLR start "rule__TextArea__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3426:1: rule__TextArea__Group__0__Impl : ( 'text-area' ) ;
    public final void rule__TextArea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3430:1: ( ( 'text-area' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3431:1: ( 'text-area' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3431:1: ( 'text-area' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3432:1: 'text-area'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            }
            match(input,39,FollowSets000.FOLLOW_39_in_rule__TextArea__Group__0__Impl6883); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__0__Impl"


    // $ANTLR start "rule__TextArea__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3445:1: rule__TextArea__Group__1 : rule__TextArea__Group__1__Impl rule__TextArea__Group__2 ;
    public final void rule__TextArea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3449:1: ( rule__TextArea__Group__1__Impl rule__TextArea__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3450:2: rule__TextArea__Group__1__Impl rule__TextArea__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__16914);
            rule__TextArea__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__16917);
            rule__TextArea__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__1"


    // $ANTLR start "rule__TextArea__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3457:1: rule__TextArea__Group__1__Impl : ( ( rule__TextArea__ElementIDAssignment_1 ) ) ;
    public final void rule__TextArea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3461:1: ( ( ( rule__TextArea__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3462:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3462:1: ( ( rule__TextArea__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3463:1: ( rule__TextArea__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3464:1: ( rule__TextArea__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3464:2: rule__TextArea__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl6944);
            rule__TextArea__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__1__Impl"


    // $ANTLR start "rule__TextArea__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3474:1: rule__TextArea__Group__2 : rule__TextArea__Group__2__Impl rule__TextArea__Group__3 ;
    public final void rule__TextArea__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3478:1: ( rule__TextArea__Group__2__Impl rule__TextArea__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3479:2: rule__TextArea__Group__2__Impl rule__TextArea__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__26974);
            rule__TextArea__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__3_in_rule__TextArea__Group__26977);
            rule__TextArea__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__2"


    // $ANTLR start "rule__TextArea__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3486:1: rule__TextArea__Group__2__Impl : ( ( rule__TextArea__LabelAssignment_2 ) ) ;
    public final void rule__TextArea__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3490:1: ( ( ( rule__TextArea__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3491:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3491:1: ( ( rule__TextArea__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3492:1: ( rule__TextArea__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3493:1: ( rule__TextArea__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3493:2: rule__TextArea__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl7004);
            rule__TextArea__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__2__Impl"


    // $ANTLR start "rule__TextArea__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3503:1: rule__TextArea__Group__3 : rule__TextArea__Group__3__Impl rule__TextArea__Group__4 ;
    public final void rule__TextArea__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3507:1: ( rule__TextArea__Group__3__Impl rule__TextArea__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3508:2: rule__TextArea__Group__3__Impl rule__TextArea__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__3__Impl_in_rule__TextArea__Group__37034);
            rule__TextArea__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__4_in_rule__TextArea__Group__37037);
            rule__TextArea__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__3"


    // $ANTLR start "rule__TextArea__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3515:1: rule__TextArea__Group__3__Impl : ( 'handles' ) ;
    public final void rule__TextArea__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3519:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3520:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3520:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3521:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getHandlesKeyword_3()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextArea__Group__3__Impl7065); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getHandlesKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__3__Impl"


    // $ANTLR start "rule__TextArea__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3534:1: rule__TextArea__Group__4 : rule__TextArea__Group__4__Impl ;
    public final void rule__TextArea__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3538:1: ( rule__TextArea__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3539:2: rule__TextArea__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__Group__4__Impl_in_rule__TextArea__Group__47096);
            rule__TextArea__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__4"


    // $ANTLR start "rule__TextArea__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3545:1: rule__TextArea__Group__4__Impl : ( ( rule__TextArea__AttributeAssignment_4 ) ) ;
    public final void rule__TextArea__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3549:1: ( ( ( rule__TextArea__AttributeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3550:1: ( ( rule__TextArea__AttributeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3550:1: ( ( rule__TextArea__AttributeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3551:1: ( rule__TextArea__AttributeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getAttributeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3552:1: ( rule__TextArea__AttributeAssignment_4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3552:2: rule__TextArea__AttributeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextArea__AttributeAssignment_4_in_rule__TextArea__Group__4__Impl7123);
            rule__TextArea__AttributeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getAttributeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__4__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3572:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3576:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3577:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__07163);
            rule__TextField__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__07166);
            rule__TextField__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3584:1: rule__TextField__Group__0__Impl : ( 'text-field' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3588:1: ( ( 'text-field' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3589:1: ( 'text-field' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3589:1: ( 'text-field' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3590:1: 'text-field'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            }
            match(input,40,FollowSets000.FOLLOW_40_in_rule__TextField__Group__0__Impl7194); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3603:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl rule__TextField__Group__2 ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3607:1: ( rule__TextField__Group__1__Impl rule__TextField__Group__2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3608:2: rule__TextField__Group__1__Impl rule__TextField__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__17225);
            rule__TextField__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__17228);
            rule__TextField__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3615:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__ElementIDAssignment_1 ) ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3619:1: ( ( ( rule__TextField__ElementIDAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3620:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3620:1: ( ( rule__TextField__ElementIDAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3621:1: ( rule__TextField__ElementIDAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3622:1: ( rule__TextField__ElementIDAssignment_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3622:2: rule__TextField__ElementIDAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl7255);
            rule__TextField__ElementIDAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getElementIDAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3632:1: rule__TextField__Group__2 : rule__TextField__Group__2__Impl rule__TextField__Group__3 ;
    public final void rule__TextField__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3636:1: ( rule__TextField__Group__2__Impl rule__TextField__Group__3 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3637:2: rule__TextField__Group__2__Impl rule__TextField__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__27285);
            rule__TextField__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__27288);
            rule__TextField__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2"


    // $ANTLR start "rule__TextField__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3644:1: rule__TextField__Group__2__Impl : ( ( rule__TextField__LabelAssignment_2 ) ) ;
    public final void rule__TextField__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3648:1: ( ( ( rule__TextField__LabelAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3649:1: ( ( rule__TextField__LabelAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3649:1: ( ( rule__TextField__LabelAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3650:1: ( rule__TextField__LabelAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3651:1: ( rule__TextField__LabelAssignment_2 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3651:2: rule__TextField__LabelAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl7315);
            rule__TextField__LabelAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getLabelAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__2__Impl"


    // $ANTLR start "rule__TextField__Group__3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3661:1: rule__TextField__Group__3 : rule__TextField__Group__3__Impl rule__TextField__Group__4 ;
    public final void rule__TextField__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3665:1: ( rule__TextField__Group__3__Impl rule__TextField__Group__4 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3666:2: rule__TextField__Group__3__Impl rule__TextField__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__37345);
            rule__TextField__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__4_in_rule__TextField__Group__37348);
            rule__TextField__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__3"


    // $ANTLR start "rule__TextField__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3673:1: rule__TextField__Group__3__Impl : ( ( rule__TextField__Group_3__0 )? ) ;
    public final void rule__TextField__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3677:1: ( ( ( rule__TextField__Group_3__0 )? ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3678:1: ( ( rule__TextField__Group_3__0 )? )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3678:1: ( ( rule__TextField__Group_3__0 )? )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3679:1: ( rule__TextField__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3680:1: ( rule__TextField__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==41) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3680:2: rule__TextField__Group_3__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl7375);
                    rule__TextField__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__3__Impl"


    // $ANTLR start "rule__TextField__Group__4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3690:1: rule__TextField__Group__4 : rule__TextField__Group__4__Impl rule__TextField__Group__5 ;
    public final void rule__TextField__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3694:1: ( rule__TextField__Group__4__Impl rule__TextField__Group__5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3695:2: rule__TextField__Group__4__Impl rule__TextField__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__4__Impl_in_rule__TextField__Group__47406);
            rule__TextField__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__5_in_rule__TextField__Group__47409);
            rule__TextField__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__4"


    // $ANTLR start "rule__TextField__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3702:1: rule__TextField__Group__4__Impl : ( 'handles' ) ;
    public final void rule__TextField__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3706:1: ( ( 'handles' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3707:1: ( 'handles' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3707:1: ( 'handles' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3708:1: 'handles'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getHandlesKeyword_4()); 
            }
            match(input,19,FollowSets000.FOLLOW_19_in_rule__TextField__Group__4__Impl7437); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getHandlesKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__4__Impl"


    // $ANTLR start "rule__TextField__Group__5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3721:1: rule__TextField__Group__5 : rule__TextField__Group__5__Impl ;
    public final void rule__TextField__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3725:1: ( rule__TextField__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3726:2: rule__TextField__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group__5__Impl_in_rule__TextField__Group__57468);
            rule__TextField__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__5"


    // $ANTLR start "rule__TextField__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3732:1: rule__TextField__Group__5__Impl : ( ( rule__TextField__AttributeAssignment_5 ) ) ;
    public final void rule__TextField__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3736:1: ( ( ( rule__TextField__AttributeAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3737:1: ( ( rule__TextField__AttributeAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3737:1: ( ( rule__TextField__AttributeAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3738:1: ( rule__TextField__AttributeAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getAttributeAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3739:1: ( rule__TextField__AttributeAssignment_5 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3739:2: rule__TextField__AttributeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__AttributeAssignment_5_in_rule__TextField__Group__5__Impl7495);
            rule__TextField__AttributeAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getAttributeAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__5__Impl"


    // $ANTLR start "rule__TextField__Group_3__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3761:1: rule__TextField__Group_3__0 : rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 ;
    public final void rule__TextField__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3765:1: ( rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3766:2: rule__TextField__Group_3__0__Impl rule__TextField__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__07537);
            rule__TextField__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__07540);
            rule__TextField__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__0"


    // $ANTLR start "rule__TextField__Group_3__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3773:1: rule__TextField__Group_3__0__Impl : ( 'format' ) ;
    public final void rule__TextField__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3777:1: ( ( 'format' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3778:1: ( 'format' )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3778:1: ( 'format' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3779:1: 'format'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatKeyword_3_0()); 
            }
            match(input,41,FollowSets000.FOLLOW_41_in_rule__TextField__Group_3__0__Impl7568); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getFormatKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__0__Impl"


    // $ANTLR start "rule__TextField__Group_3__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3792:1: rule__TextField__Group_3__1 : rule__TextField__Group_3__1__Impl ;
    public final void rule__TextField__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3796:1: ( rule__TextField__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3797:2: rule__TextField__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__17599);
            rule__TextField__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__1"


    // $ANTLR start "rule__TextField__Group_3__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3803:1: rule__TextField__Group_3__1__Impl : ( ( rule__TextField__FormatAssignment_3_1 ) ) ;
    public final void rule__TextField__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3807:1: ( ( ( rule__TextField__FormatAssignment_3_1 ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3808:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3808:1: ( ( rule__TextField__FormatAssignment_3_1 ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3809:1: ( rule__TextField__FormatAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3810:1: ( rule__TextField__FormatAssignment_3_1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3810:2: rule__TextField__FormatAssignment_3_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl7626);
            rule__TextField__FormatAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getFormatAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group_3__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3825:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3829:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3830:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07661);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07664);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3837:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3841:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3842:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3842:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3843:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7691); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3854:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3858:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3859:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17720);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3865:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3869:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3870:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3870:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3871:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3872:1: ( rule__QualifiedName__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==42) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3872:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7747);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3886:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3890:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3891:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07782);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07785);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3898:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3902:1: ( ( ( '.' ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3903:1: ( ( '.' ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3903:1: ( ( '.' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3904:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3905:1: ( '.' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3906:2: '.'
            {
            match(input,42,FollowSets000.FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl7814); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3917:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3921:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3922:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17846);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3928:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3932:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3933:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3933:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3934:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7873); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__FormModel__FormsAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3950:1: rule__FormModel__FormsAssignment_1 : ( ruleForm ) ;
    public final void rule__FormModel__FormsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3954:1: ( ( ruleForm ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3955:1: ( ruleForm )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3955:1: ( ruleForm )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3956:1: ruleForm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment_17911);
            ruleForm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormModelAccess().getFormsFormParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FormModel__FormsAssignment_1"


    // $ANTLR start "rule__Form__WelcomeFormAssignment_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3965:1: rule__Form__WelcomeFormAssignment_0 : ( ( 'welcome' ) ) ;
    public final void rule__Form__WelcomeFormAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3969:1: ( ( ( 'welcome' ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3970:1: ( ( 'welcome' ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3970:1: ( ( 'welcome' ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3971:1: ( 'welcome' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3972:1: ( 'welcome' )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3973:1: 'welcome'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }
            match(input,43,FollowSets000.FOLLOW_43_in_rule__Form__WelcomeFormAssignment_07947); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getWelcomeFormWelcomeKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__WelcomeFormAssignment_0"


    // $ANTLR start "rule__Form__NameAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3988:1: rule__Form__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Form__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3992:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3993:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3993:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:3994:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Form__NameAssignment_27986); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__NameAssignment_2"


    // $ANTLR start "rule__Form__TitleAssignment_3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4003:1: rule__Form__TitleAssignment_3 : ( ruleEString ) ;
    public final void rule__Form__TitleAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4007:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4008:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4008:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4009:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getTitleEStringParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Form__TitleAssignment_38017);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getTitleEStringParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__TitleAssignment_3"


    // $ANTLR start "rule__Form__DescriptionAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4018:1: rule__Form__DescriptionAssignment_4 : ( ruleEString ) ;
    public final void rule__Form__DescriptionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4022:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4023:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4023:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4024:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getDescriptionEStringParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Form__DescriptionAssignment_48048);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getDescriptionEStringParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__DescriptionAssignment_4"


    // $ANTLR start "rule__Form__EntityAssignment_6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4033:1: rule__Form__EntityAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Form__EntityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4037:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4038:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4038:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4039:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityCrossReference_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4040:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4041:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getEntityEntityQualifiedNameParserRuleCall_6_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Form__EntityAssignment_68083);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityEntityQualifiedNameParserRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getEntityEntityCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__EntityAssignment_6"


    // $ANTLR start "rule__Form__PagesAssignment_8"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4052:1: rule__Form__PagesAssignment_8 : ( rulePage ) ;
    public final void rule__Form__PagesAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4056:1: ( ( rulePage ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4057:1: ( rulePage )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4057:1: ( rulePage )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4058:1: rulePage
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFormAccess().getPagesPageParserRuleCall_8_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePage_in_rule__Form__PagesAssignment_88118);
            rulePage();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFormAccess().getPagesPageParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Form__PagesAssignment_8"


    // $ANTLR start "rule__Page__TitleAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4067:1: rule__Page__TitleAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Page__TitleAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4071:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4072:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4072:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4073:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_18149); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getTitleSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__TitleAssignment_1"


    // $ANTLR start "rule__Page__PageElementsAssignment_3_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4082:1: rule__Page__PageElementsAssignment_3_0 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4086:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4087:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4087:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4088:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_08180);
            rulePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__PageElementsAssignment_3_0"


    // $ANTLR start "rule__Page__PageElementsAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4097:1: rule__Page__PageElementsAssignment_4 : ( rulePageElement ) ;
    public final void rule__Page__PageElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4101:1: ( ( rulePageElement ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4102:1: ( rulePageElement )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4102:1: ( rulePageElement )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4103:1: rulePageElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_48211);
            rulePageElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getPageElementsPageElementParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__PageElementsAssignment_4"


    // $ANTLR start "rule__Page__ConditionAssignment_6_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4112:1: rule__Page__ConditionAssignment_6_1 : ( ruleCondition ) ;
    public final void rule__Page__ConditionAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4116:1: ( ( ruleCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4117:1: ( ruleCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4117:1: ( ruleCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4118:1: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_6_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_6_18242);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPageAccess().getConditionConditionParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__ConditionAssignment_6_1"


    // $ANTLR start "rule__CompositeCondition__ConditionIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4127:1: rule__CompositeCondition__ConditionIDAssignment_1 : ( ruleEString ) ;
    public final void rule__CompositeCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4131:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4132:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4132:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4133:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getConditionIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__CompositeCondition__ConditionIDAssignment_18273);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getConditionIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ConditionIDAssignment_1"


    // $ANTLR start "rule__CompositeCondition__ComposedConditionsAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4142:1: rule__CompositeCondition__ComposedConditionsAssignment_4 : ( ruleAttributeValueCondition ) ;
    public final void rule__CompositeCondition__ComposedConditionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4146:1: ( ( ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4147:1: ( ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4147:1: ( ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4148:1: ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_48304);
            ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ComposedConditionsAssignment_4"


    // $ANTLR start "rule__CompositeCondition__CompositionTypeAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4157:1: rule__CompositeCondition__CompositionTypeAssignment_5 : ( ruleCompositeConditionType ) ;
    public final void rule__CompositeCondition__CompositionTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4161:1: ( ( ruleCompositeConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4162:1: ( ruleCompositeConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4162:1: ( ruleCompositeConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4163:1: ruleCompositeConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_58335);
            ruleCompositeConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getCompositionTypeCompositeConditionTypeEnumRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__CompositionTypeAssignment_5"


    // $ANTLR start "rule__CompositeCondition__ComposedConditionsAssignment_6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4172:1: rule__CompositeCondition__ComposedConditionsAssignment_6 : ( ruleAttributeValueCondition ) ;
    public final void rule__CompositeCondition__ComposedConditionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4176:1: ( ( ruleAttributeValueCondition ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4177:1: ( ruleAttributeValueCondition )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4177:1: ( ruleAttributeValueCondition )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4178:1: ruleAttributeValueCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_68366);
            ruleAttributeValueCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getComposedConditionsAttributeValueConditionParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__ComposedConditionsAssignment_6"


    // $ANTLR start "rule__CompositeCondition__TypeAssignment_9"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4187:1: rule__CompositeCondition__TypeAssignment_9 : ( ruleConditionType ) ;
    public final void rule__CompositeCondition__TypeAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4191:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4192:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4192:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4193:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_98397);
            ruleConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompositeConditionAccess().getTypeConditionTypeEnumRuleCall_9_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompositeCondition__TypeAssignment_9"


    // $ANTLR start "rule__AttributeValueCondition__ConditionIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4202:1: rule__AttributeValueCondition__ConditionIDAssignment_1 : ( ruleEString ) ;
    public final void rule__AttributeValueCondition__ConditionIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4206:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4207:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4207:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4208:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getConditionIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeValueCondition__ConditionIDAssignment_18428);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getConditionIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__ConditionIDAssignment_1"


    // $ANTLR start "rule__AttributeValueCondition__AttributeAssignment_3"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4217:1: rule__AttributeValueCondition__AttributeAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AttributeValueCondition__AttributeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4221:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4222:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4222:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4223:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4224:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4225:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__AttributeValueCondition__AttributeAssignment_38463);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getAttributeAttributeCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__AttributeAssignment_3"


    // $ANTLR start "rule__AttributeValueCondition__ValueAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4236:1: rule__AttributeValueCondition__ValueAssignment_5 : ( ruleEString ) ;
    public final void rule__AttributeValueCondition__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4240:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4241:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4241:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4242:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getValueEStringParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__AttributeValueCondition__ValueAssignment_58498);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getValueEStringParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__ValueAssignment_5"


    // $ANTLR start "rule__AttributeValueCondition__TypeAssignment_7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4251:1: rule__AttributeValueCondition__TypeAssignment_7 : ( ruleConditionType ) ;
    public final void rule__AttributeValueCondition__TypeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4255:1: ( ( ruleConditionType ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4256:1: ( ruleConditionType )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4256:1: ( ruleConditionType )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4257:1: ruleConditionType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78529);
            ruleConditionType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueConditionAccess().getTypeConditionTypeEnumRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueCondition__TypeAssignment_7"


    // $ANTLR start "rule__Table__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4266:1: rule__Table__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__Table__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4270:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4271:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4271:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4272:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Table__ElementIDAssignment_18560);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ElementIDAssignment_1"


    // $ANTLR start "rule__Table__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4281:1: rule__Table__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__Table__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4285:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4286:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4286:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4287:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Table__LabelAssignment_28591);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__LabelAssignment_2"


    // $ANTLR start "rule__Table__RelationshipAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4296:1: rule__Table__RelationshipAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Table__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4300:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4301:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4301:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4302:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4303:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4304:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getRelationshipRelationshipQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Table__RelationshipAssignment_48626);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRelationshipRelationshipQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__RelationshipAssignment_4"


    // $ANTLR start "rule__Table__ColumnsAssignment_6_0"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4315:1: rule__Table__ColumnsAssignment_6_0 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_6_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4319:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4320:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4320:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4321:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_08661);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_6_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_6_0"


    // $ANTLR start "rule__Table__ColumnsAssignment_7"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4330:1: rule__Table__ColumnsAssignment_7 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4334:1: ( ( ruleColumn ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4335:1: ( ruleColumn )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4335:1: ( ruleColumn )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4336:1: ruleColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_78692);
            ruleColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__ColumnsAssignment_7"


    // $ANTLR start "rule__Table__EditingFormAssignment_10"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4345:1: rule__Table__EditingFormAssignment_10 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Table__EditingFormAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4349:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4350:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4350:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4351:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getEditingFormFormCrossReference_10_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4352:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4353:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTableAccess().getEditingFormFormQualifiedNameParserRuleCall_10_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Table__EditingFormAssignment_108727);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getEditingFormFormQualifiedNameParserRuleCall_10_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTableAccess().getEditingFormFormCrossReference_10_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__EditingFormAssignment_10"


    // $ANTLR start "rule__List__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4364:1: rule__List__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__List__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4368:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4369:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4369:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4370:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__List__ElementIDAssignment_18762);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__ElementIDAssignment_1"


    // $ANTLR start "rule__List__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4379:1: rule__List__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__List__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4383:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4384:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4384:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4385:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__List__LabelAssignment_28793);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__LabelAssignment_2"


    // $ANTLR start "rule__List__RelationshipAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4394:1: rule__List__RelationshipAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__List__RelationshipAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4398:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4399:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4399:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4400:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4401:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4402:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getRelationshipRelationshipQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__List__RelationshipAssignment_48828);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRelationshipRelationshipQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getRelationshipRelationshipCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__RelationshipAssignment_4"


    // $ANTLR start "rule__List__EditingFormAssignment_6"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4413:1: rule__List__EditingFormAssignment_6 : ( ( ruleQualifiedName ) ) ;
    public final void rule__List__EditingFormAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4417:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4418:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4418:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4419:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getEditingFormFormCrossReference_6_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4420:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4421:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getListAccess().getEditingFormFormQualifiedNameParserRuleCall_6_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__List__EditingFormAssignment_68867);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getEditingFormFormQualifiedNameParserRuleCall_6_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getListAccess().getEditingFormFormCrossReference_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__List__EditingFormAssignment_6"


    // $ANTLR start "rule__TimeSelectionField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4432:1: rule__TimeSelectionField__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__TimeSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4436:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4437:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4437:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4438:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TimeSelectionField__ElementIDAssignment_18902);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__ElementIDAssignment_1"


    // $ANTLR start "rule__TimeSelectionField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4447:1: rule__TimeSelectionField__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__TimeSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4451:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4452:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4452:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4453:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TimeSelectionField__LabelAssignment_28933);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__LabelAssignment_2"


    // $ANTLR start "rule__TimeSelectionField__AttributeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4462:1: rule__TimeSelectionField__AttributeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TimeSelectionField__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4466:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4467:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4467:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4468:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4469:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4470:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTimeSelectionFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__TimeSelectionField__AttributeAssignment_48968);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTimeSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeSelectionField__AttributeAssignment_4"


    // $ANTLR start "rule__DateSelectionField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4481:1: rule__DateSelectionField__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__DateSelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4485:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4486:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4486:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4487:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DateSelectionField__ElementIDAssignment_19003);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__ElementIDAssignment_1"


    // $ANTLR start "rule__DateSelectionField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4496:1: rule__DateSelectionField__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__DateSelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4500:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4501:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4501:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4502:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__DateSelectionField__LabelAssignment_29034);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__LabelAssignment_2"


    // $ANTLR start "rule__DateSelectionField__AttributeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4511:1: rule__DateSelectionField__AttributeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__DateSelectionField__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4515:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4516:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4516:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4517:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4518:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4519:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDateSelectionFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__DateSelectionField__AttributeAssignment_49069);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDateSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DateSelectionField__AttributeAssignment_4"


    // $ANTLR start "rule__Column__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4530:1: rule__Column__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__Column__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4534:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4535:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4535:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4536:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Column__ElementIDAssignment_19104);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__ElementIDAssignment_1"


    // $ANTLR start "rule__Column__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4545:1: rule__Column__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__Column__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4549:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4550:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4550:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4551:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Column__LabelAssignment_29135);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__LabelAssignment_2"


    // $ANTLR start "rule__Column__AttributeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4560:1: rule__Column__AttributeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Column__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4564:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4565:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4565:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4566:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4567:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4568:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getColumnAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Column__AttributeAssignment_49170);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getColumnAccess().getAttributeAttributeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__AttributeAssignment_4"


    // $ANTLR start "rule__SelectionField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4579:1: rule__SelectionField__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__SelectionField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4583:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4584:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4584:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4585:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SelectionField__ElementIDAssignment_19205);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__ElementIDAssignment_1"


    // $ANTLR start "rule__SelectionField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4594:1: rule__SelectionField__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__SelectionField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4598:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4599:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4599:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4600:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__SelectionField__LabelAssignment_29236);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__LabelAssignment_2"


    // $ANTLR start "rule__SelectionField__AttributeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4609:1: rule__SelectionField__AttributeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__SelectionField__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4613:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4614:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4614:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4615:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4616:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4617:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSelectionFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__SelectionField__AttributeAssignment_49271);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSelectionFieldAccess().getAttributeAttributeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectionField__AttributeAssignment_4"


    // $ANTLR start "rule__TextArea__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4628:1: rule__TextArea__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__TextArea__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4632:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4633:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4633:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4634:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextArea__ElementIDAssignment_19306);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__ElementIDAssignment_1"


    // $ANTLR start "rule__TextArea__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4643:1: rule__TextArea__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__TextArea__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4647:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4648:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4648:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4649:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextArea__LabelAssignment_29337);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__LabelAssignment_2"


    // $ANTLR start "rule__TextArea__AttributeAssignment_4"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4658:1: rule__TextArea__AttributeAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TextArea__AttributeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4662:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4663:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4663:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4664:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getAttributeAttributeCrossReference_4_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4665:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4666:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextAreaAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__TextArea__AttributeAssignment_49372);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getAttributeAttributeQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextAreaAccess().getAttributeAttributeCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__AttributeAssignment_4"


    // $ANTLR start "rule__TextField__ElementIDAssignment_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4677:1: rule__TextField__ElementIDAssignment_1 : ( ruleEString ) ;
    public final void rule__TextField__ElementIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4681:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4682:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4682:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4683:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextField__ElementIDAssignment_19407);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getElementIDEStringParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__ElementIDAssignment_1"


    // $ANTLR start "rule__TextField__LabelAssignment_2"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4692:1: rule__TextField__LabelAssignment_2 : ( ruleEString ) ;
    public final void rule__TextField__LabelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4696:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4697:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4697:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4698:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextField__LabelAssignment_29438);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getLabelEStringParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__LabelAssignment_2"


    // $ANTLR start "rule__TextField__FormatAssignment_3_1"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4707:1: rule__TextField__FormatAssignment_3_1 : ( ruleEString ) ;
    public final void rule__TextField__FormatAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4711:1: ( ( ruleEString ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4712:1: ( ruleEString )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4712:1: ( ruleEString )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4713:1: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getFormatEStringParserRuleCall_3_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__TextField__FormatAssignment_3_19469);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getFormatEStringParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__FormatAssignment_3_1"


    // $ANTLR start "rule__TextField__AttributeAssignment_5"
    // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4722:1: rule__TextField__AttributeAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__TextField__AttributeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4726:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4727:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4727:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4728:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getAttributeAttributeCrossReference_5_0()); 
            }
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4729:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.form.ui/src-gen/at/ac/tuwien/big/forms/form/ui/contentassist/antlr/internal/InternalForm.g:4730:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTextFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__TextField__AttributeAssignment_59504);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getAttributeAttributeQualifiedNameParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTextFieldAccess().getAttributeAttributeCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__AttributeAssignment_5"

    // Delegated rules


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA12_eotS =
        "\142\uffff";
    static final String DFA12_eofS =
        "\142\uffff";
    static final String DFA12_minS =
        "\1\40\30\4\20\23\1\4\10\5\2\23\6\25\1\41\1\24\1\5\2\uffff\10\5"+
        "\1\45\6\25\1\41\1\25\1\24\1\4\1\5\2\4\1\25\2\23\1\5\1\25\1\5\1\41"+
        "\1\45\1\25\1\5\1\25\1\5\1\25";
    static final String DFA12_maxS =
        "\1\50\30\5\2\51\16\23\11\5\2\23\10\52\1\5\2\uffff\10\5\1\45\11"+
        "\52\4\5\1\52\2\23\1\5\1\52\1\5\1\41\1\45\1\52\1\5\1\52\1\5\1\52";
    static final String DFA12_acceptS =
        "\75\uffff\1\1\1\2\43\uffff";
    static final String DFA12_specialS =
        "\142\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\10\1\uffff\1\7\1\6\1\5\1\4\1\3\1\2\1\1",
            "\1\11\1\12",
            "\1\13\1\14",
            "\1\15\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\24",
            "\1\25\1\26",
            "\1\27\1\30",
            "\1\31\1\32",
            "\1\31\1\32",
            "\1\33\1\34",
            "\1\33\1\34",
            "\1\35\1\36",
            "\1\35\1\36",
            "\1\37\1\40",
            "\1\37\1\40",
            "\1\41\1\42",
            "\1\41\1\42",
            "\1\43\1\44",
            "\1\43\1\44",
            "\1\45\1\46",
            "\1\45\1\46",
            "\1\47\1\50",
            "\1\47\1\50",
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
            "\1\62\1\63",
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
            "\1\76\1\uffff\1\75\22\uffff\1\74",
            "\1\76\1\uffff\1\75\22\uffff\1\77",
            "\1\76\1\uffff\1\75\22\uffff\1\100",
            "\1\76\1\uffff\1\75\22\uffff\1\101",
            "\1\76\1\uffff\1\75\22\uffff\1\102",
            "\1\76\1\uffff\1\75\22\uffff\1\103",
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
            "\1\76\1\uffff\1\75\22\uffff\1\74",
            "\1\76\1\uffff\1\75\22\uffff\1\77",
            "\1\76\1\uffff\1\75\22\uffff\1\100",
            "\1\76\1\uffff\1\75\22\uffff\1\101",
            "\1\76\1\uffff\1\75\22\uffff\1\102",
            "\1\76\1\uffff\1\75\22\uffff\1\103",
            "\1\105\10\uffff\1\104",
            "\1\76\1\uffff\1\75\22\uffff\1\122",
            "\1\107\25\uffff\1\106",
            "\1\123\1\124",
            "\1\125",
            "\1\126\1\127",
            "\1\126\1\127",
            "\1\76\1\uffff\1\75\22\uffff\1\122",
            "\1\130",
            "\1\130",
            "\1\131",
            "\1\133\1\uffff\1\134\22\uffff\1\132",
            "\1\135",
            "\1\136",
            "\1\121",
            "\1\133\1\uffff\1\134\22\uffff\1\132",
            "\1\137",
            "\1\76\1\uffff\1\75\22\uffff\1\140",
            "\1\141",
            "\1\76\1\uffff\1\75\22\uffff\1\140"
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "()* loopback of 1335:1: ( rule__Page__Group_3__0 )*";
        }
    }
    static final String DFA14_eotS =
        "\14\uffff";
    static final String DFA14_eofS =
        "\14\uffff";
    static final String DFA14_minS =
        "\1\45\3\4\2\23\1\5\1\25\1\5\2\uffff\1\25";
    static final String DFA14_maxS =
        "\1\45\3\5\2\23\1\5\1\52\1\5\2\uffff\1\52";
    static final String DFA14_acceptS =
        "\11\uffff\1\1\1\2\1\uffff";
    static final String DFA14_specialS =
        "\14\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\1",
            "\1\2\1\3",
            "\1\4\1\5",
            "\1\4\1\5",
            "\1\6",
            "\1\6",
            "\1\7",
            "\1\12\1\uffff\1\11\22\uffff\1\10",
            "\1\13",
            "",
            "",
            "\1\12\1\uffff\1\11\22\uffff\1\10"
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 2346:1: ( rule__Table__Group_6__0 )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleFormModel_in_entryRuleFormModel67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFormModel74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormModel__Group__0_in_ruleFormModel100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_entryRuleForm127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleForm134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__0_in_ruleForm160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_entryRulePage247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePage254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0_in_rulePage280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Condition__Alternatives_in_ruleCondition340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_entryRuleCompositeCondition367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCompositeCondition374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__0_in_ruleCompositeCondition400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_entryRuleAttributeValueCondition427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueCondition434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__0_in_ruleAttributeValueCondition460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_entryRulePageElement487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePageElement494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__PageElement__Alternatives_in_rulePageElement520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_entryRuleRelationshipPageElement547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationshipPageElement554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RelationshipPageElement__Alternatives_in_ruleRelationshipPageElement580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_entryRuleTable607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTable614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__0_in_ruleTable640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_entryRuleList667 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleList674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0_in_ruleList700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_entryRuleAttributePageElement727 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttributePageElement734 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributePageElement__Alternatives_in_ruleAttributePageElement760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_entryRuleTimeSelectionField787 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTimeSelectionField794 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__0_in_ruleTimeSelectionField820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_entryRuleDateSelectionField847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDateSelectionField854 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__0_in_ruleDateSelectionField880 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_entryRuleColumn907 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColumn914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__0_in_ruleColumn940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_entryRuleSelectionField967 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSelectionField974 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__0_in_ruleSelectionField1000 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea1027 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextArea1034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__0_in_ruleTextArea1060 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField1087 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleTextField1094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__0_in_ruleTextField1120 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1149 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1182 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeConditionType__Alternatives_in_ruleCompositeConditionType1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ConditionType__Alternatives_in_ruleConditionType1255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives1307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__Condition__Alternatives1339 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeCondition_in_rule__Condition__Alternatives1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributePageElement_in_rule__PageElement__Alternatives1388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationshipPageElement_in_rule__PageElement__Alternatives1405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleList_in_rule__RelationshipPageElement__Alternatives1437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTable_in_rule__RelationshipPageElement__Alternatives1454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextField_in_rule__AttributePageElement__Alternatives1486 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTextArea_in_rule__AttributePageElement__Alternatives1503 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSelectionField_in_rule__AttributePageElement__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__AttributePageElement__Alternatives1537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDateSelectionField_in_rule__AttributePageElement__Alternatives1554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTimeSelectionField_in_rule__AttributePageElement__Alternatives1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__CompositeConditionType__Alternatives1604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__CompositeConditionType__Alternatives1625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__ConditionType__Alternatives1661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__ConditionType__Alternatives1682 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__ConditionType__Alternatives1703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__ConditionType__Alternatives1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__ConditionType__Alternatives1745 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormModel__Group__0__Impl_in_rule__FormModel__Group__01778 = new BitSet(new long[]{0x0000080000040000L});
        public static final BitSet FOLLOW_rule__FormModel__Group__1_in_rule__FormModel__Group__01781 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormModel__Group__1__Impl_in_rule__FormModel__Group__11839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__FormModel__FormsAssignment_1_in_rule__FormModel__Group__1__Impl1868 = new BitSet(new long[]{0x0000080000040002L});
        public static final BitSet FOLLOW_rule__FormModel__FormsAssignment_1_in_rule__FormModel__Group__1__Impl1880 = new BitSet(new long[]{0x0000080000040002L});
        public static final BitSet FOLLOW_rule__Form__Group__0__Impl_in_rule__Form__Group__01917 = new BitSet(new long[]{0x0000080000040000L});
        public static final BitSet FOLLOW_rule__Form__Group__1_in_rule__Form__Group__01920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__WelcomeFormAssignment_0_in_rule__Form__Group__0__Impl1947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__1__Impl_in_rule__Form__Group__11978 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Form__Group__2_in_rule__Form__Group__11981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Form__Group__1__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__2__Impl_in_rule__Form__Group__22040 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Form__Group__3_in_rule__Form__Group__22043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__NameAssignment_2_in_rule__Form__Group__2__Impl2070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__3__Impl_in_rule__Form__Group__32100 = new BitSet(new long[]{0x0000000000080030L});
        public static final BitSet FOLLOW_rule__Form__Group__4_in_rule__Form__Group__32103 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__TitleAssignment_3_in_rule__Form__Group__3__Impl2130 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__4__Impl_in_rule__Form__Group__42160 = new BitSet(new long[]{0x0000000000080030L});
        public static final BitSet FOLLOW_rule__Form__Group__5_in_rule__Form__Group__42163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__DescriptionAssignment_4_in_rule__Form__Group__4__Impl2190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__5__Impl_in_rule__Form__Group__52221 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Form__Group__6_in_rule__Form__Group__52224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Form__Group__5__Impl2252 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__6__Impl_in_rule__Form__Group__62283 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Form__Group__7_in_rule__Form__Group__62286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__EntityAssignment_6_in_rule__Form__Group__6__Impl2313 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__7__Impl_in_rule__Form__Group__72343 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Form__Group__8_in_rule__Form__Group__72346 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Form__Group__7__Impl2374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__Group__8__Impl_in_rule__Form__Group__82405 = new BitSet(new long[]{0x0000000000600000L});
        public static final BitSet FOLLOW_rule__Form__Group__9_in_rule__Form__Group__82408 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Form__PagesAssignment_8_in_rule__Form__Group__8__Impl2435 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_rule__Form__Group__9__Impl_in_rule__Form__Group__92466 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Form__Group__9__Impl2494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__0__Impl_in_rule__Page__Group__02545 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Page__Group__1_in_rule__Page__Group__02548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Page__Group__0__Impl2576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__1__Impl_in_rule__Page__Group__12607 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Page__Group__2_in_rule__Page__Group__12610 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__TitleAssignment_1_in_rule__Page__Group__1__Impl2637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__2__Impl_in_rule__Page__Group__22667 = new BitSet(new long[]{0x000001FD00000000L});
        public static final BitSet FOLLOW_rule__Page__Group__3_in_rule__Page__Group__22670 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Page__Group__2__Impl2698 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__3__Impl_in_rule__Page__Group__32729 = new BitSet(new long[]{0x000001FD00000000L});
        public static final BitSet FOLLOW_rule__Page__Group__4_in_rule__Page__Group__32732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0_in_rule__Page__Group__3__Impl2759 = new BitSet(new long[]{0x000001FD00000002L});
        public static final BitSet FOLLOW_rule__Page__Group__4__Impl_in_rule__Page__Group__42790 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Page__Group__5_in_rule__Page__Group__42793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_4_in_rule__Page__Group__4__Impl2820 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__5__Impl_in_rule__Page__Group__52850 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Page__Group__6_in_rule__Page__Group__52853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Page__Group__5__Impl2881 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group__6__Impl_in_rule__Page__Group__62912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_6__0_in_rule__Page__Group__6__Impl2939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__0__Impl_in_rule__Page__Group_3__02984 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1_in_rule__Page__Group_3__02987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__PageElementsAssignment_3_0_in_rule__Page__Group_3__0__Impl3014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_3__1__Impl_in_rule__Page__Group_3__13044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Page__Group_3__1__Impl3072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_6__0__Impl_in_rule__Page__Group_6__03107 = new BitSet(new long[]{0x0000000042000000L});
        public static final BitSet FOLLOW_rule__Page__Group_6__1_in_rule__Page__Group_6__03110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Page__Group_6__0__Impl3138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__Group_6__1__Impl_in_rule__Page__Group_6__13169 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Page__ConditionAssignment_6_1_in_rule__Page__Group_6__1__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__0__Impl_in_rule__CompositeCondition__Group__03230 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1_in_rule__CompositeCondition__Group__03233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__CompositeCondition__Group__0__Impl3261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__1__Impl_in_rule__CompositeCondition__Group__13292 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2_in_rule__CompositeCondition__Group__13295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ConditionIDAssignment_1_in_rule__CompositeCondition__Group__1__Impl3322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__2__Impl_in_rule__CompositeCondition__Group__23352 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3_in_rule__CompositeCondition__Group__23355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__CompositeCondition__Group__2__Impl3383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__3__Impl_in_rule__CompositeCondition__Group__33414 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4_in_rule__CompositeCondition__Group__33417 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__CompositeCondition__Group__3__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__4__Impl_in_rule__CompositeCondition__Group__43476 = new BitSet(new long[]{0x0000000000001800L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5_in_rule__CompositeCondition__Group__43479 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_4_in_rule__CompositeCondition__Group__4__Impl3506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__5__Impl_in_rule__CompositeCondition__Group__53536 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6_in_rule__CompositeCondition__Group__53539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__CompositionTypeAssignment_5_in_rule__CompositeCondition__Group__5__Impl3566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__6__Impl_in_rule__CompositeCondition__Group__63596 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7_in_rule__CompositeCondition__Group__63599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__ComposedConditionsAssignment_6_in_rule__CompositeCondition__Group__6__Impl3626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__7__Impl_in_rule__CompositeCondition__Group__73656 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__8_in_rule__CompositeCondition__Group__73659 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__CompositeCondition__Group__7__Impl3687 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__8__Impl_in_rule__CompositeCondition__Group__83718 = new BitSet(new long[]{0x000000000003E000L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__9_in_rule__CompositeCondition__Group__83721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__CompositeCondition__Group__8__Impl3749 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__Group__9__Impl_in_rule__CompositeCondition__Group__93780 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__CompositeCondition__TypeAssignment_9_in_rule__CompositeCondition__Group__9__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__0__Impl_in_rule__AttributeValueCondition__Group__03857 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1_in_rule__AttributeValueCondition__Group__03860 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__AttributeValueCondition__Group__0__Impl3888 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__1__Impl_in_rule__AttributeValueCondition__Group__13919 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2_in_rule__AttributeValueCondition__Group__13922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ConditionIDAssignment_1_in_rule__AttributeValueCondition__Group__1__Impl3949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__2__Impl_in_rule__AttributeValueCondition__Group__23979 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3_in_rule__AttributeValueCondition__Group__23982 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__AttributeValueCondition__Group__2__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__3__Impl_in_rule__AttributeValueCondition__Group__34041 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4_in_rule__AttributeValueCondition__Group__34044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__AttributeAssignment_3_in_rule__AttributeValueCondition__Group__3__Impl4071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__4__Impl_in_rule__AttributeValueCondition__Group__44101 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5_in_rule__AttributeValueCondition__Group__44104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__AttributeValueCondition__Group__4__Impl4132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__5__Impl_in_rule__AttributeValueCondition__Group__54163 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6_in_rule__AttributeValueCondition__Group__54166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__ValueAssignment_5_in_rule__AttributeValueCondition__Group__5__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__6__Impl_in_rule__AttributeValueCondition__Group__64223 = new BitSet(new long[]{0x000000000003E000L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7_in_rule__AttributeValueCondition__Group__64226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__AttributeValueCondition__Group__6__Impl4254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__Group__7__Impl_in_rule__AttributeValueCondition__Group__74285 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeValueCondition__TypeAssignment_7_in_rule__AttributeValueCondition__Group__7__Impl4312 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__0__Impl_in_rule__Table__Group__04358 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Table__Group__1_in_rule__Table__Group__04361 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Table__Group__0__Impl4389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__1__Impl_in_rule__Table__Group__14420 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Table__Group__2_in_rule__Table__Group__14423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ElementIDAssignment_1_in_rule__Table__Group__1__Impl4450 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__2__Impl_in_rule__Table__Group__24480 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Table__Group__3_in_rule__Table__Group__24483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__LabelAssignment_2_in_rule__Table__Group__2__Impl4510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__3__Impl_in_rule__Table__Group__34540 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Table__Group__4_in_rule__Table__Group__34543 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Table__Group__3__Impl4571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__4__Impl_in_rule__Table__Group__44602 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__Table__Group__5_in_rule__Table__Group__44605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__RelationshipAssignment_4_in_rule__Table__Group__4__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__5__Impl_in_rule__Table__Group__54662 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Table__Group__6_in_rule__Table__Group__54665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Table__Group__5__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__6__Impl_in_rule__Table__Group__64724 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__Table__Group__7_in_rule__Table__Group__64727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0_in_rule__Table__Group__6__Impl4754 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__7__Impl_in_rule__Table__Group__74785 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Table__Group__8_in_rule__Table__Group__74788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_7_in_rule__Table__Group__7__Impl4815 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__8__Impl_in_rule__Table__Group__84845 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Table__Group__9_in_rule__Table__Group__84848 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Table__Group__8__Impl4876 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__9__Impl_in_rule__Table__Group__94907 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Table__Group__10_in_rule__Table__Group__94910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Table__Group__9__Impl4938 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group__10__Impl_in_rule__Table__Group__104969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__EditingFormAssignment_10_in_rule__Table__Group__10__Impl4996 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__0__Impl_in_rule__Table__Group_6__05048 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1_in_rule__Table__Group_6__05051 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__ColumnsAssignment_6_0_in_rule__Table__Group_6__0__Impl5078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Table__Group_6__1__Impl_in_rule__Table__Group_6__15108 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Table__Group_6__1__Impl5136 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__0__Impl_in_rule__List__Group__05171 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__List__Group__1_in_rule__List__Group__05174 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__List__Group__0__Impl5202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__1__Impl_in_rule__List__Group__15233 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__List__Group__2_in_rule__List__Group__15236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__ElementIDAssignment_1_in_rule__List__Group__1__Impl5263 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__2__Impl_in_rule__List__Group__25293 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__List__Group__3_in_rule__List__Group__25296 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__LabelAssignment_2_in_rule__List__Group__2__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__3__Impl_in_rule__List__Group__35353 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__List__Group__4_in_rule__List__Group__35356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__List__Group__3__Impl5384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__4__Impl_in_rule__List__Group__45415 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__List__Group__5_in_rule__List__Group__45418 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__RelationshipAssignment_4_in_rule__List__Group__4__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__5__Impl_in_rule__List__Group__55475 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__List__Group__6_in_rule__List__Group__55478 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__List__Group__5__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__Group__6__Impl_in_rule__List__Group__65537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__List__EditingFormAssignment_6_in_rule__List__Group__6__Impl5564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__0__Impl_in_rule__TimeSelectionField__Group__05608 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1_in_rule__TimeSelectionField__Group__05611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__TimeSelectionField__Group__0__Impl5639 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__1__Impl_in_rule__TimeSelectionField__Group__15670 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2_in_rule__TimeSelectionField__Group__15673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__ElementIDAssignment_1_in_rule__TimeSelectionField__Group__1__Impl5700 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__2__Impl_in_rule__TimeSelectionField__Group__25730 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__3_in_rule__TimeSelectionField__Group__25733 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__LabelAssignment_2_in_rule__TimeSelectionField__Group__2__Impl5760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__3__Impl_in_rule__TimeSelectionField__Group__35790 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__4_in_rule__TimeSelectionField__Group__35793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TimeSelectionField__Group__3__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__Group__4__Impl_in_rule__TimeSelectionField__Group__45852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TimeSelectionField__AttributeAssignment_4_in_rule__TimeSelectionField__Group__4__Impl5879 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__0__Impl_in_rule__DateSelectionField__Group__05919 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1_in_rule__DateSelectionField__Group__05922 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__DateSelectionField__Group__0__Impl5950 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__1__Impl_in_rule__DateSelectionField__Group__15981 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2_in_rule__DateSelectionField__Group__15984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__ElementIDAssignment_1_in_rule__DateSelectionField__Group__1__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__2__Impl_in_rule__DateSelectionField__Group__26041 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__3_in_rule__DateSelectionField__Group__26044 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__LabelAssignment_2_in_rule__DateSelectionField__Group__2__Impl6071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__3__Impl_in_rule__DateSelectionField__Group__36101 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__4_in_rule__DateSelectionField__Group__36104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__DateSelectionField__Group__3__Impl6132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__Group__4__Impl_in_rule__DateSelectionField__Group__46163 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__DateSelectionField__AttributeAssignment_4_in_rule__DateSelectionField__Group__4__Impl6190 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__0__Impl_in_rule__Column__Group__06230 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Column__Group__1_in_rule__Column__Group__06233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__Column__Group__0__Impl6261 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__1__Impl_in_rule__Column__Group__16292 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Column__Group__2_in_rule__Column__Group__16295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__ElementIDAssignment_1_in_rule__Column__Group__1__Impl6322 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__2__Impl_in_rule__Column__Group__26352 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__Column__Group__3_in_rule__Column__Group__26355 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__LabelAssignment_2_in_rule__Column__Group__2__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__3__Impl_in_rule__Column__Group__36412 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Column__Group__4_in_rule__Column__Group__36415 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Column__Group__3__Impl6443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__Group__4__Impl_in_rule__Column__Group__46474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Column__AttributeAssignment_4_in_rule__Column__Group__4__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__0__Impl_in_rule__SelectionField__Group__06541 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1_in_rule__SelectionField__Group__06544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_rule__SelectionField__Group__0__Impl6572 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__1__Impl_in_rule__SelectionField__Group__16603 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2_in_rule__SelectionField__Group__16606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__ElementIDAssignment_1_in_rule__SelectionField__Group__1__Impl6633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__2__Impl_in_rule__SelectionField__Group__26663 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__3_in_rule__SelectionField__Group__26666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__LabelAssignment_2_in_rule__SelectionField__Group__2__Impl6693 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__3__Impl_in_rule__SelectionField__Group__36723 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__4_in_rule__SelectionField__Group__36726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__SelectionField__Group__3__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__Group__4__Impl_in_rule__SelectionField__Group__46785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__SelectionField__AttributeAssignment_4_in_rule__SelectionField__Group__4__Impl6812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__06852 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__06855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_rule__TextArea__Group__0__Impl6883 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__16914 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2_in_rule__TextArea__Group__16917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__ElementIDAssignment_1_in_rule__TextArea__Group__1__Impl6944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__2__Impl_in_rule__TextArea__Group__26974 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__TextArea__Group__3_in_rule__TextArea__Group__26977 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__LabelAssignment_2_in_rule__TextArea__Group__2__Impl7004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__3__Impl_in_rule__TextArea__Group__37034 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextArea__Group__4_in_rule__TextArea__Group__37037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextArea__Group__3__Impl7065 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__Group__4__Impl_in_rule__TextArea__Group__47096 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextArea__AttributeAssignment_4_in_rule__TextArea__Group__4__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__07163 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__07166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_rule__TextField__Group__0__Impl7194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__17225 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextField__Group__2_in_rule__TextField__Group__17228 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__ElementIDAssignment_1_in_rule__TextField__Group__1__Impl7255 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__2__Impl_in_rule__TextField__Group__27285 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_rule__TextField__Group__3_in_rule__TextField__Group__27288 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__LabelAssignment_2_in_rule__TextField__Group__2__Impl7315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__3__Impl_in_rule__TextField__Group__37345 = new BitSet(new long[]{0x0000020000080000L});
        public static final BitSet FOLLOW_rule__TextField__Group__4_in_rule__TextField__Group__37348 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0_in_rule__TextField__Group__3__Impl7375 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__4__Impl_in_rule__TextField__Group__47406 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__TextField__Group__5_in_rule__TextField__Group__47409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__TextField__Group__4__Impl7437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group__5__Impl_in_rule__TextField__Group__57468 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__AttributeAssignment_5_in_rule__TextField__Group__5__Impl7495 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__0__Impl_in_rule__TextField__Group_3__07537 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1_in_rule__TextField__Group_3__07540 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_rule__TextField__Group_3__0__Impl7568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__Group_3__1__Impl_in_rule__TextField__Group_3__17599 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__TextField__FormatAssignment_3_1_in_rule__TextField__Group_3__1__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__07661 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__07664 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl7691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__17720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl7747 = new BitSet(new long[]{0x0000040000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__07782 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__07785 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl7814 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__17846 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl7873 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleForm_in_rule__FormModel__FormsAssignment_17911 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_rule__Form__WelcomeFormAssignment_07947 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Form__NameAssignment_27986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Form__TitleAssignment_38017 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Form__DescriptionAssignment_48048 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Form__EntityAssignment_68083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePage_in_rule__Form__PagesAssignment_88118 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Page__TitleAssignment_18149 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_3_08180 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePageElement_in_rule__Page__PageElementsAssignment_48211 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_rule__Page__ConditionAssignment_6_18242 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__CompositeCondition__ConditionIDAssignment_18273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_48304 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCompositeConditionType_in_rule__CompositeCondition__CompositionTypeAssignment_58335 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeValueCondition_in_rule__CompositeCondition__ComposedConditionsAssignment_68366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__CompositeCondition__TypeAssignment_98397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeValueCondition__ConditionIDAssignment_18428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributeValueCondition__AttributeAssignment_38463 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__AttributeValueCondition__ValueAssignment_58498 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionType_in_rule__AttributeValueCondition__TypeAssignment_78529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Table__ElementIDAssignment_18560 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Table__LabelAssignment_28591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Table__RelationshipAssignment_48626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_6_08661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColumn_in_rule__Table__ColumnsAssignment_78692 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Table__EditingFormAssignment_108727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__List__ElementIDAssignment_18762 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__List__LabelAssignment_28793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__List__RelationshipAssignment_48828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__List__EditingFormAssignment_68867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TimeSelectionField__ElementIDAssignment_18902 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TimeSelectionField__LabelAssignment_28933 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TimeSelectionField__AttributeAssignment_48968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DateSelectionField__ElementIDAssignment_19003 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__DateSelectionField__LabelAssignment_29034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__DateSelectionField__AttributeAssignment_49069 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Column__ElementIDAssignment_19104 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Column__LabelAssignment_29135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Column__AttributeAssignment_49170 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SelectionField__ElementIDAssignment_19205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__SelectionField__LabelAssignment_29236 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__SelectionField__AttributeAssignment_49271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextArea__ElementIDAssignment_19306 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextArea__LabelAssignment_29337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TextArea__AttributeAssignment_49372 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextField__ElementIDAssignment_19407 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextField__LabelAssignment_29438 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__TextField__FormatAssignment_3_19469 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__TextField__AttributeAssignment_59504 = new BitSet(new long[]{0x0000000000000002L});
    }


}