package lanqiaobei2013;
/*
求精确的黄金分割数

1.化身为斐波那契数列相邻两项的比值，黄金分割数肯定越多越精确，n/n+1项，n再往上增加
                            这个比值的小数点后101位是稳定的，也就是不变的
2.double压根无法精确100位小数，所以要用到BigInteger和BigDecimal
 */

import java.math.BigDecimal;
import java.math.BigInteger;

public class B201304黄金连分数 {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 3; i < 400; i++) {
            BigInteger t = b;
            b = a.add(b);
            a = t;
        }
        BigDecimal divide = new BigDecimal(a,110).divide(new BigDecimal(b,110),BigDecimal.ROUND_HALF_DOWN);
        System.out.println(divide.toPlainString().substring(0,103));
    }
}
//0.6180339887498948482045868343656381177203091798057628621354486227052604628189024497072072041893911375
