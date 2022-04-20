public abstract class ASTVisitor<T>
{
    public abstract T Visit(AddNode node);
    public abstract T Visit(AssignmentNode node);
    public abstract T Visit(BinaryOperatorNode node);
    public abstract T Visit(BlockNode node);
    public abstract T Visit(CreateNode node);
    public abstract T Visit(DeclarationNode node);
    public abstract T Visit(DivideNode node);
    public abstract T Visit(EqualNode node);
    public abstract T Visit(ExpressionNode node);
    public abstract T Visit(If_Then_ElseNode node);
    public abstract T Visit(LessOrEqualNode node);
    public abstract T Visit(LessThanNode node);
    public abstract T Visit(MethodNode node);
    public abstract T Visit(MoreOrEqualNode node);
    public abstract T Visit(MoreThanNode node);
    public abstract T Visit(MultiplyNode node);
    public abstract T Visit(NegativeNode node);
    public abstract T Visit(NotEqualNode node);
    public abstract T Visit(ReturnNode node);
    public abstract T Visit(SimpleExpressionNode node);
    public abstract T Visit(StatementNode node);
    public abstract T Visit(SubtractNode node);
    public abstract T Visit(WhileStmNode node);
}
