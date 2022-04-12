package learningX.itheima_18Date日期类;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //public Date():分配一个Date对象
        Date d1 = new Date();
        System.out.println(d1);

        System.out.println("-----------------");

        //public Date(long date):
        long date = 1000 * 60 * 60;//1970年人类发明了计算机
        Date d2 = new Date(date);
        System.out.println(d2);

        System.out.println("-----------------");

        Date d = new Date();
        //public long getTime（）：获取的是日期对象从。。。到现在的毫秒值
        System.out.println(d.getTime());
        System.out.println(d.getTime() * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        System.out.println("-----------------");
        //public void setTime(long time):设置时间，给的是毫秒
        long time = 1000*60*60;
        d.setTime(time);
        System.out.println(d);

        System.out.println("-----------------");

        long time1 = System.currentTimeMillis();
        d.setTime(time1);
        System.out.println(d);
    }
}
