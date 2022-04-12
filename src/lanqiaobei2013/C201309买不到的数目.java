package lanqiaobei2013;
/*
小明开了一家糖果店。他别出心裁：把水果糖包成4颗一包和7颗一包的两种。糖果不能拆包卖。

　　小朋友来买糖的时候，他就用这两种包装来组合。当然有些糖果数目是无法组合出来的，比如要买 10 颗糖。

　　你可以用计算机测试一下，在这种包装情况下，最大不能买到的数量是17。大于17的任何数字都可以用4和7组合出来。

　　本题的要求就是在已知两个包装的数量时，求最大不能组合出的数字。
输入格式
　　两个正整数，表示每种包装中糖的颗数(都不多于1000)

　　要求输出：
　　一个正整数，表示最大不能买到的糖数

　　例如：
　　用户输入：
　　4 7
　　程序应该输出：
　　17

　　再例如：
　　用户输入：
　　3 5
　　程序应该输出：
　　7




　　资源约定：
　　峰值内存消耗 < 64M
　　CPU消耗 < 3000ms
 */

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C201309买不到的数目 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int max = a * b;
        Set<Integer> ss = new HashSet<>();
        //从0开始枚举到max
        for (int x = 0; a * x < max; x++) {
            for (int y = 0; a * x + b * y < max; y++) {
                ss.add(a * x + b * y);//用不小于0的x和y与系数能组合出来的数加入set中
            }
        }
        for (int i = max - 1; i >= 0; i--) {
            if (!ss.contains(i)) {//查找第一个不在set中的值
                System.out.println(i);
                break;
            }
        }
    }
}
