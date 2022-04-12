package lanqiaobei2020;

import java.math.BigInteger;
import java.util.Scanner;

public class B八次求和 {
    static BigInteger moded = new BigInteger("123456789");
    static BigInteger original = BigInteger.ONE;
    static BigInteger increase = BigInteger.ONE;
    static BigInteger total = BigInteger.ZERO;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            total = total.add(original.multiply(original).multiply(original).multiply(original).multiply(original).multiply(original).multiply(original).multiply(original));
            original= original.add(increase);
        }

        System.out.println(total.mod(moded));
    }


}
