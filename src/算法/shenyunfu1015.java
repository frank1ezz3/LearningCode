package 算法;

import java.util.Scanner;

public class shenyunfu1015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = gcd(a, b);
        if(gcd(a,b)<0){
            c*=-1;
        }

        System.out.println("GCD(" + a + "," + b+") = " + c);
        sc.close();
    }

    private static int gcd(int a, int b) {
        if(b ==0)return a;
        return gcd(b,a%b);
    }
}
