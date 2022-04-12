package lanqiaobei2017;
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
　　儿童节那天有K位小朋友到小明家做客。小明拿出了珍藏的巧克力招待小朋友们。
　　小明一共有N块巧克力，其中第i块是Hi x Wi的方格组成的长方形。

　　为了公平起见，小明需要从这 N 块巧克力中切出K块巧克力分给小朋友们。切出的巧克力需要满足：

　　1. 形状是正方形，边长是整数
　　2. 大小相同

　　例如一块6x5的巧克力可以切出6块2x2的巧克力或者2块3x3的巧克力。

　　当然小朋友们都希望得到的巧克力尽可能大，你能帮小Hi计算出最大的边长是多少么？
输入格式
　　第一行包含两个整数N和K。(1 <= N, K <= 100000)
　　以下N行每行包含两个整数Hi和Wi。(1 <= Hi, Wi <= 100000)
　　输入保证每位小朋友至少能获得一块1x1的巧克力。
输出格式
　　输出切出的正方形巧克力最大可能的边长。
样例输入
2 10
6 5
5 6
样例输出
2

资源约定：
峰值内存消耗（含虚拟机） < 256M
CPU消耗 < 1000ms
 */

import java.util.Scanner;

public class A201709分巧克力 {
    public static void main(String[] args) {
        int n;
        int k;
        int[] h = new int[100000];
        int[] w = new int[100000];
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
            w[i] = sc.nextInt();

        }
        //用二分法进行试探
        int r = 100001;//右边
        int l = 1;//左边
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;//二分法

            int cnt = 0;//分割的巧克力块个数
            for (int i = 0; i < n; i++) {//i小于巧克力的总块数
                cnt += (h[i] / mid) * (w[i] / mid);//通过mid更快逼近最佳解法
            }
            if (cnt >= k) {
                l = mid + 1;
                ans = mid;
            } else {
                r = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
