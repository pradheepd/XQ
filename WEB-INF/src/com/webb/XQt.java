package com.webb;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class XQt
{
	public static void main(String[] args) throws Exception 
	{
		if(args.length > 1)
		{
			//XQMiddleWare upfile = new XQMiddleWare(args[1]);
		}
		// create a CharStream that reads from standard input
		ANTLRFileStream input = new ANTLRFileStream(args[0]);
		// create a lexer that feeds off of input CharStream
		XQL lexer = new XQL(input);
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		XQParser parser = new XQParser(tokens);
		ParseTree tree = parser.prog();
		//System.out.println(tree.toStringTree(parser));
	}
}
