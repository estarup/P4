import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import sun.java2d.pipe.SpanShapeRenderer;

public class BuildASTVisitor extends HelloBaseVisitor<GraphNode>
{
    private BlockNode theTopNode = new BlockNode();
    @Override public GraphNode visitTrafficProg(HelloParser.TrafficProgContext ctx) {
        GraphNode result =  visitChildren(ctx);
        if (result instanceof BlockNode) {
            theTopNode = (BlockNode) result;
        }
        return result;
    }


    @Override
    public GraphNode visitDeclaration(HelloParser.DeclarationContext ctx) {
        DeclarationNode node = new DeclarationNode();
        node.type = ctx.children.get(0).getText();
        node.ID = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public GraphNode visitAssignment(HelloParser.AssignmentContext ctx) {
        AssignmentNode node = new AssignmentNode();
        node.ID = ctx.children.get(0).getText();
        node.value =  visitExpression(ctx.expression());
        return node;
    }


    @Override
    public GraphNode visitFactor(HelloParser.FactorContext ctx) {
        if (ctx.getChildCount() > 1) {
            return visitExpression(ctx.expression(0));
        }
        SimpleExpressionNode factor = new SimpleExpressionNode();
        factor.value = ctx.getText();
        return factor;
    }


    @Override
    public GraphNode visitAdd_expression(HelloParser.Add_expressionContext ctx) {
        AddNode node = new AddNode();
        node.left = visitTerm(ctx.term(0));
        node.right = visitTerm(ctx.term(1));
        return node;
    }

    @Override
    protected GraphNode aggregateResult(GraphNode aggregate, GraphNode nextResult) {
        if (aggregate != null && ! (aggregate instanceof BlockNode)) {
            BlockNode block = new BlockNode();
            block.children.add(aggregate);
            aggregate = block;
        }

        if (aggregate instanceof BlockNode) {
            BlockNode block = (BlockNode) aggregate;
            block.children.add(nextResult);
            return block;
        }
        return nextResult;
    }
}
