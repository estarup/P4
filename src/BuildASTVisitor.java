import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

public class BuildASTVisitor extends HelloBaseVisitor<StatementNode>
{
    @Override public StatementNode visitTrafficProg(HelloParser.TrafficProgContext ctx) { return visitChildren(ctx); }

}
