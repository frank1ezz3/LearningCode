package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.TreeSet概述和特点_二儿子_有序.案例_成绩排序;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {//主次搞搞好
            @Override
            public int compare(Student s1, Student s2) {
                //主要条件
                int num = s2.getSum() - s1.getSum();
                //次要条件
                int num2 = num ==0?s1.getChinese()-s2.getChinese():num;
                int num3 = num2 == 0 ? s1.getName().compareTo(s2.getName()):num2;
                return num3;
            }
        });
        Student s1 = new Student("林青霞", 98,100);
        Student s2 = new Student("风清扬", 95,96);
        Student s3 = new Student("张曼玉", 100,93);
        Student s4 = new Student("王祖贤", 100,97);
        Student s5 = new Student("李佳豪", 100,100);
        Student s6 = new Student("帅小伙", 100,100);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);

        for(Student s :ts){
            System.out.println(s.getName()+","+s.getChinese()+","+s.getMath()+","+s.getSum());
        }
    }
}
