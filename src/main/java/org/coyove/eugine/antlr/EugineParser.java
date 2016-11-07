// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import java.util.HashMap;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, Var=33, Def=34, For=35, If=36, Switch=37, Else=38, Enter=39, 
		Catch=40, Clone=41, Do=42, Add=43, Sub=44, Not=45, AryOp=46, Integer=47, 
		Double=48, NEWLINE=49, WS=50, Semi=51, Identifier=52, Letter=53, BlockComment=54, 
		LineComment=55, RawString=56, StringLiteral=57;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_declareStmt = 6, RULE_definitionsList = 7, RULE_argumentsList = 8, 
		RULE_defineStmt = 9, RULE_lambdaStmt = 10, RULE_callStmt = 11, RULE_switchStmt = 12, 
		RULE_dict = 13, RULE_pair = 14, RULE_list = 15, RULE_value = 16, RULE_topExpr = 17, 
		RULE_unaryExpr = 18, RULE_multiplyExpr = 19, RULE_addExpr = 20, RULE_compareExpr = 21, 
		RULE_logicExpr = 22, RULE_assignExpr = 23, RULE_expr = 24;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "declareStmt", 
		"definitionsList", "argumentsList", "defineStmt", "lambdaStmt", "callStmt", 
		"switchStmt", "dict", "pair", "list", "value", "topExpr", "unaryExpr", 
		"multiplyExpr", "addExpr", "compareExpr", "logicExpr", "assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "'=>'", 
		"':'", "'['", "']'", "'++'", "'--'", "'*'", "'/'", "'%'", "'+.'", "'<'", 
		"'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'+='", "'-='", 
		"'*='", "'/='", "'..'", "'...'", "'var'", "'def'", null, "'if'", "'switch'", 
		"'else'", "'enter'", "'catch'", "'clone'", "'do'", "'+'", "'-'", "'!'", 
		null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Var", "Def", "For", 
		"If", "Switch", "Else", "Enter", "Catch", "Clone", "Do", "Add", "Sub", 
		"Not", "AryOp", "Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", 
		"Letter", "BlockComment", "LineComment", "RawString", "StringLiteral"
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
		public BlockContext block;
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
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
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				((ProgContext)_localctx).block = block();
				 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0) );
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

	public static class CodeContext extends ParserRuleContext {
		public SExpression v;
		public BlockContext B1;
		public StmtContext B2;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(57);
				match(T__0);
				setState(58);
				((CodeContext)_localctx).B1 = block();
				setState(59);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(61);
				((CodeContext)_localctx).B2 = stmt();
				}
				break;
			}

			        ((CodeContext)_localctx).v =  ((CodeContext)_localctx).B1 == null ? ((CodeContext)_localctx).B2.v : ((CodeContext)_localctx).B1.v;
			    
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

	public static class BlockContext extends ParserRuleContext {
		public SExpression v;
		public StmtContext stmt;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_block);
		 ((BlockContext)_localctx).v =  new SEChain(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					((BlockContext)_localctx).stmt = stmt();
					 ((SEChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(71); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public EnterStmtContext enterStmt;
		public DeclareStmtContext declareStmt;
		public DefineStmtContext defineStmt;
		public ExprContext expr;
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public EnterStmtContext enterStmt() {
			return getRuleContext(EnterStmtContext.class,0);
		}
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public DefineStmtContext defineStmt() {
			return getRuleContext(DefineStmtContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode Semi() { return getToken(EugineParser.Semi, 0); }
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
		enterRule(_localctx, 6, RULE_stmt);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				importStmt();
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				match(Semi);
				 ((StmtContext)_localctx).v =  new SNull(); 
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

	public static class ImportStmtContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(EugineParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(EugineParser.Identifier, i);
		}
		public ImportStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterImportStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitImportStmt(this);
		}
	}

	public final ImportStmtContext importStmt() throws RecognitionException {
		ImportStmtContext _localctx = new ImportStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(T__2);
			{
			setState(93);
			match(Identifier);
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(94);
					match(T__3);
					setState(95);
					match(Identifier);
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class EnterStmtContext extends ParserRuleContext {
		public SExpression v;
		public Token Enter;
		public CodeContext Body;
		public Token Catch;
		public Token Identifier;
		public CodeContext CatchBody;
		public Token Do;
		public CodeContext DoBody;
		public TerminalNode Enter() { return getToken(EugineParser.Enter, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode Catch() { return getToken(EugineParser.Catch, 0); }
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode Do() { return getToken(EugineParser.Do, 0); }
		public EnterStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enterStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterEnterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitEnterStmt(this);
		}
	}

	public final EnterStmtContext enterStmt() throws RecognitionException {
		EnterStmtContext _localctx = new EnterStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_enterStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(102);
			((EnterStmtContext)_localctx).Body = code();
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(103);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(104);
				match(T__4);
				setState(105);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(106);
				match(T__5);
				setState(107);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(111);
				((EnterStmtContext)_localctx).DoBody = code();
				}
				break;
			}

			            ((EnterStmtContext)_localctx).v =  new SETry(new Atom(((EnterStmtContext)_localctx).Enter), ((EnterStmtContext)_localctx).Body.v, 
			                ((EnterStmtContext)_localctx).Catch == null ? null : ((EnterStmtContext)_localctx).CatchBody.v, ((EnterStmtContext)_localctx).Do == null ? null : ((EnterStmtContext)_localctx).DoBody.v, (((EnterStmtContext)_localctx).Identifier!=null?((EnterStmtContext)_localctx).Identifier.getText():null));
			        
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
		public Token Identifier;
		public ExprContext Value;
		public ExprContext Subject;
		public TerminalNode Var() { return getToken(EugineParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 12, RULE_declareStmt);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				match(Var);
				setState(117);
				((DeclareStmtContext)_localctx).Identifier = match(Identifier);
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(118);
					match(T__6);
					setState(119);
					((DeclareStmtContext)_localctx).Value = expr();
					}
					break;
				}

				            ((DeclareStmtContext)_localctx).v =  new SESet(new Atom(((DeclareStmtContext)_localctx).Identifier), new SString((((DeclareStmtContext)_localctx).Identifier!=null?((DeclareStmtContext)_localctx).Identifier.getText():null)), 
				                (((DeclareStmtContext)_localctx).Value!=null?(((DeclareStmtContext)_localctx).Value.start):null) == null ? new SNull() : ((DeclareStmtContext)_localctx).Value.v, 
				                SESet.DECLARE.DECLARE, SESet.ACTION.MUTABLE);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(Var);
				setState(124);
				((DeclareStmtContext)_localctx).Subject = expr();
				setState(127);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(125);
					match(T__6);
					setState(126);
					((DeclareStmtContext)_localctx).Value = expr();
					}
					break;
				}

				            ((DeclareStmtContext)_localctx).v =  new SESet(new Atom((((DeclareStmtContext)_localctx).Subject!=null?(((DeclareStmtContext)_localctx).Subject.start):null)), ((DeclareStmtContext)_localctx).Subject.v, 
				                (((DeclareStmtContext)_localctx).Value!=null?(((DeclareStmtContext)_localctx).Value.start):null) == null ? new SNull() : ((DeclareStmtContext)_localctx).Value.v, 
				                SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((DeclareStmtContext)_localctx).Identifier = match(Identifier);
				setState(132);
				match(T__6);
				setState(133);
				((DeclareStmtContext)_localctx).Value = expr();

				            ((DeclareStmtContext)_localctx).v =  new SESet(new Atom(((DeclareStmtContext)_localctx).Identifier),
				                new SString((((DeclareStmtContext)_localctx).Identifier!=null?((DeclareStmtContext)_localctx).Identifier.getText():null)), ((DeclareStmtContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(136);
				((DeclareStmtContext)_localctx).Subject = expr();
				setState(137);
				match(T__6);
				setState(138);
				((DeclareStmtContext)_localctx).Value = expr();

				            ((DeclareStmtContext)_localctx).v =  new SESet(new Atom((((DeclareStmtContext)_localctx).Subject!=null?(((DeclareStmtContext)_localctx).Subject.start):null)), ((DeclareStmtContext)_localctx).Subject.v, ((DeclareStmtContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
				        
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

	public static class DefinitionsListContext extends ParserRuleContext {
		public org.coyove.eugine.util.List<String> v =  new org.coyove.eugine.util.List<String>();;
		public Token InitArg;
		public Token LastArg;
		public List<TerminalNode> Identifier() { return getTokens(EugineParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(EugineParser.Identifier, i);
		}
		public DefinitionsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definitionsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterDefinitionsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitDefinitionsList(this);
		}
	}

	public final DefinitionsListContext definitionsList() throws RecognitionException {
		DefinitionsListContext _localctx = new DefinitionsListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definitionsList);
		try {
			int _alt;
			setState(157);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				match(T__4);
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(144);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(145);
						match(T__7);
						 _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(152);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(153);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				match(T__4);
				setState(156);
				match(T__5);
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

	public static class ArgumentsListContext extends ParserRuleContext {
		public org.coyove.eugine.util.List<SExpression> v =  
		        new org.coyove.eugine.util.List<SExpression>();
		public ExprContext InitExpr;
		public ExprContext LastExpr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitArgumentsList(this);
		}
	}

	public final ArgumentsListContext argumentsList() throws RecognitionException {
		ArgumentsListContext _localctx = new ArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentsList);
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(T__4);
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(160);
						((ArgumentsListContext)_localctx).InitExpr = expr();
						setState(161);
						match(T__7);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(169);
				((ArgumentsListContext)_localctx).LastExpr = expr();
				setState(170);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(T__4);
				setState(174);
				match(T__5);
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

	public static class DefineStmtContext extends ParserRuleContext {
		public SExpression v;
		public org.coyove.eugine.util.List<SExpression> body =  new org.coyove.eugine.util.List<SExpression>();;
		public Token Identifier;
		public DefinitionsListContext definitionsList;
		public Token Desc;
		public StmtContext stmt;
		public Token Def;
		public ExprContext Get;
		public TerminalNode Def() { return getToken(EugineParser.Def, 0); }
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public DefinitionsListContext definitionsList() {
			return getRuleContext(DefinitionsListContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DefineStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterDefineStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitDefineStmt(this);
		}
	}

	public final DefineStmtContext defineStmt() throws RecognitionException {
		DefineStmtContext _localctx = new DefineStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_defineStmt);
		int _la;
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(Def);
				setState(178);
				((DefineStmtContext)_localctx).Identifier = match(Identifier);
				setState(179);
				((DefineStmtContext)_localctx).definitionsList = definitionsList();
				setState(181);
				_la = _input.LA(1);
				if (_la==RawString || _la==StringLiteral) {
					{
					setState(180);
					((DefineStmtContext)_localctx).Desc = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==RawString || _la==StringLiteral) ) {
						((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(183);
				match(T__6);
				setState(197);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(184);
					match(T__0);
					setState(190);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
						{
						{
						setState(185);
						((DefineStmtContext)_localctx).stmt = stmt();
						 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
						}
						}
						setState(192);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(193);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(194);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					break;
				}

				            ((DefineStmtContext)_localctx).v =  new SEDef(new Atom(((DefineStmtContext)_localctx).Identifier), (((DefineStmtContext)_localctx).Identifier!=null?((DefineStmtContext)_localctx).Identifier.getText():null), ((DefineStmtContext)_localctx).definitionsList.v, 
				                ((DefineStmtContext)_localctx).Desc == null ? "" : (((DefineStmtContext)_localctx).Desc!=null?((DefineStmtContext)_localctx).Desc.getText():null), _localctx.body);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((DefineStmtContext)_localctx).Def = match(Def);
				setState(202);
				((DefineStmtContext)_localctx).Get = expr();
				setState(203);
				((DefineStmtContext)_localctx).definitionsList = definitionsList();
				setState(205);
				_la = _input.LA(1);
				if (_la==RawString || _la==StringLiteral) {
					{
					setState(204);
					((DefineStmtContext)_localctx).Desc = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==RawString || _la==StringLiteral) ) {
						((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(207);
				match(T__6);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(208);
					match(T__0);
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
						{
						{
						setState(209);
						((DefineStmtContext)_localctx).stmt = stmt();
						 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
						}
						}
						setState(216);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(217);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(218);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					break;
				}

				            if (((DefineStmtContext)_localctx).Get.v instanceof SEGet) {
				                ((DefineStmtContext)_localctx).v =  new SESet(new Atom(((DefineStmtContext)_localctx).Def), ((DefineStmtContext)_localctx).Get.v,
				                    new SELambda(new Atom(((DefineStmtContext)_localctx).Def), ((DefineStmtContext)_localctx).definitionsList.v, _localctx.body),
				                    SESet.DECLARE.DECLARE, SESet.ACTION.IMMUTABLE);
				            } else {
				                ((DefineStmtContext)_localctx).v =  new SNull();
				            }
				        
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

	public static class LambdaStmtContext extends ParserRuleContext {
		public SExpression v;
		public org.coyove.eugine.util.List<SExpression> body =  new org.coyove.eugine.util.List<SExpression>();;
		public DefinitionsListContext definitionsList;
		public StmtContext stmt;
		public DefinitionsListContext definitionsList() {
			return getRuleContext(DefinitionsListContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public LambdaStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lambdaStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterLambdaStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitLambdaStmt(this);
		}
	}

	public final LambdaStmtContext lambdaStmt() throws RecognitionException {
		LambdaStmtContext _localctx = new LambdaStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(228);
			match(T__8);
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(229);
				match(T__0);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(230);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(239);
				((LambdaStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			        ((LambdaStmtContext)_localctx).v =  new SEDef(new Atom((((LambdaStmtContext)_localctx).definitionsList!=null?(((LambdaStmtContext)_localctx).definitionsList.start):null)), null, ((LambdaStmtContext)_localctx).definitionsList.v, "", _localctx.body);
			    
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

	public static class CallStmtContext extends ParserRuleContext {
		public SExpression v;
		public Token Identifier;
		public ArgumentsListContext argumentsList;
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitCallStmt(this);
		}
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			((CallStmtContext)_localctx).Identifier = match(Identifier);
			setState(247);
			((CallStmtContext)_localctx).argumentsList = argumentsList();

			        String func = (((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null);
			        if (SKeywordsANTLR.KeywordsLookup.containsKey(func)) {
			            ((CallStmtContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get(func).call(((CallStmtContext)_localctx).Identifier, ((CallStmtContext)_localctx).argumentsList.v); 
			        } else {
			            ((CallStmtContext)_localctx).v =  new SECall(new SEVariable((((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null)), ((CallStmtContext)_localctx).argumentsList.v, new Atom(((CallStmtContext)_localctx).Identifier), null);
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

	public static class SwitchStmtContext extends ParserRuleContext {
		public SExpression v;
		public org.coyove.eugine.util.List<Branch> branches =  new org.coyove.eugine.util.List<Branch>();
		public Branch db =  null;
		public Token Switch;
		public ExprContext Condition;
		public ExprContext Tester;
		public CodeContext Code;
		public TerminalNode Switch() { return getToken(EugineParser.Switch, 0); }
		public TerminalNode Do() { return getToken(EugineParser.Do, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public SwitchStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitSwitchStmt(this);
		}
	}

	public final SwitchStmtContext switchStmt() throws RecognitionException {
		SwitchStmtContext _localctx = new SwitchStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(251);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(252);
			match(Do);
			setState(253);
			match(T__0);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(254);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(255);
				match(T__8);
				setState(256);
				((SwitchStmtContext)_localctx).Code = code();

				        Branch b = new Branch();
				        b.recv = ((SwitchStmtContext)_localctx).Tester.v;
				        b.body = new org.coyove.eugine.util.List<SExpression>();
				        b.body.add(((SwitchStmtContext)_localctx).Code.v);

				        if ((((SwitchStmtContext)_localctx).Tester!=null?_input.getText(((SwitchStmtContext)_localctx).Tester.start,((SwitchStmtContext)_localctx).Tester.stop):null).equals("_")) {
				            ((SwitchStmtContext)_localctx).db =  b;
				        } else {
				            _localctx.branches.add(b);
				        }
				    
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			match(T__1);

			            ((SwitchStmtContext)_localctx).v =  new SECond(new Atom(((SwitchStmtContext)_localctx).Switch), ((SwitchStmtContext)_localctx).Condition.v, _localctx.branches, _localctx.db);
			        
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

	public static class DictContext extends ParserRuleContext {
		public SExpression v;
		public HashMap<String, SExpression> ret =  new HashMap<String, SExpression>();;
		public PairContext pair;
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public DictContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dict; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterDict(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitDict(this);
		}
	}

	public final DictContext dict() throws RecognitionException {
		DictContext _localctx = new DictContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				match(T__0);
				setState(268);
				((DictContext)_localctx).pair = pair();
				 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(270);
						match(T__7);
						setState(271);
						((DictContext)_localctx).pair = pair();
						 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(278);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(280);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(279);
					match(T__7);
					}
				}

				setState(282);
				match(T__1);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				match(T__0);
				setState(286);
				match(T__1);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
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

	public static class PairContext extends ParserRuleContext {
		public String k;
		public SExpression v;
		public Token Key;
		public ValueContext Value;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitPair(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pair);
		int _la;
		try {
			setState(300);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(291);
				match(T__9);
				setState(292);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				((PairContext)_localctx).Key = match(Identifier);
				setState(296);
				match(T__9);
				setState(297);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  (((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
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

	public static class ListContext extends ParserRuleContext {
		public SExpression v;
		public org.coyove.eugine.util.List<SExpression> ret =  new org.coyove.eugine.util.List<SExpression>();;
		public ValueContext value;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_list);
		int _la;
		try {
			setState(321);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(T__10);
				{
				setState(303);
				((ListContext)_localctx).value = value();
				 _localctx.ret.add(((ListContext)_localctx).value.v); 
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(306);
					match(T__7);
					setState(307);
					((ListContext)_localctx).value = value();
					 _localctx.ret.add(((ListContext)_localctx).value.v); 
					}
					}
					setState(314);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(315);
				match(T__11);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				match(T__10);
				setState(319);
				match(T__11);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
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

	public static class ValueContext extends ParserRuleContext {
		public SExpression v;
		public ExprContext expr;
		public DictContext dict;
		public ListContext list;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				((ValueContext)_localctx).list = list();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).list.v; 
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

	public static class TopExprContext extends ParserRuleContext {
		public SExpression v;
		public TopExprContext Called;
		public TopExprContext Subject;
		public StmtContext Inner;
		public CallStmtContext callStmt;
		public LambdaStmtContext lambdaStmt;
		public Token Identifier;
		public Token RawString;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
		public ArgumentsListContext argumentsList;
		public ExprContext Key;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public LambdaStmtContext lambdaStmt() {
			return getRuleContext(LambdaStmtContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode Integer() { return getToken(EugineParser.Integer, 0); }
		public TerminalNode Double() { return getToken(EugineParser.Double, 0); }
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TopExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterTopExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitTopExpr(this);
		}
	}

	public final TopExprContext topExpr() throws RecognitionException {
		return topExpr(0);
	}

	private TopExprContext topExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TopExprContext _localctx = new TopExprContext(_ctx, _parentState);
		TopExprContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_topExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(335);
				match(T__4);
				setState(336);
				((TopExprContext)_localctx).Inner = stmt();
				setState(337);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				{
				setState(340);
				((TopExprContext)_localctx).callStmt = callStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).callStmt.v; 
				}
				break;
			case 3:
				{
				setState(343);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 4:
				{
				setState(346);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new SEVariable((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 5:
				{
				setState(348);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 6:
				{
				setState(350);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 7:
				{
				setState(352);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInteger((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 8:
				{
				setState(354);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SDouble((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(358);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(359);
						((TopExprContext)_localctx).argumentsList = argumentsList();
						 ((TopExprContext)_localctx).v =  new SECall(((TopExprContext)_localctx).Called.v, ((TopExprContext)_localctx).argumentsList.v, new Atom((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null)), null); 
						}
						break;
					case 2:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(362);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(363);
						match(T__10);
						setState(364);
						((TopExprContext)_localctx).Key = expr();
						setState(365);
						match(T__11);

						                      ((TopExprContext)_localctx).v =  new SEGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, org.coyove.eugine.util.List.build(((TopExprContext)_localctx).Key.v));
						                  
						}
						break;
					case 3:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(368);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(369);
						match(T__3);
						setState(370);
						((TopExprContext)_localctx).Identifier = match(Identifier);

						                      ((TopExprContext)_localctx).v =  new SEGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, 
						                          org.coyove.eugine.util.List.build(new SString((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null))));
						                  
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public SExpression v;
		public UnaryExprContext Left;
		public TopExprContext Top;
		public Token Sub;
		public TopExprContext Right;
		public Token Not;
		public Token Op;
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public TerminalNode Sub() { return getToken(EugineParser.Sub, 0); }
		public TerminalNode Not() { return getToken(EugineParser.Not, 0); }
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public UnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterUnaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitUnaryExpr(this);
		}
	}

	public final UnaryExprContext unaryExpr() throws RecognitionException {
		return unaryExpr(0);
	}

	private UnaryExprContext unaryExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, _parentState);
		UnaryExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_unaryExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			switch (_input.LA(1)) {
			case T__4:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				{
				setState(378);
				((UnaryExprContext)_localctx).Top = topExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				{
				setState(381);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(382);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            if (((UnaryExprContext)_localctx).Right.v instanceof SInteger) {
				                ((UnaryExprContext)_localctx).v =  new SInteger(-((SInteger) ((UnaryExprContext)_localctx).Right.v).<Long>get());
				            } else if (((UnaryExprContext)_localctx).Right.v instanceof SDouble) {
				                ((UnaryExprContext)_localctx).v =  new SDouble(-((SDouble) ((UnaryExprContext)_localctx).Right.v).<Double>get());
				            } else {
				                ((UnaryExprContext)_localctx).v =  new SEReverse(new Atom(((UnaryExprContext)_localctx).Sub), org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Right.v)); 
				            }
				        
				}
				break;
			case Not:
				{
				setState(385);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(386);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            ((UnaryExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((UnaryExprContext)_localctx).Not!=null?((UnaryExprContext)_localctx).Not.getText():null)).call(((UnaryExprContext)_localctx).Not, 
				                org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Right.v));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(396);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new UnaryExprContext(_parentctx, _parentState);
					_localctx.Left = _prevctx;
					_localctx.Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpr);
					setState(391);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(392);
					((UnaryExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__12 || _la==T__13) ) {
						((UnaryExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}

					                      Atom ha = new Atom(((UnaryExprContext)_localctx).Op);
					                      if ((((UnaryExprContext)_localctx).Op!=null?((UnaryExprContext)_localctx).Op.getText():null).equals("++")) {
					                          ((UnaryExprContext)_localctx).v =  new SESet(ha, ((UnaryExprContext)_localctx).Left.v, 
					                              new SEAdd(ha, org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Left.v, new SInteger(1)), false),
					                              SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
					                      } else {
					                          ((UnaryExprContext)_localctx).v =  new SESet(ha, ((UnaryExprContext)_localctx).Left.v, 
					                              new SEElemArith(ha, 
					                                  org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Left.v, new SInteger(1)), SEElemArith.ACTION.SUBTRACT),
					                              SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
					                      }
					                  
					}
					} 
				}
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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

	public static class MultiplyExprContext extends ParserRuleContext {
		public SExpression v;
		public MultiplyExprContext Left;
		public UnaryExprContext Top;
		public Token Op;
		public UnaryExprContext Right;
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public MultiplyExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterMultiplyExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitMultiplyExpr(this);
		}
	}

	public final MultiplyExprContext multiplyExpr() throws RecognitionException {
		return multiplyExpr(0);
	}

	private MultiplyExprContext multiplyExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplyExprContext _localctx = new MultiplyExprContext(_ctx, _parentState);
		MultiplyExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_multiplyExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(400);
			((MultiplyExprContext)_localctx).Top = unaryExpr(0);
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(410);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MultiplyExprContext(_parentctx, _parentState);
					_localctx.Left = _prevctx;
					_localctx.Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
					setState(403);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(404);
					((MultiplyExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
						((MultiplyExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(405);
					((MultiplyExprContext)_localctx).Right = unaryExpr(0);

					                      ((MultiplyExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((MultiplyExprContext)_localctx).Op!=null?((MultiplyExprContext)_localctx).Op.getText():null)).call(((MultiplyExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(412);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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

	public static class AddExprContext extends ParserRuleContext {
		public SExpression v;
		public AddExprContext Left;
		public MultiplyExprContext Top;
		public Token AddOp;
		public MultiplyExprContext Right;
		public Token Sub;
		public MultiplyExprContext multiplyExpr() {
			return getRuleContext(MultiplyExprContext.class,0);
		}
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public TerminalNode Sub() { return getToken(EugineParser.Sub, 0); }
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitAddExpr(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		return addExpr(0);
	}

	private AddExprContext addExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AddExprContext _localctx = new AddExprContext(_ctx, _parentState);
		AddExprContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(414);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(429);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(427);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(417);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(418);
						((AddExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==Add) ) {
							((AddExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(419);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new SEAdd(new Atom(((AddExprContext)_localctx).AddOp), 
						                          org.coyove.eugine.util.List.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), (((AddExprContext)_localctx).AddOp!=null?((AddExprContext)_localctx).AddOp.getText():null).equals("+."));
						                  
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(422);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(423);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(424);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new SEElemArith(new Atom(((AddExprContext)_localctx).Sub), 
						                          org.coyove.eugine.util.List.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), SEElemArith.ACTION.SUBTRACT);
						                  
						}
						break;
					}
					} 
				}
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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

	public static class CompareExprContext extends ParserRuleContext {
		public SExpression v;
		public CompareExprContext Left;
		public AddExprContext Top;
		public Token Op;
		public AddExprContext Right;
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public CompareExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitCompareExpr(this);
		}
	}

	public final CompareExprContext compareExpr() throws RecognitionException {
		return compareExpr(0);
	}

	private CompareExprContext compareExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompareExprContext _localctx = new CompareExprContext(_ctx, _parentState);
		CompareExprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_compareExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(443);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompareExprContext(_parentctx, _parentState);
					_localctx.Left = _prevctx;
					_localctx.Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
					setState(436);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(437);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(438);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null)).call(((CompareExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(445);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
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

	public static class LogicExprContext extends ParserRuleContext {
		public SExpression v;
		public LogicExprContext Left;
		public CompareExprContext Top;
		public Token Op;
		public CompareExprContext Right;
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public LogicExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterLogicExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitLogicExpr(this);
		}
	}

	public final LogicExprContext logicExpr() throws RecognitionException {
		return logicExpr(0);
	}

	private LogicExprContext logicExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicExprContext _localctx = new LogicExprContext(_ctx, _parentState);
		LogicExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(447);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicExprContext(_parentctx, _parentState);
					_localctx.Left = _prevctx;
					_localctx.Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
					setState(450);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(451);
					((LogicExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__24 || _la==T__25) ) {
						((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(452);
					((LogicExprContext)_localctx).Right = compareExpr(0);

					                      ((LogicExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null)).call(((LogicExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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

	public static class AssignExprContext extends ParserRuleContext {
		public SExpression v;
		public LogicExprContext Top;
		public UnaryExprContext Left;
		public Token Op;
		public AssignExprContext Right;
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public AssignExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitAssignExpr(this);
		}
	}

	public final AssignExprContext assignExpr() throws RecognitionException {
		AssignExprContext _localctx = new AssignExprContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_assignExpr);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				((AssignExprContext)_localctx).Left = unaryExpr(0);
				setState(464);
				((AssignExprContext)_localctx).Op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
					((AssignExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(465);
				((AssignExprContext)_localctx).Right = assignExpr();

				            Atom ha = new Atom(((AssignExprContext)_localctx).Op);
				            if ((((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null).equals("+=")) {
				                ((AssignExprContext)_localctx).v =  new SESet(ha, ((AssignExprContext)_localctx).Left.v, 
				                    new SEAdd(ha, org.coyove.eugine.util.List.build(((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), false),
				                    SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
				            } else {
				                String text = (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null).substring(0, 1);
				                ((AssignExprContext)_localctx).v =  new SESet(ha, ((AssignExprContext)_localctx).Left.v, 
				                    SKeywordsANTLR.KeywordsLookup.get(text).call(((AssignExprContext)_localctx).Op, 
				                        org.coyove.eugine.util.List.build(((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v)),
				                    SESet.DECLARE.SET, SESet.ACTION.MUTABLE);
				            }
				        
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

	public static class ExprContext extends ParserRuleContext {
		public SExpression v;
		public AssignExprContext assignExpr;
		public Token Clone;
		public ExprContext Subject;
		public Token For;
		public ExprContext Body;
		public ExprContext Start;
		public ExprContext Next;
		public ExprContext End;
		public Token If;
		public ExprContext Condition;
		public CodeContext True;
		public CodeContext False;
		public SwitchStmtContext switchStmt;
		public ListContext list;
		public DictContext dict;
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode Clone() { return getToken(EugineParser.Clone, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode For() { return getToken(EugineParser.For, 0); }
		public TerminalNode Do() { return getToken(EugineParser.Do, 0); }
		public TerminalNode If() { return getToken(EugineParser.If, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode Else() { return getToken(EugineParser.Else, 0); }
		public SwitchStmtContext switchStmt() {
			return getRuleContext(SwitchStmtContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
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
		enterRule(_localctx, 48, RULE_expr);
		int _la;
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(470);
				((ExprContext)_localctx).assignExpr = assignExpr();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(474);
				((ExprContext)_localctx).Subject = expr();

				            ((ExprContext)_localctx).v =  new SEClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(477);
				((ExprContext)_localctx).For = match(For);
				setState(478);
				((ExprContext)_localctx).Subject = expr();
				setState(479);
				match(Do);
				setState(480);
				((ExprContext)_localctx).Body = expr();
				 
				            ((ExprContext)_localctx).v =  new SEFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? SEFor.DIRECTION.ASC : SEFor.DIRECTION.DESC); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(483);
				((ExprContext)_localctx).For = match(For);
				setState(484);
				((ExprContext)_localctx).Start = expr();
				setState(487);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(485);
					match(T__7);
					setState(486);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(489);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(490);
				((ExprContext)_localctx).End = expr();
				setState(491);
				match(Do);
				setState(492);
				((ExprContext)_localctx).Body = expr();
				 
				            SEIRange r = new SEIRange(new Atom(((ExprContext)_localctx).For), org.coyove.eugine.util.List.build(
				                    ((ExprContext)_localctx).Start.v, 
				                    ((ExprContext)_localctx).Next == null ? 
				                        new SInteger(1) : 
				                        new SEElemArith(new Atom((((ExprContext)_localctx).Next!=null?(((ExprContext)_localctx).Next.start):null)), 
				                            org.coyove.eugine.util.List.build(((ExprContext)_localctx).Next.v, ((ExprContext)_localctx).Start.v),
				                            SEElemArith.ACTION.SUBTRACT), 
				                    ((ExprContext)_localctx).End.v
				                ));
				            ((ExprContext)_localctx).v =  new SEFor(new Atom(((ExprContext)_localctx).For), r, ((ExprContext)_localctx).Body.v, SEFor.DIRECTION.ASC); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(495);
				((ExprContext)_localctx).If = match(If);
				setState(496);
				((ExprContext)_localctx).Condition = expr();
				setState(497);
				((ExprContext)_localctx).True = code();
				setState(500);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(498);
					match(Else);
					setState(499);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new SEIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(504);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(507);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(510);
				((ExprContext)_localctx).dict = dict();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).dict.v; 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return topExpr_sempred((TopExprContext)_localctx, predIndex);
		case 18:
			return unaryExpr_sempred((UnaryExprContext)_localctx, predIndex);
		case 19:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 20:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 21:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 22:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean topExpr_sempred(TopExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean unaryExpr_sempred(UnaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compareExpr_sempred(CompareExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u0206\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\3\3\3\3\3\3\3\3\3\5\3A\n\3"+
		"\3\3\3\3\3\4\3\4\3\4\6\4H\n\4\r\4\16\4I\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\7\6c\n"+
		"\6\f\6\16\6f\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7o\n\7\3\7\3\7\5\7s\n"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b{\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0090\n\b\3\t\3\t"+
		"\3\t\3\t\7\t\u0096\n\t\f\t\16\t\u0099\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a0"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u00a7\n\n\f\n\16\n\u00aa\13\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\5\n\u00b2\n\n\3\13\3\13\3\13\3\13\5\13\u00b8\n\13\3\13\3"+
		"\13\3\13\3\13\3\13\7\13\u00bf\n\13\f\13\16\13\u00c2\13\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00c8\n\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00d7\n\13\f\13\16\13\u00da\13\13\3\13"+
		"\3\13\3\13\3\13\5\13\u00e0\n\13\3\13\3\13\5\13\u00e4\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\7\f\u00ec\n\f\f\f\16\f\u00ef\13\f\3\f\3\f\3\f\3\f\5\f\u00f5"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\7\16\u0106\n\16\f\16\16\16\u0109\13\16\3\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\7\17\u0115\n\17\f\17\16\17\u0118\13\17\3\17\5"+
		"\17\u011b\n\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0123\n\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u012f\n\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\7\21\u0139\n\21\f\21\16\21\u013c\13\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u0144\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u014f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0167\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\7\23\u0177\n\23\f\23\16\23\u017a\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0188\n\24\3\24\3\24"+
		"\3\24\7\24\u018d\n\24\f\24\16\24\u0190\13\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u019b\n\25\f\25\16\25\u019e\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01ae"+
		"\n\26\f\26\16\26\u01b1\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\7\27\u01bc\n\27\f\27\16\27\u01bf\13\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\7\30\u01ca\n\30\f\30\16\30\u01cd\13\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\5\31\u01d7\n\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01ea"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01f7"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0204"+
		"\n\32\3\32\2\b$&(*,.\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\2\n\3\2:;\3\2\17\20\3\2\21\23\4\2\24\24--\3\2\25\32\3\2\33\34"+
		"\3\2\35 \3\2!\"\u022e\2\67\3\2\2\2\4@\3\2\2\2\6G\3\2\2\2\b\\\3\2\2\2\n"+
		"^\3\2\2\2\fg\3\2\2\2\16\u008f\3\2\2\2\20\u009f\3\2\2\2\22\u00b1\3\2\2"+
		"\2\24\u00e3\3\2\2\2\26\u00e5\3\2\2\2\30\u00f8\3\2\2\2\32\u00fc\3\2\2\2"+
		"\34\u0122\3\2\2\2\36\u012e\3\2\2\2 \u0143\3\2\2\2\"\u014e\3\2\2\2$\u0166"+
		"\3\2\2\2&\u0187\3\2\2\2(\u0191\3\2\2\2*\u019f\3\2\2\2,\u01b2\3\2\2\2."+
		"\u01c0\3\2\2\2\60\u01d6\3\2\2\2\62\u0203\3\2\2\2\64\65\5\6\4\2\65\66\b"+
		"\2\1\2\668\3\2\2\2\67\64\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\3\3"+
		"\2\2\2;<\7\3\2\2<=\5\6\4\2=>\7\4\2\2>A\3\2\2\2?A\5\b\5\2@;\3\2\2\2@?\3"+
		"\2\2\2AB\3\2\2\2BC\b\3\1\2C\5\3\2\2\2DE\5\b\5\2EF\b\4\1\2FH\3\2\2\2GD"+
		"\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\7\3\2\2\2KL\5\n\6\2LM\b\5\1\2"+
		"M]\3\2\2\2NO\5\f\7\2OP\b\5\1\2P]\3\2\2\2QR\5\16\b\2RS\b\5\1\2S]\3\2\2"+
		"\2TU\5\24\13\2UV\b\5\1\2V]\3\2\2\2WX\5\62\32\2XY\b\5\1\2Y]\3\2\2\2Z[\7"+
		"\65\2\2[]\b\5\1\2\\K\3\2\2\2\\N\3\2\2\2\\Q\3\2\2\2\\T\3\2\2\2\\W\3\2\2"+
		"\2\\Z\3\2\2\2]\t\3\2\2\2^_\7\5\2\2_d\7\66\2\2`a\7\6\2\2ac\7\66\2\2b`\3"+
		"\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\13\3\2\2\2fd\3\2\2\2gh\7)\2\2hn"+
		"\5\4\3\2ij\7*\2\2jk\7\7\2\2kl\7\66\2\2lm\7\b\2\2mo\5\4\3\2ni\3\2\2\2n"+
		"o\3\2\2\2or\3\2\2\2pq\7,\2\2qs\5\4\3\2rp\3\2\2\2rs\3\2\2\2st\3\2\2\2t"+
		"u\b\7\1\2u\r\3\2\2\2vw\7#\2\2wz\7\66\2\2xy\7\t\2\2y{\5\62\32\2zx\3\2\2"+
		"\2z{\3\2\2\2{|\3\2\2\2|\u0090\b\b\1\2}~\7#\2\2~\u0081\5\62\32\2\177\u0080"+
		"\7\t\2\2\u0080\u0082\5\62\32\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\b\b\1\2\u0084\u0090\3\2\2\2\u0085\u0086\7\66"+
		"\2\2\u0086\u0087\7\t\2\2\u0087\u0088\5\62\32\2\u0088\u0089\b\b\1\2\u0089"+
		"\u0090\3\2\2\2\u008a\u008b\5\62\32\2\u008b\u008c\7\t\2\2\u008c\u008d\5"+
		"\62\32\2\u008d\u008e\b\b\1\2\u008e\u0090\3\2\2\2\u008fv\3\2\2\2\u008f"+
		"}\3\2\2\2\u008f\u0085\3\2\2\2\u008f\u008a\3\2\2\2\u0090\17\3\2\2\2\u0091"+
		"\u0097\7\7\2\2\u0092\u0093\7\66\2\2\u0093\u0094\7\n\2\2\u0094\u0096\b"+
		"\t\1\2\u0095\u0092\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\7\66"+
		"\2\2\u009b\u009c\7\b\2\2\u009c\u00a0\b\t\1\2\u009d\u009e\7\7\2\2\u009e"+
		"\u00a0\7\b\2\2\u009f\u0091\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\21\3\2\2"+
		"\2\u00a1\u00a8\7\7\2\2\u00a2\u00a3\5\62\32\2\u00a3\u00a4\7\n\2\2\u00a4"+
		"\u00a5\b\n\1\2\u00a5\u00a7\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00ac\5\62\32\2\u00ac\u00ad\7\b\2\2\u00ad\u00ae\b"+
		"\n\1\2\u00ae\u00b2\3\2\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b2\7\b\2\2\u00b1"+
		"\u00a1\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\23\3\2\2\2\u00b3\u00b4\7$\2\2"+
		"\u00b4\u00b5\7\66\2\2\u00b5\u00b7\5\20\t\2\u00b6\u00b8\t\2\2\2\u00b7\u00b6"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00c7\7\t\2\2\u00ba"+
		"\u00c0\7\3\2\2\u00bb\u00bc\5\b\5\2\u00bc\u00bd\b\13\1\2\u00bd\u00bf\3"+
		"\2\2\2\u00be\u00bb\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c8\7\4"+
		"\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\b\13\1\2\u00c6\u00c8\3\2\2\2\u00c7"+
		"\u00ba\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\b\13"+
		"\1\2\u00ca\u00e4\3\2\2\2\u00cb\u00cc\7$\2\2\u00cc\u00cd\5\62\32\2\u00cd"+
		"\u00cf\5\20\t\2\u00ce\u00d0\t\2\2\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00df\7\t\2\2\u00d2\u00d8\7\3\2\2\u00d3"+
		"\u00d4\5\b\5\2\u00d4\u00d5\b\13\1\2\u00d5\u00d7\3\2\2\2\u00d6\u00d3\3"+
		"\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00e0\7\4\2\2\u00dc\u00dd\5\b"+
		"\5\2\u00dd\u00de\b\13\1\2\u00de\u00e0\3\2\2\2\u00df\u00d2\3\2\2\2\u00df"+
		"\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\b\13\1\2\u00e2\u00e4\3"+
		"\2\2\2\u00e3\u00b3\3\2\2\2\u00e3\u00cb\3\2\2\2\u00e4\25\3\2\2\2\u00e5"+
		"\u00e6\5\20\t\2\u00e6\u00f4\7\13\2\2\u00e7\u00ed\7\3\2\2\u00e8\u00e9\5"+
		"\b\5\2\u00e9\u00ea\b\f\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00e8\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f5\7\4\2\2\u00f1\u00f2\5\b\5\2\u00f2"+
		"\u00f3\b\f\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00e7\3\2\2\2\u00f4\u00f1\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\b\f\1\2\u00f7\27\3\2\2\2\u00f8\u00f9"+
		"\7\66\2\2\u00f9\u00fa\5\22\n\2\u00fa\u00fb\b\r\1\2\u00fb\31\3\2\2\2\u00fc"+
		"\u00fd\7\'\2\2\u00fd\u00fe\5\62\32\2\u00fe\u00ff\7,\2\2\u00ff\u0107\7"+
		"\3\2\2\u0100\u0101\5\62\32\2\u0101\u0102\7\13\2\2\u0102\u0103\5\4\3\2"+
		"\u0103\u0104\b\16\1\2\u0104\u0106\3\2\2\2\u0105\u0100\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0107\3\2\2\2\u010a\u010b\7\4\2\2\u010b\u010c\b\16\1\2\u010c\33\3\2\2"+
		"\2\u010d\u010e\7\3\2\2\u010e\u010f\5\36\20\2\u010f\u0116\b\17\1\2\u0110"+
		"\u0111\7\n\2\2\u0111\u0112\5\36\20\2\u0112\u0113\b\17\1\2\u0113\u0115"+
		"\3\2\2\2\u0114\u0110\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011b\7\n"+
		"\2\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		"\u011d\7\4\2\2\u011d\u011e\b\17\1\2\u011e\u0123\3\2\2\2\u011f\u0120\7"+
		"\3\2\2\u0120\u0121\7\4\2\2\u0121\u0123\b\17\1\2\u0122\u010d\3\2\2\2\u0122"+
		"\u011f\3\2\2\2\u0123\35\3\2\2\2\u0124\u0125\t\2\2\2\u0125\u0126\7\f\2"+
		"\2\u0126\u0127\5\"\22\2\u0127\u0128\b\20\1\2\u0128\u012f\3\2\2\2\u0129"+
		"\u012a\7\66\2\2\u012a\u012b\7\f\2\2\u012b\u012c\5\"\22\2\u012c\u012d\b"+
		"\20\1\2\u012d\u012f\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0129\3\2\2\2\u012f"+
		"\37\3\2\2\2\u0130\u0131\7\r\2\2\u0131\u0132\5\"\22\2\u0132\u0133\b\21"+
		"\1\2\u0133\u013a\3\2\2\2\u0134\u0135\7\n\2\2\u0135\u0136\5\"\22\2\u0136"+
		"\u0137\b\21\1\2\u0137\u0139\3\2\2\2\u0138\u0134\3\2\2\2\u0139\u013c\3"+
		"\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013d\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013d\u013e\7\16\2\2\u013e\u013f\b\21\1\2\u013f\u0144\3"+
		"\2\2\2\u0140\u0141\7\r\2\2\u0141\u0142\7\16\2\2\u0142\u0144\b\21\1\2\u0143"+
		"\u0130\3\2\2\2\u0143\u0140\3\2\2\2\u0144!\3\2\2\2\u0145\u0146\5\62\32"+
		"\2\u0146\u0147\b\22\1\2\u0147\u014f\3\2\2\2\u0148\u0149\5\34\17\2\u0149"+
		"\u014a\b\22\1\2\u014a\u014f\3\2\2\2\u014b\u014c\5 \21\2\u014c\u014d\b"+
		"\22\1\2\u014d\u014f\3\2\2\2\u014e\u0145\3\2\2\2\u014e\u0148\3\2\2\2\u014e"+
		"\u014b\3\2\2\2\u014f#\3\2\2\2\u0150\u0151\b\23\1\2\u0151\u0152\7\7\2\2"+
		"\u0152\u0153\5\b\5\2\u0153\u0154\7\b\2\2\u0154\u0155\b\23\1\2\u0155\u0167"+
		"\3\2\2\2\u0156\u0157\5\30\r\2\u0157\u0158\b\23\1\2\u0158\u0167\3\2\2\2"+
		"\u0159\u015a\5\26\f\2\u015a\u015b\b\23\1\2\u015b\u0167\3\2\2\2\u015c\u015d"+
		"\7\66\2\2\u015d\u0167\b\23\1\2\u015e\u015f\7:\2\2\u015f\u0167\b\23\1\2"+
		"\u0160\u0161\7;\2\2\u0161\u0167\b\23\1\2\u0162\u0163\7\61\2\2\u0163\u0167"+
		"\b\23\1\2\u0164\u0165\7\62\2\2\u0165\u0167\b\23\1\2\u0166\u0150\3\2\2"+
		"\2\u0166\u0156\3\2\2\2\u0166\u0159\3\2\2\2\u0166\u015c\3\2\2\2\u0166\u015e"+
		"\3\2\2\2\u0166\u0160\3\2\2\2\u0166\u0162\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"\u0178\3\2\2\2\u0168\u0169\f\13\2\2\u0169\u016a\5\22\n\2\u016a\u016b\b"+
		"\23\1\2\u016b\u0177\3\2\2\2\u016c\u016d\f\t\2\2\u016d\u016e\7\r\2\2\u016e"+
		"\u016f\5\62\32\2\u016f\u0170\7\16\2\2\u0170\u0171\b\23\1\2\u0171\u0177"+
		"\3\2\2\2\u0172\u0173\f\b\2\2\u0173\u0174\7\6\2\2\u0174\u0175\7\66\2\2"+
		"\u0175\u0177\b\23\1\2\u0176\u0168\3\2\2\2\u0176\u016c\3\2\2\2\u0176\u0172"+
		"\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"%\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u017c\b\24\1\2\u017c\u017d\5$\23\2"+
		"\u017d\u017e\b\24\1\2\u017e\u0188\3\2\2\2\u017f\u0180\7.\2\2\u0180\u0181"+
		"\5$\23\2\u0181\u0182\b\24\1\2\u0182\u0188\3\2\2\2\u0183\u0184\7/\2\2\u0184"+
		"\u0185\5$\23\2\u0185\u0186\b\24\1\2\u0186\u0188\3\2\2\2\u0187\u017b\3"+
		"\2\2\2\u0187\u017f\3\2\2\2\u0187\u0183\3\2\2\2\u0188\u018e\3\2\2\2\u0189"+
		"\u018a\f\3\2\2\u018a\u018b\t\3\2\2\u018b\u018d\b\24\1\2\u018c\u0189\3"+
		"\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f"+
		"\'\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\b\25\1\2\u0192\u0193\5&\24"+
		"\2\u0193\u0194\b\25\1\2\u0194\u019c\3\2\2\2\u0195\u0196\f\3\2\2\u0196"+
		"\u0197\t\4\2\2\u0197\u0198\5&\24\2\u0198\u0199\b\25\1\2\u0199\u019b\3"+
		"\2\2\2\u019a\u0195\3\2\2\2\u019b\u019e\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019d\3\2\2\2\u019d)\3\2\2\2\u019e\u019c\3\2\2\2\u019f\u01a0\b\26\1\2"+
		"\u01a0\u01a1\5(\25\2\u01a1\u01a2\b\26\1\2\u01a2\u01af\3\2\2\2\u01a3\u01a4"+
		"\f\4\2\2\u01a4\u01a5\t\5\2\2\u01a5\u01a6\5(\25\2\u01a6\u01a7\b\26\1\2"+
		"\u01a7\u01ae\3\2\2\2\u01a8\u01a9\f\3\2\2\u01a9\u01aa\7.\2\2\u01aa\u01ab"+
		"\5(\25\2\u01ab\u01ac\b\26\1\2\u01ac\u01ae\3\2\2\2\u01ad\u01a3\3\2\2\2"+
		"\u01ad\u01a8\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0+\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\b\27\1\2\u01b3"+
		"\u01b4\5*\26\2\u01b4\u01b5\b\27\1\2\u01b5\u01bd\3\2\2\2\u01b6\u01b7\f"+
		"\3\2\2\u01b7\u01b8\t\6\2\2\u01b8\u01b9\5*\26\2\u01b9\u01ba\b\27\1\2\u01ba"+
		"\u01bc\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2"+
		"\2\2\u01bd\u01be\3\2\2\2\u01be-\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1"+
		"\b\30\1\2\u01c1\u01c2\5,\27\2\u01c2\u01c3\b\30\1\2\u01c3\u01cb\3\2\2\2"+
		"\u01c4\u01c5\f\3\2\2\u01c5\u01c6\t\7\2\2\u01c6\u01c7\5,\27\2\u01c7\u01c8"+
		"\b\30\1\2\u01c8\u01ca\3\2\2\2\u01c9\u01c4\3\2\2\2\u01ca\u01cd\3\2\2\2"+
		"\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc/\3\2\2\2\u01cd\u01cb\3"+
		"\2\2\2\u01ce\u01cf\5.\30\2\u01cf\u01d0\b\31\1\2\u01d0\u01d7\3\2\2\2\u01d1"+
		"\u01d2\5&\24\2\u01d2\u01d3\t\b\2\2\u01d3\u01d4\5\60\31\2\u01d4\u01d5\b"+
		"\31\1\2\u01d5\u01d7\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d7"+
		"\61\3\2\2\2\u01d8\u01d9\5\60\31\2\u01d9\u01da\b\32\1\2\u01da\u0204\3\2"+
		"\2\2\u01db\u01dc\7+\2\2\u01dc\u01dd\5\62\32\2\u01dd\u01de\b\32\1\2\u01de"+
		"\u0204\3\2\2\2\u01df\u01e0\7%\2\2\u01e0\u01e1\5\62\32\2\u01e1\u01e2\7"+
		",\2\2\u01e2\u01e3\5\62\32\2\u01e3\u01e4\b\32\1\2\u01e4\u0204\3\2\2\2\u01e5"+
		"\u01e6\7%\2\2\u01e6\u01e9\5\62\32\2\u01e7\u01e8\7\n\2\2\u01e8\u01ea\5"+
		"\62\32\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ec\t\t\2\2\u01ec\u01ed\5\62\32\2\u01ed\u01ee\7,\2\2\u01ee\u01ef\5"+
		"\62\32\2\u01ef\u01f0\b\32\1\2\u01f0\u0204\3\2\2\2\u01f1\u01f2\7&\2\2\u01f2"+
		"\u01f3\5\62\32\2\u01f3\u01f6\5\4\3\2\u01f4\u01f5\7(\2\2\u01f5\u01f7\5"+
		"\4\3\2\u01f6\u01f4\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f7\u01f8\3\2\2\2\u01f8"+
		"\u01f9\b\32\1\2\u01f9\u0204\3\2\2\2\u01fa\u01fb\5\32\16\2\u01fb\u01fc"+
		"\b\32\1\2\u01fc\u0204\3\2\2\2\u01fd\u01fe\5 \21\2\u01fe\u01ff\b\32\1\2"+
		"\u01ff\u0204\3\2\2\2\u0200\u0201\5\34\17\2\u0201\u0202\b\32\1\2\u0202"+
		"\u0204\3\2\2\2\u0203\u01d8\3\2\2\2\u0203\u01db\3\2\2\2\u0203\u01df\3\2"+
		"\2\2\u0203\u01e5\3\2\2\2\u0203\u01f1\3\2\2\2\u0203\u01fa\3\2\2\2\u0203"+
		"\u01fd\3\2\2\2\u0203\u0200\3\2\2\2\u0204\63\3\2\2\2/9@I\\dnrz\u0081\u008f"+
		"\u0097\u009f\u00a8\u00b1\u00b7\u00c0\u00c7\u00cf\u00d8\u00df\u00e3\u00ed"+
		"\u00f4\u0107\u0116\u011a\u0122\u012e\u013a\u0143\u014e\u0166\u0176\u0178"+
		"\u0187\u018e\u019c\u01ad\u01af\u01bd\u01cb\u01d6\u01e9\u01f6\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}