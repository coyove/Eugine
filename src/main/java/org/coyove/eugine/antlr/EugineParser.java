// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.math.*;
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
		RULE_enterStmt = 5, RULE_declareStmt = 6, RULE_parametersList = 7, RULE_argumentsList = 8, 
		RULE_defineStmt = 9, RULE_lambdaStmt = 10, RULE_switchStmt = 11, RULE_dict = 12, 
		RULE_pair = 13, RULE_list = 14, RULE_value = 15, RULE_topExpr = 16, RULE_postfixExpr = 17, 
		RULE_unaryExpr = 18, RULE_multiplyExpr = 19, RULE_addExpr = 20, RULE_compareExpr = 21, 
		RULE_bitExpr = 22, RULE_logicExpr = 23, RULE_assignExpr = 24, RULE_expr = 25;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "declareStmt", 
		"parametersList", "argumentsList", "defineStmt", "lambdaStmt", "switchStmt", 
		"dict", "pair", "list", "value", "topExpr", "postfixExpr", "unaryExpr", 
		"multiplyExpr", "addExpr", "compareExpr", "bitExpr", "logicExpr", "assignExpr", 
		"expr"
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
			setState(61);
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
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(52);
					((ProgContext)_localctx).block = block();
					 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
					}
					}
					setState(57); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Import) | (1L << Var) | (1L << Let) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
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
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(63);
					match(T__0);
					setState(64);
					((CodeContext)_localctx).B1 = block();
					setState(65);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(67);
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
				setState(72);
				match(T__0);
				setState(73);
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
			setState(80); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(77);
					((BlockContext)_localctx).stmt = stmt();
					 _localctx.v.expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82); 
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
			setState(101);
			switch (_input.LA(1)) {
			case Import:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				importStmt();
				 ((StmtContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case Enter:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case Var:
			case Let:
				enterOuterAlt(_localctx, 3);
				{
				setState(90);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
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
				setState(96);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 6);
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
			setState(103);
			match(Import);
			{
			setState(104);
			match(Identifier);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(T__2);
					setState(106);
					match(Identifier);
					}
					} 
				}
				setState(111);
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
			setState(112);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(113);
			((EnterStmtContext)_localctx).Body = code();
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(114);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(115);
				match(T__3);
				setState(116);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(117);
				match(T__4);
				setState(118);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
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
		enterRule(_localctx, 12, RULE_declareStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((DeclareStmtContext)_localctx).Action = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Let) ) {
				((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}

			            ((DeclareStmtContext)_localctx).act =  (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.VAR : PSet.LET;
			        
			setState(129);
			((DeclareStmtContext)_localctx).Head = unaryExpr();
			setState(130);
			match(T__5);
			setState(131);
			((DeclareStmtContext)_localctx).HeadValue = expr();

			            _localctx.multi.add(identifySetter(new Atom((((DeclareStmtContext)_localctx).Head!=null?(((DeclareStmtContext)_localctx).Head.start):null)), ((DeclareStmtContext)_localctx).Head.v, ((DeclareStmtContext)_localctx).HeadValue.v, _localctx.act));
			        
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(133);
					match(T__6);
					setState(134);
					((DeclareStmtContext)_localctx).Tail = unaryExpr();
					setState(135);
					match(T__5);
					setState(136);
					((DeclareStmtContext)_localctx).TailValue = expr();

					            _localctx.multi.add(identifySetter(new Atom((((DeclareStmtContext)_localctx).Tail!=null?(((DeclareStmtContext)_localctx).Tail.start):null)), ((DeclareStmtContext)_localctx).Tail.v, ((DeclareStmtContext)_localctx).TailValue.v, _localctx.act));
					        
					}
					} 
				}
				setState(143);
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
		enterRule(_localctx, 14, RULE_parametersList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(146);
				((ParametersListContext)_localctx).LastStyle = match(T__7);
				}
			}

			setState(149);
			((ParametersListContext)_localctx).LastArg = match(Identifier);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(150);
				match(T__6);
				setState(152);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(151);
					((ParametersListContext)_localctx).InitStyle = match(T__7);
					}
				}

				setState(154);
				((ParametersListContext)_localctx).InitArg = match(Identifier);
				 
				            _localctx.v.add((((ParametersListContext)_localctx).InitArg!=null?((ParametersListContext)_localctx).InitArg.getText():null)); 
				            _localctx.passByValue.add(((ParametersListContext)_localctx).InitStyle == null);
				        
				}
				}
				setState(160);
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
		enterRule(_localctx, 16, RULE_argumentsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			((ArgumentsListContext)_localctx).HeadExpr = expr();
			 _localctx.v.add(((ArgumentsListContext)_localctx).HeadExpr.v); 
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(165);
				match(T__6);
				setState(166);
				((ArgumentsListContext)_localctx).TailExpr = expr();
				 _localctx.v.add(((ArgumentsListContext)_localctx).TailExpr.v); 
				}
				}
				setState(173);
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
		enterRule(_localctx, 18, RULE_defineStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(Def);
			setState(179);
			switch (_input.LA(1)) {
			case Struct:
				{
				setState(175);
				((DefineStmtContext)_localctx).Struct = match(Struct);
				}
				break;
			case Operator:
				{
				setState(176);
				((DefineStmtContext)_localctx).Operator = match(Operator);
				}
				break;
			case T__8:
				{
				setState(177);
				((DefineStmtContext)_localctx).Get = match(T__8);
				}
				break;
			case T__9:
				{
				setState(178);
				((DefineStmtContext)_localctx).Set = match(T__9);
				}
				break;
			case T__10:
			case Identifier:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(181);
				match(T__10);
				setState(182);
				((DefineStmtContext)_localctx).Decorator = expr();
				setState(188);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(183);
					match(T__3);
					setState(185);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
						{
						setState(184);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(187);
					match(T__4);
					}
				}

				setState(190);
				match(T__11);
				 
				            _localctx.decorators.add(new PCall(new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), 
				                ((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v));
				        
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(198);
				((DefineStmtContext)_localctx).FunctionSubject = match(Identifier);
				setState(199);
				match(T__2);
				}
				break;
			}
			setState(202);
			((DefineStmtContext)_localctx).FunctionName = match(Identifier);
			setState(203);
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
		enterRule(_localctx, 20, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			((LambdaStmtContext)_localctx).LambdaStart = match(T__3);
			setState(208);
			_la = _input.LA(1);
			if (_la==T__7 || _la==Identifier) {
				{
				setState(207);
				((LambdaStmtContext)_localctx).Parameters = parametersList();
				}
			}

			setState(210);
			match(T__4);
			setState(212);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(211);
				((LambdaStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((LambdaStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(214);
			match(T__12);
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(215);
				match(T__13);
				setState(216);
				((LambdaStmtContext)_localctx).Identifier = match(Identifier);
				setState(221);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(217);
					match(T__3);
					setState(218);
					((LambdaStmtContext)_localctx).InitValue = expr();
					setState(219);
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
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(226);
				match(T__0);
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << Import) | (1L << Var) | (1L << Let) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
					{
					{
					setState(227);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(234);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(235);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(236);
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
		enterRule(_localctx, 22, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(244);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(245);
			match(Do);
			setState(246);
			match(T__0);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
				{
				{
				setState(247);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(248);
				match(T__12);
				setState(249);
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
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(257);
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
		enterRule(_localctx, 24, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__0);
				setState(261);
				((DictContext)_localctx).pair = pair();
				 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
				setState(269);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(263);
						match(T__6);
						setState(264);
						((DictContext)_localctx).pair = pair();
						 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(271);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(273);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(272);
					match(T__6);
					}
				}

				setState(275);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(T__0);
				setState(278);
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
		enterRule(_localctx, 26, RULE_pair);
		int _la;
		try {
			setState(291);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(282);
				match(T__14);
				setState(283);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				((PairContext)_localctx).Key = match(Identifier);
				setState(287);
				match(T__14);
				setState(288);
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
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			int _alt;
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(293);
				match(T__10);
				{
				setState(294);
				((ListContext)_localctx).value = value();
				 _localctx.v.values.add(((ListContext)_localctx).value.v); 
				}
				setState(303);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(297);
						match(T__6);
						setState(298);
						((ListContext)_localctx).value = value();
						 _localctx.v.values.add(((ListContext)_localctx).value.v); 
						}
						} 
					}
					setState(305);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				setState(307);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(306);
					match(T__6);
					}
				}

				setState(309);
				match(T__11);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(311);
				match(T__10);
				setState(312);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(321);
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
		enterRule(_localctx, 32, RULE_topExpr);
		try {
			setState(352);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				match(T__3);
				setState(327);
				((TopExprContext)_localctx).Inner = stmt();
				setState(328);
				match(T__4);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(T__15);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.True; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(T__16);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.False; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(338);
				match(T__17);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(340);
				match(T__18);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Break; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(342);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable(new Atom(((TopExprContext)_localctx).Identifier), (((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(344);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(346);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(348);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SNumber((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(350);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_postfixExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(355);
			((PostfixExprContext)_localctx).Top = topExpr();
			 ((PostfixExprContext)_localctx).v =  ((PostfixExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(393);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(391);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(358);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(359);
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
						setState(361);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(362);
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
						setState(364);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(365);
						match(T__10);
						setState(366);
						((PostfixExprContext)_localctx).Key = assignExpr(0);
						setState(367);
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
						setState(370);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(371);
						match(T__10);
						setState(372);
						((PostfixExprContext)_localctx).Start = assignExpr(0);
						setState(373);
						match(T__6);
						setState(375);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (T__3 - 4)) | (1L << (T__15 - 4)) | (1L << (T__16 - 4)) | (1L << (T__17 - 4)) | (1L << (T__18 - 4)) | (1L << (T__21 - 4)) | (1L << (T__22 - 4)) | (1L << (T__23 - 4)) | (1L << (Integer - 4)) | (1L << (Double - 4)) | (1L << (Identifier - 4)) | (1L << (RawString - 4)) | (1L << (StringLiteral - 4)))) != 0)) {
							{
							setState(374);
							((PostfixExprContext)_localctx).End = assignExpr(0);
							}
						}

						setState(377);
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
						setState(380);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(381);
						match(T__2);
						setState(382);
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
						setState(384);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(385);
						match(T__3);
						setState(387);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__10) | (1L << T__13) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Sync) | (1L << Integer) | (1L << Double) | (1L << Identifier))) != 0) || _la==RawString || _la==StringLiteral) {
							{
							setState(386);
							((PostfixExprContext)_localctx).argumentsList = argumentsList();
							}
						}

						setState(389);
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
				setState(395);
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
		enterRule(_localctx, 36, RULE_unaryExpr);
		try {
			setState(411);
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
				setState(396);
				((UnaryExprContext)_localctx).Top = postfixExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(399);
				((UnaryExprContext)_localctx).Sub = match(T__21);
				setState(400);
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
				setState(403);
				((UnaryExprContext)_localctx).Not = match(T__22);
				setState(404);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            ((UnaryExprContext)_localctx).v =  new PNot(new Atom(((UnaryExprContext)_localctx).Not), ((UnaryExprContext)_localctx).Right.v);
				        
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 4);
				{
				setState(407);
				((UnaryExprContext)_localctx).BitNot = match(T__23);
				setState(408);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_multiplyExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(414);
			((MultiplyExprContext)_localctx).Top = unaryExpr();
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(434);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(432);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(417);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(418);
						((MultiplyExprContext)_localctx).Op = match(T__24);
						setState(419);
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
						setState(422);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(423);
						((MultiplyExprContext)_localctx).Op = match(T__25);
						setState(424);
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
						setState(427);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(428);
						((MultiplyExprContext)_localctx).Op = match(T__26);
						setState(429);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PModular(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(436);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(458);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(456);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(441);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(442);
						((AddExprContext)_localctx).AddOp = match(T__27);
						setState(443);
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
						setState(446);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(447);
						((AddExprContext)_localctx).AddOp = match(T__28);
						setState(448);
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
						setState(451);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(452);
						((AddExprContext)_localctx).Sub = match(T__21);
						setState(453);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PSubtract(new Atom(((AddExprContext)_localctx).Sub), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(460);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_compareExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(462);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(472);
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
					setState(465);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(466);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(467);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  PIntrinsicCompare.get(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, (((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null), ((CompareExprContext)_localctx).Right.v);
					                  
					}
					} 
				}
				setState(474);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(476);
			((BitExprContext)_localctx).Top = compareExpr(0);
			 ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(496);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(494);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(479);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(480);
						((BitExprContext)_localctx).Op = match(T__35);
						setState(481);
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
						setState(484);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(485);
						((BitExprContext)_localctx).Op = match(T__7);
						setState(486);
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
						setState(489);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(490);
						((BitExprContext)_localctx).Op = match(T__36);
						setState(491);
						((BitExprContext)_localctx).Right = compareExpr(0);

						                      ((BitExprContext)_localctx).v =  new PBitXor(new Atom(((BitExprContext)_localctx).Op), ((BitExprContext)_localctx).Left.v, ((BitExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(498);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(500);
			((LogicExprContext)_localctx).Top = bitExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(510);
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
					setState(503);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(504);
					((LogicExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__37 || _la==T__38) ) {
						((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(505);
					((LogicExprContext)_localctx).Right = bitExpr(0);

					                      ((LogicExprContext)_localctx).v =  new PLogic(new Atom(((LogicExprContext)_localctx).Op), ((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v, (((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null).equals("||") ? PLogic.OR : PLogic.AND);
					                  
					}
					} 
				}
				setState(512);
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
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_assignExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(514);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(517);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(518);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(519);
				((AssignExprContext)_localctx).Right = assignExpr(4);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), new PVariable((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			case 3:
				{
				setState(522);
				((AssignExprContext)_localctx).Subject1 = postfixExpr(0);
				setState(523);
				match(T__2);
				setState(524);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(525);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(526);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Subject1.v, new SString((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			case 4:
				{
				setState(529);
				((AssignExprContext)_localctx).Subject2 = postfixExpr(0);
				setState(530);
				match(T__10);
				setState(531);
				((AssignExprContext)_localctx).Key = assignExpr(0);
				setState(532);
				match(T__11);
				setState(533);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(534);
				((AssignExprContext)_localctx).Right = assignExpr(2);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Subject2.v, ((AssignExprContext)_localctx).Key.v, ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(546);
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
					setState(539);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(540);
					match(T__5);
					setState(541);
					((AssignExprContext)_localctx).Value = expr();

					                      ((AssignExprContext)_localctx).v =  identifySetter(new Atom((((AssignExprContext)_localctx).Subject3!=null?(((AssignExprContext)_localctx).Subject3.start):null)), ((AssignExprContext)_localctx).Subject3.v, ((AssignExprContext)_localctx).Value.v, PSet.SET);
					                  
					}
					} 
				}
				setState(548);
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
		enterRule(_localctx, 50, RULE_expr);
		try {
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(549);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(552);
				match(T__13);
				setState(553);
				((ExprContext)_localctx).MetaExpression = expr();

				            ((ExprContext)_localctx).v =  new SMetaExpression(((ExprContext)_localctx).MetaExpression.v);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(556);
				((ExprContext)_localctx).Sync = match(Sync);
				setState(557);
				((ExprContext)_localctx).SyncBody = code();
				 
				            ((ExprContext)_localctx).v =  new PSync(new Atom(((ExprContext)_localctx).Sync), ((ExprContext)_localctx).SyncBody.v); 
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(560);
				((ExprContext)_localctx).For = match(For);
				setState(561);
				((ExprContext)_localctx).Subject = expr();
				setState(562);
				match(Do);
				setState(563);
				((ExprContext)_localctx).Body = expr();

				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(566);
				((ExprContext)_localctx).For = match(For);
				setState(567);
				((ExprContext)_localctx).Start = expr();
				setState(570);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(568);
					match(T__6);
					setState(569);
					((ExprContext)_localctx).I = expr();
					}
					break;
				}
				setState(572);
				match(T__6);
				setState(573);
				((ExprContext)_localctx).End = expr();
				setState(574);
				match(Do);
				setState(575);
				((ExprContext)_localctx).Body = expr();

				            Atom atom = new Atom(((ExprContext)_localctx).For);
				            PRange r = new PRange(atom, ListEx.build(((ExprContext)_localctx).Start.v, ((ExprContext)_localctx).I == null ? new SNumber(1) : ((ExprContext)_localctx).I.v, ((ExprContext)_localctx).End.v));
				            ((ExprContext)_localctx).v =  new PFor(atom, r, ((ExprContext)_localctx).Body.v); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(578);
				((ExprContext)_localctx).If = match(If);
				setState(579);
				((ExprContext)_localctx).Condition = expr();
				setState(580);
				((ExprContext)_localctx).True = code();
				setState(583);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(581);
					match(Else);
					setState(582);
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
				setState(587);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(590);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(593);
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
			return postfixExpr_sempred((PostfixExprContext)_localctx, predIndex);
		case 19:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 20:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 21:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 22:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 23:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		case 24:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3D\u0259\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\6\2:\n\2\r\2\16\2;\3\2\3\2\5\2@\n\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3G\n\3\3\3\3\3\3\3\3\3\3\3\5\3N\n\3\3\4\3\4\3\4\6"+
		"\4S\n\4\r\4\16\4T\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5h\n\5\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7z\n\7\3\7\3\7\5\7~\n\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008e\n\b\f\b\16\b\u0091\13\b"+
		"\3\b\3\b\3\t\5\t\u0096\n\t\3\t\3\t\3\t\5\t\u009b\n\t\3\t\3\t\7\t\u009f"+
		"\n\t\f\t\16\t\u00a2\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00ac\n\n"+
		"\f\n\16\n\u00af\13\n\3\13\3\13\3\13\3\13\3\13\5\13\u00b6\n\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00bc\n\13\3\13\5\13\u00bf\n\13\3\13\3\13\3\13\7\13\u00c4"+
		"\n\13\f\13\16\13\u00c7\13\13\3\13\3\13\5\13\u00cb\n\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\5\f\u00d3\n\f\3\f\3\f\5\f\u00d7\n\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00e0\n\f\3\f\5\f\u00e3\n\f\3\f\3\f\3\f\3\f\7\f\u00e9\n\f"+
		"\f\f\16\f\u00ec\13\f\3\f\3\f\3\f\3\f\5\f\u00f2\n\f\3\f\3\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00ff\n\r\f\r\16\r\u0102\13\r\3\r\3\r\3\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u010e\n\16\f\16\16\16\u0111\13"+
		"\16\3\16\5\16\u0114\n\16\3\16\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0126\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0130\n\20\f\20\16\20\u0133\13\20\3\20"+
		"\5\20\u0136\n\20\3\20\3\20\3\20\3\20\5\20\u013c\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u0147\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0163\n\22\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\5\23\u017a\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\5\23\u0186\n\23\3\23\3\23\7\23\u018a\n\23\f\23\16\23\u018d"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u019e\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01b3\n\25\f\25"+
		"\16\25\u01b6\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u01cb\n\26\f\26\16\26"+
		"\u01ce\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01d9\n"+
		"\27\f\27\16\27\u01dc\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01f1\n\30\f\30"+
		"\16\30\u01f4\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01ff"+
		"\n\31\f\31\16\31\u0202\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\5\32\u021c\n\32\3\32\3\32\3\32\3\32\3\32\7\32\u0223\n\32\f\32"+
		"\16\32\u0226\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u023d\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u024a\n\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0257\n\33"+
		"\3\33\2\t$(*,.\60\62\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\62\64\2\6\3\2+,\3\2CD\3\2 %\3\2()\u0296\2?\3\2\2\2\4M\3\2\2\2\6"+
		"R\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\fr\3\2\2\2\16\u0081\3\2\2\2\20\u0095\3"+
		"\2\2\2\22\u00a5\3\2\2\2\24\u00b0\3\2\2\2\26\u00d0\3\2\2\2\30\u00f5\3\2"+
		"\2\2\32\u0119\3\2\2\2\34\u0125\3\2\2\2\36\u013b\3\2\2\2 \u0146\3\2\2\2"+
		"\"\u0162\3\2\2\2$\u0164\3\2\2\2&\u019d\3\2\2\2(\u019f\3\2\2\2*\u01b7\3"+
		"\2\2\2,\u01cf\3\2\2\2.\u01dd\3\2\2\2\60\u01f5\3\2\2\2\62\u021b\3\2\2\2"+
		"\64\u0256\3\2\2\2\66\67\5\6\4\2\678\b\2\1\28:\3\2\2\29\66\3\2\2\2:;\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<@\3\2\2\2=>\7\2\2\3>@\b\2\1\2?9\3\2\2\2?=\3"+
		"\2\2\2@\3\3\2\2\2AB\7\3\2\2BC\5\6\4\2CD\7\4\2\2DG\3\2\2\2EG\5\b\5\2FA"+
		"\3\2\2\2FE\3\2\2\2GH\3\2\2\2HI\b\3\1\2IN\3\2\2\2JK\7\3\2\2KL\7\4\2\2L"+
		"N\b\3\1\2MF\3\2\2\2MJ\3\2\2\2N\5\3\2\2\2OP\5\b\5\2PQ\b\4\1\2QS\3\2\2\2"+
		"RO\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VW\5\n\6\2WX\b\5\1"+
		"\2Xh\3\2\2\2YZ\5\f\7\2Z[\b\5\1\2[h\3\2\2\2\\]\5\16\b\2]^\b\5\1\2^h\3\2"+
		"\2\2_`\5\24\13\2`a\b\5\1\2ah\3\2\2\2bc\5\64\33\2cd\b\5\1\2dh\3\2\2\2e"+
		"f\7=\2\2fh\b\5\1\2gV\3\2\2\2gY\3\2\2\2g\\\3\2\2\2g_\3\2\2\2gb\3\2\2\2"+
		"ge\3\2\2\2h\t\3\2\2\2ij\7*\2\2jo\7>\2\2kl\7\5\2\2ln\7>\2\2mk\3\2\2\2n"+
		"q\3\2\2\2om\3\2\2\2op\3\2\2\2p\13\3\2\2\2qo\3\2\2\2rs\7\64\2\2sy\5\4\3"+
		"\2tu\7\65\2\2uv\7\6\2\2vw\7>\2\2wx\7\7\2\2xz\5\4\3\2yt\3\2\2\2yz\3\2\2"+
		"\2z}\3\2\2\2{|\7\67\2\2|~\5\4\3\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177"+
		"\u0080\b\7\1\2\u0080\r\3\2\2\2\u0081\u0082\t\2\2\2\u0082\u0083\b\b\1\2"+
		"\u0083\u0084\5&\24\2\u0084\u0085\7\b\2\2\u0085\u0086\5\64\33\2\u0086\u008f"+
		"\b\b\1\2\u0087\u0088\7\t\2\2\u0088\u0089\5&\24\2\u0089\u008a\7\b\2\2\u008a"+
		"\u008b\5\64\33\2\u008b\u008c\b\b\1\2\u008c\u008e\3\2\2\2\u008d\u0087\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\b\b\1\2\u0093\17\3\2\2"+
		"\2\u0094\u0096\7\n\2\2\u0095\u0094\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\3\2\2\2\u0097\u00a0\7>\2\2\u0098\u009a\7\t\2\2\u0099\u009b\7\n\2\2\u009a"+
		"\u0099\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7>"+
		"\2\2\u009d\u009f\b\t\1\2\u009e\u0098\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a3\u00a4\b\t\1\2\u00a4\21\3\2\2\2\u00a5\u00a6\5\64\33\2\u00a6"+
		"\u00ad\b\n\1\2\u00a7\u00a8\7\t\2\2\u00a8\u00a9\5\64\33\2\u00a9\u00aa\b"+
		"\n\1\2\u00aa\u00ac\3\2\2\2\u00ab\u00a7\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\23\3\2\2\2\u00af\u00ad\3\2\2"+
		"\2\u00b0\u00b5\7-\2\2\u00b1\u00b6\7.\2\2\u00b2\u00b6\7/\2\2\u00b3\u00b6"+
		"\7\13\2\2\u00b4\u00b6\7\f\2\2\u00b5\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2"+
		"\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00c5"+
		"\3\2\2\2\u00b7\u00b8\7\r\2\2\u00b8\u00be\5\64\33\2\u00b9\u00bb\7\6\2\2"+
		"\u00ba\u00bc\5\22\n\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd"+
		"\3\2\2\2\u00bd\u00bf\7\7\2\2\u00be\u00b9\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0\u00c1\7\16\2\2\u00c1\u00c2\b\13\1\2\u00c2\u00c4\3"+
		"\2\2\2\u00c3\u00b7\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
		"\u00c6\3\2\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\7>"+
		"\2\2\u00c9\u00cb\7\5\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\7>\2\2\u00cd\u00ce\5\26\f\2\u00ce\u00cf\b\13"+
		"\1\2\u00cf\25\3\2\2\2\u00d0\u00d2\7\6\2\2\u00d1\u00d3\5\20\t\2\u00d2\u00d1"+
		"\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\7\7\2\2\u00d5"+
		"\u00d7\t\3\2\2\u00d6\u00d5\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2"+
		"\2\2\u00d8\u00e2\7\17\2\2\u00d9\u00da\7\20\2\2\u00da\u00df\7>\2\2\u00db"+
		"\u00dc\7\6\2\2\u00dc\u00dd\5\64\33\2\u00dd\u00de\7\7\2\2\u00de\u00e0\3"+
		"\2\2\2\u00df\u00db\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\b\f\1\2\u00e2\u00d9\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00f1\3\2"+
		"\2\2\u00e4\u00ea\7\3\2\2\u00e5\u00e6\5\b\5\2\u00e6\u00e7\b\f\1\2\u00e7"+
		"\u00e9\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f2\7\4\2\2\u00ee\u00ef\5\b\5\2\u00ef\u00f0\b\f\1\2\u00f0\u00f2\3\2"+
		"\2\2\u00f1\u00e4\3\2\2\2\u00f1\u00ee\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\b\f\1\2\u00f4\27\3\2\2\2\u00f5\u00f6\7\62\2\2\u00f6\u00f7\5\64"+
		"\33\2\u00f7\u00f8\7\67\2\2\u00f8\u0100\7\3\2\2\u00f9\u00fa\5\64\33\2\u00fa"+
		"\u00fb\7\17\2\2\u00fb\u00fc\5\4\3\2\u00fc\u00fd\b\r\1\2\u00fd\u00ff\3"+
		"\2\2\2\u00fe\u00f9\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100"+
		"\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\7\4"+
		"\2\2\u0104\u0105\b\r\1\2\u0105\31\3\2\2\2\u0106\u0107\7\3\2\2\u0107\u0108"+
		"\5\34\17\2\u0108\u010f\b\16\1\2\u0109\u010a\7\t\2\2\u010a\u010b\5\34\17"+
		"\2\u010b\u010c\b\16\1\2\u010c\u010e\3\2\2\2\u010d\u0109\3\2\2\2\u010e"+
		"\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0112\u0114\7\t\2\2\u0113\u0112\3\2\2\2\u0113"+
		"\u0114\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\7\4\2\2\u0116\u011a\3\2"+
		"\2\2\u0117\u0118\7\3\2\2\u0118\u011a\7\4\2\2\u0119\u0106\3\2\2\2\u0119"+
		"\u0117\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c\t\3\2\2\u011c\u011d\7\21\2"+
		"\2\u011d\u011e\5 \21\2\u011e\u011f\b\17\1\2\u011f\u0126\3\2\2\2\u0120"+
		"\u0121\7>\2\2\u0121\u0122\7\21\2\2\u0122\u0123\5 \21\2\u0123\u0124\b\17"+
		"\1\2\u0124\u0126\3\2\2\2\u0125\u011b\3\2\2\2\u0125\u0120\3\2\2\2\u0126"+
		"\35\3\2\2\2\u0127\u0128\7\r\2\2\u0128\u0129\5 \21\2\u0129\u012a\b\20\1"+
		"\2\u012a\u0131\3\2\2\2\u012b\u012c\7\t\2\2\u012c\u012d\5 \21\2\u012d\u012e"+
		"\b\20\1\2\u012e\u0130\3\2\2\2\u012f\u012b\3\2\2\2\u0130\u0133\3\2\2\2"+
		"\u0131\u012f\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131"+
		"\3\2\2\2\u0134\u0136\7\t\2\2\u0135\u0134\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0138\7\16\2\2\u0138\u013c\3\2\2\2\u0139\u013a\7"+
		"\r\2\2\u013a\u013c\7\16\2\2\u013b\u0127\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\37\3\2\2\2\u013d\u013e\5\64\33\2\u013e\u013f\b\21\1\2\u013f\u0147\3\2"+
		"\2\2\u0140\u0141\5\32\16\2\u0141\u0142\b\21\1\2\u0142\u0147\3\2\2\2\u0143"+
		"\u0144\5\36\20\2\u0144\u0145\b\21\1\2\u0145\u0147\3\2\2\2\u0146\u013d"+
		"\3\2\2\2\u0146\u0140\3\2\2\2\u0146\u0143\3\2\2\2\u0147!\3\2\2\2\u0148"+
		"\u0149\7\6\2\2\u0149\u014a\5\b\5\2\u014a\u014b\7\7\2\2\u014b\u014c\b\22"+
		"\1\2\u014c\u0163\3\2\2\2\u014d\u014e\5\26\f\2\u014e\u014f\b\22\1\2\u014f"+
		"\u0163\3\2\2\2\u0150\u0151\7\22\2\2\u0151\u0163\b\22\1\2\u0152\u0153\7"+
		"\23\2\2\u0153\u0163\b\22\1\2\u0154\u0155\7\24\2\2\u0155\u0163\b\22\1\2"+
		"\u0156\u0157\7\25\2\2\u0157\u0163\b\22\1\2\u0158\u0159\7>\2\2\u0159\u0163"+
		"\b\22\1\2\u015a\u015b\7C\2\2\u015b\u0163\b\22\1\2\u015c\u015d\7D\2\2\u015d"+
		"\u0163\b\22\1\2\u015e\u015f\79\2\2\u015f\u0163\b\22\1\2\u0160\u0161\7"+
		":\2\2\u0161\u0163\b\22\1\2\u0162\u0148\3\2\2\2\u0162\u014d\3\2\2\2\u0162"+
		"\u0150\3\2\2\2\u0162\u0152\3\2\2\2\u0162\u0154\3\2\2\2\u0162\u0156\3\2"+
		"\2\2\u0162\u0158\3\2\2\2\u0162\u015a\3\2\2\2\u0162\u015c\3\2\2\2\u0162"+
		"\u015e\3\2\2\2\u0162\u0160\3\2\2\2\u0163#\3\2\2\2\u0164\u0165\b\23\1\2"+
		"\u0165\u0166\5\"\22\2\u0166\u0167\b\23\1\2\u0167\u018b\3\2\2\2\u0168\u0169"+
		"\f\b\2\2\u0169\u016a\7\26\2\2\u016a\u018a\b\23\1\2\u016b\u016c\f\7\2\2"+
		"\u016c\u016d\7\27\2\2\u016d\u018a\b\23\1\2\u016e\u016f\f\6\2\2\u016f\u0170"+
		"\7\r\2\2\u0170\u0171\5\62\32\2\u0171\u0172\7\16\2\2\u0172\u0173\b\23\1"+
		"\2\u0173\u018a\3\2\2\2\u0174\u0175\f\5\2\2\u0175\u0176\7\r\2\2\u0176\u0177"+
		"\5\62\32\2\u0177\u0179\7\t\2\2\u0178\u017a\5\62\32\2\u0179\u0178\3\2\2"+
		"\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7\16\2\2\u017c"+
		"\u017d\b\23\1\2\u017d\u018a\3\2\2\2\u017e\u017f\f\4\2\2\u017f\u0180\7"+
		"\5\2\2\u0180\u0181\7>\2\2\u0181\u018a\b\23\1\2\u0182\u0183\f\3\2\2\u0183"+
		"\u0185\7\6\2\2\u0184\u0186\5\22\n\2\u0185\u0184\3\2\2\2\u0185\u0186\3"+
		"\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7\7\2\2\u0188\u018a\b\23\1\2\u0189"+
		"\u0168\3\2\2\2\u0189\u016b\3\2\2\2\u0189\u016e\3\2\2\2\u0189\u0174\3\2"+
		"\2\2\u0189\u017e\3\2\2\2\u0189\u0182\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c%\3\2\2\2\u018d\u018b\3\2\2\2"+
		"\u018e\u018f\5$\23\2\u018f\u0190\b\24\1\2\u0190\u019e\3\2\2\2\u0191\u0192"+
		"\7\30\2\2\u0192\u0193\5$\23\2\u0193\u0194\b\24\1\2\u0194\u019e\3\2\2\2"+
		"\u0195\u0196\7\31\2\2\u0196\u0197\5$\23\2\u0197\u0198\b\24\1\2\u0198\u019e"+
		"\3\2\2\2\u0199\u019a\7\32\2\2\u019a\u019b\5$\23\2\u019b\u019c\b\24\1\2"+
		"\u019c\u019e\3\2\2\2\u019d\u018e\3\2\2\2\u019d\u0191\3\2\2\2\u019d\u0195"+
		"\3\2\2\2\u019d\u0199\3\2\2\2\u019e\'\3\2\2\2\u019f\u01a0\b\25\1\2\u01a0"+
		"\u01a1\5&\24\2\u01a1\u01a2\b\25\1\2\u01a2\u01b4\3\2\2\2\u01a3\u01a4\f"+
		"\5\2\2\u01a4\u01a5\7\33\2\2\u01a5\u01a6\5&\24\2\u01a6\u01a7\b\25\1\2\u01a7"+
		"\u01b3\3\2\2\2\u01a8\u01a9\f\4\2\2\u01a9\u01aa\7\34\2\2\u01aa\u01ab\5"+
		"&\24\2\u01ab\u01ac\b\25\1\2\u01ac\u01b3\3\2\2\2\u01ad\u01ae\f\3\2\2\u01ae"+
		"\u01af\7\35\2\2\u01af\u01b0\5&\24\2\u01b0\u01b1\b\25\1\2\u01b1\u01b3\3"+
		"\2\2\2\u01b2\u01a3\3\2\2\2\u01b2\u01a8\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b3"+
		"\u01b6\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5)\3\2\2\2"+
		"\u01b6\u01b4\3\2\2\2\u01b7\u01b8\b\26\1\2\u01b8\u01b9\5(\25\2\u01b9\u01ba"+
		"\b\26\1\2\u01ba\u01cc\3\2\2\2\u01bb\u01bc\f\5\2\2\u01bc\u01bd\7\36\2\2"+
		"\u01bd\u01be\5(\25\2\u01be\u01bf\b\26\1\2\u01bf\u01cb\3\2\2\2\u01c0\u01c1"+
		"\f\4\2\2\u01c1\u01c2\7\37\2\2\u01c2\u01c3\5(\25\2\u01c3\u01c4\b\26\1\2"+
		"\u01c4\u01cb\3\2\2\2\u01c5\u01c6\f\3\2\2\u01c6\u01c7\7\30\2\2\u01c7\u01c8"+
		"\5(\25\2\u01c8\u01c9\b\26\1\2\u01c9\u01cb\3\2\2\2\u01ca\u01bb\3\2\2\2"+
		"\u01ca\u01c0\3\2\2\2\u01ca\u01c5\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca"+
		"\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd+\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf"+
		"\u01d0\b\27\1\2\u01d0\u01d1\5*\26\2\u01d1\u01d2\b\27\1\2\u01d2\u01da\3"+
		"\2\2\2\u01d3\u01d4\f\3\2\2\u01d4\u01d5\t\4\2\2\u01d5\u01d6\5*\26\2\u01d6"+
		"\u01d7\b\27\1\2\u01d7\u01d9\3\2\2\2\u01d8\u01d3\3\2\2\2\u01d9\u01dc\3"+
		"\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2\2\2\u01db-\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dd\u01de\b\30\1\2\u01de\u01df\5,\27\2\u01df\u01e0\b\30\1\2"+
		"\u01e0\u01f2\3\2\2\2\u01e1\u01e2\f\5\2\2\u01e2\u01e3\7&\2\2\u01e3\u01e4"+
		"\5,\27\2\u01e4\u01e5\b\30\1\2\u01e5\u01f1\3\2\2\2\u01e6\u01e7\f\4\2\2"+
		"\u01e7\u01e8\7\n\2\2\u01e8\u01e9\5,\27\2\u01e9\u01ea\b\30\1\2\u01ea\u01f1"+
		"\3\2\2\2\u01eb\u01ec\f\3\2\2\u01ec\u01ed\7\'\2\2\u01ed\u01ee\5,\27\2\u01ee"+
		"\u01ef\b\30\1\2\u01ef\u01f1\3\2\2\2\u01f0\u01e1\3\2\2\2\u01f0\u01e6\3"+
		"\2\2\2\u01f0\u01eb\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2"+
		"\u01f3\3\2\2\2\u01f3/\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f6\b\31\1\2"+
		"\u01f6\u01f7\5.\30\2\u01f7\u01f8\b\31\1\2\u01f8\u0200\3\2\2\2\u01f9\u01fa"+
		"\f\3\2\2\u01fa\u01fb\t\5\2\2\u01fb\u01fc\5.\30\2\u01fc\u01fd\b\31\1\2"+
		"\u01fd\u01ff\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\61\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\b\32\1\2\u0204\u0205\5\60\31\2\u0205\u0206\b\32\1\2\u0206\u021c"+
		"\3\2\2\2\u0207\u0208\7>\2\2\u0208\u0209\78\2\2\u0209\u020a\5\62\32\6\u020a"+
		"\u020b\b\32\1\2\u020b\u021c\3\2\2\2\u020c\u020d\5$\23\2\u020d\u020e\7"+
		"\5\2\2\u020e\u020f\7>\2\2\u020f\u0210\78\2\2\u0210\u0211\5\62\32\5\u0211"+
		"\u0212\b\32\1\2\u0212\u021c\3\2\2\2\u0213\u0214\5$\23\2\u0214\u0215\7"+
		"\r\2\2\u0215\u0216\5\62\32\2\u0216\u0217\7\16\2\2\u0217\u0218\78\2\2\u0218"+
		"\u0219\5\62\32\4\u0219\u021a\b\32\1\2\u021a\u021c\3\2\2\2\u021b\u0203"+
		"\3\2\2\2\u021b\u0207\3\2\2\2\u021b\u020c\3\2\2\2\u021b\u0213\3\2\2\2\u021c"+
		"\u0224\3\2\2\2\u021d\u021e\f\3\2\2\u021e\u021f\7\b\2\2\u021f\u0220\5\64"+
		"\33\2\u0220\u0221\b\32\1\2\u0221\u0223\3\2\2\2\u0222\u021d\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u0225\63\3\2\2"+
		"\2\u0226\u0224\3\2\2\2\u0227\u0228\5\62\32\2\u0228\u0229\b\33\1\2\u0229"+
		"\u0257\3\2\2\2\u022a\u022b\7\20\2\2\u022b\u022c\5\64\33\2\u022c\u022d"+
		"\b\33\1\2\u022d\u0257\3\2\2\2\u022e\u022f\7\66\2\2\u022f\u0230\5\4\3\2"+
		"\u0230\u0231\b\33\1\2\u0231\u0257\3\2\2\2\u0232\u0233\7\60\2\2\u0233\u0234"+
		"\5\64\33\2\u0234\u0235\7\67\2\2\u0235\u0236\5\64\33\2\u0236\u0237\b\33"+
		"\1\2\u0237\u0257\3\2\2\2\u0238\u0239\7\60\2\2\u0239\u023c\5\64\33\2\u023a"+
		"\u023b\7\t\2\2\u023b\u023d\5\64\33\2\u023c\u023a\3\2\2\2\u023c\u023d\3"+
		"\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\7\t\2\2\u023f\u0240\5\64\33\2\u0240"+
		"\u0241\7\67\2\2\u0241\u0242\5\64\33\2\u0242\u0243\b\33\1\2\u0243\u0257"+
		"\3\2\2\2\u0244\u0245\7\61\2\2\u0245\u0246\5\64\33\2\u0246\u0249\5\4\3"+
		"\2\u0247\u0248\7\63\2\2\u0248\u024a\5\4\3\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\b\33\1\2\u024c\u0257\3"+
		"\2\2\2\u024d\u024e\5\30\r\2\u024e\u024f\b\33\1\2\u024f\u0257\3\2\2\2\u0250"+
		"\u0251\5\36\20\2\u0251\u0252\b\33\1\2\u0252\u0257\3\2\2\2\u0253\u0254"+
		"\5\32\16\2\u0254\u0255\b\33\1\2\u0255\u0257\3\2\2\2\u0256\u0227\3\2\2"+
		"\2\u0256\u022a\3\2\2\2\u0256\u022e\3\2\2\2\u0256\u0232\3\2\2\2\u0256\u0238"+
		"\3\2\2\2\u0256\u0244\3\2\2\2\u0256\u024d\3\2\2\2\u0256\u0250\3\2\2\2\u0256"+
		"\u0253\3\2\2\2\u0257\65\3\2\2\2\67;?FMTgoy}\u008f\u0095\u009a\u00a0\u00ad"+
		"\u00b5\u00bb\u00be\u00c5\u00ca\u00d2\u00d6\u00df\u00e2\u00ea\u00f1\u0100"+
		"\u010f\u0113\u0119\u0125\u0131\u0135\u013b\u0146\u0162\u0179\u0185\u0189"+
		"\u018b\u019d\u01b2\u01b4\u01ca\u01cc\u01da\u01f0\u01f2\u0200\u021b\u0224"+
		"\u023c\u0249\u0256";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}