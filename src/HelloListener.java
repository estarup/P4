// Generated from Hello.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#trafficProg}.
	 * @param ctx the parse tree
	 */
	void enterTrafficProg(HelloParser.TrafficProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#trafficProg}.
	 * @param ctx the parse tree
	 */
	void exitTrafficProg(HelloParser.TrafficProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(HelloParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(HelloParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HelloParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HelloParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(HelloParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(HelloParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statement(HelloParser.Create_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#create_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statement(HelloParser.Create_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#method_parameter}.
	 * @param ctx the parse tree
	 */
	void enterMethod_parameter(HelloParser.Method_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#method_parameter}.
	 * @param ctx the parse tree
	 */
	void exitMethod_parameter(HelloParser.Method_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#curl_statement}.
	 * @param ctx the parse tree
	 */
	void enterCurl_statement(HelloParser.Curl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#curl_statement}.
	 * @param ctx the parse tree
	 */
	void exitCurl_statement(HelloParser.Curl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expression(HelloParser.Logic_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#logic_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expression(HelloParser.Logic_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(HelloParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(HelloParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#car_statement}.
	 * @param ctx the parse tree
	 */
	void enterCar_statement(HelloParser.Car_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#car_statement}.
	 * @param ctx the parse tree
	 */
	void exitCar_statement(HelloParser.Car_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#carSpawner_statement}.
	 * @param ctx the parse tree
	 */
	void enterCarSpawner_statement(HelloParser.CarSpawner_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#carSpawner_statement}.
	 * @param ctx the parse tree
	 */
	void exitCarSpawner_statement(HelloParser.CarSpawner_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#trafficLight_statement}.
	 * @param ctx the parse tree
	 */
	void enterTrafficLight_statement(HelloParser.TrafficLight_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#trafficLight_statement}.
	 * @param ctx the parse tree
	 */
	void exitTrafficLight_statement(HelloParser.TrafficLight_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#grid_statement}.
	 * @param ctx the parse tree
	 */
	void enterGrid_statement(HelloParser.Grid_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#grid_statement}.
	 * @param ctx the parse tree
	 */
	void exitGrid_statement(HelloParser.Grid_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HelloParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(HelloParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(HelloParser.FactorContext ctx);
}