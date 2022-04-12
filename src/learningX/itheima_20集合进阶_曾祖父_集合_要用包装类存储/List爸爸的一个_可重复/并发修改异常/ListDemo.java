package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.并发修改异常;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        //创建List集合的对象
        List<String> list = new ArrayList<String>();//自动重写了toString的方法

        //添加元素//上面是String所以下面也是字符串//是boolean类型的噢
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        //输出集合对象
//        Iterator<String> it = list.iterator();
//        while(it.hasNext()){
////                System.out.println(it.next());
//            String s = it.next();//ConcurrentModificationException并发修改异常
//            if(s.equals("world")){
//                list.add("javaee");
//            }
//        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.equals("world")) {
                list.add("javaee");
            }

        }
        System.out.println(list);
    }
}
