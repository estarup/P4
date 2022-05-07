import static java.lang.Integer.parseInt;
public class BuildASTVisitor extends HelloBaseVisitor<GraphNode>
{
    private GraphNode theTopNode = new BlockNode();
    @Override public GraphNode visitTrafficProg(HelloParser.TrafficProgContext ctx) {
        GraphNode result =  visitChildren(ctx);
        if (result instanceof BlockNode) {
            theTopNode = result;
        } else {
            BlockNode block = new BlockNode();
            block.childrenList.add(result);
            return block;
        }
        return result;
    }



    @Override
    public GraphNode visitMethod_init(HelloParser.Method_initContext ctx) {
        MethodInitNode node = new MethodInitNode();
        if (ctx.children.get(0).getChildCount() > 0) {
            node.declaration = (MethodDeclarationNode) visitMethod_declaration(ctx.method_declaration());
        }
        if (ctx.children.get(1).getChildCount() > 0) {
            node.parameter =  (DeclarationNode) visitMethod_parameter_init(ctx.method_parameter_init());
        }
        if (ctx.children.get(2).getChildCount() > 2) {
            BlockNode block = new BlockNode();
            block.childrenList.add(visitChildren(ctx.curl_statement()));
            node.body = block;
        }
        return node;
    }

    @Override
    public GraphNode visitMethod_call(HelloParser.Method_callContext ctx) {
        MethodCallNode node = new MethodCallNode();
        node.ID = ctx.children.get(0).getText();
        if (ctx.children.get(1).getChildCount() > 2 ) {
            node.parameter = ctx.children.get(1).getChild(1).getText();
        }
        return node;
    }

    @Override
    public GraphNode visitMethod_declaration(HelloParser.Method_declarationContext ctx) {
        MethodDeclarationNode node = new MethodDeclarationNode();
        node.returnType = ctx.children.get(0).getText();
        node.name = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public DeclarationNode visitDeclaration(HelloParser.DeclarationContext ctx) {
        DeclarationNode node = new DeclarationNode();
        if (ctx.children == null) {
            System.out.println("null");
            return node;
        }
        if (ctx.children.get(0).getText().equals("int")) {
            node.type =  GraphNode.INTTYPE;
        } else if (ctx.children.get(0).getText().equals("double")) {
            node.type = GraphNode.DBLTYPE;
        }
        node.ID = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public GraphNode visitAssignment(HelloParser.AssignmentContext ctx) {
        AssignmentNode node = new AssignmentNode();
        node.ID = ctx.children.get(0).getText();
        boolean isExp = false;
        try {
            node.value = visitExpression(ctx.expression());
            isExp = true;
        } catch (NullPointerException n) {
            isExp = false;
            //System.out.println("Error: Not an expression, must be a string");
        }
        if (!isExp) {
            StringNode stringNode = new StringNode();
            stringNode.string = ctx.children.get(2).getText();
            node.value = stringNode;
        }
        return node;
    }

    @Override
    public GraphNode visitConstructor(HelloParser.ConstructorContext ctx) {
        ConstructorNode node = new ConstructorNode();

        if (ctx.getChildCount() == 11) {
            System.out.println("I am a carspawner constructor");
            node.x = Integer.parseInt(ctx.children.get(1).getText());
            node.y = Integer.parseInt(ctx.children.get(3).getText());
            node.direction = ctx.children.get(5).getText();
            node.frequency = Integer.parseInt(ctx.children.get(7).getText());
            node.name = ctx.children.get(9).getText();
        } else {

        }

        return node;
    }

    @Override
    public GraphNode visitIf_statement(HelloParser.If_statementContext ctx) {
        If_Then_ElseNode node = new If_Then_ElseNode();
        if (visitCondition(ctx.logic_expression().condition()) != null) {
            node.condition = (BinaryOperatorNode) visitCondition(ctx.logic_expression().condition());
        } else {
            node.condition_bool = ctx.children.get(1).getChild(1).getText();
        }
        try {
            BlockNode ifBlock = new BlockNode();
            ifBlock.childrenList.add(visitCurl_statement(ctx.curl_statement()));
            node.if_body = ifBlock;
        } catch (NullPointerException n) {
            //System.out.println("If block is empty");
        }
        try {
            BlockNode elseBlock = new BlockNode();
            elseBlock.childrenList.add(visitChildren(ctx.else_statement()));
            node.else_body = elseBlock;
        } catch (NullPointerException n) {
            //System.out.println("Else block is empty");
        }

        return node;
    }

    @Override
    public GraphNode visitWhile_loop(HelloParser.While_loopContext ctx) {
        WhileStmNode node = new WhileStmNode();

        if (visitCondition(ctx.logic_expression().condition()) != null) {
            node.condition = (BinaryOperatorNode) visitCondition(ctx.logic_expression().condition());
        } else {
            node.condition_bool = ctx.children.get(1).getChild(1).getText();
        }
        try {
            BlockNode block = new BlockNode();
            block.childrenList.add(visitChildren(ctx.curl_statement()));
            node.body = block;
        } catch (NullPointerException n) {
            //System.out.println("Error: No while body ");
        }
        return node;
    }

    @Override
    public GraphNode visitCreate_statement(HelloParser.Create_statementContext ctx) {
        CreateNode node = new CreateNode();

        switch (ctx.children.get(1).getText()) {
            case "Car":
                node.type = GraphNode.CARTYPE;
                break;
            case "CarSpawner":
                node.type = GraphNode.CARSPAWNERTYPE;
                break;
            case "Grid":
                node.type = GraphNode.GRIDTYPE;
                break;
            case "TrafficLight":
                node.type = GraphNode.TRAFFICLIGHTTYPE;
                break;
            default: System.out.println("Error: No type matches " + node.ID);
        }
        node.ID = ctx.children.get(2).getText();
       // node.direction = ctx.children.get(3).getText();'

        node.constructer = (ConstructorNode) visitConstructor(ctx.constructor());

        try {
            BlockNode body = new BlockNode();
            body.childrenList.add(visitCurl_statement(ctx.curl_statement()));
            node.body = body;
        } catch (NullPointerException n) {
            System.out.println("Body block is empty");
        }
        return  node;
    }



    @Override
    public GraphNode visitReturn_statement(HelloParser.Return_statementContext ctx) {
        ReturnNode node = new ReturnNode();
        node.ID = ctx.children.get(1).getText();
        return node;
    }

    @Override
    public GraphNode visitMethod_parameter_call(HelloParser.Method_parameter_callContext ctx) {
        MethodCallNode node = new MethodCallNode();
        if (ctx.getChildCount() > 2) {
            node.parameter = ctx.getChild(1).getText();
        }
        return node;
    }

    @Override
    public GraphNode visitMethod_parameter_init(HelloParser.Method_parameter_initContext ctx) {
        DeclarationNode node = new DeclarationNode();
        if (ctx.getChildCount() > 2) {
            node = visitDeclaration(ctx.declaration());
        }
        return node;
    }

    @Override
    public GraphNode visitFactor(HelloParser.FactorContext ctx) {
        if (ctx.getChildCount() > 1) {
            return visitExpression(ctx.expression());
        }
        SimpleExpressionNode factor = new SimpleExpressionNode();
        factor.value =  ctx.getText();
        return factor;
    }

    @Override
    public GraphNode visitEqual_condition(HelloParser.Equal_conditionContext ctx) {
        EqualNode node = new EqualNode();
        node.left =  visitExpression(ctx.expression());
        node.right = visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitNot_equal_condition(HelloParser.Not_equal_conditionContext ctx) {
        NotEqualNode node = new NotEqualNode();
        node.left =  visitExpression(ctx.expression());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitLess_or_equal_condition(HelloParser.Less_or_equal_conditionContext ctx) {
        LessOrEqualNode node = new LessOrEqualNode();
        node.left =  visitExpression(ctx.expression());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitMore_or_equal_condition(HelloParser.More_or_equal_conditionContext ctx) {
        MoreOrEqualNode node = new MoreOrEqualNode();
        node.left =  visitExpression(ctx.expression());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitMore_than_condition(HelloParser.More_than_conditionContext ctx) {
        MoreThanNode node = new MoreThanNode();
        node.left =  visitExpression(ctx.expression());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitLess_than_condition(HelloParser.Less_than_conditionContext ctx) {
        LessThanNode node = new LessThanNode();
        node.left =  visitExpression(ctx.expression());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitAdd_expression(HelloParser.Add_expressionContext ctx) {
        AddNode node = new AddNode();
        node.left =  visitTerm(ctx.term());
        node.right =  visitExpression(ctx.expression());
        return node;
    }

    @Override
    public GraphNode visitTerm(HelloParser.TermContext ctx) {
        return super.visitTerm(ctx);
    }

    @Override
    public GraphNode visitSubtract_expression(HelloParser.Subtract_expressionContext ctx) {
        SubtractNode node = new SubtractNode();
        node.left =  visitTerm(ctx.term());
        node.right = visitExpression(ctx.expression());
        return node;
    }
    @Override
    public GraphNode visitMultiply_term(HelloParser.Multiply_termContext ctx) {
        MultiplyNode node = new MultiplyNode();
        node.left =  visitFactor(ctx.factor());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    public GraphNode visitDivide_term(HelloParser.Divide_termContext ctx) {
        DivideNode node = new DivideNode();
        node.left =  visitFactor(ctx.factor());
        node.right =  visitTerm(ctx.term());
        return node;
    }

    @Override
    protected GraphNode aggregateResult(GraphNode aggregate, GraphNode nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        if (! (aggregate instanceof BlockNode)) {
            BlockNode block = new BlockNode();
            block.childrenList.add((GraphNode) aggregate);
            aggregate = block;
        }
        if (aggregate instanceof BlockNode) {
            BlockNode block = (BlockNode) aggregate;
            block.childrenList.add(nextResult);
            return block;
        }
        return nextResult;
    }
}
