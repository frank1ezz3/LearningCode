package lanqiaobei2013;

/*
斐波那契

每一步只能迈上1步或2步 ，先迈左脚，左右交替，最后一步是右脚，也就是说要走偶数步

那么上完39级台阶有多少种解法
 */


//首先我们先考虑斐波那契数列，不考虑偶数不
//f（n=39）{return f(n-1)+f(n-2)}
public class C201304第39级台阶 {//递归
    static int ans=0;

    public static void main(String[] args) {
        f(5, 0);
        System.out.println(ans);

    }

    private static void f(int n, int steps) {//剩下的台阶数为n ,   steps为已走的步数
        if (n < 0) return;
        if (n == 0) {
            if (steps % 2 == 0) ans++;
            return;
        }
        f(n - 1, steps + 1);
        f(n - 2, steps + 1);



    }
}
