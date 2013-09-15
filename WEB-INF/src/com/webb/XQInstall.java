package com.webb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;
import java.io.*;

public class XQInstall
{
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	XQInstall(String path)
	{	
		File[] files = new File(path).listFiles();

		connectdb();
		
		for (File file : files)
		{
			if (file.isFile())
			{
				try
				{
					BufferedReader br = new BufferedReader(new FileReader(path+"/"+file.getName()));
					
					String SPName = file.getName();
					SPName = SPName.replace(".sql","");
					String sCurrentLine;
					String SP = "";
					
					while ((sCurrentLine = br.readLine()) != null) {
						SP +=sCurrentLine+"\n";
					}					
					
					statement.executeQuery("use xquery;");
					statement.executeUpdate("DROP procedure IF EXISTS "+SPName+";");
					statement.executeUpdate(SP);
					
					if(br != null)
						br.close();
				}
				catch(IOException e)
				{
					System.out.println("read file failed:"+e.getMessage());
				}
				catch(SQLException e)
				{
					System.out.println("SQL statement failed:"+file.getName()+":"+e.getMessage());
				}
			}
		}
		
		closedb();
	}
	
	public static void main(String[] args) throws Exception 
	{
		//XQInstall ExecSP = new XQInstall();
	}
	
	boolean connectdb()
	{
		boolean rtn = false;
		try 
		{
			// This will load the MySQL driver, each DB has its own driver
			Class.forName("com.mysql.jdbc.Driver");
			// Setup the connection with the DB
			if((connect = DriverManager.getConnection("jdbc:mysql://localhost/xquery?"+"user=root"))!= null)
			{
			
				if((statement = connect.createStatement())!=null)
				{
					connect.setAutoCommit(true);
					rtn = true;
				}
			}
		}
		catch (SQLException e) 
		{
			System.out.println("SQLException: " + e.getMessage());
			System.out.println("SQLState: " + e.getSQLState());
			System.out.println("VendorError: " + e.getErrorCode());
		} 
		catch (Exception e)
		{
			System.out.println("Exception: " + e.getMessage());
		}
		finally 
		{
			//closedb();
		}
		return rtn;
	}
	
	private void closedb() 
	{
		try 
		{
		  if (resultSet != null) 
		  {
			resultSet.close();
		  }

		  if (statement != null) 
		  {
			statement.close();
		  }

		  if (connect != null) {
			connect.close();
		  }
		} 
	
		catch (Exception e) 
		{

		}
    }
}