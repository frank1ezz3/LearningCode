package lanqiaobei2016;

/*
10个积木 标有数字 0~9

每个积木得放在两个积木上面，且一定比下面的两个积木数字小
最后搭成4曾金字塔

   0
  1 2
 3 4 5
6 7 8 9

   0
  3 1
 7 5 2
9 8 6 4
 */
public class A201603搭积木 {
    ;

    static int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    static int ans;

    public static void main(String[] args) {
        f(0);
        System.out.println(ans);
    }

    static void f(int k) {
        if (k == 10) {
            ans++;
        }
        for (int i = k; i < 10; i++) {
            int tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;

            if (k == 1 && arr[1] < arr[0] ||
                    k == 2 && arr[2] < arr[0] ||
                    k == 3 && arr[3] < arr[1] ||
                    k == 4 && (arr[4] < arr[1] || arr[4] < arr[2]) ||
                    k == 5 && arr[5] < arr[2] ||
                    k == 6 && arr[6] < arr[3] ||
                    k == 7 && (arr[7] < arr[3] || arr[7] < arr[4]) ||
                    k == 8 && (arr[8] < arr[4] || arr[8] < arr[5]) ||
                    k == 9 && arr[9] < arr[5]) {
                tmp = arr[i];
                arr[i] = arr[k];
                arr[k] = tmp;

                continue;
            }

            f(k + 1);

            tmp = arr[i];
            arr[i] = arr[k];
            arr[k] = tmp;


        }
    }

}
