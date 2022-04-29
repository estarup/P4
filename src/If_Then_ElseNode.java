public class If_Then_ElseNode extends StatementNode {
    BinaryOperatorNode condition; // ConditionNode?
    String condition_bool;
    BlockNode if_body;
    BlockNode else_body;
}
