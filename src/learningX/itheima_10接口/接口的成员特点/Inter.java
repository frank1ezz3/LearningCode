package learningX.itheima_10接口.接口的成员特点;

public interface Inter {
    public int num = 10;
    public final int num2 = 20;
    public static final int num3=30;//灰色都是可以不用写的除了public

    //public Inter(){}//接口不能有构造方法

    public abstract void method();

    void show();//可以写也可以不写
}
