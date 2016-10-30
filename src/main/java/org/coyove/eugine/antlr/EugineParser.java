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
		T__9=10, T__10=11, T__11=12, T__12=13, Var=14, Def=15, Add=16, Sub=17, 
		Integer=18, Double=19, NEWLINE=20, WS=21, Semi=22, Identifier=23, LETTER=24, 
		RawString=25, StringLiteral=26;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_stmt = 2, RULE_importStmt = 3, RULE_declareStmt = 4, 
		RULE_definitionsList = 5, RULE_defineStmt = 6, RULE_callStmt = 7, RULE_dict = 8, 
		RULE_pair = 9, RULE_list = 10, RULE_value = 11, RULE_expr = 12;
	public static final String[] ruleNames = {
		"prog", "block", "stmt", "importStmt", "declareStmt", "definitionsList", 
		"defineStmt", "callStmt", "dict", "pair", "list", "value", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'='", "'('", "','", "')'", "'{'", "'}'", "':'", "'['", 
		"']'", "'*'", "'/'", "'+.'", "'var'", "'def'", "'+'", "'-'", null, null, 
		null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "Var", "Def", "Add", "Sub", "Integer", "Double", "NEWLINE", 
		"WS", "Semi", "Identifier", "LETTER", "RawString", "StringLiteral"
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				((ProgContext)_localctx).block = block();
				 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << Var) | (1L << Def) | (1L << Sub) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0) );
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
		enterRule(_localctx, 2, RULE_block);
		 ((BlockContext)_localctx).v =  new SEChain(); 
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(33);
					((BlockContext)_localctx).stmt = stmt();
					 ((SEChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(38); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
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
		public DeclareStmtContext declareStmt;
		public DefineStmtContext defineStmt;
		public ExprContext expr;
		public ImportStmtContext importStmt() {
			return getRuleContext(ImportStmtContext.class,0);
		}
		public TerminalNode Semi() { return getToken(EugineParser.Semi, 0); }
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
		enterRule(_localctx, 4, RULE_stmt);
		try {
			setState(57);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				importStmt();
				setState(41);
				match(Semi);
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				((StmtContext)_localctx).declareStmt = declareStmt();
				setState(45);
				match(Semi);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__2:
			case T__5:
			case T__8:
			case Sub:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				((StmtContext)_localctx).expr = expr(0);
				setState(52);
				match(Semi);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
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
		enterRule(_localctx, 6, RULE_importStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__0);
			setState(60);
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
		enterRule(_localctx, 8, RULE_declareStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(Var);
			setState(63);
			((DeclareStmtContext)_localctx).Identifier = match(Identifier);
			setState(64);
			match(T__1);
			setState(65);
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
		public ExprContext InitArg;
		public ExprContext LastArg;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 10, RULE_definitionsList);
		try {
			int _alt;
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(T__2);
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(69);
						((DefinitionsListContext)_localctx).InitArg = expr(0);
						setState(70);
						match(T__3);
						 _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?_input.getText(((DefinitionsListContext)_localctx).InitArg.start,((DefinitionsListContext)_localctx).InitArg.stop):null)); 
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(78);
				((DefinitionsListContext)_localctx).LastArg = expr(0);
				setState(79);
				match(T__4);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?_input.getText(((DefinitionsListContext)_localctx).LastArg.start,((DefinitionsListContext)_localctx).LastArg.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(T__2);
				setState(83);
				match(T__4);
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
		enterRule(_localctx, 12, RULE_defineStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(Def);
			setState(87);
			((DefineStmtContext)_localctx).Identifier = match(Identifier);
			setState(88);
			((DefineStmtContext)_localctx).definitionsList = definitionsList();
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(89);
				((DefineStmtContext)_localctx).Desc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				{
				setState(92);
				match(T__5);
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__5) | (1L << T__8) | (1L << Var) | (1L << Def) | (1L << Sub) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
					{
					{
					setState(93);
					((DefineStmtContext)_localctx).stmt = stmt();
					 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
					}
					}
					setState(100);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				match(T__6);
				}
				}
				break;
			case 2:
				{
				{
				setState(102);
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

	public static class CallStmtContext extends ParserRuleContext {
		public SExpression v;
		public org.coyove.eugine.util.List<SExpression> arguments =  
		        new org.coyove.eugine.util.List<SExpression>();
		public Token Identifier;
		public ExprContext InitExpr;
		public ExprContext LastExpr;
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 14, RULE_callStmt);
		try {
			int _alt;
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				((CallStmtContext)_localctx).Identifier = match(Identifier);
				setState(110);
				match(T__2);
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(111);
						((CallStmtContext)_localctx).InitExpr = expr(0);
						setState(112);
						match(T__3);
						 _localctx.arguments.add(((CallStmtContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(119);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(120);
				((CallStmtContext)_localctx).LastExpr = expr(0);
				setState(121);
				match(T__4);

				        _localctx.arguments.add(((CallStmtContext)_localctx).LastExpr.v);
				        String func = (((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null);

				        if (SKeywordsANTLR.KeywordsLookup.containsKey(func)) {
				            ((CallStmtContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get(func).call(((CallStmtContext)_localctx).Identifier, _localctx.arguments); 
				        } else {
				            ((CallStmtContext)_localctx).v =  new SECall(new SEVariable((((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null)), _localctx.arguments, new Atom(((CallStmtContext)_localctx).Identifier), null);
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				((CallStmtContext)_localctx).Identifier = match(Identifier);
				setState(125);
				match(T__2);
				setState(126);
				match(T__4);

				        ((CallStmtContext)_localctx).v =  new SECall(new SEVariable((((CallStmtContext)_localctx).Identifier!=null?((CallStmtContext)_localctx).Identifier.getText():null)), _localctx.arguments, new Atom(((CallStmtContext)_localctx).Identifier), null);
				    
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
		enterRule(_localctx, 16, RULE_dict);
		int _la;
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__5);
				setState(131);
				((DictContext)_localctx).pair = pair();
				 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(133);
					match(T__3);
					setState(134);
					((DictContext)_localctx).pair = pair();
					 _localctx.ret.put(((DictContext)_localctx).pair.k, ((DictContext)_localctx).pair.v); 
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__6);
				 ((DictContext)_localctx).v =  new SDict(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__5);
				setState(146);
				match(T__6);
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
		enterRule(_localctx, 18, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((PairContext)_localctx).Key = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) ) {
				((PairContext)_localctx).Key = (Token)_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(151);
			match(T__7);
			setState(152);
			((PairContext)_localctx).Value = value();
			 ((PairContext)_localctx).k =  (((PairContext)_localctx).Key!=null?((PairContext)_localctx).Key.getText():null); ((PairContext)_localctx).v =  ((PairContext)_localctx).Value.v; 
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
		enterRule(_localctx, 20, RULE_list);
		int _la;
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(T__8);
				{
				setState(156);
				((ListContext)_localctx).value = value();
				 _localctx.ret.add(((ListContext)_localctx).value.v); 
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(159);
					match(T__3);
					setState(160);
					((ListContext)_localctx).value = value();
					 _localctx.ret.add(((ListContext)_localctx).value.v); 
					}
					}
					setState(167);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(168);
				match(T__9);
				 ((ListContext)_localctx).v =  new SList(_localctx.ret); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(T__8);
				setState(172);
				match(T__9);
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
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				((ValueContext)_localctx).expr = expr(0);
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).expr.v; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				((ValueContext)_localctx).dict = dict();
				 ((ValueContext)_localctx).v =  ((ValueContext)_localctx).dict.v; 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
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
		public ExprContext Left;
		public Token Sub;
		public ExprContext Right;
		public Token Identifier;
		public Token RawString;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
		public ExprContext Inner;
		public CallStmtContext callStmt;
		public ListContext list;
		public DictContext dict;
		public Token MathOp;
		public Token AddOp;
		public TerminalNode Sub() { return getToken(EugineParser.Sub, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode Integer() { return getToken(EugineParser.Integer, 0); }
		public TerminalNode Double() { return getToken(EugineParser.Double, 0); }
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
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
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(188);
				((ExprContext)_localctx).Sub = match(Sub);
				setState(189);
				((ExprContext)_localctx).Right = expr(13);

				            if (((ExprContext)_localctx).Right.v instanceof SInteger) {
				                ((ExprContext)_localctx).v =  new SInteger(-((SInteger) ((ExprContext)_localctx).Right.v).<Long>get());
				            } else if (((ExprContext)_localctx).Right.v instanceof SDouble) {
				                ((ExprContext)_localctx).v =  new SDouble(-((SDouble) ((ExprContext)_localctx).Right.v).<Double>get());
				            } else {
				                ((ExprContext)_localctx).v =  new SEReverse(new Atom(((ExprContext)_localctx).Sub), org.coyove.eugine.util.List.build(((ExprContext)_localctx).Right.v)); 
				            }
				        
				}
				break;
			case 2:
				{
				setState(192);
				((ExprContext)_localctx).Identifier = match(Identifier);
				 ((ExprContext)_localctx).v =  new SEVariable((((ExprContext)_localctx).Identifier!=null?((ExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 3:
				{
				setState(194);
				((ExprContext)_localctx).RawString = match(RawString);

				            String t = (((ExprContext)_localctx).RawString!=null?((ExprContext)_localctx).RawString.getText():null); 
				            t = t.substring(1, t.length() - 1);
				            ((ExprContext)_localctx).v =  new SString(t.replace("\"\"", "\""));
				        
				}
				break;
			case 4:
				{
				setState(196);
				((ExprContext)_localctx).StringLiteral = match(StringLiteral);
				 
				            String t = (((ExprContext)_localctx).StringLiteral!=null?((ExprContext)_localctx).StringLiteral.getText():null); 
				            ((ExprContext)_localctx).v =  new SString(t.substring(1, t.length() - 1)); 
				        
				}
				break;
			case 5:
				{
				setState(198);
				((ExprContext)_localctx).Integer = match(Integer);
				 ((ExprContext)_localctx).v =  new SInteger((((ExprContext)_localctx).Integer!=null?((ExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 6:
				{
				setState(200);
				((ExprContext)_localctx).Double = match(Double);
				 ((ExprContext)_localctx).v =  new SDouble((((ExprContext)_localctx).Double!=null?((ExprContext)_localctx).Double.getText():null)); 
				}
				break;
			case 7:
				{
				setState(202);
				match(T__2);
				setState(203);
				((ExprContext)_localctx).Inner = expr(0);
				setState(204);
				match(T__4);
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).Inner.v; 
				}
				break;
			case 8:
				{
				setState(207);
				((ExprContext)_localctx).callStmt = callStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).callStmt.v; 
				}
				break;
			case 9:
				{
				setState(210);
				((ExprContext)_localctx).list = list();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).list.v; 
				}
				break;
			case 10:
				{
				setState(213);
				((ExprContext)_localctx).dict = dict();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).dict.v; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(219);
						((ExprContext)_localctx).MathOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__11) ) {
							((ExprContext)_localctx).MathOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(220);
						((ExprContext)_localctx).Right = expr(13);
						 
						                      ((ExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((ExprContext)_localctx).MathOp!=null?((ExprContext)_localctx).MathOp.getText():null)).
						                      call(((ExprContext)_localctx).MathOp, org.coyove.eugine.util.List.build(((ExprContext)_localctx).Left.v, ((ExprContext)_localctx).Right.v)); 
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(223);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(224);
						((ExprContext)_localctx).Sub = match(Sub);
						setState(225);
						((ExprContext)_localctx).Right = expr(12);
						 
						                      ((ExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get("-").
						                      call(((ExprContext)_localctx).Sub, org.coyove.eugine.util.List.build(((ExprContext)_localctx).Left.v, ((ExprContext)_localctx).Right.v)); 
						                  
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(228);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(229);
						((ExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__12 || _la==Add) ) {
							((ExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(230);
						((ExprContext)_localctx).Right = expr(11);
						 
						                      ((ExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((ExprContext)_localctx).AddOp!=null?((ExprContext)_localctx).AddOp.getText():null)).
						                      call(((ExprContext)_localctx).AddOp, org.coyove.eugine.util.List.build(((ExprContext)_localctx).Left.v, ((ExprContext)_localctx).Right.v)); 
						                  
						}
						break;
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u00f1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\6\3\'\n\3\r\3\16\3(\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7"+
		"W\n\7\3\b\3\b\3\b\3\b\5\b]\n\b\3\b\3\b\3\b\3\b\7\bc\n\b\f\b\16\bf\13\b"+
		"\3\b\3\b\3\b\3\b\5\bl\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\7\tv\n\t\f\t"+
		"\16\ty\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0083\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u008c\n\n\f\n\16\n\u008f\13\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\5\n\u0097\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\7\f\u00a6\n\f\f\f\16\f\u00a9\13\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b1"+
		"\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00bc\n\r\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00db"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u00ec\n\16\f\16\16\16\u00ef\13\16\3\16\2\3\32\17\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\2\6\3\2\33\34\4\2\31\31\33\34\3\2\r\16\4\2"+
		"\17\17\22\22\u0102\2\37\3\2\2\2\4&\3\2\2\2\6;\3\2\2\2\b=\3\2\2\2\n@\3"+
		"\2\2\2\fV\3\2\2\2\16X\3\2\2\2\20\u0082\3\2\2\2\22\u0096\3\2\2\2\24\u0098"+
		"\3\2\2\2\26\u00b0\3\2\2\2\30\u00bb\3\2\2\2\32\u00da\3\2\2\2\34\35\5\4"+
		"\3\2\35\36\b\2\1\2\36 \3\2\2\2\37\34\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"\3\3\2\2\2#$\5\6\4\2$%\b\3\1\2%\'\3\2\2\2&#\3\2\2\2\'(\3\2\2"+
		"\2(&\3\2\2\2()\3\2\2\2)\5\3\2\2\2*+\5\b\5\2+,\7\30\2\2,-\b\4\1\2-<\3\2"+
		"\2\2./\5\n\6\2/\60\7\30\2\2\60\61\b\4\1\2\61<\3\2\2\2\62\63\5\16\b\2\63"+
		"\64\b\4\1\2\64<\3\2\2\2\65\66\5\32\16\2\66\67\7\30\2\2\678\b\4\1\28<\3"+
		"\2\2\29:\7\30\2\2:<\b\4\1\2;*\3\2\2\2;.\3\2\2\2;\62\3\2\2\2;\65\3\2\2"+
		"\2;9\3\2\2\2<\7\3\2\2\2=>\7\3\2\2>?\7\31\2\2?\t\3\2\2\2@A\7\20\2\2AB\7"+
		"\31\2\2BC\7\4\2\2CD\5\32\16\2DE\b\6\1\2E\13\3\2\2\2FM\7\5\2\2GH\5\32\16"+
		"\2HI\7\6\2\2IJ\b\7\1\2JL\3\2\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2"+
		"\2NP\3\2\2\2OM\3\2\2\2PQ\5\32\16\2QR\7\7\2\2RS\b\7\1\2SW\3\2\2\2TU\7\5"+
		"\2\2UW\7\7\2\2VF\3\2\2\2VT\3\2\2\2W\r\3\2\2\2XY\7\21\2\2YZ\7\31\2\2Z\\"+
		"\5\f\7\2[]\t\2\2\2\\[\3\2\2\2\\]\3\2\2\2]k\3\2\2\2^d\7\b\2\2_`\5\6\4\2"+
		"`a\b\b\1\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2"+
		"fd\3\2\2\2gl\7\t\2\2hi\5\6\4\2ij\b\b\1\2jl\3\2\2\2k^\3\2\2\2kh\3\2\2\2"+
		"lm\3\2\2\2mn\b\b\1\2n\17\3\2\2\2op\7\31\2\2pw\7\5\2\2qr\5\32\16\2rs\7"+
		"\6\2\2st\b\t\1\2tv\3\2\2\2uq\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3"+
		"\2\2\2yw\3\2\2\2z{\5\32\16\2{|\7\7\2\2|}\b\t\1\2}\u0083\3\2\2\2~\177\7"+
		"\31\2\2\177\u0080\7\5\2\2\u0080\u0081\7\7\2\2\u0081\u0083\b\t\1\2\u0082"+
		"o\3\2\2\2\u0082~\3\2\2\2\u0083\21\3\2\2\2\u0084\u0085\7\b\2\2\u0085\u0086"+
		"\5\24\13\2\u0086\u008d\b\n\1\2\u0087\u0088\7\6\2\2\u0088\u0089\5\24\13"+
		"\2\u0089\u008a\b\n\1\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0091\7\t\2\2\u0091\u0092\b\n\1\2\u0092\u0097\3\2"+
		"\2\2\u0093\u0094\7\b\2\2\u0094\u0095\7\t\2\2\u0095\u0097\b\n\1\2\u0096"+
		"\u0084\3\2\2\2\u0096\u0093\3\2\2\2\u0097\23\3\2\2\2\u0098\u0099\t\3\2"+
		"\2\u0099\u009a\7\n\2\2\u009a\u009b\5\30\r\2\u009b\u009c\b\13\1\2\u009c"+
		"\25\3\2\2\2\u009d\u009e\7\13\2\2\u009e\u009f\5\30\r\2\u009f\u00a0\b\f"+
		"\1\2\u00a0\u00a7\3\2\2\2\u00a1\u00a2\7\6\2\2\u00a2\u00a3\5\30\r\2\u00a3"+
		"\u00a4\b\f\1\2\u00a4\u00a6\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00aa\u00ab\7\f\2\2\u00ab\u00ac\b\f\1\2\u00ac\u00b1\3\2"+
		"\2\2\u00ad\u00ae\7\13\2\2\u00ae\u00af\7\f\2\2\u00af\u00b1\b\f\1\2\u00b0"+
		"\u009d\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b1\27\3\2\2\2\u00b2\u00b3\5\32\16"+
		"\2\u00b3\u00b4\b\r\1\2\u00b4\u00bc\3\2\2\2\u00b5\u00b6\5\22\n\2\u00b6"+
		"\u00b7\b\r\1\2\u00b7\u00bc\3\2\2\2\u00b8\u00b9\5\26\f\2\u00b9\u00ba\b"+
		"\r\1\2\u00ba\u00bc\3\2\2\2\u00bb\u00b2\3\2\2\2\u00bb\u00b5\3\2\2\2\u00bb"+
		"\u00b8\3\2\2\2\u00bc\31\3\2\2\2\u00bd\u00be\b\16\1\2\u00be\u00bf\7\23"+
		"\2\2\u00bf\u00c0\5\32\16\17\u00c0\u00c1\b\16\1\2\u00c1\u00db\3\2\2\2\u00c2"+
		"\u00c3\7\31\2\2\u00c3\u00db\b\16\1\2\u00c4\u00c5\7\33\2\2\u00c5\u00db"+
		"\b\16\1\2\u00c6\u00c7\7\34\2\2\u00c7\u00db\b\16\1\2\u00c8\u00c9\7\24\2"+
		"\2\u00c9\u00db\b\16\1\2\u00ca\u00cb\7\25\2\2\u00cb\u00db\b\16\1\2\u00cc"+
		"\u00cd\7\5\2\2\u00cd\u00ce\5\32\16\2\u00ce\u00cf\7\7\2\2\u00cf\u00d0\b"+
		"\16\1\2\u00d0\u00db\3\2\2\2\u00d1\u00d2\5\20\t\2\u00d2\u00d3\b\16\1\2"+
		"\u00d3\u00db\3\2\2\2\u00d4\u00d5\5\26\f\2\u00d5\u00d6\b\16\1\2\u00d6\u00db"+
		"\3\2\2\2\u00d7\u00d8\5\22\n\2\u00d8\u00d9\b\16\1\2\u00d9\u00db\3\2\2\2"+
		"\u00da\u00bd\3\2\2\2\u00da\u00c2\3\2\2\2\u00da\u00c4\3\2\2\2\u00da\u00c6"+
		"\3\2\2\2\u00da\u00c8\3\2\2\2\u00da\u00ca\3\2\2\2\u00da\u00cc\3\2\2\2\u00da"+
		"\u00d1\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d7\3\2\2\2\u00db\u00ed\3\2"+
		"\2\2\u00dc\u00dd\f\16\2\2\u00dd\u00de\t\4\2\2\u00de\u00df\5\32\16\17\u00df"+
		"\u00e0\b\16\1\2\u00e0\u00ec\3\2\2\2\u00e1\u00e2\f\r\2\2\u00e2\u00e3\7"+
		"\23\2\2\u00e3\u00e4\5\32\16\16\u00e4\u00e5\b\16\1\2\u00e5\u00ec\3\2\2"+
		"\2\u00e6\u00e7\f\f\2\2\u00e7\u00e8\t\5\2\2\u00e8\u00e9\5\32\16\r\u00e9"+
		"\u00ea\b\16\1\2\u00ea\u00ec\3\2\2\2\u00eb\u00dc\3\2\2\2\u00eb\u00e1\3"+
		"\2\2\2\u00eb\u00e6\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\33\3\2\2\2\u00ef\u00ed\3\2\2\2\24!(;MV\\dkw\u0082"+
		"\u008d\u0096\u00a7\u00b0\u00bb\u00da\u00eb\u00ed";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}