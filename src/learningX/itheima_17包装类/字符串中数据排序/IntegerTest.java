package learningX.itheima_17包装类.字符串中数据排序;

import java.lang.reflect.Array;
import java.util.Arrays;

//字符串数据排序
public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        String[] strArray = s.split(" ");//把字符串的数字存储到int类型的数组中

        int[] arr = new int[strArray.length];//定义一个int数组，把String[]数组中的每一个元素存储到int数组中
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);//对int进行排序

        //拼接
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }

        }
        sb.append("]");

        String result = sb.toString();
        System.out.println("result:"+result);

    }
}
