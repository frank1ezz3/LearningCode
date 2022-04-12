package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节流写输入的三种方法;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        //《在底层把路径封装成了一个对象》关键！！！
        //写法1
        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\java.txt");
        //写法2
        FileOutputStream fos1 = new FileOutputStream(new File("F:\\shuaideyibi\\java.txt"));

        // public void write(int b) throws IOException {将指定内容写入文件输出流
        fos.write(97);
        fos.write(98);

        fos.write(99);
        fos.write(100);
        fos.write(101);

        byte[] bys={97,98,99,100,100};
        fos.write(bys);
        byte[] bys1 = "abcde".getBytes();
        fos.write(bys1);
        fos.write(bys1,1,3);

        fos.close();//一定不能忘！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
    }
}
