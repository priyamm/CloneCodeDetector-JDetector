// $ANTLR 3.3 Nov 30, 2010 12:50:56 C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g 2016-04-11 17:13:35

  package com.priyam.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Exp2Lexer extends Lexer {
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

    public Exp2Lexer() {;} 
    public Exp2Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Exp2Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g"; }

    // $ANTLR start "T__6"
    public final void mT__6() throws RecognitionException {
        try {
            int _type = T__6;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:11:6: ( '+' )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:11:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__6"

    // $ANTLR start "T__7"
    public final void mT__7() throws RecognitionException {
        try {
            int _type = T__7;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:12:6: ( '-' )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:12:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__7"

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:13:6: ( '*' )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:13:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:14:6: ( '/' )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:14:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:15:7: ( '(' )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:15:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:16:7: ( ')' )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:16:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
            {
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:10: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:11: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:22: ( '.' ( '0' .. '9' )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='.') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:23: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:27: ( '0' .. '9' )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:39:28: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:43:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:43:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:8: ( T__6 | T__7 | T__8 | T__9 | T__10 | T__11 | Number | WS )
        int alt4=8;
        switch ( input.LA(1) ) {
        case '+':
            {
            alt4=1;
            }
            break;
        case '-':
            {
            alt4=2;
            }
            break;
        case '*':
            {
            alt4=3;
            }
            break;
        case '/':
            {
            alt4=4;
            }
            break;
        case '(':
            {
            alt4=5;
            }
            break;
        case ')':
            {
            alt4=6;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt4=7;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt4=8;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 4, 0, input);

            throw nvae;
        }

        switch (alt4) {
            case 1 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:10: T__6
                {
                mT__6(); 

                }
                break;
            case 2 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:15: T__7
                {
                mT__7(); 

                }
                break;
            case 3 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:20: T__8
                {
                mT__8(); 

                }
                break;
            case 4 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:25: T__9
                {
                mT__9(); 

                }
                break;
            case 5 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:30: T__10
                {
                mT__10(); 

                }
                break;
            case 6 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:36: T__11
                {
                mT__11(); 

                }
                break;
            case 7 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:42: Number
                {
                mNumber(); 

                }
                break;
            case 8 :
                // C:\\Users\\Priyam\\workspace\\ccd\\src\\com\\priyam\\antlr\\Exp2.g:1:49: WS
                {
                mWS(); 

                }
                break;

        }

    }


 

}