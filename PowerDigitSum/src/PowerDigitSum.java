import java.math.BigInteger;
import java.util.stream.IntStream;

/**
 * PROB: 16
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

    What is the sum of the digits of the number 2^1000?
 */
public class PowerDigitSum {

    public static long getPowerDigitSum(final int max){
        BigInteger bigInteger = new BigInteger("2");
                for (int i = 1; i < max; i++){
            bigInteger = bigInteger.multiply(new BigInteger("2"));
        }
        long sum = 0;
        for (char c : bigInteger.toString(). toCharArray()){
            int charToInt = Character.getNumericValue(c);
            sum = sum + charToInt;
        }
        return sum;
    }

}