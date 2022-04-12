package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collections概述和描述.ArrayList存储学生对象并排序;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);
        Student s4 = new Student("李佳豪", 10);
        Student s5 = new Student("黄七七", 10);
        Student s6 = new Student("强博文", 10);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        //根据natural ordering顺序排序
        Collections.sort(array, new Comparator<Student>() {//我的理解为，脱裤子放屁
            @Override
            public int compare(Student s1, Student s2) {
                int num =  s1.getAge() - s2.getAge();//this和i换顺序可以改变升降序
                int num2 = num == 0?s1.getName().compareTo(s2.getName()):num;
                return num2;
            }
        });

        for(Student s : array){
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
