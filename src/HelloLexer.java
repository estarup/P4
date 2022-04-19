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
		METH_RETURN_TYPE=1, NUM_TYPE=2, INTEGER=3, FLOAT=4, ADD=5, SUBTRACT=6, 
		MULTIPLY=7, DIVIDE=8, ASSIGN=9, EQUAL=10, NOTEQUAL=11, LESSTHAN=12, MORETHAN=13, 
		LESSOREQUAL=14, MOREOREQUAL=15, LCURL=16, RCURL=17, LPAREN=18, RPAREN=19, 
		IF=20, ELSE=21, WHILE=22, VOID=23, CREATE=24, START=25, RETURN=26, CAR=27, 
		CARSPAWNER=28, TRAFFICLIGHT=29, GRID=30, CAR_NAME=31, CARSPAWNER_NAME=32, 
		TRAFFICLIGHT_NAME=33, GRID_NAME=34, BOOL=35, SEMICOLON=36, METH_NAME=37, 
		ID=38, STRING=39, WS=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"METH_RETURN_TYPE", "NUM_TYPE", "INTEGER", "FLOAT", "ADD", "SUBTRACT", 
			"MULTIPLY", "DIVIDE", "ASSIGN", "EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", 
			"LESSOREQUAL", "MOREOREQUAL", "LCURL", "RCURL", "LPAREN", "RPAREN", "IF", 
			"ELSE", "WHILE", "VOID", "CREATE", "START", "RETURN", "CAR", "CARSPAWNER", 
			"TRAFFICLIGHT", "GRID", "CAR_NAME", "CARSPAWNER_NAME", "TRAFFICLIGHT_NAME", 
			"GRID_NAME", "BOOL", "SEMICOLON", "METH_NAME", "LETTER", "DIGIT", "ID", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'=='", 
			"'!='", "'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'if'", 
			"'else'", "'while'", "'void'", "'create'", "'Start'", "'return'", "'Car'", 
			"'CarSpawner'", "'TrafficLight'", "'Grid'", null, null, null, null, null, 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "METH_RETURN_TYPE", "NUM_TYPE", "INTEGER", "FLOAT", "ADD", "SUBTRACT", 
			"MULTIPLY", "DIVIDE", "ASSIGN", "EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", 
			"LESSOREQUAL", "MOREOREQUAL", "LCURL", "RCURL", "LPAREN", "RPAREN", "IF", 
			"ELSE", "WHILE", "VOID", "CREATE", "START", "RETURN", "CAR", "CARSPAWNER", 
			"TRAFFICLIGHT", "GRID", "CAR_NAME", "CARSPAWNER_NAME", "TRAFFICLIGHT_NAME", 
			"GRID_NAME", "BOOL", "SEMICOLON", "METH_NAME", "ID", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u015c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2a\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\5\3k\n\3\3\4\3\4\5\4o\n\4\3\4\3\4\7\4s\n\4\f\4\16\4v\13\4\5\4x"+
		"\n\4\3\5\3\5\3\5\7\5}\n\5\f\5\16\5\u0080\13\5\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \7 \u00f1\n \f \16 \u00f4\13 \3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\3!\7!\u0102\n!\f!\16!\u0105\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0115\n\"\f\"\16\"\u0118\13\"\3#\3#\3#"+
		"\3#\3#\3#\7#\u0120\n#\f#\16#\u0123\13#\3$\3$\3$\3$\3$\3$\3$\3$\3$\5$\u012e"+
		"\n$\3%\3%\3&\3&\7&\u0134\n&\f&\16&\u0137\13&\3\'\3\'\3(\3(\3)\6)\u013e"+
		"\n)\r)\16)\u013f\3)\7)\u0143\n)\f)\16)\u0146\13)\3)\7)\u0149\n)\f)\16"+
		")\u014c\13)\3*\3*\6*\u0150\n*\r*\16*\u0151\3*\3*\3+\6+\u0157\n+\r+\16"+
		"+\u0158\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(S)U*\3\2\n\3\2\62\62\3\2"+
		"\63;\3\2\62;\5\2\62;C\\c|\3\2C\\\4\2C\\c|\3\2c|\5\2\13\f\17\17\"\"\2\u016b"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3`\3\2\2\2\5"+
		"j\3\2\2\2\7w\3\2\2\2\ty\3\2\2\2\13\u0081\3\2\2\2\r\u0083\3\2\2\2\17\u0085"+
		"\3\2\2\2\21\u0087\3\2\2\2\23\u0089\3\2\2\2\25\u008b\3\2\2\2\27\u008e\3"+
		"\2\2\2\31\u0091\3\2\2\2\33\u0093\3\2\2\2\35\u0095\3\2\2\2\37\u0098\3\2"+
		"\2\2!\u009b\3\2\2\2#\u009d\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2)\u00a3"+
		"\3\2\2\2+\u00a6\3\2\2\2-\u00ab\3\2\2\2/\u00b1\3\2\2\2\61\u00b6\3\2\2\2"+
		"\63\u00bd\3\2\2\2\65\u00c3\3\2\2\2\67\u00ca\3\2\2\29\u00ce\3\2\2\2;\u00d9"+
		"\3\2\2\2=\u00e6\3\2\2\2?\u00eb\3\2\2\2A\u00f5\3\2\2\2C\u0106\3\2\2\2E"+
		"\u0119\3\2\2\2G\u012d\3\2\2\2I\u012f\3\2\2\2K\u0131\3\2\2\2M\u0138\3\2"+
		"\2\2O\u013a\3\2\2\2Q\u013d\3\2\2\2S\u014d\3\2\2\2U\u0156\3\2\2\2Wa\5/"+
		"\30\2XY\7K\2\2YZ\7p\2\2Za\7v\2\2[\\\7H\2\2\\]\7n\2\2]^\7q\2\2^_\7c\2\2"+
		"_a\7v\2\2`W\3\2\2\2`X\3\2\2\2`[\3\2\2\2a\4\3\2\2\2bc\7k\2\2cd\7p\2\2d"+
		"k\7v\2\2ef\7h\2\2fg\7n\2\2gh\7q\2\2hi\7c\2\2ik\7v\2\2jb\3\2\2\2je\3\2"+
		"\2\2k\6\3\2\2\2lx\t\2\2\2mo\7/\2\2nm\3\2\2\2no\3\2\2\2op\3\2\2\2pt\t\3"+
		"\2\2qs\t\4\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2wl\3\2\2\2wn\3\2\2\2x\b\3\2\2\2yz\5\7\4\2z~\7\60\2\2{}\t\4\2\2|{\3"+
		"\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\n\3\2\2\2\u0080~\3\2"+
		"\2\2\u0081\u0082\7-\2\2\u0082\f\3\2\2\2\u0083\u0084\7/\2\2\u0084\16\3"+
		"\2\2\2\u0085\u0086\7,\2\2\u0086\20\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\22\3\2\2\2\u0089\u008a\7?\2\2\u008a\24\3\2\2\2\u008b\u008c\7?\2\2\u008c"+
		"\u008d\7?\2\2\u008d\26\3\2\2\2\u008e\u008f\7#\2\2\u008f\u0090\7?\2\2\u0090"+
		"\30\3\2\2\2\u0091\u0092\7>\2\2\u0092\32\3\2\2\2\u0093\u0094\7@\2\2\u0094"+
		"\34\3\2\2\2\u0095\u0096\7>\2\2\u0096\u0097\7?\2\2\u0097\36\3\2\2\2\u0098"+
		"\u0099\7@\2\2\u0099\u009a\7?\2\2\u009a \3\2\2\2\u009b\u009c\7}\2\2\u009c"+
		"\"\3\2\2\2\u009d\u009e\7\177\2\2\u009e$\3\2\2\2\u009f\u00a0\7*\2\2\u00a0"+
		"&\3\2\2\2\u00a1\u00a2\7+\2\2\u00a2(\3\2\2\2\u00a3\u00a4\7k\2\2\u00a4\u00a5"+
		"\7h\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8\u00a9"+
		"\7u\2\2\u00a9\u00aa\7g\2\2\u00aa,\3\2\2\2\u00ab\u00ac\7y\2\2\u00ac\u00ad"+
		"\7j\2\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0"+
		".\3\2\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7q\2\2\u00b3\u00b4\7k\2\2\u00b4"+
		"\u00b5\7f\2\2\u00b5\60\3\2\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8\7t\2\2\u00b8"+
		"\u00b9\7g\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7g\2\2"+
		"\u00bc\62\3\2\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7v\2\2\u00bf\u00c0\7"+
		"c\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7v\2\2\u00c2\64\3\2\2\2\u00c3\u00c4"+
		"\7t\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7w\2\2\u00c7"+
		"\u00c8\7t\2\2\u00c8\u00c9\7p\2\2\u00c9\66\3\2\2\2\u00ca\u00cb\7E\2\2\u00cb"+
		"\u00cc\7c\2\2\u00cc\u00cd\7t\2\2\u00cd8\3\2\2\2\u00ce\u00cf\7E\2\2\u00cf"+
		"\u00d0\7c\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2\7U\2\2\u00d2\u00d3\7r\2\2"+
		"\u00d3\u00d4\7c\2\2\u00d4\u00d5\7y\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7"+
		"\7g\2\2\u00d7\u00d8\7t\2\2\u00d8:\3\2\2\2\u00d9\u00da\7V\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7c\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7h\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7e\2\2\u00e0\u00e1\7N\2\2\u00e1\u00e2\7k\2\2"+
		"\u00e2\u00e3\7i\2\2\u00e3\u00e4\7j\2\2\u00e4\u00e5\7v\2\2\u00e5<\3\2\2"+
		"\2\u00e6\u00e7\7I\2\2\u00e7\u00e8\7t\2\2\u00e8\u00e9\7k\2\2\u00e9\u00ea"+
		"\7f\2\2\u00ea>\3\2\2\2\u00eb\u00ec\7e\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee"+
		"\7t\2\2\u00ee\u00f2\3\2\2\2\u00ef\u00f1\t\5\2\2\u00f0\u00ef\3\2\2\2\u00f1"+
		"\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3@\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f5\u00f6\7e\2\2\u00f6\u00f7\7c\2\2\u00f7\u00f8"+
		"\7t\2\2\u00f8\u00f9\7U\2\2\u00f9\u00fa\7r\2\2\u00fa\u00fb\7c\2\2\u00fb"+
		"\u00fc\7y\2\2\u00fc\u00fd\7p\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7t\2\2"+
		"\u00ff\u0103\3\2\2\2\u0100\u0102\t\5\2\2\u0101\u0100\3\2\2\2\u0102\u0105"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104B\3\2\2\2\u0105"+
		"\u0103\3\2\2\2\u0106\u0107\7v\2\2\u0107\u0108\7t\2\2\u0108\u0109\7c\2"+
		"\2\u0109\u010a\7h\2\2\u010a\u010b\7h\2\2\u010b\u010c\7k\2\2\u010c\u010d"+
		"\7e\2\2\u010d\u010e\7N\2\2\u010e\u010f\7k\2\2\u010f\u0110\7i\2\2\u0110"+
		"\u0111\7j\2\2\u0111\u0112\7v\2\2\u0112\u0116\3\2\2\2\u0113\u0115\t\5\2"+
		"\2\u0114\u0113\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117"+
		"\3\2\2\2\u0117D\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011a\7i\2\2\u011a\u011b"+
		"\7t\2\2\u011b\u011c\7k\2\2\u011c\u011d\7f\2\2\u011d\u0121\3\2\2\2\u011e"+
		"\u0120\t\5\2\2\u011f\u011e\3\2\2\2\u0120\u0123\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122F\3\2\2\2\u0123\u0121\3\2\2\2\u0124\u0125"+
		"\7v\2\2\u0125\u0126\7t\2\2\u0126\u0127\7w\2\2\u0127\u012e\7g\2\2\u0128"+
		"\u0129\7h\2\2\u0129\u012a\7c\2\2\u012a\u012b\7n\2\2\u012b\u012c\7u\2\2"+
		"\u012c\u012e\7g\2\2\u012d\u0124\3\2\2\2\u012d\u0128\3\2\2\2\u012eH\3\2"+
		"\2\2\u012f\u0130\7=\2\2\u0130J\3\2\2\2\u0131\u0135\t\6\2\2\u0132\u0134"+
		"\t\7\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136L\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\t\7\2\2"+
		"\u0139N\3\2\2\2\u013a\u013b\t\4\2\2\u013bP\3\2\2\2\u013c\u013e\t\b\2\2"+
		"\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140"+
		"\3\2\2\2\u0140\u0144\3\2\2\2\u0141\u0143\5M\'\2\u0142\u0141\3\2\2\2\u0143"+
		"\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014a\3\2"+
		"\2\2\u0146\u0144\3\2\2\2\u0147\u0149\5O(\2\u0148\u0147\3\2\2\2\u0149\u014c"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014bR\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014d\u014f\7$\2\2\u014e\u0150\t\5\2\2\u014f\u014e\3\2"+
		"\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\7$\2\2\u0154T\3\2\2\2\u0155\u0157\t\t\2\2\u0156"+
		"\u0155\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0156\3\2\2\2\u0158\u0159\3\2"+
		"\2\2\u0159\u015a\3\2\2\2\u015a\u015b\b+\2\2\u015bV\3\2\2\2\24\2`jntw~"+
		"\u00f2\u0103\u0116\u0121\u012d\u0135\u013f\u0144\u014a\u0151\u0158\3\b"+
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