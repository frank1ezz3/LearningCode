package learningX.itheima_11形参和返回值;

public class CatOperator {
    public void useCat(Cat c){//形参Cat c = new Cat();
        c.eat();
    }
    public Cat getCat(){
        Cat c = new Cat();
        return c;
    }
}
