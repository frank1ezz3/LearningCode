package lanqiaobei2017;

/*
6*6的方格 沿着格子的边线剪开成两部分
要求这两部分的形状完全一样

试计算
包括这三种分法在内，一共有多少种不同的解法
注意：旋转对称的属于同一种解法
 */
public class A201704方格分割 {
    static int ans;
    static int[][] dire = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int[][] vis = new int[7][7];

    static void dfs(int x, int y) {
        if (x == 0 || y == 0 || x == 6 || y == 6) {
            ans++;
            return;
        }
        //当前的坐标已经访问
        vis[x][y] = 1;
        //对称点也标注为已访问
        vis[6 - x][6 - y] = 1;
        for (int k = 0; k < 4; ++k) {
            int nx = x + dire[k][0];
            int ny = y + dire[k][1];
            //新坐标
            if (nx < 0 || nx > 6 || ny < 0 || ny > 6) continue;
            if (0 == vis[nx][ny]) {
                dfs(nx, ny);
            }
        }
        vis[x][y] = 0;
        vis[6 - x][6 - y] = 0;
    }

    public static void main(String[] args) {
        dfs(3, 3);
        System.out.println(ans / 4);
    }
}
