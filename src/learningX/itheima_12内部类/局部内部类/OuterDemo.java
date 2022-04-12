package learningX.itheima_12内部类.局部内部类;

public class OuterDemo {
    public static void main(String[] args) {

        Outer o = new Outer();//局部内部类无法直接使用要在方法内创建对象并使用
        o.method();
    }
}
