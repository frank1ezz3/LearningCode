package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo01 {
    public static void main(String[] args) {
        //创建List集合的对象
        List<String> list = new ArrayList<String>();//自动重写了toString的方法

        //添加元素//上面是String所以下面也是字符串//是boolean类型的噢
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        //输出集合对象

        list.add(1,"javaee");//添加值
        //list.add(11,"javaee");报错IndexOutOfBoundsException越界
        System.out.println(list);
        System.out.println("----------------------------");

        System.out.println(list.remove(1));//删除值
        //System.out.println(list.remove(11));//IndexOutOfBoundsException
        System.out.println(list);

        System.out.println("----------------------------");

        System.out.println(list.set(1,"javaee"));//改变值
        //System.out.println(list.set(11,"javaee"));//报错IndexOutOfBoundsException越界
        System.out.println(list);

        System.out.println("----------------------------");

        System.out.println(list.get(1));//获取值
        //System.out.println(list.get(11));//报错IndexOutOfBoundsException越界
        System.out.println(list);

        System.out.println("----------------------------");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
//                System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }

        System.out.println("----------------------------");

        //for循环遍历
        for(int i=0 ;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }
    }
}
