import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
        System.out.println("Done");
    }
}
