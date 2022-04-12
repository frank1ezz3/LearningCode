package learningX.itheima_07继承的基本常识.方法重写的注意事项;

public class Zi extends Fu{
    /*
    @Override//私有方法不能被重新 不然会报错
     */
    private void show(){
        System.out.println("Zi中show（）方法被调用");
    }
    @Override
    public void method(){
        System.out.println("Zi中method（）方法被调用");//访问权限不能比父类低  没有 < public < private
    }
}
