package learningX.itheima_26进程和线程.继承Thread类的方法实现多线程01;

public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread();
        MyThread my2 = new MyThread();

//        my1.run();
//        my2.run();//run并没有真正启动线程 要用start

        my1.start();
        my2.start();//自己看，挺搞得
    }
}
