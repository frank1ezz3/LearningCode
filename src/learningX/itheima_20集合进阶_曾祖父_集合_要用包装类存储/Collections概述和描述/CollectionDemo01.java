package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collections概述和描述;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);
        System.out.println(list);
        System.out.println("------------------------");

        //public static <T extends Comparable<? super T>> void sort(List<T> list) {//按升序排列
        //        list.sort(null);
        //    }
        Collections.sort(list);
        System.out.println(list);
        System.out.println("------------------------");

        //public static void reverse(List<?> list) {:反转
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("------------------------");

        //public static void shuffle(List<?> list) {:打乱排序 执行一次打乱一次
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("------------------------");

    }
}
