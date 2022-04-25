import org.antlr.runtime.tree.ParseTree;
import org.antlr.runtime.tree.Tree;

import java.util.Hashtable;

public class GraphNode {

    public final static int
            FLTTYPE   = 0,
            INTTYPE   = 1,
            CARTYPE = 2,
            CARSPAWNERTYPE = 3,
            GRIDTYPE = 4,
            TRAFFICLIGHTTYPE = 5;
    public static Hashtable<String,Integer> SymbolTable = new Hashtable<String,Integer>();

}
