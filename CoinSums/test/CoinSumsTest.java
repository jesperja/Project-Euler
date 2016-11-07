import org.junit.Test;

import static junit.framework.Assert.*;

public class CoinSumsTest {
    @Test
    public void coinSums() throws Exception {
        assertEquals(2, CoinSums.coinSums(new int[]{1, 2}));
        assertEquals(4, CoinSums.coinSums(new int[]{1, 2, 5}));
        assertEquals(73682, CoinSums.coinSums(new int[]{1, 2, 5, 10, 20, 50, 100, 200}));
    }

}