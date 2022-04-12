package lanqiaobei2013;
/*
　很久以前，T王国空前繁荣。为了更好地管理国家，王国修建了大量的快速路，用于连接首都和王国内的各大城市。

　　为节省经费，T国的大臣们经过思考，制定了一套优秀的修建方案，使得任何一个大城市都能从首都直接或者通过其他大城市间接到达。同时，如果不重复经过大城市，从首都到达每个大城市的方案都是唯一的。

　　J是T国重要大臣，他巡查于各大城市之间，体察民情。所以，从一个城市马不停蹄地到另一个城市成了J最常做的事情。他有一个钱袋，用于存放往来城市间的路费。

　　聪明的J发现，如果不在某个城市停下来修整，在连续行进过程中，他所花的路费与他已走过的距离有关，在走第x千米到第x+1千米这一千米中（x是整数），他花费的路费是x+10这么多。也就是说走1千米花费11，走2千米要花费23。

　　J大臣想知道：他从某一个城市出发，中间不休息，到达另一个城市，所有可能花费的路费中最多是多少呢？

输入格式
　　输入的第一行包含一个整数n，表示包括首都在内的T王国的城市数
　　城市从1开始依次编号，1号城市为首都。
　　接下来n-1行，描述T国的高速路（T国的高速路一定是n-1条）
　　每行三个整数Pi, Qi, Di，表示城市Pi和城市Qi之间有一条高速路，长度为Di千米。
输出格式
　　输出一个整数，表示大臣J最多花费的路费是多少。
样例输入
5
1 2 2
1 3 1
2 4 5
2 5 4
样例输出
135
样例说明
　　大臣J从城市4到城市5要花费135的路费。

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A201310大臣的旅费 {
    static int n;//表示包括首都在内的T王国的城市数
    private static List<Node>[] g;
    private static long max = -1;
    private static int pnt = -1;

    static long dis2money(long dis) {
        return 11 * dis + dis * (dis - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        g = new List[n + 1];//因为编号是从1开始的所以
        for (int i = 1; i <= n; i++) {
            g[i] = new ArrayList<Node>();//初始化每一个数组
        }
        for (int i = 0; i < n - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            g[a].add(new Node(b, c));//写入一个点可以到另一个点的编号和距离
            g[b].add(new Node(a, c));//因为是双向的所以还得写个这个
        }
        //要以1为根，找出一个端点再立树
        dfs(1, 1, 0);
        System.out.println(pnt);//打印找到的端点
        dfs(pnt, pnt, 0);
        System.out.println(dis2money(max));//打印找到的长度
    }

    //from 来自上一个点的编号   num 当前的点   dis 历史上积累的距离
    private static void dfs(int from, int num, int dis) {
        boolean isLeaf = true; //是一个叶子节点
        List<Node> neighbors = g[num];//罗列所有num的邻居的数组
        for (int i = 0; i < neighbors.size(); i++) {//遍历所有邻居
            Node neighbor = neighbors.get(i);//取出其中遍历的一个编号和下面进行判断
            if (neighbor.num == from) continue;//判断是否是来的节点，是就直接再循环
            isLeaf = false;//判断，如果上面全都是contiune，他就没有机会把isLeaf改成false
                           //那么真相只有一个：这个节点，他就是叶子节点了！！！！！！！！！！
            dfs(num, neighbor.num, dis + neighbor.dis);//递归下一个节点（neighb.num）
        }
        if (isLeaf && dis > max) {//是叶子节点，那么就可以赋值了并且dis要大于max，如果不大于max的话，就找不到最大的点了
            max = dis;
            pnt = num;
        }

    }

    static class Node {
        int num;//编号
        int dis;//两点间的距离

        public Node(int num, int dis) {
            this.num = num;
            this.dis = dis;
        }
    }
}
