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
		Inline=40, For=41, If=42, Switch=43, Else=44, Enter=45, Catch=46, Clone=47, 
		Sync=48, Type=49, AddressOf=50, New=51, Static=52, Do=53, Add=54, Sub=55, 
		Not=56, AryOp=57, Integer=58, Double=59, NEWLINE=60, WS=61, Semi=62, Identifier=63, 
		JavaFullName=64, Letter=65, BlockComment=66, LineComment=67, RawString=68, 
		StringLiteral=69;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_syncStmt = 6, RULE_declareSubject = 7, RULE_declareStmt = 8, 
		RULE_definitionsList = 9, RULE_argumentsList = 10, RULE_interopArgumentsList = 11, 
		RULE_defineStmt = 12, RULE_lambdaStmt = 13, RULE_callStmt = 14, RULE_switchStmt = 15, 
		RULE_dict = 16, RULE_pair = 17, RULE_list = 18, RULE_value = 19, RULE_topExpr = 20, 
		RULE_unaryExpr = 21, RULE_multiplyExpr = 22, RULE_addExpr = 23, RULE_compareExpr = 24, 
		RULE_logicExpr = 25, RULE_assignExpr = 26, RULE_expr = 27;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "syncStmt", 
		"declareSubject", "declareStmt", "definitionsList", "argumentsList", "interopArgumentsList", 
		"defineStmt", "lambdaStmt", "callStmt", "switchStmt", "dict", "pair", 
		"list", "value", "topExpr", "unaryExpr", "multiplyExpr", "addExpr", "compareExpr", 
		"logicExpr", "assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "'&'", 
		"':'", "'['", "']'", "'=>'", "'::'", "':>'", "'#'", "'..'", "'...'", "'++'", 
		"'--'", "'*'", "'/'", "'%'", "'<+'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'const'", 
		"'def'", "'inline'", null, "'if'", "'switch'", "'else'", "'enter'", "'catch'", 
		"'clone'", "'sync'", "'typeof'", "'addressof'", "'new'", "'static'", "'do'", 
		"'+'", "'-'", "'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "Var", "Const", "Def", "Inline", "For", "If", "Switch", "Else", 
		"Enter", "Catch", "Clone", "Sync", "Type", "AddressOf", "New", "Static", 
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


	    public static SObject getClassObjectByName(String classname, Token tok) {
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
			setState(65);
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
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(56);
					((ProgContext)_localctx).block = block();
					 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(67);
				match(T__0);
				setState(68);
				((CodeContext)_localctx).B1 = block();
				setState(69);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(71);
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
		public PChain v =  new PChain();
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(76);
					((BlockContext)_localctx).stmt = stmt();
					 _localctx.v.expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(81); 
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
			setState(103);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				importStmt();
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case Enter:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case Sync:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((StmtContext)_localctx).syncStmt = syncStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).syncStmt.v; 
				}
				break;
			case Var:
			case Const:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
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
				setState(98);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
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
			setState(105);
			match(T__2);
			{
			setState(106);
			match(Identifier);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(T__3);
					setState(108);
					match(Identifier);
					}
					} 
				}
				setState(113);
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
			setState(114);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(115);
			((EnterStmtContext)_localctx).Body = code();
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(116);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(117);
				match(T__4);
				setState(118);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(119);
				match(T__5);
				setState(120);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(123);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(124);
				((EnterStmtContext)_localctx).DoBody = code();
				}
				break;
			}

			            ((EnterStmtContext)_localctx).v =  new PEnter(new Atom(((EnterStmtContext)_localctx).Enter), ((EnterStmtContext)_localctx).Body.v, 
			                ((EnterStmtContext)_localctx).Catch == null ? null : ((EnterStmtContext)_localctx).CatchBody.v, 
			                ((EnterStmtContext)_localctx).Do == null ? null : ((EnterStmtContext)_localctx).DoBody.v, (((EnterStmtContext)_localctx).Identifier!=null?((EnterStmtContext)_localctx).Identifier.getText():null));
			        
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
			setState(129);
			((SyncStmtContext)_localctx).Sync = match(Sync);
			setState(130);
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

	public static class DeclareSubjectContext extends ParserRuleContext {
		public SExpression v;
		public ExprContext Subject;
		public Token Identifier;
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclareSubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareSubject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterDeclareSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitDeclareSubject(this);
		}
	}

	public final DeclareSubjectContext declareSubject() throws RecognitionException {
		DeclareSubjectContext _localctx = new DeclareSubjectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareSubject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(133);
				((DeclareSubjectContext)_localctx).Subject = expr();
				}
				break;
			case 2:
				{
				setState(134);
				((DeclareSubjectContext)_localctx).Identifier = match(Identifier);
				}
				break;
			}

			        ((DeclareSubjectContext)_localctx).v =  ((DeclareSubjectContext)_localctx).Identifier == null ? ((DeclareSubjectContext)_localctx).Subject.v : new SString((((DeclareSubjectContext)_localctx).Identifier!=null?((DeclareSubjectContext)_localctx).Identifier.getText():null));
			    
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
		public ListEx<SExpression> multi =  new ListEx<SExpression>();
		public PSet.ACTION act =  PSet.ACTION.MUTABLE;
		public Token Action;
		public DeclareSubjectContext Head;
		public ExprContext HeadValue;
		public DeclareSubjectContext Tail;
		public ExprContext TailValue;
		public List<DeclareSubjectContext> declareSubject() {
			return getRuleContexts(DeclareSubjectContext.class);
		}
		public DeclareSubjectContext declareSubject(int i) {
			return getRuleContext(DeclareSubjectContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Var() { return getToken(EugineParser.Var, 0); }
		public TerminalNode Const() { return getToken(EugineParser.Const, 0); }
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
		enterRule(_localctx, 16, RULE_declareStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			((DeclareStmtContext)_localctx).Action = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Const) ) {
				((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}

			            ((DeclareStmtContext)_localctx).act =  (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.ACTION.MUTABLE : PSet.ACTION.IMMUTABLE;
			        
			setState(141);
			((DeclareStmtContext)_localctx).Head = declareSubject();
			setState(142);
			match(T__6);
			setState(143);
			((DeclareStmtContext)_localctx).HeadValue = expr();

			            _localctx.multi.add(new PSet(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Head.v, ((DeclareStmtContext)_localctx).HeadValue.v, PSet.DECLARE.DECLARE, _localctx.act));
			        
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(145);
				match(T__7);
				setState(146);
				((DeclareStmtContext)_localctx).Tail = declareSubject();
				setState(147);
				match(T__6);
				setState(148);
				((DeclareStmtContext)_localctx).TailValue = expr();

				            _localctx.multi.add(new PSet(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Tail.v, ((DeclareStmtContext)_localctx).TailValue.v, PSet.DECLARE.DECLARE, _localctx.act));
				        
				}
				break;
			}

			            if (_localctx.multi.size() == 1) {
			                ((DeclareStmtContext)_localctx).v =  _localctx.multi.head();
			            } else {
			                ((DeclareStmtContext)_localctx).v =  new PChain(_localctx.multi);
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

	public static class DefinitionsListContext extends ParserRuleContext {
		public ListEx<String> v =  new ListEx<String>();
		public ListEx<Boolean> passByValue =  new ListEx<Boolean>();
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
		enterRule(_localctx, 18, RULE_definitionsList);
		int _la;
		try {
			int _alt;
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__4);
				setState(164);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(157);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(156);
							((DefinitionsListContext)_localctx).InitStyle = match(T__8);
							}
						}

						setState(159);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(160);
						match(T__7);
						 
						        _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						        _localctx.passByValue.add(((DefinitionsListContext)_localctx).InitStyle == null);
						    
						}
						} 
					}
					setState(166);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(168);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(167);
					((DefinitionsListContext)_localctx).LastStyle = match(T__8);
					}
				}

				setState(170);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(171);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				        _localctx.passByValue.add(((DefinitionsListContext)_localctx).LastStyle == null);
				    
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

	public static class ArgumentsListContext extends ParserRuleContext {
		public ListEx<SExpression> v =  new ListEx<SExpression>();
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
		enterRule(_localctx, 20, RULE_argumentsList);
		try {
			int _alt;
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__4);
				setState(184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(178);
						((ArgumentsListContext)_localctx).InitExpr = expr();
						setState(179);
						match(T__7);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(187);
				((ArgumentsListContext)_localctx).LastExpr = expr();
				setState(188);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__4);
				setState(192);
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
		public ListEx<SExpression> args =  new ListEx<SExpression>();
		public ListEx<String> defs =  new ListEx<String>();
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
		enterRule(_localctx, 22, RULE_interopArgumentsList);
		int _la;
		try {
			int _alt;
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(T__4);
				setState(204);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(196);
						((InteropArgumentsListContext)_localctx).InitExpr = expr();
						setState(197);
						match(T__9);
						setState(198);
						((InteropArgumentsListContext)_localctx).InitDef = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Identifier || _la==JavaFullName) ) {
							((InteropArgumentsListContext)_localctx).InitDef = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(199);
						match(T__7);
						 
						                _localctx.args.add(((InteropArgumentsListContext)_localctx).InitExpr.v);
						                _localctx.defs.add((((InteropArgumentsListContext)_localctx).InitDef!=null?((InteropArgumentsListContext)_localctx).InitDef.getText():null).replace("\\", "."));
						            
						}
						} 
					}
					setState(206);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(207);
				((InteropArgumentsListContext)_localctx).LastExpr = expr();
				setState(208);
				match(T__9);
				setState(209);
				((InteropArgumentsListContext)_localctx).LastDef = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==JavaFullName) ) {
					((InteropArgumentsListContext)_localctx).LastDef = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(210);
				match(T__5);

				        _localctx.args.add(((InteropArgumentsListContext)_localctx).LastExpr.v);
				        _localctx.defs.add((((InteropArgumentsListContext)_localctx).LastDef!=null?((InteropArgumentsListContext)_localctx).LastDef.getText():null).replace("\\", "."));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__4);
				setState(214);
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
		public ListEx<SExpression> body =  new ListEx<SExpression>();
		public ListEx<SExpression> decorators =  new ListEx<SExpression>();
		public Token Inline;
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
		public TerminalNode Inline() { return getToken(EugineParser.Inline, 0); }
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
		enterRule(_localctx, 24, RULE_defineStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			match(Def);
			setState(219);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(218);
				((DefineStmtContext)_localctx).Inline = match(Inline);
				}
			}

			setState(231);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(221);
					match(T__10);
					setState(222);
					((DefineStmtContext)_localctx).Decorator = expr();
					setState(224);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(223);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(226);
					match(T__11);
					 
					            _localctx.decorators.add(new PCall(new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), 
					                ((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v));
					        
					}
					} 
				}
				setState(233);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(234);
				((DefineStmtContext)_localctx).Identifier = match(Identifier);
				}
				break;
			case 2:
				{
				setState(235);
				((DefineStmtContext)_localctx).Get = expr();
				}
				break;
			}
			setState(238);
			((DefineStmtContext)_localctx).Definition = definitionsList();
			setState(240);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(239);
				((DefineStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((DefineStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(242);
			match(T__12);
			setState(256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(243);
				match(T__0);
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
					{
					{
					setState(244);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(253);
				((DefineStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			            Atom a = ((DefineStmtContext)_localctx).Identifier != null ? new Atom(((DefineStmtContext)_localctx).Identifier) : new Atom((((DefineStmtContext)_localctx).Get!=null?(((DefineStmtContext)_localctx).Get.start):null));
			            SExpression sub = ((DefineStmtContext)_localctx).Identifier != null ? new SString((((DefineStmtContext)_localctx).Identifier!=null?((DefineStmtContext)_localctx).Identifier.getText():null)) : ((DefineStmtContext)_localctx).Get.v;
			            SExpression closure = new PLambda(a, ((DefineStmtContext)_localctx).Definition.v, ((DefineStmtContext)_localctx).Definition.passByValue, 
			                _localctx.body,
			                ((DefineStmtContext)_localctx).Description == null ? "" : (((DefineStmtContext)_localctx).Description!=null?((DefineStmtContext)_localctx).Description.getText():null),
			                ((DefineStmtContext)_localctx).Inline != null);

			            if (((DefineStmtContext)_localctx).Identifier != null || ((DefineStmtContext)_localctx).Get.v instanceof PGet) {
			                for (SExpression d : _localctx.decorators) {
			                    closure = new PCall(a, d, ListEx.build(closure));
			                }
			                
			                ((DefineStmtContext)_localctx).v =  new PSet(a, sub, closure, PSet.DECLARE.DECLARE, PSet.ACTION.IMMUTABLE);
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
		public ListEx<SExpression> body =  new ListEx<SExpression>();;
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
		enterRule(_localctx, 26, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(261);
			match(T__12);
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(262);
				match(T__0);
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
					{
					{
					setState(263);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(270);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(271);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(272);
				((LambdaStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			        ((LambdaStmtContext)_localctx).v =  new PLambda(new Atom((((LambdaStmtContext)_localctx).definitionsList!=null?(((LambdaStmtContext)_localctx).definitionsList.start):null)), ((LambdaStmtContext)_localctx).definitionsList.v, ((LambdaStmtContext)_localctx).definitionsList.passByValue,
			            _localctx.body, "anonymous", false);
			    
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
		enterRule(_localctx, 28, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			((CallStmtContext)_localctx).Identifier = match(Identifier);
			setState(280);
			((CallStmtContext)_localctx).argumentsList = argumentsList();

			        String func = (((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null);
			        if (SKeywords.Lookup.containsKey(func)) {
			            ((CallStmtContext)_localctx).v =  SKeywords.Lookup.get(func).call(((CallStmtContext)_localctx).Identifier, ((CallStmtContext)_localctx).argumentsList.v); 
			        } else {
			            Atom a = new Atom(((CallStmtContext)_localctx).Identifier);
			            ((CallStmtContext)_localctx).v =  new PCall(a, new PVariable(a, (((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null)), ((CallStmtContext)_localctx).argumentsList.v);
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
		public ListEx<Branch> branches =  new ListEx<Branch>();
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
		enterRule(_localctx, 30, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(284);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(285);
			match(Do);
			setState(286);
			match(T__0);
			setState(294);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
				{
				{
				setState(287);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(288);
				match(T__12);
				setState(289);
				((SwitchStmtContext)_localctx).Code = code();

				        Branch b = new Branch();
				        b.recv = ((SwitchStmtContext)_localctx).Tester.v;
				        b.body = new ListEx<SExpression>();
				        b.body.add(((SwitchStmtContext)_localctx).Code.v);

				        if ((((SwitchStmtContext)_localctx).Tester!=null?_input.getText(((SwitchStmtContext)_localctx).Tester.start,((SwitchStmtContext)_localctx).Tester.stop):null).equals("_")) {
				            ((SwitchStmtContext)_localctx).db =  b;
				        } else {
				            _localctx.branches.add(b);
				        }
				    
				}
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(297);
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
		public PDict v =  new PDict();
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
		enterRule(_localctx, 32, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				match(T__0);
				setState(301);
				((DictContext)_localctx).pair = pair();
				 
				            _localctx.v.keys.add(((DictContext)_localctx).pair.k); 
				            _localctx.v.values.add(((DictContext)_localctx).pair.v);
				        
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(T__7);
						setState(304);
						((DictContext)_localctx).pair = pair();
						 
						            _localctx.v.keys.add(((DictContext)_localctx).pair.k); 
						            _localctx.v.values.add(((DictContext)_localctx).pair.v);
						        
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(313);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(312);
					match(T__7);
					}
				}

				setState(315);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__0);
				setState(318);
				match(T__1);
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
		enterRule(_localctx, 34, RULE_pair);
		int _la;
		try {
			setState(331);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(322);
				match(T__9);
				setState(323);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				((PairContext)_localctx).Key = match(Identifier);
				setState(327);
				match(T__9);
				setState(328);
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
		public PList v =  new PList();
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
		enterRule(_localctx, 36, RULE_list);
		int _la;
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				match(T__10);
				{
				setState(334);
				((ListContext)_localctx).value = value();
				 _localctx.v.values.add(((ListContext)_localctx).value.v); 
				}
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(337);
						match(T__7);
						setState(338);
						((ListContext)_localctx).value = value();
						 _localctx.v.values.add(((ListContext)_localctx).value.v); 
						}
						} 
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(347);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(346);
					match(T__7);
					}
				}

				setState(349);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(351);
				match(T__10);
				setState(352);
				match(T__11);
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
		enterRule(_localctx, 38, RULE_value);
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(355);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
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
		public ListContext list;
		public DictContext dict;
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_topExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(367);
				match(T__4);
				setState(368);
				((TopExprContext)_localctx).Inner = stmt();
				setState(369);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				{
				setState(372);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				{
				setState(375);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable(new Atom(((TopExprContext)_localctx).Identifier), (((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 4:
				{
				setState(377);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 5:
				{
				setState(379);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 6:
				{
				setState(381);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInteger((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 7:
				{
				setState(383);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SDouble((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
				}
				break;
			case 8:
				{
				setState(385);
				((TopExprContext)_localctx).list = list();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).list.v; 
				}
				break;
			case 9:
				{
				setState(388);
				((TopExprContext)_localctx).dict = dict();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).dict.v; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(428);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(426);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(393);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(394);
						((TopExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__14) ) {
							((TopExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(395);
						((TopExprContext)_localctx).Method = match(Identifier);
						setState(396);
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
						setState(399);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(401);
						_la = _input.LA(1);
						if (_la==T__15) {
							{
							setState(400);
							((TopExprContext)_localctx).Mt = match(T__15);
							}
						}

						setState(403);
						((TopExprContext)_localctx).argumentsList = argumentsList();

						                      if (((TopExprContext)_localctx).Mt != null) {
						                          ((TopExprContext)_localctx).v =  new PThread(new Atom(((TopExprContext)_localctx).Mt), ((TopExprContext)_localctx).Called.v, ((TopExprContext)_localctx).argumentsList.v);
						                      } else {
						                          if (SKeywords.Lookup.containsKey((((TopExprContext)_localctx).Called!=null?_input.getText(((TopExprContext)_localctx).Called.start,((TopExprContext)_localctx).Called.stop):null))) {
						                              ((TopExprContext)_localctx).v =  SKeywords.Lookup.get((((TopExprContext)_localctx).Called!=null?_input.getText(((TopExprContext)_localctx).Called.start,((TopExprContext)_localctx).Called.stop):null)).call((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null), ((TopExprContext)_localctx).argumentsList.v); 
						                          } else {
						                              ((TopExprContext)_localctx).v =  new PCall(new Atom((((TopExprContext)_localctx).Called!=null?(((TopExprContext)_localctx).Called.start):null)), ((TopExprContext)_localctx).Called.v, ((TopExprContext)_localctx).argumentsList.v);
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
						setState(406);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(407);
						match(T__10);
						setState(408);
						((TopExprContext)_localctx).Key = expr();
						setState(409);
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
						setState(412);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(413);
						match(T__10);
						setState(414);
						((TopExprContext)_localctx).Start = expr();
						setState(415);
						_la = _input.LA(1);
						if ( !(_la==T__16 || _la==T__17) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(417);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Type) | (1L << AddressOf) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
							{
							setState(416);
							((TopExprContext)_localctx).End = expr();
							}
						}

						setState(419);
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
						setState(422);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(423);
						match(T__3);
						setState(424);
						((TopExprContext)_localctx).Identifier = match(Identifier);

						                      ((TopExprContext)_localctx).v =  new PGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, new SString((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)));
						                  
						}
						break;
					}
					} 
				}
				setState(430);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_unaryExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			switch (_input.LA(1)) {
			case T__0:
			case T__4:
			case T__10:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				{
				setState(432);
				((UnaryExprContext)_localctx).Top = topExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				{
				setState(435);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(436);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            if (((UnaryExprContext)_localctx).Right.v instanceof SInteger) {
				                ((UnaryExprContext)_localctx).v =  new SInteger(-((SInteger) ((UnaryExprContext)_localctx).Right.v).<Long>get());
				            } else if (((UnaryExprContext)_localctx).Right.v instanceof SDouble) {
				                ((UnaryExprContext)_localctx).v =  new SDouble(-((SDouble) ((UnaryExprContext)_localctx).Right.v).<Double>get());
				            } else {
				                ((UnaryExprContext)_localctx).v =  new SEReverse(new Atom(((UnaryExprContext)_localctx).Sub), ListEx.build(((UnaryExprContext)_localctx).Right.v));
				            }
				        
				}
				break;
			case Not:
				{
				setState(439);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(440);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            ((UnaryExprContext)_localctx).v =  SKeywords.Lookup.get((((UnaryExprContext)_localctx).Not!=null?((UnaryExprContext)_localctx).Not.getText():null)).call(((UnaryExprContext)_localctx).Not, ListEx.build(((UnaryExprContext)_localctx).Right.v));
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(450);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
					setState(445);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(446);
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
					                              new PAdd(ha, ListEx.build(((UnaryExprContext)_localctx).Left.v, new SInteger(1)), false),
					                              PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
					                      } else {
					                          ((UnaryExprContext)_localctx).v =  new PSet(ha, ((UnaryExprContext)_localctx).Left.v, 
					                              new PMath(ha, 
					                                  ListEx.build(((UnaryExprContext)_localctx).Left.v, new SInteger(1)), PMath.ACTION.SUBTRACT),
					                              PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
					                      }
					                  
					}
					} 
				}
				setState(452);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_multiplyExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(454);
			((MultiplyExprContext)_localctx).Top = unaryExpr(0);
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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
					setState(457);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(458);
					((MultiplyExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
						((MultiplyExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(459);
					((MultiplyExprContext)_localctx).Right = unaryExpr(0);

					                      ((MultiplyExprContext)_localctx).v =  SKeywords.Lookup.get((((MultiplyExprContext)_localctx).Op!=null?((MultiplyExprContext)_localctx).Op.getText():null)).call(((MultiplyExprContext)_localctx).Op, ListEx.build(((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(466);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(468);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(483);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(481);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(471);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(472);
						((AddExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==Add) ) {
							((AddExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(473);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PAdd(new Atom(((AddExprContext)_localctx).AddOp), ListEx.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), (((AddExprContext)_localctx).AddOp!=null?((AddExprContext)_localctx).AddOp.getText():null).equals("<+"));
						                  
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(476);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(477);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(478);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PMath(new Atom(((AddExprContext)_localctx).Sub), ListEx.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), PMath.ACTION.SUBTRACT);
						                  
						}
						break;
					}
					} 
				}
				setState(485);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_compareExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(487);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(497);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
					setState(490);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(491);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(492);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  SKeywords.Lookup.get((((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null)).call(((CompareExprContext)_localctx).Op, ListEx.build(((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(499);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(501);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(504);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(505);
						((LogicExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__30 || _la==T__31) ) {
							((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(506);
						((LogicExprContext)_localctx).Right = compareExpr(0);

						                      ((LogicExprContext)_localctx).v =  SKeywords.Lookup.get((((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null)).call(((LogicExprContext)_localctx).Op, 
						                          ListEx.build(((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v));
						                  
						}
						break;
					case 2:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(509);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(510);
						match(T__9);
						setState(511);
						((LogicExprContext)_localctx).JavaFullName = match(JavaFullName);

						                      ((LogicExprContext)_localctx).v =  new PInteropCast(new Atom(((LogicExprContext)_localctx).JavaFullName), ((LogicExprContext)_localctx).Left.v, (((LogicExprContext)_localctx).JavaFullName!=null?((LogicExprContext)_localctx).JavaFullName.getText():null).replace("\\", "."));
						                  
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_assignExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(519);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(522);
				((AssignExprContext)_localctx).Left = unaryExpr(0);
				setState(523);
				((AssignExprContext)_localctx).Op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35))) != 0)) ) {
					((AssignExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(524);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            Atom ha = new Atom(((AssignExprContext)_localctx).Op);
				            if ((((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null).equals("+=")) {
				                ((AssignExprContext)_localctx).v =  new PSet(ha, ((AssignExprContext)_localctx).Left.v, 
				                    new PAdd(ha, ListEx.build(((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), false),
				                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
				            } else {
				                String text = (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null).substring(0, 1);
				                ((AssignExprContext)_localctx).v =  new PSet(ha, ((AssignExprContext)_localctx).Left.v, 
				                    SKeywords.Lookup.get(text).call(((AssignExprContext)_localctx).Op, 
				                        ListEx.build(((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v)),
				                    PSet.DECLARE.SET, PSet.ACTION.MUTABLE);
				            }
				        
				}
				break;
			case 3:
				{
				setState(527);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(528);
				match(T__6);
				setState(529);
				((AssignExprContext)_localctx).Value = expr();

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Identifier),
				                new SString((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Value.v, PSet.DECLARE.SET, PSet.ACTION.MUTABLE); 
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(541);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
					setState(534);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(535);
					match(T__6);
					setState(536);
					((AssignExprContext)_localctx).Value = expr();

					                      ((AssignExprContext)_localctx).v =  new PSet(new Atom((((AssignExprContext)_localctx).Subject!=null?(((AssignExprContext)_localctx).Subject.start):null)), ((AssignExprContext)_localctx).Subject.v, ((AssignExprContext)_localctx).Value.v, PSet.DECLARE.SET, PSet.ACTION.MUTABLE);    
					                  
					}
					} 
				}
				setState(543);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
		enterRule(_localctx, 54, RULE_expr);
		int _la;
		try {
			setState(597);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(544);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				((ExprContext)_localctx).New = match(New);
				setState(548);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				setState(549);
				((ExprContext)_localctx).interopArgumentsList = interopArgumentsList();

				            String classname = (((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", ".");
				            ((ExprContext)_localctx).v =  new PInteropNew(new Atom(((ExprContext)_localctx).New), getClassObjectByName(classname, ((ExprContext)_localctx).New),
				                ((ExprContext)_localctx).interopArgumentsList.defs, ((ExprContext)_localctx).interopArgumentsList.args);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(552);
				((ExprContext)_localctx).Static = match(Static);
				setState(553);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				 ((ExprContext)_localctx).v =  getClassObjectByName((((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", "."), ((ExprContext)_localctx).Static); 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(555);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(556);
				((ExprContext)_localctx).Subject = expr();
				 ((ExprContext)_localctx).v =  new PClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v); 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(559);
				((ExprContext)_localctx).Type = match(Type);
				setState(560);
				((ExprContext)_localctx).Subject = expr();
				 ((ExprContext)_localctx).v =  new PType(new Atom(((ExprContext)_localctx).Type), ((ExprContext)_localctx).Subject.v, PType.TYPE.TYPE); 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(563);
				((ExprContext)_localctx).AddressOf = match(AddressOf);
				setState(564);
				((ExprContext)_localctx).Subject = expr();
				 ((ExprContext)_localctx).v =  new PType(new Atom(((ExprContext)_localctx).AddressOf), ((ExprContext)_localctx).Subject.v, PType.TYPE.ADDR); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(567);
				((ExprContext)_localctx).For = match(For);
				setState(568);
				((ExprContext)_localctx).Subject = expr();
				setState(569);
				match(Do);
				setState(570);
				((ExprContext)_localctx).Body = expr();
				 
				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? PFor.DIRECTION.ASC : PFor.DIRECTION.DESC); 
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(573);
				((ExprContext)_localctx).For = match(For);
				setState(574);
				((ExprContext)_localctx).Start = expr();
				setState(577);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(575);
					match(T__7);
					setState(576);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(579);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(580);
				((ExprContext)_localctx).End = expr();
				setState(581);
				match(Do);
				setState(582);
				((ExprContext)_localctx).Body = expr();
				 
				            PIRange r = new PIRange(new Atom(((ExprContext)_localctx).For), ListEx.build(
				                    ((ExprContext)_localctx).Start.v, 
				                    ((ExprContext)_localctx).Next == null ? 
				                        new SInteger(1) : 
				                        new PMath(new Atom((((ExprContext)_localctx).Next!=null?(((ExprContext)_localctx).Next.start):null)), 
				                            ListEx.build(((ExprContext)_localctx).Next.v, ((ExprContext)_localctx).Start.v),
				                            PMath.ACTION.SUBTRACT), 
				                    ((ExprContext)_localctx).End.v
				                ));
				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), r, ((ExprContext)_localctx).Body.v, PFor.DIRECTION.ASC); 
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(585);
				((ExprContext)_localctx).If = match(If);
				setState(586);
				((ExprContext)_localctx).Condition = expr();
				setState(587);
				((ExprContext)_localctx).True = code();
				setState(590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(588);
					match(Else);
					setState(589);
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
				setState(594);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
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
		case 20:
			return topExpr_sempred((TopExprContext)_localctx, predIndex);
		case 21:
			return unaryExpr_sempred((UnaryExprContext)_localctx, predIndex);
		case 22:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 23:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 24:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 25:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		case 26:
			return assignExpr_sempred((AssignExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean topExpr_sempred(TopExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3G\u025a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\2\3\2\5\2D\n\2\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\4\3\4\3\4\6"+
		"\4R\n\4\r\4\16\4S\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16"+
		"\6s\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\5\7\u0080\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u008a\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u009a\n\n\3\n\3\n\3\13\3\13\5\13\u00a0"+
		"\n\13\3\13\3\13\3\13\7\13\u00a5\n\13\f\13\16\13\u00a8\13\13\3\13\5\13"+
		"\u00ab\n\13\3\13\3\13\3\13\3\13\3\13\5\13\u00b2\n\13\3\f\3\f\3\f\3\f\3"+
		"\f\7\f\u00b9\n\f\f\f\16\f\u00bc\13\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00c4"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00cd\n\r\f\r\16\r\u00d0\13\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\16\3\16\5\16\u00de\n\16\3"+
		"\16\3\16\3\16\5\16\u00e3\n\16\3\16\3\16\3\16\7\16\u00e8\n\16\f\16\16\16"+
		"\u00eb\13\16\3\16\3\16\5\16\u00ef\n\16\3\16\3\16\5\16\u00f3\n\16\3\16"+
		"\3\16\3\16\3\16\3\16\7\16\u00fa\n\16\f\16\16\16\u00fd\13\16\3\16\3\16"+
		"\3\16\3\16\5\16\u0103\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u010d\n\17\f\17\16\17\u0110\13\17\3\17\3\17\3\17\3\17\5\17\u0116\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\7\21\u0127\n\21\f\21\16\21\u012a\13\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\7\22\u0136\n\22\f\22\16\22\u0139\13\22\3\22"+
		"\5\22\u013c\n\22\3\22\3\22\3\22\3\22\5\22\u0142\n\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u014e\n\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0158\n\24\f\24\16\24\u015b\13\24\3\24\5\24"+
		"\u015e\n\24\3\24\3\24\3\24\3\24\5\24\u0164\n\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\5\25\u016f\n\25\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u018a\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0194\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u01a4\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\7\26\u01ad\n\26\f\26\16\26\u01b0\13\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u01be\n\27\3\27\3\27\3\27\7\27"+
		"\u01c3\n\27\f\27\16\27\u01c6\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u01d1\n\30\f\30\16\30\u01d4\13\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01e4\n\31\f\31"+
		"\16\31\u01e7\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u01f2"+
		"\n\32\f\32\16\32\u01f5\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\7\33\u0204\n\33\f\33\16\33\u0207\13\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0217"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\7\34\u021e\n\34\f\34\16\34\u0221\13\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0244\n\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\5\35\u0251\n\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u0258\n\35\3\35\2\t*,.\60\62\64\66\36\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668\2\r\3\2\'(\3\2AB\3\2FG\3\2\20\21\3\2\23\24"+
		"\3\2\25\26\3\2\27\31\4\2\32\3288\3\2\33 \3\2!\"\3\2#&\u028d\2C\3\2\2\2"+
		"\4J\3\2\2\2\6Q\3\2\2\2\bi\3\2\2\2\nk\3\2\2\2\ft\3\2\2\2\16\u0083\3\2\2"+
		"\2\20\u0089\3\2\2\2\22\u008d\3\2\2\2\24\u00b1\3\2\2\2\26\u00c3\3\2\2\2"+
		"\30\u00d9\3\2\2\2\32\u00db\3\2\2\2\34\u0106\3\2\2\2\36\u0119\3\2\2\2 "+
		"\u011d\3\2\2\2\"\u0141\3\2\2\2$\u014d\3\2\2\2&\u0163\3\2\2\2(\u016e\3"+
		"\2\2\2*\u0189\3\2\2\2,\u01bd\3\2\2\2.\u01c7\3\2\2\2\60\u01d5\3\2\2\2\62"+
		"\u01e8\3\2\2\2\64\u01f6\3\2\2\2\66\u0216\3\2\2\28\u0257\3\2\2\2:;\5\6"+
		"\4\2;<\b\2\1\2<>\3\2\2\2=:\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3\2"+
		"\2\2AB\7\2\2\3BD\b\2\1\2C=\3\2\2\2CA\3\2\2\2D\3\3\2\2\2EF\7\3\2\2FG\5"+
		"\6\4\2GH\7\4\2\2HK\3\2\2\2IK\5\b\5\2JE\3\2\2\2JI\3\2\2\2KL\3\2\2\2LM\b"+
		"\3\1\2M\5\3\2\2\2NO\5\b\5\2OP\b\4\1\2PR\3\2\2\2QN\3\2\2\2RS\3\2\2\2SQ"+
		"\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UV\5\n\6\2VW\b\5\1\2Wj\3\2\2\2XY\5\f\7\2"+
		"YZ\b\5\1\2Zj\3\2\2\2[\\\5\16\b\2\\]\b\5\1\2]j\3\2\2\2^_\5\22\n\2_`\b\5"+
		"\1\2`j\3\2\2\2ab\5\32\16\2bc\b\5\1\2cj\3\2\2\2de\58\35\2ef\b\5\1\2fj\3"+
		"\2\2\2gh\7@\2\2hj\b\5\1\2iU\3\2\2\2iX\3\2\2\2i[\3\2\2\2i^\3\2\2\2ia\3"+
		"\2\2\2id\3\2\2\2ig\3\2\2\2j\t\3\2\2\2kl\7\5\2\2lq\7A\2\2mn\7\6\2\2np\7"+
		"A\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2tu"+
		"\7/\2\2u{\5\4\3\2vw\7\60\2\2wx\7\7\2\2xy\7A\2\2yz\7\b\2\2z|\5\4\3\2{v"+
		"\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}~\7\67\2\2~\u0080\5\4\3\2\177}\3\2\2\2"+
		"\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\b\7\1\2\u0082\r\3\2"+
		"\2\2\u0083\u0084\7\62\2\2\u0084\u0085\5\4\3\2\u0085\u0086\b\b\1\2\u0086"+
		"\17\3\2\2\2\u0087\u008a\58\35\2\u0088\u008a\7A\2\2\u0089\u0087\3\2\2\2"+
		"\u0089\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\b\t\1\2\u008c\21"+
		"\3\2\2\2\u008d\u008e\t\2\2\2\u008e\u008f\b\n\1\2\u008f\u0090\5\20\t\2"+
		"\u0090\u0091\7\t\2\2\u0091\u0092\58\35\2\u0092\u0099\b\n\1\2\u0093\u0094"+
		"\7\n\2\2\u0094\u0095\5\20\t\2\u0095\u0096\7\t\2\2\u0096\u0097\58\35\2"+
		"\u0097\u0098\b\n\1\2\u0098\u009a\3\2\2\2\u0099\u0093\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\n\1\2\u009c\23\3\2\2\2\u009d"+
		"\u00a6\7\7\2\2\u009e\u00a0\7\13\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3"+
		"\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7A\2\2\u00a2\u00a3\7\n\2\2\u00a3"+
		"\u00a5\b\13\1\2\u00a4\u009f\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3"+
		"\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\7\13\2\2\u00aa\u00a9\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3"+
		"\2\2\2\u00ac\u00ad\7A\2\2\u00ad\u00ae\7\b\2\2\u00ae\u00b2\b\13\1\2\u00af"+
		"\u00b0\7\7\2\2\u00b0\u00b2\7\b\2\2\u00b1\u009d\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b2\25\3\2\2\2\u00b3\u00ba\7\7\2\2\u00b4\u00b5\58\35\2\u00b5\u00b6"+
		"\7\n\2\2\u00b6\u00b7\b\f\1\2\u00b7\u00b9\3\2\2\2\u00b8\u00b4\3\2\2\2\u00b9"+
		"\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2"+
		"\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\58\35\2\u00be\u00bf\7\b\2\2\u00bf"+
		"\u00c0\b\f\1\2\u00c0\u00c4\3\2\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c4\7\b"+
		"\2\2\u00c3\u00b3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\27\3\2\2\2\u00c5\u00ce"+
		"\7\7\2\2\u00c6\u00c7\58\35\2\u00c7\u00c8\7\f\2\2\u00c8\u00c9\t\3\2\2\u00c9"+
		"\u00ca\7\n\2\2\u00ca\u00cb\b\r\1\2\u00cb\u00cd\3\2\2\2\u00cc\u00c6\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"\u00d1\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\58\35\2\u00d2\u00d3\7\f"+
		"\2\2\u00d3\u00d4\t\3\2\2\u00d4\u00d5\7\b\2\2\u00d5\u00d6\b\r\1\2\u00d6"+
		"\u00da\3\2\2\2\u00d7\u00d8\7\7\2\2\u00d8\u00da\7\b\2\2\u00d9\u00c5\3\2"+
		"\2\2\u00d9\u00d7\3\2\2\2\u00da\31\3\2\2\2\u00db\u00dd\7)\2\2\u00dc\u00de"+
		"\7*\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e9\3\2\2\2\u00df"+
		"\u00e0\7\r\2\2\u00e0\u00e2\58\35\2\u00e1\u00e3\5\26\f\2\u00e2\u00e1\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\16\2\2\u00e5"+
		"\u00e6\b\16\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00df\3\2\2\2\u00e8\u00eb\3"+
		"\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00ee\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00ec\u00ef\7A\2\2\u00ed\u00ef\58\35\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f2\5\24\13\2\u00f1"+
		"\u00f3\t\4\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u0102\7\17\2\2\u00f5\u00fb\7\3\2\2\u00f6\u00f7\5\b\5\2\u00f7"+
		"\u00f8\b\16\1\2\u00f8\u00fa\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa\u00fd\3"+
		"\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0103\7\4\2\2\u00ff\u0100\5\b\5\2\u0100\u0101\b\16"+
		"\1\2\u0101\u0103\3\2\2\2\u0102\u00f5\3\2\2\2\u0102\u00ff\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0105\b\16\1\2\u0105\33\3\2\2\2\u0106\u0107\5\24"+
		"\13\2\u0107\u0115\7\17\2\2\u0108\u010e\7\3\2\2\u0109\u010a\5\b\5\2\u010a"+
		"\u010b\b\17\1\2\u010b\u010d\3\2\2\2\u010c\u0109\3\2\2\2\u010d\u0110\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0116\7\4\2\2\u0112\u0113\5\b\5\2\u0113\u0114\b\17"+
		"\1\2\u0114\u0116\3\2\2\2\u0115\u0108\3\2\2\2\u0115\u0112\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\b\17\1\2\u0118\35\3\2\2\2\u0119\u011a\7A\2"+
		"\2\u011a\u011b\5\26\f\2\u011b\u011c\b\20\1\2\u011c\37\3\2\2\2\u011d\u011e"+
		"\7-\2\2\u011e\u011f\58\35\2\u011f\u0120\7\67\2\2\u0120\u0128\7\3\2\2\u0121"+
		"\u0122\58\35\2\u0122\u0123\7\17\2\2\u0123\u0124\5\4\3\2\u0124\u0125\b"+
		"\21\1\2\u0125\u0127\3\2\2\2\u0126\u0121\3\2\2\2\u0127\u012a\3\2\2\2\u0128"+
		"\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012b\3\2\2\2\u012a\u0128\3\2"+
		"\2\2\u012b\u012c\7\4\2\2\u012c\u012d\b\21\1\2\u012d!\3\2\2\2\u012e\u012f"+
		"\7\3\2\2\u012f\u0130\5$\23\2\u0130\u0137\b\22\1\2\u0131\u0132\7\n\2\2"+
		"\u0132\u0133\5$\23\2\u0133\u0134\b\22\1\2\u0134\u0136\3\2\2\2\u0135\u0131"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\7\n\2\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\4\2\2\u013e"+
		"\u0142\3\2\2\2\u013f\u0140\7\3\2\2\u0140\u0142\7\4\2\2\u0141\u012e\3\2"+
		"\2\2\u0141\u013f\3\2\2\2\u0142#\3\2\2\2\u0143\u0144\t\4\2\2\u0144\u0145"+
		"\7\f\2\2\u0145\u0146\5(\25\2\u0146\u0147\b\23\1\2\u0147\u014e\3\2\2\2"+
		"\u0148\u0149\7A\2\2\u0149\u014a\7\f\2\2\u014a\u014b\5(\25\2\u014b\u014c"+
		"\b\23\1\2\u014c\u014e\3\2\2\2\u014d\u0143\3\2\2\2\u014d\u0148\3\2\2\2"+
		"\u014e%\3\2\2\2\u014f\u0150\7\r\2\2\u0150\u0151\5(\25\2\u0151\u0152\b"+
		"\24\1\2\u0152\u0159\3\2\2\2\u0153\u0154\7\n\2\2\u0154\u0155\5(\25\2\u0155"+
		"\u0156\b\24\1\2\u0156\u0158\3\2\2\2\u0157\u0153\3\2\2\2\u0158\u015b\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015c\u015e\7\n\2\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u015f\3\2\2\2\u015f\u0160\7\16\2\2\u0160\u0164\3\2\2\2\u0161"+
		"\u0162\7\r\2\2\u0162\u0164\7\16\2\2\u0163\u014f\3\2\2\2\u0163\u0161\3"+
		"\2\2\2\u0164\'\3\2\2\2\u0165\u0166\58\35\2\u0166\u0167\b\25\1\2\u0167"+
		"\u016f\3\2\2\2\u0168\u0169\5\"\22\2\u0169\u016a\b\25\1\2\u016a\u016f\3"+
		"\2\2\2\u016b\u016c\5&\24\2\u016c\u016d\b\25\1\2\u016d\u016f\3\2\2\2\u016e"+
		"\u0165\3\2\2\2\u016e\u0168\3\2\2\2\u016e\u016b\3\2\2\2\u016f)\3\2\2\2"+
		"\u0170\u0171\b\26\1\2\u0171\u0172\7\7\2\2\u0172\u0173\5\b\5\2\u0173\u0174"+
		"\7\b\2\2\u0174\u0175\b\26\1\2\u0175\u018a\3\2\2\2\u0176\u0177\5\34\17"+
		"\2\u0177\u0178\b\26\1\2\u0178\u018a\3\2\2\2\u0179\u017a\7A\2\2\u017a\u018a"+
		"\b\26\1\2\u017b\u017c\7F\2\2\u017c\u018a\b\26\1\2\u017d\u017e\7G\2\2\u017e"+
		"\u018a\b\26\1\2\u017f\u0180\7<\2\2\u0180\u018a\b\26\1\2\u0181\u0182\7"+
		"=\2\2\u0182\u018a\b\26\1\2\u0183\u0184\5&\24\2\u0184\u0185\b\26\1\2\u0185"+
		"\u018a\3\2\2\2\u0186\u0187\5\"\22\2\u0187\u0188\b\26\1\2\u0188\u018a\3"+
		"\2\2\2\u0189\u0170\3\2\2\2\u0189\u0176\3\2\2\2\u0189\u0179\3\2\2\2\u0189"+
		"\u017b\3\2\2\2\u0189\u017d\3\2\2\2\u0189\u017f\3\2\2\2\u0189\u0181\3\2"+
		"\2\2\u0189\u0183\3\2\2\2\u0189\u0186\3\2\2\2\u018a\u01ae\3\2\2\2\u018b"+
		"\u018c\f\17\2\2\u018c\u018d\t\5\2\2\u018d\u018e\7A\2\2\u018e\u018f\5\30"+
		"\r\2\u018f\u0190\b\26\1\2\u0190\u01ad\3\2\2\2\u0191\u0193\f\16\2\2\u0192"+
		"\u0194\7\22\2\2\u0193\u0192\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0195\3"+
		"\2\2\2\u0195\u0196\5\26\f\2\u0196\u0197\b\26\1\2\u0197\u01ad\3\2\2\2\u0198"+
		"\u0199\f\f\2\2\u0199\u019a\7\r\2\2\u019a\u019b\58\35\2\u019b\u019c\7\16"+
		"\2\2\u019c\u019d\b\26\1\2\u019d\u01ad\3\2\2\2\u019e\u019f\f\13\2\2\u019f"+
		"\u01a0\7\r\2\2\u01a0\u01a1\58\35\2\u01a1\u01a3\t\6\2\2\u01a2\u01a4\58"+
		"\35\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a6\7\16\2\2\u01a6\u01a7\b\26\1\2\u01a7\u01ad\3\2\2\2\u01a8\u01a9\f"+
		"\n\2\2\u01a9\u01aa\7\6\2\2\u01aa\u01ab\7A\2\2\u01ab\u01ad\b\26\1\2\u01ac"+
		"\u018b\3\2\2\2\u01ac\u0191\3\2\2\2\u01ac\u0198\3\2\2\2\u01ac\u019e\3\2"+
		"\2\2\u01ac\u01a8\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae"+
		"\u01af\3\2\2\2\u01af+\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\b\27\1\2"+
		"\u01b2\u01b3\5*\26\2\u01b3\u01b4\b\27\1\2\u01b4\u01be\3\2\2\2\u01b5\u01b6"+
		"\79\2\2\u01b6\u01b7\5*\26\2\u01b7\u01b8\b\27\1\2\u01b8\u01be\3\2\2\2\u01b9"+
		"\u01ba\7:\2\2\u01ba\u01bb\5*\26\2\u01bb\u01bc\b\27\1\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01b1\3\2\2\2\u01bd\u01b5\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be"+
		"\u01c4\3\2\2\2\u01bf\u01c0\f\3\2\2\u01c0\u01c1\t\7\2\2\u01c1\u01c3\b\27"+
		"\1\2\u01c2\u01bf\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4"+
		"\u01c5\3\2\2\2\u01c5-\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\b\30\1\2"+
		"\u01c8\u01c9\5,\27\2\u01c9\u01ca\b\30\1\2\u01ca\u01d2\3\2\2\2\u01cb\u01cc"+
		"\f\3\2\2\u01cc\u01cd\t\b\2\2\u01cd\u01ce\5,\27\2\u01ce\u01cf\b\30\1\2"+
		"\u01cf\u01d1\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3/\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d6\b\31\1\2\u01d6\u01d7\5.\30\2\u01d7\u01d8\b\31\1\2\u01d8\u01e5\3"+
		"\2\2\2\u01d9\u01da\f\4\2\2\u01da\u01db\t\t\2\2\u01db\u01dc\5.\30\2\u01dc"+
		"\u01dd\b\31\1\2\u01dd\u01e4\3\2\2\2\u01de\u01df\f\3\2\2\u01df\u01e0\7"+
		"9\2\2\u01e0\u01e1\5.\30\2\u01e1\u01e2\b\31\1\2\u01e2\u01e4\3\2\2\2\u01e3"+
		"\u01d9\3\2\2\2\u01e3\u01de\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2"+
		"\2\2\u01e5\u01e6\3\2\2\2\u01e6\61\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e8\u01e9"+
		"\b\32\1\2\u01e9\u01ea\5\60\31\2\u01ea\u01eb\b\32\1\2\u01eb\u01f3\3\2\2"+
		"\2\u01ec\u01ed\f\3\2\2\u01ed\u01ee\t\n\2\2\u01ee\u01ef\5\60\31\2\u01ef"+
		"\u01f0\b\32\1\2\u01f0\u01f2\3\2\2\2\u01f1\u01ec\3\2\2\2\u01f2\u01f5\3"+
		"\2\2\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\63\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f6\u01f7\b\33\1\2\u01f7\u01f8\5\62\32\2\u01f8\u01f9"+
		"\b\33\1\2\u01f9\u0205\3\2\2\2\u01fa\u01fb\f\4\2\2\u01fb\u01fc\t\13\2\2"+
		"\u01fc\u01fd\5\62\32\2\u01fd\u01fe\b\33\1\2\u01fe\u0204\3\2\2\2\u01ff"+
		"\u0200\f\3\2\2\u0200\u0201\7\f\2\2\u0201\u0202\7B\2\2\u0202\u0204\b\33"+
		"\1\2\u0203\u01fa\3\2\2\2\u0203\u01ff\3\2\2\2\u0204\u0207\3\2\2\2\u0205"+
		"\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\65\3\2\2\2\u0207\u0205\3\2\2"+
		"\2\u0208\u0209\b\34\1\2\u0209\u020a\5\64\33\2\u020a\u020b\b\34\1\2\u020b"+
		"\u0217\3\2\2\2\u020c\u020d\5,\27\2\u020d\u020e\t\f\2\2\u020e\u020f\5\66"+
		"\34\5\u020f\u0210\b\34\1\2\u0210\u0217\3\2\2\2\u0211\u0212\7A\2\2\u0212"+
		"\u0213\7\t\2\2\u0213\u0214\58\35\2\u0214\u0215\b\34\1\2\u0215\u0217\3"+
		"\2\2\2\u0216\u0208\3\2\2\2\u0216\u020c\3\2\2\2\u0216\u0211\3\2\2\2\u0217"+
		"\u021f\3\2\2\2\u0218\u0219\f\3\2\2\u0219\u021a\7\t\2\2\u021a\u021b\58"+
		"\35\2\u021b\u021c\b\34\1\2\u021c\u021e\3\2\2\2\u021d\u0218\3\2\2\2\u021e"+
		"\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\67\3\2\2"+
		"\2\u0221\u021f\3\2\2\2\u0222\u0223\5\66\34\2\u0223\u0224\b\35\1\2\u0224"+
		"\u0258\3\2\2\2\u0225\u0226\7\65\2\2\u0226\u0227\7B\2\2\u0227\u0228\5\30"+
		"\r\2\u0228\u0229\b\35\1\2\u0229\u0258\3\2\2\2\u022a\u022b\7\66\2\2\u022b"+
		"\u022c\7B\2\2\u022c\u0258\b\35\1\2\u022d\u022e\7\61\2\2\u022e\u022f\5"+
		"8\35\2\u022f\u0230\b\35\1\2\u0230\u0258\3\2\2\2\u0231\u0232\7\63\2\2\u0232"+
		"\u0233\58\35\2\u0233\u0234\b\35\1\2\u0234\u0258\3\2\2\2\u0235\u0236\7"+
		"\64\2\2\u0236\u0237\58\35\2\u0237\u0238\b\35\1\2\u0238\u0258\3\2\2\2\u0239"+
		"\u023a\7+\2\2\u023a\u023b\58\35\2\u023b\u023c\7\67\2\2\u023c\u023d\58"+
		"\35\2\u023d\u023e\b\35\1\2\u023e\u0258\3\2\2\2\u023f\u0240\7+\2\2\u0240"+
		"\u0243\58\35\2\u0241\u0242\7\n\2\2\u0242\u0244\58\35\2\u0243\u0241\3\2"+
		"\2\2\u0243\u0244\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\t\6\2\2\u0246"+
		"\u0247\58\35\2\u0247\u0248\7\67\2\2\u0248\u0249\58\35\2\u0249\u024a\b"+
		"\35\1\2\u024a\u0258\3\2\2\2\u024b\u024c\7,\2\2\u024c\u024d\58\35\2\u024d"+
		"\u0250\5\4\3\2\u024e\u024f\7.\2\2\u024f\u0251\5\4\3\2\u0250\u024e\3\2"+
		"\2\2\u0250\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\b\35\1\2\u0253"+
		"\u0258\3\2\2\2\u0254\u0255\5 \21\2\u0255\u0256\b\35\1\2\u0256\u0258\3"+
		"\2\2\2\u0257\u0222\3\2\2\2\u0257\u0225\3\2\2\2\u0257\u022a\3\2\2\2\u0257"+
		"\u022d\3\2\2\2\u0257\u0231\3\2\2\2\u0257\u0235\3\2\2\2\u0257\u0239\3\2"+
		"\2\2\u0257\u023f\3\2\2\2\u0257\u024b\3\2\2\2\u0257\u0254\3\2\2\2\u0258"+
		"9\3\2\2\28?CJSiq{\177\u0089\u0099\u009f\u00a6\u00aa\u00b1\u00ba\u00c3"+
		"\u00ce\u00d9\u00dd\u00e2\u00e9\u00ee\u00f2\u00fb\u0102\u010e\u0115\u0128"+
		"\u0137\u013b\u0141\u014d\u0159\u015d\u0163\u016e\u0189\u0193\u01a3\u01ac"+
		"\u01ae\u01bd\u01c4\u01d2\u01e3\u01e5\u01f3\u0203\u0205\u0216\u021f\u0243"+
		"\u0250\u0257";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}