package 算法.base递归练习;
/*
小白上楼梯可以走 1，2，3步 问n阶楼梯有几种走法
 */
public class 小白上楼梯 {//斐波那契变式
    public static void main(String[] args) {
        int n=4;
        int ans=f(n);
        System.out.println(ans);
    }

    private static int f(int n) {
        if(n==0)return 1;
        if(n==1)return 1;
        if(n==2)return 2;
        if(n>=3){
            return f(n-1)+f(n-2)+f(n-3);
        }

        return -1;
    }
}
