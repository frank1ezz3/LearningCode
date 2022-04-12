package learningX.itheima_07继承的基本常识.继承中成员方法的访问特点;

public class Zi extends Fu{
    public void method(){
        System.out.println("Zi中method（）方法被调用");
    }
    public void show(){
        super.show();
        System.out.println("Zi中show()方法被调用");
    }
}
