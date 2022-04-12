package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节流写数据加异常处理;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo04 {
    public static void main(String[] args){//前面是直接扔，这里用try catch

        FileOutputStream fos =null;
        try {
            fos = new FileOutputStream("F:\\shuaideyibi\\java.txt",true);
            //追加true代表可以追加写入
            fos.write("hello".getBytes());
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(fos !=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
