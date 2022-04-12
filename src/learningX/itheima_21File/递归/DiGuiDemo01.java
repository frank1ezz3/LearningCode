package learningX.itheima_21File.递归;

//递归问题就是要定义一个方法

public class DiGuiDemo01 {
    public static void main(String[] args) {//1，2，2，3，4，8斐波那契数列
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
        }
        System.out.println(arr[19]);
        System.out.println(f(20));//得写个出口ifelse，否则StackOverflowError//递归太深
    }

    public static int f(int n){//递归一定要有出口
        if(n==1||n==2){
            return 1;
        }else{
            return f(n-1)+f(n-2);
        }
    }
}
