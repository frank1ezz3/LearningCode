package lanqiaobei2020;
/*
【问题描述】
如果一个分数的分子和分母的最大公约数是 1，这个分数称为既约分数。
例如，3/4，5/2，1/8，7/1都是既约分数。
请问，有多少个既约分数，分子和分母都是1到2020之间的整数（包括 1和 2020）？

【答案提交】
这是一道结果填空的题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。

个人答案：2481215
 */
public class A202002既约分数 {
    //求ab之间的最小公约数
    static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);
    }
    static int ans;

    public static void main(String[] args) {
        for (int i = 1; i <= 2020; i++) {
            for (int j = 1; j <= 2020; j++) {
                if(gcd(i,j)==1)ans++;
            }
        }
        System.out.println(ans);
    }

}
