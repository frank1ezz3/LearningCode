package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符缓冲流;

import java.io.*;

public class BufferedStreamDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\java.txt"));

        bw.write("hello\r\n");
        bw.write("world\r\n");
        bw.write("java");
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));

//        int ch;
//        while ((ch = br.read()) != -1) {//一次只读一个数据
//            System.out.println((char)ch);
//        }
        char[] chs = new char[1024];//1024及其整数倍的容器//一次读一个字符数组
        int len;
        while((len=br.read(chs))!=-1){
            System.out.println(new String(chs,0,len));
        }

        br.close();
    }
}
