import org.junit.jupiter.api.Test;

import java.lang.reflect.Type;
import java.util.Hashtable;

import static org.junit.jupiter.api.Assertions.*;

class TypeCheckVisitorTest {

    TypeCheckVisitor visitor = new TypeCheckVisitor();
    @Test
    void checkInt() {
        String db = "2.2";
        String integer = "2";
        assertTrue(visitor.checkInt(integer));
        assertFalse(visitor.checkInt(db));
    }

    

}