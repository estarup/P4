public class CodeGeneratorVisitor extends ASTVisitor<GraphNode>{

    String code = "";
    public void addCode(String c){
        code = code + c;
    }

    @Override
    public GraphNode visit(AddNode node) {
        return node;
    }

    @Override
    public GraphNode visit(AssignmentNode node) {
        addCode(node.ID);
        addCode(" = ");
        if (node.value instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) node.value);
        } else if (node.value instanceof SimpleExpressionNode){
            visit((SimpleExpressionNode) node.value);
        }
        addCode("; ");
        System.out.println(code);
        return node;
    }



    @Override
    public BinaryOperatorNode visit(BinaryOperatorNode n) {
         if (n instanceof MultiplyNode) {
             visit((MultiplyNode) n);
             return n;
         } else if (n instanceof DivideNode) {
             visit((DivideNode) n);
             return n;
         }
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
            addCode(n.getOperatorCharacter());
        } else {
            visit((BinaryOperatorNode) n.left);
        }
        if (n.right instanceof SimpleExpressionNode) {
            addCode(n.getOperatorCharacter());

            visit((SimpleExpressionNode) n.right);
        } else {
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
                } else if (n instanceof MultiplyNode) {
                    visit((MultiplyNode) n);
                } else if (n instanceof DivideNode) {
                    visit((DivideNode) n);
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
        if (node.type == GraphNode.DBLTYPE) {
            addCode("double ");
        } else if (node.type == GraphNode.INTTYPE) {
            addCode("int ");
        }
        addCode(node.ID);
        addCode(";");
        return node;
    }

    @Override
    public GraphNode visit(DivideNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
            addCode(n.getOperatorCharacter());
        } else {
            evaluateExpression((BinaryOperatorNode) n.left);
            addCode(n.getOperatorCharacter());
        }
        if (n.right instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.right);
        } else  {
            evaluateExpression((BinaryOperatorNode) n.right);
        }
        return n;
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

    private void evaluateExpression(BinaryOperatorNode n) {
        if (n instanceof AddNode || n instanceof SubtractNode) {
            addCode("(");
            visit((BinaryOperatorNode) n);
            addCode(")");
        }
        else {
            visit(n);
        }
    }
    @Override
    public GraphNode visit(MultiplyNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
            addCode(n.getOperatorCharacter());
        } else {
            evaluateExpression((BinaryOperatorNode) n.left);
            addCode(n.getOperatorCharacter());
        }
        if (n.right instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.right);
        } else  {
            evaluateExpression((BinaryOperatorNode) n.right);
        }
        return n;
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
        addCode(node.value);
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
