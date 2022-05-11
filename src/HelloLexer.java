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
		RETURN=22, CAR=23, CARSPAWNER=24, TRAFFICLIGHT=25, GRID=26, BOOL=27, PRINT=28, 
		METH_RETURN_TYPE=29, VAR_TYPE=30, INTEGER=31, DOUBLE=32, METH_NAME=33, 
		ID=34, STRING=35, WS=36;
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
			"RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", "PRINT", 
			"METH_RETURN_TYPE", "VAR_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", 
			"STRING", "LETTER", "DIGIT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'+'", "'-'", "'*'", "'/'", "'='", "';'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'('", "')'", "'if'", "'else'", 
			"'while'", "'create'", "'return'", "'Car'", "'CarSpawner'", "'TrafficLight'", 
			"'Grid'", null, "'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
			"EQUAL", "NOTEQUAL", "LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", 
			"LCURL", "RCURL", "LPAREN", "RPAREN", "IF", "ELSE", "WHILE", "CREATE", 
			"RETURN", "CAR", "CARSPAWNER", "TRAFFICLIGHT", "GRID", "BOOL", "PRINT", 
			"METH_RETURN_TYPE", "VAR_TYPE", "INTEGER", "DOUBLE", "METH_NAME", "ID", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0122\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3\4\3"+
		"\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u00bc\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00d1\n\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u00e2"+
		"\n\37\3 \3 \3 \7 \u00e7\n \f \16 \u00ea\13 \5 \u00ec\n \3!\3!\5!\u00f0"+
		"\n!\3!\7!\u00f3\n!\f!\16!\u00f6\13!\3\"\3\"\7\"\u00fa\n\"\f\"\16\"\u00fd"+
		"\13\"\3#\6#\u0100\n#\r#\16#\u0101\3#\7#\u0105\n#\f#\16#\u0108\13#\3#\7"+
		"#\u010b\n#\f#\16#\u010e\13#\3$\3$\6$\u0112\n$\r$\16$\u0113\3$\3$\3%\3"+
		"%\3&\3&\3\'\6\'\u011d\n\'\r\'\16\'\u011e\3\'\3\'\2\2(\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I\2"+
		"K\2M&\3\2\n\3\2\62\62\3\2\63;\3\2\62;\3\2C\\\4\2C\\c|\3\2c|\b\2\13\13"+
		"\17\17\"\"\62;C\\c|\5\2\13\f\17\17\"\"\2\u012e\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2"+
		"\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2\13W\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21"+
		"]\3\2\2\2\23`\3\2\2\2\25c\3\2\2\2\27e\3\2\2\2\31g\3\2\2\2\33j\3\2\2\2"+
		"\35m\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2\'x\3\2\2\2)}\3"+
		"\2\2\2+\u0083\3\2\2\2-\u008a\3\2\2\2/\u0091\3\2\2\2\61\u0095\3\2\2\2\63"+
		"\u00a0\3\2\2\2\65\u00ad\3\2\2\2\67\u00bb\3\2\2\29\u00bd\3\2\2\2;\u00d0"+
		"\3\2\2\2=\u00e1\3\2\2\2?\u00eb\3\2\2\2A\u00ed\3\2\2\2C\u00f7\3\2\2\2E"+
		"\u00ff\3\2\2\2G\u010f\3\2\2\2I\u0117\3\2\2\2K\u0119\3\2\2\2M\u011c\3\2"+
		"\2\2OP\7.\2\2P\4\3\2\2\2QR\7-\2\2R\6\3\2\2\2ST\7/\2\2T\b\3\2\2\2UV\7,"+
		"\2\2V\n\3\2\2\2WX\7\61\2\2X\f\3\2\2\2YZ\7?\2\2Z\16\3\2\2\2[\\\7=\2\2\\"+
		"\20\3\2\2\2]^\7?\2\2^_\7?\2\2_\22\3\2\2\2`a\7#\2\2ab\7?\2\2b\24\3\2\2"+
		"\2cd\7>\2\2d\26\3\2\2\2ef\7@\2\2f\30\3\2\2\2gh\7>\2\2hi\7?\2\2i\32\3\2"+
		"\2\2jk\7@\2\2kl\7?\2\2l\34\3\2\2\2mn\7}\2\2n\36\3\2\2\2op\7\177\2\2p "+
		"\3\2\2\2qr\7*\2\2r\"\3\2\2\2st\7+\2\2t$\3\2\2\2uv\7k\2\2vw\7h\2\2w&\3"+
		"\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|(\3\2\2\2}~\7y\2\2~\177\7j"+
		"\2\2\177\u0080\7k\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082*\3\2"+
		"\2\2\u0083\u0084\7e\2\2\u0084\u0085\7t\2\2\u0085\u0086\7g\2\2\u0086\u0087"+
		"\7c\2\2\u0087\u0088\7v\2\2\u0088\u0089\7g\2\2\u0089,\3\2\2\2\u008a\u008b"+
		"\7t\2\2\u008b\u008c\7g\2\2\u008c\u008d\7v\2\2\u008d\u008e\7w\2\2\u008e"+
		"\u008f\7t\2\2\u008f\u0090\7p\2\2\u0090.\3\2\2\2\u0091\u0092\7E\2\2\u0092"+
		"\u0093\7c\2\2\u0093\u0094\7t\2\2\u0094\60\3\2\2\2\u0095\u0096\7E\2\2\u0096"+
		"\u0097\7c\2\2\u0097\u0098\7t\2\2\u0098\u0099\7U\2\2\u0099\u009a\7r\2\2"+
		"\u009a\u009b\7c\2\2\u009b\u009c\7y\2\2\u009c\u009d\7p\2\2\u009d\u009e"+
		"\7g\2\2\u009e\u009f\7t\2\2\u009f\62\3\2\2\2\u00a0\u00a1\7V\2\2\u00a1\u00a2"+
		"\7t\2\2\u00a2\u00a3\7c\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7h\2\2\u00a5"+
		"\u00a6\7k\2\2\u00a6\u00a7\7e\2\2\u00a7\u00a8\7N\2\2\u00a8\u00a9\7k\2\2"+
		"\u00a9\u00aa\7i\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7v\2\2\u00ac\64\3\2"+
		"\2\2\u00ad\u00ae\7I\2\2\u00ae\u00af\7t\2\2\u00af\u00b0\7k\2\2\u00b0\u00b1"+
		"\7f\2\2\u00b1\66\3\2\2\2\u00b2\u00b3\7v\2\2\u00b3\u00b4\7t\2\2\u00b4\u00b5"+
		"\7w\2\2\u00b5\u00bc\7g\2\2\u00b6\u00b7\7h\2\2\u00b7\u00b8\7c\2\2\u00b8"+
		"\u00b9\7n\2\2\u00b9\u00ba\7u\2\2\u00ba\u00bc\7g\2\2\u00bb\u00b2\3\2\2"+
		"\2\u00bb\u00b6\3\2\2\2\u00bc8\3\2\2\2\u00bd\u00be\7R\2\2\u00be\u00bf\7"+
		"t\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7p\2\2\u00c1\u00c2\7v\2\2\u00c2:"+
		"\3\2\2\2\u00c3\u00c4\7x\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7k\2\2\u00c6"+
		"\u00d1\7f\2\2\u00c7\u00c8\7K\2\2\u00c8\u00c9\7p\2\2\u00c9\u00d1\7v\2\2"+
		"\u00ca\u00cb\7F\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7w\2\2\u00cd\u00ce"+
		"\7d\2\2\u00ce\u00cf\7n\2\2\u00cf\u00d1\7g\2\2\u00d0\u00c3\3\2\2\2\u00d0"+
		"\u00c7\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d1<\3\2\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7p\2\2\u00d4\u00e2\7v\2\2\u00d5\u00d6\7f\2\2\u00d6\u00d7\7q\2\2"+
		"\u00d7\u00d8\7w\2\2\u00d8\u00d9\7d\2\2\u00d9\u00da\7n\2\2\u00da\u00e2"+
		"\7g\2\2\u00db\u00dc\7u\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e2\7i\2\2\u00e1\u00d2\3\2\2"+
		"\2\u00e1\u00d5\3\2\2\2\u00e1\u00db\3\2\2\2\u00e2>\3\2\2\2\u00e3\u00ec"+
		"\t\2\2\2\u00e4\u00e8\t\3\2\2\u00e5\u00e7\t\4\2\2\u00e6\u00e5\3\2\2\2\u00e7"+
		"\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00ec\3\2"+
		"\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00e3\3\2\2\2\u00eb\u00e4\3\2\2\2\u00ec"+
		"@\3\2\2\2\u00ed\u00ef\5? \2\u00ee\u00f0\7\60\2\2\u00ef\u00ee\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00f4\3\2\2\2\u00f1\u00f3\t\4\2\2\u00f2\u00f1\3\2"+
		"\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"B\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00fb\t\5\2\2\u00f8\u00fa\t\6\2\2"+
		"\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fcD\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0100\t\7\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0106\3\2\2\2\u0103\u0105\5I%\2\u0104\u0103\3\2\2\2\u0105\u0108"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u010c\3\2\2\2\u0108"+
		"\u0106\3\2\2\2\u0109\u010b\5K&\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2"+
		"\2\u010c\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010dF\3\2\2\2\u010e\u010c"+
		"\3\2\2\2\u010f\u0111\7$\2\2\u0110\u0112\t\b\2\2\u0111\u0110\3\2\2\2\u0112"+
		"\u0113\3\2\2\2\u0113\u0111\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115\3\2"+
		"\2\2\u0115\u0116\7$\2\2\u0116H\3\2\2\2\u0117\u0118\t\6\2\2\u0118J\3\2"+
		"\2\2\u0119\u011a\t\4\2\2\u011aL\3\2\2\2\u011b\u011d\t\t\2\2\u011c\u011b"+
		"\3\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0121\b\'\2\2\u0121N\3\2\2\2\20\2\u00bb\u00d0\u00e1"+
		"\u00e8\u00eb\u00ef\u00f4\u00fb\u0101\u0106\u010c\u0113\u011e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}