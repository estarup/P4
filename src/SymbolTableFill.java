public class SymbolTableFill extends ASTVisitor{
    @Override
    public AddNode visit(AddNode node) {
        return node;
    }


    @Override
    public AssignmentNode visit(AssignmentNode node)  {
        if (GraphNode.SymbolTable.get(node.ID) == null) {
            System.out.println("Error: Variable not declared");
        }
        if (node.Value instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) node.Value);
        }
        return node;
    }

    @Override
    public BinaryOperatorNode visit(BinaryOperatorNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            try {
                int number = Integer.parseInt(((SimpleExpressionNode) n.left).value);
                float floatNumber = Float.parseFloat(((SimpleExpressionNode) n.left).value);
            } catch (Exception e) {
                System.out.println("Error: Value is not a number");
            }
            if (GraphNode.SymbolTable.get(((SimpleExpressionNode) n.left)) == null) {
                System.out.println("Error: Left variable has not been declared");
            }
        }
        if (n.left instanceof SimpleExpressionNode) {
            System.out.println("simple 2");
        }
        return n;
    }

    @Override
    public BlockNode visit(BlockNode node) {
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
                } else if (n instanceof AddNode) {
                    visit((AddNode) n);
                }
            }
        }
        return node;
    }

    @Override
    public CreateNode visit(CreateNode node) {
        if (GraphNode.SymbolTable.get(node.ID) != null) {
            System.out.println("Error : Create ID already declared");
        }
        if (GraphNode.SymbolTable.get(node.ID) == null) {
            if (node.type.equals("Car")) {
                GraphNode.SymbolTable.put(node.ID, node.CARTYPE);
            } else if (node.type.equals("CarSpawner")) {
                GraphNode.SymbolTable.put(node.ID, node.CARSPAWNERTYPE);
            } else if (node.type.equals("Grid")) {
                GraphNode.SymbolTable.put(node.ID, node.GRIDTYPE);
            } else if (node.type.equals("TrafficLight")) {
                GraphNode.SymbolTable.put(node.ID, node.TRAFFICLIGHTTYPE);
            }
        }
        visit(node.body);
        return node;
    }

    @Override
    public DeclarationNode visit(DeclarationNode node) {
        if (node.type == null) {
            return node;
        }
        try {
            if (GraphNode.SymbolTable.get(node.ID) == null) {
                if (node.type.equals("int")) {
                    GraphNode.SymbolTable.put(node.ID, node.INTTYPE);
                } else if (node.type.equals("float")) {
                    GraphNode.SymbolTable.put(node.ID, node.FLTTYPE);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Error: Variable already declared " + e.getMessage());
        }
        return node;
    }

    @Override
    public DivideNode visit(DivideNode node) {
        return node;
    }

    @Override
    public EqualNode visit(EqualNode node) {
        return node;
    }

    @Override
    public ExpressionNode visit(ExpressionNode node) {
        System.out.println("EXpres");
        return node;
    }

    @Override
    public If_Then_ElseNode visit(If_Then_ElseNode node) {
        return node;
    }

    @Override
    public LessOrEqualNode visit(LessOrEqualNode node) {
        return node;
    }

    @Override
    public LessThanNode visit(LessThanNode node) {
        return node;
    }

    @Override
    public MethodNode visit(MethodNode node) {
        visit(node.declaration);
        visit(node.parameter);
        visit(node.body);
        return node;
    }

    @Override
    public MethodDeclarationNode visit(MethodDeclarationNode node) {
        if (GraphNode.SymbolTable.get(node.name) != null) {
            System.out.println("Error: Method  with name " + node.name + "already declared");
        }
        return node;
    }

    @Override
    public MoreOrEqualNode visit(MoreOrEqualNode node) {
        return node;
    }

    @Override
    public MoreThanNode visit(MoreThanNode node) {
        return node;
    }

    @Override
    public MultiplyNode visit(MultiplyNode node) {
        return node;
    }

    @Override
    public NegateNode visit(NegateNode node) {
        return node;
    }

    @Override
    public NotEqualNode visit(NotEqualNode node) {
        return node;
    }

    @Override
    public ReturnNode visit(ReturnNode node) {
        return node;
    }

    @Override
    public SimpleExpressionNode visit(SimpleExpressionNode node) {
        System.out.println("Simple");
        return node;
    }

    @Override
    public StatementNode visit(StatementNode node) {
        return node;
    }

    @Override
    public SubtractNode visit(SubtractNode node) {
        return node;
    }

    @Override
    public WhileStmNode visit(WhileStmNode node) {
        return node;
    }
}
