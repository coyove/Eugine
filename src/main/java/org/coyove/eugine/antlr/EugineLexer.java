// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EugineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MUL=4, DIV=5, ADD=6, SUB=7, VAR=8, Integer=9, 
		Double=10, NEWLINE=11, WS=12, SEMI=13, ID=14, LETTER=15, DIGIT=16, StringLiteral=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "MUL", "DIV", "ADD", "SUB", "VAR", "Integer", 
		"Double", "NEWLINE", "WS", "SEMI", "ID", "LETTER", "DIGIT", "StringLiteral", 
		"SCharSequence", "SChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'*'", "'/'", "'+'", "'-'", "'var'", null, 
		null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MUL", "DIV", "ADD", "SUB", "VAR", "Integer", 
		"Double", "NEWLINE", "WS", "SEMI", "ID", "LETTER", "DIGIT", "StringLiteral"
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


	public EugineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eugine.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u0080\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\n\6\n=\n\n\r\n\16\n>\3\13\6\13B\n\13\r"+
		"\13\16\13C\3\13\3\13\6\13H\n\13\r\13\16\13I\3\f\5\fM\n\f\3\f\3\f\3\f\3"+
		"\f\3\r\6\rT\n\r\r\r\16\rU\3\r\3\r\3\16\3\16\3\17\3\17\5\17^\n\17\3\17"+
		"\3\17\3\17\7\17c\n\17\f\17\16\17f\13\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\5\22n\n\22\3\22\3\22\3\23\6\23s\n\23\r\23\16\23t\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\177\n\24\2\2\25\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\2\3\2\7\3"+
		"\2\62;\4\2\13\13\"\"\4\2C\\c|\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvv"+
		"xx\u008b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\3)\3\2\2\2\5+\3\2\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2"+
		"\2\r\63\3\2\2\2\17\65\3\2\2\2\21\67\3\2\2\2\23<\3\2\2\2\25A\3\2\2\2\27"+
		"L\3\2\2\2\31S\3\2\2\2\33Y\3\2\2\2\35]\3\2\2\2\37g\3\2\2\2!i\3\2\2\2#k"+
		"\3\2\2\2%r\3\2\2\2\'~\3\2\2\2)*\7?\2\2*\4\3\2\2\2+,\7*\2\2,\6\3\2\2\2"+
		"-.\7+\2\2.\b\3\2\2\2/\60\7,\2\2\60\n\3\2\2\2\61\62\7\61\2\2\62\f\3\2\2"+
		"\2\63\64\7-\2\2\64\16\3\2\2\2\65\66\7/\2\2\66\20\3\2\2\2\678\7x\2\289"+
		"\7c\2\29:\7t\2\2:\22\3\2\2\2;=\t\2\2\2<;\3\2\2\2=>\3\2\2\2><\3\2\2\2>"+
		"?\3\2\2\2?\24\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2"+
		"\2DE\3\2\2\2EG\7\60\2\2FH\t\2\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2"+
		"\2\2J\26\3\2\2\2KM\7\17\2\2LK\3\2\2\2LM\3\2\2\2MN\3\2\2\2NO\7\f\2\2OP"+
		"\3\2\2\2PQ\b\f\2\2Q\30\3\2\2\2RT\t\3\2\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2"+
		"UV\3\2\2\2VW\3\2\2\2WX\b\r\2\2X\32\3\2\2\2YZ\7=\2\2Z\34\3\2\2\2[^\5\37"+
		"\20\2\\^\7a\2\2][\3\2\2\2]\\\3\2\2\2^d\3\2\2\2_c\5\37\20\2`c\7a\2\2ac"+
		"\5!\21\2b_\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e"+
		"\36\3\2\2\2fd\3\2\2\2gh\t\4\2\2h \3\2\2\2ij\4\62;\2j\"\3\2\2\2km\7$\2"+
		"\2ln\5%\23\2ml\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7$\2\2p$\3\2\2\2qs\5\'\24"+
		"\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u&\3\2\2\2v\177\n\5\2\2wx\7"+
		"^\2\2x\177\t\6\2\2yz\7^\2\2z\177\7\f\2\2{|\7^\2\2|}\7\17\2\2}\177\7\f"+
		"\2\2~v\3\2\2\2~w\3\2\2\2~y\3\2\2\2~{\3\2\2\2\177(\3\2\2\2\16\2>CILU]b"+
		"dmt~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}