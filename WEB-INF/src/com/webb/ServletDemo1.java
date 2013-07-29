package com.webb;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
 
public class ServletDemo1 extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException{
		PrintWriter out = response.getWriter();
		//out.println("<html>");
		//out.println("<body>");
		//out.println("<h1>Hello Servlet Get</h1>");
		
		String inp = request.getQueryString();
		
		inp = inp.replace("%20"," ");
		inp = inp.replace("%22","\"");
		
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
		}
		
		//out.println("</body>");
		//out.println("</html>");	
	}
}