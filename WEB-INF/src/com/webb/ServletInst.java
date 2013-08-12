package com.webb;
 
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletInst extends HttpServlet{
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws IOException
	{
		String relativeWebPath = "/WEB-INF/SP";
		String absoluteDiskPath = getServletContext().getRealPath(relativeWebPath);
		XQInstall ExecSP = new XQInstall(absoluteDiskPath);
	}
}