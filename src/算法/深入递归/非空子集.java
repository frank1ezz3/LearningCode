package 算法.深入递归;

import java.util.HashSet;
import java.util.Set;

/*
返回某集合的所有子集
如
{A,B,C}
返回
{A} {B} {C} {A,B} {A,C},{B,C} {A,B,C}
 */
public class 非空子集 {
    public static void main(String[] args) {
        非空子集 obj = new 非空子集();
        int[] a = new int[]{1,2,3};
        Set<Set<Integer>> f = obj.f(a,3);
        System.out.println(f);
    }
    /*逐步生成迭代大法*/
    private Set<Set<Integer>> f(int[] A,int n){
        Set<Set<Integer>> res = new HashSet<>();
        res.add(new HashSet<>());//初始化为空集
        for (int i = 0; i < n; i++) {
            Set<Set<Integer>> resNew = new HashSet<>();
            resNew.addAll(res);
            //遍历之前的集合，对于当前元素可以加进去，或者不加进去
            for (Set e:
                 res) {
                Set a =(Set)((HashSet)e).clone();
                a.add(A[i]);
                resNew.add(a);
            }
            res = resNew;
        }

        return res;
    }

}
