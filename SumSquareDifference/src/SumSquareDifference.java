import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 The sum of the squares of the first ten natural numbers is,
 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,
 (1 + 2 + ... + 10)^2 = 552 = 3025
 Hence the difference between the sum of the squares of the
 first ten natural numbers and the square of the sum is
 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the
 first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {

    public static long sumOfSquares(final int max){
        /*long sum = 0;
        for (int i = 1; i <= max; i++){
            sum = sum + (long)Math.pow(i, 2);
        }
        return sum;*/
        return LongStream.rangeClosed(1, max).map(i -> (long)Math.pow(i, 2)).sum();
    }

    public static long squareOfSums(final int max){
        /*long sum = 0;
        for (int i = 1; i <= max; i++){
            sum = sum + i;
        }
        return (long)Math.pow(sum, 2);*/
        return (long)Math.pow(LongStream.rangeClosed(1, max).sum(), 2);
    }

    public static long sumSquareDifference(final int max){
        return -1 * (sumOfSquares(max) - squareOfSums(max));
    }

}
