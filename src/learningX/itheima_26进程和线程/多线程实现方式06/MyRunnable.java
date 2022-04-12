package learningX.itheima_26进程和线程.多线程实现方式06;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
