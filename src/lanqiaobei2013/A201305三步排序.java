package lanqiaobei2013;
/*
分类排序
使得负数都靠左边，正数都靠右边，0在中间。
注：负数区域和整数区域内不要求有序，可以利用这个特点通过1次线性扫描就结束战斗

 */

public class A201305三步排序 {
    static void sort(int[] x){
        int p =0;
        int left = 0;
        int right=x.length-1;

        while(p<=right){
            if(x[p]<0){
                int t =x[left];
                x[left]=x[p];
                x[p]= t;
                left++;
                p++;
            }else if(x[p]>0){
                int t = x[right];
                x[right]=x[p];
                x[p]=t;
                right--;
            }else{
                //填空------------------------------------------------------------------------------------------
                p++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={-1,0,2,-3,6,-12};
        sort(arr);
        for (int i =0 ; i<= arr.length-1;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
