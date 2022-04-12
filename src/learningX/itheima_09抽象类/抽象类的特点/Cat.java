package learningX.itheima_09抽象类.抽象类的特点;

public /*abstract*/class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");//继承了就要重写父类里面所有的静态方法 or 本身也是一个抽象类
    }
}
