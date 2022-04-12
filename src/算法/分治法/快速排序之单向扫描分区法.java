package 算法.分治法;

public class 快速排序之单向扫描分区法 {
//仅仅只用了快速排序而已
//    public static void quickSort(int[] arr,int low,int high){
//        int i,j,temp,t;
//        if(low>high){
//            return;
//        }
//        i=low;
//        j=high;
//        //temp就是基准位
//        temp = arr[low];
//
//        while (i<j) {
//            //先看右边，依次往左递减
//            while (temp<=arr[j]&&i<j) {
//                j--;
//            }
//            //再看左边，依次往右递增
//            while (temp>=arr[i]&&i<j) {
//                i++;
//            }
//            //如果满足条件则交换
//            if (i<j) {
//                t = arr[j];
//                arr[j] = arr[i];
//                arr[i] = t;
//            }
//
//        }
//        //最后将基准为与i和j相等位置的数字交换
//        arr[low] = arr[i];
//        arr[i] = temp;
//        //递归调用左半数组
//        quickSort(arr, low, j-1);
//        //递归调用右半数组
//        quickSort(arr, j+1, high);
//    }

    public static void swap(int array[],int a,int b){//交换函数
        int temp;
        temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }
    public  static int Partition(int r[],int low,int high){
        int i=low ;
        int j=high;
        int pivot=r[low];//基准元素
        while(i<j) {
            while (i < j && r[j] > pivot) //向左扫描
                j--;

            if (i < j) {
                swap(r, i++, j);
            }
            while (i < j && r[i] <= pivot) {//向右扫描
                i++;
            }
            if (i < j) {
                swap(r, i, j--);
            }
        }

        return i;
    }
    public static void QuickSort(int R[],int low,int high){//快速排序递归算法
        int mid;
        if(low<high){
            mid=Partition(R,low,high);//基准位置
            QuickSort(R,low,mid-1);//左区间递归快速排序
            QuickSort(R,mid+1,high);//右区间递归快速排序
        }
    }

    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        QuickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
