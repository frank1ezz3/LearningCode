package lanqiaobei2021;

import java.util.Scanner;

/*
问题描述
你有一架天平。现在你要设计一套砝码，使得利用这些砝码可以称出任意小于等于 N 的正整数重量。
那么这套砝码最少需要包含多少个砝码？
注意砝码可以放在天平两边。
输入格式
输入包含一个正整数 N 。
输出格式
输出一个整数代表答案。
测试样例1

Input：
7

Output：
3

Explanation：
3 个砝码重量是 1、4、6，可以称出 1 至 7 的所有重量。
1 = 1；
2 = 6 − 4 (天平一边放 6，另一边放 4)；
3 = 4 − 1；
4 = 4；
5 = 6 − 1；
6 = 6；
7 = 1 + 6；
少于 3 个砝码不可能称出 1 至 7 的所有重量。
 */
public class B202107最少砝码 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int n = 1;//全部加起来的重量
        int w = 1;//新加的重量
        int ans = 1;//几个砝码
        if(N==0)ans=0;
        while ((n + w) < N) {
            n += w;
            w *= 3;
            ans++;
        }
        System.out.println(ans);
    }
}