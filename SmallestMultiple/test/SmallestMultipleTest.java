import org.junit.Test;

import static org.junit.Assert.*;


public class SmallestMultipleTest {

    @Test
    public void testDiviseableByAll() throws Exception {
        assertTrue(SmallestMultiple.diviseableByAll(2520, 10));
    }

    @Test
    public void testSmallestNumberDiviseable() throws Exception {
        //assertEquals(2520, SmallestMultiple.smallestNumberDiviseable(10));
        assertEquals(232792560l, SmallestMultiple.smallestNumberDiviseable(20));
    }
}