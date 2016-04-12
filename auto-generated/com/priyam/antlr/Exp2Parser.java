// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g 2016-04-11 17:13:35

package com.priyam.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Exp2Parser extends Parser {
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


        public Exp2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Exp2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Exp2Parser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g"; }


    public static class eval_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "eval"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:15:1: eval : additionExp EOF ;
    public final Exp2Parser.eval_return eval() throws RecognitionException {
        Exp2Parser.eval_return retval = new Exp2Parser.eval_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token EOF2=null;
        Exp2Parser.additionExp_return additionExp1 = null;


        CommonTree EOF2_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:16:5: ( additionExp EOF )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:16:10: additionExp EOF
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_additionExp_in_eval51);
            additionExp1=additionExp();

            state._fsp--;

            adaptor.addChild(root_0, additionExp1.getTree());
            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_eval53); 

            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "eval"

    public static class additionExp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "additionExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:19:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
    public final Exp2Parser.additionExp_return additionExp() throws RecognitionException {
        Exp2Parser.additionExp_return retval = new Exp2Parser.additionExp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal4=null;
        Token char_literal6=null;
        Exp2Parser.multiplyExp_return multiplyExp3 = null;

        Exp2Parser.multiplyExp_return multiplyExp5 = null;

        Exp2Parser.multiplyExp_return multiplyExp7 = null;


        CommonTree char_literal4_tree=null;
        CommonTree char_literal6_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:20:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:20:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_multiplyExp_in_additionExp74);
            multiplyExp3=multiplyExp();

            state._fsp--;

            adaptor.addChild(root_0, multiplyExp3.getTree());
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:21:10: ( '+' multiplyExp | '-' multiplyExp )*
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
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:21:12: '+' multiplyExp
            	    {
            	    char_literal4=(Token)match(input,6,FOLLOW_6_in_additionExp88); 
            	    char_literal4_tree = (CommonTree)adaptor.create(char_literal4);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal4_tree, root_0);

            	    pushFollow(FOLLOW_multiplyExp_in_additionExp91);
            	    multiplyExp5=multiplyExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplyExp5.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:22:12: '-' multiplyExp
            	    {
            	    char_literal6=(Token)match(input,7,FOLLOW_7_in_additionExp105); 
            	    char_literal6_tree = (CommonTree)adaptor.create(char_literal6);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal6_tree, root_0);

            	    pushFollow(FOLLOW_multiplyExp_in_additionExp108);
            	    multiplyExp7=multiplyExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplyExp7.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "additionExp"

    public static class multiplyExp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "multiplyExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:26:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
    public final Exp2Parser.multiplyExp_return multiplyExp() throws RecognitionException {
        Exp2Parser.multiplyExp_return retval = new Exp2Parser.multiplyExp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token char_literal9=null;
        Token char_literal11=null;
        Exp2Parser.atomExp_return atomExp8 = null;

        Exp2Parser.atomExp_return atomExp10 = null;

        Exp2Parser.atomExp_return atomExp12 = null;


        CommonTree char_literal9_tree=null;
        CommonTree char_literal11_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:27:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:27:10: atomExp ( '*' atomExp | '/' atomExp )*
            {
            root_0 = (CommonTree)adaptor.nil();

            pushFollow(FOLLOW_atomExp_in_multiplyExp141);
            atomExp8=atomExp();

            state._fsp--;

            adaptor.addChild(root_0, atomExp8.getTree());
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:28:10: ( '*' atomExp | '/' atomExp )*
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
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:28:12: '*' atomExp
            	    {
            	    char_literal9=(Token)match(input,8,FOLLOW_8_in_multiplyExp154); 
            	    char_literal9_tree = (CommonTree)adaptor.create(char_literal9);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal9_tree, root_0);

            	    pushFollow(FOLLOW_atomExp_in_multiplyExp157);
            	    atomExp10=atomExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atomExp10.getTree());

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:29:12: '/' atomExp
            	    {
            	    char_literal11=(Token)match(input,9,FOLLOW_9_in_multiplyExp171); 
            	    char_literal11_tree = (CommonTree)adaptor.create(char_literal11);
            	    root_0 = (CommonTree)adaptor.becomeRoot(char_literal11_tree, root_0);

            	    pushFollow(FOLLOW_atomExp_in_multiplyExp174);
            	    atomExp12=atomExp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atomExp12.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "multiplyExp"

    public static class atomExp_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atomExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:33:1: atomExp : ( Number | '(' additionExp ')' );
    public final Exp2Parser.atomExp_return atomExp() throws RecognitionException {
        Exp2Parser.atomExp_return retval = new Exp2Parser.atomExp_return();
        retval.start = input.LT(1);

        CommonTree root_0 = null;

        Token Number13=null;
        Token char_literal14=null;
        Token char_literal16=null;
        Exp2Parser.additionExp_return additionExp15 = null;


        CommonTree Number13_tree=null;
        CommonTree char_literal14_tree=null;
        CommonTree char_literal16_tree=null;

        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:34:5: ( Number | '(' additionExp ')' )
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
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:34:10: Number
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    Number13=(Token)match(input,Number,FOLLOW_Number_in_atomExp207); 
                    Number13_tree = (CommonTree)adaptor.create(Number13);
                    adaptor.addChild(root_0, Number13_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:35:10: '(' additionExp ')'
                    {
                    root_0 = (CommonTree)adaptor.nil();

                    char_literal14=(Token)match(input,10,FOLLOW_10_in_atomExp218); 
                    pushFollow(FOLLOW_additionExp_in_atomExp221);
                    additionExp15=additionExp();

                    state._fsp--;

                    adaptor.addChild(root_0, additionExp15.getTree());
                    char_literal16=(Token)match(input,11,FOLLOW_11_in_atomExp223); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "atomExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_additionExp_in_eval51 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_eval53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp74 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_6_in_additionExp88 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp91 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_7_in_additionExp105 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp108 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp141 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_multiplyExp154 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp157 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_9_in_multiplyExp171 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp174 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_Number_in_atomExp207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atomExp218 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_additionExp_in_atomExp221 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomExp223 = new BitSet(new long[]{0x0000000000000002L});

}