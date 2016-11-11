// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import java.util.HashMap;
import org.apache.commons.lang3.ClassUtils;

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
		T__31=32, T__32=33, Var=34, Def=35, For=36, If=37, Switch=38, Else=39, 
		Enter=40, Catch=41, Clone=42, New=43, Static=44, Do=45, Add=46, Sub=47, 
		Not=48, AryOp=49, Integer=50, Double=51, NEWLINE=52, WS=53, Semi=54, Identifier=55, 
		JavaFullName=56, Letter=57, BlockComment=58, LineComment=59, RawString=60, 
		StringLiteral=61;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_declareStmt = 6, RULE_definitionsList = 7, RULE_argumentsList = 8, 
		RULE_interopArgumentsList = 9, RULE_defineStmt = 10, RULE_lambdaStmt = 11, 
		RULE_callStmt = 12, RULE_switchStmt = 13, RULE_dict = 14, RULE_pair = 15, 
		RULE_list = 16, RULE_value = 17, RULE_topExpr = 18, RULE_unaryExpr = 19, 
		RULE_multiplyExpr = 20, RULE_addExpr = 21, RULE_compareExpr = 22, RULE_logicExpr = 23, 
		RULE_assignExpr = 24, RULE_javaNewExpr = 25, RULE_expr = 26;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "declareStmt", 
		"definitionsList", "argumentsList", "interopArgumentsList", "defineStmt", 
		"lambdaStmt", "callStmt", "switchStmt", "dict", "pair", "list", "value", 
		"topExpr", "unaryExpr", "multiplyExpr", "addExpr", "compareExpr", "logicExpr", 
		"assignExpr", "javaNewExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "':'", 
		"'['", "']'", "'=>'", "'::'", "'..'", "'...'", "'++'", "'--'", "'*'", 
		"'/'", "'%'", "'+.'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'def'", null, "'if'", 
		"'switch'", "'else'", "'enter'", "'catch'", "'clone'", "'new'", "'static'", 
		"'do'", "'+'", "'-'", "'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "Var", "Def", 
		"For", "If", "Switch", "Else", "Enter", "Catch", "Clone", "New", "Static", 
		"Do", "Add", "Sub", "Not", "AryOp", "Integer", "Double", "NEWLINE", "WS", 
		"Semi", "Identifier", "JavaFullName", "Letter", "BlockComment", "LineComment", 
		"RawString", "StringLiteral"
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


	    public static SObject getClassByName(String classname, Token tok) {
	        try {
	            return new SObject(ClassUtils.getClass(classname));
	        } catch(Exception e) {
	            ErrorHandler.print(4056, "cannot initiate " + classname, new Atom(tok));
	            return null;
	        }
	    }

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
		public TerminalNode EOF() { return getToken(EugineParser.EOF, 0); }
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
			setState(63);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__4:
			case T__9:
			case Var:
			case Def:
			case For:
			case If:
			case Switch:
			case Enter:
			case Clone:
			case New:
			case Static:
			case Sub:
			case Not:
			case Integer:
			case Double:
			case Semi:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(57); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(54);
					((ProgContext)_localctx).block = block();
					 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
					}
					}
					setState(59); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(EOF);
				 ((ProgContext)_localctx).v =  new SNull(); 
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(65);
				match(T__0);
				setState(66);
				((CodeContext)_localctx).B1 = block();
				setState(67);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(69);
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
			setState(77); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(74);
					((BlockContext)_localctx).stmt = stmt();
					 ((SEChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(79); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				importStmt();
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
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
			setState(100);
			match(T__2);
			{
			setState(101);
			match(Identifier);
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					match(T__3);
					setState(103);
					match(Identifier);
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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
			setState(109);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(110);
			((EnterStmtContext)_localctx).Body = code();
			setState(116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(111);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(112);
				match(T__4);
				setState(113);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(114);
				match(T__5);
				setState(115);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(118);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(119);
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
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(Var);
				setState(125);
				((DeclareStmtContext)_localctx).Identifier = match(Identifier);
				setState(128);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(126);
					match(T__6);
					setState(127);
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
				setState(131);
				match(Var);
				setState(132);
				((DeclareStmtContext)_localctx).Subject = expr();
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(133);
					match(T__6);
					setState(134);
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
				setState(139);
				((DeclareStmtContext)_localctx).Identifier = match(Identifier);
				setState(140);
				match(T__6);
				setState(141);
				((DeclareStmtContext)_localctx).Value = expr();

				            ((DeclareStmtContext)_localctx).v =  new SESet(new Atom(((DeclareStmtContext)_localctx).Identifier),
				                new SString((((DeclareStmtContext)_localctx).Identifier!=null?((DeclareStmtContext)_localctx).Identifier.getText():null)), ((DeclareStmtContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(144);
				((DeclareStmtContext)_localctx).Subject = expr();
				setState(145);
				match(T__6);
				setState(146);
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
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(T__4);
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(152);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(153);
						match(T__7);
						 _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(160);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(161);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(T__4);
				setState(164);
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
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__4);
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						((ArgumentsListContext)_localctx).InitExpr = expr();
						setState(169);
						match(T__7);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(177);
				((ArgumentsListContext)_localctx).LastExpr = expr();
				setState(178);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(T__4);
				setState(182);
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

	public static class InteropArgumentsListContext extends ParserRuleContext {
		public org.coyove.eugine.util.List<SExpression> args =  new org.coyove.eugine.util.List<SExpression>();
		public org.coyove.eugine.util.List<String> defs =  new org.coyove.eugine.util.List<String>();
		public ExprContext InitExpr;
		public Token InitDef;
		public ExprContext LastExpr;
		public Token LastDef;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> JavaFullName() { return getTokens(EugineParser.JavaFullName); }
		public TerminalNode JavaFullName(int i) {
			return getToken(EugineParser.JavaFullName, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(EugineParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(EugineParser.Identifier, i);
		}
		public InteropArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interopArgumentsList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterInteropArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitInteropArgumentsList(this);
		}
	}

	public final InteropArgumentsListContext interopArgumentsList() throws RecognitionException {
		InteropArgumentsListContext _localctx = new InteropArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_interopArgumentsList);
		int _la;
		try {
			int _alt;
			setState(205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				match(T__4);
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(186);
						((InteropArgumentsListContext)_localctx).InitExpr = expr();
						setState(187);
						match(T__8);
						setState(188);
						((InteropArgumentsListContext)_localctx).InitDef = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Identifier || _la==JavaFullName) ) {
							((InteropArgumentsListContext)_localctx).InitDef = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(189);
						match(T__7);
						 
						                _localctx.args.add(((InteropArgumentsListContext)_localctx).InitExpr.v);
						                _localctx.defs.add((((InteropArgumentsListContext)_localctx).InitDef!=null?((InteropArgumentsListContext)_localctx).InitDef.getText():null).replace("\\", "."));
						            
						}
						} 
					}
					setState(196);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(197);
				((InteropArgumentsListContext)_localctx).LastExpr = expr();
				setState(198);
				match(T__8);
				setState(199);
				((InteropArgumentsListContext)_localctx).LastDef = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==JavaFullName) ) {
					((InteropArgumentsListContext)_localctx).LastDef = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(200);
				match(T__5);

				        _localctx.args.add(((InteropArgumentsListContext)_localctx).LastExpr.v);
				        _localctx.defs.add((((InteropArgumentsListContext)_localctx).LastDef!=null?((InteropArgumentsListContext)_localctx).LastDef.getText():null).replace("\\", "."));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__4);
				setState(204);
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
		public org.coyove.eugine.util.List<SExpression> body =  new org.coyove.eugine.util.List<SExpression>();
		public org.coyove.eugine.util.List<SExpression> decorators =  new org.coyove.eugine.util.List<SExpression>();
		public ExprContext Decorator;
		public ArgumentsListContext argumentsList;
		public Token Identifier;
		public ExprContext Get;
		public DefinitionsListContext Definition;
		public Token Description;
		public StmtContext stmt;
		public TerminalNode Def() { return getToken(EugineParser.Def, 0); }
		public DefinitionsListContext definitionsList() {
			return getRuleContext(DefinitionsListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public List<ArgumentsListContext> argumentsList() {
			return getRuleContexts(ArgumentsListContext.class);
		}
		public ArgumentsListContext argumentsList(int i) {
			return getRuleContext(ArgumentsListContext.class,i);
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
		enterRule(_localctx, 20, RULE_defineStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(Def);
			setState(218);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(T__9);
					setState(209);
					((DefineStmtContext)_localctx).Decorator = expr();
					setState(211);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(210);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(213);
					match(T__10);
					 
					            _localctx.decorators.add(new SECall(((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v, 
					                new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), null));
					        
					}
					} 
				}
				setState(220);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(221);
				((DefineStmtContext)_localctx).Identifier = match(Identifier);
				}
				break;
			case 2:
				{
				setState(222);
				((DefineStmtContext)_localctx).Get = expr();
				}
				break;
			}
			setState(225);
			((DefineStmtContext)_localctx).Definition = definitionsList();
			setState(227);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(226);
				((DefineStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((DefineStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(229);
			match(T__11);
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(230);
				match(T__0);
				setState(236);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(231);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					}
					setState(238);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(239);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(240);
				((DefineStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			            Atom a = ((DefineStmtContext)_localctx).Identifier != null ? new Atom(((DefineStmtContext)_localctx).Identifier) : new Atom((((DefineStmtContext)_localctx).Get!=null?(((DefineStmtContext)_localctx).Get.start):null));
			            SExpression sub = ((DefineStmtContext)_localctx).Identifier != null ? new SString((((DefineStmtContext)_localctx).Identifier!=null?((DefineStmtContext)_localctx).Identifier.getText():null)) : ((DefineStmtContext)_localctx).Get.v;
			            SExpression lambda = new SELambda(a, ((DefineStmtContext)_localctx).Definition.v, _localctx.body, ((DefineStmtContext)_localctx).Description == null ? "" : (((DefineStmtContext)_localctx).Description!=null?((DefineStmtContext)_localctx).Description.getText():null));

			            if (((DefineStmtContext)_localctx).Identifier != null || ((DefineStmtContext)_localctx).Get.v instanceof SEGet) {
			                for (SExpression d : _localctx.decorators) {
			                    lambda = new SECall(d, org.coyove.eugine.util.List.build(lambda), a, null);
			                }
			                
			                ((DefineStmtContext)_localctx).v =  new SESet(a, sub, lambda, SESet.DECLARE.DECLARE, SESet.ACTION.IMMUTABLE);
			            } else {
			                // error
			                ((DefineStmtContext)_localctx).v =  new SNull();
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
		enterRule(_localctx, 22, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(248);
			match(T__11);
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(249);
				match(T__0);
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(250);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(259);
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
		enterRule(_localctx, 24, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			((CallStmtContext)_localctx).Identifier = match(Identifier);
			setState(267);
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
		enterRule(_localctx, 26, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(271);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(272);
			match(Do);
			setState(273);
			match(T__0);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__9) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(274);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(275);
				match(T__11);
				setState(276);
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
				setState(283);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(284);
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
		enterRule(_localctx, 28, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				match(T__0);
				setState(288);
				((DictContext)_localctx).pair = pair();
				 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
				setState(296);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(290);
						match(T__7);
						setState(291);
						((DictContext)_localctx).pair = pair();
						 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(298);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(300);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(299);
					match(T__7);
					}
				}

				setState(302);
				match(T__1);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				match(T__0);
				setState(306);
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
		enterRule(_localctx, 30, RULE_pair);
		int _la;
		try {
			setState(320);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(310);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(311);
				match(T__8);
				setState(312);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(315);
				((PairContext)_localctx).Key = match(Identifier);
				setState(316);
				match(T__8);
				setState(317);
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
		enterRule(_localctx, 32, RULE_list);
		int _la;
		try {
			setState(341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(322);
				match(T__9);
				{
				setState(323);
				((ListContext)_localctx).value = value();
				 _localctx.ret.add(((ListContext)_localctx).value.v); 
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(326);
					match(T__7);
					setState(327);
					((ListContext)_localctx).value = value();
					 _localctx.ret.add(((ListContext)_localctx).value.v); 
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(335);
				match(T__10);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(T__9);
				setState(339);
				match(T__10);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
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
		public LambdaStmtContext lambdaStmt;
		public Token Identifier;
		public Token RawString;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
		public Token Op;
		public Token Method;
		public InteropArgumentsListContext interopArgumentsList;
		public ArgumentsListContext argumentsList;
		public ExprContext Key;
		public ExprContext Start;
		public ExprContext End;
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public LambdaStmtContext lambdaStmt() {
			return getRuleContext(LambdaStmtContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode Integer() { return getToken(EugineParser.Integer, 0); }
		public TerminalNode Double() { return getToken(EugineParser.Double, 0); }
		public InteropArgumentsListContext interopArgumentsList() {
			return getRuleContext(InteropArgumentsListContext.class,0);
		}
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_topExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(355);
				match(T__4);
				setState(356);
				((TopExprContext)_localctx).Inner = stmt();
				setState(357);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				{
				setState(360);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				{
				setState(363);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new SEVariable((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 4:
				{
				setState(365);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 5:
				{
				setState(367);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 6:
				{
				setState(369);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInteger((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 7:
				{
				setState(371);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SDouble((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(407);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(405);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
					case 1:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(375);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(376);
						((TopExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__8 || _la==T__12) ) {
							((TopExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(377);
						((TopExprContext)_localctx).Method = match(Identifier);
						setState(378);
						((TopExprContext)_localctx).interopArgumentsList = interopArgumentsList();

						                      ((TopExprContext)_localctx).v =  new SEInteropMethod(new Atom((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null)), ((TopExprContext)_localctx).Called.v,
						                          (((TopExprContext)_localctx).Method!=null?((TopExprContext)_localctx).Method.getText():null), ((TopExprContext)_localctx).interopArgumentsList.defs, ((TopExprContext)_localctx).interopArgumentsList.args, 
						                          (((TopExprContext)_localctx).Op!=null?((TopExprContext)_localctx).Op.getText():null).equals("::") ? 
						                              SEInteropMethod.RETURN_TYPE.CAST_TO_SVALUE :
						                              SEInteropMethod.RETURN_TYPE.DIRECT_RETURN);
						                  
						}
						break;
					case 2:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(381);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(382);
						((TopExprContext)_localctx).argumentsList = argumentsList();
						 
						                      if (SKeywordsANTLR.KeywordsLookup.containsKey((((TopExprContext)_localctx).Called!=null?_input.getText(((TopExprContext)_localctx).Called.start,((TopExprContext)_localctx).Called.stop):null))) {
						                          ((TopExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((TopExprContext)_localctx).Called!=null?_input.getText(((TopExprContext)_localctx).Called.start,((TopExprContext)_localctx).Called.stop):null)).call((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null), ((TopExprContext)_localctx).argumentsList.v); 
						                      } else {
						                          ((TopExprContext)_localctx).v =  new SECall(((TopExprContext)_localctx).Called.v, ((TopExprContext)_localctx).argumentsList.v, new Atom((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null)), null);
						                      }
						                  
						}
						break;
					case 3:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(385);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(386);
						match(T__9);
						setState(387);
						((TopExprContext)_localctx).Key = expr();
						setState(388);
						match(T__10);

						                      ((TopExprContext)_localctx).v =  new SEGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, org.coyove.eugine.util.List.build(((TopExprContext)_localctx).Key.v));
						                  
						}
						break;
					case 4:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(391);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(392);
						match(T__9);
						setState(393);
						((TopExprContext)_localctx).Start = expr();
						setState(394);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(396);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__9) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
							{
							setState(395);
							((TopExprContext)_localctx).End = expr();
							}
						}

						setState(398);
						match(T__10);

						                      ((TopExprContext)_localctx).v =  new SESub(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, ((TopExprContext)_localctx).Start.v, ((TopExprContext)_localctx).End == null ? null : ((TopExprContext)_localctx).End.v);
						                  
						}
						break;
					case 5:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(401);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(402);
						match(T__3);
						setState(403);
						((TopExprContext)_localctx).Identifier = match(Identifier);

						                      ((TopExprContext)_localctx).v =  new SEGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, 
						                          org.coyove.eugine.util.List.build(new SString((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null))));
						                  
						}
						break;
					}
					} 
				}
				setState(409);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_unaryExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			switch (_input.LA(1)) {
			case T__4:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				{
				setState(411);
				((UnaryExprContext)_localctx).Top = topExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				{
				setState(414);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(415);
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
				setState(418);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(419);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            ((UnaryExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((UnaryExprContext)_localctx).Not!=null?((UnaryExprContext)_localctx).Not.getText():null)).call(((UnaryExprContext)_localctx).Not, 
				                org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Right.v));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
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
					{
					_localctx = new UnaryExprContext(_parentctx, _parentState);
					_localctx.Left = _prevctx;
					_localctx.Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_unaryExpr);
					setState(424);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(425);
					((UnaryExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__15 || _la==T__16) ) {
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_multiplyExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(433);
			((MultiplyExprContext)_localctx).Top = unaryExpr(0);
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
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
					_localctx = new MultiplyExprContext(_parentctx, _parentState);
					_localctx.Left = _prevctx;
					_localctx.Left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
					setState(436);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(437);
					((MultiplyExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
						((MultiplyExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(438);
					((MultiplyExprContext)_localctx).Right = unaryExpr(0);

					                      ((MultiplyExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((MultiplyExprContext)_localctx).Op!=null?((MultiplyExprContext)_localctx).Op.getText():null)).call(((MultiplyExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v));
					                  
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(447);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(462);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(460);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(450);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(451);
						((AddExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__20 || _la==Add) ) {
							((AddExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(452);
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
						setState(455);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(456);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(457);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new SEElemArith(new Atom(((AddExprContext)_localctx).Sub), 
						                          org.coyove.eugine.util.List.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), SEElemArith.ACTION.SUBTRACT);
						                  
						}
						break;
					}
					} 
				}
				setState(464);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_compareExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(466);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
					setState(469);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(470);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(471);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null)).call(((CompareExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		public Token JavaFullName;
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode JavaFullName() { return getToken(EugineParser.JavaFullName, 0); }
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(480);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(492);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(483);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(484);
						((LogicExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__28) ) {
							((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(485);
						((LogicExprContext)_localctx).Right = compareExpr(0);

						                      ((LogicExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null)).call(((LogicExprContext)_localctx).Op, 
						                          org.coyove.eugine.util.List.build(((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v));
						                  
						}
						break;
					case 2:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(488);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(489);
						match(T__8);
						setState(490);
						((LogicExprContext)_localctx).JavaFullName = match(JavaFullName);

						                      ((LogicExprContext)_localctx).v =  new SEInteropCast(new Atom(((LogicExprContext)_localctx).JavaFullName), ((LogicExprContext)_localctx).Left.v, (((LogicExprContext)_localctx).JavaFullName!=null?((LogicExprContext)_localctx).JavaFullName.getText():null));
						                  
						}
						break;
					}
					} 
				}
				setState(496);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		enterRule(_localctx, 48, RULE_assignExpr);
		int _la;
		try {
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(497);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				((AssignExprContext)_localctx).Left = unaryExpr(0);
				setState(501);
				((AssignExprContext)_localctx).Op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32))) != 0)) ) {
					((AssignExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(502);
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

	public static class JavaNewExprContext extends ParserRuleContext {
		public SExpression v;
		public Token New;
		public Token JavaFullName;
		public InteropArgumentsListContext interopArgumentsList;
		public TerminalNode New() { return getToken(EugineParser.New, 0); }
		public TerminalNode JavaFullName() { return getToken(EugineParser.JavaFullName, 0); }
		public InteropArgumentsListContext interopArgumentsList() {
			return getRuleContext(InteropArgumentsListContext.class,0);
		}
		public JavaNewExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_javaNewExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterJavaNewExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitJavaNewExpr(this);
		}
	}

	public final JavaNewExprContext javaNewExpr() throws RecognitionException {
		JavaNewExprContext _localctx = new JavaNewExprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_javaNewExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			((JavaNewExprContext)_localctx).New = match(New);
			setState(508);
			((JavaNewExprContext)_localctx).JavaFullName = match(JavaFullName);
			setState(509);
			((JavaNewExprContext)_localctx).interopArgumentsList = interopArgumentsList();

			            String classname = (((JavaNewExprContext)_localctx).JavaFullName!=null?((JavaNewExprContext)_localctx).JavaFullName.getText():null).replace("\\", ".");
			            ((JavaNewExprContext)_localctx).v =  new SEInteropNew(new Atom(((JavaNewExprContext)_localctx).New), getClassByName(classname, ((JavaNewExprContext)_localctx).New),
			                ((JavaNewExprContext)_localctx).interopArgumentsList.defs, ((JavaNewExprContext)_localctx).interopArgumentsList.args);
			        
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
		public JavaNewExprContext javaNewExpr;
		public Token Static;
		public Token JavaFullName;
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
		public JavaNewExprContext javaNewExpr() {
			return getRuleContext(JavaNewExprContext.class,0);
		}
		public TerminalNode Static() { return getToken(EugineParser.Static, 0); }
		public TerminalNode JavaFullName() { return getToken(EugineParser.JavaFullName, 0); }
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
		enterRule(_localctx, 52, RULE_expr);
		int _la;
		try {
			setState(561);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				((ExprContext)_localctx).assignExpr = assignExpr();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(515);
				((ExprContext)_localctx).javaNewExpr = javaNewExpr();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).javaNewExpr.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(518);
				((ExprContext)_localctx).Static = match(Static);
				setState(519);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				 ((ExprContext)_localctx).v =  getClassByName((((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", "."), ((ExprContext)_localctx).Static); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(521);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(522);
				((ExprContext)_localctx).Subject = expr();

				            ((ExprContext)_localctx).v =  new SEClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v);
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(525);
				((ExprContext)_localctx).For = match(For);
				setState(526);
				((ExprContext)_localctx).Subject = expr();
				setState(527);
				match(Do);
				setState(528);
				((ExprContext)_localctx).Body = expr();
				 
				            ((ExprContext)_localctx).v =  new SEFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? SEFor.DIRECTION.ASC : SEFor.DIRECTION.DESC); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(531);
				((ExprContext)_localctx).For = match(For);
				setState(532);
				((ExprContext)_localctx).Start = expr();
				setState(535);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(533);
					match(T__7);
					setState(534);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(537);
				_la = _input.LA(1);
				if ( !(_la==T__13 || _la==T__14) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(538);
				((ExprContext)_localctx).End = expr();
				setState(539);
				match(Do);
				setState(540);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(543);
				((ExprContext)_localctx).If = match(If);
				setState(544);
				((ExprContext)_localctx).Condition = expr();
				setState(545);
				((ExprContext)_localctx).True = code();
				setState(548);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(546);
					match(Else);
					setState(547);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new SEIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(552);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(555);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(558);
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
		case 18:
			return topExpr_sempred((TopExprContext)_localctx, predIndex);
		case 19:
			return unaryExpr_sempred((UnaryExprContext)_localctx, predIndex);
		case 20:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 21:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 22:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 23:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean topExpr_sempred(TopExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 10);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		}
		return true;
	}
	private boolean unaryExpr_sempred(UnaryExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compareExpr_sempred(CompareExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3?\u0236\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\6\2<\n\2\r\2\16\2=\3\2\3\2"+
		"\5\2B\n\2\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\4\3\4\3\4\6\4P\n\4\r"+
		"\4\16\4Q\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\5\7w\n\7\3\7\3\7\5\7{\n\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u0083"+
		"\n\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u0098\n\b\3\t\3\t\3\t\3\t\7\t\u009e\n\t\f\t\16\t"+
		"\u00a1\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u00a8\n\t\3\n\3\n\3\n\3\n\3\n\7\n"+
		"\u00af\n\n\f\n\16\n\u00b2\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ba\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00c3\n\13\f\13\16\13\u00c6\13"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13\3\f\3\f\3"+
		"\f\3\f\5\f\u00d6\n\f\3\f\3\f\3\f\7\f\u00db\n\f\f\f\16\f\u00de\13\f\3\f"+
		"\3\f\5\f\u00e2\n\f\3\f\3\f\5\f\u00e6\n\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ed"+
		"\n\f\f\f\16\f\u00f0\13\f\3\f\3\f\3\f\3\f\5\f\u00f6\n\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16\r\u0103\13\r\3\r\3\r\3\r\3\r\5\r"+
		"\u0109\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\7\17\u011a\n\17\f\17\16\17\u011d\13\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0129\n\20\f\20\16\20\u012c\13"+
		"\20\3\20\5\20\u012f\n\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0137\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0143\n\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u014d\n\22\f\22\16\22\u0150\13"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0158\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u0163\n\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0178\n\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u018f\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\7\24\u0198\n\24\f\24\16\24\u019b\13\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a9\n\25"+
		"\3\25\3\25\3\25\7\25\u01ae\n\25\f\25\16\25\u01b1\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01bc\n\26\f\26\16\26\u01bf\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\7\27\u01cf\n\27\f\27\16\27\u01d2\13\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\7\30\u01dd\n\30\f\30\16\30\u01e0\13\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01ef\n\31\f\31"+
		"\16\31\u01f2\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u01fc"+
		"\n\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u021a\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0227\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\5\34\u0234\n\34\3\34\2\b&(*,.\60\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\f\3\29:\3\2>?\4\2\13\13\17\17\3\2\20"+
		"\21\3\2\22\23\3\2\24\26\4\2\27\27\60\60\3\2\30\35\3\2\36\37\3\2 #\u0263"+
		"\2A\3\2\2\2\4H\3\2\2\2\6O\3\2\2\2\bd\3\2\2\2\nf\3\2\2\2\fo\3\2\2\2\16"+
		"\u0097\3\2\2\2\20\u00a7\3\2\2\2\22\u00b9\3\2\2\2\24\u00cf\3\2\2\2\26\u00d1"+
		"\3\2\2\2\30\u00f9\3\2\2\2\32\u010c\3\2\2\2\34\u0110\3\2\2\2\36\u0136\3"+
		"\2\2\2 \u0142\3\2\2\2\"\u0157\3\2\2\2$\u0162\3\2\2\2&\u0177\3\2\2\2(\u01a8"+
		"\3\2\2\2*\u01b2\3\2\2\2,\u01c0\3\2\2\2.\u01d3\3\2\2\2\60\u01e1\3\2\2\2"+
		"\62\u01fb\3\2\2\2\64\u01fd\3\2\2\2\66\u0233\3\2\2\289\5\6\4\29:\b\2\1"+
		"\2:<\3\2\2\2;8\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?@\7\2\2"+
		"\3@B\b\2\1\2A;\3\2\2\2A?\3\2\2\2B\3\3\2\2\2CD\7\3\2\2DE\5\6\4\2EF\7\4"+
		"\2\2FI\3\2\2\2GI\5\b\5\2HC\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\b\3\1\2K\5\3"+
		"\2\2\2LM\5\b\5\2MN\b\4\1\2NP\3\2\2\2OL\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3"+
		"\2\2\2R\7\3\2\2\2ST\5\n\6\2TU\b\5\1\2Ue\3\2\2\2VW\5\f\7\2WX\b\5\1\2Xe"+
		"\3\2\2\2YZ\5\16\b\2Z[\b\5\1\2[e\3\2\2\2\\]\5\26\f\2]^\b\5\1\2^e\3\2\2"+
		"\2_`\5\66\34\2`a\b\5\1\2ae\3\2\2\2bc\78\2\2ce\b\5\1\2dS\3\2\2\2dV\3\2"+
		"\2\2dY\3\2\2\2d\\\3\2\2\2d_\3\2\2\2db\3\2\2\2e\t\3\2\2\2fg\7\5\2\2gl\7"+
		"9\2\2hi\7\6\2\2ik\79\2\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2m\13\3"+
		"\2\2\2nl\3\2\2\2op\7*\2\2pv\5\4\3\2qr\7+\2\2rs\7\7\2\2st\79\2\2tu\7\b"+
		"\2\2uw\5\4\3\2vq\3\2\2\2vw\3\2\2\2wz\3\2\2\2xy\7/\2\2y{\5\4\3\2zx\3\2"+
		"\2\2z{\3\2\2\2{|\3\2\2\2|}\b\7\1\2}\r\3\2\2\2~\177\7$\2\2\177\u0082\7"+
		"9\2\2\u0080\u0081\7\t\2\2\u0081\u0083\5\66\34\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0098\b\b\1\2\u0085\u0086\7$"+
		"\2\2\u0086\u0089\5\66\34\2\u0087\u0088\7\t\2\2\u0088\u008a\5\66\34\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\b"+
		"\1\2\u008c\u0098\3\2\2\2\u008d\u008e\79\2\2\u008e\u008f\7\t\2\2\u008f"+
		"\u0090\5\66\34\2\u0090\u0091\b\b\1\2\u0091\u0098\3\2\2\2\u0092\u0093\5"+
		"\66\34\2\u0093\u0094\7\t\2\2\u0094\u0095\5\66\34\2\u0095\u0096\b\b\1\2"+
		"\u0096\u0098\3\2\2\2\u0097~\3\2\2\2\u0097\u0085\3\2\2\2\u0097\u008d\3"+
		"\2\2\2\u0097\u0092\3\2\2\2\u0098\17\3\2\2\2\u0099\u009f\7\7\2\2\u009a"+
		"\u009b\79\2\2\u009b\u009c\7\n\2\2\u009c\u009e\b\t\1\2\u009d\u009a\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\79\2\2\u00a3\u00a4\7\b"+
		"\2\2\u00a4\u00a8\b\t\1\2\u00a5\u00a6\7\7\2\2\u00a6\u00a8\7\b\2\2\u00a7"+
		"\u0099\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\21\3\2\2\2\u00a9\u00b0\7\7\2"+
		"\2\u00aa\u00ab\5\66\34\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\b\n\1\2\u00ad"+
		"\u00af\3\2\2\2\u00ae\u00aa\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2"+
		"\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3"+
		"\u00b4\5\66\34\2\u00b4\u00b5\7\b\2\2\u00b5\u00b6\b\n\1\2\u00b6\u00ba\3"+
		"\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00ba\7\b\2\2\u00b9\u00a9\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\23\3\2\2\2\u00bb\u00c4\7\7\2\2\u00bc\u00bd\5\66\34"+
		"\2\u00bd\u00be\7\13\2\2\u00be\u00bf\t\2\2\2\u00bf\u00c0\7\n\2\2\u00c0"+
		"\u00c1\b\13\1\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc\3\2\2\2\u00c3\u00c6\3"+
		"\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6"+
		"\u00c4\3\2\2\2\u00c7\u00c8\5\66\34\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca"+
		"\t\2\2\2\u00ca\u00cb\7\b\2\2\u00cb\u00cc\b\13\1\2\u00cc\u00d0\3\2\2\2"+
		"\u00cd\u00ce\7\7\2\2\u00ce\u00d0\7\b\2\2\u00cf\u00bb\3\2\2\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00dc\7%\2\2\u00d2\u00d3\7\f\2\2\u00d3"+
		"\u00d5\5\66\34\2\u00d4\u00d6\5\22\n\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\r\2\2\u00d8\u00d9\b\f\1\2\u00d9"+
		"\u00db\3\2\2\2\u00da\u00d2\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00e1\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e2\79\2\2\u00e0\u00e2\5\66\34\2\u00e1\u00df\3\2\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\5\20\t\2\u00e4\u00e6\t\3\2\2\u00e5"+
		"\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00f5\7\16"+
		"\2\2\u00e8\u00ee\7\3\2\2\u00e9\u00ea\5\b\5\2\u00ea\u00eb\b\f\1\2\u00eb"+
		"\u00ed\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1"+
		"\u00f6\7\4\2\2\u00f2\u00f3\5\b\5\2\u00f3\u00f4\b\f\1\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00e8\3\2\2\2\u00f5\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f8\b\f\1\2\u00f8\27\3\2\2\2\u00f9\u00fa\5\20\t\2\u00fa\u0108\7\16"+
		"\2\2\u00fb\u0101\7\3\2\2\u00fc\u00fd\5\b\5\2\u00fd\u00fe\b\r\1\2\u00fe"+
		"\u0100\3\2\2\2\u00ff\u00fc\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0109\7\4\2\2\u0105\u0106\5\b\5\2\u0106\u0107\b\r\1\2\u0107\u0109\3\2"+
		"\2\2\u0108\u00fb\3\2\2\2\u0108\u0105\3\2\2\2\u0109\u010a\3\2\2\2\u010a"+
		"\u010b\b\r\1\2\u010b\31\3\2\2\2\u010c\u010d\79\2\2\u010d\u010e\5\22\n"+
		"\2\u010e\u010f\b\16\1\2\u010f\33\3\2\2\2\u0110\u0111\7(\2\2\u0111\u0112"+
		"\5\66\34\2\u0112\u0113\7/\2\2\u0113\u011b\7\3\2\2\u0114\u0115\5\66\34"+
		"\2\u0115\u0116\7\16\2\2\u0116\u0117\5\4\3\2\u0117\u0118\b\17\1\2\u0118"+
		"\u011a\3\2\2\2\u0119\u0114\3\2\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011b\u011c\3\2\2\2\u011c\u011e\3\2\2\2\u011d\u011b\3\2\2\2\u011e"+
		"\u011f\7\4\2\2\u011f\u0120\b\17\1\2\u0120\35\3\2\2\2\u0121\u0122\7\3\2"+
		"\2\u0122\u0123\5 \21\2\u0123\u012a\b\20\1\2\u0124\u0125\7\n\2\2\u0125"+
		"\u0126\5 \21\2\u0126\u0127\b\20\1\2\u0127\u0129\3\2\2\2\u0128\u0124\3"+
		"\2\2\2\u0129\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012d\u012f\7\n\2\2\u012e\u012d\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\4\2\2\u0131"+
		"\u0132\b\20\1\2\u0132\u0137\3\2\2\2\u0133\u0134\7\3\2\2\u0134\u0135\7"+
		"\4\2\2\u0135\u0137\b\20\1\2\u0136\u0121\3\2\2\2\u0136\u0133\3\2\2\2\u0137"+
		"\37\3\2\2\2\u0138\u0139\t\3\2\2\u0139\u013a\7\13\2\2\u013a\u013b\5$\23"+
		"\2\u013b\u013c\b\21\1\2\u013c\u0143\3\2\2\2\u013d\u013e\79\2\2\u013e\u013f"+
		"\7\13\2\2\u013f\u0140\5$\23\2\u0140\u0141\b\21\1\2\u0141\u0143\3\2\2\2"+
		"\u0142\u0138\3\2\2\2\u0142\u013d\3\2\2\2\u0143!\3\2\2\2\u0144\u0145\7"+
		"\f\2\2\u0145\u0146\5$\23\2\u0146\u0147\b\22\1\2\u0147\u014e\3\2\2\2\u0148"+
		"\u0149\7\n\2\2\u0149\u014a\5$\23\2\u014a\u014b\b\22\1\2\u014b\u014d\3"+
		"\2\2\2\u014c\u0148\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7\r"+
		"\2\2\u0152\u0153\b\22\1\2\u0153\u0158\3\2\2\2\u0154\u0155\7\f\2\2\u0155"+
		"\u0156\7\r\2\2\u0156\u0158\b\22\1\2\u0157\u0144\3\2\2\2\u0157\u0154\3"+
		"\2\2\2\u0158#\3\2\2\2\u0159\u015a\5\66\34\2\u015a\u015b\b\23\1\2\u015b"+
		"\u0163\3\2\2\2\u015c\u015d\5\36\20\2\u015d\u015e\b\23\1\2\u015e\u0163"+
		"\3\2\2\2\u015f\u0160\5\"\22\2\u0160\u0161\b\23\1\2\u0161\u0163\3\2\2\2"+
		"\u0162\u0159\3\2\2\2\u0162\u015c\3\2\2\2\u0162\u015f\3\2\2\2\u0163%\3"+
		"\2\2\2\u0164\u0165\b\24\1\2\u0165\u0166\7\7\2\2\u0166\u0167\5\b\5\2\u0167"+
		"\u0168\7\b\2\2\u0168\u0169\b\24\1\2\u0169\u0178\3\2\2\2\u016a\u016b\5"+
		"\30\r\2\u016b\u016c\b\24\1\2\u016c\u0178\3\2\2\2\u016d\u016e\79\2\2\u016e"+
		"\u0178\b\24\1\2\u016f\u0170\7>\2\2\u0170\u0178\b\24\1\2\u0171\u0172\7"+
		"?\2\2\u0172\u0178\b\24\1\2\u0173\u0174\7\64\2\2\u0174\u0178\b\24\1\2\u0175"+
		"\u0176\7\65\2\2\u0176\u0178\b\24\1\2\u0177\u0164\3\2\2\2\u0177\u016a\3"+
		"\2\2\2\u0177\u016d\3\2\2\2\u0177\u016f\3\2\2\2\u0177\u0171\3\2\2\2\u0177"+
		"\u0173\3\2\2\2\u0177\u0175\3\2\2\2\u0178\u0199\3\2\2\2\u0179\u017a\f\r"+
		"\2\2\u017a\u017b\t\4\2\2\u017b\u017c\79\2\2\u017c\u017d\5\24\13\2\u017d"+
		"\u017e\b\24\1\2\u017e\u0198\3\2\2\2\u017f\u0180\f\f\2\2\u0180\u0181\5"+
		"\22\n\2\u0181\u0182\b\24\1\2\u0182\u0198\3\2\2\2\u0183\u0184\f\n\2\2\u0184"+
		"\u0185\7\f\2\2\u0185\u0186\5\66\34\2\u0186\u0187\7\r\2\2\u0187\u0188\b"+
		"\24\1\2\u0188\u0198\3\2\2\2\u0189\u018a\f\t\2\2\u018a\u018b\7\f\2\2\u018b"+
		"\u018c\5\66\34\2\u018c\u018e\t\5\2\2\u018d\u018f\5\66\34\2\u018e\u018d"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\7\r\2\2\u0191"+
		"\u0192\b\24\1\2\u0192\u0198\3\2\2\2\u0193\u0194\f\b\2\2\u0194\u0195\7"+
		"\6\2\2\u0195\u0196\79\2\2\u0196\u0198\b\24\1\2\u0197\u0179\3\2\2\2\u0197"+
		"\u017f\3\2\2\2\u0197\u0183\3\2\2\2\u0197\u0189\3\2\2\2\u0197\u0193\3\2"+
		"\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\'\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u019d\b\25\1\2\u019d\u019e\5&\24"+
		"\2\u019e\u019f\b\25\1\2\u019f\u01a9\3\2\2\2\u01a0\u01a1\7\61\2\2\u01a1"+
		"\u01a2\5&\24\2\u01a2\u01a3\b\25\1\2\u01a3\u01a9\3\2\2\2\u01a4\u01a5\7"+
		"\62\2\2\u01a5\u01a6\5&\24\2\u01a6\u01a7\b\25\1\2\u01a7\u01a9\3\2\2\2\u01a8"+
		"\u019c\3\2\2\2\u01a8\u01a0\3\2\2\2\u01a8\u01a4\3\2\2\2\u01a9\u01af\3\2"+
		"\2\2\u01aa\u01ab\f\3\2\2\u01ab\u01ac\t\6\2\2\u01ac\u01ae\b\25\1\2\u01ad"+
		"\u01aa\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2"+
		"\2\2\u01b0)\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b3\b\26\1\2\u01b3\u01b4"+
		"\5(\25\2\u01b4\u01b5\b\26\1\2\u01b5\u01bd\3\2\2\2\u01b6\u01b7\f\3\2\2"+
		"\u01b7\u01b8\t\7\2\2\u01b8\u01b9\5(\25\2\u01b9\u01ba\b\26\1\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01b6\3\2\2\2\u01bc\u01bf\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd"+
		"\u01be\3\2\2\2\u01be+\3\2\2\2\u01bf\u01bd\3\2\2\2\u01c0\u01c1\b\27\1\2"+
		"\u01c1\u01c2\5*\26\2\u01c2\u01c3\b\27\1\2\u01c3\u01d0\3\2\2\2\u01c4\u01c5"+
		"\f\4\2\2\u01c5\u01c6\t\b\2\2\u01c6\u01c7\5*\26\2\u01c7\u01c8\b\27\1\2"+
		"\u01c8\u01cf\3\2\2\2\u01c9\u01ca\f\3\2\2\u01ca\u01cb\7\61\2\2\u01cb\u01cc"+
		"\5*\26\2\u01cc\u01cd\b\27\1\2\u01cd\u01cf\3\2\2\2\u01ce\u01c4\3\2\2\2"+
		"\u01ce\u01c9\3\2\2\2\u01cf\u01d2\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1-\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d4\b\30\1\2\u01d4"+
		"\u01d5\5,\27\2\u01d5\u01d6\b\30\1\2\u01d6\u01de\3\2\2\2\u01d7\u01d8\f"+
		"\3\2\2\u01d8\u01d9\t\t\2\2\u01d9\u01da\5,\27\2\u01da\u01db\b\30\1\2\u01db"+
		"\u01dd\3\2\2\2\u01dc\u01d7\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc\3\2"+
		"\2\2\u01de\u01df\3\2\2\2\u01df/\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1\u01e2"+
		"\b\31\1\2\u01e2\u01e3\5.\30\2\u01e3\u01e4\b\31\1\2\u01e4\u01f0\3\2\2\2"+
		"\u01e5\u01e6\f\4\2\2\u01e6\u01e7\t\n\2\2\u01e7\u01e8\5.\30\2\u01e8\u01e9"+
		"\b\31\1\2\u01e9\u01ef\3\2\2\2\u01ea\u01eb\f\3\2\2\u01eb\u01ec\7\13\2\2"+
		"\u01ec\u01ed\7:\2\2\u01ed\u01ef\b\31\1\2\u01ee\u01e5\3\2\2\2\u01ee\u01ea"+
		"\3\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\61\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f4\5\60\31\2\u01f4\u01f5\b\32"+
		"\1\2\u01f5\u01fc\3\2\2\2\u01f6\u01f7\5(\25\2\u01f7\u01f8\t\13\2\2\u01f8"+
		"\u01f9\5\62\32\2\u01f9\u01fa\b\32\1\2\u01fa\u01fc\3\2\2\2\u01fb\u01f3"+
		"\3\2\2\2\u01fb\u01f6\3\2\2\2\u01fc\63\3\2\2\2\u01fd\u01fe\7-\2\2\u01fe"+
		"\u01ff\7:\2\2\u01ff\u0200\5\24\13\2\u0200\u0201\b\33\1\2\u0201\65\3\2"+
		"\2\2\u0202\u0203\5\62\32\2\u0203\u0204\b\34\1\2\u0204\u0234\3\2\2\2\u0205"+
		"\u0206\5\64\33\2\u0206\u0207\b\34\1\2\u0207\u0234\3\2\2\2\u0208\u0209"+
		"\7.\2\2\u0209\u020a\7:\2\2\u020a\u0234\b\34\1\2\u020b\u020c\7,\2\2\u020c"+
		"\u020d\5\66\34\2\u020d\u020e\b\34\1\2\u020e\u0234\3\2\2\2\u020f\u0210"+
		"\7&\2\2\u0210\u0211\5\66\34\2\u0211\u0212\7/\2\2\u0212\u0213\5\66\34\2"+
		"\u0213\u0214\b\34\1\2\u0214\u0234\3\2\2\2\u0215\u0216\7&\2\2\u0216\u0219"+
		"\5\66\34\2\u0217\u0218\7\n\2\2\u0218\u021a\5\66\34\2\u0219\u0217\3\2\2"+
		"\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u021c\t\5\2\2\u021c\u021d"+
		"\5\66\34\2\u021d\u021e\7/\2\2\u021e\u021f\5\66\34\2\u021f\u0220\b\34\1"+
		"\2\u0220\u0234\3\2\2\2\u0221\u0222\7\'\2\2\u0222\u0223\5\66\34\2\u0223"+
		"\u0226\5\4\3\2\u0224\u0225\7)\2\2\u0225\u0227\5\4\3\2\u0226\u0224\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u0229\b\34\1\2\u0229"+
		"\u0234\3\2\2\2\u022a\u022b\5\34\17\2\u022b\u022c\b\34\1\2\u022c\u0234"+
		"\3\2\2\2\u022d\u022e\5\"\22\2\u022e\u022f\b\34\1\2\u022f\u0234\3\2\2\2"+
		"\u0230\u0231\5\36\20\2\u0231\u0232\b\34\1\2\u0232\u0234\3\2\2\2\u0233"+
		"\u0202\3\2\2\2\u0233\u0205\3\2\2\2\u0233\u0208\3\2\2\2\u0233\u020b\3\2"+
		"\2\2\u0233\u020f\3\2\2\2\u0233\u0215\3\2\2\2\u0233\u0221\3\2\2\2\u0233"+
		"\u022a\3\2\2\2\u0233\u022d\3\2\2\2\u0233\u0230\3\2\2\2\u0234\67\3\2\2"+
		"\2\63=AHQdlvz\u0082\u0089\u0097\u009f\u00a7\u00b0\u00b9\u00c4\u00cf\u00d5"+
		"\u00dc\u00e1\u00e5\u00ee\u00f5\u0101\u0108\u011b\u012a\u012e\u0136\u0142"+
		"\u014e\u0157\u0162\u0177\u018e\u0197\u0199\u01a8\u01af\u01bd\u01ce\u01d0"+
		"\u01de\u01ee\u01f0\u01fb\u0219\u0226\u0233";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}