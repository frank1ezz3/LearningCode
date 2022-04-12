package learningX.itheima_13Math的常用方法;

public class MathDemo {
    public static void main(String[] args) {
        //public static double abs(int a)
        System.out.println(Math.abs(88));
        System.out.println(Math.abs(-88));//绝对值
        System.out.println("------------------------------------");

        //public static double ceil(double a)
        System.out.println(Math.ceil(12.34));
        //返回大于or等于参数的最小double值，等于一个整数
        System.out.println(Math.ceil(12.56));
        System.out.println("------------------------------------");

        //public static double floor(double a)
        System.out.println(Math.floor(12.34));
        //返回小于or等于参数的最小double值，等于一个整数
        System.out.println(Math.floor(12.56));
        System.out.println("------------------------------------");

        //public static int max(int a,int b)//最大值
        System.out.println(Math.max(66,88));
        //public static int min(int a,int b)//最小值
        System.out.println(Math.min(66,88));
        System.out.println("------------------------------------");

        //public static double pow(double a,double b)//a的b次幂
        System.out.println(Math.pow(2.0,3.0));
        System.out.println("------------------------------------");

        //public static double random());//初始返回值随机[0.0—1.0)的数
        System.out.println(Math.random());
        System.out.println(Math.random()*100);
        System.out.println((int)(Math.random()*100)+1);



    }
}
