package lanqiaobei2020;

import java.util.HashMap;

public class A202001门牌制作 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        map.put(3,0);
        map.put(4,0);
        map.put(5,0);
        map.put(6,0);
        map.put(7,0);
        map.put(8,0);
        map.put(9,0);

        for (int i = 1; i <= 2020; i++) {
            int num = i;
            while(num!=0){
                int tmp =num % 10;
                map.put(tmp,map.get(tmp)+1);
                num = num /10;
            }

        }
        //输出map
//        Set<Integer> keySet = map.keySet();
//        for (Integer key:keySet){
//            System.out.println(key);
//        }
        System.out.println(map.get(2));
    }
}
