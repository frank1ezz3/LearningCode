package learningX.itheima_19异常;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 异常处理之throws {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        try {
            method2();
        } catch (ParseException e) {//下面就算throws了，但是只是暂时的，用的时候还得trycatch
            e.printStackTrace();
        }
        System.out.println("结束");
    }
    public static void method2() throws ParseException {//异常处理的第二种方案，甩锅大法

            String s = "2022-01-08 11:11:11";
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date d = sdf2.parse(s);
            System.out.println(d);

    }

    //运行时异常     Runtime异常 可以不处理就运行
    public static void method(){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();

        }
    }
}
