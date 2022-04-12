package learningX.itheima_04StringBuilder;

public class StringBuilderDemo04 {
    public static void main(String[] args) {
        String s = "hello";

        //StringBuilder sb = s;这种写法是错误的因为不是一个类型
        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb);
    }
}
