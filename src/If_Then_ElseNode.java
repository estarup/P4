public class If_Then_ElseNode extends StatementNode {
    BinaryOperatorNode condition; // ConditionNode?
    BlockNode if_body;
    BlockNode else_body = null;
}
