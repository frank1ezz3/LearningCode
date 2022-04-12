package learningX.itheima_07继承的基本常识.案例_猫和狗;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
    public void lookDoor(){
        System.out.println("狗看门");
    }
}
