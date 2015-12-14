// Generated from de/lab4inf/wrb/WRBLexer.g4 by ANTLR 4.5
package de.lab4inf.wrb;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WRBLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUB=2, DIV=3, MUL=4, MOD=5, POW=6, COMMA=7, COLONE=8, SEMICOLONE=9, 
		DOT=10, ASSIGN=11, UNDERLINE=12, LPAREN=13, RPAREN=14, LBRACK=15, RBRACK=16, 
		INFINITY=17, ID=18, DOUBLE_=19, INTEGER=20, WS=21;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"ADD", "SUB", "DIV", "MUL", "MOD", "POW", "COMMA", "COLONE", "SEMICOLONE", 
		"DOT", "ASSIGN", "UNDERLINE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"INFINITY", "ID", "DOUBLE_", "INTEGER", "LETTER", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'-'", "'/'", "'*'", "'%'", null, "','", "':'", "';'", "'.'", 
		"'='", "'_'", "'('", "')'", "'['", "']'", "'Infinity'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ADD", "SUB", "DIV", "MUL", "MOD", "POW", "COMMA", "COLONE", "SEMICOLONE", 
		"DOT", "ASSIGN", "UNDERLINE", "LPAREN", "RPAREN", "LBRACK", "RBRACK", 
		"INFINITY", "ID", "DOUBLE_", "INTEGER", "WS"
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


	    boolean ignore=true;


	public WRBLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "WRBLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\27\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\5\7?\n\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\7\23c\n\23\f\23\16\23f\13\23\3\24\3\24\3\24\7\24k\n\24\f\24\16"+
		"\24n\13\24\3\24\3\24\5\24r\n\24\3\24\7\24u\n\24\f\24\16\24x\13\24\5\24"+
		"z\n\24\3\25\6\25}\n\25\r\25\16\25~\3\26\3\26\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\2/\27\3\2\6\4\2GGgg\4\2C\\"+
		"c|\3\2\62;\5\2\13\f\17\17\"\"\u008f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65\3\2\2\2\t\67\3\2\2\2\13"+
		"9\3\2\2\2\r>\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27"+
		"H\3\2\2\2\31J\3\2\2\2\33L\3\2\2\2\35N\3\2\2\2\37P\3\2\2\2!R\3\2\2\2#T"+
		"\3\2\2\2%]\3\2\2\2\'g\3\2\2\2)|\3\2\2\2+\u0080\3\2\2\2-\u0082\3\2\2\2"+
		"/\u0084\3\2\2\2\61\62\7-\2\2\62\4\3\2\2\2\63\64\7/\2\2\64\6\3\2\2\2\65"+
		"\66\7\61\2\2\66\b\3\2\2\2\678\7,\2\28\n\3\2\2\29:\7\'\2\2:\f\3\2\2\2;"+
		"<\7,\2\2<?\7,\2\2=?\7`\2\2>;\3\2\2\2>=\3\2\2\2?\16\3\2\2\2@A\7.\2\2A\20"+
		"\3\2\2\2BC\7<\2\2C\22\3\2\2\2DE\7=\2\2E\24\3\2\2\2FG\7\60\2\2G\26\3\2"+
		"\2\2HI\7?\2\2I\30\3\2\2\2JK\7a\2\2K\32\3\2\2\2LM\7*\2\2M\34\3\2\2\2NO"+
		"\7+\2\2O\36\3\2\2\2PQ\7]\2\2Q \3\2\2\2RS\7_\2\2S\"\3\2\2\2TU\7K\2\2UV"+
		"\7p\2\2VW\7h\2\2WX\7k\2\2XY\7p\2\2YZ\7k\2\2Z[\7v\2\2[\\\7{\2\2\\$\3\2"+
		"\2\2]d\5+\26\2^c\5+\26\2_c\5-\27\2`c\5\31\r\2ac\5\25\13\2b^\3\2\2\2b_"+
		"\3\2\2\2b`\3\2\2\2ba\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e&\3\2\2\2f"+
		"d\3\2\2\2gh\5)\25\2hl\5\25\13\2ik\5-\27\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2my\3\2\2\2nl\3\2\2\2oq\t\2\2\2pr\5\5\3\2qp\3\2\2\2qr\3\2\2"+
		"\2rv\3\2\2\2su\5-\27\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wz\3\2\2"+
		"\2xv\3\2\2\2yo\3\2\2\2yz\3\2\2\2z(\3\2\2\2{}\5-\27\2|{\3\2\2\2}~\3\2\2"+
		"\2~|\3\2\2\2~\177\3\2\2\2\177*\3\2\2\2\u0080\u0081\t\3\2\2\u0081,\3\2"+
		"\2\2\u0082\u0083\t\4\2\2\u0083.\3\2\2\2\u0084\u0085\t\5\2\2\u0085\u0086"+
		"\3\2\2\2\u0086\u0087\b\30\2\2\u0087\60\3\2\2\2\13\2>bdlqvy~\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}