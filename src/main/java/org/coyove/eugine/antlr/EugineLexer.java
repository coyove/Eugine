// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;

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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, Var=11, Def=12, Add=13, Sub=14, Integer=15, Double=16, NEWLINE=17, 
		WS=18, Semi=19, Identifier=20, LETTER=21, DIGIT=22, RawString=23, StringLiteral=24;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "Var", "Def", "Add", "Sub", "Integer", "Double", "NEWLINE", "WS", 
		"Semi", "Identifier", "LETTER", "DIGIT", "RawString", "StringLiteral", 
		"SCharSequence", "SChar"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\32\u00af\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\6\20_\n\20\r\20\16"+
		"\20`\3\21\6\21d\n\21\r\21\16\21e\3\21\3\21\6\21j\n\21\r\21\16\21k\3\22"+
		"\5\22o\n\22\3\22\3\22\3\22\3\22\3\23\6\23v\n\23\r\23\16\23w\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\5\25\u0080\n\25\3\25\3\25\3\25\7\25\u0085\n\25\f"+
		"\25\16\25\u0088\13\25\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\7\30\u0094\n\30\f\30\16\30\u0097\13\30\3\30\3\30\3\31\3\31\5\31\u009d"+
		"\n\31\3\31\3\31\3\32\6\32\u00a2\n\32\r\32\16\32\u00a3\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\5\33\u00ae\n\33\2\2\34\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\2\65\2\3\2\b\3\2\62;\4\2\13\13\"\"\4\2C\\c|"+
		"\3\2$$\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u00bc\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3"+
		"\67\3\2\2\2\5>\3\2\2\2\7@\3\2\2\2\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17"+
		"H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27Q\3\2\2\2\31U\3\2\2\2"+
		"\33Y\3\2\2\2\35[\3\2\2\2\37^\3\2\2\2!c\3\2\2\2#n\3\2\2\2%u\3\2\2\2\'{"+
		"\3\2\2\2)\177\3\2\2\2+\u0089\3\2\2\2-\u008b\3\2\2\2/\u008d\3\2\2\2\61"+
		"\u009a\3\2\2\2\63\u00a1\3\2\2\2\65\u00ad\3\2\2\2\678\7k\2\289\7o\2\29"+
		":\7r\2\2:;\7q\2\2;<\7t\2\2<=\7v\2\2=\4\3\2\2\2>?\7?\2\2?\6\3\2\2\2@A\7"+
		"*\2\2A\b\3\2\2\2BC\7.\2\2C\n\3\2\2\2DE\7+\2\2E\f\3\2\2\2FG\7}\2\2G\16"+
		"\3\2\2\2HI\7\177\2\2I\20\3\2\2\2JK\7,\2\2K\22\3\2\2\2LM\7\61\2\2M\24\3"+
		"\2\2\2NO\7-\2\2OP\7\60\2\2P\26\3\2\2\2QR\7x\2\2RS\7c\2\2ST\7t\2\2T\30"+
		"\3\2\2\2UV\7f\2\2VW\7g\2\2WX\7h\2\2X\32\3\2\2\2YZ\7-\2\2Z\34\3\2\2\2["+
		"\\\7/\2\2\\\36\3\2\2\2]_\t\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2"+
		"\2a \3\2\2\2bd\t\2\2\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2"+
		"\2gi\7\60\2\2hj\t\2\2\2ih\3\2\2\2jk\3\2\2\2ki\3\2\2\2kl\3\2\2\2l\"\3\2"+
		"\2\2mo\7\17\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pq\7\f\2\2qr\3\2\2\2rs\b"+
		"\22\2\2s$\3\2\2\2tv\t\3\2\2ut\3\2\2\2vw\3\2\2\2wu\3\2\2\2wx\3\2\2\2xy"+
		"\3\2\2\2yz\b\23\2\2z&\3\2\2\2{|\7=\2\2|(\3\2\2\2}\u0080\5+\26\2~\u0080"+
		"\7a\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\u0086\3\2\2\2\u0081\u0085\5+\26"+
		"\2\u0082\u0085\7a\2\2\u0083\u0085\5-\27\2\u0084\u0081\3\2\2\2\u0084\u0082"+
		"\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087*\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\t\4\2\2"+
		"\u008a,\3\2\2\2\u008b\u008c\4\62;\2\u008c.\3\2\2\2\u008d\u008e\7B\2\2"+
		"\u008e\u008f\7$\2\2\u008f\u0095\3\2\2\2\u0090\u0094\n\5\2\2\u0091\u0092"+
		"\7$\2\2\u0092\u0094\7$\2\2\u0093\u0090\3\2\2\2\u0093\u0091\3\2\2\2\u0094"+
		"\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2"+
		"\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7$\2\2\u0099\60\3\2\2\2\u009a\u009c"+
		"\7$\2\2\u009b\u009d\5\63\32\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2"+
		"\u009d\u009e\3\2\2\2\u009e\u009f\7$\2\2\u009f\62\3\2\2\2\u00a0\u00a2\5"+
		"\65\33\2\u00a1\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\64\3\2\2\2\u00a5\u00ae\n\6\2\2\u00a6\u00a7\7^\2\2"+
		"\u00a7\u00ae\t\7\2\2\u00a8\u00a9\7^\2\2\u00a9\u00ae\7\f\2\2\u00aa\u00ab"+
		"\7^\2\2\u00ab\u00ac\7\17\2\2\u00ac\u00ae\7\f\2\2\u00ad\u00a5\3\2\2\2\u00ad"+
		"\u00a6\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00aa\3\2\2\2\u00ae\66\3\2\2"+
		"\2\20\2`eknw\177\u0084\u0086\u0093\u0095\u009c\u00a3\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}