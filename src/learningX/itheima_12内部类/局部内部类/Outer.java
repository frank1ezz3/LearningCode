package learningX.itheima_12内部类.局部内部类;

public class Outer {
    private int num = 10;

    public void method(){
        int num2=20;

        class Inner{
            public void show(){
                System.out.println(num);
                System.out.println(num2);//内部类可以访问外部类成员，也可以访问内部成员
            }
        }
        Inner i = new Inner();
        i.show();
    }

}
