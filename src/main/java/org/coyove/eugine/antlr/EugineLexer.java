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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, Var=45, Const=46, 
		Def=47, Inline=48, Coroutine=49, Struct=50, For=51, If=52, Switch=53, 
		Else=54, Enter=55, Catch=56, Clone=57, Sync=58, Yield=59, Type=60, AddressOf=61, 
		New=62, Static=63, Do=64, Integer=65, Double=66, NEWLINE=67, WS=68, Semi=69, 
		Identifier=70, JavaFullName=71, Letter=72, BlockComment=73, LineComment=74, 
		RawString=75, StringLiteral=76;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "Var", "Const", "Def", "Inline", "Coroutine", 
		"Struct", "For", "If", "Switch", "Else", "Enter", "Catch", "Clone", "Sync", 
		"Yield", "Type", "AddressOf", "New", "Static", "Do", "Integer", "Double", 
		"NEWLINE", "WS", "Semi", "Identifier", "JavaFullName", "Letter", "BlockComment", 
		"LineComment", "RawString", "StringLiteral", "SCharSequence", "SChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'reload'", "'.'", "'('", "')'", "'='", 
		"','", "'&'", "':'", "'['", "']'", "'=>'", "'@'", "'true'", "'false'", 
		"'null'", "'++'", "'--'", "'..'", "'...'", "'::'", "':>'", "'#'", "'-'", 
		"'!'", "'*'", "'/'", "'%'", "'+'", "'<+'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'var'", 
		"'const'", "'def'", "'inline'", "'coroutine'", "'struct'", null, "'if'", 
		"'switch'", "'else'", "'enter'", "'catch'", "'clone'", "'sync'", "'yield'", 
		"'typeof'", "'addressof'", "'new'", "'static'", "'do'", null, null, null, 
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, "Var", "Const", 
		"Def", "Inline", "Coroutine", "Struct", "For", "If", "Switch", "Else", 
		"Enter", "Catch", "Clone", "Sync", "Yield", "Type", "AddressOf", "New", 
		"Static", "Do", "Integer", "Double", "NEWLINE", "WS", "Semi", "Identifier", 
		"JavaFullName", "Letter", "BlockComment", "LineComment", "RawString", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2N\u022b\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\3%"+
		"\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,"+
		"\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\5\64\u014b\n\64\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3@\3A\3A\3A\3"+
		"B\6B\u0199\nB\rB\16B\u019a\3C\6C\u019e\nC\rC\16C\u019f\3C\3C\6C\u01a4"+
		"\nC\rC\16C\u01a5\3C\6C\u01a9\nC\rC\16C\u01aa\3C\3C\6C\u01af\nC\rC\16C"+
		"\u01b0\3C\3C\5C\u01b5\nC\3C\6C\u01b8\nC\rC\16C\u01b9\5C\u01bc\nC\3D\5"+
		"D\u01bf\nD\3D\3D\3D\3D\3E\6E\u01c6\nE\rE\16E\u01c7\3E\3E\3F\3F\3G\3G\5"+
		"G\u01d0\nG\3G\3G\7G\u01d4\nG\fG\16G\u01d7\13G\3G\3G\3G\5G\u01dc\nG\3H"+
		"\3H\3H\7H\u01e1\nH\fH\16H\u01e4\13H\3H\3H\5H\u01e8\nH\3H\3H\3H\5H\u01ed"+
		"\nH\3I\3I\3J\3J\3J\3J\7J\u01f5\nJ\fJ\16J\u01f8\13J\3J\3J\3J\3J\3J\3K\3"+
		"K\3K\3K\7K\u0203\nK\fK\16K\u0206\13K\3K\3K\3L\3L\3L\3L\3L\3L\7L\u0210"+
		"\nL\fL\16L\u0213\13L\3L\3L\3M\3M\5M\u0219\nM\3M\3M\3N\6N\u021e\nN\rN\16"+
		"N\u021f\3O\3O\3O\3O\3O\3O\3O\3O\5O\u022a\nO\3\u01f6\2P\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177"+
		"A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093"+
		"K\u0095L\u0097M\u0099N\u009b\2\u009d\2\3\2\f\3\2\62;\4\2GGgg\5\2--//^"+
		"^\4\2\13\13\"\"\4\2\62;aa\4\2C\\c|\4\2\f\f\17\17\3\2$$\6\2\f\f\17\17$"+
		"$^^\f\2$$))AA^^cdhhppttvvxx\u0243\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\3\u009f"+
		"\3\2\2\2\5\u00a1\3\2\2\2\7\u00a3\3\2\2\2\t\u00aa\3\2\2\2\13\u00b1\3\2"+
		"\2\2\r\u00b3\3\2\2\2\17\u00b5\3\2\2\2\21\u00b7\3\2\2\2\23\u00b9\3\2\2"+
		"\2\25\u00bb\3\2\2\2\27\u00bd\3\2\2\2\31\u00bf\3\2\2\2\33\u00c1\3\2\2\2"+
		"\35\u00c3\3\2\2\2\37\u00c6\3\2\2\2!\u00c8\3\2\2\2#\u00cd\3\2\2\2%\u00d3"+
		"\3\2\2\2\'\u00d8\3\2\2\2)\u00db\3\2\2\2+\u00de\3\2\2\2-\u00e1\3\2\2\2"+
		"/\u00e5\3\2\2\2\61\u00e8\3\2\2\2\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67"+
		"\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f3\3\2\2\2=\u00f5\3\2\2\2?\u00f7\3\2"+
		"\2\2A\u00f9\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0100\3\2\2\2I\u0103"+
		"\3\2\2\2K\u0106\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u010f\3\2\2\2S"+
		"\u0112\3\2\2\2U\u0115\3\2\2\2W\u0118\3\2\2\2Y\u011b\3\2\2\2[\u011e\3\2"+
		"\2\2]\u0122\3\2\2\2_\u0128\3\2\2\2a\u012c\3\2\2\2c\u0133\3\2\2\2e\u013d"+
		"\3\2\2\2g\u014a\3\2\2\2i\u014c\3\2\2\2k\u014f\3\2\2\2m\u0156\3\2\2\2o"+
		"\u015b\3\2\2\2q\u0161\3\2\2\2s\u0167\3\2\2\2u\u016d\3\2\2\2w\u0172\3\2"+
		"\2\2y\u0178\3\2\2\2{\u017f\3\2\2\2}\u0189\3\2\2\2\177\u018d\3\2\2\2\u0081"+
		"\u0194\3\2\2\2\u0083\u0198\3\2\2\2\u0085\u01bb\3\2\2\2\u0087\u01be\3\2"+
		"\2\2\u0089\u01c5\3\2\2\2\u008b\u01cb\3\2\2\2\u008d\u01cf\3\2\2\2\u008f"+
		"\u01dd\3\2\2\2\u0091\u01ee\3\2\2\2\u0093\u01f0\3\2\2\2\u0095\u01fe\3\2"+
		"\2\2\u0097\u0209\3\2\2\2\u0099\u0216\3\2\2\2\u009b\u021d\3\2\2\2\u009d"+
		"\u0229\3\2\2\2\u009f\u00a0\7}\2\2\u00a0\4\3\2\2\2\u00a1\u00a2\7\177\2"+
		"\2\u00a2\6\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5\7o\2\2\u00a5\u00a6\7"+
		"r\2\2\u00a6\u00a7\7q\2\2\u00a7\u00a8\7t\2\2\u00a8\u00a9\7v\2\2\u00a9\b"+
		"\3\2\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac\7g\2\2\u00ac\u00ad\7n\2\2\u00ad"+
		"\u00ae\7q\2\2\u00ae\u00af\7c\2\2\u00af\u00b0\7f\2\2\u00b0\n\3\2\2\2\u00b1"+
		"\u00b2\7\60\2\2\u00b2\f\3\2\2\2\u00b3\u00b4\7*\2\2\u00b4\16\3\2\2\2\u00b5"+
		"\u00b6\7+\2\2\u00b6\20\3\2\2\2\u00b7\u00b8\7?\2\2\u00b8\22\3\2\2\2\u00b9"+
		"\u00ba\7.\2\2\u00ba\24\3\2\2\2\u00bb\u00bc\7(\2\2\u00bc\26\3\2\2\2\u00bd"+
		"\u00be\7<\2\2\u00be\30\3\2\2\2\u00bf\u00c0\7]\2\2\u00c0\32\3\2\2\2\u00c1"+
		"\u00c2\7_\2\2\u00c2\34\3\2\2\2\u00c3\u00c4\7?\2\2\u00c4\u00c5\7@\2\2\u00c5"+
		"\36\3\2\2\2\u00c6\u00c7\7B\2\2\u00c7 \3\2\2\2\u00c8\u00c9\7v\2\2\u00c9"+
		"\u00ca\7t\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\"\3\2\2\2\u00cd"+
		"\u00ce\7h\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7n\2\2\u00d0\u00d1\7u\2\2"+
		"\u00d1\u00d2\7g\2\2\u00d2$\3\2\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d5\7w\2"+
		"\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7n\2\2\u00d7&\3\2\2\2\u00d8\u00d9\7"+
		"-\2\2\u00d9\u00da\7-\2\2\u00da(\3\2\2\2\u00db\u00dc\7/\2\2\u00dc\u00dd"+
		"\7/\2\2\u00dd*\3\2\2\2\u00de\u00df\7\60\2\2\u00df\u00e0\7\60\2\2\u00e0"+
		",\3\2\2\2\u00e1\u00e2\7\60\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7\60\2"+
		"\2\u00e4.\3\2\2\2\u00e5\u00e6\7<\2\2\u00e6\u00e7\7<\2\2\u00e7\60\3\2\2"+
		"\2\u00e8\u00e9\7<\2\2\u00e9\u00ea\7@\2\2\u00ea\62\3\2\2\2\u00eb\u00ec"+
		"\7%\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7/\2\2\u00ee\66\3\2\2\2\u00ef\u00f0"+
		"\7#\2\2\u00f08\3\2\2\2\u00f1\u00f2\7,\2\2\u00f2:\3\2\2\2\u00f3\u00f4\7"+
		"\61\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7\'\2\2\u00f6>\3\2\2\2\u00f7\u00f8"+
		"\7-\2\2\u00f8@\3\2\2\2\u00f9\u00fa\7>\2\2\u00fa\u00fb\7-\2\2\u00fbB\3"+
		"\2\2\2\u00fc\u00fd\7>\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7@\2\2\u00ffF\3\2"+
		"\2\2\u0100\u0101\7>\2\2\u0101\u0102\7?\2\2\u0102H\3\2\2\2\u0103\u0104"+
		"\7@\2\2\u0104\u0105\7?\2\2\u0105J\3\2\2\2\u0106\u0107\7?\2\2\u0107\u0108"+
		"\7?\2\2\u0108L\3\2\2\2\u0109\u010a\7#\2\2\u010a\u010b\7?\2\2\u010bN\3"+
		"\2\2\2\u010c\u010d\7(\2\2\u010d\u010e\7(\2\2\u010eP\3\2\2\2\u010f\u0110"+
		"\7~\2\2\u0110\u0111\7~\2\2\u0111R\3\2\2\2\u0112\u0113\7-\2\2\u0113\u0114"+
		"\7?\2\2\u0114T\3\2\2\2\u0115\u0116\7/\2\2\u0116\u0117\7?\2\2\u0117V\3"+
		"\2\2\2\u0118\u0119\7,\2\2\u0119\u011a\7?\2\2\u011aX\3\2\2\2\u011b\u011c"+
		"\7\61\2\2\u011c\u011d\7?\2\2\u011dZ\3\2\2\2\u011e\u011f\7x\2\2\u011f\u0120"+
		"\7c\2\2\u0120\u0121\7t\2\2\u0121\\\3\2\2\2\u0122\u0123\7e\2\2\u0123\u0124"+
		"\7q\2\2\u0124\u0125\7p\2\2\u0125\u0126\7u\2\2\u0126\u0127\7v\2\2\u0127"+
		"^\3\2\2\2\u0128\u0129\7f\2\2\u0129\u012a\7g\2\2\u012a\u012b\7h\2\2\u012b"+
		"`\3\2\2\2\u012c\u012d\7k\2\2\u012d\u012e\7p\2\2\u012e\u012f\7n\2\2\u012f"+
		"\u0130\7k\2\2\u0130\u0131\7p\2\2\u0131\u0132\7g\2\2\u0132b\3\2\2\2\u0133"+
		"\u0134\7e\2\2\u0134\u0135\7q\2\2\u0135\u0136\7t\2\2\u0136\u0137\7q\2\2"+
		"\u0137\u0138\7w\2\2\u0138\u0139\7v\2\2\u0139\u013a\7k\2\2\u013a\u013b"+
		"\7p\2\2\u013b\u013c\7g\2\2\u013cd\3\2\2\2\u013d\u013e\7u\2\2\u013e\u013f"+
		"\7v\2\2\u013f\u0140\7t\2\2\u0140\u0141\7w\2\2\u0141\u0142\7e\2\2\u0142"+
		"\u0143\7v\2\2\u0143f\3\2\2\2\u0144\u0145\7h\2\2\u0145\u0146\7q\2\2\u0146"+
		"\u014b\7t\2\2\u0147\u0148\7t\2\2\u0148\u0149\7g\2\2\u0149\u014b\7x\2\2"+
		"\u014a\u0144\3\2\2\2\u014a\u0147\3\2\2\2\u014bh\3\2\2\2\u014c\u014d\7"+
		"k\2\2\u014d\u014e\7h\2\2\u014ej\3\2\2\2\u014f\u0150\7u\2\2\u0150\u0151"+
		"\7y\2\2\u0151\u0152\7k\2\2\u0152\u0153\7v\2\2\u0153\u0154\7e\2\2\u0154"+
		"\u0155\7j\2\2\u0155l\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158\7n\2\2\u0158"+
		"\u0159\7u\2\2\u0159\u015a\7g\2\2\u015an\3\2\2\2\u015b\u015c\7g\2\2\u015c"+
		"\u015d\7p\2\2\u015d\u015e\7v\2\2\u015e\u015f\7g\2\2\u015f\u0160\7t\2\2"+
		"\u0160p\3\2\2\2\u0161\u0162\7e\2\2\u0162\u0163\7c\2\2\u0163\u0164\7v\2"+
		"\2\u0164\u0165\7e\2\2\u0165\u0166\7j\2\2\u0166r\3\2\2\2\u0167\u0168\7"+
		"e\2\2\u0168\u0169\7n\2\2\u0169\u016a\7q\2\2\u016a\u016b\7p\2\2\u016b\u016c"+
		"\7g\2\2\u016ct\3\2\2\2\u016d\u016e\7u\2\2\u016e\u016f\7{\2\2\u016f\u0170"+
		"\7p\2\2\u0170\u0171\7e\2\2\u0171v\3\2\2\2\u0172\u0173\7{\2\2\u0173\u0174"+
		"\7k\2\2\u0174\u0175\7g\2\2\u0175\u0176\7n\2\2\u0176\u0177\7f\2\2\u0177"+
		"x\3\2\2\2\u0178\u0179\7v\2\2\u0179\u017a\7{\2\2\u017a\u017b\7r\2\2\u017b"+
		"\u017c\7g\2\2\u017c\u017d\7q\2\2\u017d\u017e\7h\2\2\u017ez\3\2\2\2\u017f"+
		"\u0180\7c\2\2\u0180\u0181\7f\2\2\u0181\u0182\7f\2\2\u0182\u0183\7t\2\2"+
		"\u0183\u0184\7g\2\2\u0184\u0185\7u\2\2\u0185\u0186\7u\2\2\u0186\u0187"+
		"\7q\2\2\u0187\u0188\7h\2\2\u0188|\3\2\2\2\u0189\u018a\7p\2\2\u018a\u018b"+
		"\7g\2\2\u018b\u018c\7y\2\2\u018c~\3\2\2\2\u018d\u018e\7u\2\2\u018e\u018f"+
		"\7v\2\2\u018f\u0190\7c\2\2\u0190\u0191\7v\2\2\u0191\u0192\7k\2\2\u0192"+
		"\u0193\7e\2\2\u0193\u0080\3\2\2\2\u0194\u0195\7f\2\2\u0195\u0196\7q\2"+
		"\2\u0196\u0082\3\2\2\2\u0197\u0199\t\2\2\2\u0198\u0197\3\2\2\2\u0199\u019a"+
		"\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u0084\3\2\2\2\u019c"+
		"\u019e\t\2\2\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\7\60\2\2\u01a2"+
		"\u01a4\t\2\2\2\u01a3\u01a2\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2"+
		"\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01bc\3\2\2\2\u01a7\u01a9\t\2\2\2\u01a8"+
		"\u01a7\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2"+
		"\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\7\60\2\2\u01ad\u01af\t\2\2\2\u01ae"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1\3\2"+
		"\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\t\3\2\2\u01b3\u01b5\t\4\2\2\u01b4"+
		"\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b8\t\2"+
		"\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u019d\3\2\2\2\u01bb\u01a8\3\2"+
		"\2\2\u01bc\u0086\3\2\2\2\u01bd\u01bf\7\17\2\2\u01be\u01bd\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\7\f\2\2\u01c1\u01c2\3\2"+
		"\2\2\u01c2\u01c3\bD\2\2\u01c3\u0088\3\2\2\2\u01c4\u01c6\t\5\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2"+
		"\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01ca\bE\2\2\u01ca\u008a\3\2\2\2\u01cb"+
		"\u01cc\7=\2\2\u01cc\u008c\3\2\2\2\u01cd\u01d0\5\u0091I\2\u01ce\u01d0\7"+
		"a\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d5\3\2\2\2\u01d1"+
		"\u01d4\5\u0091I\2\u01d2\u01d4\t\6\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01db\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01d9\7\60\2\2\u01d9\u01da\7"+
		"\60\2\2\u01da\u01dc\7\60\2\2\u01db\u01d8\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u008e\3\2\2\2\u01dd\u01e2\5\u008dG\2\u01de\u01df\7\61\2\2\u01df\u01e1"+
		"\5\u008dG\2\u01e0\u01de\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2"+
		"\2\u01e2\u01e3\3\2\2\2\u01e3\u01e7\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6"+
		"\7]\2\2\u01e6\u01e8\7_\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ec\3\2\2\2\u01e9\u01ea\7\60\2\2\u01ea\u01eb\7\60\2\2\u01eb\u01ed\7"+
		"\60\2\2\u01ec\u01e9\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u0090\3\2\2\2\u01ee"+
		"\u01ef\t\7\2\2\u01ef\u0092\3\2\2\2\u01f0\u01f1\7\61\2\2\u01f1\u01f2\7"+
		",\2\2\u01f2\u01f6\3\2\2\2\u01f3\u01f5\13\2\2\2\u01f4\u01f3\3\2\2\2\u01f5"+
		"\u01f8\3\2\2\2\u01f6\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f9\3\2"+
		"\2\2\u01f8\u01f6\3\2\2\2\u01f9\u01fa\7,\2\2\u01fa\u01fb\7\61\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\bJ\2\2\u01fd\u0094\3\2\2\2\u01fe\u01ff\7\61"+
		"\2\2\u01ff\u0200\7\61\2\2\u0200\u0204\3\2\2\2\u0201\u0203\n\b\2\2\u0202"+
		"\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204\u0205\3\2"+
		"\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\bK\2\2\u0208"+
		"\u0096\3\2\2\2\u0209\u020a\7B\2\2\u020a\u020b\7$\2\2\u020b\u0211\3\2\2"+
		"\2\u020c\u0210\n\t\2\2\u020d\u020e\7$\2\2\u020e\u0210\7$\2\2\u020f\u020c"+
		"\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211"+
		"\u0212\3\2\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\7$"+
		"\2\2\u0215\u0098\3\2\2\2\u0216\u0218\7$\2\2\u0217\u0219\5\u009bN\2\u0218"+
		"\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\7$"+
		"\2\2\u021b\u009a\3\2\2\2\u021c\u021e\5\u009dO\2\u021d\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220\u009c\3\2"+
		"\2\2\u0221\u022a\n\n\2\2\u0222\u0223\7^\2\2\u0223\u022a\t\13\2\2\u0224"+
		"\u0225\7^\2\2\u0225\u022a\7\f\2\2\u0226\u0227\7^\2\2\u0227\u0228\7\17"+
		"\2\2\u0228\u022a\7\f\2\2\u0229\u0221\3\2\2\2\u0229\u0222\3\2\2\2\u0229"+
		"\u0224\3\2\2\2\u0229\u0226\3\2\2\2\u022a\u009e\3\2\2\2\34\2\u014a\u019a"+
		"\u019f\u01a5\u01aa\u01b0\u01b4\u01b9\u01bb\u01be\u01c7\u01cf\u01d3\u01d5"+
		"\u01db\u01e2\u01e7\u01ec\u01f6\u0204\u020f\u0211\u0218\u021f\u0229\3\b"+
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