package 算法.base递归;

public class 希尔排序_插入排序的变体 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,5,4};
        shellSort(arr);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    static void shellSort(int[] arr) {
        //不断缩小间隔的量
        for (int interval = arr.length / 2; interval > 0; interval = interval / 2) {
            for (int i = interval; i < arr.length; i++) {
                int target = arr[i];
                int j = i - interval;
                while (j > -1 && target < arr[j]) {
                    arr[j + interval] = arr[j];
                    j -= interval;
                }
                arr[j + interval] = target;
            }
        }
    }
}
