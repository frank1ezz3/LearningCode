package learningX.itheima_19异常;

public class 异常处理try_catch {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }
    public static void method(){
        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("您访问的数组索引不存在");//往下执行了

        }
        try{
            int[] arr={1,2,3};
            System.out.println(arr[3]);
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();//这个任然往下执行了 ^ ^

        }
    }
}
