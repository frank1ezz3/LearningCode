package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.案例_List集合存储学生对象并遍历;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        //创建Collection集合的对象
        List<Student> list = new ArrayList<Student>();//自动重写了toString的方法

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);

        //把学生添加到几个
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Iterator<Student> it = list.iterator();

        while(it.hasNext()){
//                System.out.println(it.next());
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("----------------------------");

        //for循环遍历
        for(int i=0 ;i<list.size();i++){
            Student s = list.get(i);
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
