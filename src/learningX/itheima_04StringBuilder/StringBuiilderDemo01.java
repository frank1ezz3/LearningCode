package learningX.itheima_04StringBuilder;

public class StringBuiilderDemo01 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println("sb:" + sb);
        System.out.println("sb.length():" + sb.length());
        System.out.println("------------------");


        StringBuilder sb2 = new StringBuilder("helloworld");
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.length():" + sb2.length());
    }
}
