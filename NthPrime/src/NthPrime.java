import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
 we can see that the 6th prime is 13.
 What is the 10 001st prime number?
 */
public class NthPrime {

    public static boolean isPrime(final long n){
//        final int sqrt = (int)Math.round(Math.sqrt(n));
//        for (int i = 2; i <= sqrt; i++){
//            if (n % i == 0){
//                return false;
//            }
//        }
//        return true;
        return LongStream.rangeClosed(2, (int)Math.round(Math.sqrt(n))).allMatch(i -> n % i != 0);

    }

    public static int nthPrime(final int maxCount){
        int count = 0;
        for (int i = 2; true; i++){
            if (isPrime(i)){
                count++;
                if (count == maxCount){
                    return i;
                }
            }
        }

        //IntStream.range(2, Integer.MAX_VALUE).filter().
    }

}
