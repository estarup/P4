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
		RCURL=14, LPAREN=15, RPAREN=16, IF=17, ELSE=18, WHILE=19, CREATE=20, START=21, 
		RETURN=22, CAR=23, CARSPAWNER=24, TRAFFICLIGHT=25, GRID=26, BOOL=27, METH_RETURN_TYPE=28, 
		NUM_TYPE=29, INTEGER=30, DOUBLE=31, METH_NAME=32, ID=33, STRING=34, WS=35;
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
			"RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "CREATE", "START", 
			"RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", "METH_RETURN_TYPE", 
			"NUM_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", "STRING", "LETTER", 
			"DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'create'", "'Start'", "'return'", "'Car'", "'CarSpawner'", 
			"'TrafficLight'", "'Grid'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
			"EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", 
			"LCURL", "RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "CREATE", 
			"START", "RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", 
			"METH_RETURN_TYPE", "NUM_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", 
			"STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2%\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u00be\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\5\35\u00cd\n\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u00d8\n\36\3\37\3\37\3\37\7\37\u00dd\n\37\f\37\16\37\u00e0"+
		"\13\37\5\37\u00e2\n\37\3 \3 \5 \u00e6\n \3 \7 \u00e9\n \f \16 \u00ec\13"+
		" \3!\3!\7!\u00f0\n!\f!\16!\u00f3\13!\3\"\6\"\u00f6\n\"\r\"\16\"\u00f7"+
		"\3\"\7\"\u00fb\n\"\f\"\16\"\u00fe\13\"\3\"\7\"\u0101\n\"\f\"\16\"\u0104"+
		"\13\"\3#\3#\6#\u0108\n#\r#\16#\u0109\3#\3#\3$\3$\3%\3%\3&\6&\u0113\n&"+
		"\r&\16&\u0114\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G\2I\2K%\3\2\n\3\2\62\62\3\2\63;"+
		"\3\2\62;\3\2C\\\4\2C\\c|\3\2c|\5\2\62;C\\c|\5\2\13\f\17\17\"\"\2\u0123"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2K\3\2\2"+
		"\2\3M\3\2\2\2\5O\3\2\2\2\7Q\3\2\2\2\tS\3\2\2\2\13U\3\2\2\2\rW\3\2\2\2"+
		"\17Y\3\2\2\2\21\\\3\2\2\2\23_\3\2\2\2\25a\3\2\2\2\27c\3\2\2\2\31f\3\2"+
		"\2\2\33i\3\2\2\2\35k\3\2\2\2\37m\3\2\2\2!o\3\2\2\2#q\3\2\2\2%t\3\2\2\2"+
		"\'y\3\2\2\2)\177\3\2\2\2+\u0086\3\2\2\2-\u008c\3\2\2\2/\u0093\3\2\2\2"+
		"\61\u0097\3\2\2\2\63\u00a2\3\2\2\2\65\u00af\3\2\2\2\67\u00bd\3\2\2\29"+
		"\u00cc\3\2\2\2;\u00d7\3\2\2\2=\u00e1\3\2\2\2?\u00e3\3\2\2\2A\u00ed\3\2"+
		"\2\2C\u00f5\3\2\2\2E\u0105\3\2\2\2G\u010d\3\2\2\2I\u010f\3\2\2\2K\u0112"+
		"\3\2\2\2MN\7-\2\2N\4\3\2\2\2OP\7/\2\2P\6\3\2\2\2QR\7,\2\2R\b\3\2\2\2S"+
		"T\7\61\2\2T\n\3\2\2\2UV\7?\2\2V\f\3\2\2\2WX\7=\2\2X\16\3\2\2\2YZ\7?\2"+
		"\2Z[\7?\2\2[\20\3\2\2\2\\]\7#\2\2]^\7?\2\2^\22\3\2\2\2_`\7>\2\2`\24\3"+
		"\2\2\2ab\7@\2\2b\26\3\2\2\2cd\7>\2\2de\7?\2\2e\30\3\2\2\2fg\7@\2\2gh\7"+
		"?\2\2h\32\3\2\2\2ij\7}\2\2j\34\3\2\2\2kl\7\177\2\2l\36\3\2\2\2mn\7*\2"+
		"\2n \3\2\2\2op\7+\2\2p\"\3\2\2\2qr\7k\2\2rs\7h\2\2s$\3\2\2\2tu\7g\2\2"+
		"uv\7n\2\2vw\7u\2\2wx\7g\2\2x&\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n"+
		"\2\2}~\7g\2\2~(\3\2\2\2\177\u0080\7e\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7c\2\2\u0083\u0084\7v\2\2\u0084\u0085\7g\2\2\u0085"+
		"*\3\2\2\2\u0086\u0087\7U\2\2\u0087\u0088\7v\2\2\u0088\u0089\7c\2\2\u0089"+
		"\u008a\7t\2\2\u008a\u008b\7v\2\2\u008b,\3\2\2\2\u008c\u008d\7t\2\2\u008d"+
		"\u008e\7g\2\2\u008e\u008f\7v\2\2\u008f\u0090\7w\2\2\u0090\u0091\7t\2\2"+
		"\u0091\u0092\7p\2\2\u0092.\3\2\2\2\u0093\u0094\7E\2\2\u0094\u0095\7c\2"+
		"\2\u0095\u0096\7t\2\2\u0096\60\3\2\2\2\u0097\u0098\7E\2\2\u0098\u0099"+
		"\7c\2\2\u0099\u009a\7t\2\2\u009a\u009b\7U\2\2\u009b\u009c\7r\2\2\u009c"+
		"\u009d\7c\2\2\u009d\u009e\7y\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\u00a1\7t\2\2\u00a1\62\3\2\2\2\u00a2\u00a3\7V\2\2\u00a3\u00a4\7"+
		"t\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7h\2\2\u00a6\u00a7\7h\2\2\u00a7\u00a8"+
		"\7k\2\2\u00a8\u00a9\7e\2\2\u00a9\u00aa\7N\2\2\u00aa\u00ab\7k\2\2\u00ab"+
		"\u00ac\7i\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7v\2\2\u00ae\64\3\2\2\2\u00af"+
		"\u00b0\7I\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7f\2\2"+
		"\u00b3\66\3\2\2\2\u00b4\u00b5\7v\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7"+
		"w\2\2\u00b7\u00be\7g\2\2\u00b8\u00b9\7h\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7n\2\2\u00bb\u00bc\7u\2\2\u00bc\u00be\7g\2\2\u00bd\u00b4\3\2\2\2\u00bd"+
		"\u00b8\3\2\2\2\u00be8\3\2\2\2\u00bf\u00c0\7x\2\2\u00c0\u00c1\7q\2\2\u00c1"+
		"\u00c2\7k\2\2\u00c2\u00cd\7f\2\2\u00c3\u00c4\7K\2\2\u00c4\u00c5\7p\2\2"+
		"\u00c5\u00cd\7v\2\2\u00c6\u00c7\7F\2\2\u00c7\u00c8\7q\2\2\u00c8\u00c9"+
		"\7w\2\2\u00c9\u00ca\7d\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cd\7g\2\2\u00cc"+
		"\u00bf\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd:\3\2\2\2"+
		"\u00ce\u00cf\7k\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d8\7v\2\2\u00d1\u00d2"+
		"\7f\2\2\u00d2\u00d3\7q\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7d\2\2\u00d5"+
		"\u00d6\7n\2\2\u00d6\u00d8\7g\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00d1\3\2\2"+
		"\2\u00d8<\3\2\2\2\u00d9\u00e2\t\2\2\2\u00da\u00de\t\3\2\2\u00db\u00dd"+
		"\t\4\2\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00d9\3\2"+
		"\2\2\u00e1\u00da\3\2\2\2\u00e2>\3\2\2\2\u00e3\u00e5\5=\37\2\u00e4\u00e6"+
		"\7\60\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00ea\3\2\2\2"+
		"\u00e7\u00e9\t\4\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8"+
		"\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb@\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed"+
		"\u00f1\t\5\2\2\u00ee\u00f0\t\6\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f3\3\2"+
		"\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2B\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f4\u00f6\t\7\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fc\3\2\2\2\u00f9\u00fb\5G"+
		"$\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u0102\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\5I"+
		"%\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103D\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0107\7$\2\2\u0106"+
		"\u0108\t\b\2\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7$\2\2\u010c"+
		"F\3\2\2\2\u010d\u010e\t\6\2\2\u010eH\3\2\2\2\u010f\u0110\t\4\2\2\u0110"+
		"J\3\2\2\2\u0111\u0113\t\t\2\2\u0112\u0111\3\2\2\2\u0113\u0114\3\2\2\2"+
		"\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117"+
		"\b&\2\2\u0117L\3\2\2\2\20\2\u00bd\u00cc\u00d7\u00de\u00e1\u00e5\u00ea"+
		"\u00f1\u00f7\u00fc\u0102\u0109\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}