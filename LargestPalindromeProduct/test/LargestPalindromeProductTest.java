import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPalindromeProductTest {

    @Test
    public void testIsPalindrome(){
        assertTrue(LargestPalindromeProduct.isPalindrome(9009));
        assertTrue(LargestPalindromeProduct.isPalindrome(1));
        assertFalse(LargestPalindromeProduct.isPalindrome(1000));
    }

    @Test
    public void testGetLargetsPalindrome(){
        assertEquals(906609, LargestPalindromeProduct.getLargestPalindrome(999, 100));
    }
}