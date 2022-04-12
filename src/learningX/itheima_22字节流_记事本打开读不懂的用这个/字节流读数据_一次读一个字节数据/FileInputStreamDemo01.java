package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节流读数据_一次读一个字节数据;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输入对象
        FileInputStream fis = new FileInputStream("F:\\shuaideyibi\\java.txt");
        //第一次读取数据
        int by = fis.read();
        System.out.println(by);
        System.out.println((char) by);
        //第二次读取数据
        by = fis.read();
        System.out.println(by);
        System.out.println((char) by);//如果没有就会输出-1
        System.out.println("-----------------");

        int by1;
        while ((by1 = fis.read()) != -1) {
            System.out.print((char) by1);
        }//优化一下是这样的

//        by = fis.read();
//        while(by !=-1){
//            System.out.println((char) by);//原来的是这样的
//            by = fis.read();
//        }


        fis.close();
    }
}
