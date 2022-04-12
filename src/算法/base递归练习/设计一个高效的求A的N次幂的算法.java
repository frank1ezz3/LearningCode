package 算法.base递归练习;
/*
 a 的 n 次幂
 */

public class 设计一个高效的求A的N次幂的算法 {
    public static void main(String[] args) {
        int ans=f(10,3);
        System.out.println(ans);
        System.out.println("-------------------");
        int ans2=f2(10,3);
        System.out.println(ans2);
    }
    private static int f(int a , int n){//o(n)
        int res = 1;
        for(int i =1;i<=n;i++){
            res=res*a;
        }
        return res;
    }

    private static int f2(int a , int n){
        if(n==0)return 1;
        int res =a;
        int ex =1;
        while((ex<<1)<=n){
            res*=res;
            ex<<=1;
        }
        //差n-ex次方没有去乘到后面结果里面
        return res*f2(a,n-ex);
    }

}
