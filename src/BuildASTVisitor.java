import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class BuildASTVisitor extends HelloBaseVisitor<StatementNode>
{
    private BlockNode theTopNode = new BlockNode();
    @Override public StatementNode visitTrafficProg(HelloParser.TrafficProgContext ctx) {
        return visitChildren(ctx); }
    @Override public StatementNode visitStatement(HelloParser.StatementContext ctx) {
        return visitChildren(ctx); }

    @Override
    public StatementNode visitDeclaration(HelloParser.DeclarationContext ctx) {
        DeclarationNode node = new DeclarationNode();
        node.type = ctx.children.get(0).getText();
        node.ID = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public StatementNode visitAssignment(HelloParser.AssignmentContext ctx) {
        AssignmentNode node = new AssignmentNode();
        node.ID = ctx.children.get(0).getText();
        node.value =  null;
        return node;
    }

    @Override
    public StatementNode visitExpression(HelloParser.ExpressionContext ctx) {
        return super.visitExpression(ctx);
    }

    @Override
    protected StatementNode aggregateResult(StatementNode aggregate, StatementNode nextResult) {
        if (aggregate instanceof BlockNode) {
            BlockNode block = (BlockNode) aggregate;
            block.children.add(nextResult);
            return aggregate;
        }
        return nextResult;
    }
}
