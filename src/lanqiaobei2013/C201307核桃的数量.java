package lanqiaobei2013;
/*
小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：

　　1. 各组的核桃数量必须相同
　　2. 各组内必须能平分核桃（当然是不能打碎的）
　　3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）

　　程序从标准输入读入：
　　a b c
　　a,b,c都是正整数，表示每个组正在加班的人数，用空格分开（a,b,c<30）

　　程序输出：
　　一个正整数，表示每袋核桃的数量。

　　例如：
　　用户输入：
　　2 4 5

　　程序输出：
　　20

　　再例如：
　　用户输入：
　　3 1 1

　　程序输出：
　　3



　　资源约定：
　　峰值内存消耗（含虚拟机） < 64M
　　CPU消耗 < 1000ms

 */

import java.util.Scanner;

public class C201307核桃的数量 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a * b * c;
        for (int i = 1; i <=max; i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
