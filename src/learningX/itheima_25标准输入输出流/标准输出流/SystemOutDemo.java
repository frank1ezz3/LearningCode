package learningX.itheima_25标准输入输出流.标准输出流;

import java.io.PrintStream;

public class SystemOutDemo {
    public static void main(String[] args) {
        PrintStream ps = System.out;

        ps.print("hello");
        ps.print(100);
        ps.println("hello");//本质就是字节输出流
        ps.println(100);
    }
}
