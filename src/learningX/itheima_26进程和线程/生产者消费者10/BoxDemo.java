package learningX.itheima_26进程和线程.生产者消费者10;

public class BoxDemo {
    public static void main(String[] args) {
        //创建奶箱对象
        Box b = new Box();

        //创建生产者对象，把奶箱对象作为构造方法参数传递，因为在这个类中要调用存储牛奶的操作
        Producer p = new Producer(b);

        Customer c = new Customer(b);


        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
