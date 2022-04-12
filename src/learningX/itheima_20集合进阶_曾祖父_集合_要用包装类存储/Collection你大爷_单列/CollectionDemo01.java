package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collection你大爷_单列;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo01 {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();//自动重写了toString的方法

        //添加元素：boolean add（E e）//上面是String所以下面也是字符串//是boolean类型的噢
        c.add("hello");
        c.add("world");
        c.add("java");

        //输出集合对象
        System.out.println(c);

        System.out.println("-----------------------------------");

        Collection<String> cc = new ArrayList<String>();//自动重写了toString的方法

        System.out.println(cc.add("hello"));
        System.out.println(cc.add("hello"));
        System.out.println(cc.add("world"));
        System.out.println(cc.add("hello"));//可以反复存储噢  Collection是所有的父类//只要调用了，永远是true//不信ctrl+b
        System.out.println(cc);

        System.out.println("-----------------------------------");

        System.out.println(cc.remove("hello"));//删除     一句remove只能删一个
        System.out.println(cc.remove("java"));
        System.out.println(cc);

        System.out.println("-----------------------------------");
//        cc.clear();
        System.out.println(cc);//清空

        System.out.println("-----------------------------------");
        System.out.println(cc.contains("world"));//判断有没有
        System.out.println(cc.contains("java"));//判断有没有
        System.out.println(cc);

        System.out.println("-----------------------------------");
        System.out.println(cc.isEmpty());//判断是否为空  可以配合clear使用

        System.out.println("-----------------------------------");
        System.out.println(cc.size());

    }
}
