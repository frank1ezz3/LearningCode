package learningX.itheima_23字符流_记事本打开看的懂的用这个.案例_复制java文件_改进版;

import java.io.*;//儿子们简写方式

public class CopyJavaDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\shuaideyibi\\java.txt");

        FileWriter fw = new FileWriter("F:\\shuaideyibi\\niudeyibi\\shuai.txt");

        int ch;
        while ((ch = fr.read()) != -1) {//一次只读一个数据
            fw.write(ch);
        }
        //第二种方法
//        char[] chs = new char[1024];//1024及其整数倍的容器//一次读一个字符数组
//        int len;
//        while((len=isr.read(chs))!=-1){
//            System.out.println(new String(chs,0,len));
//        }
        fw.close();
        fr.close();
    }
}