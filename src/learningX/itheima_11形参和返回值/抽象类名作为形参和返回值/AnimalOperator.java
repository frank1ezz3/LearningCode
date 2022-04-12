package learningX.itheima_11形参和返回值.抽象类名作为形参和返回值;

public class AnimalOperator {

    public void useAnimal(Animal a){//相当于Animal a = new Cat();
        a.eat();
    }

    public Animal getAnimal(){
        Animal a = new Cat();
        return a;
    }
}
