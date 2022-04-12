package 算法.base递归练习;
/*
(1,9,2,5,7,3,4,6,8,0)中最长的递增子序列为（3，4，6，8）
 */
public class 最长连续递增子序列 {
    static int max=0;
    public static void main(String[] args) {
        int[] nums = new int[]{1,9,2,5,7,3,4,6,8,0};
        int ans = f(nums);
        for (int i = ans; i <ans+max ; i++) {
            System.out.print(nums[i]+" ");
        }

    }

    private static int f(int[] nums) {
        int count=1;

        int start=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]<nums[i+1]){
                count++;
            }else{
                count=1;
            }
            if(count>max){
                max = count;
                start = i-max+2;
            }
        }
        return start;
    }


}
