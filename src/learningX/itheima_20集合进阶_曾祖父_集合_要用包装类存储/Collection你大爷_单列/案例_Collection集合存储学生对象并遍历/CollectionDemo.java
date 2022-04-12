package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collection你大爷_单列.案例_Collection集合存储学生对象并遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<Student> c = new ArrayList<Student>();//自动重写了toString的方法

        //创建学生对象
        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);

        //把学生添加到几个
        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();

        while(it.hasNext()){
//                System.out.println(it.next());
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
