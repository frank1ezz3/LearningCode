package learningX.itheima_23字符流_记事本打开看的懂的用这个;

/*
一个汉字存储
如果是GBK编码，占用2个字节
如果是utf—8占3个字节————————————————————右下角看
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileinputStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("F:\\shuaideyibi\\java.txt");//所以字节流不行！
//
//        int by1;
//        while ((by1 = fis.read()) != -1) {
//            System.out.print((char) by1);
//        }
//        fis.close();

        String s = "中国";//可以“GBK”一个字节有俩
        byte[] bys = s.getBytes("UTF-8");//[-28, -72, -83, -27, -101, -67]
        System.out.println(Arrays.toString(bys));
    }
}
