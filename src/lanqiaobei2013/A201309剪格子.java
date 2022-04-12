package lanqiaobei2013;
/*
我们沿着图中的红色线剪开，得到两个部分，每个部分的数字和都是60。

　　本题的要求就是请你编程判定：对给定的m x n 的格子中的整数，是否可以分割为两个部分，使得这两个区域的数字和相等。
　　如果存在多种解答，请输出包含左上角格子的那个区域包含的格子的最小数目。
　　如果无法分割，则输出 0

　　程序输入输出格式要求：
　　程序先读入两个整数 m n 用空格分割 (m,n<10)
　　表示表格的宽度和高度
　　接下来是n行，每行m个正整数，用空格分开。每个整数不大于10000
　　程序输出：在所有解中，包含左上角的分割区可能包含的最小的格子数目。


　　例如：
　　用户输入：
3 3
10 1 52
20 30 1
1 2 3

　　则程序输出：
　　3

　　再例如：
　　用户输入：
4 3
1 1 1 1
1 30 80 2
1 1 1 100

　　则程序输出：
　　10
 */

import java.util.Scanner;

public class A201309剪格子 {
    static int[][] g;
    static int[][] vis;//用于记录这个点是否被访问过了
    private static int n;
    private static int m;
    private static int total;//所有的数之和
    private static int ans = Integer.MAX_VALUE;

    static void dfs(int i, int j, int steps, int sum) {
        //深度搜索
        //也可以大胆的探出去
        if (i < 0 || i == n || j < 0 || j == m || vis[i][j] == 1) return;//走出边界或者已经走过了，非法路径
        if (sum == total / 2) {
            ans = Math.min(ans, steps);//记录最短路径
            return;
        }
        if (sum > total / 2) return;
        vis[i][j] = 1;
        /*if (i - 1 >= 0)*/
        dfs(i + 1, j, steps + 1, sum + g[i][j]);//往下走
        /*if (i + 1 <= n - 1)*/
        dfs(i - 1, j, steps + 1, sum + g[i][j]);//往下走
        /*if (j - 1 >= 0)*/
        dfs(i, j + 1, steps + 1, sum + g[i][j]);//往右走
        /*if (j + 1 <= m - 1)*/
        dfs(i, j - 1, steps + 1, sum + g[i][j]);//往左走
        vis[i][j] = 0;
    }

    public static void main(String[] args) {
        //程序先读入两个整数 m n 用空格分割（m，n<10）
        //表示表格的宽度和高度
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        g = new int[n][m];
        vis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = sc.nextInt();
                total += g[i][j];
            }
        }
        //以上完成输入
        dfs(0,0,0,0);
        System.out.println(ans);
    }
}
