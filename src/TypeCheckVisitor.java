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
    public GraphNode visit(BinaryOperatorNode node) {
        return node;
    }

    @Override
    public GraphNode visit(BlockNode node) {
        //BlockNode body = (BlockNode) visitChildren(node);
        if (node == null) { return null; }
        for (GraphNode n: node.childrenList) {
            if (n != null) {
                if (n instanceof AssignmentNode) {
                    visit((AssignmentNode) n);
                } else if (n instanceof BinaryOperatorNode) {
                    if (n instanceof AddNode) {
                        visit((AddNode) n);
                    } else if (n instanceof DivideNode) {
                        visit((DivideNode) n);
                    } else if (n instanceof SubtractNode) {
                        visit((SubtractNode) n);
                    } else if (n instanceof MultiplyNode) {
                        visit((MultiplyNode) n);
                    } else if (n instanceof EqualNode) {
                        visit((EqualNode) n);
                    } else if (n instanceof NotEqualNode) {
                        visit((NotEqualNode) n);
                    } else if (n instanceof LessOrEqualNode) {
                        visit((LessOrEqualNode) n);
                    } else if (n instanceof MoreOrEqualNode) {
                        visit((MoreOrEqualNode) n);
                    } else if (n instanceof LessThanNode) {
                        visit((LessThanNode) n);
                    } else if (n instanceof MoreThanNode) {
                        visit((MoreThanNode) n);
                    }
                } else if (n instanceof CreateNode) {
                    visit((CreateNode) n);
                } else if (n instanceof DeclarationNode) {
                    visit((DeclarationNode) n);
                } else if (n instanceof ExpressionNode) {
                    visit((ExpressionNode) n);
                } else if (n instanceof If_Then_ElseNode) {
                    visit((If_Then_ElseNode) n);
                } else if (n instanceof MethodNode) {
                    visit((MethodNode) n);
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
        try {
            int test = Integer.parseInt(node.value);
        } catch (Exception e) {
            System.out.println("Error: SimpleExpression is not an integer");
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
