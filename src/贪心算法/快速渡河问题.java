package 贪心算法;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.min;

/*
一组人 N个 跨越一条河 仅一艘船 一艘船只能装2人

要拍好顺序

还得让一个人划回来

每个人都有不一样的划船速度

所以整体速度当然是由划船最慢的人决定的

确定一种策略以最快速度都过去

输入
1           （测试的个数）
4           （人的个数 ）
1 2 5 10    （几秒过去，同时也代表几秒回来）

输出
17
 */
public class 快速渡河问题 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] speed = new int[n];

            for (int j = 0; j < n; j++) {
                speed[j] = sc.nextInt();
            }
            //排序
            Arrays.sort(speed);
            f(n, speed);
        }
    }

    /**
     * @param n
     * @param speed
     */
    private static void f(int n, int[] speed) {
        int left = n;
        int ans = 0;
        while (left > 0) {
            if (left == 1) {//剩下一个人了
                ans += speed[1];
                break;
            } else if (left == 2) {//剩下2个人了
                ans += speed[1];
                break;
            } else if (left == 3) {//剩下3个人了
                ans += speed[2] + speed[0] + speed[1];
                break;
            } else {
                //1，2出发， 1返回 ， 最后两个出发， 2返回
                int s1 = speed[1] + speed[0] + speed[left - 1] + speed[1];
                //1+倒数第2个出发， 1返回， 1+最后一个出发出发， 1返回
                int s2 = speed[left - 1] + speed[left - 2] + 2 * speed[0];
                ans += min(s1, s2);//找出s1 s2哪个更快一点
                left -= 2;
            }
        }
        System.out.println(ans);
    }

}
