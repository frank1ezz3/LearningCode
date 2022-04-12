package learningX.itheima_26进程和线程.线程控制04;

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println(getName() + ":" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
