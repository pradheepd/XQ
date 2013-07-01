import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.*;

class XQData 
{
	public String Markup;
	
	public Map<String,List<String>> vars;
	
	public Map<String,XQFns> ftns;
	
	public boolean isFnCtx = false;
	
	public boolean isRetFn = false;
	
	private static XQData Instance;
	
	private Connection connect = null;
	
	private Statement statement = null;
	
	private ResultSet resultSet = null;
	
	private static final int MAXTRIES = 3;
	
	private int tries = 0;
	
	private XQData()
	{
		Markup = new String();
		vars = new HashMap<String,List<String>>();
		ftns = new HashMap<String,XQFns>();
		
		connectdb();
	}
	
	public static XQData getInstance()
	{
		if(Instance == null)
			Instance = new XQData();
			
		return Instance;
	}
	
	public List<String> GetXPath(String path)
	{
		List<String> Rtn = new ArrayList<String>();
		
		try
		{
			statement.execute("call xquery.xpath('"+path+"')");
			resultSet = statement.getResultSet();
			
			while(resultSet.next())
			{
				Rtn.add(new String(resultSet.getString("records")));
			}
		}
		catch (SQLException e) 
		{
			closedb();
			tries++;
			if(tries < MAXTRIES)
			{
				if(connectdb())
					GetXPath(path);
				else
					tries = 0;
			}
			else
			{
				tries = 0;
			}
		}
		
		return Rtn;
	}
	
	private boolean connectdb()
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