import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class MultiplesOfThreeAndFive {

    public static int sumOfMultiples(final int max){
        return IntStream.range(3, max).filter(isDiviseableByThreeOrFive()).sum();
    }

    public static IntPredicate isDiviseableByThreeOrFive(){
        return i -> i % 3 == 0 || i % 5 == 0;
    }

}
