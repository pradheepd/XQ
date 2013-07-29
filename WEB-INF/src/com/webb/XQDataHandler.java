package com.webb;

import java.util.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class XQDataHandler extends DefaultHandler
{
	private int i = 0;
	private int len = 0;
	private boolean cont = true;
	private boolean stage1 = false;
	private boolean stage2 = false;
	private boolean matched = false;
	private String matchedStr;
	private String Buffer;
	private String MatchedString = new String();
	private String Matchbuff = new String();
	private enum MCOND{ TRUE, FALSE, CONT};
	
	private MCOND condeval = MCOND.CONT;
	
	XQDataHandler()
	{
		len = XQData.getInstance().PRules.size();
	}

	public void startElement(String uri, String localName,String qName, 
		Attributes attributes) throws SAXException 
	{
		if(matched == false)
		{
			
			if(XQData.getInstance().PRules.get(i).r == XQData.XPR.EQ)
			{
				if(!XQData.getInstance().PRules.get(i).QName.equals(qName) && stage1==false)
				{
					cont = false;
				}
				else
				{
					stage1 = true;
					cont = true;
				}
			}
				
			if(cont == true)
			{
			
				boolean dontmatch = false;
							
				if(XQData.getInstance().PRules.get(i).r == XQData.XPR.EQC && XQData.getInstance().PRules.get(i).QName.equals(qName))
				{
					stage1 = true;
				}
				
				System.out.println("conditions:"+XQData.getInstance().PRules.get(i).QName+":"+XQData.getInstance().PRules.get(i).c+":"+stage1+":"+stage2+":"+XQData.getInstance().PRules.get(i).a);
				if(XQData.getInstance().PRules.get(i).c != XQData.XPC.NONE && stage1 == true && XQData.getInstance().PRules.get(i).a == XQData.XPAC.AT)
				{
					String val = new String();
					
					double var1 = 0;
					double var2 = 0;
					
					String Cnst = XQData.getInstance().PRules.get(i).cnst;
								
					val = attributes.getValue((XQData.getInstance().PRules.get(i).atname.split("@"))[1]);
					System.out.println("AT value: "+val+":"+Cnst+":"+XQData.getInstance().PRules.get(i).c);
								
					if(val != null)
					{
						
						switch(XQData.getInstance().PRules.get(i).c)
						{
							case EQ:
							if(val.equals(Cnst))
								stage2 = true;
							else
							{
								try
								{
									var1 = Double.parseDouble(val);
									var2 = Double.parseDouble(Cnst);
								}
								catch(Exception e)
								{
									System.out.println("Error in parsing xpath @ condition :"+var1+":"+var2);
									break;
								}
								
								if(var1 == var2)
									stage2 = true;
							}
							break;
							case NEQ:
							if(!val.equals(Cnst))
								stage2 = true;
							else
							{
								try
								{
									var1 = Double.parseDouble(val);
									var2 = Double.parseDouble(Cnst);
								}
								catch(Exception e)
								{
									System.out.println("Error in parsing xpath @ condition");
									break;
								}
								
								if(var1 != var2)
									stage2 = true;
							}
							break;
							case LT:
							try
							{
								var1 = Double.parseDouble(val);
								var2 = Double.parseDouble(Cnst);
							}
							catch(Exception e)
							{
								System.out.println("Error in parsing xpath @ condition");
								break;
							}
								
							if(var1 < var2)
								stage2 = true;
							break;
							case GT:
							try
							{
								var1 = Double.parseDouble(val);
								var2 = Double.parseDouble(Cnst);
							}
							catch(Exception e)
							{
								System.out.println("Error in parsing xpath @ condition");
								break;
							}
								
							if(var1 > var2)
								stage2 = true;
							break;
							case GTE:
							try
							{
								var1 = Double.parseDouble(val);
								var2 = Double.parseDouble(Cnst);
							}
							catch(Exception e)
							{
								System.out.println("Error in parsing xpath @ condition");
								break;
							}
								
							if(var1 >= var2)
								stage2 = true;
							break;
							case LTE:
							try
							{
								var1 = Double.parseDouble(val);
								var2 = Double.parseDouble(Cnst);
							}
							catch(Exception e)
							{
								System.out.println("Error in parsing xpath @ condition");
								break;
							}
								
							if(var1 <= var2)
								stage2 = true;
							break;									
						}
					}
				}
							
				if(XQData.getInstance().PRules.get(i).c == XQData.XPC.NONE && stage1 == true)
				{
					if(XQData.getInstance().PRules.get(i).v == XQData.XPVC.AT)
					{
						String val = attributes.getValue(XQData.getInstance().PRules.get(i).vcname);
									
						if(val != null)
							XQData.getInstance().addtoparseXMLret(val);
						
						dontmatch = true;
					}
					else
					{
						stage2 = true;				
					}
					
				}
				
				if(stage1 == true && XQData.getInstance().PRules.get(i).a == XQData.XPAC.VAL) //XQData.getInstance().PRules.get(i).c == XQData.XPC.NONE && 
				{
					stage2 = true;
				}
							
				if(stage1 == true && stage2 == true)
				{
					i++;
					stage1 = false;
					stage2 = false;
								
					if(i == len && dontmatch == false)
					{
						matched = true;
						matchedStr = qName;
						i--;
					}
				}
				else
				{
					stage1 = false;
				}
			}
		}
		else
		{
			int n;
			int j = attributes.getLength();
			
			MatchedString += "<"+qName;
			
			for(n=0;n<j;n++)
			{
				MatchedString += " "+attributes.getQName(n) +"=\""+ attributes.getValue(n) + "\"";
			}
			
			MatchedString += ">";
		}
		Matchbuff = qName;
	}
				
	public void endElement(String uri, String localName,
		String qName) throws SAXException 
	{
		if(cont == true)
		{
			if(matched == true)
			{	
				if(matchedStr.equals(qName))
				{
					if(!((XQData.getInstance().PRules.get(i).c != XQData.XPC.NONE && XQData.getInstance().PRules.get(i).a == XQData.XPAC.VAL) && condeval != MCOND.TRUE))					
					{
						XQData.getInstance().addtoparseXMLret(MatchedString);
					}
					MatchedString = "";
					matched = false;
				}
				else
				{
					MatchedString += "</"+qName+">";
				}
			}
		}
		if((i+1)<len)
		{
			if(XQData.getInstance().PRules.get(i).QName.equals(qName))
			{
				i--;
			}
		}
	}
				
	public void characters(char ch[], int start, int length) throws SAXException 
	{
		Buffer = new String(ch,start,length);
		//boolean dontmatch = false;
		
		double var1 =0;
		double var2 =0;
		
		String Cnst = XQData.getInstance().PRules.get(i).cnst;
		
		if(cont == true)
		{
			if(matched == true)			
			{
				MatchedString +=Buffer;
				
				System.out.println("In characters:"+XQData.getInstance().PRules.get(i).c+":" + XQData.getInstance().PRules.get(i).a +":"+ Matchbuff.equals(XQData.getInstance().PRules.get(i).atname));				
				if(XQData.getInstance().PRules.get(i).c != XQData.XPC.NONE && XQData.getInstance().PRules.get(i).a == XQData.XPAC.VAL && Matchbuff.equals(XQData.getInstance().PRules.get(i).atname))
				{
					condeval = MCOND.FALSE;
					
					switch(XQData.getInstance().PRules.get(i).c)
					{
						case EQ:
						if(Buffer.equals(Cnst))
							condeval = MCOND.TRUE;
						else
						{
							try
							{
								var1 = Double.parseDouble(Buffer);
								var2 = Double.parseDouble(Cnst);
							}
							catch(Exception e)
							{
								System.out.println("Error in parsing xpath condition");
								break;
							}
							
							if(var1 == var2)
								condeval = MCOND.TRUE;
						}
						break;
						case NEQ:
						if(!Buffer.equals(Cnst))
							condeval = MCOND.TRUE;
						else
						{
							try
							{
								var1 = Double.parseDouble(Buffer);
								var2 = Double.parseDouble(Cnst);
							}
							catch(Exception e)
							{
								System.out.println("Error in parsing xpath condition");
								break;
							}
							
							if(var1 != var2)
								condeval = MCOND.TRUE;
						}
						break;
						case LT:						
						try
						{
							var1 = Double.parseDouble(Buffer);
							var2 = Double.parseDouble(Cnst);
						}
						catch(Exception e)
						{
							System.out.println("Error in parsing xpath condition");
							break;
						}
							
						if(var1 < var2)
							condeval = MCOND.TRUE;
						break;
						case GT:
						try
						{
							var1 = Double.parseDouble(Buffer);
							var2 = Double.parseDouble(Cnst);
						}
						catch(Exception e)
						{
							System.out.println("Error in parsing xpath condition");
							break;
						}
							
						if(var1 > var2)
							condeval = MCOND.TRUE;
						break;
						case GTE:
						try
						{
							var1 = Double.parseDouble(Buffer);
							var2 = Double.parseDouble(Cnst);
						}
						catch(Exception e)
						{
							System.out.println("Error in parsing xpath condition");
							break;
						}
							
						if(var1 >= var2)
							condeval = MCOND.TRUE;
						break;
						case LTE:
						try
						{
							var1 = Double.parseDouble(Buffer);
							var2 = Double.parseDouble(Cnst);
						}
						catch(Exception e)
						{
							System.out.println("Error in parsing xpath condition");
							break;
						}
							
						if(var1 <= var2)
							condeval = MCOND.TRUE;
						break;									
					}
				}
				
				if(condeval == MCOND.FALSE)				
				{					
					stage2 = false;
					MatchedString = "";
					matchedStr = "";
					matched =false;
					condeval = MCOND.CONT;
				}
			}
		}
	}
};