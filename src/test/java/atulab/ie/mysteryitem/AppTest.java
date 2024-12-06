package atulab.ie.mysteryitem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * basic functionality tests
 * 
 */
public class AppTest {
	
	public AppTest() {
        
    }

    /**
     * Test that verifies the equality of two strings.
     * 
     */
    @Test
    public void testExample() {
        String expected = "Hello";
        String actual = "Hello";
        assertEquals(expected, actual, "Values should match");
    }

    /**
     * Test that verifies a boolean condition is true.
     * 
     */
    @Test
    public void testBooleanCondition() {
        assertTrue(5 > 1, "This condition should be true");
    }
}
