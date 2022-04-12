package learningX.itheima_26进程和线程.线程控制04;

public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ThreadSleep ts3 = new ThreadSleep();

        ts1.setName("炸弹");
        ts2.setName("飞机");//无参赋值
        ts3.setName("连对");

        ts1.start();
        ts2.start();
        ts3.start();
    }
}
