
public class LargestPalindromeProduct {

    public static boolean isPalindrome(final int n){
        return Integer.parseInt(new StringBuilder(Integer.toString(n)).reverse().toString()) == n;
    }

    public static int getLargestPalindrome(final int maxFactor, final int minFactor){
        int largestPalindrome = 0;
        for (int i = minFactor; i <= maxFactor; i++){
            for (int j = minFactor; j <= maxFactor; j++){
                final int factor = i * j;
                if (isPalindrome(factor) && factor > largestPalindrome){
                    largestPalindrome = factor;
                }
            }
        }
        return largestPalindrome;
    }

}
