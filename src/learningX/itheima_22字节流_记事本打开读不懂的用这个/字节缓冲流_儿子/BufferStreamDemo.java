package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节缓冲流_儿子;


import java.io.*;

public class BufferStreamDemo {
    public static void main(String[] args) throws IOException {
        //    public BufferedOutputStream(OutputStream out) {

//        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\java.txt");
//
//        BufferedOutputStream bos = new BufferedOutputStream(fos);//合并在下面
      //字节缓存输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\shuaideyibi\\java.txt"));

        bos.write("shuai\r\n".getBytes());
        bos.write("de\r\n".getBytes());
        bos.write("yi\r\n".getBytes());
        bos.write("bi\r\n".getBytes());

        bos.close();

        //    public BufferedInputStream(InputStream in) {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\shuaideyibi\\java.txt"));

        int by;
        while ((by = bis.read()) != -1){
            System.out.print((char)by);
        }
        System.out.println("----------------------");//要运行下面，先注释上面，因为by=bis.read()已经到最后一个了
        byte[] bys1 = new byte[1024];//1024及其整数倍的容器
        int len;
        while((len=bis.read(bys1))!=-1){
            System.out.println(new String(bys1,0,len));
        }

        bis.close();
    }
}
