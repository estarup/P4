public class SymbolTableFillVisitor extends ASTVisitor{
    @Override
    public AddNode visit(AddNode node) {
        return node;
    }

    @Override
    public AssignmentNode visit(AssignmentNode node)  {
        if (GraphNode.SymbolTable.get(node.ID) == null) {
            System.out.println("Error: Variable " + node.ID + " not declared");
            return node;
        }
        if (node.value instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) node.value);
        } else if (node.value instanceof SimpleExpressionNode){
            visit((SimpleExpressionNode)node.value);
        }
        return node;
    }


    @Override
    public BinaryOperatorNode visit(BinaryOperatorNode n) {
        if (n.left instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.left);
        } else if (n.left instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) n.left);
        }
        if (n.right instanceof SimpleExpressionNode) {
            visit((SimpleExpressionNode) n.right);
        } else if (n.right instanceof BinaryOperatorNode) {
            visit((BinaryOperatorNode) n.right);
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
                }  else if (n instanceof MethodInitNode) {
                    visit((MethodInitNode) n);
                } else if (n instanceof BlockNode) {
                    visit((BlockNode) n);
                }
            }
        }
        return node;
    }

    @Override
    public CreateNode visit(CreateNode node) {
        if (GraphNode.SymbolTable.get(node.ID) != null) {
            System.out.println("Error : Create ID already declared");
            return node;
        }
        GraphNode.SymbolTable.put(node.ID, node.type);
        return node;
    }

    @Override
    public DeclarationNode visit(DeclarationNode node)  {
        try {
            GraphNode.SymbolTable.get(node.ID);
        } catch (NullPointerException e) {
            //System.out.println("Exception: Variable has not been declared");
            return node;
        }
        GraphNode.SymbolTable.put(node.ID, node.type);
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
        return node;
    }

    @Override
    public If_Then_ElseNode visit(If_Then_ElseNode node) {
        visit(node.condition);
        visit(node.if_body);
        visit(node.else_body);
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
    public Object visit(MethodCallNode node) {
        if (GraphNode.SymbolTable.get(node.ID) == null) {
            System.out.println("Error: Call to not defined method: " + node.ID);
            return node;
        }
        return node;
    }

    @Override
    public MethodInitNode visit(MethodInitNode node) {
        visit(node.declaration);
        visit(node.parameter);
        visit(node.body);
        return node;
    }

    @Override
    public MethodDeclarationNode visit(MethodDeclarationNode node) {
        if (GraphNode.SymbolTable.get(node.name) != null) {
            System.out.println("Error: Method  with name " + node.name + " already declared");
        } else {
            GraphNode.SymbolTable.put(node.name, 6);
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

    private boolean checkFloat(String s) {
        try {
            double doubleNumber = Double.parseDouble(s);
            return true;
        } catch (Exception e2) {
            //System.out.println("Error: Could not parse variable " + s +"  to double");
        }
        return false;
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

    private boolean isADeclaredVariable(String s) {
        try {
            int x = GraphNode.SymbolTable.get(s);
            return true;
        } catch (NullPointerException e) {
            System.out.println("Error: Variable " + s + " has not been declared");
            return false;
        }
    }


    @Override
    public SimpleExpressionNode visit(SimpleExpressionNode node) {
        if (checkInt(node.value)) {
            node.type = GraphNode.INTTYPE;
        }
        else if (checkFloat(node.value)) {
            node.type = GraphNode.DBLTYPE;
        }
        else if (isADeclaredVariable(node.value)) {
            node.type = GraphNode.SymbolTable.get(node.value);
        }
        return node;
    }

    @Override
    public StatementNode visit(StatementNode node) {
        return node;
    }

    @Override
    public Object visit(StringNode node) {
        return node;
    }

    @Override
    public SubtractNode visit(SubtractNode node) {
        return node;
    }

    @Override
    public Object visit(PrintNode node) {
        return node;
    }

    @Override
    public WhileStmNode visit(WhileStmNode node) {
        return node;
    }
}
