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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'String'", "'Integer'", "'Text'", "'Date'", "'Time'", "'Email'", "'Boolean'", "'Year'", "'None'", "'entity'", "'{'", "'id'", "','", "'}'", "'extends'", "'attribute'", "'*'", "':'", "'reference'", "'['", "'..'", "']'", "'opposite-of'", "'enum'", "'='", "'-'", "'.'"
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
    public static final int RULE_INT=4;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:117:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:118:1: ( ruleEntity EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:119:1: ruleEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntity_in_entryRuleEntity187);
            ruleEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEntity194); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:126:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:130:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:131:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:131:1: ( ( rule__Entity__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:132:1: ( rule__Entity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:133:1: ( rule__Entity__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:133:2: rule__Entity__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0_in_ruleEntity220);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:145:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:146:1: ( ruleAttribute EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:147:1: ruleAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_entryRuleAttribute247);
            ruleAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAttribute254); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:154:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:158:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:159:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:159:1: ( ( rule__Attribute__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:160:1: ( rule__Attribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:161:1: ( rule__Attribute__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:161:2: rule__Attribute__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0_in_ruleAttribute280);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:173:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:174:1: ( ruleRelationship EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:175:1: ruleRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_entryRuleRelationship307);
            ruleRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRelationship314); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:182:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:186:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:187:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:187:1: ( ( rule__Relationship__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:188:1: ( rule__Relationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:189:1: ( rule__Relationship__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:189:2: rule__Relationship__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0_in_ruleRelationship340);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:201:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:202:1: ( ruleFeature EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:203:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_entryRuleFeature367);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleFeature374); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:210:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:214:2: ( ( ( rule__Feature__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:215:1: ( ( rule__Feature__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:215:1: ( ( rule__Feature__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:216:1: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:217:1: ( rule__Feature__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:217:2: rule__Feature__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__Feature__Alternatives_in_ruleFeature400);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:229:1: entryRuleEnumeration : ruleEnumeration EOF ;
    public final void entryRuleEnumeration() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:230:1: ( ruleEnumeration EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:231:1: ruleEnumeration EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_entryRuleEnumeration427);
            ruleEnumeration();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEnumeration434); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:238:1: ruleEnumeration : ( ( rule__Enumeration__Group__0 ) ) ;
    public final void ruleEnumeration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:242:2: ( ( ( rule__Enumeration__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:243:1: ( ( rule__Enumeration__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:243:1: ( ( rule__Enumeration__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:244:1: ( rule__Enumeration__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:245:1: ( rule__Enumeration__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:245:2: rule__Enumeration__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration460);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:257:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:258:1: ( ruleLiteral EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:259:1: ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_entryRuleLiteral487);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleLiteral494); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:266:1: ruleLiteral : ( ( rule__Literal__Group__0 ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:270:2: ( ( ( rule__Literal__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:271:1: ( ( rule__Literal__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:271:1: ( ( rule__Literal__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:272:1: ( rule__Literal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:273:1: ( rule__Literal__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:273:2: rule__Literal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__0_in_ruleLiteral520);
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


    // $ANTLR start "entryRuleEInt"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:285:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:286:1: ( ruleEInt EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:287:1: ruleEInt EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt547);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt554); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:294:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:298:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:299:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:299:1: ( ( rule__EInt__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:300:1: ( rule__EInt__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:301:1: ( rule__EInt__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:301:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt580);
            rule__EInt__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getGroup()); 
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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleQualifiedName"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:313:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:314:1: ( ruleQualifiedName EOF )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:315:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName607);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleQualifiedName614); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:322:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:326:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:327:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:327:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:328:1: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:329:1: ( rule__QualifiedName__Group__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:329:2: rule__QualifiedName__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName640);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:342:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:346:1: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:347:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:347:1: ( ( rule__AttributeType__Alternatives ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:348:1: ( rule__AttributeType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:349:1: ( rule__AttributeType__Alternatives )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:349:2: rule__AttributeType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType677);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:360:1: rule__EntityModelElement__Alternatives : ( ( ruleEntity ) | ( ruleEnumeration ) );
    public final void rule__EntityModelElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:364:1: ( ( ruleEntity ) | ( ruleEnumeration ) )
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:365:1: ( ruleEntity )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:365:1: ( ruleEntity )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:366:1: ruleEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityModelElementAccess().getEntityParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEntity_in_rule__EntityModelElement__Alternatives712);
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:371:6: ( ruleEnumeration )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:371:6: ( ruleEnumeration )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:372:1: ruleEnumeration
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEntityModelElementAccess().getEnumerationParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleEnumeration_in_rule__EntityModelElement__Alternatives729);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:382:1: rule__Feature__Alternatives : ( ( ruleAttribute ) | ( ruleRelationship ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:386:1: ( ( ruleAttribute ) | ( ruleRelationship ) )
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:387:1: ( ruleAttribute )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:387:1: ( ruleAttribute )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:388:1: ruleAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleAttribute_in_rule__Feature__Alternatives761);
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:393:6: ( ruleRelationship )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:393:6: ( ruleRelationship )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:394:1: ruleRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getRelationshipParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_ruleRelationship_in_rule__Feature__Alternatives778);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:404:1: rule__AttributeType__Alternatives : ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Text' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Email' ) ) | ( ( 'Boolean' ) ) | ( ( 'Year' ) ) | ( ( 'None' ) ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:408:1: ( ( ( 'String' ) ) | ( ( 'Integer' ) ) | ( ( 'Text' ) ) | ( ( 'Date' ) ) | ( ( 'Time' ) ) | ( ( 'Email' ) ) | ( ( 'Boolean' ) ) | ( ( 'Year' ) ) | ( ( 'None' ) ) )
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
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:409:1: ( ( 'String' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:409:1: ( ( 'String' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:410:1: ( 'String' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:411:1: ( 'String' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:411:3: 'String'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__AttributeType__Alternatives811); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getStringEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:416:6: ( ( 'Integer' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:416:6: ( ( 'Integer' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:417:1: ( 'Integer' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:418:1: ( 'Integer' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:418:3: 'Integer'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__AttributeType__Alternatives832); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getIntegerEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:423:6: ( ( 'Text' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:423:6: ( ( 'Text' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:424:1: ( 'Text' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:425:1: ( 'Text' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:425:3: 'Text'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__AttributeType__Alternatives853); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getTextEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:430:6: ( ( 'Date' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:430:6: ( ( 'Date' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:431:1: ( 'Date' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:432:1: ( 'Date' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:432:3: 'Date'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__AttributeType__Alternatives874); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getDateEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:437:6: ( ( 'Time' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:437:6: ( ( 'Time' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:438:1: ( 'Time' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:439:1: ( 'Time' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:439:3: 'Time'
                    {
                    match(input,15,FollowSets000.FOLLOW_15_in_rule__AttributeType__Alternatives895); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getTimeEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:444:6: ( ( 'Email' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:444:6: ( ( 'Email' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:445:1: ( 'Email' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:446:1: ( 'Email' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:446:3: 'Email'
                    {
                    match(input,16,FollowSets000.FOLLOW_16_in_rule__AttributeType__Alternatives916); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getEmailEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:451:6: ( ( 'Boolean' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:451:6: ( ( 'Boolean' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:452:1: ( 'Boolean' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:453:1: ( 'Boolean' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:453:3: 'Boolean'
                    {
                    match(input,17,FollowSets000.FOLLOW_17_in_rule__AttributeType__Alternatives937); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getBooleanEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:458:6: ( ( 'Year' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:458:6: ( ( 'Year' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:459:1: ( 'Year' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:460:1: ( 'Year' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:460:3: 'Year'
                    {
                    match(input,18,FollowSets000.FOLLOW_18_in_rule__AttributeType__Alternatives958); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeTypeAccess().getYearEnumLiteralDeclaration_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:465:6: ( ( 'None' ) )
                    {
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:465:6: ( ( 'None' ) )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:466:1: ( 'None' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeTypeAccess().getNoneEnumLiteralDeclaration_8()); 
                    }
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:467:1: ( 'None' )
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:467:3: 'None'
                    {
                    match(input,19,FollowSets000.FOLLOW_19_in_rule__AttributeType__Alternatives979); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:479:1: rule__EntityModel__Group__0 : rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 ;
    public final void rule__EntityModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:483:1: ( rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:484:2: rule__EntityModel__Group__0__Impl rule__EntityModel__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01012);
            rule__EntityModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01015);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:491:1: rule__EntityModel__Group__0__Impl : ( () ) ;
    public final void rule__EntityModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:495:1: ( ( () ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:496:1: ( () )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:496:1: ( () )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:497:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelAction_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:498:1: ()
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:500:1: 
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:510:1: rule__EntityModel__Group__1 : rule__EntityModel__Group__1__Impl ;
    public final void rule__EntityModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:514:1: ( rule__EntityModel__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:515:2: rule__EntityModel__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11073);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:521:1: rule__EntityModel__Group__1__Impl : ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* ) ;
    public final void rule__EntityModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:525:1: ( ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:526:1: ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:526:1: ( ( rule__EntityModel__EntityModelElementsAssignment_1 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:527:1: ( rule__EntityModel__EntityModelElementsAssignment_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelElementsAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:528:1: ( rule__EntityModel__EntityModelElementsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==20||LA4_0==34) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:528:2: rule__EntityModel__EntityModelElementsAssignment_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__EntityModel__EntityModelElementsAssignment_1_in_rule__EntityModel__Group__1__Impl1100);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:542:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:546:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:547:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01135);
            rule__Entity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01138);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:554:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:558:1: ( ( 'entity' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:559:1: ( 'entity' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:559:1: ( 'entity' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:560:1: 'entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            }
            match(input,20,FollowSets000.FOLLOW_20_in_rule__Entity__Group__0__Impl1166); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:573:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:577:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:578:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11197);
            rule__Entity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11200);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:585:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:589:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:590:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:590:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:591:1: ( rule__Entity__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:592:1: ( rule__Entity__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:592:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1227);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:602:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:606:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:607:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21257);
            rule__Entity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21260);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:614:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__Group_2__0 )? ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:618:1: ( ( ( rule__Entity__Group_2__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:619:1: ( ( rule__Entity__Group_2__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:619:1: ( ( rule__Entity__Group_2__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:620:1: ( rule__Entity__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:621:1: ( rule__Entity__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:621:2: rule__Entity__Group_2__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1287);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:631:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:635:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:636:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31318);
            rule__Entity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31321);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:643:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:647:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:648:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:648:1: ( '{' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:649:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Entity__Group__3__Impl1349); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:662:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:666:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:667:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41380);
            rule__Entity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41383);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:674:1: rule__Entity__Group__4__Impl : ( 'id' ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:678:1: ( ( 'id' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:679:1: ( 'id' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:679:1: ( 'id' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:680:1: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdKeyword_4()); 
            }
            match(input,22,FollowSets000.FOLLOW_22_in_rule__Entity__Group__4__Impl1411); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdKeyword_4()); 
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:693:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:697:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:698:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51442);
            rule__Entity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51445);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:705:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__IdAssignment_5 ) ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:709:1: ( ( ( rule__Entity__IdAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:710:1: ( ( rule__Entity__IdAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:710:1: ( ( rule__Entity__IdAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:711:1: ( rule__Entity__IdAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:712:1: ( rule__Entity__IdAssignment_5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:712:2: rule__Entity__IdAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__IdAssignment_5_in_rule__Entity__Group__5__Impl1472);
            rule__Entity__IdAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAssignment_5()); 
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:722:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:726:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:727:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61502);
            rule__Entity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61505);
            rule__Entity__Group__7();

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:734:1: rule__Entity__Group__6__Impl : ( ',' ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:738:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:739:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:739:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:740:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_6()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group__6__Impl1533); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_6()); 
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


    // $ANTLR start "rule__Entity__Group__7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:753:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl rule__Entity__Group__8 ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:757:1: ( rule__Entity__Group__7__Impl rule__Entity__Group__8 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:758:2: rule__Entity__Group__7__Impl rule__Entity__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71564);
            rule__Entity__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71567);
            rule__Entity__Group__8();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:765:1: rule__Entity__Group__7__Impl : ( ( rule__Entity__Group_7__0 ) ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:769:1: ( ( ( rule__Entity__Group_7__0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:770:1: ( ( rule__Entity__Group_7__0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:770:1: ( ( rule__Entity__Group_7__0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:771:1: ( rule__Entity__Group_7__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_7()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:772:1: ( rule__Entity__Group_7__0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:772:2: rule__Entity__Group_7__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl1594);
            rule__Entity__Group_7__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_7()); 
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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group__8"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:782:1: rule__Entity__Group__8 : rule__Entity__Group__8__Impl ;
    public final void rule__Entity__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:786:1: ( rule__Entity__Group__8__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:787:2: rule__Entity__Group__8__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81624);
            rule__Entity__Group__8__Impl();

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
    // $ANTLR end "rule__Entity__Group__8"


    // $ANTLR start "rule__Entity__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:793:1: rule__Entity__Group__8__Impl : ( '}' ) ;
    public final void rule__Entity__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:797:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:798:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:798:1: ( '}' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:799:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Entity__Group__8__Impl1652); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__Entity__Group__8__Impl"


    // $ANTLR start "rule__Entity__Group_2__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:830:1: rule__Entity__Group_2__0 : rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 ;
    public final void rule__Entity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:834:1: ( rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:835:2: rule__Entity__Group_2__0__Impl rule__Entity__Group_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01701);
            rule__Entity__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01704);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:842:1: rule__Entity__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__Entity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:846:1: ( ( 'extends' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:847:1: ( 'extends' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:847:1: ( 'extends' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:848:1: 'extends'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); 
            }
            match(input,25,FollowSets000.FOLLOW_25_in_rule__Entity__Group_2__0__Impl1732); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:861:1: rule__Entity__Group_2__1 : rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 ;
    public final void rule__Entity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:865:1: ( rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:866:2: rule__Entity__Group_2__1__Impl rule__Entity__Group_2__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11763);
            rule__Entity__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__11766);
            rule__Entity__Group_2__2();

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:873:1: rule__Entity__Group_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__Entity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:877:1: ( ( ( rule__Entity__SuperTypeAssignment_2_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:878:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:878:1: ( ( rule__Entity__SuperTypeAssignment_2_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:879:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:880:1: ( rule__Entity__SuperTypeAssignment_2_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:880:2: rule__Entity__SuperTypeAssignment_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1793);
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


    // $ANTLR start "rule__Entity__Group_2__2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:890:1: rule__Entity__Group_2__2 : rule__Entity__Group_2__2__Impl ;
    public final void rule__Entity__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:894:1: ( rule__Entity__Group_2__2__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:895:2: rule__Entity__Group_2__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__21823);
            rule__Entity__Group_2__2__Impl();

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
    // $ANTLR end "rule__Entity__Group_2__2"


    // $ANTLR start "rule__Entity__Group_2__2__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:901:1: rule__Entity__Group_2__2__Impl : ( ( rule__Entity__Group_2_2__0 )* ) ;
    public final void rule__Entity__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:905:1: ( ( ( rule__Entity__Group_2_2__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:906:1: ( ( rule__Entity__Group_2_2__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:906:1: ( ( rule__Entity__Group_2_2__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:907:1: ( rule__Entity__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_2_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:908:1: ( rule__Entity__Group_2_2__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==23) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:908:2: rule__Entity__Group_2_2__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2_2__0_in_rule__Entity__Group_2__2__Impl1850);
            	    rule__Entity__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_2_2()); 
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
    // $ANTLR end "rule__Entity__Group_2__2__Impl"


    // $ANTLR start "rule__Entity__Group_2_2__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:924:1: rule__Entity__Group_2_2__0 : rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 ;
    public final void rule__Entity__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:928:1: ( rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:929:2: rule__Entity__Group_2_2__0__Impl rule__Entity__Group_2_2__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2_2__0__Impl_in_rule__Entity__Group_2_2__01887);
            rule__Entity__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2_2__1_in_rule__Entity__Group_2_2__01890);
            rule__Entity__Group_2_2__1();

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
    // $ANTLR end "rule__Entity__Group_2_2__0"


    // $ANTLR start "rule__Entity__Group_2_2__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:936:1: rule__Entity__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:940:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:941:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:941:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:942:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group_2_2__0__Impl1918); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_2_2_0()); 
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
    // $ANTLR end "rule__Entity__Group_2_2__0__Impl"


    // $ANTLR start "rule__Entity__Group_2_2__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:955:1: rule__Entity__Group_2_2__1 : rule__Entity__Group_2_2__1__Impl ;
    public final void rule__Entity__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:959:1: ( rule__Entity__Group_2_2__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:960:2: rule__Entity__Group_2_2__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_2_2__1__Impl_in_rule__Entity__Group_2_2__11949);
            rule__Entity__Group_2_2__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_2_2__1"


    // $ANTLR start "rule__Entity__Group_2_2__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:966:1: rule__Entity__Group_2_2__1__Impl : ( ( rule__Entity__SuperTypeAssignment_2_2_1 ) ) ;
    public final void rule__Entity__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:970:1: ( ( ( rule__Entity__SuperTypeAssignment_2_2_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:971:1: ( ( rule__Entity__SuperTypeAssignment_2_2_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:971:1: ( ( rule__Entity__SuperTypeAssignment_2_2_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:972:1: ( rule__Entity__SuperTypeAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_2_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:973:1: ( rule__Entity__SuperTypeAssignment_2_2_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:973:2: rule__Entity__SuperTypeAssignment_2_2_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__SuperTypeAssignment_2_2_1_in_rule__Entity__Group_2_2__1__Impl1976);
            rule__Entity__SuperTypeAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeAssignment_2_2_1()); 
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
    // $ANTLR end "rule__Entity__Group_2_2__1__Impl"


    // $ANTLR start "rule__Entity__Group_7__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:987:1: rule__Entity__Group_7__0 : rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 ;
    public final void rule__Entity__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:991:1: ( rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:992:2: rule__Entity__Group_7__0__Impl rule__Entity__Group_7__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02010);
            rule__Entity__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02013);
            rule__Entity__Group_7__1();

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
    // $ANTLR end "rule__Entity__Group_7__0"


    // $ANTLR start "rule__Entity__Group_7__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:999:1: rule__Entity__Group_7__0__Impl : ( ( rule__Entity__Group_7_0__0 )* ) ;
    public final void rule__Entity__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1003:1: ( ( ( rule__Entity__Group_7_0__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1004:1: ( ( rule__Entity__Group_7_0__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1004:1: ( ( rule__Entity__Group_7_0__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1005:1: ( rule__Entity__Group_7_0__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getGroup_7_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1006:1: ( rule__Entity__Group_7_0__0 )*
            loop7:
            do {
                int alt7=2;
                alt7 = dfa7.predict(input);
                switch (alt7) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1006:2: rule__Entity__Group_7_0__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_0__0_in_rule__Entity__Group_7__0__Impl2040);
            	    rule__Entity__Group_7_0__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getGroup_7_0()); 
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
    // $ANTLR end "rule__Entity__Group_7__0__Impl"


    // $ANTLR start "rule__Entity__Group_7__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1016:1: rule__Entity__Group_7__1 : rule__Entity__Group_7__1__Impl ;
    public final void rule__Entity__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1020:1: ( rule__Entity__Group_7__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1021:2: rule__Entity__Group_7__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12071);
            rule__Entity__Group_7__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_7__1"


    // $ANTLR start "rule__Entity__Group_7__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1027:1: rule__Entity__Group_7__1__Impl : ( ( rule__Entity__FeaturesAssignment_7_1 ) ) ;
    public final void rule__Entity__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1031:1: ( ( ( rule__Entity__FeaturesAssignment_7_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1032:1: ( ( rule__Entity__FeaturesAssignment_7_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1032:1: ( ( rule__Entity__FeaturesAssignment_7_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1033:1: ( rule__Entity__FeaturesAssignment_7_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesAssignment_7_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1034:1: ( rule__Entity__FeaturesAssignment_7_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1034:2: rule__Entity__FeaturesAssignment_7_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__FeaturesAssignment_7_1_in_rule__Entity__Group_7__1__Impl2098);
            rule__Entity__FeaturesAssignment_7_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesAssignment_7_1()); 
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
    // $ANTLR end "rule__Entity__Group_7__1__Impl"


    // $ANTLR start "rule__Entity__Group_7_0__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1048:1: rule__Entity__Group_7_0__0 : rule__Entity__Group_7_0__0__Impl rule__Entity__Group_7_0__1 ;
    public final void rule__Entity__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1052:1: ( rule__Entity__Group_7_0__0__Impl rule__Entity__Group_7_0__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1053:2: rule__Entity__Group_7_0__0__Impl rule__Entity__Group_7_0__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_0__0__Impl_in_rule__Entity__Group_7_0__02132);
            rule__Entity__Group_7_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_0__1_in_rule__Entity__Group_7_0__02135);
            rule__Entity__Group_7_0__1();

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
    // $ANTLR end "rule__Entity__Group_7_0__0"


    // $ANTLR start "rule__Entity__Group_7_0__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1060:1: rule__Entity__Group_7_0__0__Impl : ( ( rule__Entity__FeaturesAssignment_7_0_0 ) ) ;
    public final void rule__Entity__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1064:1: ( ( ( rule__Entity__FeaturesAssignment_7_0_0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1065:1: ( ( rule__Entity__FeaturesAssignment_7_0_0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1065:1: ( ( rule__Entity__FeaturesAssignment_7_0_0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1066:1: ( rule__Entity__FeaturesAssignment_7_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesAssignment_7_0_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1067:1: ( rule__Entity__FeaturesAssignment_7_0_0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1067:2: rule__Entity__FeaturesAssignment_7_0_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__FeaturesAssignment_7_0_0_in_rule__Entity__Group_7_0__0__Impl2162);
            rule__Entity__FeaturesAssignment_7_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesAssignment_7_0_0()); 
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
    // $ANTLR end "rule__Entity__Group_7_0__0__Impl"


    // $ANTLR start "rule__Entity__Group_7_0__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1077:1: rule__Entity__Group_7_0__1 : rule__Entity__Group_7_0__1__Impl ;
    public final void rule__Entity__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1081:1: ( rule__Entity__Group_7_0__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1082:2: rule__Entity__Group_7_0__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Entity__Group_7_0__1__Impl_in_rule__Entity__Group_7_0__12192);
            rule__Entity__Group_7_0__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_7_0__1"


    // $ANTLR start "rule__Entity__Group_7_0__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1088:1: rule__Entity__Group_7_0__1__Impl : ( ',' ) ;
    public final void rule__Entity__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1092:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1093:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1093:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1094:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getCommaKeyword_7_0_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Entity__Group_7_0__1__Impl2220); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getCommaKeyword_7_0_1()); 
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
    // $ANTLR end "rule__Entity__Group_7_0__1__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1111:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1115:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1116:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02255);
            rule__Attribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02258);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1123:1: rule__Attribute__Group__0__Impl : ( 'attribute' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1127:1: ( ( 'attribute' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1128:1: ( 'attribute' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1128:1: ( 'attribute' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1129:1: 'attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAttributeKeyword_0()); 
            }
            match(input,26,FollowSets000.FOLLOW_26_in_rule__Attribute__Group__0__Impl2286); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1142:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1146:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1147:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12317);
            rule__Attribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12320);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1154:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1158:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1159:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1159:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1160:1: ( rule__Attribute__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1161:1: ( rule__Attribute__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1161:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl2347);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1171:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl rule__Attribute__Group__3 ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1175:1: ( rule__Attribute__Group__2__Impl rule__Attribute__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1176:2: rule__Attribute__Group__2__Impl rule__Attribute__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22377);
            rule__Attribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22380);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1183:1: rule__Attribute__Group__2__Impl : ( ( '*' )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1187:1: ( ( ( '*' )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1188:1: ( ( '*' )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1188:1: ( ( '*' )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1189:1: ( '*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getAsteriskKeyword_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1190:1: ( '*' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1191:2: '*'
                    {
                    match(input,27,FollowSets000.FOLLOW_27_in_rule__Attribute__Group__2__Impl2409); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1202:1: rule__Attribute__Group__3 : rule__Attribute__Group__3__Impl rule__Attribute__Group__4 ;
    public final void rule__Attribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1206:1: ( rule__Attribute__Group__3__Impl rule__Attribute__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1207:2: rule__Attribute__Group__3__Impl rule__Attribute__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32442);
            rule__Attribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32445);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1214:1: rule__Attribute__Group__3__Impl : ( ':' ) ;
    public final void rule__Attribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1218:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1219:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1219:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1220:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_3()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Attribute__Group__3__Impl2473); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1233:1: rule__Attribute__Group__4 : rule__Attribute__Group__4__Impl rule__Attribute__Group__5 ;
    public final void rule__Attribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1237:1: ( rule__Attribute__Group__4__Impl rule__Attribute__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1238:2: rule__Attribute__Group__4__Impl rule__Attribute__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42504);
            rule__Attribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__42507);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1245:1: rule__Attribute__Group__4__Impl : ( ( rule__Attribute__TypeAssignment_4 ) ) ;
    public final void rule__Attribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1249:1: ( ( ( rule__Attribute__TypeAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1250:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1250:1: ( ( rule__Attribute__TypeAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1251:1: ( rule__Attribute__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1252:1: ( rule__Attribute__TypeAssignment_4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1252:2: rule__Attribute__TypeAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl2534);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1262:1: rule__Attribute__Group__5 : rule__Attribute__Group__5__Impl ;
    public final void rule__Attribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1266:1: ( rule__Attribute__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1267:2: rule__Attribute__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__52564);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1273:1: rule__Attribute__Group__5__Impl : ( ( rule__Attribute__Group_5__0 )? ) ;
    public final void rule__Attribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1277:1: ( ( ( rule__Attribute__Group_5__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1278:1: ( ( rule__Attribute__Group_5__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1278:1: ( ( rule__Attribute__Group_5__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1279:1: ( rule__Attribute__Group_5__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getGroup_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1280:1: ( rule__Attribute__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1280:2: rule__Attribute__Group_5__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl2591);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1302:1: rule__Attribute__Group_5__0 : rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 ;
    public final void rule__Attribute__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1306:1: ( rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1307:2: rule__Attribute__Group_5__0__Impl rule__Attribute__Group_5__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__02634);
            rule__Attribute__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__02637);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1314:1: rule__Attribute__Group_5__0__Impl : ( ':' ) ;
    public final void rule__Attribute__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1318:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1319:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1319:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1320:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getColonKeyword_5_0()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Attribute__Group_5__0__Impl2665); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1333:1: rule__Attribute__Group_5__1 : rule__Attribute__Group_5__1__Impl ;
    public final void rule__Attribute__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1337:1: ( rule__Attribute__Group_5__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1338:2: rule__Attribute__Group_5__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__12696);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1344:1: rule__Attribute__Group_5__1__Impl : ( ( rule__Attribute__EnumerationAssignment_5_1 ) ) ;
    public final void rule__Attribute__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1348:1: ( ( ( rule__Attribute__EnumerationAssignment_5_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1349:1: ( ( rule__Attribute__EnumerationAssignment_5_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1349:1: ( ( rule__Attribute__EnumerationAssignment_5_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1350:1: ( rule__Attribute__EnumerationAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationAssignment_5_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1351:1: ( rule__Attribute__EnumerationAssignment_5_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1351:2: rule__Attribute__EnumerationAssignment_5_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Attribute__EnumerationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl2723);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1365:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1369:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1370:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__02757);
            rule__Relationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__02760);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1377:1: rule__Relationship__Group__0__Impl : ( 'reference' ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1381:1: ( ( 'reference' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1382:1: ( 'reference' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1382:1: ( 'reference' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1383:1: 'reference'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getReferenceKeyword_0()); 
            }
            match(input,29,FollowSets000.FOLLOW_29_in_rule__Relationship__Group__0__Impl2788); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1396:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1400:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1401:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__12819);
            rule__Relationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__12822);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1408:1: rule__Relationship__Group__1__Impl : ( ( rule__Relationship__NameAssignment_1 ) ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1412:1: ( ( ( rule__Relationship__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1413:1: ( ( rule__Relationship__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1413:1: ( ( rule__Relationship__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1414:1: ( rule__Relationship__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1415:1: ( rule__Relationship__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1415:2: rule__Relationship__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__NameAssignment_1_in_rule__Relationship__Group__1__Impl2849);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1425:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1429:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1430:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__22879);
            rule__Relationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__22882);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1437:1: rule__Relationship__Group__2__Impl : ( ':' ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1441:1: ( ( ':' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1442:1: ( ':' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1442:1: ( ':' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1443:1: ':'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getColonKeyword_2()); 
            }
            match(input,28,FollowSets000.FOLLOW_28_in_rule__Relationship__Group__2__Impl2910); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1456:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1460:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1461:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__32941);
            rule__Relationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__32944);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1468:1: rule__Relationship__Group__3__Impl : ( ( rule__Relationship__TargetAssignment_3 ) ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1472:1: ( ( ( rule__Relationship__TargetAssignment_3 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1473:1: ( ( rule__Relationship__TargetAssignment_3 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1473:1: ( ( rule__Relationship__TargetAssignment_3 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1474:1: ( rule__Relationship__TargetAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetAssignment_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1475:1: ( rule__Relationship__TargetAssignment_3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1475:2: rule__Relationship__TargetAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__TargetAssignment_3_in_rule__Relationship__Group__3__Impl2971);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1485:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1489:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1490:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__43001);
            rule__Relationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__43004);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1497:1: rule__Relationship__Group__4__Impl : ( '[' ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1501:1: ( ( '[' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1502:1: ( '[' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1502:1: ( '[' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1503:1: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4()); 
            }
            match(input,30,FollowSets000.FOLLOW_30_in_rule__Relationship__Group__4__Impl3032); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLeftSquareBracketKeyword_4()); 
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1516:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1520:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1521:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__53063);
            rule__Relationship__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__53066);
            rule__Relationship__Group__6();

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1528:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__LowerBoundAssignment_5 ) ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1532:1: ( ( ( rule__Relationship__LowerBoundAssignment_5 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1533:1: ( ( rule__Relationship__LowerBoundAssignment_5 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1533:1: ( ( rule__Relationship__LowerBoundAssignment_5 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1534:1: ( rule__Relationship__LowerBoundAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLowerBoundAssignment_5()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1535:1: ( rule__Relationship__LowerBoundAssignment_5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1535:2: rule__Relationship__LowerBoundAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__LowerBoundAssignment_5_in_rule__Relationship__Group__5__Impl3093);
            rule__Relationship__LowerBoundAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLowerBoundAssignment_5()); 
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


    // $ANTLR start "rule__Relationship__Group__6"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1545:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1549:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1550:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__63123);
            rule__Relationship__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__63126);
            rule__Relationship__Group__7();

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
    // $ANTLR end "rule__Relationship__Group__6"


    // $ANTLR start "rule__Relationship__Group__6__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1557:1: rule__Relationship__Group__6__Impl : ( '..' ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1561:1: ( ( '..' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1562:1: ( '..' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1562:1: ( '..' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1563:1: '..'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getFullStopFullStopKeyword_6()); 
            }
            match(input,31,FollowSets000.FOLLOW_31_in_rule__Relationship__Group__6__Impl3154); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getFullStopFullStopKeyword_6()); 
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
    // $ANTLR end "rule__Relationship__Group__6__Impl"


    // $ANTLR start "rule__Relationship__Group__7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1576:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl rule__Relationship__Group__8 ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1580:1: ( rule__Relationship__Group__7__Impl rule__Relationship__Group__8 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1581:2: rule__Relationship__Group__7__Impl rule__Relationship__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__73185);
            rule__Relationship__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__73188);
            rule__Relationship__Group__8();

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
    // $ANTLR end "rule__Relationship__Group__7"


    // $ANTLR start "rule__Relationship__Group__7__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1588:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__UpperBoundAssignment_7 ) ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1592:1: ( ( ( rule__Relationship__UpperBoundAssignment_7 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1593:1: ( ( rule__Relationship__UpperBoundAssignment_7 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1593:1: ( ( rule__Relationship__UpperBoundAssignment_7 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1594:1: ( rule__Relationship__UpperBoundAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getUpperBoundAssignment_7()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1595:1: ( rule__Relationship__UpperBoundAssignment_7 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1595:2: rule__Relationship__UpperBoundAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__UpperBoundAssignment_7_in_rule__Relationship__Group__7__Impl3215);
            rule__Relationship__UpperBoundAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getUpperBoundAssignment_7()); 
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
    // $ANTLR end "rule__Relationship__Group__7__Impl"


    // $ANTLR start "rule__Relationship__Group__8"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1605:1: rule__Relationship__Group__8 : rule__Relationship__Group__8__Impl rule__Relationship__Group__9 ;
    public final void rule__Relationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1609:1: ( rule__Relationship__Group__8__Impl rule__Relationship__Group__9 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1610:2: rule__Relationship__Group__8__Impl rule__Relationship__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__83245);
            rule__Relationship__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__83248);
            rule__Relationship__Group__9();

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
    // $ANTLR end "rule__Relationship__Group__8"


    // $ANTLR start "rule__Relationship__Group__8__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1617:1: rule__Relationship__Group__8__Impl : ( ']' ) ;
    public final void rule__Relationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1621:1: ( ( ']' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1622:1: ( ']' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1622:1: ( ']' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1623:1: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8()); 
            }
            match(input,32,FollowSets000.FOLLOW_32_in_rule__Relationship__Group__8__Impl3276); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getRightSquareBracketKeyword_8()); 
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
    // $ANTLR end "rule__Relationship__Group__8__Impl"


    // $ANTLR start "rule__Relationship__Group__9"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1636:1: rule__Relationship__Group__9 : rule__Relationship__Group__9__Impl ;
    public final void rule__Relationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1640:1: ( rule__Relationship__Group__9__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1641:2: rule__Relationship__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__93307);
            rule__Relationship__Group__9__Impl();

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
    // $ANTLR end "rule__Relationship__Group__9"


    // $ANTLR start "rule__Relationship__Group__9__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1647:1: rule__Relationship__Group__9__Impl : ( ( rule__Relationship__Group_9__0 )? ) ;
    public final void rule__Relationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1651:1: ( ( ( rule__Relationship__Group_9__0 )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1652:1: ( ( rule__Relationship__Group_9__0 )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1652:1: ( ( rule__Relationship__Group_9__0 )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1653:1: ( rule__Relationship__Group_9__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getGroup_9()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1654:1: ( rule__Relationship__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==33) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1654:2: rule__Relationship__Group_9__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__0_in_rule__Relationship__Group__9__Impl3334);
                    rule__Relationship__Group_9__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getGroup_9()); 
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
    // $ANTLR end "rule__Relationship__Group__9__Impl"


    // $ANTLR start "rule__Relationship__Group_9__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1684:1: rule__Relationship__Group_9__0 : rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1 ;
    public final void rule__Relationship__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1688:1: ( rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1689:2: rule__Relationship__Group_9__0__Impl rule__Relationship__Group_9__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__0__Impl_in_rule__Relationship__Group_9__03385);
            rule__Relationship__Group_9__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__1_in_rule__Relationship__Group_9__03388);
            rule__Relationship__Group_9__1();

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
    // $ANTLR end "rule__Relationship__Group_9__0"


    // $ANTLR start "rule__Relationship__Group_9__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1696:1: rule__Relationship__Group_9__0__Impl : ( 'opposite-of' ) ;
    public final void rule__Relationship__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1700:1: ( ( 'opposite-of' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1701:1: ( 'opposite-of' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1701:1: ( 'opposite-of' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1702:1: 'opposite-of'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeOfKeyword_9_0()); 
            }
            match(input,33,FollowSets000.FOLLOW_33_in_rule__Relationship__Group_9__0__Impl3416); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeOfKeyword_9_0()); 
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
    // $ANTLR end "rule__Relationship__Group_9__0__Impl"


    // $ANTLR start "rule__Relationship__Group_9__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1715:1: rule__Relationship__Group_9__1 : rule__Relationship__Group_9__1__Impl ;
    public final void rule__Relationship__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1719:1: ( rule__Relationship__Group_9__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1720:2: rule__Relationship__Group_9__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__Group_9__1__Impl_in_rule__Relationship__Group_9__13447);
            rule__Relationship__Group_9__1__Impl();

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
    // $ANTLR end "rule__Relationship__Group_9__1"


    // $ANTLR start "rule__Relationship__Group_9__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1726:1: rule__Relationship__Group_9__1__Impl : ( ( rule__Relationship__OppositeAssignment_9_1 ) ) ;
    public final void rule__Relationship__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1730:1: ( ( ( rule__Relationship__OppositeAssignment_9_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1731:1: ( ( rule__Relationship__OppositeAssignment_9_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1731:1: ( ( rule__Relationship__OppositeAssignment_9_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1732:1: ( rule__Relationship__OppositeAssignment_9_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeAssignment_9_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1733:1: ( rule__Relationship__OppositeAssignment_9_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1733:2: rule__Relationship__OppositeAssignment_9_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Relationship__OppositeAssignment_9_1_in_rule__Relationship__Group_9__1__Impl3474);
            rule__Relationship__OppositeAssignment_9_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeAssignment_9_1()); 
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
    // $ANTLR end "rule__Relationship__Group_9__1__Impl"


    // $ANTLR start "rule__Enumeration__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1747:1: rule__Enumeration__Group__0 : rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 ;
    public final void rule__Enumeration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1751:1: ( rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1752:2: rule__Enumeration__Group__0__Impl rule__Enumeration__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__03508);
            rule__Enumeration__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03511);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1759:1: rule__Enumeration__Group__0__Impl : ( 'enum' ) ;
    public final void rule__Enumeration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1763:1: ( ( 'enum' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1764:1: ( 'enum' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1764:1: ( 'enum' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1765:1: 'enum'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getEnumKeyword_0()); 
            }
            match(input,34,FollowSets000.FOLLOW_34_in_rule__Enumeration__Group__0__Impl3539); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1778:1: rule__Enumeration__Group__1 : rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 ;
    public final void rule__Enumeration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1782:1: ( rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1783:2: rule__Enumeration__Group__1__Impl rule__Enumeration__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__13570);
            rule__Enumeration__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13573);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1790:1: rule__Enumeration__Group__1__Impl : ( ( rule__Enumeration__NameAssignment_1 ) ) ;
    public final void rule__Enumeration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1794:1: ( ( ( rule__Enumeration__NameAssignment_1 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1795:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1795:1: ( ( rule__Enumeration__NameAssignment_1 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1796:1: ( rule__Enumeration__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1797:1: ( rule__Enumeration__NameAssignment_1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1797:2: rule__Enumeration__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl3600);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1807:1: rule__Enumeration__Group__2 : rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 ;
    public final void rule__Enumeration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1811:1: ( rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1812:2: rule__Enumeration__Group__2__Impl rule__Enumeration__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__23630);
            rule__Enumeration__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23633);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1819:1: rule__Enumeration__Group__2__Impl : ( '{' ) ;
    public final void rule__Enumeration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1823:1: ( ( '{' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1824:1: ( '{' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1824:1: ( '{' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1825:1: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,21,FollowSets000.FOLLOW_21_in_rule__Enumeration__Group__2__Impl3661); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1838:1: rule__Enumeration__Group__3 : rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 ;
    public final void rule__Enumeration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1842:1: ( rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1843:2: rule__Enumeration__Group__3__Impl rule__Enumeration__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__33692);
            rule__Enumeration__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33695);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1850:1: rule__Enumeration__Group__3__Impl : ( ( rule__Enumeration__Group_3__0 )* ) ;
    public final void rule__Enumeration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1854:1: ( ( ( rule__Enumeration__Group_3__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1855:1: ( ( rule__Enumeration__Group_3__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1855:1: ( ( rule__Enumeration__Group_3__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1856:1: ( rule__Enumeration__Group_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getGroup_3()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1857:1: ( rule__Enumeration__Group_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==35) ) {
                        int LA11_2 = input.LA(3);

                        if ( (LA11_2==RULE_STRING) ) {
                            int LA11_3 = input.LA(4);

                            if ( (LA11_3==23) ) {
                                alt11=1;
                            }


                        }


                    }


                }


                switch (alt11) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1857:2: rule__Enumeration__Group_3__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_3__0_in_rule__Enumeration__Group__3__Impl3722);
            	    rule__Enumeration__Group_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getGroup_3()); 
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1867:1: rule__Enumeration__Group__4 : rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 ;
    public final void rule__Enumeration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1871:1: ( rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1872:2: rule__Enumeration__Group__4__Impl rule__Enumeration__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__43753);
            rule__Enumeration__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43756);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1879:1: rule__Enumeration__Group__4__Impl : ( ( rule__Enumeration__LiteralsAssignment_4 ) ) ;
    public final void rule__Enumeration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1883:1: ( ( ( rule__Enumeration__LiteralsAssignment_4 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1884:1: ( ( rule__Enumeration__LiteralsAssignment_4 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1884:1: ( ( rule__Enumeration__LiteralsAssignment_4 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1885:1: ( rule__Enumeration__LiteralsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1886:1: ( rule__Enumeration__LiteralsAssignment_4 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1886:2: rule__Enumeration__LiteralsAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__LiteralsAssignment_4_in_rule__Enumeration__Group__4__Impl3783);
            rule__Enumeration__LiteralsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_4()); 
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1896:1: rule__Enumeration__Group__5 : rule__Enumeration__Group__5__Impl ;
    public final void rule__Enumeration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1900:1: ( rule__Enumeration__Group__5__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1901:2: rule__Enumeration__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__53813);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1907:1: rule__Enumeration__Group__5__Impl : ( '}' ) ;
    public final void rule__Enumeration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1911:1: ( ( '}' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1912:1: ( '}' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1912:1: ( '}' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1913:1: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Enumeration__Group__5__Impl3841); if (state.failed) return ;
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


    // $ANTLR start "rule__Enumeration__Group_3__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1938:1: rule__Enumeration__Group_3__0 : rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 ;
    public final void rule__Enumeration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1942:1: ( rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1943:2: rule__Enumeration__Group_3__0__Impl rule__Enumeration__Group_3__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_3__0__Impl_in_rule__Enumeration__Group_3__03884);
            rule__Enumeration__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_3__1_in_rule__Enumeration__Group_3__03887);
            rule__Enumeration__Group_3__1();

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
    // $ANTLR end "rule__Enumeration__Group_3__0"


    // $ANTLR start "rule__Enumeration__Group_3__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1950:1: rule__Enumeration__Group_3__0__Impl : ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) ;
    public final void rule__Enumeration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1954:1: ( ( ( rule__Enumeration__LiteralsAssignment_3_0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1955:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1955:1: ( ( rule__Enumeration__LiteralsAssignment_3_0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1956:1: ( rule__Enumeration__LiteralsAssignment_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1957:1: ( rule__Enumeration__LiteralsAssignment_3_0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1957:2: rule__Enumeration__LiteralsAssignment_3_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__LiteralsAssignment_3_0_in_rule__Enumeration__Group_3__0__Impl3914);
            rule__Enumeration__LiteralsAssignment_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_3_0()); 
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
    // $ANTLR end "rule__Enumeration__Group_3__0__Impl"


    // $ANTLR start "rule__Enumeration__Group_3__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1967:1: rule__Enumeration__Group_3__1 : rule__Enumeration__Group_3__1__Impl ;
    public final void rule__Enumeration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1971:1: ( rule__Enumeration__Group_3__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1972:2: rule__Enumeration__Group_3__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Enumeration__Group_3__1__Impl_in_rule__Enumeration__Group_3__13944);
            rule__Enumeration__Group_3__1__Impl();

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
    // $ANTLR end "rule__Enumeration__Group_3__1"


    // $ANTLR start "rule__Enumeration__Group_3__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1978:1: rule__Enumeration__Group_3__1__Impl : ( ',' ) ;
    public final void rule__Enumeration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1982:1: ( ( ',' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1983:1: ( ',' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1983:1: ( ',' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:1984:1: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getCommaKeyword_3_1()); 
            }
            match(input,23,FollowSets000.FOLLOW_23_in_rule__Enumeration__Group_3__1__Impl3972); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getCommaKeyword_3_1()); 
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
    // $ANTLR end "rule__Enumeration__Group_3__1__Impl"


    // $ANTLR start "rule__Literal__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2001:1: rule__Literal__Group__0 : rule__Literal__Group__0__Impl rule__Literal__Group__1 ;
    public final void rule__Literal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2005:1: ( rule__Literal__Group__0__Impl rule__Literal__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2006:2: rule__Literal__Group__0__Impl rule__Literal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__04007);
            rule__Literal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__04010);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2013:1: rule__Literal__Group__0__Impl : ( ( rule__Literal__NameAssignment_0 ) ) ;
    public final void rule__Literal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2017:1: ( ( ( rule__Literal__NameAssignment_0 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2018:1: ( ( rule__Literal__NameAssignment_0 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2018:1: ( ( rule__Literal__NameAssignment_0 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2019:1: ( rule__Literal__NameAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameAssignment_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2020:1: ( rule__Literal__NameAssignment_0 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2020:2: rule__Literal__NameAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__NameAssignment_0_in_rule__Literal__Group__0__Impl4037);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2030:1: rule__Literal__Group__1 : rule__Literal__Group__1__Impl rule__Literal__Group__2 ;
    public final void rule__Literal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2034:1: ( rule__Literal__Group__1__Impl rule__Literal__Group__2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2035:2: rule__Literal__Group__1__Impl rule__Literal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__14067);
            rule__Literal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__14070);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2042:1: rule__Literal__Group__1__Impl : ( '=' ) ;
    public final void rule__Literal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2046:1: ( ( '=' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2047:1: ( '=' )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2047:1: ( '=' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2048:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getEqualsSignKeyword_1()); 
            }
            match(input,35,FollowSets000.FOLLOW_35_in_rule__Literal__Group__1__Impl4098); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2061:1: rule__Literal__Group__2 : rule__Literal__Group__2__Impl ;
    public final void rule__Literal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2065:1: ( rule__Literal__Group__2__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2066:2: rule__Literal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__24129);
            rule__Literal__Group__2__Impl();

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2072:1: rule__Literal__Group__2__Impl : ( ( rule__Literal__ValueAssignment_2 ) ) ;
    public final void rule__Literal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2076:1: ( ( ( rule__Literal__ValueAssignment_2 ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2077:1: ( ( rule__Literal__ValueAssignment_2 ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2077:1: ( ( rule__Literal__ValueAssignment_2 ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2078:1: ( rule__Literal__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueAssignment_2()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2079:1: ( rule__Literal__ValueAssignment_2 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2079:2: rule__Literal__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Literal__ValueAssignment_2_in_rule__Literal__Group__2__Impl4156);
            rule__Literal__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueAssignment_2()); 
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


    // $ANTLR start "rule__EInt__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2095:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2099:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2100:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04192);
            rule__EInt__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04195);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2107:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2111:1: ( ( ( '-' )? ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2112:1: ( ( '-' )? )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2112:1: ( ( '-' )? )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2113:1: ( '-' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2114:1: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2115:2: '-'
                    {
                    match(input,36,FollowSets000.FOLLOW_36_in_rule__EInt__Group__0__Impl4224); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2126:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2130:1: ( rule__EInt__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2131:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14257);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2137:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2141:1: ( ( RULE_INT ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2142:1: ( RULE_INT )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2142:1: ( RULE_INT )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2143:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            }
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4284); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2158:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2162:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2163:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04317);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04320);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2170:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2174:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2175:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2175:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2176:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4347); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2187:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2191:1: ( rule__QualifiedName__Group__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2192:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14376);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2198:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2202:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2203:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2203:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2204:1: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2205:1: ( rule__QualifiedName__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2205:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4403);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2219:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2223:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2224:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04438);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04441);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2231:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2235:1: ( ( ( '.' ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2236:1: ( ( '.' ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2236:1: ( ( '.' ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2237:1: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2238:1: ( '.' )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2239:2: '.'
            {
            match(input,37,FollowSets000.FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl4470); if (state.failed) return ;

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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2250:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2254:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2255:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14502);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2261:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2265:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2266:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2266:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2267:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4529); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2283:1: rule__EntityModel__EntityModelElementsAssignment_1 : ( ruleEntityModelElement ) ;
    public final void rule__EntityModel__EntityModelElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2287:1: ( ( ruleEntityModelElement ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2288:1: ( ruleEntityModelElement )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2288:1: ( ruleEntityModelElement )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2289:1: ruleEntityModelElement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityModelAccess().getEntityModelElementsEntityModelElementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEntityModelElement_in_rule__EntityModel__EntityModelElementsAssignment_14567);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2298:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2302:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2303:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2303:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2304:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14598); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2313:1: rule__Entity__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2317:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2318:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2318:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2319:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2320:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2321:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_14633); if (state.failed) return ;
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


    // $ANTLR start "rule__Entity__SuperTypeAssignment_2_2_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2332:1: rule__Entity__SuperTypeAssignment_2_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Entity__SuperTypeAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2336:1: ( ( ( RULE_ID ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2337:1: ( ( RULE_ID ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2337:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2338:1: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_2_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2339:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2340:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_2_1_0_1()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_2_14672); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityIDTerminalRuleCall_2_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getSuperTypeEntityCrossReference_2_2_1_0()); 
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
    // $ANTLR end "rule__Entity__SuperTypeAssignment_2_2_1"


    // $ANTLR start "rule__Entity__IdAssignment_5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2351:1: rule__Entity__IdAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Entity__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2355:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2356:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2356:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2357:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2358:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2359:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getIdAttributeQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Entity__IdAssignment_54711);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAttributeQualifiedNameParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0()); 
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
    // $ANTLR end "rule__Entity__IdAssignment_5"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7_0_0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2370:1: rule__Entity__FeaturesAssignment_7_0_0 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2374:1: ( ( ruleFeature ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2375:1: ( ruleFeature )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2375:1: ( ruleFeature )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2376:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_7_0_04746);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_0_0_0()); 
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
    // $ANTLR end "rule__Entity__FeaturesAssignment_7_0_0"


    // $ANTLR start "rule__Entity__FeaturesAssignment_7_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2385:1: rule__Entity__FeaturesAssignment_7_1 : ( ruleFeature ) ;
    public final void rule__Entity__FeaturesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2389:1: ( ( ruleFeature ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2390:1: ( ruleFeature )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2390:1: ( ruleFeature )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2391:1: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_7_14777);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEntityAccess().getFeaturesFeatureParserRuleCall_7_1_0()); 
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
    // $ANTLR end "rule__Entity__FeaturesAssignment_7_1"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2400:1: rule__Attribute__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2404:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2405:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2405:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2406:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_14808); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2415:1: rule__Attribute__TypeAssignment_4 : ( ruleAttributeType ) ;
    public final void rule__Attribute__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2419:1: ( ( ruleAttributeType ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2420:1: ( ruleAttributeType )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2420:1: ( ruleAttributeType )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2421:1: ruleAttributeType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getTypeAttributeTypeEnumRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_44839);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2430:1: rule__Attribute__EnumerationAssignment_5_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Attribute__EnumerationAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2434:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2435:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2435:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2436:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationEnumerationCrossReference_5_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2437:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2438:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeAccess().getEnumerationEnumerationQualifiedNameParserRuleCall_5_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Attribute__EnumerationAssignment_5_14874);
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2449:1: rule__Relationship__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Relationship__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2453:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2454:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2454:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2455:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Relationship__NameAssignment_14909); if (state.failed) return ;
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
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2464:1: rule__Relationship__TargetAssignment_3 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__TargetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2468:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2469:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2469:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2470:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_3_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2471:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2472:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getTargetEntityQualifiedNameParserRuleCall_3_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Relationship__TargetAssignment_34944);
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


    // $ANTLR start "rule__Relationship__LowerBoundAssignment_5"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2483:1: rule__Relationship__LowerBoundAssignment_5 : ( ruleEInt ) ;
    public final void rule__Relationship__LowerBoundAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2487:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2488:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2488:1: ( ruleEInt )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2489:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getLowerBoundEIntParserRuleCall_5_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Relationship__LowerBoundAssignment_54979);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getLowerBoundEIntParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__Relationship__LowerBoundAssignment_5"


    // $ANTLR start "rule__Relationship__UpperBoundAssignment_7"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2498:1: rule__Relationship__UpperBoundAssignment_7 : ( ruleEInt ) ;
    public final void rule__Relationship__UpperBoundAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2502:1: ( ( ruleEInt ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2503:1: ( ruleEInt )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2503:1: ( ruleEInt )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2504:1: ruleEInt
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getUpperBoundEIntParserRuleCall_7_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Relationship__UpperBoundAssignment_75010);
            ruleEInt();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getUpperBoundEIntParserRuleCall_7_0()); 
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
    // $ANTLR end "rule__Relationship__UpperBoundAssignment_7"


    // $ANTLR start "rule__Relationship__OppositeAssignment_9_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2513:1: rule__Relationship__OppositeAssignment_9_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Relationship__OppositeAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2517:1: ( ( ( ruleQualifiedName ) ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2518:1: ( ( ruleQualifiedName ) )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2518:1: ( ( ruleQualifiedName ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2519:1: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_9_1_0()); 
            }
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2520:1: ( ruleQualifiedName )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2521:1: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRelationshipAccess().getOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleQualifiedName_in_rule__Relationship__OppositeAssignment_9_15045);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeRelationshipQualifiedNameParserRuleCall_9_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRelationshipAccess().getOppositeRelationshipCrossReference_9_1_0()); 
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
    // $ANTLR end "rule__Relationship__OppositeAssignment_9_1"


    // $ANTLR start "rule__Enumeration__NameAssignment_1"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2532:1: rule__Enumeration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Enumeration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2536:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2537:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2537:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2538:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_15080); if (state.failed) return ;
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


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_3_0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2547:1: rule__Enumeration__LiteralsAssignment_3_0 : ( ruleLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2551:1: ( ( ruleLiteral ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2552:1: ( ruleLiteral )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2552:1: ( ruleLiteral )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2553:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_3_05111);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_3_0_0()); 
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
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_3_0"


    // $ANTLR start "rule__Enumeration__LiteralsAssignment_4"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2562:1: rule__Enumeration__LiteralsAssignment_4 : ( ruleLiteral ) ;
    public final void rule__Enumeration__LiteralsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2566:1: ( ( ruleLiteral ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2567:1: ( ruleLiteral )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2567:1: ( ruleLiteral )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2568:1: ruleLiteral
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_4_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_45142);
            ruleLiteral();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEnumerationAccess().getLiteralsLiteralParserRuleCall_4_0()); 
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
    // $ANTLR end "rule__Enumeration__LiteralsAssignment_4"


    // $ANTLR start "rule__Literal__NameAssignment_0"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2577:1: rule__Literal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Literal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2581:1: ( ( RULE_ID ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2582:1: ( RULE_ID )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2582:1: ( RULE_ID )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2583:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getNameIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_05173); if (state.failed) return ;
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


    // $ANTLR start "rule__Literal__ValueAssignment_2"
    // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2592:1: rule__Literal__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Literal__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2596:1: ( ( RULE_STRING ) )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2597:1: ( RULE_STRING )
            {
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2597:1: ( RULE_STRING )
            // ../at.ac.tuwien.big.forms.entity.ui/src-gen/at/ac/tuwien/big/forms/entity/ui/contentassist/antlr/internal/InternalEntity.g:2598:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Literal__ValueAssignment_25204); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_0()); 
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
    // $ANTLR end "rule__Literal__ValueAssignment_2"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\45\uffff";
    static final String DFA7_eofS =
        "\45\uffff";
    static final String DFA7_minS =
        "\1\32\2\5\1\33\2\34\1\13\1\5\11\27\1\36\1\5\2\uffff\1\5\1\4\1\27"+
        "\1\36\1\4\1\37\1\5\1\4\1\27\1\4\1\40\1\27\1\5\1\27\1\5\1\27";
    static final String DFA7_maxS =
        "\1\35\2\5\3\34\1\23\1\5\11\34\1\45\1\5\2\uffff\1\5\1\44\2\45\1"+
        "\4\1\37\1\5\1\44\1\45\1\4\1\40\1\41\1\5\1\45\1\5\1\45";
    static final String DFA7_acceptS =
        "\23\uffff\1\1\1\2\20\uffff";
    static final String DFA7_specialS =
        "\45\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1\2\uffff\1\2",
            "\1\3",
            "\1\4",
            "\1\5\1\6",
            "\1\7",
            "\1\6",
            "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\21",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\23\1\24\3\uffff\1\22",
            "\1\26\6\uffff\1\25",
            "\1\27",
            "",
            "",
            "\1\30",
            "\1\32\37\uffff\1\31",
            "\1\23\1\24\14\uffff\1\33",
            "\1\26\6\uffff\1\25",
            "\1\32",
            "\1\34",
            "\1\35",
            "\1\37\37\uffff\1\36",
            "\1\23\1\24\14\uffff\1\33",
            "\1\37",
            "\1\40",
            "\1\23\1\24\10\uffff\1\41",
            "\1\42",
            "\1\23\1\24\14\uffff\1\43",
            "\1\44",
            "\1\23\1\24\14\uffff\1\43"
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 1006:1: ( rule__Entity__Group_7_0__0 )*";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleEntityModel_in_entryRuleEntityModel67 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModel74 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__0_in_ruleEntityModel100 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_entryRuleEntityModelElement127 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntityModelElement134 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModelElement__Alternatives_in_ruleEntityModelElement160 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity187 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEntity194 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute247 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAttribute254 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute280 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship307 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRelationship314 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship340 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_entryRuleFeature367 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleFeature374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Feature__Alternatives_in_ruleFeature400 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_entryRuleEnumeration427 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEnumeration434 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__0_in_ruleEnumeration460 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral487 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleLiteral494 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__0_in_ruleLiteral520 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt547 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt554 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName607 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName614 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType677 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntity_in_rule__EntityModelElement__Alternatives712 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEnumeration_in_rule__EntityModelElement__Alternatives729 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttribute_in_rule__Feature__Alternatives761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRelationship_in_rule__Feature__Alternatives778 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__AttributeType__Alternatives811 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__AttributeType__Alternatives832 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__AttributeType__Alternatives853 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__AttributeType__Alternatives874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__AttributeType__Alternatives895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__AttributeType__Alternatives916 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__AttributeType__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__AttributeType__Alternatives958 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__AttributeType__Alternatives979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__0__Impl_in_rule__EntityModel__Group__01012 = new BitSet(new long[]{0x0000000400100000L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__1_in_rule__EntityModel__Group__01015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__Group__1__Impl_in_rule__EntityModel__Group__11073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EntityModel__EntityModelElementsAssignment_1_in_rule__EntityModel__Group__1__Impl1100 = new BitSet(new long[]{0x0000000400100002L});
        public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01135 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01138 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__Entity__Group__0__Impl1166 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11197 = new BitSet(new long[]{0x0000000002200000L});
        public static final BitSet FOLLOW_rule__Entity__Group__2_in_rule__Entity__Group__11200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1227 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__2__Impl_in_rule__Entity__Group__21257 = new BitSet(new long[]{0x0000000002200000L});
        public static final BitSet FOLLOW_rule__Entity__Group__3_in_rule__Entity__Group__21260 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__0_in_rule__Entity__Group__2__Impl1287 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__3__Impl_in_rule__Entity__Group__31318 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__Entity__Group__4_in_rule__Entity__Group__31321 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Entity__Group__3__Impl1349 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__4__Impl_in_rule__Entity__Group__41380 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group__5_in_rule__Entity__Group__41383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__Entity__Group__4__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__5__Impl_in_rule__Entity__Group__51442 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Entity__Group__6_in_rule__Entity__Group__51445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__IdAssignment_5_in_rule__Entity__Group__5__Impl1472 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__6__Impl_in_rule__Entity__Group__61502 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__7_in_rule__Entity__Group__61505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group__6__Impl1533 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__7__Impl_in_rule__Entity__Group__71564 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Entity__Group__8_in_rule__Entity__Group__71567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0_in_rule__Entity__Group__7__Impl1594 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group__8__Impl_in_rule__Entity__Group__81624 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Entity__Group__8__Impl1652 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__0__Impl_in_rule__Entity__Group_2__01701 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__1_in_rule__Entity__Group_2__01704 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__Entity__Group_2__0__Impl1732 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__1__Impl_in_rule__Entity__Group_2__11763 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__2_in_rule__Entity__Group_2__11766 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_1_in_rule__Entity__Group_2__1__Impl1793 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2__2__Impl_in_rule__Entity__Group_2__21823 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2_2__0_in_rule__Entity__Group_2__2__Impl1850 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2_2__0__Impl_in_rule__Entity__Group_2_2__01887 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Entity__Group_2_2__1_in_rule__Entity__Group_2_2__01890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group_2_2__0__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_2_2__1__Impl_in_rule__Entity__Group_2_2__11949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__SuperTypeAssignment_2_2_1_in_rule__Entity__Group_2_2__1__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__0__Impl_in_rule__Entity__Group_7__02010 = new BitSet(new long[]{0x0000000024000000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1_in_rule__Entity__Group_7__02013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_0__0_in_rule__Entity__Group_7__0__Impl2040 = new BitSet(new long[]{0x0000000024000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7__1__Impl_in_rule__Entity__Group_7__12071 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_1_in_rule__Entity__Group_7__1__Impl2098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_0__0__Impl_in_rule__Entity__Group_7_0__02132 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_0__1_in_rule__Entity__Group_7_0__02135 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__FeaturesAssignment_7_0_0_in_rule__Entity__Group_7_0__0__Impl2162 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Entity__Group_7_0__1__Impl_in_rule__Entity__Group_7_0__12192 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Entity__Group_7_0__1__Impl2220 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__02255 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__02258 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__Attribute__Group__0__Impl2286 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__12317 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__12320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl2347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__22377 = new BitSet(new long[]{0x0000000018000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3_in_rule__Attribute__Group__22380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__Attribute__Group__2__Impl2409 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__3__Impl_in_rule__Attribute__Group__32442 = new BitSet(new long[]{0x00000000000FF800L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4_in_rule__Attribute__Group__32445 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Attribute__Group__3__Impl2473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__4__Impl_in_rule__Attribute__Group__42504 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5_in_rule__Attribute__Group__42507 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__TypeAssignment_4_in_rule__Attribute__Group__4__Impl2534 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group__5__Impl_in_rule__Attribute__Group__52564 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0_in_rule__Attribute__Group__5__Impl2591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__0__Impl_in_rule__Attribute__Group_5__02634 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1_in_rule__Attribute__Group_5__02637 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Attribute__Group_5__0__Impl2665 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__Group_5__1__Impl_in_rule__Attribute__Group_5__12696 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Attribute__EnumerationAssignment_5_1_in_rule__Attribute__Group_5__1__Impl2723 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__02757 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__02760 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__Relationship__Group__0__Impl2788 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__12819 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__12822 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__NameAssignment_1_in_rule__Relationship__Group__1__Impl2849 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__22879 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__22882 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__Relationship__Group__2__Impl2910 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__32941 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__32944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_3_in_rule__Relationship__Group__3__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__43001 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__43004 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__Relationship__Group__4__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__53063 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__53066 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__LowerBoundAssignment_5_in_rule__Relationship__Group__5__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__63123 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__63126 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__Relationship__Group__6__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__73185 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__8_in_rule__Relationship__Group__73188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__UpperBoundAssignment_7_in_rule__Relationship__Group__7__Impl3215 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__8__Impl_in_rule__Relationship__Group__83245 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_rule__Relationship__Group__9_in_rule__Relationship__Group__83248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__Relationship__Group__8__Impl3276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group__9__Impl_in_rule__Relationship__Group__93307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__0_in_rule__Relationship__Group__9__Impl3334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__0__Impl_in_rule__Relationship__Group_9__03385 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__1_in_rule__Relationship__Group_9__03388 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rule__Relationship__Group_9__0__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__Group_9__1__Impl_in_rule__Relationship__Group_9__13447 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Relationship__OppositeAssignment_9_1_in_rule__Relationship__Group_9__1__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__0__Impl_in_rule__Enumeration__Group__03508 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__1_in_rule__Enumeration__Group__03511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rule__Enumeration__Group__0__Impl3539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__1__Impl_in_rule__Enumeration__Group__13570 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__2_in_rule__Enumeration__Group__13573 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__NameAssignment_1_in_rule__Enumeration__Group__1__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__2__Impl_in_rule__Enumeration__Group__23630 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__3_in_rule__Enumeration__Group__23633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__Enumeration__Group__2__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__3__Impl_in_rule__Enumeration__Group__33692 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__4_in_rule__Enumeration__Group__33695 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_3__0_in_rule__Enumeration__Group__3__Impl3722 = new BitSet(new long[]{0x0000000000000022L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__4__Impl_in_rule__Enumeration__Group__43753 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__5_in_rule__Enumeration__Group__43756 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_4_in_rule__Enumeration__Group__4__Impl3783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group__5__Impl_in_rule__Enumeration__Group__53813 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Enumeration__Group__5__Impl3841 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_3__0__Impl_in_rule__Enumeration__Group_3__03884 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_3__1_in_rule__Enumeration__Group_3__03887 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__LiteralsAssignment_3_0_in_rule__Enumeration__Group_3__0__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Enumeration__Group_3__1__Impl_in_rule__Enumeration__Group_3__13944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__Enumeration__Group_3__1__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__0__Impl_in_rule__Literal__Group__04007 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_rule__Literal__Group__1_in_rule__Literal__Group__04010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__NameAssignment_0_in_rule__Literal__Group__0__Impl4037 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__1__Impl_in_rule__Literal__Group__14067 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_rule__Literal__Group__2_in_rule__Literal__Group__14070 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rule__Literal__Group__1__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__Group__2__Impl_in_rule__Literal__Group__24129 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Literal__ValueAssignment_2_in_rule__Literal__Group__2__Impl4156 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__04192 = new BitSet(new long[]{0x0000001000000010L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__04195 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rule__EInt__Group__0__Impl4224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__14257 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl4284 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__04317 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__04320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group__0__Impl4347 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__14376 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl4403 = new BitSet(new long[]{0x0000002000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__04438 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__04441 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_rule__QualifiedName__Group_1__0__Impl4470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__14502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__QualifiedName__Group_1__1__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEntityModelElement_in_rule__EntityModel__EntityModelElementsAssignment_14567 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_14598 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_14633 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__SuperTypeAssignment_2_2_14672 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Entity__IdAssignment_54711 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_7_0_04746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleFeature_in_rule__Entity__FeaturesAssignment_7_14777 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Attribute__NameAssignment_14808 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleAttributeType_in_rule__Attribute__TypeAssignment_44839 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__EnumerationAssignment_5_14874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__NameAssignment_14909 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__TargetAssignment_34944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Relationship__LowerBoundAssignment_54979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Relationship__UpperBoundAssignment_75010 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Relationship__OppositeAssignment_9_15045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Enumeration__NameAssignment_15080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_3_05111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleLiteral_in_rule__Enumeration__LiteralsAssignment_45142 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__Literal__NameAssignment_05173 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__ValueAssignment_25204 = new BitSet(new long[]{0x0000000000000002L});
    }


}