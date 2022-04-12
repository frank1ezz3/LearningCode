package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节流读数据_一次读一个字节数组数据;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //创建字节输入对象
        FileInputStream fis = new FileInputStream("F:\\shuaideyibi\\java.txt");
        //第一次读取数据

        byte[] bys = new byte[5];
        int len=fis.read(bys);
        System.out.println(len);
        //String (byte[] bytes)//强行把byte转化为字符串
        System.out.println(new String(bys,0,len));
        System.out.println("---------------------------");
        len=fis.read(bys);
        System.out.println(len);
        //String (byte[] bytes)//强行把byte转化为字符串
        System.out.println(new String(bys,0,len));
        System.out.println("---------------------------");
        len=fis.read(bys);
        System.out.println(len);
        //String (byte[] bytes)//强行把byte转化为字符串
        System.out.println(new String(bys,0,len));//读到没有就会出-1
        /*
            第一次 abcde
            第二次 f \r\n he
            第三次 llo\r\n
         */
        System.out.println("---------------------------");
        //循环改进
        byte[] bys1 = new byte[1024];//1024及其整数倍的容器
        while((len=fis.read(bys1))!=-1){
            System.out.println(new String(bys1,0,len));
        }

        fis.close();
    }
}
