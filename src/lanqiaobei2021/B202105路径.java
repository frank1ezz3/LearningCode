package lanqiaobei2021;

public class B202105路径 {

    static final int n = 2021;
    //求ab之间的最大公约数
    static int gcd(int a,int b){
        return b == 0 ? a : gcd(b,a%b);
    }
    //求ab之间的最小公倍数
    static int lcm(int a,int b){
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        //记录两点之间的边长，初始值都为零，如果数组某点未变化则说明两点之间没有边长
        int[][] floyd = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n && j < i+22 ; j++) {
                //根据题意可知两点之间的边长相等且等于最小公倍数，如果两点之间的差值大于21，两点间没有边长
                floyd[i][j] = floyd[j][i] = lcm(i+1,j+1);
            }
        }
        //弗洛伊德算法
        for (int k = 0; k < n; k++) {
            //中介点为k
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    //（i和k、k和j之间的边长不为零且（i和j之间没有边长或者通过中介点k，i到k，k到j的距离之和小于i到j的距离））成立则替换i到j的距离
                    if(floyd[i][k] != 0 && floyd[k][j] != 0 && (floyd[i][j] == 0 || floyd[i][k] + floyd[k][j] < floyd[i][j]))
                        floyd[i][j] = floyd[i][k] + floyd[k][j];
                }
            }
        }
        //经过循环后，找出数组存储1到点2021之间的数据，该数据则为最短距离。
        System.out.println(floyd[0][n-1]);

    }

}
