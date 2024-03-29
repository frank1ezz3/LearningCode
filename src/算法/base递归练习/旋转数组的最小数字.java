package 算法.base递归练习;
/*
把一个数组最开始的若干个元素搬到数组的末尾 称之为数组的选择
输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素
如：{3，4，5，1，2}为{1，2，3，4，5}的旋转，该数组的最小值为1
 */
public class 旋转数组的最小数字 {//二分法变式
    public static void main(String[] args) {
        int[] nums = new int[]{4,5,6,7,8,9,1,2,3};
        int ans = f(nums);
        System.out.println(ans);
    }

   private static int f(int[] nums){
        int low=0;
        int high= nums.length-1;

        //有没有这样一种可能，他没有反转
        if(nums[low]<nums[high])return nums[low];

        while(low+1<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>=nums[low]){
                low = mid;
            }else{
                high =mid;
            }
        }

        return nums[high];

    }
}
