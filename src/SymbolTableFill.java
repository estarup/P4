public class SymbolTableFill extends ASTVisitor<GraphNode>{
    @Override
    public GraphNode visit(AddNode node) {
        return node;
    }


    @Override
    public GraphNode visit(AssignmentNode node)  {
        if (GraphNode.SymbolTable.get(node.ID) == null) {
            System.out.println("Error: Variable not declared");
        }
        return node;
    }


    @Override
    public GraphNode visit(BinaryOperatorNode n) {

        return n;
    }

    @Override
    public GraphNode visit(BlockNode node) {
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
    public GraphNode visit(DeclarationNode node) {
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
        visit(node.declaration);
        visit(node.parameter);
        visit(node.body);
        return node;
    }

    @Override
    public GraphNode visit(MethodDeclarationNode node) {
        if (GraphNode.SymbolTable.get(node.name) != null) {
            System.out.println("Error: Method  with name " + node.name + "already declared");
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
    public GraphNode visit(SubtractNode node) {
        return node;
    }

    @Override
    public GraphNode visit(WhileStmNode node) {
        return node;
    }
}
