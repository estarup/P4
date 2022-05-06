// Generated from Hello.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ADD=1, SUBTRACT=2, MULTIPLY=3, DIVIDE=4, ASSIGN=5, SEMICOLON=6, EQUAL=7, 
		NOTEQUAL=8, LESSTHAN=9, MORETHAN=10, LESSOREQUAL=11, MOREOREQUAL=12, LCURL=13, 
		RCURL=14, LPAREN=15, RPAREN=16, IF=17, ELSE=18, WHILE=19, CREATE=20, RETURN=21, 
		CAR=22, CARSPAWNER=23, TRAFFICLIGHT=24, GRID=25, BOOL=26, METH_RETURN_TYPE=27, 
		VAR_TYPE=28, INTEGER=29, DOUBLE=30, METH_NAME=31, ID=32, STRING=33, WS=34;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", "EQUAL", 
			"NOTEQUAL", "LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", "LCURL", 
			"RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "CREATE", "RETURN", 
			"CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", "METH_RETURN_TYPE", 
			"VAR_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", "STRING", "LETTER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'create'", "'return'", "'Car'", "'CarSpawner'", "'TrafficLight'", 
			"'Grid'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
			"EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", 
			"LCURL", "RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "CREATE", 
			"RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", "METH_RETURN_TYPE", 
			"VAR_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", "STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public HelloLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2$\u0116\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00b6\n\33\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00c5\n\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u00d6\n\35\3\36\3\36\3\36\7\36\u00db\n\36\f\36\16\36\u00de"+
		"\13\36\5\36\u00e0\n\36\3\37\3\37\5\37\u00e4\n\37\3\37\7\37\u00e7\n\37"+
		"\f\37\16\37\u00ea\13\37\3 \3 \7 \u00ee\n \f \16 \u00f1\13 \3!\6!\u00f4"+
		"\n!\r!\16!\u00f5\3!\7!\u00f9\n!\f!\16!\u00fc\13!\3!\7!\u00ff\n!\f!\16"+
		"!\u0102\13!\3\"\3\"\6\"\u0106\n\"\r\"\16\"\u0107\3\"\3\"\3#\3#\3$\3$\3"+
		"%\6%\u0111\n%\r%\16%\u0112\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I$\3\2\n\3\2\62\62"+
		"\3\2\63;\3\2\62;\3\2C\\\4\2C\\c|\3\2c|\5\2\62;C\\c|\5\2\13\f\17\17\"\""+
		"\2\u0122\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2I\3\2\2\2"+
		"\3K\3\2\2\2\5M\3\2\2\2\7O\3\2\2\2\tQ\3\2\2\2\13S\3\2\2\2\rU\3\2\2\2\17"+
		"W\3\2\2\2\21Z\3\2\2\2\23]\3\2\2\2\25_\3\2\2\2\27a\3\2\2\2\31d\3\2\2\2"+
		"\33g\3\2\2\2\35i\3\2\2\2\37k\3\2\2\2!m\3\2\2\2#o\3\2\2\2%r\3\2\2\2\'w"+
		"\3\2\2\2)}\3\2\2\2+\u0084\3\2\2\2-\u008b\3\2\2\2/\u008f\3\2\2\2\61\u009a"+
		"\3\2\2\2\63\u00a7\3\2\2\2\65\u00b5\3\2\2\2\67\u00c4\3\2\2\29\u00d5\3\2"+
		"\2\2;\u00df\3\2\2\2=\u00e1\3\2\2\2?\u00eb\3\2\2\2A\u00f3\3\2\2\2C\u0103"+
		"\3\2\2\2E\u010b\3\2\2\2G\u010d\3\2\2\2I\u0110\3\2\2\2KL\7-\2\2L\4\3\2"+
		"\2\2MN\7/\2\2N\6\3\2\2\2OP\7,\2\2P\b\3\2\2\2QR\7\61\2\2R\n\3\2\2\2ST\7"+
		"?\2\2T\f\3\2\2\2UV\7=\2\2V\16\3\2\2\2WX\7?\2\2XY\7?\2\2Y\20\3\2\2\2Z["+
		"\7#\2\2[\\\7?\2\2\\\22\3\2\2\2]^\7>\2\2^\24\3\2\2\2_`\7@\2\2`\26\3\2\2"+
		"\2ab\7>\2\2bc\7?\2\2c\30\3\2\2\2de\7@\2\2ef\7?\2\2f\32\3\2\2\2gh\7}\2"+
		"\2h\34\3\2\2\2ij\7\177\2\2j\36\3\2\2\2kl\7*\2\2l \3\2\2\2mn\7+\2\2n\""+
		"\3\2\2\2op\7k\2\2pq\7h\2\2q$\3\2\2\2rs\7g\2\2st\7n\2\2tu\7u\2\2uv\7g\2"+
		"\2v&\3\2\2\2wx\7y\2\2xy\7j\2\2yz\7k\2\2z{\7n\2\2{|\7g\2\2|(\3\2\2\2}~"+
		"\7e\2\2~\177\7t\2\2\177\u0080\7g\2\2\u0080\u0081\7c\2\2\u0081\u0082\7"+
		"v\2\2\u0082\u0083\7g\2\2\u0083*\3\2\2\2\u0084\u0085\7t\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7v\2\2\u0087\u0088\7w\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7p\2\2\u008a,\3\2\2\2\u008b\u008c\7E\2\2\u008c\u008d\7c\2\2\u008d"+
		"\u008e\7t\2\2\u008e.\3\2\2\2\u008f\u0090\7E\2\2\u0090\u0091\7c\2\2\u0091"+
		"\u0092\7t\2\2\u0092\u0093\7U\2\2\u0093\u0094\7r\2\2\u0094\u0095\7c\2\2"+
		"\u0095\u0096\7y\2\2\u0096\u0097\7p\2\2\u0097\u0098\7g\2\2\u0098\u0099"+
		"\7t\2\2\u0099\60\3\2\2\2\u009a\u009b\7V\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7c\2\2\u009d\u009e\7h\2\2\u009e\u009f\7h\2\2\u009f\u00a0\7k\2\2\u00a0"+
		"\u00a1\7e\2\2\u00a1\u00a2\7N\2\2\u00a2\u00a3\7k\2\2\u00a3\u00a4\7i\2\2"+
		"\u00a4\u00a5\7j\2\2\u00a5\u00a6\7v\2\2\u00a6\62\3\2\2\2\u00a7\u00a8\7"+
		"I\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7k\2\2\u00aa\u00ab\7f\2\2\u00ab\64"+
		"\3\2\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7t\2\2\u00ae\u00af\7w\2\2\u00af"+
		"\u00b6\7g\2\2\u00b0\u00b1\7h\2\2\u00b1\u00b2\7c\2\2\u00b2\u00b3\7n\2\2"+
		"\u00b3\u00b4\7u\2\2\u00b4\u00b6\7g\2\2\u00b5\u00ac\3\2\2\2\u00b5\u00b0"+
		"\3\2\2\2\u00b6\66\3\2\2\2\u00b7\u00b8\7x\2\2\u00b8\u00b9\7q\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00c5\7f\2\2\u00bb\u00bc\7K\2\2\u00bc\u00bd\7p\2\2"+
		"\u00bd\u00c5\7v\2\2\u00be\u00bf\7F\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1"+
		"\7w\2\2\u00c1\u00c2\7d\2\2\u00c2\u00c3\7n\2\2\u00c3\u00c5\7g\2\2\u00c4"+
		"\u00b7\3\2\2\2\u00c4\u00bb\3\2\2\2\u00c4\u00be\3\2\2\2\u00c58\3\2\2\2"+
		"\u00c6\u00c7\7k\2\2\u00c7\u00c8\7p\2\2\u00c8\u00d6\7v\2\2\u00c9\u00ca"+
		"\7f\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc\7w\2\2\u00cc\u00cd\7d\2\2\u00cd"+
		"\u00ce\7n\2\2\u00ce\u00d6\7g\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7p\2\2\u00d4\u00d6"+
		"\7i\2\2\u00d5\u00c6\3\2\2\2\u00d5\u00c9\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d6"+
		":\3\2\2\2\u00d7\u00e0\t\2\2\2\u00d8\u00dc\t\3\2\2\u00d9\u00db\t\4\2\2"+
		"\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd"+
		"\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00d7\3\2\2\2\u00df"+
		"\u00d8\3\2\2\2\u00e0<\3\2\2\2\u00e1\u00e3\5;\36\2\u00e2\u00e4\7\60\2\2"+
		"\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e8\3\2\2\2\u00e5\u00e7"+
		"\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9>\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\t\5\2\2"+
		"\u00ec\u00ee\t\6\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0@\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2"+
		"\u00f4\t\7\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f9\5E#\2\u00f8\u00f7"+
		"\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u0100\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\5G$\2\u00fe\u00fd\3\2\2"+
		"\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101B"+
		"\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0105\7$\2\2\u0104\u0106\t\b\2\2\u0105"+
		"\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010a\7$\2\2\u010aD\3\2\2\2\u010b\u010c"+
		"\t\6\2\2\u010cF\3\2\2\2\u010d\u010e\t\4\2\2\u010eH\3\2\2\2\u010f\u0111"+
		"\t\t\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\b%\2\2\u0115J\3\2\2\2\20"+
		"\2\u00b5\u00c4\u00d5\u00dc\u00df\u00e3\u00e8\u00ef\u00f5\u00fa\u0100\u0107"+
		"\u0112\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}