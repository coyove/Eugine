// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EugineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, VAR=8, Integer=9, 
		Double=10, NEWLINE=11, WS=12, SEMI=13, ID=14, LETTER=15, DIGIT=16, StringLiteral=17;
	public static final int
		RULE_prog = 0, RULE_stmt = 1, RULE_declareStmt = 2, RULE_expr = 3;
	public static final String[] ruleNames = {
		"prog", "stmt", "declareStmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'var'", null, 
		null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MUL", "DIV", "ADD", "SUB", "VAR", "Integer", 
		"Double", "NEWLINE", "WS", "SEMI", "ID", "LETTER", "DIGIT", "StringLiteral"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Eugine.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	public EugineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public SExpression v;
		public StmtContext stmt;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(11); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(8);
				((ProgContext)_localctx).stmt = stmt();
				 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).stmt.v; 
				}
				}
				setState(13); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << VAR) | (1L << Integer) | (1L << Double) | (1L << SEMI) | (1L << ID) | (1L << StringLiteral))) != 0) );
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
		public SExpression v;
		public ExprContext expr;
		public DeclareStmtContext declareStmt;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(EugineParser.SEMI, 0); }
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitStmt(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stmt);
		try {
			setState(24);
			switch (_input.LA(1)) {
			case T__1:
			case Integer:
			case Double:
			case ID:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(15);
				((StmtContext)_localctx).expr = expr();
				setState(16);
				match(SEMI);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				((StmtContext)_localctx).declareStmt = declareStmt();
				setState(20);
				match(SEMI);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
				match(SEMI);
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

	public static class DeclareStmtContext extends ParserRuleContext {
		public SExpression v;
		public Token ID;
		public ExprContext expr;
		public TerminalNode VAR() { return getToken(EugineParser.VAR, 0); }
		public TerminalNode ID() { return getToken(EugineParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterDeclareStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitDeclareStmt(this);
		}
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(VAR);
			setState(27);
			((DeclareStmtContext)_localctx).ID = match(ID);
			setState(28);
			match(T__0);
			setState(29);
			((DeclareStmtContext)_localctx).expr = expr();

			        ((DeclareStmtContext)_localctx).v =  new SESet(new SString((((DeclareStmtContext)_localctx).ID!=null?((DeclareStmtContext)_localctx).ID.getText():null)), ((DeclareStmtContext)_localctx).expr.v, 
			            SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
			    
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
		public SExpression v;
		public Token ID;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(EugineParser.ID, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode Integer() { return getToken(EugineParser.Integer, 0); }
		public TerminalNode Double() { return getToken(EugineParser.Double, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expr);
		try {
			setState(45);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				((ExprContext)_localctx).ID = match(ID);
				 ((ExprContext)_localctx).v =  new SEVariable((((ExprContext)_localctx).ID!=null?((ExprContext)_localctx).ID.getText():null)); 
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				((ExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((ExprContext)_localctx).v =  new SString((((ExprContext)_localctx).StringLiteral!=null?((ExprContext)_localctx).StringLiteral.getText():null)); 
				}
				break;
			case Integer:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				((ExprContext)_localctx).Integer = match(Integer);
				 ((ExprContext)_localctx).v =  new SInteger((((ExprContext)_localctx).Integer!=null?((ExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case Double:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				((ExprContext)_localctx).Double = match(Double);
				 ((ExprContext)_localctx).v =  new SDouble((((ExprContext)_localctx).Double!=null?((ExprContext)_localctx).Double.getText():null)); 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 5);
				{
				setState(40);
				match(T__1);
				setState(41);
				((ExprContext)_localctx).expr = expr();
				setState(42);
				match(T__2);
				 ((ExprContext)_localctx).v =  _localctx.v; 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23\62\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\6\2\16\n\2\r\2\16\2\17\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\60\n\5\3\5\2\2\6\2\4\6\b"+
		"\2\2\64\2\r\3\2\2\2\4\32\3\2\2\2\6\34\3\2\2\2\b/\3\2\2\2\n\13\5\4\3\2"+
		"\13\f\b\2\1\2\f\16\3\2\2\2\r\n\3\2\2\2\16\17\3\2\2\2\17\r\3\2\2\2\17\20"+
		"\3\2\2\2\20\3\3\2\2\2\21\22\5\b\5\2\22\23\7\17\2\2\23\24\b\3\1\2\24\33"+
		"\3\2\2\2\25\26\5\6\4\2\26\27\7\17\2\2\27\30\b\3\1\2\30\33\3\2\2\2\31\33"+
		"\7\17\2\2\32\21\3\2\2\2\32\25\3\2\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35"+
		"\7\n\2\2\35\36\7\20\2\2\36\37\7\3\2\2\37 \5\b\5\2 !\b\4\1\2!\7\3\2\2\2"+
		"\"#\7\20\2\2#\60\b\5\1\2$%\7\23\2\2%\60\b\5\1\2&\'\7\13\2\2\'\60\b\5\1"+
		"\2()\7\f\2\2)\60\b\5\1\2*+\7\4\2\2+,\5\b\5\2,-\7\5\2\2-.\b\5\1\2.\60\3"+
		"\2\2\2/\"\3\2\2\2/$\3\2\2\2/&\3\2\2\2/(\3\2\2\2/*\3\2\2\2\60\t\3\2\2\2"+
		"\5\17\32/";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}