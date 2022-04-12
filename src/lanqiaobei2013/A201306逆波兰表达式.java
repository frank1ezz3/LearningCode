package lanqiaobei2013;

//逆波兰表达式
/*
例如 3 + 5 * （2 + 6） - 1

人们需要括号来改变运算次序

 - + 3 * 5 + 2 6 1

但是用逆波兰表达式 可以不需要括号，机器可以用递归的方法很方便的求解

下面进行填空
 */

public class A201306逆波兰表达式 {
    static int[] evaluate(String x) {
        if (x.length() == 0) {
            return new int[]{0, 0};
        }
        char c = x.charAt(0);//获取第一个字符
        if (c >= '0' && c <= '9') {//这一个字符是0-9的数
            return new int[]{c - '0', 1};
        }
        int[] v1 = evaluate(x.substring(1));//第一个字符是运算符，截取后面的部分
        //填空-------------------------------------------------------------------------------
        int[] v2 = evaluate(x.substring(1 + v1[1])); //要可以截取到上一步没有处理到的部分____________________________

        int v = Integer.MAX_VALUE;
        if (c == '+') v = v1[0] + v2[0];
        if (c == '*') v = v1[0] * v2[0];
        if (c == '-') v = v1[0] - v2[0];

        return new int[]{v,1+v1[1]+v2[1]};
    }

    public static void main(String[] args) {
        System.out.println(evaluate("-+3*5+261")[0]);
    }
}
