package lanqiaobei2017;
/*
由A,B,C这3个字母就可以组成许多串
比如“A” “AB” “ABC” "ABA" "AACBB"

如果每一个字母的个数有限定 能组成多少个已知长度的串呢？

 */
public class A201705字母组串 {
    static int f(int a ,int b , int c ,int n){
        if(a<0||b<0||c<0)return 0 ;
        if(n==0)return 1;
        return f(a-1,b,c,n-1)+f(a,b-1,c,n-1)+f(a,b,c-1,n-1);
    }

    public static void main(String[] args) {
        System.out.println(f(1,1,1,2));
    }
}
