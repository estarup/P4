import org.antlr.runtime.debug.DebugEventListener;
import org.antlr.v4.codegen.model.decl.Decl;
import org.antlr.v4.misc.Graph;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class BuildASTVisitor extends HelloBaseVisitor<AST>
{

    private AST theTopNode = new BlockNode();
    @Override public AST visitTrafficProg(HelloParser.TrafficProgContext ctx) {
        AST result =  visitChildren(ctx);
        if (result instanceof BlockNode) {
            theTopNode = result;
        }
        return result;
    }

    @Override
    public AST visitMethod(HelloParser.MethodContext ctx) {
        MethodNode node = new MethodNode();
        if (ctx.children.get(0).getChildCount() > 0) {
            node.declaration = (MethodDeclaration) visitMethod_declaration(ctx.method_declaration());
        }
        if (ctx.children.get(1).getChildCount() > 0) {
            node.parameter =  (DeclarationNode) visitMethod_parameter(ctx.method_parameter());
        }
        if (ctx.children.get(2).getChildCount() > 2) {
            node.body = (BlockNode) visitCurl_statement(ctx.curl_statement());
        }
        return node;
    }

    @Override
    public AST visitMethod_declaration(HelloParser.Method_declarationContext ctx) {
        MethodDeclaration node = new MethodDeclaration();
        node.returnType = ctx.children.get(0).getText();
        node.name = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public DeclarationNode visitDeclaration(HelloParser.DeclarationContext ctx) {
        DeclarationNode node = new DeclarationNode();
        node.type = ctx.children.get(0).getText();
        node.ID = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public AST visitAssignment(HelloParser.AssignmentContext ctx) {
        AssignmentNode node = new AssignmentNode();
        node.ID = ctx.children.get(0).getText();
        node.Value =  visitExpression(ctx.expression());
        return node;
    }

    @Override
    public AST visitIf_statement(HelloParser.If_statementContext ctx) {
        If_Then_ElseNode node = new If_Then_ElseNode();
        if (ctx.children.get(2).getChildCount() > 2) {
            node.condition = (BinaryOperatorNode) visitCondition(ctx.logic_expression().condition());
            node.if_body = (BlockNode) visitChildren(ctx.curl_statement());
            try {
                node.else_body = (BlockNode) visitChildren(ctx.else_statement());
            } catch (NullPointerException n) {
                System.out.println("No else statement");
            }
         }
        return node;
    }

    @Override
    public AST visitWhile_loop(HelloParser.While_loopContext ctx) {
        WhileStmNode node = new WhileStmNode();
        if (ctx.children.get(2).getChildCount() > 2) {
            node.condition = (BinaryOperatorNode) visitCondition(ctx.logic_expression().condition());
            node.body = (BlockNode) visitChildren(ctx.curl_statement());
        }
        return node;
    }

    @Override
    public AST visitCreate_statement(HelloParser.Create_statementContext ctx) {
        CreateNode node = new CreateNode();
        node.type = ctx.children.get(1).getText();
        node.ID = ctx.children.get(2).getText();
        node.body = (BlockNode) visitCurl_statement(ctx.curl_statement());
        return  node;
    }

    @Override
    public AST visitReturn_statement(HelloParser.Return_statementContext ctx) {
        ReturnNode node = new ReturnNode();
        node.ID = ctx.children.get(1).getText();
        return node;
    }




    @Override
    public AST visitMethod_parameter(HelloParser.Method_parameterContext ctx) {
        DeclarationNode node = new DeclarationNode();
        if (ctx.getChildCount() > 2) {
            node = visitDeclaration(ctx.declaration());
        }
        return node;
    }

    @Override
    public AST visitFactor(HelloParser.FactorContext ctx) {
        if (ctx.getChildCount() > 1) {
            return visitExpression(ctx.expression());
        }
        SimpleExpressionNode factor = new SimpleExpressionNode();
        factor.value =  ctx.getText();
        return factor;
    }

    @Override
    public AST visitEqual_condition(HelloParser.Equal_conditionContext ctx) {
        EqualNode node = new EqualNode();
        node.left = (GraphNode) visitExpression(ctx.expression());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitNot_equal_condition(HelloParser.Not_equal_conditionContext ctx) {
        NotEqualNode node = new NotEqualNode();
        node.left = (GraphNode) visitExpression(ctx.expression());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitLess_or_equal_condition(HelloParser.Less_or_equal_conditionContext ctx) {
        LessOrEqualNode node = new LessOrEqualNode();
        node.left = (GraphNode) visitExpression(ctx.expression());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitMore_or_equal_condition(HelloParser.More_or_equal_conditionContext ctx) {
        MoreOrEqualNode node = new MoreOrEqualNode();
        node.left = (GraphNode) visitExpression(ctx.expression());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitMore_than_condition(HelloParser.More_than_conditionContext ctx) {
        MoreThanNode node = new MoreThanNode();
        node.left = (GraphNode) visitExpression(ctx.expression());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitLess_than_condition(HelloParser.Less_than_conditionContext ctx) {
        LessThanNode node = new LessThanNode();
        node.left = (GraphNode) visitExpression(ctx.expression());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitAdd_expression(HelloParser.Add_expressionContext ctx) {
        AddNode node = new AddNode();
        node.left = (GraphNode) visitTerm(ctx.term());
        node.right = (GraphNode) visitExpression(ctx.expression());
        return node;
    }

    @Override
    public AST visitSubtract_expression(HelloParser.Subtract_expressionContext ctx) {
        SubtractNode node = new SubtractNode();
        node.left = (GraphNode) visitTerm(ctx.term());
        node.right = (GraphNode) visitExpression(ctx.expression());
        return node;
    }
    @Override
    public AST visitMultiply_term(HelloParser.Multiply_termContext ctx) {
        MultiplyNode node = new MultiplyNode();
        node.left = (GraphNode) visitFactor(ctx.factor());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    public AST visitDivide_term(HelloParser.Divide_termContext ctx) {
        DivideNode node = new DivideNode();
        node.left = (GraphNode) visitFactor(ctx.factor());
        node.right = (GraphNode) visitTerm(ctx.term());
        return node;
    }

    @Override
    protected AST aggregateResult(AST aggregate, AST nextResult) {
        if (aggregate != null && ! (aggregate instanceof BlockNode)) {
            BlockNode block = new BlockNode();
            block.childrenList.add((GraphNode) aggregate);
            aggregate = block;
        }
        if (aggregate instanceof BlockNode) {
            BlockNode block = (BlockNode) aggregate;
            block.childrenList.add((GraphNode) nextResult);
            return block;
        }
        return nextResult;
    }
}
