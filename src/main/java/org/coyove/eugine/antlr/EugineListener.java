// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import java.util.HashMap;

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
	 * Enter a parse tree produced by {@link EugineParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(EugineParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(EugineParser.CodeContext ctx);
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
	 * Enter a parse tree produced by {@link EugineParser#enterStmt}.
	 * @param ctx the parse tree
	 */
	void enterEnterStmt(EugineParser.EnterStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#enterStmt}.
	 * @param ctx the parse tree
	 */
	void exitEnterStmt(EugineParser.EnterStmtContext ctx);
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
	 * Enter a parse tree produced by {@link EugineParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsList(EugineParser.ArgumentsListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#argumentsList}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsList(EugineParser.ArgumentsListContext ctx);
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
	 * Enter a parse tree produced by {@link EugineParser#lambdaStmt}.
	 * @param ctx the parse tree
	 */
	void enterLambdaStmt(EugineParser.LambdaStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#lambdaStmt}.
	 * @param ctx the parse tree
	 */
	void exitLambdaStmt(EugineParser.LambdaStmtContext ctx);
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
	 * Enter a parse tree produced by {@link EugineParser#dict}.
	 * @param ctx the parse tree
	 */
	void enterDict(EugineParser.DictContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#dict}.
	 * @param ctx the parse tree
	 */
	void exitDict(EugineParser.DictContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(EugineParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(EugineParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(EugineParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(EugineParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EugineParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EugineParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void enterTopExpr(EugineParser.TopExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#topExpr}.
	 * @param ctx the parse tree
	 */
	void exitTopExpr(EugineParser.TopExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(EugineParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(EugineParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpr(EugineParser.MultiplyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#multiplyExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpr(EugineParser.MultiplyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(EugineParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#addExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(EugineParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(EugineParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#compareExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(EugineParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EugineParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(EugineParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EugineParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(EugineParser.LogicExprContext ctx);
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