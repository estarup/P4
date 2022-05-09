import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;

class BuildASTVisitorTest extends ASTVisitor {

    @org.junit.jupiter.api.Test
    void visitTrafficProg() {
        try {
            CharStream charStream = CharStreams.fromFileName("./input.txt");
            HelloLexer lexer = new HelloLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            HelloParser parser = new HelloParser(commonTokenStream);
            ParseTree parseTree = parser.trafficProg();
            Trees.inspect(parseTree,parser);
            ParseTreeVisitor visitor = new BuildASTVisitor();
            BlockNode astNode =  (BlockNode) new BuildASTVisitor().visit(parseTree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @org.junit.jupiter.api.Test
    void visitCreate_statement() {
    }

    @org.junit.jupiter.api.Test
    @Override
    public Object visit(AddNode node) {
        return null;
    }

    @Override
    public Object visit(AssignmentNode node) {
        return null;
    }

    @Override
    public Object visit(BinaryOperatorNode node) {
        return null;
    }

    @Override
    public Object visit(BlockNode node) {
        return null;
    }

    @Override
    public Object visit(CreateNode node) {
        return null;
    }

    @Override
    public Object visit(DeclarationNode node) {
        return null;
    }

    @Override
    public Object visit(DivideNode node) {
        return null;
    }

    @Override
    public Object visit(EqualNode node) {
        return null;
    }

    @Override
    public Object visit(ExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(If_Then_ElseNode node) {
        return null;
    }

    @Override
    public Object visit(LessOrEqualNode node) {
        return null;
    }

    @Override
    public Object visit(LessThanNode node) {
        return null;
    }

    @Override
    public Object visit(MethodCallNode node) {
        return null;
    }

    @Override
    public Object visit(MethodInitNode node) {
        return null;
    }

    @Override
    public Object visit(MethodDeclarationNode node) {
        return null;
    }

    @Override
    public Object visit(MoreOrEqualNode node) {
        return null;
    }

    @Override
    public Object visit(MoreThanNode node) {
        return null;
    }

    @Override
    public Object visit(MultiplyNode node) {
        return null;
    }

    @Override
    public Object visit(NegateNode node) {
        return null;
    }

    @Override
    public Object visit(NotEqualNode node) {
        return null;
    }

    @Override
    public Object visit(ReturnNode node) {
        return null;
    }

    @Override
    public Object visit(SimpleExpressionNode node) {
        return null;
    }

    @Override
    public Object visit(StatementNode node) {
        return null;
    }

    @Override
    public Object visit(StringNode node) {
        return null;
    }

    @Override
    public Object visit(SubtractNode node) {
        return null;
    }

    @Override
    public Object visit(WhileStmNode node) {
        return null;
    }
}