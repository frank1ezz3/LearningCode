package learningX.itheima_08多态.访问特点;

public class Cat extends Animal{
    public int age=20;
    public int weight = 10;

    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void playGame(){
        System.out.println("猫做迷藏");
    }
}
