package learningX.itheima_07继承的基本常识.案例_猫和狗;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName()+","+c1.getAge());
        c1.catchMouse();

        Cat c2 = new Cat("英短",2);
        System.out.println(c2.getName()+","+c2.getAge());
        c2.catchMouse();

        Dog d1 = new Dog();//自己打！！！！！
    }
}
