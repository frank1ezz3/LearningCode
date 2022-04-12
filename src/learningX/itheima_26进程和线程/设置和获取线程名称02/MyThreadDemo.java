package learningX.itheima_26进程和线程.设置和获取线程名称02;

public class MyThreadDemo {
    public static void main(String[] args) {
//        MyThread my1 = new MyThread();
//        MyThread my2 = new MyThread();
//
//        //void srtName
//        my1.setName("炸弹");
//        my2.setName("飞机");//无参赋值
//
//
//
//        my1.start();
//        my2.start();//自己看，挺搞得
        //    public static native Thread currentThread();返回对当前正在执行的线程对象的引用
        System.out.println(Thread.currentThread().getName());
    }
}
