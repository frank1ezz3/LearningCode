package learningX.itheima_24字符流案例.集合到文件数据排序改进版;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.getSum() - s1.getSum();

                int num2 = num==0?s1.getChinese()-s2.getChinese():num;
                int num3 = num2==0?s1.getMath()-s2.getMath():num2;
                int num4 = num3==0?s1.getName().compareTo(s2.getName()):num3;
                return num4;
            }
        });

        for(int i =0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第"+(i+1)+"的信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文：");
            int chinese = sc.nextInt();
            System.out.println("数学：");
            int math = sc.nextInt();
            System.out.println("英语：");
            int english = sc.nextInt();

            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEngilsh(english);
            ts.add(s);
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\shuaideyibi\\java.txt"));
        for(Student a : ts){
            StringBuilder sb = new StringBuilder();
            sb.append(a.getName()).append(",").append(a.getChinese()).append(",").append(a.getMath()).append(",").append(a.getEngilsh());
            sb.append(",");
            sb.append(a.getSum());
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
