package learningX.itheima_25标准输入输出流.标准输入流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInDemo {
    public static void main(String[] args) throws IOException {
//        //
//        InputStream is = System.in;
//
//        int by;
//        while((by=is.read())!=-1){
//            System.out.print((char)by);
//        }
//        //如何把字节流转换为字符流——————>转换流
//        InputStreamReader isr = new InputStreamReader(is);
//        //使用字符流可以实现一次读取一行数据，但是是字符缓冲流的特殊方法
//        BufferedReader br = new BufferedReader(isr);

        //简写为
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("请输入一个字符串：");
        String line = br.readLine();
        System.out.println("你输入的字符串是："+line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(br.readLine());
        System.out.println("你输入的字符串是："+line);

        new Scanner(System.in);//本质就是字节输入流

    }
}
