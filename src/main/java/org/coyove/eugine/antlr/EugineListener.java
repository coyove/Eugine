// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;

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
	 * Enter a parse tree produced by {@link EugineParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(EugineParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(EugineParser.BlockContext ctx);
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
	 * Enter a parse tree produced by {@link EugineParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(EugineParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(EugineParser.ImportStmtContext ctx);
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
	 * Enter a parse tree produced by {@link EugineParser#definitionsList}.
	 * @param ctx the parse tree
	 */
	void enterDefinitionsList(EugineParser.DefinitionsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#definitionsList}.
	 * @param ctx the parse tree
	 */
	void exitDefinitionsList(EugineParser.DefinitionsListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void enterDefineStmt(EugineParser.DefineStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#defineStmt}.
	 * @param ctx the parse tree
	 */
	void exitDefineStmt(EugineParser.DefineStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void enterCallStmt(EugineParser.CallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#callStmt}.
	 * @param ctx the parse tree
	 */
	void exitCallStmt(EugineParser.CallStmtContext ctx);
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