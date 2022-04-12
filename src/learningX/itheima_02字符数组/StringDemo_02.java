package learningX.itheima_02字符数组;

public class StringDemo_02 {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};//字符数组

        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";

        System.out.println(s1==s2);//比较地址是否相同
        System.out.println(s1==s3);
        System.out.println(s3==s4);
        System.out.println("---------------------");
        System.out.println(s1.equals(s2));//比较内容是否相同
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
