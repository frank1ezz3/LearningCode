package learningX.itheima_08多态.多态中的转型;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void playGame(){
        System.out.println("猫做迷藏");
    }
}
