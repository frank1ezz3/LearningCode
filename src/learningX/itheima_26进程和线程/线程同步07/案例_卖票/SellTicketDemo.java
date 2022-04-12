package learningX.itheima_26进程和线程.线程同步07.案例_卖票;

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();//t1进来后就会锁代码 运行了之后要睡眠 本应该抢到资源的t2 没办法只能等
        t2.start();//然后当t1输出了第100张票之后 才继续循环，之后锁就打开，3个继续争抢cpu
        t3.start();


    }
}
