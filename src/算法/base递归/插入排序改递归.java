package 算法.base递归;

public class 插入排序改递归 {
    public static void main(String[] args) {
        int[] arr = new int[]{3,1,2,5,4};
        insertSort(arr,arr.length-1);
        for (int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }



    static void insertSort(int arr[],int i ){
        if(i==0){
            return;
        }
        //先对i-1进行排序
        insertSort(arr,i-1);
        //保存arr
        int x = arr[i];
        int index =i-1;
        while(index>-1&&x<arr[index]){
            arr[index+1]=arr[index];
            index--;
        }
        arr[index+1]=x;
    }
}
