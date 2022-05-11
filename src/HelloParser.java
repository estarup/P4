// Generated from Hello.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class HelloParser extends Parser {
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
	public static final int
		RULE_trafficProg = 0, RULE_statement = 1, RULE_method = 2, RULE_method_init = 3, 
		RULE_method_call = 4, RULE_method_declaration = 5, RULE_if_statement = 6, 
		RULE_while_loop = 7, RULE_create_statement = 8, RULE_constructor = 9, 
		RULE_create_type = 10, RULE_assignment = 11, RULE_declaration = 12, RULE_method_parameter_init = 13, 
		RULE_method_parameter_call = 14, RULE_curl_statement = 15, RULE_return_statement = 16, 
		RULE_logic_expression = 17, RULE_else_statement = 18, RULE_expression = 19, 
		RULE_add_expression = 20, RULE_subtract_expression = 21, RULE_condition = 22, 
		RULE_equal_condition = 23, RULE_not_equal_condition = 24, RULE_less_than_condition = 25, 
		RULE_more_than_condition = 26, RULE_more_or_equal_condition = 27, RULE_less_or_equal_condition = 28, 
		RULE_term = 29, RULE_multiply_term = 30, RULE_divide_term = 31, RULE_factor = 32, 
		RULE_negative_factor = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"trafficProg", "statement", "method", "method_init", "method_call", "method_declaration", 
			"if_statement", "while_loop", "create_statement", "constructor", "create_type", 
			"assignment", "declaration", "method_parameter_init", "method_parameter_call", 
			"curl_statement", "return_statement", "logic_expression", "else_statement", 
			"expression", "add_expression", "subtract_expression", "condition", "equal_condition", 
			"not_equal_condition", "less_than_condition", "more_than_condition", 
			"more_or_equal_condition", "less_or_equal_condition", "term", "multiply_term", 
			"divide_term", "factor", "negative_factor"
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

	@Override
	public String getGrammarFileName() { return "Hello.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public HelloParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TrafficProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(HelloParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TrafficProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trafficProg; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTrafficProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrafficProgContext trafficProg() throws RecognitionException {
		TrafficProgContext _localctx = new TrafficProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_trafficProg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_RETURN_TYPE) | (1L << VAR_TYPE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(68);
				statement();
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Create_statementContext create_statement() {
			return getRuleContext(Create_statementContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METH_RETURN_TYPE:
			case METH_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				method();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				while_loop();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				create_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(80);
				assignment();
				}
				break;
			case VAR_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(81);
				declaration();
				setState(82);
				match(SEMICOLON);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodContext extends ParserRuleContext {
		public Method_initContext method_init() {
			return getRuleContext(Method_initContext.class,0);
		}
		public Method_callContext method_call() {
			return getRuleContext(Method_callContext.class,0);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_method);
		try {
			setState(88);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METH_RETURN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				method_init();
				}
				break;
			case METH_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				method_call();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_initContext extends ParserRuleContext {
		public Method_declarationContext method_declaration() {
			return getRuleContext(Method_declarationContext.class,0);
		}
		public Method_parameter_initContext method_parameter_init() {
			return getRuleContext(Method_parameter_initContext.class,0);
		}
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public Method_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_initContext method_init() throws RecognitionException {
		Method_initContext _localctx = new Method_initContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			method_declaration();
			setState(91);
			method_parameter_init();
			setState(92);
			curl_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_callContext extends ParserRuleContext {
		public TerminalNode METH_NAME() { return getToken(HelloParser.METH_NAME, 0); }
		public Method_parameter_callContext method_parameter_call() {
			return getRuleContext(Method_parameter_callContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
		public Method_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_callContext method_call() throws RecognitionException {
		Method_callContext _localctx = new Method_callContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(METH_NAME);
			setState(95);
			method_parameter_call();
			setState(96);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_declarationContext extends ParserRuleContext {
		public TerminalNode METH_RETURN_TYPE() { return getToken(HelloParser.METH_RETURN_TYPE, 0); }
		public TerminalNode METH_NAME() { return getToken(HelloParser.METH_NAME, 0); }
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_method_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(METH_RETURN_TYPE);
			setState(99);
			match(METH_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(HelloParser.IF, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IF);
			setState(102);
			logic_expression();
			setState(103);
			curl_statement();
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(104);
				else_statement();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(HelloParser.WHILE, 0); }
		public Logic_expressionContext logic_expression() {
			return getRuleContext(Logic_expressionContext.class,0);
		}
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(WHILE);
			setState(108);
			logic_expression();
			setState(109);
			curl_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_statementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(HelloParser.CREATE, 0); }
		public Create_typeContext create_type() {
			return getRuleContext(Create_typeContext.class,0);
		}
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public ConstructorContext constructor() {
			return getRuleContext(ConstructorContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
		public Create_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCreate_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_statementContext create_statement() throws RecognitionException {
		Create_statementContext _localctx = new Create_statementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(CREATE);
			setState(112);
			create_type();
			setState(113);
			match(ID);
			setState(114);
			constructor();
			setState(115);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(HelloParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(HelloParser.INTEGER, i);
		}
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public ConstructorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitConstructor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstructorContext constructor() throws RecognitionException {
		ConstructorContext _localctx = new ConstructorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constructor);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(LPAREN);
				setState(118);
				match(INTEGER);
				setState(119);
				match(T__0);
				setState(120);
				match(INTEGER);
				setState(121);
				match(T__0);
				setState(122);
				match(STRING);
				setState(123);
				match(T__0);
				setState(124);
				match(INTEGER);
				setState(125);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(LPAREN);
				setState(127);
				match(INTEGER);
				setState(128);
				match(T__0);
				setState(129);
				match(INTEGER);
				setState(130);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				match(LPAREN);
				setState(132);
				match(INTEGER);
				setState(133);
				match(T__0);
				setState(134);
				match(INTEGER);
				setState(135);
				match(T__0);
				setState(136);
				match(INTEGER);
				setState(137);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_typeContext extends ParserRuleContext {
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode CARSPAWNER() { return getToken(HelloParser.CARSPAWNER, 0); }
		public TerminalNode TRAFFICLIGHT() { return getToken(HelloParser.TRAFFICLIGHT, 0); }
		public TerminalNode GRID() { return getToken(HelloParser.GRID, 0); }
		public Create_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCreate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_typeContext create_type() throws RecognitionException {
		Create_typeContext _localctx = new Create_typeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CAR) | (1L << CARSPAWNER) | (1L << TRAFFICLIGHT) | (1L << GRID))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(HelloParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(HelloParser.STRING, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(ID);
				setState(143);
				match(ASSIGN);
				setState(144);
				expression();
				setState(145);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(ID);
				setState(148);
				match(ASSIGN);
				setState(149);
				match(STRING);
				setState(150);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode VAR_TYPE() { return getToken(HelloParser.VAR_TYPE, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(VAR_TYPE);
			setState(154);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_parameter_initContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Method_parameter_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_parameter_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_parameter_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_parameter_initContext method_parameter_init() throws RecognitionException {
		Method_parameter_initContext _localctx = new Method_parameter_initContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_method_parameter_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LPAREN);
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR_TYPE) {
				{
				setState(157);
				declaration();
				}
			}

			setState(160);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Method_parameter_callContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(HelloParser.DOUBLE, 0); }
		public Method_parameter_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_parameter_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_parameter_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_parameter_callContext method_parameter_call() throws RecognitionException {
		Method_parameter_callContext _localctx = new Method_parameter_callContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_method_parameter_call);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(LPAREN);
				setState(163);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(LPAREN);
				setState(165);
				match(INTEGER);
				setState(166);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(LPAREN);
				setState(168);
				match(DOUBLE);
				setState(169);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Curl_statementContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(HelloParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(HelloParser.RCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Return_statementContext return_statement() {
			return getRuleContext(Return_statementContext.class,0);
		}
		public Curl_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curl_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCurl_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Curl_statementContext curl_statement() throws RecognitionException {
		Curl_statementContext _localctx = new Curl_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_curl_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(LCURL);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_RETURN_TYPE) | (1L << VAR_TYPE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(173);
				statement();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(179);
				return_statement();
				}
			}

			setState(182);
			match(RCURL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_statementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(HelloParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
		public Return_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitReturn_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_statementContext return_statement() throws RecognitionException {
		Return_statementContext _localctx = new Return_statementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_return_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(RETURN);
			setState(185);
			match(ID);
			setState(186);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logic_expressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public Logic_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLogic_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logic_expressionContext logic_expression() throws RecognitionException {
		Logic_expressionContext _localctx = new Logic_expressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logic_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(LPAREN);
			setState(189);
			condition();
			setState(190);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(HelloParser.ELSE, 0); }
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitElse_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(ELSE);
			setState(193);
			curl_statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public Subtract_expressionContext subtract_expression() {
			return getRuleContext(Subtract_expressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expression);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				add_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				subtract_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Add_expressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Add_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitAdd_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Add_expressionContext add_expression() throws RecognitionException {
		Add_expressionContext _localctx = new Add_expressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_add_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			term();
			setState(201);
			match(ADD);
			setState(202);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Subtract_expressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode SUBTRACT() { return getToken(HelloParser.SUBTRACT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Subtract_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subtract_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitSubtract_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subtract_expressionContext subtract_expression() throws RecognitionException {
		Subtract_expressionContext _localctx = new Subtract_expressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subtract_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			term();
			setState(205);
			match(SUBTRACT);
			setState(206);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Equal_conditionContext equal_condition() {
			return getRuleContext(Equal_conditionContext.class,0);
		}
		public Not_equal_conditionContext not_equal_condition() {
			return getRuleContext(Not_equal_conditionContext.class,0);
		}
		public Less_than_conditionContext less_than_condition() {
			return getRuleContext(Less_than_conditionContext.class,0);
		}
		public More_than_conditionContext more_than_condition() {
			return getRuleContext(More_than_conditionContext.class,0);
		}
		public More_or_equal_conditionContext more_or_equal_condition() {
			return getRuleContext(More_or_equal_conditionContext.class,0);
		}
		public Less_or_equal_conditionContext less_or_equal_condition() {
			return getRuleContext(Less_or_equal_conditionContext.class,0);
		}
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condition);
		try {
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				equal_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				not_equal_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				less_than_condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				more_than_condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				more_or_equal_condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				less_or_equal_condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				match(BOOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Equal_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Equal_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equal_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitEqual_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Equal_conditionContext equal_condition() throws RecognitionException {
		Equal_conditionContext _localctx = new Equal_conditionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_equal_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			expression();
			setState(219);
			match(EQUAL);
			setState(220);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Not_equal_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOTEQUAL() { return getToken(HelloParser.NOTEQUAL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Not_equal_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_not_equal_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNot_equal_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Not_equal_conditionContext not_equal_condition() throws RecognitionException {
		Not_equal_conditionContext _localctx = new Not_equal_conditionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_not_equal_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			expression();
			setState(223);
			match(NOTEQUAL);
			setState(224);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_than_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LESSTHAN() { return getToken(HelloParser.LESSTHAN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Less_than_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_than_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLess_than_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_than_conditionContext less_than_condition() throws RecognitionException {
		Less_than_conditionContext _localctx = new Less_than_conditionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_less_than_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			expression();
			setState(227);
			match(LESSTHAN);
			setState(228);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class More_than_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MORETHAN() { return getToken(HelloParser.MORETHAN, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public More_than_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_than_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMore_than_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_than_conditionContext more_than_condition() throws RecognitionException {
		More_than_conditionContext _localctx = new More_than_conditionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_more_than_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			expression();
			setState(231);
			match(MORETHAN);
			setState(232);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class More_or_equal_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode MOREOREQUAL() { return getToken(HelloParser.MOREOREQUAL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public More_or_equal_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_more_or_equal_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMore_or_equal_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final More_or_equal_conditionContext more_or_equal_condition() throws RecognitionException {
		More_or_equal_conditionContext _localctx = new More_or_equal_conditionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_more_or_equal_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			expression();
			setState(235);
			match(MOREOREQUAL);
			setState(236);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Less_or_equal_conditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LESSOREQUAL() { return getToken(HelloParser.LESSOREQUAL, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Less_or_equal_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_less_or_equal_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitLess_or_equal_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Less_or_equal_conditionContext less_or_equal_condition() throws RecognitionException {
		Less_or_equal_conditionContext _localctx = new Less_or_equal_conditionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_less_or_equal_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			expression();
			setState(239);
			match(LESSOREQUAL);
			setState(240);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public Multiply_termContext multiply_term() {
			return getRuleContext(Multiply_termContext.class,0);
		}
		public Divide_termContext divide_term() {
			return getRuleContext(Divide_termContext.class,0);
		}
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_term);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				multiply_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				divide_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				factor();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Multiply_termContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode MULTIPLY() { return getToken(HelloParser.MULTIPLY, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Multiply_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiply_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMultiply_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Multiply_termContext multiply_term() throws RecognitionException {
		Multiply_termContext _localctx = new Multiply_termContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_multiply_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			factor();
			setState(248);
			match(MULTIPLY);
			setState(249);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Divide_termContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(HelloParser.DIVIDE, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Divide_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divide_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitDivide_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Divide_termContext divide_term() throws RecognitionException {
		Divide_termContext _localctx = new Divide_termContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_divide_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			factor();
			setState(252);
			match(DIVIDE);
			setState(253);
			term();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public TerminalNode DOUBLE() { return getToken(HelloParser.DOUBLE, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public Negative_factorContext negative_factor() {
			return getRuleContext(Negative_factorContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(LPAREN);
				setState(256);
				expression();
				setState(257);
				match(RPAREN);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(ID);
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(262);
				negative_factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Negative_factorContext extends ParserRuleContext {
		public TerminalNode SUBTRACT() { return getToken(HelloParser.SUBTRACT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Negative_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negative_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitNegative_factor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negative_factorContext negative_factor() throws RecognitionException {
		Negative_factorContext _localctx = new Negative_factorContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_negative_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(SUBTRACT);
			setState(266);
			factor();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\7\2H\n\2\f\2\16\2K\13\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3W\n\3\3\4\3\4\5\4[\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bl\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u008d\n\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16\3"+
		"\17\3\17\5\17\u00a1\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\5\20\u00ad\n\20\3\21\3\21\7\21\u00b1\n\21\f\21\16\21\u00b4\13\21"+
		"\3\21\5\21\u00b7\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\5\25\u00c9\n\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00db\n\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\5\37"+
		"\u00f8\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5"+
		"\"\u010a\n\"\3#\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "+
		"\"$&(*,.\60\62\64\668:<>@BD\2\3\3\2\31\34\2\u010b\2I\3\2\2\2\4V\3\2\2"+
		"\2\6Z\3\2\2\2\b\\\3\2\2\2\n`\3\2\2\2\fd\3\2\2\2\16g\3\2\2\2\20m\3\2\2"+
		"\2\22q\3\2\2\2\24\u008c\3\2\2\2\26\u008e\3\2\2\2\30\u0099\3\2\2\2\32\u009b"+
		"\3\2\2\2\34\u009e\3\2\2\2\36\u00ac\3\2\2\2 \u00ae\3\2\2\2\"\u00ba\3\2"+
		"\2\2$\u00be\3\2\2\2&\u00c2\3\2\2\2(\u00c8\3\2\2\2*\u00ca\3\2\2\2,\u00ce"+
		"\3\2\2\2.\u00da\3\2\2\2\60\u00dc\3\2\2\2\62\u00e0\3\2\2\2\64\u00e4\3\2"+
		"\2\2\66\u00e8\3\2\2\28\u00ec\3\2\2\2:\u00f0\3\2\2\2<\u00f7\3\2\2\2>\u00f9"+
		"\3\2\2\2@\u00fd\3\2\2\2B\u0109\3\2\2\2D\u010b\3\2\2\2FH\5\4\3\2GF\3\2"+
		"\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\2\2\3M\3\3"+
		"\2\2\2NW\5\6\4\2OW\5\16\b\2PW\5\20\t\2QW\5\22\n\2RW\5\30\r\2ST\5\32\16"+
		"\2TU\7\t\2\2UW\3\2\2\2VN\3\2\2\2VO\3\2\2\2VP\3\2\2\2VQ\3\2\2\2VR\3\2\2"+
		"\2VS\3\2\2\2W\5\3\2\2\2X[\5\b\5\2Y[\5\n\6\2ZX\3\2\2\2ZY\3\2\2\2[\7\3\2"+
		"\2\2\\]\5\f\7\2]^\5\34\17\2^_\5 \21\2_\t\3\2\2\2`a\7\"\2\2ab\5\36\20\2"+
		"bc\7\t\2\2c\13\3\2\2\2de\7\36\2\2ef\7\"\2\2f\r\3\2\2\2gh\7\24\2\2hi\5"+
		"$\23\2ik\5 \21\2jl\5&\24\2kj\3\2\2\2kl\3\2\2\2l\17\3\2\2\2mn\7\26\2\2"+
		"no\5$\23\2op\5 \21\2p\21\3\2\2\2qr\7\27\2\2rs\5\26\f\2st\7#\2\2tu\5\24"+
		"\13\2uv\7\t\2\2v\23\3\2\2\2wx\7\22\2\2xy\7 \2\2yz\7\3\2\2z{\7 \2\2{|\7"+
		"\3\2\2|}\7$\2\2}~\7\3\2\2~\177\7 \2\2\177\u008d\7\23\2\2\u0080\u0081\7"+
		"\22\2\2\u0081\u0082\7 \2\2\u0082\u0083\7\3\2\2\u0083\u0084\7 \2\2\u0084"+
		"\u008d\7\23\2\2\u0085\u0086\7\22\2\2\u0086\u0087\7 \2\2\u0087\u0088\7"+
		"\3\2\2\u0088\u0089\7 \2\2\u0089\u008a\7\3\2\2\u008a\u008b\7 \2\2\u008b"+
		"\u008d\7\23\2\2\u008cw\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0085\3\2\2\2"+
		"\u008d\25\3\2\2\2\u008e\u008f\t\2\2\2\u008f\27\3\2\2\2\u0090\u0091\7#"+
		"\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5(\25\2\u0093\u0094\7\t\2\2\u0094"+
		"\u009a\3\2\2\2\u0095\u0096\7#\2\2\u0096\u0097\7\b\2\2\u0097\u0098\7$\2"+
		"\2\u0098\u009a\7\t\2\2\u0099\u0090\3\2\2\2\u0099\u0095\3\2\2\2\u009a\31"+
		"\3\2\2\2\u009b\u009c\7\37\2\2\u009c\u009d\7#\2\2\u009d\33\3\2\2\2\u009e"+
		"\u00a0\7\22\2\2\u009f\u00a1\5\32\16\2\u00a0\u009f\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\7\23\2\2\u00a3\35\3\2\2\2\u00a4"+
		"\u00a5\7\22\2\2\u00a5\u00ad\7\23\2\2\u00a6\u00a7\7\22\2\2\u00a7\u00a8"+
		"\7 \2\2\u00a8\u00ad\7\23\2\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\7!\2\2\u00ab"+
		"\u00ad\7\23\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00a9\3"+
		"\2\2\2\u00ad\37\3\2\2\2\u00ae\u00b2\7\20\2\2\u00af\u00b1\5\4\3\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\u00b4\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2"+
		"\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5\u00b7\5\"\22\2\u00b6"+
		"\u00b5\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\21"+
		"\2\2\u00b9!\3\2\2\2\u00ba\u00bb\7\30\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd"+
		"\7\t\2\2\u00bd#\3\2\2\2\u00be\u00bf\7\22\2\2\u00bf\u00c0\5.\30\2\u00c0"+
		"\u00c1\7\23\2\2\u00c1%\3\2\2\2\u00c2\u00c3\7\25\2\2\u00c3\u00c4\5 \21"+
		"\2\u00c4\'\3\2\2\2\u00c5\u00c9\5*\26\2\u00c6\u00c9\5,\27\2\u00c7\u00c9"+
		"\5<\37\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2\2\2\u00c9"+
		")\3\2\2\2\u00ca\u00cb\5<\37\2\u00cb\u00cc\7\4\2\2\u00cc\u00cd\5(\25\2"+
		"\u00cd+\3\2\2\2\u00ce\u00cf\5<\37\2\u00cf\u00d0\7\5\2\2\u00d0\u00d1\5"+
		"(\25\2\u00d1-\3\2\2\2\u00d2\u00db\5(\25\2\u00d3\u00db\5\60\31\2\u00d4"+
		"\u00db\5\62\32\2\u00d5\u00db\5\64\33\2\u00d6\u00db\5\66\34\2\u00d7\u00db"+
		"\58\35\2\u00d8\u00db\5:\36\2\u00d9\u00db\7\35\2\2\u00da\u00d2\3\2\2\2"+
		"\u00da\u00d3\3\2\2\2\u00da\u00d4\3\2\2\2\u00da\u00d5\3\2\2\2\u00da\u00d6"+
		"\3\2\2\2\u00da\u00d7\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"/\3\2\2\2\u00dc\u00dd\5(\25\2\u00dd\u00de\7\n\2\2\u00de\u00df\5<\37\2"+
		"\u00df\61\3\2\2\2\u00e0\u00e1\5(\25\2\u00e1\u00e2\7\13\2\2\u00e2\u00e3"+
		"\5<\37\2\u00e3\63\3\2\2\2\u00e4\u00e5\5(\25\2\u00e5\u00e6\7\f\2\2\u00e6"+
		"\u00e7\5<\37\2\u00e7\65\3\2\2\2\u00e8\u00e9\5(\25\2\u00e9\u00ea\7\r\2"+
		"\2\u00ea\u00eb\5<\37\2\u00eb\67\3\2\2\2\u00ec\u00ed\5(\25\2\u00ed\u00ee"+
		"\7\17\2\2\u00ee\u00ef\5<\37\2\u00ef9\3\2\2\2\u00f0\u00f1\5(\25\2\u00f1"+
		"\u00f2\7\16\2\2\u00f2\u00f3\5<\37\2\u00f3;\3\2\2\2\u00f4\u00f8\5> \2\u00f5"+
		"\u00f8\5@!\2\u00f6\u00f8\5B\"\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3\2\2"+
		"\2\u00f7\u00f6\3\2\2\2\u00f8=\3\2\2\2\u00f9\u00fa\5B\"\2\u00fa\u00fb\7"+
		"\6\2\2\u00fb\u00fc\5<\37\2\u00fc?\3\2\2\2\u00fd\u00fe\5B\"\2\u00fe\u00ff"+
		"\7\7\2\2\u00ff\u0100\5<\37\2\u0100A\3\2\2\2\u0101\u0102\7\22\2\2\u0102"+
		"\u0103\5(\25\2\u0103\u0104\7\23\2\2\u0104\u010a\3\2\2\2\u0105\u010a\7"+
		" \2\2\u0106\u010a\7!\2\2\u0107\u010a\7#\2\2\u0108\u010a\5D#\2\u0109\u0101"+
		"\3\2\2\2\u0109\u0105\3\2\2\2\u0109\u0106\3\2\2\2\u0109\u0107\3\2\2\2\u0109"+
		"\u0108\3\2\2\2\u010aC\3\2\2\2\u010b\u010c\7\5\2\2\u010c\u010d\5B\"\2\u010d"+
		"E\3\2\2\2\20IVZk\u008c\u0099\u00a0\u00ac\u00b2\u00b6\u00c8\u00da\u00f7"+
		"\u0109";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}