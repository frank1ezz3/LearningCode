package 算法.Algorithm.sort;//希尔排序//不稳定！！！！！！！！！！

public class Shell {
    public static void sort(Comparable[] a) {//比选择排序快的多多多多多多多多多多
        //1.根据数组a的长度，确定增长量h的初始值
        int h =1;
        while(h<a.length/2){
            h=2*h+1;
        }
        while(h>=1){
            //2.1找到待插入的元素
            for(int i = h;i<a.length;i++){
                //2.2把待插入的元素插入到有序数列中
                for(int j =i;j>=h;j=j-h){
                    //比较这两个元素
                    if(greater(a[j-h],a[j])){
                        //交换元素
                        exch(a,j-h,j);
                    }else{
                        //已经换完了就结束
                        break;
                    }
                }
            }
            //减小h的值
            h=h/2;
        }
    }

    private static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
