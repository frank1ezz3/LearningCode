package learningX.itheima_24字符流案例.文件到集合;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TxtToArrayListDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));

        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {//一次只读一个数据//Line读数据不包含换行符
            array.add(line);
        }

        br.close();

        for(String a : array){
            System.out.println(a);
        }
    }
}
