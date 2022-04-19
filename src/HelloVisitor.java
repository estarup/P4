// Generated from Hello.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#trafficProg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrafficProg(HelloParser.TrafficProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HelloParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodParamReturn}
	 * labeled alternative in {@link HelloParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodParamReturn(HelloParser.MethodParamReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallParam}
	 * labeled alternative in {@link HelloParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallParam(HelloParser.MethodCallParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallNoParam}
	 * labeled alternative in {@link HelloParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallNoParam(HelloParser.MethodCallNoParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodNoParamReturn}
	 * labeled alternative in {@link HelloParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodNoParamReturn(HelloParser.MethodNoParamReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mehodVoidNoParam}
	 * labeled alternative in {@link HelloParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMehodVoidNoParam(HelloParser.MehodVoidNoParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HelloParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(HelloParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#create_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statement(HelloParser.Create_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(HelloParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_parameter(HelloParser.Method_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_no_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_no_parameter(HelloParser.Method_no_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#curl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurl_statement(HelloParser.Curl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(HelloParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#logic_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_expression(HelloParser.Logic_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(HelloParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#car_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCar_statement(HelloParser.Car_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#carSpawner_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCarSpawner_statement(HelloParser.CarSpawner_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#trafficLight_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrafficLight_statement(HelloParser.TrafficLight_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#grid_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrid_statement(HelloParser.Grid_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HelloParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#add_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_expression(HelloParser.Add_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#subtract_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtract_expression(HelloParser.Subtract_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(HelloParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#multiply_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply_term(HelloParser.Multiply_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#divide_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivide_term(HelloParser.Divide_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(HelloParser.FactorContext ctx);
}