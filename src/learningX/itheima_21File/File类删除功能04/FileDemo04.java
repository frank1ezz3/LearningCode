package learningX.itheima_21File.File类删除功能04;

import java.io.File;
import java.io.IOException;

public class FileDemo04 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("F:\\shuaideyibi\\java.txt");
//        System.out.println(f1.createNewFile());//如果不存在就返回true并创建《txt》 存在就false
        System.out.println(f1.delete());

        System.out.println("---------------------");
        File f2 = new File("F:\\shuaideyibi\\itcast");
//        System.out.println(f2.mkdir());
        System.out.println(f2.delete());

        System.out.println("---------------------");

        File f3 = new File("F:\\shuaideyibi\\itcast");
        //        System.out.println(f1.createNewFile());
        File f4 = new File("F:\\shuaideyibi\\itcast\\java.txt");//得先建上级目录，必须的必啊
        //        System.out.println(f2.mkdir());

        System.out.println(f4.delete());//先闪里面的，再删外面的，必须的必啊
        System.out.println(f3.delete());



    }
}
