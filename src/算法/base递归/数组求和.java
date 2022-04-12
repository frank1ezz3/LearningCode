package 算法.base递归;

public class 数组求和 {
    public static void main(String[] args) {
        int ans=f(new int[]{1,2,3,4,5},0);
        System.out.println(ans);


    }
    //注意死循环
    private static int f(int[] arr ,int begin) {
        if(begin == arr.length-1){
            return arr[begin];
        }
        return arr[begin]+f(arr,begin+1);
    }

}
