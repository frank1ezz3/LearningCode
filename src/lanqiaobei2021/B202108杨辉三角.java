package lanqiaobei2021;

import java.util.*;

/*
#H 杨辉三角形
下面的图形是著名的杨辉三角形：
如果我们按从上到下、从左到右的顺序把所有数排成一列，可以得到如下数列：

1 , 1 , 1 , 1 , 2 , 1 , 1 , 3 , 3 , 1 , 1 , 4 , 6 , 4 , 1 , ⋯ 1, 1, 1, 1, 2, 1, 1, 3, 3, 1, 1, 4, 6, 4, 1, \cdots1,1,1,1,2,1,1,3,3,1,1,4,6,4,1,⋯
给定一个正整数 N ，请你输出数列中第一次出现 N  是在第几个数？

输入格式

输入一个整数 N 。

输出格式

输出一个整数代表答案。

测试样例1

Input：
6

Output：
13

1
11
121
1331

 */
public class B202108杨辉三角 {//无敌暴龙兽
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();
        int[][] arr = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
                //System.out.print(arr[i][j] + " ");
                Integer a = arr[i][j];
                list.add(arr[i][j]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)==n){
                System.out.println(i+1);
                break;
            }
        }
    }
}


