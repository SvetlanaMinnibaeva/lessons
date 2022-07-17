package My;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(34));
    }

    public static BigInteger factorial(int x) {
        BigInteger fac = BigInteger.ONE;
        for (int i = 2; i <= x; i++) {
            fac = fac.multiply(BigInteger.valueOf(i));
        }
        return fac;
    }
    }

