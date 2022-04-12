package lanqiaobei2013;

import java.util.HashSet;
import java.util.Set;

/*
1 9 4 9这4个卡片，可以随意摆放他们的先后顺序（但不能倒着摆放） 比如 1949 4919

问：能组成的4位素数的个数
 */
//全排列+检查
public class C201302组素数 {
    static void f(int[] arr, int k) {//递归,从k开始处理排列
        if (k == 4) {//前面都已确定

//            for(int i =0;i<arr.length;i++){
//                System.out.print(arr[i]);
//
//            }
//            System.out.println();

            check(arr);
        }

        for (int i = k; i < 4; i++) {//循环i在每一个位置k从1-4调换位置最终就可以枚举所有改变的数字了（可重复）
            //交换
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i] = temp;

            f(arr, k + 1);

            //回溯，为了让for语句是平行的
            temp = arr[k];//走另外一个分支的情况下要先恢复初始状态，不然可能会有小问题
            arr[k] = arr[i];
            arr[i] = temp;
        }
    }

    static Set<Integer> set = new HashSet<>();

    static private void check(int[] arr) {
        int x = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
        boolean flag = true;
        for (int i = 2; i <= Math.sqrt(x); i++) {//根号x，其实不是很严谨，应该写一个x的
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            set.add(x);
//            System.out.println(set);
        }
    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 9};
        f(arr, 0);
        System.out.println(set.size());

    }
}
