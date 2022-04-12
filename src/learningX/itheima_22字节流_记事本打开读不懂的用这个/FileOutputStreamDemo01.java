package learningX.itheima_22字节流_记事本打开读不懂的用这个;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象//              《在底层把路径封装成了一个对象》关键！！！
        //    public FileOutputStream(String name) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\java.txt");

        //    public void write(int b) throws IOException {
        fos.write(97);
        fos.write(57);
        fos.write(55);

        //最后都要释放资源
        //    public void close() throws IOException {//关闭此文件输出流并释放与此流相关的任何系统资源
        fos.close();

    }
}
