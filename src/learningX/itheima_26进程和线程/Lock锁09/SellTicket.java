package learningX.itheima_26进程和线程.Lock锁09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable {
    private int tickets = 100;
    private Lock lock = new ReentrantLock();//第二种方法


    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();//枷锁
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                    tickets--;
                }
            } finally {
                lock.unlock();//释放锁
            }
        }
    }
}
