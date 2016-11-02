import java.util.stream.IntStream;

/**
 * PROB: 9
 *A Pythagorean triplet is a set of three natural numbers,
 * a < b < c, for which,

 a^2 + b^2 = c^2
 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

 There exists exactly one Pythagorean triplet for which
 a + b + c = 1000.
 Find the product abc.
 */
public class SpecialPythagoreanTriplet {

    public static int getPythagoreanTriplets(){
        for (int i = 1; i < 1000; i++){
            int pow2i = i * i;
            for (int j = i + 1; j < 1000; j++){
                final double squareRoot = Math.sqrt(pow2i + (j * j));
                if ((int)squareRoot == squareRoot && (i + j + (int)squareRoot == 1000)){
                    return i * j * (int)squareRoot;
                }
            }
        }
        return 0;
    }

}
