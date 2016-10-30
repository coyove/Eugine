// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import java.util.HashMap;

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
		T__9=10, T__10=11, T__11=12, T__12=13, Var=14, Def=15, Add=16, Sub=17, 
		Integer=18, Double=19, NEWLINE=20, WS=21, Semi=22, Identifier=23, LETTER=24, 
		RawString=25, StringLiteral=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "Var", "Def", "Add", "Sub", "Integer", 
		"Double", "NEWLINE", "WS", "Semi", "Identifier", "LETTER", "RawString", 
		"StringLiteral", "SCharSequence", "SChar"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u00cc\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\6\23i\n\23\r\23\16\23j\3\24\6\24n"+
		"\n\24\r\24\16\24o\3\24\3\24\6\24t\n\24\r\24\16\24u\3\24\6\24y\n\24\r\24"+
		"\16\24z\3\24\3\24\6\24\177\n\24\r\24\16\24\u0080\3\24\3\24\5\24\u0085"+
		"\n\24\3\24\6\24\u0088\n\24\r\24\16\24\u0089\5\24\u008c\n\24\3\25\5\25"+
		"\u008f\n\25\3\25\3\25\3\25\3\25\3\26\6\26\u0096\n\26\r\26\16\26\u0097"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\5\30\u00a0\n\30\3\30\3\30\7\30\u00a4\n"+
		"\30\f\30\16\30\u00a7\13\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\7\32"+
		"\u00b1\n\32\f\32\16\32\u00b4\13\32\3\32\3\32\3\33\3\33\5\33\u00ba\n\33"+
		"\3\33\3\33\3\34\6\34\u00bf\n\34\r\34\16\34\u00c0\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\5\35\u00cb\n\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\29\2\3\2\13\3\2\62;\4\2GGgg\5\2--//^"+
		"^\4\2\13\13\"\"\4\2\62;aa\4\2C\\c|\3\2$$\6\2\f\f\17\17$$^^\f\2$$))AA^"+
		"^cdhhppttvvxx\u00dd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3;\3\2\2"+
		"\2\5B\3\2\2\2\7D\3\2\2\2\tF\3\2\2\2\13H\3\2\2\2\rJ\3\2\2\2\17L\3\2\2\2"+
		"\21N\3\2\2\2\23P\3\2\2\2\25R\3\2\2\2\27T\3\2\2\2\31V\3\2\2\2\33X\3\2\2"+
		"\2\35[\3\2\2\2\37_\3\2\2\2!c\3\2\2\2#e\3\2\2\2%h\3\2\2\2\'\u008b\3\2\2"+
		"\2)\u008e\3\2\2\2+\u0095\3\2\2\2-\u009b\3\2\2\2/\u009f\3\2\2\2\61\u00a8"+
		"\3\2\2\2\63\u00aa\3\2\2\2\65\u00b7\3\2\2\2\67\u00be\3\2\2\29\u00ca\3\2"+
		"\2\2;<\7k\2\2<=\7o\2\2=>\7r\2\2>?\7q\2\2?@\7t\2\2@A\7v\2\2A\4\3\2\2\2"+
		"BC\7?\2\2C\6\3\2\2\2DE\7*\2\2E\b\3\2\2\2FG\7.\2\2G\n\3\2\2\2HI\7+\2\2"+
		"I\f\3\2\2\2JK\7}\2\2K\16\3\2\2\2LM\7\177\2\2M\20\3\2\2\2NO\7<\2\2O\22"+
		"\3\2\2\2PQ\7]\2\2Q\24\3\2\2\2RS\7_\2\2S\26\3\2\2\2TU\7,\2\2U\30\3\2\2"+
		"\2VW\7\61\2\2W\32\3\2\2\2XY\7-\2\2YZ\7\60\2\2Z\34\3\2\2\2[\\\7x\2\2\\"+
		"]\7c\2\2]^\7t\2\2^\36\3\2\2\2_`\7f\2\2`a\7g\2\2ab\7h\2\2b \3\2\2\2cd\7"+
		"-\2\2d\"\3\2\2\2ef\7/\2\2f$\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2\2\2jh\3"+
		"\2\2\2jk\3\2\2\2k&\3\2\2\2ln\t\2\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pq\3\2\2\2qs\7\60\2\2rt\t\2\2\2sr\3\2\2\2tu\3\2\2\2us\3\2\2\2uv"+
		"\3\2\2\2v\u008c\3\2\2\2wy\t\2\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2"+
		"\2\2{|\3\2\2\2|~\7\60\2\2}\177\t\2\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084\t\3\2\2"+
		"\u0083\u0085\t\4\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087"+
		"\3\2\2\2\u0086\u0088\t\2\2\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\3\2\2\2\u008bm\3\2\2\2"+
		"\u008bx\3\2\2\2\u008c(\3\2\2\2\u008d\u008f\7\17\2\2\u008e\u008d\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\f\2\2\u0091\u0092"+
		"\3\2\2\2\u0092\u0093\b\25\2\2\u0093*\3\2\2\2\u0094\u0096\t\5\2\2\u0095"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0098\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u009a\b\26\2\2\u009a,\3\2\2\2\u009b\u009c"+
		"\7=\2\2\u009c.\3\2\2\2\u009d\u00a0\5\61\31\2\u009e\u00a0\7a\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a5\3\2\2\2\u00a1\u00a4\5\61"+
		"\31\2\u00a2\u00a4\t\6\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\60\3\2\2"+
		"\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\t\7\2\2\u00a9\62\3\2\2\2\u00aa\u00ab"+
		"\7B\2\2\u00ab\u00ac\7$\2\2\u00ac\u00b2\3\2\2\2\u00ad\u00b1\n\b\2\2\u00ae"+
		"\u00af\7$\2\2\u00af\u00b1\7$\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2"+
		"\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\64\3\2\2\2\u00b7"+
		"\u00b9\7$\2\2\u00b8\u00ba\5\67\34\2\u00b9\u00b8\3\2\2\2\u00b9\u00ba\3"+
		"\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\66\3\2\2\2\u00bd\u00bf"+
		"\59\35\2\u00be\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c18\3\2\2\2\u00c2\u00cb\n\t\2\2\u00c3\u00c4\7^\2\2\u00c4"+
		"\u00cb\t\n\2\2\u00c5\u00c6\7^\2\2\u00c6\u00cb\7\f\2\2\u00c7\u00c8\7^\2"+
		"\2\u00c8\u00c9\7\17\2\2\u00c9\u00cb\7\f\2\2\u00ca\u00c2\3\2\2\2\u00ca"+
		"\u00c3\3\2\2\2\u00ca\u00c5\3\2\2\2\u00ca\u00c7\3\2\2\2\u00cb:\3\2\2\2"+
		"\25\2jouz\u0080\u0084\u0089\u008b\u008e\u0097\u009f\u00a3\u00a5\u00b0"+
		"\u00b2\u00b9\u00c0\u00ca\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}