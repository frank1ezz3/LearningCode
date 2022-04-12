package learningX.itheima_23字符流_记事本打开看的懂的用这个;

import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) {
        String s = "中国";
        //  public byte[] getBytes() {//使用平台的默认字符集将该String编码为一些列字节，将结果存储到新的字节数组中
        byte[] bys = s.getBytes();//[-28, -72, -83, -27, -101, -67]//自动utf-8
        System.out.println(Arrays.toString(bys));

        //    public String(byte[] bytes) {
        String ss = new String(bys);//String（bys，GBK）//默认utf-8
        System.out.println(ss);
    }
}
