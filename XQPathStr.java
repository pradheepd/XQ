import java.util.*;

public class XQPathStr {
	public List<XQVarDesc>path;
	public List<XQVarDesc>andpath;
	public List<XQVarDesc>orpath;
	
	XQPathStr()
	{
		path = new ArrayList<XQVarDesc>();
		andpath = new ArrayList<XQVarDesc>();
		orpath = new ArrayList<XQVarDesc>();
	}
}
