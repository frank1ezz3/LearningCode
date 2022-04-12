package learningX.itheima_24字符流案例.集合到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToTxtDemo01 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> array = new ArrayList<>();

        array.add("hello");
        array.add("world");
        array.add("java");

        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\java.txt"));

        //遍历元素
        for(String a : array){
            bw.write(a);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
