package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.Map集合的基本功能;

import java.util.HashMap;
import java.util.Map;

public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//多列的元素


        //v put（k key，v value）：添加元素
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
//        map.put("郭靖","黄蓉");//不能重复噢
        map.put("杨过","小龙女");
        System.out.println(map);

        //v remove（k key，v value）：根据键删除键值对元素
        System.out.println(map.remove("郭靖"));//黄蓉
        System.out.println(map.remove("郭帅"));//null因为没有这个值

        //void clear（）：移除所以的键值对元素
//        map.clear();
        System.out.println("----------------------------");

        //boolean containsKey(Object key):判断集合是否包含指定的键
        System.out.println(map.containsKey("杨过"));
        System.out.println(map.containsKey("郭靖"));

        System.out.println("----------------------------");

        System.out.println(map.isEmpty());//配合clear使用

        System.out.println("----------------------------");

        System.out.println(map.size());
    }
}
