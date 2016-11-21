// Generated from Eugine.g by ANTLR 4.5.3

package org.coyove.eugine.antlr;

import org.coyove.eugine.util.*;
import org.coyove.eugine.base.*;
import org.coyove.eugine.value.*;
import org.coyove.eugine.core.*;
import org.coyove.eugine.core.interop.*;
import org.coyove.eugine.core.math.*;
import org.coyove.eugine.core.flow.*;
import org.coyove.eugine.library.*;
import org.coyove.eugine.parser.Atom;
import java.util.HashMap;
import org.apache.commons.lang3.ClassUtils;

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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, Var=43, Const=44, Def=45, Inline=46, 
		For=47, If=48, Switch=49, Else=50, Enter=51, Catch=52, Clone=53, Sync=54, 
		Type=55, AddressOf=56, New=57, Static=58, Do=59, Add=60, Sub=61, Not=62, 
		AryOp=63, Integer=64, Double=65, NEWLINE=66, WS=67, Semi=68, Identifier=69, 
		JavaFullName=70, Letter=71, BlockComment=72, LineComment=73, RawString=74, 
		StringLiteral=75;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "Var", "Const", "Def", "Inline", "For", "If", "Switch", "Else", 
		"Enter", "Catch", "Clone", "Sync", "Type", "AddressOf", "New", "Static", 
		"Do", "Add", "Sub", "Not", "AryOp", "Integer", "Double", "NEWLINE", "WS", 
		"Semi", "Identifier", "JavaFullName", "Letter", "BlockComment", "LineComment", 
		"RawString", "StringLiteral", "SCharSequence", "SChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'.'", "'('", "')'", "'='", "','", "'&'", 
		"':'", "'['", "']'", "'=>'", "'@'", "'true'", "'false'", "'null'", "'l'", 
		"'L'", "'++'", "'--'", "'..'", "'...'", "'::'", "':>'", "'#'", "'*'", 
		"'/'", "'%'", "'<+'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", 
		"'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'const'", "'def'", "'inline'", 
		null, "'if'", "'switch'", "'else'", "'enter'", "'catch'", "'clone'", "'sync'", 
		"'typeof'", "'addressof'", "'new'", "'static'", "'do'", "'+'", "'-'", 
		"'!'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "Var", "Const", "Def", "Inline", 
		"For", "If", "Switch", "Else", "Enter", "Catch", "Clone", "Sync", "Type", 
		"AddressOf", "New", "Static", "Do", "Add", "Sub", "Not", "AryOp", "Integer", 
		"Double", "NEWLINE", "WS", "Semi", "Identifier", "JavaFullName", "Letter", 
		"BlockComment", "LineComment", "RawString", "StringLiteral"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2M\u021b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3"+
		"-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u012f\n\60\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\38\3"+
		"8\38\38\38\38\38\39\39\39\39\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3<\3<\3<\3=\3=\3>\3>\3?\3?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5"+
		"@\u0186\n@\3A\6A\u0189\nA\rA\16A\u018a\3B\6B\u018e\nB\rB\16B\u018f\3B"+
		"\3B\6B\u0194\nB\rB\16B\u0195\3B\6B\u0199\nB\rB\16B\u019a\3B\3B\6B\u019f"+
		"\nB\rB\16B\u01a0\3B\3B\5B\u01a5\nB\3B\6B\u01a8\nB\rB\16B\u01a9\5B\u01ac"+
		"\nB\3C\5C\u01af\nC\3C\3C\3C\3C\3D\6D\u01b6\nD\rD\16D\u01b7\3D\3D\3E\3"+
		"E\3F\3F\5F\u01c0\nF\3F\3F\7F\u01c4\nF\fF\16F\u01c7\13F\3F\3F\3F\5F\u01cc"+
		"\nF\3G\3G\3G\7G\u01d1\nG\fG\16G\u01d4\13G\3G\3G\5G\u01d8\nG\3G\3G\3G\5"+
		"G\u01dd\nG\3H\3H\3I\3I\3I\3I\7I\u01e5\nI\fI\16I\u01e8\13I\3I\3I\3I\3I"+
		"\3I\3J\3J\3J\3J\7J\u01f3\nJ\fJ\16J\u01f6\13J\3J\3J\3K\3K\3K\3K\3K\3K\7"+
		"K\u0200\nK\fK\16K\u0203\13K\3K\3K\3L\3L\5L\u0209\nL\3L\3L\3M\6M\u020e"+
		"\nM\rM\16M\u020f\3N\3N\3N\3N\3N\3N\3N\3N\5N\u021a\nN\3\u01e6\2O\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!"+
		"A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s"+
		";u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099\2\u009b\2\3\2\16\6\2\'\',,//\61\61"+
		"\4\2>>@@\3\2\62;\4\2GGgg\5\2--//^^\4\2\13\13\"\"\4\2\62;aa\4\2C\\c|\4"+
		"\2\f\f\17\17\3\2$$\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u0238\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2"+
		"o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3"+
		"\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085"+
		"\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2"+
		"\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097"+
		"\3\2\2\2\3\u009d\3\2\2\2\5\u009f\3\2\2\2\7\u00a1\3\2\2\2\t\u00a8\3\2\2"+
		"\2\13\u00aa\3\2\2\2\r\u00ac\3\2\2\2\17\u00ae\3\2\2\2\21\u00b0\3\2\2\2"+
		"\23\u00b2\3\2\2\2\25\u00b4\3\2\2\2\27\u00b6\3\2\2\2\31\u00b8\3\2\2\2\33"+
		"\u00ba\3\2\2\2\35\u00bd\3\2\2\2\37\u00bf\3\2\2\2!\u00c4\3\2\2\2#\u00ca"+
		"\3\2\2\2%\u00cf\3\2\2\2\'\u00d1\3\2\2\2)\u00d3\3\2\2\2+\u00d6\3\2\2\2"+
		"-\u00d9\3\2\2\2/\u00dc\3\2\2\2\61\u00e0\3\2\2\2\63\u00e3\3\2\2\2\65\u00e6"+
		"\3\2\2\2\67\u00e8\3\2\2\29\u00ea\3\2\2\2;\u00ec\3\2\2\2=\u00ee\3\2\2\2"+
		"?\u00f1\3\2\2\2A\u00f3\3\2\2\2C\u00f5\3\2\2\2E\u00f8\3\2\2\2G\u00fb\3"+
		"\2\2\2I\u00fe\3\2\2\2K\u0101\3\2\2\2M\u0104\3\2\2\2O\u0107\3\2\2\2Q\u010a"+
		"\3\2\2\2S\u010d\3\2\2\2U\u0110\3\2\2\2W\u0113\3\2\2\2Y\u0117\3\2\2\2["+
		"\u011d\3\2\2\2]\u0121\3\2\2\2_\u012e\3\2\2\2a\u0130\3\2\2\2c\u0133\3\2"+
		"\2\2e\u013a\3\2\2\2g\u013f\3\2\2\2i\u0145\3\2\2\2k\u014b\3\2\2\2m\u0151"+
		"\3\2\2\2o\u0156\3\2\2\2q\u015d\3\2\2\2s\u0167\3\2\2\2u\u016b\3\2\2\2w"+
		"\u0172\3\2\2\2y\u0175\3\2\2\2{\u0177\3\2\2\2}\u0179\3\2\2\2\177\u0185"+
		"\3\2\2\2\u0081\u0188\3\2\2\2\u0083\u01ab\3\2\2\2\u0085\u01ae\3\2\2\2\u0087"+
		"\u01b5\3\2\2\2\u0089\u01bb\3\2\2\2\u008b\u01bf\3\2\2\2\u008d\u01cd\3\2"+
		"\2\2\u008f\u01de\3\2\2\2\u0091\u01e0\3\2\2\2\u0093\u01ee\3\2\2\2\u0095"+
		"\u01f9\3\2\2\2\u0097\u0206\3\2\2\2\u0099\u020d\3\2\2\2\u009b\u0219\3\2"+
		"\2\2\u009d\u009e\7}\2\2\u009e\4\3\2\2\2\u009f\u00a0\7\177\2\2\u00a0\6"+
		"\3\2\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7o\2\2\u00a3\u00a4\7r\2\2\u00a4"+
		"\u00a5\7q\2\2\u00a5\u00a6\7t\2\2\u00a6\u00a7\7v\2\2\u00a7\b\3\2\2\2\u00a8"+
		"\u00a9\7\60\2\2\u00a9\n\3\2\2\2\u00aa\u00ab\7*\2\2\u00ab\f\3\2\2\2\u00ac"+
		"\u00ad\7+\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7?\2\2\u00af\20\3\2\2\2\u00b0"+
		"\u00b1\7.\2\2\u00b1\22\3\2\2\2\u00b2\u00b3\7(\2\2\u00b3\24\3\2\2\2\u00b4"+
		"\u00b5\7<\2\2\u00b5\26\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7\30\3\2\2\2\u00b8"+
		"\u00b9\7_\2\2\u00b9\32\3\2\2\2\u00ba\u00bb\7?\2\2\u00bb\u00bc\7@\2\2\u00bc"+
		"\34\3\2\2\2\u00bd\u00be\7B\2\2\u00be\36\3\2\2\2\u00bf\u00c0\7v\2\2\u00c0"+
		"\u00c1\7t\2\2\u00c1\u00c2\7w\2\2\u00c2\u00c3\7g\2\2\u00c3 \3\2\2\2\u00c4"+
		"\u00c5\7h\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7u\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9\"\3\2\2\2\u00ca\u00cb\7p\2\2\u00cb\u00cc\7w"+
		"\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7n\2\2\u00ce$\3\2\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0&\3\2\2\2\u00d1\u00d2\7N\2\2\u00d2(\3\2\2\2\u00d3\u00d4\7"+
		"-\2\2\u00d4\u00d5\7-\2\2\u00d5*\3\2\2\2\u00d6\u00d7\7/\2\2\u00d7\u00d8"+
		"\7/\2\2\u00d8,\3\2\2\2\u00d9\u00da\7\60\2\2\u00da\u00db\7\60\2\2\u00db"+
		".\3\2\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00de\7\60\2\2\u00de\u00df\7\60\2"+
		"\2\u00df\60\3\2\2\2\u00e0\u00e1\7<\2\2\u00e1\u00e2\7<\2\2\u00e2\62\3\2"+
		"\2\2\u00e3\u00e4\7<\2\2\u00e4\u00e5\7@\2\2\u00e5\64\3\2\2\2\u00e6\u00e7"+
		"\7%\2\2\u00e7\66\3\2\2\2\u00e8\u00e9\7,\2\2\u00e98\3\2\2\2\u00ea\u00eb"+
		"\7\61\2\2\u00eb:\3\2\2\2\u00ec\u00ed\7\'\2\2\u00ed<\3\2\2\2\u00ee\u00ef"+
		"\7>\2\2\u00ef\u00f0\7-\2\2\u00f0>\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2@\3"+
		"\2\2\2\u00f3\u00f4\7@\2\2\u00f4B\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7"+
		"\7?\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\7?\2\2\u00faF\3"+
		"\2\2\2\u00fb\u00fc\7?\2\2\u00fc\u00fd\7?\2\2\u00fdH\3\2\2\2\u00fe\u00ff"+
		"\7#\2\2\u00ff\u0100\7?\2\2\u0100J\3\2\2\2\u0101\u0102\7(\2\2\u0102\u0103"+
		"\7(\2\2\u0103L\3\2\2\2\u0104\u0105\7~\2\2\u0105\u0106\7~\2\2\u0106N\3"+
		"\2\2\2\u0107\u0108\7-\2\2\u0108\u0109\7?\2\2\u0109P\3\2\2\2\u010a\u010b"+
		"\7/\2\2\u010b\u010c\7?\2\2\u010cR\3\2\2\2\u010d\u010e\7,\2\2\u010e\u010f"+
		"\7?\2\2\u010fT\3\2\2\2\u0110\u0111\7\61\2\2\u0111\u0112\7?\2\2\u0112V"+
		"\3\2\2\2\u0113\u0114\7x\2\2\u0114\u0115\7c\2\2\u0115\u0116\7t\2\2\u0116"+
		"X\3\2\2\2\u0117\u0118\7e\2\2\u0118\u0119\7q\2\2\u0119\u011a\7p\2\2\u011a"+
		"\u011b\7u\2\2\u011b\u011c\7v\2\2\u011cZ\3\2\2\2\u011d\u011e\7f\2\2\u011e"+
		"\u011f\7g\2\2\u011f\u0120\7h\2\2\u0120\\\3\2\2\2\u0121\u0122\7k\2\2\u0122"+
		"\u0123\7p\2\2\u0123\u0124\7n\2\2\u0124\u0125\7k\2\2\u0125\u0126\7p\2\2"+
		"\u0126\u0127\7g\2\2\u0127^\3\2\2\2\u0128\u0129\7h\2\2\u0129\u012a\7q\2"+
		"\2\u012a\u012f\7t\2\2\u012b\u012c\7t\2\2\u012c\u012d\7g\2\2\u012d\u012f"+
		"\7x\2\2\u012e\u0128\3\2\2\2\u012e\u012b\3\2\2\2\u012f`\3\2\2\2\u0130\u0131"+
		"\7k\2\2\u0131\u0132\7h\2\2\u0132b\3\2\2\2\u0133\u0134\7u\2\2\u0134\u0135"+
		"\7y\2\2\u0135\u0136\7k\2\2\u0136\u0137\7v\2\2\u0137\u0138\7e\2\2\u0138"+
		"\u0139\7j\2\2\u0139d\3\2\2\2\u013a\u013b\7g\2\2\u013b\u013c\7n\2\2\u013c"+
		"\u013d\7u\2\2\u013d\u013e\7g\2\2\u013ef\3\2\2\2\u013f\u0140\7g\2\2\u0140"+
		"\u0141\7p\2\2\u0141\u0142\7v\2\2\u0142\u0143\7g\2\2\u0143\u0144\7t\2\2"+
		"\u0144h\3\2\2\2\u0145\u0146\7e\2\2\u0146\u0147\7c\2\2\u0147\u0148\7v\2"+
		"\2\u0148\u0149\7e\2\2\u0149\u014a\7j\2\2\u014aj\3\2\2\2\u014b\u014c\7"+
		"e\2\2\u014c\u014d\7n\2\2\u014d\u014e\7q\2\2\u014e\u014f\7p\2\2\u014f\u0150"+
		"\7g\2\2\u0150l\3\2\2\2\u0151\u0152\7u\2\2\u0152\u0153\7{\2\2\u0153\u0154"+
		"\7p\2\2\u0154\u0155\7e\2\2\u0155n\3\2\2\2\u0156\u0157\7v\2\2\u0157\u0158"+
		"\7{\2\2\u0158\u0159\7r\2\2\u0159\u015a\7g\2\2\u015a\u015b\7q\2\2\u015b"+
		"\u015c\7h\2\2\u015cp\3\2\2\2\u015d\u015e\7c\2\2\u015e\u015f\7f\2\2\u015f"+
		"\u0160\7f\2\2\u0160\u0161\7t\2\2\u0161\u0162\7g\2\2\u0162\u0163\7u\2\2"+
		"\u0163\u0164\7u\2\2\u0164\u0165\7q\2\2\u0165\u0166\7h\2\2\u0166r\3\2\2"+
		"\2\u0167\u0168\7p\2\2\u0168\u0169\7g\2\2\u0169\u016a\7y\2\2\u016at\3\2"+
		"\2\2\u016b\u016c\7u\2\2\u016c\u016d\7v\2\2\u016d\u016e\7c\2\2\u016e\u016f"+
		"\7v\2\2\u016f\u0170\7k\2\2\u0170\u0171\7e\2\2\u0171v\3\2\2\2\u0172\u0173"+
		"\7f\2\2\u0173\u0174\7q\2\2\u0174x\3\2\2\2\u0175\u0176\7-\2\2\u0176z\3"+
		"\2\2\2\u0177\u0178\7/\2\2\u0178|\3\2\2\2\u0179\u017a\7#\2\2\u017a~\3\2"+
		"\2\2\u017b\u0186\t\2\2\2\u017c\u017d\7?\2\2\u017d\u0186\7?\2\2\u017e\u017f"+
		"\7#\2\2\u017f\u0186\7?\2\2\u0180\u0186\t\3\2\2\u0181\u0182\7@\2\2\u0182"+
		"\u0186\7?\2\2\u0183\u0184\7>\2\2\u0184\u0186\7?\2\2\u0185\u017b\3\2\2"+
		"\2\u0185\u017c\3\2\2\2\u0185\u017e\3\2\2\2\u0185\u0180\3\2\2\2\u0185\u0181"+
		"\3\2\2\2\u0185\u0183\3\2\2\2\u0186\u0080\3\2\2\2\u0187\u0189\t\4\2\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u0082\3\2\2\2\u018c\u018e\t\4\2\2\u018d\u018c\3\2\2\2\u018e"+
		"\u018f\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0193\7\60\2\2\u0192\u0194\t\4\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u01ac\3\2"+
		"\2\2\u0197\u0199\t\4\2\2\u0198\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e\7\60"+
		"\2\2\u019d\u019f\t\4\2\2\u019e\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\t\5"+
		"\2\2\u01a3\u01a5\t\6\2\2\u01a4\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5"+
		"\u01a7\3\2\2\2\u01a6\u01a8\t\4\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01a9\3\2"+
		"\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01ac\3\2\2\2\u01ab"+
		"\u018d\3\2\2\2\u01ab\u0198\3\2\2\2\u01ac\u0084\3\2\2\2\u01ad\u01af\7\17"+
		"\2\2\u01ae\u01ad\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0"+
		"\u01b1\7\f\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b3\bC\2\2\u01b3\u0086\3\2"+
		"\2\2\u01b4\u01b6\t\7\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01ba\bD"+
		"\2\2\u01ba\u0088\3\2\2\2\u01bb\u01bc\7=\2\2\u01bc\u008a\3\2\2\2\u01bd"+
		"\u01c0\5\u008fH\2\u01be\u01c0\7a\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01be\3"+
		"\2\2\2\u01c0\u01c5\3\2\2\2\u01c1\u01c4\5\u008fH\2\u01c2\u01c4\t\b\2\2"+
		"\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3"+
		"\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01cb\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8"+
		"\u01c9\7\60\2\2\u01c9\u01ca\7\60\2\2\u01ca\u01cc\7\60\2\2\u01cb\u01c8"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u008c\3\2\2\2\u01cd\u01d2\5\u008bF"+
		"\2\u01ce\u01cf\7^\2\2\u01cf\u01d1\5\u008bF\2\u01d0\u01ce\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d7\3\2"+
		"\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6\7]\2\2\u01d6\u01d8\7_\2\2\u01d7\u01d5"+
		"\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\3\2\2\2\u01d9\u01da\7\60\2\2"+
		"\u01da\u01db\7\60\2\2\u01db\u01dd\7\60\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u008e\3\2\2\2\u01de\u01df\t\t\2\2\u01df\u0090\3\2\2\2\u01e0"+
		"\u01e1\7\61\2\2\u01e1\u01e2\7,\2\2\u01e2\u01e6\3\2\2\2\u01e3\u01e5\13"+
		"\2\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01ea\7,"+
		"\2\2\u01ea\u01eb\7\61\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\bI\2\2\u01ed"+
		"\u0092\3\2\2\2\u01ee\u01ef\7\61\2\2\u01ef\u01f0\7\61\2\2\u01f0\u01f4\3"+
		"\2\2\2\u01f1\u01f3\n\n\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4"+
		"\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f7\3\2\2\2\u01f6\u01f4\3\2"+
		"\2\2\u01f7\u01f8\bJ\2\2\u01f8\u0094\3\2\2\2\u01f9\u01fa\7B\2\2\u01fa\u01fb"+
		"\7$\2\2\u01fb\u0201\3\2\2\2\u01fc\u0200\n\13\2\2\u01fd\u01fe\7$\2\2\u01fe"+
		"\u0200\7$\2\2\u01ff\u01fc\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0203\3\2"+
		"\2\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203"+
		"\u0201\3\2\2\2\u0204\u0205\7$\2\2\u0205\u0096\3\2\2\2\u0206\u0208\7$\2"+
		"\2\u0207\u0209\5\u0099M\2\u0208\u0207\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u020a\3\2\2\2\u020a\u020b\7$\2\2\u020b\u0098\3\2\2\2\u020c\u020e\5\u009b"+
		"N\2\u020d\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f\u020d\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u009a\3\2\2\2\u0211\u021a\n\f\2\2\u0212\u0213\7^"+
		"\2\2\u0213\u021a\t\r\2\2\u0214\u0215\7^\2\2\u0215\u021a\7\f\2\2\u0216"+
		"\u0217\7^\2\2\u0217\u0218\7\17\2\2\u0218\u021a\7\f\2\2\u0219\u0211\3\2"+
		"\2\2\u0219\u0212\3\2\2\2\u0219\u0214\3\2\2\2\u0219\u0216\3\2\2\2\u021a"+
		"\u009c\3\2\2\2\35\2\u012e\u0185\u018a\u018f\u0195\u019a\u01a0\u01a4\u01a9"+
		"\u01ab\u01ae\u01b7\u01bf\u01c3\u01c5\u01cb\u01d2\u01d7\u01dc\u01e6\u01f4"+
		"\u01ff\u0201\u0208\u020f\u0219\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}