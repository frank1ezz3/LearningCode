package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.数据结构_俩好大儿;

//ArrayList 底层是数组  查询快    增删慢
//LinkedList底层是链表  查询慢    增删快



import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayList_and_LinkedList {
    public static void main(String[] args) {
        //创建List集合的对象
        ArrayList<String> list = new ArrayList<String>();//自动重写了toString的方法

        //添加元素//上面是String所以下面也是字符串//是boolean类型的噢
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("world");
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("----------------------------");

        //for循环遍历
        for(int i=0 ;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
        }

        System.out.println("----------------------------");

        for(String i:list){
            System.out.println(i);//迭代器增强for
        }

        System.out.println("-----------------------------");

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");
        linkedList.add("world");

        Iterator<String> it1 = linkedList.iterator();

        while(it1.hasNext()){
            String s = it1.next();
            System.out.println(s);
        }

        System.out.println("----------------------------");

        //for循环遍历
        for(int i=0 ;i<linkedList.size();i++){
            String s = linkedList.get(i);
            System.out.println(s);
        }
        System.out.println("----------------------------");

        for(String i:linkedList){
            System.out.println(i);//迭代器增强for
        }
    }
}
