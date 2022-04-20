public class If_Then_ElseNode extends StatementNode {
    BinaryOperatorNode condition; // ConditionNode?
    BlockNode if_part;
    BlockNode else_part = null;
}
