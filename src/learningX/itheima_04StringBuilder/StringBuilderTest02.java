package learningX.itheima_04StringBuilder;

import java.util.Scanner;

public class StringBuilderTest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

        String s = myReverse(line);
        System.out.println("s:" + s);

        String s1 = myReverse1(line);
        System.out.println("s:" + s1);
    }

    public static String myReverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String ss = sb.toString();
        return ss;
    }

    public static String myReverse1(String s1) {

        return new StringBuilder(s1).reverse().toString();//和上面等价
    }
}
