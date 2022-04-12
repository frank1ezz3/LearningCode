package learningX.itheima_25标准输入输出流.案例_复制Java文件打印流改进版;

import java.io.*;

public class CopyJavaDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));

        PrintWriter pw = new PrintWriter(new FileWriter("F:\\shuaideyibi\\niudeyibi\\diaodeyi.txt"));

        String line;
        while((line=br.readLine())!=null){
            pw.println(line);
        }
        pw.close();
        br.close();
}
}
