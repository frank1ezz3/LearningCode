package learningX.itheima_22字节流_记事本打开读不懂的用这个.案例_复制图片;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\shuaideyibi\\QQ图片20220104101233.jpg");

        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\niudeyibi\\1.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read()) != -1){//千万不要运行，电脑会炸
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
