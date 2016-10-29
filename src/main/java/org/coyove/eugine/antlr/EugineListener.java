// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EugineParser}.
 */
public interface EugineListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EugineParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(EugineParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(EugineParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EugineParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EugineParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(EugineParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(EugineParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EugineParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EugineParser.ExprContext ctx);
}