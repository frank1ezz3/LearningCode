package 算法.base递归;

public class 二分查找的递归排序 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,8,9};

        System.out.println(binarySearch(nums,0 ,7 ,3));
    }



    private static int binarySearch(int[] arr,int low,int high,int key){
        if(low>high)return -1;
        int mid = low +((high-low)>>1);
        int midVal = arr[mid];
        if(midVal<key){
            return binarySearch(arr,mid+1,high,key);
        }else if(midVal>key){
            return binarySearch(arr,low,mid+1,key);
        }else{
            return mid;
        }
    }
}
