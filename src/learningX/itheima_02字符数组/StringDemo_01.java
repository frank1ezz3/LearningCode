package learningX.itheima_02字符数组;

public class StringDemo_01 {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println("s1:" + s1);

        System.out.println("-------------------------");
        char[] chs = {'a', 'b', 'c'};//字符数组
        String s2 = new String(chs);
        System.out.println("s2:" + s2);

        System.out.println("-------------------------");
        byte[] bys = {97, 98, 99};//字节数组  97是a   98是b   99是c
        String s3 = new String(bys);
        System.out.println("s3:" + s3);

        System.out.println("-------------------------");
        String s4 = "abc";
        System.out.println("s4:" + s4);

    }
}
