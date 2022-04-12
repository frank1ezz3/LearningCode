package lanqiaobei2020;

/*
1  2  6  7  15
3  5  8  14
4  9  13
10 12
11
 */


public class A202003蛇形填数 {
    public static void main(String[] args) {
        int ans = 1, t = 4;

        for (int i = 2; i <= 20; i++) {
            ans = ans +t;
            t=t+4;
        }

        System.out.println(ans);		//761
    }
}
