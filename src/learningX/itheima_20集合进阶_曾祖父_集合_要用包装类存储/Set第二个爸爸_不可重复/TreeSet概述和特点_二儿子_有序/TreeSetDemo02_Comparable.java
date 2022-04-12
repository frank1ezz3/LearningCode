package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.TreeSet概述和特点_二儿子_有序;

import java.util.TreeSet;

public class TreeSetDemo02_Comparable {
    public static void main(String[] args) {//bean里重写了带参compareTo（）就是自定义排序

        TreeSet<Student> ts = new TreeSet<>();//元素存储必须要用包装类

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);
        Student s4 = new Student("王祖贤", 12);//ClassCastException
        Student s5 = new Student("李佳豪", 12);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student i:ts){
            System.out.println(i.getName() + "," + i.getAge());//主要次要条件要写写好

            //return正数 正着排  负数 反着排   0只有一个“因为他要比较 0就是啥也不是”
        }
    }
}
