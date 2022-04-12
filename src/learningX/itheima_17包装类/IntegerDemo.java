package learningX.itheima_17包装类;
// 基本数据类  包装类
//    byte    Byte
//    short   Short
//    int     Integer
//    long    Long
//    float   Float
//    double  Double
//    char    Character
//    boolean Boolean

public class IntegerDemo {
    public static void main(String[] args) {//包装类用于基本数据类型和字符串之间的转换
        //判断一个数是否在int范围内
        //public static final int MIN_VALUE;     2的31次方-1
        //public static final int MAX_VALUE;    负的上面
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

//        //通过构造方法
//        //public Integer(int value):根据int值创建Integer对象（过时）
//        Integer i1 = new Integer(100);
//        System.out.println(i1);
//        //public Integer(String value):根据String值创建Integer对象（过时）
//        Integer i2 = new Integer("100");//应该由数字组成的字符串
//        System.out.println(i2);

        //public static Integer valueOf(int i):返回表示指定的int的值的Integer实例
        Integer ii1 = Integer.valueOf(100);
        System.out.println(ii1);

        //public static Integer valueOf(String i):返回表示指定的String的值的Integer实例
        Integer ii2 = Integer.valueOf("100");
        System.out.println(ii2);

        System.out.println("----------------------------------------");

        int number = 100;//int ------>String
        //方法1
        String s1 =""+number;
        System.out.println(s1);
        //方法2
        //public static String valueOf(int i)
        String S1 = String.valueOf(number);
        System.out.println(s1);

        System.out.println("---------------------------------");

        String s = "100";//String------->int
        //方法1
        //String ---->Integer---->int
        Integer i = Integer.valueOf(s);
        //public int intValue()
        int x = i.intValue();
        System.out.println(x);

        //方法2
        //public static int parseInt(String s)
        int y = Integer.parseInt(s);
        System.out.println(y);

    }

}
