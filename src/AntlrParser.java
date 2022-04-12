import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

public class AntlrParser
{
    public static void main(String args[]) throws IOException
    {
        CharStream charStream = CharStreams.fromFileName("./input.txt");
        HelloLexer lexer = new HelloLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(commonTokenStream);
        ParseTree parseTree = parser.trafficProg();
        ParseTreeVisitor visitor = new ConcreteTreeVisitor();
        visitor.visit(parseTree);

        //System.out.println("Done");
        //Trees.inspect(parseTree, parser);
    }
}
