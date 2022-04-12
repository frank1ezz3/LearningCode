package lanqiaobei2021;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class B202103直线 {

    //	static int N = 2, M = 3;
    static int N = 2, M = 3;
    static Map<Double, Set<Double>> map = new HashMap<>();

    //计算斜率
    public static double getK(int x1, int y1, int x2, int y2) {
        return (double) (y1 - y2) /(x1 - x2) ;
    }


    public static void main(String[] args) {

        for(int i = 0; i < N; i ++) {
            for(int j = 0; j < M; j ++) {
                //(i, j) --> (x, y)
                for(int x = 0; x < N; x ++) {

                    if( i == x) continue;
                    for(int y = 0; y < M; y ++) {
                        if( y == j) continue;
                        double k = getK(i, j, x, y);
                        double b = j - k * i;
                        if( !map.containsKey(k) ) {
                            System.out.println(k);
                            Set<Double> set = new HashSet<>();
                            set.add(b);
                            map.put(k, set);
                        }else {
                            Set<Double> set = map.get(k);
                            set.add(b);
                        }
                    }
                }

            }
        }
        int ans = 0;
        for(Map.Entry<Double, Set<Double>> entry: map.entrySet()) {
            ans += entry.getValue().size();
        }
        //47753
        System.out.println( ans +N +M);

    }

}

