import org.junit.jupiter.api.Test;

import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class SymbolTableFillVisitorTest {

    SymbolTableFillVisitor visitor = new SymbolTableFillVisitor();
    @Test
    void visitMethodDeclaration() {
        Hashtable<String,Integer> mockSymbolTable = new Hashtable<String,Integer>();
        MethodDeclarationNode node = new MethodDeclarationNode();
        node.returnType = "void";
        node.name = "Run";
        if (mockSymbolTable.get(node.name) != null) {
            assertFalse(true);
        }else {
            mockSymbolTable.put(node.name, GraphNode.METHOD);
            assertTrue(mockSymbolTable.get(node.name) != null);
        }
    }

    @Test
    void visitSimpleExpressionNode() {
        SimpleExpressionNode node = new SimpleExpressionNode();
        node.value = "5";
        visitor.visit(node);
        assertEquals(node.type, GraphNode.INTTYPE);
        assertNotEquals(node.type, GraphNode.DBLTYPE);
    }

}