import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.InputSource;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

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
	
	public List<String> parseXMLRets;
	
	private static final int MAXTRIES = 3;
	
	private int tries = 0;
	
	public enum XPR {EQ, EQC};

	public enum XPVC{AT, VAL,NONE};
	
	public enum XPAC{AT, VAL,NONE};

	public enum XPC{EQ, NEQ, LT, GT, GTE, LTE,NONE};
	
	public class PathRule
	{
		String QName;
		XPR r;
		XPVC v;
		XPAC a;
		String atname;
		XPC	c;
		String vcname;
		String cnst;
	};
	
	//private boolean ABPath = false;
	
	public List<PathRule> PRules = new ArrayList<PathRule>();
	
	private XQData()
	{
		Markup = new String();
		vars = new HashMap<String,List<String>>();
		ftns = new HashMap<String,XQFns>();
		parseXMLRets = new ArrayList<String>();
		
		connectdb();
	}
	
	public static XQData getInstance()
	{
		if(Instance == null)
			Instance = new XQData();
			
		return Instance;
	}
	
	private void AddPathRules(List<XQVarDesc> path)
	{		
		PRules.clear();
		
		for(XQVarDesc e :path)
		{
			PathRule rule = new PathRule();
			
			String [] substrs = e.Path.split("//");
			
			if(substrs.length > 1)
			{
				rule.r = XPR.EQC;
			}
			else
			{			
				String [] strs = e.Path.split("/");
				
				if(strs.length > 1)
				{
					rule.r = XPR.EQ;
				}
			}
			
			e.Path = e.Path.replace("//","");
			e.Path = e.Path.replace("/","");
			
			substrs = e.Path.split("@");
			
			rule.QName = substrs[0];
			
			if(substrs.length > 1)
			{
				rule.v = XPVC.AT;
				rule.vcname = substrs[1];
			}
			else
			{
				rule.v = XPVC.VAL;
			}
			
			if(e.Cond.isEmpty())
			{
				rule.c = XPC.NONE;
			}
			else
			{
				
				String [] condsp = e.Cond.split("@");
				
				if(condsp.length > 1)
				{
					rule.a = XPAC.AT;
				}
				else
				{
					rule.a = XPAC.VAL;
				}
				
				condsp = e.Cond.split("=");
				
				if(condsp.length > 1)
				{
					rule.c = XPC.EQ;							
					rule.atname = condsp[0];
					condsp[1] = condsp[1].replace("\"","");
					rule.cnst = condsp[1];
				}
				
				condsp = e.Cond.split("!=");
				
				if(condsp.length > 1)
				{
					rule.c = XPC.NEQ;
					rule.atname = condsp[0];
					condsp[1] = condsp[1].replace("\"","");
					rule.cnst = condsp[1];
				}
								
				condsp = e.Cond.split(">");
				
				if(condsp.length > 1)
				{
					rule.c = XPC.GT;
					rule.atname = condsp[0];
					condsp[1] = condsp[1].replace("\"","");
					rule.cnst = condsp[1];
				}
				
				condsp = e.Cond.split(">=");
				
				if(condsp.length > 1)
				{
					rule.c = XPC.GTE;
					rule.atname = condsp[0];
					condsp[1] = condsp[1].replace("\"","");
					rule.cnst = condsp[1];
				}
				
				condsp = e.Cond.split("<");
				
				if(condsp.length > 1)
				{
					rule.c = XPC.LT;
					rule.atname = condsp[0];
					condsp[1] = condsp[1].replace("\"","");
					rule.cnst = condsp[1];
				}
				
				condsp = e.Cond.split("<=");
				
				if(condsp.length > 1)
				{
					rule.c = XPC.LTE;
					rule.atname = condsp[0];
					condsp[1] = condsp[1].replace("\"","");
					rule.cnst = condsp[1];
				}
			}
			System.out.println("rule:"+rule.QName+":"+rule.atname+":"+rule.c+":"+rule.cnst);
			PRules.add(rule);
		}
	}
	
	private List<String> ExecQuery(List<String> in)
	{
		List<String> ret = new ArrayList<String>();
		
		for(String item: in)
		{
			String[] param = item.split("<",2);
			parseXMLRets.clear();
			String xml = "<root>"+"<"+param[1]+"</root>";
			try
			{
				System.out.println("xml:"+xml);
				parseXML(new InputSource(new ByteArrayInputStream(xml.getBytes("utf-8"))));
			}
			catch(UnsupportedEncodingException e)
			{
				e.printStackTrace();
			}
			ret.addAll(parseXMLRets);
		}
		return ret;
	}
	
	public List<String> GetVarPath(List<String> in, XQPathStr Varpath)
	{
		List<String> ret = new ArrayList<String>();
		
		AddPathRules(Varpath.path);
		
		//System.out.println("Varpath:"+Varpath+":"+PRules.size()+":"+PRules.get(1).QName+":"+PRules.get(1).vcname);
		
		ret.addAll(ExecQuery(in));
		
		for(XQVarDesc p :Varpath.andpath)
		{
			List<XQVarDesc> vp = new ArrayList<XQVarDesc>();
			List<String> inparam = new ArrayList<String>();
			
			//vp.add(new XQVarDesc("/root",""));
			vp.add(p);
			
			AddPathRules(vp);
			
			inparam.addAll(ret);
			ret.clear();
			ret.addAll(ExecQuery(inparam));
		}
		
		for(XQVarDesc p :Varpath.orpath)
		{
			List<XQVarDesc> vp = new ArrayList<XQVarDesc>();			
			
			vp.add(new XQVarDesc("/root",""));
			vp.add(p);
			
			AddPathRules(vp);
			
			ret.addAll(ExecQuery(in));
		}	
		
		return ret;
	}
	
	public void addtoparseXMLret(String val)
	{
		parseXMLRets.add(val);
	}
	
	public void clearparseXMLret()
	{
		parseXMLRets.clear();
	}
	
	private void parseXML(InputSource in)
	{
		SAXParserFactory factory;
		SAXParser saxParser;
		
		try
		{	
			factory = SAXParserFactory.newInstance();
			saxParser = factory.newSAXParser();
			
			DefaultHandler handler = (DefaultHandler)new XQDataHandler() ;
			
			saxParser.parse(in, handler);
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
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