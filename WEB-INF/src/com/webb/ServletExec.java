package com.webb;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
 
public class ServletExec extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		PrintWriter out = response.getWriter();
		
		String inp = request.getParameter("query");
		
		if(inp != null)
		{
			ANTLRInputStream input = new ANTLRInputStream(inp);
			
			XQL lexer = new XQL(input);
			// create a buffer of tokens pulled from the lexer
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			// create a parser that feeds off the tokens buffer
			XQParser parser = new XQParser(tokens);
			
			ParseTree tree = parser.prog();
			out.println(XQData.getInstance().Markup);
			
			XQData.getInstance().ResetVars();
		}
	}
}