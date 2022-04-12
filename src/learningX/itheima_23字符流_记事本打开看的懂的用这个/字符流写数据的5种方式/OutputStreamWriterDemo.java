package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符流写数据的5种方式;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\shuaideyibi\\java.txt"));

        //    public void write(int c) throws IOException {
        //写一个字符
        osw.write(97);
        //    public void flush() throws IOException {
        //刷新流
        osw.flush();//不刷新进不来 close也行 这个打完还能写，因为他只是刷新了一下而已

        osw.write(98);

        //    public void write(char cbuf[]) throws IOException {
        char[] chs = {'a','b','c','d','e'};


        //    public void write(char cbuf[], int off, int len) throws IOException {
        //限制写入的长度
        osw.write(chs,0,chs.length);//可以（chs，1，3）

        //    public void write(String str) throws IOException {
        //        write(str, 0, str.length());
        //    }
        osw.write("\r\nabcde");
        osw.write("abcde",1,3);

        osw.close();//关闭流之前会自动刷新一次，关了之后再write东西会报错，因为已经关闭了呀大哥


    }
}
