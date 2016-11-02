import java.util.stream.LongStream;

/**
 The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

 Find the sum of all the primes below two million.
 */
public class SummationOfPrimes {

    public static boolean isPrime(final long n){
        final int sqrt = (int)Math.round(Math.sqrt(n));
        for (int i = 2; i <= sqrt; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;

        //return LongStream.range(2, (int)Math.round(Math.sqrt(n))).anyMatch(i -> n % i == 0);
    }

    public static long summationOfPrimes(final int max){
        /*long sum = 0;
        for (int i = 2; i < max; i++){
            if (isPrime(i)){
                sum = sum + i;
            }
        }
        return sum;*/

        return LongStream.range(2, max).filter(i -> isPrime(i)).sum();
    }

}
