package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符缓冲流.案例_复制Java文件_字符缓冲流特有功能改进版;


import java.io.*;

public class CopyJavaDemo03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\niudeyibi\\biechi.txt"));


        String line;
        while ((line = br.readLine()) != null) {//一次只读一个数据//Line读数据不包含换行符
            bw.write(line);
            bw.write("\r\n");//不可以用第二个噢，这个是第三个噢 特有的噢
        }

        bw.close();
        br.close();
    }
}
