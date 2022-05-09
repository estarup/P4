import Simulation.Program;
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
            BlockNode astNode =  (BlockNode) new BuildASTVisitor().visit(parseTree);
            BlockNode symbolResult = new SymbolTableFillVisitor().visit(astNode);
            BlockNode typeResult = new TypeCheckVisitor().visit(symbolResult);
            CodeGeneratorVisitor codeGeneratorVisitor = new CodeGeneratorVisitor();
            codeGeneratorVisitor.visit(symbolResult);

            Program program = new Program();
            program.Run();

            double x = 1.0;
        }
        catch (IOException e) {
            System.out.println("IOException: " + e.getLocalizedMessage());
        }

    }
}
