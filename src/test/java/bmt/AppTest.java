package bmt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest {

    @Test
    public void testDivide() {
        // Test divide method with valid inputs
        double result = App.divide(10, 2);
        assertEquals(5.0, result, 0.0); 
    }

    @Test
    public void testIsPrime() {

        assertTrue(App.isPrime(7));

        assertFalse(App.isPrime(10));
    }
}
