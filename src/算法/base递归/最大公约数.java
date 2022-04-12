package 算法.base递归;

public class 最大公约数 {
    public static void main(String[] args) {
        System.out.println(gcd(10,55));
    }

    static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}
