package learningX.itheima_26进程和线程.继承Thread类的方法实现多线程01;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ;i<40;i++){
            System.out.println(i);
        }
    }
}
