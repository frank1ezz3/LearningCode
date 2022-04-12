package learningX.itheima_26进程和线程.线程优先级03;

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();

        //void srtName
        tp1.setName("炸弹");
        tp2.setName("飞机");//无参赋值

        System.out.println(tp1.getPriority());//5
        System.out.println(tp2.getPriority());//5

        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        System.out.println("------------------------------------------");
        tp1.setPriority(10);//范围：1-10//这个高只是获取cpu资源高，不代表一定会多，得多输出几个
        tp2.setPriority(1);//范围：1-10

        tp1.start();
        tp2.start();//自己看，挺搞得
    }

}
