package lanqiaobei2013;
/*
跳格子
必须向下或者向右跳不能跳对角     跳到右下角必须构成 《从我做起振兴中华》

计算有多少种跳的路线？

实例如下

从我做起振
我做起振兴
做起振兴中
起振兴中华
 */
public class A201302振兴中华 {
    public static void main(String[] args) {
        //重复
        //变化
        //边界
        int ans = f(0,0);
        System.out.println(ans);
    }

    private static int f(int i ,int j){//递归手段
        if(i == 3 || j==4)return 1;
        return f(i+1,j)+f(i,j+1);//将两种走法的路线相加
    }
}
