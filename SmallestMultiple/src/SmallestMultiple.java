import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 2520 is the smallest number that can be divided by each of the
 numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible
 by all of the numbers from 1 to 20?
 */
public class SmallestMultiple {

    public static boolean diviseableByAll(final long n, final int max){
        return IntStream.range(3, max).allMatch(i -> n % i == 0);
        /*for (int i = 3; i < max; i++){
            if (n % i != 0){
                return false;
            }
        }
        return true;*/
    }

    public static long smallestNumberDiviseable(final int max){
        //return LongStream.range(2520, Long.MAX_VALUE).filter(i -> i % 2 == 0).filter(i -> diviseableByAll(i, max)).min().getAsLong();
        for (long i = 2520; true; i+=2){
            if (diviseableByAll(i, max)){
                return i;
            }
        }
    }

}
