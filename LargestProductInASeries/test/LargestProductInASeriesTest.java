import org.junit.Test;

import static org.junit.Assert.*;


public class LargestProductInASeriesTest {

    @Test
    public void testGetLargetsProduct() throws Exception {
        assertEquals(5832, LargestProductInASeries.getLargetsProduct(4));
        assertEquals(23514624000l, LargestProductInASeries.getLargetsProduct(13));
    }

    @Test
    public void testStringSeriesToIntArray() throws Exception {

    }
}