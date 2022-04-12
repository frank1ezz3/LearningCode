package learningX.itheima_24字符流案例.点名器;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));

        ArrayList<String> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {//一次只读一个数据//Line读数据不包含换行符
            array.add(line);
        }

        br.close();

        Random r = new Random();
        int index = r.nextInt(array.size());

        String name = array.get(index);
        System.out.println("傻逼是："+name);
    }
}
