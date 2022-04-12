package learningX.itheima_07继承的基本常识.状态修饰符_final.final修饰局部变量;

public class FinalDemo {
    public static void main(String[] args) {
        final int age=20;
        System.out.println(age);//基本类型

        final Student s = new Student();//修饰 s 的地址        值可以变
        s.age=100;
        System.out.println(s.age);

       // s=new Student();会报错
    }
}
