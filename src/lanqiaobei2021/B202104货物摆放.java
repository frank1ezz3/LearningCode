package lanqiaobei2021;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class B202104货物摆放 {
    public static void main(String[] args) {
        long n = 2021041820210418l;
        long[] factor = new long[1000];
        int res = 0;
        int pos = 0;
        for(long i = 1; i * i <= n; i++){
            if(n % i == 0){
                factor[pos++] = i;
                if(i != n / i){
                    factor[pos++] = n / i;
                }
            }
        }
//        for (int i = 0; i < pos; i++) {
//            System.out.println(factor[i]);
//        }
//        System.out.println(pos);
        for(int i = 0; i < pos; i++){
            for(int j = 0; j < pos; j++){
//                if(factor[i] * factor[j] > n){
//                    continue;
//                }
                for (int k = 0; k < pos; k++) {
                    if(factor[i] * factor[j] * factor[k] == n){
                        res++;
                    }
                }
            }
        }
        System.out.println(res);
    }
}