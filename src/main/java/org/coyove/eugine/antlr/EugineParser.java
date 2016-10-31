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
		T__24=25, T__25=26, T__26=27, Var=28, Def=29, For=30, If=31, Else=32, 
		Add=33, Sub=34, AryOp=35, Integer=36, Double=37, NEWLINE=38, WS=39, Semi=40, 
		Identifier=41, LETTER=42, RawString=43, StringLiteral=44;
	public static final int
		RULE_prog = 0, RULE_code = 1, RULE_block = 2, RULE_stmt = 3, RULE_importStmt = 4, 
		RULE_ifStmt = 5, RULE_declareStmt = 6, RULE_definitionsList = 7, RULE_argumentsList = 8, 
		RULE_defineStmt = 9, RULE_lambdaStmt = 10, RULE_callStmt = 11, RULE_dict = 12, 
		RULE_pair = 13, RULE_list = 14, RULE_value = 15, RULE_expr = 16;
	public static final String[] ruleNames = {
		"prog", "code", "block", "stmt", "importStmt", "ifStmt", "declareStmt", 
		"definitionsList", "argumentsList", "defineStmt", "lambdaStmt", "callStmt", 
		"dict", "pair", "list", "value", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'='", "'('", "','", "')'", "'=>'", "':'", 
		"'['", "']'", "'*'", "'/'", "'%'", "'=='", "'!='", "'>'", "'<'", "'>='", 
		"'<='", "'&&'", "'||'", "'+.'", "'do'", "'..'", "'...'", "'.'", "'var'", 
		"'def'", null, "'if'", "'else'", "'+'", "'-'", null, null, null, null, 
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Var", "Def", "For", "If", "Else", "Add", "Sub", 
		"AryOp", "Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", "LETTER", 
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
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34);
				((ProgContext)_localctx).block = block();
				 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Sub) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0) );
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
			setState(46);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(41);
				match(T__0);
				setState(42);
				((CodeContext)_localctx).B1 = block();
				setState(43);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(45);
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
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(50);
					((BlockContext)_localctx).stmt = stmt();
					 ((SEChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
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
		public IfStmtContext ifStmt;
		public DeclareStmtContext declareStmt;
		public DefineStmtContext defineStmt;
		public ExprContext expr;
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public TerminalNode Semi() { return getToken(EugineParser.Semi, 0); }
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
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
			setState(77);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				importStmt();
				setState(58);
				match(Semi);
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case If:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				((StmtContext)_localctx).ifStmt = ifStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).ifStmt.v; 
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				((StmtContext)_localctx).declareStmt = declareStmt();
				setState(65);
				match(Semi);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__0:
			case T__4:
			case T__9:
			case For:
			case Sub:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 5);
				{
				setState(71);
				((StmtContext)_localctx).expr = expr(0);
				setState(72);
				match(Semi);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 6);
				{
				setState(75);
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
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
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
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__2);
			setState(80);
			match(Identifier);
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

	public static class IfStmtContext extends ParserRuleContext {
		public SExpression v;
		public Token If;
		public ExprContext Condition;
		public CodeContext True;
		public CodeContext False;
		public TerminalNode If() { return getToken(EugineParser.If, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CodeContext> code() {
			return getRuleContexts(CodeContext.class);
		}
		public CodeContext code(int i) {
			return getRuleContext(CodeContext.class,i);
		}
		public TerminalNode Else() { return getToken(EugineParser.Else, 0); }
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EugineListener ) ((EugineListener)listener).exitIfStmt(this);
		}
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_ifStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			((IfStmtContext)_localctx).If = match(If);
			setState(83);
			((IfStmtContext)_localctx).Condition = expr(0);
			setState(84);
			((IfStmtContext)_localctx).True = code();
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(85);
				match(Else);
				setState(86);
				((IfStmtContext)_localctx).False = code();
				}
				break;
			}

			            ((IfStmtContext)_localctx).v =  new SEIf(new Atom(((IfStmtContext)_localctx).If), ((IfStmtContext)_localctx).Condition.v, ((IfStmtContext)_localctx).True.v, (((IfStmtContext)_localctx).False!=null?(((IfStmtContext)_localctx).False.start):null) == null ? null : ((IfStmtContext)_localctx).False.v);
			        
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
			setState(91);
			match(Var);
			setState(92);
			((DeclareStmtContext)_localctx).Identifier = match(Identifier);
			setState(93);
			match(T__3);
			setState(94);
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
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(T__4);
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						((DefinitionsListContext)_localctx).InitArg = match(Identifier);
						setState(99);
						match(T__5);
						 _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?((DefinitionsListContext)_localctx).InitArg.getText():null)); 
						}
						} 
					}
					setState(105);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				setState(106);
				((DefinitionsListContext)_localctx).LastArg = match(Identifier);
				setState(107);
				match(T__6);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?((DefinitionsListContext)_localctx).LastArg.getText():null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__4);
				setState(110);
				match(T__6);
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
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__4);
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(114);
						((ArgumentsListContext)_localctx).InitExpr = expr(0);
						setState(115);
						match(T__5);
						 _localctx.v.add(((ArgumentsListContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(122);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(123);
				((ArgumentsListContext)_localctx).LastExpr = expr(0);
				setState(124);
				match(T__6);

				        _localctx.v.add(((ArgumentsListContext)_localctx).LastExpr.v);
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(T__4);
				setState(128);
				match(T__6);
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
			setState(131);
			match(Def);
			setState(132);
			((DefineStmtContext)_localctx).Identifier = match(Identifier);
			setState(133);
			((DefineStmtContext)_localctx).definitionsList = definitionsList();
			setState(135);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(134);
				((DefineStmtContext)_localctx).Desc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(137);
			match(T__3);
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				{
				setState(138);
				match(T__0);
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Sub) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(139);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					}
					setState(146);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(147);
				match(T__1);
				}
				}
				break;
			case 2:
				{
				{
				setState(148);
				((DefineStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
				}
				}
				break;
			}

			        ((DefineStmtContext)_localctx).v =  new SEDef(new Atom(((DefineStmtContext)_localctx).Identifier), (((DefineStmtContext)_localctx).Identifier!=null?((DefineStmtContext)_localctx).Identifier.getText():null), ((DefineStmtContext)_localctx).definitionsList.v, 
			            ((DefineStmtContext)_localctx).Desc == null ? "" : (((DefineStmtContext)_localctx).Desc!=null?((DefineStmtContext)_localctx).Desc.getText():null), _localctx.body);
			    
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
		public ExprContext expr;
		public DefinitionsListContext definitionsList() {
			return getRuleContext(DefinitionsListContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
			setState(155);
			((LambdaStmtContext)_localctx).definitionsList = definitionsList();
			setState(156);
			match(T__7);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(157);
				match(T__0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__4) | (1L << T__9) | (1L << Var) | (1L << Def) | (1L << For) | (1L << If) | (1L << Sub) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(158);
					((LambdaStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((LambdaStmtContext)_localctx).stmt.v); 
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__1);
				}
				break;
			case 2:
				{
				setState(167);
				((LambdaStmtContext)_localctx).expr = expr(0);
				 _localctx.body.add(((LambdaStmtContext)_localctx).expr.v); 
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
			setState(174);
			((CallStmtContext)_localctx).Identifier = match(Identifier);
			setState(175);
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
			setState(199);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(T__0);
				setState(179);
				((DictContext)_localctx).pair = pair();
				 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(181);
						match(T__5);
						setState(182);
						((DictContext)_localctx).pair = pair();
						 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(191);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(190);
					match(T__5);
					}
				}

				setState(193);
				match(T__1);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				match(T__0);
				setState(197);
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
			setState(211);
			switch (_input.LA(1)) {
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((PairContext)_localctx).Key = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(202);
				match(T__8);
				setState(203);
				((PairContext)_localctx).Value = value();
				 ((PairContext)_localctx).k =  org.coyove.eugine.util.Utils.unescape((((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null)); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				((PairContext)_localctx).Key = match(Identifier);
				setState(207);
				match(T__8);
				setState(208);
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
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(T__9);
				{
				setState(214);
				((ListContext)_localctx).value = value();
				 _localctx.ret.add(((ListContext)_localctx).value.v); 
				}
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__5) {
					{
					{
					setState(217);
					match(T__5);
					setState(218);
					((ListContext)_localctx).value = value();
					 _localctx.ret.add(((ListContext)_localctx).value.v); 
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(T__10);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(T__9);
				setState(230);
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
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((ValueContext)_localctx).expr = expr(0);
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
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

	public static class ExprContext extends ParserRuleContext {
		public SExpression v;
		public ExprContext Called;
		public ExprContext Subject;
		public ExprContext Left;
		public CallStmtContext callStmt;
		public LambdaStmtContext lambdaStmt;
		public Token Identifier;
		public ExprContext Value;
		public Token Sub;
		public ExprContext Right;
		public ExprContext Inner;
		public Token For;
		public ExprContext Body;
		public ExprContext Start;
		public ExprContext Next;
		public ExprContext End;
		public ListContext list;
		public DictContext dict;
		public Token RawString;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
		public Token AryOp;
		public Token AddOp;
		public ArgumentsListContext argumentsList;
		public ExprContext Key;
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public LambdaStmtContext lambdaStmt() {
			return getRuleContext(LambdaStmtContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Sub() { return getToken(EugineParser.Sub, 0); }
		public TerminalNode For() { return getToken(EugineParser.For, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DictContext dict() {
			return getRuleContext(DictContext.class,0);
		}
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode Integer() { return getToken(EugineParser.Integer, 0); }
		public TerminalNode Double() { return getToken(EugineParser.Double, 0); }
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(246);
				((ExprContext)_localctx).callStmt = callStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).callStmt.v; 
				}
				break;
			case 2:
				{
				setState(249);
				((ExprContext)_localctx).lambdaStmt = lambdaStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).lambdaStmt.v; 
				}
				break;
			case 3:
				{
				setState(252);
				((ExprContext)_localctx).Identifier = match(Identifier);
				setState(253);
				match(T__3);
				setState(254);
				((ExprContext)_localctx).Value = expr(17);
				 
				            ((ExprContext)_localctx).v =  new SESet(new SString((((ExprContext)_localctx).Identifier!=null?((ExprContext)_localctx).Identifier.getText():null)), ((ExprContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE); 
				        
				}
				break;
			case 4:
				{
				setState(257);
				((ExprContext)_localctx).Sub = match(Sub);
				setState(258);
				((ExprContext)_localctx).Right = expr(15);

				            if (((ExprContext)_localctx).Right.v instanceof SInteger) {
				                ((ExprContext)_localctx).v =  new SInteger(-((SInteger) ((ExprContext)_localctx).Right.v).<Long>get());
				            } else if (((ExprContext)_localctx).Right.v instanceof SDouble) {
				                ((ExprContext)_localctx).v =  new SDouble(-((SDouble) ((ExprContext)_localctx).Right.v).<Double>get());
				            } else {
				                ((ExprContext)_localctx).v =  new SEReverse(new Atom(((ExprContext)_localctx).Sub), org.coyove.eugine.util.List.build(((ExprContext)_localctx).Right.v)); 
				            }
				        
				}
				break;
			case 5:
				{
				setState(261);
				match(T__4);
				setState(262);
				((ExprContext)_localctx).Inner = expr(0);
				setState(263);
				match(T__6);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).Inner.v; 
				}
				break;
			case 6:
				{
				setState(266);
				((ExprContext)_localctx).For = match(For);
				setState(267);
				((ExprContext)_localctx).Subject = expr(0);
				setState(268);
				match(T__23);
				setState(269);
				((ExprContext)_localctx).Body = expr(11);
				 
				            ((ExprContext)_localctx).v =  new SEFor(new Atom(((ExprContext)_localctx).For), ((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Body.v, 
				                (((ExprContext)_localctx).For!=null?((ExprContext)_localctx).For.getText():null).equals("for") ? SEFor.DIRECTION.ASC : SEFor.DIRECTION.DESC); 
				        
				}
				break;
			case 7:
				{
				setState(272);
				((ExprContext)_localctx).For = match(For);
				setState(273);
				((ExprContext)_localctx).Start = expr(0);
				setState(276);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(274);
					match(T__5);
					setState(275);
					((ExprContext)_localctx).Next = expr(0);
					}
				}

				setState(278);
				_la = _input.LA(1);
				if ( !(_la==T__24 || _la==T__25) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(279);
				((ExprContext)_localctx).End = expr(0);
				setState(280);
				match(T__23);
				setState(281);
				((ExprContext)_localctx).Body = expr(10);
				 
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
			case 8:
				{
				setState(284);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 9:
				{
				setState(287);
				((ExprContext)_localctx).dict = dict();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).dict.v; 
				}
				break;
			case 10:
				{
				setState(290);
				((ExprContext)_localctx).Identifier = match(Identifier);
				 ((ExprContext)_localctx).v =  new SEVariable((((ExprContext)_localctx).Identifier!=null?((ExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 11:
				{
				setState(292);
				((ExprContext)_localctx).RawString = match(RawString);
				 ((ExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((ExprContext)_localctx).RawString!=null?((ExprContext)_localctx).RawString.getText():null))); 
				}
				break;
			case 12:
				{
				setState(294);
				((ExprContext)_localctx).StringLiteral = match(StringLiteral);
				 ((ExprContext)_localctx).v =  new SString(org.coyove.eugine.util.Utils.unescape((((ExprContext)_localctx).StringLiteral!=null?((ExprContext)_localctx).StringLiteral.getText():null))); 
				}
				break;
			case 13:
				{
				setState(296);
				((ExprContext)_localctx).Integer = match(Integer);
				 ((ExprContext)_localctx).v =  new SInteger((((ExprContext)_localctx).Integer!=null?((ExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 14:
				{
				setState(298);
				((ExprContext)_localctx).Double = match(Double);
				 ((ExprContext)_localctx).v =  new SDouble((((ExprContext)_localctx).Double!=null?((ExprContext)_localctx).Double.getText():null)); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(331);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(303);
						match(T__3);
						setState(304);
						((ExprContext)_localctx).Value = expr(17);

						                      ((ExprContext)_localctx).v =  new SESet(((ExprContext)_localctx).Subject.v, ((ExprContext)_localctx).Value.v, SESet.DECLARE.SET, SESet.ACTION.MUTABLE);    
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(307);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(308);
						((ExprContext)_localctx).AryOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << Sub))) != 0)) ) {
							((ExprContext)_localctx).AryOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(309);
						((ExprContext)_localctx).Right = expr(15);
						 
						                      ((ExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((ExprContext)_localctx).AryOp!=null?((ExprContext)_localctx).AryOp.getText():null)).
						                          call(((ExprContext)_localctx).AryOp, org.coyove.eugine.util.List.build(((ExprContext)_localctx).Left.v, ((ExprContext)_localctx).Right.v));
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(313);
						((ExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==Add) ) {
							((ExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(314);
						((ExprContext)_localctx).Right = expr(14);
						 
						                      ((ExprContext)_localctx).v =  new SEAdd(new Atom(((ExprContext)_localctx).AddOp), 
						                          org.coyove.eugine.util.List.build(((ExprContext)_localctx).Left.v, ((ExprContext)_localctx).Right.v), (((ExprContext)_localctx).AddOp!=null?((ExprContext)_localctx).AddOp.getText():null).equals("+."));
						                  
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Called = _prevctx;
						_localctx.Called = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(317);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(318);
						((ExprContext)_localctx).argumentsList = argumentsList();
						 ((ExprContext)_localctx).v =  new SECall(((ExprContext)_localctx).Called.v, ((ExprContext)_localctx).argumentsList.v, new Atom((((ExprContext)_localctx).Called!=null?(((ExprContext)_localctx).Called.start):null)), null); 
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(322);
						match(T__9);
						setState(323);
						((ExprContext)_localctx).Key = expr(0);
						setState(324);
						match(T__10);

						                      ((ExprContext)_localctx).v =  new SEGet(new Atom((((ExprContext)_localctx).Subject!=null?(((ExprContext)_localctx).Subject.start):null)), ((ExprContext)_localctx).Subject.v, org.coyove.eugine.util.List.build(((ExprContext)_localctx).Key.v));
						                  
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Subject = _prevctx;
						_localctx.Subject = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(328);
						match(T__26);
						setState(329);
						((ExprContext)_localctx).Identifier = match(Identifier);

						                      ((ExprContext)_localctx).v =  new SEGet(new Atom((((ExprContext)_localctx).Subject!=null?(((ExprContext)_localctx).Subject.start):null)), ((ExprContext)_localctx).Subject.v, 
						                          org.coyove.eugine.util.List.build(new SString((((ExprContext)_localctx).Identifier!=null?((ExprContext)_localctx).Identifier.getText():null))));
						                  
						}
						break;
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 14);
		case 2:
			return precpred(_ctx, 13);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3.\u0153\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\3\3\3"+
		"\3\4\3\4\3\4\6\48\n\4\r\4\16\49\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5P\n\5\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\5\7Z\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\7\th\n\t\f\t\16\tk\13\t\3\t\3\t\3\t\3\t\3\t\5\tr\n\t\3\n\3\n\3\n\3"+
		"\n\3\n\7\ny\n\n\f\n\16\n|\13\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0084\n\n\3"+
		"\13\3\13\3\13\3\13\5\13\u008a\n\13\3\13\3\13\3\13\3\13\3\13\7\13\u0091"+
		"\n\13\f\13\16\13\u0094\13\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00a4\n\f\f\f\16\f\u00a7\13\f\3\f\3"+
		"\f\3\f\3\f\5\f\u00ad\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\7\16\u00bc\n\16\f\16\16\16\u00bf\13\16\3\16\5\16\u00c2\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ca\n\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00d6\n\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u00e0\n\20\f\20\16\20\u00e3\13\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00eb\n\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u00f6\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u0117\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u012f\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u014e\n\22\f\22\16\22\u0151"+
		"\13\22\3\22\2\3\"\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\6\3\2"+
		"-.\3\2\33\34\4\2\16\30$$\4\2\31\31##\u016f\2\'\3\2\2\2\4\60\3\2\2\2\6"+
		"\67\3\2\2\2\bO\3\2\2\2\nQ\3\2\2\2\fT\3\2\2\2\16]\3\2\2\2\20q\3\2\2\2\22"+
		"\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u009d\3\2\2\2\30\u00b0\3\2\2\2\32\u00c9"+
		"\3\2\2\2\34\u00d5\3\2\2\2\36\u00ea\3\2\2\2 \u00f5\3\2\2\2\"\u012e\3\2"+
		"\2\2$%\5\6\4\2%&\b\2\1\2&(\3\2\2\2\'$\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3"+
		"\2\2\2*\3\3\2\2\2+,\7\3\2\2,-\5\6\4\2-.\7\4\2\2.\61\3\2\2\2/\61\5\b\5"+
		"\2\60+\3\2\2\2\60/\3\2\2\2\61\62\3\2\2\2\62\63\b\3\1\2\63\5\3\2\2\2\64"+
		"\65\5\b\5\2\65\66\b\4\1\2\668\3\2\2\2\67\64\3\2\2\289\3\2\2\29\67\3\2"+
		"\2\29:\3\2\2\2:\7\3\2\2\2;<\5\n\6\2<=\7*\2\2=>\b\5\1\2>P\3\2\2\2?@\5\f"+
		"\7\2@A\b\5\1\2AP\3\2\2\2BC\5\16\b\2CD\7*\2\2DE\b\5\1\2EP\3\2\2\2FG\5\24"+
		"\13\2GH\b\5\1\2HP\3\2\2\2IJ\5\"\22\2JK\7*\2\2KL\b\5\1\2LP\3\2\2\2MN\7"+
		"*\2\2NP\b\5\1\2O;\3\2\2\2O?\3\2\2\2OB\3\2\2\2OF\3\2\2\2OI\3\2\2\2OM\3"+
		"\2\2\2P\t\3\2\2\2QR\7\5\2\2RS\7+\2\2S\13\3\2\2\2TU\7!\2\2UV\5\"\22\2V"+
		"Y\5\4\3\2WX\7\"\2\2XZ\5\4\3\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\b\7\1\2"+
		"\\\r\3\2\2\2]^\7\36\2\2^_\7+\2\2_`\7\6\2\2`a\5\"\22\2ab\b\b\1\2b\17\3"+
		"\2\2\2ci\7\7\2\2de\7+\2\2ef\7\b\2\2fh\b\t\1\2gd\3\2\2\2hk\3\2\2\2ig\3"+
		"\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7+\2\2mn\7\t\2\2nr\b\t\1\2op\7"+
		"\7\2\2pr\7\t\2\2qc\3\2\2\2qo\3\2\2\2r\21\3\2\2\2sz\7\7\2\2tu\5\"\22\2"+
		"uv\7\b\2\2vw\b\n\1\2wy\3\2\2\2xt\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2"+
		"{}\3\2\2\2|z\3\2\2\2}~\5\"\22\2~\177\7\t\2\2\177\u0080\b\n\1\2\u0080\u0084"+
		"\3\2\2\2\u0081\u0082\7\7\2\2\u0082\u0084\7\t\2\2\u0083s\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\37\2\2\u0086\u0087\7+\2"+
		"\2\u0087\u0089\5\20\t\2\u0088\u008a\t\2\2\2\u0089\u0088\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u0099\7\6\2\2\u008c\u0092\7\3"+
		"\2\2\u008d\u008e\5\b\5\2\u008e\u008f\b\13\1\2\u008f\u0091\3\2\2\2\u0090"+
		"\u008d\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0095\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u009a\7\4\2\2\u0096"+
		"\u0097\5\b\5\2\u0097\u0098\b\13\1\2\u0098\u009a\3\2\2\2\u0099\u008c\3"+
		"\2\2\2\u0099\u0096\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\13\1\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\5\20\t\2\u009e\u00ac\7\n\2\2\u009f\u00a5\7\3\2"+
		"\2\u00a0\u00a1\5\b\5\2\u00a1\u00a2\b\f\1\2\u00a2\u00a4\3\2\2\2\u00a3\u00a0"+
		"\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ad\7\4\2\2\u00a9\u00aa\5\""+
		"\22\2\u00aa\u00ab\b\f\1\2\u00ab\u00ad\3\2\2\2\u00ac\u009f\3\2\2\2\u00ac"+
		"\u00a9\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\f\1\2\u00af\27\3\2\2"+
		"\2\u00b0\u00b1\7+\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00b3\b\r\1\2\u00b3\31"+
		"\3\2\2\2\u00b4\u00b5\7\3\2\2\u00b5\u00b6\5\34\17\2\u00b6\u00bd\b\16\1"+
		"\2\u00b7\u00b8\7\b\2\2\u00b8\u00b9\5\34\17\2\u00b9\u00ba\b\16\1\2\u00ba"+
		"\u00bc\3\2\2\2\u00bb\u00b7\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c2\7\b\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\3\2"+
		"\2\2\u00c3\u00c4\7\4\2\2\u00c4\u00c5\b\16\1\2\u00c5\u00ca\3\2\2\2\u00c6"+
		"\u00c7\7\3\2\2\u00c7\u00c8\7\4\2\2\u00c8\u00ca\b\16\1\2\u00c9\u00b4\3"+
		"\2\2\2\u00c9\u00c6\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00cc\t\2\2\2\u00cc"+
		"\u00cd\7\13\2\2\u00cd\u00ce\5 \21\2\u00ce\u00cf\b\17\1\2\u00cf\u00d6\3"+
		"\2\2\2\u00d0\u00d1\7+\2\2\u00d1\u00d2\7\13\2\2\u00d2\u00d3\5 \21\2\u00d3"+
		"\u00d4\b\17\1\2\u00d4\u00d6\3\2\2\2\u00d5\u00cb\3\2\2\2\u00d5\u00d0\3"+
		"\2\2\2\u00d6\35\3\2\2\2\u00d7\u00d8\7\f\2\2\u00d8\u00d9\5 \21\2\u00d9"+
		"\u00da\b\20\1\2\u00da\u00e1\3\2\2\2\u00db\u00dc\7\b\2\2\u00dc\u00dd\5"+
		" \21\2\u00dd\u00de\b\20\1\2\u00de\u00e0\3\2\2\2\u00df\u00db\3\2\2\2\u00e0"+
		"\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2"+
		"\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\r\2\2\u00e5\u00e6\b\20\1\2\u00e6"+
		"\u00eb\3\2\2\2\u00e7\u00e8\7\f\2\2\u00e8\u00e9\7\r\2\2\u00e9\u00eb\b\20"+
		"\1\2\u00ea\u00d7\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb\37\3\2\2\2\u00ec\u00ed"+
		"\5\"\22\2\u00ed\u00ee\b\21\1\2\u00ee\u00f6\3\2\2\2\u00ef\u00f0\5\32\16"+
		"\2\u00f0\u00f1\b\21\1\2\u00f1\u00f6\3\2\2\2\u00f2\u00f3\5\36\20\2\u00f3"+
		"\u00f4\b\21\1\2\u00f4\u00f6\3\2\2\2\u00f5\u00ec\3\2\2\2\u00f5\u00ef\3"+
		"\2\2\2\u00f5\u00f2\3\2\2\2\u00f6!\3\2\2\2\u00f7\u00f8\b\22\1\2\u00f8\u00f9"+
		"\5\30\r\2\u00f9\u00fa\b\22\1\2\u00fa\u012f\3\2\2\2\u00fb\u00fc\5\26\f"+
		"\2\u00fc\u00fd\b\22\1\2\u00fd\u012f\3\2\2\2\u00fe\u00ff\7+\2\2\u00ff\u0100"+
		"\7\6\2\2\u0100\u0101\5\"\22\23\u0101\u0102\b\22\1\2\u0102\u012f\3\2\2"+
		"\2\u0103\u0104\7$\2\2\u0104\u0105\5\"\22\21\u0105\u0106\b\22\1\2\u0106"+
		"\u012f\3\2\2\2\u0107\u0108\7\7\2\2\u0108\u0109\5\"\22\2\u0109\u010a\7"+
		"\t\2\2\u010a\u010b\b\22\1\2\u010b\u012f\3\2\2\2\u010c\u010d\7 \2\2\u010d"+
		"\u010e\5\"\22\2\u010e\u010f\7\32\2\2\u010f\u0110\5\"\22\r\u0110\u0111"+
		"\b\22\1\2\u0111\u012f\3\2\2\2\u0112\u0113\7 \2\2\u0113\u0116\5\"\22\2"+
		"\u0114\u0115\7\b\2\2\u0115\u0117\5\"\22\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\t\3\2\2\u0119\u011a\5\"\22\2"+
		"\u011a\u011b\7\32\2\2\u011b\u011c\5\"\22\f\u011c\u011d\b\22\1\2\u011d"+
		"\u012f\3\2\2\2\u011e\u011f\5\36\20\2\u011f\u0120\b\22\1\2\u0120\u012f"+
		"\3\2\2\2\u0121\u0122\5\32\16\2\u0122\u0123\b\22\1\2\u0123\u012f\3\2\2"+
		"\2\u0124\u0125\7+\2\2\u0125\u012f\b\22\1\2\u0126\u0127\7-\2\2\u0127\u012f"+
		"\b\22\1\2\u0128\u0129\7.\2\2\u0129\u012f\b\22\1\2\u012a\u012b\7&\2\2\u012b"+
		"\u012f\b\22\1\2\u012c\u012d\7\'\2\2\u012d\u012f\b\22\1\2\u012e\u00f7\3"+
		"\2\2\2\u012e\u00fb\3\2\2\2\u012e\u00fe\3\2\2\2\u012e\u0103\3\2\2\2\u012e"+
		"\u0107\3\2\2\2\u012e\u010c\3\2\2\2\u012e\u0112\3\2\2\2\u012e\u011e\3\2"+
		"\2\2\u012e\u0121\3\2\2\2\u012e\u0124\3\2\2\2\u012e\u0126\3\2\2\2\u012e"+
		"\u0128\3\2\2\2\u012e\u012a\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u014f\3\2"+
		"\2\2\u0130\u0131\f\22\2\2\u0131\u0132\7\6\2\2\u0132\u0133\5\"\22\23\u0133"+
		"\u0134\b\22\1\2\u0134\u014e\3\2\2\2\u0135\u0136\f\20\2\2\u0136\u0137\t"+
		"\4\2\2\u0137\u0138\5\"\22\21\u0138\u0139\b\22\1\2\u0139\u014e\3\2\2\2"+
		"\u013a\u013b\f\17\2\2\u013b\u013c\t\5\2\2\u013c\u013d\5\"\22\20\u013d"+
		"\u013e\b\22\1\2\u013e\u014e\3\2\2\2\u013f\u0140\f\25\2\2\u0140\u0141\5"+
		"\22\n\2\u0141\u0142\b\22\1\2\u0142\u014e\3\2\2\2\u0143\u0144\f\13\2\2"+
		"\u0144\u0145\7\f\2\2\u0145\u0146\5\"\22\2\u0146\u0147\7\r\2\2\u0147\u0148"+
		"\b\22\1\2\u0148\u014e\3\2\2\2\u0149\u014a\f\n\2\2\u014a\u014b\7\35\2\2"+
		"\u014b\u014c\7+\2\2\u014c\u014e\b\22\1\2\u014d\u0130\3\2\2\2\u014d\u0135"+
		"\3\2\2\2\u014d\u013a\3\2\2\2\u014d\u013f\3\2\2\2\u014d\u0143\3\2\2\2\u014d"+
		"\u0149\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150#\3\2\2\2\u0151\u014f\3\2\2\2\33)\609OYiqz\u0083\u0089\u0092"+
		"\u0099\u00a5\u00ac\u00bd\u00c1\u00c9\u00d5\u00e1\u00ea\u00f5\u0116\u012e"+
		"\u014d\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}