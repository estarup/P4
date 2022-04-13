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
}
