import java.util.Hashtable;

public class TypeCheckVisitor extends ASTVisitor<GraphNode>{

    @Override
    public GraphNode visit(AddNode node) {
        System.out.println("Hello");
        return node;
    }

    @Override
    public GraphNode visit(AssignmentNode node) { return null;}

    @Override
    public GraphNode visit(BinaryOperatorNode node) {
        return node;
    }

    @Override
    public GraphNode visit(BlockNode node) {
        System.out.println("Block");
        for (GraphNode n: node.childrenList
             ) {
            if (n != null) {
                System.out.println("Child in block");
                if (n instanceof  AssignmentNode) {
                    System.out.println("assignment");
                    return n;
                } else if (n instanceof DeclarationNode) {
                    System.out.println("Declaration node returning");
                    ((DeclarationNode) n).ID = "22";
                    return n;
                }
            }
        }
        return node;
    }

    @Override
    public GraphNode visit(CreateNode node) {
        return node;
    }

    @Override
    public GraphNode visit(DeclarationNode node) {
        node.ID = node.ID; // NOPE
        return node;
    }

    @Override
    public GraphNode visit(DivideNode node) {
        return node;
    }

    @Override
    public GraphNode visit(EqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(ExpressionNode node) {
        System.out.println("Exp");
        return node;
    }

    @Override
    public GraphNode visit(If_Then_ElseNode node) {
        return node;
    }

    @Override
    public GraphNode visit(LessOrEqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(LessThanNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MethodNode node) {
        System.out.println("Yeah");
        return node;
    }

    @Override
    public GraphNode visit(MoreOrEqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MoreThanNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MultiplyNode node) {
        return node;
    }

    @Override
    public GraphNode visit(NegateNode node) {
        return node;
    }

    @Override
    public GraphNode visit(NotEqualNode node) {
        return node;
    }

    @Override
    public GraphNode visit(ReturnNode node) {
        return node;
    }

    @Override
    public GraphNode visit(SimpleExpressionNode node) {
        System.out.println(node.getClass().getSimpleName());
        try {
            int test = Integer.parseInt(node.value);
        } catch (Exception e) {
            System.out.println("Not an integer");
        }
        return node;
    }

    @Override
    public GraphNode visit(StatementNode node) {
        return node;
    }

    @Override
    public GraphNode visit(SubtractNode node) {
        return node;
    }

    @Override
    public GraphNode visit(WhileStmNode node) {
        return node;
    }
}
