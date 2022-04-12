package learningX.itheima_07继承的基本常识.状态修饰符_static;

public class StaticDemo {
    public static void main(String[] args) {
        Student.university="b站大学";
        Student s1 = new Student();
        s1.name="林青霞";
        s1.age=30;
        //s1.university="杉达";
        s1.show();

        Student s2 = new Student();
        s2.name="李佳豪";
        s2.age=10;
        //s2.university="杉达";
        s2.show();
    }
}
