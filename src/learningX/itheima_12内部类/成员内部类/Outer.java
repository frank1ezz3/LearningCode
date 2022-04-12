package learningX.itheima_12内部类.成员内部类;

public class Outer {
    private int num = 10;
//    public class Inner{
//        public void show(){
//            System.out.println(num);
//        }
//    }//写法不常见
    private class Inner{
        public void show(){
            System.out.println(num);//method调用这里
        }
    }
    public void method(){
        Inner i =new Inner();//Demo调用这里
        i.show();

    }

}
