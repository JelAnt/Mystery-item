package atulab.ie.mysteryitem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 
 */
public class AppTest {

    @Test
    public void testExample() {
        
        String expected = "Hello";
        String actual = "Hello";
        assertEquals(expected, actual, "Values should match");
    }

    @Test
    public void testBooleanCondition() {
        assertTrue(5 > 1, "This condition should be true");
    }
}
