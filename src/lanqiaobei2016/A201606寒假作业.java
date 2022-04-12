package lanqiaobei2016;

/*
寒假作业

现在小学的数学题目也不是这么好玩的

看看这个寒假作业

A + A = A
A - A = A
A * A = A
A / A = A

每个A代表1~13中的某一个数字但不能重复

比如（加号左右可以重复）
6 + 7 =13
9 - 8 = 1
3 * 4 = 12
10 / 2 = 5


 */
public class A201606寒假作业 {
    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    static int ans;

    static boolean cheak() {
        if (a[0] + a[1] == a[2] && a[3] - a[4] == a[5] && a[6] * a[7] == a[8] && a[9] % a[10] == 0 && a[9] / a[10] == a[11]) {
            return true;
        }
        return false;
    }

    static void f(int k) {
        if (k == a.length) {
            if (cheak() == true) ans++;
        }
        for (int i = k; i < 13; i++) {
            int tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;

            f(k + 1);

            tmp = a[i];
            a[i] = a[k];
            a[k] = tmp;

        }
    }

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }
}













