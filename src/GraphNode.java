

public class GraphNode extends AST  {
    @Override
    public void accept(ASTVisitor v) {
        v.visit(this);
    }
}
