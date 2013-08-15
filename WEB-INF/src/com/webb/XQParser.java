// Generated from XQ.g4 by ANTLR 4.0

  package com.webb;
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
		RULE_rtnstmt = 5, RULE_exprp = 6, RULE_expr = 7, RULE_wherecond = 8, RULE_wherestmt = 9, 
		RULE_whereord = 10, RULE_forstmt = 11, RULE_arith = 12, RULE_varpscond = 13, 
		RULE_andor = 14, RULE_varpcond = 15, RULE_varpexpra = 16, RULE_varpexpr = 17, 
		RULE_varp = 18, RULE_var = 19, RULE_docexp = 20, RULE_docp = 21, RULE_htmid = 22, 
		RULE_ord = 23, RULE_fname = 24, RULE_dtype = 25;
	public static final String[] ruleNames = {
		"prog", "htmt", "stmt", "func", "ifexpr", "rtnstmt", "exprp", "expr", 
		"wherecond", "wherestmt", "whereord", "forstmt", "arith", "varpscond", 
		"andor", "varpcond", "varpexpra", "varpexpr", "varp", "var", "docexp", 
		"docp", "htmid", "ord", "fname", "dtype"
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
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==HTMS || _la==HOFL) {
				{
				{
				setState(52); htmt();
				}
				}
				setState(57);
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
			setState(77);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); match(HOFL);
				setState(59); stmt();
				setState(60); match(CFL);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62); match(HTMS);
				setState(63); match(SLH);
				setState(64); match(HID);
				setState(65); match(HTME);
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66); match(HTMS);
				setState(67); htmid();
				setState(68); match(HTME);
				setState(70);
				_la = _input.LA(1);
				if (_la==INHTM) {
					{
					setState(69); match(INHTM);
					}
				}

				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(72); match(HTMS);
				setState(73); htmid();
				setState(74); match(SLH);
				setState(75); match(HTME);
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
			setState(81); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(81);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case RETURN:
				case LET:
				case OB:
				case LIT:
				case DOC:
				case VR:
				case ID:
				case INT:
					{
					setState(79); expr();
					}
					break;
				case DCL:
					{
					setState(80); func();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << DCL) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
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
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AS(int i) {
			return getToken(XQParser.AS, i);
		}
		public List<DtypeContext> dtype() {
			return getRuleContexts(DtypeContext.class);
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
			setState(85); match(DCL);
			setState(86); match(FN);
			isForCtx = true; XQData.getInstance().isFnCtx = true;
			setState(88); ((FuncContext)_localctx).fname = fname();
			setState(89); match(OB);
			setState(106);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0)) {
				{
				{
				setState(90); ((FuncContext)_localctx).b = arith(0);
				setState(93);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(91); match(AS);
					setState(92); dtype();
					}
				}

				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CMA) {
					{
					{
					setState(95); match(CMA);
					setState(96); ((FuncContext)_localctx).arith = arith(0);
					((FuncContext)_localctx).c.add(((FuncContext)_localctx).arith);
					setState(99);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(97); match(AS);
						setState(98); dtype();
						}
					}

					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(108); match(CB);
			setState(111);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(109); match(AS);
				setState(110); dtype();
				}
			}

			setState(113); match(OFL);
			setState(115); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(114); ((FuncContext)_localctx).expr = expr();
				((FuncContext)_localctx).d.add(((FuncContext)_localctx).expr);
				}
				}
				setState(117); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
			setState(119); match(CFL);

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
		public List<TerminalNode> LIT() { return getTokens(XQParser.LIT); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public DocpContext docp(int i) {
			return getRuleContext(DocpContext.class,i);
		}
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
			setState(127);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(122); ((IfexprContext)_localctx).i9 = var();
				}
				break;

			case 2:
				{
				setState(123); ((IfexprContext)_localctx).i1 = docp();
				}
				break;

			case 3:
				{
				setState(124); ((IfexprContext)_localctx).i2 = varp();
				}
				break;

			case 4:
				{
				setState(125); ((IfexprContext)_localctx).i3 = match(LIT);
				}
				break;

			case 5:
				{
				setState(126); ((IfexprContext)_localctx).i4 = match(INT);
				}
				break;
			}
			setState(129);
			((IfexprContext)_localctx).i0 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
				((IfexprContext)_localctx).i0 = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(135);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(130); ((IfexprContext)_localctx).i10 = var();
				}
				break;

			case 2:
				{
				setState(131); ((IfexprContext)_localctx).i5 = docp();
				}
				break;

			case 3:
				{
				setState(132); ((IfexprContext)_localctx).i6 = varp();
				}
				break;

			case 4:
				{
				setState(133); ((IfexprContext)_localctx).i7 = match(LIT);
				}
				break;

			case 5:
				{
				setState(134); ((IfexprContext)_localctx).i8 = match(INT);
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
		public ArithContext arith() {
			return getRuleContext(ArithContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(XQParser.RETURN, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); match(RETURN);
			setState(140); ((RtnstmtContext)_localctx).z = arith(0);

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
			setState(143); match(HOFL);
			setState(145); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(144); expr();
				}
				}
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
			setState(149); match(CFL);
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
			setState(210);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(151); forstmt();
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
				setState(158);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(153);
					_la = _input.LA(1);
					if (_la==LET) {
						{
						setState(152); ((ExprContext)_localctx).LET = match(LET);
						}
					}

					setState(155); ((ExprContext)_localctx).var = var();
					setState(156); match(LEQ);
					}
					break;
				}
				setState(161);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(160); ((ExprContext)_localctx).OB = match(OB);
					}
					break;
				}
				setState(163); ((ExprContext)_localctx).la = arith(0);
				setState(168);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=1 && _alt!=-1 ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(164); match(CMA);
						setState(165); ((ExprContext)_localctx).arith = arith(0);
						((ExprContext)_localctx).lb.add(((ExprContext)_localctx).arith);
						}
						} 
					}
					setState(170);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(172);
				_la = _input.LA(1);
				if (_la==CB) {
					{
					setState(171); ((ExprContext)_localctx).CB = match(CB);
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
				setState(176); match(IF);
				isForCtx = true;
				setState(178); match(OB);
				setState(179); ((ExprContext)_localctx).ifexpr = ifexpr();
				setState(180); match(CB);
				setState(181); match(THEN);
				setState(191);
				switch (_input.LA(1)) {
				case IF:
				case FOR:
				case RETURN:
				case LET:
				case OB:
				case LIT:
				case DOC:
				case VR:
				case ID:
				case INT:
					{
					setState(182); ((ExprContext)_localctx).a = expr();
					}
					break;
				case OFL:
					{
					{
					setState(183); ((ExprContext)_localctx).l1 = match(OFL);
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(184); ((ExprContext)_localctx).expr = expr();
						((ExprContext)_localctx).c.add(((ExprContext)_localctx).expr);
						}
						}
						setState(187); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
					setState(189); match(CFL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(205);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(193); ((ExprContext)_localctx).ELSE = match(ELSE);
					setState(203);
					switch (_input.LA(1)) {
					case IF:
					case FOR:
					case RETURN:
					case LET:
					case OB:
					case LIT:
					case DOC:
					case VR:
					case ID:
					case INT:
						{
						setState(194); ((ExprContext)_localctx).b = expr();
						}
						break;
					case OFL:
						{
						{
						setState(195); ((ExprContext)_localctx).l2 = match(OFL);
						setState(197); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(196); ((ExprContext)_localctx).expr = expr();
							((ExprContext)_localctx).d.add(((ExprContext)_localctx).expr);
							}
							}
							setState(199); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
						setState(201); match(CFL);
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
			case RETURN:
				enterOuterAlt(_localctx, 4);
				{
				setState(209); rtnstmt();
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

	public static class WherecondContext extends ParserRuleContext {
		public XQwhrcdtn retVal;
		public VarContext a;
		public DocpContext b;
		public VarpContext c;
		public Token d;
		public VarContext e;
		public DocpContext f;
		public VarpContext g;
		public Token LIT;
		public Token INT;
		public VarpContext varp(int i) {
			return getRuleContext(VarpContext.class,i);
		}
		public TerminalNode GE() { return getToken(XQParser.GE, 0); }
		public TerminalNode LT() { return getToken(XQParser.LT, 0); }
		public List<DocpContext> docp() {
			return getRuleContexts(DocpContext.class);
		}
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public TerminalNode LIT() { return getToken(XQParser.LIT, 0); }
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public DocpContext docp(int i) {
			return getRuleContext(DocpContext.class,i);
		}
		public TerminalNode GT() { return getToken(XQParser.GT, 0); }
		public List<VarpContext> varp() {
			return getRuleContexts(VarpContext.class);
		}
		public TerminalNode INT() { return getToken(XQParser.INT, 0); }
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public TerminalNode LE() { return getToken(XQParser.LE, 0); }
		public TerminalNode NE() { return getToken(XQParser.NE, 0); }
		public WherecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterWherecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitWherecond(this);
		}
	}

	public final WherecondContext wherecond() throws RecognitionException {
		WherecondContext _localctx = new WherecondContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_wherecond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(212); ((WherecondContext)_localctx).a = var();
				}
				break;

			case 2:
				{
				setState(213); ((WherecondContext)_localctx).b = docp();
				}
				break;

			case 3:
				{
				setState(214); ((WherecondContext)_localctx).c = varp();
				}
				break;
			}
			setState(217);
			((WherecondContext)_localctx).d = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
				((WherecondContext)_localctx).d = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(223);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(218); ((WherecondContext)_localctx).e = var();
				}
				break;

			case 2:
				{
				setState(219); ((WherecondContext)_localctx).f = docp();
				}
				break;

			case 3:
				{
				setState(220); ((WherecondContext)_localctx).g = varp();
				}
				break;

			case 4:
				{
				setState(221); ((WherecondContext)_localctx).LIT = match(LIT);
				}
				break;

			case 5:
				{
				setState(222); ((WherecondContext)_localctx).INT = match(INT);
				}
				break;
			}

				String value = new String();
				List<String> lit = new ArrayList<String>();	
				
				String id;
				String val;
				XQwhrcdtn.whrenum enm = XQwhrcdtn.whrenum.EQ;
				
				if(((WherecondContext)_localctx).a != null)
				{
					value = (((WherecondContext)_localctx).a!=null?_input.getText(((WherecondContext)_localctx).a.start,((WherecondContext)_localctx).a.stop):null);	
				}
				
				if(((WherecondContext)_localctx).b != null)
				{
					value = (((WherecondContext)_localctx).b!=null?_input.getText(((WherecondContext)_localctx).b.start,((WherecondContext)_localctx).b.stop):null);	
				}
				
				if(((WherecondContext)_localctx).c != null)
				{
					value = (((WherecondContext)_localctx).c!=null?_input.getText(((WherecondContext)_localctx).c.start,((WherecondContext)_localctx).c.stop):null);	
				}
				
				if(((WherecondContext)_localctx).e != null)
				{
					lit.addAll(((WherecondContext)_localctx).e.retVal);	
				}
				
				if(((WherecondContext)_localctx).f != null)
				{
					lit.addAll(((WherecondContext)_localctx).f.retVal);	
				}
				
				if(((WherecondContext)_localctx).g != null)
				{
					lit.addAll(((WherecondContext)_localctx).g.retVal);	
				}
				
				if(((WherecondContext)_localctx).LIT != null)
				{
					lit.add((((WherecondContext)_localctx).LIT!=null?((WherecondContext)_localctx).LIT.getText():null));
				}
				
				if(((WherecondContext)_localctx).INT != null)
				{
					lit.add((((WherecondContext)_localctx).INT!=null?((WherecondContext)_localctx).INT.getText():null));
				}
				
				if(lit.size() == 1)
				{
					id = value;
					val = lit.get(0);
					
					switch(((WherecondContext)_localctx).d.getType())
					{
						case GT:
						enm = XQwhrcdtn.whrenum.GT;
						break;
						case GE:
						enm = XQwhrcdtn.whrenum.GTE;
						break;
						case LT:
						enm = XQwhrcdtn.whrenum.LT;
						break;
						case LE:
						enm = XQwhrcdtn.whrenum.LTE;
						break;
						case EQ:
						enm = XQwhrcdtn.whrenum.EQ;
						break;
						case NE:
						enm = XQwhrcdtn.whrenum.NEQ;
						break;
					}
					
					if(_localctx.retVal == null)
						((WherecondContext)_localctx).retVal =  new XQwhrcdtn(id,enm,val);
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

	public static class WherestmtContext extends ParserRuleContext {
		public List<XQwhrcdtn> retVal;
		public WherecondContext a;
		public WherecondContext wherecond;
		public List<WherecondContext> b = new ArrayList<WherecondContext>();
		public TerminalNode WHERE() { return getToken(XQParser.WHERE, 0); }
		public List<TerminalNode> AND() { return getTokens(XQParser.AND); }
		public List<WherecondContext> wherecond() {
			return getRuleContexts(WherecondContext.class);
		}
		public TerminalNode AND(int i) {
			return getToken(XQParser.AND, i);
		}
		public WherecondContext wherecond(int i) {
			return getRuleContext(WherecondContext.class,i);
		}
		public WherestmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wherestmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterWherestmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitWherestmt(this);
		}
	}

	public final WherestmtContext wherestmt() throws RecognitionException {
		WherestmtContext _localctx = new WherestmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_wherestmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(227); match(WHERE);
			setState(228); ((WherestmtContext)_localctx).a = wherecond();
			setState(233);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(229); match(AND);
					setState(230); ((WherestmtContext)_localctx).wherecond = wherecond();
					((WherestmtContext)_localctx).b.add(((WherestmtContext)_localctx).wherecond);
					}
					} 
				}
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}

				if(_localctx.retVal == null)
				{
					((WherestmtContext)_localctx).retVal =  new ArrayList<XQwhrcdtn>();
				}
				
				_localctx.retVal.add(((WherestmtContext)_localctx).a.retVal);
					
				if(((WherestmtContext)_localctx).b.size() > 0)
				{
					for(WherecondContext e : ((WherestmtContext)_localctx).b)
						_localctx.retVal.add(e.retVal);
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

	public static class WhereordContext extends ParserRuleContext {
		public VarpContext varp(int i) {
			return getRuleContext(VarpContext.class,i);
		}
		public List<VarpContext> varp() {
			return getRuleContexts(VarpContext.class);
		}
		public List<DocpContext> docp() {
			return getRuleContexts(DocpContext.class);
		}
		public TerminalNode CMA(int i) {
			return getToken(XQParser.CMA, i);
		}
		public OrdContext ord() {
			return getRuleContext(OrdContext.class,0);
		}
		public List<TerminalNode> CMA() { return getTokens(XQParser.CMA); }
		public DocpContext docp(int i) {
			return getRuleContext(DocpContext.class,i);
		}
		public WhereordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterWhereord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitWhereord(this);
		}
	}

	public final WhereordContext whereord() throws RecognitionException {
		WhereordContext _localctx = new WhereordContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whereord);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238); ord();
			setState(241);
			switch (_input.LA(1)) {
			case DOC:
				{
				setState(239); docp();
				}
				break;
			case VR:
				{
				setState(240); varp();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CMA) {
				{
				{
				setState(243); match(CMA);
				setState(246);
				switch (_input.LA(1)) {
				case DOC:
					{
					setState(244); docp();
					}
					break;
				case VR:
					{
					setState(245); varp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(252);
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

	public static class ForstmtContext extends ParserRuleContext {
		public VarContext a;
		public Token AT;
		public VarContext b;
		public VarContext e;
		public DocpContext docp;
		public VarpContext varp;
		public WherestmtContext wherestmt;
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
		public WherestmtContext wherestmt() {
			return getRuleContext(WherestmtContext.class,0);
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
		enterRule(_localctx, 22, RULE_forstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(253); match(FOR);
			isForCtx = true;
			setState(255); ((ForstmtContext)_localctx).a = var();
			setState(258);
			_la = _input.LA(1);
			if (_la==AT) {
				{
				setState(256); ((ForstmtContext)_localctx).AT = match(AT);
				setState(257); ((ForstmtContext)_localctx).b = var();
				}
			}

			setState(260); match(IN);
			setState(264);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(261); ((ForstmtContext)_localctx).e = var();
				}
				break;

			case 2:
				{
				setState(262); ((ForstmtContext)_localctx).docp = docp();
				}
				break;

			case 3:
				{
				setState(263); ((ForstmtContext)_localctx).varp = varp();
				}
				break;
			}
			}
			setState(267);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(266); ((ForstmtContext)_localctx).wherestmt = wherestmt();
				}
			}

			setState(278);
			switch (_input.LA(1)) {
			case IF:
			case FOR:
			case RETURN:
			case LET:
			case OB:
			case LIT:
			case DOC:
			case VR:
			case ID:
			case INT:
				{
				setState(269); ((ForstmtContext)_localctx).c = expr();
				}
				break;
			case OFL:
				{
				{
				setState(270); ((ForstmtContext)_localctx).OFL = match(OFL);
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(271); ((ForstmtContext)_localctx).expr = expr();
					((ForstmtContext)_localctx).d.add(((ForstmtContext)_localctx).expr);
					}
					}
					setState(274); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << FOR) | (1L << RETURN) | (1L << LET) | (1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0) );
				setState(276); match(CFL);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}

				if(XQData.getInstance().isFnCtx == false)
				{
					List<String> vara = new ArrayList<String>();		
					
					if((((ForstmtContext)_localctx).docp != null) || (((ForstmtContext)_localctx).varp != null) || (((ForstmtContext)_localctx).e != null))
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
						else if(((ForstmtContext)_localctx).varp != null)
						{
							params.addAll(((ForstmtContext)_localctx).varp.retVal);
						}
						else
						{
							params.addAll(((ForstmtContext)_localctx).e.retVal);
						}
						
						for(i=0;i<params.size();i++)
						{
							String in = new String();
							int j;
							int m = 1;
							boolean cnt = true;
							
							if(((ForstmtContext)_localctx).wherestmt != null)
							{
								cnt = false;
							
								List<String> tempArry = new ArrayList<String>();
								tempArry.add(params.get(i));
								
								for(XQwhrcdtn e : ((ForstmtContext)_localctx).wherestmt.retVal)
								{
									XQPathStr pathstr = new XQPathStr();
														
									e.id = e.id.replace((((ForstmtContext)_localctx).a!=null?_input.getText(((ForstmtContext)_localctx).a.start,((ForstmtContext)_localctx).a.stop):null)+"/","");
									
									String [] s = e.id.split("/");
									
									int x;
									
									pathstr.path.add(new XQVarDesc("/root",""));
									
									for(x=0;x<s.length;x++)
										pathstr.path.add(new XQVarDesc("/"+s[x],""));
									
									List<String> rstset = XQData.getInstance().GetVarPath(tempArry,pathstr);
									
									double var1 = 0;
									double var2 = 0; 
									
									if(rstset.size() == 1)
									{
										switch(e.enm)
										{
											case EQ:
											if(rstset.get(0).equals(e.val))
											{
												cnt = true;
											}
											else
											{
												try
												{
													var1 = Double.parseDouble(rstset.get(0));
													var2 = Double.parseDouble(e.val);
												}
												catch(Exception ex)
												{
												}
												if(var1 == var2)
													cnt = true;
											}
											break;
											case NEQ:
											if(!rstset.get(0).equals(e.val))
											{
												cnt = true;
											}
											else
											{
												try
												{
													var1 = Double.parseDouble(rstset.get(0));
													var2 = Double.parseDouble(e.val);
												}
												catch(Exception ex)
												{
												}
												if(var1 != var2)
													cnt = true;
											}
											break;
											case LT:								
											try
											{
												var1 = Double.parseDouble(rstset.get(0));
												var2 = Double.parseDouble(e.val);
											}
											catch(Exception ex)
											{
											}
											if(var1 < var2)
												cnt = true;
											break;
											case GT:
											try
											{
												var1 = Double.parseDouble(rstset.get(0));
												var2 = Double.parseDouble(e.val);
											}
											catch(Exception ex)
											{
											}
											if(var1 > var2)
												cnt = true;
											break;
											case LTE:
											try
											{
												var1 = Double.parseDouble(rstset.get(0));
												var2 = Double.parseDouble(e.val);
											}
											catch(Exception ex)
											{
											}
											if(var1 <= var2)
												cnt = true;
											break;
											case GTE:
											try
											{
												var1 = Double.parseDouble(rstset.get(0));
												var2 = Double.parseDouble(e.val);
											}
											catch(Exception ex)
											{
											}
											if(var1 >= var2)
												cnt = true;
											break;
										}
									}		
								}
							}
							
							if(cnt == true)
							{
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
		int _startState = 24;
		enterRecursionRule(_localctx, RULE_arith);

		    ((ArithContext)_localctx).retVal =  new ArrayList<String>();
			
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(283); match(OB);
				setState(284); ((ArithContext)_localctx).a = arith(0);
				setState(285); match(CB);

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
				setState(301);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(288); ((ArithContext)_localctx).var = var();

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
					setState(291); ((ArithContext)_localctx).docp = docp();

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
					setState(294); ((ArithContext)_localctx).varp = varp();

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
					setState(297); ((ArithContext)_localctx).LIT = match(LIT);

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
					setState(299); ((ArithContext)_localctx).INT = match(INT);

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
				setState(305);
				switch (_input.LA(1)) {
				case VR:
					{
					setState(303); ((ArithContext)_localctx).sa = ((ArithContext)_localctx).varp = varp();
					}
					break;
				case DOC:
					{
					setState(304); ((ArithContext)_localctx).sb = ((ArithContext)_localctx).docp = docp();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(307); match(DSH);
				setState(310);
				switch (_input.LA(1)) {
				case VR:
					{
					setState(308); ((ArithContext)_localctx).sc = ((ArithContext)_localctx).varp = varp();
					}
					break;
				case DOC:
					{
					setState(309); ((ArithContext)_localctx).sd = ((ArithContext)_localctx).docp = docp();
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
				setState(314); ((ArithContext)_localctx).fname = fname();
				setState(315); match(OB);
				setState(324);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OB) | (1L << LIT) | (1L << DOC) | (1L << VR) | (1L << ID) | (1L << INT))) != 0)) {
					{
					setState(316); ((ArithContext)_localctx).fa = arith(0);
					setState(321);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==CMA) {
						{
						{
						setState(317); match(CMA);
						setState(318); ((ArithContext)_localctx).arith = arith(0);
						((ArithContext)_localctx).fb.add(((ArithContext)_localctx).arith);
						}
						}
						setState(323);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(326); match(CB);

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
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(341);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new ArithContext(_parentctx, _parentState, _p);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arith);
						setState(331);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(332);
						((ArithContext)_localctx).b = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE) | (1L << PL) | (1L << MN) | (1L << ML) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((ArithContext)_localctx).b = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(333); ((ArithContext)_localctx).c = arith(7);

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
						setState(336);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(337);
						((ArithContext)_localctx).b = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((ArithContext)_localctx).b = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(338); ((ArithContext)_localctx).c = arith(6);

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
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class VarpscondContext extends ParserRuleContext {
		public String retVal;
		public TerminalNode GE() { return getToken(XQParser.GE, 0); }
		public TerminalNode GT() { return getToken(XQParser.GT, 0); }
		public TerminalNode LT() { return getToken(XQParser.LT, 0); }
		public TerminalNode INT() { return getToken(XQParser.INT, 0); }
		public TerminalNode EQ() { return getToken(XQParser.EQ, 0); }
		public TerminalNode ID() { return getToken(XQParser.ID, 0); }
		public TerminalNode ATT() { return getToken(XQParser.ATT, 0); }
		public TerminalNode LE() { return getToken(XQParser.LE, 0); }
		public TerminalNode LIT() { return getToken(XQParser.LIT, 0); }
		public TerminalNode NE() { return getToken(XQParser.NE, 0); }
		public VarpscondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varpscond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterVarpscond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitVarpscond(this);
		}
	}

	public final VarpscondContext varpscond() throws RecognitionException {
		VarpscondContext _localctx = new VarpscondContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varpscond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(346); match(ID);
				}
				break;
			case ATT:
				{
				{
				setState(347); match(ATT);
				setState(348); match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(351);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ) | (1L << NE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(352);
			_la = _input.LA(1);
			if ( !(_la==LIT || _la==INT) ) {
			_errHandler.recoverInline(this);
			}
			consume();

					((VarpscondContext)_localctx).retVal =  _input.getText(_localctx.start, _input.LT(-1));
				
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

	public static class AndorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(XQParser.AND, 0); }
		public TerminalNode OR() { return getToken(XQParser.OR, 0); }
		public AndorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterAndor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitAndor(this);
		}
	}

	public final AndorContext andor() throws RecognitionException {
		AndorContext _localctx = new AndorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_andor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class VarpcondContext extends ParserRuleContext {
		public List<String> retVal;
		public VarpscondContext a;
		public AndorContext andor;
		public List<AndorContext> b = new ArrayList<AndorContext>();
		public VarpscondContext varpscond;
		public List<VarpscondContext> c = new ArrayList<VarpscondContext>();
		public VarpscondContext varpscond(int i) {
			return getRuleContext(VarpscondContext.class,i);
		}
		public List<VarpscondContext> varpscond() {
			return getRuleContexts(VarpscondContext.class);
		}
		public TerminalNode SBO() { return getToken(XQParser.SBO, 0); }
		public TerminalNode SBC() { return getToken(XQParser.SBC, 0); }
		public AndorContext andor(int i) {
			return getRuleContext(AndorContext.class,i);
		}
		public List<AndorContext> andor() {
			return getRuleContexts(AndorContext.class);
		}
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
		enterRule(_localctx, 30, RULE_varpcond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357); match(SBO);
			setState(358); ((VarpcondContext)_localctx).a = varpscond();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(359); ((VarpcondContext)_localctx).andor = andor();
				((VarpcondContext)_localctx).b.add(((VarpcondContext)_localctx).andor);
				setState(360); ((VarpcondContext)_localctx).varpscond = varpscond();
				((VarpcondContext)_localctx).c.add(((VarpcondContext)_localctx).varpscond);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367); match(SBC);

					
					if(_localctx.retVal == null)
						((VarpcondContext)_localctx).retVal =  new ArrayList<String>();
						
					_localctx.retVal.add(((VarpcondContext)_localctx).a.retVal);
					
					int i=0;
					
					for(VarpscondContext e :((VarpcondContext)_localctx).c)
					{			
						if(((VarpcondContext)_localctx).b.get(i).getText().equals("and"))
							_localctx.retVal.add("+"+e.retVal);
						else
							_localctx.retVal.add("-"+e.retVal);
							
						i++;
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

	public static class VarpexpraContext extends ParserRuleContext {
		public String retVal;
		public TerminalNode ATT(int i) {
			return getToken(XQParser.ATT, i);
		}
		public TerminalNode DPATH() { return getToken(XQParser.DPATH, 0); }
		public TerminalNode ID(int i) {
			return getToken(XQParser.ID, i);
		}
		public List<TerminalNode> ID() { return getTokens(XQParser.ID); }
		public TerminalNode PATH() { return getToken(XQParser.PATH, 0); }
		public List<TerminalNode> ATT() { return getTokens(XQParser.ATT); }
		public VarpexpraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varpexpra; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterVarpexpra(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitVarpexpra(this);
		}
	}

	public final VarpexpraContext varpexpra() throws RecognitionException {
		VarpexpraContext _localctx = new VarpexpraContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varpexpra);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==PATH || _la==DPATH) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			{
			setState(374);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(371); match(ID);
				}
				break;
			case ATT:
				{
				{
				setState(372); match(ATT);
				setState(373); match(ID);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(376); match(ATT);
				setState(377); match(ID);
				}
				break;
			}
			}

					((VarpexpraContext)_localctx).retVal =  _input.getText(_localctx.start, _input.LT(-1));
				
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
		public XQPathStr retVal;
		public VarpexpraContext varpexpra;
		public VarpcondContext varpcond;
		public VarpexpraContext varpexpra() {
			return getRuleContext(VarpexpraContext.class,0);
		}
		public VarpcondContext varpcond() {
			return getRuleContext(VarpcondContext.class,0);
		}
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
		enterRule(_localctx, 34, RULE_varpexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382); ((VarpexprContext)_localctx).varpexpra = varpexpra();
			setState(384);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(383); ((VarpexprContext)_localctx).varpcond = varpcond();
				}
				break;
			}

					if(_localctx.retVal == null)
						((VarpexprContext)_localctx).retVal =  new XQPathStr();
						
					_localctx.retVal.path.add(new XQVarDesc("/root",""));
					
					if(((VarpexprContext)_localctx).varpcond != null)
					{
						boolean cont = false;
						
						_localctx.retVal.path.add(new XQVarDesc(((VarpexprContext)_localctx).varpexpra.retVal,((VarpexprContext)_localctx).varpcond.retVal.get(0)));
						
						for(String e :((VarpexprContext)_localctx).varpcond.retVal)
						{
							if(cont == true)
							{
								String [] arr = e.split("\\+");
								
								if(arr.length >1)
									_localctx.retVal.andpath.add(new XQVarDesc("/root",arr[1]));
									
								arr = e.split("-");
								
								if(arr.length >1)
									_localctx.retVal.orpath.add(new XQVarDesc(((VarpexprContext)_localctx).varpexpra.retVal,arr[1]));
							}
							else
							    cont = true;
						}
					}
					else
						_localctx.retVal.path.add(new XQVarDesc(((VarpexprContext)_localctx).varpexpra.retVal,""));
				
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
		enterRule(_localctx, 36, RULE_varp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(388); ((VarpContext)_localctx).var = var();
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(389); ((VarpContext)_localctx).varpexpr = varpexpr();
					((VarpContext)_localctx).a.add(((VarpContext)_localctx).varpexpr);
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}

					
					if(_localctx.retVal == null)
						((VarpContext)_localctx).retVal =  new ArrayList<String>();
						
					List<String>tempArry = new ArrayList<String>();
					
					tempArry.addAll(XQData.getInstance().GetVarPath(((VarpContext)_localctx).var.retVal,((VarpContext)_localctx).a.get(0).retVal));
					
					((VarpContext)_localctx).a.remove(0);
					
					for(VarpexprContext e: ((VarpContext)_localctx).a)
					{
						List<String> arr = XQData.getInstance().GetVarPath(tempArry,e.retVal);
						tempArry.clear();
						tempArry.addAll(arr);
					}
					
					_localctx.retVal.addAll(tempArry);
				
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
		enterRule(_localctx, 38, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397); match(VR);
			setState(398); match(ID);

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

	public static class DocexpContext extends ParserRuleContext {
		public List<String> retVal;
		public VarpexpraContext varpexpra;
		public VarpcondContext varpcond;
		public VarpexpraContext varpexpra() {
			return getRuleContext(VarpexpraContext.class,0);
		}
		public VarpcondContext varpcond() {
			return getRuleContext(VarpcondContext.class,0);
		}
		public DocexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_docexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).enterDocexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XQListener ) ((XQListener)listener).exitDocexp(this);
		}
	}

	public final DocexpContext docexp() throws RecognitionException {
		DocexpContext _localctx = new DocexpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_docexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401); ((DocexpContext)_localctx).varpexpra = varpexpra();
			setState(403);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(402); ((DocexpContext)_localctx).varpcond = varpcond();
				}
				break;
			}

					if(_localctx.retVal == null)
						((DocexpContext)_localctx).retVal =  new ArrayList<String>();
					
					_localctx.retVal.add(((DocexpContext)_localctx).varpexpra.retVal);
					
					if(((DocexpContext)_localctx).varpcond !=null)
					{
						_localctx.retVal.addAll(((DocexpContext)_localctx).varpcond.retVal);
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

	public static class DocpContext extends ParserRuleContext {
		public List<String> retVal;
		public Token DOC;
		public DocexpContext docexp;
		public List<DocexpContext> a = new ArrayList<DocexpContext>();
		public DocexpContext docexp(int i) {
			return getRuleContext(DocexpContext.class,i);
		}
		public List<DocexpContext> docexp() {
			return getRuleContexts(DocexpContext.class);
		}
		public TerminalNode DOC() { return getToken(XQParser.DOC, 0); }
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
		enterRule(_localctx, 42, RULE_docp);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(407); ((DocpContext)_localctx).DOC = match(DOC);
			setState(411);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(408); ((DocpContext)_localctx).docexp = docexp();
					((DocpContext)_localctx).a.add(((DocpContext)_localctx).docexp);
					}
					} 
				}
				setState(413);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
				
					boolean locked = false;
					
					if(_localctx.retVal == null)
						((DocpContext)_localctx).retVal =  new ArrayList<String>();
					
					String xp = (((DocpContext)_localctx).DOC!=null?((DocpContext)_localctx).DOC.getText():null);
					
					for(DocexpContext e :((DocpContext)_localctx).a)
					{
						xp += e.retVal.get(0);
						
						if(e.retVal.size() > 1)
						{
							int i;
							
							if(locked == false)
								//if(XQData.getInstance().LockTable() == true)
									locked = true;
							
							System.out.println("condition called :"+e.retVal);
							
							for(i=1;i<e.retVal.size();i++)
							{
								XQData.getInstance().XPcond(xp,e.retVal.get(i));
							}
						}
					}
					
					String [] s = xp.split("@");
					
					if(s.length == 1)
					{			
						_localctx.retVal.addAll(XQData.getInstance().GetXPath(xp));
					}
					else
					{
						int l = s[0].length();
									
						if(s[0].substring(l-1,l).equals("/"))
						{
							String var1 = s[0].substring(0,l-1);
							_localctx.retVal.addAll(XQData.getInstance().GetXPathat(var1,s[1]));
						}
						else
							_localctx.retVal.addAll(XQData.getInstance().GetXPathat(s[0],s[1]));
					}
					
					if(locked == true)
						XQData.getInstance().UnLockTable();
				
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
		enterRule(_localctx, 44, RULE_htmid);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(416); ((HtmidContext)_localctx).a = match(HID);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=1 && _alt!=-1 ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(417); ((HtmidContext)_localctx).HID = match(HID);
					((HtmidContext)_localctx).b.add(((HtmidContext)_localctx).HID);
					setState(418); match(HEQ);
					setState(419); ((HtmidContext)_localctx).HLIT = match(HLIT);
					((HtmidContext)_localctx).c.add(((HtmidContext)_localctx).HLIT);
					}
					} 
				}
				setState(424);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		enterRule(_localctx, 46, RULE_ord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427); match(ORDER);
			setState(428); match(BY);
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
		enterRule(_localctx, 48, RULE_fname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				{
				setState(430); match(ID);
				setState(431); match(CL);
				}
				break;
			}
			setState(434); match(ID);
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
		enterRule(_localctx, 50, RULE_dtype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436); match(ID);
			setState(437); match(CL);
			setState(438); match(ID);
			setState(439); match(QM);
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
		case 12: return arith_sempred((ArithContext)_localctx, predIndex);
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
		"\2\3>\u01bc\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4"+
		"\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20"+
		"\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27"+
		"\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\3\2\7\28\n\2\f\2\16\2;\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3P\n\3\3\4\3\4\6\4T\n\4\r\4\16\4U\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5`\n\5\3\5\3\5\3\5\3\5\5\5f\n\5\7\5h\n\5\f\5\16\5k\13\5\5\5m\n"+
		"\5\3\5\3\5\3\5\5\5r\n\5\3\5\3\5\6\5v\n\5\r\5\16\5w\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\5\6\u0082\n\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008a\n\6\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\b\3\b\6\b\u0094\n\b\r\b\16\b\u0095\3\b\3\b\3\t\3"+
		"\t\5\t\u009c\n\t\3\t\3\t\3\t\5\t\u00a1\n\t\3\t\5\t\u00a4\n\t\3\t\3\t\3"+
		"\t\7\t\u00a9\n\t\f\t\16\t\u00ac\13\t\3\t\5\t\u00af\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u00bc\n\t\r\t\16\t\u00bd\3\t\3\t\5\t"+
		"\u00c2\n\t\3\t\3\t\3\t\3\t\6\t\u00c8\n\t\r\t\16\t\u00c9\3\t\3\t\5\t\u00ce"+
		"\n\t\5\t\u00d0\n\t\3\t\3\t\3\t\5\t\u00d5\n\t\3\n\3\n\3\n\5\n\u00da\n\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e2\n\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13"+
		"\u00ea\n\13\f\13\16\13\u00ed\13\13\3\13\3\13\3\f\3\f\3\f\5\f\u00f4\n\f"+
		"\3\f\3\f\3\f\5\f\u00f9\n\f\7\f\u00fb\n\f\f\f\16\f\u00fe\13\f\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u0105\n\r\3\r\3\r\3\r\3\r\5\r\u010b\n\r\3\r\5\r\u010e\n"+
		"\r\3\r\3\r\3\r\6\r\u0113\n\r\r\r\16\r\u0114\3\r\3\r\5\r\u0119\n\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0130\n\16\3\16\3\16\5\16\u0134\n"+
		"\16\3\16\3\16\3\16\5\16\u0139\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u0142\n\16\f\16\16\16\u0145\13\16\5\16\u0147\n\16\3\16\3\16\3\16"+
		"\5\16\u014c\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16"+
		"\u0158\n\16\f\16\16\16\u015b\13\16\3\17\3\17\3\17\5\17\u0160\n\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\7\21\u016d\n\21\f\21"+
		"\16\21\u0170\13\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u0179\n\22"+
		"\3\22\3\22\5\22\u017d\n\22\3\22\3\22\3\23\3\23\5\23\u0183\n\23\3\23\3"+
		"\23\3\24\3\24\7\24\u0189\n\24\f\24\16\24\u018c\13\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\5\26\u0196\n\26\3\26\3\26\3\27\3\27\7\27\u019c"+
		"\n\27\f\27\16\27\u019f\13\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30\u01a7"+
		"\n\30\f\30\16\30\u01aa\13\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\5\32\u01b3"+
		"\n\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\7\u00aa\u00eb\u018a\u019d"+
		"\u01a8\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\2\n"+
		"\3\36#\3\36#\6\36#-/\62\62\64\64\4\35\35\63\63\3\36#\4\66\66<<\4\35\35"+
		"\63\63\3\25\26\u01eb\29\3\2\2\2\4O\3\2\2\2\6S\3\2\2\2\bW\3\2\2\2\n\u0081"+
		"\3\2\2\2\f\u008d\3\2\2\2\16\u0091\3\2\2\2\20\u00d4\3\2\2\2\22\u00d9\3"+
		"\2\2\2\24\u00e5\3\2\2\2\26\u00f0\3\2\2\2\30\u00ff\3\2\2\2\32\u014b\3\2"+
		"\2\2\34\u015f\3\2\2\2\36\u0165\3\2\2\2 \u0167\3\2\2\2\"\u0174\3\2\2\2"+
		"$\u0180\3\2\2\2&\u0186\3\2\2\2(\u018f\3\2\2\2*\u0193\3\2\2\2,\u0199\3"+
		"\2\2\2.\u01a2\3\2\2\2\60\u01ad\3\2\2\2\62\u01b2\3\2\2\2\64\u01b6\3\2\2"+
		"\2\668\5\4\3\2\67\66\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3\2\2"+
		"\2;9\3\2\2\2<=\7\6\2\2=>\5\6\4\2>?\7*\2\2?P\3\2\2\2@A\7\3\2\2AB\7\5\2"+
		"\2BC\7\t\2\2CP\7\4\2\2DE\7\3\2\2EF\5.\30\2FH\7\4\2\2GI\7\n\2\2HG\3\2\2"+
		"\2HI\3\2\2\2IP\3\2\2\2JK\7\3\2\2KL\5.\30\2LM\7\5\2\2MN\7\4\2\2NP\3\2\2"+
		"\2O<\3\2\2\2O@\3\2\2\2OD\3\2\2\2OJ\3\2\2\2P\5\3\2\2\2QT\5\20\t\2RT\5\b"+
		"\5\2SQ\3\2\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2V\7\3\2\2\2WX\7"+
		"\22\2\2XY\7\23\2\2YZ\b\5\1\2Z[\5\62\32\2[l\7&\2\2\\_\5\32\16\2]^\7\24"+
		"\2\2^`\5\64\33\2_]\3\2\2\2_`\3\2\2\2`i\3\2\2\2ab\7+\2\2be\5\32\16\2cd"+
		"\7\24\2\2df\5\64\33\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ga\3\2\2\2hk\3\2\2"+
		"\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l\\\3\2\2\2lm\3\2\2\2mn\3\2"+
		"\2\2nq\7\'\2\2op\7\24\2\2pr\5\64\33\2qo\3\2\2\2qr\3\2\2\2rs\3\2\2\2su"+
		"\7)\2\2tv\5\20\t\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy\3\2\2\2y"+
		"z\7*\2\2z{\b\5\1\2{\t\3\2\2\2|\u0082\5(\25\2}\u0082\5,\27\2~\u0082\5&"+
		"\24\2\177\u0082\7\66\2\2\u0080\u0082\7<\2\2\u0081|\3\2\2\2\u0081}\3\2"+
		"\2\2\u0081~\3\2\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0089\t\2\2\2\u0084\u008a\5(\25\2\u0085\u008a\5,\27\2\u0086"+
		"\u008a\5&\24\2\u0087\u008a\7\66\2\2\u0088\u008a\7<\2\2\u0089\u0084\3\2"+
		"\2\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\6\1\2\u008c\13\3\2\2"+
		"\2\u008d\u008e\7\33\2\2\u008e\u008f\5\32\16\2\u008f\u0090\b\7\1\2\u0090"+
		"\r\3\2\2\2\u0091\u0093\7\6\2\2\u0092\u0094\5\20\t\2\u0093\u0092\3\2\2"+
		"\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u0098\7*\2\2\u0098\17\3\2\2\2\u0099\u00d5\5\30\r\2\u009a"+
		"\u009c\7\34\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3"+
		"\2\2\2\u009d\u009e\5(\25\2\u009e\u009f\7$\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009b\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a4\7&"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00aa\5\32\16\2\u00a6\u00a7\7+\2\2\u00a7\u00a9\5\32\16\2\u00a8\u00a6"+
		"\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00ab\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00af\7\'\2\2\u00ae\u00ad\3\2"+
		"\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\t\1\2\u00b1"+
		"\u00d5\3\2\2\2\u00b2\u00b3\7\r\2\2\u00b3\u00b4\b\t\1\2\u00b4\u00b5\7&"+
		"\2\2\u00b5\u00b6\5\n\6\2\u00b6\u00b7\7\'\2\2\u00b7\u00c1\7\17\2\2\u00b8"+
		"\u00c2\5\20\t\2\u00b9\u00bb\7)\2\2\u00ba\u00bc\5\20\t\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00bf\3\2\2\2\u00bf\u00c0\7*\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00b8\3\2"+
		"\2\2\u00c1\u00b9\3\2\2\2\u00c2\u00cf\3\2\2\2\u00c3\u00cd\7\16\2\2\u00c4"+
		"\u00ce\5\20\t\2\u00c5\u00c7\7)\2\2\u00c6\u00c8\5\20\t\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc\u00ce\3\2\2\2\u00cd\u00c4\3\2"+
		"\2\2\u00cd\u00c5\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00c3\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b\t\1\2\u00d2\u00d5\3\2"+
		"\2\2\u00d3\u00d5\5\f\7\2\u00d4\u0099\3\2\2\2\u00d4\u00a0\3\2\2\2\u00d4"+
		"\u00b2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5\21\3\2\2\2\u00d6\u00da\5(\25"+
		"\2\u00d7\u00da\5,\27\2\u00d8\u00da\5&\24\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00e1\t\3\2\2\u00dc"+
		"\u00e2\5(\25\2\u00dd\u00e2\5,\27\2\u00de\u00e2\5&\24\2\u00df\u00e2\7\66"+
		"\2\2\u00e0\u00e2\7<\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e1"+
		"\u00de\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2"+
		"\2\2\u00e3\u00e4\b\n\1\2\u00e4\23\3\2\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00eb"+
		"\5\22\n\2\u00e7\u00e8\7\35\2\2\u00e8\u00ea\5\22\n\2\u00e9\u00e7\3\2\2"+
		"\2\u00ea\u00ed\3\2\2\2\u00eb\u00ec\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee"+
		"\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\b\13\1\2\u00ef\25\3\2\2\2\u00f0"+
		"\u00f3\5\60\31\2\u00f1\u00f4\5,\27\2\u00f2\u00f4\5&\24\2\u00f3\u00f1\3"+
		"\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00fc\3\2\2\2\u00f5\u00f8\7+\2\2\u00f6"+
		"\u00f9\5,\27\2\u00f7\u00f9\5&\24\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2"+
		"\2\2\u00f9\u00fb\3\2\2\2\u00fa\u00f5\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc"+
		"\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\27\3\2\2\2\u00fe\u00fc\3\2\2"+
		"\2\u00ff\u0100\7\20\2\2\u0100\u0101\b\r\1\2\u0101\u0104\5(\25\2\u0102"+
		"\u0103\7\31\2\2\u0103\u0105\5(\25\2\u0104\u0102\3\2\2\2\u0104\u0105\3"+
		"\2\2\2\u0105\u0106\3\2\2\2\u0106\u010a\7\21\2\2\u0107\u010b\5(\25\2\u0108"+
		"\u010b\5,\27\2\u0109\u010b\5&\24\2\u010a\u0107\3\2\2\2\u010a\u0108\3\2"+
		"\2\2\u010a\u0109\3\2\2\2\u010b\u010d\3\2\2\2\u010c\u010e\5\24\13\2\u010d"+
		"\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0118\3\2\2\2\u010f\u0119\5\20"+
		"\t\2\u0110\u0112\7)\2\2\u0111\u0113\5\20\t\2\u0112\u0111\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2"+
		"\2\2\u0116\u0117\7*\2\2\u0117\u0119\3\2\2\2\u0118\u010f\3\2\2\2\u0118"+
		"\u0110\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\b\r\1\2\u011b\31\3\2\2"+
		"\2\u011c\u011d\b\16\1\2\u011d\u011e\7&\2\2\u011e\u011f\5\32\16\2\u011f"+
		"\u0120\7\'\2\2\u0120\u0121\b\16\1\2\u0121\u014c\3\2\2\2\u0122\u0123\5"+
		"(\25\2\u0123\u0124\b\16\1\2\u0124\u0130\3\2\2\2\u0125\u0126\5,\27\2\u0126"+
		"\u0127\b\16\1\2\u0127\u0130\3\2\2\2\u0128\u0129\5&\24\2\u0129\u012a\b"+
		"\16\1\2\u012a\u0130\3\2\2\2\u012b\u012c\7\66\2\2\u012c\u0130\b\16\1\2"+
		"\u012d\u012e\7<\2\2\u012e\u0130\b\16\1\2\u012f\u0122\3\2\2\2\u012f\u0125"+
		"\3\2\2\2\u012f\u0128\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u014c\3\2\2\2\u0131\u0134\5&\24\2\u0132\u0134\5,\27\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0138\7\65\2\2\u0136"+
		"\u0139\5&\24\2\u0137\u0139\5,\27\2\u0138\u0136\3\2\2\2\u0138\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013b\b\16\1\2\u013b\u014c\3\2\2\2\u013c"+
		"\u013d\5\62\32\2\u013d\u0146\7&\2\2\u013e\u0143\5\32\16\2\u013f\u0140"+
		"\7+\2\2\u0140\u0142\5\32\16\2\u0141\u013f\3\2\2\2\u0142\u0145\3\2\2\2"+
		"\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143"+
		"\3\2\2\2\u0146\u013e\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0149\7\'\2\2\u0149\u014a\b\16\1\2\u014a\u014c\3\2\2\2\u014b\u011c\3"+
		"\2\2\2\u014b\u012f\3\2\2\2\u014b\u0133\3\2\2\2\u014b\u013c\3\2\2\2\u014c"+
		"\u0159\3\2\2\2\u014d\u014e\6\16\2\3\u014e\u014f\t\4\2\2\u014f\u0150\5"+
		"\32\16\2\u0150\u0151\b\16\1\2\u0151\u0158\3\2\2\2\u0152\u0153\6\16\3\3"+
		"\u0153\u0154\t\5\2\2\u0154\u0155\5\32\16\2\u0155\u0156\b\16\1\2\u0156"+
		"\u0158\3\2\2\2\u0157\u014d\3\2\2\2\u0157\u0152\3\2\2\2\u0158\u015b\3\2"+
		"\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\33\3\2\2\2\u015b\u0159"+
		"\3\2\2\2\u015c\u0160\7;\2\2\u015d\u015e\7(\2\2\u015e\u0160\7;\2\2\u015f"+
		"\u015c\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0162\t\6"+
		"\2\2\u0162\u0163\t\7\2\2\u0163\u0164\b\17\1\2\u0164\35\3\2\2\2\u0165\u0166"+
		"\t\b\2\2\u0166\37\3\2\2\2\u0167\u0168\7\60\2\2\u0168\u016e\5\34\17\2\u0169"+
		"\u016a\5\36\20\2\u016a\u016b\5\34\17\2\u016b\u016d\3\2\2\2\u016c\u0169"+
		"\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\61\2\2\u0172\u0173\b"+
		"\21\1\2\u0173!\3\2\2\2\u0174\u0178\t\t\2\2\u0175\u0179\7;\2\2\u0176\u0177"+
		"\7(\2\2\u0177\u0179\7;\2\2\u0178\u0175\3\2\2\2\u0178\u0176\3\2\2\2\u0179"+
		"\u017c\3\2\2\2\u017a\u017b\7(\2\2\u017b\u017d\7;\2\2\u017c\u017a\3\2\2"+
		"\2\u017c\u017d\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017f\b\22\1\2\u017f"+
		"#\3\2\2\2\u0180\u0182\5\"\22\2\u0181\u0183\5 \21\2\u0182\u0181\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\b\23\1\2\u0185%\3"+
		"\2\2\2\u0186\u018a\5(\25\2\u0187\u0189\5$\23\2\u0188\u0187\3\2\2\2\u0189"+
		"\u018c\3\2\2\2\u018a\u018b\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018d\3\2"+
		"\2\2\u018c\u018a\3\2\2\2\u018d\u018e\b\24\1\2\u018e\'\3\2\2\2\u018f\u0190"+
		"\7:\2\2\u0190\u0191\7;\2\2\u0191\u0192\b\25\1\2\u0192)\3\2\2\2\u0193\u0195"+
		"\5\"\22\2\u0194\u0196\5 \21\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2"+
		"\u0196\u0197\3\2\2\2\u0197\u0198\b\26\1\2\u0198+\3\2\2\2\u0199\u019d\7"+
		"8\2\2\u019a\u019c\5*\26\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u01a0\u01a1\b\27\1\2\u01a1-\3\2\2\2\u01a2\u01a8\7\t\2\2\u01a3\u01a4"+
		"\7\t\2\2\u01a4\u01a5\7\13\2\2\u01a5\u01a7\7\f\2\2\u01a6\u01a3\3\2\2\2"+
		"\u01a7\u01aa\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ab"+
		"\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\b\30\1\2\u01ac/\3\2\2\2\u01ad"+
		"\u01ae\7\27\2\2\u01ae\u01af\7\30\2\2\u01af\61\3\2\2\2\u01b0\u01b1\7;\2"+
		"\2\u01b1\u01b3\7%\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4"+
		"\3\2\2\2\u01b4\u01b5\7;\2\2\u01b5\63\3\2\2\2\u01b6\u01b7\7;\2\2\u01b7"+
		"\u01b8\7%\2\2\u01b8\u01b9\7;\2\2\u01b9\u01ba\7,\2\2\u01ba\65\3\2\2\28"+
		"9HOSU_eilqw\u0081\u0089\u0095\u009b\u00a0\u00a3\u00aa\u00ae\u00bd\u00c1"+
		"\u00c9\u00cd\u00cf\u00d4\u00d9\u00e1\u00eb\u00f3\u00f8\u00fc\u0104\u010a"+
		"\u010d\u0114\u0118\u012f\u0133\u0138\u0143\u0146\u014b\u0157\u0159\u015f"+
		"\u016e\u0178\u017c\u0182\u018a\u0195\u019d\u01a8\u01b2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}