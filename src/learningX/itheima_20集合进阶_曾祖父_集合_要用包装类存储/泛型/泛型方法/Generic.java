package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型.泛型方法;

public class Generic{//在这里加类型
//    public void show(String s ){
//        System.out.println(s);
//    }
//    public void show(Integer i ){//麻烦的一比
//        System.out.println(i);
//    }
//    public void show(Boolean b ){
//        System.out.println(b);
//    }

//    public void show(T t){
//        System.out.println(t);//有点麻烦
//    }

    public <T> void show(T t){
        System.out.println(t);
    }
}
