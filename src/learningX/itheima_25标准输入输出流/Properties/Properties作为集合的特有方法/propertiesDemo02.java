package learningX.itheima_25标准输入输出流.Properties.Properties作为集合的特有方法;

import java.util.Properties;
import java.util.Set;

public class propertiesDemo02 {
    public static void main(String[] args) {
        Properties prop = new Properties();//properties不是集合泛型但是他是Map衍生出去的

        //    public synchronized Object setProperty(String key, String value) {
        //        return put(key, value);
        //    }
//        @Override
//        public synchronized Object put(Object key, Object value) {
//            return map.put(key, value);
//        }
        prop.setProperty("ljh","niubi");
        prop.setProperty("zhl","shabi");//进阶写法
        prop.setProperty("yq","caibi");

        //    public String getProperty(String key) {
        System.out.println(prop.getProperty("ljh"));

        //    public Set<String> stringPropertyNames() {
        Set<String> names = prop.stringPropertyNames();
        for (String key :names){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }
    }
}
