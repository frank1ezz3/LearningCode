package learningX.itheima_26进程和线程.线程同步07.案例_卖票version2;

public class SellTicket implements Runnable{
    private static int tickets=100;
    private Object obj = new Object();
    private int x=0;

    @Override
    public void run() {

        while(true){
            if(x%2==0) {
                synchronized (SellTicket.class) {//反射里要学 类名。class
                    if (tickets > 0) {

                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                        tickets--;
                    }
                }
            }else{
//                synchronized (obj) {
//                    if (tickets > 0) {
//
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
//                        tickets--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }

    }

    private static synchronized void sellTicket() {

        if (tickets > 0) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
            tickets--;
        }

    }
}
