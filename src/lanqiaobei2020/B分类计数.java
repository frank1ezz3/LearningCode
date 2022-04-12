package lanqiaobei2020;

import java.util.Scanner;

public class B分类计数 {
    static int a = 0;
    static int b = 0;
    static int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] num = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            num[i]=s.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {

            if(num[i]>=48&&num[i]<=57)a++;
            if(num[i]>=65&&num[i]<=90)b++;
            if(num[i]>=97&&num[i]<=122)c++;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
/*
48
57
65
90
97
122
 */
