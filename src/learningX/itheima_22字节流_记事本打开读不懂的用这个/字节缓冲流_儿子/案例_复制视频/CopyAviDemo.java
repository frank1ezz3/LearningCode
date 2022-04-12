package learningX.itheima_22字节流_记事本打开读不懂的用这个.字节缓冲流_儿子.案例_复制视频;

//不打了滚吧，直接写答案，要打自己打，学前面的东西
//1.基本字节流 一次读写一个字节         65565毫秒
//2.基本字节流 一次读写一个字节数组     107  毫秒
//3.字节缓冲流 一次读写一个字节         405  毫秒
//4.字节缓冲流 一次读写一个字节数组     60   毫秒

public class CopyAviDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long endTime = System.currentTimeMillis();

        System.out.println(
                "共耗时："+(endTime - startTime)+"毫秒"
        );

    }

}
