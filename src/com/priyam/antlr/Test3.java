package com.priyam.antlr;
import org.antlr.runtime.*;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;
import org.antlr.stringtemplate.StringTemplate;

import com.priyam.antlr.Exp2Parser.eval_return;
public class Test3 {
	public static String str1;
	public static String str2;
	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub
			CharStream charStream= new ANTLRStringStream("3+2*85-6");
			Exp2Lexer lexer=new Exp2Lexer(charStream);
			TokenStream tokenStream=new CommonTokenStream(lexer);
			Exp2Parser parser = new Exp2Parser(tokenStream);
			eval_return eval=parser.eval();
			str1=eval.tree.toStringTree();
			CharStream charStream2= new ANTLRStringStream("3-23*85-6");
			Exp2Lexer lexer2=new Exp2Lexer(charStream2);
			TokenStream tokenStream2=new CommonTokenStream(lexer2);
			Exp2Parser parser2 = new Exp2Parser(tokenStream2);
			eval_return eval2=parser2.eval();
			str2=eval2.tree.toStringTree();
			System.out.println(str1);
			System.out.println(str2);
			System.out.println();
			 CommonTree tree = (CommonTree)parser.eval().getTree();
		        DOTTreeGenerator gen = new DOTTreeGenerator();
		        StringTemplate st = gen.toDOT(tree);
		        System.out.println(st);
			//System.out.println("result="+eval.eval());
			try {
				LongestCommonSubstring lcs=new LongestCommonSubstring();
				System.out.println(lcs.check(str1, str2));
				
			} catch (Exception e) {
				// TODO: handle exception
			}
	}

	

}
