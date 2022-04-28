import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.io.IOException;

public class AntlrParser
{
    public static void main(String args[]) throws IOException
    {
        try {
            CharStream charStream = CharStreams.fromFileName("./input.txt");
            HelloLexer lexer = new HelloLexer(charStream);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            HelloParser parser = new HelloParser(commonTokenStream);
            ParseTree parseTree = parser.trafficProg();
            Trees.inspect(parseTree,parser);
            ParseTreeVisitor visitor = new BuildASTVisitor();
            BlockNode astNode = (BlockNode)  new BuildASTVisitor().visit(parseTree);
            ASTVisitor symbolTableVisitor = new SymbolTableFillVisitor();
            BlockNode symbolResult = (BlockNode) symbolTableVisitor.visit(astNode);
            ASTVisitor typeVisitor = new TypeCheckVisitor();
            BlockNode typeResult = (BlockNode) typeVisitor.visit(symbolResult);
            ASTVisitor codeGeneratorVisitor = new CodeGeneratorVisitor();
            BlockNode codeResult = (BlockNode) codeGeneratorVisitor.visit(typeResult);
            double x = 1.0;
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getLocalizedMessage());
        }

    }
}
