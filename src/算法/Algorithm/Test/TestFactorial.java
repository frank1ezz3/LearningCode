package 算法.Algorithm.Test;

public class TestFactorial {
    public static void main(String[] args) {
        //求n的阶乘
        long result = factorial(10);//10000000
        System.out.println(result);

    }

    public static long factorial(int n){//递归不能太深，不然会栈内存溢出
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
