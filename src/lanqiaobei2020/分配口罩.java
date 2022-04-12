package lanqiaobei2020;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Arrays;

/*
题目描述
某市市长获得了若干批口罩，每一批口罩的数目如下：（如果你把以下文字复制到文本文件中，请务必检查复制的内容是否与文档中的一致。在试题目录下有一个文件 mask.txt，内容与下面的文本相同）
9090400
8499400
5926800
8547000
4958200
4422600
5751200
4175600
6309600
5865200
6604400
4635000
10663400
8087200
4554000
现在市长要把口罩分配给市内的 2 所医院。由于物流限制，每一批口罩只能全部分配给其中一家医院。市长希望 2 所医院获得的口罩总数之差越小越好。请你计算这个差最小是多少？
【答案提交】
这是一道结果填空题，你只需要算出结果后提交即可。本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */
public class 分配口罩 {
    public static void main(String[] args) {
        int sum = 0, mid = 0;
        int[] nums = {0, 9090400, 8499400, 5926800, 8547000, 4958200,
                4422600, 5751200, 4175600, 6309600, 5865200, 6604400, 4635000,
                10663400, 8087200, 4554000};

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        //所有口罩的二分之一
        mid = sum / 2;

        //开辟一个数组长度为二分之一+1，因为有可能除不尽
        int[] dp = new int[mid + 1];


        for (int i = 1; i < nums.length; i++) {

            for (int j = mid; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);

            }


        }

        System.out.println(2 * (mid - dp[mid]));


        double i = 200;
        double j = 3;
        DecimalFormat Decimal = new DecimalFormat("0000.00");
        System.out.println(Decimal.format(i / j));

        int i1 = 2020;
        String s = i1 + "";
        char c = s.charAt(2);
        if (c == '2') System.out.println(c);
    }
}
