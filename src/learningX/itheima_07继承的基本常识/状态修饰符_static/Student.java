package learningX.itheima_07继承的基本常识.状态修饰符_static;

public class Student {
    public String name;
    public int age;
    public static String university;//共享的意思

    public void show() {
        System.out.println(name + "," + age + "," + university);
    }
}
