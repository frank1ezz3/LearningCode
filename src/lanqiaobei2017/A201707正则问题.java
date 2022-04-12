package lanqiaobei2017;
/*
资源限制
时间限制：1.0s   内存限制：256.0MB
　　考虑一种简单的正则表达式：
　　只由 x ( ) | 组成的正则表达式。
　　小明想求出这个正则表达式能接受的最长字符串的长度。

　　例如 ((xx|xxx)x|(x|xx))xx 能接受的最长字符串是： xxxxxx，长度是6。
输入格式
　　----
　　一个由x()|组成的正则表达式。输入长度不超过100，保证合法。
输出格式
　　----
　　这个正则表达式能接受的最长字符串的长度。

　　例如，
输入格式
　　((xx|xxx)x|(x|xx))xx

　　程序应该输出：
　　6

　　资源约定：
　　峰值内存消耗（含虚拟机） < 256M
　　CPU消耗 < 1000ms


　　请严格按要求输出，不要画蛇添足地打印类似：“请您输入...” 的多余内容。

　　注意：
　　main函数需要返回0;
　　只使用ANSI C/ANSI C++ 标准;
　　不要调用依赖于编译环境或操作系统的特殊函数。
　　所有依赖的函数必须明确地在源文件中 #include <xxx>
　　不能通过工程设置而省略常用头文件。

　　提交程序时，注意选择所期望的语言类型和编译器类型。
 */

import java.util.Scanner;

import static java.lang.Math.max;

public class A201707正则问题 {
    static String s;
    static int len;//长度
    static int pos;//走到的点位

    static int f() {
        int m = 0;//ans
        int tmp = 0;//用于保存下标到结束能匹配的字符串的长度
        while (pos < len) {
            if (s.charAt(pos) == '(') {
                pos++;
                tmp += f();//等待后面的结果并累加到ans
            } else if (s.charAt(pos) == 'x') {
                pos++;
                tmp++;
            } else if (s.charAt(pos) == '|') {
                pos++;
                m = max(m, tmp);
                tmp=0;
            } else if (s.charAt(pos) == ')') {
                pos++;
                m = max(m, tmp);//做大的|运算
                return m;
            }
        }
        m = max(m, tmp);
        return m;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        len = s.length();
        int ans = f();
        System.out.println(ans);
    }
}
