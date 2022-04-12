package learningX.itheima_08多态.多态中的转型;

public class AnimalDemo {
    public static void main(String[] args) {
        //多态
        Animal a = new Cat();//向上转型
        a.eat();
        //a.playGame();//会报错因为父类没有

//        Cat c = new Cat();
//        c.eat();
//        c.playGame();//用的猫的方法

        Cat c =(Cat)a;//向下转型//要先向上转型才能向下转型
        c.eat();
        c.playGame();


    }
}
