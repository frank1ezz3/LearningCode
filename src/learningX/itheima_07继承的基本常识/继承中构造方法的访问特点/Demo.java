package learningX.itheima_07继承的基本常识.继承中构造方法的访问特点;

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();

        Zi z2 = new Zi(20);//子类中所有的构造方法默认都会访问--父类中无参构造方法
    }
}
