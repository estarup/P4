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
		MULTIPLY=7, DIVIDE=8, ASSIGN=9, LPAREN=10, RPAREN=11, EQUAL=12, NOTEQUAL=13, 
		LESSTHAN=14, MORETHAN=15, LESSOREQUAL=16, MOREOREQUAL=17, LCURL=18, RCURL=19, 
		IF=20, ELSE=21, WHILE=22, VOID=23, CREATE=24, START=25, CAR=26, CARSPAWNER=27, 
		TRAFFICLIGHT=28, GRID=29, CAR_NAME=30, CARSPAWNER_NAME=31, TRAFFICLIGHT_NAME=32, 
		GRID_NAME=33, BOOL=34, SEMICOLON=35, METH_NAME=36, ID=37, STRING=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"METH_RETURN_TYPE", "NUM_TYPE", "INTEGER", "FLOAT", "ADD", "SUBTRACT", 
			"MULTIPLY", "DIVIDE", "ASSIGN", "LPAREN", "RPAREN", "EQUAL", "NOTEQUAL", 
			"LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", "LCURL", "RCURL", 
			"IF", "ELSE", "WHILE", "VOID", "CREATE", "START", "CAR", "CARSPAWNER", 
			"TRAFFICLIGHT", "GRID", "CAR_NAME", "CARSPAWNER_NAME", "TRAFFICLIGHT_NAME", 
			"GRID_NAME", "BOOL", "SEMICOLON", "METH_NAME", "LETTER", "DIGIT", "ID", 
			"STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'='", "'('", 
			"')'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'{'", "'}'", "'if'", 
			"'else'", "'while'", "'void'", "'create'", "'Start()'", "'Car'", "'CarSpawner'", 
			"'TrafficLight'", "'Grid'", null, null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "METH_RETURN_TYPE", "NUM_TYPE", "INTEGER", "FLOAT", "ADD", "SUBTRACT", 
			"MULTIPLY", "DIVIDE", "ASSIGN", "LPAREN", "RPAREN", "EQUAL", "NOTEQUAL", 
			"LESSTHAN", "MORETHAN", "LESSOREQUAL", "MOREOREQUAL", "LCURL", "RCURL", 
			"IF", "ELSE", "WHILE", "VOID", "CREATE", "START", "CAR", "CARSPAWNER", 
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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 25:
			CAR_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void CAR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			System.out.println("matched rule car");
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0157\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2_\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\5\3i\n\3\3\4\3\4\5\4m\n\4\3\4\3\4\7\4q\n\4\f\4\16\4t\13\4\5\4v\n\4\3"+
		"\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37"+
		"\7\37\u00ec\n\37\f\37\16\37\u00ef\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \7 \u00fd\n \f \16 \u0100\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"+
		"!\3!\3!\7!\u0110\n!\f!\16!\u0113\13!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u011b"+
		"\n\"\f\"\16\"\u011e\13\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0129\n#\3$\3$"+
		"\3%\3%\7%\u012f\n%\f%\16%\u0132\13%\3&\3&\3\'\3\'\3(\6(\u0139\n(\r(\16"+
		"(\u013a\3(\7(\u013e\n(\f(\16(\u0141\13(\3(\7(\u0144\n(\f(\16(\u0147\13"+
		"(\3)\3)\6)\u014b\n)\r)\16)\u014c\3)\3)\3*\6*\u0152\n*\r*\16*\u0153\3*"+
		"\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35"+
		"9\36;\37= ?!A\"C#E$G%I&K\2M\2O\'Q(S)\3\2\n\3\2\62\62\3\2\63;\3\2\62;\5"+
		"\2\62;C\\c|\3\2C\\\4\2C\\c|\3\2c|\5\2\13\f\17\17\"\"\2\u0166\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3^\3\2\2\2\5h\3\2\2\2\7u\3\2\2\2\t"+
		"w\3\2\2\2\13\177\3\2\2\2\r\u0081\3\2\2\2\17\u0083\3\2\2\2\21\u0085\3\2"+
		"\2\2\23\u0087\3\2\2\2\25\u0089\3\2\2\2\27\u008b\3\2\2\2\31\u008d\3\2\2"+
		"\2\33\u0090\3\2\2\2\35\u0093\3\2\2\2\37\u0095\3\2\2\2!\u0097\3\2\2\2#"+
		"\u009a\3\2\2\2%\u009d\3\2\2\2\'\u009f\3\2\2\2)\u00a1\3\2\2\2+\u00a4\3"+
		"\2\2\2-\u00a9\3\2\2\2/\u00af\3\2\2\2\61\u00b4\3\2\2\2\63\u00bb\3\2\2\2"+
		"\65\u00c3\3\2\2\2\67\u00c9\3\2\2\29\u00d4\3\2\2\2;\u00e1\3\2\2\2=\u00e6"+
		"\3\2\2\2?\u00f0\3\2\2\2A\u0101\3\2\2\2C\u0114\3\2\2\2E\u0128\3\2\2\2G"+
		"\u012a\3\2\2\2I\u012c\3\2\2\2K\u0133\3\2\2\2M\u0135\3\2\2\2O\u0138\3\2"+
		"\2\2Q\u0148\3\2\2\2S\u0151\3\2\2\2U_\5/\30\2VW\7K\2\2WX\7p\2\2X_\7v\2"+
		"\2YZ\7H\2\2Z[\7n\2\2[\\\7q\2\2\\]\7c\2\2]_\7v\2\2^U\3\2\2\2^V\3\2\2\2"+
		"^Y\3\2\2\2_\4\3\2\2\2`a\7k\2\2ab\7p\2\2bi\7v\2\2cd\7h\2\2de\7n\2\2ef\7"+
		"q\2\2fg\7c\2\2gi\7v\2\2h`\3\2\2\2hc\3\2\2\2i\6\3\2\2\2jv\t\2\2\2km\7/"+
		"\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nr\t\3\2\2oq\t\4\2\2po\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2sv\3\2\2\2tr\3\2\2\2uj\3\2\2\2ul\3\2\2\2v\b\3"+
		"\2\2\2wx\5\7\4\2x|\7\60\2\2y{\t\4\2\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}"+
		"\3\2\2\2}\n\3\2\2\2~|\3\2\2\2\177\u0080\7-\2\2\u0080\f\3\2\2\2\u0081\u0082"+
		"\7/\2\2\u0082\16\3\2\2\2\u0083\u0084\7,\2\2\u0084\20\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086\22\3\2\2\2\u0087\u0088\7?\2\2\u0088\24\3\2\2\2\u0089\u008a"+
		"\7*\2\2\u008a\26\3\2\2\2\u008b\u008c\7+\2\2\u008c\30\3\2\2\2\u008d\u008e"+
		"\7?\2\2\u008e\u008f\7?\2\2\u008f\32\3\2\2\2\u0090\u0091\7#\2\2\u0091\u0092"+
		"\7?\2\2\u0092\34\3\2\2\2\u0093\u0094\7>\2\2\u0094\36\3\2\2\2\u0095\u0096"+
		"\7@\2\2\u0096 \3\2\2\2\u0097\u0098\7>\2\2\u0098\u0099\7?\2\2\u0099\"\3"+
		"\2\2\2\u009a\u009b\7@\2\2\u009b\u009c\7?\2\2\u009c$\3\2\2\2\u009d\u009e"+
		"\7}\2\2\u009e&\3\2\2\2\u009f\u00a0\7\177\2\2\u00a0(\3\2\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7h\2\2\u00a3*\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a8\7g\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7y\2\2\u00aa\u00ab\7j\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7n\2\2\u00ad"+
		"\u00ae\7g\2\2\u00ae.\3\2\2\2\u00af\u00b0\7x\2\2\u00b0\u00b1\7q\2\2\u00b1"+
		"\u00b2\7k\2\2\u00b2\u00b3\7f\2\2\u00b3\60\3\2\2\2\u00b4\u00b5\7e\2\2\u00b5"+
		"\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2"+
		"\u00b9\u00ba\7g\2\2\u00ba\62\3\2\2\2\u00bb\u00bc\7U\2\2\u00bc\u00bd\7"+
		"v\2\2\u00bd\u00be\7c\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1"+
		"\7*\2\2\u00c1\u00c2\7+\2\2\u00c2\64\3\2\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c5"+
		"\7c\2\2\u00c5\u00c6\7t\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\b\33\2\2\u00c8"+
		"\66\3\2\2\2\u00c9\u00ca\7E\2\2\u00ca\u00cb\7c\2\2\u00cb\u00cc\7t\2\2\u00cc"+
		"\u00cd\7U\2\2\u00cd\u00ce\7r\2\2\u00ce\u00cf\7c\2\2\u00cf\u00d0\7y\2\2"+
		"\u00d0\u00d1\7p\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7t\2\2\u00d38\3\2\2"+
		"\2\u00d4\u00d5\7V\2\2\u00d5\u00d6\7t\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8"+
		"\7h\2\2\u00d8\u00d9\7h\2\2\u00d9\u00da\7k\2\2\u00da\u00db\7e\2\2\u00db"+
		"\u00dc\7N\2\2\u00dc\u00dd\7k\2\2\u00dd\u00de\7i\2\2\u00de\u00df\7j\2\2"+
		"\u00df\u00e0\7v\2\2\u00e0:\3\2\2\2\u00e1\u00e2\7I\2\2\u00e2\u00e3\7t\2"+
		"\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7f\2\2\u00e5<\3\2\2\2\u00e6\u00e7\7"+
		"e\2\2\u00e7\u00e8\7c\2\2\u00e8\u00e9\7t\2\2\u00e9\u00ed\3\2\2\2\u00ea"+
		"\u00ec\t\5\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ed\u00ee\3\2\2\2\u00ee>\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1"+
		"\7e\2\2\u00f1\u00f2\7c\2\2\u00f2\u00f3\7t\2\2\u00f3\u00f4\7U\2\2\u00f4"+
		"\u00f5\7r\2\2\u00f5\u00f6\7c\2\2\u00f6\u00f7\7y\2\2\u00f7\u00f8\7p\2\2"+
		"\u00f8\u00f9\7g\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fe\3\2\2\2\u00fb\u00fd"+
		"\t\5\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff@\3\2\2\2\u0100\u00fe\3\2\2\2\u0101\u0102\7v\2\2\u0102"+
		"\u0103\7t\2\2\u0103\u0104\7c\2\2\u0104\u0105\7h\2\2\u0105\u0106\7h\2\2"+
		"\u0106\u0107\7k\2\2\u0107\u0108\7e\2\2\u0108\u0109\7N\2\2\u0109\u010a"+
		"\7k\2\2\u010a\u010b\7i\2\2\u010b\u010c\7j\2\2\u010c\u010d\7v\2\2\u010d"+
		"\u0111\3\2\2\2\u010e\u0110\t\5\2\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2"+
		"\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112B\3\2\2\2\u0113\u0111"+
		"\3\2\2\2\u0114\u0115\7i\2\2\u0115\u0116\7t\2\2\u0116\u0117\7k\2\2\u0117"+
		"\u0118\7f\2\2\u0118\u011c\3\2\2\2\u0119\u011b\t\5\2\2\u011a\u0119\3\2"+
		"\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		"D\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\7v\2\2\u0120\u0121\7t\2\2\u0121"+
		"\u0122\7w\2\2\u0122\u0129\7g\2\2\u0123\u0124\7h\2\2\u0124\u0125\7c\2\2"+
		"\u0125\u0126\7n\2\2\u0126\u0127\7u\2\2\u0127\u0129\7g\2\2\u0128\u011f"+
		"\3\2\2\2\u0128\u0123\3\2\2\2\u0129F\3\2\2\2\u012a\u012b\7=\2\2\u012bH"+
		"\3\2\2\2\u012c\u0130\t\6\2\2\u012d\u012f\t\7\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131J\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0133\u0134\t\7\2\2\u0134L\3\2\2\2\u0135\u0136\t"+
		"\4\2\2\u0136N\3\2\2\2\u0137\u0139\t\b\2\2\u0138\u0137\3\2\2\2\u0139\u013a"+
		"\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013f\3\2\2\2\u013c"+
		"\u013e\5K&\2\u013d\u013c\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2\2"+
		"\2\u013f\u0140\3\2\2\2\u0140\u0145\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0144"+
		"\5M\'\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0146\3\2\2\2\u0146P\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014a\7$\2\2\u0149"+
		"\u014b\t\5\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\7$\2\2\u014f"+
		"R\3\2\2\2\u0150\u0152\t\t\2\2\u0151\u0150\3\2\2\2\u0152\u0153\3\2\2\2"+
		"\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156"+
		"\b*\3\2\u0156T\3\2\2\2\24\2^hlru|\u00ed\u00fe\u0111\u011c\u0128\u0130"+
		"\u013a\u013f\u0145\u014c\u0153\4\3\33\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}