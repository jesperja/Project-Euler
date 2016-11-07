import org.junit.Test;

import static junit.framework.Assert.*;

public class DistinctPowersTest {
    @Test
    public void distinctPowers() throws Exception {
        assertEquals(15, DistinctPowers.distinctPowers(2,5));
        assertEquals(9183, DistinctPowers.distinctPowers(2,100));
    }

}