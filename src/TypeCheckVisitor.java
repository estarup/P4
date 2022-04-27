import org.antlr.v4.runtime.tree.RuleNode;

import java.util.concurrent.ExecutionException;

public class TypeCheckVisitor extends ASTVisitor<GraphNode>{
    private int assignType = -1;
    @Override
    public GraphNode visit(AddNode node) {
        return node;
    }

    @Override
    public AssignmentNode visit(AssignmentNode node)  {
        assignType = -1;
        try {
            assignType = GraphNode.SymbolTable.get(node.ID);
        } catch (NullPointerException e) {
            //System.out.println("Error: Variable " + node.ID + " has not been declared");
        }
        if(! (node.value instanceof SimpleExpressionNode)) {
            visit((BinaryOperatorNode) node.value);
        }
        return node;
    }

    @Override
    public BinaryOperatorNode visit(BinaryOperatorNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            if (((SimpleExpressionNode) n.left).type != assignType) {
                System.out.println("Error: " + ((SimpleExpressionNode) n.left).value + " is not of type " + assignType);
            }
        } else {
            visit((BinaryOperatorNode) n.left);
        }
        if (n.right instanceof SimpleExpressionNode) {
            if (((SimpleExpressionNode) n.right).type != assignType) {
                System.out.println("Error: " + ((SimpleExpressionNode) n.right).value + " is not of type " + assignType);
            }
        }
        else {
            visit((BinaryOperatorNode) n.right);
        }
        return n;
    }

    @Override
    public BlockNode visit(BlockNode node) {
        for (GraphNode n: node.childrenList) {
            if (n != null) {
                if (n instanceof AssignmentNode) {
                    visit((AssignmentNode) n);
                } else if (n instanceof SimpleExpressionNode) {
                    visit((SimpleExpressionNode) n);
                } else if (n instanceof BinaryOperatorNode) {
                    visit((BinaryOperatorNode) n);
                } else if (n instanceof CreateNode) {
                    visit((CreateNode) n);
                } else if (n instanceof DeclarationNode) {
                    visit((DeclarationNode) n);
                }  else if (n instanceof MethodNode) {
                    visit((MethodNode) n);
                } else if (n instanceof BlockNode) {
                    visit((BlockNode) n);
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
        return node;
    }

    @Override
    public GraphNode visit(MethodDeclarationNode node) {
        return null;
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
