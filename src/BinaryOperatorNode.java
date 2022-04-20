public abstract class BinaryOperatorNode extends ExpressionNode {
    abstract String getOperatorCharacter();
    GraphNode left;
    GraphNode right;
}
