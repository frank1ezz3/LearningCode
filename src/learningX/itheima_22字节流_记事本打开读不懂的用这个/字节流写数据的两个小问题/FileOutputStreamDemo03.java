package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节流写数据的两个小问题;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        //《在底层把路径封装成了一个对象》关键！！！
        //写法1
        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\java.txt",true);
                                                                            //追加true代表可以追加写入

        for(int i =0;i<10;i++){
            fos.write("hello".getBytes());
            fos.write("\r\n".getBytes());
        }
        //释放不能忘啊!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        fos.close();
    }
}
