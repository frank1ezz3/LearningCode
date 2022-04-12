package learningX.itheima_11形参和返回值;

public class CatDemo {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();//方法的形参是类名，其实需要的是该类的对象
        Cat c = new Cat();
        co.useCat(c);

        Cat c2 = co.getCat();//方法的返回值是类名，其实返回的是该类的对象
        c2.eat();
    }
}
