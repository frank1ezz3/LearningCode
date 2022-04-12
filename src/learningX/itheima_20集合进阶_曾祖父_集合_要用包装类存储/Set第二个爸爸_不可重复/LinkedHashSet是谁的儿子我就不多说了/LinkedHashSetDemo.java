package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.LinkedHashSet是谁的儿子我就不多说了;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {//因为是链表，遍历的顺序可以得到保证

    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("hello");
        linkedHashSet.add("world");
        linkedHashSet.add("java");
        linkedHashSet.add("world");

        for(String i:linkedHashSet){
            System.out.println(i);//输出的顺序不一致噢！
        }

    }

}
