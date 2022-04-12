package lanqiaobei2021;

import 算法.qwer;

import java.util.HashMap;
import java.util.Set;

public class B202102卡片 {
    /***
     用map记录卡片数量,每个数字拆开来减1
     */
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,2021);
        map.put(1,2021);
        map.put(2,2021);
        map.put(3,2021);
        map.put(4,2021);
        map.put(5,2021);
        map.put(6,2021);
        map.put(7,2021);
        map.put(8,2021);
        map.put(9,2021);
        int i=1;
        for (;; i++) {
            boolean flag = false;
            int num = i;
            while (true){
                int temp = num%10;
                if (map.get(temp)<=0){
                    flag = true;
                    break;
                }
                map.put(temp,map.get(temp)-1);
                num = num/10;
                if (num==0){

                    break;
                }
            }
            if (flag)break;;

        }
        Set<Integer> keySet = map.keySet();
        for (Integer key:keySet){
            //根据键去找值，用get（Object key）方法实现
            Integer value = map.get(key);
            System.out.println(key+","+value);
        }

        System.out.println(i-1);
    }
}