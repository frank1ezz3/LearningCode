public class MethodTest2 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前：" + number);
        change(number);
        System.out.println("调用change方法后：" + number);
        System.out.println("---------------------------------------------");
        int[] arr ={10,20,30};
        System.out.println("调用change1方法前：" + arr[1]);
        change1(arr);
        System.out.println("调用change1方法前：" + arr[1]);

    }

    public static void change(int number) {//对于基本数据类型的参数，形参数的改变，不影响实际参数的值
        number = 200;
        System.out.println(number);
    }
    public static void change1(int[] arr) {//对于引用类型的参数，形式参数的改变，影响实际参数的值
        arr[1]=200;
        System.out.println(arr[1]);
    }

}
