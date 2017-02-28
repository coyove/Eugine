// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.math.*;
import org.coyove.eugine.core.flow.*;
import org.coyove.eugine.builtin.*;
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
		T__38=39, Import=40, Var=41, Let=42, Def=43, Struct=44, Operator=45, For=46, 
		If=47, Switch=48, Else=49, Enter=50, Catch=51, Sync=52, Do=53, AssignOp=54, 
		Integer=55, Double=56, NEWLINE=57, WS=58, Semi=59, Identifier=60, JavaFullName=61, 
		Letter=62, BlockComment=63, LineComment=64, RawString=65, StringLiteral=66;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_syncStmt = 6, RULE_declareStmt = 7, RULE_parametersList = 8, 
		RULE_argumentsList = 9, RULE_defineStmt = 10, RULE_lambdaStmt = 11, RULE_switchStmt = 12, 
		RULE_dict = 13, RULE_pair = 14, RULE_list = 15, RULE_value = 16, RULE_topExpr = 17, 
		RULE_postfixExpr = 18, RULE_unaryExpr = 19, RULE_multiplyExpr = 20, RULE_addExpr = 21, 
		RULE_compareExpr = 22, RULE_bitExpr = 23, RULE_logicExpr = 24, RULE_assignExpr = 25, 
		RULE_expr = 26;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "syncStmt", 
		"declareStmt", "parametersList", "argumentsList", "defineStmt", "lambdaStmt", 
		"switchStmt", "dict", "pair", "list", "value", "topExpr", "postfixExpr", 
		"unaryExpr", "multiplyExpr", "addExpr", "compareExpr", "bitExpr", "logicExpr", 
		"assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'.'", "'('", "')'", "'='", "','", "'&'", "'getter'", 
		"'setter'", "'['", "']'", "'=>'", "'@'", "':'", "'true'", "'false'", "'null'", 
		"'break'", "'++'", "'--'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", "'+'", 
		"'<+'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'|'", "'^'", "'&&'", 
		"'||'", "'import'", "'var'", "'let'", "'def'", "'struct'", "'operator'", 
		"'for'", "'if'", "'switch'", "'else'", "'enter'", "'catch'", "'sync'", 
		"'do'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Import", "Var", "Let", "Def", "Struct", "Operator", 
		"For", "If", "Switch", "Else", "Enter", "Catch", "Sync", "Do", "AssignOp", 
		"Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", "JavaFullName", 
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


	    public static SExpression identifySetter(Atom atom, SExpression subject, SExpression value, byte action) {
	        if (subject instanceof PGet) {
	            PGet get = (PGet) subject;
	            return new PPut(atom, get.subject, get.key, value, action == PSet.SET ? PPut.SET : PPut.VAR);
	        } else {
	            return new PSet(atom, subject, value, action);
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
			case T__3:
			case T__10:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__22:
			case T__23:
			case Import:
			case Var:
			case Let:
			case Def:
			case For:
			case If:
			case Switch:
			case Enter:
			case Sync:
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
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Import) | (1L << Var) | (1L << Let) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral );
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
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__0);
				setState(75);
				match(T__1);

				            ((CodeContext)_localctx).v =  ExecEnvironment.Null;
				        
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
			setState(82); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(79);
					((BlockContext)_localctx).stmt = stmt();
					 _localctx.v.expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(84); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
			setState(103);
			switch (_input.LA(1)) {
			case Import:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				importStmt();
				 ((StmtContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case Enter:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case Var:
			case Let:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__0:
			case T__3:
			case T__10:
			case T__13:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__21:
			case T__22:
			case T__23:
			case For:
			case If:
			case Switch:
			case Sync:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(98);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
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
		public TerminalNode Import() { return getToken(EugineParser.Import, 0); }
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
			match(Import);
			{
			setState(106);
			match(Identifier);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(T__2);
					setState(108);
					match(Identifier);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(116);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(117);
				match(T__3);
				setState(118);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(119);
				match(T__4);
				setState(120);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
		public TerminalNode Let() { return getToken(EugineParser.Let, 0); }
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			((DeclareStmtContext)_localctx).Action = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Let) ) {
				((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}

			            ((DeclareStmtContext)_localctx).act =  (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.VAR : PSet.LET;
			        
			setState(135);
			((DeclareStmtContext)_localctx).Head = unaryExpr();
			setState(136);
			match(T__5);
			setState(137);
			((DeclareStmtContext)_localctx).HeadValue = expr();

			            _localctx.multi.add(identifySetter(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Head.v, ((DeclareStmtContext)_localctx).HeadValue.v, _localctx.act));
			        
			setState(147);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(139);
					match(T__6);
					setState(140);
					((DeclareStmtContext)_localctx).Tail = unaryExpr();
					setState(141);
					match(T__5);
					setState(142);
					((DeclareStmtContext)_localctx).TailValue = expr();

					            _localctx.multi.add(identifySetter(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Tail.v, ((DeclareStmtContext)_localctx).TailValue.v, _localctx.act));
					        
					}
					} 
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class ParametersListContext extends ParserRuleContext {
		public ListEx<String> v =  new ListEx<String>();
		public ListEx<Boolean> passByValue =  new ListEx<Boolean>();
		public Token LastStyle;
		public Token LastArg;
		public Token InitStyle;
		public Token InitArg;
		public List<TerminalNode> Identifier() { return getTokens(EugineParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(EugineParser.Identifier, i);
		}
		public ParametersListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterParametersList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitParametersList(this);
		}
	}

	public final ParametersListContext parametersList() throws RecognitionException {
		ParametersListContext _localctx = new ParametersListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(152);
				((ParametersListContext)_localctx).LastStyle = match(T__7);
				}
			}

			setState(155);
			((ParametersListContext)_localctx).LastArg = match(Identifier);
			setState(164);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(156);
				match(T__6);
				setState(158);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(157);
					((ParametersListContext)_localctx).InitStyle = match(T__7);
					}
				}

				setState(160);
				((ParametersListContext)_localctx).InitArg = match(Identifier);
				 
				            _localctx.v.add((((ParametersListContext)_localctx).InitArg!=null?((ParametersListContext)_localctx).InitArg.getText():null)); 
				            _localctx.passByValue.add(((ParametersListContext)_localctx).InitStyle == null);
				        
				}
				}
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			            _localctx.v.add(0, (((ParametersListContext)_localctx).LastArg!=null?((ParametersListContext)_localctx).LastArg.getText():null));
			            _localctx.passByValue.add(0, ((ParametersListContext)_localctx).LastStyle == null);
			        
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
		public ExprContext HeadExpr;
		public ExprContext TailExpr;
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			((ArgumentsListContext)_localctx).HeadExpr = expr();
			 _localctx.v.add(((ArgumentsListContext)_localctx).HeadExpr.v); 
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(171);
				match(T__6);
				setState(172);
				((ArgumentsListContext)_localctx).TailExpr = expr();
				 _localctx.v.add(((ArgumentsListContext)_localctx).TailExpr.v); 
				}
				}
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class DefineStmtContext extends ParserRuleContext {
		public SExpression v;
		public ListEx<SExpression> decorators =  new ListEx<SExpression>();
		public Token Struct;
		public Token Operator;
		public Token Get;
		public Token Set;
		public ExprContext Decorator;
		public ArgumentsListContext argumentsList;
		public Token FunctionSubject;
		public Token FunctionName;
		public LambdaStmtContext Lambda;
		public TerminalNode Def() { return getToken(EugineParser.Def, 0); }
		public List<TerminalNode> Identifier() { return getTokens(EugineParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(EugineParser.Identifier, i);
		}
		public LambdaStmtContext lambdaStmt() {
			return getRuleContext(LambdaStmtContext.class,0);
		}
		public TerminalNode Struct() { return getToken(EugineParser.Struct, 0); }
		public TerminalNode Operator() { return getToken(EugineParser.Operator, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
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
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Def);
			setState(185);
			switch (_input.LA(1)) {
			case Struct:
				{
				setState(181);
				((DefineStmtContext)_localctx).Struct = match(Struct);
				}
				break;
			case Operator:
				{
				setState(182);
				((DefineStmtContext)_localctx).Operator = match(Operator);
				}
				break;
			case T__8:
				{
				setState(183);
				((DefineStmtContext)_localctx).Get = match(T__8);
				}
				break;
			case T__9:
				{
				setState(184);
				((DefineStmtContext)_localctx).Set = match(T__9);
				}
				break;
			case T__10:
			case Identifier:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(187);
				match(T__10);
				setState(188);
				((DefineStmtContext)_localctx).Decorator = expr();
				setState(194);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(189);
					match(T__3);
					setState(191);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
						{
						setState(190);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(193);
					match(T__4);
					}
				}

				setState(196);
				match(T__11);
				 
				            _localctx.decorators.add(new PCall(new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), 
				                ((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v));
				        
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(204);
				((DefineStmtContext)_localctx).FunctionSubject = match(Identifier);
				setState(205);
				match(T__2);
				}
				break;
			}
			setState(208);
			((DefineStmtContext)_localctx).FunctionName = match(Identifier);
			setState(209);
			((DefineStmtContext)_localctx).Lambda = lambdaStmt();

			            Atom a = new Atom(((DefineStmtContext)_localctx).FunctionName);
			            SExpression closure = ((DefineStmtContext)_localctx).Lambda.v;
			            SExpression name = new PVariable((((DefineStmtContext)_localctx).FunctionName!=null?((DefineStmtContext)_localctx).FunctionName.getText():null));

			            if (((DefineStmtContext)_localctx).Struct != null) {
			                ((PLambda) closure).struct = true;
			                ((DefineStmtContext)_localctx).v =  new PSet(a, name, closure, PSet.VAR);
			            } else if (((DefineStmtContext)_localctx).Operator != null) {
			                ((PLambda) closure).operator = true;
			                ((DefineStmtContext)_localctx).v =  new PPut(a, new PVariable((((DefineStmtContext)_localctx).FunctionSubject!=null?((DefineStmtContext)_localctx).FunctionSubject.getText():null)), 
			                    new SString("__" + (((DefineStmtContext)_localctx).FunctionName!=null?((DefineStmtContext)_localctx).FunctionName.getText():null) + "__"), closure, PPut.VAR);
			            } else {
			                // getters and setters can have decorators
			                for (SExpression d : _localctx.decorators) {
			                    closure = new PCall(a, d, ListEx.build(closure));
			                }

			                if (((DefineStmtContext)_localctx).Get != null) {
			                    ((DefineStmtContext)_localctx).v =  new PPut(a, new PVariable((((DefineStmtContext)_localctx).FunctionSubject!=null?((DefineStmtContext)_localctx).FunctionSubject.getText():null)), 
			                        new SString("__get__" + (((DefineStmtContext)_localctx).FunctionName!=null?((DefineStmtContext)_localctx).FunctionName.getText():null)), closure, PPut.VAR);
			                } else if (((DefineStmtContext)_localctx).Set != null) {
			                    ((DefineStmtContext)_localctx).v =  new PPut(a, new PVariable((((DefineStmtContext)_localctx).FunctionSubject!=null?((DefineStmtContext)_localctx).FunctionSubject.getText():null)), 
			                        new SString("__set__" + (((DefineStmtContext)_localctx).FunctionName!=null?((DefineStmtContext)_localctx).FunctionName.getText():null)), closure, PPut.VAR);
			                } else if (((DefineStmtContext)_localctx).FunctionSubject != null) {
			                    ((DefineStmtContext)_localctx).v =  new PPut(a, new PVariable((((DefineStmtContext)_localctx).FunctionSubject!=null?((DefineStmtContext)_localctx).FunctionSubject.getText():null)),
			                        new SString((((DefineStmtContext)_localctx).FunctionName!=null?((DefineStmtContext)_localctx).FunctionName.getText():null)), closure, PPut.VAR);
			                } else {
			                    ((DefineStmtContext)_localctx).v =  new PSet(a, name, closure, PSet.VAR);
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

	public static class LambdaStmtContext extends ParserRuleContext {
		public PLambda v;
		public ListEx<SExpression> body =  new ListEx<SExpression>();
		public PVariable ret;
		public Token LambdaStart;
		public ParametersListContext Parameters;
		public Token Description;
		public Token Identifier;
		public ExprContext InitValue;
		public StmtContext stmt;
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public ParametersListContext parametersList() {
			return getRuleContext(ParametersListContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			((LambdaStmtContext)_localctx).LambdaStart = match(T__3);
			setState(214);
			_la = _input.LA(1);
			if (_la==T__7 || _la==Identifier) {
				{
				setState(213);
				((LambdaStmtContext)_localctx).Parameters = parametersList();
				}
			}

			setState(216);
			match(T__4);
			setState(218);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(217);
				((LambdaStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((LambdaStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(220);
			match(T__12);
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(221);
				match(T__13);
				setState(222);
				((LambdaStmtContext)_localctx).Identifier = match(Identifier);
				setState(227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(223);
					match(T__3);
					setState(224);
					((LambdaStmtContext)_localctx).InitValue = expr();
					setState(225);
					match(T__4);
					}
					break;
				}

				            ((LambdaStmtContext)_localctx).ret =  new PVariable((((LambdaStmtContext)_localctx).Identifier!=null?((LambdaStmtContext)_localctx).Identifier.getText():null));
				            _localctx.body.add(new PSet(new Atom(((LambdaStmtContext)_localctx).Identifier), _localctx.ret, 
				                (((LambdaStmtContext)_localctx).InitValue!=null?(((LambdaStmtContext)_localctx).InitValue.start):null) == null ? ExecEnvironment.Null : ((LambdaStmtContext)_localctx).InitValue.v, PSet.VAR)); 
				        
				}
				break;
			}
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(232);
				match(T__0);
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Import) | (1L << Var) | (1L << Let) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
					{
					{
					setState(233);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(242);
				((LambdaStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
				}
				break;
			}

			            if (_localctx.ret != null) {
			                _localctx.body.add(_localctx.ret);
			            }

			            ListEx<String> v = ((LambdaStmtContext)_localctx).Parameters == null ? new ListEx<String>() : ((LambdaStmtContext)_localctx).Parameters.v;
			            ListEx<Boolean> pbv = ((LambdaStmtContext)_localctx).Parameters == null ? new ListEx<Boolean>() : ((LambdaStmtContext)_localctx).Parameters.passByValue;

			            ((LambdaStmtContext)_localctx).v =  new PLambda(new Atom(((LambdaStmtContext)_localctx).LambdaStart), v, pbv, _localctx.body, ((LambdaStmtContext)_localctx).Description == null ? "" : (((LambdaStmtContext)_localctx).Description!=null?((LambdaStmtContext)_localctx).Description.getText():null));
			        
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
		enterRule(_localctx, 24, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(250);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(251);
			match(Do);
			setState(252);
			match(T__0);
			setState(260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
				{
				{
				setState(253);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(254);
				match(T__12);
				setState(255);
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
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(263);
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
		enterRule(_localctx, 26, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(266);
				match(T__0);
				setState(267);
				((DictContext)_localctx).pair = pair();
				 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(269);
						match(T__6);
						setState(270);
						((DictContext)_localctx).pair = pair();
						 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(277);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(279);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(278);
					match(T__6);
					}
				}

				setState(281);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				match(T__0);
				setState(284);
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
		enterRule(_localctx, 28, RULE_pair);
		int _la;
		try {
			setState(297);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(287);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(288);
				match(T__14);
				setState(289);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((PairContext)_localctx).Key = match(Identifier);
				setState(293);
				match(T__14);
				setState(294);
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
		enterRule(_localctx, 30, RULE_list);
		int _la;
		try {
			int _alt;
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				match(T__10);
				{
				setState(300);
				((ListContext)_localctx).value = value();
				 _localctx.v.values.add(((ListContext)_localctx).value.v); 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(303);
						match(T__6);
						setState(304);
						((ListContext)_localctx).value = value();
						 _localctx.v.values.add(((ListContext)_localctx).value.v); 
						}
						} 
					}
					setState(311);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(313);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(312);
					match(T__6);
					}
				}

				setState(315);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(T__10);
				setState(318);
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
		enterRule(_localctx, 32, RULE_value);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(324);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
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
		enterRule(_localctx, 34, RULE_topExpr);
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__3);
				setState(333);
				((TopExprContext)_localctx).Inner = stmt();
				setState(334);
				match(T__4);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(337);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(340);
				match(T__15);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.True; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(342);
				match(T__16);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.False; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				match(T__17);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				match(T__18);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Break; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(348);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable(new Atom(((TopExprContext)_localctx).Identifier), (((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(350);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(352);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(354);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SNumber((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(356);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SNumber((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
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
		public AssignExprContext Key;
		public AssignExprContext Start;
		public AssignExprContext End;
		public Token Identifier;
		public ArgumentsListContext argumentsList;
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
		}
		public List<AssignExprContext> assignExpr() {
			return getRuleContexts(AssignExprContext.class);
		}
		public AssignExprContext assignExpr(int i) {
			return getRuleContext(AssignExprContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(361);
			((PostfixExprContext)_localctx).Top = topExpr();
			 ((PostfixExprContext)_localctx).v =  ((PostfixExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(399);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(397);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(364);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(365);
						((PostfixExprContext)_localctx).Op = match(T__19);

						                      ((PostfixExprContext)_localctx).v =  new PAssign(new Atom(((PostfixExprContext)_localctx).Op), ((PostfixExprContext)_localctx).Left.v, new SNumber(1), "+=");
						                  
						}
						break;
					case 2:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(367);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(368);
						((PostfixExprContext)_localctx).Op = match(T__20);

						                      ((PostfixExprContext)_localctx).v =  new PAssign(new Atom(((PostfixExprContext)_localctx).Op), ((PostfixExprContext)_localctx).Left.v, new SNumber(1), "-=");
						                  
						}
						break;
					case 3:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(370);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(371);
						match(T__10);
						setState(372);
						((PostfixExprContext)_localctx).Key = assignExpr(0);
						setState(373);
						match(T__11);

						                      ((PostfixExprContext)_localctx).v =  new PGet(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, ((PostfixExprContext)_localctx).Key.v);
						                  
						}
						break;
					case 4:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(376);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(377);
						match(T__10);
						setState(378);
						((PostfixExprContext)_localctx).Start = assignExpr(0);
						setState(379);
						match(T__6);
						setState(381);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__15 - 4)) | (1L << (T__16 - 4)) | (1L << (T__17 - 4)) | (1L << (T__18 - 4)) | (1L << (T__21 - 4)) | (1L << (T__22 - 4)) | (1L << (T__23 - 4)) | (1L << (Integer - 4)) | (1L << (Double - 4)) | (1L << (Identifier - 4)) | (1L << (RawString - 4)) | (1L << (StringLiteral - 4)))) != 0)) {
							{
							setState(380);
							((PostfixExprContext)_localctx).End = assignExpr(0);
							}
						}

						setState(383);
						match(T__11);

						                      ((PostfixExprContext)_localctx).v =  new PSub(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, ((PostfixExprContext)_localctx).Start.v, ((PostfixExprContext)_localctx).End == null ? null : ((PostfixExprContext)_localctx).End.v);
						                  
						}
						break;
					case 5:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(386);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(387);
						match(T__2);
						setState(388);
						((PostfixExprContext)_localctx).Identifier = match(Identifier);

						                      ((PostfixExprContext)_localctx).v =  new PGet(new Atom(((PostfixExprContext)_localctx).Identifier), ((PostfixExprContext)_localctx).Subject.v, new SString((((PostfixExprContext)_localctx).Identifier!=null?((PostfixExprContext)_localctx).Identifier.getText():null)));
						                  
						}
						break;
					case 6:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(390);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(391);
						match(T__3);
						setState(393);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
							{
							setState(392);
							((PostfixExprContext)_localctx).argumentsList = argumentsList();
							}
						}

						setState(395);
						match(T__4);

						                      ListEx<SExpression> arguments = ((PostfixExprContext)_localctx).argumentsList == null ? 
						                          new ListEx<SExpression>() : ((PostfixExprContext)_localctx).argumentsList.v;
						                      if (SKeywords.Lookup.containsKey((((PostfixExprContext)_localctx).Called!=null?_input.getText(((PostfixExprContext)_localctx).Called.start,((PostfixExprContext)_localctx).Called.stop):null))) {
						                          ((PostfixExprContext)_localctx).v =  SKeywords.Lookup.get((((PostfixExprContext)_localctx).Called!=null?_input.getText(((PostfixExprContext)_localctx).Called.start,((PostfixExprContext)_localctx).Called.stop):null)).call((((PostfixExprContext)_localctx).Called!=null?(((PostfixExprContext)_localctx).Called.start):null), arguments); 
						                      } else {
						                          ((PostfixExprContext)_localctx).v =  new PCall(new Atom((((PostfixExprContext)_localctx).Called!=null?(((PostfixExprContext)_localctx).Called.start):null)), ((PostfixExprContext)_localctx).Called.v, arguments);
						                      }
						                  
						}
						break;
					}
					} 
				}
				setState(401);
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

	public static class UnaryExprContext extends ParserRuleContext {
		public SExpression v;
		public PostfixExprContext Top;
		public Token Sub;
		public PostfixExprContext Right;
		public Token Not;
		public Token BitNot;
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
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
		enterRule(_localctx, 38, RULE_unaryExpr);
		try {
			setState(417);
			switch (_input.LA(1)) {
			case T__3:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				((UnaryExprContext)_localctx).Top = postfixExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(405);
				((UnaryExprContext)_localctx).Sub = match(T__21);
				setState(406);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            if (((UnaryExprContext)_localctx).Right.v instanceof SNumber) {
				                ((UnaryExprContext)_localctx).v =  new SNumber(-((SNumber) ((UnaryExprContext)_localctx).Right.v).doubleValue());
				            } else {
				                ((UnaryExprContext)_localctx).v =  new PInverse(new Atom(((UnaryExprContext)_localctx).Sub), ListEx.build(((UnaryExprContext)_localctx).Right.v));
				            }
				        
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(409);
				((UnaryExprContext)_localctx).Not = match(T__22);
				setState(410);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            ((UnaryExprContext)_localctx).v =  new PNot(new Atom(((UnaryExprContext)_localctx).Not), ((UnaryExprContext)_localctx).Right.v);
				        
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(413);
				((UnaryExprContext)_localctx).BitNot = match(T__23);
				setState(414);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            ((UnaryExprContext)_localctx).v =  new PBitNot(new Atom(((UnaryExprContext)_localctx).BitNot), ((UnaryExprContext)_localctx).Right.v);
				        
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_multiplyExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(420);
			((MultiplyExprContext)_localctx).Top = unaryExpr();
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(440);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(438);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(423);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(424);
						((MultiplyExprContext)_localctx).Op = match(T__24);
						setState(425);
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
						setState(428);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(429);
						((MultiplyExprContext)_localctx).Op = match(T__25);
						setState(430);
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
						setState(433);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(434);
						((MultiplyExprContext)_localctx).Op = match(T__26);
						setState(435);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PModular(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(442);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(444);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
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
					setState(462);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(447);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(448);
						((AddExprContext)_localctx).AddOp = match(T__27);
						setState(449);
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
						setState(452);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(453);
						((AddExprContext)_localctx).AddOp = match(T__28);
						setState(454);
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
						setState(457);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(458);
						((AddExprContext)_localctx).Sub = match(T__21);
						setState(459);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PSubtract(new Atom(((AddExprContext)_localctx).Sub), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
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
			setState(468);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(478);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
					setState(471);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(472);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(473);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  PIntrinsicCompare.get(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, (((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null), ((CompareExprContext)_localctx).Right.v);
					                  
					}
					} 
				}
				setState(480);
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

	public static class BitExprContext extends ParserRuleContext {
		public SExpression v;
		public BitExprContext Left;
		public CompareExprContext Top;
		public Token Op;
		public CompareExprContext Right;
		public CompareExprContext compareExpr() {
			return getRuleContext(CompareExprContext.class,0);
		}
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitBitExpr(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(482);
			((BitExprContext)_localctx).Top = compareExpr(0);
			 ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(502);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(500);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(485);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(486);
						((BitExprContext)_localctx).Op = match(T__35);
						setState(487);
						((BitExprContext)_localctx).Right = compareExpr(0);

						                      ((BitExprContext)_localctx).v =  new PBitOr(new Atom(((BitExprContext)_localctx).Op), ((BitExprContext)_localctx).Left.v, ((BitExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(490);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(491);
						((BitExprContext)_localctx).Op = match(T__7);
						setState(492);
						((BitExprContext)_localctx).Right = compareExpr(0);

						                      ((BitExprContext)_localctx).v =  new PBitAnd(new Atom(((BitExprContext)_localctx).Op), ((BitExprContext)_localctx).Left.v, ((BitExprContext)_localctx).Right.v);
						                  
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(495);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(496);
						((BitExprContext)_localctx).Op = match(T__36);
						setState(497);
						((BitExprContext)_localctx).Right = compareExpr(0);

						                      ((BitExprContext)_localctx).v =  new PBitXor(new Atom(((BitExprContext)_localctx).Op), ((BitExprContext)_localctx).Left.v, ((BitExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(504);
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
		public BitExprContext Top;
		public Token Op;
		public BitExprContext Right;
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(506);
			((LogicExprContext)_localctx).Top = bitExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(516);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
					setState(509);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(510);
					((LogicExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__37 || _la==T__38) ) {
						((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(511);
					((LogicExprContext)_localctx).Right = bitExpr(0);

					                      ((LogicExprContext)_localctx).v =  new PLogic(new Atom(((LogicExprContext)_localctx).Op), ((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v, (((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null).equals("||") ? PLogic.OR : PLogic.AND);
					                  
					}
					} 
				}
				setState(518);
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
		public AssignExprContext Subject3;
		public LogicExprContext Top;
		public Token Identifier;
		public Token Op;
		public AssignExprContext Right;
		public PostfixExprContext Subject1;
		public PostfixExprContext Subject2;
		public AssignExprContext Key;
		public ExprContext Value;
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode AssignOp() { return getToken(EugineParser.AssignOp, 0); }
		public List<AssignExprContext> assignExpr() {
			return getRuleContexts(AssignExprContext.class);
		}
		public AssignExprContext assignExpr(int i) {
			return getRuleContext(AssignExprContext.class,i);
		}
		public PostfixExprContext postfixExpr() {
			return getRuleContext(PostfixExprContext.class,0);
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
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(520);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(523);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(524);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(525);
				((AssignExprContext)_localctx).Right = assignExpr(4);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), new PVariable((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			case 3:
				{
				setState(528);
				((AssignExprContext)_localctx).Subject1 = postfixExpr(0);
				setState(529);
				match(T__2);
				setState(530);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(531);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(532);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Subject1.v, new SString((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			case 4:
				{
				setState(535);
				((AssignExprContext)_localctx).Subject2 = postfixExpr(0);
				setState(536);
				match(T__10);
				setState(537);
				((AssignExprContext)_localctx).Key = assignExpr(0);
				setState(538);
				match(T__11);
				setState(539);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(540);
				((AssignExprContext)_localctx).Right = assignExpr(2);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Subject2.v, ((AssignExprContext)_localctx).Key.v, ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(552);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignExprContext(_parentctx, _parentState);
					_localctx.Subject3 = _prevctx;
					_localctx.Subject3 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_assignExpr);
					setState(545);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(546);
					match(T__5);
					setState(547);
					((AssignExprContext)_localctx).Value = expr();

					                      ((AssignExprContext)_localctx).v =  identifySetter(new Atom((((AssignExprContext)_localctx).Subject3!=null?(((AssignExprContext)_localctx).Subject3.start):null)), ((AssignExprContext)_localctx).Subject3.v, ((AssignExprContext)_localctx).Value.v, PSet.SET);
					                  
					}
					} 
				}
				setState(554);
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
		public ExprContext MetaExpression;
		public Token Sync;
		public CodeContext SyncBody;
		public Token For;
		public ExprContext Subject;
		public ExprContext Body;
		public ExprContext Start;
		public ExprContext I;
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
		enterRule(_localctx, 52, RULE_expr);
		try {
			setState(602);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(T__13);
				setState(559);
				((ExprContext)_localctx).MetaExpression = expr();

				            ((ExprContext)_localctx).v =  new SMetaExpression(((ExprContext)_localctx).MetaExpression.v);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				((ExprContext)_localctx).Sync = match(Sync);
				setState(563);
				((ExprContext)_localctx).SyncBody = code();
				 
				            ((ExprContext)_localctx).v =  new PSync(new Atom(((ExprContext)_localctx).Sync), ((ExprContext)_localctx).SyncBody.v); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(566);
				((ExprContext)_localctx).For = match(For);
				setState(567);
				((ExprContext)_localctx).Subject = expr();
				setState(568);
				match(Do);
				setState(569);
				((ExprContext)_localctx).Body = expr();

				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(572);
				((ExprContext)_localctx).For = match(For);
				setState(573);
				((ExprContext)_localctx).Start = expr();
				setState(576);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(574);
					match(T__6);
					setState(575);
					((ExprContext)_localctx).I = expr();
					}
					break;
				}
				setState(578);
				match(T__6);
				setState(579);
				((ExprContext)_localctx).End = expr();
				setState(580);
				match(Do);
				setState(581);
				((ExprContext)_localctx).Body = expr();

				            Atom atom = new Atom(((ExprContext)_localctx).For);
				            PIRange r = new PIRange(atom, ListEx.build(((ExprContext)_localctx).Start.v, ((ExprContext)_localctx).I == null ? new SNumber(1) : ((ExprContext)_localctx).I.v, ((ExprContext)_localctx).End.v));
				            ((ExprContext)_localctx).v =  new PFor(atom, r, ((ExprContext)_localctx).Body.v); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(584);
				((ExprContext)_localctx).If = match(If);
				setState(585);
				((ExprContext)_localctx).Condition = expr();
				setState(586);
				((ExprContext)_localctx).True = code();
				setState(589);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(587);
					match(Else);
					setState(588);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new PIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(593);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(596);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(599);
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
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
		case 20:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 21:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 22:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 23:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
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
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 3);
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignExpr_sempred(AssignExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3D\u025f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\6\2<\n\2\r\2\16\2=\3\2\3\2"+
		"\5\2B\n\2\3\3\3\3\3\3\3\3\3\3\5\3I\n\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3"+
		"\4\3\4\3\4\6\4U\n\4\r\4\16\4V\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5j\n\5\3\6\3\6\3\6\3\6\7\6p\n\6\f\6\16"+
		"\6s\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7|\n\7\3\7\3\7\5\7\u0080\n\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\7\t\u0094\n\t\f\t\16\t\u0097\13\t\3\t\3\t\3\n\5\n\u009c\n\n\3\n\3\n\3"+
		"\n\5\n\u00a1\n\n\3\n\3\n\7\n\u00a5\n\n\f\n\16\n\u00a8\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00bc\n\f\3\f\3\f\3\f\3\f\5\f\u00c2\n\f\3\f\5\f\u00c5"+
		"\n\f\3\f\3\f\3\f\7\f\u00ca\n\f\f\f\16\f\u00cd\13\f\3\f\3\f\5\f\u00d1\n"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\5\r\u00d9\n\r\3\r\3\r\5\r\u00dd\n\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00e6\n\r\3\r\5\r\u00e9\n\r\3\r\3\r\3\r\3\r\7"+
		"\r\u00ef\n\r\f\r\16\r\u00f2\13\r\3\r\3\r\3\r\3\r\5\r\u00f8\n\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0105\n\16\f\16\16"+
		"\16\u0108\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17"+
		"\u0114\n\17\f\17\16\17\u0117\13\17\3\17\5\17\u011a\n\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0120\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\5\20\u012c\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0136\n"+
		"\21\f\21\16\21\u0139\13\21\3\21\5\21\u013c\n\21\3\21\3\21\3\21\3\21\5"+
		"\21\u0142\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014d"+
		"\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23"+
		"\u0169\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0180\n\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u018c\n\24\3\24\3\24\7\24"+
		"\u0190\n\24\f\24\16\24\u0193\13\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01a4\n\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\7\26\u01b9\n\26\f\26\16\26\u01bc\13\26\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\7\27\u01d1\n\27\f\27\16\27\u01d4\13\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\7\30\u01df\n\30\f\30\16\30\u01e2\13\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u01f7\n\31\f\31\16\31\u01fa\13\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0205\n\32\f\32\16\32\u0208\13\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0222\n\33\3\33"+
		"\3\33\3\33\3\33\3\33\7\33\u0229\n\33\f\33\16\33\u022c\13\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0243\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u0250\n\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\5\34\u025d\n\34\3\34\2\t&*,.\60\62\64\35\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\3\2+,\3\2"+
		"CD\3\2 %\3\2()\u029b\2A\3\2\2\2\4O\3\2\2\2\6T\3\2\2\2\bi\3\2\2\2\nk\3"+
		"\2\2\2\ft\3\2\2\2\16\u0083\3\2\2\2\20\u0087\3\2\2\2\22\u009b\3\2\2\2\24"+
		"\u00ab\3\2\2\2\26\u00b6\3\2\2\2\30\u00d6\3\2\2\2\32\u00fb\3\2\2\2\34\u011f"+
		"\3\2\2\2\36\u012b\3\2\2\2 \u0141\3\2\2\2\"\u014c\3\2\2\2$\u0168\3\2\2"+
		"\2&\u016a\3\2\2\2(\u01a3\3\2\2\2*\u01a5\3\2\2\2,\u01bd\3\2\2\2.\u01d5"+
		"\3\2\2\2\60\u01e3\3\2\2\2\62\u01fb\3\2\2\2\64\u0221\3\2\2\2\66\u025c\3"+
		"\2\2\289\5\6\4\29:\b\2\1\2:<\3\2\2\2;8\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3"+
		"\2\2\2>B\3\2\2\2?@\7\2\2\3@B\b\2\1\2A;\3\2\2\2A?\3\2\2\2B\3\3\2\2\2CD"+
		"\7\3\2\2DE\5\6\4\2EF\7\4\2\2FI\3\2\2\2GI\5\b\5\2HC\3\2\2\2HG\3\2\2\2I"+
		"J\3\2\2\2JK\b\3\1\2KP\3\2\2\2LM\7\3\2\2MN\7\4\2\2NP\b\3\1\2OH\3\2\2\2"+
		"OL\3\2\2\2P\5\3\2\2\2QR\5\b\5\2RS\b\4\1\2SU\3\2\2\2TQ\3\2\2\2UV\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XY\5\n\6\2YZ\b\5\1\2Zj\3\2\2\2[\\\5\f"+
		"\7\2\\]\b\5\1\2]j\3\2\2\2^_\5\20\t\2_`\b\5\1\2`j\3\2\2\2ab\5\26\f\2bc"+
		"\b\5\1\2cj\3\2\2\2de\5\66\34\2ef\b\5\1\2fj\3\2\2\2gh\7=\2\2hj\b\5\1\2"+
		"iX\3\2\2\2i[\3\2\2\2i^\3\2\2\2ia\3\2\2\2id\3\2\2\2ig\3\2\2\2j\t\3\2\2"+
		"\2kl\7*\2\2lq\7>\2\2mn\7\5\2\2np\7>\2\2om\3\2\2\2ps\3\2\2\2qo\3\2\2\2"+
		"qr\3\2\2\2r\13\3\2\2\2sq\3\2\2\2tu\7\64\2\2u{\5\4\3\2vw\7\65\2\2wx\7\6"+
		"\2\2xy\7>\2\2yz\7\7\2\2z|\5\4\3\2{v\3\2\2\2{|\3\2\2\2|\177\3\2\2\2}~\7"+
		"\67\2\2~\u0080\5\4\3\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2"+
		"\2\2\u0081\u0082\b\7\1\2\u0082\r\3\2\2\2\u0083\u0084\7\66\2\2\u0084\u0085"+
		"\5\4\3\2\u0085\u0086\b\b\1\2\u0086\17\3\2\2\2\u0087\u0088\t\2\2\2\u0088"+
		"\u0089\b\t\1\2\u0089\u008a\5(\25\2\u008a\u008b\7\b\2\2\u008b\u008c\5\66"+
		"\34\2\u008c\u0095\b\t\1\2\u008d\u008e\7\t\2\2\u008e\u008f\5(\25\2\u008f"+
		"\u0090\7\b\2\2\u0090\u0091\5\66\34\2\u0091\u0092\b\t\1\2\u0092\u0094\3"+
		"\2\2\2\u0093\u008d\3\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095"+
		"\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\b\t"+
		"\1\2\u0099\21\3\2\2\2\u009a\u009c\7\n\2\2\u009b\u009a\3\2\2\2\u009b\u009c"+
		"\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a6\7>\2\2\u009e\u00a0\7\t\2\2\u009f"+
		"\u00a1\7\n\2\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2"+
		"\2\2\u00a2\u00a3\7>\2\2\u00a3\u00a5\b\n\1\2\u00a4\u009e\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\b\n\1\2\u00aa\23\3\2\2\2\u00ab\u00ac"+
		"\5\66\34\2\u00ac\u00b3\b\13\1\2\u00ad\u00ae\7\t\2\2\u00ae\u00af\5\66\34"+
		"\2\u00af\u00b0\b\13\1\2\u00b0\u00b2\3\2\2\2\u00b1\u00ad\3\2\2\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\25\3\2\2"+
		"\2\u00b5\u00b3\3\2\2\2\u00b6\u00bb\7-\2\2\u00b7\u00bc\7.\2\2\u00b8\u00bc"+
		"\7/\2\2\u00b9\u00bc\7\13\2\2\u00ba\u00bc\7\f\2\2\u00bb\u00b7\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00cb\3\2\2\2\u00bd\u00be\7\r\2\2\u00be\u00c4\5\66\34\2\u00bf"+
		"\u00c1\7\6\2\2\u00c0\u00c2\5\24\13\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3"+
		"\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\7\7\2\2\u00c4\u00bf\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\b"+
		"\f\1\2\u00c8\u00ca\3\2\2\2\u00c9\u00bd\3\2\2\2\u00ca\u00cd\3\2\2\2\u00cb"+
		"\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00d0\3\2\2\2\u00cd\u00cb\3\2"+
		"\2\2\u00ce\u00cf\7>\2\2\u00cf\u00d1\7\5\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00d1\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\5\30"+
		"\r\2\u00d4\u00d5\b\f\1\2\u00d5\27\3\2\2\2\u00d6\u00d8\7\6\2\2\u00d7\u00d9"+
		"\5\22\n\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\u00dc\7\7\2\2\u00db\u00dd\t\3\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e8\7\17\2\2\u00df\u00e0\7\20\2\2"+
		"\u00e0\u00e5\7>\2\2\u00e1\u00e2\7\6\2\2\u00e2\u00e3\5\66\34\2\u00e3\u00e4"+
		"\7\7\2\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e9\b\r\1\2\u00e8\u00df\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00f7\3\2\2\2\u00ea\u00f0\7\3\2\2\u00eb\u00ec\5\b\5\2\u00ec"+
		"\u00ed\b\r\1\2\u00ed\u00ef\3\2\2\2\u00ee\u00eb\3\2\2\2\u00ef\u00f2\3\2"+
		"\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f3\u00f8\7\4\2\2\u00f4\u00f5\5\b\5\2\u00f5\u00f6\b\r"+
		"\1\2\u00f6\u00f8\3\2\2\2\u00f7\u00ea\3\2\2\2\u00f7\u00f4\3\2\2\2\u00f8"+
		"\u00f9\3\2\2\2\u00f9\u00fa\b\r\1\2\u00fa\31\3\2\2\2\u00fb\u00fc\7\62\2"+
		"\2\u00fc\u00fd\5\66\34\2\u00fd\u00fe\7\67\2\2\u00fe\u0106\7\3\2\2\u00ff"+
		"\u0100\5\66\34\2\u0100\u0101\7\17\2\2\u0101\u0102\5\4\3\2\u0102\u0103"+
		"\b\16\1\2\u0103\u0105\3\2\2\2\u0104\u00ff\3\2\2\2\u0105\u0108\3\2\2\2"+
		"\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\3\2\2\2\u0108\u0106"+
		"\3\2\2\2\u0109\u010a\7\4\2\2\u010a\u010b\b\16\1\2\u010b\33\3\2\2\2\u010c"+
		"\u010d\7\3\2\2\u010d\u010e\5\36\20\2\u010e\u0115\b\17\1\2\u010f\u0110"+
		"\7\t\2\2\u0110\u0111\5\36\20\2\u0111\u0112\b\17\1\2\u0112\u0114\3\2\2"+
		"\2\u0113\u010f\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116"+
		"\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011a\7\t\2\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7\4"+
		"\2\2\u011c\u0120\3\2\2\2\u011d\u011e\7\3\2\2\u011e\u0120\7\4\2\2\u011f"+
		"\u010c\3\2\2\2\u011f\u011d\3\2\2\2\u0120\35\3\2\2\2\u0121\u0122\t\3\2"+
		"\2\u0122\u0123\7\21\2\2\u0123\u0124\5\"\22\2\u0124\u0125\b\20\1\2\u0125"+
		"\u012c\3\2\2\2\u0126\u0127\7>\2\2\u0127\u0128\7\21\2\2\u0128\u0129\5\""+
		"\22\2\u0129\u012a\b\20\1\2\u012a\u012c\3\2\2\2\u012b\u0121\3\2\2\2\u012b"+
		"\u0126\3\2\2\2\u012c\37\3\2\2\2\u012d\u012e\7\r\2\2\u012e\u012f\5\"\22"+
		"\2\u012f\u0130\b\21\1\2\u0130\u0137\3\2\2\2\u0131\u0132\7\t\2\2\u0132"+
		"\u0133\5\"\22\2\u0133\u0134\b\21\1\2\u0134\u0136\3\2\2\2\u0135\u0131\3"+
		"\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\7\t\2\2\u013b\u013a\3\2"+
		"\2\2\u013b\u013c\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\7\16\2\2\u013e"+
		"\u0142\3\2\2\2\u013f\u0140\7\r\2\2\u0140\u0142\7\16\2\2\u0141\u012d\3"+
		"\2\2\2\u0141\u013f\3\2\2\2\u0142!\3\2\2\2\u0143\u0144\5\66\34\2\u0144"+
		"\u0145\b\22\1\2\u0145\u014d\3\2\2\2\u0146\u0147\5\34\17\2\u0147\u0148"+
		"\b\22\1\2\u0148\u014d\3\2\2\2\u0149\u014a\5 \21\2\u014a\u014b\b\22\1\2"+
		"\u014b\u014d\3\2\2\2\u014c\u0143\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0149"+
		"\3\2\2\2\u014d#\3\2\2\2\u014e\u014f\7\6\2\2\u014f\u0150\5\b\5\2\u0150"+
		"\u0151\7\7\2\2\u0151\u0152\b\23\1\2\u0152\u0169\3\2\2\2\u0153\u0154\5"+
		"\30\r\2\u0154\u0155\b\23\1\2\u0155\u0169\3\2\2\2\u0156\u0157\7\22\2\2"+
		"\u0157\u0169\b\23\1\2\u0158\u0159\7\23\2\2\u0159\u0169\b\23\1\2\u015a"+
		"\u015b\7\24\2\2\u015b\u0169\b\23\1\2\u015c\u015d\7\25\2\2\u015d\u0169"+
		"\b\23\1\2\u015e\u015f\7>\2\2\u015f\u0169\b\23\1\2\u0160\u0161\7C\2\2\u0161"+
		"\u0169\b\23\1\2\u0162\u0163\7D\2\2\u0163\u0169\b\23\1\2\u0164\u0165\7"+
		"9\2\2\u0165\u0169\b\23\1\2\u0166\u0167\7:\2\2\u0167\u0169\b\23\1\2\u0168"+
		"\u014e\3\2\2\2\u0168\u0153\3\2\2\2\u0168\u0156\3\2\2\2\u0168\u0158\3\2"+
		"\2\2\u0168\u015a\3\2\2\2\u0168\u015c\3\2\2\2\u0168\u015e\3\2\2\2\u0168"+
		"\u0160\3\2\2\2\u0168\u0162\3\2\2\2\u0168\u0164\3\2\2\2\u0168\u0166\3\2"+
		"\2\2\u0169%\3\2\2\2\u016a\u016b\b\24\1\2\u016b\u016c\5$\23\2\u016c\u016d"+
		"\b\24\1\2\u016d\u0191\3\2\2\2\u016e\u016f\f\b\2\2\u016f\u0170\7\26\2\2"+
		"\u0170\u0190\b\24\1\2\u0171\u0172\f\7\2\2\u0172\u0173\7\27\2\2\u0173\u0190"+
		"\b\24\1\2\u0174\u0175\f\6\2\2\u0175\u0176\7\r\2\2\u0176\u0177\5\64\33"+
		"\2\u0177\u0178\7\16\2\2\u0178\u0179\b\24\1\2\u0179\u0190\3\2\2\2\u017a"+
		"\u017b\f\5\2\2\u017b\u017c\7\r\2\2\u017c\u017d\5\64\33\2\u017d\u017f\7"+
		"\t\2\2\u017e\u0180\5\64\33\2\u017f\u017e\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\3\2\2\2\u0181\u0182\7\16\2\2\u0182\u0183\b\24\1\2\u0183\u0190\3"+
		"\2\2\2\u0184\u0185\f\4\2\2\u0185\u0186\7\5\2\2\u0186\u0187\7>\2\2\u0187"+
		"\u0190\b\24\1\2\u0188\u0189\f\3\2\2\u0189\u018b\7\6\2\2\u018a\u018c\5"+
		"\24\13\2\u018b\u018a\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u018e\7\7\2\2\u018e\u0190\b\24\1\2\u018f\u016e\3\2\2\2\u018f\u0171\3"+
		"\2\2\2\u018f\u0174\3\2\2\2\u018f\u017a\3\2\2\2\u018f\u0184\3\2\2\2\u018f"+
		"\u0188\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\'\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5&\24\2\u0195\u0196"+
		"\b\25\1\2\u0196\u01a4\3\2\2\2\u0197\u0198\7\30\2\2\u0198\u0199\5&\24\2"+
		"\u0199\u019a\b\25\1\2\u019a\u01a4\3\2\2\2\u019b\u019c\7\31\2\2\u019c\u019d"+
		"\5&\24\2\u019d\u019e\b\25\1\2\u019e\u01a4\3\2\2\2\u019f\u01a0\7\32\2\2"+
		"\u01a0\u01a1\5&\24\2\u01a1\u01a2\b\25\1\2\u01a2\u01a4\3\2\2\2\u01a3\u0194"+
		"\3\2\2\2\u01a3\u0197\3\2\2\2\u01a3\u019b\3\2\2\2\u01a3\u019f\3\2\2\2\u01a4"+
		")\3\2\2\2\u01a5\u01a6\b\26\1\2\u01a6\u01a7\5(\25\2\u01a7\u01a8\b\26\1"+
		"\2\u01a8\u01ba\3\2\2\2\u01a9\u01aa\f\5\2\2\u01aa\u01ab\7\33\2\2\u01ab"+
		"\u01ac\5(\25\2\u01ac\u01ad\b\26\1\2\u01ad\u01b9\3\2\2\2\u01ae\u01af\f"+
		"\4\2\2\u01af\u01b0\7\34\2\2\u01b0\u01b1\5(\25\2\u01b1\u01b2\b\26\1\2\u01b2"+
		"\u01b9\3\2\2\2\u01b3\u01b4\f\3\2\2\u01b4\u01b5\7\35\2\2\u01b5\u01b6\5"+
		"(\25\2\u01b6\u01b7\b\26\1\2\u01b7\u01b9\3\2\2\2\u01b8\u01a9\3\2\2\2\u01b8"+
		"\u01ae\3\2\2\2\u01b8\u01b3\3\2\2\2\u01b9\u01bc\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01ba\u01bb\3\2\2\2\u01bb+\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bd\u01be"+
		"\b\27\1\2\u01be\u01bf\5*\26\2\u01bf\u01c0\b\27\1\2\u01c0\u01d2\3\2\2\2"+
		"\u01c1\u01c2\f\5\2\2\u01c2\u01c3\7\36\2\2\u01c3\u01c4\5*\26\2\u01c4\u01c5"+
		"\b\27\1\2\u01c5\u01d1\3\2\2\2\u01c6\u01c7\f\4\2\2\u01c7\u01c8\7\37\2\2"+
		"\u01c8\u01c9\5*\26\2\u01c9\u01ca\b\27\1\2\u01ca\u01d1\3\2\2\2\u01cb\u01cc"+
		"\f\3\2\2\u01cc\u01cd\7\30\2\2\u01cd\u01ce\5*\26\2\u01ce\u01cf\b\27\1\2"+
		"\u01cf\u01d1\3\2\2\2\u01d0\u01c1\3\2\2\2\u01d0\u01c6\3\2\2\2\u01d0\u01cb"+
		"\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"-\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\b\30\1\2\u01d6\u01d7\5,\27\2"+
		"\u01d7\u01d8\b\30\1\2\u01d8\u01e0\3\2\2\2\u01d9\u01da\f\3\2\2\u01da\u01db"+
		"\t\4\2\2\u01db\u01dc\5,\27\2\u01dc\u01dd\b\30\1\2\u01dd\u01df\3\2\2\2"+
		"\u01de\u01d9\3\2\2\2\u01df\u01e2\3\2\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1"+
		"\3\2\2\2\u01e1/\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e3\u01e4\b\31\1\2\u01e4"+
		"\u01e5\5.\30\2\u01e5\u01e6\b\31\1\2\u01e6\u01f8\3\2\2\2\u01e7\u01e8\f"+
		"\5\2\2\u01e8\u01e9\7&\2\2\u01e9\u01ea\5.\30\2\u01ea\u01eb\b\31\1\2\u01eb"+
		"\u01f7\3\2\2\2\u01ec\u01ed\f\4\2\2\u01ed\u01ee\7\n\2\2\u01ee\u01ef\5."+
		"\30\2\u01ef\u01f0\b\31\1\2\u01f0\u01f7\3\2\2\2\u01f1\u01f2\f\3\2\2\u01f2"+
		"\u01f3\7\'\2\2\u01f3\u01f4\5.\30\2\u01f4\u01f5\b\31\1\2\u01f5\u01f7\3"+
		"\2\2\2\u01f6\u01e7\3\2\2\2\u01f6\u01ec\3\2\2\2\u01f6\u01f1\3\2\2\2\u01f7"+
		"\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\61\3\2\2"+
		"\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\b\32\1\2\u01fc\u01fd\5\60\31\2\u01fd"+
		"\u01fe\b\32\1\2\u01fe\u0206\3\2\2\2\u01ff\u0200\f\3\2\2\u0200\u0201\t"+
		"\5\2\2\u0201\u0202\5\60\31\2\u0202\u0203\b\32\1\2\u0203\u0205\3\2\2\2"+
		"\u0204\u01ff\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207"+
		"\3\2\2\2\u0207\63\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020a\b\33\1\2\u020a"+
		"\u020b\5\62\32\2\u020b\u020c\b\33\1\2\u020c\u0222\3\2\2\2\u020d\u020e"+
		"\7>\2\2\u020e\u020f\78\2\2\u020f\u0210\5\64\33\6\u0210\u0211\b\33\1\2"+
		"\u0211\u0222\3\2\2\2\u0212\u0213\5&\24\2\u0213\u0214\7\5\2\2\u0214\u0215"+
		"\7>\2\2\u0215\u0216\78\2\2\u0216\u0217\5\64\33\5\u0217\u0218\b\33\1\2"+
		"\u0218\u0222\3\2\2\2\u0219\u021a\5&\24\2\u021a\u021b\7\r\2\2\u021b\u021c"+
		"\5\64\33\2\u021c\u021d\7\16\2\2\u021d\u021e\78\2\2\u021e\u021f\5\64\33"+
		"\4\u021f\u0220\b\33\1\2\u0220\u0222\3\2\2\2\u0221\u0209\3\2\2\2\u0221"+
		"\u020d\3\2\2\2\u0221\u0212\3\2\2\2\u0221\u0219\3\2\2\2\u0222\u022a\3\2"+
		"\2\2\u0223\u0224\f\3\2\2\u0224\u0225\7\b\2\2\u0225\u0226\5\66\34\2\u0226"+
		"\u0227\b\33\1\2\u0227\u0229\3\2\2\2\u0228\u0223\3\2\2\2\u0229\u022c\3"+
		"\2\2\2\u022a\u0228\3\2\2\2\u022a\u022b\3\2\2\2\u022b\65\3\2\2\2\u022c"+
		"\u022a\3\2\2\2\u022d\u022e\5\64\33\2\u022e\u022f\b\34\1\2\u022f\u025d"+
		"\3\2\2\2\u0230\u0231\7\20\2\2\u0231\u0232\5\66\34\2\u0232\u0233\b\34\1"+
		"\2\u0233\u025d\3\2\2\2\u0234\u0235\7\66\2\2\u0235\u0236\5\4\3\2\u0236"+
		"\u0237\b\34\1\2\u0237\u025d\3\2\2\2\u0238\u0239\7\60\2\2\u0239\u023a\5"+
		"\66\34\2\u023a\u023b\7\67\2\2\u023b\u023c\5\66\34\2\u023c\u023d\b\34\1"+
		"\2\u023d\u025d\3\2\2\2\u023e\u023f\7\60\2\2\u023f\u0242\5\66\34\2\u0240"+
		"\u0241\7\t\2\2\u0241\u0243\5\66\34\2\u0242\u0240\3\2\2\2\u0242\u0243\3"+
		"\2\2\2\u0243\u0244\3\2\2\2\u0244\u0245\7\t\2\2\u0245\u0246\5\66\34\2\u0246"+
		"\u0247\7\67\2\2\u0247\u0248\5\66\34\2\u0248\u0249\b\34\1\2\u0249\u025d"+
		"\3\2\2\2\u024a\u024b\7\61\2\2\u024b\u024c\5\66\34\2\u024c\u024f\5\4\3"+
		"\2\u024d\u024e\7\63\2\2\u024e\u0250\5\4\3\2\u024f\u024d\3\2\2\2\u024f"+
		"\u0250\3\2\2\2\u0250\u0251\3\2\2\2\u0251\u0252\b\34\1\2\u0252\u025d\3"+
		"\2\2\2\u0253\u0254\5\32\16\2\u0254\u0255\b\34\1\2\u0255\u025d\3\2\2\2"+
		"\u0256\u0257\5 \21\2\u0257\u0258\b\34\1\2\u0258\u025d\3\2\2\2\u0259\u025a"+
		"\5\34\17\2\u025a\u025b\b\34\1\2\u025b\u025d\3\2\2\2\u025c\u022d\3\2\2"+
		"\2\u025c\u0230\3\2\2\2\u025c\u0234\3\2\2\2\u025c\u0238\3\2\2\2\u025c\u023e"+
		"\3\2\2\2\u025c\u024a\3\2\2\2\u025c\u0253\3\2\2\2\u025c\u0256\3\2\2\2\u025c"+
		"\u0259\3\2\2\2\u025d\67\3\2\2\2\67=AHOViq{\177\u0095\u009b\u00a0\u00a6"+
		"\u00b3\u00bb\u00c1\u00c4\u00cb\u00d0\u00d8\u00dc\u00e5\u00e8\u00f0\u00f7"+
		"\u0106\u0115\u0119\u011f\u012b\u0137\u013b\u0141\u014c\u0168\u017f\u018b"+
		"\u018f\u0191\u01a3\u01b8\u01ba\u01d0\u01d2\u01e0\u01f6\u01f8\u0206\u0221"+
		"\u022a\u0242\u024f\u025c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}