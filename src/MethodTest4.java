public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};

        int number = getMax(arr);
        System.out.println("number:" + number);
    }

    public static int getMax(int[] arr) {
        int Max = arr[0];
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] > Max) {
                Max = arr[x];
            }
        }
        return Max;
    }
}
