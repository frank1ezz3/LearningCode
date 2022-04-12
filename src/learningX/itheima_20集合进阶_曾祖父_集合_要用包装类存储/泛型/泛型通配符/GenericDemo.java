package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型.泛型通配符;

import java.util.ArrayList;

public class GenericDemo {
    public static void main(String[] args) {
        //类型通配符：<?>
        ArrayList<?> list1 = new ArrayList<Object>();
        ArrayList<?> list2 = new ArrayList<Number>();
        ArrayList<?> list3 = new ArrayList<Integer>();//问号代表任何的包装类都行

//        ArrayList<?extends Number> list4 = new ArrayList<Object>();//object怎么可能继承Number呢

        ArrayList<?extends Number> list5 = new ArrayList<Number>();
        ArrayList<?extends Number> list6 = new ArrayList<Integer>();

        ArrayList<?super Number> list7 = new ArrayList<Object>();
        ArrayList<?super Number> list8 = new ArrayList<Number>();
//        ArrayList<?super Number> list9 = new ArrayList<Integer>();//Number怎么可能是Integer的父类呢



    }
}
