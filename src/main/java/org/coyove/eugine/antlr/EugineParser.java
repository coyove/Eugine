// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.interop.*;
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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, Var=47, Let=48, Def=49, Struct=50, Operator=51, For=52, If=53, 
		Switch=54, Else=55, Enter=56, Catch=57, Clone=58, Sync=59, Yield=60, New=61, 
		Static=62, Do=63, AssignOp=64, Integer=65, Double=66, NEWLINE=67, WS=68, 
		Semi=69, Identifier=70, JavaFullName=71, Letter=72, BlockComment=73, LineComment=74, 
		RawString=75, StringLiteral=76;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_syncStmt = 6, RULE_declareStmt = 7, RULE_parametersList = 8, 
		RULE_argumentsList = 9, RULE_interopArgumentDeclaration = 10, RULE_interopArgumentsList = 11, 
		RULE_defineStmt = 12, RULE_lambdaStmt = 13, RULE_switchStmt = 14, RULE_dict = 15, 
		RULE_pair = 16, RULE_list = 17, RULE_value = 18, RULE_topExpr = 19, RULE_postfixExpr = 20, 
		RULE_unaryExpr = 21, RULE_multiplyExpr = 22, RULE_addExpr = 23, RULE_compareExpr = 24, 
		RULE_bitExpr = 25, RULE_logicExpr = 26, RULE_assignExpr = 27, RULE_expr = 28;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "syncStmt", 
		"declareStmt", "parametersList", "argumentsList", "interopArgumentDeclaration", 
		"interopArgumentsList", "defineStmt", "lambdaStmt", "switchStmt", "dict", 
		"pair", "list", "value", "topExpr", "postfixExpr", "unaryExpr", "multiplyExpr", 
		"addExpr", "compareExpr", "bitExpr", "logicExpr", "assignExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'reload'", "'include'", "'.'", "'('", 
		"')'", "'='", "','", "'&'", "':'", "'getter'", "'setter'", "'['", "']'", 
		"'=>'", "'@'", "'true'", "'false'", "'null'", "'break'", "'++'", "'--'", 
		"'..'", "'...'", "'::'", "':>'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", 
		"'+'", "'<+'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'|'", "'^'", 
		"'&&'", "'||'", "'var'", "'let'", "'def'", "'struct'", "'operator'", "'for'", 
		"'if'", "'switch'", "'else'", "'enter'", "'catch'", "'clone'", "'sync'", 
		"'yield'", "'new'", "'static'", "'do'", null, null, null, null, null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "Var", 
		"Let", "Def", "Struct", "Operator", "For", "If", "Switch", "Else", "Enter", 
		"Catch", "Clone", "Sync", "Yield", "New", "Static", "Do", "AssignOp", 
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


	    public static SObject getClassByName(String classname, Token tok) {
	        try {
	            return new SObject(ClassUtils.getClass(classname));
	        } catch(Exception e) {
	            ErrorHandler.print(4056, "cannot initiate " + classname, new Atom(tok));
	            return null;
	        }
	    }

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
			setState(67);
			switch (_input.LA(1)) {
			case T__0:
			case T__2:
			case T__3:
			case T__4:
			case T__6:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__28:
			case T__29:
			case T__30:
			case Var:
			case Let:
			case Def:
			case For:
			case If:
			case Switch:
			case Enter:
			case Clone:
			case Sync:
			case New:
			case Static:
			case Integer:
			case Double:
			case Semi:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(61); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					((ProgContext)_localctx).block = block();
					 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
					}
					}
					setState(63); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << Var) | (1L << Let) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << New) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Integer - 65)) | (1L << (Double - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (RawString - 65)) | (1L << (StringLiteral - 65)))) != 0) );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(69);
					match(T__0);
					setState(70);
					((CodeContext)_localctx).B1 = block();
					setState(71);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(73);
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
				setState(78);
				match(T__0);
				setState(79);
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
			setState(86); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(83);
					((BlockContext)_localctx).stmt = stmt();
					 _localctx.v.expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(88); 
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
			setState(107);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				importStmt();
				 ((StmtContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case Enter:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case Var:
			case Let:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__0:
			case T__6:
			case T__14:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__28:
			case T__29:
			case T__30:
			case For:
			case If:
			case Switch:
			case Clone:
			case Sync:
			case New:
			case Static:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				((StmtContext)_localctx).expr = expr();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
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
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			{
			setState(110);
			match(Identifier);
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(T__5);
					setState(112);
					match(Identifier);
					}
					} 
				}
				setState(117);
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
			setState(118);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(119);
			((EnterStmtContext)_localctx).Body = code();
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(120);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(121);
				match(T__6);
				setState(122);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(123);
				match(T__7);
				setState(124);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(127);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(128);
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
			setState(133);
			((SyncStmtContext)_localctx).Sync = match(Sync);
			setState(134);
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
			setState(137);
			((DeclareStmtContext)_localctx).Action = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Let) ) {
				((DeclareStmtContext)_localctx).Action = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}

			            ((DeclareStmtContext)_localctx).act =  (((DeclareStmtContext)_localctx).Action!=null?((DeclareStmtContext)_localctx).Action.getText():null).equals("var") ? PSet.VAR : PSet.LET;
			        
			setState(139);
			((DeclareStmtContext)_localctx).Head = unaryExpr();
			setState(140);
			match(T__8);
			setState(141);
			((DeclareStmtContext)_localctx).HeadValue = expr();

			            _localctx.multi.add(identifySetter(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Head.v, ((DeclareStmtContext)_localctx).HeadValue.v, _localctx.act));
			        
			setState(151);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(143);
					match(T__9);
					setState(144);
					((DeclareStmtContext)_localctx).Tail = unaryExpr();
					setState(145);
					match(T__8);
					setState(146);
					((DeclareStmtContext)_localctx).TailValue = expr();

					            _localctx.multi.add(identifySetter(new Atom(((DeclareStmtContext)_localctx).Action), ((DeclareStmtContext)_localctx).Tail.v, ((DeclareStmtContext)_localctx).TailValue.v, _localctx.act));
					        
					}
					} 
				}
				setState(153);
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
			setState(157);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(156);
				((ParametersListContext)_localctx).LastStyle = match(T__10);
				}
			}

			setState(159);
			((ParametersListContext)_localctx).LastArg = match(Identifier);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(160);
				match(T__9);
				setState(162);
				_la = _input.LA(1);
				if (_la==T__10) {
					{
					setState(161);
					((ParametersListContext)_localctx).InitStyle = match(T__10);
					}
				}

				setState(164);
				((ParametersListContext)_localctx).InitArg = match(Identifier);
				 
				            _localctx.v.add((((ParametersListContext)_localctx).InitArg!=null?((ParametersListContext)_localctx).InitArg.getText():null)); 
				            _localctx.passByValue.add(((ParametersListContext)_localctx).InitStyle == null);
				        
				}
				}
				setState(170);
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
			setState(173);
			((ArgumentsListContext)_localctx).HeadExpr = expr();
			 _localctx.v.add(((ArgumentsListContext)_localctx).HeadExpr.v); 
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(175);
				match(T__9);
				setState(176);
				((ArgumentsListContext)_localctx).TailExpr = expr();
				 _localctx.v.add(((ArgumentsListContext)_localctx).TailExpr.v); 
				}
				}
				setState(183);
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
			setState(184);
			((InteropArgumentDeclarationContext)_localctx).InitExpr = expr();
			setState(187);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(185);
				match(T__11);
				setState(186);
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
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(T__6);
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(192);
						((InteropArgumentsListContext)_localctx).InitExpr = interopArgumentDeclaration();
						setState(193);
						match(T__9);
						 _localctx.args.add(((InteropArgumentsListContext)_localctx).InitExpr.v); _localctx.defs.add(((InteropArgumentsListContext)_localctx).InitExpr.c); 
						}
						} 
					}
					setState(200);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(201);
				((InteropArgumentsListContext)_localctx).LastExpr = interopArgumentDeclaration();
				setState(202);
				match(T__7);

				            _localctx.args.add(((InteropArgumentsListContext)_localctx).LastExpr.v);
				            _localctx.defs.add(((InteropArgumentsListContext)_localctx).LastExpr.c);
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(T__6);
				setState(206);
				match(T__7);
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
		enterRule(_localctx, 24, RULE_defineStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Def);
			setState(214);
			switch (_input.LA(1)) {
			case Struct:
				{
				setState(210);
				((DefineStmtContext)_localctx).Struct = match(Struct);
				}
				break;
			case Operator:
				{
				setState(211);
				((DefineStmtContext)_localctx).Operator = match(Operator);
				}
				break;
			case T__12:
				{
				setState(212);
				((DefineStmtContext)_localctx).Get = match(T__12);
				}
				break;
			case T__13:
				{
				setState(213);
				((DefineStmtContext)_localctx).Set = match(T__13);
				}
				break;
			case T__14:
			case Identifier:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14) {
				{
				{
				setState(216);
				match(T__14);
				setState(217);
				((DefineStmtContext)_localctx).Decorator = expr();
				setState(223);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(218);
					match(T__6);
					setState(220);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Sync) | (1L << New) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Integer - 65)) | (1L << (Double - 65)) | (1L << (Identifier - 65)) | (1L << (RawString - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
						{
						setState(219);
						((DefineStmtContext)_localctx).argumentsList = argumentsList();
						}
					}

					setState(222);
					match(T__7);
					}
				}

				setState(225);
				match(T__15);
				 
				            _localctx.decorators.add(new PCall(new Atom((((DefineStmtContext)_localctx).Decorator!=null?(((DefineStmtContext)_localctx).Decorator.start):null)), 
				                ((DefineStmtContext)_localctx).Decorator.v, ((DefineStmtContext)_localctx).argumentsList == null ? null : ((DefineStmtContext)_localctx).argumentsList.v));
				        
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(235);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(233);
				((DefineStmtContext)_localctx).FunctionSubject = match(Identifier);
				setState(234);
				match(T__5);
				}
				break;
			}
			setState(237);
			((DefineStmtContext)_localctx).FunctionName = match(Identifier);
			setState(238);
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
		enterRule(_localctx, 26, RULE_lambdaStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((LambdaStmtContext)_localctx).LambdaStart = match(T__6);
			setState(243);
			_la = _input.LA(1);
			if (_la==T__10 || _la==Identifier) {
				{
				setState(242);
				((LambdaStmtContext)_localctx).Parameters = parametersList();
				}
			}

			setState(245);
			match(T__7);
			setState(247);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(246);
				((LambdaStmtContext)_localctx).Description = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((LambdaStmtContext)_localctx).Description = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(249);
			match(T__16);
			setState(259);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(250);
				match(T__17);
				setState(251);
				((LambdaStmtContext)_localctx).Identifier = match(Identifier);
				setState(256);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(252);
					match(T__6);
					setState(253);
					((LambdaStmtContext)_localctx).InitValue = expr();
					setState(254);
					match(T__7);
					}
					break;
				}

				            ((LambdaStmtContext)_localctx).ret =  new PVariable((((LambdaStmtContext)_localctx).Identifier!=null?((LambdaStmtContext)_localctx).Identifier.getText():null));
				            _localctx.body.add(new PSet(new Atom(((LambdaStmtContext)_localctx).Identifier), _localctx.ret, 
				                (((LambdaStmtContext)_localctx).InitValue!=null?(((LambdaStmtContext)_localctx).InitValue.start):null) == null ? ExecEnvironment.Null : ((LambdaStmtContext)_localctx).InitValue.v, PSet.VAR)); 
				        
				}
				break;
			}
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(261);
				match(T__0);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << Var) | (1L << Let) | (1L << Def) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Enter) | (1L << Clone) | (1L << Sync) | (1L << New) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Integer - 65)) | (1L << (Double - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (RawString - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
					{
					{
					setState(262);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(271);
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
		enterRule(_localctx, 28, RULE_switchStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((SwitchStmtContext)_localctx).Switch = match(Switch);
			setState(279);
			((SwitchStmtContext)_localctx).Condition = expr();
			setState(280);
			match(Do);
			setState(281);
			match(T__0);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Sync) | (1L << New) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Integer - 65)) | (1L << (Double - 65)) | (1L << (Identifier - 65)) | (1L << (RawString - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				{
				setState(282);
				((SwitchStmtContext)_localctx).Tester = expr();
				setState(283);
				match(T__16);
				setState(284);
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
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
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
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				match(T__0);
				setState(296);
				((DictContext)_localctx).pair = pair();
				 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
				setState(304);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(298);
						match(T__9);
						setState(299);
						((DictContext)_localctx).pair = pair();
						 _localctx.v.keys.add(((DictContext)_localctx).pair.k); _localctx.v.values.add(((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(306);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				setState(308);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(307);
					match(T__9);
					}
				}

				setState(310);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				match(T__0);
				setState(313);
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
			setState(326);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(317);
				match(T__11);
				setState(318);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(321);
				((PairContext)_localctx).Key = match(Identifier);
				setState(322);
				match(T__11);
				setState(323);
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
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(328);
				match(T__14);
				{
				setState(329);
				((ListContext)_localctx).value = value();
				 _localctx.v.values.add(((ListContext)_localctx).value.v); 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(332);
						match(T__9);
						setState(333);
						((ListContext)_localctx).value = value();
						 _localctx.v.values.add(((ListContext)_localctx).value.v); 
						}
						} 
					}
					setState(340);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				setState(342);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(341);
					match(T__9);
					}
				}

				setState(344);
				match(T__15);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				match(T__14);
				setState(347);
				match(T__15);
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
			setState(359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(350);
				((ValueContext)_localctx).expr = expr();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(353);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(356);
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
		try {
			setState(387);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				match(T__6);
				setState(362);
				((TopExprContext)_localctx).Inner = stmt();
				setState(363);
				match(T__7);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				match(T__18);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.True; 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(371);
				match(T__19);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.False; 
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(373);
				match(T__20);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Null; 
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(375);
				match(T__21);
				 ((TopExprContext)_localctx).v =  ExecEnvironment.Break; 
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(377);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new PVariable(new Atom(((TopExprContext)_localctx).Identifier), (((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(379);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(381);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SConcatString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(383);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SNumber((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(385);
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
		public Token Method;
		public InteropArgumentsListContext Ial;
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
			setState(390);
			((PostfixExprContext)_localctx).Top = topExpr();
			 ((PostfixExprContext)_localctx).v =  ((PostfixExprContext)_localctx).Top.v; 
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
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(393);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(394);
						((PostfixExprContext)_localctx).Op = match(T__22);

						                      ((PostfixExprContext)_localctx).v =  new PAssign(new Atom(((PostfixExprContext)_localctx).Op), ((PostfixExprContext)_localctx).Left.v, new SNumber(1), "+=");
						                  
						}
						break;
					case 2:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(396);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(397);
						((PostfixExprContext)_localctx).Op = match(T__23);

						                      ((PostfixExprContext)_localctx).v =  new PAssign(new Atom(((PostfixExprContext)_localctx).Op), ((PostfixExprContext)_localctx).Left.v, new SNumber(1), "-=");
						                  
						}
						break;
					case 3:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(399);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(400);
						match(T__14);
						setState(401);
						((PostfixExprContext)_localctx).Key = assignExpr(0);
						setState(402);
						match(T__15);

						                      ((PostfixExprContext)_localctx).v =  new PGet(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, ((PostfixExprContext)_localctx).Key.v);
						                  
						}
						break;
					case 4:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(405);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(406);
						match(T__14);
						setState(407);
						((PostfixExprContext)_localctx).Start = assignExpr(0);
						setState(408);
						_la = _input.LA(1);
						if ( !(_la==T__24 || _la==T__25) ) {
						_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(410);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Integer - 65)) | (1L << (Double - 65)) | (1L << (Identifier - 65)) | (1L << (RawString - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
							setState(409);
							((PostfixExprContext)_localctx).End = assignExpr(0);
							}
						}

						setState(412);
						match(T__15);

						                      ((PostfixExprContext)_localctx).v =  new PSub(new Atom((((PostfixExprContext)_localctx).Subject!=null?(((PostfixExprContext)_localctx).Subject.start):null)), ((PostfixExprContext)_localctx).Subject.v, ((PostfixExprContext)_localctx).Start.v, ((PostfixExprContext)_localctx).End == null ? null : ((PostfixExprContext)_localctx).End.v);
						                  
						}
						break;
					case 5:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(415);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(416);
						match(T__5);
						setState(417);
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
						setState(419);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(420);
						((PostfixExprContext)_localctx).Op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((PostfixExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(421);
						((PostfixExprContext)_localctx).Method = match(Identifier);
						setState(422);
						((PostfixExprContext)_localctx).Ial = interopArgumentsList();

						                      ((PostfixExprContext)_localctx).v =  new PInteropCall(new Atom((((PostfixExprContext)_localctx).Called!=null?(((PostfixExprContext)_localctx).Called.start):null)), ((PostfixExprContext)_localctx).Called.v, (((PostfixExprContext)_localctx).Method!=null?((PostfixExprContext)_localctx).Method.getText():null), ((PostfixExprContext)_localctx).Ial.defs, ((PostfixExprContext)_localctx).Ial.args, 
						                          (((PostfixExprContext)_localctx).Op!=null?((PostfixExprContext)_localctx).Op.getText():null).equals("::") ? 
						                              PInteropCall.RETURN_TYPE.CAST_TO_SVALUE :
						                              PInteropCall.RETURN_TYPE.DIRECT_RETURN);
						                  
						}
						break;
					case 7:
						{
						_localctx = new PostfixExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpr);
						setState(425);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(426);
						match(T__6);
						setState(428);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << For) | (1L << If) | (1L << Switch) | (1L << Clone) | (1L << Sync) | (1L << New) | (1L << Static))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Integer - 65)) | (1L << (Double - 65)) | (1L << (Identifier - 65)) | (1L << (RawString - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
							{
							setState(427);
							((PostfixExprContext)_localctx).argumentsList = argumentsList();
							}
						}

						setState(430);
						match(T__7);

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
		enterRule(_localctx, 42, RULE_unaryExpr);
		try {
			setState(452);
			switch (_input.LA(1)) {
			case T__6:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(437);
				((UnaryExprContext)_localctx).Top = postfixExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				((UnaryExprContext)_localctx).Sub = match(T__28);
				setState(441);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            if (((UnaryExprContext)_localctx).Right.v instanceof SNumber) {
				                ((UnaryExprContext)_localctx).v =  new SNumber(-((SNumber) ((UnaryExprContext)_localctx).Right.v).doubleValue());
				            } else {
				                ((UnaryExprContext)_localctx).v =  new SEReverse(new Atom(((UnaryExprContext)_localctx).Sub), ListEx.build(((UnaryExprContext)_localctx).Right.v));
				            }
				        
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 3);
				{
				setState(444);
				((UnaryExprContext)_localctx).Not = match(T__29);
				setState(445);
				((UnaryExprContext)_localctx).Right = postfixExpr(0);

				            ((UnaryExprContext)_localctx).v =  new PNot(new Atom(((UnaryExprContext)_localctx).Not), ((UnaryExprContext)_localctx).Right.v);
				        
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				((UnaryExprContext)_localctx).BitNot = match(T__30);
				setState(449);
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
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_multiplyExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(455);
			((MultiplyExprContext)_localctx).Top = unaryExpr();
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(475);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(473);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplyExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_multiplyExpr);
						setState(458);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(459);
						((MultiplyExprContext)_localctx).Op = match(T__31);
						setState(460);
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
						setState(463);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(464);
						((MultiplyExprContext)_localctx).Op = match(T__32);
						setState(465);
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
						setState(468);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(469);
						((MultiplyExprContext)_localctx).Op = match(T__33);
						setState(470);
						((MultiplyExprContext)_localctx).Right = unaryExpr();

						                      ((MultiplyExprContext)_localctx).v =  new PModular(new Atom(((MultiplyExprContext)_localctx).Op), ((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(477);
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
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_addExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(479);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(482);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(483);
						((AddExprContext)_localctx).AddOp = match(T__34);
						setState(484);
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
						setState(487);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(488);
						((AddExprContext)_localctx).AddOp = match(T__35);
						setState(489);
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
						setState(492);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(493);
						((AddExprContext)_localctx).Sub = match(T__28);
						setState(494);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new PSubtract(new Atom(((AddExprContext)_localctx).Sub), ((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(501);
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
			setState(503);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(513);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
					setState(506);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(507);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(508);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  PIntrinsicCompare.get(new Atom(((CompareExprContext)_localctx).Op), ((CompareExprContext)_localctx).Left.v, (((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null), ((CompareExprContext)_localctx).Right.v);
					                  
					}
					} 
				}
				setState(515);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(517);
			((BitExprContext)_localctx).Top = compareExpr(0);
			 ((BitExprContext)_localctx).v =  ((BitExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(537);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(535);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(520);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(521);
						((BitExprContext)_localctx).Op = match(T__42);
						setState(522);
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
						setState(525);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(526);
						((BitExprContext)_localctx).Op = match(T__10);
						setState(527);
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
						setState(530);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(531);
						((BitExprContext)_localctx).Op = match(T__43);
						setState(532);
						((BitExprContext)_localctx).Right = compareExpr(0);

						                      ((BitExprContext)_localctx).v =  new PBitXor(new Atom(((BitExprContext)_localctx).Op), ((BitExprContext)_localctx).Left.v, ((BitExprContext)_localctx).Right.v);
						                  
						}
						break;
					}
					} 
				}
				setState(539);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(541);
			((LogicExprContext)_localctx).Top = bitExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(551);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
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
					setState(544);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(545);
					((LogicExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__44 || _la==T__45) ) {
						((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(546);
					((LogicExprContext)_localctx).Right = bitExpr(0);

					                      ((LogicExprContext)_localctx).v =  new PLogic(new Atom(((LogicExprContext)_localctx).Op), ((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v, (((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null).equals("||") ? PLogic.OR : PLogic.AND);
					                  
					}
					} 
				}
				setState(553);
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
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_assignExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(555);
				((AssignExprContext)_localctx).Top = logicExpr(0);
				 ((AssignExprContext)_localctx).v =  ((AssignExprContext)_localctx).Top.v; 
				}
				break;
			case 2:
				{
				setState(558);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(559);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(560);
				((AssignExprContext)_localctx).Right = assignExpr(4);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), new PVariable((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			case 3:
				{
				setState(563);
				((AssignExprContext)_localctx).Subject1 = postfixExpr(0);
				setState(564);
				match(T__5);
				setState(565);
				((AssignExprContext)_localctx).Identifier = match(Identifier);
				setState(566);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(567);
				((AssignExprContext)_localctx).Right = assignExpr(3);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Subject1.v, new SString((((AssignExprContext)_localctx).Identifier!=null?((AssignExprContext)_localctx).Identifier.getText():null)), ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			case 4:
				{
				setState(570);
				((AssignExprContext)_localctx).Subject2 = postfixExpr(0);
				setState(571);
				match(T__14);
				setState(572);
				((AssignExprContext)_localctx).Key = assignExpr(0);
				setState(573);
				match(T__15);
				setState(574);
				((AssignExprContext)_localctx).Op = match(AssignOp);
				setState(575);
				((AssignExprContext)_localctx).Right = assignExpr(2);

				            ((AssignExprContext)_localctx).v =  new PAssign(new Atom(((AssignExprContext)_localctx).Op), ((AssignExprContext)_localctx).Subject2.v, ((AssignExprContext)_localctx).Key.v, ((AssignExprContext)_localctx).Right.v, (((AssignExprContext)_localctx).Op!=null?((AssignExprContext)_localctx).Op.getText():null));
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
					setState(580);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(581);
					match(T__8);
					setState(582);
					((AssignExprContext)_localctx).Value = expr();

					                      ((AssignExprContext)_localctx).v =  identifySetter(new Atom((((AssignExprContext)_localctx).Subject3!=null?(((AssignExprContext)_localctx).Subject3.start):null)), ((AssignExprContext)_localctx).Subject3.v, ((AssignExprContext)_localctx).Value.v, PSet.SET);
					                  
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
		public Token New;
		public Token JavaFullName;
		public InteropArgumentsListContext interopArgumentsList;
		public Token Static;
		public Token Clone;
		public ExprContext Subject;
		public Token Sync;
		public CodeContext SyncBody;
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode New() { return getToken(EugineParser.New, 0); }
		public TerminalNode JavaFullName() { return getToken(EugineParser.JavaFullName, 0); }
		public InteropArgumentsListContext interopArgumentsList() {
			return getRuleContext(InteropArgumentsListContext.class,0);
		}
		public TerminalNode Static() { return getToken(EugineParser.Static, 0); }
		public TerminalNode Clone() { return getToken(EugineParser.Clone, 0); }
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
		enterRule(_localctx, 56, RULE_expr);
		int _la;
		try {
			setState(649);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(590);
				((ExprContext)_localctx).assignExpr = assignExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).assignExpr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				match(T__17);
				setState(594);
				((ExprContext)_localctx).MetaExpression = expr();

				            ((ExprContext)_localctx).v =  new PMeta(new Atom((((ExprContext)_localctx).MetaExpression!=null?(((ExprContext)_localctx).MetaExpression.start):null)), ((ExprContext)_localctx).MetaExpression.v);
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(597);
				((ExprContext)_localctx).New = match(New);
				setState(598);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				setState(599);
				((ExprContext)_localctx).interopArgumentsList = interopArgumentsList();

				            String classname = (((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("/", ".");
				            ((ExprContext)_localctx).v =  new PInteropNew(new Atom(((ExprContext)_localctx).New), getClassByName(classname, ((ExprContext)_localctx).New),
				                ((ExprContext)_localctx).interopArgumentsList.defs, ((ExprContext)_localctx).interopArgumentsList.args);
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(602);
				((ExprContext)_localctx).Static = match(Static);
				setState(603);
				((ExprContext)_localctx).JavaFullName = match(JavaFullName);
				 
				            ((ExprContext)_localctx).v =  getClassByName((((ExprContext)_localctx).JavaFullName!=null?((ExprContext)_localctx).JavaFullName.getText():null).replace("/", "."), ((ExprContext)_localctx).Static); 
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(605);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(606);
				((ExprContext)_localctx).Subject = expr();
				 
				            ((ExprContext)_localctx).v =  new PClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v); 
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(609);
				((ExprContext)_localctx).Sync = match(Sync);
				setState(610);
				((ExprContext)_localctx).SyncBody = code();
				 
				            ((ExprContext)_localctx).v =  new PSync(new Atom(((ExprContext)_localctx).Sync), ((ExprContext)_localctx).SyncBody.v); 
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(613);
				((ExprContext)_localctx).For = match(For);
				setState(614);
				((ExprContext)_localctx).Subject = expr();
				setState(615);
				match(Do);
				setState(616);
				((ExprContext)_localctx).Body = expr();

				            ((ExprContext)_localctx).v =  new PFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v); 
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(619);
				((ExprContext)_localctx).For = match(For);
				setState(620);
				((ExprContext)_localctx).Start = expr();
				setState(623);
				_la = _input.LA(1);
				if (_la==T__9) {
					{
					setState(621);
					match(T__9);
					setState(622);
					((ExprContext)_localctx).Next = expr();
					}
				}

				setState(625);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(626);
				((ExprContext)_localctx).End = expr();
				setState(627);
				match(Do);
				setState(628);
				((ExprContext)_localctx).Body = expr();

				            Atom atom = new Atom(((ExprContext)_localctx).For);
				            PIRange r = new PIRange(atom, ListEx.build(
				                    ((ExprContext)_localctx).Start.v, 
				                    ((ExprContext)_localctx).Next == null ? new SNumber(1) : new PSubtract(atom, ((ExprContext)_localctx).Next.v, ((ExprContext)_localctx).Start.v), 
				                    ((ExprContext)_localctx).End.v
				                ));

				            ((ExprContext)_localctx).v =  new PFor(atom, r, ((ExprContext)_localctx).Body.v); 
				        
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(631);
				((ExprContext)_localctx).If = match(If);
				setState(632);
				((ExprContext)_localctx).Condition = expr();
				setState(633);
				((ExprContext)_localctx).True = code();
				setState(636);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(634);
					match(Else);
					setState(635);
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
				setState(640);
				((ExprContext)_localctx).switchStmt = switchStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).switchStmt.v; 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(643);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(646);
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
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 26:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		case 27:
			return assignExpr_sempred((AssignExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean postfixExpr_sempred(PostfixExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 2);
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compareExpr_sempred(CompareExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 3);
		case 15:
			return precpred(_ctx, 2);
		case 16:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignExpr_sempred(AssignExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 18:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3N\u028e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3T\n\3\3\4\3\4\3\4\6\4Y\n\4\r\4\16\4Z\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3"+
		"\6\7\6t\n\6\f\6\16\6w\13\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0080\n\7\3"+
		"\7\3\7\5\7\u0084\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\7\t\u0098\n\t\f\t\16\t\u009b\13\t\3\t\3\t\3\n\5"+
		"\n\u00a0\n\n\3\n\3\n\3\n\5\n\u00a5\n\n\3\n\3\n\7\n\u00a9\n\n\f\n\16\n"+
		"\u00ac\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00b6\n\13\f\13"+
		"\16\13\u00b9\13\13\3\f\3\f\3\f\5\f\u00be\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\7\r\u00c7\n\r\f\r\16\r\u00ca\13\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d2"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\5\16\u00d9\n\16\3\16\3\16\3\16\3\16\5\16"+
		"\u00df\n\16\3\16\5\16\u00e2\n\16\3\16\3\16\3\16\7\16\u00e7\n\16\f\16\16"+
		"\16\u00ea\13\16\3\16\3\16\5\16\u00ee\n\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\5\17\u00f6\n\17\3\17\3\17\5\17\u00fa\n\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0103\n\17\3\17\5\17\u0106\n\17\3\17\3\17\3\17\3\17\7\17"+
		"\u010c\n\17\f\17\16\17\u010f\13\17\3\17\3\17\3\17\3\17\5\17\u0115\n\17"+
		"\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u0122\n\20"+
		"\f\20\16\20\u0125\13\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\7\21\u0131\n\21\f\21\16\21\u0134\13\21\3\21\5\21\u0137\n\21\3\21\3"+
		"\21\3\21\3\21\5\21\u013d\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0149\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23"+
		"\u0153\n\23\f\23\16\23\u0156\13\23\3\23\5\23\u0159\n\23\3\23\3\23\3\23"+
		"\3\23\5\23\u015f\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u016a\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u0186\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u019d\n\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u01af\n\26\3\26\3\26\7\26\u01b3\n\26\f\26\16\26\u01b6\13\26"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u01c7\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u01dc\n\30\f\30\16"+
		"\30\u01df\13\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u01f4\n\31\f\31\16\31\u01f7"+
		"\13\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u0202\n\32\f"+
		"\32\16\32\u0205\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\7\33\u021a\n\33\f\33\16"+
		"\33\u021d\13\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u0228"+
		"\n\34\f\34\16\34\u022b\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\5\35\u0245\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u024c\n\35\f\35"+
		"\16\35\u024f\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0272\n\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u027f\n\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u028c\n\36\3\36\2\t"+
		"*.\60\62\64\668\37\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:\2\n\3\2\5\7\3\2\61\62\3\2HI\3\2MN\3\2\33\34\3\2\35\36\3\2"+
		"\',\3\2/\60\u02cf\2E\3\2\2\2\4S\3\2\2\2\6X\3\2\2\2\bm\3\2\2\2\no\3\2\2"+
		"\2\fx\3\2\2\2\16\u0087\3\2\2\2\20\u008b\3\2\2\2\22\u009f\3\2\2\2\24\u00af"+
		"\3\2\2\2\26\u00ba\3\2\2\2\30\u00d1\3\2\2\2\32\u00d3\3\2\2\2\34\u00f3\3"+
		"\2\2\2\36\u0118\3\2\2\2 \u013c\3\2\2\2\"\u0148\3\2\2\2$\u015e\3\2\2\2"+
		"&\u0169\3\2\2\2(\u0185\3\2\2\2*\u0187\3\2\2\2,\u01c6\3\2\2\2.\u01c8\3"+
		"\2\2\2\60\u01e0\3\2\2\2\62\u01f8\3\2\2\2\64\u0206\3\2\2\2\66\u021e\3\2"+
		"\2\28\u0244\3\2\2\2:\u028b\3\2\2\2<=\5\6\4\2=>\b\2\1\2>@\3\2\2\2?<\3\2"+
		"\2\2@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2BF\3\2\2\2CD\7\2\2\3DF\b\2\1\2E?\3\2"+
		"\2\2EC\3\2\2\2F\3\3\2\2\2GH\7\3\2\2HI\5\6\4\2IJ\7\4\2\2JM\3\2\2\2KM\5"+
		"\b\5\2LG\3\2\2\2LK\3\2\2\2MN\3\2\2\2NO\b\3\1\2OT\3\2\2\2PQ\7\3\2\2QR\7"+
		"\4\2\2RT\b\3\1\2SL\3\2\2\2SP\3\2\2\2T\5\3\2\2\2UV\5\b\5\2VW\b\4\1\2WY"+
		"\3\2\2\2XU\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\7\3\2\2\2\\]\5\n\6\2"+
		"]^\b\5\1\2^n\3\2\2\2_`\5\f\7\2`a\b\5\1\2an\3\2\2\2bc\5\20\t\2cd\b\5\1"+
		"\2dn\3\2\2\2ef\5\32\16\2fg\b\5\1\2gn\3\2\2\2hi\5:\36\2ij\b\5\1\2jn\3\2"+
		"\2\2kl\7G\2\2ln\b\5\1\2m\\\3\2\2\2m_\3\2\2\2mb\3\2\2\2me\3\2\2\2mh\3\2"+
		"\2\2mk\3\2\2\2n\t\3\2\2\2op\t\2\2\2pu\7H\2\2qr\7\b\2\2rt\7H\2\2sq\3\2"+
		"\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\13\3\2\2\2wu\3\2\2\2xy\7:\2\2y\177"+
		"\5\4\3\2z{\7;\2\2{|\7\t\2\2|}\7H\2\2}~\7\n\2\2~\u0080\5\4\3\2\177z\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\u0083\3\2\2\2\u0081\u0082\7A\2\2\u0082\u0084"+
		"\5\4\3\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\b\7\1\2\u0086\r\3\2\2\2\u0087\u0088\7=\2\2\u0088\u0089\5\4\3\2"+
		"\u0089\u008a\b\b\1\2\u008a\17\3\2\2\2\u008b\u008c\t\3\2\2\u008c\u008d"+
		"\b\t\1\2\u008d\u008e\5,\27\2\u008e\u008f\7\13\2\2\u008f\u0090\5:\36\2"+
		"\u0090\u0099\b\t\1\2\u0091\u0092\7\f\2\2\u0092\u0093\5,\27\2\u0093\u0094"+
		"\7\13\2\2\u0094\u0095\5:\36\2\u0095\u0096\b\t\1\2\u0096\u0098\3\2\2\2"+
		"\u0097\u0091\3\2\2\2\u0098\u009b\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2\2\2\u009c\u009d\b\t\1\2\u009d"+
		"\21\3\2\2\2\u009e\u00a0\7\r\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2\2"+
		"\2\u00a0\u00a1\3\2\2\2\u00a1\u00aa\7H\2\2\u00a2\u00a4\7\f\2\2\u00a3\u00a5"+
		"\7\r\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\7H\2\2\u00a7\u00a9\b\n\1\2\u00a8\u00a2\3\2\2\2\u00a9\u00ac\3\2"+
		"\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2\2\2\u00ac"+
		"\u00aa\3\2\2\2\u00ad\u00ae\b\n\1\2\u00ae\23\3\2\2\2\u00af\u00b0\5:\36"+
		"\2\u00b0\u00b7\b\13\1\2\u00b1\u00b2\7\f\2\2\u00b2\u00b3\5:\36\2\u00b3"+
		"\u00b4\b\13\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00b1\3\2\2\2\u00b6\u00b9\3"+
		"\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\25\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bd\5:\36\2\u00bb\u00bc\7\16\2\2\u00bc\u00be\t"+
		"\4\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf"+
		"\u00c0\b\f\1\2\u00c0\27\3\2\2\2\u00c1\u00c8\7\t\2\2\u00c2\u00c3\5\26\f"+
		"\2\u00c3\u00c4\7\f\2\2\u00c4\u00c5\b\r\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c2"+
		"\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9"+
		"\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cc\5\26\f\2\u00cc\u00cd\7"+
		"\n\2\2\u00cd\u00ce\b\r\1\2\u00ce\u00d2\3\2\2\2\u00cf\u00d0\7\t\2\2\u00d0"+
		"\u00d2\7\n\2\2\u00d1\u00c1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\31\3\2\2"+
		"\2\u00d3\u00d8\7\63\2\2\u00d4\u00d9\7\64\2\2\u00d5\u00d9\7\65\2\2\u00d6"+
		"\u00d9\7\17\2\2\u00d7\u00d9\7\20\2\2\u00d8\u00d4\3\2\2\2\u00d8\u00d5\3"+
		"\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00e8\3\2\2\2\u00da\u00db\7\21\2\2\u00db\u00e1\5:\36\2\u00dc\u00de\7"+
		"\t\2\2\u00dd\u00df\5\24\13\2\u00de\u00dd\3\2\2\2\u00de\u00df\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0\u00e2\7\n\2\2\u00e1\u00dc\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\22\2\2\u00e4\u00e5\b\16\1\2\u00e5"+
		"\u00e7\3\2\2\2\u00e6\u00da\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ed\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb"+
		"\u00ec\7H\2\2\u00ec\u00ee\7\b\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\7H\2\2\u00f0\u00f1\5\34\17\2\u00f1"+
		"\u00f2\b\16\1\2\u00f2\33\3\2\2\2\u00f3\u00f5\7\t\2\2\u00f4\u00f6\5\22"+
		"\n\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f9\7\n\2\2\u00f8\u00fa\t\5\2\2\u00f9\u00f8\3\2\2\2\u00f9\u00fa\3\2"+
		"\2\2\u00fa\u00fb\3\2\2\2\u00fb\u0105\7\23\2\2\u00fc\u00fd\7\24\2\2\u00fd"+
		"\u0102\7H\2\2\u00fe\u00ff\7\t\2\2\u00ff\u0100\5:\36\2\u0100\u0101\7\n"+
		"\2\2\u0101\u0103\3\2\2\2\u0102\u00fe\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u0104\3\2\2\2\u0104\u0106\b\17\1\2\u0105\u00fc\3\2\2\2\u0105\u0106\3"+
		"\2\2\2\u0106\u0114\3\2\2\2\u0107\u010d\7\3\2\2\u0108\u0109\5\b\5\2\u0109"+
		"\u010a\b\17\1\2\u010a\u010c\3\2\2\2\u010b\u0108\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0115\7\4\2\2\u0111\u0112\5\b\5\2\u0112\u0113\b\17"+
		"\1\2\u0113\u0115\3\2\2\2\u0114\u0107\3\2\2\2\u0114\u0111\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0117\b\17\1\2\u0117\35\3\2\2\2\u0118\u0119\78\2"+
		"\2\u0119\u011a\5:\36\2\u011a\u011b\7A\2\2\u011b\u0123\7\3\2\2\u011c\u011d"+
		"\5:\36\2\u011d\u011e\7\23\2\2\u011e\u011f\5\4\3\2\u011f\u0120\b\20\1\2"+
		"\u0120\u0122\3\2\2\2\u0121\u011c\3\2\2\2\u0122\u0125\3\2\2\2\u0123\u0121"+
		"\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0123\3\2\2\2\u0126"+
		"\u0127\7\4\2\2\u0127\u0128\b\20\1\2\u0128\37\3\2\2\2\u0129\u012a\7\3\2"+
		"\2\u012a\u012b\5\"\22\2\u012b\u0132\b\21\1\2\u012c\u012d\7\f\2\2\u012d"+
		"\u012e\5\"\22\2\u012e\u012f\b\21\1\2\u012f\u0131\3\2\2\2\u0130\u012c\3"+
		"\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0137\7\f\2\2\u0136\u0135\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139\7\4\2\2\u0139"+
		"\u013d\3\2\2\2\u013a\u013b\7\3\2\2\u013b\u013d\7\4\2\2\u013c\u0129\3\2"+
		"\2\2\u013c\u013a\3\2\2\2\u013d!\3\2\2\2\u013e\u013f\t\5\2\2\u013f\u0140"+
		"\7\16\2\2\u0140\u0141\5&\24\2\u0141\u0142\b\22\1\2\u0142\u0149\3\2\2\2"+
		"\u0143\u0144\7H\2\2\u0144\u0145\7\16\2\2\u0145\u0146\5&\24\2\u0146\u0147"+
		"\b\22\1\2\u0147\u0149\3\2\2\2\u0148\u013e\3\2\2\2\u0148\u0143\3\2\2\2"+
		"\u0149#\3\2\2\2\u014a\u014b\7\21\2\2\u014b\u014c\5&\24\2\u014c\u014d\b"+
		"\23\1\2\u014d\u0154\3\2\2\2\u014e\u014f\7\f\2\2\u014f\u0150\5&\24\2\u0150"+
		"\u0151\b\23\1\2\u0151\u0153\3\2\2\2\u0152\u014e\3\2\2\2\u0153\u0156\3"+
		"\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0158\3\2\2\2\u0156"+
		"\u0154\3\2\2\2\u0157\u0159\7\f\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\7\22\2\2\u015b\u015f\3\2\2\2\u015c"+
		"\u015d\7\21\2\2\u015d\u015f\7\22\2\2\u015e\u014a\3\2\2\2\u015e\u015c\3"+
		"\2\2\2\u015f%\3\2\2\2\u0160\u0161\5:\36\2\u0161\u0162\b\24\1\2\u0162\u016a"+
		"\3\2\2\2\u0163\u0164\5 \21\2\u0164\u0165\b\24\1\2\u0165\u016a\3\2\2\2"+
		"\u0166\u0167\5$\23\2\u0167\u0168\b\24\1\2\u0168\u016a\3\2\2\2\u0169\u0160"+
		"\3\2\2\2\u0169\u0163\3\2\2\2\u0169\u0166\3\2\2\2\u016a\'\3\2\2\2\u016b"+
		"\u016c\7\t\2\2\u016c\u016d\5\b\5\2\u016d\u016e\7\n\2\2\u016e\u016f\b\25"+
		"\1\2\u016f\u0186\3\2\2\2\u0170\u0171\5\34\17\2\u0171\u0172\b\25\1\2\u0172"+
		"\u0186\3\2\2\2\u0173\u0174\7\25\2\2\u0174\u0186\b\25\1\2\u0175\u0176\7"+
		"\26\2\2\u0176\u0186\b\25\1\2\u0177\u0178\7\27\2\2\u0178\u0186\b\25\1\2"+
		"\u0179\u017a\7\30\2\2\u017a\u0186\b\25\1\2\u017b\u017c\7H\2\2\u017c\u0186"+
		"\b\25\1\2\u017d\u017e\7M\2\2\u017e\u0186\b\25\1\2\u017f\u0180\7N\2\2\u0180"+
		"\u0186\b\25\1\2\u0181\u0182\7C\2\2\u0182\u0186\b\25\1\2\u0183\u0184\7"+
		"D\2\2\u0184\u0186\b\25\1\2\u0185\u016b\3\2\2\2\u0185\u0170\3\2\2\2\u0185"+
		"\u0173\3\2\2\2\u0185\u0175\3\2\2\2\u0185\u0177\3\2\2\2\u0185\u0179\3\2"+
		"\2\2\u0185\u017b\3\2\2\2\u0185\u017d\3\2\2\2\u0185\u017f\3\2\2\2\u0185"+
		"\u0181\3\2\2\2\u0185\u0183\3\2\2\2\u0186)\3\2\2\2\u0187\u0188\b\26\1\2"+
		"\u0188\u0189\5(\25\2\u0189\u018a\b\26\1\2\u018a\u01b4\3\2\2\2\u018b\u018c"+
		"\f\t\2\2\u018c\u018d\7\31\2\2\u018d\u01b3\b\26\1\2\u018e\u018f\f\b\2\2"+
		"\u018f\u0190\7\32\2\2\u0190\u01b3\b\26\1\2\u0191\u0192\f\7\2\2\u0192\u0193"+
		"\7\21\2\2\u0193\u0194\58\35\2\u0194\u0195\7\22\2\2\u0195\u0196\b\26\1"+
		"\2\u0196\u01b3\3\2\2\2\u0197\u0198\f\6\2\2\u0198\u0199\7\21\2\2\u0199"+
		"\u019a\58\35\2\u019a\u019c\t\6\2\2\u019b\u019d\58\35\2\u019c\u019b\3\2"+
		"\2\2\u019c\u019d\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\7\22\2\2\u019f"+
		"\u01a0\b\26\1\2\u01a0\u01b3\3\2\2\2\u01a1\u01a2\f\5\2\2\u01a2\u01a3\7"+
		"\b\2\2\u01a3\u01a4\7H\2\2\u01a4\u01b3\b\26\1\2\u01a5\u01a6\f\4\2\2\u01a6"+
		"\u01a7\t\7\2\2\u01a7\u01a8\7H\2\2\u01a8\u01a9\5\30\r\2\u01a9\u01aa\b\26"+
		"\1\2\u01aa\u01b3\3\2\2\2\u01ab\u01ac\f\3\2\2\u01ac\u01ae\7\t\2\2\u01ad"+
		"\u01af\5\24\13\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3"+
		"\2\2\2\u01b0\u01b1\7\n\2\2\u01b1\u01b3\b\26\1\2\u01b2\u018b\3\2\2\2\u01b2"+
		"\u018e\3\2\2\2\u01b2\u0191\3\2\2\2\u01b2\u0197\3\2\2\2\u01b2\u01a1\3\2"+
		"\2\2\u01b2\u01a5\3\2\2\2\u01b2\u01ab\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5+\3\2\2\2\u01b6\u01b4\3\2\2\2"+
		"\u01b7\u01b8\5*\26\2\u01b8\u01b9\b\27\1\2\u01b9\u01c7\3\2\2\2\u01ba\u01bb"+
		"\7\37\2\2\u01bb\u01bc\5*\26\2\u01bc\u01bd\b\27\1\2\u01bd\u01c7\3\2\2\2"+
		"\u01be\u01bf\7 \2\2\u01bf\u01c0\5*\26\2\u01c0\u01c1\b\27\1\2\u01c1\u01c7"+
		"\3\2\2\2\u01c2\u01c3\7!\2\2\u01c3\u01c4\5*\26\2\u01c4\u01c5\b\27\1\2\u01c5"+
		"\u01c7\3\2\2\2\u01c6\u01b7\3\2\2\2\u01c6\u01ba\3\2\2\2\u01c6\u01be\3\2"+
		"\2\2\u01c6\u01c2\3\2\2\2\u01c7-\3\2\2\2\u01c8\u01c9\b\30\1\2\u01c9\u01ca"+
		"\5,\27\2\u01ca\u01cb\b\30\1\2\u01cb\u01dd\3\2\2\2\u01cc\u01cd\f\5\2\2"+
		"\u01cd\u01ce\7\"\2\2\u01ce\u01cf\5,\27\2\u01cf\u01d0\b\30\1\2\u01d0\u01dc"+
		"\3\2\2\2\u01d1\u01d2\f\4\2\2\u01d2\u01d3\7#\2\2\u01d3\u01d4\5,\27\2\u01d4"+
		"\u01d5\b\30\1\2\u01d5\u01dc\3\2\2\2\u01d6\u01d7\f\3\2\2\u01d7\u01d8\7"+
		"$\2\2\u01d8\u01d9\5,\27\2\u01d9\u01da\b\30\1\2\u01da\u01dc\3\2\2\2\u01db"+
		"\u01cc\3\2\2\2\u01db\u01d1\3\2\2\2\u01db\u01d6\3\2\2\2\u01dc\u01df\3\2"+
		"\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de/\3\2\2\2\u01df\u01dd"+
		"\3\2\2\2\u01e0\u01e1\b\31\1\2\u01e1\u01e2\5.\30\2\u01e2\u01e3\b\31\1\2"+
		"\u01e3\u01f5\3\2\2\2\u01e4\u01e5\f\5\2\2\u01e5\u01e6\7%\2\2\u01e6\u01e7"+
		"\5.\30\2\u01e7\u01e8\b\31\1\2\u01e8\u01f4\3\2\2\2\u01e9\u01ea\f\4\2\2"+
		"\u01ea\u01eb\7&\2\2\u01eb\u01ec\5.\30\2\u01ec\u01ed\b\31\1\2\u01ed\u01f4"+
		"\3\2\2\2\u01ee\u01ef\f\3\2\2\u01ef\u01f0\7\37\2\2\u01f0\u01f1\5.\30\2"+
		"\u01f1\u01f2\b\31\1\2\u01f2\u01f4\3\2\2\2\u01f3\u01e4\3\2\2\2\u01f3\u01e9"+
		"\3\2\2\2\u01f3\u01ee\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5"+
		"\u01f6\3\2\2\2\u01f6\61\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f8\u01f9\b\32\1"+
		"\2\u01f9\u01fa\5\60\31\2\u01fa\u01fb\b\32\1\2\u01fb\u0203\3\2\2\2\u01fc"+
		"\u01fd\f\3\2\2\u01fd\u01fe\t\b\2\2\u01fe\u01ff\5\60\31\2\u01ff\u0200\b"+
		"\32\1\2\u0200\u0202\3\2\2\2\u0201\u01fc\3\2\2\2\u0202\u0205\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\63\3\2\2\2\u0205\u0203\3\2\2"+
		"\2\u0206\u0207\b\33\1\2\u0207\u0208\5\62\32\2\u0208\u0209\b\33\1\2\u0209"+
		"\u021b\3\2\2\2\u020a\u020b\f\5\2\2\u020b\u020c\7-\2\2\u020c\u020d\5\62"+
		"\32\2\u020d\u020e\b\33\1\2\u020e\u021a\3\2\2\2\u020f\u0210\f\4\2\2\u0210"+
		"\u0211\7\r\2\2\u0211\u0212\5\62\32\2\u0212\u0213\b\33\1\2\u0213\u021a"+
		"\3\2\2\2\u0214\u0215\f\3\2\2\u0215\u0216\7.\2\2\u0216\u0217\5\62\32\2"+
		"\u0217\u0218\b\33\1\2\u0218\u021a\3\2\2\2\u0219\u020a\3\2\2\2\u0219\u020f"+
		"\3\2\2\2\u0219\u0214\3\2\2\2\u021a\u021d\3\2\2\2\u021b\u0219\3\2\2\2\u021b"+
		"\u021c\3\2\2\2\u021c\65\3\2\2\2\u021d\u021b\3\2\2\2\u021e\u021f\b\34\1"+
		"\2\u021f\u0220\5\64\33\2\u0220\u0221\b\34\1\2\u0221\u0229\3\2\2\2\u0222"+
		"\u0223\f\3\2\2\u0223\u0224\t\t\2\2\u0224\u0225\5\64\33\2\u0225\u0226\b"+
		"\34\1\2\u0226\u0228\3\2\2\2\u0227\u0222\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\67\3\2\2\2\u022b\u0229\3\2\2"+
		"\2\u022c\u022d\b\35\1\2\u022d\u022e\5\66\34\2\u022e\u022f\b\35\1\2\u022f"+
		"\u0245\3\2\2\2\u0230\u0231\7H\2\2\u0231\u0232\7B\2\2\u0232\u0233\58\35"+
		"\6\u0233\u0234\b\35\1\2\u0234\u0245\3\2\2\2\u0235\u0236\5*\26\2\u0236"+
		"\u0237\7\b\2\2\u0237\u0238\7H\2\2\u0238\u0239\7B\2\2\u0239\u023a\58\35"+
		"\5\u023a\u023b\b\35\1\2\u023b\u0245\3\2\2\2\u023c\u023d\5*\26\2\u023d"+
		"\u023e\7\21\2\2\u023e\u023f\58\35\2\u023f\u0240\7\22\2\2\u0240\u0241\7"+
		"B\2\2\u0241\u0242\58\35\4\u0242\u0243\b\35\1\2\u0243\u0245\3\2\2\2\u0244"+
		"\u022c\3\2\2\2\u0244\u0230\3\2\2\2\u0244\u0235\3\2\2\2\u0244\u023c\3\2"+
		"\2\2\u0245\u024d\3\2\2\2\u0246\u0247\f\3\2\2\u0247\u0248\7\13\2\2\u0248"+
		"\u0249\5:\36\2\u0249\u024a\b\35\1\2\u024a\u024c\3\2\2\2\u024b\u0246\3"+
		"\2\2\2\u024c\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e"+
		"9\3\2\2\2\u024f\u024d\3\2\2\2\u0250\u0251\58\35\2\u0251\u0252\b\36\1\2"+
		"\u0252\u028c\3\2\2\2\u0253\u0254\7\24\2\2\u0254\u0255\5:\36\2\u0255\u0256"+
		"\b\36\1\2\u0256\u028c\3\2\2\2\u0257\u0258\7?\2\2\u0258\u0259\7I\2\2\u0259"+
		"\u025a\5\30\r\2\u025a\u025b\b\36\1\2\u025b\u028c\3\2\2\2\u025c\u025d\7"+
		"@\2\2\u025d\u025e\7I\2\2\u025e\u028c\b\36\1\2\u025f\u0260\7<\2\2\u0260"+
		"\u0261\5:\36\2\u0261\u0262\b\36\1\2\u0262\u028c\3\2\2\2\u0263\u0264\7"+
		"=\2\2\u0264\u0265\5\4\3\2\u0265\u0266\b\36\1\2\u0266\u028c\3\2\2\2\u0267"+
		"\u0268\7\66\2\2\u0268\u0269\5:\36\2\u0269\u026a\7A\2\2\u026a\u026b\5:"+
		"\36\2\u026b\u026c\b\36\1\2\u026c\u028c\3\2\2\2\u026d\u026e\7\66\2\2\u026e"+
		"\u0271\5:\36\2\u026f\u0270\7\f\2\2\u0270\u0272\5:\36\2\u0271\u026f\3\2"+
		"\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0274\t\6\2\2\u0274"+
		"\u0275\5:\36\2\u0275\u0276\7A\2\2\u0276\u0277\5:\36\2\u0277\u0278\b\36"+
		"\1\2\u0278\u028c\3\2\2\2\u0279\u027a\7\67\2\2\u027a\u027b\5:\36\2\u027b"+
		"\u027e\5\4\3\2\u027c\u027d\79\2\2\u027d\u027f\5\4\3\2\u027e\u027c\3\2"+
		"\2\2\u027e\u027f\3\2\2\2\u027f\u0280\3\2\2\2\u0280\u0281\b\36\1\2\u0281"+
		"\u028c\3\2\2\2\u0282\u0283\5\36\20\2\u0283\u0284\b\36\1\2\u0284\u028c"+
		"\3\2\2\2\u0285\u0286\5$\23\2\u0286\u0287\b\36\1\2\u0287\u028c\3\2\2\2"+
		"\u0288\u0289\5 \21\2\u0289\u028a\b\36\1\2\u028a\u028c\3\2\2\2\u028b\u0250"+
		"\3\2\2\2\u028b\u0253\3\2\2\2\u028b\u0257\3\2\2\2\u028b\u025c\3\2\2\2\u028b"+
		"\u025f\3\2\2\2\u028b\u0263\3\2\2\2\u028b\u0267\3\2\2\2\u028b\u026d\3\2"+
		"\2\2\u028b\u0279\3\2\2\2\u028b\u0282\3\2\2\2\u028b\u0285\3\2\2\2\u028b"+
		"\u0288\3\2\2\2\u028c;\3\2\2\2:AELSZmu\177\u0083\u0099\u009f\u00a4\u00aa"+
		"\u00b7\u00bd\u00c8\u00d1\u00d8\u00de\u00e1\u00e8\u00ed\u00f5\u00f9\u0102"+
		"\u0105\u010d\u0114\u0123\u0132\u0136\u013c\u0148\u0154\u0158\u015e\u0169"+
		"\u0185\u019c\u01ae\u01b2\u01b4\u01c6\u01db\u01dd\u01f3\u01f5\u0203\u0219"+
		"\u021b\u0229\u0244\u024d\u0271\u027e\u028b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}