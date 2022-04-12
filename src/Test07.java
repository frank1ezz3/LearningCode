import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        Scanner sc = new Scanner(System.in);
        System.out.println("输入你要查找的数据:");
        int number = sc.nextInt();
        /*
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        System.out.println("idnex:" + index);
         */
        int index = getIndex(arr, number);
        System.out.println("index:" + index);
    }

    public static int getIndex(int[] arr, int number) {
        int index = -1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == number) {
                index = x;
                break;
            }
        }
        return index;
    }
}
