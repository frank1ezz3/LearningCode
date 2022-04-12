package lanqiaobei2013;
/*
　小明为某机构设计了一个十字型的徽标（并非红十字会啊），如下所示(可参见图片)



　　$
　　$ $
　　$
　　$ $ $ $
　　$ $ $
　　$ $ $ $ $ $
　　$ $ $ $ $
　　$ $ $ $ $ $ $
　　$ $ $ $ $ $ $
　　$ $ $ $ $ $ $
　　$ $ $ $ $
　　$ $ $ $ $ $
　　$ $ $
　　$ $ $ $
　　$
　　$ $
　　$


　　对方同时也需要在电脑dos窗口中以字符的形式输出该标志，并能任意控制层数。

　　为了能准确比对空白的数量，程序要求对行中的空白以句点（.）代替。
输入格式
　　一个正整数 n (n<30) 表示要求打印图形的层数
输出格式
　　对应包围层数的该标志。

　　例如：
　　用户输入：
　　1
　　程序应该输出：
　　..$..
　　..$...$..
　　$
　　$...$...$
　　$.$.$
　　$...$...$
　　$
　　..$...$..
　　..$..

　　再例如：
　　用户输入：
　　3
　　程序应该输出：
　　..$..
　　..$...........$..
　　$
　　$...$.......$...$
　　$.$.$
　　$.$...$...$...$.$
　　$.$.$.$.$
　　$.$.$...$...$.$.$
　　$.$.$.$.$.$.$
　　$.$.$...$...$.$.$
　　$.$.$.$.$
　　$.$...$...$...$.$
　　$.$.$
　　$...$.......$...$
　　$
　　..$...........$..
　　..$..

　　请仔细观察样例，尤其要注意句点的数量和输出位置。


　　资源约定：
　　峰值内存消耗 < 64M
　　CPU消耗 < 1000ms
 */

import java.util.Scanner;

public class C201308打印十字图 {
    static int N;
    static int L=0;
    static int R;
    static char[][] arr;

    static void deal(int n){//先写死，假如他只有3圈，  再写活----》int n
        //n=3,总宽17，最大下标16
        int l;//左边
        int r;//右边
        l=(N-n)*2;//最小下标
        r=l+9+4*(n-1)-1;//最大下标
        for(int i =l+2;i<=r-2;i++){
            arr[l][i]='$';
            arr[r][i]='$';
        }
        arr[l+1][l+2]='$';
        arr[l+1][r-2]='$';
        arr[r-1][l+2]='$';
        arr[r-1][r-2]='$';

        for(int i =l;i<l+3;i++){
            arr[l+2][i]='$';
            arr[r-2][i]='$';
        }
        for(int i =r;i>r-3;i--){
            arr[l+2][i]='$';
            arr[r-2][i]='$';
        }
        for(int i =l+3;i<=r-3;i++){
            arr[i][l]='$';
            arr[i][r]='$';
        }

    }
    static void printAll(){
        for(int i =0;i<=R;i++){
            for(int j =0;j<=R;j++){
                if(arr[i][j]!='$')arr[i][j]='.';//不是￥的地方打印。
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N= sc.nextInt();
        R=9+4*(N-1)-1;
        arr=new char[R+1][R+1];
        for(int i=N;i>=1;i--){
            deal(i);
        }
        int ci=2*N+2;//这里打十字
        int cj=2*N+2;
        arr[ci][cj]='$';
        for(int i =ci-2;i<ci+3;i++){
            arr[ci][i]='$';
        }
        for(int i =ci-2;i<ci+3;i++){
            arr[i][cj]='$';
        }
        printAll();
    }
}
