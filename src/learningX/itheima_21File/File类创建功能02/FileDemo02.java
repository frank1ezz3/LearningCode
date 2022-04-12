package learningX.itheima_21File.File类创建功能02;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        //    public File(String pathname) {
        File f1 = new File("F:\\shuaideyibi\\java.txt");
        System.out.println(f1.createNewFile());//如果不存在就返回true并创建《txt》 存在就false

        System.out.println("------------------------");
        File f2 = new File("F:\\shuaideyibi\\JavaSE");
        System.out.println(f2.mkdir());//如果不存在就返回true并创建《目录》 存在就false

        System.out.println("------------------------");
        File f3 = new File("F:\\shuaideyibi\\JavaWEB\\HTML");
        System.out.println(f3.mkdirs());//如果不存在就返回true并创建《多级目录》 存在就false

        System.out.println("------------------------");
        File f4 = new File("F:\\shuaideyibi\\javase.txt");
        System.out.println(f4.createNewFile());//如果不存在就返回true并创建《多级目录》 存在就false
        //要注重方法名！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
    }
}
