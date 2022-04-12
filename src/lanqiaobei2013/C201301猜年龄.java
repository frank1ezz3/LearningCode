package lanqiaobei2013;
/*
我的年龄的立方是个4位数，我年龄的6次方是6位数，这10个数字正好包含了0-9这10个数字，每个都出现一次
问多少岁
 */

import java.util.HashSet;
import java.util.Set;

public class C201301猜年龄 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; i++) {
            int i1 = i * i * i;//3次方
            int i2 = i1 * i;//4次方
            String s1 = i1 + "";//整数转字符串
            String s2 = i2 + "";
            if (s1.length() == 4 && s2.length() == 6 && check(s1 + s2)) {
                System.out.println(i);
                break;
            }
        }
    }

    private static boolean check(String s) {
        Set<Character> set = new HashSet<>();
        for(int i =0 ;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size()==10;
    }
}
