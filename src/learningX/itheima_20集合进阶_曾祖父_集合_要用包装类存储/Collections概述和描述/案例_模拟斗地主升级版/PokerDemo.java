package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collections概述和描述.案例_模拟斗地主升级版;

import java.util.*;

public class PokerDemo {
    public static void main(String[] args) {
        //键是编号，值是牌
        Map<Integer, String> hm = new HashMap<>();//多列的元素
        //存储编号
        ArrayList<Integer> array = new ArrayList<>();
        //创建花色
        String[] colors = {"♦","♣","♥","♠"};

        String[] numbers ={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        int index=0;
        for(String number:numbers){
            for(String color:colors){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);

        //洗牌（洗的是index，为了保证编号是排序的，所以用TreeSet集合接收）
        TreeSet<Integer> ljh = new TreeSet<>();
        TreeSet<Integer> hzh = new TreeSet<>();
        TreeSet<Integer> cxy = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        Collections.shuffle(array);

        for(int i=0;i<array.size();i++){
            int x = array.get(i);
            if(i>=array.size()-3){
                dipai.add(x);
            }else if(i%3==0){//发牌嘛 一人一张轮回的嘛 所以就是这么写了
                ljh.add(x);
            }else if(i%3==1){
                hzh.add(x);
            }else if(i%3==2){
                cxy.add(x);
            }
        }
        lookPoker("ljh",ljh,hm);
        lookPoker("hzh",hzh,hm);
        lookPoker("cxy",cxy,hm);
        lookPoker("dipai",dipai,hm);
    }
    public static void lookPoker(String name,TreeSet<Integer> ts,Map<Integer, String> hm1){
        System.out.println(name+"的牌是");
        for(Integer key:ts){
            String poker = hm1.get(key);
            System.out.print(poker+"\t");
        }
        System.out.println();
    }
}
