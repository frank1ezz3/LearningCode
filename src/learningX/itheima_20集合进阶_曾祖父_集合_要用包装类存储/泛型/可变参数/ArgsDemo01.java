package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型.可变参数;


public class ArgsDemo01 {
    public static void main(String[] args) {
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(10,20,30,40,50));//实现多个数求和

    }

    public static int sum(int... a){//如果有多个参数。。。写在最后一个变量
        int sum=0;
        for(int i : a ){
            sum+=i;
        }
        return sum;
    }
}
