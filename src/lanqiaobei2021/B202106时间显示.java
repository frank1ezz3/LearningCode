package lanqiaobei2021;

import java.util.Scanner;

public class B202106时间显示 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //题目测试的数值最大不超过10的18次方，所以存储输入的数据类型用long
        long n = cin.nextLong();
        //先转化成秒
        n /= 1000;
        //超过24小时的时间舍去，只保留最后一天的时间即可
        n %= (24 * 60 * 60);
        //输出对应时间即可
        System.out.printf("%02d:", n / 3600);
        System.out.printf("%02d:", n / 60 % 60);
        System.out.printf("%02d\n", n % 60);
//        System.out.print(n/3600+":"+n/60%60+":"+n%60);
        cin.close();
    }
}