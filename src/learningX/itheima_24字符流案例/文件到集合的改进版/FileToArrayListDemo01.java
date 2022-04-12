package learningX.itheima_24字符流案例.文件到集合的改进版;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListDemo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\shuaideyibi\\java.txt"));

        ArrayList<Student> array = new ArrayList<>();

        String line;
        while ((line = br.readLine()) != null) {//一次只读一个数据//Line读数据不包含换行符
            //把读取到的字符串数据用split（）进行分割，得到一个字符串数组
            String[] strArray = line.split(",");
            //创建学生对象
            Student s = new Student();
            //把字符串数组中的每一个元素取出来对应的赋值给学生对象的成员变量值
//            f18011118,ljh,10,shanghai
//            f19011111,lsj,11,shanghai
//            f19011112,ljj,12,shanghai
//            f19011113,hqq,13,shanghai
            s.setSid(strArray[0]);
            s.setName(strArray[1]);
            s.setAge(Integer.parseInt(strArray[2]));//强转Integer类型
            s.setAddress(strArray[3]);
            array.add(s);//把学生对象添加到集合

        }

        br.close();
        //遍历
        for(Student a : array){
            System.out.println(a.getSid()+","+a.getName()+","+a.getAge()+","+a.getAddress());
        }
    }
}
