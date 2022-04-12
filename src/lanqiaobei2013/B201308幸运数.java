package lanqiaobei2013;
/*
　　幸运数是波兰数学家乌拉姆命名的。它采用与生成素数类似的“筛法”生成。

　　首先从1开始写出自然数1,2,3,4,5,6,....

　　1 就是第一个幸运数。
　　我们从2这个数开始。把所有序号能被2整除的项删除，变为：

　　1 _ 3 _ 5 _ 7 _ 9 ....

　　把它们缩紧，重新记序，为：

　　1 3 5 7 9 .... 。这时，3为第2个幸运数，然后把所有能被3整除的序号位置的数删去。注意，是序号位置，不是那个数本身能否被3整除!! 删除的应该是5，11, 17, ...

　　此时7为第3个幸运数，然后再删去序号位置能被7整除的(19,39,...)

　　最后剩下的序列类似：

　　1, 3, 7, 9, 13, 15, 21, 25, 31, 33, 37, 43, 49, 51, 63, 67, 69, 73, 75, 79, ...

　　本题要求：

　　输入两个正整数m n, 用空格分开 (m < n < 1000*1000)
　　程序输出 位于m和n之间的幸运数的个数（不包含m和n）。

　　例如：
　　用户输入：
　　1 20
　　程序输出：
　　5

　　例如：
　　用户输入：
　　30 69
　　程序输出：
　　8



　　资源约定：
　　峰值内存消耗（含虚拟机） < 64M
　　CPU消耗 < 2000ms
 */

import java.util.Scanner;

public class B201308幸运数 {
    public static void main(String[] args) {//这题多少有点小问题，网页上提交不了全错
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];//开辟一个数组
        for (int i = 0; i < n; i++) {
            a[i] = 2 * i + 1;//存基数，第一轮筛选，1 3 5 7...
            //System.out.print(a[i] + " ");
        }

        //已经把2的倍数的（位置）删除了
        int l = 1;//幸运数的下表，a[l]是幸运数1
        while (true) {
            int p = l + 1;//指针，表示数字向前挪动的坑位
            for (int i = l + 1; i < n; i++) {
                if ((i + 1) % a[l] == 0) {//如果说后面的数是前面的倍数，那就是喽，因为后面不是的话会覆盖掉
                } else {
                    a[p] = a[i];//后面的数不能整除，p的位置就向前移动一格，覆盖掉前面可以整除的数
                    p++;
                }
                if (a[i] > n) break;
            }
//            for (int i = 0; i < n; i++) {
//                System.out.print(a[i] + " ");
//            }
//            System.out.println();

            l++;
            if (a[l] >= n) break;
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] >= n) break;//如果比n大就没必要算了
            if (a[i] > m) ans++;//如果这个数比m大answer+1就是计数+1
        }
        System.out.println(ans);
    }
}
/*网上答案
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static char []aa;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m=sc.nextInt();
		int n=sc.nextInt();
		int lucky=2,index=1,lucky_count=0;//lucky取2，为了忽略1
		ArrayList<Integer> list=new ArrayList();
		ArrayList<Integer> list_r=new ArrayList();
		for(int i=0;i<=n;i++) {
			list.add(i);
		}
		while(lucky<n) {
			for(int i=1;i<list.size();i++) {
				if(i%lucky==0) {
					list_r.add(list.get(i));
				}
			}
			index++;//幸运值的下标记得移动
			list.removeAll(list_r);
			list_r.clear();	//清不清空无所谓，还是写上吧
			if(index>=list.size()) break;	//防止过界
			lucky=list.get(index);	//新的幸运值诞生
		}
		for(int i=1;i<list.size();i++) {
			if(list.get(i)<n && list.get(i)>m) {
				lucky_count++;
			}
		}
		System.out.println(lucky_count);
	}
}
 */
