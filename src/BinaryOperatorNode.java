public abstract class BinaryOperatorNode extends ExpressionNode {
    abstract String getOperatorCharacter();

    ExpressionNode left;
    ExpressionNode right;
}
