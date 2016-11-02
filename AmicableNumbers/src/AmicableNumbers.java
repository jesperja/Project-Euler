import java.util.*;
import java.util.stream.IntStream;

public class AmicableNumbers {

    /*
    Let d(n) be defined as the sum of proper divisors of n
    (numbers less than n which divide evenly into n).
    If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable
    pair
    and each of a and b are called amicable numbers.

    For example, the proper divisors of 220 are
    1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110;
    therefore d(220) = 284. The proper divisors of 284 are
    1, 2, 4, 71 and 142; so d(284) = 220.

    Evaluate the sum of all the amicable numbers under 10000.
     */

    public static Map<Integer, ArrayList<Integer>> getMapOfSumOfDivisors(final int max){
        // Map with divisor sum and its int.
        final Map<Integer, ArrayList<Integer>> mapOfDivisors = new HashMap<>();
        for (int i = 1; i < max; i++){
            final int sum = calculateSum(i);
            if (sum < max){
                if (!mapOfDivisors.containsKey(sum)){
                    final ArrayList<Integer> al = new ArrayList<>();
                    al.add(i);
                    mapOfDivisors.put(sum, al);
                }else{
                    mapOfDivisors.get(sum).add(i);
                }
            }
        }
        return mapOfDivisors;
    }

    public static int calculateSum(final int x){
        return IntStream.range(1, x).filter(i -> x % i == 0).sum();
    }

    public static int getSumOfAmicableNumbers(final int max){
        int sum = 0;
        final Map<Integer, ArrayList<Integer>> mapOfDivisors = getMapOfSumOfDivisors(max);
        for (Map.Entry<Integer, ArrayList<Integer>> entry : mapOfDivisors.entrySet()){
            final int key = entry.getKey();
            for (Integer x : entry.getValue()){
                if (mapOfDivisors.containsKey(x)){
                    if (mapOfDivisors.get(x).contains(key) && x != key){
                        sum = sum + x;
                    }
                }
            }
        }
        return sum;
    }

    public static int sumOfAmicableNumbers(final int max){
        int sum = 0;
        for (int i = 1; i < (max - 1); i++){
            for (int j = (i + 1); j < max; j++){
                if (areAmicableNumbers(i, j)){
                    sum += (i + j);
                }
            }
        }
        return sum;
    }

    public static Set<Integer> getSetOfSumOfDivisors(final int max){
        // Map with int and its sum of divisors.
        final Set<Integer> sumOfDivisors = new HashSet<>();
        for (int i = 1; i < max; i++){
            final int sum = calculateSum(i);
            if (sum < max){
                sumOfDivisors.add(sum);
            }
        }
        return sumOfDivisors;
    }

    public static boolean areAmicableNumbers(final int a, final int b){
        int sum1 = 0;
        if (a % 2 == 0){
            sum1 = IntStream.range(1, a).filter(i -> a % i == 0).sum();
            /*for (int i = 1; i < a; i++){
                if (a % i == 0){
                    sum1 += i;
                }
            }*/
        }else{
            for (int i = 1; i < a; i+=2){
                if (a % i == 0){
                    sum1 += i;
                }
            }
        }

        if (sum1 != b){
            return false;
        }

        int sum2 = 0;
        if (b % 2 == 0){
            sum2 = IntStream.range(1, b).filter(j -> b % j == 0).sum();
            /*for (int j = 1; j < b; j++){
                if (b % j == 0){
                    sum2 += j;
                }
            }*/
        }else{
            for (int j = 1; j < b; j+=2){
                if (b % j == 0){
                    sum2 += j;
                }
            }
        }


        return sum1 == b && sum2 == a;
    }

}
