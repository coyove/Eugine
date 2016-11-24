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
import org.apache.commons.lang3.ClassUtils;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

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
		Coroutine=47, For=48, If=49, Switch=50, Else=51, Enter=52, Catch=53, Clone=54, 
		Sync=55, Yield=56, Type=57, AddressOf=58, New=59, Static=60, Do=61, Add=62, 
		Sub=63, Not=64, AryOp=65, Integer=66, Double=67, NEWLINE=68, WS=69, Semi=70, 
		Identifier=71, JavaFullName=72, Letter=73, BlockComment=74, LineComment=75, 
		RawString=76, StringLiteral=77;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_syncStmt = 6, RULE_declareStmt = 7, RULE_definitionsList = 8, 
		RULE_argumentsList = 9, RULE_interopArgumentDeclaration = 10, RULE_interopArgumentsList = 11, 
		RULE_defineStmt = 12, RULE_lambdaStmt = 13, RULE_switchStmt = 14, RULE_dict = 15, 
		RULE_pair = 16, RULE_list = 17, RULE_value = 18, RULE_topExpr = 19, RULE_postfixExpr = 20, 
		RULE_unaryExpr = 21, RULE_multiplyExpr = 22, RULE_addExpr = 23, RULE_compareExpr = 24, 
		RULE_logicExpr = 25, RULE_assignExpr = 26, RULE_expr = 27;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "syncStmt", 
		"declareStmt", "definitionsList", "argumentsList", "interopArgumentDeclaration", 
		"interopArgumentsList", "defineStmt", "lambdaStmt", "switchStmt", "dict", 
		"pair", "list", "value", "topExpr", "postfixExpr", "unaryExpr", "multiplyExpr", 
		"addExpr", "compareExpr", "logicExpr", "assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "'&'", 
		"':'", "'['", "']'", "'=>'", "'@'", "'true'", "'false'", "'null'", "'l'", 
		"'L'", "'++'", "'--'", "'..'", "'...'", "'::'", "':>'", "'#'", "'*'", 
		"'/'", "'%'", "'<+'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'const'", "'def'", "'inline'", 
		"'coroutine'", null, "'if'", "'switch'", "'else'", "'enter'", "'catch'", 
		"'clone'", "'sync'", "'yield'", "'typeof'", "'addressof'", "'new'", "'static'", 
		"'do'", "'+'", "'-'", "'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Var", "Const", "Def", "Inline", 
		"Coroutine", "For", "If", "Switch", "Else", "Enter", "Catch", "Clone", 
		"Sync", "Yield", "Type", "AddressOf", "New", "Static", "Do", "Add", "Sub", 
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
			setState(65);
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
			case Yield:
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Yield) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
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
			setState(100);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				importStmt();
				 ((StmtContext)_localctx).v =  ExecEnvironment.Null; 
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
			case Var:
			case Const:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
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
			case Sync:
			case Yield:
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
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
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
			setState(102);
			match(T__2);
			{
			setState(103);
			match(Identifier);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(104);
					match(T__3);
					setState(105);
					match(Identifier);
					}
					} 
				}
				setState(110);
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
			setState(111);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(112);
			((EnterStmtContext)_localctx).Body = code();
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(113);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(114);
				match(T__4);
				setState(115);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(116);
				match(T__5);
				setState(117);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(120);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(121);
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
			setState(126);
			((SyncStmtContext)_localctx).Sync = match(Sync);
			setState(127);
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
			setState(130);
			((DeclareStmtContext)_localctx).Action = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Const) ) {
				((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}

			            ((DeclareStmtContext)_localctx).act =  (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.MUTABLE : PSet.IMMUTABLE;
			        
			setState(132);
			((DeclareStmtContext)_localctx).Head = unaryExpr();
			setState(133);
			match(T__6);
			setState(134);
			((DeclareStmtContext)_localctx).HeadValue = expr();

			            _localctx.multi.add(new PSet(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Head.v, ((DeclareStmtContext)_localctx).HeadValue.v, _localctx.act));
			        
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(136);
				match(T__7);
				setState(137);
				((DeclareStmtContext)_localctx).Tail = unaryExpr();
				setState(138);
				match(T__6);
				setState(139);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__4);
				setState(155);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(148);
						_la = _input.LA(1);
						if (_la==T__8) {
							{
							setState(147);
							((DefinitionsListContext)_localctx).InitStyle = match(T__8);
							}
						}

						setState(150);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(151);
						match(T__7);
						 
						        _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						        _localctx.passByValue.add(((DefinitionsListContext)_localctx).InitStyle == null);
						    
						}
						} 
					}
					setState(157);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(159);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(158);
					((DefinitionsListContext)_localctx).LastStyle = match(T__8);
					}
				}

				setState(161);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(162);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				        _localctx.passByValue.add(((DefinitionsListContext)_localctx).LastStyle == null);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(T__4);
				setState(165);
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(T__4);
				setState(175);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						((ArgumentsListContext)_localctx).InitExpr = expr();
						setState(170);
						match(T__7);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(177);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(178);
				((ArgumentsListContext)_localctx).LastExpr = expr();
				setState(179);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
				match(T__4);
				setState(183);
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

	public static class InteropArgumentDeclarationContext extends ParserRuleContext {
		public SExpression v;
		public String c;
		public ExprContext InitExpr;
		public Token InitDef;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode JavaFullName() { return getToken(EugineParser.JavaFullName, 0); }
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public InteropArgumentDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interopArgumentDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterInteropArgumentDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitInteropArgumentDeclaration(this);
		}
	}

	public final InteropArgumentDeclarationContext interopArgumentDeclaration() throws RecognitionException {
		InteropArgumentDeclarationContext _localctx = new InteropArgumentDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_interopArgumentDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			((InteropArgumentDeclarationContext)_localctx).InitExpr = expr();
			setState(189);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(187);
				match(T__9);
				setState(188);
				((InteropArgumentDeclarationContext)_localctx).InitDef = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Identifier || _la==JavaFullName) ) {
					((InteropArgumentDeclarationContext)_localctx).InitDef = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}


			            ((InteropArgumentDeclarationContext)_localctx).v =  ((InteropArgumentDeclarationContext)_localctx).InitExpr.v;
			            ((InteropArgumentDeclarationContext)_localctx).c =  (((InteropArgumentDeclarationContext)_localctx).InitDef!=null?((InteropArgumentDeclarationContext)_localctx).InitDef.getText():null) == null ? "" : (((InteropArgumentDeclarationContext)_localctx).InitDef!=null?((InteropArgumentDeclarationContext)_localctx).InitDef.getText():null).replace("/", ".");
			        
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
		public InteropArgumentDeclarationContext InitExpr;
		public InteropArgumentDeclarationContext LastExpr;
		public List<InteropArgumentDeclarationContext> interopArgumentDeclaration() {
			return getRuleContexts(InteropArgumentDeclarationContext.class);
		}
		public InteropArgumentDeclarationContext interopArgumentDeclaration(int i) {
			return getRuleContext(InteropArgumentDeclarationContext.class,i);
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
		try {
			int _alt;
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(T__4);
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(194);
						((InteropArgumentsListContext)_localctx).InitExpr = interopArgumentDeclaration();
						setState(195);
						match(T__7);
						 _localctx.args.add(((InteropArgumentsListContext)_localctx).InitExpr.v); _localctx.defs.add(((InteropArgumentsListContext)_localctx).InitExpr.c); 
						}
						} 
					}
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(203);
				((InteropArgumentsListContext)_localctx).LastExpr = interopArgumentDeclaration();
				setState(204);
				match(T__5);

				            _localctx.args.add(((InteropArgumentsListContext)_localctx).LastExpr.v);
				            _localctx.defs.add(((InteropArgumentsListContext)_localctx).LastExpr.c);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				match(T__4);
				setState(208);
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
		public Token Coroutine;
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
		public TerminalNode Coroutine() { return getToken(EugineParser.Coroutine, 0); }
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
			setState(211);
			match(Def);
			setState(213);
			_la = _input.LA(1);
			if (_la==Inline) {
				{
				setState(212);
				((DefineStmtContext)_localctx).Inline = match(Inline);
				}
			}

			setState(216);
			_la = _input.LA(1);
			if (_la==Coroutine) {
				{
				setState(215);
				((DefineStmtContext)_localctx).Coroutine = match(Coroutine);
				}
			}

			setState(228);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(T__10);
					setState(219);
					((DefineStmtContext)_localctx).Decorator = expr();
					setState(221);
					_la = _input.LA(1);
					if (_la==T__4) {
						{
						setState(220);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(223);
					match(T__11);
					 
					            _localctx.decorators.add(new PCall(new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), 
					                ((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v));
					        
					}
					} 
				}
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(231);
			((DefineStmtContext)_localctx).Get = expr();
			setState(232);
			((DefineStmtContext)_localctx).Lambda = lambdaStmt();

			            Atom a = new Atom((((DefineStmtContext)_localctx).Get!=null?(((DefineStmtContext)_localctx).Get.start):null));
			            SExpression closure = ((DefineStmtContext)_localctx).Lambda.v;
			            ((PLambda) closure).inline = ((DefineStmtContext)_localctx).Inline != null;
			            ((PLambda) closure).coroutine = ((DefineStmtContext)_localctx).Coroutine != null;

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
		public ExprContext InitValue;
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
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(235);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(237);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(236);
				((LambdaStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((LambdaStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(239);
			match(T__12);
			setState(249);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(240);
				match(T__13);
				setState(241);
				((LambdaStmtContext)_localctx).Identifier = match(Identifier);
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(242);
					match(T__4);
					setState(243);
					((LambdaStmtContext)_localctx).InitValue = expr();
					setState(244);
					match(T__5);
					}
					break;
				}

				        ((LambdaStmtContext)_localctx).ret =  new PVariable((((LambdaStmtContext)_localctx).Identifier!=null?((LambdaStmtContext)_localctx).Identifier.getText():null));
				        _localctx.body.add(new PSet(new Atom(((LambdaStmtContext)_localctx).Identifier), _localctx.ret, 
				            (((LambdaStmtContext)_localctx).InitValue!=null?(((LambdaStmtContext)_localctx).InitValue.start):null) == null ? ExecEnvironment.Null : ((LambdaStmtContext)_localctx).InitValue.v, PSet.MUTABLE)); 
				    
				}
			}

			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(251);
				match(T__0);
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << Var) | (1L << Const) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << Yield) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Semi - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					{
					setState(252);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(259);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(260);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(261);
				((LambdaStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			            if (_localctx.ret != null) {
			                _localctx.body.add(_localctx.ret);
			            }

			            ((LambdaStmtContext)_localctx).v =  new PLambda(new Atom((((LambdaStmtContext)_localctx).definitionsList!=null?(((LambdaStmtContext)_localctx).definitionsList.start):null)), ((LambdaStmtContext)_localctx).definitionsList.v, ((LambdaStmtContext)_localctx).definitionsList.passByValue,
			                _localctx.body, ((LambdaStmtContext)_localctx).Description == null ? "" : (((LambdaStmtContext)_localctx).Description!=null?((LambdaStmtContext)_localctx).Description.getText():null), false, false);
			        
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
		enterRule(_localctx, 28, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(269);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(270);
			match(Do);
			setState(271);
			match(T__0);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Sync) | (1L << Yield) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				{
				setState(272);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(273);
				match(T__12);
				setState(274);
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
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(282);
			match(T__1);

			            ((SwitchStmtContext)_localctx).v =  new PSwitch(new Atom(((SwitchStmtContext)_localctx).Switch), ((SwitchStmtContext)_localctx).Condition.v, _localctx.branches, _localctx.db);
			        
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
		enterRule(_localctx, 30, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(304);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				match(T__0);
				setState(286);
				((DictContext)_localctx).pair = pair();
				 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(288);
						match(T__7);
						setState(289);
						((DictContext)_localctx).pair = pair();
						 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(296);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(298);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(297);
					match(T__7);
					}
				}

				setState(300);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(302);
				match(T__0);
				setState(303);
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
		enterRule(_localctx, 32, RULE_pair);
		int _la;
		try {
			setState(316);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(307);
				match(T__9);
				setState(308);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				((PairContext)_localctx).Key = match(Identifier);
				setState(312);
				match(T__9);
				setState(313);
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
		enterRule(_localctx, 34, RULE_list);
		int _la;
		try {
			int _alt;
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(T__10);
				{
				setState(319);
				((ListContext)_localctx).value = value();
				 _localctx.v.values.add(((ListContext)_localctx).value.v); 
				}
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(322);
						match(T__7);
						setState(323);
						((ListContext)_localctx).value = value();
						 _localctx.v.values.add(((ListContext)_localctx).value.v); 
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				}
				setState(332);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(331);
					match(T__7);
					}
				}

				setState(334);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(336);
				match(T__10);
				setState(337);
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
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
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
		enterRule(_localctx, 38, RULE_topExpr);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				match(T__4);
				setState(352);
				((TopExprContext)_localctx).Inner = stmt();
				setState(353);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(359);
				match(T__14);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.True; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(361);
				match(T__15);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.False; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(363);
				match(T__16);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(365);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable(new Atom(((TopExprContext)_localctx).Identifier), (((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(367);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(369);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(371);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInt((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(373);
				((TopExprContext)_localctx).Integer = match(Integer);
				setState(374);
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
				setState(376);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(381);
			((PostfixExprContext)_localctx).Top = topExpr();
			 ((PostfixExprContext)_localctx).v =  ((PostfixExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(422);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(420);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(384);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(385);
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
						setState(387);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(388);
						match(T__10);
						setState(389);
						((PostfixExprContext)_localctx).Key = expr();
						setState(390);
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
						setState(393);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(394);
						match(T__10);
						setState(395);
						((PostfixExprContext)_localctx).Start = expr();
						setState(396);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__22) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(398);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__4) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__19) | (1L << T__20) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Sync) | (1L << Yield) | (1L << Type) | (1L << New) | (1L << Static) | (1L << Sub))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Not - 64)) | (1L << (Integer - 64)) | (1L << (Double - 64)) | (1L << (Identifier - 64)) | (1L << (RawString - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
							{
							setState(397);
							((PostfixExprContext)_localctx).End = expr();
							}
						}

						setState(400);
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
						setState(403);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(404);
						match(T__3);
						setState(405);
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
						setState(407);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(408);
						((PostfixExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((PostfixExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(409);
						((PostfixExprContext)_localctx).Method = match(Identifier);
						setState(410);
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
						setState(413);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(415);
						_la = _input.LA(1);
						if (_la==T__25) {
							{
							setState(414);
							((PostfixExprContext)_localctx).Mt = match(T__25);
							}
						}

						setState(417);
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
				setState(424);
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
		enterRule(_localctx, 42, RULE_unaryExpr);
		int _la;
		try {
			setState(440);
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
				setState(425);
				((UnaryExprContext)_localctx).Top = postfixExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(428);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(429);
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
				setState(432);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(433);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            ((UnaryExprContext)_localctx).v =  new PNot(new Atom(((UnaryExprContext)_localctx).Not), ((UnaryExprContext)_localctx).Right.v);
				        
				}
				break;
			case T__19:
			case T__20:
				enterOuterAlt(_localctx, 4);
				{
				setState(436);
				((UnaryExprContext)_localctx).Op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((UnaryExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(437);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_multiplyExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(443);
			((MultiplyExprContext)_localctx).Top = unaryExpr();
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(463);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(461);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(446);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(447);
						((MultiplyExprContext)_localctx).Op = match(T__26);
						setState(448);
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
						setState(451);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(452);
						((MultiplyExprContext)_localctx).Op = match(T__27);
						setState(453);
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
						setState(456);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(457);
						((MultiplyExprContext)_localctx).Op = match(T__28);
						setState(458);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PModular(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(465);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(467);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(487);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(470);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(471);
						((AddExprContext)_localctx).AddOp = match(Add);
						setState(472);
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
						setState(475);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(476);
						((AddExprContext)_localctx).AddOp = match(T__29);
						setState(477);
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
						setState(480);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(481);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(482);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PSubtract(new Atom(((AddExprContext)_localctx).Sub), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(489);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(491);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(524);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new CompareExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_compareExpr);
						setState(494);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(495);
						((CompareExprContext)_localctx).Op = match(T__30);
						setState(496);
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
						setState(499);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(500);
						((CompareExprContext)_localctx).Op = match(T__31);
						setState(501);
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
						setState(504);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(505);
						((CompareExprContext)_localctx).Op = match(T__32);
						setState(506);
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
						setState(509);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(510);
						((CompareExprContext)_localctx).Op = match(T__33);
						setState(511);
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
						setState(514);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(515);
						((CompareExprContext)_localctx).Op = match(T__34);
						setState(516);
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
						setState(519);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(520);
						((CompareExprContext)_localctx).Op = match(T__35);
						setState(521);
						((CompareExprContext)_localctx).Right = addExpr(0);

						                      ((CompareExprContext)_localctx).v =  new PNotEqual(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(528);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_logicExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(530);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(543);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new LogicExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_logicExpr);
						setState(533);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(534);
						((LogicExprContext)_localctx).Op = match(T__36);
						setState(535);
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
						setState(538);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(539);
						((LogicExprContext)_localctx).Op = match(T__37);
						setState(540);
						((LogicExprContext)_localctx).Right = compareExpr(0);

						                      ((LogicExprContext)_localctx).v =  new PLogic(new Atom(((LogicExprContext)_localctx).Op), ((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v, PLogic.OR);
						                  
						}
						break;
					}
					} 
				}
				setState(547);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_assignExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(549);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(552);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(553);
				((AssignExprContext)_localctx).Op = match(T__38);
				setState(554);
				((AssignExprContext)_localctx).Right = assignExpr(5);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PAdd(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			case 3:
				{
				setState(557);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(558);
				((AssignExprContext)_localctx).Op = match(T__39);
				setState(559);
				((AssignExprContext)_localctx).Right = assignExpr(4);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PSubtract(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			case 4:
				{
				setState(562);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(563);
				((AssignExprContext)_localctx).Op = match(T__40);
				setState(564);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PMultiply(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			case 5:
				{
				setState(567);
				((AssignExprContext)_localctx).Left = unaryExpr();
				setState(568);
				((AssignExprContext)_localctx).Op = match(T__41);
				setState(569);
				((AssignExprContext)_localctx).Right = assignExpr(2);

				            ((AssignExprContext)_localctx).v =  new PSet(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, new PDivide(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Left.v, ((AssignExprContext)_localctx).Right.v), PSet.SET);
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(581);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
					setState(574);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(575);
					match(T__6);
					setState(576);
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
				setState(583);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
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
		public Token Sync;
		public CodeContext SyncBody;
		public Token Yield;
		public ExprContext Yielded;
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
		public TerminalNode Sync() { return getToken(EugineParser.Sync, 0); }
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode Yield() { return getToken(EugineParser.Yield, 0); }
		public TerminalNode Type() { return getToken(EugineParser.Type, 0); }
		public TerminalNode For() { return getToken(EugineParser.For, 0); }
		public TerminalNode Do() { return getToken(EugineParser.Do, 0); }
		public TerminalNode If() { return getToken(EugineParser.If, 0); }
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
		enterRule(_localctx, 54, RULE_expr);
		int _la;
		try {
			setState(650);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
				((ExprContext)_localctx).New = match(New);
				setState(588);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				setState(589);
				((ExprContext)_localctx).interopArgumentsList = interopArgumentsList();

				            String classname = (((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("/", ".");
				            ((ExprContext)_localctx).v =  new PInteropNew(new Atom(((ExprContext)_localctx).New), getClassByName(classname, ((ExprContext)_localctx).New),
				                ((ExprContext)_localctx).interopArgumentsList.defs, ((ExprContext)_localctx).interopArgumentsList.args);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				((ExprContext)_localctx).Static = match(Static);
				setState(593);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				 
				            ((ExprContext)_localctx).v =  getClassByName((((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("/", "."), ((ExprContext)_localctx).Static); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(596);
				((ExprContext)_localctx).Subject = expr();
				 
				            ((ExprContext)_localctx).v =  new PClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(599);
				((ExprContext)_localctx).Sync = match(Sync);
				setState(600);
				((ExprContext)_localctx).SyncBody = code();
				 
				            ((ExprContext)_localctx).v =  new PSync(new Atom(((ExprContext)_localctx).Sync), ((ExprContext)_localctx).SyncBody.v); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(603);
				((ExprContext)_localctx).Yield = match(Yield);
				setState(607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(604);
					((ExprContext)_localctx).Yielded = expr();
					}
					break;
				case 2:
					{
					setState(605);
					match(T__4);
					setState(606);
					match(T__5);
					}
					break;
				}
				 
				            ((ExprContext)_localctx).v =  new PYield(new Atom(((ExprContext)_localctx).Yield), (((ExprContext)_localctx).Yielded!=null?(((ExprContext)_localctx).Yielded.start):null) != null ? ((ExprContext)_localctx).Yielded.v : ExecEnvironment.Null); 
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(610);
				((ExprContext)_localctx).Type = match(Type);
				setState(611);
				((ExprContext)_localctx).Subject = expr();
				 
				            ((ExprContext)_localctx).v =  new PType(new Atom(((ExprContext)_localctx).Type), ((ExprContext)_localctx).Subject.v, PType.TYPE.TYPE); 
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(614);
				((ExprContext)_localctx).For = match(For);
				setState(615);
				((ExprContext)_localctx).Subject = expr();
				setState(616);
				match(Do);
				setState(617);
				((ExprContext)_localctx).Body = expr();

				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? PFor.ASC : PFor.DESC); 
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(620);
				((ExprContext)_localctx).For = match(For);
				setState(621);
				((ExprContext)_localctx).Start = expr();
				setState(624);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(622);
					match(T__7);
					setState(623);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(626);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(627);
				((ExprContext)_localctx).End = expr();
				setState(628);
				match(Do);
				setState(629);
				((ExprContext)_localctx).Body = expr();

				            Atom atom = new Atom(((ExprContext)_localctx).For);
				            PIRange r = new PIRange(atom, ListEx.build(
				                    ((ExprContext)_localctx).Start.v, 
				                    ((ExprContext)_localctx).Next == null ? new SInt(1) : new PSubtract(atom, ((ExprContext)_localctx).Next.v, ((ExprContext)_localctx).Start.v), 
				                    ((ExprContext)_localctx).End.v
				                ));

				            ((ExprContext)_localctx).v =  new PFor(atom, r, ((ExprContext)_localctx).Body.v, PFor.ASC); 
				        
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(632);
				((ExprContext)_localctx).If = match(If);
				setState(633);
				((ExprContext)_localctx).Condition = expr();
				setState(634);
				((ExprContext)_localctx).True = code();
				setState(637);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(635);
					match(Else);
					setState(636);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new PIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(641);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(644);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(647);
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
		case 20:
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
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
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignExpr_sempred(AssignExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3O\u028f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\6\2>\n\2\r\2\16\2"+
		"?\3\2\3\2\5\2D\n\2\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\3\3\3\3\4\3\4\3\4\6"+
		"\4R\n\4\r\4\16\4S\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5g\n\5\3\6\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7y\n\7\3\7\3\7\5\7}\n\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0091\n\t\3\t"+
		"\3\t\3\n\3\n\5\n\u0097\n\n\3\n\3\n\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13"+
		"\n\3\n\5\n\u00a2\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a9\n\n\3\13\3\13\3\13"+
		"\3\13\3\13\7\13\u00b0\n\13\f\13\16\13\u00b3\13\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00bb\n\13\3\f\3\f\3\f\5\f\u00c0\n\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\r\3\r\7\r\u00c9\n\r\f\r\16\r\u00cc\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5"+
		"\r\u00d4\n\r\3\16\3\16\5\16\u00d8\n\16\3\16\5\16\u00db\n\16\3\16\3\16"+
		"\3\16\5\16\u00e0\n\16\3\16\3\16\3\16\7\16\u00e5\n\16\f\16\16\16\u00e8"+
		"\13\16\3\16\3\16\3\16\3\16\3\17\3\17\5\17\u00f0\n\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00f9\n\17\3\17\5\17\u00fc\n\17\3\17\3\17\3\17"+
		"\3\17\7\17\u0102\n\17\f\17\16\17\u0105\13\17\3\17\3\17\3\17\3\17\5\17"+
		"\u010b\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u0118\n\20\f\20\16\20\u011b\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\7\21\u0127\n\21\f\21\16\21\u012a\13\21\3\21\5\21\u012d"+
		"\n\21\3\21\3\21\3\21\3\21\5\21\u0133\n\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u013f\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u0149\n\23\f\23\16\23\u014c\13\23\3\23\5\23\u014f\n\23\3\23"+
		"\3\23\3\23\3\23\5\23\u0155\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u0160\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\5\25\u017d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0191\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u01a2\n\26\3\26\3\26\3\26\7\26\u01a7\n\26\f\26\16\26\u01aa\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01bb\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01d0\n\30\f\30\16"+
		"\30\u01d3\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01e8\n\31\f\31\16\31\u01eb"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u020f\n\32\f\32\16\32\u0212\13"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\7\33\u0222\n\33\f\33\16\33\u0225\13\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\5\34\u023f\n\34\3\34\3\34\3\34\3\34\3\34\7\34"+
		"\u0246\n\34\f\34\16\34\u0249\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\5\35\u0262\n\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0273\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0280\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u028d\n\35\3\35\2\b*.\60\62\64\66"+
		"\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668\2\t\3"+
		"\2-.\3\2IJ\3\2NO\3\2\24\25\3\2\26\27\3\2\30\31\3\2\32\33\u02d2\2C\3\2"+
		"\2\2\4J\3\2\2\2\6Q\3\2\2\2\bf\3\2\2\2\nh\3\2\2\2\fq\3\2\2\2\16\u0080\3"+
		"\2\2\2\20\u0084\3\2\2\2\22\u00a8\3\2\2\2\24\u00ba\3\2\2\2\26\u00bc\3\2"+
		"\2\2\30\u00d3\3\2\2\2\32\u00d5\3\2\2\2\34\u00ed\3\2\2\2\36\u010e\3\2\2"+
		"\2 \u0132\3\2\2\2\"\u013e\3\2\2\2$\u0154\3\2\2\2&\u015f\3\2\2\2(\u017c"+
		"\3\2\2\2*\u017e\3\2\2\2,\u01ba\3\2\2\2.\u01bc\3\2\2\2\60\u01d4\3\2\2\2"+
		"\62\u01ec\3\2\2\2\64\u0213\3\2\2\2\66\u023e\3\2\2\28\u028c\3\2\2\2:;\5"+
		"\6\4\2;<\b\2\1\2<>\3\2\2\2=:\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@D\3"+
		"\2\2\2AB\7\2\2\3BD\b\2\1\2C=\3\2\2\2CA\3\2\2\2D\3\3\2\2\2EF\7\3\2\2FG"+
		"\5\6\4\2GH\7\4\2\2HK\3\2\2\2IK\5\b\5\2JE\3\2\2\2JI\3\2\2\2KL\3\2\2\2L"+
		"M\b\3\1\2M\5\3\2\2\2NO\5\b\5\2OP\b\4\1\2PR\3\2\2\2QN\3\2\2\2RS\3\2\2\2"+
		"SQ\3\2\2\2ST\3\2\2\2T\7\3\2\2\2UV\5\n\6\2VW\b\5\1\2Wg\3\2\2\2XY\5\f\7"+
		"\2YZ\b\5\1\2Zg\3\2\2\2[\\\5\20\t\2\\]\b\5\1\2]g\3\2\2\2^_\5\32\16\2_`"+
		"\b\5\1\2`g\3\2\2\2ab\58\35\2bc\b\5\1\2cg\3\2\2\2de\7H\2\2eg\b\5\1\2fU"+
		"\3\2\2\2fX\3\2\2\2f[\3\2\2\2f^\3\2\2\2fa\3\2\2\2fd\3\2\2\2g\t\3\2\2\2"+
		"hi\7\5\2\2in\7I\2\2jk\7\6\2\2km\7I\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2n"+
		"o\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qr\7\66\2\2rx\5\4\3\2st\7\67\2\2tu\7\7"+
		"\2\2uv\7I\2\2vw\7\b\2\2wy\5\4\3\2xs\3\2\2\2xy\3\2\2\2y|\3\2\2\2z{\7?\2"+
		"\2{}\5\4\3\2|z\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\b\7\1\2\177\r\3\2\2\2"+
		"\u0080\u0081\79\2\2\u0081\u0082\5\4\3\2\u0082\u0083\b\b\1\2\u0083\17\3"+
		"\2\2\2\u0084\u0085\t\2\2\2\u0085\u0086\b\t\1\2\u0086\u0087\5,\27\2\u0087"+
		"\u0088\7\t\2\2\u0088\u0089\58\35\2\u0089\u0090\b\t\1\2\u008a\u008b\7\n"+
		"\2\2\u008b\u008c\5,\27\2\u008c\u008d\7\t\2\2\u008d\u008e\58\35\2\u008e"+
		"\u008f\b\t\1\2\u008f\u0091\3\2\2\2\u0090\u008a\3\2\2\2\u0090\u0091\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\b\t\1\2\u0093\21\3\2\2\2\u0094\u009d"+
		"\7\7\2\2\u0095\u0097\7\13\2\2\u0096\u0095\3\2\2\2\u0096\u0097\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0099\7I\2\2\u0099\u009a\7\n\2\2\u009a\u009c"+
		"\b\n\1\2\u009b\u0096\3\2\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\7\13"+
		"\2\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3"+
		"\u00a4\7I\2\2\u00a4\u00a5\7\b\2\2\u00a5\u00a9\b\n\1\2\u00a6\u00a7\7\7"+
		"\2\2\u00a7\u00a9\7\b\2\2\u00a8\u0094\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\23\3\2\2\2\u00aa\u00b1\7\7\2\2\u00ab\u00ac\58\35\2\u00ac\u00ad\7\n\2"+
		"\2\u00ad\u00ae\b\13\1\2\u00ae\u00b0\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0"+
		"\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2"+
		"\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\58\35\2\u00b5\u00b6\7\b\2\2\u00b6"+
		"\u00b7\b\13\1\2\u00b7\u00bb\3\2\2\2\u00b8\u00b9\7\7\2\2\u00b9\u00bb\7"+
		"\b\2\2\u00ba\u00aa\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\25\3\2\2\2\u00bc"+
		"\u00bf\58\35\2\u00bd\u00be\7\f\2\2\u00be\u00c0\t\3\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\b\f\1\2\u00c2"+
		"\27\3\2\2\2\u00c3\u00ca\7\7\2\2\u00c4\u00c5\5\26\f\2\u00c5\u00c6\7\n\2"+
		"\2\u00c6\u00c7\b\r\1\2\u00c7\u00c9\3\2\2\2\u00c8\u00c4\3\2\2\2\u00c9\u00cc"+
		"\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\7\b\2\2\u00cf\u00d0\b"+
		"\r\1\2\u00d0\u00d4\3\2\2\2\u00d1\u00d2\7\7\2\2\u00d2\u00d4\7\b\2\2\u00d3"+
		"\u00c3\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\31\3\2\2\2\u00d5\u00d7\7/\2\2"+
		"\u00d6\u00d8\7\60\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da"+
		"\3\2\2\2\u00d9\u00db\7\61\2\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00e6\3\2\2\2\u00dc\u00dd\7\r\2\2\u00dd\u00df\58\35\2\u00de\u00e0"+
		"\5\24\13\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\7\16\2\2\u00e2\u00e3\b\16\1\2\u00e3\u00e5\3\2\2\2\u00e4\u00dc"+
		"\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea\58\35\2\u00ea\u00eb\5\34"+
		"\17\2\u00eb\u00ec\b\16\1\2\u00ec\33\3\2\2\2\u00ed\u00ef\5\22\n\2\u00ee"+
		"\u00f0\t\4\2\2\u00ef\u00ee\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00fb\7\17\2\2\u00f2\u00f3\7\20\2\2\u00f3\u00f8\7I\2\2\u00f4"+
		"\u00f5\7\7\2\2\u00f5\u00f6\58\35\2\u00f6\u00f7\7\b\2\2\u00f7\u00f9\3\2"+
		"\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa"+
		"\u00fc\b\17\1\2\u00fb\u00f2\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u010a\3"+
		"\2\2\2\u00fd\u0103\7\3\2\2\u00fe\u00ff\5\b\5\2\u00ff\u0100\b\17\1\2\u0100"+
		"\u0102\3\2\2\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103\u0101\3\2"+
		"\2\2\u0103\u0104\3\2\2\2\u0104\u0106\3\2\2\2\u0105\u0103\3\2\2\2\u0106"+
		"\u010b\7\4\2\2\u0107\u0108\5\b\5\2\u0108\u0109\b\17\1\2\u0109\u010b\3"+
		"\2\2\2\u010a\u00fd\3\2\2\2\u010a\u0107\3\2\2\2\u010b\u010c\3\2\2\2\u010c"+
		"\u010d\b\17\1\2\u010d\35\3\2\2\2\u010e\u010f\7\64\2\2\u010f\u0110\58\35"+
		"\2\u0110\u0111\7?\2\2\u0111\u0119\7\3\2\2\u0112\u0113\58\35\2\u0113\u0114"+
		"\7\17\2\2\u0114\u0115\5\4\3\2\u0115\u0116\b\20\1\2\u0116\u0118\3\2\2\2"+
		"\u0117\u0112\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a"+
		"\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u011d\7\4\2\2\u011d"+
		"\u011e\b\20\1\2\u011e\37\3\2\2\2\u011f\u0120\7\3\2\2\u0120\u0121\5\"\22"+
		"\2\u0121\u0128\b\21\1\2\u0122\u0123\7\n\2\2\u0123\u0124\5\"\22\2\u0124"+
		"\u0125\b\21\1\2\u0125\u0127\3\2\2\2\u0126\u0122\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\7\n\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7\4\2\2\u012f\u0133\3\2\2\2\u0130"+
		"\u0131\7\3\2\2\u0131\u0133\7\4\2\2\u0132\u011f\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0133!\3\2\2\2\u0134\u0135\t\4\2\2\u0135\u0136\7\f\2\2\u0136\u0137"+
		"\5&\24\2\u0137\u0138\b\22\1\2\u0138\u013f\3\2\2\2\u0139\u013a\7I\2\2\u013a"+
		"\u013b\7\f\2\2\u013b\u013c\5&\24\2\u013c\u013d\b\22\1\2\u013d\u013f\3"+
		"\2\2\2\u013e\u0134\3\2\2\2\u013e\u0139\3\2\2\2\u013f#\3\2\2\2\u0140\u0141"+
		"\7\r\2\2\u0141\u0142\5&\24\2\u0142\u0143\b\23\1\2\u0143\u014a\3\2\2\2"+
		"\u0144\u0145\7\n\2\2\u0145\u0146\5&\24\2\u0146\u0147\b\23\1\2\u0147\u0149"+
		"\3\2\2\2\u0148\u0144\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014f\7\n"+
		"\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0151\7\16\2\2\u0151\u0155\3\2\2\2\u0152\u0153\7\r\2\2\u0153\u0155\7"+
		"\16\2\2\u0154\u0140\3\2\2\2\u0154\u0152\3\2\2\2\u0155%\3\2\2\2\u0156\u0157"+
		"\58\35\2\u0157\u0158\b\24\1\2\u0158\u0160\3\2\2\2\u0159\u015a\5 \21\2"+
		"\u015a\u015b\b\24\1\2\u015b\u0160\3\2\2\2\u015c\u015d\5$\23\2\u015d\u015e"+
		"\b\24\1\2\u015e\u0160\3\2\2\2\u015f\u0156\3\2\2\2\u015f\u0159\3\2\2\2"+
		"\u015f\u015c\3\2\2\2\u0160\'\3\2\2\2\u0161\u0162\7\7\2\2\u0162\u0163\5"+
		"\b\5\2\u0163\u0164\7\b\2\2\u0164\u0165\b\25\1\2\u0165\u017d\3\2\2\2\u0166"+
		"\u0167\5\34\17\2\u0167\u0168\b\25\1\2\u0168\u017d\3\2\2\2\u0169\u016a"+
		"\7\21\2\2\u016a\u017d\b\25\1\2\u016b\u016c\7\22\2\2\u016c\u017d\b\25\1"+
		"\2\u016d\u016e\7\23\2\2\u016e\u017d\b\25\1\2\u016f\u0170\7I\2\2\u0170"+
		"\u017d\b\25\1\2\u0171\u0172\7N\2\2\u0172\u017d\b\25\1\2\u0173\u0174\7"+
		"O\2\2\u0174\u017d\b\25\1\2\u0175\u0176\7D\2\2\u0176\u017d\b\25\1\2\u0177"+
		"\u0178\7D\2\2\u0178\u0179\t\5\2\2\u0179\u017d\b\25\1\2\u017a\u017b\7E"+
		"\2\2\u017b\u017d\b\25\1\2\u017c\u0161\3\2\2\2\u017c\u0166\3\2\2\2\u017c"+
		"\u0169\3\2\2\2\u017c\u016b\3\2\2\2\u017c\u016d\3\2\2\2\u017c\u016f\3\2"+
		"\2\2\u017c\u0171\3\2\2\2\u017c\u0173\3\2\2\2\u017c\u0175\3\2\2\2\u017c"+
		"\u0177\3\2\2\2\u017c\u017a\3\2\2\2\u017d)\3\2\2\2\u017e\u017f\b\26\1\2"+
		"\u017f\u0180\5(\25\2\u0180\u0181\b\26\1\2\u0181\u01a8\3\2\2\2\u0182\u0183"+
		"\f\b\2\2\u0183\u0184\t\6\2\2\u0184\u01a7\b\26\1\2\u0185\u0186\f\7\2\2"+
		"\u0186\u0187\7\r\2\2\u0187\u0188\58\35\2\u0188\u0189\7\16\2\2\u0189\u018a"+
		"\b\26\1\2\u018a\u01a7\3\2\2\2\u018b\u018c\f\6\2\2\u018c\u018d\7\r\2\2"+
		"\u018d\u018e\58\35\2\u018e\u0190\t\7\2\2\u018f\u0191\58\35\2\u0190\u018f"+
		"\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\16\2\2"+
		"\u0193\u0194\b\26\1\2\u0194\u01a7\3\2\2\2\u0195\u0196\f\5\2\2\u0196\u0197"+
		"\7\6\2\2\u0197\u0198\7I\2\2\u0198\u01a7\b\26\1\2\u0199\u019a\f\4\2\2\u019a"+
		"\u019b\t\b\2\2\u019b\u019c\7I\2\2\u019c\u019d\5\30\r\2\u019d\u019e\b\26"+
		"\1\2\u019e\u01a7\3\2\2\2\u019f\u01a1\f\3\2\2\u01a0\u01a2\7\34\2\2\u01a1"+
		"\u01a0\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\5\24"+
		"\13\2\u01a4\u01a5\b\26\1\2\u01a5\u01a7\3\2\2\2\u01a6\u0182\3\2\2\2\u01a6"+
		"\u0185\3\2\2\2\u01a6\u018b\3\2\2\2\u01a6\u0195\3\2\2\2\u01a6\u0199\3\2"+
		"\2\2\u01a6\u019f\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9+\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\5*\26\2"+
		"\u01ac\u01ad\b\27\1\2\u01ad\u01bb\3\2\2\2\u01ae\u01af\7A\2\2\u01af\u01b0"+
		"\5*\26\2\u01b0\u01b1\b\27\1\2\u01b1\u01bb\3\2\2\2\u01b2\u01b3\7B\2\2\u01b3"+
		"\u01b4\5*\26\2\u01b4\u01b5\b\27\1\2\u01b5\u01bb\3\2\2\2\u01b6\u01b7\t"+
		"\6\2\2\u01b7\u01b8\5,\27\2\u01b8\u01b9\b\27\1\2\u01b9\u01bb\3\2\2\2\u01ba"+
		"\u01ab\3\2\2\2\u01ba\u01ae\3\2\2\2\u01ba\u01b2\3\2\2\2\u01ba\u01b6\3\2"+
		"\2\2\u01bb-\3\2\2\2\u01bc\u01bd\b\30\1\2\u01bd\u01be\5,\27\2\u01be\u01bf"+
		"\b\30\1\2\u01bf\u01d1\3\2\2\2\u01c0\u01c1\f\5\2\2\u01c1\u01c2\7\35\2\2"+
		"\u01c2\u01c3\5,\27\2\u01c3\u01c4\b\30\1\2\u01c4\u01d0\3\2\2\2\u01c5\u01c6"+
		"\f\4\2\2\u01c6\u01c7\7\36\2\2\u01c7\u01c8\5,\27\2\u01c8\u01c9\b\30\1\2"+
		"\u01c9\u01d0\3\2\2\2\u01ca\u01cb\f\3\2\2\u01cb\u01cc\7\37\2\2\u01cc\u01cd"+
		"\5,\27\2\u01cd\u01ce\b\30\1\2\u01ce\u01d0\3\2\2\2\u01cf\u01c0\3\2\2\2"+
		"\u01cf\u01c5\3\2\2\2\u01cf\u01ca\3\2\2\2\u01d0\u01d3\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2/\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d4"+
		"\u01d5\b\31\1\2\u01d5\u01d6\5.\30\2\u01d6\u01d7\b\31\1\2\u01d7\u01e9\3"+
		"\2\2\2\u01d8\u01d9\f\5\2\2\u01d9\u01da\7@\2\2\u01da\u01db\5.\30\2\u01db"+
		"\u01dc\b\31\1\2\u01dc\u01e8\3\2\2\2\u01dd\u01de\f\4\2\2\u01de\u01df\7"+
		" \2\2\u01df\u01e0\5.\30\2\u01e0\u01e1\b\31\1\2\u01e1\u01e8\3\2\2\2\u01e2"+
		"\u01e3\f\3\2\2\u01e3\u01e4\7A\2\2\u01e4\u01e5\5.\30\2\u01e5\u01e6\b\31"+
		"\1\2\u01e6\u01e8\3\2\2\2\u01e7\u01d8\3\2\2\2\u01e7\u01dd\3\2\2\2\u01e7"+
		"\u01e2\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01ea\61\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01ed\b\32\1\2\u01ed\u01ee"+
		"\5\60\31\2\u01ee\u01ef\b\32\1\2\u01ef\u0210\3\2\2\2\u01f0\u01f1\f\b\2"+
		"\2\u01f1\u01f2\7!\2\2\u01f2\u01f3\5\60\31\2\u01f3\u01f4\b\32\1\2\u01f4"+
		"\u020f\3\2\2\2\u01f5\u01f6\f\7\2\2\u01f6\u01f7\7\"\2\2\u01f7\u01f8\5\60"+
		"\31\2\u01f8\u01f9\b\32\1\2\u01f9\u020f\3\2\2\2\u01fa\u01fb\f\6\2\2\u01fb"+
		"\u01fc\7#\2\2\u01fc\u01fd\5\60\31\2\u01fd\u01fe\b\32\1\2\u01fe\u020f\3"+
		"\2\2\2\u01ff\u0200\f\5\2\2\u0200\u0201\7$\2\2\u0201\u0202\5\60\31\2\u0202"+
		"\u0203\b\32\1\2\u0203\u020f\3\2\2\2\u0204\u0205\f\4\2\2\u0205\u0206\7"+
		"%\2\2\u0206\u0207\5\60\31\2\u0207\u0208\b\32\1\2\u0208\u020f\3\2\2\2\u0209"+
		"\u020a\f\3\2\2\u020a\u020b\7&\2\2\u020b\u020c\5\60\31\2\u020c\u020d\b"+
		"\32\1\2\u020d\u020f\3\2\2\2\u020e\u01f0\3\2\2\2\u020e\u01f5\3\2\2\2\u020e"+
		"\u01fa\3\2\2\2\u020e\u01ff\3\2\2\2\u020e\u0204\3\2\2\2\u020e\u0209\3\2"+
		"\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2\2\2\u0211"+
		"\63\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\b\33\1\2\u0214\u0215\5\62"+
		"\32\2\u0215\u0216\b\33\1\2\u0216\u0223\3\2\2\2\u0217\u0218\f\4\2\2\u0218"+
		"\u0219\7\'\2\2\u0219\u021a\5\62\32\2\u021a\u021b\b\33\1\2\u021b\u0222"+
		"\3\2\2\2\u021c\u021d\f\3\2\2\u021d\u021e\7(\2\2\u021e\u021f\5\62\32\2"+
		"\u021f\u0220\b\33\1\2\u0220\u0222\3\2\2\2\u0221\u0217\3\2\2\2\u0221\u021c"+
		"\3\2\2\2\u0222\u0225\3\2\2\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\65\3\2\2\2\u0225\u0223\3\2\2\2\u0226\u0227\b\34\1\2\u0227\u0228\5\64"+
		"\33\2\u0228\u0229\b\34\1\2\u0229\u023f\3\2\2\2\u022a\u022b\5,\27\2\u022b"+
		"\u022c\7)\2\2\u022c\u022d\5\66\34\7\u022d\u022e\b\34\1\2\u022e\u023f\3"+
		"\2\2\2\u022f\u0230\5,\27\2\u0230\u0231\7*\2\2\u0231\u0232\5\66\34\6\u0232"+
		"\u0233\b\34\1\2\u0233\u023f\3\2\2\2\u0234\u0235\5,\27\2\u0235\u0236\7"+
		"+\2\2\u0236\u0237\5\66\34\5\u0237\u0238\b\34\1\2\u0238\u023f\3\2\2\2\u0239"+
		"\u023a\5,\27\2\u023a\u023b\7,\2\2\u023b\u023c\5\66\34\4\u023c\u023d\b"+
		"\34\1\2\u023d\u023f\3\2\2\2\u023e\u0226\3\2\2\2\u023e\u022a\3\2\2\2\u023e"+
		"\u022f\3\2\2\2\u023e\u0234\3\2\2\2\u023e\u0239\3\2\2\2\u023f\u0247\3\2"+
		"\2\2\u0240\u0241\f\3\2\2\u0241\u0242\7\t\2\2\u0242\u0243\58\35\2\u0243"+
		"\u0244\b\34\1\2\u0244\u0246\3\2\2\2\u0245\u0240\3\2\2\2\u0246\u0249\3"+
		"\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248\67\3\2\2\2\u0249"+
		"\u0247\3\2\2\2\u024a\u024b\5\66\34\2\u024b\u024c\b\35\1\2\u024c\u028d"+
		"\3\2\2\2\u024d\u024e\7=\2\2\u024e\u024f\7J\2\2\u024f\u0250\5\30\r\2\u0250"+
		"\u0251\b\35\1\2\u0251\u028d\3\2\2\2\u0252\u0253\7>\2\2\u0253\u0254\7J"+
		"\2\2\u0254\u028d\b\35\1\2\u0255\u0256\78\2\2\u0256\u0257\58\35\2\u0257"+
		"\u0258\b\35\1\2\u0258\u028d\3\2\2\2\u0259\u025a\79\2\2\u025a\u025b\5\4"+
		"\3\2\u025b\u025c\b\35\1\2\u025c\u028d\3\2\2\2\u025d\u0261\7:\2\2\u025e"+
		"\u0262\58\35\2\u025f\u0260\7\7\2\2\u0260\u0262\7\b\2\2\u0261\u025e\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u028d\b\35\1\2\u0264"+
		"\u0265\7;\2\2\u0265\u0266\58\35\2\u0266\u0267\b\35\1\2\u0267\u028d\3\2"+
		"\2\2\u0268\u0269\7\62\2\2\u0269\u026a\58\35\2\u026a\u026b\7?\2\2\u026b"+
		"\u026c\58\35\2\u026c\u026d\b\35\1\2\u026d\u028d\3\2\2\2\u026e\u026f\7"+
		"\62\2\2\u026f\u0272\58\35\2\u0270\u0271\7\n\2\2\u0271\u0273\58\35\2\u0272"+
		"\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\t\7"+
		"\2\2\u0275\u0276\58\35\2\u0276\u0277\7?\2\2\u0277\u0278\58\35\2\u0278"+
		"\u0279\b\35\1\2\u0279\u028d\3\2\2\2\u027a\u027b\7\63\2\2\u027b\u027c\5"+
		"8\35\2\u027c\u027f\5\4\3\2\u027d\u027e\7\65\2\2\u027e\u0280\5\4\3\2\u027f"+
		"\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\3\2\2\2\u0281\u0282\b\35"+
		"\1\2\u0282\u028d\3\2\2\2\u0283\u0284\5\36\20\2\u0284\u0285\b\35\1\2\u0285"+
		"\u028d\3\2\2\2\u0286\u0287\5$\23\2\u0287\u0288\b\35\1\2\u0288\u028d\3"+
		"\2\2\2\u0289\u028a\5 \21\2\u028a\u028b\b\35\1\2\u028b\u028d\3\2\2\2\u028c"+
		"\u024a\3\2\2\2\u028c\u024d\3\2\2\2\u028c\u0252\3\2\2\2\u028c\u0255\3\2"+
		"\2\2\u028c\u0259\3\2\2\2\u028c\u025d\3\2\2\2\u028c\u0264\3\2\2\2\u028c"+
		"\u0268\3\2\2\2\u028c\u026e\3\2\2\2\u028c\u027a\3\2\2\2\u028c\u0283\3\2"+
		"\2\2\u028c\u0286\3\2\2\2\u028c\u0289\3\2\2\2\u028d9\3\2\2\2:?CJSfnx|\u0090"+
		"\u0096\u009d\u00a1\u00a8\u00b1\u00ba\u00bf\u00ca\u00d3\u00d7\u00da\u00df"+
		"\u00e6\u00ef\u00f8\u00fb\u0103\u010a\u0119\u0128\u012c\u0132\u013e\u014a"+
		"\u014e\u0154\u015f\u017c\u0190\u01a1\u01a6\u01a8\u01ba\u01cf\u01d1\u01e7"+
		"\u01e9\u020e\u0210\u0221\u0223\u023e\u0247\u0261\u0272\u027f\u028c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}