package learningX.itheima_07继承的基本常识.状态修饰符_final;

public class Zi extends Fu{
    public final int age=20;

    public void show(){
        //age = 100;被final修饰的不能被修改了
        System.out.println(age);
    }
//    @Override
//    public void method(){
//        System.out.println("Zi method");//Final修饰的方法不能被重写
//    }
}
