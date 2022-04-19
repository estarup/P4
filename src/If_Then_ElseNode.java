public class If_Then_ElseNode extends StatementNode {
    ExpressionNode condition; // ConditionNode? 
    BlockNode if_part;
    BlockNode else_part = null;
}
