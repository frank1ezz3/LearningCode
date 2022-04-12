package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.案例_HashMap集合存储学生对象并遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Student> hm = new HashMap<>();//多列的元素

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);

        hm.put("1",s1);
        hm.put("2",s2);
        hm.put("3",s3);
        hm.put("4",s3);//key不一样 但是value一样 也可存呐 嘿嘿嘿

        //方法1
        //Set<K> keySet():获取所有键的集合
        Set<String> keySet = hm.keySet();
        for (String key:keySet){
            //根据键去找值，用get（Object key）方法实现
            Student value = hm.get(key);
            System.out.println(key+","+value.getName() + "," + value.getAge());
        }

        System.out.println("------------------------");

        //简便方法
        //获取所有键值对对象的集合
        Set<Map.Entry<String, Student>> entrySet = hm.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, Student> qwer : entrySet) {
            String key = qwer.getKey();
            Student value = qwer.getValue();
            System.out.println(key + "," +value.getName() + "," + value.getAge());
        }
    }
}
