// Generated from /Users/emil/IdeaProjects/P4/grammar/Hello.g4 by ANTLR 4.10.1
package com.output;
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ADD=2, SUBTRACT=3, MULTIPLY=4, DIVIDE=5, ASSIGN=6, SEMICOLON=7, 
		EQUAL=8, NOTEQUAL=9, LESSTHAN=10, MORETHAN=11, LESSOREQUAL=12, MOREOREQUAL=13, 
		LCURL=14, RCURL=15, LPAREN=16, RPAREN=17, IF=18, ELSE=19, WHILE=20, CREATE=21, 
		START=22, RETURN=23, CAR=24, CARSPAWNER=25, TRAFFICLIGHT=26, GRID=27, 
		BOOL=28, METH_RETURN_TYPE=29, NUM_TYPE=30, INTEGER=31, DOUBLE=32, METH_NAME=33, 
		ID=34, STRING=35, WS=36;
	public static final int
		RULE_trafficProg = 0, RULE_statement = 1, RULE_method = 2, RULE_method_init = 3, 
		RULE_method_call = 4, RULE_method_declaration = 5, RULE_if_statement = 6, 
		RULE_while_loop = 7, RULE_create_statement = 8, RULE_create_type = 9, 
		RULE_position = 10, RULE_assignment = 11, RULE_declaration = 12, RULE_method_parameter_init = 13, 
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
			"if_statement", "while_loop", "create_statement", "create_type", "position", 
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
			"'while'", "'create'", "'Start'", "'return'", "'Car'", "'CarSpawner'", 
			"'TrafficLight'", "'Grid'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE", "ASSIGN", "SEMICOLON", 
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_RETURN_TYPE) | (1L << NUM_TYPE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
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
			case NUM_TYPE:
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
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public Curl_statementContext curl_statement() {
			return getRuleContext(Curl_statementContext.class,0);
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
			position();
			setState(115);
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
		enterRule(_localctx, 18, RULE_create_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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

	public static class PositionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(HelloParser.LPAREN, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(HelloParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(HelloParser.INTEGER, i);
		}
		public TerminalNode RPAREN() { return getToken(HelloParser.RPAREN, 0); }
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof HelloVisitor ) return ((HelloVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(LPAREN);
			setState(120);
			match(INTEGER);
			setState(121);
			match(T__0);
			setState(122);
			match(INTEGER);
			setState(123);
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
		enterRule(_localctx, 22, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(ID);
			setState(126);
			match(ASSIGN);
			setState(127);
			expression();
			setState(128);
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
			setState(130);
			match(NUM_TYPE);
			setState(131);
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
			setState(133);
			match(LPAREN);
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NUM_TYPE) {
				{
				setState(134);
				declaration();
				}
			}

			setState(137);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(LPAREN);
				setState(140);
				match(RPAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(LPAREN);
				setState(142);
				match(INTEGER);
				setState(143);
				match(RPAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				match(LPAREN);
				setState(145);
				match(DOUBLE);
				setState(146);
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
			setState(149);
			match(LCURL);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << CREATE) | (1L << METH_RETURN_TYPE) | (1L << NUM_TYPE) | (1L << METH_NAME) | (1L << ID))) != 0)) {
				{
				{
				setState(150);
				statement();
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(156);
				return_statement();
				}
			}

			setState(159);
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
			setState(161);
			match(RETURN);
			setState(162);
			match(ID);
			setState(163);
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
			setState(165);
			match(LPAREN);
			setState(166);
			condition();
			setState(167);
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
			setState(169);
			match(ELSE);
			setState(170);
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
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				add_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				subtract_expression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
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
			setState(177);
			term();
			setState(178);
			match(ADD);
			setState(179);
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
			setState(181);
			term();
			setState(182);
			match(SUBTRACT);
			setState(183);
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				equal_condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187);
				not_equal_condition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(188);
				less_than_condition();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(189);
				more_than_condition();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				more_or_equal_condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(191);
				less_or_equal_condition();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(192);
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
			setState(195);
			expression();
			setState(196);
			match(EQUAL);
			setState(197);
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
			setState(199);
			expression();
			setState(200);
			match(NOTEQUAL);
			setState(201);
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
			setState(203);
			expression();
			setState(204);
			match(LESSTHAN);
			setState(205);
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
			setState(207);
			expression();
			setState(208);
			match(MORETHAN);
			setState(209);
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
			setState(211);
			expression();
			setState(212);
			match(MOREOREQUAL);
			setState(213);
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
			setState(215);
			expression();
			setState(216);
			match(LESSOREQUAL);
			setState(217);
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
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(219);
				multiply_term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				divide_term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
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
			setState(224);
			factor();
			setState(225);
			match(MULTIPLY);
			setState(226);
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
			setState(228);
			factor();
			setState(229);
			match(DIVIDE);
			setState(230);
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
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(LPAREN);
				setState(233);
				expression();
				setState(234);
				match(RPAREN);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(INTEGER);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(DOUBLE);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(238);
				match(ID);
				}
				break;
			case SUBTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(239);
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
			setState(242);
			match(SUBTRACT);
			setState(243);
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
		"\u0004\u0001$\u00f6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0001\u0000\u0005"+
		"\u0000F\b\u0000\n\u0000\f\u0000I\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001U\b\u0001\u0001\u0002\u0001\u0002\u0003"+
		"\u0002Y\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006j\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\u0088\b\r"+
		"\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0094\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0098\b\u000f\n\u000f\f\u000f\u009b\t\u000f"+
		"\u0001\u000f\u0003\u000f\u009e\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00b0\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u00c2\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0003\u001d\u00df\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u00f1\b \u0001!\u0001!\u0001"+
		"!\u0001!\u0000\u0000\"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@B\u0000\u0001\u0001"+
		"\u0000\u0018\u001b\u00ef\u0000G\u0001\u0000\u0000\u0000\u0002T\u0001\u0000"+
		"\u0000\u0000\u0004X\u0001\u0000\u0000\u0000\u0006Z\u0001\u0000\u0000\u0000"+
		"\b^\u0001\u0000\u0000\u0000\nb\u0001\u0000\u0000\u0000\fe\u0001\u0000"+
		"\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000"+
		"\u0012u\u0001\u0000\u0000\u0000\u0014w\u0001\u0000\u0000\u0000\u0016}"+
		"\u0001\u0000\u0000\u0000\u0018\u0082\u0001\u0000\u0000\u0000\u001a\u0085"+
		"\u0001\u0000\u0000\u0000\u001c\u0093\u0001\u0000\u0000\u0000\u001e\u0095"+
		"\u0001\u0000\u0000\u0000 \u00a1\u0001\u0000\u0000\u0000\"\u00a5\u0001"+
		"\u0000\u0000\u0000$\u00a9\u0001\u0000\u0000\u0000&\u00af\u0001\u0000\u0000"+
		"\u0000(\u00b1\u0001\u0000\u0000\u0000*\u00b5\u0001\u0000\u0000\u0000,"+
		"\u00c1\u0001\u0000\u0000\u0000.\u00c3\u0001\u0000\u0000\u00000\u00c7\u0001"+
		"\u0000\u0000\u00002\u00cb\u0001\u0000\u0000\u00004\u00cf\u0001\u0000\u0000"+
		"\u00006\u00d3\u0001\u0000\u0000\u00008\u00d7\u0001\u0000\u0000\u0000:"+
		"\u00de\u0001\u0000\u0000\u0000<\u00e0\u0001\u0000\u0000\u0000>\u00e4\u0001"+
		"\u0000\u0000\u0000@\u00f0\u0001\u0000\u0000\u0000B\u00f2\u0001\u0000\u0000"+
		"\u0000DF\u0003\u0002\u0001\u0000ED\u0001\u0000\u0000\u0000FI\u0001\u0000"+
		"\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000HJ\u0001"+
		"\u0000\u0000\u0000IG\u0001\u0000\u0000\u0000JK\u0005\u0000\u0000\u0001"+
		"K\u0001\u0001\u0000\u0000\u0000LU\u0003\u0004\u0002\u0000MU\u0003\f\u0006"+
		"\u0000NU\u0003\u000e\u0007\u0000OU\u0003\u0010\b\u0000PU\u0003\u0016\u000b"+
		"\u0000QR\u0003\u0018\f\u0000RS\u0005\u0007\u0000\u0000SU\u0001\u0000\u0000"+
		"\u0000TL\u0001\u0000\u0000\u0000TM\u0001\u0000\u0000\u0000TN\u0001\u0000"+
		"\u0000\u0000TO\u0001\u0000\u0000\u0000TP\u0001\u0000\u0000\u0000TQ\u0001"+
		"\u0000\u0000\u0000U\u0003\u0001\u0000\u0000\u0000VY\u0003\u0006\u0003"+
		"\u0000WY\u0003\b\u0004\u0000XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000"+
		"\u0000Y\u0005\u0001\u0000\u0000\u0000Z[\u0003\n\u0005\u0000[\\\u0003\u001a"+
		"\r\u0000\\]\u0003\u001e\u000f\u0000]\u0007\u0001\u0000\u0000\u0000^_\u0005"+
		"!\u0000\u0000_`\u0003\u001c\u000e\u0000`a\u0005\u0007\u0000\u0000a\t\u0001"+
		"\u0000\u0000\u0000bc\u0005\u001d\u0000\u0000cd\u0005!\u0000\u0000d\u000b"+
		"\u0001\u0000\u0000\u0000ef\u0005\u0012\u0000\u0000fg\u0003\"\u0011\u0000"+
		"gi\u0003\u001e\u000f\u0000hj\u0003$\u0012\u0000ih\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000kl\u0005\u0014\u0000"+
		"\u0000lm\u0003\"\u0011\u0000mn\u0003\u001e\u000f\u0000n\u000f\u0001\u0000"+
		"\u0000\u0000op\u0005\u0015\u0000\u0000pq\u0003\u0012\t\u0000qr\u0005\""+
		"\u0000\u0000rs\u0003\u0014\n\u0000st\u0003\u001e\u000f\u0000t\u0011\u0001"+
		"\u0000\u0000\u0000uv\u0007\u0000\u0000\u0000v\u0013\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0010\u0000\u0000xy\u0005\u001f\u0000\u0000yz\u0005\u0001"+
		"\u0000\u0000z{\u0005\u001f\u0000\u0000{|\u0005\u0011\u0000\u0000|\u0015"+
		"\u0001\u0000\u0000\u0000}~\u0005\"\u0000\u0000~\u007f\u0005\u0006\u0000"+
		"\u0000\u007f\u0080\u0003&\u0013\u0000\u0080\u0081\u0005\u0007\u0000\u0000"+
		"\u0081\u0017\u0001\u0000\u0000\u0000\u0082\u0083\u0005\u001e\u0000\u0000"+
		"\u0083\u0084\u0005\"\u0000\u0000\u0084\u0019\u0001\u0000\u0000\u0000\u0085"+
		"\u0087\u0005\u0010\u0000\u0000\u0086\u0088\u0003\u0018\f\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089"+
		"\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0011\u0000\u0000\u008a\u001b"+
		"\u0001\u0000\u0000\u0000\u008b\u008c\u0005\u0010\u0000\u0000\u008c\u0094"+
		"\u0005\u0011\u0000\u0000\u008d\u008e\u0005\u0010\u0000\u0000\u008e\u008f"+
		"\u0005\u001f\u0000\u0000\u008f\u0094\u0005\u0011\u0000\u0000\u0090\u0091"+
		"\u0005\u0010\u0000\u0000\u0091\u0092\u0005 \u0000\u0000\u0092\u0094\u0005"+
		"\u0011\u0000\u0000\u0093\u008b\u0001\u0000\u0000\u0000\u0093\u008d\u0001"+
		"\u0000\u0000\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0094\u001d\u0001"+
		"\u0000\u0000\u0000\u0095\u0099\u0005\u000e\u0000\u0000\u0096\u0098\u0003"+
		"\u0002\u0001\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u009b\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009e\u0003 \u0010\u0000\u009d\u009c\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000"+
		"\u0000\u0000\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u001f\u0001\u0000"+
		"\u0000\u0000\u00a1\u00a2\u0005\u0017\u0000\u0000\u00a2\u00a3\u0005\"\u0000"+
		"\u0000\u00a3\u00a4\u0005\u0007\u0000\u0000\u00a4!\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0005\u0010\u0000\u0000\u00a6\u00a7\u0003,\u0016\u0000\u00a7"+
		"\u00a8\u0005\u0011\u0000\u0000\u00a8#\u0001\u0000\u0000\u0000\u00a9\u00aa"+
		"\u0005\u0013\u0000\u0000\u00aa\u00ab\u0003\u001e\u000f\u0000\u00ab%\u0001"+
		"\u0000\u0000\u0000\u00ac\u00b0\u0003(\u0014\u0000\u00ad\u00b0\u0003*\u0015"+
		"\u0000\u00ae\u00b0\u0003:\u001d\u0000\u00af\u00ac\u0001\u0000\u0000\u0000"+
		"\u00af\u00ad\u0001\u0000\u0000\u0000\u00af\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\'\u0001\u0000\u0000\u0000\u00b1\u00b2\u0003:\u001d\u0000\u00b2"+
		"\u00b3\u0005\u0002\u0000\u0000\u00b3\u00b4\u0003&\u0013\u0000\u00b4)\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0003:\u001d\u0000\u00b6\u00b7\u0005\u0003"+
		"\u0000\u0000\u00b7\u00b8\u0003&\u0013\u0000\u00b8+\u0001\u0000\u0000\u0000"+
		"\u00b9\u00c2\u0003&\u0013\u0000\u00ba\u00c2\u0003.\u0017\u0000\u00bb\u00c2"+
		"\u00030\u0018\u0000\u00bc\u00c2\u00032\u0019\u0000\u00bd\u00c2\u00034"+
		"\u001a\u0000\u00be\u00c2\u00036\u001b\u0000\u00bf\u00c2\u00038\u001c\u0000"+
		"\u00c0\u00c2\u0005\u001c\u0000\u0000\u00c1\u00b9\u0001\u0000\u0000\u0000"+
		"\u00c1\u00ba\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bc\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000"+
		"\u00c1\u00be\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c0\u0001\u0000\u0000\u0000\u00c2-\u0001\u0000\u0000\u0000\u00c3"+
		"\u00c4\u0003&\u0013\u0000\u00c4\u00c5\u0005\b\u0000\u0000\u00c5\u00c6"+
		"\u0003:\u001d\u0000\u00c6/\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003&"+
		"\u0013\u0000\u00c8\u00c9\u0005\t\u0000\u0000\u00c9\u00ca\u0003:\u001d"+
		"\u0000\u00ca1\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003&\u0013\u0000\u00cc"+
		"\u00cd\u0005\n\u0000\u0000\u00cd\u00ce\u0003:\u001d\u0000\u00ce3\u0001"+
		"\u0000\u0000\u0000\u00cf\u00d0\u0003&\u0013\u0000\u00d0\u00d1\u0005\u000b"+
		"\u0000\u0000\u00d1\u00d2\u0003:\u001d\u0000\u00d25\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d4\u0003&\u0013\u0000\u00d4\u00d5\u0005\r\u0000\u0000\u00d5"+
		"\u00d6\u0003:\u001d\u0000\u00d67\u0001\u0000\u0000\u0000\u00d7\u00d8\u0003"+
		"&\u0013\u0000\u00d8\u00d9\u0005\f\u0000\u0000\u00d9\u00da\u0003:\u001d"+
		"\u0000\u00da9\u0001\u0000\u0000\u0000\u00db\u00df\u0003<\u001e\u0000\u00dc"+
		"\u00df\u0003>\u001f\u0000\u00dd\u00df\u0003@ \u0000\u00de\u00db\u0001"+
		"\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00de\u00dd\u0001"+
		"\u0000\u0000\u0000\u00df;\u0001\u0000\u0000\u0000\u00e0\u00e1\u0003@ "+
		"\u0000\u00e1\u00e2\u0005\u0004\u0000\u0000\u00e2\u00e3\u0003:\u001d\u0000"+
		"\u00e3=\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003@ \u0000\u00e5\u00e6"+
		"\u0005\u0005\u0000\u0000\u00e6\u00e7\u0003:\u001d\u0000\u00e7?\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0005\u0010\u0000\u0000\u00e9\u00ea\u0003&\u0013"+
		"\u0000\u00ea\u00eb\u0005\u0011\u0000\u0000\u00eb\u00f1\u0001\u0000\u0000"+
		"\u0000\u00ec\u00f1\u0005\u001f\u0000\u0000\u00ed\u00f1\u0005 \u0000\u0000"+
		"\u00ee\u00f1\u0005\"\u0000\u0000\u00ef\u00f1\u0003B!\u0000\u00f0\u00e8"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ec\u0001\u0000\u0000\u0000\u00f0\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000\u00f0\u00ef"+
		"\u0001\u0000\u0000\u0000\u00f1A\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0003\u0000\u0000\u00f3\u00f4\u0003@ \u0000\u00f4C\u0001\u0000\u0000"+
		"\u0000\fGTXi\u0087\u0093\u0099\u009d\u00af\u00c1\u00de\u00f0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}