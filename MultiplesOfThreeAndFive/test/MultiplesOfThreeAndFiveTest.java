import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOfThreeAndFiveTest {

    @Test
    public void sumOfMultiplesBelow10(){
        assertEquals(23, MultiplesOfThreeAndFive.sumOfMultiples(10));
    }

    @Test
    public void sumOfMultiplesBelow1000(){
//        System.err.println(MultiplesOfThreeAndFive.sumOfMultiples(1000));
        assertEquals(233168, MultiplesOfThreeAndFive.sumOfMultiples(1000));
    }



}