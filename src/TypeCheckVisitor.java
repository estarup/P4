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
        if (node.value instanceof StringNode) {
            visit((StringNode) node.value);
            return node;
        }
        if(! (node.value instanceof SimpleExpressionNode)) {
            visit((BinaryOperatorNode) node.value);
        }
        if (node.value instanceof SimpleExpressionNode){
            if (assignType != ((SimpleExpressionNode) node.value).type) {
                System.out.println("Error: Assign type error. Cannot assign " + node.ID + " to " + ((SimpleExpressionNode) node.value).value );
            }
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
                }  else if (n instanceof MethodInitNode) {
                    visit((MethodInitNode) n);
                } else if (n instanceof MethodCallNode) {
                    visit((MethodCallNode) n);
                }  else if (n instanceof BlockNode) {
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


    private boolean checkInt(String s) {
        try {
            int intNumber = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            //System.out.println("Error: Could not parse variable " + s +"  to int");
        }
        return false;
    }

    private boolean checkFloat(String s) {
        try {
            double doubleNumber = Double.parseDouble(s);
            return true;
        } catch (Exception e2) {
            //System.out.println("Error: Could not parse variable " + s +"  to double");
        }
        return false;
    }
    @Override
    public GraphNode visit(MethodCallNode node) {
        if (checkInt(node.parameter) || checkFloat(node.parameter)) {
            return node;
        }
        if (GraphNode.SymbolTable.get(node.parameter) == null) {
            System.out.println("Error: Variable " + node.parameter + "has not been declared ");
        }
        return node;
    }

    @Override
    public GraphNode visit(MethodInitNode node) {
        return node;
    }

    @Override
    public GraphNode visit(MethodDeclarationNode node) {
        if (GraphNode.SymbolTable.get(node.name) != null) {
            System.out.println("Error: Method already declared");
        } else {
            GraphNode.SymbolTable.put(node.name, 6);
        }
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
        return node;
    }

    @Override
    public GraphNode visit(StatementNode node) {
        return node;
    }

    @Override
    public GraphNode visit(StringNode node) {
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
