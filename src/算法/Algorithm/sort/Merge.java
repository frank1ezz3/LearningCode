package 算法.Algorithm.sort;//归并排序//时间复杂度n*logn//稳定！！！！！！！！！！

public class Merge {
    //归并所需要的辅助数组
    private static Comparable[] assist;

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //对数组a中的元素进行排序
    public static void sort(Comparable[] a){
        //初始化辅助数组assist；
        assist = new Comparable[a.length];
        //2.定义io遍历和hi遍历，记录最小的索引和最大的索引
        int lo = 0 ;
        int hi = a.length-1;
        //3.调用sort重载方法完成数组a中，从索引lo到所有hi的元素排序
        sort(a,lo,hi);
    }
    private static void sort(Comparable[]a,int lo,int hi){
        //做安全检查
        if(hi<=lo){
            return;
        }
        //对lo到hi之间的数据进行分为两个组
        int mid = lo+(hi-lo)/2;//5  ，  9  mid=7
        //分别对每一组数据进行排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        //再把两个组中的数据进行归并
        merge(a,lo,mid,hi);
    }

    private static void merge(Comparable[]a,int lo,int mid,int hi){
        //定义三个指针
        int i= lo;
        int p1=lo;
        int p2=mid+1;
        //遍历lo和hi的指针，比较对应索引的值，找出小的那个放到辅助数组中去
        while(p1<=mid && p2<=hi){
            //比较对应索引处的值
            if(less(a[p1],a[p2])){
                assist[i++]=a[p1++];
            }else{
                assist[i++]=a[p2++];
            }
        }
        //因为两个指针都有可能都走完
        //遍历：如果p2走完了p1的指针还没有走完
        //那么就把对应的元素放到辅助数组的对应索引处
        while(p1<=mid){
            assist[i++]=a[p1++];
        }
        while(p2<=hi){
            assist[i++]=a[p2++];
        }
        //把辅助数组中的元素拷贝到原数组中
        for(int index = lo;index<=hi;index++){
            a[index]=assist[index];
        }


    }



}
