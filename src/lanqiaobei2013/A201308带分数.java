package lanqiaobei2013;
/*
100可以表示为带分数的形式 ： 100 = 3 + 69258 / 714
                         100 = 82 + 3546 / 197
注意特征： 带分数钟，数字1-9分别出现且只出现一次（不包含0）
类似这样的带分数，100有11种解法
要求输入一个数 且表示出有多少种解法,--不要求输出每一种解法，只要输出有几种就好了

例如
输入
100
输出
11

输入
105
输出
6
 */

import java.util.Scanner;

public class A201308带分数 {
    static int ans;
    private static int N;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] arr = {1,2,3,4,5,6,7,8,9,};
        //int[] arr = {1,2,3};
        f(arr,0);
        System.out.println(ans);
    }

    //确认某一个排列的第k位
    private static void f(int[] arr, int k) {
        if(k == 9)//全部确认
        {
            check(arr);//检查是否可以完成这样的一个等号
            //print(arr);
            return;
        }
        //选定第k位
        for(int i = k ; i <arr.length;i++){//遍历所有的排列=全排列！！
            //将第i位和第k位交换
            int temp = arr[i];//这里交换是一种试探，可能交换了就会触发等式
            arr[i] = arr[k];
            arr[k] = temp;

            //移交下一层去确认k+1位，这里递归过去，继续试探
            f(arr,k+1);

            //回溯（换回来），换位前面的状态，等于是忘掉前面的东西，不然可能受到一些影响
            temp = arr[i];
            arr[i]=arr[k];
            arr[k]=temp;

        }
    }
//    private static void print(int[] arr){//和上面的//print(arr);一起用
//        for(int i = 0 ;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println();
//    }

    //枚举加号和除号的位置
    private static void check(int[] arr) {
        //+前的数字符最多是7，    7是自我感觉的
        for(int i =1 ; i<=7;i++){
            int num1 = toInt(arr,0,i);//+前面的一段整数，也就是生成了一个加的数
            if(num1>=N)continue;//如果此时+号的数额已经超过了N，没必要验算了，直接再进for
            //前面的字符数
            for(int j = 1 ; j<= 8 - i;j++){
                int num2 = toInt(arr,i,j);//分子数
                int num3 = toInt(arr,i+j,9-i-j);//分母数
                if(num2 % num3 ==0 && num1 + num2 / num3 == N){//进行判断
                    ans++;
                }
            }
        }
    }

    private static int toInt(int[] arr, int pos, int len) {//arr是arr  pos是起点  len是个数
        int t =1;
        int ans = 0 ;
        for(int i = pos+ len-1; i >=pos;i--){//将等号右边的每一个点变成一个数
            ans += arr[i] * t;
            t *=10;//进位
        }
        return ans;
    }
}
