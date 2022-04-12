package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo02 {
    public static void main(String[] args) {
        //Set<Integer> set = new HashSet<>();//无序
        Set<Integer> set = new TreeSet<>();//排序

        Random r = new Random();

        while(set.size()<10){
            int number = r.nextInt(20)+1;//1~20的数

            set.add(number);
        }
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
