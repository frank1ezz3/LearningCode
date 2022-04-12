package learningX.itheima_16Arrays;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};

        System.out.println("排序前：" + Arrays.toString(arr));

        Arrays.sort(arr);//排序

        System.out.println("排序后：" + Arrays.toString(arr));//用字符串表达
    }
}
