package learningX.itheima_10接口.接口的成员特点;

public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
        //i.num=50;接口内默认被final修饰
        System.out.println(i.num);
        //i.num2=100;//报错 因为被final了
        System.out.println(i.num2);

        System.out.println(Inter.num);//可以通过这个直接访问，说明也被静态修饰static
    }

}
