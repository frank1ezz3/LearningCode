package learningX.itheima_18Date日期类.SimpleDateFormat类的概述;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //从Date————————>String
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日HH：mm：ss");
        String s = sdf.format(d);
        System.out.println(s);

        //从String------------>Date
        String ss = "2022-01-08 11:11:11";

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd = sdf2.parse(ss);
        System.out.println(dd);
    }


}
