package learningX.itheima_05集合;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("林青霞", "30");
        Student s2 = new Student("风清扬", "33");
        Student s3 = new Student("张曼玉", "18");


        array.add(s1);
        array.add(s2);
        array.add(s3);



        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
        addStudent(array);
        System.out.println(array.size());
        addStudent(array);
        System.out.println(array.size());
        addStudent(array);
        System.out.println(array.size());
        for (int i = 0; i < array.size(); i++) {
            Student a1 = array.get(i);
            System.out.println(a1.getName() + "," + a1.getAge());
        }
        System.out.println(array.size());
    }

    public static void addStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();

        Student a1 = new Student();
        a1.setName(name);
        a1.setAge(age);
        array.add(a1);
    }


}
