package MathClass;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {

    // used in fintech application
    public static void main(String[] args) {
        BigInteger bigInteger = new java.math.BigInteger("255555555555555555555525");
        BigDecimal bigDecimal = new BigDecimal(0.155);
        BigDecimal bigDecimalString = new BigDecimal("0.155555555555555");

        System.out.println(bigInteger);
        System.out.println(bigDecimal);
        System.out.println(bigDecimalString);
    }
}
