package learningX.itheima_23字符流_记事本打开看的懂的用这个.案例_复制java文件;

import java.io.*;

public class CopyJavaDemo01 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\shuaideyibi\\java.txt"));

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\shuaideyibi\\niudeyibi\\shuai.txt"));

        int ch;
        while ((ch = isr.read()) != -1) {//一次只读一个数据
            osw.write(ch);
        }
        //第二种方法
//        char[] chs = new char[1024];//1024及其整数倍的容器//一次读一个字符数组
//        int len;
//        while((len=isr.read(chs))!=-1){
//            System.out.println(new String(chs,0,len));
//        }
        osw.close();
        isr.close();
    }
}
