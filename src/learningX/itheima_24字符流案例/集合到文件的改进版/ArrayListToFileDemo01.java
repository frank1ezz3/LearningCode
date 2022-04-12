package learningX.itheima_24字符流案例.集合到文件的改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileDemo01 {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> array = new ArrayList<>();

        Student s1 = new Student("f18011118","ljh",10,"shanghai");
        Student s2 = new Student("f19011111","lsj",11,"shanghai");
        Student s3 = new Student("f19011112","ljj",12,"shanghai");
        Student s4 = new Student("f19011113","hqq",13,"shanghai");

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\java.txt"));

        for(Student a : array){
            StringBuilder sb = new StringBuilder();
            sb.append(a.getSid()).append(",").append(a.getName()).append(",").append(a.getAge()).append(",").append(a.getAddress());

            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
