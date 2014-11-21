package at.ac.tuwien.big.forms.entity.ui.contentassist.antlr.internal; 

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
import at.ac.tuwien.big.forms.entity.services.EntityGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEntityParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'1'", "'2'", "'3'", "'4'", "'5'", "'6'", "'7'", "'8'", "'0'", "'entity'", "'{'", "'}'", "'extends'", "'id'", "','", "'attribute'", "'*'", "':'", "'reference'", "'['", "'...'", "']'", "'opposite-of'", "'enum'", "'='", "'\"'", "'.'"
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
    public String getGrammarFileName() { return "../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g"; }


     
     	private EntityGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(EntityGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleEntityModel"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:61:1: entryRuleEntityModel : ruleEntityModel EOF ;
    public final void entryRuleEntityModel() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:62:1: ( ruleEntityModel EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:63:1: ruleEntityModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModel_in_entryRuleEntityModel67);
            ruleEntityModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityModel74); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityModel"


    // $ANTLR start "ruleEntityModel"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:70:1: ruleEntityModel : ( ( rule__EntityModel__Group__0 ) ) ;
    public final void ruleEntityModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:74:2: ( ( ( rule__EntityModel__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:75:1: ( ( rule__EntityModel__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:75:1: ( ( rule__EntityModel__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:76:1: ( rule__EntityModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:77:1: ( rule__EntityModel__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:77:2: rule__EntityModel__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel100);
            rule__EntityModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelAccess().getGroup()); 
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
    // $ANTLR end "ruleEntityModel"


    // $ANTLR start "entryRuleEntityModelElement"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:89:1: entryRuleEntityModelElement : ruleEntityModelElement EOF ;
    public final void entryRuleEntityModelElement() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:90:1: ( ruleEntityModelElement EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:91:1: ruleEntityModelElement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelElementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement127);
            ruleEntityModelElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelElementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntityModelElement134); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntityModelElement"


    // $ANTLR start "ruleEntityModelElement"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:98:1: ruleEntityModelElement : ( ( rule__EntityModelElement__Alternatives ) ) ;
    public final void ruleEntityModelElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:102:2: ( ( ( rule__EntityModelElement__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:103:1: ( ( rule__EntityModelElement__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:103:1: ( ( rule__EntityModelElement__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:104:1: ( rule__EntityModelElement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelElementAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:105:1: ( rule__EntityModelElement__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:105:2: rule__EntityModelElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModelElement__Alternatives_in_ruleEntityModelElement160);
            rule__EntityModelElement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelElementAccess().getAlternatives()); 
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
    // $ANTLR end "ruleEntityModelElement"


    // $ANTLR start "entryRuleEntity"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:119:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:120:1: ( ruleEntity EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:121:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity189);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity196); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:128:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:132:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:133:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:133:1: ( ( rule__Entity__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:134:1: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:135:1: ( rule__Entity__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:135:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity222);
            rule__Entity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup()); 
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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:147:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:148:1: ( ruleAttribute EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:149:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute249);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute256); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:156:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:160:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:161:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:161:1: ( ( rule__Attribute__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:162:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:163:1: ( rule__Attribute__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:163:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0_in_ruleAttribute282);
            rule__Attribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup()); 
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleRelationship"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:175:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:176:1: ( ruleRelationship EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:177:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship309);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship316); if (state.failed) return ;

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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:184:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:188:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:189:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:189:1: ( ( rule__Relationship__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:190:1: ( rule__Relationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:191:1: ( rule__Relationship__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:191:2: rule__Relationship__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0_in_ruleRelationship342);
            rule__Relationship__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup()); 
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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleFeature"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:203:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:204:1: ( ruleFeature EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:205:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature369);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature376); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:212:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:216:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:217:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:217:1: ( ( rule__Feature__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:218:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:219:1: ( rule__Feature__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:219:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature402);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleEnumeration"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:231:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:232:1: ( ruleEnumeration EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:233:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration429);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration436); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEnumeration"


    // $ANTLR start "ruleEnumeration"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:240:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:244:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:245:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:245:1: ( ( rule__Enumeration__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:246:1: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:247:1: ( rule__Enumeration__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:247:2: rule__Enumeration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration462);
            rule__Enumeration__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup()); 
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
    // $ANTLR end "ruleEnumeration"


    // $ANTLR start "entryRuleLiteral"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:259:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:260:1: ( ruleLiteral EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:261:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral489);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral496); if (state.failed) return ;

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:268:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:272:2: ( ( ( rule__Literal__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:273:1: ( ( rule__Literal__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:273:1: ( ( rule__Literal__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:274:1: ( rule__Literal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:275:1: ( rule__Literal__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:275:2: rule__Literal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__0_in_ruleLiteral522);
            rule__Literal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getGroup()); 
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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:289:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:290:1: ( ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:291:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName551);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName558); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:298:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:302:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:303:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:303:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:304:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:305:1: ( rule__QualifiedName__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:305:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName584);
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


    // $ANTLR start "ruleAttributeType"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:318:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:322:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:323:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:323:1: ( ( rule__AttributeType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:324:1: ( rule__AttributeType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:325:1: ( rule__AttributeType__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:325:2: rule__AttributeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType621);
            rule__AttributeType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "rule__EntityModelElement__Alternatives"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:336:1: rule__EntityModelElement__Alternatives : ( ( ruleEntity ) | ( ruleEnumeration ) );
    public final void rule__EntityModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:340:1: ( ( ruleEntity ) | ( ruleEnumeration ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==34) ) {
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:341:1: ( ruleEntity )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:341:1: ( ruleEntity )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:342:1: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__EntityModelElement__Alternatives656);
                    ruleEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:347:6: ( ruleEnumeration )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:347:6: ( ruleEnumeration )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:348:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_rule__EntityModelElement__Alternatives673);
                    ruleEnumeration();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
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
    // $ANTLR end "rule__EntityModelElement__Alternatives"


    // $ANTLR start "rule__Feature__Alternatives"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:359:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleRelationship ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:363:1: ( ( ruleAttribute ) | ( ruleRelationship ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==26) ) {
                alt2=1;
            }
            else if ( (LA2_0==29) ) {
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:364:1: ( ruleAttribute )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:364:1: ( ruleAttribute )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:365:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Feature__Alternatives706);
                    ruleAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:370:6: ( ruleRelationship )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:370:6: ( ruleRelationship )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:371:1: ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_rule__Feature__Alternatives723);
                    ruleRelationship();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:381:1: rule__AttributeType__Alternatives : ( ( ( '1' ) ) | ( ( '2' ) ) | ( ( '3' ) ) | ( ( '4' ) ) | ( ( '5' ) ) | ( ( '6' ) ) | ( ( '7' ) ) | ( ( '8' ) ) | ( ( '0' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:385:1: ( ( ( '1' ) ) | ( ( '2' ) ) | ( ( '3' ) ) | ( ( '4' ) ) | ( ( '5' ) ) | ( ( '6' ) ) | ( ( '7' ) ) | ( ( '8' ) ) | ( ( '0' ) ) )
            int alt3=9;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            case 19:
                {
                alt3=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:386:1: ( ( '1' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:386:1: ( ( '1' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:387:1: ( '1' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:388:1: ( '1' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:388:3: '1'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__AttributeType__Alternatives756); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:393:6: ( ( '2' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:393:6: ( ( '2' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:394:1: ( '2' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:395:1: ( '2' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:395:3: '2'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__AttributeType__Alternatives777); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:400:6: ( ( '3' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:400:6: ( ( '3' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:401:1: ( '3' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:402:1: ( '3' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:402:3: '3'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__AttributeType__Alternatives798); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:407:6: ( ( '4' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:407:6: ( ( '4' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:408:1: ( '4' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:409:1: ( '4' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:409:3: '4'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__AttributeType__Alternatives819); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:414:6: ( ( '5' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:414:6: ( ( '5' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:415:1: ( '5' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:416:1: ( '5' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:416:3: '5'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__AttributeType__Alternatives840); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:421:6: ( ( '6' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:421:6: ( ( '6' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:422:1: ( '6' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:423:1: ( '6' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:423:3: '6'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__AttributeType__Alternatives861); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:428:6: ( ( '7' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:428:6: ( ( '7' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:429:1: ( '7' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:430:1: ( '7' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:430:3: '7'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__AttributeType__Alternatives882); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:435:6: ( ( '8' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:435:6: ( ( '8' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:436:1: ( '8' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:437:1: ( '8' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:437:3: '8'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__AttributeType__Alternatives903); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:442:6: ( ( '0' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:442:6: ( ( '0' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:443:1: ( '0' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:444:1: ( '0' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:444:3: '0'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__AttributeType__Alternatives924); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
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
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__EntityModel__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:456:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:460:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:461:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__0957);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__0960);
            rule__EntityModel__Group__1();

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
    // $ANTLR end "rule__EntityModel__Group__0"


    // $ANTLR start "rule__EntityModel__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:468:1: rule__EntityModel__Group__0__Impl : ( () ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:472:1: ( ( () ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:473:1: ( () )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:473:1: ( () )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:474:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelAction_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:475:1: ()
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:477:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelAccess().getEntityModelAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EntityModel__Group__0__Impl"


    // $ANTLR start "rule__EntityModel__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:487:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:491:1: ( rule__EntityModel__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:492:2: rule__EntityModel__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11018);
            rule__EntityModel__Group__1__Impl();

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
    // $ANTLR end "rule__EntityModel__Group__1"


    // $ANTLR start "rule__EntityModel__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:498:1: rule__EntityModel__Group__1__Impl : ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:502:1: ( ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:503:1: ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:503:1: ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:504:1: ( rule__EntityModel__EntityModelElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelElementsAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:505:1: ( rule__EntityModel__EntityModelElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:505:2: rule__EntityModel__EntityModelElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EntityModel__EntityModelElementsAssignment_1_in_rule__EntityModel__Group__1__Impl1045);
            	    rule__EntityModel__EntityModelElementsAssignment_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelAccess().getEntityModelElementsAssignment_1()); 
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
    // $ANTLR end "rule__EntityModel__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:520:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:524:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:525:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01081);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01084);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:532:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:536:1: ( ( 'entity' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:537:1: ( 'entity' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:537:1: ( 'entity' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:538:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Entity__Group__0__Impl1112); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:551:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:555:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:556:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11143);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11146);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:563:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:567:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:568:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:568:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:569:1: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:570:1: ( rule__Entity__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:570:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1173);
            rule__Entity__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:580:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:584:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:585:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21203);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21206);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:592:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:596:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:597:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:597:1: ( ( rule__Entity__Group_2__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:598:1: ( rule__Entity__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:599:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:599:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1233);
                    rule__Entity__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_2()); 
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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:609:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:613:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:614:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31264);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31267);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:621:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:625:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:626:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:626:1: ( '{' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:627:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Entity__Group__3__Impl1295); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:640:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:644:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:645:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41326);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41329);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:652:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 ) ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:656:1: ( ( ( rule__Entity__Group_4__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:657:1: ( ( rule__Entity__Group_4__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:657:1: ( ( rule__Entity__Group_4__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:658:1: ( rule__Entity__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:659:1: ( rule__Entity__Group_4__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:659:2: rule__Entity__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1356);
            rule__Entity__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:669:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:673:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:674:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51386);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51389);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:681:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )* ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:685:1: ( ( ( rule__Entity__Group_5__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:686:1: ( ( rule__Entity__Group_5__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:686:1: ( ( rule__Entity__Group_5__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:687:1: ( rule__Entity__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:688:1: ( rule__Entity__Group_5__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==25) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:688:2: rule__Entity__Group_5__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1416);
            	    rule__Entity__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:698:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:702:1: ( rule__Entity__Group__6__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:703:2: rule__Entity__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61447);
            rule__Entity__Group__6__Impl();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:709:1: rule__Entity__Group__6__Impl : ( '}' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:713:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:714:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:714:1: ( '}' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:715:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Entity__Group__6__Impl1475); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6()); 
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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:742:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:746:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:747:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01520);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01523);
            rule__Entity__Group_2__1();

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
    // $ANTLR end "rule__Entity__Group_2__0"


    // $ANTLR start "rule__Entity__Group_2__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:754:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:758:1: ( ( 'extends' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:759:1: ( 'extends' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:759:1: ( 'extends' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:760:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group_2__0__Impl1551); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
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
    // $ANTLR end "rule__Entity__Group_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:773:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:777:1: ( rule__Entity__Group_2__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:778:2: rule__Entity__Group_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11582);
            rule__Entity__Group_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__1"


    // $ANTLR start "rule__Entity__Group_2__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:784:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:788:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:789:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:789:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:790:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:791:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:791:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1609);
            rule__Entity__SuperTypeAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
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
    // $ANTLR end "rule__Entity__Group_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:805:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:809:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:810:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__01643);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__01646);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:817:1: rule__Entity__Group_4__0__Impl : ( 'id' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:821:1: ( ( 'id' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:822:1: ( 'id' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:822:1: ( 'id' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:823:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdKeyword_4_0()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group_4__0__Impl1674); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdKeyword_4_0()); 
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
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:836:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:840:1: ( rule__Entity__Group_4__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:841:2: rule__Entity__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__11705);
            rule__Entity__Group_4__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:847:1: rule__Entity__Group_4__1__Impl : ( ( rule__Entity__IdAssignment_4_1 ) ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:851:1: ( ( ( rule__Entity__IdAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:852:1: ( ( rule__Entity__IdAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:852:1: ( ( rule__Entity__IdAssignment_4_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:853:1: ( rule__Entity__IdAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAssignment_4_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:854:1: ( rule__Entity__IdAssignment_4_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:854:2: rule__Entity__IdAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__IdAssignment_4_1_in_rule__Entity__Group_4__1__Impl1732);
            rule__Entity__IdAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAssignment_4_1()); 
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
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:868:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:872:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:873:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__01766);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__01769);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:880:1: rule__Entity__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:884:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:885:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:885:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:886:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_5_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group_5__0__Impl1797); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_5_0()); 
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
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:899:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:903:1: ( rule__Entity__Group_5__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:904:2: rule__Entity__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__11828);
            rule__Entity__Group_5__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:910:1: rule__Entity__Group_5__1__Impl : ( ( rule__Entity__FeaturesAssignment_5_1 ) ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:914:1: ( ( ( rule__Entity__FeaturesAssignment_5_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:915:1: ( ( rule__Entity__FeaturesAssignment_5_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:915:1: ( ( rule__Entity__FeaturesAssignment_5_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:916:1: ( rule__Entity__FeaturesAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:917:1: ( rule__Entity__FeaturesAssignment_5_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:917:2: rule__Entity__FeaturesAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl1855);
            rule__Entity__FeaturesAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesAssignment_5_1()); 
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
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:931:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:935:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:936:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01889);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01892);
            rule__Attribute__Group__1();

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
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:943:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:947:1: ( ( 'attribute' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:948:1: ( 'attribute' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:948:1: ( 'attribute' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:949:1: 'attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Attribute__Group__0__Impl1920); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
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
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:962:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:966:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:967:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11951);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11954);
            rule__Attribute__Group__2();

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
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:974:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:978:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:979:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:979:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:980:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:981:1: ( rule__Attribute__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:981:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1981);
            rule__Attribute__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:991:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:995:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:996:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22011);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22014);
            rule__Attribute__Group__3();

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
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1003:1: rule__Attribute__Group__2__Impl : ( ( '*' )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1007:1: ( ( ( '*' )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1008:1: ( ( '*' )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1008:1: ( ( '*' )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1009:1: ( '*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAsteriskKeyword_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1010:1: ( '*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1011:2: '*'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Attribute__Group__2__Impl2043); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getAsteriskKeyword_2()); 
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
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1022:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1026:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1027:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32076);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32079);
            rule__Attribute__Group__4();

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
    // $ANTLR end "rule__Attribute__Group__3"


    // $ANTLR start "rule__Attribute__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1034:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1038:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1039:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1039:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1040:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Attribute__Group__3__Impl2107); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
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
    // $ANTLR end "rule__Attribute__Group__3__Impl"


    // $ANTLR start "rule__Attribute__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1053:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1057:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1058:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42138);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__42141);
            rule__Attribute__Group__5();

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
    // $ANTLR end "rule__Attribute__Group__4"


    // $ANTLR start "rule__Attribute__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1065:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1069:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1070:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1070:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1071:1: ( rule__Attribute__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1072:1: ( rule__Attribute__TypeAssignment_4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1072:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl2168);
            rule__Attribute__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
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
    // $ANTLR end "rule__Attribute__Group__4__Impl"


    // $ANTLR start "rule__Attribute__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1082:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1086:1: ( rule__Attribute__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1087:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__52198);
            rule__Attribute__Group__5__Impl();

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
    // $ANTLR end "rule__Attribute__Group__5"


    // $ANTLR start "rule__Attribute__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1093:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1097:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1098:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1098:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1099:1: ( rule__Attribute__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1100:1: ( rule__Attribute__Group_5__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1100:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl2225);
                    rule__Attribute__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Attribute__Group__5__Impl"


    // $ANTLR start "rule__Attribute__Group_5__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1122:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1126:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1127:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__02268);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__02271);
            rule__Attribute__Group_5__1();

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
    // $ANTLR end "rule__Attribute__Group_5__0"


    // $ANTLR start "rule__Attribute__Group_5__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1134:1: rule__Attribute__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1138:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1139:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1139:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1140:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_5_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Attribute__Group_5__0__Impl2299); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getColonKeyword_5_0()); 
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
    // $ANTLR end "rule__Attribute__Group_5__0__Impl"


    // $ANTLR start "rule__Attribute__Group_5__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1153:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1157:1: ( rule__Attribute__Group_5__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1158:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__12330);
            rule__Attribute__Group_5__1__Impl();

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
    // $ANTLR end "rule__Attribute__Group_5__1"


    // $ANTLR start "rule__Attribute__Group_5__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1164:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__EnumerationAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1168:1: ( ( ( rule__Attribute__EnumerationAssignment_5_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1169:1: ( ( rule__Attribute__EnumerationAssignment_5_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1169:1: ( ( rule__Attribute__EnumerationAssignment_5_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1170:1: ( rule__Attribute__EnumerationAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationAssignment_5_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1171:1: ( rule__Attribute__EnumerationAssignment_5_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1171:2: rule__Attribute__EnumerationAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__EnumerationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl2357);
            rule__Attribute__EnumerationAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEnumerationAssignment_5_1()); 
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
    // $ANTLR end "rule__Attribute__Group_5__1__Impl"


    // $ANTLR start "rule__Relationship__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1185:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1189:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1190:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__02391);
            rule__Relationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__02394);
            rule__Relationship__Group__1();

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
    // $ANTLR end "rule__Relationship__Group__0"


    // $ANTLR start "rule__Relationship__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1197:1: rule__Relationship__Group__0__Impl : ( 'reference' ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1201:1: ( ( 'reference' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1202:1: ( 'reference' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1202:1: ( 'reference' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1203:1: 'reference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getReferenceKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Relationship__Group__0__Impl2422); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getReferenceKeyword_0()); 
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
    // $ANTLR end "rule__Relationship__Group__0__Impl"


    // $ANTLR start "rule__Relationship__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1216:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1220:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1221:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__12453);
            rule__Relationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__12456);
            rule__Relationship__Group__2();

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
    // $ANTLR end "rule__Relationship__Group__1"


    // $ANTLR start "rule__Relationship__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1228:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__NameAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1232:1: ( ( ( rule__Relationship__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1233:1: ( ( rule__Relationship__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1233:1: ( ( rule__Relationship__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1234:1: ( rule__Relationship__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1235:1: ( rule__Relationship__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1235:2: rule__Relationship__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__NameAssignment_1_in_rule__Relationship__Group__1__Impl2483);
            rule__Relationship__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Relationship__Group__1__Impl"


    // $ANTLR start "rule__Relationship__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1245:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1249:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1250:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__22513);
            rule__Relationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__22516);
            rule__Relationship__Group__3();

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
    // $ANTLR end "rule__Relationship__Group__2"


    // $ANTLR start "rule__Relationship__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1257:1: rule__Relationship__Group__2__Impl : ( ':' ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1261:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1262:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1262:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1263:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getColonKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Relationship__Group__2__Impl2544); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getColonKeyword_2()); 
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
    // $ANTLR end "rule__Relationship__Group__2__Impl"


    // $ANTLR start "rule__Relationship__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1276:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1280:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1281:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__32575);
            rule__Relationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__32578);
            rule__Relationship__Group__4();

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
    // $ANTLR end "rule__Relationship__Group__3"


    // $ANTLR start "rule__Relationship__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1288:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__TargetAssignment_3 ) ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1292:1: ( ( ( rule__Relationship__TargetAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1293:1: ( ( rule__Relationship__TargetAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1293:1: ( ( rule__Relationship__TargetAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1294:1: ( rule__Relationship__TargetAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1295:1: ( rule__Relationship__TargetAssignment_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1295:2: rule__Relationship__TargetAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__TargetAssignment_3_in_rule__Relationship__Group__3__Impl2605);
            rule__Relationship__TargetAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTargetAssignment_3()); 
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
    // $ANTLR end "rule__Relationship__Group__3__Impl"


    // $ANTLR start "rule__Relationship__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1305:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1309:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1310:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__42635);
            rule__Relationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__42638);
            rule__Relationship__Group__5();

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
    // $ANTLR end "rule__Relationship__Group__4"


    // $ANTLR start "rule__Relationship__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1317:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__Group_4__0 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1321:1: ( ( ( rule__Relationship__Group_4__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1322:1: ( ( rule__Relationship__Group_4__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1322:1: ( ( rule__Relationship__Group_4__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1323:1: ( rule__Relationship__Group_4__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1324:1: ( rule__Relationship__Group_4__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1324:2: rule__Relationship__Group_4__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__0_in_rule__Relationship__Group__4__Impl2665);
            rule__Relationship__Group_4__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup_4()); 
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
    // $ANTLR end "rule__Relationship__Group__4__Impl"


    // $ANTLR start "rule__Relationship__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1334:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1338:1: ( rule__Relationship__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1339:2: rule__Relationship__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__52695);
            rule__Relationship__Group__5__Impl();

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
    // $ANTLR end "rule__Relationship__Group__5"


    // $ANTLR start "rule__Relationship__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1345:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__Group_5__0 )? ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1349:1: ( ( ( rule__Relationship__Group_5__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1350:1: ( ( rule__Relationship__Group_5__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1350:1: ( ( rule__Relationship__Group_5__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1351:1: ( rule__Relationship__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1352:1: ( rule__Relationship__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1352:2: rule__Relationship__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_5__0_in_rule__Relationship__Group__5__Impl2722);
                    rule__Relationship__Group_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup_5()); 
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
    // $ANTLR end "rule__Relationship__Group__5__Impl"


    // $ANTLR start "rule__Relationship__Group_4__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1374:1: rule__Relationship__Group_4__0 : rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1 ;
    public final void rule__Relationship__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1378:1: ( rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1379:2: rule__Relationship__Group_4__0__Impl rule__Relationship__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__0__Impl_in_rule__Relationship__Group_4__02765);
            rule__Relationship__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__1_in_rule__Relationship__Group_4__02768);
            rule__Relationship__Group_4__1();

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
    // $ANTLR end "rule__Relationship__Group_4__0"


    // $ANTLR start "rule__Relationship__Group_4__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1386:1: rule__Relationship__Group_4__0__Impl : ( '[' ) ;
    public final void rule__Relationship__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1390:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1391:1: ( '[' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1391:1: ( '[' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1392:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4_0()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Relationship__Group_4__0__Impl2796); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4_0()); 
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
    // $ANTLR end "rule__Relationship__Group_4__0__Impl"


    // $ANTLR start "rule__Relationship__Group_4__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1405:1: rule__Relationship__Group_4__1 : rule__Relationship__Group_4__1__Impl rule__Relationship__Group_4__2 ;
    public final void rule__Relationship__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1409:1: ( rule__Relationship__Group_4__1__Impl rule__Relationship__Group_4__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1410:2: rule__Relationship__Group_4__1__Impl rule__Relationship__Group_4__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__1__Impl_in_rule__Relationship__Group_4__12827);
            rule__Relationship__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__2_in_rule__Relationship__Group_4__12830);
            rule__Relationship__Group_4__2();

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
    // $ANTLR end "rule__Relationship__Group_4__1"


    // $ANTLR start "rule__Relationship__Group_4__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1417:1: rule__Relationship__Group_4__1__Impl : ( ( rule__Relationship__LowerBoundAssignment_4_1 ) ) ;
    public final void rule__Relationship__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1421:1: ( ( ( rule__Relationship__LowerBoundAssignment_4_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1422:1: ( ( rule__Relationship__LowerBoundAssignment_4_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1422:1: ( ( rule__Relationship__LowerBoundAssignment_4_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1423:1: ( rule__Relationship__LowerBoundAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLowerBoundAssignment_4_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1424:1: ( rule__Relationship__LowerBoundAssignment_4_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1424:2: rule__Relationship__LowerBoundAssignment_4_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__LowerBoundAssignment_4_1_in_rule__Relationship__Group_4__1__Impl2857);
            rule__Relationship__LowerBoundAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLowerBoundAssignment_4_1()); 
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
    // $ANTLR end "rule__Relationship__Group_4__1__Impl"


    // $ANTLR start "rule__Relationship__Group_4__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1434:1: rule__Relationship__Group_4__2 : rule__Relationship__Group_4__2__Impl rule__Relationship__Group_4__3 ;
    public final void rule__Relationship__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1438:1: ( rule__Relationship__Group_4__2__Impl rule__Relationship__Group_4__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1439:2: rule__Relationship__Group_4__2__Impl rule__Relationship__Group_4__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__2__Impl_in_rule__Relationship__Group_4__22887);
            rule__Relationship__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__3_in_rule__Relationship__Group_4__22890);
            rule__Relationship__Group_4__3();

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
    // $ANTLR end "rule__Relationship__Group_4__2"


    // $ANTLR start "rule__Relationship__Group_4__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1446:1: rule__Relationship__Group_4__2__Impl : ( '...' ) ;
    public final void rule__Relationship__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1450:1: ( ( '...' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1451:1: ( '...' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1451:1: ( '...' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1452:1: '...'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getFullStopFullStopFullStopKeyword_4_2()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Relationship__Group_4__2__Impl2918); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getFullStopFullStopFullStopKeyword_4_2()); 
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
    // $ANTLR end "rule__Relationship__Group_4__2__Impl"


    // $ANTLR start "rule__Relationship__Group_4__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1465:1: rule__Relationship__Group_4__3 : rule__Relationship__Group_4__3__Impl rule__Relationship__Group_4__4 ;
    public final void rule__Relationship__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1469:1: ( rule__Relationship__Group_4__3__Impl rule__Relationship__Group_4__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1470:2: rule__Relationship__Group_4__3__Impl rule__Relationship__Group_4__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__3__Impl_in_rule__Relationship__Group_4__32949);
            rule__Relationship__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__4_in_rule__Relationship__Group_4__32952);
            rule__Relationship__Group_4__4();

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
    // $ANTLR end "rule__Relationship__Group_4__3"


    // $ANTLR start "rule__Relationship__Group_4__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1477:1: rule__Relationship__Group_4__3__Impl : ( ( rule__Relationship__UpperBoundAssignment_4_3 ) ) ;
    public final void rule__Relationship__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1481:1: ( ( ( rule__Relationship__UpperBoundAssignment_4_3 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1482:1: ( ( rule__Relationship__UpperBoundAssignment_4_3 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1482:1: ( ( rule__Relationship__UpperBoundAssignment_4_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1483:1: ( rule__Relationship__UpperBoundAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getUpperBoundAssignment_4_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1484:1: ( rule__Relationship__UpperBoundAssignment_4_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1484:2: rule__Relationship__UpperBoundAssignment_4_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__UpperBoundAssignment_4_3_in_rule__Relationship__Group_4__3__Impl2979);
            rule__Relationship__UpperBoundAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getUpperBoundAssignment_4_3()); 
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
    // $ANTLR end "rule__Relationship__Group_4__3__Impl"


    // $ANTLR start "rule__Relationship__Group_4__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1494:1: rule__Relationship__Group_4__4 : rule__Relationship__Group_4__4__Impl ;
    public final void rule__Relationship__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1498:1: ( rule__Relationship__Group_4__4__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1499:2: rule__Relationship__Group_4__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_4__4__Impl_in_rule__Relationship__Group_4__43009);
            rule__Relationship__Group_4__4__Impl();

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
    // $ANTLR end "rule__Relationship__Group_4__4"


    // $ANTLR start "rule__Relationship__Group_4__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1505:1: rule__Relationship__Group_4__4__Impl : ( ']' ) ;
    public final void rule__Relationship__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1509:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1510:1: ( ']' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1510:1: ( ']' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1511:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_4_4()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Relationship__Group_4__4__Impl3037); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_4_4()); 
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
    // $ANTLR end "rule__Relationship__Group_4__4__Impl"


    // $ANTLR start "rule__Relationship__Group_5__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1534:1: rule__Relationship__Group_5__0 : rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 ;
    public final void rule__Relationship__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1538:1: ( rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1539:2: rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_5__0__Impl_in_rule__Relationship__Group_5__03078);
            rule__Relationship__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_5__1_in_rule__Relationship__Group_5__03081);
            rule__Relationship__Group_5__1();

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
    // $ANTLR end "rule__Relationship__Group_5__0"


    // $ANTLR start "rule__Relationship__Group_5__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1546:1: rule__Relationship__Group_5__0__Impl : ( 'opposite-of' ) ;
    public final void rule__Relationship__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1550:1: ( ( 'opposite-of' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1551:1: ( 'opposite-of' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1551:1: ( 'opposite-of' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1552:1: 'opposite-of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeOfKeyword_5_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Relationship__Group_5__0__Impl3109); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeOfKeyword_5_0()); 
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
    // $ANTLR end "rule__Relationship__Group_5__0__Impl"


    // $ANTLR start "rule__Relationship__Group_5__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1565:1: rule__Relationship__Group_5__1 : rule__Relationship__Group_5__1__Impl ;
    public final void rule__Relationship__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1569:1: ( rule__Relationship__Group_5__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1570:2: rule__Relationship__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_5__1__Impl_in_rule__Relationship__Group_5__13140);
            rule__Relationship__Group_5__1__Impl();

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
    // $ANTLR end "rule__Relationship__Group_5__1"


    // $ANTLR start "rule__Relationship__Group_5__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1576:1: rule__Relationship__Group_5__1__Impl : ( ( rule__Relationship__OppositeAssignment_5_1 ) ) ;
    public final void rule__Relationship__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1580:1: ( ( ( rule__Relationship__OppositeAssignment_5_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1581:1: ( ( rule__Relationship__OppositeAssignment_5_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1581:1: ( ( rule__Relationship__OppositeAssignment_5_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1582:1: ( rule__Relationship__OppositeAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeAssignment_5_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1583:1: ( rule__Relationship__OppositeAssignment_5_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1583:2: rule__Relationship__OppositeAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__OppositeAssignment_5_1_in_rule__Relationship__Group_5__1__Impl3167);
            rule__Relationship__OppositeAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeAssignment_5_1()); 
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
    // $ANTLR end "rule__Relationship__Group_5__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1597:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1601:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1602:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__03201);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03204);
            rule__Enumeration__Group__1();

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
    // $ANTLR end "rule__Enumeration__Group__0"


    // $ANTLR start "rule__Enumeration__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1609:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1613:1: ( ( 'enum' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1614:1: ( 'enum' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1614:1: ( 'enum' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1615:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Enumeration__Group__0__Impl3232); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
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
    // $ANTLR end "rule__Enumeration__Group__0__Impl"


    // $ANTLR start "rule__Enumeration__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1628:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1632:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1633:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__13263);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13266);
            rule__Enumeration__Group__2();

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
    // $ANTLR end "rule__Enumeration__Group__1"


    // $ANTLR start "rule__Enumeration__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1640:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1644:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1645:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1645:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1646:1: ( rule__Enumeration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1647:1: ( rule__Enumeration__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1647:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl3293);
            rule__Enumeration__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
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
    // $ANTLR end "rule__Enumeration__Group__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1657:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1661:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1662:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__23323);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23326);
            rule__Enumeration__Group__3();

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
    // $ANTLR end "rule__Enumeration__Group__2"


    // $ANTLR start "rule__Enumeration__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1669:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1673:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1674:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1674:1: ( '{' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1675:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Enumeration__Group__2__Impl3354); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
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
    // $ANTLR end "rule__Enumeration__Group__2__Impl"


    // $ANTLR start "rule__Enumeration__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1688:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1692:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1693:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__33385);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33388);
            rule__Enumeration__Group__4();

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
    // $ANTLR end "rule__Enumeration__Group__3"


    // $ANTLR start "rule__Enumeration__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1700:1: rule__Enumeration__Group__3__Impl : ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1704:1: ( ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1705:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1705:1: ( ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1706:1: ( ( rule__Enumeration__LiteralsAssignment_3 ) ) ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1706:1: ( ( rule__Enumeration__LiteralsAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1707:1: ( rule__Enumeration__LiteralsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1708:1: ( rule__Enumeration__LiteralsAssignment_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1708:2: rule__Enumeration__LiteralsAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl3417);
            rule__Enumeration__LiteralsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            }

            }

            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1711:1: ( ( rule__Enumeration__LiteralsAssignment_3 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1712:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1713:1: ( rule__Enumeration__LiteralsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1713:2: rule__Enumeration__LiteralsAssignment_3
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl3429);
            	    rule__Enumeration__LiteralsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3()); 
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
    // $ANTLR end "rule__Enumeration__Group__3__Impl"


    // $ANTLR start "rule__Enumeration__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1724:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1728:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1729:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__43462);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43465);
            rule__Enumeration__Group__5();

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
    // $ANTLR end "rule__Enumeration__Group__4"


    // $ANTLR start "rule__Enumeration__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1736:1: rule__Enumeration__Group__4__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1740:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1741:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1741:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1742:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getCommaKeyword_4()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Enumeration__Group__4__Impl3493); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getCommaKeyword_4()); 
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
    // $ANTLR end "rule__Enumeration__Group__4__Impl"


    // $ANTLR start "rule__Enumeration__Group__5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1755:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1759:1: ( rule__Enumeration__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1760:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__53524);
            rule__Enumeration__Group__5__Impl();

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
    // $ANTLR end "rule__Enumeration__Group__5"


    // $ANTLR start "rule__Enumeration__Group__5__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1766:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1770:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1771:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1771:1: ( '}' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1772:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Enumeration__Group__5__Impl3552); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
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
    // $ANTLR end "rule__Enumeration__Group__5__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1797:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1801:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1802:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__03595);
            rule__Literal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__03598);
            rule__Literal__Group__1();

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
    // $ANTLR end "rule__Literal__Group__0"


    // $ANTLR start "rule__Literal__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1809:1: rule__Literal__Group__0__Impl : ( ( rule__Literal__NameAssignment_0 ) ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1813:1: ( ( ( rule__Literal__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1814:1: ( ( rule__Literal__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1814:1: ( ( rule__Literal__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1815:1: ( rule__Literal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1816:1: ( rule__Literal__NameAssignment_0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1816:2: rule__Literal__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__NameAssignment_0_in_rule__Literal__Group__0__Impl3625);
            rule__Literal__NameAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameAssignment_0()); 
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
    // $ANTLR end "rule__Literal__Group__0__Impl"


    // $ANTLR start "rule__Literal__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1826:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl rule__Literal__Group__2 ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1830:1: ( rule__Literal__Group__1__Impl rule__Literal__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1831:2: rule__Literal__Group__1__Impl rule__Literal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__13655);
            rule__Literal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__13658);
            rule__Literal__Group__2();

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
    // $ANTLR end "rule__Literal__Group__1"


    // $ANTLR start "rule__Literal__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1838:1: rule__Literal__Group__1__Impl : ( '=' ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1842:1: ( ( '=' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1843:1: ( '=' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1843:1: ( '=' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1844:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Literal__Group__1__Impl3686); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getEqualsSignKeyword_1()); 
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
    // $ANTLR end "rule__Literal__Group__1__Impl"


    // $ANTLR start "rule__Literal__Group__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1857:1: rule__Literal__Group__2 : rule__Literal__Group__2__Impl rule__Literal__Group__3 ;
    public final void rule__Literal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1861:1: ( rule__Literal__Group__2__Impl rule__Literal__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1862:2: rule__Literal__Group__2__Impl rule__Literal__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__23717);
            rule__Literal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__3_in_rule__Literal__Group__23720);
            rule__Literal__Group__3();

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
    // $ANTLR end "rule__Literal__Group__2"


    // $ANTLR start "rule__Literal__Group__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1869:1: rule__Literal__Group__2__Impl : ( '\"' ) ;
    public final void rule__Literal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1873:1: ( ( '\"' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1874:1: ( '\"' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1874:1: ( '\"' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1875:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getQuotationMarkKeyword_2()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Literal__Group__2__Impl3748); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getQuotationMarkKeyword_2()); 
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
    // $ANTLR end "rule__Literal__Group__2__Impl"


    // $ANTLR start "rule__Literal__Group__3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1888:1: rule__Literal__Group__3 : rule__Literal__Group__3__Impl rule__Literal__Group__4 ;
    public final void rule__Literal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1892:1: ( rule__Literal__Group__3__Impl rule__Literal__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1893:2: rule__Literal__Group__3__Impl rule__Literal__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__3__Impl_in_rule__Literal__Group__33779);
            rule__Literal__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__4_in_rule__Literal__Group__33782);
            rule__Literal__Group__4();

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
    // $ANTLR end "rule__Literal__Group__3"


    // $ANTLR start "rule__Literal__Group__3__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1900:1: rule__Literal__Group__3__Impl : ( ( rule__Literal__ValueAssignment_3 ) ) ;
    public final void rule__Literal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1904:1: ( ( ( rule__Literal__ValueAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1905:1: ( ( rule__Literal__ValueAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1905:1: ( ( rule__Literal__ValueAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1906:1: ( rule__Literal__ValueAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1907:1: ( rule__Literal__ValueAssignment_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1907:2: rule__Literal__ValueAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__ValueAssignment_3_in_rule__Literal__Group__3__Impl3809);
            rule__Literal__ValueAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_3()); 
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
    // $ANTLR end "rule__Literal__Group__3__Impl"


    // $ANTLR start "rule__Literal__Group__4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1917:1: rule__Literal__Group__4 : rule__Literal__Group__4__Impl ;
    public final void rule__Literal__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1921:1: ( rule__Literal__Group__4__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1922:2: rule__Literal__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__4__Impl_in_rule__Literal__Group__43839);
            rule__Literal__Group__4__Impl();

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
    // $ANTLR end "rule__Literal__Group__4"


    // $ANTLR start "rule__Literal__Group__4__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1928:1: rule__Literal__Group__4__Impl : ( '\"' ) ;
    public final void rule__Literal__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1932:1: ( ( '\"' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1933:1: ( '\"' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1933:1: ( '\"' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1934:1: '\"'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getQuotationMarkKeyword_4()); 
            }
            match(input,36,FollowSets000.FOLLOW_36_in_rule__Literal__Group__4__Impl3867); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getQuotationMarkKeyword_4()); 
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
    // $ANTLR end "rule__Literal__Group__4__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1958:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1962:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1963:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03909);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03912);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1970:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1974:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1975:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1975:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1976:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3939); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1987:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1991:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1992:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13968);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1998:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2002:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2003:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2003:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2004:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2005:1: ( rule__QualifiedName__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2005:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3995);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2019:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2023:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2024:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04030);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04033);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2031:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2035:1: ( ( ( '.' ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2036:1: ( ( '.' ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2036:1: ( ( '.' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2037:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2038:1: ( '.' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2039:2: '.'
            {
            match(input,37,FollowSets000.FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl4062); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2050:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2054:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2055:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14094);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2061:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2065:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2066:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2066:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2067:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4121); if (state.failed) return ;
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


    // $ANTLR start "rule__EntityModel__EntityModelElementsAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2083:1: rule__EntityModel__EntityModelElementsAssignment_1 : ( ruleEntityModelElement ) ;
    public final void rule__EntityModel__EntityModelElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2087:1: ( ( ruleEntityModelElement ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2088:1: ( ruleEntityModelElement )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2088:1: ( ruleEntityModelElement )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2089:1: ruleEntityModelElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_rule__EntityModel__EntityModelElementsAssignment_14159);
            ruleEntityModelElement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_1_0()); 
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
    // $ANTLR end "rule__EntityModel__EntityModelElementsAssignment_1"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2099:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2103:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2104:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2104:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2105:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14191); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Entity__NameAssignment_1"


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2114:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2118:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2119:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2119:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2120:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2121:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2122:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_14226); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__Entity__IdAssignment_4_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2133:1: rule__Entity__IdAssignment_4_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__IdAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2137:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2138:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2138:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2139:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAttributeCrossReference_4_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2140:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2141:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAttributeQualifiedNameParserRuleCall_4_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Entity__IdAssignment_4_14265);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAttributeQualifiedNameParserRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAttributeCrossReference_4_1_0()); 
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
    // $ANTLR end "rule__Entity__IdAssignment_4_1"


    // $ANTLR start "rule__Entity__FeaturesAssignment_5_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2152:1: rule__Entity__FeaturesAssignment_5_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2156:1: ( ( ruleFeature ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2157:1: ( ruleFeature )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2157:1: ( ruleFeature )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2158:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_14300);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_5_1_0()); 
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
    // $ANTLR end "rule__Entity__FeaturesAssignment_5_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2167:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2171:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2172:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2172:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2173:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_14331); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__TypeAssignment_4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2182:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2186:1: ( ( ruleAttributeType ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2187:1: ( ruleAttributeType )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2187:1: ( ruleAttributeType )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2188:1: ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_44362);
            ruleAttributeType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
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
    // $ANTLR end "rule__Attribute__TypeAssignment_4"


    // $ANTLR start "rule__Attribute__EnumerationAssignment_5_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2197:1: rule__Attribute__EnumerationAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__EnumerationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2201:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2202:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2202:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2203:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2204:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2205:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationEnumerationQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Attribute__EnumerationAssignment_5_14397);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEnumerationEnumerationQualifiedNameParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__Attribute__EnumerationAssignment_5_1"


    // $ANTLR start "rule__Relationship__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2216:1: rule__Relationship__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relationship__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2220:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2221:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2221:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2222:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Relationship__NameAssignment_14432); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Relationship__NameAssignment_1"


    // $ANTLR start "rule__Relationship__TargetAssignment_3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2231:1: rule__Relationship__TargetAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2235:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2236:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2236:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2237:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2238:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2239:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetEntityQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Relationship__TargetAssignment_34467);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTargetEntityQualifiedNameParserRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
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
    // $ANTLR end "rule__Relationship__TargetAssignment_3"


    // $ANTLR start "rule__Relationship__LowerBoundAssignment_4_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2250:1: rule__Relationship__LowerBoundAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Relationship__LowerBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2254:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2255:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2255:1: ( RULE_INT )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2256:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLowerBoundINTTerminalRuleCall_4_1_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Relationship__LowerBoundAssignment_4_14502); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLowerBoundINTTerminalRuleCall_4_1_0()); 
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
    // $ANTLR end "rule__Relationship__LowerBoundAssignment_4_1"


    // $ANTLR start "rule__Relationship__UpperBoundAssignment_4_3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2265:1: rule__Relationship__UpperBoundAssignment_4_3 : ( RULE_INT ) ;
    public final void rule__Relationship__UpperBoundAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2269:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2270:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2270:1: ( RULE_INT )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2271:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getUpperBoundINTTerminalRuleCall_4_3_0()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__Relationship__UpperBoundAssignment_4_34533); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getUpperBoundINTTerminalRuleCall_4_3_0()); 
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
    // $ANTLR end "rule__Relationship__UpperBoundAssignment_4_3"


    // $ANTLR start "rule__Relationship__OppositeAssignment_5_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2280:1: rule__Relationship__OppositeAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__OppositeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2284:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2285:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2285:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2286:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_5_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2287:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2288:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeRelationshipQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Relationship__OppositeAssignment_5_14568);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeRelationshipQualifiedNameParserRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_5_1_0()); 
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
    // $ANTLR end "rule__Relationship__OppositeAssignment_5_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2299:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2303:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2304:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2304:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2305:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14603); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
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
    // $ANTLR end "rule__Enumeration__NameAssignment_1"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2314:1: rule__Enumeration__LiteralsAssignment_3 : ( ruleLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2318:1: ( ( ruleLiteral ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2319:1: ( ruleLiteral )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2319:1: ( ruleLiteral )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2320:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_34634);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0()); 
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
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3"


    // $ANTLR start "rule__Literal__NameAssignment_0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2329:1: rule__Literal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Literal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2333:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2334:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2334:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2335:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_04665); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
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
    // $ANTLR end "rule__Literal__NameAssignment_0"


    // $ANTLR start "rule__Literal__ValueAssignment_3"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2344:1: rule__Literal__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Literal__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2348:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2349:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2349:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2350:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Literal__ValueAssignment_34696); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_3_0()); 
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
    // $ANTLR end "rule__Literal__ValueAssignment_3"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModelElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModelElement__Alternatives_in_ruleEntityModelElement160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity189 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity196 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute249 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute256 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute282 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship309 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship316 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature369 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature402 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration429 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration436 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration462 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral489 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral496 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__0_in_ruleLiteral522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName551 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName558 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName584 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType621 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModelElement__Alternatives656 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_rule__EntityModelElement__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Feature__Alternatives706 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_rule__Feature__Alternatives723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__AttributeType__Alternatives756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AttributeType__Alternatives777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AttributeType__Alternatives798 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AttributeType__Alternatives819 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AttributeType__Alternatives840 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AttributeType__Alternatives861 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AttributeType__Alternatives882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AttributeType__Alternatives903 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AttributeType__Alternatives924 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__0957 = new BitSet(new long[]{0x0000000400100000L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__0960 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__EntityModelElementsAssignment_1_in_rule__EntityModel__Group__1__Impl1045 = new BitSet(new long[]{0x0000000400100002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01081 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01084 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl1112 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11143 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11146 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21203 = new BitSet(new long[]{0x0000000000A00000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31264 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Entity__Group__3__Impl1295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41326 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0_in_rule__Entity__Group__4__Impl1356 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51386 = new BitSet(new long[]{0x0000000002400000L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51389 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0_in_rule__Entity__Group__5__Impl1416 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Entity__Group__6__Impl1475 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01520 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group_2__0__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11582 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__0__Impl_in_rule__Entity__Group_4__01643 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1_in_rule__Entity__Group_4__01646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group_4__0__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_4__1__Impl_in_rule__Entity__Group_4__11705 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__IdAssignment_4_1_in_rule__Entity__Group_4__1__Impl1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__0__Impl_in_rule__Entity__Group_5__01766 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1_in_rule__Entity__Group_5__01769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group_5__0__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_5__1__Impl_in_rule__Entity__Group_5__11828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_5_1_in_rule__Entity__Group_5__1__Impl1855 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__01889 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__01892 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Attribute__Group__0__Impl1920 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__11951 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__11954 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl1981 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22011 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22014 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Attribute__Group__2__Impl2043 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32076 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32079 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Attribute__Group__3__Impl2107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42138 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__42141 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl2168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__52198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl2225 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__02268 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__02271 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Attribute__Group_5__0__Impl2299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__12330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__EnumerationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__02391 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__02394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Relationship__Group__0__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__12453 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__12456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__NameAssignment_1_in_rule__Relationship__Group__1__Impl2483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__22513 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__22516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Relationship__Group__2__Impl2544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__32575 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__32578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_3_in_rule__Relationship__Group__3__Impl2605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__42635 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__42638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__0_in_rule__Relationship__Group__4__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__52695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_5__0_in_rule__Relationship__Group__5__Impl2722 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__0__Impl_in_rule__Relationship__Group_4__02765 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__1_in_rule__Relationship__Group_4__02768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Relationship__Group_4__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__1__Impl_in_rule__Relationship__Group_4__12827 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__2_in_rule__Relationship__Group_4__12830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__LowerBoundAssignment_4_1_in_rule__Relationship__Group_4__1__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__2__Impl_in_rule__Relationship__Group_4__22887 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__3_in_rule__Relationship__Group_4__22890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Relationship__Group_4__2__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__3__Impl_in_rule__Relationship__Group_4__32949 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__4_in_rule__Relationship__Group_4__32952 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__UpperBoundAssignment_4_3_in_rule__Relationship__Group_4__3__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_4__4__Impl_in_rule__Relationship__Group_4__43009 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Relationship__Group_4__4__Impl3037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_5__0__Impl_in_rule__Relationship__Group_5__03078 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group_5__1_in_rule__Relationship__Group_5__03081 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Relationship__Group_5__0__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_5__1__Impl_in_rule__Relationship__Group_5__13140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__OppositeAssignment_5_1_in_rule__Relationship__Group_5__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__03201 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03204 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Enumeration__Group__0__Impl3232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__13263 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13266 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl3293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__23323 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__2__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__33385 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl3417 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_in_rule__Enumeration__Group__3__Impl3429 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__43462 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43465 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Enumeration__Group__4__Impl3493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__53524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Enumeration__Group__5__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__03595 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__03598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_in_rule__Literal__Group__0__Impl3625 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__13655 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__13658 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Literal__Group__1__Impl3686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__23717 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Literal__Group__3_in_rule__Literal__Group__23720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Literal__Group__2__Impl3748 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__3__Impl_in_rule__Literal__Group__33779 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_rule__Literal__Group__4_in_rule__Literal__Group__33782 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__ValueAssignment_3_in_rule__Literal__Group__3__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__4__Impl_in_rule__Literal__Group__43839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__Literal__Group__4__Impl3867 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__03909 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__03912 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__13968 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl3995 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04030 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04033 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl4062 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14094 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_rule__EntityModel__EntityModelElementsAssignment_14159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14191 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_14226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__IdAssignment_4_14265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_5_14300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_14331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_44362 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__EnumerationAssignment_5_14397 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__NameAssignment_14432 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__TargetAssignment_34467 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Relationship__LowerBoundAssignment_4_14502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__Relationship__UpperBoundAssignment_4_34533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__OppositeAssignment_5_14568 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_14603 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_34634 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_04665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__ValueAssignment_34696 = new BitSet(new long[]{0x0000000000000002L});
    }


}