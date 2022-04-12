package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复;
//set集合特点 不能重复 没有带索引的方法 所以不能用普通for循环遍历

import java.util.HashSet;
import java.util.Set;

//HashSet：对集合的迭代顺序不做任何保证
public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");//不包含重复噢！
        for(String i:set){
            System.out.println(i);//输出的顺序不一致噢！
        }
    }
}
