import java.util.Hashtable;

public abstract class ASTNode {

    public final static int
            FLTTYPE   = 0,
            INTTYPE   = 1;

    public static Hashtable<String,Integer> SymbolTable = new Hashtable<String,Integer>();

    ASTNode(){
        //for(int ch = 'a'; ch <= 'z'; ch++){AST.SymbolTable.put("" + ch,null);};
    }

    public Integer type = null;


    public abstract void accept(ASTVisitor v);

}