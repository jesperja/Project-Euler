import org.junit.Test;

import static org.junit.Assert.*;

public class PowerDigitSumTest {

    @Test
    public void testGetPowerDigitSum() throws Exception {
        assertEquals(26, PowerDigitSum.getPowerDigitSum(15));
        assertEquals(1366, PowerDigitSum.getPowerDigitSum(1000));
    }

}