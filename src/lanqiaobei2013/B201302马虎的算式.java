package lanqiaobei2013;

/*
假设a b c d e代表1-9不同的5个数字（注意是各不相同的数字且不包含0）

ab * cde = adb * ce 这样的算式有多少个
 */

public class B201302马虎的算式 {//填结果，答案一定是偶数类 因为可以交换嘛

    public static void main(String[] args) {
        int ans = 0;
        for (int a = 1; a < 10; a++) {
            for (int b = 1; b < 10; b++) {
                if (a != b) for (int c = 1; c < 10; c++) {
                    if (c != b && c != a) for (int d = 1; d < 10; d++) {
                        if (d != b && d != a && d != c) for (int e = 1; e < 10; e++) {
                            if (e != a && e != b && e != c && e != d) {
                                if ((a * 10 + b) * (c * 100 + d * 10 + e) == (a * 100 + d * 10 + b) * (c * 10 + e)) {
                                    ans++;
                                    System.out.println(ans);
                                }
                            }

                        }
                    }
                }
            }
        }
    }
}