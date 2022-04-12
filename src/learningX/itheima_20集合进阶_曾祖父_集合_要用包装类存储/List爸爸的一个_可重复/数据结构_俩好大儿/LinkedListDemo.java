package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.数据结构_俩好大儿;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        linkedList.add("world");

//        public void addFirst(E e):在该列表开头插入指定的元素
//        public void addLast（E e）:将指定的元素追加到此列表的末尾
        linkedList.addFirst("javaee1");
        linkedList.addLast("javaee2");
        System.out.println(linkedList);

        System.out.println("-------------------------");

//        public E getFirst():在该列表开头插入指定的元素
//        public E getLast（）:将指定的元素追加到此列表的末尾
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("-------------------------");
//        public E removeFirst():在该列表开头插入指定的元素
//        public E removeLast（）:将指定的元素追加到此列表的末尾
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);

    }
}
