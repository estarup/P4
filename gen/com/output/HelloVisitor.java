// Generated from /Users/emil/IdeaProjects/P4/grammar/Hello.g4 by ANTLR 4.10.1
package com.output;
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
	 * Visit a parse tree produced by {@link HelloParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(HelloParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_init(HelloParser.Method_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(HelloParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(HelloParser.Method_declarationContext ctx);
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
	 * Visit a parse tree produced by {@link HelloParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(HelloParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#position}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(HelloParser.PositionContext ctx);
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
	 * Visit a parse tree produced by {@link HelloParser#method_parameter_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_parameter_init(HelloParser.Method_parameter_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#method_parameter_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_parameter_call(HelloParser.Method_parameter_callContext ctx);
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
	 * Visit a parse tree produced by {@link HelloParser#equal_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual_condition(HelloParser.Equal_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#not_equal_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_equal_condition(HelloParser.Not_equal_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#less_than_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_than_condition(HelloParser.Less_than_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#more_than_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_than_condition(HelloParser.More_than_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#more_or_equal_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMore_or_equal_condition(HelloParser.More_or_equal_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#less_or_equal_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLess_or_equal_condition(HelloParser.Less_or_equal_conditionContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link HelloParser#negative_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_factor(HelloParser.Negative_factorContext ctx);
}