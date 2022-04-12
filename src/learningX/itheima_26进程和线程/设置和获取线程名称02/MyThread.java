package learningX.itheima_26进程和线程.设置和获取线程名称02;

public class MyThread extends Thread{
    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0 ;i<40;i++){
            System.out.println(getName()+":"+i);
        }
    }
}
//<给名字>——下面默认是Thread
//    private volatile String name;

//<无参构造方法>--默认的
//    public Thread() {
//        this(null, null, "Thread-" + nextThreadNum(), 0);
//    }

//<带参构造方法>
//    public Thread(String name) {
//        this(null, null, name, 0);------------------------------------------->name
//    }

//    public Thread(ThreadGroup group, Runnable target, String name,------------>name
//                  long stackSize) {
//        this(group, target, name, stackSize, null, true);-------------------->name
//    }

//private Thread(ThreadGroup g, Runnable target, String name,----------------->name
//                   long stackSize, AccessControlContext acc,
//                   boolean inheritThreadLocals) {
//                      this.name = name
//                   }
//<重新赋值>
//    public final synchronized void setName(String name) {
//        checkAccess();
//        if (name == null) {
//            throw new NullPointerException("name cannot be null");
//        }
//
//        this.name = name;----------------------------------------------------->this.name
//        if (threadStatus != 0) {
//            setNativeName(name);
//        }
//    }
//<获取值>
//    public final String getName() {
//        return name;
//    }



//<返回内容>
//    private static int threadInitNumber;
//    private static synchronized int nextThreadNum() {
//        return threadInitNumber++;//后++所以返回先是0，后面是1，2，3，4，5，6，7，8，9
//    }


