package lanqiaobei2021;



public class Main {
    public static void main(String[] args) {
        String s = "123123";
        int i = Integer.parseInt(s);
        System.out.println(i);//String -->int
        Integer integer = Integer.valueOf(s);
        System.out.println(integer);//String --> Integer
        Integer zxc =12312123;
        String s1 = zxc.toString();//Integer -- > String
        System.out.println(s1);
        System.out.println(s.charAt(2));//取出String里的值
        System.out.println("_---------------------");

        String sb = "asd a";//String-->char
        char nums[] = sb.toCharArray();
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
        }
        System.out.println("qwe");
        System.out.println(sb.charAt(3));
        System.out.println("QWE");

        char chars[] = {'a','b','c'};//char-->String
        String s2 = String.valueOf(chars);
        System.out.println(s2);

        int num = 123321;//int -->String
        String str1 = num+"";
        String str2 = String.valueOf(num);
        System.out.println(str2);
        String str3 = Integer.toString(num);
    }

}