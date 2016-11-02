import java.math.BigDecimal;

/**
 * PROB: 26
 *A unit fraction contains 1 in the numerator.
 * The decimal representation of the unit fractions with
 * denominators 2 to 10 are given:

 1/2	= 	0.5
 1/3	= 	0.(3)
 1/4	= 	0.25
 1/5	= 	0.2
 1/6	= 	0.1(6)
 1/7	= 	0.(142857)
 1/8	= 	0.125
 1/9	= 	0.(1)
 1/10	= 	0.1
 Where 0.1(6) means 0.166666..., and has a 1-digit recurring cycle.
 It can be seen that 1/7 has a 6-digit recurring cycle.

 Find the value of d < 1000 for which 1/d contains the longest
 recurring cycle in its decimal fraction part.
 */
public class ReciprocalCycles {

    public static int getUnitFractions(final int max){
        int longestCycle = 0;
        float d = 0;
        for (float i = 2; i <= max; i++){
            final float unitFraction = 1 / i;
            int cycle = getRecurringCycle(unitFraction);
            if (cycle > longestCycle){
                longestCycle = cycle;
                d = i;
            }
        }
        BigDecimal bigDecimal = new BigDecimal("1");
        BigDecimal bigDecimal2 = new BigDecimal("983");
        System.out.println(bigDecimal.divide(bigDecimal2));
        System.out.println(Float.toString(1f / 7));
        //System.out.println(bigDecimal);
        //System.out.println(1f / 983);
        return (int)d;
    }

    public static int getRecurringCycle(final float unitFraction){
        int cycle = 0;
        char previousValue = 99;
        char startValue = 0;
        if (Float.toString(unitFraction).charAt(2) == 0){
            startValue = Float.toString(unitFraction).charAt(3);
        }else{
            startValue = Float.toString(unitFraction).charAt(2);
        }
        //System.out.println(startValue);
        for (char c : Float.toString(unitFraction).substring(3).toCharArray()){
            cycle = cycle + 1;
            if (c == startValue || c == previousValue){
                return cycle;
            }
            previousValue = c;
        }
        return cycle;
    }

}
