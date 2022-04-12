package learningX.itheima_19异常;

public class JVM的默认处理方案 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        int[] arr={1,2,3};
        System.out.println(arr[1]);

//        System.out.println(arr[3]);//ArrayIndexOutOfBoundsException异常
    }
    /*
    开始
    Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	at learningX.itheima_19异常.JVM的默认处理方案.method(JVM的默认处理方案.java:11)
	at learningX.itheima_19异常.JVM的默认处理方案.main(JVM的默认处理方案.java:6)
     */
//报出异常后就会停止执行！
}
