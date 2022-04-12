package learningX.itheima_08多态.多态的好处和弊端;

public class AnimalOperator {
//    public void useAnimal(Cat c){//cat c = new cat();相当于创建了一个猫的对象
//        c.eat();
//    }
//    public void useAnimal(Dog d){
//        d.eat();
//    }

    //简便方法
    public void useAnimal(Animal a){
        a.eat();//编译看左边   运行看右边 所以输出子类
        //a.lookDoor();报错 因为他不能访问除重写以外特有的属性
    }
}
