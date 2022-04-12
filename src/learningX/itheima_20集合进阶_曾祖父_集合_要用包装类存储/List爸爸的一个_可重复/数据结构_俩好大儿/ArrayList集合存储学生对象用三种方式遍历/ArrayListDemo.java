package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.数据结构_俩好大儿.ArrayList集合存储学生对象用三种方式遍历;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();//自动重写了toString的方法

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);

        //把学生添加到几个
        array.add(s1);
        array.add(s2);
        array.add(s3);

        Iterator<Student> it = array.iterator();

        while(it.hasNext()){
//                System.out.println(it.next());
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());//迭代器 遍历特有
        }
        System.out.println("----------------------------");

        //for循环遍历
        for(int i=0 ;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getName() + "," + s.getAge());//带索引的for
        }
        System.out.println("----------------------------");

        for(Student i:array){
            System.out.println(i.getName() + "," + i.getAge());//迭代器增强for
        }
    }

}
