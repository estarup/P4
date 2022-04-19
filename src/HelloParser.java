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
		RULE_method_parameter = 8, RULE_method_no_parameter = 9, RULE_curl_statement = 10, 
		RULE_logic_expression = 11, RULE_else_statement = 12, RULE_car_statement = 13, 
		RULE_carSpawner_statement = 14, RULE_trafficLight_statement = 15, RULE_grid_statement = 16, 
		RULE_expression = 17, RULE_add_expression = 18, RULE_subtract_expression = 19, 
		RULE_condition = 20, RULE_term = 21, RULE_multiply_term = 22, RULE_divide_term = 23, 
		RULE_factor = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"trafficProg", "statement", "method", "if_statement", "while_loop", "create_statement", 
			"assignment", "declaration", "method_parameter", "method_no_parameter", 
			"curl_statement", "logic_expression", "else_statement", "car_statement", 
			"carSpawner_statement", "trafficLight_statement", "grid_statement", "expression", 
			"add_expression", "subtract_expression", "condition", "term", "multiply_term", 
			"divide_term", "factor"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METH_RETURN_TYPE) | (1L << NUM_TYPE) | (1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(56);
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
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METH_RETURN_TYPE:
			case METH_NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				method();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				if_statement();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(60);
				while_loop();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(61);
				create_statement();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				assignment();
				}
				break;
			case NUM_TYPE:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
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
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
		}
		public Method_parameterContext method_parameter() {
			return getRuleContext(Method_parameterContext.class,0);
		}
		public Method_no_parameterContext method_no_parameter() {
			return getRuleContext(Method_no_parameterContext.class,0);
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
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case METH_RETURN_TYPE:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(METH_RETURN_TYPE);
				setState(67);
				match(METH_NAME);
				setState(70);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(68);
					method_parameter();
					}
					break;
				case 2:
					{
					setState(69);
					method_no_parameter();
					}
					break;
				}
				setState(72);
				curl_statement();
				}
				break;
			case METH_NAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(METH_NAME);
				setState(75);
				method_parameter();
				setState(76);
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
			setState(80);
			match(IF);
			setState(81);
			logic_expression();
			setState(82);
			curl_statement();
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(83);
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
			setState(86);
			match(WHILE);
			setState(87);
			logic_expression();
			setState(88);
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
			setState(90);
			match(CREATE);
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAR:
				{
				setState(91);
				car_statement();
				}
				break;
			case CARSPAWNER:
				{
				setState(92);
				carSpawner_statement();
				}
				break;
			case TRAFFICLIGHT:
				{
				setState(93);
				trafficLight_statement();
				}
				break;
			case GRID:
				{
				setState(94);
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
			setState(97);
			match(ID);
			setState(98);
			match(ASSIGN);
			setState(99);
			expression();
			setState(100);
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
			setState(102);
			match(NUM_TYPE);
			setState(103);
			match(ID);
			setState(104);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LPAREN);
			setState(107);
			declaration();
			setState(108);
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

	public static class Method_no_parameterContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public Method_no_parameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_no_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitMethod_no_parameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Method_no_parameterContext method_no_parameter() throws RecognitionException {
		Method_no_parameterContext _localctx = new Method_no_parameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_method_no_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(LPAREN);
			setState(111);
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
		enterRule(_localctx, 20, RULE_curl_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(LCURL);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << METH_RETURN_TYPE) | (1L << NUM_TYPE) | (1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(114);
				statement();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
		enterRule(_localctx, 22, RULE_logic_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(LPAREN);
			setState(123);
			condition();
			setState(124);
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
		enterRule(_localctx, 24, RULE_else_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(ELSE);
			setState(127);
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
		enterRule(_localctx, 26, RULE_car_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(CAR);
			setState(130);
			match(CAR_NAME);
			setState(131);
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
		enterRule(_localctx, 28, RULE_carSpawner_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(CARSPAWNER);
			setState(134);
			match(CARSPAWNER_NAME);
			setState(135);
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
		enterRule(_localctx, 30, RULE_trafficLight_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TRAFFICLIGHT);
			setState(138);
			match(TRAFFICLIGHT_NAME);
			setState(139);
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
		enterRule(_localctx, 32, RULE_grid_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(GRID);
			setState(142);
			match(GRID_NAME);
			setState(143);
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
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public Add_expressionContext add_expression() {
			return getRuleContext(Add_expressionContext.class,0);
		}
		public Subtract_expressionContext subtract_expression() {
			return getRuleContext(Subtract_expressionContext.class,0);
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
		enterRule(_localctx, 34, RULE_expression);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				add_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				subtract_expression();
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode ADD() { return getToken(HelloParser.ADD, 0); }
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
		enterRule(_localctx, 36, RULE_add_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			term();
			setState(151);
			match(ADD);
			setState(152);
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

	public static class Subtract_expressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TerminalNode SUBTRACT() { return getToken(HelloParser.SUBTRACT, 0); }
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
		enterRule(_localctx, 38, RULE_subtract_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			term();
			setState(155);
			match(SUBTRACT);
			setState(156);
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
		enterRule(_localctx, 40, RULE_condition);
		int _la;
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case FLOAT:
			case LPAREN:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				expression();
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << MORETHAN) | (1L << LESSOREQUAL) | (1L << MOREOREQUAL))) != 0)) {
					{
					setState(159);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NOTEQUAL) | (1L << LESSTHAN) | (1L << MORETHAN) | (1L << LESSOREQUAL) | (1L << MOREOREQUAL))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(160);
					term();
					}
				}

				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Multiply_termContext multiply_term() {
			return getRuleContext(Multiply_termContext.class,0);
		}
		public Divide_termContext divide_term() {
			return getRuleContext(Divide_termContext.class,0);
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
		enterRule(_localctx, 42, RULE_term);
		try {
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				factor();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				multiply_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				divide_term();
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(HelloParser.MULTIPLY, 0); }
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
		enterRule(_localctx, 44, RULE_multiply_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			factor();
			setState(172);
			match(MULTIPLY);
			setState(173);
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

	public static class Divide_termContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode DIVIDE() { return getToken(HelloParser.DIVIDE, 0); }
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
		enterRule(_localctx, 46, RULE_divide_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			factor();
			setState(176);
			match(DIVIDE);
			setState(177);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public TerminalNode INTEGER() { return getToken(HelloParser.INTEGER, 0); }
		public TerminalNode FLOAT() { return getToken(HelloParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(HelloParser.ID, 0); }
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
		enterRule(_localctx, 48, RULE_factor);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(LPAREN);
				setState(180);
				expression();
				setState(181);
				match(RPAREN);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				match(INTEGER);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(FLOAT);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(185);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00bf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\7\2\66\n\2\f\2\16\29\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3C\n\3\3\4\3\4\3\4\3\4\5\4I\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4Q\n\4"+
		"\3\5\3\5\3\5\3\5\5\5W\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7b\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\7\fv\n\f\f\f\16\fy\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\5\23\u0097\n\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\5\26\u00a4\n\26\3\26\5\26\u00a7\n\26\3\27\3"+
		"\27\3\27\5\27\u00ac\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00bd\n\32\3\32\2\2\33\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\2\16\23\2\u00bb\2\67"+
		"\3\2\2\2\4B\3\2\2\2\6P\3\2\2\2\bR\3\2\2\2\nX\3\2\2\2\f\\\3\2\2\2\16c\3"+
		"\2\2\2\20h\3\2\2\2\22l\3\2\2\2\24p\3\2\2\2\26s\3\2\2\2\30|\3\2\2\2\32"+
		"\u0080\3\2\2\2\34\u0083\3\2\2\2\36\u0087\3\2\2\2 \u008b\3\2\2\2\"\u008f"+
		"\3\2\2\2$\u0096\3\2\2\2&\u0098\3\2\2\2(\u009c\3\2\2\2*\u00a6\3\2\2\2,"+
		"\u00ab\3\2\2\2.\u00ad\3\2\2\2\60\u00b1\3\2\2\2\62\u00bc\3\2\2\2\64\66"+
		"\5\4\3\2\65\64\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28:\3\2\2\2"+
		"9\67\3\2\2\2:;\7\2\2\3;\3\3\2\2\2<C\5\6\4\2=C\5\b\5\2>C\5\n\6\2?C\5\f"+
		"\7\2@C\5\16\b\2AC\5\20\t\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2B?\3\2\2\2B@\3"+
		"\2\2\2BA\3\2\2\2C\5\3\2\2\2DE\7\3\2\2EH\7&\2\2FI\5\22\n\2GI\5\24\13\2"+
		"HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\5\26\f\2KQ\3\2\2\2LM\7&\2\2MN\5\22\n"+
		"\2NO\7%\2\2OQ\3\2\2\2PD\3\2\2\2PL\3\2\2\2Q\7\3\2\2\2RS\7\26\2\2ST\5\30"+
		"\r\2TV\5\26\f\2UW\5\32\16\2VU\3\2\2\2VW\3\2\2\2W\t\3\2\2\2XY\7\30\2\2"+
		"YZ\5\30\r\2Z[\5\26\f\2[\13\3\2\2\2\\a\7\32\2\2]b\5\34\17\2^b\5\36\20\2"+
		"_b\5 \21\2`b\5\"\22\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\r\3\2\2"+
		"\2cd\7\'\2\2de\7\13\2\2ef\5$\23\2fg\7%\2\2g\17\3\2\2\2hi\7\4\2\2ij\7\'"+
		"\2\2jk\7%\2\2k\21\3\2\2\2lm\7\f\2\2mn\5\20\t\2no\7\r\2\2o\23\3\2\2\2p"+
		"q\7\f\2\2qr\7\r\2\2r\25\3\2\2\2sw\7\24\2\2tv\5\4\3\2ut\3\2\2\2vy\3\2\2"+
		"\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\25\2\2{\27\3\2\2\2|}\7"+
		"\f\2\2}~\5*\26\2~\177\7\r\2\2\177\31\3\2\2\2\u0080\u0081\7\27\2\2\u0081"+
		"\u0082\5\26\f\2\u0082\33\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u0085\7 \2"+
		"\2\u0085\u0086\5\26\f\2\u0086\35\3\2\2\2\u0087\u0088\7\35\2\2\u0088\u0089"+
		"\7!\2\2\u0089\u008a\5\26\f\2\u008a\37\3\2\2\2\u008b\u008c\7\36\2\2\u008c"+
		"\u008d\7\"\2\2\u008d\u008e\5\26\f\2\u008e!\3\2\2\2\u008f\u0090\7\37\2"+
		"\2\u0090\u0091\7#\2\2\u0091\u0092\5\26\f\2\u0092#\3\2\2\2\u0093\u0097"+
		"\5,\27\2\u0094\u0097\5&\24\2\u0095\u0097\5(\25\2\u0096\u0093\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097%\3\2\2\2\u0098\u0099\5,\27\2"+
		"\u0099\u009a\7\7\2\2\u009a\u009b\5,\27\2\u009b\'\3\2\2\2\u009c\u009d\5"+
		",\27\2\u009d\u009e\7\b\2\2\u009e\u009f\5,\27\2\u009f)\3\2\2\2\u00a0\u00a3"+
		"\5$\23\2\u00a1\u00a2\t\2\2\2\u00a2\u00a4\5,\27\2\u00a3\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a7\7$\2\2\u00a6\u00a0\3\2"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7+\3\2\2\2\u00a8\u00ac\5\62\32\2\u00a9\u00ac"+
		"\5.\30\2\u00aa\u00ac\5\60\31\2\u00ab\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2"+
		"\u00ab\u00aa\3\2\2\2\u00ac-\3\2\2\2\u00ad\u00ae\5\62\32\2\u00ae\u00af"+
		"\7\t\2\2\u00af\u00b0\5\62\32\2\u00b0/\3\2\2\2\u00b1\u00b2\5\62\32\2\u00b2"+
		"\u00b3\7\n\2\2\u00b3\u00b4\5\62\32\2\u00b4\61\3\2\2\2\u00b5\u00b6\7\f"+
		"\2\2\u00b6\u00b7\5$\23\2\u00b7\u00b8\7\r\2\2\u00b8\u00bd\3\2\2\2\u00b9"+
		"\u00bd\7\5\2\2\u00ba\u00bd\7\6\2\2\u00bb\u00bd\7\'\2\2\u00bc\u00b5\3\2"+
		"\2\2\u00bc\u00b9\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd"+
		"\63\3\2\2\2\16\67BHPVaw\u0096\u00a3\u00a6\u00ab\u00bc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}