package learningX.itheima_26进程和线程.线程优先级03;

public class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}
