package lanqiaobei2017;
/*
X星球的一处迷宫游乐场建在某个小山坡上
它是由10*10相互连通的小房间组成的

房间的地板上写着一个很大字母
我们假设玩家是面朝上坡的方向站立：
则：
Left表示走到左边的房间
Right表示走到右边的房间
U表示走到上坡方向的房价
D表示走到下坡方向的房间

X星球的居民有点懒，不愿意费力思考
他们喜欢玩运气类游侠，

开始的时候，直升机把100名玩家放入一个个小房间内
玩家一定要按照地上的字母移动

问多少个人会在里面兜圈子

迷宫地图如下


 */
public class A201701迷宫 {
    static String[] data=new String[10];

    static int ans;
    static int[][] vis = new int[10][10];
    static boolean solve(int i , int j ){
        if(i<0||i>9||j<0||j>9)return true;
        if(vis[i][j]==1)return false;
        vis[i][j]=1;
        switch (data[i].charAt(j)){
            case 'U':
                return solve(i-1,j);
            case 'D':
                return solve(i+1,j);
            case 'L':
                return solve(i,j-1);
            case 'R':
                return solve(i,j+1);
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        data[0]="UDDLUULRUL";
        data[1]="UURLLLRRRU";
        data[2]="RRUURLDLRD";
        data[3]="RUDDDDUUUU";
        data[4]="URUDLLRRUU";
        data[5]="DURLRLDLRL";
        data[6]="ULLURLLRDU";
        data[7]="RDLULLRDDD";
        data[8]="UUDDUDUDLL";
        data[9]="ULRDLUURRR";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                clr(vis);
                boolean res = solve(i,j);
                System.out.println(vis[i][j]);
                if(res)ans++;
            }
        }
        System.out.println(ans);
    }
    private static void clr(int[][] vis){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                vis[i][j]=0;
            }
        }
    }
}
