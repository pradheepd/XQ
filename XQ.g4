
grammar XQ;

options { tokenVocab=XQL; }

@header {
  import java.util.*;
  import java.text.*;
  import org.antlr.v4.runtime.TokenStream;
  import org.antlr.v4.runtime.misc.Interval;
}

@members {  
  boolean isForCtx = false;
  Map<String,List<String>> forvars = new HashMap<String,List<String>>();
  boolean isVCtx = false;
  List<String> retVal = new ArrayList<String>();
}

prog
	: htmt*;

htmt 
	: HOFL stmt CFL
	| HTMS SLH HID HTME
	| HTMS htmid HTME INHTM?
	| HTMS htmid SLH HTME 
	;

stmt
	: (expr|func)+;//*? expr+;
	
	
func : DCL FN {isForCtx = true; XQData.getInstance().isFnCtx = true;} fname OB ((b=arith (AS dtype)?) (CMA c+=arith (AS dtype)?)*)? CB (AS dtype)? OFL (d+=expr)+ CFL
	{
		List<String> pms = new ArrayList<String>();
		
		pms.add(new String($b.text));
		System.out.println("Fn Param:"+$b.text);
		
		for(ArithContext e: $c)
		{
			pms.add(new String(e.getText()));
			System.out.println("Fn Param:"+e.getText());
		}	
		String op = new String();
		
		for(ExprContext e: $d)
		{
			int x;
			
			for(x = e.start.getTokenIndex();x <= e.stop.getTokenIndex(); x++)
				op += " "+_input.get(x).getText();
		}
		
		XQFns fnctn = new XQFns();
		
		fnctn.params.addAll(pms);
		fnctn.Opcode = op;
		
		System.out.println("Fn Op:"+op);
		
		XQData.getInstance().ftns.put($fname.text,fnctn);
		//this should be the last statement
		isForCtx = false;
		XQData.getInstance().isFnCtx = false;
	}
	;
	
ifexpr returns [boolean retVal] : (i9=var | i1=docp | i2=varp | i3=LIT | i4=INT) i0=(GT | GE | LT | LE | EQ | NE ) (i10=var | i5=docp | i6=varp | i7=LIT | i8=INT)
	{
		String vara = new String();
		String varb = new String();
		double var1 = 0;
		double var2 = 0;
		boolean err = false;
		boolean retval = false;
		boolean nummode = true;
		
		if($i1.ctx != null)
		{
			if($i1.retVal.size() != 1)
			{
				System.out.println("Error in the expression "+$i1.text);
				err = true;
			}
			
			vara = $i1.retVal.get(0);
		}
		else if($i2.ctx != null)
		{
			if($i2.retVal.size() != 1)
			{
				System.out.println("Error in the expression "+$i2.text);
				err = true;
			}
			
			vara = $i2.retVal.get(0);
		}
		else if($i9.ctx != null)
		{
			if($i9.retVal.size() != 1)
			{
				System.out.println("Error in the expression "+$i9.retVal);
				err = true;
			}
			
			vara = $i9.retVal.get(0);
		}
		else if($i3 != null)
		{
			String[] str = $i3.text.split("\"");
			varb = str[1];
		}
		else
		{
			vara = $i4.text;
		}
		
		try
		{
			var1 = Double.parseDouble(vara);
		}
		catch(Exception e)
		{
			nummode = false;
		}
		
		if($i5.ctx != null)
		{
			if($i5.retVal.size() != 1)
			{
				System.out.println("Error in the expression "+$i5.text);
				err = true;
			}
			
			varb = $i5.retVal.get(0);
		}
		else if($i6.ctx != null)
		{
			if($i6.retVal.size() != 1)
			{
				System.out.println("Error in the expression "+$i6.text);
				err = true;
			}
			
			varb = $i6.retVal.get(0);
		}
		else if($i10.ctx != null)
		{
			if($i10.retVal.size() != 1)
			{
				System.out.println("Error in the expression "+$i10.text);
				err = true;
			}
			
			varb = $i10.retVal.get(0);
		}
		else if($i7 != null)
		{
			String[] str = $i7.text.split("\"");
			varb = str[1];
		}
		else
		{
			varb = $i8.text;
		}
		
		if(nummode == true)
		{
			try{
				var2 = Double.parseDouble(varb);
			}
			catch(Exception e)
			{
				System.out.println("Error in Expression "+$i0.text);
			}
		}
		
		if(err == false)
		{
			if(nummode == true)
			{
				switch($i0.type)
				{		
					case EQ:
					retval = (var1 == var2)?true:false;
					break;
					case NE:
					retval = (var1 != var2)?true:false;
					break;
					case LT:
					retval = (var1 < var2)?true:false;
					break;
					case LE:			
					retval = (var1 <= var2)?true:false;
					break;
					case GT:
					retval = (var1 > var2)?true:false;
					break;
					case GE:
					retval = (var1 >= var2)?true:false;
					break;
				}
			}
			else
			{
				System.out.println("comparing strings "+vara+" "+varb);
				
				if($i0.type == EQ)
					retval = (vara.equals(varb))?true:false;
				else if($i0.type == NE)
					retval = (vara.equals(varb))?false:true;
				else
					System.out.println("Error in expr"+$i0.text);
			}
		}
		
		$retVal = retval;
	}
	;
	
rtnstmt: (WHERE (var | docp | varp ) (GT | GE | LT | LE | EQ | NE) (var | docp | varp | LIT | INT ) (AND (var | docp | varp) (GT | GE | LT | LE | EQ | NE) (var | docp | varp | LIT | INT))*)? (ord (docp | varp) (CMA (docp | varp))* )? RETURN z=arith
	{
		if($z.ctx != null )
		{
			if( XQData.getInstance().isRetFn == false)
			{
				XQData.getInstance().Markup = "";
				
				for(String s: $z.retVal)
					XQData.getInstance().Markup += s +"\n" ;
				
				System.out.println("return statement:"+XQData.getInstance().Markup);
			}
			else
			{
				retVal.addAll($z.retVal);
				System.out.println("return statement function:"+retVal);
			}
		}
	}
	;
	
exprp: HOFL expr+ CFL;
	
expr: forstmt
	| (LET? var LEQ)? OB? la=arith (CMA lb+=arith)*? CB?
	{
	if(isForCtx == true){}
	else if($la.ctx != null)
	{
		String tvar = $var.text;
		
		if($LET != null)
		{
			List<String> tVvar = forvars.get(tvar);
			List<String> tVar = XQData.getInstance().vars.get(tvar);
			
			if(isVCtx == true && tVvar == null && tVar == null)
			{
				List<String> args = new ArrayList<String>();
				args.addAll($la.retVal);
				if($OB != null && $CB != null && $lb != null)
				{
					for(ArithContext c : $lb)
						args.addAll(c.retVal);
				}
				forvars.put(tvar, args);
				System.out.println("Added a local variable"+forvars.get(tvar));
			}
			else if(isVCtx == false && tVar == null)
			{				
				List<String> args = new ArrayList<String>();
				args.addAll($la.retVal);
				if($OB != null && $CB != null && $lb != null)
				{
					for(ArithContext c : $lb)
						args.addAll(c.retVal);
				}
				XQData.getInstance().vars.put(tvar, args);
				System.out.println("Added a global variable"+XQData.getInstance().vars.get(tvar));
			}
			else
			{
				System.out.println("Error: re-declaration of variable "+tvar);
			}
		}
		else if(tvar != null)
		{
			if(XQData.getInstance().vars.get(tvar) != null)
			{
				List<String> args = new ArrayList<String>();
				args.addAll($la.retVal);
				if($OB != null && $CB != null && $lb != null)
				{
					for(ArithContext c : $lb)
						args.addAll(c.retVal);
				}
				XQData.getInstance().vars.put(tvar, args);
			}
			else if(forvars.get(tvar) != null)
			{
				List<String> args = new ArrayList<String>();
				args.addAll($la.retVal);
				if($OB != null && $CB != null && $lb != null)
				{
					for(ArithContext c : $lb)
						args.addAll(c.retVal);
				}
				forvars.put(tvar, args);
			}
			else
			{
				System.out.println("Error: Undefined identifier "+tvar);
			}
		}
	}
	else
	{
		System.out.println("Error in the expression "+$la.text);
	}
		
	}
	| IF{isForCtx = true;} OB ifexpr CB THEN (a=expr | (l1=OFL (c+=expr)+ CFL)) (ELSE (b=expr | (l2=OFL (d+=expr)+ CFL)))?
	{
	if(XQData.getInstance().isFnCtx == false)
	{
		boolean ifcond = $ifexpr.retVal;
		int i;
		int j = 1;
		
		System.out.println("if else statement "+ifcond);
		
		if(ifcond == true && $l1 != null)
			j = $c.size();
		
		if(ifcond == false && $l2 != null)
			j = $d.size();
			
		String in = new String();
			
		for(i=0;i<j;i++)
		{
			int x;
		
			if(ifcond == true)
			{
				if($l1 != null)
				{
					for(x = $c.get(i).start.getTokenIndex();x <= $c.get(i).stop.getTokenIndex(); x++)
						in += " "+_input.get(x).getText();
				}
				else
				{
					for(x = $a.ctx.start.getTokenIndex();x <= $a.ctx.stop.getTokenIndex(); x++)
						in += " "+_input.get(x).getText();
				}
			}
			else if($ELSE != null)
			{
				if($l2 != null)
				{
					for(x = $d.get(i).start.getTokenIndex();x <= $d.get(i).stop.getTokenIndex(); x++)
						in += " "+_input.get(x).getText();
				}
				else
				{
					for(x = $b.ctx.start.getTokenIndex();x <= $b.ctx.stop.getTokenIndex(); x++)
						in += " "+_input.get(x).getText();
				}
			}
		}
			
		ANTLRInputStream input = new ANTLRInputStream("{"+in+"}");
					
		XQL lexer = new XQL(input);
					
		System.out.println("The text input:"+in);
					
		CommonTokenStream tokens = new CommonTokenStream(lexer);
					
		XQParser parser = new XQParser(tokens);
					
		for(Map.Entry<String, List<String>> s : forvars.entrySet())
			parser.forvars.put(s.getKey(),s.getValue());
				
		parser.isVCtx = true;
				
		ParseTree tree;
			
		tree = parser.exprp();		
	}
	}
	| rtnstmt
	;
	
forstmt
	: (FOR{isForCtx = true;} a=var (AT b=var)? IN (docp | varp))(c=expr | (OFL (d+=expr)+ CFL))
	{
	if(XQData.getInstance().isFnCtx == false)
	{
		List<String> vara = new ArrayList<String>();		
		
		if( ($docp.ctx != null) || ($varp.ctx != null))
		{
			int i;
					
			List<String> params = new ArrayList<String>();
			
			boolean isMultiStmt = false;
			
			if($OFL != null)
			{
				isMultiStmt = true;
			}
			
			if($docp.ctx != null)
			{
				params.addAll($docp.retVal);
			}
			else
			{
				params.addAll($varp.retVal);
			}
			
			for(i=0;i<params.size();i++)
			{
				String in = new String();
				int j;
				int m = 1;
				
				for(j=0;j<m;j++)
				{
								
					if(isMultiStmt == false)
					{
						int x;
						
						for(x = $c.ctx.start.getTokenIndex();x <= $c.ctx.stop.getTokenIndex(); x++)
							in += " "+_input.get(x).getText();
						
						/*_input.seek($c.ctx.stop.getTokenIndex());
						mark = _input.mark();
						_input.seek($c.ctx.start.getTokenIndex());*/
					}
					else
					{
						m = $d.size();
						int x;
						
						for(x = $d.get(j).start.getTokenIndex();x <= $d.get(j).stop.getTokenIndex(); x++)
							in += " "+_input.get(x).getText();
							
						/*_input.seek($d.get($d.size()-1).stop.getTokenIndex());
						mark = _input.mark();
						_input.seek($d.get(0).start.getTokenIndex());*/
					}
				}
					
				ANTLRInputStream input = new ANTLRInputStream("{"+in+"}");
					
				XQL lexer = new XQL(input);
					
				System.out.println("The text input:"+in);
					
				CommonTokenStream tokens = new CommonTokenStream(lexer);
					
				XQParser parser = new XQParser(tokens);
					
				for(Map.Entry<String, List<String>> s : forvars.entrySet())
					parser.forvars.put(s.getKey(),s.getValue());
					
				parser.forvars.put($a.text,vara);
					
				boolean isAt = false;
					
				if($AT != null)
				{
					isAt = true;
						
					List<String> varb = new ArrayList<String>();
						
					varb.add(Integer.toString(i));
						
					parser.forvars.put($b.text,varb);
				}
					
				parser.forvars.get($a.text).clear();
				parser.forvars.get($a.text).add(params.get(i));
						
				if(isAt == true)
				{
					parser.forvars.get($b.text).clear();
					parser.forvars.get($b.text).add(Integer.toString(i));
				}
				System.out.println("starting expr:"+_input.index());
						
				ParseTree tree;
					
				parser.isVCtx = true;
										
				tree = parser.exprp();
			}
		}
		isForCtx = false;
	}
	}
	;
	
arith returns [ List<String> retVal ]
	@init {
    $retVal = new ArrayList<String>();
	}
	: a=arith  b=(PL | MN | ML | DIV | MOD | EQ | NE | LT | LE | GT | GE) c=arith
	{
		if(isForCtx == false)
		{
		System.out.println("calling arith operation "+$b.text+" on "+$a.retVal+" and "+$c.retVal);
		
		if(($a.retVal.size() != 1) && ($c.retVal.size() != 1))
		{
			System.out.println("the "+$b.text+" operator cannot be used for this variable "+$a.text);
		}
		
		double var1 = 0;
		double var2 = 0;
		double retval = 0;
		
		try
		{
			var1 = Double.parseDouble($a.retVal.get(0));
			var2 = Double.parseDouble($c.retVal.get(0));
		}
		catch(Exception e)
		{
			System.out.println("Error occurred performing a arithmatic operation at"+$a.text+" with retval"+$a.retVal );
		}
		
		switch($b.type)
		{
			case PL:
			retval = var1 + var2;
			break;
			case MN:
			retval = var1 - var2;
			break;
			case ML:
			retval = var1 * var2;
			break;
			case DIV:
			retval = var1 / var2;
			break;
			case MOD:
			retval = var1 % var2;
			break;
			case EQ:
			retval = (var1 == var2)?1:0;
			break;
			case NE:
			retval = (var1 != var2)?1:0;
			break;
			case LT:
			retval = (var1 < var2)?1:0;
			break;
			case LE:			
			retval = (var1 <= var2)?1:0;
			break;
			case GT:
			retval = (var1 > var2)?1:0;
			break;
			case GE:
			retval = (var1 >= var2)?1:0;
			break;
		}
		String str =  new DecimalFormat("#.######").format(retval);
		
		System.out.println("Return value "+str);
		
		if($retVal == null)
		{
			$retVal = new ArrayList<String>();			
		}
		$retVal.add(str);
		}
	}
	| a=arith b=( AND | OR ) c=arith
	{
		if(isForCtx == false)
		{
		if($retVal == null)
				$retVal = new ArrayList<String>();
				
		if(($a.retVal.size() == 1) && ($c.retVal.size() == 1))
		{
			boolean var1 = Integer.parseInt($a.retVal.get(0))>0?true:false;
			boolean var2 = Integer.parseInt($c.retVal.get(0))>0?true:false;
			int rtn = 0;
			
			switch($b.type)
			{
				case AND:
					rtn = (var1 && var2)==true?1:0;
				break;
				case OR:
					rtn = (var1 || var2)==true?1:0;
				break;
			}
			$retVal.add(new String(Integer.toString(rtn)));
		}
		else if($a.retVal.size() != 1)
		{
			System.out.println($a.text+" has zero or more than one value");
		}
		else
		{
			System.out.println($c.text+" has zero or more than one value");
		}
		System.out.println("performing "+$c.text+" on "+$a.text+" and "+$c.text+" returns "+$retVal.get(0));
		}
	}
	| OB a=arith CB
	{
		if(isForCtx == false)
		{
		if($retVal == null)
				$retVal = new ArrayList<String>();
		$retVal.addAll($a.retVal);
		}
	}
	| (
		var
		{
			if(isForCtx == false)
			{
			if($retVal == null)
				$retVal = new ArrayList<String>();
			$retVal.addAll($var.retVal);
			}
		} 
		| docp
		{
			if(isForCtx == false)
			{
			if($retVal == null)
				$retVal = new ArrayList<String>();
			$retVal.addAll($docp.retVal);
			}
		} 
		| varp
		{
			if(isForCtx == false)
			{
			if($retVal == null)
				$retVal = new ArrayList<String>();
			$retVal.addAll($varp.retVal);
			}
		} 
		| LIT
		{
			if(isForCtx == false)
			{
			if($retVal == null)
				$retVal = new ArrayList<String>();
			
			String[] str = $LIT.text.split("\"");
			$retVal.add(str[1]);
			}
		} 
		| INT
		{
			if(isForCtx == false)
			{
			if($retVal == null)
				$retVal = new ArrayList<String>();
			$retVal.add($INT.text);
			}
		}
	  ) 
	| (sa=varp | sb=docp) DSH (sc=varp | sd=docp)
	{
		if(isForCtx == false)
		{
		if($retVal == null)
				$retVal = new ArrayList<String>();
				
		if($sa.ctx == null && $sb.ctx != null)
			$retVal.addAll($sb.retVal);
		else if($sb.ctx == null && $sa.ctx != null)
			$retVal.addAll($sa.retVal);
		
		if($sc.ctx == null && $sd.ctx != null)
			$retVal.addAll($sd.retVal);
		else if($sd.ctx == null && $sc.ctx != null)
			$retVal.addAll($sc.retVal);
				
		System.out.println("dash operator called!!! "+$retVal);
		}
	}
	| fname OB ( fa=arith (CMA fb+=arith)*)? CB
	{
		if(XQData.getInstance().isFnCtx == false && isForCtx == false)
		{
		XQFns fn = XQData.getInstance().ftns.get($fname.text);
		if(fn != null)
		{
			List<ArithContext> pms = new ArrayList<ArithContext>();
			
			if($fa.ctx != null)
			{
				pms.add($fa.ctx);
			}
			
			if($fb != null)
			{
				for(ArithContext c : $fb)
					pms.add(c);
			}
			
			if(pms.size() == fn.params.size())
			{
				ANTLRInputStream input = new ANTLRInputStream("{"+fn.Opcode+"}");
					
				XQL lexer = new XQL(input);
				
				CommonTokenStream tokens = new CommonTokenStream(lexer);
					
				XQParser parser = new XQParser(tokens);
					
				for(Map.Entry<String, List<String>> s : forvars.entrySet())
					parser.forvars.put(s.getKey(),s.getValue());
				
				int i = 0;
				
				for(ArithContext s : pms)
				{
					List<String> p = new ArrayList<String>();
					p.addAll(s.retVal);
					parser.forvars.put(fn.params.get(i), p);
					i++;
				}
				
				for(Map.Entry<String, List<String>> s : parser.forvars.entrySet())
					System.out.println("parser temp var:"+s.getKey()+":"+s.getValue());
					
				parser.isVCtx = true;
				
				XQData.getInstance().isRetFn = true;
				
				parser.exprp();
				
				XQData.getInstance().isRetFn = false;
				
				if($retVal == null)
				{
					$retVal = new ArrayList<String>();
				}
				$retVal.addAll(parser.retVal);
			}
		}
		}
	}
	;
	
varpcond returns [String retVal]
	: SBO (ID | (ATT ID)) (GT | GE | LT | LE | EQ | NE) (INT | LIT) SBC
	{
		if($retVal == null)
			$retVal = new String();
			
		$retVal = $varpcond.text;
	}
	;
	
varpexpr returns [String retVal]
	: (PATH | DPATH) (ID (ATT ID)? varpcond?)
	{
		if($retVal == null)
			$retVal = new String();
			
		if($varpcond.ctx != null)
			$retVal = $varpcond.retVal;
	}
	;
	
varp returns [ List<String> retVal ]
	:	var (a+=varpexpr)*?
	{		
		/*connect to database
		List<String> results = new ArrayList<String>();
		results.add("hello");
		Add the results here*/
		
		List<XQVarDesc> ListIn = new ArrayList<XQVarDesc>();
		
		ListIn.add(new XQVarDesc("/root",""));
		
		for(VarpexprContext e: $a)
		{
			String x = e.getText();
			
			String[] s = x.split("\\[");
			
			XQVarDesc in = new XQVarDesc(s[0],e.retVal);
			
			System.out.println("Added path item: "+in.Path+","+in.Cond);
			
			ListIn.add(in);
		}
		
		if($retVal == null)
			$retVal = new ArrayList<String>();
		$retVal.addAll(XQData.getInstance().GetVarPath($var.retVal,ListIn));
	}
	;

var returns [ List<String> retVal ]
	:	VR ID
	{
		if($retVal == null)
			$retVal = new ArrayList<String>();
	
		if(XQData.getInstance().vars.get($var.text) != null)
			$retVal.addAll(XQData.getInstance().vars.get($var.text));
				
		if(forvars.get($var.text) != null)
			$retVal.addAll(forvars.get($var.text));
	}
	;

docp returns [ List<String> retVal ]
	:	DOC ((PATH | DPATH) (ID | (ATT ID)))*?
	{	
		if($retVal == null)
			$retVal = new ArrayList<String>();
			
		$retVal.addAll(XQData.getInstance().GetXPath($docp.text));
	}
	;

htmid returns [String retVal]: a=HID (b+=HID HEQ c+=HLIT)*?
	{
		$retVal += $a.text;
		int i;
		
		for(i=0;i<$b.size();i++)
		{
			$retVal += " "+$b.get(i).getText()+"="+$c.get(i).getText(); 
		}
	};

ord	:	ORDER BY;

//inhtm:	(ID | EQ | NE | LEQ | OB |CB | ATT | CMA | WS | INT | VR | CL | PL | MN | ML | IF | ELSE | THEN | FOR | IN | DCL | FN | AS | PATH | DPATH | ORDER | BY | AT | WHERE | RETURN | LET | AND | CT | DC)*;

fname:	(ID CL)? ID;

dtype:	ID CL ID QM;
