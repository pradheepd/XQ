import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
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

public class XQMiddleWare
{
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	
	SAXParserFactory factory;
	SAXParser saxParser;
			
	List<ParentStack> Stack = new ArrayList<ParentStack>();
		
	String Buffer= new String();
	
	String Xpath = new String();

	boolean firstnode = true;
	
	public class Attribs
	{
		String Name;
		String Value;
		
		Attribs( String a, String b)
		{
			Name = a;
			Value = b;
		}
	}
	
	public class ParentStack
	{
		public int PID;
		public int PIN;
		public int ID;
		public int COUNT=0;
		boolean wait = true;
		public String Name;
		public List<Attribs> Atts = new ArrayList<Attribs>();
		
		ParentStack(int a, int b,int c, String d, List<Attribs> e)
		{
			PID =a;
			PIN =b;
			ID = c;
			Name =d;
			Atts.addAll(e);
		}
	}
	
	XQMiddleWare(final String fname)
	{
		try
		{	
			factory = SAXParserFactory.newInstance();
			saxParser = factory.newSAXParser();
		 
			connectdb();
			
			try
			{
				Xpath = "select id from valtable where xp='doc(\""+fname+"\")'";
				
				boolean rstlen = statement.executeQuery(Xpath).next();
				
				if(rstlen == true)
					return;

			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
			}
			
			
			DefaultHandler handler = new DefaultHandler() 
			{
			
				public void startElement(String uri, String localName,String qName, 
					Attributes attributes) throws SAXException 
				{
					
					int pin,pid,idx;
					
					if(Stack.isEmpty())
					{
						pid = 0;
						pin = 0;
					}
					else
					{
						ParentStack e = Stack.get(Stack.size()-1);
												
						if(e.wait == true)
						{
							Xpath = "doc(\""+fname+"\")";
					
							for(ParentStack f :Stack)
							{
								Xpath = Xpath+"/"+f.Name;
							}
							
							try
							{
								System.out.println("call xquery.insertnode("+e.PID+","+e.PIN+",'"+e.Name+"','"+Xpath+"','"+Buffer+"');");
								statement.execute("call xquery.insertnode("+e.PID+","+e.PIN+",'"+e.Name+"','"+Xpath+"','"+Buffer+"');");
								resultSet = statement.getResultSet();
								resultSet.next();
								e.ID = resultSet.getInt("inid");
								
								for(Attribs x :e.Atts)
								{
									statement.executeUpdate("insert into attable values("+e.ID+",'"+Xpath+"','"+x.Name+"','"+x.Value+"')");
								}
								
								if(firstnode == true)
								{
									Xpath = "doc(\""+fname+"\")";
									statement.execute("insert into valtable values('"+Xpath+"',"+e.ID+",'"+Buffer+"');");
									firstnode = false;
								}
							}
							catch(SQLException ex)
							{
								ex.printStackTrace();
							}
							e.wait = false;
						}
						
						pid = e.ID;
						pin = e.COUNT;
						e.COUNT++;
					}
					
					int atlen = attributes.getLength();
					
					List<Attribs> ats = new ArrayList<Attribs>();
					
					if(atlen > 0)
					{
						int i;
						for(i=0;i<atlen;i++)
						{
							ats.add(new Attribs(attributes.getQName(i),attributes.getValue(i)));
						}
					}
					
					Stack.add(new ParentStack(pid,pin,0,qName,ats));
				}
				
				public void endElement(String uri, String localName,
					String qName) throws SAXException 
				{
					int len = Stack.size();
					
					if(len == 0)
					{
						//throw error
					}
					else if(!Stack.get(len-1).Name.equals(qName))
					{
						//throw error
					}
					else
					{
						ParentStack e = Stack.get(len-1);
						
						if(e.wait == true)
						{
							Xpath = "doc(\""+fname+"\")";
					
							for(ParentStack f :Stack)
							{
								Xpath = Xpath+"/"+f.Name;
							}
							
							try
							{
								System.out.println("call xquery.insertnode("+e.PID+","+e.PIN+",'"+e.Name+"','"+Xpath+"','"+Buffer+"');");
								statement.execute("call insertnode("+e.PID+","+e.PIN+",'"+e.Name+"','"+Xpath+"','"+Buffer+"');");
								resultSet = statement.getResultSet();
								resultSet.next();
								e.ID = resultSet.getInt("inid");
								
								if(firstnode == true)
								{
									Xpath = "doc(\""+fname+"\")";
									statement.execute("insert into valtable values('"+Xpath+"',"+e.ID+",'"+Buffer+"');");
									firstnode = false;
								}
							}
							catch(SQLException ex)
							{
								//System.out.println("SQLException: " + ex.getMessage());
								//System.out.println("SQLState: " + ex.getSQLState());
								//System.out.println("VendorError: " + ex.getErrorCode());
								ex.printStackTrace();
							}
							e.wait = false;
						}
						Stack.remove(len-1);
					}
				}
				
				public void characters(char ch[], int start, int length) throws SAXException 
				{
					String str = new String(ch,start,length);
					Buffer = str;
				}
			};
			
			saxParser.parse(fname, handler);
			
			closedb();
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
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