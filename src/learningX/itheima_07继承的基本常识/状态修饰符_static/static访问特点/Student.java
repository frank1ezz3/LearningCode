package learningX.itheima_07继承的基本常识.状态修饰符_static.static访问特点;

public class Student {
    private String name="李佳豪";

    private static String university="b站大学";

    public void show1(){

    }
    public void show2(){//非静态方法可以访问所以静态非静态的成员
        System.out.println(name);
        System.out.println(university);
        show1();
        show3();
    }
    public static void show3(){

    }
    public static void show4(){//静态的方法只能访问静态的成员方法
        //System.out.println(name);
        System.out.println(university);
        //show1();
        show3();
    }
}
