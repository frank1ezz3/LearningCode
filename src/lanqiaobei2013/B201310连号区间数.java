package lanqiaobei2013;
/*
小明这些天一直在思考这样一个奇怪而有趣的问题：

　　在1~N的某个全排列中有多少个连号区间呢？这里所说的连号区间的定义是：

　　如果区间[L, R] 里的所有元素（即此排列的第L个到第R个元素）递增排序后能得到一个长度为R-L+1的“连续”数列，则称这个区间连号区间。

　　当N很小的时候，小明可以很快地算出答案，但是当N变大的时候，问题就不是那么简单了，现在小明需要你的帮助。
输入格式
　　第一行是一个正整数N (1 <= N <= 50000), 表示全排列的规模。
　　第二行是N个不同的数字Pi(1 <= Pi <= N)， 表示这N个数字的某一全排列。
输出格式
　　输出一个整数，表示不同连号区间的数目。

　　示例：
　　用户输入：
4
3 2 4 1

　　程序应输出：
　　7

　　用户输入：
　　5
　　3 4 2 5 1

　　程序应输出：
　　9

　　解释：
　　第一个用例中，有7个连号区间分别是：[1,1], [1,2], [1,3], [1,4], [2,2], [3,3], [4,4]
　　第二个用例中，有9个连号区间分别是：[1,1], [1,2], [1,3], [1,4], [1,5], [2,2], [3,3], [4,4], [5,5]


　　资源约定：
　　峰值内存消耗 < 64M
　　CPU消耗 < 5000ms
 */

import java.util.Scanner;

public class B201310连号区间数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 1; i <= n; i++) {//从1开始
            arr[i] = sc.nextInt();//写入所有的数据
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            int max = arr[i];
            int min = arr[i];
            for (int j = i; j <= n; j++) {
                if (arr[j] > max) max = arr[j];//记录最大最小的数
                if (arr[j] < min) min = arr[j];
                if (i == j) {
                    //System.out.printf("[%d,%d]\n", i, j);
                    ans++;
                }
                //else i<j,判断【i， j】是连号
                else {
                    //System.out.printf("[%d,%d]\n", i, j);
                    if (max - min == j - i) ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
