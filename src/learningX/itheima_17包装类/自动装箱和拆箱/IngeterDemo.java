package learningX.itheima_17包装类.自动装箱和拆箱;

public class IngeterDemo {
    public static void main(String[] args) {
        //装箱 把int装为Integer包装类类型
        Integer i = Integer.valueOf(100);
        Integer ii =100;//Integer.valueOf(100);

        //拆箱。把包装类拆为int类
        ii= ii.intValue()+200;
        System.out.println(ii);

        //自动拆箱
        ii+=200;
        System.out.println(ii);

        Integer iii = null;//iii调方法肯定是空指针 会报错   要先进行不为null的判断
        if(iii!=null){
            ii+=300;
        }


    }
}
