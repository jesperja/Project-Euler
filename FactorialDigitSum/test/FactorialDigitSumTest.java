import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialDigitSumTest {

    @Test
    public void testGetFactorialSum() throws Exception {
        assertEquals(27, FactorialDigitSum.getFactorialSum(10));
        assertEquals(648, FactorialDigitSum.getFactorialSum(100));
    }
}