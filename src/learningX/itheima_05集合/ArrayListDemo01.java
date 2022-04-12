package learningX.itheima_05集合;

import java.util.ArrayList;

public class ArrayListDemo01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();//ArrayList的基本方法

        array.add("hello");
        array.add("world");
        array.add("java");

        //array.add(1,"javase");
        //array.add(3,"javase");
        //array.add(4,"javase");//索引越界IndexOutOfBoundsException

        //System.out.println(array.remove("world"));
        //System.out.println(array.remove("javaee"));//没有 所以输出false
        //System.out.println(array.remove(1));
        //System.out.println(array.remove(3));//索引越界IndexOutOfBoundsException

        //System.out.println(array.set(1,"javaee"));//修改元素
        //System.out.println(array.set(3,"javaee"));//索引越界IndexOutOfBoundsException

        //System.out.println(array.get(0));//查询元素
        //System.out.println(array.get(3));//索引越界IndexOutOfBoundsException

        System.out.println(array.size());//获取个数

        System.out.println("array:" + array);
    }
}
