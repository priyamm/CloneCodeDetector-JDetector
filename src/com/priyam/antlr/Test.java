package com.priyam.antlr;
import org.antlr.runtime.*;
import org.antlr.runtime.ANTLRStringStream;
public class Test {

	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
			CharStream charStream= new ANTLRStringStream("3+2*85-6");
			simpleLexer lexer=new simpleLexer(charStream);
			TokenStream tokenStream=new CommonTokenStream(lexer);
			simpleParser parser = new simpleParser(tokenStream);
			parser.eval();
			System.out.println("okay");
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
	}

}
