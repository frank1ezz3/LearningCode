package learningX.itheima_26进程和线程.多线程实现方式06;

public class MyRunnableDemo {
    public static void main(String[] args) {
        //Runnable的好处是避免了java单继承的局限性
        //适合多个相同的程序的代码去处理同一个资源的情况，把线程和程序的代码数据有效分离
        //较好的体现了面向对象的设计思想
        MyRunnable my = new MyRunnable();
        Thread t1 = new Thread(my,"飞机");
        Thread t2 = new Thread(my,"炸弹");

        t1.start();
        t2.start();

    }
}
