// Generated from XQ.g4 by ANTLR 4.0

  import java.util.*;
  import java.text.*;
  import org.antlr.v4.runtime.TokenStream;
  import org.antlr.v4.runtime.misc.Interval;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class XQParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VR=56, DSH=51, WHERE=24, LT=30, SLH=3, ORDER=21, DOC=54, MOD=50, HTMS=1, 
		FOR=14, HWS=6, CFL=40, ML=45, INHTM=8, ID=57, AND=27, HTME=2, ATT=38, 
		IF=11, AT=23, AS=18, IN=15, THEN=13, HEQ=9, MN=44, PATH=19, QM=42, HID=7, 
		HOFL=4, RETURN=25, OFL=39, HCFL=5, EQ=32, COMMENT=60, NE=33, BY=22, GE=29, 
		SBC=47, HLIT=10, DCL=16, CB=37, ELSE=12, LIT=52, INT=58, FN=17, OB=36, 
		CMA=41, DPATH=20, WS=59, CT=53, DC=55, OR=49, PL=43, GT=28, SBO=46, DIV=48, 
		LET=26, LE=31, LEQ=34, CL=35;
	public static final String[] tokenNames = {
		"<INVALID>", "HTMS", "HTME", "SLH", "HOFL", "HCFL", "HWS", "HID", "INHTM", 
		"'='", "HLIT", "'if'", "'else'", "'then'", "'for'", "'in'", "'declare'", 
		"'function'", "AS", "'/'", "'//'", "'order'", "'by'", "'at'", "'where'", 
		"'return'", "'let'", "'and'", "GT", "GE", "LT", "LE", "EQ", "NE", "':='", 
		"':'", "'('", "')'", "'@'", "OFL", "CFL", "','", "'?'", "'+'", "'-'", 
		"'*'", "'['", "']'", "'div'", "'or'", "'mod'", "'|'", "LIT", "'\"'", "DOC", 
		"'doc'", "'$'", "ID", "INT", "WS", "COMMENT"
	};
	public static final int
		RULE_prog = 0, RULE_htmt = 1, RULE_stmt = 2, RULE_func = 3, RULE_ifexpr = 4, 
		RULE_rtnstmt = 5, RULE_exprp = 6, RULE_expr = 7, RULE_forstmt = 8, RULE_arith = 9, 
		RULE_varpcond = 10, RULE_varpexpr = 11, RULE_varp = 12, RULE_var = 13, 
		RULE_docp = 14, RULE_htmid = 15, RULE_ord = 16, RULE_fname = 17, RULE_dtype = 18;
	public static final String[] ruleNames = {
		"prog", "htmt", "stmt", "func", "ifexpr", "rtnstmt", "exprp", "expr", 
		"forstmt", "arith", "varpcond", "varpexpr", "varp", "var", "docp", "htmid", 
		"ord", "fname", "dtype"
	};

	@Override
	public String getGrammarFileName() { return "XQ.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	  
	  boolean isForCtx = false;
	  Map<String,List<String>> forvars = new HashMap<String,List<String>>();
	  boolean isVCtx = false;
	  List<String> retVal = new ArrayList<String>();

	public XQParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<HtmtContext> htmt() {
			return getRuleContexts(HtmtContext.class);
		}
		public HtmtContext htmt(int i) {
			return getRuleContext(HtmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTMS || _la==HOFL) {
				{
				{
				setState(38); htmt();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmtContext extends ParserRuleContext {
		public TerminalNode CFL() { return getToken(XQParser.CFL, 0); }
		public TerminalNode INHTM() { return getToken(XQParser.INHTM, 0); }
		public TerminalNode SLH() { return getToken(XQParser.SLH, 0); }
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public TerminalNode HTME() { return getToken(XQParser.HTME, 0); }
		public HtmidContext htmid() {
			return getRuleContext(HtmidContext.class,0);
		}
		public TerminalNode HID() { return getToken(XQParser.HID, 0); }
		public TerminalNode HOFL() { return getToken(XQParser.HOFL, 0); }
		public TerminalNode HTMS() { return getToken(XQParser.HTMS, 0); }
		public HtmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterHtmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitHtmt(this);
		}
	}

	public final HtmtContext htmt() throws RecognitionException {
		HtmtContext _localctx = new HtmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_htmt);
		int _la;
		try {
			setState(63);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44); match(HOFL);
				setState(45); stmt();
				setState(46); match(CFL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48); match(HTMS);
				setState(49); match(SLH);
				setState(50); match(HID);
				setState(51); match(HTME);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52); match(HTMS);
				setState(53); htmid();
				setState(54); match(HTME);
				setState(56);
				_la = _input.LA(1);
				if (_la==INHTM) {
					{
					setState(55); match(INHTM);
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58); match(HTMS);
				setState(59); htmid();
				setState(60); match(SLH);
				setState(61); match(HTME);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public FuncContext func(int i) {
			return getRuleContext(FuncContext.class,i);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<FuncContext> func() {
			return getRuleContexts(FuncContext.class);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(67);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case ORDER:
				case WHERE:
				case RETURN:
				case LET:
				case OB:
				case LIT:
				case DOC:
				case VR:
				case ID:
				case INT:
					{
					setState(65); expr();
					}
					break;
				case DCL:
					{
					setState(66); func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DCL) | (1L << ORDER) | (1L << WHERE) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncContext extends ParserRuleContext {
		public FnameContext fname;
		public ArithContext b;
		public ArithContext arith;
		public List<ArithContext> c = new ArrayList<ArithContext>();
		public ExprContext expr;
		public List<ExprContext> d = new ArrayList<ExprContext>();
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public List<TerminalNode> AS() { return getTokens(XQParser.AS); }
		public TerminalNode CMA(int i) {
			return getToken(XQParser.CMA, i);
		}
		public TerminalNode DCL() { return getToken(XQParser.DCL, 0); }
		public TerminalNode CB() { return getToken(XQParser.CB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode OFL() { return getToken(XQParser.OFL, 0); }
		public TerminalNode CFL() { return getToken(XQParser.CFL, 0); }
		public TerminalNode FN() { return getToken(XQParser.FN, 0); }
		public TerminalNode AS(int i) {
			return getToken(XQParser.AS, i);
		}
		public List<DtypeContext> dtype() {
			return getRuleContexts(DtypeContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public DtypeContext dtype(int i) {
			return getRuleContext(DtypeContext.class,i);
		}
		public List<TerminalNode> CMA() { return getTokens(XQParser.CMA); }
		public TerminalNode OB() { return getToken(XQParser.OB, 0); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public FuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitFunc(this);
		}
	}

	public final FuncContext func() throws RecognitionException {
		FuncContext _localctx = new FuncContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_func);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); match(DCL);
			setState(72); match(FN);
			isForCtx = true; XQData.getInstance().isFnCtx = true;
			setState(74); ((FuncContext)_localctx).fname = fname();
			setState(75); match(OB);
			setState(92);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(76); ((FuncContext)_localctx).b = arith(0);
				setState(79);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(77); match(AS);
					setState(78); dtype();
					}
				}

				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMA) {
					{
					{
					setState(81); match(CMA);
					setState(82); ((FuncContext)_localctx).arith = arith(0);
					((FuncContext)_localctx).c.add(((FuncContext)_localctx).arith);
					setState(85);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(83); match(AS);
						setState(84); dtype();
						}
					}

					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(94); match(CB);
			setState(97);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(95); match(AS);
				setState(96); dtype();
				}
			}

			setState(99); match(OFL);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100); ((FuncContext)_localctx).expr = expr();
				((FuncContext)_localctx).d.add(((FuncContext)_localctx).expr);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ORDER) | (1L << WHERE) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
			setState(105); match(CFL);

					List<String> pms = new ArrayList<String>();
					
					pms.add(new String((((FuncContext)_localctx).b!=null?_input.getText(((FuncContext)_localctx).b.start,((FuncContext)_localctx).b.stop):null)));
					System.out.println("Fn Param:"+(((FuncContext)_localctx).b!=null?_input.getText(((FuncContext)_localctx).b.start,((FuncContext)_localctx).b.stop):null));
					
					for(ArithContext e: ((FuncContext)_localctx).c)
					{
						pms.add(new String(e.getText()));
						System.out.println("Fn Param:"+e.getText());
					}	
					String op = new String();
					
					for(ExprContext e: ((FuncContext)_localctx).d)
					{
						int x;
						
						for(x = e.start.getTokenIndex();x <= e.stop.getTokenIndex(); x++)
							op += " "+_input.get(x).getText();
					}
					
					XQFns fnctn = new XQFns();
					
					fnctn.params.addAll(pms);
					fnctn.Opcode = op;
					
					System.out.println("Fn Op:"+op);
					
					XQData.getInstance().ftns.put((((FuncContext)_localctx).fname!=null?_input.getText(((FuncContext)_localctx).fname.start,((FuncContext)_localctx).fname.stop):null),fnctn);
					//this should be the last statement
					isForCtx = false;
					XQData.getInstance().isFnCtx = false;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfexprContext extends ParserRuleContext {
		public boolean retVal;
		public VarContext i9;
		public DocpContext i1;
		public VarpContext i2;
		public Token i3;
		public Token i4;
		public Token i0;
		public VarContext i10;
		public DocpContext i5;
		public VarpContext i6;
		public Token i7;
		public Token i8;
		public TerminalNode GE() { return getToken(XQParser.GE, 0); }
		public VarpContext varp(int i) {
			return getRuleContext(VarpContext.class,i);
		}
		public TerminalNode LT() { return getToken(XQParser.LT, 0); }
		public List<DocpContext> docp() {
			return getRuleContexts(DocpContext.class);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public TerminalNode INT(int i) {
			return getToken(XQParser.INT, i);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public DocpContext docp(int i) {
			return getRuleContext(DocpContext.class,i);
		}
		public List<TerminalNode> LIT() { return getTokens(XQParser.LIT); }
		public TerminalNode GT() { return getToken(XQParser.GT, 0); }
		public List<TerminalNode> INT() { return getTokens(XQParser.INT); }
		public List<VarpContext> varp() {
			return getRuleContexts(VarpContext.class);
		}
		public TerminalNode LIT(int i) {
			return getToken(XQParser.LIT, i);
		}
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public TerminalNode LE() { return getToken(XQParser.LE, 0); }
		public TerminalNode NE() { return getToken(XQParser.NE, 0); }
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterIfexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitIfexpr(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ifexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(108); ((IfexprContext)_localctx).i9 = var();
				}
				break;

			case 2:
				{
				setState(109); ((IfexprContext)_localctx).i1 = docp();
				}
				break;

			case 3:
				{
				setState(110); ((IfexprContext)_localctx).i2 = varp();
				}
				break;

			case 4:
				{
				setState(111); ((IfexprContext)_localctx).i3 = match(LIT);
				}
				break;

			case 5:
				{
				setState(112); ((IfexprContext)_localctx).i4 = match(INT);
				}
				break;
			}
			setState(115);
			((IfexprContext)_localctx).i0 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
				((IfexprContext)_localctx).i0 = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(116); ((IfexprContext)_localctx).i10 = var();
				}
				break;

			case 2:
				{
				setState(117); ((IfexprContext)_localctx).i5 = docp();
				}
				break;

			case 3:
				{
				setState(118); ((IfexprContext)_localctx).i6 = varp();
				}
				break;

			case 4:
				{
				setState(119); ((IfexprContext)_localctx).i7 = match(LIT);
				}
				break;

			case 5:
				{
				setState(120); ((IfexprContext)_localctx).i8 = match(INT);
				}
				break;
			}

					String vara = new String();
					String varb = new String();
					double var1 = 0;
					double var2 = 0;
					boolean err = false;
					boolean retval = false;
					boolean nummode = true;
					
					if(((IfexprContext)_localctx).i1 != null)
					{
						if(((IfexprContext)_localctx).i1.retVal.size() != 1)
						{
							System.out.println("Error in the expression "+(((IfexprContext)_localctx).i1!=null?_input.getText(((IfexprContext)_localctx).i1.start,((IfexprContext)_localctx).i1.stop):null));
							err = true;
						}
						
						vara = ((IfexprContext)_localctx).i1.retVal.get(0);
					}
					else if(((IfexprContext)_localctx).i2 != null)
					{
						if(((IfexprContext)_localctx).i2.retVal.size() != 1)
						{
							System.out.println("Error in the expression "+(((IfexprContext)_localctx).i2!=null?_input.getText(((IfexprContext)_localctx).i2.start,((IfexprContext)_localctx).i2.stop):null));
							err = true;
						}
						
						vara = ((IfexprContext)_localctx).i2.retVal.get(0);
					}
					else if(((IfexprContext)_localctx).i9 != null)
					{
						if(((IfexprContext)_localctx).i9.retVal.size() != 1)
						{
							System.out.println("Error in the expression "+((IfexprContext)_localctx).i9.retVal);
							err = true;
						}
						
						vara = ((IfexprContext)_localctx).i9.retVal.get(0);
					}
					else if(((IfexprContext)_localctx).i3 != null)
					{
						String[] str = (((IfexprContext)_localctx).i3!=null?((IfexprContext)_localctx).i3.getText():null).split("\"");
						varb = str[1];
					}
					else
					{
						vara = (((IfexprContext)_localctx).i4!=null?((IfexprContext)_localctx).i4.getText():null);
					}
					
					try
					{
						var1 = Double.parseDouble(vara);
					}
					catch(Exception e)
					{
						nummode = false;
					}
					
					if(((IfexprContext)_localctx).i5 != null)
					{
						if(((IfexprContext)_localctx).i5.retVal.size() != 1)
						{
							System.out.println("Error in the expression "+(((IfexprContext)_localctx).i5!=null?_input.getText(((IfexprContext)_localctx).i5.start,((IfexprContext)_localctx).i5.stop):null));
							err = true;
						}
						
						varb = ((IfexprContext)_localctx).i5.retVal.get(0);
					}
					else if(((IfexprContext)_localctx).i6 != null)
					{
						if(((IfexprContext)_localctx).i6.retVal.size() != 1)
						{
							System.out.println("Error in the expression "+(((IfexprContext)_localctx).i6!=null?_input.getText(((IfexprContext)_localctx).i6.start,((IfexprContext)_localctx).i6.stop):null));
							err = true;
						}
						
						varb = ((IfexprContext)_localctx).i6.retVal.get(0);
					}
					else if(((IfexprContext)_localctx).i10 != null)
					{
						if(((IfexprContext)_localctx).i10.retVal.size() != 1)
						{
							System.out.println("Error in the expression "+(((IfexprContext)_localctx).i10!=null?_input.getText(((IfexprContext)_localctx).i10.start,((IfexprContext)_localctx).i10.stop):null));
							err = true;
						}
						
						varb = ((IfexprContext)_localctx).i10.retVal.get(0);
					}
					else if(((IfexprContext)_localctx).i7 != null)
					{
						String[] str = (((IfexprContext)_localctx).i7!=null?((IfexprContext)_localctx).i7.getText():null).split("\"");
						varb = str[1];
					}
					else
					{
						varb = (((IfexprContext)_localctx).i8!=null?((IfexprContext)_localctx).i8.getText():null);
					}
					
					if(nummode == true)
					{
						try{
							var2 = Double.parseDouble(varb);
						}
						catch(Exception e)
						{
							System.out.println("Error in Expression "+(((IfexprContext)_localctx).i0!=null?((IfexprContext)_localctx).i0.getText():null));
						}
					}
					
					if(err == false)
					{
						if(nummode == true)
						{
							switch((((IfexprContext)_localctx).i0!=null?((IfexprContext)_localctx).i0.getType():0))
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
							
							if((((IfexprContext)_localctx).i0!=null?((IfexprContext)_localctx).i0.getType():0) == EQ)
								retval = (vara.equals(varb))?true:false;
							else if((((IfexprContext)_localctx).i0!=null?((IfexprContext)_localctx).i0.getType():0) == NE)
								retval = (vara.equals(varb))?false:true;
							else
								System.out.println("Error in expr"+(((IfexprContext)_localctx).i0!=null?((IfexprContext)_localctx).i0.getText():null));
						}
					}
					
					((IfexprContext)_localctx).retVal =  retval;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RtnstmtContext extends ParserRuleContext {
		public ArithContext z;
		public List<TerminalNode> GE() { return getTokens(XQParser.GE); }
		public TerminalNode WHERE() { return getToken(XQParser.WHERE, 0); }
		public List<TerminalNode> LT() { return getTokens(XQParser.LT); }
		public List<DocpContext> docp() {
			return getRuleContexts(DocpContext.class);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public TerminalNode CMA(int i) {
			return getToken(XQParser.CMA, i);
		}
		public TerminalNode EQ(int i) {
			return getToken(XQParser.EQ, i);
		}
		public OrdContext ord() {
			return getRuleContext(OrdContext.class,0);
		}
		public TerminalNode INT(int i) {
			return getToken(XQParser.INT, i);
		}
		public TerminalNode GT(int i) {
			return getToken(XQParser.GT, i);
		}
		public DocpContext docp(int i) {
			return getRuleContext(DocpContext.class,i);
		}
		public List<TerminalNode> LIT() { return getTokens(XQParser.LIT); }
		public List<TerminalNode> INT() { return getTokens(XQParser.INT); }
		public TerminalNode LIT(int i) {
			return getToken(XQParser.LIT, i);
		}
		public List<TerminalNode> AND() { return getTokens(XQParser.AND); }
		public TerminalNode GE(int i) {
			return getToken(XQParser.GE, i);
		}
		public List<TerminalNode> CMA() { return getTokens(XQParser.CMA); }
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public VarpContext varp(int i) {
			return getRuleContext(VarpContext.class,i);
		}
		public TerminalNode NE(int i) {
			return getToken(XQParser.NE, i);
		}
		public TerminalNode LE(int i) {
			return getToken(XQParser.LE, i);
		}
		public TerminalNode RETURN() { return getToken(XQParser.RETURN, 0); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(XQParser.GT); }
		public List<VarpContext> varp() {
			return getRuleContexts(VarpContext.class);
		}
		public List<TerminalNode> EQ() { return getTokens(XQParser.EQ); }
		public TerminalNode LT(int i) {
			return getToken(XQParser.LT, i);
		}
		public TerminalNode AND(int i) {
			return getToken(XQParser.AND, i);
		}
		public List<TerminalNode> LE() { return getTokens(XQParser.LE); }
		public List<TerminalNode> NE() { return getTokens(XQParser.NE); }
		public RtnstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rtnstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterRtnstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitRtnstmt(this);
		}
	}

	public final RtnstmtContext rtnstmt() throws RecognitionException {
		RtnstmtContext _localctx = new RtnstmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rtnstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(125); match(WHERE);
				setState(129);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(126); var();
					}
					break;

				case 2:
					{
					setState(127); docp();
					}
					break;

				case 3:
					{
					setState(128); varp();
					}
					break;
				}
				setState(131);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(137);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(132); var();
					}
					break;

				case 2:
					{
					setState(133); docp();
					}
					break;

				case 3:
					{
					setState(134); varp();
					}
					break;

				case 4:
					{
					setState(135); match(LIT);
					}
					break;

				case 5:
					{
					setState(136); match(INT);
					}
					break;
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(139); match(AND);
					setState(143);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(140); var();
						}
						break;

					case 2:
						{
						setState(141); docp();
						}
						break;

					case 3:
						{
						setState(142); varp();
						}
						break;
					}
					setState(145);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(151);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(146); var();
						}
						break;

					case 2:
						{
						setState(147); docp();
						}
						break;

					case 3:
						{
						setState(148); varp();
						}
						break;

					case 4:
						{
						setState(149); match(LIT);
						}
						break;

					case 5:
						{
						setState(150); match(INT);
						}
						break;
					}
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(175);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(160); ord();
				setState(163);
				switch (_input.LA(1)) {
				case DOC:
					{
					setState(161); docp();
					}
					break;
				case VR:
					{
					setState(162); varp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMA) {
					{
					{
					setState(165); match(CMA);
					setState(168);
					switch (_input.LA(1)) {
					case DOC:
						{
						setState(166); docp();
						}
						break;
					case VR:
						{
						setState(167); varp();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(177); match(RETURN);
			setState(178); ((RtnstmtContext)_localctx).z = arith(0);

					if(((RtnstmtContext)_localctx).z != null )
					{
						if( XQData.getInstance().isRetFn == false)
						{
							XQData.getInstance().Markup = "";
							
							for(String s: ((RtnstmtContext)_localctx).z.retVal)
								XQData.getInstance().Markup += s +"\n" ;
							
							System.out.println("return statement:"+XQData.getInstance().Markup);
						}
						else
						{
							retVal.addAll(((RtnstmtContext)_localctx).z.retVal);
							System.out.println("return statement function:"+retVal);
						}
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprpContext extends ParserRuleContext {
		public TerminalNode CFL() { return getToken(XQParser.CFL, 0); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode HOFL() { return getToken(XQParser.HOFL, 0); }
		public ExprpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterExprp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitExprp(this);
		}
	}

	public final ExprpContext exprp() throws RecognitionException {
		ExprpContext _localctx = new ExprpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_exprp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181); match(HOFL);
			setState(183); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(182); expr();
				}
				}
				setState(185); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ORDER) | (1L << WHERE) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
			setState(187); match(CFL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Token LET;
		public VarContext var;
		public Token OB;
		public ArithContext la;
		public ArithContext arith;
		public List<ArithContext> lb = new ArrayList<ArithContext>();
		public Token CB;
		public IfexprContext ifexpr;
		public ExprContext a;
		public Token l1;
		public ExprContext expr;
		public List<ExprContext> c = new ArrayList<ExprContext>();
		public Token ELSE;
		public ExprContext b;
		public Token l2;
		public List<ExprContext> d = new ArrayList<ExprContext>();
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public ForstmtContext forstmt() {
			return getRuleContext(ForstmtContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(XQParser.THEN, 0); }
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CMA(int i) {
			return getToken(XQParser.CMA, i);
		}
		public TerminalNode CFL(int i) {
			return getToken(XQParser.CFL, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public TerminalNode CB() { return getToken(XQParser.CB, 0); }
		public TerminalNode OFL(int i) {
			return getToken(XQParser.OFL, i);
		}
		public TerminalNode ELSE() { return getToken(XQParser.ELSE, 0); }
		public List<TerminalNode> OFL() { return getTokens(XQParser.OFL); }
		public RtnstmtContext rtnstmt() {
			return getRuleContext(RtnstmtContext.class,0);
		}
		public List<TerminalNode> CFL() { return getTokens(XQParser.CFL); }
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public TerminalNode LET() { return getToken(XQParser.LET, 0); }
		public TerminalNode OB() { return getToken(XQParser.OB, 0); }
		public List<TerminalNode> CMA() { return getTokens(XQParser.CMA); }
		public TerminalNode IF() { return getToken(XQParser.IF, 0); }
		public TerminalNode LEQ() { return getToken(XQParser.LEQ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			int _alt;
			setState(248);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(189); forstmt();
				}
				break;
			case LET:
			case OB:
			case LIT:
			case DOC:
			case VR:
			case ID:
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(191);
					_la = _input.LA(1);
					if (_la==LET) {
						{
						setState(190); ((ExprContext)_localctx).LET = match(LET);
						}
					}

					setState(193); ((ExprContext)_localctx).var = var();
					setState(194); match(LEQ);
					}
					break;
				}
				setState(199);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(198); ((ExprContext)_localctx).OB = match(OB);
					}
					break;
				}
				setState(201); ((ExprContext)_localctx).la = arith(0);
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(202); match(CMA);
						setState(203); ((ExprContext)_localctx).arith = arith(0);
						((ExprContext)_localctx).lb.add(((ExprContext)_localctx).arith);
						}
						} 
					}
					setState(208);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(210);
				_la = _input.LA(1);
				if (_la==CB) {
					{
					setState(209); ((ExprContext)_localctx).CB = match(CB);
					}
				}


					if(isForCtx == true){}
					else if(((ExprContext)_localctx).la != null)
					{
						String tvar = (((ExprContext)_localctx).var!=null?_input.getText(((ExprContext)_localctx).var.start,((ExprContext)_localctx).var.stop):null);
						
						if(((ExprContext)_localctx).LET != null)
						{
							List<String> tVvar = forvars.get(tvar);
							List<String> tVar = XQData.getInstance().vars.get(tvar);
							
							if(isVCtx == true && tVvar == null && tVar == null)
							{
								List<String> args = new ArrayList<String>();
								args.addAll(((ExprContext)_localctx).la.retVal);
								if(((ExprContext)_localctx).OB != null && ((ExprContext)_localctx).CB != null && ((ExprContext)_localctx).lb != null)
								{
									for(ArithContext c : ((ExprContext)_localctx).lb)
										args.addAll(c.retVal);
								}
								forvars.put(tvar, args);
								System.out.println("Added a local variable"+forvars.get(tvar));
							}
							else if(isVCtx == false && tVar == null)
							{				
								List<String> args = new ArrayList<String>();
								args.addAll(((ExprContext)_localctx).la.retVal);
								if(((ExprContext)_localctx).OB != null && ((ExprContext)_localctx).CB != null && ((ExprContext)_localctx).lb != null)
								{
									for(ArithContext c : ((ExprContext)_localctx).lb)
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
								args.addAll(((ExprContext)_localctx).la.retVal);
								if(((ExprContext)_localctx).OB != null && ((ExprContext)_localctx).CB != null && ((ExprContext)_localctx).lb != null)
								{
									for(ArithContext c : ((ExprContext)_localctx).lb)
										args.addAll(c.retVal);
								}
								XQData.getInstance().vars.put(tvar, args);
							}
							else if(forvars.get(tvar) != null)
							{
								List<String> args = new ArrayList<String>();
								args.addAll(((ExprContext)_localctx).la.retVal);
								if(((ExprContext)_localctx).OB != null && ((ExprContext)_localctx).CB != null && ((ExprContext)_localctx).lb != null)
								{
									for(ArithContext c : ((ExprContext)_localctx).lb)
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
						System.out.println("Error in the expression "+(((ExprContext)_localctx).la!=null?_input.getText(((ExprContext)_localctx).la.start,((ExprContext)_localctx).la.stop):null));
					}
						
					
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 3);
				{
				setState(214); match(IF);
				isForCtx = true;
				setState(216); match(OB);
				setState(217); ((ExprContext)_localctx).ifexpr = ifexpr();
				setState(218); match(CB);
				setState(219); match(THEN);
				setState(229);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case ORDER:
				case WHERE:
				case RETURN:
				case LET:
				case OB:
				case LIT:
				case DOC:
				case VR:
				case ID:
				case INT:
					{
					setState(220); ((ExprContext)_localctx).a = expr();
					}
					break;
				case OFL:
					{
					{
					setState(221); ((ExprContext)_localctx).l1 = match(OFL);
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(222); ((ExprContext)_localctx).expr = expr();
						((ExprContext)_localctx).c.add(((ExprContext)_localctx).expr);
						}
						}
						setState(225); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ORDER) | (1L << WHERE) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
					setState(227); match(CFL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(243);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(231); ((ExprContext)_localctx).ELSE = match(ELSE);
					setState(241);
					switch (_input.LA(1)) {
					case IF:
					case FOR:
					case ORDER:
					case WHERE:
					case RETURN:
					case LET:
					case OB:
					case LIT:
					case DOC:
					case VR:
					case ID:
					case INT:
						{
						setState(232); ((ExprContext)_localctx).b = expr();
						}
						break;
					case OFL:
						{
						{
						setState(233); ((ExprContext)_localctx).l2 = match(OFL);
						setState(235); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(234); ((ExprContext)_localctx).expr = expr();
							((ExprContext)_localctx).d.add(((ExprContext)_localctx).expr);
							}
							}
							setState(237); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ORDER) | (1L << WHERE) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
						setState(239); match(CFL);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				}

					if(XQData.getInstance().isFnCtx == false)
					{
						boolean ifcond = ((ExprContext)_localctx).ifexpr.retVal;
						int i;
						int j = 1;
						
						System.out.println("if else statement "+ifcond);
						
						if(ifcond == true && ((ExprContext)_localctx).l1 != null)
							j = ((ExprContext)_localctx).c.size();
						
						if(ifcond == false && ((ExprContext)_localctx).l2 != null)
							j = ((ExprContext)_localctx).d.size();
							
						String in = new String();
							
						for(i=0;i<j;i++)
						{
							int x;
						
							if(ifcond == true)
							{
								if(((ExprContext)_localctx).l1 != null)
								{
									for(x = ((ExprContext)_localctx).c.get(i).start.getTokenIndex();x <= ((ExprContext)_localctx).c.get(i).stop.getTokenIndex(); x++)
										in += " "+_input.get(x).getText();
								}
								else
								{
									for(x = ((ExprContext)_localctx).a.start.getTokenIndex();x <= ((ExprContext)_localctx).a.stop.getTokenIndex(); x++)
										in += " "+_input.get(x).getText();
								}
							}
							else if(((ExprContext)_localctx).ELSE != null)
							{
								if(((ExprContext)_localctx).l2 != null)
								{
									for(x = ((ExprContext)_localctx).d.get(i).start.getTokenIndex();x <= ((ExprContext)_localctx).d.get(i).stop.getTokenIndex(); x++)
										in += " "+_input.get(x).getText();
								}
								else
								{
									for(x = ((ExprContext)_localctx).b.start.getTokenIndex();x <= ((ExprContext)_localctx).b.stop.getTokenIndex(); x++)
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
				break;
			case ORDER:
			case WHERE:
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(247); rtnstmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForstmtContext extends ParserRuleContext {
		public VarContext a;
		public Token AT;
		public VarContext b;
		public DocpContext docp;
		public VarpContext varp;
		public ExprContext c;
		public Token OFL;
		public ExprContext expr;
		public List<ExprContext> d = new ArrayList<ExprContext>();
		public TerminalNode AT() { return getToken(XQParser.AT, 0); }
		public TerminalNode OFL() { return getToken(XQParser.OFL, 0); }
		public TerminalNode FOR() { return getToken(XQParser.FOR, 0); }
		public TerminalNode CFL() { return getToken(XQParser.CFL, 0); }
		public VarpContext varp() {
			return getRuleContext(VarpContext.class,0);
		}
		public DocpContext docp() {
			return getRuleContext(DocpContext.class,0);
		}
		public TerminalNode IN() { return getToken(XQParser.IN, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public ForstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterForstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitForstmt(this);
		}
	}

	public final ForstmtContext forstmt() throws RecognitionException {
		ForstmtContext _localctx = new ForstmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250); match(FOR);
			isForCtx = true;
			setState(252); ((ForstmtContext)_localctx).a = var();
			setState(255);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(253); ((ForstmtContext)_localctx).AT = match(AT);
				setState(254); ((ForstmtContext)_localctx).b = var();
				}
			}

			setState(257); match(IN);
			setState(260);
			switch (_input.LA(1)) {
			case DOC:
				{
				setState(258); ((ForstmtContext)_localctx).docp = docp();
				}
				break;
			case VR:
				{
				setState(259); ((ForstmtContext)_localctx).varp = varp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(271);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case ORDER:
			case WHERE:
			case RETURN:
			case LET:
			case OB:
			case LIT:
			case DOC:
			case VR:
			case ID:
			case INT:
				{
				setState(262); ((ForstmtContext)_localctx).c = expr();
				}
				break;
			case OFL:
				{
				{
				setState(263); ((ForstmtContext)_localctx).OFL = match(OFL);
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264); ((ForstmtContext)_localctx).expr = expr();
					((ForstmtContext)_localctx).d.add(((ForstmtContext)_localctx).expr);
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << ORDER) | (1L << WHERE) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
				setState(269); match(CFL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

				if(XQData.getInstance().isFnCtx == false)
				{
					List<String> vara = new ArrayList<String>();		
					
					if( (((ForstmtContext)_localctx).docp != null) || (((ForstmtContext)_localctx).varp != null))
					{
						int i;
								
						List<String> params = new ArrayList<String>();
						
						boolean isMultiStmt = false;
						
						if(((ForstmtContext)_localctx).OFL != null)
						{
							isMultiStmt = true;
						}
						
						if(((ForstmtContext)_localctx).docp != null)
						{
							params.addAll(((ForstmtContext)_localctx).docp.retVal);
						}
						else
						{
							params.addAll(((ForstmtContext)_localctx).varp.retVal);
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
									
									for(x = ((ForstmtContext)_localctx).c.start.getTokenIndex();x <= ((ForstmtContext)_localctx).c.stop.getTokenIndex(); x++)
										in += " "+_input.get(x).getText();
									
									/*_input.seek(((ForstmtContext)_localctx).c.stop.getTokenIndex());
									mark = _input.mark();
									_input.seek(((ForstmtContext)_localctx).c.start.getTokenIndex());*/
								}
								else
								{
									m = ((ForstmtContext)_localctx).d.size();
									int x;
									
									for(x = ((ForstmtContext)_localctx).d.get(j).start.getTokenIndex();x <= ((ForstmtContext)_localctx).d.get(j).stop.getTokenIndex(); x++)
										in += " "+_input.get(x).getText();
										
									/*_input.seek(((ForstmtContext)_localctx).d.get(((ForstmtContext)_localctx).d.size()-1).stop.getTokenIndex());
									mark = _input.mark();
									_input.seek(((ForstmtContext)_localctx).d.get(0).start.getTokenIndex());*/
								}
							}
								
							ANTLRInputStream input = new ANTLRInputStream("{"+in+"}");
								
							XQL lexer = new XQL(input);
								
							System.out.println("The text input:"+in);
								
							CommonTokenStream tokens = new CommonTokenStream(lexer);
								
							XQParser parser = new XQParser(tokens);
								
							for(Map.Entry<String, List<String>> s : forvars.entrySet())
								parser.forvars.put(s.getKey(),s.getValue());
								
							parser.forvars.put((((ForstmtContext)_localctx).a!=null?_input.getText(((ForstmtContext)_localctx).a.start,((ForstmtContext)_localctx).a.stop):null),vara);
								
							boolean isAt = false;
								
							if(((ForstmtContext)_localctx).AT != null)
							{
								isAt = true;
									
								List<String> varb = new ArrayList<String>();
									
								varb.add(Integer.toString(i));
									
								parser.forvars.put((((ForstmtContext)_localctx).b!=null?_input.getText(((ForstmtContext)_localctx).b.start,((ForstmtContext)_localctx).b.stop):null),varb);
							}
								
							parser.forvars.get((((ForstmtContext)_localctx).a!=null?_input.getText(((ForstmtContext)_localctx).a.start,((ForstmtContext)_localctx).a.stop):null)).clear();
							parser.forvars.get((((ForstmtContext)_localctx).a!=null?_input.getText(((ForstmtContext)_localctx).a.start,((ForstmtContext)_localctx).a.stop):null)).add(params.get(i));
									
							if(isAt == true)
							{
								parser.forvars.get((((ForstmtContext)_localctx).b!=null?_input.getText(((ForstmtContext)_localctx).b.start,((ForstmtContext)_localctx).b.stop):null)).clear();
								parser.forvars.get((((ForstmtContext)_localctx).b!=null?_input.getText(((ForstmtContext)_localctx).b.start,((ForstmtContext)_localctx).b.stop):null)).add(Integer.toString(i));
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
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithContext extends ParserRuleContext {
		public int _p;
		public List<String> retVal;
		public ArithContext a;
		public VarContext var;
		public DocpContext docp;
		public VarpContext varp;
		public Token LIT;
		public Token INT;
		public VarpContext sa;
		public DocpContext sb;
		public VarpContext sc;
		public DocpContext sd;
		public FnameContext fname;
		public ArithContext fa;
		public ArithContext arith;
		public List<ArithContext> fb = new ArrayList<ArithContext>();
		public Token b;
		public ArithContext c;
		public TerminalNode GE() { return getToken(XQParser.GE, 0); }
		public TerminalNode DSH() { return getToken(XQParser.DSH, 0); }
		public TerminalNode LT() { return getToken(XQParser.LT, 0); }
		public List<DocpContext> docp() {
			return getRuleContexts(DocpContext.class);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public TerminalNode CMA(int i) {
			return getToken(XQParser.CMA, i);
		}
		public TerminalNode CB() { return getToken(XQParser.CB, 0); }
		public TerminalNode MOD() { return getToken(XQParser.MOD, 0); }
		public TerminalNode LIT() { return getToken(XQParser.LIT, 0); }
		public DocpContext docp(int i) {
			return getRuleContext(DocpContext.class,i);
		}
		public TerminalNode INT() { return getToken(XQParser.INT, 0); }
		public TerminalNode ML() { return getToken(XQParser.ML, 0); }
		public TerminalNode AND() { return getToken(XQParser.AND, 0); }
		public TerminalNode OB() { return getToken(XQParser.OB, 0); }
		public List<TerminalNode> CMA() { return getTokens(XQParser.CMA); }
		public FnameContext fname() {
			return getRuleContext(FnameContext.class,0);
		}
		public List<ArithContext> arith() {
			return getRuleContexts(ArithContext.class);
		}
		public VarpContext varp(int i) {
			return getRuleContext(VarpContext.class,i);
		}
		public TerminalNode MN() { return getToken(XQParser.MN, 0); }
		public TerminalNode OR() { return getToken(XQParser.OR, 0); }
		public TerminalNode PL() { return getToken(XQParser.PL, 0); }
		public TerminalNode GT() { return getToken(XQParser.GT, 0); }
		public List<VarpContext> varp() {
			return getRuleContexts(VarpContext.class);
		}
		public TerminalNode DIV() { return getToken(XQParser.DIV, 0); }
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public ArithContext arith(int i) {
			return getRuleContext(ArithContext.class,i);
		}
		public TerminalNode LE() { return getToken(XQParser.LE, 0); }
		public TerminalNode NE() { return getToken(XQParser.NE, 0); }
		public ArithContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ArithContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_arith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitArith(this);
		}
	}

	public final ArithContext arith(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithContext _localctx = new ArithContext(_ctx, _parentState, _p);
		ArithContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_arith);

		    ((ArithContext)_localctx).retVal =  new ArrayList<String>();
			
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(276); match(OB);
				setState(277); ((ArithContext)_localctx).a = arith(0);
				setState(278); match(CB);

						if(isForCtx == false)
						{
						if(_localctx.retVal == null)
								((ArithContext)_localctx).retVal =  new ArrayList<String>();
						_localctx.retVal.addAll(((ArithContext)_localctx).a.retVal);
						}
					
				}
				break;

			case 2:
				{
				setState(294);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(281); ((ArithContext)_localctx).var = var();

								if(isForCtx == false)
								{
								if(_localctx.retVal == null)
									((ArithContext)_localctx).retVal =  new ArrayList<String>();
								_localctx.retVal.addAll(((ArithContext)_localctx).var.retVal);
								}
							
					}
					break;

				case 2:
					{
					setState(284); ((ArithContext)_localctx).docp = docp();

								if(isForCtx == false)
								{
								if(_localctx.retVal == null)
									((ArithContext)_localctx).retVal =  new ArrayList<String>();
								_localctx.retVal.addAll(((ArithContext)_localctx).docp.retVal);
								}
							
					}
					break;

				case 3:
					{
					setState(287); ((ArithContext)_localctx).varp = varp();

								if(isForCtx == false)
								{
								if(_localctx.retVal == null)
									((ArithContext)_localctx).retVal =  new ArrayList<String>();
								_localctx.retVal.addAll(((ArithContext)_localctx).varp.retVal);
								}
							
					}
					break;

				case 4:
					{
					setState(290); ((ArithContext)_localctx).LIT = match(LIT);

								if(isForCtx == false)
								{
								if(_localctx.retVal == null)
									((ArithContext)_localctx).retVal =  new ArrayList<String>();
								
								String[] str = (((ArithContext)_localctx).LIT!=null?((ArithContext)_localctx).LIT.getText():null).split("\"");
								_localctx.retVal.add(str[1]);
								}
							
					}
					break;

				case 5:
					{
					setState(292); ((ArithContext)_localctx).INT = match(INT);

								if(isForCtx == false)
								{
								if(_localctx.retVal == null)
									((ArithContext)_localctx).retVal =  new ArrayList<String>();
								_localctx.retVal.add((((ArithContext)_localctx).INT!=null?((ArithContext)_localctx).INT.getText():null));
								}
							
					}
					break;
				}
				}
				break;

			case 3:
				{
				setState(298);
				switch (_input.LA(1)) {
				case VR:
					{
					setState(296); ((ArithContext)_localctx).sa = ((ArithContext)_localctx).varp = varp();
					}
					break;
				case DOC:
					{
					setState(297); ((ArithContext)_localctx).sb = ((ArithContext)_localctx).docp = docp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(300); match(DSH);
				setState(303);
				switch (_input.LA(1)) {
				case VR:
					{
					setState(301); ((ArithContext)_localctx).sc = ((ArithContext)_localctx).varp = varp();
					}
					break;
				case DOC:
					{
					setState(302); ((ArithContext)_localctx).sd = ((ArithContext)_localctx).docp = docp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}

						if(isForCtx == false)
						{
						if(_localctx.retVal == null)
								((ArithContext)_localctx).retVal =  new ArrayList<String>();
								
						if(((ArithContext)_localctx).sa == null && ((ArithContext)_localctx).sb != null)
							_localctx.retVal.addAll(((ArithContext)_localctx).sb.retVal);
						else if(((ArithContext)_localctx).sb == null && ((ArithContext)_localctx).sa != null)
							_localctx.retVal.addAll(((ArithContext)_localctx).sa.retVal);
						
						if(((ArithContext)_localctx).sc == null && ((ArithContext)_localctx).sd != null)
							_localctx.retVal.addAll(((ArithContext)_localctx).sd.retVal);
						else if(((ArithContext)_localctx).sd == null && ((ArithContext)_localctx).sc != null)
							_localctx.retVal.addAll(((ArithContext)_localctx).sc.retVal);
								
						System.out.println("dash operator called!!! "+_localctx.retVal);
						}
					
				}
				break;

			case 4:
				{
				setState(307); ((ArithContext)_localctx).fname = fname();
				setState(308); match(OB);
				setState(317);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(309); ((ArithContext)_localctx).fa = arith(0);
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CMA) {
						{
						{
						setState(310); match(CMA);
						setState(311); ((ArithContext)_localctx).arith = arith(0);
						((ArithContext)_localctx).fb.add(((ArithContext)_localctx).arith);
						}
						}
						setState(316);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(319); match(CB);

						if(XQData.getInstance().isFnCtx == false && isForCtx == false)
						{
						XQFns fn = XQData.getInstance().ftns.get((((ArithContext)_localctx).fname!=null?_input.getText(((ArithContext)_localctx).fname.start,((ArithContext)_localctx).fname.stop):null));
						if(fn != null)
						{
							List<ArithContext> pms = new ArrayList<ArithContext>();
							
							if(((ArithContext)_localctx).fa != null)
							{
								pms.add(((ArithContext)_localctx).fa);
							}
							
							if(((ArithContext)_localctx).fb != null)
							{
								for(ArithContext c : ((ArithContext)_localctx).fb)
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
								
								if(_localctx.retVal == null)
								{
									((ArithContext)_localctx).retVal =  new ArrayList<String>();
								}
								_localctx.retVal.addAll(parser.retVal);
							}
						}
						}
					
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new ArithContext(_parentctx, _parentState, _p);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arith);
						setState(324);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(325);
						((ArithContext)_localctx).b = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE) | (1L << PL) | (1L << MN) | (1L << ML) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ArithContext)_localctx).b = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(326); ((ArithContext)_localctx).c = arith(7);

						          		if(isForCtx == false)
						          		{
						          		System.out.println("calling arith operation "+(((ArithContext)_localctx).b!=null?((ArithContext)_localctx).b.getText():null)+" on "+((ArithContext)_localctx).a.retVal+" and "+((ArithContext)_localctx).c.retVal);
						          		
						          		if((((ArithContext)_localctx).a.retVal.size() != 1) && (((ArithContext)_localctx).c.retVal.size() != 1))
						          		{
						          			System.out.println("the "+(((ArithContext)_localctx).b!=null?((ArithContext)_localctx).b.getText():null)+" operator cannot be used for this variable "+(((ArithContext)_localctx).a!=null?_input.getText(((ArithContext)_localctx).a.start,((ArithContext)_localctx).a.stop):null));
						          		}
						          		
						          		double var1 = 0;
						          		double var2 = 0;
						          		double retval = 0;
						          		
						          		try
						          		{
						          			var1 = Double.parseDouble(((ArithContext)_localctx).a.retVal.get(0));
						          			var2 = Double.parseDouble(((ArithContext)_localctx).c.retVal.get(0));
						          		}
						          		catch(Exception e)
						          		{
						          			System.out.println("Error occurred performing a arithmatic operation at"+(((ArithContext)_localctx).a!=null?_input.getText(((ArithContext)_localctx).a.start,((ArithContext)_localctx).a.stop):null)+" with retval"+((ArithContext)_localctx).a.retVal );
						          		}
						          		
						          		switch((((ArithContext)_localctx).b!=null?((ArithContext)_localctx).b.getType():0))
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
						          		
						          		if(_localctx.retVal == null)
						          		{
						          			((ArithContext)_localctx).retVal =  new ArrayList<String>();			
						          		}
						          		_localctx.retVal.add(str);
						          		}
						          	
						}
						break;

					case 2:
						{
						_localctx = new ArithContext(_parentctx, _parentState, _p);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arith);
						setState(329);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(330);
						((ArithContext)_localctx).b = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ArithContext)_localctx).b = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(331); ((ArithContext)_localctx).c = arith(6);

						          		if(isForCtx == false)
						          		{
						          		if(_localctx.retVal == null)
						          				((ArithContext)_localctx).retVal =  new ArrayList<String>();
						          				
						          		if((((ArithContext)_localctx).a.retVal.size() == 1) && (((ArithContext)_localctx).c.retVal.size() == 1))
						          		{
						          			boolean var1 = Integer.parseInt(((ArithContext)_localctx).a.retVal.get(0))>0?true:false;
						          			boolean var2 = Integer.parseInt(((ArithContext)_localctx).c.retVal.get(0))>0?true:false;
						          			int rtn = 0;
						          			
						          			switch((((ArithContext)_localctx).b!=null?((ArithContext)_localctx).b.getType():0))
						          			{
						          				case AND:
						          					rtn = (var1 && var2)==true?1:0;
						          				break;
						          				case OR:
						          					rtn = (var1 || var2)==true?1:0;
						          				break;
						          			}
						          			_localctx.retVal.add(new String(Integer.toString(rtn)));
						          		}
						          		else if(((ArithContext)_localctx).a.retVal.size() != 1)
						          		{
						          			System.out.println((((ArithContext)_localctx).a!=null?_input.getText(((ArithContext)_localctx).a.start,((ArithContext)_localctx).a.stop):null)+" has zero or more than one value");
						          		}
						          		else
						          		{
						          			System.out.println((((ArithContext)_localctx).c!=null?_input.getText(((ArithContext)_localctx).c.start,((ArithContext)_localctx).c.stop):null)+" has zero or more than one value");
						          		}
						          		System.out.println("performing "+(((ArithContext)_localctx).c!=null?_input.getText(((ArithContext)_localctx).c.start,((ArithContext)_localctx).c.stop):null)+" on "+(((ArithContext)_localctx).a!=null?_input.getText(((ArithContext)_localctx).a.start,((ArithContext)_localctx).a.stop):null)+" and "+(((ArithContext)_localctx).c!=null?_input.getText(((ArithContext)_localctx).c.start,((ArithContext)_localctx).c.stop):null)+" returns "+_localctx.retVal.get(0));
						          		}
						          	
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class VarpcondContext extends ParserRuleContext {
		public String retVal;
		public TerminalNode GE() { return getToken(XQParser.GE, 0); }
		public TerminalNode GT() { return getToken(XQParser.GT, 0); }
		public TerminalNode LT() { return getToken(XQParser.LT, 0); }
		public TerminalNode SBO() { return getToken(XQParser.SBO, 0); }
		public TerminalNode INT() { return getToken(XQParser.INT, 0); }
		public TerminalNode SBC() { return getToken(XQParser.SBC, 0); }
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public TerminalNode ID() { return getToken(XQParser.ID, 0); }
		public TerminalNode ATT() { return getToken(XQParser.ATT, 0); }
		public TerminalNode LE() { return getToken(XQParser.LE, 0); }
		public TerminalNode LIT() { return getToken(XQParser.LIT, 0); }
		public TerminalNode NE() { return getToken(XQParser.NE, 0); }
		public VarpcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varpcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterVarpcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitVarpcond(this);
		}
	}

	public final VarpcondContext varpcond() throws RecognitionException {
		VarpcondContext _localctx = new VarpcondContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varpcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339); match(SBO);
			setState(343);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(340); match(ID);
				}
				break;
			case ATT:
				{
				{
				setState(341); match(ATT);
				setState(342); match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(345);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(346);
			_la = _input.LA(1);
			if ( !(_la==LIT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(347); match(SBC);

					if(_localctx.retVal == null)
						((VarpcondContext)_localctx).retVal =  new String();
						
					((VarpcondContext)_localctx).retVal =  _input.getText(_localctx.start, _input.LT(-1));
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarpexprContext extends ParserRuleContext {
		public String retVal;
		public VarpcondContext varpcond;
		public TerminalNode DPATH() { return getToken(XQParser.DPATH, 0); }
		public TerminalNode ID(int i) {
			return getToken(XQParser.ID, i);
		}
		public VarpcondContext varpcond() {
			return getRuleContext(VarpcondContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(XQParser.ID); }
		public TerminalNode PATH() { return getToken(XQParser.PATH, 0); }
		public TerminalNode ATT() { return getToken(XQParser.ATT, 0); }
		public VarpexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varpexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterVarpexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitVarpexpr(this);
		}
	}

	public final VarpexprContext varpexpr() throws RecognitionException {
		VarpexprContext _localctx = new VarpexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_varpexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==PATH || _la==DPATH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			{
			setState(351); match(ID);
			setState(354);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(352); match(ATT);
				setState(353); match(ID);
				}
				break;
			}
			setState(357);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(356); ((VarpexprContext)_localctx).varpcond = varpcond();
				}
				break;
			}
			}

					if(_localctx.retVal == null)
						((VarpexprContext)_localctx).retVal =  new String();
						
					if(((VarpexprContext)_localctx).varpcond != null)
						((VarpexprContext)_localctx).retVal =  ((VarpexprContext)_localctx).varpcond.retVal;
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarpContext extends ParserRuleContext {
		public List<String> retVal;
		public VarContext var;
		public VarpexprContext varpexpr;
		public List<VarpexprContext> a = new ArrayList<VarpexprContext>();
		public List<VarpexprContext> varpexpr() {
			return getRuleContexts(VarpexprContext.class);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarpexprContext varpexpr(int i) {
			return getRuleContext(VarpexprContext.class,i);
		}
		public VarpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterVarp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitVarp(this);
		}
	}

	public final VarpContext varp() throws RecognitionException {
		VarpContext _localctx = new VarpContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(361); ((VarpContext)_localctx).var = var();
			setState(365);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(362); ((VarpContext)_localctx).varpexpr = varpexpr();
					((VarpContext)_localctx).a.add(((VarpContext)_localctx).varpexpr);
					}
					} 
				}
				setState(367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
					
					/*connect to database
					List<String> results = new ArrayList<String>();
					results.add("hello");
					Add the results here*/
					
					List<XQVarDesc> ListIn = new ArrayList<XQVarDesc>();
					
					ListIn.add(new XQVarDesc("/root",""));
					
					for(VarpexprContext e: ((VarpContext)_localctx).a)
					{
						String x = e.getText();
						
						String[] s = x.split("\\[");
						
						XQVarDesc in = new XQVarDesc(s[0],e.retVal);
						
						System.out.println("Added path item: "+in.Path+","+in.Cond);
						
						ListIn.add(in);
					}
					
					if(_localctx.retVal == null)
						((VarpContext)_localctx).retVal =  new ArrayList<String>();
					_localctx.retVal.addAll(XQData.getInstance().GetVarPath(((VarpContext)_localctx).var.retVal,ListIn));
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public List<String> retVal;
		public TerminalNode VR() { return getToken(XQParser.VR, 0); }
		public TerminalNode ID() { return getToken(XQParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370); match(VR);
			setState(371); match(ID);

					if(_localctx.retVal == null)
						((VarContext)_localctx).retVal =  new ArrayList<String>();
				
					if(XQData.getInstance().vars.get(_input.getText(_localctx.start, _input.LT(-1))) != null)
						_localctx.retVal.addAll(XQData.getInstance().vars.get(_input.getText(_localctx.start, _input.LT(-1))));
							
					if(forvars.get(_input.getText(_localctx.start, _input.LT(-1))) != null)
						_localctx.retVal.addAll(forvars.get(_input.getText(_localctx.start, _input.LT(-1))));
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DocpContext extends ParserRuleContext {
		public List<String> retVal;
		public TerminalNode ATT(int i) {
			return getToken(XQParser.ATT, i);
		}
		public List<TerminalNode> DPATH() { return getTokens(XQParser.DPATH); }
		public TerminalNode PATH(int i) {
			return getToken(XQParser.PATH, i);
		}
		public TerminalNode ID(int i) {
			return getToken(XQParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQParser.ID); }
		public List<TerminalNode> PATH() { return getTokens(XQParser.PATH); }
		public TerminalNode DOC() { return getToken(XQParser.DOC, 0); }
		public List<TerminalNode> ATT() { return getTokens(XQParser.ATT); }
		public TerminalNode DPATH(int i) {
			return getToken(XQParser.DPATH, i);
		}
		public DocpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterDocp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitDocp(this);
		}
	}

	public final DocpContext docp() throws RecognitionException {
		DocpContext _localctx = new DocpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_docp);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374); match(DOC);
			setState(383);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(375);
					_la = _input.LA(1);
					if ( !(_la==PATH || _la==DPATH) ) {
					_errHandler.recoverInline(this);
					}
					consume();
					setState(379);
					switch (_input.LA(1)) {
					case ID:
						{
						setState(376); match(ID);
						}
						break;
					case ATT:
						{
						{
						setState(377); match(ATT);
						setState(378); match(ID);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(385);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
				
					if(_localctx.retVal == null)
						((DocpContext)_localctx).retVal =  new ArrayList<String>();
						
					_localctx.retVal.addAll(XQData.getInstance().GetXPath(_input.getText(_localctx.start, _input.LT(-1))));
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HtmidContext extends ParserRuleContext {
		public String retVal;
		public Token a;
		public Token HID;
		public List<Token> b = new ArrayList<Token>();
		public Token HLIT;
		public List<Token> c = new ArrayList<Token>();
		public TerminalNode HID(int i) {
			return getToken(XQParser.HID, i);
		}
		public List<TerminalNode> HLIT() { return getTokens(XQParser.HLIT); }
		public List<TerminalNode> HEQ() { return getTokens(XQParser.HEQ); }
		public TerminalNode HEQ(int i) {
			return getToken(XQParser.HEQ, i);
		}
		public List<TerminalNode> HID() { return getTokens(XQParser.HID); }
		public TerminalNode HLIT(int i) {
			return getToken(XQParser.HLIT, i);
		}
		public HtmidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_htmid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterHtmid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitHtmid(this);
		}
	}

	public final HtmidContext htmid() throws RecognitionException {
		HtmidContext _localctx = new HtmidContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_htmid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388); ((HtmidContext)_localctx).a = match(HID);
			setState(394);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(389); ((HtmidContext)_localctx).HID = match(HID);
					((HtmidContext)_localctx).b.add(((HtmidContext)_localctx).HID);
					setState(390); match(HEQ);
					setState(391); ((HtmidContext)_localctx).HLIT = match(HLIT);
					((HtmidContext)_localctx).c.add(((HtmidContext)_localctx).HLIT);
					}
					} 
				}
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}

					_localctx.retVal += (((HtmidContext)_localctx).a!=null?((HtmidContext)_localctx).a.getText():null);
					int i;
					
					for(i=0;i<((HtmidContext)_localctx).b.size();i++)
					{
						_localctx.retVal += " "+((HtmidContext)_localctx).b.get(i).getText()+"="+((HtmidContext)_localctx).c.get(i).getText(); 
					}
				
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrdContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(XQParser.BY, 0); }
		public TerminalNode ORDER() { return getToken(XQParser.ORDER, 0); }
		public OrdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterOrd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitOrd(this);
		}
	}

	public final OrdContext ord() throws RecognitionException {
		OrdContext _localctx = new OrdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399); match(ORDER);
			setState(400); match(BY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FnameContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(XQParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQParser.ID); }
		public TerminalNode CL() { return getToken(XQParser.CL, 0); }
		public FnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterFname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitFname(this);
		}
	}

	public final FnameContext fname() throws RecognitionException {
		FnameContext _localctx = new FnameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(402); match(ID);
				setState(403); match(CL);
				}
				break;
			}
			setState(406); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DtypeContext extends ParserRuleContext {
		public TerminalNode ID(int i) {
			return getToken(XQParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQParser.ID); }
		public TerminalNode QM() { return getToken(XQParser.QM, 0); }
		public TerminalNode CL() { return getToken(XQParser.CL, 0); }
		public DtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterDtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitDtype(this);
		}
	}

	public final DtypeContext dtype() throws RecognitionException {
		DtypeContext _localctx = new DtypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(408); match(ID);
			setState(409); match(CL);
			setState(410); match(ID);
			setState(411); match(QM);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9: return arith_sempred((ArithContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arith_sempred(ArithContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\2\3>\u01a0\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\3\2\7\2*\n\2\f\2\16\2-\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3;\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3B\n\3\3\4\3\4\6\4F\n\4\r\4\16\4G\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5R\n\5\3\5\3\5\3\5\3\5\5\5X\n\5\7\5Z\n\5\f\5\16\5]\13\5\5\5_\n"+
		"\5\3\5\3\5\3\5\5\5d\n\5\3\5\3\5\6\5h\n\5\r\5\16\5i\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6t\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\5\7\u0084\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008c\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u0092\n\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009a\n\7\7\7\u009c\n"+
		"\7\f\7\16\7\u009f\13\7\5\7\u00a1\n\7\3\7\3\7\3\7\5\7\u00a6\n\7\3\7\3\7"+
		"\3\7\5\7\u00ab\n\7\7\7\u00ad\n\7\f\7\16\7\u00b0\13\7\5\7\u00b2\n\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\6\b\u00ba\n\b\r\b\16\b\u00bb\3\b\3\b\3\t\3\t\5\t"+
		"\u00c2\n\t\3\t\3\t\3\t\5\t\u00c7\n\t\3\t\5\t\u00ca\n\t\3\t\3\t\3\t\7\t"+
		"\u00cf\n\t\f\t\16\t\u00d2\13\t\3\t\5\t\u00d5\n\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\6\t\u00e2\n\t\r\t\16\t\u00e3\3\t\3\t\5\t\u00e8"+
		"\n\t\3\t\3\t\3\t\3\t\6\t\u00ee\n\t\r\t\16\t\u00ef\3\t\3\t\5\t\u00f4\n"+
		"\t\5\t\u00f6\n\t\3\t\3\t\3\t\5\t\u00fb\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0102"+
		"\n\n\3\n\3\n\3\n\5\n\u0107\n\n\3\n\3\n\3\n\6\n\u010c\n\n\r\n\16\n\u010d"+
		"\3\n\3\n\5\n\u0112\n\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0129\n\13"+
		"\3\13\3\13\5\13\u012d\n\13\3\13\3\13\3\13\5\13\u0132\n\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\7\13\u013b\n\13\f\13\16\13\u013e\13\13\5\13\u0140"+
		"\n\13\3\13\3\13\3\13\5\13\u0145\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0151\n\13\f\13\16\13\u0154\13\13\3\f\3\f\3\f\3\f"+
		"\5\f\u015a\n\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0165\n\r\3\r\5"+
		"\r\u0168\n\r\3\r\3\r\3\16\3\16\7\16\u016e\n\16\f\16\16\16\u0171\13\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\5\20\u017e\n\20"+
		"\7\20\u0180\n\20\f\20\16\20\u0183\13\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\7\21\u018b\n\21\f\21\16\21\u018e\13\21\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\5\23\u0197\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\6\u00d0"+
		"\u016f\u0181\u018c\25\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\13"+
		"\3\36#\3\36#\3\36#\6\36#-/\62\62\64\64\4\35\35\63\63\3\36#\4\66\66<<\3"+
		"\25\26\3\25\26\u01da\2+\3\2\2\2\4A\3\2\2\2\6E\3\2\2\2\bI\3\2\2\2\ns\3"+
		"\2\2\2\f\u00a0\3\2\2\2\16\u00b7\3\2\2\2\20\u00fa\3\2\2\2\22\u00fc\3\2"+
		"\2\2\24\u0144\3\2\2\2\26\u0155\3\2\2\2\30\u0160\3\2\2\2\32\u016b\3\2\2"+
		"\2\34\u0174\3\2\2\2\36\u0178\3\2\2\2 \u0186\3\2\2\2\"\u0191\3\2\2\2$\u0196"+
		"\3\2\2\2&\u019a\3\2\2\2(*\5\4\3\2)(\3\2\2\2*-\3\2\2\2+)\3\2\2\2+,\3\2"+
		"\2\2,\3\3\2\2\2-+\3\2\2\2./\7\6\2\2/\60\5\6\4\2\60\61\7*\2\2\61B\3\2\2"+
		"\2\62\63\7\3\2\2\63\64\7\5\2\2\64\65\7\t\2\2\65B\7\4\2\2\66\67\7\3\2\2"+
		"\678\5 \21\28:\7\4\2\29;\7\n\2\2:9\3\2\2\2:;\3\2\2\2;B\3\2\2\2<=\7\3\2"+
		"\2=>\5 \21\2>?\7\5\2\2?@\7\4\2\2@B\3\2\2\2A.\3\2\2\2A\62\3\2\2\2A\66\3"+
		"\2\2\2A<\3\2\2\2B\5\3\2\2\2CF\5\20\t\2DF\5\b\5\2EC\3\2\2\2ED\3\2\2\2F"+
		"G\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\7\3\2\2\2IJ\7\22\2\2JK\7\23\2\2KL\b\5\1"+
		"\2LM\5$\23\2M^\7&\2\2NQ\5\24\13\2OP\7\24\2\2PR\5&\24\2QO\3\2\2\2QR\3\2"+
		"\2\2R[\3\2\2\2ST\7+\2\2TW\5\24\13\2UV\7\24\2\2VX\5&\24\2WU\3\2\2\2WX\3"+
		"\2\2\2XZ\3\2\2\2YS\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\_\3\2\2\2]"+
		"[\3\2\2\2^N\3\2\2\2^_\3\2\2\2_`\3\2\2\2`c\7\'\2\2ab\7\24\2\2bd\5&\24\2"+
		"ca\3\2\2\2cd\3\2\2\2de\3\2\2\2eg\7)\2\2fh\5\20\t\2gf\3\2\2\2hi\3\2\2\2"+
		"ig\3\2\2\2ij\3\2\2\2jk\3\2\2\2kl\7*\2\2lm\b\5\1\2m\t\3\2\2\2nt\5\34\17"+
		"\2ot\5\36\20\2pt\5\32\16\2qt\7\66\2\2rt\7<\2\2sn\3\2\2\2so\3\2\2\2sp\3"+
		"\2\2\2sq\3\2\2\2sr\3\2\2\2tu\3\2\2\2u{\t\2\2\2v|\5\34\17\2w|\5\36\20\2"+
		"x|\5\32\16\2y|\7\66\2\2z|\7<\2\2{v\3\2\2\2{w\3\2\2\2{x\3\2\2\2{y\3\2\2"+
		"\2{z\3\2\2\2|}\3\2\2\2}~\b\6\1\2~\13\3\2\2\2\177\u0083\7\32\2\2\u0080"+
		"\u0084\5\34\17\2\u0081\u0084\5\36\20\2\u0082\u0084\5\32\16\2\u0083\u0080"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u008b\t\3\2\2\u0086\u008c\5\34\17\2\u0087\u008c\5\36\20\2\u0088\u008c"+
		"\5\32\16\2\u0089\u008c\7\66\2\2\u008a\u008c\7<\2\2\u008b\u0086\3\2\2\2"+
		"\u008b\u0087\3\2\2\2\u008b\u0088\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\u009d\3\2\2\2\u008d\u0091\7\35\2\2\u008e\u0092\5\34\17"+
		"\2\u008f\u0092\5\36\20\2\u0090\u0092\5\32\16\2\u0091\u008e\3\2\2\2\u0091"+
		"\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0099\t\4"+
		"\2\2\u0094\u009a\5\34\17\2\u0095\u009a\5\36\20\2\u0096\u009a\5\32\16\2"+
		"\u0097\u009a\7\66\2\2\u0098\u009a\7<\2\2\u0099\u0094\3\2\2\2\u0099\u0095"+
		"\3\2\2\2\u0099\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009c\3\2\2\2\u009b\u008d\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2"+
		"\2\2\u009d\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0"+
		"\177\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00b1\3\2\2\2\u00a2\u00a5\5\"\22"+
		"\2\u00a3\u00a6\5\36\20\2\u00a4\u00a6\5\32\16\2\u00a5\u00a3\3\2\2\2\u00a5"+
		"\u00a4\3\2\2\2\u00a6\u00ae\3\2\2\2\u00a7\u00aa\7+\2\2\u00a8\u00ab\5\36"+
		"\20\2\u00a9\u00ab\5\32\16\2\u00aa\u00a8\3\2\2\2\u00aa\u00a9\3\2\2\2\u00ab"+
		"\u00ad\3\2\2\2\u00ac\u00a7\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1"+
		"\u00a2\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\33"+
		"\2\2\u00b4\u00b5\5\24\13\2\u00b5\u00b6\b\7\1\2\u00b6\r\3\2\2\2\u00b7\u00b9"+
		"\7\6\2\2\u00b8\u00ba\5\20\t\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2"+
		"\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\7*\2\2\u00be\17\3\2\2\2\u00bf\u00fb\5\22\n\2\u00c0\u00c2\7\34\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\5\34"+
		"\17\2\u00c4\u00c5\7$\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6"+
		"\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00ca\7&\2\2\u00c9\u00c8\3\2"+
		"\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00d0\5\24\13\2\u00cc"+
		"\u00cd\7+\2\2\u00cd\u00cf\5\24\13\2\u00ce\u00cc\3\2\2\2\u00cf\u00d2\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2"+
		"\u00d0\3\2\2\2\u00d3\u00d5\7\'\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\b\t\1\2\u00d7\u00fb\3\2\2\2\u00d8"+
		"\u00d9\7\r\2\2\u00d9\u00da\b\t\1\2\u00da\u00db\7&\2\2\u00db\u00dc\5\n"+
		"\6\2\u00dc\u00dd\7\'\2\2\u00dd\u00e7\7\17\2\2\u00de\u00e8\5\20\t\2\u00df"+
		"\u00e1\7)\2\2\u00e0\u00e2\5\20\t\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5"+
		"\u00e6\7*\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00de\3\2\2\2\u00e7\u00df\3\2"+
		"\2\2\u00e8\u00f5\3\2\2\2\u00e9\u00f3\7\16\2\2\u00ea\u00f4\5\20\t\2\u00eb"+
		"\u00ed\7)\2\2\u00ec\u00ee\5\20\t\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\7*\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00ea\3\2\2\2\u00f3\u00eb\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00e9\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6"+
		"\u00f7\3\2\2\2\u00f7\u00f8\b\t\1\2\u00f8\u00fb\3\2\2\2\u00f9\u00fb\5\f"+
		"\7\2\u00fa\u00bf\3\2\2\2\u00fa\u00c6\3\2\2\2\u00fa\u00d8\3\2\2\2\u00fa"+
		"\u00f9\3\2\2\2\u00fb\21\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd\u00fe\b\n\1"+
		"\2\u00fe\u0101\5\34\17\2\u00ff\u0100\7\31\2\2\u0100\u0102\5\34\17\2\u0101"+
		"\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106\7\21"+
		"\2\2\u0104\u0107\5\36\20\2\u0105\u0107\5\32\16\2\u0106\u0104\3\2\2\2\u0106"+
		"\u0105\3\2\2\2\u0107\u0111\3\2\2\2\u0108\u0112\5\20\t\2\u0109\u010b\7"+
		")\2\2\u010a\u010c\5\20\t\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7*"+
		"\2\2\u0110\u0112\3\2\2\2\u0111\u0108\3\2\2\2\u0111\u0109\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\b\n\1\2\u0114\23\3\2\2\2\u0115\u0116\b\13\1"+
		"\2\u0116\u0117\7&\2\2\u0117\u0118\5\24\13\2\u0118\u0119\7\'\2\2\u0119"+
		"\u011a\b\13\1\2\u011a\u0145\3\2\2\2\u011b\u011c\5\34\17\2\u011c\u011d"+
		"\b\13\1\2\u011d\u0129\3\2\2\2\u011e\u011f\5\36\20\2\u011f\u0120\b\13\1"+
		"\2\u0120\u0129\3\2\2\2\u0121\u0122\5\32\16\2\u0122\u0123\b\13\1\2\u0123"+
		"\u0129\3\2\2\2\u0124\u0125\7\66\2\2\u0125\u0129\b\13\1\2\u0126\u0127\7"+
		"<\2\2\u0127\u0129\b\13\1\2\u0128\u011b\3\2\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u0121\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u0145\3\2"+
		"\2\2\u012a\u012d\5\32\16\2\u012b\u012d\5\36\20\2\u012c\u012a\3\2\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0131\7\65\2\2\u012f\u0132\5"+
		"\32\16\2\u0130\u0132\5\36\20\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2"+
		"\u0132\u0133\3\2\2\2\u0133\u0134\b\13\1\2\u0134\u0145\3\2\2\2\u0135\u0136"+
		"\5$\23\2\u0136\u013f\7&\2\2\u0137\u013c\5\24\13\2\u0138\u0139\7+\2\2\u0139"+
		"\u013b\5\24\13\2\u013a\u0138\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3"+
		"\2\2\2\u013c\u013d\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013f"+
		"\u0137\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\7\'"+
		"\2\2\u0142\u0143\b\13\1\2\u0143\u0145\3\2\2\2\u0144\u0115\3\2\2\2\u0144"+
		"\u0128\3\2\2\2\u0144\u012c\3\2\2\2\u0144\u0135\3\2\2\2\u0145\u0152\3\2"+
		"\2\2\u0146\u0147\6\13\2\3\u0147\u0148\t\5\2\2\u0148\u0149\5\24\13\2\u0149"+
		"\u014a\b\13\1\2\u014a\u0151\3\2\2\2\u014b\u014c\6\13\3\3\u014c\u014d\t"+
		"\6\2\2\u014d\u014e\5\24\13\2\u014e\u014f\b\13\1\2\u014f\u0151\3\2\2\2"+
		"\u0150\u0146\3\2\2\2\u0150\u014b\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150"+
		"\3\2\2\2\u0152\u0153\3\2\2\2\u0153\25\3\2\2\2\u0154\u0152\3\2\2\2\u0155"+
		"\u0159\7\60\2\2\u0156\u015a\7;\2\2\u0157\u0158\7(\2\2\u0158\u015a\7;\2"+
		"\2\u0159\u0156\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c"+
		"\t\7\2\2\u015c\u015d\t\b\2\2\u015d\u015e\7\61\2\2\u015e\u015f\b\f\1\2"+
		"\u015f\27\3\2\2\2\u0160\u0161\t\t\2\2\u0161\u0164\7;\2\2\u0162\u0163\7"+
		"(\2\2\u0163\u0165\7;\2\2\u0164\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165"+
		"\u0167\3\2\2\2\u0166\u0168\5\26\f\2\u0167\u0166\3\2\2\2\u0167\u0168\3"+
		"\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\b\r\1\2\u016a\31\3\2\2\2\u016b"+
		"\u016f\5\34\17\2\u016c\u016e\5\30\r\2\u016d\u016c\3\2\2\2\u016e\u0171"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0173\b\16\1\2\u0173\33\3\2\2\2\u0174\u0175\7:\2"+
		"\2\u0175\u0176\7;\2\2\u0176\u0177\b\17\1\2\u0177\35\3\2\2\2\u0178\u0181"+
		"\78\2\2\u0179\u017d\t\n\2\2\u017a\u017e\7;\2\2\u017b\u017c\7(\2\2\u017c"+
		"\u017e\7;\2\2\u017d\u017a\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0180\3\2"+
		"\2\2\u017f\u0179\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0184\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0185\b\20"+
		"\1\2\u0185\37\3\2\2\2\u0186\u018c\7\t\2\2\u0187\u0188\7\t\2\2\u0188\u0189"+
		"\7\13\2\2\u0189\u018b\7\f\2\2\u018a\u0187\3\2\2\2\u018b\u018e\3\2\2\2"+
		"\u018c\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018f\u0190\b\21\1\2\u0190!\3\2\2\2\u0191\u0192\7\27\2\2\u0192"+
		"\u0193\7\30\2\2\u0193#\3\2\2\2\u0194\u0195\7;\2\2\u0195\u0197\7%\2\2\u0196"+
		"\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\7;"+
		"\2\2\u0199%\3\2\2\2\u019a\u019b\7;\2\2\u019b\u019c\7%\2\2\u019c\u019d"+
		"\7;\2\2\u019d\u019e\7,\2\2\u019e\'\3\2\2\29+:AEGQW[^cis{\u0083\u008b\u0091"+
		"\u0099\u009d\u00a0\u00a5\u00aa\u00ae\u00b1\u00bb\u00c1\u00c6\u00c9\u00d0"+
		"\u00d4\u00e3\u00e7\u00ef\u00f3\u00f5\u00fa\u0101\u0106\u010d\u0111\u0128"+
		"\u012c\u0131\u013c\u013f\u0144\u0150\u0152\u0159\u0164\u0167\u016f\u017d"+
		"\u0181\u018c\u0196";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}