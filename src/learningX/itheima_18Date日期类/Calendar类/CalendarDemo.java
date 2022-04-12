package learningX.itheima_18Date日期类.Calendar类;

import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();//多态的形式得到对象
        System.out.println(c);

        System.out.println("-------------------------");

        //public int get(int field)
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + date + "日");

        System.out.println("-------------------------");

        //public abstract void add(int field,int amount):根据日历的规则，将指定的时间量添加或减去给定的日历字段
        //虽然是Abstract但是他源码里肯定重写过了
        c.add(Calendar.YEAR,3);//3年后
        c.add(Calendar.DATE,-5);//的5天前
        int year1 = c.get(Calendar.YEAR);
        int month1 = c.get(Calendar.MONTH) + 1;
        int date1 = c.get(Calendar.DATE);
        System.out.println(year1 + "年" + month1 + "月" + date1 + "日");

        System.out.println("-------------------------");

        c.set(2048,11,11);
        int year2 = c.get(Calendar.YEAR);
        int month2 = c.get(Calendar.MONTH);
        int date2 = c.get(Calendar.DATE);
        System.out.println(year2 + "年" + month2 + "月" + date2 + "日");
    }
}
