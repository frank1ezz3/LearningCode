package learningX.itheima_19异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 编译时异常和运行时异常 {
    public static void main(String[] args) {
        method();
        method2();
    }

    //编译时异常   代表有可能出现异常
    public static void method2(){
        try {
            String s = "2022-01-08 11:11:11";

            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            Date d = sdf2.parse(s);
            System.out.println(d);
        }catch (ParseException e){
            e.printStackTrace();
        }

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
