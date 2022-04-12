package lanqiaobei2017;



/*
资源限制
 时间限制：1.0s   内存限制：256.0MB
 　　小明几乎每天早晨都会在一家包子铺吃早餐。他发现这家包子铺有N种蒸笼，

    其中第i种蒸笼恰好能放Ai个包子。每种蒸笼都有非常多笼，可以认为是无限笼。

 　　每当有顾客想买X个包子，卖包子的大叔就会迅速选出若干笼包子来，

    使得这若干笼中恰好一共有X个包子。比如一共有3种蒸笼，分别能放3、4和5个包子。

    当顾客想买11个包子时，大叔就会选2笼3个的再加1笼5个的（也可能选出1笼3个的再加2笼4个的）。

 　　当然有时包子大叔无论如何也凑不出顾客想买的数量。比如一共有3种蒸笼，分别能放4、5和6个包子。

    而顾客想买7个包子时，大叔就凑不出来了。

 　　小明想知道一共有多少种数目是包子大叔凑不出来的。
 输入格式
 　　----
 　　第一行包含一个整数N。(1 <= N <= 100)
 　　以下N行每行包含一个整数Ai。(1 <= Ai <= 100)
 输出格式
 　　----
 　　一个整数代表答案。如果凑不出的数目有无限多个，输出INF。

 　　例如，
 输入格式
 　　2
 　　4
 　　5

 　　程序应该输出：
 　　6

 　　再例如，
 输入格式
 　　2
 　　4
 　　6

 　　程序应该输出：
 　　INF
 样例说明
 　　对于样例1，凑不出的数目包括：1, 2, 3, 6, 7, 11。
 　　对于样例2，所有奇数都凑不出来，所以有无限多个。

 　　资源约定：
 　　峰值内存消耗（含虚拟机） < 256M
 　　CPU消耗 < 1000ms

 */
import java.util.Scanner;
public class A201708包子凑数 {
    static int n;//有多少种蒸笼
    static int g;//最大公约数
    static int[] a =new int[101];//每一个a[i]代表蒸笼可以容纳多少个包子
    static boolean[] f =new boolean[10000];

    /**
     *
     * @param a 下一个进来的a[i]
     * @param b 上一个进来的a[i]
     * @return
     */
    static int gcd(int a,int b){//最大公约数计算公式
        if(b ==0)return a;
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        f[0] =true;//接下面的j循环
        for(int i =1;i<=n;++i){
            a[i]=sc.nextInt();
            if(i==1)g=a[i];//初始化最大公约数
            else g = gcd(a[i],g);//求最大公约数
            //完全背包的递推
            for(int j = 0;j<10000-a[i];++j){
                if(f[j])f[j+a[i]]=true;//每进入一个新数据且（是最大公约数的倍数/true）就更新一下这个表
            }
        }
        if(g!=1){
            System.out.println("INF");//没有最大公约数（等于1）代表有非常多的数凑不出
            return;
        }
        int ans=0;
        for(int i =0;i<10000;++i){
            if(!f[i]){//如果不是true的话，ans++
                ans++;
            }
        }
        System.out.println(ans);
    }
}









