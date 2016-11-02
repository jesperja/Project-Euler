import org.junit.Test;

import static org.junit.Assert.*;

public class ReciprocalCyclesTest {

    @Test
    public void testGetUnitFractions() throws Exception {
        assertEquals(7, ReciprocalCycles.getUnitFractions(10));
        System.err.println(ReciprocalCycles.getUnitFractions(1000));
    }

    @Test
    public void testGetRecurringCycle() throws Exception {
        assertEquals(6, ReciprocalCycles.getRecurringCycle(0.14285715f));
    }
}