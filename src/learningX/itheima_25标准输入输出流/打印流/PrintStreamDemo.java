package learningX.itheima_25标准输入输出流.打印流;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        //指定文件名创建新的打印流
        //    public PrintStream(String fileName){//字节打印
        PrintStream ps = new PrintStream("F:\\shuaideyibi\\java.txt");//这个后面也可加个true

        //写数据   字节输出流有点方法
        ps.write(97);

        ps.println(123);//打印流的好处，直接打印//且自动刷新flush
        ps.close();

        PrintWriter pw = new PrintWriter("F:\\shuaideyibi\\java.txt");//这个后面也可加个true

        pw.println("大师傅士大夫士大夫士大夫士大夫胜多负少");//写False不会刷新
        pw.close();
    }
}
