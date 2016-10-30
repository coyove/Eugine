// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;

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
		T__9=10, Var=11, Def=12, Add=13, Sub=14, Integer=15, Double=16, NEWLINE=17, 
		WS=18, Semi=19, Identifier=20, LETTER=21, DIGIT=22, RawString=23, StringLiteral=24;
	public static final int
		RULE_prog = 0, RULE_block = 1, RULE_stmt = 2, RULE_importStmt = 3, RULE_declareStmt = 4, 
		RULE_definitionsList = 5, RULE_defineStmt = 6, RULE_callStmt = 7, RULE_expr = 8;
	public static final String[] ruleNames = {
		"prog", "block", "stmt", "importStmt", "declareStmt", "definitionsList", 
		"defineStmt", "callStmt", "expr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'import'", "'='", "'('", "','", "')'", "'{'", "'}'", "'*'", "'/'", 
		"'+.'", "'var'", "'def'", "'+'", "'-'", null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "Var", 
		"Def", "Add", "Sub", "Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", 
		"LETTER", "DIGIT", "RawString", "StringLiteral"
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
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(18);
				((ProgContext)_localctx).block = block();
				 ((ProgContext)_localctx).v =  ((ProgContext)_localctx).block.v; 
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Var) | (1L << Def) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0) );
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
			setState(28); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(25);
					((BlockContext)_localctx).stmt = stmt();
					 ((SEChain) _localctx.v).expressions.add(((BlockContext)_localctx).stmt.v); 
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(30); 
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
			setState(49);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				importStmt();
				setState(33);
				match(Semi);
				 ((StmtContext)_localctx).v =  new SNull(); 
				}
				break;
			case Var:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				((StmtContext)_localctx).declareStmt = declareStmt();
				setState(37);
				match(Semi);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).declareStmt.v; 
				}
				break;
			case Def:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				((StmtContext)_localctx).defineStmt = defineStmt();
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).defineStmt.v; 
				}
				break;
			case T__2:
			case Integer:
			case Double:
			case Identifier:
			case RawString:
			case StringLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				((StmtContext)_localctx).expr = expr(0);
				setState(44);
				match(Semi);
				 ((StmtContext)_localctx).v =  ((StmtContext)_localctx).expr.v; 
				}
				break;
			case Semi:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
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
			setState(51);
			match(T__0);
			setState(52);
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
			setState(54);
			match(Var);
			setState(55);
			((DeclareStmtContext)_localctx).Identifier = match(Identifier);
			setState(56);
			match(T__1);
			setState(57);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				match(T__2);
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(61);
						((DefinitionsListContext)_localctx).InitArg = expr(0);
						setState(62);
						match(T__3);
						 _localctx.v.add((((DefinitionsListContext)_localctx).InitArg!=null?_input.getText(((DefinitionsListContext)_localctx).InitArg.start,((DefinitionsListContext)_localctx).InitArg.stop):null)); 
						}
						} 
					}
					setState(69);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(70);
				((DefinitionsListContext)_localctx).LastArg = expr(0);
				setState(71);
				match(T__4);

				        _localctx.v.add((((DefinitionsListContext)_localctx).LastArg!=null?_input.getText(((DefinitionsListContext)_localctx).LastArg.start,((DefinitionsListContext)_localctx).LastArg.stop):null));
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(T__2);
				setState(75);
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
			setState(78);
			match(Def);
			setState(79);
			((DefineStmtContext)_localctx).Identifier = match(Identifier);
			setState(80);
			((DefineStmtContext)_localctx).definitionsList = definitionsList();
			setState(82);
			_la = _input.LA(1);
			if (_la==RawString || _la==StringLiteral) {
				{
				setState(81);
				((DefineStmtContext)_localctx).Desc = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==RawString || _la==StringLiteral) ) {
					((DefineStmtContext)_localctx).Desc = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(84);
			match(T__5);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << Var) | (1L << Def) | (1L << Integer) | (1L << Double) | (1L << Semi) | (1L << Identifier) | (1L << RawString) | (1L << StringLiteral))) != 0)) {
				{
				{
				setState(85);
				((DefineStmtContext)_localctx).stmt = stmt();
				 _localctx.body.add(((DefineStmtContext)_localctx).stmt.v); 
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(T__6);

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
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				((CallStmtContext)_localctx).Identifier = match(Identifier);
				setState(97);
				match(T__2);
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						((CallStmtContext)_localctx).InitExpr = expr(0);
						setState(99);
						match(T__3);
						 _localctx.arguments.add(((CallStmtContext)_localctx).InitExpr.v); 
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				setState(107);
				((CallStmtContext)_localctx).LastExpr = expr(0);
				setState(108);
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
				setState(111);
				((CallStmtContext)_localctx).Identifier = match(Identifier);
				setState(112);
				match(T__2);
				setState(113);
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

	public static class ExprContext extends ParserRuleContext {
		public SExpression v;
		public ExprContext Left;
		public CallStmtContext callStmt;
		public Token Identifier;
		public Token RawString;
		public Token StringLiteral;
		public Token Integer;
		public Token Double;
		public ExprContext expr;
		public Token MathOp;
		public ExprContext Right;
		public Token Sub;
		public Token AddOp;
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(EugineParser.Identifier, 0); }
		public TerminalNode RawString() { return getToken(EugineParser.RawString, 0); }
		public TerminalNode StringLiteral() { return getToken(EugineParser.StringLiteral, 0); }
		public TerminalNode Integer() { return getToken(EugineParser.Integer, 0); }
		public TerminalNode Double() { return getToken(EugineParser.Double, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode Sub() { return getToken(EugineParser.Sub, 0); }
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
				((ExprContext)_localctx).callStmt = callStmt();
				 ((ExprContext)_localctx).v =  ((ExprContext)_localctx).callStmt.v; 
				}
				break;
			case 2:
				{
				setState(121);
				((ExprContext)_localctx).Identifier = match(Identifier);
				 ((ExprContext)_localctx).v =  new SEVariable((((ExprContext)_localctx).Identifier!=null?((ExprContext)_localctx).Identifier.getText():null)); 
				}
				break;
			case 3:
				{
				setState(123);
				((ExprContext)_localctx).RawString = match(RawString);

				                        String t = (((ExprContext)_localctx).RawString!=null?((ExprContext)_localctx).RawString.getText():null); 
				                        t = t.substring(1, t.length() - 1);
				                        ((ExprContext)_localctx).v =  new SString(t.replace("\"\"", "\""));
				                    
				}
				break;
			case 4:
				{
				setState(125);
				((ExprContext)_localctx).StringLiteral = match(StringLiteral);
				 String t = (((ExprContext)_localctx).StringLiteral!=null?((ExprContext)_localctx).StringLiteral.getText():null); ((ExprContext)_localctx).v =  new SString(t.substring(1, t.length() - 1)); 
				}
				break;
			case 5:
				{
				setState(127);
				((ExprContext)_localctx).Integer = match(Integer);
				 ((ExprContext)_localctx).v =  new SInteger((((ExprContext)_localctx).Integer!=null?((ExprContext)_localctx).Integer.getText():null)); 
				}
				break;
			case 6:
				{
				setState(129);
				((ExprContext)_localctx).Double = match(Double);
				 ((ExprContext)_localctx).v =  new SDouble((((ExprContext)_localctx).Double!=null?((ExprContext)_localctx).Double.getText():null)); 
				}
				break;
			case 7:
				{
				setState(131);
				match(T__2);
				setState(132);
				((ExprContext)_localctx).expr = expr(0);
				setState(133);
				match(T__4);
				 ((ExprContext)_localctx).v =  _localctx.v; 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(153);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						_localctx.Left = _prevctx;
						_localctx.Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(139);
						((ExprContext)_localctx).MathOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
							((ExprContext)_localctx).MathOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(140);
						((ExprContext)_localctx).Right = ((ExprContext)_localctx).expr = expr(10);
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
						setState(143);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(144);
						((ExprContext)_localctx).Sub = match(Sub);
						setState(145);
						((ExprContext)_localctx).Right = ((ExprContext)_localctx).expr = expr(9);
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
						setState(148);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(149);
						((ExprContext)_localctx).AddOp = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__9 || _la==Add) ) {
							((ExprContext)_localctx).AddOp = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(150);
						((ExprContext)_localctx).Right = ((ExprContext)_localctx).expr = expr(8);
						 ((ExprContext)_localctx).v =  SKeywordsANTLR.KeywordsLookup.get((((ExprContext)_localctx).AddOp!=null?((ExprContext)_localctx).AddOp.getText():null)).
						                                  call(((ExprContext)_localctx).AddOp, org.coyove.eugine.util.List.build(((ExprContext)_localctx).Left.v, ((ExprContext)_localctx).Right.v)); 
						}
						break;
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		case 8:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\32\u00a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\6\3\37\n\3\r\3\16\3 \3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\64\n"+
		"\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7D\n\7\f"+
		"\7\16\7G\13\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7O\n\7\3\b\3\b\3\b\3\b\5\bU\n"+
		"\b\3\b\3\b\3\b\3\b\7\b[\n\b\f\b\16\b^\13\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tv"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u008b\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\7\n\u009c\n\n\f\n\16\n\u009f\13\n\3\n\2\3\22\13\2\4\6\b"+
		"\n\f\16\20\22\2\5\3\2\31\32\3\2\n\13\4\2\f\f\17\17\u00ac\2\27\3\2\2\2"+
		"\4\36\3\2\2\2\6\63\3\2\2\2\b\65\3\2\2\2\n8\3\2\2\2\fN\3\2\2\2\16P\3\2"+
		"\2\2\20u\3\2\2\2\22\u008a\3\2\2\2\24\25\5\4\3\2\25\26\b\2\1\2\26\30\3"+
		"\2\2\2\27\24\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\3\3"+
		"\2\2\2\33\34\5\6\4\2\34\35\b\3\1\2\35\37\3\2\2\2\36\33\3\2\2\2\37 \3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!\5\3\2\2\2\"#\5\b\5\2#$\7\25\2\2$%\b\4\1\2"+
		"%\64\3\2\2\2&\'\5\n\6\2\'(\7\25\2\2()\b\4\1\2)\64\3\2\2\2*+\5\16\b\2+"+
		",\b\4\1\2,\64\3\2\2\2-.\5\22\n\2./\7\25\2\2/\60\b\4\1\2\60\64\3\2\2\2"+
		"\61\62\7\25\2\2\62\64\b\4\1\2\63\"\3\2\2\2\63&\3\2\2\2\63*\3\2\2\2\63"+
		"-\3\2\2\2\63\61\3\2\2\2\64\7\3\2\2\2\65\66\7\3\2\2\66\67\7\26\2\2\67\t"+
		"\3\2\2\289\7\r\2\29:\7\26\2\2:;\7\4\2\2;<\5\22\n\2<=\b\6\1\2=\13\3\2\2"+
		"\2>E\7\5\2\2?@\5\22\n\2@A\7\6\2\2AB\b\7\1\2BD\3\2\2\2C?\3\2\2\2DG\3\2"+
		"\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\5\22\n\2IJ\7\7\2\2JK\b"+
		"\7\1\2KO\3\2\2\2LM\7\5\2\2MO\7\7\2\2N>\3\2\2\2NL\3\2\2\2O\r\3\2\2\2PQ"+
		"\7\16\2\2QR\7\26\2\2RT\5\f\7\2SU\t\2\2\2TS\3\2\2\2TU\3\2\2\2UV\3\2\2\2"+
		"V\\\7\b\2\2WX\5\6\4\2XY\b\b\1\2Y[\3\2\2\2ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7\t\2\2`a\b\b\1\2a\17\3\2\2\2bc\7"+
		"\26\2\2cj\7\5\2\2de\5\22\n\2ef\7\6\2\2fg\b\t\1\2gi\3\2\2\2hd\3\2\2\2i"+
		"l\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\5\22\n\2no\7\7\2\2"+
		"op\b\t\1\2pv\3\2\2\2qr\7\26\2\2rs\7\5\2\2st\7\7\2\2tv\b\t\1\2ub\3\2\2"+
		"\2uq\3\2\2\2v\21\3\2\2\2wx\b\n\1\2xy\5\20\t\2yz\b\n\1\2z\u008b\3\2\2\2"+
		"{|\7\26\2\2|\u008b\b\n\1\2}~\7\31\2\2~\u008b\b\n\1\2\177\u0080\7\32\2"+
		"\2\u0080\u008b\b\n\1\2\u0081\u0082\7\21\2\2\u0082\u008b\b\n\1\2\u0083"+
		"\u0084\7\22\2\2\u0084\u008b\b\n\1\2\u0085\u0086\7\5\2\2\u0086\u0087\5"+
		"\22\n\2\u0087\u0088\7\7\2\2\u0088\u0089\b\n\1\2\u0089\u008b\3\2\2\2\u008a"+
		"w\3\2\2\2\u008a{\3\2\2\2\u008a}\3\2\2\2\u008a\177\3\2\2\2\u008a\u0081"+
		"\3\2\2\2\u008a\u0083\3\2\2\2\u008a\u0085\3\2\2\2\u008b\u009d\3\2\2\2\u008c"+
		"\u008d\f\13\2\2\u008d\u008e\t\3\2\2\u008e\u008f\5\22\n\f\u008f\u0090\b"+
		"\n\1\2\u0090\u009c\3\2\2\2\u0091\u0092\f\n\2\2\u0092\u0093\7\20\2\2\u0093"+
		"\u0094\5\22\n\13\u0094\u0095\b\n\1\2\u0095\u009c\3\2\2\2\u0096\u0097\f"+
		"\t\2\2\u0097\u0098\t\4\2\2\u0098\u0099\5\22\n\n\u0099\u009a\b\n\1\2\u009a"+
		"\u009c\3\2\2\2\u009b\u008c\3\2\2\2\u009b\u0091\3\2\2\2\u009b\u0096\3\2"+
		"\2\2\u009c\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\23\3\2\2\2\u009f\u009d\3\2\2\2\16\31 \63ENT\\ju\u008a\u009b\u009d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}