package learningX.itheima_25标准输入输出流.Properties;

import java.util.Properties;//这个东西作为Map集合的使用
import java.util.Set;

public class PropertiesDemo01 {
    public static void main(String[] args) {
        Properties prop = new Properties();//properties不是集合泛型但是他是Map衍生出去的

        prop.put("ljh","niubi");
        prop.put("zhl","shabi");
        prop.put("yq","caibi");

        Set<Object> keySet = prop.keySet();
        for (Object key :keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);

        }
    }
}
