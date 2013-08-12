package com.webb;

public class XQwhrcdtn {
	public enum whrenum{EQ, NEQ, LT, GT, GTE, LTE};
	
	public String id;
  	public whrenum enm;
  	public String val;

  	XQwhrcdtn(String a, whrenum b,String c)
  	{
  		id = a;
  		enm = b;
  		val = c;
  	}
  	
  	XQwhrcdtn()
  	{
  		id = "";
  		enm = whrenum.EQ;
  		val = "";
  	}
}
