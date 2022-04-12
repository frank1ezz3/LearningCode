package lanqiaobei2013;

//未来那一天的世纪末是礼拜天（按100年算）    注：国外的礼拜天是第一天
import java.util.Calendar;

public class A201301世纪末的星期 {
    public static void main(String[] args) {
        Calendar calendar =Calendar.getInstance();
        for(int year = 1999;year<10000;year+=100){
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,11);
            calendar.set(Calendar.DAY_OF_MONTH,31);
            System.out.println(year+" "+calendar.get(Calendar.DAY_OF_WEEK));
            if(calendar.get(Calendar.DAY_OF_WEEK)==1){
                System.out.println(year);
                break;
            }
        }
    }
}
