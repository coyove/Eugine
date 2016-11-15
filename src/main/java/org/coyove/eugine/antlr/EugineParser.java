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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, Var=37, Const=38, Def=39, 
		For=40, If=41, Switch=42, Else=43, Enter=44, Catch=45, Clone=46, Sync=47, 
		Type=48, AddressOf=49, New=50, Static=51, Do=52, Add=53, Sub=54, Not=55, 
		AryOp=56, Integer=57, Double=58, NEWLINE=59, WS=60, Semi=61, Identifier=62, 
		JavaFullName=63, Letter=64, BlockComment=65, LineComment=66, RawString=67, 
		StringLiteral=68;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_syncStmt = 6, RULE_declareStmt = 7, RULE_definitionsList = 8, 
		RULE_argumentsList = 9, RULE_interopArgumentsList = 10, RULE_defineStmt = 11, 
		RULE_lambdaStmt = 12, RULE_callStmt = 13, RULE_switchStmt = 14, RULE_dict = 15, 
		RULE_pair = 16, RULE_list = 17, RULE_value = 18, RULE_topExpr = 19, RULE_unaryExpr = 20, 
		RULE_multiplyExpr = 21, RULE_addExpr = 22, RULE_compareExpr = 23, RULE_logicExpr = 24, 
		RULE_assignExpr = 25, RULE_expr = 26;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "syncStmt", 
		"declareStmt", "definitionsList", "argumentsList", "interopArgumentsList", 
		"defineStmt", "lambdaStmt", "callStmt", "switchStmt", "dict", "pair", 
		"list", "value", "topExpr", "unaryExpr", "multiplyExpr", "addExpr", "compareExpr", 
		"logicExpr", "assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "'&'", "','", 
		"':'", "'['", "']'", "'=>'", "'::'", "':>'", "'#'", "'..'", "'...'", "'++'", 
		"'--'", "'*'", "'/'", "'%'", "'+>'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'const'", 
		"'def'", null, "'if'", "'switch'", "'else'", "'enter'", "'catch'", "'clone'", 
		"'sync'", "'typeof'", "'addressof'", "'new'", "'static'", "'do'", "'+'", 
		"'-'", "'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Var", "Const", "Def", "For", "If", "Switch", "Else", "Enter", "Catch", 
		"Clone", "Sync", "Type", "AddressOf", "New", "Static", "Do", "Add", "Sub", 
		"Not", "AryOp", "Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", 
		"JavaFullName", "Letter", "BlockComment", "LineComment", "RawString", 
		"StringLiteral"
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
			case T__10:
			case Var:
			case Const:
			case Def:
			case For:
			case If:
			case Switch:
			case Enter:
			case Clone:
			case Sync:
			case Type:
			case AddressOf:
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral );
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
		 ((BlockContext)_localctx).v =  new PChain(); 
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
					 ((PChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
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
		public SyncStmtContext syncStmt;
		public DeclareStmtContext declareStmt;
		public DefineStmtContext defineStmt;
		public ExprContext expr;
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public EnterStmtContext enterStmt() {
			return getRuleContext(EnterStmtContext.class,0);
		}
		public SyncStmtContext syncStmt() {
			return getRuleContext(SyncStmtContext.class,0);
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
			setState(101);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				importStmt();
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case Enter:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case Sync:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				((StmtContext)_localctx).syncStmt = syncStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).syncStmt.v; 
				}
				break;
			case Var:
			case Const:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__0:
			case T__4:
			case T__10:
			case For:
			case If:
			case Switch:
			case Clone:
			case Type:
			case AddressOf:
			case New:
			case Static:
			case Sub:
			case Not:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				match(Semi);
				 ((StmtContext)_localctx).v =  new SNull(); 
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
			setState(103);
			match(T__2);
			{
			setState(104);
			match(Identifier);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(T__3);
					setState(106);
					match(Identifier);
					}
					} 
				}
				setState(111);
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
			setState(112);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(113);
			((EnterStmtContext)_localctx).Body = code();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(114);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(115);
				match(T__4);
				setState(116);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(117);
				match(T__5);
				setState(118);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(121);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(122);
				((EnterStmtContext)_localctx).DoBody = code();
				}
				break;
			}

			            ((EnterStmtContext)_localctx).v =  new PEnter(new Atom(((EnterStmtContext)_localctx).Enter), ((EnterStmtContext)_localctx).Body.v, 
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

	public static class SyncStmtContext extends ParserRuleContext {
		public SExpression v;
		public Token Sync;
		public CodeContext Body;
		public TerminalNode Sync() { return getToken(EugineParser.Sync, 0); }
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
		}
		public SyncStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_syncStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterSyncStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitSyncStmt(this);
		}
	}

	public final SyncStmtContext syncStmt() throws RecognitionException {
		SyncStmtContext _localctx = new SyncStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_syncStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((SyncStmtContext)_localctx).Sync = match(Sync);
			setState(128);
			((SyncStmtContext)_localctx).Body = code();
			 ((SyncStmtContext)_localctx).v =  new PSync(new Atom(((SyncStmtContext)_localctx).Sync), ((SyncStmtContext)_localctx).Body.v); 
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
		public Token Action;
		public Token Identifier;
		public ExprContext Value;
		public ExprContext Subject;
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode Var() { return getToken(EugineParser.Var, 0); }
		public TerminalNode Const() { return getToken(EugineParser.Const, 0); }
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
		enterRule(_localctx, 14, RULE_declareStmt);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				((DeclareStmtContext)_localctx).Action = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Var || _la==Const) ) {
					((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(132);
				((DeclareStmtContext)_localctx).Identifier = match(Identifier);
				setState(135);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(133);
					match(T__6);
					setState(134);
					((DeclareStmtContext)_localctx).Value = expr();
					}
					break;
				}

				            ((DeclareStmtContext)_localctx).v =  new PSet(new Atom(((DeclareStmtContext)_localctx).Identifier), new SString((((DeclareStmtContext)_localctx).Identifier!=null?((DeclareStmtContext)_localctx).Identifier.getText():null)), 
				                (((DeclareStmtContext)_localctx).Value!=null?(((DeclareStmtContext)_localctx).Value.start):null) == null ? new SNull() : ((DeclareStmtContext)_localctx).Value.v, 
				                PSet.DECLARE.DECLARE, 
				                (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.ACTION.MUTABLE : PSet.ACTION.IMMUTABLE);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(138);
				((DeclareStmtContext)_localctx).Action = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Var || _la==Const) ) {
					((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(139);
				((DeclareStmtContext)_localctx).Subject = expr();
				setState(142);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(140);
					match(T__6);
					setState(141);
					((DeclareStmtContext)_localctx).Value = expr();
					}
					break;
				}

				            ((DeclareStmtContext)_localctx).v =  new PSet(new Atom((((DeclareStmtContext)_localctx).Subject!=null?(((DeclareStmtContext)_localctx).Subject.start):null)), ((DeclareStmtContext)_localctx).Subject.v, 
				                (((DeclareStmtContext)_localctx).Value!=null?(((DeclareStmtContext)_localctx).Value.start):null) == null ? new SNull() : ((DeclareStmtContext)_localctx).Value.v, 
				                PSet.DECLARE.SET, 
				                (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.ACTION.MUTABLE : PSet.ACTION.IMMUTABLE);
				        
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
		public org.coyove.eugine.util.List<String> v =  new org.coyove.eugine.util.List<String>();
		public org.coyove.eugine.util.List<Boolean> passByValue =  new org.coyove.eugine.util.List<Boolean>();
		public Token InitStyle;
		public Token InitArg;
		public Token LastStyle;
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
		enterRule(_localctx, 16, RULE_definitionsList);
		int _la;
		try {
			int _alt;
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(T__4);
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(150);
						_la = _input.LA(1);
						if (_la==T__7) {
							{
							setState(149);
							((DefinitionsListContext)_localctx).InitStyle = match(T__7);
							}
						}

						setState(152);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(153);
						match(T__8);
						 
						        _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						        _localctx.passByValue.add(((DefinitionsListContext)_localctx).InitStyle == null);
						    
						}
						} 
					}
					setState(159);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(161);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(160);
					((DefinitionsListContext)_localctx).LastStyle = match(T__7);
					}
				}

				setState(163);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(164);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				        _localctx.passByValue.add(((DefinitionsListContext)_localctx).LastStyle == null);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				match(T__4);
				setState(167);
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
		enterRule(_localctx, 18, RULE_argumentsList);
		try {
			int _alt;
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(T__4);
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(171);
						((ArgumentsListContext)_localctx).InitExpr = expr();
						setState(172);
						match(T__8);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(179);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(180);
				((ArgumentsListContext)_localctx).LastExpr = expr();
				setState(181);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				match(T__4);
				setState(185);
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
		enterRule(_localctx, 20, RULE_interopArgumentsList);
		int _la;
		try {
			int _alt;
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(T__4);
				setState(197);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(189);
						((InteropArgumentsListContext)_localctx).InitExpr = expr();
						setState(190);
						match(T__9);
						setState(191);
						((InteropArgumentsListContext)_localctx).InitDef = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Identifier || _la==JavaFullName) ) {
							((InteropArgumentsListContext)_localctx).InitDef = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(192);
						match(T__8);
						 
						                _localctx.args.add(((InteropArgumentsListContext)_localctx).InitExpr.v);
						                _localctx.defs.add((((InteropArgumentsListContext)_localctx).InitDef!=null?((InteropArgumentsListContext)_localctx).InitDef.getText():null).replace("\\", "."));
						            
						}
						} 
					}
					setState(199);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				}
				setState(200);
				((InteropArgumentsListContext)_localctx).LastExpr = expr();
				setState(201);
				match(T__9);
				setState(202);
				((InteropArgumentsListContext)_localctx).LastDef = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==JavaFullName) ) {
					((InteropArgumentsListContext)_localctx).LastDef = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(203);
				match(T__5);

				        _localctx.args.add(((InteropArgumentsListContext)_localctx).LastExpr.v);
				        _localctx.defs.add((((InteropArgumentsListContext)_localctx).LastDef!=null?((InteropArgumentsListContext)_localctx).LastDef.getText():null).replace("\\", "."));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__4);
				setState(207);
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
		enterRule(_localctx, 22, RULE_defineStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(Def);
			setState(221);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(211);
					match(T__10);
					setState(212);
					((DefineStmtContext)_localctx).Decorator = expr();
					setState(214);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(213);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(216);
					match(T__11);
					 
					            _localctx.decorators.add(new PCall(((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v, 
					                new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), null));
					        
					}
					} 
				}
				setState(223);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(224);
				((DefineStmtContext)_localctx).Identifier = match(Identifier);
				}
				break;
			case 2:
				{
				setState(225);
				((DefineStmtContext)_localctx).Get = expr();
				}
				break;
			}
			setState(228);
			((DefineStmtContext)_localctx).Definition = definitionsList();
			setState(230);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(229);
				((DefineStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((DefineStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(232);
			match(T__12);
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(233);
				match(T__0);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
					{
					{
					setState(234);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(242);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(243);
				((DefineStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			            Atom a = ((DefineStmtContext)_localctx).Identifier != null ? new Atom(((DefineStmtContext)_localctx).Identifier) : new Atom((((DefineStmtContext)_localctx).Get!=null?(((DefineStmtContext)_localctx).Get.start):null));
			            SExpression sub = ((DefineStmtContext)_localctx).Identifier != null ? new SString((((DefineStmtContext)_localctx).Identifier!=null?((DefineStmtContext)_localctx).Identifier.getText():null)) : ((DefineStmtContext)_localctx).Get.v;
			            SExpression lambda = new PLambda(a, ((DefineStmtContext)_localctx).Definition.v, ((DefineStmtContext)_localctx).Definition.passByValue, 
			                _localctx.body, ((DefineStmtContext)_localctx).Description == null ? "" : (((DefineStmtContext)_localctx).Description!=null?((DefineStmtContext)_localctx).Description.getText():null));

			            if (((DefineStmtContext)_localctx).Identifier != null || ((DefineStmtContext)_localctx).Get.v instanceof PGet) {
			                for (SExpression d : _localctx.decorators) {
			                    lambda = new PCall(d, org.coyove.eugine.util.List.build(lambda), a, null);
			                }
			                
			                ((DefineStmtContext)_localctx).v =  new PSet(a, sub, lambda, PSet.DECLARE.DECLARE, PSet.ACTION.IMMUTABLE);
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
		enterRule(_localctx, 24, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(251);
			match(T__12);
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(252);
				match(T__0);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
					{
					{
					setState(253);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(262);
				((LambdaStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			        ((LambdaStmtContext)_localctx).v =  new PLambda(new Atom((((LambdaStmtContext)_localctx).definitionsList!=null?(((LambdaStmtContext)_localctx).definitionsList.start):null)), ((LambdaStmtContext)_localctx).definitionsList.v, ((LambdaStmtContext)_localctx).definitionsList.passByValue,
			            _localctx.body, "anonymous");
			    
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
		enterRule(_localctx, 26, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((CallStmtContext)_localctx).Identifier = match(Identifier);
			setState(270);
			((CallStmtContext)_localctx).argumentsList = argumentsList();

			        String func = (((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null);
			        if (SKeywords.Lookup.containsKey(func)) {
			            ((CallStmtContext)_localctx).v =  SKeywords.Lookup.get(func).call(((CallStmtContext)_localctx).Identifier, ((CallStmtContext)_localctx).argumentsList.v); 
			        } else {
			            ((CallStmtContext)_localctx).v =  new PCall(new PVariable((((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null)), ((CallStmtContext)_localctx).argumentsList.v, new Atom(((CallStmtContext)_localctx).Identifier), null);
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
		enterRule(_localctx, 28, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(274);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(275);
			match(Do);
			setState(276);
			match(T__0);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
				{
				{
				setState(277);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(278);
				match(T__12);
				setState(279);
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
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			match(T__1);

			            ((SwitchStmtContext)_localctx).v =  new PCond(new Atom(((SwitchStmtContext)_localctx).Switch), ((SwitchStmtContext)_localctx).Condition.v, _localctx.branches, _localctx.db);
			        
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
		enterRule(_localctx, 30, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(T__0);
				setState(291);
				((DictContext)_localctx).pair = pair();
				 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
				setState(299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(293);
						match(T__8);
						setState(294);
						((DictContext)_localctx).pair = pair();
						 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(301);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(303);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(302);
					match(T__8);
					}
				}

				setState(305);
				match(T__1);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				match(T__0);
				setState(309);
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
		enterRule(_localctx, 32, RULE_pair);
		int _la;
		try {
			setState(323);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(314);
				match(T__9);
				setState(315);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((PairContext)_localctx).Key = match(Identifier);
				setState(319);
				match(T__9);
				setState(320);
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
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(T__10);
				{
				setState(326);
				((ListContext)_localctx).value = value();
				 _localctx.ret.add(((ListContext)_localctx).value.v); 
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__8) {
					{
					{
					setState(329);
					match(T__8);
					setState(330);
					((ListContext)_localctx).value = value();
					 _localctx.ret.add(((ListContext)_localctx).value.v); 
					}
					}
					setState(337);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(338);
				match(T__11);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(T__10);
				setState(342);
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
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
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
		public Token Mt;
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_topExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(358);
				match(T__4);
				setState(359);
				((TopExprContext)_localctx).Inner = stmt();
				setState(360);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				{
				setState(363);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				{
				setState(366);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 4:
				{
				setState(368);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 5:
				{
				setState(370);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 6:
				{
				setState(372);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInteger((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 7:
				{
				setState(374);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SDouble((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(378);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(379);
						((TopExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((TopExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(380);
						((TopExprContext)_localctx).Method = match(Identifier);
						setState(381);
						((TopExprContext)_localctx).interopArgumentsList = interopArgumentsList();

						                      ((TopExprContext)_localctx).v =  new PInteropCall(new Atom((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null)), ((TopExprContext)_localctx).Called.v,
						                          (((TopExprContext)_localctx).Method!=null?((TopExprContext)_localctx).Method.getText():null), ((TopExprContext)_localctx).interopArgumentsList.defs, ((TopExprContext)_localctx).interopArgumentsList.args, 
						                          (((TopExprContext)_localctx).Op!=null?((TopExprContext)_localctx).Op.getText():null).equals("::") ? 
						                              PInteropCall.RETURN_TYPE.CAST_TO_SVALUE :
						                              PInteropCall.RETURN_TYPE.DIRECT_RETURN);
						                  
						}
						break;
					case 2:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(384);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(386);
						_la = _input.LA(1);
						if (_la==T__15) {
							{
							setState(385);
							((TopExprContext)_localctx).Mt = match(T__15);
							}
						}

						setState(388);
						((TopExprContext)_localctx).argumentsList = argumentsList();

						                      if (((TopExprContext)_localctx).Mt != null) {
						                          ((TopExprContext)_localctx).v =  new PThread(new Atom(((TopExprContext)_localctx).Mt), ((TopExprContext)_localctx).Called.v, ((TopExprContext)_localctx).argumentsList.v);
						                      } else {
						                          if (SKeywords.Lookup.containsKey((((TopExprContext)_localctx).Called!=null?_input.getText(((TopExprContext)_localctx).Called.start,((TopExprContext)_localctx).Called.stop):null))) {
						                              ((TopExprContext)_localctx).v =  SKeywords.Lookup.get((((TopExprContext)_localctx).Called!=null?_input.getText(((TopExprContext)_localctx).Called.start,((TopExprContext)_localctx).Called.stop):null)).call((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null), ((TopExprContext)_localctx).argumentsList.v); 
						                          } else {
						                              ((TopExprContext)_localctx).v =  new PCall(((TopExprContext)_localctx).Called.v, ((TopExprContext)_localctx).argumentsList.v, new Atom((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null)), null);
						                          }
						                      }
						                  
						}
						break;
					case 3:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(391);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(392);
						match(T__10);
						setState(393);
						((TopExprContext)_localctx).Key = expr();
						setState(394);
						match(T__11);

						                      ((TopExprContext)_localctx).v =  new PGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, ((TopExprContext)_localctx).Key.v);
						                  
						}
						break;
					case 4:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(397);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(398);
						match(T__10);
						setState(399);
						((TopExprContext)_localctx).Start = expr();
						setState(400);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(402);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
							{
							setState(401);
							((TopExprContext)_localctx).End = expr();
							}
						}

						setState(404);
						match(T__11);

						                      ((TopExprContext)_localctx).v =  new PSub(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, ((TopExprContext)_localctx).Start.v, ((TopExprContext)_localctx).End == null ? null : ((TopExprContext)_localctx).End.v);
						                  
						}
						break;
					case 5:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(407);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(408);
						match(T__3);
						setState(409);
						((TopExprContext)_localctx).Identifier = match(Identifier);

						                      ((TopExprContext)_localctx).v =  new PGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, new SString((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)));
						                  
						}
						break;
					}
					} 
				}
				setState(415);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_unaryExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			switch (_input.LA(1)) {
			case T__4:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				{
				setState(417);
				((UnaryExprContext)_localctx).Top = topExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				{
				setState(420);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(421);
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
				setState(424);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(425);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            ((UnaryExprContext)_localctx).v =  SKeywords.Lookup.get((((UnaryExprContext)_localctx).Not!=null?((UnaryExprContext)_localctx).Not.getText():null)).call(((UnaryExprContext)_localctx).Not, org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Right.v));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(435);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
					setState(430);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(431);
					((UnaryExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__18 || _la==T__19) ) {
						((UnaryExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}

					                      Atom ha = new Atom(((UnaryExprContext)_localctx).Op);
					                      if ((((UnaryExprContext)_localctx).Op!=null?((UnaryExprContext)_localctx).Op.getText():null).equals("++")) {
					                          ((UnaryExprContext)_localctx).v =  new PSet(ha, ((UnaryExprContext)_localctx).Left.v, 
					                              new PAdd(ha, org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Left.v, new SInteger(1)), false),
					                              PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
					                      } else {
					                          ((UnaryExprContext)_localctx).v =  new PSet(ha, ((UnaryExprContext)_localctx).Left.v, 
					                              new PMath(ha, 
					                                  org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Left.v, new SInteger(1)), PMath.ACTION.SUBTRACT),
					                              PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
					                      }
					                  
					}
					} 
				}
				setState(437);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_multiplyExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(439);
			((MultiplyExprContext)_localctx).Top = unaryExpr(0);
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(449);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
					setState(442);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(443);
					((MultiplyExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						((MultiplyExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(444);
					((MultiplyExprContext)_localctx).Right = unaryExpr(0);

					                      ((MultiplyExprContext)_localctx).v =  SKeywords.Lookup.get((((MultiplyExprContext)_localctx).Op!=null?((MultiplyExprContext)_localctx).Op.getText():null)).call(((MultiplyExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(451);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(453);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(456);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(457);
						((AddExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==Add) ) {
							((AddExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(458);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PAdd(new Atom(((AddExprContext)_localctx).AddOp), 
						                          org.coyove.eugine.util.List.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), (((AddExprContext)_localctx).AddOp!=null?((AddExprContext)_localctx).AddOp.getText():null).equals("+>"));
						                  
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(461);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(462);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(463);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PMath(new Atom(((AddExprContext)_localctx).Sub), 
						                          org.coyove.eugine.util.List.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), PMath.ACTION.SUBTRACT);
						                  
						}
						break;
					}
					} 
				}
				setState(470);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_compareExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(482);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
					setState(475);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(476);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(477);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  SKeywords.Lookup.get((((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null)).call(((CompareExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(484);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(486);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(500);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(498);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(489);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(490);
						((LogicExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(491);
						((LogicExprContext)_localctx).Right = compareExpr(0);

						                      ((LogicExprContext)_localctx).v =  SKeywords.Lookup.get((((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null)).call(((LogicExprContext)_localctx).Op, 
						                          org.coyove.eugine.util.List.build(((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v));
						                  
						}
						break;
					case 2:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(494);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(495);
						match(T__9);
						setState(496);
						((LogicExprContext)_localctx).JavaFullName = match(JavaFullName);

						                      ((LogicExprContext)_localctx).v =  new PInteropCast(new Atom(((LogicExprContext)_localctx).JavaFullName), ((LogicExprContext)_localctx).Left.v, (((LogicExprContext)_localctx).JavaFullName!=null?((LogicExprContext)_localctx).JavaFullName.getText():null));
						                  
						}
						break;
					}
					} 
				}
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		public AssignExprContext Subject;
		public LogicExprContext Top;
		public UnaryExprContext Left;
		public Token Op;
		public AssignExprContext Right;
		public Token Identifier;
		public ExprContext Value;
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public UnaryExprContext unaryExpr() {
			return getRuleContext(UnaryExprContext.class,0);
		}
		public AssignExprContext assignExpr() {
			return getRuleContext(AssignExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		return assignExpr(0);
	}

	private AssignExprContext assignExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssignExprContext _localctx = new AssignExprContext(_ctx, _parentState);
		AssignExprContext _prevctx = _localctx;
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_assignExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(504);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(507);
				((AssignExprContext)_localctx).Left = unaryExpr(0);
				setState(508);
				((AssignExprContext)_localctx).Op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
					((AssignExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(509);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            Atom ha = new Atom(((AssignExprContext)_localctx).Op);
				            if ((((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null).equals("+=")) {
				                ((AssignExprContext)_localctx).v =  new PSet(ha, ((AssignExprContext)_localctx).Left.v, 
				                    new PAdd(ha, org.coyove.eugine.util.List.build(((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), false),
				                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
				            } else {
				                String text = (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null).substring(0, 1);
				                ((AssignExprContext)_localctx).v =  new PSet(ha, ((AssignExprContext)_localctx).Left.v, 
				                    SKeywords.Lookup.get(text).call(((AssignExprContext)_localctx).Op, 
				                        org.coyove.eugine.util.List.build(((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v)),
				                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
				            }
				        
				}
				break;
			case 3:
				{
				setState(512);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(513);
				match(T__6);
				setState(514);
				((AssignExprContext)_localctx).Value = expr();

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Identifier),
				                new SString((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Value.v, PSet.DECLARE.SET, PSet.ACTION.MUTABLE); 
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignExprContext(_parentctx, _parentState);
					_localctx.Subject = _prevctx;
					_localctx.Subject = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assignExpr);
					setState(519);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(520);
					match(T__6);
					setState(521);
					((AssignExprContext)_localctx).Value = expr();

					                      ((AssignExprContext)_localctx).v =  new PSet(new Atom((((AssignExprContext)_localctx).Subject!=null?(((AssignExprContext)_localctx).Subject.start):null)), ((AssignExprContext)_localctx).Subject.v, ((AssignExprContext)_localctx).Value.v, PSet.DECLARE.SET, PSet.ACTION.MUTABLE);    
					                  
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public SExpression v;
		public AssignExprContext assignExpr;
		public Token New;
		public Token JavaFullName;
		public InteropArgumentsListContext interopArgumentsList;
		public Token Static;
		public Token Clone;
		public ExprContext Subject;
		public Token Type;
		public Token AddressOf;
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
		public TerminalNode New() { return getToken(EugineParser.New, 0); }
		public TerminalNode JavaFullName() { return getToken(EugineParser.JavaFullName, 0); }
		public InteropArgumentsListContext interopArgumentsList() {
			return getRuleContext(InteropArgumentsListContext.class,0);
		}
		public TerminalNode Static() { return getToken(EugineParser.Static, 0); }
		public TerminalNode Clone() { return getToken(EugineParser.Clone, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Type() { return getToken(EugineParser.Type, 0); }
		public TerminalNode AddressOf() { return getToken(EugineParser.AddressOf, 0); }
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
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				((ExprContext)_localctx).New = match(New);
				setState(533);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				setState(534);
				((ExprContext)_localctx).interopArgumentsList = interopArgumentsList();

				            String classname = (((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", ".");
				            ((ExprContext)_localctx).v =  new PInteropNew(new Atom(((ExprContext)_localctx).New), getClassByName(classname, ((ExprContext)_localctx).New),
				                ((ExprContext)_localctx).interopArgumentsList.defs, ((ExprContext)_localctx).interopArgumentsList.args);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(537);
				((ExprContext)_localctx).Static = match(Static);
				setState(538);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				 ((ExprContext)_localctx).v =  getClassByName((((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", "."), ((ExprContext)_localctx).Static); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(541);
				((ExprContext)_localctx).Subject = expr();
				 ((ExprContext)_localctx).v =  new PClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(544);
				((ExprContext)_localctx).Type = match(Type);
				setState(545);
				((ExprContext)_localctx).Subject = expr();
				 ((ExprContext)_localctx).v =  new PType(new Atom(((ExprContext)_localctx).Type), ((ExprContext)_localctx).Subject.v, PType.TYPE.TYPE); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(548);
				((ExprContext)_localctx).AddressOf = match(AddressOf);
				setState(549);
				((ExprContext)_localctx).Subject = expr();
				 ((ExprContext)_localctx).v =  new PType(new Atom(((ExprContext)_localctx).AddressOf), ((ExprContext)_localctx).Subject.v, PType.TYPE.ADDR); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(552);
				((ExprContext)_localctx).For = match(For);
				setState(553);
				((ExprContext)_localctx).Subject = expr();
				setState(554);
				match(Do);
				setState(555);
				((ExprContext)_localctx).Body = expr();
				 
				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? PFor.DIRECTION.ASC : PFor.DIRECTION.DESC); 
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(558);
				((ExprContext)_localctx).For = match(For);
				setState(559);
				((ExprContext)_localctx).Start = expr();
				setState(562);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(560);
					match(T__8);
					setState(561);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(564);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(565);
				((ExprContext)_localctx).End = expr();
				setState(566);
				match(Do);
				setState(567);
				((ExprContext)_localctx).Body = expr();
				 
				            PIRange r = new PIRange(new Atom(((ExprContext)_localctx).For), org.coyove.eugine.util.List.build(
				                    ((ExprContext)_localctx).Start.v, 
				                    ((ExprContext)_localctx).Next == null ? 
				                        new SInteger(1) : 
				                        new PMath(new Atom((((ExprContext)_localctx).Next!=null?(((ExprContext)_localctx).Next.start):null)), 
				                            org.coyove.eugine.util.List.build(((ExprContext)_localctx).Next.v, ((ExprContext)_localctx).Start.v),
				                            PMath.ACTION.SUBTRACT), 
				                    ((ExprContext)_localctx).End.v
				                ));
				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), r, ((ExprContext)_localctx).Body.v, PFor.DIRECTION.ASC); 
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(570);
				((ExprContext)_localctx).If = match(If);
				setState(571);
				((ExprContext)_localctx).Condition = expr();
				setState(572);
				((ExprContext)_localctx).True = code();
				setState(575);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(573);
					match(Else);
					setState(574);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new PIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(579);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(582);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(585);
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
		case 19:
			return topExpr_sempred((TopExprContext)_localctx, predIndex);
		case 20:
			return unaryExpr_sempred((UnaryExprContext)_localctx, predIndex);
		case 21:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 22:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 23:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 24:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		case 25:
			return assignExpr_sempred((AssignExprContext)_localctx, predIndex);
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
	private boolean assignExpr_sempred(AssignExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3F\u0251\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\6\2<\n\2\r\2\16\2=\3\2\3\2"+
		"\5\2B\n\2\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\4\3\4\3\4\6\4P\n\4\r"+
		"\4\16\4Q\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t"+
		"\3\t\3\t\5\t\u0095\n\t\3\n\3\n\5\n\u0099\n\n\3\n\3\n\3\n\7\n\u009e\n\n"+
		"\f\n\16\n\u00a1\13\n\3\n\5\n\u00a4\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00ab\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00bd\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\7\f\u00c6\n\f\f\f\16\f\u00c9\13\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u00d3\n\f\3\r\3\r\3\r\3\r\5\r\u00d9\n\r\3\r\3\r\3\r\7\r\u00de\n\r\f\r"+
		"\16\r\u00e1\13\r\3\r\3\r\5\r\u00e5\n\r\3\r\3\r\5\r\u00e9\n\r\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00f0\n\r\f\r\16\r\u00f3\13\r\3\r\3\r\3\r\3\r\5\r\u00f9"+
		"\n\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0103\n\16\f\16\16\16"+
		"\u0106\13\16\3\16\3\16\3\16\3\16\5\16\u010c\n\16\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u011d\n\20"+
		"\f\20\16\20\u0120\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u012c\n\21\f\21\16\21\u012f\13\21\3\21\5\21\u0132\n\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\5\21\u013a\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0146\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0150\n\23\f\23\16\23\u0153\13\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u015b\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u0166\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u017b\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u0185\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0195\n\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\7\25\u019e\n\25\f\25\16\25\u01a1\13\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01af\n\26\3\26\3\26"+
		"\3\26\7\26\u01b4\n\26\f\26\16\26\u01b7\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\7\27\u01c2\n\27\f\27\16\27\u01c5\13\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01d5"+
		"\n\30\f\30\16\30\u01d8\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\7\31\u01e3\n\31\f\31\16\31\u01e6\13\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01f5\n\32\f\32\16\32\u01f8"+
		"\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0208\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u020f\n\33\f\33\16"+
		"\33\u0212\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0235\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0242\n\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u024f\n\34\3\34\2\t(*,."+
		"\60\62\64\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\66\2\r\3\2\'(\3\2@A\3\2EF\3\2\20\21\3\2\23\24\3\2\25\26\3\2\27\31\4\2"+
		"\32\32\67\67\3\2\33 \3\2!\"\3\2#&\u0284\2A\3\2\2\2\4H\3\2\2\2\6O\3\2\2"+
		"\2\bg\3\2\2\2\ni\3\2\2\2\fr\3\2\2\2\16\u0081\3\2\2\2\20\u0094\3\2\2\2"+
		"\22\u00aa\3\2\2\2\24\u00bc\3\2\2\2\26\u00d2\3\2\2\2\30\u00d4\3\2\2\2\32"+
		"\u00fc\3\2\2\2\34\u010f\3\2\2\2\36\u0113\3\2\2\2 \u0139\3\2\2\2\"\u0145"+
		"\3\2\2\2$\u015a\3\2\2\2&\u0165\3\2\2\2(\u017a\3\2\2\2*\u01ae\3\2\2\2,"+
		"\u01b8\3\2\2\2.\u01c6\3\2\2\2\60\u01d9\3\2\2\2\62\u01e7\3\2\2\2\64\u0207"+
		"\3\2\2\2\66\u024e\3\2\2\289\5\6\4\29:\b\2\1\2:<\3\2\2\2;8\3\2\2\2<=\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?@\7\2\2\3@B\b\2\1\2A;\3\2\2\2A?\3"+
		"\2\2\2B\3\3\2\2\2CD\7\3\2\2DE\5\6\4\2EF\7\4\2\2FI\3\2\2\2GI\5\b\5\2HC"+
		"\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\b\3\1\2K\5\3\2\2\2LM\5\b\5\2MN\b\4\1\2"+
		"NP\3\2\2\2OL\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2ST\5\n\6"+
		"\2TU\b\5\1\2Uh\3\2\2\2VW\5\f\7\2WX\b\5\1\2Xh\3\2\2\2YZ\5\16\b\2Z[\b\5"+
		"\1\2[h\3\2\2\2\\]\5\20\t\2]^\b\5\1\2^h\3\2\2\2_`\5\30\r\2`a\b\5\1\2ah"+
		"\3\2\2\2bc\5\66\34\2cd\b\5\1\2dh\3\2\2\2ef\7?\2\2fh\b\5\1\2gS\3\2\2\2"+
		"gV\3\2\2\2gY\3\2\2\2g\\\3\2\2\2g_\3\2\2\2gb\3\2\2\2ge\3\2\2\2h\t\3\2\2"+
		"\2ij\7\5\2\2jo\7@\2\2kl\7\6\2\2ln\7@\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rs\7.\2\2sy\5\4\3\2tu\7/\2\2uv\7\7\2\2"+
		"vw\7@\2\2wx\7\b\2\2xz\5\4\3\2yt\3\2\2\2yz\3\2\2\2z}\3\2\2\2{|\7\66\2\2"+
		"|~\5\4\3\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\7\1\2\u0080\r"+
		"\3\2\2\2\u0081\u0082\7\61\2\2\u0082\u0083\5\4\3\2\u0083\u0084\b\b\1\2"+
		"\u0084\17\3\2\2\2\u0085\u0086\t\2\2\2\u0086\u0089\7@\2\2\u0087\u0088\7"+
		"\t\2\2\u0088\u008a\5\66\34\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u0095\b\t\1\2\u008c\u008d\t\2\2\2\u008d\u0090\5\66"+
		"\34\2\u008e\u008f\7\t\2\2\u008f\u0091\5\66\34\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\t\1\2\u0093\u0095\3\2"+
		"\2\2\u0094\u0085\3\2\2\2\u0094\u008c\3\2\2\2\u0095\21\3\2\2\2\u0096\u009f"+
		"\7\7\2\2\u0097\u0099\7\n\2\2\u0098\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7\13\2\2\u009c\u009e\b\n"+
		"\1\2\u009d\u0098\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\n"+
		"\2\2\u00a3\u00a2\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5"+
		"\u00a6\7@\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00ab\b\n\1\2\u00a8\u00a9\7\7"+
		"\2\2\u00a9\u00ab\7\b\2\2\u00aa\u0096\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab"+
		"\23\3\2\2\2\u00ac\u00b3\7\7\2\2\u00ad\u00ae\5\66\34\2\u00ae\u00af\7\13"+
		"\2\2\u00af\u00b0\b\13\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00b7\5\66\34\2\u00b7\u00b8\7\b\2\2\u00b8"+
		"\u00b9\b\13\1\2\u00b9\u00bd\3\2\2\2\u00ba\u00bb\7\7\2\2\u00bb\u00bd\7"+
		"\b\2\2\u00bc\u00ac\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\25\3\2\2\2\u00be"+
		"\u00c7\7\7\2\2\u00bf\u00c0\5\66\34\2\u00c0\u00c1\7\f\2\2\u00c1\u00c2\t"+
		"\3\2\2\u00c2\u00c3\7\13\2\2\u00c3\u00c4\b\f\1\2\u00c4\u00c6\3\2\2\2\u00c5"+
		"\u00bf\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cb\5\66\34\2\u00cb"+
		"\u00cc\7\f\2\2\u00cc\u00cd\t\3\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf\b\f"+
		"\1\2\u00cf\u00d3\3\2\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d3\7\b\2\2\u00d2"+
		"\u00be\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\27\3\2\2\2\u00d4\u00df\7)\2\2"+
		"\u00d5\u00d6\7\r\2\2\u00d6\u00d8\5\66\34\2\u00d7\u00d9\5\24\13\2\u00d8"+
		"\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\16"+
		"\2\2\u00db\u00dc\b\r\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e4\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\7@\2\2\u00e3\u00e5\5\66\34\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8\5\22"+
		"\n\2\u00e7\u00e9\t\4\2\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00f8\7\17\2\2\u00eb\u00f1\7\3\2\2\u00ec\u00ed\5"+
		"\b\5\2\u00ed\u00ee\b\r\1\2\u00ee\u00f0\3\2\2\2\u00ef\u00ec\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f9\7\4\2\2\u00f5\u00f6\5\b\5\2\u00f6"+
		"\u00f7\b\r\1\2\u00f7\u00f9\3\2\2\2\u00f8\u00eb\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\b\r\1\2\u00fb\31\3\2\2\2\u00fc\u00fd"+
		"\5\22\n\2\u00fd\u010b\7\17\2\2\u00fe\u0104\7\3\2\2\u00ff\u0100\5\b\5\2"+
		"\u0100\u0101\b\16\1\2\u0101\u0103\3\2\2\2\u0102\u00ff\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u010c\7\4\2\2\u0108\u0109\5\b\5\2\u0109\u010a\b\16"+
		"\1\2\u010a\u010c\3\2\2\2\u010b\u00fe\3\2\2\2\u010b\u0108\3\2\2\2\u010c"+
		"\u010d\3\2\2\2\u010d\u010e\b\16\1\2\u010e\33\3\2\2\2\u010f\u0110\7@\2"+
		"\2\u0110\u0111\5\24\13\2\u0111\u0112\b\17\1\2\u0112\35\3\2\2\2\u0113\u0114"+
		"\7,\2\2\u0114\u0115\5\66\34\2\u0115\u0116\7\66\2\2\u0116\u011e\7\3\2\2"+
		"\u0117\u0118\5\66\34\2\u0118\u0119\7\17\2\2\u0119\u011a\5\4\3\2\u011a"+
		"\u011b\b\20\1\2\u011b\u011d\3\2\2\2\u011c\u0117\3\2\2\2\u011d\u0120\3"+
		"\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120"+
		"\u011e\3\2\2\2\u0121\u0122\7\4\2\2\u0122\u0123\b\20\1\2\u0123\37\3\2\2"+
		"\2\u0124\u0125\7\3\2\2\u0125\u0126\5\"\22\2\u0126\u012d\b\21\1\2\u0127"+
		"\u0128\7\13\2\2\u0128\u0129\5\"\22\2\u0129\u012a\b\21\1\2\u012a\u012c"+
		"\3\2\2\2\u012b\u0127\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2\2\2\u012d"+
		"\u012e\3\2\2\2\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0132\7\13"+
		"\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\7\4\2\2\u0134\u0135\b\21\1\2\u0135\u013a\3\2\2\2\u0136\u0137\7"+
		"\3\2\2\u0137\u0138\7\4\2\2\u0138\u013a\b\21\1\2\u0139\u0124\3\2\2\2\u0139"+
		"\u0136\3\2\2\2\u013a!\3\2\2\2\u013b\u013c\t\4\2\2\u013c\u013d\7\f\2\2"+
		"\u013d\u013e\5&\24\2\u013e\u013f\b\22\1\2\u013f\u0146\3\2\2\2\u0140\u0141"+
		"\7@\2\2\u0141\u0142\7\f\2\2\u0142\u0143\5&\24\2\u0143\u0144\b\22\1\2\u0144"+
		"\u0146\3\2\2\2\u0145\u013b\3\2\2\2\u0145\u0140\3\2\2\2\u0146#\3\2\2\2"+
		"\u0147\u0148\7\r\2\2\u0148\u0149\5&\24\2\u0149\u014a\b\23\1\2\u014a\u0151"+
		"\3\2\2\2\u014b\u014c\7\13\2\2\u014c\u014d\5&\24\2\u014d\u014e\b\23\1\2"+
		"\u014e\u0150\3\2\2\2\u014f\u014b\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u014f"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\3\2\2\2\u0153\u0151\3\2\2\2\u0154"+
		"\u0155\7\16\2\2\u0155\u0156\b\23\1\2\u0156\u015b\3\2\2\2\u0157\u0158\7"+
		"\r\2\2\u0158\u0159\7\16\2\2\u0159\u015b\b\23\1\2\u015a\u0147\3\2\2\2\u015a"+
		"\u0157\3\2\2\2\u015b%\3\2\2\2\u015c\u015d\5\66\34\2\u015d\u015e\b\24\1"+
		"\2\u015e\u0166\3\2\2\2\u015f\u0160\5 \21\2\u0160\u0161\b\24\1\2\u0161"+
		"\u0166\3\2\2\2\u0162\u0163\5$\23\2\u0163\u0164\b\24\1\2\u0164\u0166\3"+
		"\2\2\2\u0165\u015c\3\2\2\2\u0165\u015f\3\2\2\2\u0165\u0162\3\2\2\2\u0166"+
		"\'\3\2\2\2\u0167\u0168\b\25\1\2\u0168\u0169\7\7\2\2\u0169\u016a\5\b\5"+
		"\2\u016a\u016b\7\b\2\2\u016b\u016c\b\25\1\2\u016c\u017b\3\2\2\2\u016d"+
		"\u016e\5\32\16\2\u016e\u016f\b\25\1\2\u016f\u017b\3\2\2\2\u0170\u0171"+
		"\7@\2\2\u0171\u017b\b\25\1\2\u0172\u0173\7E\2\2\u0173\u017b\b\25\1\2\u0174"+
		"\u0175\7F\2\2\u0175\u017b\b\25\1\2\u0176\u0177\7;\2\2\u0177\u017b\b\25"+
		"\1\2\u0178\u0179\7<\2\2\u0179\u017b\b\25\1\2\u017a\u0167\3\2\2\2\u017a"+
		"\u016d\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0172\3\2\2\2\u017a\u0174\3\2"+
		"\2\2\u017a\u0176\3\2\2\2\u017a\u0178\3\2\2\2\u017b\u019f\3\2\2\2\u017c"+
		"\u017d\f\r\2\2\u017d\u017e\t\5\2\2\u017e\u017f\7@\2\2\u017f\u0180\5\26"+
		"\f\2\u0180\u0181\b\25\1\2\u0181\u019e\3\2\2\2\u0182\u0184\f\f\2\2\u0183"+
		"\u0185\7\22\2\2\u0184\u0183\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\3"+
		"\2\2\2\u0186\u0187\5\24\13\2\u0187\u0188\b\25\1\2\u0188\u019e\3\2\2\2"+
		"\u0189\u018a\f\n\2\2\u018a\u018b\7\r\2\2\u018b\u018c\5\66\34\2\u018c\u018d"+
		"\7\16\2\2\u018d\u018e\b\25\1\2\u018e\u019e\3\2\2\2\u018f\u0190\f\t\2\2"+
		"\u0190\u0191\7\r\2\2\u0191\u0192\5\66\34\2\u0192\u0194\t\6\2\2\u0193\u0195"+
		"\5\66\34\2\u0194\u0193\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\3\2\2\2"+
		"\u0196\u0197\7\16\2\2\u0197\u0198\b\25\1\2\u0198\u019e\3\2\2\2\u0199\u019a"+
		"\f\b\2\2\u019a\u019b\7\6\2\2\u019b\u019c\7@\2\2\u019c\u019e\b\25\1\2\u019d"+
		"\u017c\3\2\2\2\u019d\u0182\3\2\2\2\u019d\u0189\3\2\2\2\u019d\u018f\3\2"+
		"\2\2\u019d\u0199\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0)\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\b\26\1\2"+
		"\u01a3\u01a4\5(\25\2\u01a4\u01a5\b\26\1\2\u01a5\u01af\3\2\2\2\u01a6\u01a7"+
		"\78\2\2\u01a7\u01a8\5(\25\2\u01a8\u01a9\b\26\1\2\u01a9\u01af\3\2\2\2\u01aa"+
		"\u01ab\79\2\2\u01ab\u01ac\5(\25\2\u01ac\u01ad\b\26\1\2\u01ad\u01af\3\2"+
		"\2\2\u01ae\u01a2\3\2\2\2\u01ae\u01a6\3\2\2\2\u01ae\u01aa\3\2\2\2\u01af"+
		"\u01b5\3\2\2\2\u01b0\u01b1\f\3\2\2\u01b1\u01b2\t\7\2\2\u01b2\u01b4\b\26"+
		"\1\2\u01b3\u01b0\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5"+
		"\u01b6\3\2\2\2\u01b6+\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01b9\b\27\1\2"+
		"\u01b9\u01ba\5*\26\2\u01ba\u01bb\b\27\1\2\u01bb\u01c3\3\2\2\2\u01bc\u01bd"+
		"\f\3\2\2\u01bd\u01be\t\b\2\2\u01be\u01bf\5*\26\2\u01bf\u01c0\b\27\1\2"+
		"\u01c0\u01c2\3\2\2\2\u01c1\u01bc\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1"+
		"\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4-\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6"+
		"\u01c7\b\30\1\2\u01c7\u01c8\5,\27\2\u01c8\u01c9\b\30\1\2\u01c9\u01d6\3"+
		"\2\2\2\u01ca\u01cb\f\4\2\2\u01cb\u01cc\t\t\2\2\u01cc\u01cd\5,\27\2\u01cd"+
		"\u01ce\b\30\1\2\u01ce\u01d5\3\2\2\2\u01cf\u01d0\f\3\2\2\u01d0\u01d1\7"+
		"8\2\2\u01d1\u01d2\5,\27\2\u01d2\u01d3\b\30\1\2\u01d3\u01d5\3\2\2\2\u01d4"+
		"\u01ca\3\2\2\2\u01d4\u01cf\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2"+
		"\2\2\u01d6\u01d7\3\2\2\2\u01d7/\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01da"+
		"\b\31\1\2\u01da\u01db\5.\30\2\u01db\u01dc\b\31\1\2\u01dc\u01e4\3\2\2\2"+
		"\u01dd\u01de\f\3\2\2\u01de\u01df\t\n\2\2\u01df\u01e0\5.\30\2\u01e0\u01e1"+
		"\b\31\1\2\u01e1\u01e3\3\2\2\2\u01e2\u01dd\3\2\2\2\u01e3\u01e6\3\2\2\2"+
		"\u01e4\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\61\3\2\2\2\u01e6\u01e4"+
		"\3\2\2\2\u01e7\u01e8\b\32\1\2\u01e8\u01e9\5\60\31\2\u01e9\u01ea\b\32\1"+
		"\2\u01ea\u01f6\3\2\2\2\u01eb\u01ec\f\4\2\2\u01ec\u01ed\t\13\2\2\u01ed"+
		"\u01ee\5\60\31\2\u01ee\u01ef\b\32\1\2\u01ef\u01f5\3\2\2\2\u01f0\u01f1"+
		"\f\3\2\2\u01f1\u01f2\7\f\2\2\u01f2\u01f3\7A\2\2\u01f3\u01f5\b\32\1\2\u01f4"+
		"\u01eb\3\2\2\2\u01f4\u01f0\3\2\2\2\u01f5\u01f8\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f6\u01f7\3\2\2\2\u01f7\63\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa"+
		"\b\33\1\2\u01fa\u01fb\5\62\32\2\u01fb\u01fc\b\33\1\2\u01fc\u0208\3\2\2"+
		"\2\u01fd\u01fe\5*\26\2\u01fe\u01ff\t\f\2\2\u01ff\u0200\5\64\33\5\u0200"+
		"\u0201\b\33\1\2\u0201\u0208\3\2\2\2\u0202\u0203\7@\2\2\u0203\u0204\7\t"+
		"\2\2\u0204\u0205\5\66\34\2\u0205\u0206\b\33\1\2\u0206\u0208\3\2\2\2\u0207"+
		"\u01f9\3\2\2\2\u0207\u01fd\3\2\2\2\u0207\u0202\3\2\2\2\u0208\u0210\3\2"+
		"\2\2\u0209\u020a\f\3\2\2\u020a\u020b\7\t\2\2\u020b\u020c\5\66\34\2\u020c"+
		"\u020d\b\33\1\2\u020d\u020f\3\2\2\2\u020e\u0209\3\2\2\2\u020f\u0212\3"+
		"\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211\65\3\2\2\2\u0212"+
		"\u0210\3\2\2\2\u0213\u0214\5\64\33\2\u0214\u0215\b\34\1\2\u0215\u024f"+
		"\3\2\2\2\u0216\u0217\7\64\2\2\u0217\u0218\7A\2\2\u0218\u0219\5\26\f\2"+
		"\u0219\u021a\b\34\1\2\u021a\u024f\3\2\2\2\u021b\u021c\7\65\2\2\u021c\u021d"+
		"\7A\2\2\u021d\u024f\b\34\1\2\u021e\u021f\7\60\2\2\u021f\u0220\5\66\34"+
		"\2\u0220\u0221\b\34\1\2\u0221\u024f\3\2\2\2\u0222\u0223\7\62\2\2\u0223"+
		"\u0224\5\66\34\2\u0224\u0225\b\34\1\2\u0225\u024f\3\2\2\2\u0226\u0227"+
		"\7\63\2\2\u0227\u0228\5\66\34\2\u0228\u0229\b\34\1\2\u0229\u024f\3\2\2"+
		"\2\u022a\u022b\7*\2\2\u022b\u022c\5\66\34\2\u022c\u022d\7\66\2\2\u022d"+
		"\u022e\5\66\34\2\u022e\u022f\b\34\1\2\u022f\u024f\3\2\2\2\u0230\u0231"+
		"\7*\2\2\u0231\u0234\5\66\34\2\u0232\u0233\7\13\2\2\u0233\u0235\5\66\34"+
		"\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0237"+
		"\t\6\2\2\u0237\u0238\5\66\34\2\u0238\u0239\7\66\2\2\u0239\u023a\5\66\34"+
		"\2\u023a\u023b\b\34\1\2\u023b\u024f\3\2\2\2\u023c\u023d\7+\2\2\u023d\u023e"+
		"\5\66\34\2\u023e\u0241\5\4\3\2\u023f\u0240\7-\2\2\u0240\u0242\5\4\3\2"+
		"\u0241\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0243\3\2\2\2\u0243\u0244"+
		"\b\34\1\2\u0244\u024f\3\2\2\2\u0245\u0246\5\36\20\2\u0246\u0247\b\34\1"+
		"\2\u0247\u024f\3\2\2\2\u0248\u0249\5$\23\2\u0249\u024a\b\34\1\2\u024a"+
		"\u024f\3\2\2\2\u024b\u024c\5 \21\2\u024c\u024d\b\34\1\2\u024d\u024f\3"+
		"\2\2\2\u024e\u0213\3\2\2\2\u024e\u0216\3\2\2\2\u024e\u021b\3\2\2\2\u024e"+
		"\u021e\3\2\2\2\u024e\u0222\3\2\2\2\u024e\u0226\3\2\2\2\u024e\u022a\3\2"+
		"\2\2\u024e\u0230\3\2\2\2\u024e\u023c\3\2\2\2\u024e\u0245\3\2\2\2\u024e"+
		"\u0248\3\2\2\2\u024e\u024b\3\2\2\2\u024f\67\3\2\2\2\67=AHQgoy}\u0089\u0090"+
		"\u0094\u0098\u009f\u00a3\u00aa\u00b3\u00bc\u00c7\u00d2\u00d8\u00df\u00e4"+
		"\u00e8\u00f1\u00f8\u0104\u010b\u011e\u012d\u0131\u0139\u0145\u0151\u015a"+
		"\u0165\u017a\u0184\u0194\u019d\u019f\u01ae\u01b5\u01c3\u01d4\u01d6\u01e4"+
		"\u01f4\u01f6\u0207\u0210\u0234\u0241\u024e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}