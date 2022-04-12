

public class MethodDemo2 {
    public static void main(String[] args) {

        System.out.println(isEvenNumber(10));//方法1

        boolean flag = isEvenNumber(9);//方法2

        System.out.println(flag);

        int result = getMax(10, 20);
        System.out.println(result);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getMax(int a, int b) {//形参数
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
