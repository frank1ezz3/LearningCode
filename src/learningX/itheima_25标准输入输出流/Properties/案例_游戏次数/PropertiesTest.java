package learningX.itheima_25标准输入输出流.Properties.案例_游戏次数;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();//properties不是集合泛型但是他是Map衍生出去的
        FileReader fr = new FileReader("F:\\javaweb\\jisuanji\\learning\\fw.txt");
        prop.load(fr);
        fr.close();

        //获取玩游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);
         if(number>=3){
             System.out.println("已经结束嘞，国足已经结束了");
         }else{
//             GuessNumber.start();//我没这个包？？？shit
             number++;
             prop.setProperty("count",String.valueOf(number));
             FileWriter fw = new FileWriter("F:\\javaweb\\jisuanji\\learning\\fw.txt");
             prop.store(fw,null);//不想做任何描述就写个null
             fw.close();
         }
    }
}
