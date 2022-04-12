package lanqiaobei2013;

import java.math.BigInteger;

/*
如果一个数字的所有正因子之和等于自身，则称他为 完全数 或 完美数
例如
      6 = 1 + 2 + 3
     28 = 1 + 2 + 4 + 7 + 14

若 2^n - 1 是素数 ， 那么 2^( n - 1 ) * ( 2^n - 1)是完全数


要求啥捏： 2^11213 - 1 这个数字已经很大了（有3000多位），请你编程求出这个素数的十进制表示的最后100位

答案是一个长度为100的数字串，请通过浏览器直接提交该数字
注意：不要提交解答过程，或其他辅助说明类的内容

 */
public class A201302梅森素数 {
    public static void main(String[] args) {
        //封装3000多位的结果
        BigInteger x = BigInteger.valueOf(2).pow(11213).subtract(BigInteger.ONE); //2^11213 - 1
        String s = x.toString();
        int length = s.length();
        System.out.println(s.length());
        String ans = s.substring(length - 100);
        System.out.println(ans);
    }
}























