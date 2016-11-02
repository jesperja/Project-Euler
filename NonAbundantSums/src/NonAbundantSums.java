import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * A perfect number is a number for which the sum of its proper divisors
 * is exactly equal to the number. For example, the sum of the proper
 * divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that
 * 28 is a perfect number.
 * <p>
 * A number n is called deficient if the sum of its proper divisors is
 * less than n and it is called abundant if this sum exceeds n.
 * <p>
 * As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16,
 * the smallest number that can be written as the sum of two abundant
 * numbers is 24. By mathematical analysis, it can be shown that all
 * integers greater than 28123 can be written as the sum of two
 * abundant numbers. However, this upper limit cannot be reduced
 * any further by analysis even though it is known that the greatest
 * number that cannot be expressed as the sum of two abundant numbers
 * is less than this limit.
 * <p>
 * Find the sum of all the positive integers which cannot be written
 * as the sum of two abundant numbers.
 */

public class NonAbundantSums {

    static Set<Integer> createSetOfAbundantNumbers(final int max) {
        return IntStream.rangeClosed(1, max).filter(i -> isAbundant(i))
                .boxed()
                .collect(Collectors.toSet());
    }


    static long sumOfAll(final int max) {
        final Set<Integer> sumOfAbundants = new HashSet<>();
        long sum = 0;
        final List<Integer> abundants = new ArrayList<>();
        for (int i = 0; i <= max; i++) {
            sum = sum + i;
            if (isAbundant(i)) {
                abundants.add(i);
                for (final int k : abundants) {
                    int sumOfAbundant = i + k;
                    if (sumOfAbundant <= max){
                        sumOfAbundants.add(i + k);
                    }


                }

            }
        }
        long abundantSum = 0;
        for (Integer sumOfAbundant : sumOfAbundants) {
            abundantSum = abundantSum + sumOfAbundant;
        }
        return sum - abundantSum;

    }

    static boolean isAbundant(final int n) {
        return IntStream.range(1, n).filter(i -> n % i == 0).sum() > n;
    }


}
