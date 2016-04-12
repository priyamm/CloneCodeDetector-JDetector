// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g 2016-04-11 17:13:34

package com.priyam.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class ExpParser extends Parser {
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


        public ExpParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public ExpParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return ExpParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g"; }



    // $ANTLR start "eval"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:10:1: eval : additionExp ;
    public final void eval() throws RecognitionException {
        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:11:5: ( additionExp )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:11:10: additionExp
            {
            pushFollow(FOLLOW_additionExp_in_eval29);
            additionExp();

            state._fsp--;


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
    // $ANTLR end "eval"


    // $ANTLR start "additionExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:14:1: additionExp : multiplyExp ( '+' multiplyExp | '-' multiplyExp )* ;
    public final void additionExp() throws RecognitionException {
        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:15:5: ( multiplyExp ( '+' multiplyExp | '-' multiplyExp )* )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:15:10: multiplyExp ( '+' multiplyExp | '-' multiplyExp )*
            {
            pushFollow(FOLLOW_multiplyExp_in_additionExp49);
            multiplyExp();

            state._fsp--;

            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:16:10: ( '+' multiplyExp | '-' multiplyExp )*
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
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:16:12: '+' multiplyExp
            	    {
            	    match(input,6,FOLLOW_6_in_additionExp63); 
            	    pushFollow(FOLLOW_multiplyExp_in_additionExp65);
            	    multiplyExp();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:17:12: '-' multiplyExp
            	    {
            	    match(input,7,FOLLOW_7_in_additionExp79); 
            	    pushFollow(FOLLOW_multiplyExp_in_additionExp81);
            	    multiplyExp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "additionExp"


    // $ANTLR start "multiplyExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:21:1: multiplyExp : atomExp ( '*' atomExp | '/' atomExp )* ;
    public final void multiplyExp() throws RecognitionException {
        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:22:5: ( atomExp ( '*' atomExp | '/' atomExp )* )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:22:10: atomExp ( '*' atomExp | '/' atomExp )*
            {
            pushFollow(FOLLOW_atomExp_in_multiplyExp114);
            atomExp();

            state._fsp--;

            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:23:10: ( '*' atomExp | '/' atomExp )*
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
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:23:12: '*' atomExp
            	    {
            	    match(input,8,FOLLOW_8_in_multiplyExp127); 
            	    pushFollow(FOLLOW_atomExp_in_multiplyExp129);
            	    atomExp();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:24:12: '/' atomExp
            	    {
            	    match(input,9,FOLLOW_9_in_multiplyExp143); 
            	    pushFollow(FOLLOW_atomExp_in_multiplyExp145);
            	    atomExp();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "multiplyExp"


    // $ANTLR start "atomExp"
    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:28:1: atomExp : ( Number | '(' additionExp ')' );
    public final void atomExp() throws RecognitionException {
        try {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:29:5: ( Number | '(' additionExp ')' )
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
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:29:10: Number
                    {
                    match(input,Number,FOLLOW_Number_in_atomExp178); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp.g:30:10: '(' additionExp ')'
                    {
                    match(input,10,FOLLOW_10_in_atomExp189); 
                    pushFollow(FOLLOW_additionExp_in_atomExp191);
                    additionExp();

                    state._fsp--;

                    match(input,11,FOLLOW_11_in_atomExp193); 

                    }
                    break;

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
    // $ANTLR end "atomExp"

    // Delegated rules


 

    public static final BitSet FOLLOW_additionExp_in_eval29 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp49 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_6_in_additionExp63 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp65 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_7_in_additionExp79 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_multiplyExp_in_additionExp81 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp114 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_8_in_multiplyExp127 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp129 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_9_in_multiplyExp143 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_atomExp_in_multiplyExp145 = new BitSet(new long[]{0x0000000000000302L});
    public static final BitSet FOLLOW_Number_in_atomExp178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_atomExp189 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_additionExp_in_atomExp191 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_atomExp193 = new BitSet(new long[]{0x0000000000000002L});

}