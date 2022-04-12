public class MethodDemo {
    public static void main(String[] args) {
        isEvenNumber(10);//实体参数

        isEvenNumber(9);

        getMax(10, 20);
        System.out.println("------------------------------------");
        int a = 30;
        int b = 25;
        getMax(a, b);
    }

    public static void isEvenNumber(int number) {//形参数

        if (number % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void getMax(int a, int b) {//形参数
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
