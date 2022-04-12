package 算法.深入递归;

import java.util.HashSet;
import java.util.Set;

/*
实现一种，打印n对括号的全部有效数组（及左右括号正确配对）
示例 3
、、、、输出 （（（）））  ， （（）（）） ， （）（）（）， （）（（）） ， （（））（）
 */
public class 合法括号 {
    public static void main(String[] args) {
        合法括号 obj = new 合法括号();
        Set<String> f = obj.f(4);
        System.out.println(f);

    }

    public Set<String> f(int n){
        Set<String> res = new HashSet<>();//更新上一次的代码
        res.add("()");
        if(n==1)return res;
        for (int i = 2; i <=n ; i++) {
            Set<String> resNew = new HashSet<>();
            for(String e : res){
                resNew.add(e+"()");
                resNew.add("("+e+")");
                resNew.add("()"+e);
            }
            res = resNew;
        }
        return res;
    }
}
