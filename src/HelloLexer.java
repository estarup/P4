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
		RETURN=22, CAR=23, CARSPAWNER=24, TRAFFICLIGHT=25, GRID=26, CARSPAWNER_NAME=27, 
		TRAFFICLIGHT_NAME=28, GRID_NAME=29, BOOL=30, METH_RETURN_TYPE=31, NUM_TYPE=32, 
		INTEGER=33, FLOAT=34, METH_NAME=35, ID=36, STRING=37, WS=38;
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
			"RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "CARSPAWNER_NAME", 
			"TRAFFICLIGHT_NAME", "GRID_NAME", "BOOL", "METH_RETURN_TYPE", "NUM_TYPE", 
			"INTEGER", "FLOAT", "METH_NAME", "ID", "STRING", "LETTER", "DIGIT", "WS"
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
			"START", "RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "CARSPAWNER_NAME", 
			"TRAFFICLIGHT_NAME", "GRID_NAME", "BOOL", "METH_RETURN_TYPE", "NUM_TYPE", 
			"INTEGER", "FLOAT", "METH_NAME", "ID", "STRING", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u0149\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u00c7\n\34\f\34\16"+
		"\34\u00ca\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\7\35\u00da\n\35\f\35\16\35\u00dd\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\7\36\u00e5\n\36\f\36\16\36\u00e8\13\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00f3\n\37\3 \3 \3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \5 \u0101\n \3!\3!\3!\3!\3!\3!\3!\3!\5!\u010b\n!\3\"\3\""+
		"\3\"\7\"\u0110\n\"\f\"\16\"\u0113\13\"\5\"\u0115\n\"\3#\3#\3#\7#\u011a"+
		"\n#\f#\16#\u011d\13#\3$\3$\7$\u0121\n$\f$\16$\u0124\13$\3%\6%\u0127\n"+
		"%\r%\16%\u0128\3%\7%\u012c\n%\f%\16%\u012f\13%\3%\7%\u0132\n%\f%\16%\u0135"+
		"\13%\3&\3&\6&\u0139\n&\r&\16&\u013a\3&\3&\3\'\3\'\3(\3(\3)\6)\u0144\n"+
		")\r)\16)\u0145\3)\3)\2\2*\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M\2O\2Q(\3\2\n\5\2\62;C\\"+
		"c|\3\2\62\62\3\2\63;\3\2\62;\3\2C\\\4\2C\\c|\3\2c|\5\2\13\f\17\17\"\""+
		"\2\u0156\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2Q\3\2\2\2\3S\3\2\2\2\5U\3\2\2\2\7W"+
		"\3\2\2\2\tY\3\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21b\3\2\2\2\23"+
		"e\3\2\2\2\25g\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33o\3\2\2\2\35q\3\2\2\2"+
		"\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%z\3\2\2\2\'\177\3\2\2\2)\u0085\3\2\2"+
		"\2+\u008c\3\2\2\2-\u0092\3\2\2\2/\u0099\3\2\2\2\61\u009d\3\2\2\2\63\u00a8"+
		"\3\2\2\2\65\u00b5\3\2\2\2\67\u00ba\3\2\2\29\u00cb\3\2\2\2;\u00de\3\2\2"+
		"\2=\u00f2\3\2\2\2?\u0100\3\2\2\2A\u010a\3\2\2\2C\u0114\3\2\2\2E\u0116"+
		"\3\2\2\2G\u011e\3\2\2\2I\u0126\3\2\2\2K\u0136\3\2\2\2M\u013e\3\2\2\2O"+
		"\u0140\3\2\2\2Q\u0143\3\2\2\2ST\7-\2\2T\4\3\2\2\2UV\7/\2\2V\6\3\2\2\2"+
		"WX\7,\2\2X\b\3\2\2\2YZ\7\61\2\2Z\n\3\2\2\2[\\\7?\2\2\\\f\3\2\2\2]^\7="+
		"\2\2^\16\3\2\2\2_`\7?\2\2`a\7?\2\2a\20\3\2\2\2bc\7#\2\2cd\7?\2\2d\22\3"+
		"\2\2\2ef\7>\2\2f\24\3\2\2\2gh\7@\2\2h\26\3\2\2\2ij\7>\2\2jk\7?\2\2k\30"+
		"\3\2\2\2lm\7@\2\2mn\7?\2\2n\32\3\2\2\2op\7}\2\2p\34\3\2\2\2qr\7\177\2"+
		"\2r\36\3\2\2\2st\7*\2\2t \3\2\2\2uv\7+\2\2v\"\3\2\2\2wx\7k\2\2xy\7h\2"+
		"\2y$\3\2\2\2z{\7g\2\2{|\7n\2\2|}\7u\2\2}~\7g\2\2~&\3\2\2\2\177\u0080\7"+
		"y\2\2\u0080\u0081\7j\2\2\u0081\u0082\7k\2\2\u0082\u0083\7n\2\2\u0083\u0084"+
		"\7g\2\2\u0084(\3\2\2\2\u0085\u0086\7e\2\2\u0086\u0087\7t\2\2\u0087\u0088"+
		"\7g\2\2\u0088\u0089\7c\2\2\u0089\u008a\7v\2\2\u008a\u008b\7g\2\2\u008b"+
		"*\3\2\2\2\u008c\u008d\7U\2\2\u008d\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f"+
		"\u0090\7t\2\2\u0090\u0091\7v\2\2\u0091,\3\2\2\2\u0092\u0093\7t\2\2\u0093"+
		"\u0094\7g\2\2\u0094\u0095\7v\2\2\u0095\u0096\7w\2\2\u0096\u0097\7t\2\2"+
		"\u0097\u0098\7p\2\2\u0098.\3\2\2\2\u0099\u009a\7E\2\2\u009a\u009b\7c\2"+
		"\2\u009b\u009c\7t\2\2\u009c\60\3\2\2\2\u009d\u009e\7E\2\2\u009e\u009f"+
		"\7c\2\2\u009f\u00a0\7t\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7r\2\2\u00a2"+
		"\u00a3\7c\2\2\u00a3\u00a4\7y\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7g\2\2"+
		"\u00a6\u00a7\7t\2\2\u00a7\62\3\2\2\2\u00a8\u00a9\7V\2\2\u00a9\u00aa\7"+
		"t\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7h\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae"+
		"\7k\2\2\u00ae\u00af\7e\2\2\u00af\u00b0\7N\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b2\7i\2\2\u00b2\u00b3\7j\2\2\u00b3\u00b4\7v\2\2\u00b4\64\3\2\2\2\u00b5"+
		"\u00b6\7I\2\2\u00b6\u00b7\7t\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7f\2\2"+
		"\u00b9\66\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7c\2\2\u00bc\u00bd\7"+
		"t\2\2\u00bd\u00be\7U\2\2\u00be\u00bf\7r\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1"+
		"\7y\2\2\u00c1\u00c2\7p\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7t\2\2\u00c4"+
		"\u00c8\3\2\2\2\u00c5\u00c7\t\2\2\2\u00c6\u00c5\3\2\2\2\u00c7\u00ca\3\2"+
		"\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c98\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7c\2\2\u00ce"+
		"\u00cf\7h\2\2\u00cf\u00d0\7h\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7e\2\2"+
		"\u00d2\u00d3\7N\2\2\u00d3\u00d4\7k\2\2\u00d4\u00d5\7i\2\2\u00d5\u00d6"+
		"\7j\2\2\u00d6\u00d7\7v\2\2\u00d7\u00db\3\2\2\2\u00d8\u00da\t\2\2\2\u00d9"+
		"\u00d8\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2"+
		"\2\2\u00dc:\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\7i\2\2\u00df\u00e0"+
		"\7t\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7f\2\2\u00e2\u00e6\3\2\2\2\u00e3"+
		"\u00e5\t\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7<\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00ea"+
		"\7v\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7w\2\2\u00ec\u00f3\7g\2\2\u00ed"+
		"\u00ee\7h\2\2\u00ee\u00ef\7c\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1\u00f3\7g\2\2\u00f2\u00e9\3\2\2\2\u00f2\u00ed\3\2\2\2\u00f3>\3\2"+
		"\2\2\u00f4\u00f5\7x\2\2\u00f5\u00f6\7q\2\2\u00f6\u00f7\7k\2\2\u00f7\u0101"+
		"\7f\2\2\u00f8\u00f9\7K\2\2\u00f9\u00fa\7p\2\2\u00fa\u0101\7v\2\2\u00fb"+
		"\u00fc\7H\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7q\2\2\u00fe\u00ff\7c\2\2"+
		"\u00ff\u0101\7v\2\2\u0100\u00f4\3\2\2\2\u0100\u00f8\3\2\2\2\u0100\u00fb"+
		"\3\2\2\2\u0101@\3\2\2\2\u0102\u0103\7k\2\2\u0103\u0104\7p\2\2\u0104\u010b"+
		"\7v\2\2\u0105\u0106\7h\2\2\u0106\u0107\7n\2\2\u0107\u0108\7q\2\2\u0108"+
		"\u0109\7c\2\2\u0109\u010b\7v\2\2\u010a\u0102\3\2\2\2\u010a\u0105\3\2\2"+
		"\2\u010bB\3\2\2\2\u010c\u0115\t\3\2\2\u010d\u0111\t\4\2\2\u010e\u0110"+
		"\t\5\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111"+
		"\u0112\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u010c\3\2"+
		"\2\2\u0114\u010d\3\2\2\2\u0115D\3\2\2\2\u0116\u0117\5C\"\2\u0117\u011b"+
		"\7\60\2\2\u0118\u011a\t\5\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2"+
		"\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011cF\3\2\2\2\u011d\u011b\3"+
		"\2\2\2\u011e\u0122\t\6\2\2\u011f\u0121\t\7\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123H\3\2\2\2"+
		"\u0124\u0122\3\2\2\2\u0125\u0127\t\b\2\2\u0126\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012d\3\2\2\2\u012a"+
		"\u012c\5M\'\2\u012b\u012a\3\2\2\2\u012c\u012f\3\2\2\2\u012d\u012b\3\2"+
		"\2\2\u012d\u012e\3\2\2\2\u012e\u0133\3\2\2\2\u012f\u012d\3\2\2\2\u0130"+
		"\u0132\5O(\2\u0131\u0130\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2"+
		"\2\u0133\u0134\3\2\2\2\u0134J\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0138"+
		"\7$\2\2\u0137\u0139\t\2\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\7$"+
		"\2\2\u013dL\3\2\2\2\u013e\u013f\t\7\2\2\u013fN\3\2\2\2\u0140\u0141\t\5"+
		"\2\2\u0141P\3\2\2\2\u0142\u0144\t\t\2\2\u0143\u0142\3\2\2\2\u0144\u0145"+
		"\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147"+
		"\u0148\b)\2\2\u0148R\3\2\2\2\22\2\u00c8\u00db\u00e6\u00f2\u0100\u010a"+
		"\u0111\u0114\u011b\u0122\u0128\u012d\u0133\u013a\u0145\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}