package learningX.itheima_25标准输入输出流.对象序列化流;

import java.io.*;

public class ThreeProblemDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }
    public static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\shuaideyibi\\java.txt"));

        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName()+","+s.getAge());

        ois.close();
}
    public static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\shuaideyibi\\java.txt"));

        Student s = new Student("ljh",12);

        oos.writeObject(s);

        oos.close();
    }
}
