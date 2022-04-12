package 算法.base递归;


public class  递归{
    public static void main(String[] args) {
        f(10);


    }
    //注意死循环
    private static void f(int i) {
        if(i==0){
            return;
        }
        //调用自身
        f(i-1);
    }

}
