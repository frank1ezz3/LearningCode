package learningX.itheima_25标准输入输出流.Properties.Properties和IO流相结合的方法;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
//        myStore();

        myLoad();

    }
    public static void myLoad() throws IOException {
        Properties prop = new Properties();//properties不是集合泛型但是他是Map衍生出去的
        FileReader fr = new FileReader("F:\\javaweb\\jisuanji\\learning\\fw.txt");
        prop.load(fr);
        fr.close();

        System.out.println(prop);
    }

    public static void myStore() throws IOException {
        Properties prop = new Properties();//properties不是集合泛型但是他是Map衍生出去的

        prop.setProperty("ljh","niubi");
        prop.setProperty("zhl","shabi");//进阶写法
        prop.setProperty("yq","caibi");

        FileWriter fw = new FileWriter("F:\\javaweb\\jisuanji\\learning\\fw.txt");
        prop.store(fw,null);//不想做任何描述就写个null
        fw.close();
    }
}
