package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection c = new ArrayList();//泛型的好处，在<>里定义类型可以提前报错，避免强制类型转化

        c.add("hello");
        c.add("world");
        c.add("java");
//        c.add(100);//String情况下会报错ClassCastException
        Iterator it = c.iterator();

        while(it.hasNext()){
//            Object obj = it.next();
//            System.out.println(obj);//Object类型

            String s = (String)it.next();
            System.out.println(s);//强行转化为String
        }
    }
}
