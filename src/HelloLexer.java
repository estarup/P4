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
		RCURL=14, LPAREN=15, RPAREN=16, IF=17, ELSE=18, WHILE=19, VOID=20, CREATE=21, 
		START=22, RETURN=23, CAR=24, CARSPAWNER=25, TRAFFICLIGHT=26, GRID=27, 
		CAR_NAME=28, CARSPAWNER_NAME=29, TRAFFICLIGHT_NAME=30, GRID_NAME=31, BOOL=32, 
		METH_RETURN_TYPE=33, NUM_TYPE=34, INTEGER=35, FLOAT=36, METH_NAME=37, 
		ID=38, STRING=39, WS=40;
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
			"RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "VOID", "CREATE", 
			"START", "RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "CAR_NAME", 
			"CARSPAWNER_NAME", "TRAFFICLIGHT_NAME", "GRID_NAME", "BOOL", "METH_RETURN_TYPE", 
			"NUM_TYPE", "INTEGER", "FLOAT", "METH_NAME", "LETTER", "DIGIT", "ID", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'=='", "'!='", "'<'", 
			"'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'void'", "'create'", "'Start'", "'return'", "'Car'", "'CarSpawner'", 
			"'TrafficLight'", "'Grid'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
			"EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", 
			"LCURL", "RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "VOID", 
			"CREATE", "START", "RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", 
			"CAR_NAME", "CARSPAWNER_NAME", "TRAFFICLIGHT_NAME", "GRID_NAME", "BOOL", 
			"METH_RETURN_TYPE", "NUM_TYPE", "INTEGER", "FLOAT", "METH_NAME", "ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0159\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\7\35\u00c9\n\35\f\35"+
		"\16\35\u00cc\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\7\36\u00da\n\36\f\36\16\36\u00dd\13\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\7\37\u00ed\n\37\f\37"+
		"\16\37\u00f0\13\37\3 \3 \3 \3 \3 \3 \7 \u00f8\n \f \16 \u00fb\13 \3!\3"+
		"!\3!\3!\3!\3!\3!\3!\3!\5!\u0106\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\5\"\u0111\n\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u011b\n#\3$\3$\3$\7$\u0120\n"+
		"$\f$\16$\u0123\13$\5$\u0125\n$\3%\3%\3%\7%\u012a\n%\f%\16%\u012d\13%\3"+
		"&\3&\7&\u0131\n&\f&\16&\u0134\13&\3\'\3\'\3(\3(\3)\6)\u013b\n)\r)\16)"+
		"\u013c\3)\7)\u0140\n)\f)\16)\u0143\13)\3)\7)\u0146\n)\f)\16)\u0149\13"+
		")\3*\3*\6*\u014d\n*\r*\16*\u014e\3*\3*\3+\6+\u0154\n+\r+\16+\u0155\3+"+
		"\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U*\3\2\n\5\2\62;C\\c|\3\2\62\62\3"+
		"\2\63;\3\2\62;\3\2C\\\4\2C\\c|\3\2c|\5\2\13\f\17\17\"\"\2\u0167\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I"+
		"\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Y\3\2"+
		"\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\ra\3\2\2\2\17c\3\2\2\2\21f\3\2"+
		"\2\2\23i\3\2\2\2\25k\3\2\2\2\27m\3\2\2\2\31p\3\2\2\2\33s\3\2\2\2\35u\3"+
		"\2\2\2\37w\3\2\2\2!y\3\2\2\2#{\3\2\2\2%~\3\2\2\2\'\u0083\3\2\2\2)\u0089"+
		"\3\2\2\2+\u008e\3\2\2\2-\u0095\3\2\2\2/\u009b\3\2\2\2\61\u00a2\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00b1\3\2\2\2\67\u00be\3\2\2\29\u00c3\3\2\2\2;\u00cd"+
		"\3\2\2\2=\u00de\3\2\2\2?\u00f1\3\2\2\2A\u0105\3\2\2\2C\u0110\3\2\2\2E"+
		"\u011a\3\2\2\2G\u0124\3\2\2\2I\u0126\3\2\2\2K\u012e\3\2\2\2M\u0135\3\2"+
		"\2\2O\u0137\3\2\2\2Q\u013a\3\2\2\2S\u014a\3\2\2\2U\u0153\3\2\2\2WX\7-"+
		"\2\2X\4\3\2\2\2YZ\7/\2\2Z\6\3\2\2\2[\\\7,\2\2\\\b\3\2\2\2]^\7\61\2\2^"+
		"\n\3\2\2\2_`\7?\2\2`\f\3\2\2\2ab\7=\2\2b\16\3\2\2\2cd\7?\2\2de\7?\2\2"+
		"e\20\3\2\2\2fg\7#\2\2gh\7?\2\2h\22\3\2\2\2ij\7>\2\2j\24\3\2\2\2kl\7@\2"+
		"\2l\26\3\2\2\2mn\7>\2\2no\7?\2\2o\30\3\2\2\2pq\7@\2\2qr\7?\2\2r\32\3\2"+
		"\2\2st\7}\2\2t\34\3\2\2\2uv\7\177\2\2v\36\3\2\2\2wx\7*\2\2x \3\2\2\2y"+
		"z\7+\2\2z\"\3\2\2\2{|\7k\2\2|}\7h\2\2}$\3\2\2\2~\177\7g\2\2\177\u0080"+
		"\7n\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082&\3\2\2\2\u0083\u0084"+
		"\7y\2\2\u0084\u0085\7j\2\2\u0085\u0086\7k\2\2\u0086\u0087\7n\2\2\u0087"+
		"\u0088\7g\2\2\u0088(\3\2\2\2\u0089\u008a\7x\2\2\u008a\u008b\7q\2\2\u008b"+
		"\u008c\7k\2\2\u008c\u008d\7f\2\2\u008d*\3\2\2\2\u008e\u008f\7e\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7g\2\2\u0091\u0092\7c\2\2\u0092\u0093\7v\2\2"+
		"\u0093\u0094\7g\2\2\u0094,\3\2\2\2\u0095\u0096\7U\2\2\u0096\u0097\7v\2"+
		"\2\u0097\u0098\7c\2\2\u0098\u0099\7t\2\2\u0099\u009a\7v\2\2\u009a.\3\2"+
		"\2\2\u009b\u009c\7t\2\2\u009c\u009d\7g\2\2\u009d\u009e\7v\2\2\u009e\u009f"+
		"\7w\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7p\2\2\u00a1\60\3\2\2\2\u00a2\u00a3"+
		"\7E\2\2\u00a3\u00a4\7c\2\2\u00a4\u00a5\7t\2\2\u00a5\62\3\2\2\2\u00a6\u00a7"+
		"\7E\2\2\u00a7\u00a8\7c\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7U\2\2\u00aa"+
		"\u00ab\7r\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7y\2\2\u00ad\u00ae\7p\2\2"+
		"\u00ae\u00af\7g\2\2\u00af\u00b0\7t\2\2\u00b0\64\3\2\2\2\u00b1\u00b2\7"+
		"V\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7c\2\2\u00b4\u00b5\7h\2\2\u00b5\u00b6"+
		"\7h\2\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7e\2\2\u00b8\u00b9\7N\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7i\2\2\u00bb\u00bc\7j\2\2\u00bc\u00bd\7v\2\2"+
		"\u00bd\66\3\2\2\2\u00be\u00bf\7I\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7"+
		"k\2\2\u00c1\u00c2\7f\2\2\u00c28\3\2\2\2\u00c3\u00c4\7e\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7t\2\2\u00c6\u00ca\3\2\2\2\u00c7\u00c9\t\2\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb:\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7e\2\2\u00ce\u00cf"+
		"\7c\2\2\u00cf\u00d0\7t\2\2\u00d0\u00d1\7U\2\2\u00d1\u00d2\7r\2\2\u00d2"+
		"\u00d3\7c\2\2\u00d3\u00d4\7y\2\2\u00d4\u00d5\7p\2\2\u00d5\u00d6\7g\2\2"+
		"\u00d6\u00d7\7t\2\2\u00d7\u00db\3\2\2\2\u00d8\u00da\t\2\2\2\u00d9\u00d8"+
		"\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"<\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7v\2\2\u00df\u00e0\7t\2\2\u00e0"+
		"\u00e1\7c\2\2\u00e1\u00e2\7h\2\2\u00e2\u00e3\7h\2\2\u00e3\u00e4\7k\2\2"+
		"\u00e4\u00e5\7e\2\2\u00e5\u00e6\7N\2\2\u00e6\u00e7\7k\2\2\u00e7\u00e8"+
		"\7i\2\2\u00e8\u00e9\7j\2\2\u00e9\u00ea\7v\2\2\u00ea\u00ee\3\2\2\2\u00eb"+
		"\u00ed\t\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2"+
		"\2\2\u00ee\u00ef\3\2\2\2\u00ef>\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2"+
		"\7i\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7k\2\2\u00f4\u00f5\7f\2\2\u00f5"+
		"\u00f9\3\2\2\2\u00f6\u00f8\t\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa@\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fd\7v\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff\7w\2\2\u00ff"+
		"\u0106\7g\2\2\u0100\u0101\7h\2\2\u0101\u0102\7c\2\2\u0102\u0103\7n\2\2"+
		"\u0103\u0104\7u\2\2\u0104\u0106\7g\2\2\u0105\u00fc\3\2\2\2\u0105\u0100"+
		"\3\2\2\2\u0106B\3\2\2\2\u0107\u0111\5)\25\2\u0108\u0109\7K\2\2\u0109\u010a"+
		"\7p\2\2\u010a\u0111\7v\2\2\u010b\u010c\7H\2\2\u010c\u010d\7n\2\2\u010d"+
		"\u010e\7q\2\2\u010e\u010f\7c\2\2\u010f\u0111\7v\2\2\u0110\u0107\3\2\2"+
		"\2\u0110\u0108\3\2\2\2\u0110\u010b\3\2\2\2\u0111D\3\2\2\2\u0112\u0113"+
		"\7k\2\2\u0113\u0114\7p\2\2\u0114\u011b\7v\2\2\u0115\u0116\7h\2\2\u0116"+
		"\u0117\7n\2\2\u0117\u0118\7q\2\2\u0118\u0119\7c\2\2\u0119\u011b\7v\2\2"+
		"\u011a\u0112\3\2\2\2\u011a\u0115\3\2\2\2\u011bF\3\2\2\2\u011c\u0125\t"+
		"\3\2\2\u011d\u0121\t\4\2\2\u011e\u0120\t\5\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\u0123\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0125\3\2"+
		"\2\2\u0123\u0121\3\2\2\2\u0124\u011c\3\2\2\2\u0124\u011d\3\2\2\2\u0125"+
		"H\3\2\2\2\u0126\u0127\5G$\2\u0127\u012b\7\60\2\2\u0128\u012a\t\5\2\2\u0129"+
		"\u0128\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012cJ\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0132\t\6\2\2\u012f\u0131"+
		"\t\7\2\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133L\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0136\t\7\2\2"+
		"\u0136N\3\2\2\2\u0137\u0138\t\5\2\2\u0138P\3\2\2\2\u0139\u013b\t\b\2\2"+
		"\u013a\u0139\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013a\3\2\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u0141\3\2\2\2\u013e\u0140\5M\'\2\u013f\u013e\3\2\2\2\u0140"+
		"\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0147\3\2"+
		"\2\2\u0143\u0141\3\2\2\2\u0144\u0146\5O(\2\u0145\u0144\3\2\2\2\u0146\u0149"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148R\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u014a\u014c\7$\2\2\u014b\u014d\t\2\2\2\u014c\u014b\3\2"+
		"\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\7$\2\2\u0151T\3\2\2\2\u0152\u0154\t\t\2\2\u0153"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0158\b+\2\2\u0158V\3\2\2\2\23\2\u00ca"+
		"\u00db\u00ee\u00f9\u0105\u0110\u011a\u0121\u0124\u012b\u0132\u013c\u0141"+
		"\u0147\u014e\u0155\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}