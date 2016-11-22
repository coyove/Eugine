// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.interop.*;
import org.coyove.eugine.core.math.*;
import org.coyove.eugine.core.flow.*;
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
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, Var=43, Const=44, Def=45, Inline=46, 
		For=47, If=48, Switch=49, Else=50, Enter=51, Catch=52, Clone=53, Sync=54, 
		Type=55, AddressOf=56, New=57, Static=58, Do=59, Add=60, Sub=61, Not=62, 
		AryOp=63, Integer=64, Double=65, NEWLINE=66, WS=67, Semi=68, Identifier=69, 
		JavaFullName=70, Letter=71, BlockComment=72, LineComment=73, RawString=74, 
		StringLiteral=75;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_syncStmt = 6, RULE_declareStmt = 7, RULE_definitionsList = 8, 
		RULE_argumentsList = 9, RULE_interopArgumentsList = 10, RULE_defineStmt = 11, 
		RULE_lambdaStmt = 12, RULE_switchStmt = 13, RULE_dict = 14, RULE_pair = 15, 
		RULE_list = 16, RULE_value = 17, RULE_topExpr = 18, RULE_postfixExpr = 19, 
		RULE_unaryExpr = 20, RULE_multiplyExpr = 21, RULE_addExpr = 22, RULE_compareExpr = 23, 
		RULE_logicExpr = 24, RULE_assignExpr = 25, RULE_expr = 26;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "syncStmt", 
		"declareStmt", "definitionsList", "argumentsList", "interopArgumentsList", 
		"defineStmt", "lambdaStmt", "switchStmt", "dict", "pair", "list", "value", 
		"topExpr", "postfixExpr", "unaryExpr", "multiplyExpr", "addExpr", "compareExpr", 
		"logicExpr", "assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "'&'", 
		"':'", "'['", "']'", "'=>'", "'@'", "'true'", "'false'", "'null'", "'l'", 
		"'L'", "'++'", "'--'", "'..'", "'...'", "'::'", "':>'", "'#'", "'*'", 
		"'/'", "'%'", "'<+'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'const'", "'def'", "'inline'", 
		null, "'if'", "'switch'", "'else'", "'enter'", "'catch'", "'clone'", "'sync'", 
		"'typeof'", "'addressof'", "'new'", "'static'", "'do'", "'+'", "'-'", 
		"'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Var", "Const", "Def", "Inline", 
		"For", "If", "Switch", "Else", "Enter", "Catch", "Clone", "Sync", "Type", 
		"AddressOf", "New", "Static", "Do", "Add", "Sub", "Not", "AryOp", "Integer", 
		"Double", "NEWLINE", "WS", "Semi", "Identifier", "JavaFullName", "Letter", 
		"BlockComment", "LineComment", "RawString", "StringLiteral"
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
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__20:
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(EOF);
				 ((ProgContext)_localctx).v =  ExecEnvironment.Null; 
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
					 _localctx.v.expressions.add(((BlockContext)_localctx).stmt.v); 
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
				 ((StmtContext)_localctx).v =  ExecEnvironment.Null; 
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
			case T__14:
			case T__15:
			case T__16:
			case T__19:
			case T__20:
			case For:
			case If:
			case Switch:
			case Clone:
			case Type:
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
				 ((StmtContext)_localctx).v =  ExecEnvironment.Null; 
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
		public ListEx<SExpression> multi =  new ListEx<SExpression>();
		public byte act;
		public Token Action;
		public UnaryExprContext Head;
		public ExprContext HeadValue;
		public UnaryExprContext Tail;
		public ExprContext TailValue;
		public List<UnaryExprContext> unaryExpr() {
			return getRuleContexts(UnaryExprContext.class);
		}
		public UnaryExprContext unaryExpr(int i) {
			return getRuleContext(UnaryExprContext.class,i);
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
		enterRule(_localctx, 14, RULE_declareStmt);
		int _la;
		try {
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

			            ((DeclareStmtContext)_localctx).act =  (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.MUTABLE : PSet.IMMUTABLE;
			        
			setState(133);
			((DeclareStmtContext)_localctx).Head = unaryExpr();
			setState(134);
			match(T__6);
			setState(135);
			((DeclareStmtContext)_localctx).HeadValue = expr();

			            _localctx.multi.add(new PSet(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Head.v, ((DeclareStmtContext)_localctx).HeadValue.v, _localctx.act));
			        
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(137);
				match(T__7);
				setState(138);
				((DeclareStmtContext)_localctx).Tail = unaryExpr();
				setState(139);
				match(T__6);
				setState(140);
				((DeclareStmtContext)_localctx).TailValue = expr();

				            _localctx.multi.add(new PSet(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Tail.v, ((DeclareStmtContext)_localctx).TailValue.v, _localctx.act));
				        
				}
				break;
			}

			            ((DeclareStmtContext)_localctx).v =  _localctx.multi.size() == 1 ? _localctx.multi.head() : new PChain(_localctx.multi);
			        
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
		enterRule(_localctx, 16, RULE_definitionsList);
		int _la;
		try {
			int _alt;
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				match(T__4);
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(149);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(148);
							((DefinitionsListContext)_localctx).InitStyle = match(T__8);
							}
						}

						setState(151);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(152);
						match(T__7);
						 
						        _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						        _localctx.passByValue.add(((DefinitionsListContext)_localctx).InitStyle == null);
						    
						}
						} 
					}
					setState(158);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(160);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(159);
					((DefinitionsListContext)_localctx).LastStyle = match(T__8);
					}
				}

				setState(162);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(163);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				        _localctx.passByValue.add(((DefinitionsListContext)_localctx).LastStyle == null);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__4);
				setState(166);
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
		enterRule(_localctx, 18, RULE_argumentsList);
		try {
			int _alt;
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(T__4);
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						((ArgumentsListContext)_localctx).InitExpr = expr();
						setState(171);
						match(T__7);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(178);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(179);
				((ArgumentsListContext)_localctx).LastExpr = expr();
				setState(180);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(T__4);
				setState(184);
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
		enterRule(_localctx, 20, RULE_interopArgumentsList);
		int _la;
		try {
			int _alt;
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				match(T__4);
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(188);
						((InteropArgumentsListContext)_localctx).InitExpr = expr();
						setState(191);
						_la = _input.LA(1);
						if (_la==T__9) {
							{
							setState(189);
							match(T__9);
							setState(190);
							((InteropArgumentsListContext)_localctx).InitDef = _input.LT(1);
							_la = _input.LA(1);
							if ( !(_la==Identifier || _la==JavaFullName) ) {
								((InteropArgumentsListContext)_localctx).InitDef = (Token)_errHandler.recoverInline(this);
							} else {
								consume();
							}
							}
						}

						setState(193);
						match(T__7);
						 
						                _localctx.args.add(((InteropArgumentsListContext)_localctx).InitExpr.v);
						                _localctx.defs.add(((InteropArgumentsListContext)_localctx).InitDef == null ? "" : (((InteropArgumentsListContext)_localctx).InitDef!=null?((InteropArgumentsListContext)_localctx).InitDef.getText():null).replace("\\", "."));
						            
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(201);
				((InteropArgumentsListContext)_localctx).LastExpr = expr();
				setState(204);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(202);
					match(T__9);
					setState(203);
					((InteropArgumentsListContext)_localctx).LastDef = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Identifier || _la==JavaFullName) ) {
						((InteropArgumentsListContext)_localctx).LastDef = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(206);
				match(T__5);

				        _localctx.args.add(((InteropArgumentsListContext)_localctx).LastExpr.v);
				        _localctx.defs.add(((InteropArgumentsListContext)_localctx).LastDef == null ? "" : (((InteropArgumentsListContext)_localctx).LastDef!=null?((InteropArgumentsListContext)_localctx).LastDef.getText():null).replace("\\", "."));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(T__4);
				setState(210);
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
		public ExprContext Get;
		public LambdaStmtContext Lambda;
		public TerminalNode Def() { return getToken(EugineParser.Def, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LambdaStmtContext lambdaStmt() {
			return getRuleContext(LambdaStmtContext.class,0);
		}
		public TerminalNode Inline() { return getToken(EugineParser.Inline, 0); }
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
			setState(213);
			match(Def);
			setState(215);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(214);
				((DefineStmtContext)_localctx).Inline = match(Inline);
				}
			}

			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(T__10);
					setState(218);
					((DefineStmtContext)_localctx).Decorator = expr();
					setState(220);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(219);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(222);
					match(T__11);
					 
					            _localctx.decorators.add(new PCall(new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), 
					                ((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v));
					        
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(230);
			((DefineStmtContext)_localctx).Get = expr();
			setState(231);
			((DefineStmtContext)_localctx).Lambda = lambdaStmt();

			            Atom a = new Atom((((DefineStmtContext)_localctx).Get!=null?(((DefineStmtContext)_localctx).Get.start):null));
			            SExpression closure = ((DefineStmtContext)_localctx).Lambda.v;
			            ((PLambda) closure).inline = ((DefineStmtContext)_localctx).Inline != null;

			            for (SExpression d : _localctx.decorators) {
			                closure = new PCall(a, d, ListEx.build(closure));
			            }
			            
			            ((DefineStmtContext)_localctx).v =  new PSet(a, ((DefineStmtContext)_localctx).Get.v, closure, PSet.IMMUTABLE);
			        
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
		public PLambda v;
		public ListEx<SExpression> body =  new ListEx<SExpression>();
		public PVariable ret;
		public DefinitionsListContext definitionsList;
		public Token Description;
		public Token Identifier;
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
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
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
			setState(234);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(236);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(235);
				((LambdaStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((LambdaStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(238);
			match(T__12);
			setState(242);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(239);
				match(T__13);
				setState(240);
				((LambdaStmtContext)_localctx).Identifier = match(Identifier);

				        ((LambdaStmtContext)_localctx).ret =  new PVariable((((LambdaStmtContext)_localctx).Identifier!=null?((LambdaStmtContext)_localctx).Identifier.getText():null));
				        _localctx.body.add(new PSet(new Atom(((LambdaStmtContext)_localctx).Identifier), _localctx.ret, ExecEnvironment.Null, PSet.MUTABLE)); 
				    
				}
			}

			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(244);
				match(T__0);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(245);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(254);
				((LambdaStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			            if (_localctx.ret != null) {
			                _localctx.body.add(_localctx.ret);
			            }

			            ((LambdaStmtContext)_localctx).v =  new PLambda(new Atom((((LambdaStmtContext)_localctx).definitionsList!=null?(((LambdaStmtContext)_localctx).definitionsList.start):null)), ((LambdaStmtContext)_localctx).definitionsList.v, ((LambdaStmtContext)_localctx).definitionsList.passByValue,
			                _localctx.body, ((LambdaStmtContext)_localctx).Description == null ? "" : (((LambdaStmtContext)_localctx).Description!=null?((LambdaStmtContext)_localctx).Description.getText():null), false);
			        
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
		enterRule(_localctx, 26, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(262);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(263);
			match(Do);
			setState(264);
			match(T__0);
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(265);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(266);
				match(T__12);
				setState(267);
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
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(275);
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
		enterRule(_localctx, 28, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(T__0);
				setState(279);
				((DictContext)_localctx).pair = pair();
				 
				            _localctx.v.keys.add(((DictContext)_localctx).pair.k); 
				            _localctx.v.values.add(((DictContext)_localctx).pair.v);
				        
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(281);
						match(T__7);
						setState(282);
						((DictContext)_localctx).pair = pair();
						 
						            _localctx.v.keys.add(((DictContext)_localctx).pair.k); 
						            _localctx.v.values.add(((DictContext)_localctx).pair.v);
						        
						}
						} 
					}
					setState(289);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(291);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(290);
					match(T__7);
					}
				}

				setState(293);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(295);
				match(T__0);
				setState(296);
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
		enterRule(_localctx, 30, RULE_pair);
		int _la;
		try {
			setState(309);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(300);
				match(T__9);
				setState(301);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				((PairContext)_localctx).Key = match(Identifier);
				setState(305);
				match(T__9);
				setState(306);
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
		enterRule(_localctx, 32, RULE_list);
		int _la;
		try {
			int _alt;
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				match(T__10);
				{
				setState(312);
				((ListContext)_localctx).value = value();
				 _localctx.v.values.add(((ListContext)_localctx).value.v); 
				}
				setState(321);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(315);
						match(T__7);
						setState(316);
						((ListContext)_localctx).value = value();
						 _localctx.v.values.add(((ListContext)_localctx).value.v); 
						}
						} 
					}
					setState(323);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(325);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(324);
					match(T__7);
					}
				}

				setState(327);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(329);
				match(T__10);
				setState(330);
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
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(342);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
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
		public StmtContext Inner;
		public LambdaStmtContext lambdaStmt;
		public Token Identifier;
		public Token RawString;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
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
		TopExprContext _localctx = new TopExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_topExpr);
		int _la;
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(T__4);
				setState(345);
				((TopExprContext)_localctx).Inner = stmt();
				setState(346);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(352);
				match(T__14);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.True; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(354);
				match(T__15);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.False; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(356);
				match(T__16);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(358);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable(new Atom(((TopExprContext)_localctx).Identifier), (((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(360);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(362);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(364);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInt((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(366);
				((TopExprContext)_localctx).Integer = match(Integer);
				setState(367);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				 ((TopExprContext)_localctx).v =  new SLong((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(369);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SDouble((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
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

	public static class PostfixExprContext extends ParserRuleContext {
		public SExpression v;
		public PostfixExprContext Left;
		public PostfixExprContext Subject;
		public PostfixExprContext Called;
		public TopExprContext Top;
		public Token Op;
		public ExprContext Key;
		public ExprContext Start;
		public ExprContext End;
		public Token Identifier;
		public Token Method;
		public InteropArgumentsListContext interopArgumentsList;
		public Token Mt;
		public ArgumentsListContext argumentsList;
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public InteropArgumentsListContext interopArgumentsList() {
			return getRuleContext(InteropArgumentsListContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public PostfixExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterPostfixExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitPostfixExpr(this);
		}
	}

	public final PostfixExprContext postfixExpr() throws RecognitionException {
		return postfixExpr(0);
	}

	private PostfixExprContext postfixExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExprContext _localctx = new PostfixExprContext(_ctx, _parentState);
		PostfixExprContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(374);
			((PostfixExprContext)_localctx).Top = topExpr();
			 ((PostfixExprContext)_localctx).v =  ((PostfixExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(415);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(413);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(377);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(378);
						((PostfixExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((PostfixExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}

						                      Atom ha = new Atom(((PostfixExprContext)_localctx).Op);
						                      if ((((PostfixExprContext)_localctx).Op!=null?((PostfixExprContext)_localctx).Op.getText():null).equals("++")) {
						                          ((PostfixExprContext)_localctx).v =  new PSet(ha, ((PostfixExprContext)_localctx).Left.v, new PAdd(ha, ((PostfixExprContext)_localctx).Left.v, new SInt(1)), PSet.SET);
						                      } else {
						                          ((PostfixExprContext)_localctx).v =  new PSet(ha, ((PostfixExprContext)_localctx).Left.v, new PSubtract(ha, ((PostfixExprContext)_localctx).Left.v, new SInt(1)), PSet.SET);
						                      }
						                  
						}
						break;
					case 2:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(380);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(381);
						match(T__10);
						setState(382);
						((PostfixExprContext)_localctx).Key = expr();
						setState(383);
						match(T__11);

						                      ((PostfixExprContext)_localctx).v =  new PGet(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, ((PostfixExprContext)_localctx).Key.v);
						                  
						}
						break;
					case 3:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(386);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(387);
						match(T__10);
						setState(388);
						((PostfixExprContext)_localctx).Start = expr();
						setState(389);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(391);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub) | (1L << Not))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(390);
							((PostfixExprContext)_localctx).End = expr();
							}
						}

						setState(393);
						match(T__11);

						                      ((PostfixExprContext)_localctx).v =  new PSub(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, ((PostfixExprContext)_localctx).Start.v, ((PostfixExprContext)_localctx).End == null ? null : ((PostfixExprContext)_localctx).End.v);
						                  
						}
						break;
					case 4:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(396);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(397);
						match(T__3);
						setState(398);
						((PostfixExprContext)_localctx).Identifier = match(Identifier);

						                      ((PostfixExprContext)_localctx).v =  new PGet(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, new SString((((PostfixExprContext)_localctx).Identifier!=null?((PostfixExprContext)_localctx).Identifier.getText():null)));
						                  
						}
						break;
					case 5:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(400);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(401);
						((PostfixExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((PostfixExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(402);
						((PostfixExprContext)_localctx).Method = match(Identifier);
						setState(403);
						((PostfixExprContext)_localctx).interopArgumentsList = interopArgumentsList();

						                      ((PostfixExprContext)_localctx).v =  new PInteropCall(new Atom((((PostfixExprContext)_localctx).Called!=null?(((PostfixExprContext)_localctx).Called.start):null)), ((PostfixExprContext)_localctx).Called.v,
						                          (((PostfixExprContext)_localctx).Method!=null?((PostfixExprContext)_localctx).Method.getText():null), ((PostfixExprContext)_localctx).interopArgumentsList.defs, ((PostfixExprContext)_localctx).interopArgumentsList.args, 
						                          (((PostfixExprContext)_localctx).Op!=null?((PostfixExprContext)_localctx).Op.getText():null).equals("::") ? 
						                              PInteropCall.RETURN_TYPE.CAST_TO_SVALUE :
						                              PInteropCall.RETURN_TYPE.DIRECT_RETURN);
						                  
						}
						break;
					case 6:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(406);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(408);
						_la = _input.LA(1);
						if (_la==T__25) {
							{
							setState(407);
							((PostfixExprContext)_localctx).Mt = match(T__25);
							}
						}

						setState(410);
						((PostfixExprContext)_localctx).argumentsList = argumentsList();

						                      if (((PostfixExprContext)_localctx).Mt != null) {
						                          ((PostfixExprContext)_localctx).v =  new PThread(new Atom(((PostfixExprContext)_localctx).Mt), ((PostfixExprContext)_localctx).Called.v, ((PostfixExprContext)_localctx).argumentsList.v);
						                      } else {
						                          if (SKeywords.Lookup.containsKey((((PostfixExprContext)_localctx).Called!=null?_input.getText(((PostfixExprContext)_localctx).Called.start,((PostfixExprContext)_localctx).Called.stop):null))) {
						                              ((PostfixExprContext)_localctx).v =  SKeywords.Lookup.get((((PostfixExprContext)_localctx).Called!=null?_input.getText(((PostfixExprContext)_localctx).Called.start,((PostfixExprContext)_localctx).Called.stop):null)).call((((PostfixExprContext)_localctx).Called!=null?(((PostfixExprContext)_localctx).Called.start):null), ((PostfixExprContext)_localctx).argumentsList.v); 
						                          } else {
						                              ((PostfixExprContext)_localctx).v =  new PCall(new Atom((((PostfixExprContext)_localctx).Called!=null?(((PostfixExprContext)_localctx).Called.start):null)), ((PostfixExprContext)_localctx).Called.v, ((PostfixExprContext)_localctx).argumentsList.v);
						                          }
						                      }
						                  
						}
						break;
					}
					} 
				}
				setState(417);
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
		public PostfixExprContext Top;
		public Token Sub;
		public PostfixExprContext Right;
		public Token Not;
		public Token Op;
		public UnaryExprContext Left;
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
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
		UnaryExprContext _localctx = new UnaryExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_unaryExpr);
		int _la;
		try {
			setState(433);
			switch (_input.LA(1)) {
			case T__4:
			case T__14:
			case T__15:
			case T__16:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(418);
				((UnaryExprContext)_localctx).Top = postfixExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(422);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            if (((UnaryExprContext)_localctx).Right.v instanceof SInt) {
				                ((UnaryExprContext)_localctx).v =  new SInt(-((SInt) ((UnaryExprContext)_localctx).Right.v).val());
				            } else if (((UnaryExprContext)_localctx).Right.v instanceof SLong) {
				                ((UnaryExprContext)_localctx).v =  new SLong(-((SLong) ((UnaryExprContext)_localctx).Right.v).val());
				            } else if (((UnaryExprContext)_localctx).Right.v instanceof SDouble) {
				                ((UnaryExprContext)_localctx).v =  new SDouble(-((SDouble) ((UnaryExprContext)_localctx).Right.v).val());
				            } else {
				                ((UnaryExprContext)_localctx).v =  new SEReverse(new Atom(((UnaryExprContext)_localctx).Sub), ListEx.build(((UnaryExprContext)_localctx).Right.v));
				            }
				        
				}
				break;
			case Not:
				enterOuterAlt(_localctx, 3);
				{
				setState(425);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(426);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            ((UnaryExprContext)_localctx).v =  new SEReverse(new Atom(((UnaryExprContext)_localctx).Not), ListEx.build(((UnaryExprContext)_localctx).Right.v));
				        
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(429);
				((UnaryExprContext)_localctx).Op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((UnaryExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(430);
				((UnaryExprContext)_localctx).Left = unaryExpr();

				            Atom ha = new Atom(((UnaryExprContext)_localctx).Op);
				            if ((((UnaryExprContext)_localctx).Op!=null?((UnaryExprContext)_localctx).Op.getText():null).equals("++")) {
				                ((UnaryExprContext)_localctx).v =  new PSet(ha, ((UnaryExprContext)_localctx).Left.v, new PAdd(ha, ((UnaryExprContext)_localctx).Left.v, new SInt(1)), PSet.SET);
				            } else {
				                ((UnaryExprContext)_localctx).v =  new PSet(ha, ((UnaryExprContext)_localctx).Left.v, new PSubtract(ha, ((UnaryExprContext)_localctx).Left.v, new SInt(1)), PSet.SET);
				            }
				        
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(436);
			((MultiplyExprContext)_localctx).Top = unaryExpr();
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(456);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(454);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(439);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(440);
						((MultiplyExprContext)_localctx).Op = match(T__26);
						setState(441);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PMultiply(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 2:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(444);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(445);
						((MultiplyExprContext)_localctx).Op = match(T__27);
						setState(446);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PDivide(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 3:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(449);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(450);
						((MultiplyExprContext)_localctx).Op = match(T__28);
						setState(451);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PModular(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(458);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(460);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(480);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(478);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(463);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(464);
						((AddExprContext)_localctx).AddOp = match(Add);
						setState(465);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PAdd(new Atom(((AddExprContext)_localctx).AddOp), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 2:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(468);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(469);
						((AddExprContext)_localctx).AddOp = match(T__29);
						setState(470);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PAppend(new Atom(((AddExprContext)_localctx).AddOp), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 3:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(473);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(474);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(475);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PSubtract(new Atom(((AddExprContext)_localctx).Sub), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(482);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(484);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(519);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(517);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(487);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(488);
						((CompareExprContext)_localctx).Op = match(T__30);
						setState(489);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PLess(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 2:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(492);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(493);
						((CompareExprContext)_localctx).Op = match(T__31);
						setState(494);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PGreat(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 3:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(497);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(498);
						((CompareExprContext)_localctx).Op = match(T__32);
						setState(499);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PLessEqual(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 4:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(502);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(503);
						((CompareExprContext)_localctx).Op = match(T__33);
						setState(504);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PGreatEqual(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 5:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(507);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(508);
						((CompareExprContext)_localctx).Op = match(T__34);
						setState(509);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PEqual(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 6:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(512);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(513);
						((CompareExprContext)_localctx).Op = match(T__35);
						setState(514);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PNotEqual(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(521);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_logicExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(523);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(526);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(527);
						((LogicExprContext)_localctx).Op = match(T__36);
						setState(528);
						((LogicExprContext)_localctx).Right = compareExpr(0);

						                      ((LogicExprContext)_localctx).v =  new PLogic(new Atom(((LogicExprContext)_localctx).Op), ((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v, PLogic.AND);
						                  
						}
						break;
					case 2:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(531);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(532);
						((LogicExprContext)_localctx).Op = match(T__37);
						setState(533);
						((LogicExprContext)_localctx).Right = compareExpr(0);

						                      ((LogicExprContext)_localctx).v =  new PLogic(new Atom(((LogicExprContext)_localctx).Op), ((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v, PLogic.OR);
						                  
						}
						break;
					case 3:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(536);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(537);
						match(T__9);
						setState(538);
						((LogicExprContext)_localctx).JavaFullName = match(JavaFullName);

						                      ((LogicExprContext)_localctx).v =  new PInteropCast(new Atom(((LogicExprContext)_localctx).JavaFullName), ((LogicExprContext)_localctx).Left.v, (((LogicExprContext)_localctx).JavaFullName!=null?((LogicExprContext)_localctx).JavaFullName.getText():null).replace("\\", "."));
						                  
						}
						break;
					}
					} 
				}
				setState(544);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(546);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(549);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(550);
				((AssignExprContext)_localctx).Op = match(T__38);
				setState(551);
				((AssignExprContext)_localctx).Right = assignExpr(5);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PAdd(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			case 3:
				{
				setState(554);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(555);
				((AssignExprContext)_localctx).Op = match(T__39);
				setState(556);
				((AssignExprContext)_localctx).Right = assignExpr(4);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PSubtract(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			case 4:
				{
				setState(559);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(560);
				((AssignExprContext)_localctx).Op = match(T__40);
				setState(561);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PMultiply(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			case 5:
				{
				setState(564);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(565);
				((AssignExprContext)_localctx).Op = match(T__41);
				setState(566);
				((AssignExprContext)_localctx).Right = assignExpr(2);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PDivide(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(578);
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
					setState(571);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(572);
					match(T__6);
					setState(573);
					((AssignExprContext)_localctx).Value = expr();

					                      if (((AssignExprContext)_localctx).Subject.v instanceof PGet) {
					                          PGet get = (PGet) ((AssignExprContext)_localctx).Subject.v;
					                          ((AssignExprContext)_localctx).v =  new PPut(new Atom((((AssignExprContext)_localctx).Subject!=null?(((AssignExprContext)_localctx).Subject.start):null)), get.sub, get.key, ((AssignExprContext)_localctx).Value.v, PPut.DECLARE.SET);
					                      } else {
					                          ((AssignExprContext)_localctx).v =  new PSet(new Atom((((AssignExprContext)_localctx).Subject!=null?(((AssignExprContext)_localctx).Subject.start):null)), ((AssignExprContext)_localctx).Subject.v, ((AssignExprContext)_localctx).Value.v, PSet.SET);
					                      }
					                  
					}
					} 
				}
				setState(580);
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
			setState(636);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(581);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				((ExprContext)_localctx).New = match(New);
				setState(585);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				setState(586);
				((ExprContext)_localctx).interopArgumentsList = interopArgumentsList();

				            String classname = (((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", ".");
				            ((ExprContext)_localctx).v =  new PInteropNew(new Atom(((ExprContext)_localctx).New), getClassByName(classname, ((ExprContext)_localctx).New),
				                ((ExprContext)_localctx).interopArgumentsList.defs, ((ExprContext)_localctx).interopArgumentsList.args);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(589);
				((ExprContext)_localctx).Static = match(Static);
				setState(590);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				 
				            ((ExprContext)_localctx).v =  getClassByName((((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("\\", "."), ((ExprContext)_localctx).Static); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(592);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(593);
				((ExprContext)_localctx).Subject = expr();
				 
				            ((ExprContext)_localctx).v =  new PClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(596);
				((ExprContext)_localctx).Type = match(Type);
				setState(597);
				((ExprContext)_localctx).Subject = expr();
				 
				            ((ExprContext)_localctx).v =  new PType(new Atom(((ExprContext)_localctx).Type), ((ExprContext)_localctx).Subject.v, PType.TYPE.TYPE); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(600);
				((ExprContext)_localctx).For = match(For);
				setState(601);
				((ExprContext)_localctx).Subject = expr();
				setState(602);
				match(Do);
				setState(603);
				((ExprContext)_localctx).Body = expr();

				            if (SConfig.strictForLoop) {
				                ((ExprContext)_localctx).v =  new PForStrict(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                    (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? PFor.DIRECTION.ASC : PFor.DIRECTION.DESC); 
				            } else {
				                ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                    (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? PFor.DIRECTION.ASC : PFor.DIRECTION.DESC); 
				            }
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(606);
				((ExprContext)_localctx).For = match(For);
				setState(607);
				((ExprContext)_localctx).Start = expr();
				setState(610);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(608);
					match(T__7);
					setState(609);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(612);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(613);
				((ExprContext)_localctx).End = expr();
				setState(614);
				match(Do);
				setState(615);
				((ExprContext)_localctx).Body = expr();

				            Atom atom = new Atom(((ExprContext)_localctx).For);
				            PIRange r = new PIRange(atom, ListEx.build(
				                    ((ExprContext)_localctx).Start.v, 
				                    ((ExprContext)_localctx).Next == null ? new SInt(1) : new PSubtract(atom, ((ExprContext)_localctx).Next.v, ((ExprContext)_localctx).Start.v), 
				                    ((ExprContext)_localctx).End.v
				                ));

				            if (SConfig.strictForLoop) {
				                ((ExprContext)_localctx).v =  new PForStrict(atom, r, ((ExprContext)_localctx).Body.v, PFor.DIRECTION.ASC); 
				            } else {
				                ((ExprContext)_localctx).v =  new PFor(atom, r, ((ExprContext)_localctx).Body.v, PFor.DIRECTION.ASC); 
				            }
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(618);
				((ExprContext)_localctx).If = match(If);
				setState(619);
				((ExprContext)_localctx).Condition = expr();
				setState(620);
				((ExprContext)_localctx).True = code();
				setState(623);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(621);
					match(Else);
					setState(622);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new PIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(627);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(630);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(633);
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
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
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
	private boolean postfixExpr_sempred(PostfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 3);
		case 10:
			return precpred(_ctx, 2);
		case 11:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compareExpr_sempred(CompareExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 6);
		case 13:
			return precpred(_ctx, 5);
		case 14:
			return precpred(_ctx, 4);
		case 15:
			return precpred(_ctx, 3);
		case 16:
			return precpred(_ctx, 2);
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 3);
		case 19:
			return precpred(_ctx, 2);
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignExpr_sempred(AssignExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3M\u0281\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\6\2<\n\2\r\2\16\2=\3\2\3\2"+
		"\5\2B\n\2\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\4\3\4\3\4\6\4P\n\4\r"+
		"\4\16\4Q\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0092\n\t\3"+
		"\t\3\t\3\n\3\n\5\n\u0098\n\n\3\n\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0"+
		"\13\n\3\n\5\n\u00a3\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00aa\n\n\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00b1\n\13\f\13\16\13\u00b4\13\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\5\13\u00bc\n\13\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\f\3\f\3"+
		"\f\7\f\u00c7\n\f\f\f\16\f\u00ca\13\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u00d6\n\f\3\r\3\r\5\r\u00da\n\r\3\r\3\r\3\r\5\r\u00df"+
		"\n\r\3\r\3\r\3\r\7\r\u00e4\n\r\f\r\16\r\u00e7\13\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\5\16\u00ef\n\16\3\16\3\16\3\16\3\16\5\16\u00f5\n\16\3\16\3\16\3"+
		"\16\3\16\7\16\u00fb\n\16\f\16\16\16\u00fe\13\16\3\16\3\16\3\16\3\16\5"+
		"\16\u0104\n\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u0111\n\17\f\17\16\17\u0114\13\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\7\20\u0120\n\20\f\20\16\20\u0123\13\20\3\20\5\20"+
		"\u0126\n\20\3\20\3\20\3\20\3\20\5\20\u012c\n\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0138\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\7\22\u0142\n\22\f\22\16\22\u0145\13\22\3\22\5\22\u0148"+
		"\n\22\3\22\3\22\3\22\3\22\5\22\u014e\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0159\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u0176\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u018a"+
		"\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u019b\n\25\3\25\3\25\3\25\7\25\u01a0\n\25\f\25\16\25\u01a3"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u01b4\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01c9\n\27\f\27"+
		"\16\27\u01cc\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01e1\n\30\f\30\16\30"+
		"\u01e4\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0208\n\31\f\31\16\31"+
		"\u020b\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u021f\n\32\f\32\16\32\u0222\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u023c\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\7\33\u0243\n\33\f\33\16\33\u0246\13\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0265\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u0272\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u027f\n\34\3\34\2\b(,.\60\62\64\35\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\66\2\t\3\2-.\3\2GH\3\2LM\3\2\24\25\3\2\26"+
		"\27\3\2\30\31\3\2\32\33\u02c3\2A\3\2\2\2\4H\3\2\2\2\6O\3\2\2\2\bg\3\2"+
		"\2\2\ni\3\2\2\2\fr\3\2\2\2\16\u0081\3\2\2\2\20\u0085\3\2\2\2\22\u00a9"+
		"\3\2\2\2\24\u00bb\3\2\2\2\26\u00d5\3\2\2\2\30\u00d7\3\2\2\2\32\u00ec\3"+
		"\2\2\2\34\u0107\3\2\2\2\36\u012b\3\2\2\2 \u0137\3\2\2\2\"\u014d\3\2\2"+
		"\2$\u0158\3\2\2\2&\u0175\3\2\2\2(\u0177\3\2\2\2*\u01b3\3\2\2\2,\u01b5"+
		"\3\2\2\2.\u01cd\3\2\2\2\60\u01e5\3\2\2\2\62\u020c\3\2\2\2\64\u023b\3\2"+
		"\2\2\66\u027e\3\2\2\289\5\6\4\29:\b\2\1\2:<\3\2\2\2;8\3\2\2\2<=\3\2\2"+
		"\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?@\7\2\2\3@B\b\2\1\2A;\3\2\2\2A?\3\2\2"+
		"\2B\3\3\2\2\2CD\7\3\2\2DE\5\6\4\2EF\7\4\2\2FI\3\2\2\2GI\5\b\5\2HC\3\2"+
		"\2\2HG\3\2\2\2IJ\3\2\2\2JK\b\3\1\2K\5\3\2\2\2LM\5\b\5\2MN\b\4\1\2NP\3"+
		"\2\2\2OL\3\2\2\2PQ\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\7\3\2\2\2ST\5\n\6\2TU"+
		"\b\5\1\2Uh\3\2\2\2VW\5\f\7\2WX\b\5\1\2Xh\3\2\2\2YZ\5\16\b\2Z[\b\5\1\2"+
		"[h\3\2\2\2\\]\5\20\t\2]^\b\5\1\2^h\3\2\2\2_`\5\30\r\2`a\b\5\1\2ah\3\2"+
		"\2\2bc\5\66\34\2cd\b\5\1\2dh\3\2\2\2ef\7F\2\2fh\b\5\1\2gS\3\2\2\2gV\3"+
		"\2\2\2gY\3\2\2\2g\\\3\2\2\2g_\3\2\2\2gb\3\2\2\2ge\3\2\2\2h\t\3\2\2\2i"+
		"j\7\5\2\2jo\7G\2\2kl\7\6\2\2ln\7G\2\2mk\3\2\2\2nq\3\2\2\2om\3\2\2\2op"+
		"\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rs\7\65\2\2sy\5\4\3\2tu\7\66\2\2uv\7\7\2"+
		"\2vw\7G\2\2wx\7\b\2\2xz\5\4\3\2yt\3\2\2\2yz\3\2\2\2z}\3\2\2\2{|\7=\2\2"+
		"|~\5\4\3\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\7\1\2\u0080\r"+
		"\3\2\2\2\u0081\u0082\78\2\2\u0082\u0083\5\4\3\2\u0083\u0084\b\b\1\2\u0084"+
		"\17\3\2\2\2\u0085\u0086\t\2\2\2\u0086\u0087\b\t\1\2\u0087\u0088\5*\26"+
		"\2\u0088\u0089\7\t\2\2\u0089\u008a\5\66\34\2\u008a\u0091\b\t\1\2\u008b"+
		"\u008c\7\n\2\2\u008c\u008d\5*\26\2\u008d\u008e\7\t\2\2\u008e\u008f\5\66"+
		"\34\2\u008f\u0090\b\t\1\2\u0090\u0092\3\2\2\2\u0091\u008b\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\b\t\1\2\u0094\21\3\2\2"+
		"\2\u0095\u009e\7\7\2\2\u0096\u0098\7\13\2\2\u0097\u0096\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\7G\2\2\u009a\u009b\7\n"+
		"\2\2\u009b\u009d\b\n\1\2\u009c\u0097\3\2\2\2\u009d\u00a0\3\2\2\2\u009e"+
		"\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2"+
		"\2\2\u00a1\u00a3\7\13\2\2\u00a2\u00a1\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a5\7G\2\2\u00a5\u00a6\7\b\2\2\u00a6\u00aa\b\n"+
		"\1\2\u00a7\u00a8\7\7\2\2\u00a8\u00aa\7\b\2\2\u00a9\u0095\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\23\3\2\2\2\u00ab\u00b2\7\7\2\2\u00ac\u00ad\5\66\34"+
		"\2\u00ad\u00ae\7\n\2\2\u00ae\u00af\b\13\1\2\u00af\u00b1\3\2\2\2\u00b0"+
		"\u00ac\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\5\66\34\2\u00b6"+
		"\u00b7\7\b\2\2\u00b7\u00b8\b\13\1\2\u00b8\u00bc\3\2\2\2\u00b9\u00ba\7"+
		"\7\2\2\u00ba\u00bc\7\b\2\2\u00bb\u00ab\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc"+
		"\25\3\2\2\2\u00bd\u00c8\7\7\2\2\u00be\u00c1\5\66\34\2\u00bf\u00c0\7\f"+
		"\2\2\u00c0\u00c2\t\3\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\b\f\1\2\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00be\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8"+
		"\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\5\66"+
		"\34\2\u00cc\u00cd\7\f\2\2\u00cd\u00cf\t\3\2\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cf\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\b\2\2\u00d1\u00d2\b\f"+
		"\1\2\u00d2\u00d6\3\2\2\2\u00d3\u00d4\7\7\2\2\u00d4\u00d6\7\b\2\2\u00d5"+
		"\u00bd\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d6\27\3\2\2\2\u00d7\u00d9\7/\2\2"+
		"\u00d8\u00da\7\60\2\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00e5"+
		"\3\2\2\2\u00db\u00dc\7\r\2\2\u00dc\u00de\5\66\34\2\u00dd\u00df\5\24\13"+
		"\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1"+
		"\7\16\2\2\u00e1\u00e2\b\r\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00db\3\2\2\2"+
		"\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e8"+
		"\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea\5\32\16"+
		"\2\u00ea\u00eb\b\r\1\2\u00eb\31\3\2\2\2\u00ec\u00ee\5\22\n\2\u00ed\u00ef"+
		"\t\4\2\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f4\7\17\2\2\u00f1\u00f2\7\20\2\2\u00f2\u00f3\7G\2\2\u00f3\u00f5\b"+
		"\16\1\2\u00f4\u00f1\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u0103\3\2\2\2\u00f6"+
		"\u00fc\7\3\2\2\u00f7\u00f8\5\b\5\2\u00f8\u00f9\b\16\1\2\u00f9\u00fb\3"+
		"\2\2\2\u00fa\u00f7\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0104\7\4"+
		"\2\2\u0100\u0101\5\b\5\2\u0101\u0102\b\16\1\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00f6\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\b\16"+
		"\1\2\u0106\33\3\2\2\2\u0107\u0108\7\63\2\2\u0108\u0109\5\66\34\2\u0109"+
		"\u010a\7=\2\2\u010a\u0112\7\3\2\2\u010b\u010c\5\66\34\2\u010c\u010d\7"+
		"\17\2\2\u010d\u010e\5\4\3\2\u010e\u010f\b\17\1\2\u010f\u0111\3\2\2\2\u0110"+
		"\u010b\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2"+
		"\2\2\u0113\u0115\3\2\2\2\u0114\u0112\3\2\2\2\u0115\u0116\7\4\2\2\u0116"+
		"\u0117\b\17\1\2\u0117\35\3\2\2\2\u0118\u0119\7\3\2\2\u0119\u011a\5 \21"+
		"\2\u011a\u0121\b\20\1\2\u011b\u011c\7\n\2\2\u011c\u011d\5 \21\2\u011d"+
		"\u011e\b\20\1\2\u011e\u0120\3\2\2\2\u011f\u011b\3\2\2\2\u0120\u0123\3"+
		"\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0126\7\n\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\4\2\2\u0128\u012c\3\2\2\2\u0129"+
		"\u012a\7\3\2\2\u012a\u012c\7\4\2\2\u012b\u0118\3\2\2\2\u012b\u0129\3\2"+
		"\2\2\u012c\37\3\2\2\2\u012d\u012e\t\4\2\2\u012e\u012f\7\f\2\2\u012f\u0130"+
		"\5$\23\2\u0130\u0131\b\21\1\2\u0131\u0138\3\2\2\2\u0132\u0133\7G\2\2\u0133"+
		"\u0134\7\f\2\2\u0134\u0135\5$\23\2\u0135\u0136\b\21\1\2\u0136\u0138\3"+
		"\2\2\2\u0137\u012d\3\2\2\2\u0137\u0132\3\2\2\2\u0138!\3\2\2\2\u0139\u013a"+
		"\7\r\2\2\u013a\u013b\5$\23\2\u013b\u013c\b\22\1\2\u013c\u0143\3\2\2\2"+
		"\u013d\u013e\7\n\2\2\u013e\u013f\5$\23\2\u013f\u0140\b\22\1\2\u0140\u0142"+
		"\3\2\2\2\u0141\u013d\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u0148\7\n"+
		"\2\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2\2\2\u0149"+
		"\u014a\7\16\2\2\u014a\u014e\3\2\2\2\u014b\u014c\7\r\2\2\u014c\u014e\7"+
		"\16\2\2\u014d\u0139\3\2\2\2\u014d\u014b\3\2\2\2\u014e#\3\2\2\2\u014f\u0150"+
		"\5\66\34\2\u0150\u0151\b\23\1\2\u0151\u0159\3\2\2\2\u0152\u0153\5\36\20"+
		"\2\u0153\u0154\b\23\1\2\u0154\u0159\3\2\2\2\u0155\u0156\5\"\22\2\u0156"+
		"\u0157\b\23\1\2\u0157\u0159\3\2\2\2\u0158\u014f\3\2\2\2\u0158\u0152\3"+
		"\2\2\2\u0158\u0155\3\2\2\2\u0159%\3\2\2\2\u015a\u015b\7\7\2\2\u015b\u015c"+
		"\5\b\5\2\u015c\u015d\7\b\2\2\u015d\u015e\b\24\1\2\u015e\u0176\3\2\2\2"+
		"\u015f\u0160\5\32\16\2\u0160\u0161\b\24\1\2\u0161\u0176\3\2\2\2\u0162"+
		"\u0163\7\21\2\2\u0163\u0176\b\24\1\2\u0164\u0165\7\22\2\2\u0165\u0176"+
		"\b\24\1\2\u0166\u0167\7\23\2\2\u0167\u0176\b\24\1\2\u0168\u0169\7G\2\2"+
		"\u0169\u0176\b\24\1\2\u016a\u016b\7L\2\2\u016b\u0176\b\24\1\2\u016c\u016d"+
		"\7M\2\2\u016d\u0176\b\24\1\2\u016e\u016f\7B\2\2\u016f\u0176\b\24\1\2\u0170"+
		"\u0171\7B\2\2\u0171\u0172\t\5\2\2\u0172\u0176\b\24\1\2\u0173\u0174\7C"+
		"\2\2\u0174\u0176\b\24\1\2\u0175\u015a\3\2\2\2\u0175\u015f\3\2\2\2\u0175"+
		"\u0162\3\2\2\2\u0175\u0164\3\2\2\2\u0175\u0166\3\2\2\2\u0175\u0168\3\2"+
		"\2\2\u0175\u016a\3\2\2\2\u0175\u016c\3\2\2\2\u0175\u016e\3\2\2\2\u0175"+
		"\u0170\3\2\2\2\u0175\u0173\3\2\2\2\u0176\'\3\2\2\2\u0177\u0178\b\25\1"+
		"\2\u0178\u0179\5&\24\2\u0179\u017a\b\25\1\2\u017a\u01a1\3\2\2\2\u017b"+
		"\u017c\f\b\2\2\u017c\u017d\t\6\2\2\u017d\u01a0\b\25\1\2\u017e\u017f\f"+
		"\7\2\2\u017f\u0180\7\r\2\2\u0180\u0181\5\66\34\2\u0181\u0182\7\16\2\2"+
		"\u0182\u0183\b\25\1\2\u0183\u01a0\3\2\2\2\u0184\u0185\f\6\2\2\u0185\u0186"+
		"\7\r\2\2\u0186\u0187\5\66\34\2\u0187\u0189\t\7\2\2\u0188\u018a\5\66\34"+
		"\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c"+
		"\7\16\2\2\u018c\u018d\b\25\1\2\u018d\u01a0\3\2\2\2\u018e\u018f\f\5\2\2"+
		"\u018f\u0190\7\6\2\2\u0190\u0191\7G\2\2\u0191\u01a0\b\25\1\2\u0192\u0193"+
		"\f\4\2\2\u0193\u0194\t\b\2\2\u0194\u0195\7G\2\2\u0195\u0196\5\26\f\2\u0196"+
		"\u0197\b\25\1\2\u0197\u01a0\3\2\2\2\u0198\u019a\f\3\2\2\u0199\u019b\7"+
		"\34\2\2\u019a\u0199\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c"+
		"\u019d\5\24\13\2\u019d\u019e\b\25\1\2\u019e\u01a0\3\2\2\2\u019f\u017b"+
		"\3\2\2\2\u019f\u017e\3\2\2\2\u019f\u0184\3\2\2\2\u019f\u018e\3\2\2\2\u019f"+
		"\u0192\3\2\2\2\u019f\u0198\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1\u019f\3\2"+
		"\2\2\u01a1\u01a2\3\2\2\2\u01a2)\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4\u01a5"+
		"\5(\25\2\u01a5\u01a6\b\26\1\2\u01a6\u01b4\3\2\2\2\u01a7\u01a8\7?\2\2\u01a8"+
		"\u01a9\5(\25\2\u01a9\u01aa\b\26\1\2\u01aa\u01b4\3\2\2\2\u01ab\u01ac\7"+
		"@\2\2\u01ac\u01ad\5(\25\2\u01ad\u01ae\b\26\1\2\u01ae\u01b4\3\2\2\2\u01af"+
		"\u01b0\t\6\2\2\u01b0\u01b1\5*\26\2\u01b1\u01b2\b\26\1\2\u01b2\u01b4\3"+
		"\2\2\2\u01b3\u01a4\3\2\2\2\u01b3\u01a7\3\2\2\2\u01b3\u01ab\3\2\2\2\u01b3"+
		"\u01af\3\2\2\2\u01b4+\3\2\2\2\u01b5\u01b6\b\27\1\2\u01b6\u01b7\5*\26\2"+
		"\u01b7\u01b8\b\27\1\2\u01b8\u01ca\3\2\2\2\u01b9\u01ba\f\5\2\2\u01ba\u01bb"+
		"\7\35\2\2\u01bb\u01bc\5*\26\2\u01bc\u01bd\b\27\1\2\u01bd\u01c9\3\2\2\2"+
		"\u01be\u01bf\f\4\2\2\u01bf\u01c0\7\36\2\2\u01c0\u01c1\5*\26\2\u01c1\u01c2"+
		"\b\27\1\2\u01c2\u01c9\3\2\2\2\u01c3\u01c4\f\3\2\2\u01c4\u01c5\7\37\2\2"+
		"\u01c5\u01c6\5*\26\2\u01c6\u01c7\b\27\1\2\u01c7\u01c9\3\2\2\2\u01c8\u01b9"+
		"\3\2\2\2\u01c8\u01be\3\2\2\2\u01c8\u01c3\3\2\2\2\u01c9\u01cc\3\2\2\2\u01ca"+
		"\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb-\3\2\2\2\u01cc\u01ca\3\2\2\2"+
		"\u01cd\u01ce\b\30\1\2\u01ce\u01cf\5,\27\2\u01cf\u01d0\b\30\1\2\u01d0\u01e2"+
		"\3\2\2\2\u01d1\u01d2\f\5\2\2\u01d2\u01d3\7>\2\2\u01d3\u01d4\5,\27\2\u01d4"+
		"\u01d5\b\30\1\2\u01d5\u01e1\3\2\2\2\u01d6\u01d7\f\4\2\2\u01d7\u01d8\7"+
		" \2\2\u01d8\u01d9\5,\27\2\u01d9\u01da\b\30\1\2\u01da\u01e1\3\2\2\2\u01db"+
		"\u01dc\f\3\2\2\u01dc\u01dd\7?\2\2\u01dd\u01de\5,\27\2\u01de\u01df\b\30"+
		"\1\2\u01df\u01e1\3\2\2\2\u01e0\u01d1\3\2\2\2\u01e0\u01d6\3\2\2\2\u01e0"+
		"\u01db\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2"+
		"\2\2\u01e3/\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\b\31\1\2\u01e6\u01e7"+
		"\5.\30\2\u01e7\u01e8\b\31\1\2\u01e8\u0209\3\2\2\2\u01e9\u01ea\f\b\2\2"+
		"\u01ea\u01eb\7!\2\2\u01eb\u01ec\5.\30\2\u01ec\u01ed\b\31\1\2\u01ed\u0208"+
		"\3\2\2\2\u01ee\u01ef\f\7\2\2\u01ef\u01f0\7\"\2\2\u01f0\u01f1\5.\30\2\u01f1"+
		"\u01f2\b\31\1\2\u01f2\u0208\3\2\2\2\u01f3\u01f4\f\6\2\2\u01f4\u01f5\7"+
		"#\2\2\u01f5\u01f6\5.\30\2\u01f6\u01f7\b\31\1\2\u01f7\u0208\3\2\2\2\u01f8"+
		"\u01f9\f\5\2\2\u01f9\u01fa\7$\2\2\u01fa\u01fb\5.\30\2\u01fb\u01fc\b\31"+
		"\1\2\u01fc\u0208\3\2\2\2\u01fd\u01fe\f\4\2\2\u01fe\u01ff\7%\2\2\u01ff"+
		"\u0200\5.\30\2\u0200\u0201\b\31\1\2\u0201\u0208\3\2\2\2\u0202\u0203\f"+
		"\3\2\2\u0203\u0204\7&\2\2\u0204\u0205\5.\30\2\u0205\u0206\b\31\1\2\u0206"+
		"\u0208\3\2\2\2\u0207\u01e9\3\2\2\2\u0207\u01ee\3\2\2\2\u0207\u01f3\3\2"+
		"\2\2\u0207\u01f8\3\2\2\2\u0207\u01fd\3\2\2\2\u0207\u0202\3\2\2\2\u0208"+
		"\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\61\3\2\2"+
		"\2\u020b\u0209\3\2\2\2\u020c\u020d\b\32\1\2\u020d\u020e\5\60\31\2\u020e"+
		"\u020f\b\32\1\2\u020f\u0220\3\2\2\2\u0210\u0211\f\5\2\2\u0211\u0212\7"+
		"\'\2\2\u0212\u0213\5\60\31\2\u0213\u0214\b\32\1\2\u0214\u021f\3\2\2\2"+
		"\u0215\u0216\f\4\2\2\u0216\u0217\7(\2\2\u0217\u0218\5\60\31\2\u0218\u0219"+
		"\b\32\1\2\u0219\u021f\3\2\2\2\u021a\u021b\f\3\2\2\u021b\u021c\7\f\2\2"+
		"\u021c\u021d\7H\2\2\u021d\u021f\b\32\1\2\u021e\u0210\3\2\2\2\u021e\u0215"+
		"\3\2\2\2\u021e\u021a\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220"+
		"\u0221\3\2\2\2\u0221\63\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0224\b\33\1"+
		"\2\u0224\u0225\5\62\32\2\u0225\u0226\b\33\1\2\u0226\u023c\3\2\2\2\u0227"+
		"\u0228\5*\26\2\u0228\u0229\7)\2\2\u0229\u022a\5\64\33\7\u022a\u022b\b"+
		"\33\1\2\u022b\u023c\3\2\2\2\u022c\u022d\5*\26\2\u022d\u022e\7*\2\2\u022e"+
		"\u022f\5\64\33\6\u022f\u0230\b\33\1\2\u0230\u023c\3\2\2\2\u0231\u0232"+
		"\5*\26\2\u0232\u0233\7+\2\2\u0233\u0234\5\64\33\5\u0234\u0235\b\33\1\2"+
		"\u0235\u023c\3\2\2\2\u0236\u0237\5*\26\2\u0237\u0238\7,\2\2\u0238\u0239"+
		"\5\64\33\4\u0239\u023a\b\33\1\2\u023a\u023c\3\2\2\2\u023b\u0223\3\2\2"+
		"\2\u023b\u0227\3\2\2\2\u023b\u022c\3\2\2\2\u023b\u0231\3\2\2\2\u023b\u0236"+
		"\3\2\2\2\u023c\u0244\3\2\2\2\u023d\u023e\f\3\2\2\u023e\u023f\7\t\2\2\u023f"+
		"\u0240\5\66\34\2\u0240\u0241\b\33\1\2\u0241\u0243\3\2\2\2\u0242\u023d"+
		"\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\65\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u0248\5\64\33\2\u0248\u0249\b\34"+
		"\1\2\u0249\u027f\3\2\2\2\u024a\u024b\7;\2\2\u024b\u024c\7H\2\2\u024c\u024d"+
		"\5\26\f\2\u024d\u024e\b\34\1\2\u024e\u027f\3\2\2\2\u024f\u0250\7<\2\2"+
		"\u0250\u0251\7H\2\2\u0251\u027f\b\34\1\2\u0252\u0253\7\67\2\2\u0253\u0254"+
		"\5\66\34\2\u0254\u0255\b\34\1\2\u0255\u027f\3\2\2\2\u0256\u0257\79\2\2"+
		"\u0257\u0258\5\66\34\2\u0258\u0259\b\34\1\2\u0259\u027f\3\2\2\2\u025a"+
		"\u025b\7\61\2\2\u025b\u025c\5\66\34\2\u025c\u025d\7=\2\2\u025d\u025e\5"+
		"\66\34\2\u025e\u025f\b\34\1\2\u025f\u027f\3\2\2\2\u0260\u0261\7\61\2\2"+
		"\u0261\u0264\5\66\34\2\u0262\u0263\7\n\2\2\u0263\u0265\5\66\34\2\u0264"+
		"\u0262\3\2\2\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\t\7"+
		"\2\2\u0267\u0268\5\66\34\2\u0268\u0269\7=\2\2\u0269\u026a\5\66\34\2\u026a"+
		"\u026b\b\34\1\2\u026b\u027f\3\2\2\2\u026c\u026d\7\62\2\2\u026d\u026e\5"+
		"\66\34\2\u026e\u0271\5\4\3\2\u026f\u0270\7\64\2\2\u0270\u0272\5\4\3\2"+
		"\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274"+
		"\b\34\1\2\u0274\u027f\3\2\2\2\u0275\u0276\5\34\17\2\u0276\u0277\b\34\1"+
		"\2\u0277\u027f\3\2\2\2\u0278\u0279\5\"\22\2\u0279\u027a\b\34\1\2\u027a"+
		"\u027f\3\2\2\2\u027b\u027c\5\36\20\2\u027c\u027d\b\34\1\2\u027d\u027f"+
		"\3\2\2\2\u027e\u0247\3\2\2\2\u027e\u024a\3\2\2\2\u027e\u024f\3\2\2\2\u027e"+
		"\u0252\3\2\2\2\u027e\u0256\3\2\2\2\u027e\u025a\3\2\2\2\u027e\u0260\3\2"+
		"\2\2\u027e\u026c\3\2\2\2\u027e\u0275\3\2\2\2\u027e\u0278\3\2\2\2\u027e"+
		"\u027b\3\2\2\2\u027f\67\3\2\2\28=AHQgoy}\u0091\u0097\u009e\u00a2\u00a9"+
		"\u00b2\u00bb\u00c1\u00c8\u00ce\u00d5\u00d9\u00de\u00e5\u00ee\u00f4\u00fc"+
		"\u0103\u0112\u0121\u0125\u012b\u0137\u0143\u0147\u014d\u0158\u0175\u0189"+
		"\u019a\u019f\u01a1\u01b3\u01c8\u01ca\u01e0\u01e2\u0207\u0209\u021e\u0220"+
		"\u023b\u0244\u0264\u0271\u027e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}