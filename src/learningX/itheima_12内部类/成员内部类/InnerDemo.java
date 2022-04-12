package learningX.itheima_12内部类.成员内部类;

public class InnerDemo {
    public static void main(String[] args) {

//        Outer.Inner oi = new Outer().new Inner();
//        oi.show();

        Outer o = new Outer();//外界无法访问内部资源
        o.method();
    }
}
