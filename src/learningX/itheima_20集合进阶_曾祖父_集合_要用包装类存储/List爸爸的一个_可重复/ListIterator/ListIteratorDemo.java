package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        //创建List集合的对象
        List<String> list = new ArrayList<String>();//自动重写了toString的方法

        //添加元素//上面是String所以下面也是字符串//是boolean类型的噢
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");

        ListIterator<String> litt = list.listIterator();//这里不会发生并发修改异常
        while(litt.hasNext()){
            String s = litt.next();
            if(s.equals("world")){
                litt.add("javaee");
            }
        }
        System.out.println(list);
        System.out.println("----------------------");

        ListIterator<String> lit = list.listIterator();//下面两个不需要重点记忆
        while (lit.hasNext()) {
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("----------------------");

        while (lit.hasPrevious()) {
            String s = lit.previous();
            System.out.println(s);
        }
    }
}
