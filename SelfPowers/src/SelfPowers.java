import javax.sql.rowset.serial.SerialRef;
import java.math.BigInteger;

public class SelfPowers {

    /*
    The series, 1^1 + 2^2 + 3^3 + ... + 10^10 = 10405071317.

    Find the last ten digits of the series, 1^1 + 2^2 + 3^3 + ... + 1000^1000.
     */

    protected static String selfPowers(final int max){
        BigInteger sum = new BigInteger("0");
        for (int i = 1; i <= max; i++){
            BigInteger factor = new BigInteger(Integer.toString(i));
            BigInteger product = factor.pow(i);
            sum = sum.add(product);
        }
        String sumString = sum.toString();
        return sumString.substring(sumString.length() - 10);
    }
}
