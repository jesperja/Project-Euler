import org.junit.Test;

import static org.junit.Assert.*;


public class HighlyDivisibleTriangularNumbersTest {

    @Test
    public void testGetTriangleNumbers() throws Exception {
        assertEquals(28, HighlyDivisibleTriangularNumbers.getTriangleNumber(7, 5));
        //400 39sek w. parallell
        //500 5m 17sek w. parallell
        assertEquals(76576500, HighlyDivisibleTriangularNumbers.getTriangleNumber(Long.MAX_VALUE, 500));
        //System.err.println(HighlyDivisibleTriangularNumbers.getTriangleNumber(Long.MAX_VALUE, 500));
    }

    @Test
    public void testGetNumberOfDivisors() throws Exception {
        assertEquals(6, HighlyDivisibleTriangularNumbers.getNumberOfDivisors(28));
    }
}