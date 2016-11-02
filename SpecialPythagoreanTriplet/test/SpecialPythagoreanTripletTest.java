import org.junit.Test;

import static org.junit.Assert.*;

public class SpecialPythagoreanTripletTest {

    @Test
    public void testGetPythagoreanTriplets() throws Exception {
        assertEquals(31875000, SpecialPythagoreanTriplet.getPythagoreanTriplets());
    }
}