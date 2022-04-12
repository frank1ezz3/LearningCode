package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列.案例_HashMap集合存储ArrayList元素并遍历;

import java.util.ArrayList;//array输出排序很好  hashmap顺序是shit
import java.util.HashMap;
import java.util.Set;

public class HashMapincludeArrayListDemo {
    public static void main(String[] args) {
        HashMap<String,ArrayList<String>> hm = new HashMap<String,ArrayList<String>>();//多列的元素

        ArrayList<String> sgyy = new ArrayList<>();
        sgyy.add("诸葛亮");
        sgyy.add("诸葛亮");
        hm.put("三国演义",sgyy);

        ArrayList<String> xyj = new ArrayList<>();
        xyj.add("唐僧");
        xyj.add("孙悟空");
        hm.put("西游记",xyj);

        ArrayList<String> shz = new ArrayList<>();
        shz.add("武松");
        shz.add("鲁智深");
        hm.put("水浒传",shz);

        Set<String> keySet = hm.keySet();
        for (String key : keySet){
            System.out.println(key);
            ArrayList<String> value = hm.get(key);
            for (String s : value){
                System.out.println("\t"+s);
            }
        }

    }
}
