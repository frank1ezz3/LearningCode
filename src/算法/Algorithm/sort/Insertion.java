package 算法.Algorithm.sort;//插入排序//稳定！！！！！！！！！！！！！

public class Insertion {
    public static void sort(Comparable[] a) {//复杂度n^2-n
        for (int i = 0; i <= a.length - 1; i++) {
            //当前元素为a[i],依次和i墙面的元素比较，找到一个小于等于a[i]的元素
            for(int j = i;j>0;j--){
                if(greater(a[j-1],a[j])){
                    //如果发现前面的值比这个数大
                    exch(a,j-1,j);
                    //交换元素
                }else {
                    //位置到了，直接break不然会继续和前面比，是无效比较
                    break;
                }
            }
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
