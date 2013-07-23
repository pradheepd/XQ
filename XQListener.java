// Generated from XQ.g4 by ANTLR 4.0

  import java.util.*;
  import java.text.*;
  import org.antlr.v4.runtime.TokenStream;
  import org.antlr.v4.runtime.misc.Interval;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface XQListener extends ParseTreeListener {
	void enterVarpexpr(XQParser.VarpexprContext ctx);
	void exitVarpexpr(XQParser.VarpexprContext ctx);

	void enterArith(XQParser.ArithContext ctx);
	void exitArith(XQParser.ArithContext ctx);

	void enterForstmt(XQParser.ForstmtContext ctx);
	void exitForstmt(XQParser.ForstmtContext ctx);

	void enterVarpscond(XQParser.VarpscondContext ctx);
	void exitVarpscond(XQParser.VarpscondContext ctx);

	void enterHtmt(XQParser.HtmtContext ctx);
	void exitHtmt(XQParser.HtmtContext ctx);

	void enterIfexpr(XQParser.IfexprContext ctx);
	void exitIfexpr(XQParser.IfexprContext ctx);

	void enterDocp(XQParser.DocpContext ctx);
	void exitDocp(XQParser.DocpContext ctx);

	void enterVar(XQParser.VarContext ctx);
	void exitVar(XQParser.VarContext ctx);

	void enterDocexp(XQParser.DocexpContext ctx);
	void exitDocexp(XQParser.DocexpContext ctx);

	void enterVarpcond(XQParser.VarpcondContext ctx);
	void exitVarpcond(XQParser.VarpcondContext ctx);

	void enterStmt(XQParser.StmtContext ctx);
	void exitStmt(XQParser.StmtContext ctx);

	void enterOrd(XQParser.OrdContext ctx);
	void exitOrd(XQParser.OrdContext ctx);

	void enterExpr(XQParser.ExprContext ctx);
	void exitExpr(XQParser.ExprContext ctx);

	void enterHtmid(XQParser.HtmidContext ctx);
	void exitHtmid(XQParser.HtmidContext ctx);

	void enterProg(XQParser.ProgContext ctx);
	void exitProg(XQParser.ProgContext ctx);

	void enterVarp(XQParser.VarpContext ctx);
	void exitVarp(XQParser.VarpContext ctx);

	void enterVarpexpra(XQParser.VarpexpraContext ctx);
	void exitVarpexpra(XQParser.VarpexpraContext ctx);

	void enterRtnstmt(XQParser.RtnstmtContext ctx);
	void exitRtnstmt(XQParser.RtnstmtContext ctx);

	void enterDtype(XQParser.DtypeContext ctx);
	void exitDtype(XQParser.DtypeContext ctx);

	void enterFunc(XQParser.FuncContext ctx);
	void exitFunc(XQParser.FuncContext ctx);

	void enterFname(XQParser.FnameContext ctx);
	void exitFname(XQParser.FnameContext ctx);

	void enterExprp(XQParser.ExprpContext ctx);
	void exitExprp(XQParser.ExprpContext ctx);

	void enterAndor(XQParser.AndorContext ctx);
	void exitAndor(XQParser.AndorContext ctx);
}