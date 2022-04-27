import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

public abstract class ASTVisitor<T> extends AbstractParseTreeVisitor
{

    public abstract T visit(AddNode node);
    public abstract T visit(AssignmentNode node);
    public abstract T visit(BinaryOperatorNode node);
    public abstract T visit(BlockNode node);
    public abstract T visit(CreateNode node);
    public abstract T visit(DeclarationNode node) throws AlreadyDeclaredVariableException;
    public abstract T visit(DivideNode node);
    public abstract T visit(EqualNode node);
    public abstract T visit(ExpressionNode node);
    public abstract T visit(If_Then_ElseNode node);
    public abstract T visit(LessOrEqualNode node);
    public abstract T visit(LessThanNode node);
    public abstract T visit(MethodNode node);
    public abstract T visit(MethodDeclarationNode node);
    public abstract T visit(MoreOrEqualNode node);
    public abstract T visit(MoreThanNode node);
    public abstract T visit(MultiplyNode node);
    public abstract T visit(NegateNode node);
    public abstract T visit(NotEqualNode node);
    public abstract T visit(ReturnNode node);
    public abstract T visit(SimpleExpressionNode node);
    public abstract T visit(StatementNode node);
    public abstract T visit(SubtractNode node);
    public abstract T visit(WhileStmNode node);
}
