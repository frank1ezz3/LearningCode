package learningX.itheima_10接口.案例_猫和狗;

public class AnimalDemo {
    public static void main(String[] args) {
        Jumping j = new Cat();
        j.jump();

        System.out.println("-----------------");

        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println(a);

        System.out.println("----------------");

        a = new Cat("英短", 2);//给A了一个新的的地址 因为又new了一次
        System.out.println(a.getName() + "," + a.getAge());
        a.eat();
        System.out.println(a);

        System.out.println("---------------------------");

        Cat c = new Cat();
        c.setName("加菲");
        c.setAge(5);
        c.jump();
        System.out.println(c.getName() + "," + c.getAge());
        System.out.println(c);
    }
}
