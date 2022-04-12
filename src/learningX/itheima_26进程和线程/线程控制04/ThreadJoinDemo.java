package learningX.itheima_26进程和线程.线程控制04;

public class ThreadJoinDemo {
    public static void main(String[] args){
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("炸弹");
        tj2.setName("飞机");//无参赋值
        tj3.setName("连对");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
