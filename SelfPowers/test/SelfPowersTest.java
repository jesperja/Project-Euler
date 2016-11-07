import org.junit.Test;

import static junit.framework.Assert.*;

public class SelfPowersTest {
    @Test
    public void selfPowers() throws Exception {
        assertEquals("0405071317", SelfPowers.selfPowers(10));
        assertEquals("9110846700", SelfPowers.selfPowers(1000));
    }

}