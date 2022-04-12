package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符流读数据的2种方式;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\shuaideyibi\\java.txt"));

        int ch;
        while ((ch = isr.read()) != -1) {//一次只读一个数据
            System.out.println((char) ch);
        }
        System.out.println("---------------------------");
        char[] chs = new char[1024];//1024及其整数倍的容器//一次读一个字符数组
        int len;
        while((len=isr.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }

        isr.close();
    }


}
