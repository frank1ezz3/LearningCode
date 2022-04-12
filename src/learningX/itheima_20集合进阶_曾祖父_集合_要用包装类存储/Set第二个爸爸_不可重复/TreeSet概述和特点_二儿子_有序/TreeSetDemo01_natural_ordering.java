package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.TreeSet概述和特点_二儿子_有序;

import java.util.TreeSet;

public class TreeSetDemo01_natural_ordering {
    public static void main(String[] args) {//会排序噢 这么神奇的么
        //natural ordering
        TreeSet<Integer> ts = new TreeSet<>();//元素存储必须要用包装类

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);

        ts.add(30);

        for(Integer i:ts){
            System.out.println(i);//输出的顺序不一致噢！
        }
    }
}
