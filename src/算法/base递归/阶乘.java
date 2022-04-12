package 算法.base递归;

public class 阶乘 {
    public static void main(String[] args) {
        System.out.println(f(5));

    }
    //注意死循环

    /**
     * 找重复n*（n-1）的阶乘，求n-1的阶乘是原问题的重复（规模更小）-子问题
     * 找变化，找边界
     * @param i
     */
    private static int f(int i) {
        if(i==1){
            return 1;
        }
        return i*f(i-1);
    }

}
