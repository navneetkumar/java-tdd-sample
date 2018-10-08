package example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MathTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testAdd() {
        Math math = new Math();
        int result = math.addNumber(1, 2);
        assertEquals(3, result);
    }
}