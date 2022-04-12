package lanqiaobei2020;

import java.math.BigDecimal;
import java.math.BigInteger;

public class B202005斐波那契数列最大公约数 {
//    static BigInteger x = new BigInteger("1");
    static BigInteger y = new BigInteger("2");

    //最大公约数
    static BigInteger gcd(BigInteger a, BigInteger b) {
        return b.compareTo(BigInteger.ZERO)==0 ? a : gcd(b, a.mod(b));
    }

    public static BigInteger f(int t) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;//c为最终数
        for (int i = 3; i <= t; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }


    public static void main(String[] args) {
        System.out.println(gcd(f(2020),f(520)));

        System.out.println(y);
    }
}
