import java.util.Arrays;

public class PandigitalMultiples {

    /*
    Take the number 192 and multiply it by each of 1, 2, and 3:

    192 × 1 = 192
    192 × 2 = 384
    192 × 3 = 576
    By concatenating each product we get the 1 to 9 pandigital, 192384576. We will call 192384576
    the concatenated product of 192 and (1,2,3)

    The same can be achieved by starting with 9 and multiplying by 1, 2, 3, 4, and 5, giving the
    pandigital, 918273645, which is the concatenated product of 9 and (1,2,3,4,5).

    What is the largest 1 to 9 pandigital 9-digit number that can be formed as the concatenated
    product of an integer with (1,2, ... , n) where n > 1?

    */

    protected static int pandigitalMultiples(){
        int largestPandigital = 0;
        for (int i = 1; i < 9999; i++){
            String concatString = "";
            for (int j = 1; true; j++){
                final int product = i * j;
                concatString += product;
                if (concatString.length() == 9 && isPandigital(concatString) && j > 1 && Integer.parseInt(concatString) > largestPandigital){
                    largestPandigital = Integer.parseInt(concatString);
                    break;
                } else if (concatString.length() > 9){
                    break;
                }
            }
        }
        return largestPandigital;
    }

    protected static boolean isPandigital(final String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars).equals("123456789");
    }

}
