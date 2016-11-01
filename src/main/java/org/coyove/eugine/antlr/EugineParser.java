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
		T__24=25, T__25=26, Var=27, Def=28, For=29, If=30, Else=31, Enter=32, 
		Catch=33, Clone=34, Do=35, Add=36, Sub=37, Not=38, AryOp=39, Integer=40, 
		Double=41, NEWLINE=42, WS=43, Semi=44, Identifier=45, Letter=46, BlockComment=47, 
		LineComment=48, RawString=49, StringLiteral=50;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_enterStmt = 5, RULE_declareStmt = 6, RULE_definitionsList = 7, RULE_argumentsList = 8, 
		RULE_defineStmt = 9, RULE_lambdaStmt = 10, RULE_callStmt = 11, RULE_dict = 12, 
		RULE_pair = 13, RULE_list = 14, RULE_value = 15, RULE_topExpr = 16, RULE_unaryExpr = 17, 
		RULE_multiplyExpr = 18, RULE_addExpr = 19, RULE_compareExpr = 20, RULE_logicExpr = 21, 
		RULE_expr = 22;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "enterStmt", "declareStmt", 
		"definitionsList", "argumentsList", "defineStmt", "lambdaStmt", "callStmt", 
		"dict", "pair", "list", "value", "topExpr", "unaryExpr", "multiplyExpr", 
		"addExpr", "compareExpr", "logicExpr", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "'=>'", 
		"':'", "'['", "']'", "'*'", "'/'", "'%'", "'+.'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'&&'", "'||'", "'..'", "'...'", "'var'", "'def'", 
		null, "'if'", "'else'", "'enter'", "'catch'", "'clone'", "'do'", "'+'", 
		"'-'", "'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Var", "Def", "For", "If", "Else", "Enter", "Catch", 
		"Clone", "Do", "Add", "Sub", "Not", "AryOp", "Integer", "Double", "NEWLINE", 
		"WS", "Semi", "Identifier", "Letter", "BlockComment", "LineComment", "RawString", 
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				((ProgContext)_localctx).block = block();
				 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0) );
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
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(53);
				match(T__0);
				setState(54);
				((CodeContext)_localctx).B1 = block();
				setState(55);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(57);
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
			setState(65); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(62);
					((BlockContext)_localctx).stmt = stmt();
					 ((SEChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67); 
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
			setState(86);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				importStmt();
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case Enter:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				((StmtContext)_localctx).enterStmt = enterStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).enterStmt.v; 
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				((StmtContext)_localctx).declareStmt = declareStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(78);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__0:
			case T__4:
			case T__10:
			case For:
			case If:
			case Clone:
			case Sub:
			case Not:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				((StmtContext)_localctx).expr = expr(0);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
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
			setState(88);
			match(T__2);
			{
			setState(89);
			match(Identifier);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(T__3);
					setState(91);
					match(Identifier);
					}
					} 
				}
				setState(96);
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
			setState(97);
			((EnterStmtContext)_localctx).Enter = match(Enter);
			setState(98);
			((EnterStmtContext)_localctx).Body = code();
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				((EnterStmtContext)_localctx).Catch = match(Catch);
				setState(100);
				match(T__4);
				setState(101);
				((EnterStmtContext)_localctx).Identifier = match(Identifier);
				setState(102);
				match(T__5);
				setState(103);
				((EnterStmtContext)_localctx).CatchBody = code();
				}
				break;
			}
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(106);
				((EnterStmtContext)_localctx).Do = match(Do);
				setState(107);
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
		public ExprContext expr;
		public TerminalNode Var() { return getToken(EugineParser.Var, 0); }
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
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
		enterRule(_localctx, 12, RULE_declareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Var);
			setState(113);
			((DeclareStmtContext)_localctx).Identifier = match(Identifier);
			setState(114);
			match(T__6);
			setState(115);
			((DeclareStmtContext)_localctx).expr = expr(0);

			            ((DeclareStmtContext)_localctx).v =  new SESet(new SString((((DeclareStmtContext)_localctx).Identifier!=null?((DeclareStmtContext)_localctx).Identifier.getText():null)), ((DeclareStmtContext)_localctx).expr.v, 
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(118);
				match(T__4);
				setState(124);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(119);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(120);
						match(T__7);
						 _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						}
						} 
					}
					setState(126);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(127);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(128);
				match(T__5);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(T__4);
				setState(131);
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
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(T__4);
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(135);
						((ArgumentsListContext)_localctx).InitExpr = expr(0);
						setState(136);
						match(T__7);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(144);
				((ArgumentsListContext)_localctx).LastExpr = expr(0);
				setState(145);
				match(T__5);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__4);
				setState(149);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(Def);
				setState(153);
				((DefineStmtContext)_localctx).Identifier = match(Identifier);
				setState(154);
				((DefineStmtContext)_localctx).definitionsList = definitionsList();
				setState(156);
				_la = _input.LA(1);
				if (_la==RawString || _la==StringLiteral) {
					{
					setState(155);
					((DefineStmtContext)_localctx).Desc = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==RawString || _la==StringLiteral) ) {
						((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(158);
				match(T__6);
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(159);
					match(T__0);
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
						{
						{
						setState(160);
						((DefineStmtContext)_localctx).stmt = stmt();
						 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
						}
						}
						setState(167);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(168);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(169);
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
				setState(176);
				((DefineStmtContext)_localctx).Def = match(Def);
				setState(177);
				((DefineStmtContext)_localctx).Get = expr(0);
				setState(178);
				((DefineStmtContext)_localctx).definitionsList = definitionsList();
				setState(180);
				_la = _input.LA(1);
				if (_la==RawString || _la==StringLiteral) {
					{
					setState(179);
					((DefineStmtContext)_localctx).Desc = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==RawString || _la==StringLiteral) ) {
						((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(182);
				match(T__6);
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(183);
					match(T__0);
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
						{
						{
						setState(184);
						((DefineStmtContext)_localctx).stmt = stmt();
						 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
						}
						}
						setState(191);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(192);
					match(T__1);
					}
					break;
				case 2:
					{
					setState(193);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					break;
				}

				            if (((DefineStmtContext)_localctx).Get.v instanceof SEGet) {
				                ((DefineStmtContext)_localctx).v =  new SESet(((DefineStmtContext)_localctx).Get.v,
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
			setState(202);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(203);
			match(T__8);
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(204);
				match(T__0);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__10) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Enter) | (1L << Clone) | (1L << Sub) | (1L << Not) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(205);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(214);
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
			setState(221);
			((CallStmtContext)_localctx).Identifier = match(Identifier);
			setState(222);
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
		enterRule(_localctx, 24, RULE_dict);
		int _la;
		try {
			int _alt;
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__0);
				setState(226);
				((DictContext)_localctx).pair = pair();
				 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
				setState(234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(228);
						match(T__7);
						setState(229);
						((DictContext)_localctx).pair = pair();
						 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(236);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(238);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(237);
					match(T__7);
					}
				}

				setState(240);
				match(T__1);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(T__0);
				setState(244);
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
		enterRule(_localctx, 26, RULE_pair);
		int _la;
		try {
			setState(258);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(249);
				match(T__9);
				setState(250);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				((PairContext)_localctx).Key = match(Identifier);
				setState(254);
				match(T__9);
				setState(255);
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
		enterRule(_localctx, 28, RULE_list);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(T__10);
				{
				setState(261);
				((ListContext)_localctx).value = value();
				 _localctx.ret.add(((ListContext)_localctx).value.v); 
				}
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(264);
					match(T__7);
					setState(265);
					((ListContext)_localctx).value = value();
					 _localctx.ret.add(((ListContext)_localctx).value.v); 
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(273);
				match(T__11);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(T__10);
				setState(277);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				((ValueContext)_localctx).expr = expr(0);
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_topExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(293);
				match(T__4);
				setState(294);
				((TopExprContext)_localctx).Inner = stmt();
				setState(295);
				match(T__5);
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).Inner.v; 
				}
				break;
			case 2:
				{
				setState(298);
				((TopExprContext)_localctx).callStmt = callStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).callStmt.v; 
				}
				break;
			case 3:
				{
				setState(301);
				((TopExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((TopExprContext)_localctx).v =  ((TopExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 4:
				{
				setState(304);
				((TopExprContext)_localctx).Identifier = match(Identifier);
				 ((TopExprContext)_localctx).v =  new SEVariable((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 5:
				{
				setState(306);
				((TopExprContext)_localctx).RawString = match(RawString);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).RawString!=null?((TopExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 6:
				{
				setState(308);
				((TopExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((TopExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((TopExprContext)_localctx).StringLiteral!=null?((TopExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 7:
				{
				setState(310);
				((TopExprContext)_localctx).Integer = match(Integer);
				 ((TopExprContext)_localctx).v =  new SInteger((((TopExprContext)_localctx).Integer!=null?((TopExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 8:
				{
				setState(312);
				((TopExprContext)_localctx).Double = match(Double);
				 ((TopExprContext)_localctx).v =  new SDouble((((TopExprContext)_localctx).Double!=null?((TopExprContext)_localctx).Double.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(332);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(330);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
					case 1:
						{
						_localctx = new TopExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_topExpr);
						setState(316);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(317);
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
						setState(320);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(321);
						match(T__10);
						setState(322);
						((TopExprContext)_localctx).Key = expr(0);
						setState(323);
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
						setState(326);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(327);
						match(T__3);
						setState(328);
						((TopExprContext)_localctx).Identifier = match(Identifier);

						                      ((TopExprContext)_localctx).v =  new SEGet(new Atom((((TopExprContext)_localctx).Subject!=null?(((TopExprContext)_localctx).Subject.start):null)), ((TopExprContext)_localctx).Subject.v, 
						                          org.coyove.eugine.util.List.build(new SString((((TopExprContext)_localctx).Identifier!=null?((TopExprContext)_localctx).Identifier.getText():null))));
						                  
						}
						break;
					}
					} 
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public TopExprContext Top;
		public Token Sub;
		public TopExprContext Right;
		public Token Not;
		public TopExprContext topExpr() {
			return getRuleContext(TopExprContext.class,0);
		}
		public TerminalNode Sub() { return getToken(EugineParser.Sub, 0); }
		public TerminalNode Not() { return getToken(EugineParser.Not, 0); }
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
		enterRule(_localctx, 34, RULE_unaryExpr);
		try {
			setState(346);
			switch (_input.LA(1)) {
			case T__4:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(335);
				((UnaryExprContext)_localctx).Top = topExpr(0);
				 ((UnaryExprContext)_localctx).v =  ((UnaryExprContext)_localctx).Top.v; 
				}
				break;
			case Sub:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				((UnaryExprContext)_localctx).Sub = match(Sub);
				setState(339);
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
				enterOuterAlt(_localctx, 3);
				{
				setState(342);
				((UnaryExprContext)_localctx).Not = match(Not);
				setState(343);
				((UnaryExprContext)_localctx).Right = topExpr(0);

				            ((UnaryExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((UnaryExprContext)_localctx).Not!=null?((UnaryExprContext)_localctx).Not.getText():null)).call(((UnaryExprContext)_localctx).Not, 
				                org.coyove.eugine.util.List.build(((UnaryExprContext)_localctx).Right.v));
				        
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
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_multiplyExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(349);
			((MultiplyExprContext)_localctx).Top = unaryExpr();
			 ((MultiplyExprContext)_localctx).v =  ((MultiplyExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
					setState(352);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(353);
					((MultiplyExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
						((MultiplyExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(354);
					((MultiplyExprContext)_localctx).Right = unaryExpr();

					                      ((MultiplyExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((MultiplyExprContext)_localctx).Op!=null?((MultiplyExprContext)_localctx).Op.getText():null)).call(((MultiplyExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((MultiplyExprContext)_localctx).Left.v, ((MultiplyExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_addExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(363);
			((AddExprContext)_localctx).Top = multiplyExpr(0);
			 ((AddExprContext)_localctx).v =  ((AddExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(376);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new AddExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_addExpr);
						setState(366);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(367);
						((AddExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==Add) ) {
							((AddExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(368);
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
						setState(371);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(372);
						((AddExprContext)_localctx).Sub = match(Sub);
						setState(373);
						((AddExprContext)_localctx).Right = multiplyExpr(0);

						                      ((AddExprContext)_localctx).v =  new SEElemArith(new Atom(((AddExprContext)_localctx).Sub), 
						                          org.coyove.eugine.util.List.build(((AddExprContext)_localctx).Left.v, ((AddExprContext)_localctx).Right.v), SEElemArith.ACTION.SUBTRACT);
						                  
						}
						break;
					}
					} 
				}
				setState(380);
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
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_compareExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(382);
			((CompareExprContext)_localctx).Top = addExpr(0);
			 ((CompareExprContext)_localctx).v =  ((CompareExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(392);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
					setState(385);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(386);
					((CompareExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21))) != 0)) ) {
						((CompareExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(387);
					((CompareExprContext)_localctx).Right = addExpr(0);

					                      ((CompareExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((CompareExprContext)_localctx).Op!=null?((CompareExprContext)_localctx).Op.getText():null)).call(((CompareExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((CompareExprContext)_localctx).Left.v, ((CompareExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(394);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
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
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_logicExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(396);
			((LogicExprContext)_localctx).Top = compareExpr(0);
			 ((LogicExprContext)_localctx).v =  ((LogicExprContext)_localctx).Top.v; 
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
					setState(399);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(400);
					((LogicExprContext)_localctx).Op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__22 || _la==T__23) ) {
						((LogicExprContext)_localctx).Op = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(401);
					((LogicExprContext)_localctx).Right = compareExpr(0);

					                      ((LogicExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((LogicExprContext)_localctx).Op!=null?((LogicExprContext)_localctx).Op.getText():null)).call(((LogicExprContext)_localctx).Op, 
					                          org.coyove.eugine.util.List.build(((LogicExprContext)_localctx).Left.v, ((LogicExprContext)_localctx).Right.v));
					                  
					}
					} 
				}
				setState(408);
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

	public static class ExprContext extends ParserRuleContext {
		public SExpression v;
		public ExprContext Subject;
		public LogicExprContext logicExpr;
		public Token Identifier;
		public ExprContext Value;
		public Token Clone;
		public Token For;
		public ExprContext Body;
		public ExprContext Start;
		public ExprContext Next;
		public ExprContext End;
		public Token If;
		public ExprContext Condition;
		public CodeContext True;
		public CodeContext False;
		public ListContext list;
		public DictContext dict;
		public LogicExprContext logicExpr() {
			return getRuleContext(LogicExprContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Clone() { return getToken(EugineParser.Clone, 0); }
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(410);
				((ExprContext)_localctx).logicExpr = logicExpr(0);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).logicExpr.v; 
				}
				break;
			case 2:
				{
				setState(413);
				((ExprContext)_localctx).Identifier = match(Identifier);
				setState(414);
				match(T__6);
				setState(415);
				((ExprContext)_localctx).Value = expr(8);

				            ((ExprContext)_localctx).v =  new SESet(new SString((((ExprContext)_localctx).Identifier!=null?((ExprContext)_localctx).Identifier.getText():null)), ((ExprContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
				        
				}
				break;
			case 3:
				{
				setState(418);
				((ExprContext)_localctx).Clone = match(Clone);
				setState(419);
				((ExprContext)_localctx).Subject = expr(6);

				            ((ExprContext)_localctx).v =  new SEClone(new Atom(((ExprContext)_localctx).Clone), ((ExprContext)_localctx).Subject.v);
				        
				}
				break;
			case 4:
				{
				setState(422);
				((ExprContext)_localctx).For = match(For);
				setState(423);
				((ExprContext)_localctx).Subject = expr(0);
				setState(424);
				match(Do);
				setState(425);
				((ExprContext)_localctx).Body = expr(5);
				 
				            ((ExprContext)_localctx).v =  new SEFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? SEFor.DIRECTION.ASC : SEFor.DIRECTION.DESC); 
				        
				}
				break;
			case 5:
				{
				setState(428);
				((ExprContext)_localctx).For = match(For);
				setState(429);
				((ExprContext)_localctx).Start = expr(0);
				setState(432);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(430);
					match(T__7);
					setState(431);
					((ExprContext)_localctx).Next = expr(0);
					}
				}

				setState(434);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(435);
				((ExprContext)_localctx).End = expr(0);
				setState(436);
				match(Do);
				setState(437);
				((ExprContext)_localctx).Body = expr(4);
				 
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
			case 6:
				{
				setState(440);
				((ExprContext)_localctx).If = match(If);
				setState(441);
				((ExprContext)_localctx).Condition = expr(0);
				setState(442);
				((ExprContext)_localctx).True = code();
				setState(445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(443);
					match(Else);
					setState(444);
					((ExprContext)_localctx).False = code();
					}
					break;
				}

				            ((ExprContext)_localctx).v =  new SEIf(new Atom(((ExprContext)_localctx).If), ((ExprContext)_localctx).Condition.v, ((ExprContext)_localctx).True.v, (((ExprContext)_localctx).False!=null?(((ExprContext)_localctx).False.start):null) == null ? null : ((ExprContext)_localctx).False.v);
				        
				}
				break;
			case 7:
				{
				setState(449);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 8:
				{
				setState(452);
				((ExprContext)_localctx).dict = dict();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).dict.v; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.Subject = _prevctx;
					_localctx.Subject = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(457);
					if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
					setState(458);
					match(T__6);
					setState(459);
					((ExprContext)_localctx).Value = expr(8);

					                      ((ExprContext)_localctx).v =  new SESet(((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
					                  
					}
					} 
				}
				setState(466);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return topExpr_sempred((TopExprContext)_localctx, predIndex);
		case 18:
			return multiplyExpr_sempred((MultiplyExprContext)_localctx, predIndex);
		case 19:
			return addExpr_sempred((AddExprContext)_localctx, predIndex);
		case 20:
			return compareExpr_sempred((CompareExprContext)_localctx, predIndex);
		case 21:
			return logicExpr_sempred((LogicExprContext)_localctx, predIndex);
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
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
	private boolean multiplyExpr_sempred(MultiplyExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean addExpr_sempred(AddExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean compareExpr_sempred(CompareExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicExpr_sempred(LogicExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\64\u01d6\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\4\3\4"+
		"\3\4\6\4D\n\4\r\4\16\4E\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5Y\n\5\3\6\3\6\3\6\3\6\7\6_\n\6\f\6\16\6b\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\7\3\7\5\7o\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\t\3"+
		"\t\3\t\3\t\3\t\5\t\u0087\n\t\3\n\3\n\3\n\3\n\3\n\7\n\u008e\n\n\f\n\16"+
		"\n\u0091\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0099\n\n\3\13\3\13\3\13\3\13"+
		"\5\13\u009f\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u00a6\n\13\f\13\16\13\u00a9"+
		"\13\13\3\13\3\13\3\13\3\13\5\13\u00af\n\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\5\13\u00b7\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u00be\n\13\f\13\16\13"+
		"\u00c1\13\13\3\13\3\13\3\13\3\13\5\13\u00c7\n\13\3\13\3\13\5\13\u00cb"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6\13\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00dc\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00eb\n\16\f\16\16\16\u00ee\13\16\3\16\5\16\u00f1\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00f9\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0105\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u010f\n\20\f\20\16\20\u0112\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u011a\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u0125\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u013d"+
		"\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\7\22\u014d\n\22\f\22\16\22\u0150\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u015d\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0168\n\24\f\24\16\24\u016b\13\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u017b"+
		"\n\25\f\25\16\25\u017e\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\7\26\u0189\n\26\f\26\16\26\u018c\13\26\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\7\27\u0197\n\27\f\27\16\27\u019a\13\27\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01b3\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01c0\n\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u01ca\n\30\3\30\3\30\3\30\3\30\3\30\7\30\u01d1"+
		"\n\30\f\30\16\30\u01d4\13\30\3\30\2\b\"&(*,.\31\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\2\b\3\2\63\64\3\2\17\21\4\2\22\22&&\3\2\23\30"+
		"\3\2\31\32\3\2\33\34\u01f9\2\63\3\2\2\2\4<\3\2\2\2\6C\3\2\2\2\bX\3\2\2"+
		"\2\nZ\3\2\2\2\fc\3\2\2\2\16r\3\2\2\2\20\u0086\3\2\2\2\22\u0098\3\2\2\2"+
		"\24\u00ca\3\2\2\2\26\u00cc\3\2\2\2\30\u00df\3\2\2\2\32\u00f8\3\2\2\2\34"+
		"\u0104\3\2\2\2\36\u0119\3\2\2\2 \u0124\3\2\2\2\"\u013c\3\2\2\2$\u015c"+
		"\3\2\2\2&\u015e\3\2\2\2(\u016c\3\2\2\2*\u017f\3\2\2\2,\u018d\3\2\2\2."+
		"\u01c9\3\2\2\2\60\61\5\6\4\2\61\62\b\2\1\2\62\64\3\2\2\2\63\60\3\2\2\2"+
		"\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\678\7\3\2\289"+
		"\5\6\4\29:\7\4\2\2:=\3\2\2\2;=\5\b\5\2<\67\3\2\2\2<;\3\2\2\2=>\3\2\2\2"+
		">?\b\3\1\2?\5\3\2\2\2@A\5\b\5\2AB\b\4\1\2BD\3\2\2\2C@\3\2\2\2DE\3\2\2"+
		"\2EC\3\2\2\2EF\3\2\2\2F\7\3\2\2\2GH\5\n\6\2HI\b\5\1\2IY\3\2\2\2JK\5\f"+
		"\7\2KL\b\5\1\2LY\3\2\2\2MN\5\16\b\2NO\b\5\1\2OY\3\2\2\2PQ\5\24\13\2QR"+
		"\b\5\1\2RY\3\2\2\2ST\5.\30\2TU\b\5\1\2UY\3\2\2\2VW\7.\2\2WY\b\5\1\2XG"+
		"\3\2\2\2XJ\3\2\2\2XM\3\2\2\2XP\3\2\2\2XS\3\2\2\2XV\3\2\2\2Y\t\3\2\2\2"+
		"Z[\7\5\2\2[`\7/\2\2\\]\7\6\2\2]_\7/\2\2^\\\3\2\2\2_b\3\2\2\2`^\3\2\2\2"+
		"`a\3\2\2\2a\13\3\2\2\2b`\3\2\2\2cd\7\"\2\2dj\5\4\3\2ef\7#\2\2fg\7\7\2"+
		"\2gh\7/\2\2hi\7\b\2\2ik\5\4\3\2je\3\2\2\2jk\3\2\2\2kn\3\2\2\2lm\7%\2\2"+
		"mo\5\4\3\2nl\3\2\2\2no\3\2\2\2op\3\2\2\2pq\b\7\1\2q\r\3\2\2\2rs\7\35\2"+
		"\2st\7/\2\2tu\7\t\2\2uv\5.\30\2vw\b\b\1\2w\17\3\2\2\2x~\7\7\2\2yz\7/\2"+
		"\2z{\7\n\2\2{}\b\t\1\2|y\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2"+
		"\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\7/\2\2\u0082\u0083\7\b\2"+
		"\2\u0083\u0087\b\t\1\2\u0084\u0085\7\7\2\2\u0085\u0087\7\b\2\2\u0086x"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087\21\3\2\2\2\u0088\u008f\7\7\2\2\u0089"+
		"\u008a\5.\30\2\u008a\u008b\7\n\2\2\u008b\u008c\b\n\1\2\u008c\u008e\3\2"+
		"\2\2\u008d\u0089\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\5."+
		"\30\2\u0093\u0094\7\b\2\2\u0094\u0095\b\n\1\2\u0095\u0099\3\2\2\2\u0096"+
		"\u0097\7\7\2\2\u0097\u0099\7\b\2\2\u0098\u0088\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\23\3\2\2\2\u009a\u009b\7\36\2\2\u009b\u009c\7/\2\2\u009c\u009e"+
		"\5\20\t\2\u009d\u009f\t\2\2\2\u009e\u009d\3\2\2\2\u009e\u009f\3\2\2\2"+
		"\u009f\u00a0\3\2\2\2\u00a0\u00ae\7\t\2\2\u00a1\u00a7\7\3\2\2\u00a2\u00a3"+
		"\5\b\5\2\u00a3\u00a4\b\13\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a2\3\2\2\2"+
		"\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa"+
		"\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa\u00af\7\4\2\2\u00ab\u00ac\5\b\5\2\u00ac"+
		"\u00ad\b\13\1\2\u00ad\u00af\3\2\2\2\u00ae\u00a1\3\2\2\2\u00ae\u00ab\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\b\13\1\2\u00b1\u00cb\3\2\2\2\u00b2"+
		"\u00b3\7\36\2\2\u00b3\u00b4\5.\30\2\u00b4\u00b6\5\20\t\2\u00b5\u00b7\t"+
		"\2\2\2\u00b6\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8"+
		"\u00c6\7\t\2\2\u00b9\u00bf\7\3\2\2\u00ba\u00bb\5\b\5\2\u00bb\u00bc\b\13"+
		"\1\2\u00bc\u00be\3\2\2\2\u00bd\u00ba\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2"+
		"\2\2\u00c2\u00c7\7\4\2\2\u00c3\u00c4\5\b\5\2\u00c4\u00c5\b\13\1\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00b9\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00c8\3\2"+
		"\2\2\u00c8\u00c9\b\13\1\2\u00c9\u00cb\3\2\2\2\u00ca\u009a\3\2\2\2\u00ca"+
		"\u00b2\3\2\2\2\u00cb\25\3\2\2\2\u00cc\u00cd\5\20\t\2\u00cd\u00db\7\13"+
		"\2\2\u00ce\u00d4\7\3\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\b\f\1\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00cf\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00dc\7\4\2\2\u00d8\u00d9\5\b\5\2\u00d9\u00da\b\f\1\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00ce\3\2\2\2\u00db\u00d8\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00de\b\f\1\2\u00de\27\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\5\22\n"+
		"\2\u00e1\u00e2\b\r\1\2\u00e2\31\3\2\2\2\u00e3\u00e4\7\3\2\2\u00e4\u00e5"+
		"\5\34\17\2\u00e5\u00ec\b\16\1\2\u00e6\u00e7\7\n\2\2\u00e7\u00e8\5\34\17"+
		"\2\u00e8\u00e9\b\16\1\2\u00e9\u00eb\3\2\2\2\u00ea\u00e6\3\2\2\2\u00eb"+
		"\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00f0\3\2"+
		"\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\7\n\2\2\u00f0\u00ef\3\2\2\2\u00f0"+
		"\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\7\4\2\2\u00f3\u00f4\b\16"+
		"\1\2\u00f4\u00f9\3\2\2\2\u00f5\u00f6\7\3\2\2\u00f6\u00f7\7\4\2\2\u00f7"+
		"\u00f9\b\16\1\2\u00f8\u00e3\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\33\3\2\2"+
		"\2\u00fa\u00fb\t\2\2\2\u00fb\u00fc\7\f\2\2\u00fc\u00fd\5 \21\2\u00fd\u00fe"+
		"\b\17\1\2\u00fe\u0105\3\2\2\2\u00ff\u0100\7/\2\2\u0100\u0101\7\f\2\2\u0101"+
		"\u0102\5 \21\2\u0102\u0103\b\17\1\2\u0103\u0105\3\2\2\2\u0104\u00fa\3"+
		"\2\2\2\u0104\u00ff\3\2\2\2\u0105\35\3\2\2\2\u0106\u0107\7\r\2\2\u0107"+
		"\u0108\5 \21\2\u0108\u0109\b\20\1\2\u0109\u0110\3\2\2\2\u010a\u010b\7"+
		"\n\2\2\u010b\u010c\5 \21\2\u010c\u010d\b\20\1\2\u010d\u010f\3\2\2\2\u010e"+
		"\u010a\3\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2"+
		"\2\2\u0111\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0114\7\16\2\2\u0114"+
		"\u0115\b\20\1\2\u0115\u011a\3\2\2\2\u0116\u0117\7\r\2\2\u0117\u0118\7"+
		"\16\2\2\u0118\u011a\b\20\1\2\u0119\u0106\3\2\2\2\u0119\u0116\3\2\2\2\u011a"+
		"\37\3\2\2\2\u011b\u011c\5.\30\2\u011c\u011d\b\21\1\2\u011d\u0125\3\2\2"+
		"\2\u011e\u011f\5\32\16\2\u011f\u0120\b\21\1\2\u0120\u0125\3\2\2\2\u0121"+
		"\u0122\5\36\20\2\u0122\u0123\b\21\1\2\u0123\u0125\3\2\2\2\u0124\u011b"+
		"\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u0121\3\2\2\2\u0125!\3\2\2\2\u0126"+
		"\u0127\b\22\1\2\u0127\u0128\7\7\2\2\u0128\u0129\5\b\5\2\u0129\u012a\7"+
		"\b\2\2\u012a\u012b\b\22\1\2\u012b\u013d\3\2\2\2\u012c\u012d\5\30\r\2\u012d"+
		"\u012e\b\22\1\2\u012e\u013d\3\2\2\2\u012f\u0130\5\26\f\2\u0130\u0131\b"+
		"\22\1\2\u0131\u013d\3\2\2\2\u0132\u0133\7/\2\2\u0133\u013d\b\22\1\2\u0134"+
		"\u0135\7\63\2\2\u0135\u013d\b\22\1\2\u0136\u0137\7\64\2\2\u0137\u013d"+
		"\b\22\1\2\u0138\u0139\7*\2\2\u0139\u013d\b\22\1\2\u013a\u013b\7+\2\2\u013b"+
		"\u013d\b\22\1\2\u013c\u0126\3\2\2\2\u013c\u012c\3\2\2\2\u013c\u012f\3"+
		"\2\2\2\u013c\u0132\3\2\2\2\u013c\u0134\3\2\2\2\u013c\u0136\3\2\2\2\u013c"+
		"\u0138\3\2\2\2\u013c\u013a\3\2\2\2\u013d\u014e\3\2\2\2\u013e\u013f\f\13"+
		"\2\2\u013f\u0140\5\22\n\2\u0140\u0141\b\22\1\2\u0141\u014d\3\2\2\2\u0142"+
		"\u0143\f\t\2\2\u0143\u0144\7\r\2\2\u0144\u0145\5.\30\2\u0145\u0146\7\16"+
		"\2\2\u0146\u0147\b\22\1\2\u0147\u014d\3\2\2\2\u0148\u0149\f\b\2\2\u0149"+
		"\u014a\7\6\2\2\u014a\u014b\7/\2\2\u014b\u014d\b\22\1\2\u014c\u013e\3\2"+
		"\2\2\u014c\u0142\3\2\2\2\u014c\u0148\3\2\2\2\u014d\u0150\3\2\2\2\u014e"+
		"\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f#\3\2\2\2\u0150\u014e\3\2\2\2"+
		"\u0151\u0152\5\"\22\2\u0152\u0153\b\23\1\2\u0153\u015d\3\2\2\2\u0154\u0155"+
		"\7\'\2\2\u0155\u0156\5\"\22\2\u0156\u0157\b\23\1\2\u0157\u015d\3\2\2\2"+
		"\u0158\u0159\7(\2\2\u0159\u015a\5\"\22\2\u015a\u015b\b\23\1\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0151\3\2\2\2\u015c\u0154\3\2\2\2\u015c\u0158\3\2\2\2\u015d"+
		"%\3\2\2\2\u015e\u015f\b\24\1\2\u015f\u0160\5$\23\2\u0160\u0161\b\24\1"+
		"\2\u0161\u0169\3\2\2\2\u0162\u0163\f\3\2\2\u0163\u0164\t\3\2\2\u0164\u0165"+
		"\5$\23\2\u0165\u0166\b\24\1\2\u0166\u0168\3\2\2\2\u0167\u0162\3\2\2\2"+
		"\u0168\u016b\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\'\3"+
		"\2\2\2\u016b\u0169\3\2\2\2\u016c\u016d\b\25\1\2\u016d\u016e\5&\24\2\u016e"+
		"\u016f\b\25\1\2\u016f\u017c\3\2\2\2\u0170\u0171\f\4\2\2\u0171\u0172\t"+
		"\4\2\2\u0172\u0173\5&\24\2\u0173\u0174\b\25\1\2\u0174\u017b\3\2\2\2\u0175"+
		"\u0176\f\3\2\2\u0176\u0177\7\'\2\2\u0177\u0178\5&\24\2\u0178\u0179\b\25"+
		"\1\2\u0179\u017b\3\2\2\2\u017a\u0170\3\2\2\2\u017a\u0175\3\2\2\2\u017b"+
		"\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d)\3\2\2\2"+
		"\u017e\u017c\3\2\2\2\u017f\u0180\b\26\1\2\u0180\u0181\5(\25\2\u0181\u0182"+
		"\b\26\1\2\u0182\u018a\3\2\2\2\u0183\u0184\f\3\2\2\u0184\u0185\t\5\2\2"+
		"\u0185\u0186\5(\25\2\u0186\u0187\b\26\1\2\u0187\u0189\3\2\2\2\u0188\u0183"+
		"\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"+\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\b\27\1\2\u018e\u018f\5*\26\2"+
		"\u018f\u0190\b\27\1\2\u0190\u0198\3\2\2\2\u0191\u0192\f\3\2\2\u0192\u0193"+
		"\t\6\2\2\u0193\u0194\5*\26\2\u0194\u0195\b\27\1\2\u0195\u0197\3\2\2\2"+
		"\u0196\u0191\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199"+
		"\3\2\2\2\u0199-\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b\30\1\2\u019c"+
		"\u019d\5,\27\2\u019d\u019e\b\30\1\2\u019e\u01ca\3\2\2\2\u019f\u01a0\7"+
		"/\2\2\u01a0\u01a1\7\t\2\2\u01a1\u01a2\5.\30\n\u01a2\u01a3\b\30\1\2\u01a3"+
		"\u01ca\3\2\2\2\u01a4\u01a5\7$\2\2\u01a5\u01a6\5.\30\b\u01a6\u01a7\b\30"+
		"\1\2\u01a7\u01ca\3\2\2\2\u01a8\u01a9\7\37\2\2\u01a9\u01aa\5.\30\2\u01aa"+
		"\u01ab\7%\2\2\u01ab\u01ac\5.\30\7\u01ac\u01ad\b\30\1\2\u01ad\u01ca\3\2"+
		"\2\2\u01ae\u01af\7\37\2\2\u01af\u01b2\5.\30\2\u01b0\u01b1\7\n\2\2\u01b1"+
		"\u01b3\5.\30\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b5\t\7\2\2\u01b5\u01b6\5.\30\2\u01b6\u01b7\7%\2\2\u01b7"+
		"\u01b8\5.\30\6\u01b8\u01b9\b\30\1\2\u01b9\u01ca\3\2\2\2\u01ba\u01bb\7"+
		" \2\2\u01bb\u01bc\5.\30\2\u01bc\u01bf\5\4\3\2\u01bd\u01be\7!\2\2\u01be"+
		"\u01c0\5\4\3\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2"+
		"\2\2\u01c1\u01c2\b\30\1\2\u01c2\u01ca\3\2\2\2\u01c3\u01c4\5\36\20\2\u01c4"+
		"\u01c5\b\30\1\2\u01c5\u01ca\3\2\2\2\u01c6\u01c7\5\32\16\2\u01c7\u01c8"+
		"\b\30\1\2\u01c8\u01ca\3\2\2\2\u01c9\u019b\3\2\2\2\u01c9\u019f\3\2\2\2"+
		"\u01c9\u01a4\3\2\2\2\u01c9\u01a8\3\2\2\2\u01c9\u01ae\3\2\2\2\u01c9\u01ba"+
		"\3\2\2\2\u01c9\u01c3\3\2\2\2\u01c9\u01c6\3\2\2\2\u01ca\u01d2\3\2\2\2\u01cb"+
		"\u01cc\f\t\2\2\u01cc\u01cd\7\t\2\2\u01cd\u01ce\5.\30\n\u01ce\u01cf\b\30"+
		"\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01cb\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2"+
		"\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3/\3\2\2\2\u01d4\u01d2\3\2\2\2"+
		"*\65<EX`jn~\u0086\u008f\u0098\u009e\u00a7\u00ae\u00b6\u00bf\u00c6\u00ca"+
		"\u00d4\u00db\u00ec\u00f0\u00f8\u0104\u0110\u0119\u0124\u013c\u014c\u014e"+
		"\u015c\u0169\u017a\u017c\u018a\u0198\u01b2\u01bf\u01c9\u01d2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}