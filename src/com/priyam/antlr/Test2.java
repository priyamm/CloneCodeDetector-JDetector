package com.priyam.antlr;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.BaseTree;
import org.antlr.runtime.tree.CommonTree;

import com.priyam.antlr.Exp2Parser.eval_return;
import com.priyam.antlr.Java6Parser.compilationUnit_return; 
public class Test2 {

	public static void main(String[] args) throws RecognitionException {
		// TODO Auto-generated method stub

		 String input = "public class HelloWord {"+
                 "public void print(String r){" +
                 "for(int i = 0;true;i+=2)" +
                 "System.out.println(r);" +
                 "}" +
                 "}";

  CharStream cs = new ANTLRStringStream(input);
  Java6Lexer jl = new Java6Lexer(cs);

  CommonTokenStream tokens = new CommonTokenStream();
  tokens.setTokenSource(jl);
  Java6Parser jp = new Java6Parser(tokens);
 //RuleReturnScope result =jp.compilationUnit();
/*  CommonTree t = (CommonTree) result.getTree();

  CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);

  nodes.setTokenStream(tokens);

  JavaTreeParser walker = new JavaTreeParser(nodes);*/
 compilationUnit_return compilationUnit=jp.compilationUnit();
	System.out.println(((BaseTree) compilationUnit.tree).toStringTree());  
	System.out.println("\nWalk tree:\n");

 // printTree(compilationUnit,0);


  System.out.println(tokens.toString());

  }

public static void printTree(CommonTree t, int indent) {
  if ( t != null ) {
      StringBuffer sb = new StringBuffer(indent);
      for ( int i = 0; i < indent; i++ )
          sb = sb.append("   ");
      for ( int i = 0; i < t.getChildCount(); i++ ) {
          System.out.println(sb.toString() + t.getChild(i).toString());
          printTree((CommonTree)t.getChild(i), indent+1);
      }
  }
}
		
	

}
