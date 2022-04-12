package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Collections概述和描述.案例_模拟斗地主;

import java.util.ArrayList;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        String[] colors = {"♦","♣","♥","♠"};

        String[] numbers ={"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String color:colors){
            for(String number:numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");

        System.out.println(array);

        ArrayList<String> ljh = new ArrayList<>();
        ArrayList<String> hzh = new ArrayList<>();
        ArrayList<String> cxy = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for(int i=0;i<array.size();i++){
            String poker = array.get(i);
            if(i>=array.size()-3){
                dipai.add(poker);
            }else if(i%3==0){//发牌嘛 一人一张轮回的嘛 所以就是这么写了
                ljh.add(poker);
            }else if(i%3==1){
                hzh.add(poker);
            }else if(i%3==2){
                cxy.add(poker);
            }
        }
        lookPoker("ljh",ljh);
        lookPoker("hzh",hzh);
        lookPoker("cxy",cxy);
    }

    public static void lookPoker(String name,ArrayList<String> array){
        System.out.println(name+"的牌是");
        for(String poker:array){
            System.out.print(poker+"\t");
        }
        System.out.println();
    }
}
