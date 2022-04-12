package learningX.itheima_26进程和线程.生产者消费者10;

public class Box {
    private int milk;
    //定义一个成员变量，表示奶箱状态
    private boolean state = false;


    public synchronized void putniunai(int milk){
        if(state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果没有牛奶，就生产牛奶
        this.milk =milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱子");
        //生产完毕之后，修改奶箱状态
        state = true;

        //唤醒其他等待的线程
        notifyAll();

    }
    public synchronized void getniunai(){
        //如果没有牛奶，等待生产
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有牛奶，就消费牛奶
        System.out.println("用户拿到第"+this.milk+"瓶奶");
        //消费完毕之后，修改奶箱状态
        state = false;
        //唤醒其他等待的线程
        notifyAll();
    }
}
