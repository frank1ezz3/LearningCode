package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.List爸爸的一个_可重复.增强for循环;

import java.util.ArrayList;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5};
        for(int i :arr){
            System.out.println(i);
        }
        System.out.println("------------------------");

        String[] strArray = {"hello","world","java"};

        for (String s :strArray){
            System.out.println(s);
        }

        System.out.println("------------------------");

        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(String s :list){
            System.out.println(s);
        }

        //增强循环下是个Iterator循环器
//        for(String s :list){
//            if(s.equals("world")){
//                list.add("javaee");//抛出了并发修改异常噢！
//            }
//        }

    }
}
