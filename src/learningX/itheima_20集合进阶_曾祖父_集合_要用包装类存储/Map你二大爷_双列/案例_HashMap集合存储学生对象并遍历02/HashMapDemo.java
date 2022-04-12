package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.案例_HashMap集合存储学生对象并遍历02;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();//多列的元素

        Student s1 = new Student("林青霞", 30);
        Student s2 = new Student("风清扬", 33);
        Student s3 = new Student("张曼玉", 18);
        Student s4 = new Student("张曼玉", 18);


        hm.put(s1,"西安");
        hm.put(s2,"武汉");
        hm.put(s3,"郑州");
        hm.put(s4,"郑州");//这里如果不重写equals和Hash值就不会体现Map的特点《覆盖》  而是继续添加

        //方法1
        //Set<K> keySet():获取所有键的集合
        Set<Student> keySet = hm.keySet();
        for (Student key:keySet){
            //根据键去找值，用get（Object key）方法实现
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge()+","+value);
        }

    }
}
