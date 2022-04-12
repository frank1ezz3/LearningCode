package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符流中的编码解码问题;

import learningX.itheima_22字节流_记事本打开读不懂的用这个.FileOutputStreamDemo01;

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\java.txt");
////
////        OutputStreamWriter osw = new OutputStreamWriter(fos);
        //简写为                                                                       可以在这加个逗号该GBK
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\shuaideyibi\\java.txt"));

        osw.write("中国");
        osw.close();

        //        FileInputStream fos = new FileInputStream("F:\\shuaideyibi\\java.txt");
////
////        OutputStreamReader osw = new OutputStreamReader(fos);
        //简写为
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\shuaideyibi\\java.txt"));
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char) ch);
        }
        isr.close();
    }
}
