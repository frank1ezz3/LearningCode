package learningX.itheima_07继承的基本常识.继承中构造方法的访问特点;

public class Zi extends Fu{
    public Zi(){
        super(20);
        System.out.println("Zi中无参构造方法被调用");
    }
    public Zi(int age){
        super(20);//强行用父类带参构造方法     不想要super只能自己去写一个无参
        System.out.println("Zi中带参构造方法被调用");
    }
}
