package learningX.itheima_10接口.案例_运动员和教练;

public class PersonDemo {
    public static void main(String[] args) {
        PingPangPlayer ppp = new PingPangPlayer();
        ppp.setName("李佳豪");
        ppp.setAge(2);
        System.out.println(ppp.getName() + "," + ppp.getAge());
        ppp.eat();
        ppp.speak();

        System.out.println("--------------------------");
        PingPangCoach c = new PingPangCoach();
        c.setName("陆少杰");
        c.setAge(2);
        System.out.println(c.getName() + "," + c.getAge());
        c.eat();
        c.speak();

        System.out.println("---------------------------");

        Coach cc = new PingPangCoach();
        cc.setName("陆少杰");
        cc.setAge(2);
        System.out.println(cc.getName() + "," + cc.getAge());
        cc.eat();
        cc.teach();
        //cc.speak();//报错因为父类没有继承接口，就算子类继承了接口也不行！

        System.out.println("--------------------------");

        cc = new PingPangCoach("陆少杰", 12);
        System.out.println(cc.getName() + "," + cc.getAge());
        cc.eat();
        cc.teach();

        System.out.println("--------------------------");
//Animal a = new Cat();
        Player p = new PingPangPlayer();
        p.setName("李佳豪");
        p.setAge(2);
        System.out.println(p.getName() + "," + p.getAge());
        p.eat();
        p.study();
        System.out.println("-----------------------------");
        //p.speak();报错因为父类没有继承接口，就算子类继承了接口也不行！
//a = new Cat("英短", 2);//给A了一个新的的地址 因为又new了一次
        p = new PingPangPlayer("李佳豪", 3);
        System.out.println(p.getName() + "," + p.getAge());
        p.eat();
        p.study();

        System.out.println("----------------------------");
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("姚明");
        bp.setAge(35);
        System.out.println(bp.getName() + "," + bp.getAge());
        bp.eat();
        bp.study();
    }
}
