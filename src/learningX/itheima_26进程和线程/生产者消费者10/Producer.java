package learningX.itheima_26进程和线程.生产者消费者10;

public class Producer implements Runnable {
    private Box b;

    public Producer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        for (int i = 1; i <=12; i++) {
            b.putniunai(i);
        }
    }
}
