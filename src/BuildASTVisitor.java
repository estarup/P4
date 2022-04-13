import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Stack;

public class BuildASTVisitor extends HelloBaseVisitor<StatementNode>
{
    @Override
    public StatementNode visitStatement(HelloParser.StatementContext ctx) {

        System.out.println("Statement: " + ctx.getText());
        return super.visitStatement(ctx);
    }

    @Override
    public StatementNode visitMethod(HelloParser.MethodContext ctx) {
        return super.visitMethod(ctx);
    }

    @Override
    public StatementNode visitIf_statement(HelloParser.If_statementContext ctx) {
        return super.visitIf_statement(ctx);
    }

    @Override
    public StatementNode visitExpression(HelloParser.ExpressionContext ctx) {
        System.out.println("string: " + ctx.parent.getText());
        return super.visitExpression(ctx);
    }


}
