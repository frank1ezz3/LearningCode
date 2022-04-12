package 算法;

import java.util.Scanner;

//谁拿了最多奖学金
public class Main {

    //静态变量
    static int N;
    static int personallyAccount = 0;
    static int maxAccount = -1;
    static int allAccount = 0;

    //当前为止最多奖学金的学生姓名
    static String name;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();

        //循环初始化student
        for(int i=0;i<N;i++) {

            String a = in.next();
            int b = in.nextInt();
            int c = in.nextInt();
            char d = in.next().charAt(0);
            char e = in.next().charAt(0);
            int f = in.nextInt();

            Student student = new Student(a,b,c,d,e,f);

            //计算该学生获得的奖学金总数
            personallyAccount = judge1(student)+judge2(student)+judge3(student)+judge4(student)+judge5(student);

            //判断是否比之前的最大奖学金还要多，若是，则赋值给maxAccount变量
            if(personallyAccount > maxAccount) {

                name = student.getName();
                maxAccount = personallyAccount;
            }

            //计算当前为止学生获得的奖学金的和
            allAccount+=personallyAccount;
        }

        //输出题目所需要的三个变量
        System.out.println(name);
        System.out.println(maxAccount);
        System.out.println(allAccount);

        in.close();
    }

    //五个判断，来判断是否获得对应的奖学金
    public static int judge1(Student student) {
        if(student.getAveGrade()>80 && student.getEssayAcount()>0) {
            return 8000;
        }else {
            return 0;
        }
    }
    public static int judge2(Student student) {
        if(student.getAveGrade()>85 && student.getClazzGrade()>80) {
            return 4000;
        }else {
            return 0;
        }
    }
    public static int judge3(Student student) {
        if(student.getAveGrade()>90) {
            return 2000;
        }else {
            return 0;
        }
    }
    public static int judge4(Student student) {
        if(student.getAveGrade()>85 && student.isWestStudent() == 'Y') {
            return 1000;
        }else {
            return 0;
        }
    }
    public static int judge5(Student student) {
        if(student.getClazzGrade()>80 && student.isStudentLeader() == 'Y') {
            return 850;
        }else {
            return 0;
        }
    }
}

//学生类
class Student{


    private String name;
    private int aveGrade;
    private int clazzGrade;
    private char isStudentLeader;
    private char isWestStudent;
    private int essayAcount;

    //有参构造方法
    public Student(String name,int aveGrade,int clazzGrade,char isStudentLeader,char isWestStudent,int essayAcount) {
        this.name = name;
        this.aveGrade = aveGrade;
        this.clazzGrade = clazzGrade;
        this.isStudentLeader = isStudentLeader;
        this.isWestStudent = isWestStudent;
        this.essayAcount = essayAcount;
    }

    //无参构造方法
    public Student() {

    }


    //student的各种属性对应的get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAveGrade() {
        return aveGrade;
    }

    public void setAveGrade(int aveGrade) {
        this.aveGrade = aveGrade;
    }

    public int getClazzGrade() {
        return clazzGrade;
    }

    public void setClazzGrade(int clazzGrade) {
        this.clazzGrade = clazzGrade;
    }

    public char isStudentLeader() {
        return isStudentLeader;
    }

    public void setStudentLeader(char isStudentLeader) {
        this.isStudentLeader = isStudentLeader;
    }

    public char isWestStudent() {
        return isWestStudent;
    }

    public void setWestStudent(char isWestStudent) {
        this.isWestStudent = isWestStudent;
    }

    public int getEssayAcount() {
        return essayAcount;
    }

    public void setEssayAcount(int essayAcount) {
        this.essayAcount = essayAcount;
    }

}
