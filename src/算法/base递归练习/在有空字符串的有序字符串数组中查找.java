package 算法.base递归练习;
/*
有个排序后的字符串数组，
其中散布着一些空字符串，
编写一个方法，
找出给定字符串（肯定不是空字符串的索引）
 */
public class 在有空字符串的有序字符串数组中查找 {
    public static void main(String[] args) {
        String[] arr={"a","","ac","","ad","b","","ba"};
        int res = indexOf(arr,"b");
        System.out.println(res);
    }

    private static int indexOf(String[] arr, String target) {
        int low =0;
        int high = arr.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            while(arr[mid].equals("")){
                mid++;
                //找不到目标
                if(mid>high){
                    return -1;
                }
            }
            if(arr[mid].compareTo(target)>0){
                high = mid -1;
            }else if(arr[mid].compareTo(target)<0){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return 0;
    }

}
