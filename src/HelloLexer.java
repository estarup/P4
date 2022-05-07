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
		T__0=1, ADD=2, SUBTRACT=3, MULTIPLY=4, DIVIDE=5, ASSIGN=6, SEMICOLON=7, 
		EQUAL=8, NOTEQUAL=9, LESSTHAN=10, MORETHAN=11, LESSOREQUAL=12, MOREOREQUAL=13, 
		LCURL=14, RCURL=15, LPAREN=16, RPAREN=17, IF=18, ELSE=19, WHILE=20, CREATE=21, 
		RETURN=22, CAR=23, CARSPAWNER=24, TRAFFICLIGHT=25, GRID=26, BOOL=27, METH_RETURN_TYPE=28, 
		VAR_TYPE=29, INTEGER=30, DOUBLE=31, METH_NAME=32, ID=33, STRING=34, WS=35;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
			"EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", 
			"LCURL", "RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "CREATE", 
			"RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", "METH_RETURN_TYPE", 
			"VAR_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", "STRING", "LETTER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'create'", "'return'", "'Car'", "'CarSpawner'", "'TrafficLight'", 
			"'Grid'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u011a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u00ba"+
		"\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u00c9\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u00da\n\36\3\37\3\37\3\37\7\37\u00df\n\37\f"+
		"\37\16\37\u00e2\13\37\5\37\u00e4\n\37\3 \3 \5 \u00e8\n \3 \7 \u00eb\n"+
		" \f \16 \u00ee\13 \3!\3!\7!\u00f2\n!\f!\16!\u00f5\13!\3\"\6\"\u00f8\n"+
		"\"\r\"\16\"\u00f9\3\"\7\"\u00fd\n\"\f\"\16\"\u0100\13\"\3\"\7\"\u0103"+
		"\n\"\f\"\16\"\u0106\13\"\3#\3#\6#\u010a\n#\r#\16#\u010b\3#\3#\3$\3$\3"+
		"%\3%\3&\6&\u0115\n&\r&\16&\u0116\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b"+
		"\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26"+
		"+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K%\3\2\n"+
		"\3\2\62\62\3\2\63;\3\2\62;\3\2C\\\4\2C\\c|\3\2c|\5\2\62;C\\c|\5\2\13\f"+
		"\17\17\"\"\2\u0126\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3"+
		"\2\2\2\rW\3\2\2\2\17Y\3\2\2\2\21[\3\2\2\2\23^\3\2\2\2\25a\3\2\2\2\27c"+
		"\3\2\2\2\31e\3\2\2\2\33h\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3"+
		"\2\2\2%s\3\2\2\2\'v\3\2\2\2){\3\2\2\2+\u0081\3\2\2\2-\u0088\3\2\2\2/\u008f"+
		"\3\2\2\2\61\u0093\3\2\2\2\63\u009e\3\2\2\2\65\u00ab\3\2\2\2\67\u00b9\3"+
		"\2\2\29\u00c8\3\2\2\2;\u00d9\3\2\2\2=\u00e3\3\2\2\2?\u00e5\3\2\2\2A\u00ef"+
		"\3\2\2\2C\u00f7\3\2\2\2E\u0107\3\2\2\2G\u010f\3\2\2\2I\u0111\3\2\2\2K"+
		"\u0114\3\2\2\2MN\7.\2\2N\4\3\2\2\2OP\7-\2\2P\6\3\2\2\2QR\7/\2\2R\b\3\2"+
		"\2\2ST\7,\2\2T\n\3\2\2\2UV\7\61\2\2V\f\3\2\2\2WX\7?\2\2X\16\3\2\2\2YZ"+
		"\7=\2\2Z\20\3\2\2\2[\\\7?\2\2\\]\7?\2\2]\22\3\2\2\2^_\7#\2\2_`\7?\2\2"+
		"`\24\3\2\2\2ab\7>\2\2b\26\3\2\2\2cd\7@\2\2d\30\3\2\2\2ef\7>\2\2fg\7?\2"+
		"\2g\32\3\2\2\2hi\7@\2\2ij\7?\2\2j\34\3\2\2\2kl\7}\2\2l\36\3\2\2\2mn\7"+
		"\177\2\2n \3\2\2\2op\7*\2\2p\"\3\2\2\2qr\7+\2\2r$\3\2\2\2st\7k\2\2tu\7"+
		"h\2\2u&\3\2\2\2vw\7g\2\2wx\7n\2\2xy\7u\2\2yz\7g\2\2z(\3\2\2\2{|\7y\2\2"+
		"|}\7j\2\2}~\7k\2\2~\177\7n\2\2\177\u0080\7g\2\2\u0080*\3\2\2\2\u0081\u0082"+
		"\7e\2\2\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u0087\7g\2\2\u0087,\3\2\2\2\u0088\u0089\7t\2\2\u0089"+
		"\u008a\7g\2\2\u008a\u008b\7v\2\2\u008b\u008c\7w\2\2\u008c\u008d\7t\2\2"+
		"\u008d\u008e\7p\2\2\u008e.\3\2\2\2\u008f\u0090\7E\2\2\u0090\u0091\7c\2"+
		"\2\u0091\u0092\7t\2\2\u0092\60\3\2\2\2\u0093\u0094\7E\2\2\u0094\u0095"+
		"\7c\2\2\u0095\u0096\7t\2\2\u0096\u0097\7U\2\2\u0097\u0098\7r\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7y\2\2\u009a\u009b\7p\2\2\u009b\u009c\7g\2\2"+
		"\u009c\u009d\7t\2\2\u009d\62\3\2\2\2\u009e\u009f\7V\2\2\u009f\u00a0\7"+
		"t\2\2\u00a0\u00a1\7c\2\2\u00a1\u00a2\7h\2\2\u00a2\u00a3\7h\2\2\u00a3\u00a4"+
		"\7k\2\2\u00a4\u00a5\7e\2\2\u00a5\u00a6\7N\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7i\2\2\u00a8\u00a9\7j\2\2\u00a9\u00aa\7v\2\2\u00aa\64\3\2\2\2\u00ab"+
		"\u00ac\7I\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7f\2\2"+
		"\u00af\66\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7t\2\2\u00b2\u00b3\7"+
		"w\2\2\u00b3\u00ba\7g\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7c\2\2\u00b6\u00b7"+
		"\7n\2\2\u00b7\u00b8\7u\2\2\u00b8\u00ba\7g\2\2\u00b9\u00b0\3\2\2\2\u00b9"+
		"\u00b4\3\2\2\2\u00ba8\3\2\2\2\u00bb\u00bc\7x\2\2\u00bc\u00bd\7q\2\2\u00bd"+
		"\u00be\7k\2\2\u00be\u00c9\7f\2\2\u00bf\u00c0\7K\2\2\u00c0\u00c1\7p\2\2"+
		"\u00c1\u00c9\7v\2\2\u00c2\u00c3\7F\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5"+
		"\7w\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c9\7g\2\2\u00c8"+
		"\u00bb\3\2\2\2\u00c8\u00bf\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c9:\3\2\2\2"+
		"\u00ca\u00cb\7k\2\2\u00cb\u00cc\7p\2\2\u00cc\u00da\7v\2\2\u00cd\u00ce"+
		"\7f\2\2\u00ce\u00cf\7q\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7d\2\2\u00d1"+
		"\u00d2\7n\2\2\u00d2\u00da\7g\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7v\2\2"+
		"\u00d5\u00d6\7t\2\2\u00d6\u00d7\7k\2\2\u00d7\u00d8\7p\2\2\u00d8\u00da"+
		"\7i\2\2\u00d9\u00ca\3\2\2\2\u00d9\u00cd\3\2\2\2\u00d9\u00d3\3\2\2\2\u00da"+
		"<\3\2\2\2\u00db\u00e4\t\2\2\2\u00dc\u00e0\t\3\2\2\u00dd\u00df\t\4\2\2"+
		"\u00de\u00dd\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00dc\3\2\2\2\u00e4>\3\2\2\2\u00e5\u00e7\5=\37\2\u00e6\u00e8\7\60\2\2"+
		"\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb"+
		"\t\4\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed@\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f3\t\5\2\2"+
		"\u00f0\u00f2\t\6\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4B\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\t\7\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd\5G$\2\u00fc\u00fb"+
		"\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u0104\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0103\5I%\2\u0102\u0101\3\2\2"+
		"\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105D"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7$\2\2\u0108\u010a\t\b\2\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7$\2\2\u010eF\3\2\2\2\u010f\u0110"+
		"\t\6\2\2\u0110H\3\2\2\2\u0111\u0112\t\4\2\2\u0112J\3\2\2\2\u0113\u0115"+
		"\t\t\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0114\3\2\2\2\u0116"+
		"\u0117\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\b&\2\2\u0119L\3\2\2\2\20"+
		"\2\u00b9\u00c8\u00d9\u00e0\u00e3\u00e7\u00ec\u00f3\u00f9\u00fe\u0104\u010b"+
		"\u0116\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}