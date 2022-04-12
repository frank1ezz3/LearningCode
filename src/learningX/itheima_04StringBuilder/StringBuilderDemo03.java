package learningX.itheima_04StringBuilder;

public class StringBuilderDemo03 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("hello");

        //String s = sb;这种写法是错误的因为不是一个类型

        //public String toString（） 通过toString（）就可以实现把StringBuilder转化为String
        String s = sb.toString();
        System.out.println(s);


    }
}
