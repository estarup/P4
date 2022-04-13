
public class BuildASTVisitor extends HelloBaseVisitor<StatementNode>
{

    @Override
    public StatementNode visitStatement(HelloParser.StatementContext ctx) {
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
    public StatementNode visitWhile_loop(HelloParser.While_loopContext ctx) {
        return super.visitWhile_loop(ctx);
    }

    @Override
    public StatementNode visitCreate_statement(HelloParser.Create_statementContext ctx) {
        return super.visitCreate_statement(ctx);
    }

    @Override
    public StatementNode visitAssignment(HelloParser.AssignmentContext ctx) {
        return super.visitAssignment(ctx);
    }

    @Override
    public StatementNode visitDeclaration(HelloParser.DeclarationContext ctx) {

        return super.visitDeclaration(ctx);
    }

    @Override
    public StatementNode visitExpression(HelloParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }
}
