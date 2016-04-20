package com.priyam.antlr;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.stringtemplate.StringTemplate;

import com.priyam.antlr.Java7Parser.compilationUnit_return; 
public class Test5 {

	public static void main(String[] args) throws RecognitionException {
		String inputfirst = "import java.io.*;import java.io.*;"
		 		+ "public class HelloWord {"
		 		+ "int a=10;"+
              "public void print(String r){" +
              "for(int i = 0;true;i+=2)"
              + "if(a>b)"
              + "a=9;"
              + "else "
              + "b=094;" +
              "System.out.println(r);" +
              "}" +
              "}";
		 String inputsecond = "import java.io.*;import java.io.*;"
			 		+ "public class HelloWord2 {"
			 		+ "int a=10;"+
	                 "public void print(String r){" +
	                 "for(int j = 0;true;j+=2)"
	                 + "if(a>b)"
	                 + "a=10;"
	                 + "else "
	                 + "b=094;" +
	                 "System.out.println(r);" +
	                 "}" +
	                 "}";
		String str=cloneDetector(inputfirst,inputsecond);


}

public static String cloneDetector(String x,String y)throws RecognitionException{
	
	 
		 String str1=x,str2=y;
CharStream cs = new ANTLRStringStream(x);
Java7Lexer jl = new Java7Lexer(cs);

CommonTokenStream tokens = new CommonTokenStream();
tokens.setTokenSource(jl);
Java7Parser jp = new Java7Parser(tokens);
compilationUnit_return compilationUnit=jp.compilationUnit();
str1=((BaseTree) compilationUnit.tree).toStringTree();
	System.out.println(str1);
	
CharStream cs2 = new ANTLRStringStream(y);
Java7Lexer jl2 = new Java7Lexer(cs2);

CommonTokenStream tokens2 = new CommonTokenStream();
tokens2.setTokenSource(jl2);
Java7Parser jp2 = new Java7Parser(tokens2);
//RuleReturnScope result =jp.compilationUnit();
/*  CommonTree t = (CommonTree) result.getTree();

CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);

nodes.setTokenStream(tokens);

JavaTreeParser walker = new JavaTreeParser(nodes);*/

	
	compilationUnit_return compilationUnit2=jp2.compilationUnit();
	str2=((BaseTree) compilationUnit2.tree).toStringTree();
	System.out.println(str2);

// printTree(compilationUnit,0);

LongestCommonSubstring lcsobject =new LongestCommonSubstring();
String strclone= lcsobject.lcss(str1, str2);
System.out.println(lcsobject.lcss(str1, str2));
//System.out.println(tokens.toString());
CommonTree tree = (CommonTree)jp2.compilationUnit().getTree();
Test5 gen = new Test5();
return strclone;

}

}
		
	


