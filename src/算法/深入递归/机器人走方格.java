package 算法.深入递归;
/*
有一个X*Y的网格，一个机器人只能走格点且只能向右走或向下走，要从左上角走到右下角
请设计一个算法，计算机器人有多少种走法
给定两个正整数 int x ， int y 请返回机器人的走法数目 保证x+y小于等于12

1 1 1
1 1 1
1 1 1
 */

public class 机器人走方格 {
    public static void main(String[] args) {//同振兴中华
        int ans = f(3,3,1,1);
        System.out.println(ans);
        int ans2 =f2(3,3);
        System.out.println(ans2);
    }


    private static int f(int x , int y,int i,int j){
        if(x+y>12)return -1;
        if(i==x||j==y)return 1;
        return f(x,y,i+1,j)+f(x,y,i,j+1);
    }


    private static int f2(int x , int y){
        int[][] doubleArray = new int[x+1][y+1];
        if(x+y>12)return -1;
        for (int i = 1; i <=y ; i++) {
            doubleArray[1][i]=1;
        }
        for (int i = 1; i <=x; i++) {
            doubleArray[i][1]=1;
        }
        for (int i = 2; i <=y; i++) {
            for (int j = 2; j <=x ; j++) {
                doubleArray[i][j]=doubleArray[i-1][j]+doubleArray[i][j-1];
            }

        }
        return doubleArray[x][y];


    }
}
