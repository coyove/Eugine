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
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, Var=44, Const=45, Def=46, 
		Inline=47, Coroutine=48, For=49, If=50, Switch=51, Else=52, Enter=53, 
		Catch=54, Clone=55, Sync=56, Yield=57, Type=58, AddressOf=59, New=60, 
		Static=61, Do=62, Add=63, Sub=64, Not=65, AryOp=66, Integer=67, Double=68, 
		NEWLINE=69, WS=70, Semi=71, Identifier=72, JavaFullName=73, Letter=74, 
		BlockComment=75, LineComment=76, RawString=77, StringLiteral=78;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "Var", "Const", "Def", "Inline", "Coroutine", "For", 
		"If", "Switch", "Else", "Enter", "Catch", "Clone", "Sync", "Yield", "Type", 
		"AddressOf", "New", "Static", "Do", "Add", "Sub", "Not", "AryOp", "Integer", 
		"Double", "NEWLINE", "WS", "Semi", "Identifier", "JavaFullName", "Letter", 
		"BlockComment", "LineComment", "RawString", "StringLiteral", "SCharSequence", 
		"SChar"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'import'", "'reload'", "'.'", "'('", "')'", "'='", 
		"','", "'&'", "':'", "'['", "']'", "'=>'", "'@'", "'true'", "'false'", 
		"'null'", "'l'", "'L'", "'++'", "'--'", "'..'", "'...'", "'::'", "':>'", 
		"'#'", "'*'", "'/'", "'%'", "'<+'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'&&'", "'||'", "'+='", "'-='", "'*='", "'/='", "'var'", "'const'", 
		"'def'", "'inline'", "'coroutine'", null, "'if'", "'switch'", "'else'", 
		"'enter'", "'catch'", "'clone'", "'sync'", "'yield'", "'typeof'", "'addressof'", 
		"'new'", "'static'", "'do'", "'+'", "'-'", "'!'", null, null, null, null, 
		null, "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "Var", "Const", "Def", 
		"Inline", "Coroutine", "For", "If", "Switch", "Else", "Enter", "Catch", 
		"Clone", "Sync", "Yield", "Type", "AddressOf", "New", "Static", "Do", 
		"Add", "Sub", "Not", "AryOp", "Integer", "Double", "NEWLINE", "WS", "Semi", 
		"Identifier", "JavaFullName", "Letter", "BlockComment", "LineComment", 
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2P\u0238\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3\"\3\"\3#\3#"+
		"\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*"+
		"\3+\3+\3+\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u0146\n\62\3\63\3\63\3\63\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39"+
		"\39\39\39\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3?\3?\3?\3@\3@\3A\3A\3B\3B"+
		"\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u01a3\nC\3D\6D\u01a6\nD\rD\16D\u01a7"+
		"\3E\6E\u01ab\nE\rE\16E\u01ac\3E\3E\6E\u01b1\nE\rE\16E\u01b2\3E\6E\u01b6"+
		"\nE\rE\16E\u01b7\3E\3E\6E\u01bc\nE\rE\16E\u01bd\3E\3E\5E\u01c2\nE\3E\6"+
		"E\u01c5\nE\rE\16E\u01c6\5E\u01c9\nE\3F\5F\u01cc\nF\3F\3F\3F\3F\3G\6G\u01d3"+
		"\nG\rG\16G\u01d4\3G\3G\3H\3H\3I\3I\5I\u01dd\nI\3I\3I\7I\u01e1\nI\fI\16"+
		"I\u01e4\13I\3I\3I\3I\5I\u01e9\nI\3J\3J\3J\7J\u01ee\nJ\fJ\16J\u01f1\13"+
		"J\3J\3J\5J\u01f5\nJ\3J\3J\3J\5J\u01fa\nJ\3K\3K\3L\3L\3L\3L\7L\u0202\n"+
		"L\fL\16L\u0205\13L\3L\3L\3L\3L\3L\3M\3M\3M\3M\7M\u0210\nM\fM\16M\u0213"+
		"\13M\3M\3M\3N\3N\3N\3N\3N\3N\7N\u021d\nN\fN\16N\u0220\13N\3N\3N\3O\3O"+
		"\5O\u0226\nO\3O\3O\3P\6P\u022b\nP\rP\16P\u022c\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3"+
		"Q\5Q\u0237\nQ\3\u0203\2R\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63"+
		"\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62"+
		"c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087"+
		"E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009b"+
		"O\u009dP\u009f\2\u00a1\2\3\2\16\6\2\'\',,//\61\61\4\2>>@@\3\2\62;\4\2"+
		"GGgg\5\2--//^^\4\2\13\13\"\"\4\2\62;aa\4\2C\\c|\4\2\f\f\17\17\3\2$$\6"+
		"\2\f\f\17\17$$^^\f\2$$))AA^^cdhhppttvvxx\u0255\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y"+
		"\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2"+
		"\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2"+
		"\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u00a3\3\2\2\2\5\u00a5\3\2\2\2\7\u00a7"+
		"\3\2\2\2\t\u00ae\3\2\2\2\13\u00b5\3\2\2\2\r\u00b7\3\2\2\2\17\u00b9\3\2"+
		"\2\2\21\u00bb\3\2\2\2\23\u00bd\3\2\2\2\25\u00bf\3\2\2\2\27\u00c1\3\2\2"+
		"\2\31\u00c3\3\2\2\2\33\u00c5\3\2\2\2\35\u00c7\3\2\2\2\37\u00ca\3\2\2\2"+
		"!\u00cc\3\2\2\2#\u00d1\3\2\2\2%\u00d7\3\2\2\2\'\u00dc\3\2\2\2)\u00de\3"+
		"\2\2\2+\u00e0\3\2\2\2-\u00e3\3\2\2\2/\u00e6\3\2\2\2\61\u00e9\3\2\2\2\63"+
		"\u00ed\3\2\2\2\65\u00f0\3\2\2\2\67\u00f3\3\2\2\29\u00f5\3\2\2\2;\u00f7"+
		"\3\2\2\2=\u00f9\3\2\2\2?\u00fb\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E"+
		"\u0102\3\2\2\2G\u0105\3\2\2\2I\u0108\3\2\2\2K\u010b\3\2\2\2M\u010e\3\2"+
		"\2\2O\u0111\3\2\2\2Q\u0114\3\2\2\2S\u0117\3\2\2\2U\u011a\3\2\2\2W\u011d"+
		"\3\2\2\2Y\u0120\3\2\2\2[\u0124\3\2\2\2]\u012a\3\2\2\2_\u012e\3\2\2\2a"+
		"\u0135\3\2\2\2c\u0145\3\2\2\2e\u0147\3\2\2\2g\u014a\3\2\2\2i\u0151\3\2"+
		"\2\2k\u0156\3\2\2\2m\u015c\3\2\2\2o\u0162\3\2\2\2q\u0168\3\2\2\2s\u016d"+
		"\3\2\2\2u\u0173\3\2\2\2w\u017a\3\2\2\2y\u0184\3\2\2\2{\u0188\3\2\2\2}"+
		"\u018f\3\2\2\2\177\u0192\3\2\2\2\u0081\u0194\3\2\2\2\u0083\u0196\3\2\2"+
		"\2\u0085\u01a2\3\2\2\2\u0087\u01a5\3\2\2\2\u0089\u01c8\3\2\2\2\u008b\u01cb"+
		"\3\2\2\2\u008d\u01d2\3\2\2\2\u008f\u01d8\3\2\2\2\u0091\u01dc\3\2\2\2\u0093"+
		"\u01ea\3\2\2\2\u0095\u01fb\3\2\2\2\u0097\u01fd\3\2\2\2\u0099\u020b\3\2"+
		"\2\2\u009b\u0216\3\2\2\2\u009d\u0223\3\2\2\2\u009f\u022a\3\2\2\2\u00a1"+
		"\u0236\3\2\2\2\u00a3\u00a4\7}\2\2\u00a4\4\3\2\2\2\u00a5\u00a6\7\177\2"+
		"\2\u00a6\6\3\2\2\2\u00a7\u00a8\7k\2\2\u00a8\u00a9\7o\2\2\u00a9\u00aa\7"+
		"r\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac\u00ad\7v\2\2\u00ad\b"+
		"\3\2\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7g\2\2\u00b0\u00b1\7n\2\2\u00b1"+
		"\u00b2\7q\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7f\2\2\u00b4\n\3\2\2\2\u00b5"+
		"\u00b6\7\60\2\2\u00b6\f\3\2\2\2\u00b7\u00b8\7*\2\2\u00b8\16\3\2\2\2\u00b9"+
		"\u00ba\7+\2\2\u00ba\20\3\2\2\2\u00bb\u00bc\7?\2\2\u00bc\22\3\2\2\2\u00bd"+
		"\u00be\7.\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\26\3\2\2\2\u00c1"+
		"\u00c2\7<\2\2\u00c2\30\3\2\2\2\u00c3\u00c4\7]\2\2\u00c4\32\3\2\2\2\u00c5"+
		"\u00c6\7_\2\2\u00c6\34\3\2\2\2\u00c7\u00c8\7?\2\2\u00c8\u00c9\7@\2\2\u00c9"+
		"\36\3\2\2\2\u00ca\u00cb\7B\2\2\u00cb \3\2\2\2\u00cc\u00cd\7v\2\2\u00cd"+
		"\u00ce\7t\2\2\u00ce\u00cf\7w\2\2\u00cf\u00d0\7g\2\2\u00d0\"\3\2\2\2\u00d1"+
		"\u00d2\7h\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7u\2\2"+
		"\u00d5\u00d6\7g\2\2\u00d6$\3\2\2\2\u00d7\u00d8\7p\2\2\u00d8\u00d9\7w\2"+
		"\2\u00d9\u00da\7n\2\2\u00da\u00db\7n\2\2\u00db&\3\2\2\2\u00dc\u00dd\7"+
		"n\2\2\u00dd(\3\2\2\2\u00de\u00df\7N\2\2\u00df*\3\2\2\2\u00e0\u00e1\7-"+
		"\2\2\u00e1\u00e2\7-\2\2\u00e2,\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5"+
		"\7/\2\2\u00e5.\3\2\2\2\u00e6\u00e7\7\60\2\2\u00e7\u00e8\7\60\2\2\u00e8"+
		"\60\3\2\2\2\u00e9\u00ea\7\60\2\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\7\60"+
		"\2\2\u00ec\62\3\2\2\2\u00ed\u00ee\7<\2\2\u00ee\u00ef\7<\2\2\u00ef\64\3"+
		"\2\2\2\u00f0\u00f1\7<\2\2\u00f1\u00f2\7@\2\2\u00f2\66\3\2\2\2\u00f3\u00f4"+
		"\7%\2\2\u00f48\3\2\2\2\u00f5\u00f6\7,\2\2\u00f6:\3\2\2\2\u00f7\u00f8\7"+
		"\61\2\2\u00f8<\3\2\2\2\u00f9\u00fa\7\'\2\2\u00fa>\3\2\2\2\u00fb\u00fc"+
		"\7>\2\2\u00fc\u00fd\7-\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7>\2\2\u00ffB\3"+
		"\2\2\2\u0100\u0101\7@\2\2\u0101D\3\2\2\2\u0102\u0103\7>\2\2\u0103\u0104"+
		"\7?\2\2\u0104F\3\2\2\2\u0105\u0106\7@\2\2\u0106\u0107\7?\2\2\u0107H\3"+
		"\2\2\2\u0108\u0109\7?\2\2\u0109\u010a\7?\2\2\u010aJ\3\2\2\2\u010b\u010c"+
		"\7#\2\2\u010c\u010d\7?\2\2\u010dL\3\2\2\2\u010e\u010f\7(\2\2\u010f\u0110"+
		"\7(\2\2\u0110N\3\2\2\2\u0111\u0112\7~\2\2\u0112\u0113\7~\2\2\u0113P\3"+
		"\2\2\2\u0114\u0115\7-\2\2\u0115\u0116\7?\2\2\u0116R\3\2\2\2\u0117\u0118"+
		"\7/\2\2\u0118\u0119\7?\2\2\u0119T\3\2\2\2\u011a\u011b\7,\2\2\u011b\u011c"+
		"\7?\2\2\u011cV\3\2\2\2\u011d\u011e\7\61\2\2\u011e\u011f\7?\2\2\u011fX"+
		"\3\2\2\2\u0120\u0121\7x\2\2\u0121\u0122\7c\2\2\u0122\u0123\7t\2\2\u0123"+
		"Z\3\2\2\2\u0124\u0125\7e\2\2\u0125\u0126\7q\2\2\u0126\u0127\7p\2\2\u0127"+
		"\u0128\7u\2\2\u0128\u0129\7v\2\2\u0129\\\3\2\2\2\u012a\u012b\7f\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7h\2\2\u012d^\3\2\2\2\u012e\u012f\7k\2\2\u012f"+
		"\u0130\7p\2\2\u0130\u0131\7n\2\2\u0131\u0132\7k\2\2\u0132\u0133\7p\2\2"+
		"\u0133\u0134\7g\2\2\u0134`\3\2\2\2\u0135\u0136\7e\2\2\u0136\u0137\7q\2"+
		"\2\u0137\u0138\7t\2\2\u0138\u0139\7q\2\2\u0139\u013a\7w\2\2\u013a\u013b"+
		"\7v\2\2\u013b\u013c\7k\2\2\u013c\u013d\7p\2\2\u013d\u013e\7g\2\2\u013e"+
		"b\3\2\2\2\u013f\u0140\7h\2\2\u0140\u0141\7q\2\2\u0141\u0146\7t\2\2\u0142"+
		"\u0143\7t\2\2\u0143\u0144\7g\2\2\u0144\u0146\7x\2\2\u0145\u013f\3\2\2"+
		"\2\u0145\u0142\3\2\2\2\u0146d\3\2\2\2\u0147\u0148\7k\2\2\u0148\u0149\7"+
		"h\2\2\u0149f\3\2\2\2\u014a\u014b\7u\2\2\u014b\u014c\7y\2\2\u014c\u014d"+
		"\7k\2\2\u014d\u014e\7v\2\2\u014e\u014f\7e\2\2\u014f\u0150\7j\2\2\u0150"+
		"h\3\2\2\2\u0151\u0152\7g\2\2\u0152\u0153\7n\2\2\u0153\u0154\7u\2\2\u0154"+
		"\u0155\7g\2\2\u0155j\3\2\2\2\u0156\u0157\7g\2\2\u0157\u0158\7p\2\2\u0158"+
		"\u0159\7v\2\2\u0159\u015a\7g\2\2\u015a\u015b\7t\2\2\u015bl\3\2\2\2\u015c"+
		"\u015d\7e\2\2\u015d\u015e\7c\2\2\u015e\u015f\7v\2\2\u015f\u0160\7e\2\2"+
		"\u0160\u0161\7j\2\2\u0161n\3\2\2\2\u0162\u0163\7e\2\2\u0163\u0164\7n\2"+
		"\2\u0164\u0165\7q\2\2\u0165\u0166\7p\2\2\u0166\u0167\7g\2\2\u0167p\3\2"+
		"\2\2\u0168\u0169\7u\2\2\u0169\u016a\7{\2\2\u016a\u016b\7p\2\2\u016b\u016c"+
		"\7e\2\2\u016cr\3\2\2\2\u016d\u016e\7{\2\2\u016e\u016f\7k\2\2\u016f\u0170"+
		"\7g\2\2\u0170\u0171\7n\2\2\u0171\u0172\7f\2\2\u0172t\3\2\2\2\u0173\u0174"+
		"\7v\2\2\u0174\u0175\7{\2\2\u0175\u0176\7r\2\2\u0176\u0177\7g\2\2\u0177"+
		"\u0178\7q\2\2\u0178\u0179\7h\2\2\u0179v\3\2\2\2\u017a\u017b\7c\2\2\u017b"+
		"\u017c\7f\2\2\u017c\u017d\7f\2\2\u017d\u017e\7t\2\2\u017e\u017f\7g\2\2"+
		"\u017f\u0180\7u\2\2\u0180\u0181\7u\2\2\u0181\u0182\7q\2\2\u0182\u0183"+
		"\7h\2\2\u0183x\3\2\2\2\u0184\u0185\7p\2\2\u0185\u0186\7g\2\2\u0186\u0187"+
		"\7y\2\2\u0187z\3\2\2\2\u0188\u0189\7u\2\2\u0189\u018a\7v\2\2\u018a\u018b"+
		"\7c\2\2\u018b\u018c\7v\2\2\u018c\u018d\7k\2\2\u018d\u018e\7e\2\2\u018e"+
		"|\3\2\2\2\u018f\u0190\7f\2\2\u0190\u0191\7q\2\2\u0191~\3\2\2\2\u0192\u0193"+
		"\7-\2\2\u0193\u0080\3\2\2\2\u0194\u0195\7/\2\2\u0195\u0082\3\2\2\2\u0196"+
		"\u0197\7#\2\2\u0197\u0084\3\2\2\2\u0198\u01a3\t\2\2\2\u0199\u019a\7?\2"+
		"\2\u019a\u01a3\7?\2\2\u019b\u019c\7#\2\2\u019c\u01a3\7?\2\2\u019d\u01a3"+
		"\t\3\2\2\u019e\u019f\7@\2\2\u019f\u01a3\7?\2\2\u01a0\u01a1\7>\2\2\u01a1"+
		"\u01a3\7?\2\2\u01a2\u0198\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019b\3\2"+
		"\2\2\u01a2\u019d\3\2\2\2\u01a2\u019e\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u0086\3\2\2\2\u01a4\u01a6\t\4\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u0088\3\2\2\2\u01a9"+
		"\u01ab\t\4\2\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\7\60\2\2\u01af"+
		"\u01b1\t\4\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01c9\3\2\2\2\u01b4\u01b6\t\4\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2"+
		"\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb\7\60\2\2\u01ba\u01bc\t\4\2\2\u01bb"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bb\3\2\2\2\u01bd\u01be\3\2"+
		"\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\t\5\2\2\u01c0\u01c2\t\6\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c4\3\2\2\2\u01c3\u01c5\t\4"+
		"\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6"+
		"\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8\u01aa\3\2\2\2\u01c8\u01b5\3\2"+
		"\2\2\u01c9\u008a\3\2\2\2\u01ca\u01cc\7\17\2\2\u01cb\u01ca\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01ce\7\f\2\2\u01ce\u01cf\3\2"+
		"\2\2\u01cf\u01d0\bF\2\2\u01d0\u008c\3\2\2\2\u01d1\u01d3\t\7\2\2\u01d2"+
		"\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d4\u01d5\3\2"+
		"\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\bG\2\2\u01d7\u008e\3\2\2\2\u01d8"+
		"\u01d9\7=\2\2\u01d9\u0090\3\2\2\2\u01da\u01dd\5\u0095K\2\u01db\u01dd\7"+
		"a\2\2\u01dc\u01da\3\2\2\2\u01dc\u01db\3\2\2\2\u01dd\u01e2\3\2\2\2\u01de"+
		"\u01e1\5\u0095K\2\u01df\u01e1\t\b\2\2\u01e0\u01de\3\2\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e8\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\7\60\2\2\u01e6\u01e7\7"+
		"\60\2\2\u01e7\u01e9\7\60\2\2\u01e8\u01e5\3\2\2\2\u01e8\u01e9\3\2\2\2\u01e9"+
		"\u0092\3\2\2\2\u01ea\u01ef\5\u0091I\2\u01eb\u01ec\7\61\2\2\u01ec\u01ee"+
		"\5\u0091I\2\u01ed\u01eb\3\2\2\2\u01ee\u01f1\3\2\2\2\u01ef\u01ed\3\2\2"+
		"\2\u01ef\u01f0\3\2\2\2\u01f0\u01f4\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f2\u01f3"+
		"\7]\2\2\u01f3\u01f5\7_\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5"+
		"\u01f9\3\2\2\2\u01f6\u01f7\7\60\2\2\u01f7\u01f8\7\60\2\2\u01f8\u01fa\7"+
		"\60\2\2\u01f9\u01f6\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0094\3\2\2\2\u01fb"+
		"\u01fc\t\t\2\2\u01fc\u0096\3\2\2\2\u01fd\u01fe\7\61\2\2\u01fe\u01ff\7"+
		",\2\2\u01ff\u0203\3\2\2\2\u0200\u0202\13\2\2\2\u0201\u0200\3\2\2\2\u0202"+
		"\u0205\3\2\2\2\u0203\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204\u0206\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0206\u0207\7,\2\2\u0207\u0208\7\61\2\2\u0208"+
		"\u0209\3\2\2\2\u0209\u020a\bL\2\2\u020a\u0098\3\2\2\2\u020b\u020c\7\61"+
		"\2\2\u020c\u020d\7\61\2\2\u020d\u0211\3\2\2\2\u020e\u0210\n\n\2\2\u020f"+
		"\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0215\bM\2\2\u0215"+
		"\u009a\3\2\2\2\u0216\u0217\7B\2\2\u0217\u0218\7$\2\2\u0218\u021e\3\2\2"+
		"\2\u0219\u021d\n\13\2\2\u021a\u021b\7$\2\2\u021b\u021d\7$\2\2\u021c\u0219"+
		"\3\2\2\2\u021c\u021a\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c\3\2\2\2\u021e"+
		"\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021e\3\2\2\2\u0221\u0222\7$"+
		"\2\2\u0222\u009c\3\2\2\2\u0223\u0225\7$\2\2\u0224\u0226\5\u009fP\2\u0225"+
		"\u0224\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\3\2\2\2\u0227\u0228\7$"+
		"\2\2\u0228\u009e\3\2\2\2\u0229\u022b\5\u00a1Q\2\u022a\u0229\3\2\2\2\u022b"+
		"\u022c\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u00a0\3\2"+
		"\2\2\u022e\u0237\n\f\2\2\u022f\u0230\7^\2\2\u0230\u0237\t\r\2\2\u0231"+
		"\u0232\7^\2\2\u0232\u0237\7\f\2\2\u0233\u0234\7^\2\2\u0234\u0235\7\17"+
		"\2\2\u0235\u0237\7\f\2\2\u0236\u022e\3\2\2\2\u0236\u022f\3\2\2\2\u0236"+
		"\u0231\3\2\2\2\u0236\u0233\3\2\2\2\u0237\u00a2\3\2\2\2\35\2\u0145\u01a2"+
		"\u01a7\u01ac\u01b2\u01b7\u01bd\u01c1\u01c6\u01c8\u01cb\u01d4\u01dc\u01e0"+
		"\u01e2\u01e8\u01ef\u01f4\u01f9\u0203\u0211\u021c\u021e\u0225\u022c\u0236"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}