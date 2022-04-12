package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符缓冲流.案例_复制java文件;

import java.io.*;


public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\niudeyibi\\lihai.txt"));


        int ch;
        while ((ch = br.read()) != -1) {//一次只读一个数据
            bw.write(ch);
        }
        //第二种方法
//        char[] chs = new char[1024];//1024及其整数倍的容器//一次读一个字符数组
//        int len;
//        while((len=isr.read(chs))!=-1){
//            System.out.println(new String(chs,0,len));
//        }
        bw.close();
        br.close();
    }

}
