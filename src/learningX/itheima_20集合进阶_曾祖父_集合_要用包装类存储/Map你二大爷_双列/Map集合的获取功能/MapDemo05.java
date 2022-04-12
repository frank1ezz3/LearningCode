package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.Map集合的获取功能;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;//变量所有元素方法2

public class MapDemo05 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//多列的元素


        //v put（k key，v value）：添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
//        map.put("郭靖","黄蓉");//不能重复噢
        map.put("杨过", "小龙女");

        //简便方法
        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> qwer : entrySet) {
            String key = qwer.getKey();
            String value = qwer.getValue();
            System.out.println(key + "," + value);
        }
    }
}
