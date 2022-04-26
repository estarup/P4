import org.antlr.v4.runtime.tree.RuleNode;

import java.util.concurrent.ExecutionException;

public class TypeCheckVisitor extends ASTVisitor<GraphNode>{
    @Override
    public GraphNode visit(AddNode node) {
        return node;
    }


    @Override
    public GraphNode visit(AssignmentNode node)  {
        return node;
    }

    @Override
    public BinaryOperatorNode visit(BinaryOperatorNode n) {
        int leftType = -1;
        int rightType = -2;
        if (n.left instanceof SimpleExpressionNode) {
            // Return if int or float
            try {
                int number = Integer.parseInt(((SimpleExpressionNode) n.left).value);
                leftType = GraphNode.INTTYPE;
            } catch (Exception e) {
                try {
                    float floatNumber = Float.parseFloat(((SimpleExpressionNode) n.left).value);
                    leftType = GraphNode.FLTTYPE;
                } catch (Exception e2) {
                    leftType = GraphNode.SymbolTable.get(((SimpleExpressionNode) n.left).value);
                    }
                }
            } else if (n.left instanceof BinaryOperatorNode) {
                visit((BinaryOperatorNode) n.left);
            }
            if (n.right instanceof SimpleExpressionNode) {
                // Return if int or float
                try {
                    int number = Integer.parseInt(((SimpleExpressionNode) n.right).value);
                    rightType = GraphNode.INTTYPE;
                } catch (Exception e) {
                    try {
                        //System.out.println("Error: Right variable not an integer");
                        float floatNumber = Float.parseFloat(((SimpleExpressionNode) n.right).value);
                        rightType = GraphNode.FLTTYPE;
                    } catch (Exception e2) {
                        rightType = GraphNode.SymbolTable.get(((SimpleExpressionNode) n.right).value);
                    }
                }
        } else if (n.right instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) n.right);
        }
        if (leftType != rightType) {
            System.out.println("Error: Type mismatch");
        }
        return n;
    }

    @Override
    public BlockNode visit(BlockNode node) {
        if (node == null ){ return null; }
        for (GraphNode n: node.childrenList) {
            if (n != null) {
                if (n instanceof AssignmentNode) {
                    visit((AssignmentNode) n);
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
