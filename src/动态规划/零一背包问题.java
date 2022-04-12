package 动态规划;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.Math.max;

/*
有n个重量和价值分别为 wi ， vi 的物品，从这些物品中挑选出总质量不超过w的武平，求所有挑选方案中价值综合的最大值

1<=n<=100
1<=wi  vi<=100
1<=w<=10000

输入n =4
(w,v)={(2,3),(1,2),(3,4),(2,2)}
w=5
输出
7（选择第0，1，3号物品）
因为对每个物品只有选和不选两种情况，所以是01背包
 */
/*
① 问题具有最优子结构性质

② 构造最优值得递归关系表达式

③ 最优值的算法描述

④ 构造最优解
 */
public class 零一背包问题 {
    static int[][] rec;

    public static void main(String[] args) {
        int[] w = {2, 1, 3, 2};//物品重量表
        int[] v = {3, 2, 4, 2};//加价值表
        int n = 4;//个数
        int G = 5;//总质量
        int ans = dfs(w, v, 0, n, G);
        System.out.println(ans);

        //记忆性递归，记映射，
        rec = new int[n][G + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(rec[i], -1);
        }
        ans = m(w, v, 0, n, G);
        System.out.println(ans);
    }
    /**
     *
     * @param w  小重量
     * @param v  小价值
     * @param i  第几个
     * @param n  个数
     * @param G  总质量1
     * @return   最大价值
     */
    private static int m(int[] w, int[] v, int i, int n, int G) {
        if (i == n) return 0;//装不进去了

        //算之前做查询看看有没有重复的值
        if(rec[i][G]>=0)return rec[i][G];

        int v2 = m(w, v, i + 1, n, G);//不选择当前物品
        int ans;
        if (G >= w[i]) {
            int v1 = v[i] + m(w, v, i + 1, n, G - w[i]);//选择当前物品

            ans= max(v1, v2);//两个数比较
        } else {
            ans = v2;
        }
        //做记录，因为rec【i】【G】是最后一个，所以在这里记
        rec[i][G]=ans;
        return ans;
    }

    /**
     *
     * @param w  小重量
     * @param v  小价值
     * @param i  第几个
     * @param n  个数
     * @param G  总质量
     * @return   最大价值
     */
    private static int dfs(int[] w, int[] v, int i, int n, int G) {
        if (i == n) return 0;//装不进去了

        int v2 = dfs(w, v, i + 1, n, G);//不选择当前物品
        if (G >= w[i]) {
            int v1 = v[i] + dfs(w, v, i + 1, n, G - w[i]);//选择当前物品

            return max(v1, v2);//两个数比较
        } else {
            return v2;
        }
    }

}
