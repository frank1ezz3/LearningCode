package 算法.深入递归;
/*
有个小孩正在上楼梯，楼梯有N阶台阶，小孩一次可以上1 2 3 台阶
请实现一个方法 计算小孩有多少种上楼的方式
为了防止溢出 请将结果Mod 1000000007
 */
public class 小孩上楼梯 {
    static int mod = 1000000007;

    public static void main(String[] args) {
        int ans =-1;
        int n=4;
        ans=f(n)%mod;
        System.out.println(ans);
        int ans2=f2(4);
        System.out.println(ans2);
    }
    private static int f(int n){
        if(n==0)return 1;
        if(n==1)return 1;
        if(n==2)return 2;
        return f(n-1)+f(n-2)+f(n-3);
    }
    private static int f2(int n){
        int[] x =new int[n+2];
        x[0]=1;
        x[1]=1;
        x[2]=2;
        if(n>2){
            for (int i = 3; i <= n; i++) {
                x[i]=(x[i-1]+x[i-2]+x[i-3])%mod;
            }
        }
        return x[n];
    }
}
