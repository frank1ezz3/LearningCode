package 贪心算法;

/*
有1块 5块 10块 50块 500块 各很多枚

用这些来支付A元 问最少解

第一行有6个数字 代表这些硬币各有几个
3 2 1 3 0 2

第二行输入A元
620

答案
6
 */
import java.util.Scanner;

import static java.lang.Math.min;

public class 硬币支付问题 {
    static int[] cnts = new int[6];//持有个数数组
    static int[] coins = {1, 5, 10, 50, 100,500};//面额数组

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {//输入6个数，分别是个面值的持有个数
            cnts[i] = sc.nextInt();

        }
        int A = sc.nextInt();//输入要支付的金额
        int res = f(A, 5);//int一个答案
        System.out.println(res);
    }

    //贪心算法就是要尽量使用大面值，再使用次大面值，就可以获得最优解

    /**
     *
     * @param A 要付的总金额
     * @param cur 当前要处理的面值
     * @return
     */
    private static int f(int A, int cur) {
        if (A <= 0) return 0;//金额小于0的情况
        if (cur == 0) return A;//面额等于0的情况，直接返回A 好像就是0

        int coinValue = coins[cur];//换了一种说法
        int x = A / coinValue;//x 表示这个面额可以有几个
        int cnt = cnts[cur];//当前面值的硬币有CNT个
        int t = min(x, cnt);//可以有的个数 和 持有的个数 作比较 ，因为我只有这些嘛 不能变出来吧
        return t + f(A - t * coinValue, cur - 1);//用T个当前面值，处理下一个
    }
}
