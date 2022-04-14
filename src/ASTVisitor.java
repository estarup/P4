import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

public abstract class ASTVisitor<T>
{

    public abstract T Visit(AddNode node);

    public T Visit(StatementNode node)
    {
        return null;
    }

}
