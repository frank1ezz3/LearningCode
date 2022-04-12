package learningX.itheima_09抽象类.抽象类的成员特点;

public abstract class Animal {
    private int age=20;
    private final String city="北京";

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public void show(){//可以有非抽象方法，提高代码复用性
        age=40;
        System.out.println(age);
        //city="上海";因为用了final
        System.out.println(city);
    }
    public abstract void eat();//有构造方法但是不能实例化
}
