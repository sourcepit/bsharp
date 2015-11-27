// Generated from Expr.g4 by ANTLR 4.5.1

package org.sourcepit.expr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, Identifier=51, WS=52;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
		"T__33", "T__34", "T__35", "T__36", "T__37", "T__38", "T__39", "T__40", 
		"T__41", "T__42", "T__43", "T__44", "T__45", "T__46", "T__47", "T__48", 
		"T__49", "Identifier", "JavaLetter", "JavaLetterOrDigit", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'boolean'", "'byte'", "'short'", "'int'", "'long'", "'char'", 
		"'float'", "'double'", "'['", "']'", "'extends'", "'&'", "'<'", "'>'", 
		"','", "'?'", "'super'", "'('", "')'", "'instanceof'", "'^'", "'|'", "'&&'", 
		"'||'", "':'", "'='", "'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", 
		"'>>='", "'>>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'<='", "'>='", 
		"'<<'", "'>>'", "'>>>'", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "Identifier", "WS"
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


	public ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\66\u0135\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3"+
		"\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3"+
		".\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u0120"+
		"\n\64\f\64\16\64\u0123\13\64\3\65\3\65\3\65\5\65\u0128\n\65\3\66\3\66"+
		"\3\66\5\66\u012d\n\66\3\67\6\67\u0130\n\67\r\67\16\67\u0131\3\67\3\67"+
		"\2\28\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\2k\2m"+
		"\66\3\2\5\u0127\2&&C\\aac|\u00a4\u00a7\u00ac\u00ac\u00b7\u00b7\u00bc\u00bc"+
		"\u00c2\u00d8\u00da\u00f8\u00fa\u0238\u0252\u02c3\u02c8\u02d3\u02e2\u02e6"+
		"\u02f0\u02f0\u037c\u037c\u0388\u0388\u038a\u038c\u038e\u038e\u0390\u03a3"+
		"\u03a5\u03d0\u03d2\u03f7\u03f9\u03fd\u0402\u0483\u048c\u04d0\u04d2\u04f7"+
		"\u04fa\u04fb\u0502\u0511\u0533\u0558\u055b\u055b\u0563\u0589\u05d2\u05ec"+
		"\u05f2\u05f4\u0623\u063c\u0642\u064c\u0670\u0671\u0673\u06d5\u06d7\u06d7"+
		"\u06e7\u06e8\u06f0\u06f1\u06fc\u06fe\u0701\u0701\u0712\u0712\u0714\u0731"+
		"\u074f\u0751\u0782\u07a7\u07b3\u07b3\u0906\u093b\u093f\u093f\u0952\u0952"+
		"\u095a\u0963\u0987\u098e\u0991\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4"+
		"\u09b8\u09bb\u09bf\u09bf\u09de\u09df\u09e1\u09e3\u09f2\u09f5\u0a07\u0a0c"+
		"\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37\u0a38\u0a3a\u0a3b"+
		"\u0a5b\u0a5e\u0a60\u0a60\u0a74\u0a76\u0a87\u0a8f\u0a91\u0a93\u0a95\u0aaa"+
		"\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abf\u0abf\u0ad2\u0ad2\u0ae2\u0ae3"+
		"\u0af3\u0af3\u0b07\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35"+
		"\u0b37\u0b3b\u0b3f\u0b3f\u0b5e\u0b5f\u0b61\u0b63\u0b73\u0b73\u0b85\u0b85"+
		"\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1"+
		"\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9\u0bbb\u0bfb\u0bfb\u0c07\u0c0e"+
		"\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37\u0c3b\u0c62\u0c63\u0c87\u0c8e"+
		"\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7\u0cbb\u0cbf\u0cbf\u0ce0\u0ce0"+
		"\u0ce2\u0ce3\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c\u0d3b\u0d62\u0d63"+
		"\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2\u0dc8\u0e03\u0e32"+
		"\u0e34\u0e35\u0e41\u0e48\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c\u0e8c"+
		"\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9\u0ea9"+
		"\u0eac\u0ead\u0eaf\u0eb2\u0eb4\u0eb5\u0ebf\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8"+
		"\u0ede\u0edf\u0f02\u0f02\u0f42\u0f49\u0f4b\u0f6c\u0f8a\u0f8d\u1002\u1023"+
		"\u1025\u1029\u102b\u102c\u1052\u1057\u10a2\u10c7\u10d2\u10fa\u1102\u115b"+
		"\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a\u124a\u124c\u124f"+
		"\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a\u128a\u128c\u128f"+
		"\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2\u12c2\u12c4\u12c7"+
		"\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312\u1312\u1314\u1317"+
		"\u131a\u1320\u1322\u1348\u134a\u135c\u13a2\u13f6\u1403\u166e\u1671\u1678"+
		"\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702\u170e\u1710\u1713\u1722\u1733"+
		"\u1742\u1753\u1762\u176e\u1770\u1772\u1782\u17b5\u17d9\u17d9\u17dd\u17de"+
		"\u1822\u1879\u1882\u18aa\u1902\u191e\u1952\u196f\u1972\u1976\u1d02\u1d6d"+
		"\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a\u1f1f\u1f22\u1f47\u1f4a\u1f4f"+
		"\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f\u1f5f\u1f61\u1f7f\u1f82\u1fb6"+
		"\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8\u1fce\u1fd2\u1fd5\u1fd8\u1fdd"+
		"\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u2041\u2042\u2056\u2056\u2073\u2073"+
		"\u2081\u2081\u20a2\u20b3\u2104\u2104\u2109\u2109\u210c\u2115\u2117\u2117"+
		"\u211b\u211f\u2126\u2126\u2128\u2128\u212a\u212a\u212c\u212f\u2131\u2133"+
		"\u2135\u213b\u213f\u2141\u2147\u214b\u2162\u2185\u3007\u3009\u3023\u302b"+
		"\u3033\u3037\u303a\u303e\u3043\u3098\u309f\u30a1\u30a3\u3101\u3107\u312e"+
		"\u3133\u3190\u31a2\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fa7\ua002\ua48e"+
		"\uac02\ud7a5\uf902\ufa2f\ufa32\ufa6c\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb1f"+
		"\ufb21\ufb2a\ufb2c\ufb38\ufb3a\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46"+
		"\ufb48\ufbb3\ufbd5\ufd3f\ufd52\ufd91\ufd94\ufdc9\ufdf2\ufdfe\ufe35\ufe36"+
		"\ufe4f\ufe51\ufe6b\ufe6b\ufe72\ufe76\ufe78\ufefe\uff06\uff06\uff23\uff3c"+
		"\uff41\uff41\uff43\uff5c\uff67\uffc0\uffc4\uffc9\uffcc\uffd1\uffd4\uffd9"+
		"\uffdc\uffde\uffe2\uffe3\uffe7\uffe8\u0183\2\2\n\20\35&&\62;C\\aac|\u0081"+
		"\u00a1\u00a4\u00a7\u00ac\u00ac\u00af\u00af\u00b7\u00b7\u00bc\u00bc\u00c2"+
		"\u00d8\u00da\u00f8\u00fa\u0238\u0252\u02c3\u02c8\u02d3\u02e2\u02e6\u02f0"+
		"\u02f0\u0302\u0359\u035f\u0371\u037c\u037c\u0388\u0388\u038a\u038c\u038e"+
		"\u038e\u0390\u03a3\u03a5\u03d0\u03d2\u03f7\u03f9\u03fd\u0402\u0483\u0485"+
		"\u0488\u048c\u04d0\u04d2\u04f7\u04fa\u04fb\u0502\u0511\u0533\u0558\u055b"+
		"\u055b\u0563\u0589\u0593\u05a3\u05a5\u05bb\u05bd\u05bf\u05c1\u05c1\u05c3"+
		"\u05c4\u05c6\u05c6\u05d2\u05ec\u05f2\u05f4\u0602\u0605\u0612\u0617\u0623"+
		"\u063c\u0642\u065a\u0662\u066b\u0670\u06d5\u06d7\u06df\u06e1\u06ea\u06ec"+
		"\u06fe\u0701\u0701\u0711\u074c\u074f\u0751\u0782\u07b3\u0903\u093b\u093e"+
		"\u094f\u0952\u0956\u095a\u0965\u0968\u0971\u0983\u0985\u0987\u098e\u0991"+
		"\u0992\u0995\u09aa\u09ac\u09b2\u09b4\u09b4\u09b8\u09bb\u09be\u09c6\u09c9"+
		"\u09ca\u09cd\u09cf\u09d9\u09d9\u09de\u09df\u09e1\u09e5\u09e8\u09f5\u0a03"+
		"\u0a05\u0a07\u0a0c\u0a11\u0a12\u0a15\u0a2a\u0a2c\u0a32\u0a34\u0a35\u0a37"+
		"\u0a38\u0a3a\u0a3b\u0a3e\u0a3e\u0a40\u0a44\u0a49\u0a4a\u0a4d\u0a4f\u0a5b"+
		"\u0a5e\u0a60\u0a60\u0a68\u0a76\u0a83\u0a85\u0a87\u0a8f\u0a91\u0a93\u0a95"+
		"\u0aaa\u0aac\u0ab2\u0ab4\u0ab5\u0ab7\u0abb\u0abe\u0ac7\u0ac9\u0acb\u0acd"+
		"\u0acf\u0ad2\u0ad2\u0ae2\u0ae5\u0ae8\u0af1\u0af3\u0af3\u0b03\u0b05\u0b07"+
		"\u0b0e\u0b11\u0b12\u0b15\u0b2a\u0b2c\u0b32\u0b34\u0b35\u0b37\u0b3b\u0b3e"+
		"\u0b45\u0b49\u0b4a\u0b4d\u0b4f\u0b58\u0b59\u0b5e\u0b5f\u0b61\u0b63\u0b68"+
		"\u0b71\u0b73\u0b73\u0b84\u0b85\u0b87\u0b8c\u0b90\u0b92\u0b94\u0b97\u0b9b"+
		"\u0b9c\u0b9e\u0b9e\u0ba0\u0ba1\u0ba5\u0ba6\u0baa\u0bac\u0bb0\u0bb7\u0bb9"+
		"\u0bbb\u0bc0\u0bc4\u0bc8\u0bca\u0bcc\u0bcf\u0bd9\u0bd9\u0be9\u0bf1\u0bfb"+
		"\u0bfb\u0c03\u0c05\u0c07\u0c0e\u0c10\u0c12\u0c14\u0c2a\u0c2c\u0c35\u0c37"+
		"\u0c3b\u0c40\u0c46\u0c48\u0c4a\u0c4c\u0c4f\u0c57\u0c58\u0c62\u0c63\u0c68"+
		"\u0c71\u0c84\u0c85\u0c87\u0c8e\u0c90\u0c92\u0c94\u0caa\u0cac\u0cb5\u0cb7"+
		"\u0cbb\u0cbe\u0cc6\u0cc8\u0cca\u0ccc\u0ccf\u0cd7\u0cd8\u0ce0\u0ce0\u0ce2"+
		"\u0ce3\u0ce8\u0cf1\u0d04\u0d05\u0d07\u0d0e\u0d10\u0d12\u0d14\u0d2a\u0d2c"+
		"\u0d3b\u0d40\u0d45\u0d48\u0d4a\u0d4c\u0d4f\u0d59\u0d59\u0d62\u0d63\u0d68"+
		"\u0d71\u0d84\u0d85\u0d87\u0d98\u0d9c\u0db3\u0db5\u0dbd\u0dbf\u0dbf\u0dc2"+
		"\u0dc8\u0dcc\u0dcc\u0dd1\u0dd6\u0dd8\u0dd8\u0dda\u0de1\u0df4\u0df5\u0e03"+
		"\u0e3c\u0e41\u0e50\u0e52\u0e5b\u0e83\u0e84\u0e86\u0e86\u0e89\u0e8a\u0e8c"+
		"\u0e8c\u0e8f\u0e8f\u0e96\u0e99\u0e9b\u0ea1\u0ea3\u0ea5\u0ea7\u0ea7\u0ea9"+
		"\u0ea9\u0eac\u0ead\u0eaf\u0ebb\u0ebd\u0ebf\u0ec2\u0ec6\u0ec8\u0ec8\u0eca"+
		"\u0ecf\u0ed2\u0edb\u0ede\u0edf\u0f02\u0f02\u0f1a\u0f1b\u0f22\u0f2b\u0f37"+
		"\u0f37\u0f39\u0f39\u0f3b\u0f3b\u0f40\u0f49\u0f4b\u0f6c\u0f73\u0f86\u0f88"+
		"\u0f8d\u0f92\u0f99\u0f9b\u0fbe\u0fc8\u0fc8\u1002\u1023\u1025\u1029\u102b"+
		"\u102c\u102e\u1034\u1038\u103b\u1042\u104b\u1052\u105b\u10a2\u10c7\u10d2"+
		"\u10fa\u1102\u115b\u1161\u11a4\u11aa\u11fb\u1202\u1208\u120a\u1248\u124a"+
		"\u124a\u124c\u124f\u1252\u1258\u125a\u125a\u125c\u125f\u1262\u1288\u128a"+
		"\u128a\u128c\u128f\u1292\u12b0\u12b2\u12b2\u12b4\u12b7\u12ba\u12c0\u12c2"+
		"\u12c2\u12c4\u12c7\u12ca\u12d0\u12d2\u12d8\u12da\u12f0\u12f2\u1310\u1312"+
		"\u1312\u1314\u1317\u131a\u1320\u1322\u1348\u134a\u135c\u136b\u1373\u13a2"+
		"\u13f6\u1403\u166e\u1671\u1678\u1683\u169c\u16a2\u16ec\u16f0\u16f2\u1702"+
		"\u170e\u1710\u1716\u1722\u1736\u1742\u1755\u1762\u176e\u1770\u1772\u1774"+
		"\u1775\u1782\u17d5\u17d9\u17d9\u17dd\u17df\u17e2\u17eb\u180d\u180f\u1812"+
		"\u181b\u1822\u1879\u1882\u18ab\u1902\u191e\u1922\u192d\u1932\u193d\u1948"+
		"\u196f\u1972\u1976\u1d02\u1d6d\u1e02\u1e9d\u1ea2\u1efb\u1f02\u1f17\u1f1a"+
		"\u1f1f\u1f22\u1f47\u1f4a\u1f4f\u1f52\u1f59\u1f5b\u1f5b\u1f5d\u1f5d\u1f5f"+
		"\u1f5f\u1f61\u1f7f\u1f82\u1fb6\u1fb8\u1fbe\u1fc0\u1fc0\u1fc4\u1fc6\u1fc8"+
		"\u1fce\u1fd2\u1fd5\u1fd8\u1fdd\u1fe2\u1fee\u1ff4\u1ff6\u1ff8\u1ffe\u200e"+
		"\u2011\u202c\u2030\u2041\u2042\u2056\u2056\u2062\u2065\u206c\u2071\u2073"+
		"\u2073\u2081\u2081\u20a2\u20b3\u20d2\u20de\u20e3\u20e3\u20e7\u20ec\u2104"+
		"\u2104\u2109\u2109\u210c\u2115\u2117\u2117\u211b\u211f\u2126\u2126\u2128"+
		"\u2128\u212a\u212a\u212c\u212f\u2131\u2133\u2135\u213b\u213f\u2141\u2147"+
		"\u214b\u2162\u2185\u3007\u3009\u3023\u3031\u3033\u3037\u303a\u303e\u3043"+
		"\u3098\u309b\u309c\u309f\u30a1\u30a3\u3101\u3107\u312e\u3133\u3190\u31a2"+
		"\u31b9\u31f2\u3201\u3402\u4db7\u4e02\u9fa7\ua002\ua48e\uac02\ud7a5\uf902"+
		"\ufa2f\ufa32\ufa6c\ufb02\ufb08\ufb15\ufb19\ufb1f\ufb2a\ufb2c\ufb38\ufb3a"+
		"\ufb3e\ufb40\ufb40\ufb42\ufb43\ufb45\ufb46\ufb48\ufbb3\ufbd5\ufd3f\ufd52"+
		"\ufd91\ufd94\ufdc9\ufdf2\ufdfe\ufe02\ufe11\ufe22\ufe25\ufe35\ufe36\ufe4f"+
		"\ufe51\ufe6b\ufe6b\ufe72\ufe76\ufe78\ufefe\uff01\uff01\uff06\uff06\uff12"+
		"\uff1b\uff23\uff3c\uff41\uff41\uff43\uff5c\uff67\uffc0\uffc4\uffc9\uffcc"+
		"\uffd1\uffd4\uffd9\uffdc\uffde\uffe2\uffe3\uffe7\uffe8\ufffb\ufffd\5\2"+
		"\13\f\16\17\"\"\u0136\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2m\3\2\2"+
		"\2\3o\3\2\2\2\5q\3\2\2\2\7y\3\2\2\2\t~\3\2\2\2\13\u0084\3\2\2\2\r\u0088"+
		"\3\2\2\2\17\u008d\3\2\2\2\21\u0092\3\2\2\2\23\u0098\3\2\2\2\25\u009f\3"+
		"\2\2\2\27\u00a1\3\2\2\2\31\u00a3\3\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2"+
		"\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00bb"+
		"\3\2\2\2)\u00bd\3\2\2\2+\u00bf\3\2\2\2-\u00ca\3\2\2\2/\u00cc\3\2\2\2\61"+
		"\u00ce\3\2\2\2\63\u00d1\3\2\2\2\65\u00d4\3\2\2\2\67\u00d6\3\2\2\29\u00d8"+
		"\3\2\2\2;\u00db\3\2\2\2=\u00de\3\2\2\2?\u00e1\3\2\2\2A\u00e4\3\2\2\2C"+
		"\u00e7\3\2\2\2E\u00eb\3\2\2\2G\u00ef\3\2\2\2I\u00f4\3\2\2\2K\u00f7\3\2"+
		"\2\2M\u00fa\3\2\2\2O\u00fd\3\2\2\2Q\u0100\3\2\2\2S\u0103\3\2\2\2U\u0106"+
		"\3\2\2\2W\u0109\3\2\2\2Y\u010c\3\2\2\2[\u010f\3\2\2\2]\u0113\3\2\2\2_"+
		"\u0115\3\2\2\2a\u0117\3\2\2\2c\u0119\3\2\2\2e\u011b\3\2\2\2g\u011d\3\2"+
		"\2\2i\u0127\3\2\2\2k\u012c\3\2\2\2m\u012f\3\2\2\2op\7\60\2\2p\4\3\2\2"+
		"\2qr\7d\2\2rs\7q\2\2st\7q\2\2tu\7n\2\2uv\7g\2\2vw\7c\2\2wx\7p\2\2x\6\3"+
		"\2\2\2yz\7d\2\2z{\7{\2\2{|\7v\2\2|}\7g\2\2}\b\3\2\2\2~\177\7u\2\2\177"+
		"\u0080\7j\2\2\u0080\u0081\7q\2\2\u0081\u0082\7t\2\2\u0082\u0083\7v\2\2"+
		"\u0083\n\3\2\2\2\u0084\u0085\7k\2\2\u0085\u0086\7p\2\2\u0086\u0087\7v"+
		"\2\2\u0087\f\3\2\2\2\u0088\u0089\7n\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7p\2\2\u008b\u008c\7i\2\2\u008c\16\3\2\2\2\u008d\u008e\7e\2\2\u008e\u008f"+
		"\7j\2\2\u008f\u0090\7c\2\2\u0090\u0091\7t\2\2\u0091\20\3\2\2\2\u0092\u0093"+
		"\7h\2\2\u0093\u0094\7n\2\2\u0094\u0095\7q\2\2\u0095\u0096\7c\2\2\u0096"+
		"\u0097\7v\2\2\u0097\22\3\2\2\2\u0098\u0099\7f\2\2\u0099\u009a\7q\2\2\u009a"+
		"\u009b\7w\2\2\u009b\u009c\7d\2\2\u009c\u009d\7n\2\2\u009d\u009e\7g\2\2"+
		"\u009e\24\3\2\2\2\u009f\u00a0\7]\2\2\u00a0\26\3\2\2\2\u00a1\u00a2\7_\2"+
		"\2\u00a2\30\3\2\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7z\2\2\u00a5\u00a6"+
		"\7v\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7p\2\2\u00a8\u00a9\7f\2\2\u00a9"+
		"\u00aa\7u\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7(\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7>\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7@\2\2\u00b0 \3\2\2\2\u00b1"+
		"\u00b2\7.\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7A\2\2\u00b4$\3\2\2\2\u00b5"+
		"\u00b6\7u\2\2\u00b6\u00b7\7w\2\2\u00b7\u00b8\7r\2\2\u00b8\u00b9\7g\2\2"+
		"\u00b9\u00ba\7t\2\2\u00ba&\3\2\2\2\u00bb\u00bc\7*\2\2\u00bc(\3\2\2\2\u00bd"+
		"\u00be\7+\2\2\u00be*\3\2\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1"+
		"\u00c2\7u\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00c6\7e\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9"+
		"\7h\2\2\u00c9,\3\2\2\2\u00ca\u00cb\7`\2\2\u00cb.\3\2\2\2\u00cc\u00cd\7"+
		"~\2\2\u00cd\60\3\2\2\2\u00ce\u00cf\7(\2\2\u00cf\u00d0\7(\2\2\u00d0\62"+
		"\3\2\2\2\u00d1\u00d2\7~\2\2\u00d2\u00d3\7~\2\2\u00d3\64\3\2\2\2\u00d4"+
		"\u00d5\7<\2\2\u00d5\66\3\2\2\2\u00d6\u00d7\7?\2\2\u00d78\3\2\2\2\u00d8"+
		"\u00d9\7,\2\2\u00d9\u00da\7?\2\2\u00da:\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc"+
		"\u00dd\7?\2\2\u00dd<\3\2\2\2\u00de\u00df\7\'\2\2\u00df\u00e0\7?\2\2\u00e0"+
		">\3\2\2\2\u00e1\u00e2\7-\2\2\u00e2\u00e3\7?\2\2\u00e3@\3\2\2\2\u00e4\u00e5"+
		"\7/\2\2\u00e5\u00e6\7?\2\2\u00e6B\3\2\2\2\u00e7\u00e8\7>\2\2\u00e8\u00e9"+
		"\7>\2\2\u00e9\u00ea\7?\2\2\u00eaD\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed"+
		"\7@\2\2\u00ed\u00ee\7?\2\2\u00eeF\3\2\2\2\u00ef\u00f0\7@\2\2\u00f0\u00f1"+
		"\7@\2\2\u00f1\u00f2\7@\2\2\u00f2\u00f3\7?\2\2\u00f3H\3\2\2\2\u00f4\u00f5"+
		"\7(\2\2\u00f5\u00f6\7?\2\2\u00f6J\3\2\2\2\u00f7\u00f8\7`\2\2\u00f8\u00f9"+
		"\7?\2\2\u00f9L\3\2\2\2\u00fa\u00fb\7~\2\2\u00fb\u00fc\7?\2\2\u00fcN\3"+
		"\2\2\2\u00fd\u00fe\7?\2\2\u00fe\u00ff\7?\2\2\u00ffP\3\2\2\2\u0100\u0101"+
		"\7#\2\2\u0101\u0102\7?\2\2\u0102R\3\2\2\2\u0103\u0104\7>\2\2\u0104\u0105"+
		"\7?\2\2\u0105T\3\2\2\2\u0106\u0107\7@\2\2\u0107\u0108\7?\2\2\u0108V\3"+
		"\2\2\2\u0109\u010a\7>\2\2\u010a\u010b\7>\2\2\u010bX\3\2\2\2\u010c\u010d"+
		"\7@\2\2\u010d\u010e\7@\2\2\u010eZ\3\2\2\2\u010f\u0110\7@\2\2\u0110\u0111"+
		"\7@\2\2\u0111\u0112\7@\2\2\u0112\\\3\2\2\2\u0113\u0114\7-\2\2\u0114^\3"+
		"\2\2\2\u0115\u0116\7/\2\2\u0116`\3\2\2\2\u0117\u0118\7,\2\2\u0118b\3\2"+
		"\2\2\u0119\u011a\7\61\2\2\u011ad\3\2\2\2\u011b\u011c\7\'\2\2\u011cf\3"+
		"\2\2\2\u011d\u0121\5i\65\2\u011e\u0120\5k\66\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122h\3\2\2\2"+
		"\u0123\u0121\3\2\2\2\u0124\u0128\t\2\2\2\u0125\u0126\4\ud802\udc01\2\u0126"+
		"\u0128\4\udc02\ue001\2\u0127\u0124\3\2\2\2\u0127\u0125\3\2\2\2\u0128j"+
		"\3\2\2\2\u0129\u012d\t\3\2\2\u012a\u012b\4\ud802\udc01\2\u012b\u012d\4"+
		"\udc02\ue001\2\u012c\u0129\3\2\2\2\u012c\u012a\3\2\2\2\u012dl\3\2\2\2"+
		"\u012e\u0130\t\4\2\2\u012f\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u012f"+
		"\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b\67\2\2"+
		"\u0134n\3\2\2\2\7\2\u0121\u0127\u012c\u0131\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}