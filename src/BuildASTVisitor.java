import org.antlr.v4.runtime.RuleContext;

public class BuildASTVisitor extends HelloBaseVisitor<StatementNode>
{


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
        ExpressionNode node;
        if (ctx.getChildCount() > 2) {
            System.out.println("Many children expression");
        }
        return super.visitExpression(ctx);
    }

    @Override
    public StatementNode visitTerm(HelloParser.TermContext ctx) {
        if (ctx.getChildCount() > 2 )
        {
            System.out.println("Child count: " + ctx.getChildCount());
            //ctx.setParent(ctx);
            for (int i = 0; i < ctx.getChildCount(); i++) {
                System.out.println(ctx.getChild(i).getText());
                if (ctx.getRuleIndex() == 18) {
                    System.out.println("18 is here");
                    StatementNode node = visitChildren(ctx.factor(0));
                }
            }
        }

        return super.visitTerm(ctx);
    }

    @Override
    public StatementNode visitFactor(HelloParser.FactorContext ctx) {
        return super.visitFactor(ctx);
    }
}
