package 算法.深入递归;

/*
假设我们有8种不同面值的硬币{1，2，5，10，20，50，100，200}
用这些硬币组合构成一个给定的数值n
例如 n =200 那么 一种可能的组合方式为 200 = 3*1 + 1*2 + 1*5 + 2*20 + 1*50 + 1*100
问总共有多少种组合方式？
 【华为： 1分  2分 5分 的硬币3种 组合成1角 有多少种组合】
 【创新工厂笔试题： 1分 2分 5分 10分四种硬币 每种硬币数量无限 给定n分钱 有多少组成方式】
 */
public class 硬币表示问题 {
    static int[] money = new int[]{1, 5, 10,25};

    public static void main(String[] args) {
        int n =9;
        int ans = f(n, money, money.length-1);
        System.out.println(ans);
    }

    private static int f(int n, int[] money, int count) {
        if(n<=0)return 0;
        if (count == 0) return 1;
        int res = 0;
        for (int i = 0; money[count] * i <= n; i++) {
            int shengyu = n - i * money[count];
            res += f(shengyu, money, count - 1);
        }
        return res;
    }
}
