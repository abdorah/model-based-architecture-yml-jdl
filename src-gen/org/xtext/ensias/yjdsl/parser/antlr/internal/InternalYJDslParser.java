package org.xtext.ensias.yjdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ensias.yjdsl.services.YJDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalYJDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Application'", "'{'", "'config'", "'entity'", "','", "'}'", "'Config'", "'baseName'", "'appType'", "'packageName'", "'dataBaseType'", "'Entity'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalYJDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalYJDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalYJDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalYJDsl.g"; }



     	private YJDslGrammarAccess grammarAccess;

        public InternalYJDslParser(TokenStream input, YJDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Application";
       	}

       	@Override
       	protected YJDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleApplication"
    // InternalYJDsl.g:64:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalYJDsl.g:64:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalYJDsl.g:65:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalYJDsl.g:71:1: ruleApplication returns [EObject current=null] : (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'config' ( (lv_config_3_0= ruleConfig ) ) (otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_config_3_0 = null;

        EObject lv_entity_6_0 = null;

        EObject lv_entity_8_0 = null;



        	enterRule();

        try {
            // InternalYJDsl.g:77:2: ( (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'config' ( (lv_config_3_0= ruleConfig ) ) (otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalYJDsl.g:78:2: (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'config' ( (lv_config_3_0= ruleConfig ) ) (otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalYJDsl.g:78:2: (otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'config' ( (lv_config_3_0= ruleConfig ) ) (otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalYJDsl.g:79:3: otherlv_0= 'Application' otherlv_1= '{' otherlv_2= 'config' ( (lv_config_3_0= ruleConfig ) ) (otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getApplicationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getApplicationAccess().getConfigKeyword_2());
            		
            // InternalYJDsl.g:91:3: ( (lv_config_3_0= ruleConfig ) )
            // InternalYJDsl.g:92:4: (lv_config_3_0= ruleConfig )
            {
            // InternalYJDsl.g:92:4: (lv_config_3_0= ruleConfig )
            // InternalYJDsl.g:93:5: lv_config_3_0= ruleConfig
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getConfigConfigParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_config_3_0=ruleConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"config",
            						lv_config_3_0,
            						"org.xtext.ensias.yjdsl.YJDsl.Config");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalYJDsl.g:110:3: (otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalYJDsl.g:111:4: otherlv_4= 'entity' otherlv_5= '{' ( (lv_entity_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getApplicationAccess().getEntityKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getApplicationAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalYJDsl.g:119:4: ( (lv_entity_6_0= ruleEntity ) )
                    // InternalYJDsl.g:120:5: (lv_entity_6_0= ruleEntity )
                    {
                    // InternalYJDsl.g:120:5: (lv_entity_6_0= ruleEntity )
                    // InternalYJDsl.g:121:6: lv_entity_6_0= ruleEntity
                    {

                    						newCompositeNode(grammarAccess.getApplicationAccess().getEntityEntityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_entity_6_0=ruleEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getApplicationRule());
                    						}
                    						add(
                    							current,
                    							"entity",
                    							lv_entity_6_0,
                    							"org.xtext.ensias.yjdsl.YJDsl.Entity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalYJDsl.g:138:4: (otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalYJDsl.g:139:5: otherlv_7= ',' ( (lv_entity_8_0= ruleEntity ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getApplicationAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalYJDsl.g:143:5: ( (lv_entity_8_0= ruleEntity ) )
                    	    // InternalYJDsl.g:144:6: (lv_entity_8_0= ruleEntity )
                    	    {
                    	    // InternalYJDsl.g:144:6: (lv_entity_8_0= ruleEntity )
                    	    // InternalYJDsl.g:145:7: lv_entity_8_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getApplicationAccess().getEntityEntityParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_entity_8_0=ruleEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getApplicationRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entity",
                    	    								lv_entity_8_0,
                    	    								"org.xtext.ensias.yjdsl.YJDsl.Entity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getApplicationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleConfig"
    // InternalYJDsl.g:176:1: entryRuleConfig returns [EObject current=null] : iv_ruleConfig= ruleConfig EOF ;
    public final EObject entryRuleConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfig = null;


        try {
            // InternalYJDsl.g:176:47: (iv_ruleConfig= ruleConfig EOF )
            // InternalYJDsl.g:177:2: iv_ruleConfig= ruleConfig EOF
            {
             newCompositeNode(grammarAccess.getConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConfig=ruleConfig();

            state._fsp--;

             current =iv_ruleConfig; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConfig"


    // $ANTLR start "ruleConfig"
    // InternalYJDsl.g:183:1: ruleConfig returns [EObject current=null] : ( () otherlv_1= 'Config' otherlv_2= '{' (otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) ) )? (otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) ) )? (otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) ) )? (otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) ) )? otherlv_11= '}' ) ;
    public final EObject ruleConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_baseName_4_0 = null;

        AntlrDatatypeRuleToken lv_appType_6_0 = null;

        AntlrDatatypeRuleToken lv_packageName_8_0 = null;

        AntlrDatatypeRuleToken lv_dataBaseType_10_0 = null;



        	enterRule();

        try {
            // InternalYJDsl.g:189:2: ( ( () otherlv_1= 'Config' otherlv_2= '{' (otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) ) )? (otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) ) )? (otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) ) )? (otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) ) )? otherlv_11= '}' ) )
            // InternalYJDsl.g:190:2: ( () otherlv_1= 'Config' otherlv_2= '{' (otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) ) )? (otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) ) )? (otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) ) )? (otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) ) )? otherlv_11= '}' )
            {
            // InternalYJDsl.g:190:2: ( () otherlv_1= 'Config' otherlv_2= '{' (otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) ) )? (otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) ) )? (otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) ) )? (otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) ) )? otherlv_11= '}' )
            // InternalYJDsl.g:191:3: () otherlv_1= 'Config' otherlv_2= '{' (otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) ) )? (otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) ) )? (otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) ) )? (otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) ) )? otherlv_11= '}'
            {
            // InternalYJDsl.g:191:3: ()
            // InternalYJDsl.g:192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConfigAccess().getConfigAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConfigAccess().getConfigKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getConfigAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalYJDsl.g:206:3: (otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalYJDsl.g:207:4: otherlv_3= 'baseName' ( (lv_baseName_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getConfigAccess().getBaseNameKeyword_3_0());
                    			
                    // InternalYJDsl.g:211:4: ( (lv_baseName_4_0= ruleEString ) )
                    // InternalYJDsl.g:212:5: (lv_baseName_4_0= ruleEString )
                    {
                    // InternalYJDsl.g:212:5: (lv_baseName_4_0= ruleEString )
                    // InternalYJDsl.g:213:6: lv_baseName_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConfigAccess().getBaseNameEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_baseName_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigRule());
                    						}
                    						set(
                    							current,
                    							"baseName",
                    							lv_baseName_4_0,
                    							"org.xtext.ensias.yjdsl.YJDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYJDsl.g:231:3: (otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalYJDsl.g:232:4: otherlv_5= 'appType' ( (lv_appType_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_11); 

                    				newLeafNode(otherlv_5, grammarAccess.getConfigAccess().getAppTypeKeyword_4_0());
                    			
                    // InternalYJDsl.g:236:4: ( (lv_appType_6_0= ruleEString ) )
                    // InternalYJDsl.g:237:5: (lv_appType_6_0= ruleEString )
                    {
                    // InternalYJDsl.g:237:5: (lv_appType_6_0= ruleEString )
                    // InternalYJDsl.g:238:6: lv_appType_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConfigAccess().getAppTypeEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_appType_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigRule());
                    						}
                    						set(
                    							current,
                    							"appType",
                    							lv_appType_6_0,
                    							"org.xtext.ensias.yjdsl.YJDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYJDsl.g:256:3: (otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalYJDsl.g:257:4: otherlv_7= 'packageName' ( (lv_packageName_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getConfigAccess().getPackageNameKeyword_5_0());
                    			
                    // InternalYJDsl.g:261:4: ( (lv_packageName_8_0= ruleEString ) )
                    // InternalYJDsl.g:262:5: (lv_packageName_8_0= ruleEString )
                    {
                    // InternalYJDsl.g:262:5: (lv_packageName_8_0= ruleEString )
                    // InternalYJDsl.g:263:6: lv_packageName_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConfigAccess().getPackageNameEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_packageName_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigRule());
                    						}
                    						set(
                    							current,
                    							"packageName",
                    							lv_packageName_8_0,
                    							"org.xtext.ensias.yjdsl.YJDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalYJDsl.g:281:3: (otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalYJDsl.g:282:4: otherlv_9= 'dataBaseType' ( (lv_dataBaseType_10_0= ruleEString ) )
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getConfigAccess().getDataBaseTypeKeyword_6_0());
                    			
                    // InternalYJDsl.g:286:4: ( (lv_dataBaseType_10_0= ruleEString ) )
                    // InternalYJDsl.g:287:5: (lv_dataBaseType_10_0= ruleEString )
                    {
                    // InternalYJDsl.g:287:5: (lv_dataBaseType_10_0= ruleEString )
                    // InternalYJDsl.g:288:6: lv_dataBaseType_10_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getConfigAccess().getDataBaseTypeEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_dataBaseType_10_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConfigRule());
                    						}
                    						set(
                    							current,
                    							"dataBaseType",
                    							lv_dataBaseType_10_0,
                    							"org.xtext.ensias.yjdsl.YJDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getConfigAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfig"


    // $ANTLR start "entryRuleEntity"
    // InternalYJDsl.g:314:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalYJDsl.g:314:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalYJDsl.g:315:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

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
    // InternalYJDsl.g:321:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalYJDsl.g:327:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalYJDsl.g:328:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalYJDsl.g:328:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) )
            // InternalYJDsl.g:329:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalYJDsl.g:329:3: ()
            // InternalYJDsl.g:330:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalYJDsl.g:340:3: ( (lv_name_2_0= ruleEString ) )
            // InternalYJDsl.g:341:4: (lv_name_2_0= ruleEString )
            {
            // InternalYJDsl.g:341:4: (lv_name_2_0= ruleEString )
            // InternalYJDsl.g:342:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.ensias.yjdsl.YJDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

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


    // $ANTLR start "entryRuleEString"
    // InternalYJDsl.g:363:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalYJDsl.g:363:47: (iv_ruleEString= ruleEString EOF )
            // InternalYJDsl.g:364:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalYJDsl.g:370:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalYJDsl.g:376:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalYJDsl.g:377:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalYJDsl.g:377:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalYJDsl.g:378:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalYJDsl.g:386:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003D0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000210000L});

}