import org.junit.Test;

import static org.junit.Assert.*;

public class SummationOfPrimesTest {


    @Test
    public void testIsPrime() throws Exception {
        assertFalse(SummationOfPrimes.isPrime(888));
        assertTrue(SummationOfPrimes.isPrime(3));
        assertTrue(SummationOfPrimes.isPrime(5));
        assertTrue(SummationOfPrimes.isPrime(7));
        assertTrue(SummationOfPrimes.isPrime(2));
        assertFalse(SummationOfPrimes.isPrime(999000));
        assertTrue(SummationOfPrimes.isPrime(23));
        //assertTrue(SummationOfPrimes.isPrime(997));
    }

    @Test
    public void testSummationOfPrimes() throws Exception {
        assertEquals(17, SummationOfPrimes.summationOfPrimes(10));
        assertEquals(142913828922l, SummationOfPrimes.summationOfPrimes(2000000));
    }
}