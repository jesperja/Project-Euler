import org.junit.Test;

import static org.junit.Assert.*;


public class SumSquareDifferenceTest {

    @Test
    public void testSumOfSquares() throws Exception {
        assertEquals(385, SumSquareDifference.sumOfSquares(10));
    }

    @Test
    public void testSquareOfSums() throws Exception {
        assertEquals(3025, SumSquareDifference.squareOfSums(10));
    }

    @Test
    public void testSumSquareDifference() throws Exception {
        assertEquals(2640, SumSquareDifference.sumSquareDifference(10));
        assertEquals(25164150, SumSquareDifference.sumSquareDifference(100));
    }
}