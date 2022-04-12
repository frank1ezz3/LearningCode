package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.案例_ArrayList集合存储HashMap元素并遍历;

import java.util.ArrayList;//array输出排序很好  hashmap顺序是shit
import java.util.HashMap;
import java.util.Set;

public class ArrayListincludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> array = new ArrayList<HashMap<String, String>>();

        HashMap<String, String> hm1 = new HashMap<>();//多列的元素
        //v put（k key，v value）：添加元素
        hm1.put("孙策", "大桥");
        hm1.put("周瑜", "小乔");
        hm1.put("周瑜1", "小乔4");
        hm1.put("周瑜2", "小乔2");
        array.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();//多列的元素
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        array.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();//多列的元素
        hm3.put("令狐冲", "仍愿意");
        hm3.put("林平之", "岳灵珊");
        array.add(hm3);

        //遍历ArrayList集合
        for (HashMap<String, String> hm : array) {//方法2
            Set<String> keySet = hm.keySet();
            for (String key : keySet) {//方法1  for增强循环
                String value = hm.get(key);
                System.out.println(key + "," + value);
            }
        }
    }
}
