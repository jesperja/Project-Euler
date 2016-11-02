import org.junit.Test;

import static org.junit.Assert.*;

public class NonAbundantSumsTest {

    @Test
    public void testIsAbundant() throws Exception {
        assertFalse(NonAbundantSums.isAbundant(28));
    }

    @Test
    public void twelveIsAbundant(){
        assertTrue(NonAbundantSums.isAbundant(12));
    }


    @Test
    public void testSumOfAll() throws Exception {
        assertEquals(1+2+3+4+5+6+7+8+9+10+11+12+13+14+15+16+17+18+19+20+21+22+23, NonAbundantSums.sumOfAll(24));
    }

    @Test
    public void theAnswet(){
        assertEquals(4179871, NonAbundantSums.sumOfAll(28123));
    }
}
