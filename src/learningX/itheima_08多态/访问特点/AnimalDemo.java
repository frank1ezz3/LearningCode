package learningX.itheima_08多态.访问特点;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a =new Cat();

        System.out.println(a.age);
        //System.out.println(a.weight);//编译要先看等号<左边>，左边没有就会报错,取值也看左边

        a.eat();//方法   <编译看左边，运行看右边>!!!!!!!!!!!!!!!!!!!!!!!!!!!因为成员变量没有重写 但是方法有重写

        //a.playGame();//方法也要看左边 左边没有就会报错
    }
}
