import org.antlr.v4.gui.Trees;
import org.antlr.v4.misc.Graph;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.util.Locale;

public class AntlrParser
{
    public static void main(String args[]) throws IOException
    {
        CharStream charStream = CharStreams.fromFileName("./input.txt");
        HelloLexer lexer = new HelloLexer(charStream);
        CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(commonTokenStream);
        ParseTree parseTree = parser.trafficProg();
        Trees.inspect(parseTree,parser);
        ParseTreeVisitor visitor = new BuildASTVisitor();
        BlockNode astNode = (BlockNode) new BuildASTVisitor().visit(parseTree);
        ASTVisitor astVisitor = new TypeCheckVisitor();
        astVisitor.visit(astNode);

        int x = -7;
    }
}
