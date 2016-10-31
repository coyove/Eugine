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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, Var=28, Def=29, For=30, If=31, Else=32, 
		Add=33, Sub=34, AryOp=35, Integer=36, Double=37, NEWLINE=38, WS=39, Semi=40, 
		Identifier=41, LETTER=42, RawString=43, StringLiteral=44;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "Var", "Def", "For", "If", "Else", "Add", "Sub", "AryOp", 
		"Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", "LETTER", 
		"RawString", "StringLiteral", "SCharSequence", "SChar"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2.\u0139\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u00b6\n\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\5$\u00ce\n$\3%\6%\u00d1\n%\r%\16%\u00d2\3&\6&\u00d6"+
		"\n&\r&\16&\u00d7\3&\3&\6&\u00dc\n&\r&\16&\u00dd\3&\6&\u00e1\n&\r&\16&"+
		"\u00e2\3&\3&\6&\u00e7\n&\r&\16&\u00e8\3&\3&\5&\u00ed\n&\3&\6&\u00f0\n"+
		"&\r&\16&\u00f1\5&\u00f4\n&\3\'\5\'\u00f7\n\'\3\'\3\'\3\'\3\'\3(\6(\u00fe"+
		"\n(\r(\16(\u00ff\3(\3(\3)\3)\3*\3*\5*\u0108\n*\3*\3*\7*\u010c\n*\f*\16"+
		"*\u010f\13*\3*\3*\3*\5*\u0114\n*\3+\3+\3,\3,\3,\3,\3,\3,\7,\u011e\n,\f"+
		",\16,\u0121\13,\3,\3,\3-\3-\5-\u0127\n-\3-\3-\3.\6.\u012c\n.\r.\16.\u012d"+
		"\3/\3/\3/\3/\3/\3/\3/\3/\5/\u0138\n/\2\2\60\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[\2]\2\3\2\r\6\2\'\',,//\61\61\4\2>>@@\3\2\62;\4\2GGgg\5\2--//^"+
		"^\4\2\13\13\"\"\4\2\62;aa\4\2C\\c|\3\2$$\6\2\f\f\17\17$$^^\f\2$$))AA^"+
		"^cdhhppttvvxx\u0151\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q"+
		"\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\3_\3\2\2\2\5a\3\2"+
		"\2\2\7c\3\2\2\2\tj\3\2\2\2\13l\3\2\2\2\rn\3\2\2\2\17p\3\2\2\2\21r\3\2"+
		"\2\2\23u\3\2\2\2\25w\3\2\2\2\27y\3\2\2\2\31{\3\2\2\2\33}\3\2\2\2\35\177"+
		"\3\2\2\2\37\u0081\3\2\2\2!\u0084\3\2\2\2#\u0087\3\2\2\2%\u0089\3\2\2\2"+
		"\'\u008b\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0094\3\2\2\2/\u0097\3"+
		"\2\2\2\61\u009a\3\2\2\2\63\u009d\3\2\2\2\65\u00a0\3\2\2\2\67\u00a4\3\2"+
		"\2\29\u00a6\3\2\2\2;\u00aa\3\2\2\2=\u00b5\3\2\2\2?\u00b7\3\2\2\2A\u00ba"+
		"\3\2\2\2C\u00bf\3\2\2\2E\u00c1\3\2\2\2G\u00cd\3\2\2\2I\u00d0\3\2\2\2K"+
		"\u00f3\3\2\2\2M\u00f6\3\2\2\2O\u00fd\3\2\2\2Q\u0103\3\2\2\2S\u0107\3\2"+
		"\2\2U\u0115\3\2\2\2W\u0117\3\2\2\2Y\u0124\3\2\2\2[\u012b\3\2\2\2]\u0137"+
		"\3\2\2\2_`\7}\2\2`\4\3\2\2\2ab\7\177\2\2b\6\3\2\2\2cd\7k\2\2de\7o\2\2"+
		"ef\7r\2\2fg\7q\2\2gh\7t\2\2hi\7v\2\2i\b\3\2\2\2jk\7?\2\2k\n\3\2\2\2lm"+
		"\7*\2\2m\f\3\2\2\2no\7.\2\2o\16\3\2\2\2pq\7+\2\2q\20\3\2\2\2rs\7?\2\2"+
		"st\7@\2\2t\22\3\2\2\2uv\7<\2\2v\24\3\2\2\2wx\7]\2\2x\26\3\2\2\2yz\7_\2"+
		"\2z\30\3\2\2\2{|\7,\2\2|\32\3\2\2\2}~\7\61\2\2~\34\3\2\2\2\177\u0080\7"+
		"\'\2\2\u0080\36\3\2\2\2\u0081\u0082\7?\2\2\u0082\u0083\7?\2\2\u0083 \3"+
		"\2\2\2\u0084\u0085\7#\2\2\u0085\u0086\7?\2\2\u0086\"\3\2\2\2\u0087\u0088"+
		"\7@\2\2\u0088$\3\2\2\2\u0089\u008a\7>\2\2\u008a&\3\2\2\2\u008b\u008c\7"+
		"@\2\2\u008c\u008d\7?\2\2\u008d(\3\2\2\2\u008e\u008f\7>\2\2\u008f\u0090"+
		"\7?\2\2\u0090*\3\2\2\2\u0091\u0092\7(\2\2\u0092\u0093\7(\2\2\u0093,\3"+
		"\2\2\2\u0094\u0095\7~\2\2\u0095\u0096\7~\2\2\u0096.\3\2\2\2\u0097\u0098"+
		"\7-\2\2\u0098\u0099\7\60\2\2\u0099\60\3\2\2\2\u009a\u009b\7f\2\2\u009b"+
		"\u009c\7q\2\2\u009c\62\3\2\2\2\u009d\u009e\7\60\2\2\u009e\u009f\7\60\2"+
		"\2\u009f\64\3\2\2\2\u00a0\u00a1\7\60\2\2\u00a1\u00a2\7\60\2\2\u00a2\u00a3"+
		"\7\60\2\2\u00a3\66\3\2\2\2\u00a4\u00a5\7\60\2\2\u00a58\3\2\2\2\u00a6\u00a7"+
		"\7x\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9:\3\2\2\2\u00aa\u00ab"+
		"\7f\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7h\2\2\u00ad<\3\2\2\2\u00ae\u00af"+
		"\7h\2\2\u00af\u00b0\7q\2\2\u00b0\u00b6\7t\2\2\u00b1\u00b2\7h\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b6\7t\2\2\u00b5\u00ae\3\2\2"+
		"\2\u00b5\u00b1\3\2\2\2\u00b6>\3\2\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7"+
		"h\2\2\u00b9@\3\2\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7n\2\2\u00bc\u00bd"+
		"\7u\2\2\u00bd\u00be\7g\2\2\u00beB\3\2\2\2\u00bf\u00c0\7-\2\2\u00c0D\3"+
		"\2\2\2\u00c1\u00c2\7/\2\2\u00c2F\3\2\2\2\u00c3\u00ce\t\2\2\2\u00c4\u00c5"+
		"\7?\2\2\u00c5\u00ce\7?\2\2\u00c6\u00c7\7#\2\2\u00c7\u00ce\7?\2\2\u00c8"+
		"\u00ce\t\3\2\2\u00c9\u00ca\7@\2\2\u00ca\u00ce\7?\2\2\u00cb\u00cc\7>\2"+
		"\2\u00cc\u00ce\7?\2\2\u00cd\u00c3\3\2\2\2\u00cd\u00c4\3\2\2\2\u00cd\u00c6"+
		"\3\2\2\2\u00cd\u00c8\3\2\2\2\u00cd\u00c9\3\2\2\2\u00cd\u00cb\3\2\2\2\u00ce"+
		"H\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3J\3\2\2\2\u00d4\u00d6\t"+
		"\4\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db\7\60\2\2\u00da\u00dc\t"+
		"\4\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00f4\3\2\2\2\u00df\u00e1\t\4\2\2\u00e0\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\u00e6\7\60\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5\3"+
		"\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00ec\t\5\2\2\u00eb\u00ed\t\6\2\2\u00ec\u00eb\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00f0\t\4\2\2\u00ef"+
		"\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\3\2\2\2\u00f3\u00d5\3\2\2\2\u00f3\u00e0\3\2\2\2\u00f4"+
		"L\3\2\2\2\u00f5\u00f7\7\17\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\f\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\b\'\2\2\u00fbN\3\2\2\2\u00fc\u00fe\t\7\2\2\u00fd\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2"+
		"\2\2\u0101\u0102\b(\2\2\u0102P\3\2\2\2\u0103\u0104\7=\2\2\u0104R\3\2\2"+
		"\2\u0105\u0108\5U+\2\u0106\u0108\7a\2\2\u0107\u0105\3\2\2\2\u0107\u0106"+
		"\3\2\2\2\u0108\u010d\3\2\2\2\u0109\u010c\5U+\2\u010a\u010c\t\b\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u0113\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7\60\2\2\u0111\u0112\7\60\2\2\u0112\u0114\7\60\2\2\u0113\u0110"+
		"\3\2\2\2\u0113\u0114\3\2\2\2\u0114T\3\2\2\2\u0115\u0116\t\t\2\2\u0116"+
		"V\3\2\2\2\u0117\u0118\7B\2\2\u0118\u0119\7$\2\2\u0119\u011f\3\2\2\2\u011a"+
		"\u011e\n\n\2\2\u011b\u011c\7$\2\2\u011c\u011e\7$\2\2\u011d\u011a\3\2\2"+
		"\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0122\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0123\7$\2\2\u0123"+
		"X\3\2\2\2\u0124\u0126\7$\2\2\u0125\u0127\5[.\2\u0126\u0125\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\7$\2\2\u0129Z\3\2\2\2\u012a"+
		"\u012c\5]/\2\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2"+
		"\2\u012d\u012e\3\2\2\2\u012e\\\3\2\2\2\u012f\u0138\n\13\2\2\u0130\u0131"+
		"\7^\2\2\u0131\u0138\t\f\2\2\u0132\u0133\7^\2\2\u0133\u0138\7\f\2\2\u0134"+
		"\u0135\7^\2\2\u0135\u0136\7\17\2\2\u0136\u0138\7\f\2\2\u0137\u012f\3\2"+
		"\2\2\u0137\u0130\3\2\2\2\u0137\u0132\3\2\2\2\u0137\u0134\3\2\2\2\u0138"+
		"^\3\2\2\2\30\2\u00b5\u00cd\u00d2\u00d7\u00dd\u00e2\u00e8\u00ec\u00f1\u00f3"+
		"\u00f6\u00ff\u0107\u010b\u010d\u0113\u011d\u011f\u0126\u012d\u0137\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}