package 算法.base递归;

public class 打印i到j {
    public static void main(String[] args) {
        f(8,10);
    }
    //注意死循环
    private static void f(int i,int j) {
        if(i>j){
            return;
        }
        System.out.println(i);
        f(i+1,j);
    }

}
