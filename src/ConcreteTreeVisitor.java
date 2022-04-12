import org.antlr.v4.runtime.tree.*;

public class ConcreteTreeVisitor implements ParseTreeVisitor {
    @Override
    public Object visit(ParseTree parseTree) {
        System.out.print("print this");
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
