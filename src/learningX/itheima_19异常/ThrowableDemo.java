package learningX.itheima_19异常;

public class ThrowableDemo {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException(xxx);//带参数的，在非常多的父类中带的
        } catch (ArrayIndexOutOfBoundsException e) {//这个e是异常创建的对象 下面也是可以调用的
//            e.printStackTrace();//这个任然往下执行了 ^ ^
            //一般用上面这个！！！！！！！！！！！！！！！！！！！！！！！！！

            //public String getMessage();返回此throwable的详细消息字符串
            System.out.println(e.getMessage());
            //输出Index 3 out of bounds for length 3

            //public String toString();返回此可抛出简短的描述
            System.out.println(e.toString());
            //java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3


        }
    }

}

//public class throwable {
//    public String getMessage() {
//        return detailMessage;
//    }
//}