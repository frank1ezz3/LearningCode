package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型.泛型接口;

public class Genericlmpl<T> implements Generic<T>{
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
