// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g 2016-04-11 17:13:54

package com.priyam.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class simpleParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Number", "WS", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int EOF=-1;
    public static final int T__6=6;
    public static final int T__7=7;
    public static final int T__8=8;
    public static final int T__9=9;
    public static final int T__10=10;
    public static final int T__11=11;
    public static final int Number=4;
    public static final int WS=5;

    // delegates
    // delegators


        public simpleParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public simpleParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return simpleParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g"; }


    public static class eval_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eval"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:16:1: eval : additionExp ;
    public final simpleParser.eval_return eval() throws RecognitionException {
        simpleParser.eval_return retval = new simpleParser.eval_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        simpleParser.additionExp_return additionExp1 = null;



        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:17:5: ( additionExp )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:17:10: additionExp
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_additionExp_in_eval54);
            additionExp1=additionExp();

            state._fsp--;

            adaptor.addChild(root_0, additionExp1.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eval"

    public static class additionExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additionExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:21:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
    public final simpleParser.additionExp_return additionExp() throws RecognitionException {
        simpleParser.additionExp_return retval = new simpleParser.additionExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal3=null;
        Token char_literal5=null;
        simpleParser.multiplyExp_return multiplyExp2 = null;

        simpleParser.multiplyExp_return multiplyExp4 = null;

        simpleParser.multiplyExp_return multiplyExp6 = null;


        Object char_literal3_tree=null;
        Object char_literal5_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:22:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:22:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_multiplyExp_in_additionExp76);
            multiplyExp2=multiplyExp();

            state._fsp--;

            adaptor.addChild(root_0, multiplyExp2.getTree());
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:23:10: ( '+' multiplyExp | '-' multiplyExp )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==6) ) {
                    alt1=1;
                }
                else if ( (LA1_0==7) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:23:12: '+' multiplyExp
            	    {
            	    char_literal3=(Token)match(input,6,FOLLOW_6_in_additionExp89); 
            	    char_literal3_tree = (Object)adaptor.create(char_literal3);
            	    adaptor.addChild(root_0, char_literal3_tree);

            	    pushFollow(FOLLOW_multiplyExp_in_additionExp91);
            	    multiplyExp4=multiplyExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplyExp4.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:24:12: '-' multiplyExp
            	    {
            	    char_literal5=(Token)match(input,7,FOLLOW_7_in_additionExp104); 
            	    char_literal5_tree = (Object)adaptor.create(char_literal5);
            	    adaptor.addChild(root_0, char_literal5_tree);

            	    pushFollow(FOLLOW_multiplyExp_in_additionExp106);
            	    multiplyExp6=multiplyExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplyExp6.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additionExp"

    public static class multiplyExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplyExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:29:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
    public final simpleParser.multiplyExp_return multiplyExp() throws RecognitionException {
        simpleParser.multiplyExp_return retval = new simpleParser.multiplyExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal8=null;
        Token char_literal10=null;
        simpleParser.atomExp_return atomExp7 = null;

        simpleParser.atomExp_return atomExp9 = null;

        simpleParser.atomExp_return atomExp11 = null;


        Object char_literal8_tree=null;
        Object char_literal10_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:30:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:30:10: atomExp ( '*' atomExp | '/' atomExp )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_atomExp_in_multiplyExp141);
            atomExp7=atomExp();

            state._fsp--;

            adaptor.addChild(root_0, atomExp7.getTree());
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:31:10: ( '*' atomExp | '/' atomExp )*
            loop2:
            do {
                int alt2=3;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==8) ) {
                    alt2=1;
                }
                else if ( (LA2_0==9) ) {
                    alt2=2;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:31:12: '*' atomExp
            	    {
            	    char_literal8=(Token)match(input,8,FOLLOW_8_in_multiplyExp154); 
            	    char_literal8_tree = (Object)adaptor.create(char_literal8);
            	    adaptor.addChild(root_0, char_literal8_tree);

            	    pushFollow(FOLLOW_atomExp_in_multiplyExp156);
            	    atomExp9=atomExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atomExp9.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:32:12: '/' atomExp
            	    {
            	    char_literal10=(Token)match(input,9,FOLLOW_9_in_multiplyExp170); 
            	    char_literal10_tree = (Object)adaptor.create(char_literal10);
            	    adaptor.addChild(root_0, char_literal10_tree);

            	    pushFollow(FOLLOW_atomExp_in_multiplyExp172);
            	    atomExp11=atomExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atomExp11.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplyExp"

    public static class atomExp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:39:1: atomExp : ( Number | '(' additionExp ')' );
    public final simpleParser.atomExp_return atomExp() throws RecognitionException {
        simpleParser.atomExp_return retval = new simpleParser.atomExp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Number12=null;
        Token char_literal13=null;
        Token char_literal15=null;
        simpleParser.additionExp_return additionExp14 = null;


        Object Number12_tree=null;
        Object char_literal13_tree=null;
        Object char_literal15_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:40:5: ( Number | '(' additionExp ')' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Number) ) {
                alt3=1;
            }
            else if ( (LA3_0==10) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:40:10: Number
                    {
                    root_0 = (Object)adaptor.nil();

                    Number12=(Token)match(input,Number,FOLLOW_Number_in_atomExp207); 
                    Number12_tree = (Object)adaptor.create(Number12);
                    adaptor.addChild(root_0, Number12_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\simple.g:41:10: '(' additionExp ')'
                    {
                    root_0 = (Object)adaptor.nil();

                    char_literal13=(Token)match(input,10,FOLLOW_10_in_atomExp218); 
                    char_literal13_tree = (Object)adaptor.create(char_literal13);
                    adaptor.addChild(root_0, char_literal13_tree);

                    pushFollow(FOLLOW_additionExp_in_atomExp220);
                    additionExp14=additionExp();

                    state._fsp--;

                    adaptor.addChild(root_0, additionExp14.getTree());
                    char_literal15=(Token)match(input,11,FOLLOW_11_in_atomExp222); 
                    char_literal15_tree = (Object)adaptor.create(char_literal15);
                    adaptor.addChild(root_0, char_literal15_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_additionExp_in_eval54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp76 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_6_in_additionExp89 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp91 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_7_in_additionExp104 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp106 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp141 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_multiplyExp154 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp156 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_9_in_multiplyExp170 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp172 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_Number_in_atomExp207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atomExp218 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_additionExp_in_atomExp220 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomExp222 = new BitSet(new long[]{0x0000000000000002L});

}