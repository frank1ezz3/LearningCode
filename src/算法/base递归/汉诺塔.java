package 算法.base递归;

public class 汉诺塔 {
    public static void main(String[] args) {
        printHanoiTower(3,"A","B","C");
    }

    /**
     * 将N个盘子从source移动到目标的路径打印
     * @param N 初始的N个从小到达的盘子，N是最大编号
     * @param from_A 原始柱子
     * @param to_B 辅助的柱子
     * @param help_C 目标柱子
     */
    private static void printHanoiTower(int N, String from_A, String to_B, String help_C) {
        if(N==1){
            System.out.println("move"+N+"from"+from_A+"to"+to_B);
        }else{
            printHanoiTower(N-1,from_A,help_C,to_B);//先把前N-1个盘子挪到辅助空间上去
            System.out.println("move"+N+"from"+from_A+"to"+to_B);//N可以顺利到达目标
            printHanoiTower(N-1,help_C,to_B,from_A);//让N-1从辅助空间回到原来的空间上去

        }
    }
}
