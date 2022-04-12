package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.Map集合的获取功能;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;//变量所有元素方法1

public class MapDemo04 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//多列的元素


        //v put（k key，v value）：添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
//        map.put("郭靖","黄蓉");//不能重复噢
        map.put("杨过", "小龙女");

        //Set<K> keySet():获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            //根据键去找值，用get（Object key）方法实现
            String value = map.get(key);
            System.out.println(key+","+value);
        }

    }
}
