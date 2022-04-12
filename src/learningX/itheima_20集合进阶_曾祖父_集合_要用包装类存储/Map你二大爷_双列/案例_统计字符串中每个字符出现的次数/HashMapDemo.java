package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.案例_统计字符串中每个字符出现的次数;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个字符串");
        String line = sc.nextLine();

//        HashMap<Character, Integer> hm = new HashMap<>();//这个排序就是bull shit
        TreeMap<Character, Integer> hm = new TreeMap<>();//按照26个英文字母自然排序

        for(int i =0;i<line.length();i++){
            char key = line.charAt(i);

            Integer value = hm.get(key);

            if(value == null){
                hm.put(key,1);
            }else{
                value++;
                hm.put(key,value);
            }
        }
        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key:keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);
    }
}
