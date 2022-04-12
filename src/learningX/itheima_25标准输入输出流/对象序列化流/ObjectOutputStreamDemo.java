package learningX.itheima_25标准输入输出流.对象序列化流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {//序列化流就是不让你读
        //    public ObjectOutputStream(OutputStream out){
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\shuaideyibi\\java.txt"));

        Student s = new Student("ljh",12);

        oos.writeObject(s);

        oos.close();


    }
}
