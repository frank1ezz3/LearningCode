package 算法.Algorithm.sort;//冒泡排序;

import java.util.Arrays;//复杂度n^2/2-n/2//稳定！！！！！！！

public class Bubble {
    private static void sort(Comparable[] a){//找到排列中一个 比 后一个大的 排到他的后面 0（n^2）
        for(int i=a.length-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(greater(a[j],a[j+1])){
                    exch(a,j,j+1);
                }
            }
        }
    }

    private static boolean greater(Comparable v,Comparable w){
        return v.compareTo(w)>0;
    }

    private static void exch(Comparable[] a,int i ,int j){
        Comparable temp;
        temp =a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
