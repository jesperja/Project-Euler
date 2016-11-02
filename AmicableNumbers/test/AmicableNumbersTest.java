import org.junit.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class AmicableNumbersTest {

    @Test
    public void testAreAmicableNumbers(){
        //assertTrue(AmicableNumbers.areAmicableNumbers(220, 284));
        //assertFalse(AmicableNumbers.areAmicableNumbers(17,5040));
    }

    @Test
    public void testSumOfAmicableNumbers(){
        //System.err.println(AmicableNumbers.sumOfAmicableNumbers(3000));
    }


    @Test
    public void testGetMapOfSumOfDivisors() throws Exception {
        final Map<Integer, ArrayList<Integer>> mapOfDivisors = AmicableNumbers.getMapOfSumOfDivisors(10000);
        assertTrue(mapOfDivisors.containsKey(220));
        assertTrue(mapOfDivisors.containsKey(284));
        assertTrue(mapOfDivisors.size() < 10000);
        /*for (Map.Entry e : mapOfDivisors.entrySet()){
            System.err.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
        System.out.println("size: " + mapOfDivisors.size());*/

    }

    @Test
    public void testGetSumOfAmicableNumbers() throws Exception {
        assertEquals(504, AmicableNumbers.getSumOfAmicableNumbers(300));
        assertEquals(31626, AmicableNumbers.getSumOfAmicableNumbers(10000));
    }
}