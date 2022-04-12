package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.案例_HashSet集合存储学生对象并遍历;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Student> hs = new HashSet<>();

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);
        Student s4 = new Student("张曼玉", 18);
////不同的对象要保证唯一性，一定要在bean里重写
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        for(Student i:hs){
            System.out.println(i.getName() + "," + i.getAge());//迭代器增强for
        }
    }
}
