package learningX.itheima_07继承的基本常识;

public class zi extends fu{
    public int age = 20;
    public int height=175;

    public void method(){
        int age = 30;
        System.out.println(age);
        System.out.println(height);
        //如果要访问本类成员变量
        System.out.println(this.age);
        //如果要访问父类成员变量
        System.out.println(super.age);
    }
}
