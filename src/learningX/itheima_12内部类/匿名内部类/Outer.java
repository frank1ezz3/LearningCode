package learningX.itheima_12内部类.匿名内部类;

public class Outer {
    public void method(){

        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");//本质是一个继承了该类
                                                // 或者   or
                                                // 实现了该接口的子类匿名对象
            }
        }.show();
        System.out.println("-------------------------------");
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");//本质是一个继承了该类
                                                 // 或者   or
                                                 // 实现了该接口的子类匿名对象
            }
        }.show();
        System.out.println("--------------------------");

        Inter i =new Inter(){
            @Override
            public void show() {
                System.out.println("匿名内部类");//本质是一个继承了该类
                                                // 或者   or
                                                // 实现了该接口的子类匿名对象
            }
        };
        i.show();
        i.show();


    }
}
