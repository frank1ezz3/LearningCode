package learningX.itheima_22字节流_记事本打开读不懂的用这个.案例_复制文本文件;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTxtDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\shuaideyibi\\java.txt");

        FileOutputStream fos = new FileOutputStream("F:\\shuaideyibi\\niudeyibi\\web.txt");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }//优化一下是这样的

        fos.close();
        fis.close();
    }
}
