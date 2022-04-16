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
		METH_RETURN_TYPE=1, NUM_TYPE=2, INTEGER=3, FLOAT=4, ADD=5, SUBTRACT=6, 
		MULTIPLY=7, DIVIDE=8, ASSIGN=9, LPAREN=10, RPAREN=11, EQUAL=12, NOTEQUAL=13, 
		LESSTHAN=14, MORETHAN=15, LESSOREQUAL=16, MOREOREQUAL=17, LCURL=18, RCURL=19, 
		IF=20, ELSE=21, WHILE=22, VOID=23, CREATE=24, START=25, CAR=26, CARSPAWNER=27, 
		TRAFFICLIGHT=28, GRID=29, CAR_NAME=30, CARSPAWNER_NAME=31, TRAFFICLIGHT_NAME=32, 
		GRID_NAME=33, BOOL=34, SEMICOLON=35, METH_NAME=36, ID=37, STRING=38, WS=39;
	public static final int
		RULE_trafficProg = 0, RULE_statement = 1, RULE_method = 2, RULE_if_statement = 3, 
		RULE_while_loop = 4, RULE_create_statement = 5, RULE_assignment = 6, RULE_declaration = 7, 
		RULE_method_parameter = 8, RULE_curl_statement = 9, RULE_logic_expression = 10, 
		RULE_else_statement = 11, RULE_car_statement = 12, RULE_carSpawner_statement = 13, 
		RULE_trafficLight_statement = 14, RULE_grid_statement = 15, RULE_expression = 16, 
		RULE_condition = 17, RULE_term = 18, RULE_factor = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"trafficProg", "statement", "method", "if_statement", "while_loop", "create_statement", 
			"assignment", "declaration", "method_parameter", "curl_statement", "logic_expression", 
			"else_statement", "car_statement", "carSpawner_statement", "trafficLight_statement", 
			"grid_statement", "expression", "condition", "term", "factor"
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
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METH_RETURN_TYPE) | (1L << NUM_TYPE) | (1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
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
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METH_RETURN_TYPE:
			case METH_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				method();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(50);
				while_loop();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(51);
				create_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(52);
				assignment();
				}
				break;
			case NUM_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(53);
				declaration();
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
		public TerminalNode METH_RETURN_TYPE() { return getToken(HelloParser.METH_RETURN_TYPE, 0); }
		public TerminalNode METH_NAME() { return getToken(HelloParser.METH_NAME, 0); }
		public Method_parameterContext method_parameter() {
			return getRuleContext(Method_parameterContext.class,0);
		}
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
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
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METH_RETURN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(METH_RETURN_TYPE);
				setState(57);
				match(METH_NAME);
				setState(58);
				method_parameter();
				setState(59);
				curl_statement();
				}
				break;
			case METH_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(METH_NAME);
				setState(62);
				method_parameter();
				setState(63);
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
		enterRule(_localctx, 6, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(IF);
			setState(68);
			logic_expression();
			setState(69);
			curl_statement();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(70);
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
		enterRule(_localctx, 8, RULE_while_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WHILE);
			setState(74);
			logic_expression();
			setState(75);
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
		public Car_statementContext car_statement() {
			return getRuleContext(Car_statementContext.class,0);
		}
		public CarSpawner_statementContext carSpawner_statement() {
			return getRuleContext(CarSpawner_statementContext.class,0);
		}
		public TrafficLight_statementContext trafficLight_statement() {
			return getRuleContext(TrafficLight_statementContext.class,0);
		}
		public Grid_statementContext grid_statement() {
			return getRuleContext(Grid_statementContext.class,0);
		}
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
		enterRule(_localctx, 10, RULE_create_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CREATE);
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAR:
				{
				setState(78);
				car_statement();
				}
				break;
			case CARSPAWNER:
				{
				setState(79);
				carSpawner_statement();
				}
				break;
			case TRAFFICLIGHT:
				{
				setState(80);
				trafficLight_statement();
				}
				break;
			case GRID:
				{
				setState(81);
				grid_statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			match(ASSIGN);
			setState(86);
			expression();
			setState(87);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode NUM_TYPE() { return getToken(HelloParser.NUM_TYPE, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(HelloParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 14, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(NUM_TYPE);
			setState(90);
			match(ID);
			setState(91);
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

	public static class Method_parameterContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public Method_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_parameterContext method_parameter() throws RecognitionException {
		Method_parameterContext _localctx = new Method_parameterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_method_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LPAREN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM_TYPE) {
				{
				setState(94);
				declaration();
				}
			}

			setState(97);
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

	public static class Curl_statementContext extends ParserRuleContext {
		public TerminalNode LCURL() { return getToken(HelloParser.LCURL, 0); }
		public TerminalNode RCURL() { return getToken(HelloParser.RCURL, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
		enterRule(_localctx, 18, RULE_curl_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(LCURL);
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METH_RETURN_TYPE) | (1L << NUM_TYPE) | (1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(100);
				statement();
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
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
		enterRule(_localctx, 20, RULE_logic_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(LPAREN);
			setState(109);
			condition();
			setState(110);
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
		enterRule(_localctx, 22, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(ELSE);
			setState(113);
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

	public static class Car_statementContext extends ParserRuleContext {
		public TerminalNode CAR() { return getToken(HelloParser.CAR, 0); }
		public TerminalNode CAR_NAME() { return getToken(HelloParser.CAR_NAME, 0); }
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public Car_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_car_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCar_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Car_statementContext car_statement() throws RecognitionException {
		Car_statementContext _localctx = new Car_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_car_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(CAR);
			setState(116);
			match(CAR_NAME);
			setState(117);
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

	public static class CarSpawner_statementContext extends ParserRuleContext {
		public TerminalNode CARSPAWNER() { return getToken(HelloParser.CARSPAWNER, 0); }
		public TerminalNode CARSPAWNER_NAME() { return getToken(HelloParser.CARSPAWNER_NAME, 0); }
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public CarSpawner_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_carSpawner_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitCarSpawner_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CarSpawner_statementContext carSpawner_statement() throws RecognitionException {
		CarSpawner_statementContext _localctx = new CarSpawner_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_carSpawner_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(CARSPAWNER);
			setState(120);
			match(CARSPAWNER_NAME);
			setState(121);
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

	public static class TrafficLight_statementContext extends ParserRuleContext {
		public TerminalNode TRAFFICLIGHT() { return getToken(HelloParser.TRAFFICLIGHT, 0); }
		public TerminalNode TRAFFICLIGHT_NAME() { return getToken(HelloParser.TRAFFICLIGHT_NAME, 0); }
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public TrafficLight_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trafficLight_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitTrafficLight_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrafficLight_statementContext trafficLight_statement() throws RecognitionException {
		TrafficLight_statementContext _localctx = new TrafficLight_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_trafficLight_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			match(TRAFFICLIGHT);
			setState(124);
			match(TRAFFICLIGHT_NAME);
			setState(125);
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

	public static class Grid_statementContext extends ParserRuleContext {
		public TerminalNode GRID() { return getToken(HelloParser.GRID, 0); }
		public TerminalNode GRID_NAME() { return getToken(HelloParser.GRID_NAME, 0); }
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public Grid_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grid_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitGrid_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grid_statementContext grid_statement() throws RecognitionException {
		Grid_statementContext _localctx = new Grid_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_grid_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(GRID);
			setState(128);
			match(GRID_NAME);
			setState(129);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
		public TerminalNode SUBTRACT() { return getToken(HelloParser.SUBTRACT, 0); }
		public TerminalNode BOOL() { return getToken(HelloParser.BOOL, 0); }
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
		enterRule(_localctx, 32, RULE_expression);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				term();
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==SUBTRACT) {
					{
					setState(132);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUBTRACT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(133);
					term();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(BOOL);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(HelloParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(HelloParser.NOTEQUAL, 0); }
		public TerminalNode LESSTHAN() { return getToken(HelloParser.LESSTHAN, 0); }
		public TerminalNode MORETHAN() { return getToken(HelloParser.MORETHAN, 0); }
		public TerminalNode MOREOREQUAL() { return getToken(HelloParser.MOREOREQUAL, 0); }
		public TerminalNode LESSOREQUAL() { return getToken(HelloParser.LESSOREQUAL, 0); }
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
		enterRule(_localctx, 34, RULE_condition);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				expression();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << MORETHAN) | (1L << LESSOREQUAL) | (1L << MOREOREQUAL))) != 0)) {
					{
					setState(140);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << MORETHAN) | (1L << LESSOREQUAL) | (1L << MOREOREQUAL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(141);
					term();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(HelloParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(HelloParser.DIVIDE, 0); }
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
		enterRule(_localctx, 36, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			factor();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MULTIPLY || _la==DIVIDE) {
				{
				setState(148);
				_la = _input.LA(1);
				if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
				factor();
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

	public static class FactorContext extends ParserRuleContext {
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	 
		public FactorContext() { }
		public void copyFrom(FactorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParenExpressionContext extends FactorContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ParenExpressionContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitParenExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends FactorContext {
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
		public IdContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends FactorContext {
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public IntContext(FactorContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_factor);
		int _la;
		try {
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				_localctx = new ParenExpressionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				match(LPAREN);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << LPAREN) | (1L << BOOL) | (1L << ID))) != 0)) {
					{
					{
					setState(153);
					expression();
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(RPAREN);
				}
				break;
			case INTEGER:
				_localctx = new IntContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				match(INTEGER);
				}
				break;
			case ID:
				_localctx = new IdContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00a7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\39\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"D\n\4\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7"+
		"U\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\5\nb\n\n\3\n\3\n\3\13"+
		"\3\13\7\13h\n\13\f\13\16\13k\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\5\22\u0089\n\22\3\22\5\22\u008c\n\22\3\23"+
		"\3\23\3\23\5\23\u0091\n\23\3\23\5\23\u0094\n\23\3\24\3\24\3\24\5\24\u0099"+
		"\n\24\3\25\3\25\7\25\u009d\n\25\f\25\16\25\u00a0\13\25\3\25\3\25\3\25"+
		"\5\25\u00a5\n\25\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(\2\5\3\2\7\b\3\2\16\23\3\2\t\n\2\u00a7\2-\3\2\2\2\48\3\2\2\2\6C\3\2"+
		"\2\2\bE\3\2\2\2\nK\3\2\2\2\fO\3\2\2\2\16V\3\2\2\2\20[\3\2\2\2\22_\3\2"+
		"\2\2\24e\3\2\2\2\26n\3\2\2\2\30r\3\2\2\2\32u\3\2\2\2\34y\3\2\2\2\36}\3"+
		"\2\2\2 \u0081\3\2\2\2\"\u008b\3\2\2\2$\u0093\3\2\2\2&\u0095\3\2\2\2(\u00a4"+
		"\3\2\2\2*,\5\4\3\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60\3\2\2\2"+
		"/-\3\2\2\2\60\61\7\2\2\3\61\3\3\2\2\2\629\5\6\4\2\639\5\b\5\2\649\5\n"+
		"\6\2\659\5\f\7\2\669\5\16\b\2\679\5\20\t\28\62\3\2\2\28\63\3\2\2\28\64"+
		"\3\2\2\28\65\3\2\2\28\66\3\2\2\28\67\3\2\2\29\5\3\2\2\2:;\7\3\2\2;<\7"+
		"&\2\2<=\5\22\n\2=>\5\24\13\2>D\3\2\2\2?@\7&\2\2@A\5\22\n\2AB\7%\2\2BD"+
		"\3\2\2\2C:\3\2\2\2C?\3\2\2\2D\7\3\2\2\2EF\7\26\2\2FG\5\26\f\2GI\5\24\13"+
		"\2HJ\5\30\r\2IH\3\2\2\2IJ\3\2\2\2J\t\3\2\2\2KL\7\30\2\2LM\5\26\f\2MN\5"+
		"\24\13\2N\13\3\2\2\2OT\7\32\2\2PU\5\32\16\2QU\5\34\17\2RU\5\36\20\2SU"+
		"\5 \21\2TP\3\2\2\2TQ\3\2\2\2TR\3\2\2\2TS\3\2\2\2U\r\3\2\2\2VW\7\'\2\2"+
		"WX\7\13\2\2XY\5\"\22\2YZ\7%\2\2Z\17\3\2\2\2[\\\7\4\2\2\\]\7\'\2\2]^\7"+
		"%\2\2^\21\3\2\2\2_a\7\f\2\2`b\5\20\t\2a`\3\2\2\2ab\3\2\2\2bc\3\2\2\2c"+
		"d\7\r\2\2d\23\3\2\2\2ei\7\24\2\2fh\5\4\3\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2"+
		"\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7\25\2\2m\25\3\2\2\2no\7\f\2\2op\5"+
		"$\23\2pq\7\r\2\2q\27\3\2\2\2rs\7\27\2\2st\5\24\13\2t\31\3\2\2\2uv\7\34"+
		"\2\2vw\7 \2\2wx\5\24\13\2x\33\3\2\2\2yz\7\35\2\2z{\7!\2\2{|\5\24\13\2"+
		"|\35\3\2\2\2}~\7\36\2\2~\177\7\"\2\2\177\u0080\5\24\13\2\u0080\37\3\2"+
		"\2\2\u0081\u0082\7\37\2\2\u0082\u0083\7#\2\2\u0083\u0084\5\24\13\2\u0084"+
		"!\3\2\2\2\u0085\u0088\5&\24\2\u0086\u0087\t\2\2\2\u0087\u0089\5&\24\2"+
		"\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u008c"+
		"\7$\2\2\u008b\u0085\3\2\2\2\u008b\u008a\3\2\2\2\u008c#\3\2\2\2\u008d\u0090"+
		"\5\"\22\2\u008e\u008f\t\3\2\2\u008f\u0091\5&\24\2\u0090\u008e\3\2\2\2"+
		"\u0090\u0091\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0094\7$\2\2\u0093\u008d"+
		"\3\2\2\2\u0093\u0092\3\2\2\2\u0094%\3\2\2\2\u0095\u0098\5(\25\2\u0096"+
		"\u0097\t\4\2\2\u0097\u0099\5(\25\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\'\3\2\2\2\u009a\u009e\7\f\2\2\u009b\u009d\5\"\22\2\u009c\u009b"+
		"\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a5\7\r\2\2\u00a2\u00a5\7\5"+
		"\2\2\u00a3\u00a5\7\'\2\2\u00a4\u009a\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5)\3\2\2\2\20-8CITai\u0088\u008b\u0090\u0093\u0098"+
		"\u009e\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}