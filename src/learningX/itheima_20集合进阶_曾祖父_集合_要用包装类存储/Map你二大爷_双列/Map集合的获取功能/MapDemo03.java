package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.Map集合的获取功能;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();//多列的元素


        //v put（k key，v value）：添加元素
        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
//        map.put("郭靖","黄蓉");//不能重复噢
        map.put("杨过", "小龙女");

        //v get（Object key）：根据键获取值
        System.out.println(map.get("张无忌"));
        System.out.println(map.get("张sanfeng"));//null

        System.out.println("-----------------------");

        //Set<K> keySet():获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key:keySet){
            System.out.println(key);
        }
        System.out.println("-----------------------");
        //Collection<V> values():获取所以值的集合
        Collection<String> values =  map.values();
        for (String value:values){
            System.out.println(value);
        }
    }
}
