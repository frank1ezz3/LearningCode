package learningX.itheima_26进程和线程.线程同步07.案例_卖票;

public class SellTicket implements Runnable{//说到底就是因为同步 就会出现一样的数字的问题
    private int tickets=100;
    private Object obj = new Object();//所以得上锁

    @Override
    public void run() {
        //相同的票出现了多次
        // 若t1抢到了cpu 输出后sleep了100毫秒，就到t2抢到
        while(true){
            synchronized (obj){//任意对象
                if(tickets>0){
                    //通过sleep（）模拟出票的时间
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //假设按线程都醒过来
                    //t1抢到cpu在控制台输出，窗口一为100张
                    //假设t2抢到那他也会输出100张，以此类推，就会出现三个100的情况
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+tickets+"张票");
                    tickets--;
                }
            }

        }

    }
}
