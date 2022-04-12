package learningX.itheima_26进程和线程.生产者消费者10;

public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b = b;
    }

    @Override
    public void run() {
        while (true) {
        b.getniunai();
    }
}
}
