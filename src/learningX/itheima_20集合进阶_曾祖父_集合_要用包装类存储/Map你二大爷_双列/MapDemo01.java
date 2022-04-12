package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Map你二大爷_双列;

//接口是这样的  public interface Map<K, V>  k是键的类型（必须唯一，否则替换原来）  v是值的类型

import java.util.HashMap;

public class MapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("f18011118","ljh");
        map.put("f19011118","lushaojie");
        map.put("f18011112","liujunjie");//先进后输出 ==先进去 就 排队你懂吧

//{f18011112=liujunjie, f19011118=lushaojie, f18011118=ljh}结果
        map.put("f18011112","帅小伙");
//{f18011112=帅小伙, f19011118=lushaojie, f18011118=ljh}//替换结果
        System.out.println(map);
    }
}
