package lanqiaobei2013;


import java.util.ArrayList;

/*
    4位数 颠倒必须可读 一个牌价赔了200多 一个牌价赚了800多  共计赚了558  问 赔钱的那个的正确价格是啥
 */
public class A201304颠倒的价牌 {

    public static void main(String[] args) {
        System.out.println(reverse("1658"));
        ArrayList<Price> a1 = new ArrayList<Price>();
        ArrayList<Price> a2 = new ArrayList<Price>();
        //枚举四位数，简单筛选
        for(int i = 1000;i<10000;i++) {
            //将其颠倒，和原价做差，将赔200多的放入一个集合 ，将赚800多的放入一个集合
            String s =""+i;//整数转字符串（就是整一个空串 然后+i就完事了）
            if(s.contains("3")||s.contains("4")||s.contains("7"))continue;
            String reserve1 = reverse(s);//反转
            int il = Integer.parseInt(reserve1);//解析为另外一个整数
            int plus = il -i;
            if(plus< -200 && plus >-300)a1.add(new Price(i,plus));
            if(plus< 900 && plus > 800)a2.add(new Price(i,plus));
        }
        //遍历两个集合 两两组合 ，检查是否相加位558
        for (Price p1:a1
             ) {
            for (Price p2:a2
                 ) {
                if(p1.plus+p2.plus==558){
                    System.out.println(p1.p+" "+ p1.plus);
                    System.out.println(p2.p +" "+p2.plus);
                }
            }
        }
    }

    private static String reverse(String s) {
        char[] ans = new char[s.length()];
        for(int i = s.length()-1,j=0;i>=0;i--,j++){
            char c = s.charAt(i);
            if(c == '6'){
                ans[j]='9';
            }else if(c == '9'){
                ans[j] = '6';
            }else {
                ans[j] =c;
            }
        }
        return new String(ans);
    }

    private static class Price{
        int p ;//原价
        int plus;//颠倒价-原价

        public Price(int p, int plus) {
            this.p = p;
            this.plus = plus;
        }
    }
}
