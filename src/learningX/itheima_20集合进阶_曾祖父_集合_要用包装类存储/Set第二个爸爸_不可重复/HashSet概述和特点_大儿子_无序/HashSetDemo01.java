package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.HashSet概述和特点_大儿子_无序;

import java.util.HashSet;//遍历的元素顺序得不到保证

public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("hello");
        hs.add("world");
        hs.add("java");
        hs.add("world");//不包含重复噢！
        for(String i:hs){
            System.out.println(i);//输出的顺序不一致噢！
        }
    }
}
