// Generated from Eugine.g by ANTLR 4.6

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
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, Import=40, Var=41, Let=42, Def=43, Struct=44, Operator=45, For=46, 
		If=47, Switch=48, Else=49, Enter=50, Catch=51, Sync=52, Do=53, AssignOp=54, 
		Integer=55, Double=56, NEWLINE=57, WS=58, Semi=59, Identifier=60, JavaFullName=61, 
		Letter=62, BlockComment=63, LineComment=64, RawString=65, StringLiteral=66;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "Import", "Var", 
		"Let", "Def", "Struct", "Operator", "For", "If", "Switch", "Else", "Enter", 
		"Catch", "Sync", "Do", "AssignOp", "Integer", "Double", "NEWLINE", "WS", 
		"Semi", "Identifier", "JavaFullName", "Letter", "BlockComment", "LineComment", 
		"RawString", "StringLiteral", "SCharSequence", "SChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'.'", "'('", "')'", "'='", "','", "'&'", "'getter'", 
		"'setter'", "'['", "']'", "'=>'", "'@'", "':'", "'true'", "'false'", "'null'", 
		"'break'", "'++'", "'--'", "'-'", "'!'", "'~'", "'*'", "'/'", "'%'", "'+'", 
		"'<+'", "'<'", "'<='", "'=='", "'!='", "'>='", "'>'", "'|'", "'^'", "'&&'", 
		"'||'", "'import'", "'var'", "'let'", "'def'", "'struct'", "'operator'", 
		"'for'", "'if'", "'switch'", "'else'", "'enter'", "'catch'", "'sync'", 
		"'do'", null, null, null, null, null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Import", "Var", "Let", "Def", "Struct", "Operator", 
		"For", "If", "Switch", "Else", "Enter", "Catch", "Sync", "Do", "AssignOp", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2D\u01eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)"+
		"\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\5\67\u0156\n\67\38\68\u0159\n8\r8\168\u015a\39\69\u015e\n9\r9\169"+
		"\u015f\39\39\69\u0164\n9\r9\169\u0165\39\69\u0169\n9\r9\169\u016a\39\3"+
		"9\69\u016f\n9\r9\169\u0170\39\39\59\u0175\n9\39\69\u0178\n9\r9\169\u0179"+
		"\59\u017c\n9\3:\5:\u017f\n:\3:\3:\3:\3:\3;\6;\u0186\n;\r;\16;\u0187\3"+
		";\3;\3<\3<\3=\3=\5=\u0190\n=\3=\3=\7=\u0194\n=\f=\16=\u0197\13=\3=\3="+
		"\3=\5=\u019c\n=\3>\3>\3>\7>\u01a1\n>\f>\16>\u01a4\13>\3>\3>\5>\u01a8\n"+
		">\3>\3>\3>\5>\u01ad\n>\3?\3?\3@\3@\3@\3@\7@\u01b5\n@\f@\16@\u01b8\13@"+
		"\3@\3@\3@\3@\3@\3A\3A\3A\3A\7A\u01c3\nA\fA\16A\u01c6\13A\3A\3A\3B\3B\3"+
		"B\3B\3B\3B\7B\u01d0\nB\fB\16B\u01d3\13B\3B\3B\3C\3C\5C\u01d9\nC\3C\3C"+
		"\3D\6D\u01de\nD\rD\16D\u01df\3E\3E\3E\3E\3E\3E\3E\3E\5E\u01ea\nE\3\u01b6"+
		"\2F\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67"+
		"m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087\2\u0089\2\3\2\f\3\2"+
		"\62;\4\2GGgg\4\2--//\4\2\13\13\"\"\4\2\62;aa\4\2C\\c|\4\2\f\f\17\17\3"+
		"\2$$\6\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u0209\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'"+
		"\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63"+
		"\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2"+
		"?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3"+
		"\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2"+
		"\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2"+
		"e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3"+
		"\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2"+
		"\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\3\u008b"+
		"\3\2\2\2\5\u008d\3\2\2\2\7\u008f\3\2\2\2\t\u0091\3\2\2\2\13\u0093\3\2"+
		"\2\2\r\u0095\3\2\2\2\17\u0097\3\2\2\2\21\u0099\3\2\2\2\23\u009b\3\2\2"+
		"\2\25\u00a2\3\2\2\2\27\u00a9\3\2\2\2\31\u00ab\3\2\2\2\33\u00ad\3\2\2\2"+
		"\35\u00b0\3\2\2\2\37\u00b2\3\2\2\2!\u00b4\3\2\2\2#\u00b9\3\2\2\2%\u00bf"+
		"\3\2\2\2\'\u00c4\3\2\2\2)\u00ca\3\2\2\2+\u00cd\3\2\2\2-\u00d0\3\2\2\2"+
		"/\u00d2\3\2\2\2\61\u00d4\3\2\2\2\63\u00d6\3\2\2\2\65\u00d8\3\2\2\2\67"+
		"\u00da\3\2\2\29\u00dc\3\2\2\2;\u00de\3\2\2\2=\u00e1\3\2\2\2?\u00e3\3\2"+
		"\2\2A\u00e6\3\2\2\2C\u00e9\3\2\2\2E\u00ec\3\2\2\2G\u00ef\3\2\2\2I\u00f1"+
		"\3\2\2\2K\u00f3\3\2\2\2M\u00f5\3\2\2\2O\u00f8\3\2\2\2Q\u00fb\3\2\2\2S"+
		"\u0102\3\2\2\2U\u0106\3\2\2\2W\u010a\3\2\2\2Y\u010e\3\2\2\2[\u0115\3\2"+
		"\2\2]\u011e\3\2\2\2_\u0122\3\2\2\2a\u0125\3\2\2\2c\u012c\3\2\2\2e\u0131"+
		"\3\2\2\2g\u0137\3\2\2\2i\u013d\3\2\2\2k\u0142\3\2\2\2m\u0155\3\2\2\2o"+
		"\u0158\3\2\2\2q\u017b\3\2\2\2s\u017e\3\2\2\2u\u0185\3\2\2\2w\u018b\3\2"+
		"\2\2y\u018f\3\2\2\2{\u019d\3\2\2\2}\u01ae\3\2\2\2\177\u01b0\3\2\2\2\u0081"+
		"\u01be\3\2\2\2\u0083\u01c9\3\2\2\2\u0085\u01d6\3\2\2\2\u0087\u01dd\3\2"+
		"\2\2\u0089\u01e9\3\2\2\2\u008b\u008c\7}\2\2\u008c\4\3\2\2\2\u008d\u008e"+
		"\7\177\2\2\u008e\6\3\2\2\2\u008f\u0090\7\60\2\2\u0090\b\3\2\2\2\u0091"+
		"\u0092\7*\2\2\u0092\n\3\2\2\2\u0093\u0094\7+\2\2\u0094\f\3\2\2\2\u0095"+
		"\u0096\7?\2\2\u0096\16\3\2\2\2\u0097\u0098\7.\2\2\u0098\20\3\2\2\2\u0099"+
		"\u009a\7(\2\2\u009a\22\3\2\2\2\u009b\u009c\7i\2\2\u009c\u009d\7g\2\2\u009d"+
		"\u009e\7v\2\2\u009e\u009f\7v\2\2\u009f\u00a0\7g\2\2\u00a0\u00a1\7t\2\2"+
		"\u00a1\24\3\2\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7"+
		"v\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7t\2\2\u00a8\26"+
		"\3\2\2\2\u00a9\u00aa\7]\2\2\u00aa\30\3\2\2\2\u00ab\u00ac\7_\2\2\u00ac"+
		"\32\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae\u00af\7@\2\2\u00af\34\3\2\2\2\u00b0"+
		"\u00b1\7B\2\2\u00b1\36\3\2\2\2\u00b2\u00b3\7<\2\2\u00b3 \3\2\2\2\u00b4"+
		"\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7g\2\2"+
		"\u00b8\"\3\2\2\2\u00b9\u00ba\7h\2\2\u00ba\u00bb\7c\2\2\u00bb\u00bc\7n"+
		"\2\2\u00bc\u00bd\7u\2\2\u00bd\u00be\7g\2\2\u00be$\3\2\2\2\u00bf\u00c0"+
		"\7p\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7n\2\2\u00c2\u00c3\7n\2\2\u00c3"+
		"&\3\2\2\2\u00c4\u00c5\7d\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"\u00c8\7c\2\2\u00c8\u00c9\7m\2\2\u00c9(\3\2\2\2\u00ca\u00cb\7-\2\2\u00cb"+
		"\u00cc\7-\2\2\u00cc*\3\2\2\2\u00cd\u00ce\7/\2\2\u00ce\u00cf\7/\2\2\u00cf"+
		",\3\2\2\2\u00d0\u00d1\7/\2\2\u00d1.\3\2\2\2\u00d2\u00d3\7#\2\2\u00d3\60"+
		"\3\2\2\2\u00d4\u00d5\7\u0080\2\2\u00d5\62\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7"+
		"\64\3\2\2\2\u00d8\u00d9\7\61\2\2\u00d9\66\3\2\2\2\u00da\u00db\7\'\2\2"+
		"\u00db8\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd:\3\2\2\2\u00de\u00df\7>\2\2\u00df"+
		"\u00e0\7-\2\2\u00e0<\3\2\2\2\u00e1\u00e2\7>\2\2\u00e2>\3\2\2\2\u00e3\u00e4"+
		"\7>\2\2\u00e4\u00e5\7?\2\2\u00e5@\3\2\2\2\u00e6\u00e7\7?\2\2\u00e7\u00e8"+
		"\7?\2\2\u00e8B\3\2\2\2\u00e9\u00ea\7#\2\2\u00ea\u00eb\7?\2\2\u00ebD\3"+
		"\2\2\2\u00ec\u00ed\7@\2\2\u00ed\u00ee\7?\2\2\u00eeF\3\2\2\2\u00ef\u00f0"+
		"\7@\2\2\u00f0H\3\2\2\2\u00f1\u00f2\7~\2\2\u00f2J\3\2\2\2\u00f3\u00f4\7"+
		"`\2\2\u00f4L\3\2\2\2\u00f5\u00f6\7(\2\2\u00f6\u00f7\7(\2\2\u00f7N\3\2"+
		"\2\2\u00f8\u00f9\7~\2\2\u00f9\u00fa\7~\2\2\u00faP\3\2\2\2\u00fb\u00fc"+
		"\7k\2\2\u00fc\u00fd\7o\2\2\u00fd\u00fe\7r\2\2\u00fe\u00ff\7q\2\2\u00ff"+
		"\u0100\7t\2\2\u0100\u0101\7v\2\2\u0101R\3\2\2\2\u0102\u0103\7x\2\2\u0103"+
		"\u0104\7c\2\2\u0104\u0105\7t\2\2\u0105T\3\2\2\2\u0106\u0107\7n\2\2\u0107"+
		"\u0108\7g\2\2\u0108\u0109\7v\2\2\u0109V\3\2\2\2\u010a\u010b\7f\2\2\u010b"+
		"\u010c\7g\2\2\u010c\u010d\7h\2\2\u010dX\3\2\2\2\u010e\u010f\7u\2\2\u010f"+
		"\u0110\7v\2\2\u0110\u0111\7t\2\2\u0111\u0112\7w\2\2\u0112\u0113\7e\2\2"+
		"\u0113\u0114\7v\2\2\u0114Z\3\2\2\2\u0115\u0116\7q\2\2\u0116\u0117\7r\2"+
		"\2\u0117\u0118\7g\2\2\u0118\u0119\7t\2\2\u0119\u011a\7c\2\2\u011a\u011b"+
		"\7v\2\2\u011b\u011c\7q\2\2\u011c\u011d\7t\2\2\u011d\\\3\2\2\2\u011e\u011f"+
		"\7h\2\2\u011f\u0120\7q\2\2\u0120\u0121\7t\2\2\u0121^\3\2\2\2\u0122\u0123"+
		"\7k\2\2\u0123\u0124\7h\2\2\u0124`\3\2\2\2\u0125\u0126\7u\2\2\u0126\u0127"+
		"\7y\2\2\u0127\u0128\7k\2\2\u0128\u0129\7v\2\2\u0129\u012a\7e\2\2\u012a"+
		"\u012b\7j\2\2\u012bb\3\2\2\2\u012c\u012d\7g\2\2\u012d\u012e\7n\2\2\u012e"+
		"\u012f\7u\2\2\u012f\u0130\7g\2\2\u0130d\3\2\2\2\u0131\u0132\7g\2\2\u0132"+
		"\u0133\7p\2\2\u0133\u0134\7v\2\2\u0134\u0135\7g\2\2\u0135\u0136\7t\2\2"+
		"\u0136f\3\2\2\2\u0137\u0138\7e\2\2\u0138\u0139\7c\2\2\u0139\u013a\7v\2"+
		"\2\u013a\u013b\7e\2\2\u013b\u013c\7j\2\2\u013ch\3\2\2\2\u013d\u013e\7"+
		"u\2\2\u013e\u013f\7{\2\2\u013f\u0140\7p\2\2\u0140\u0141\7e\2\2\u0141j"+
		"\3\2\2\2\u0142\u0143\7f\2\2\u0143\u0144\7q\2\2\u0144l\3\2\2\2\u0145\u0146"+
		"\7-\2\2\u0146\u0156\7?\2\2\u0147\u0148\7/\2\2\u0148\u0156\7?\2\2\u0149"+
		"\u014a\7,\2\2\u014a\u0156\7?\2\2\u014b\u014c\7\61\2\2\u014c\u0156\7?\2"+
		"\2\u014d\u014e\7\'\2\2\u014e\u0156\7?\2\2\u014f\u0150\7~\2\2\u0150\u0156"+
		"\7?\2\2\u0151\u0152\7(\2\2\u0152\u0156\7?\2\2\u0153\u0154\7`\2\2\u0154"+
		"\u0156\7?\2\2\u0155\u0145\3\2\2\2\u0155\u0147\3\2\2\2\u0155\u0149\3\2"+
		"\2\2\u0155\u014b\3\2\2\2\u0155\u014d\3\2\2\2\u0155\u014f\3\2\2\2\u0155"+
		"\u0151\3\2\2\2\u0155\u0153\3\2\2\2\u0156n\3\2\2\2\u0157\u0159\t\2\2\2"+
		"\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015bp\3\2\2\2\u015c\u015e\t\2\2\2\u015d\u015c\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2"+
		"\2\2\u0161\u0163\7\60\2\2\u0162\u0164\t\2\2\2\u0163\u0162\3\2\2\2\u0164"+
		"\u0165\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u017c\3\2"+
		"\2\2\u0167\u0169\t\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a"+
		"\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\7\60"+
		"\2\2\u016d\u016f\t\2\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\t\3"+
		"\2\2\u0173\u0175\t\4\2\2\u0174\u0173\3\2\2\2\u0174\u0175\3\2\2\2\u0175"+
		"\u0177\3\2\2\2\u0176\u0178\t\2\2\2\u0177\u0176\3\2\2\2\u0178\u0179\3\2"+
		"\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2\2\2\u017b"+
		"\u015d\3\2\2\2\u017b\u0168\3\2\2\2\u017cr\3\2\2\2\u017d\u017f\7\17\2\2"+
		"\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181"+
		"\7\f\2\2\u0181\u0182\3\2\2\2\u0182\u0183\b:\2\2\u0183t\3\2\2\2\u0184\u0186"+
		"\t\5\2\2\u0185\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0185\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u018a\b;\2\2\u018av\3\2\2\2\u018b"+
		"\u018c\7=\2\2\u018cx\3\2\2\2\u018d\u0190\5}?\2\u018e\u0190\7a\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u018e\3\2\2\2\u0190\u0195\3\2\2\2\u0191\u0194\5}"+
		"?\2\u0192\u0194\t\6\2\2\u0193\u0191\3\2\2\2\u0193\u0192\3\2\2\2\u0194"+
		"\u0197\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u019b\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0198\u0199\7\60\2\2\u0199\u019a\7\60\2\2\u019a"+
		"\u019c\7\60\2\2\u019b\u0198\3\2\2\2\u019b\u019c\3\2\2\2\u019cz\3\2\2\2"+
		"\u019d\u01a2\5y=\2\u019e\u019f\7\61\2\2\u019f\u01a1\5y=\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a7\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\7]\2\2\u01a6\u01a8\7_\2"+
		"\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ac\3\2\2\2\u01a9\u01aa"+
		"\7\60\2\2\u01aa\u01ab\7\60\2\2\u01ab\u01ad\7\60\2\2\u01ac\u01a9\3\2\2"+
		"\2\u01ac\u01ad\3\2\2\2\u01ad|\3\2\2\2\u01ae\u01af\t\7\2\2\u01af~\3\2\2"+
		"\2\u01b0\u01b1\7\61\2\2\u01b1\u01b2\7,\2\2\u01b2\u01b6\3\2\2\2\u01b3\u01b5"+
		"\13\2\2\2\u01b4\u01b3\3\2\2\2\u01b5\u01b8\3\2\2\2\u01b6\u01b7\3\2\2\2"+
		"\u01b6\u01b4\3\2\2\2\u01b7\u01b9\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b9\u01ba"+
		"\7,\2\2\u01ba\u01bb\7\61\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01bd\b@\2\2\u01bd"+
		"\u0080\3\2\2\2\u01be\u01bf\7\61\2\2\u01bf\u01c0\7\61\2\2\u01c0\u01c4\3"+
		"\2\2\2\u01c1\u01c3\n\b\2\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4"+
		"\u01c2\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2"+
		"\2\2\u01c7\u01c8\bA\2\2\u01c8\u0082\3\2\2\2\u01c9\u01ca\7B\2\2\u01ca\u01cb"+
		"\7$\2\2\u01cb\u01d1\3\2\2\2\u01cc\u01d0\n\t\2\2\u01cd\u01ce\7$\2\2\u01ce"+
		"\u01d0\7$\2\2\u01cf\u01cc\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d3\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d4\3\2\2\2\u01d3"+
		"\u01d1\3\2\2\2\u01d4\u01d5\7$\2\2\u01d5\u0084\3\2\2\2\u01d6\u01d8\7$\2"+
		"\2\u01d7\u01d9\5\u0087D\2\u01d8\u01d7\3\2\2\2\u01d8\u01d9\3\2\2\2\u01d9"+
		"\u01da\3\2\2\2\u01da\u01db\7$\2\2\u01db\u0086\3\2\2\2\u01dc\u01de\5\u0089"+
		"E\2\u01dd\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01dd\3\2\2\2\u01df"+
		"\u01e0\3\2\2\2\u01e0\u0088\3\2\2\2\u01e1\u01ea\n\n\2\2\u01e2\u01e3\7^"+
		"\2\2\u01e3\u01ea\t\13\2\2\u01e4\u01e5\7^\2\2\u01e5\u01ea\7\f\2\2\u01e6"+
		"\u01e7\7^\2\2\u01e7\u01e8\7\17\2\2\u01e8\u01ea\7\f\2\2\u01e9\u01e1\3\2"+
		"\2\2\u01e9\u01e2\3\2\2\2\u01e9\u01e4\3\2\2\2\u01e9\u01e6\3\2\2\2\u01ea"+
		"\u008a\3\2\2\2\34\2\u0155\u015a\u015f\u0165\u016a\u0170\u0174\u0179\u017b"+
		"\u017e\u0187\u018f\u0193\u0195\u019b\u01a2\u01a7\u01ac\u01b6\u01c4\u01cf"+
		"\u01d1\u01d8\u01df\u01e9\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}