package learningX.itheima_21File.递归.案例_递归求阶乘;

public class DiGuiDemo02 {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println("5的阶乘是："+result);
    }
    public static int jc(int n){
        if(n==1){
            return 1;
        }else{
            return n*jc(n-1);
        }
    }
}
