package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.TreeSet概述和特点_二儿子_有序.Comparator比较器排序;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {//两种方法 这个是比较器排序  外包那个bean里改是第二种方法
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {//主次搞搞好
            @Override
            public int compare(Student s1, Student s2) {
                int num =  s1.getAge() - s2.getAge();//this和i换顺序可以改变升降序
                int num2 = num == 0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);
        Student s4 = new Student("王祖贤", 12);//ClassCastException
        Student s5 = new Student("李佳豪", 12);
        Student s6 = new Student("黄七七", 12);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student i:ts){
            System.out.println(i.getName() + "," + i.getAge());
        }
    }

}
