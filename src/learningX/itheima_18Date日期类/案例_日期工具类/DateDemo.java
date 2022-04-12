package learningX.itheima_18Date日期类.案例_日期工具类;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        //创建日期对象
        Date d = new Date();

        String s1 = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtils.dateToString(d, "yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtils.dateToString(d, "HH:mm:ss");
        System.out.println(s3);

        //创建字符串
        String s ="2022-01-08 11:11:11";
        Date dd = DateUtils.StringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);
    }
}
