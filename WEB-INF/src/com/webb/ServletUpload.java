package com.webb;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletUpload extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException
	{
		String name = request.getParameter("name");
		String xml = request.getParameter("xml");
		
		XQMiddleWare m = new XQMiddleWare(name,xml);
	}
}