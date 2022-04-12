package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collection你大爷_单列.Collection的遍历;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        //创建Collection集合的对象
        Collection<String> c = new ArrayList<String>();//自动重写了toString的方法
        //添加元素：boolean add（E e）//上面是String所以下面也是字符串//是boolean类型的噢
        c.add("hello");
        c.add("world");
        c.add("java");
        Iterator<String> it = c.iterator();
        /*
        public Iterator<E> iterator() {
            return new Itr();
        }
        //private class Itr implements Iterator<E> {//返回的Iterator的实现类
         */
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        //System.out.println(it.next());//NoSuchElementException//请求的元素不存在
        while(it.hasNext()){
//                System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
    }
}
