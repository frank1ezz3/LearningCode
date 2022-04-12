package learningX.itheima_18Date日期类.案例_二月天;

import java.util.Calendar;
import java.util.Scanner;
import java.util.concurrent.CancellationException;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个年份");
        int year = sc.nextInt();

        //设置日历对象的年月日
        Calendar c = Calendar.getInstance();
        c.set(year,2,1);

        //3月往前推一天，就是2月的最后一天
        c.add(Calendar.DATE,-1);

        //获取这一天输出即可
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年的2月有"+date+"天");

    }
}
