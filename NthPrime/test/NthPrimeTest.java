import org.junit.Test;

import static org.junit.Assert.*;

public class NthPrimeTest {

    @Test
    public void testIsPrime() throws Exception {
        assertTrue(NthPrime.isPrime(997));
    }

    @Test
    public void testNthPrime() throws Exception {
        assertEquals(13, NthPrime.nthPrime(6));
//        assertEquals(104743, NthPrime.nthPrime(10001));
    }
}