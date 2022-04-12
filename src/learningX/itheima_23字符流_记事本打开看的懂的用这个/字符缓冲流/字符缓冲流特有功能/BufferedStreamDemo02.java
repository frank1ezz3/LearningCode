package learningX.itheima_23字符流_记事本打开看的懂的用这个.字符缓冲流.字符缓冲流特有功能;

import java.io.*;

public class BufferedStreamDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\java.txt"));

        for(int i=0;i<11;i++){
            bw.write("hello"+i);
//            bw.write("\r\n");
            bw.newLine();
        }

        bw.close();

        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));

//        String line = br.readLine();//读到没有会返回null
//        System.out.println(line);
        String line;
        while ((line = br.readLine()) != null) {//一次只读一个数据//Line读数据不包含换行符
            System.out.print(line);
        }
    }
}
