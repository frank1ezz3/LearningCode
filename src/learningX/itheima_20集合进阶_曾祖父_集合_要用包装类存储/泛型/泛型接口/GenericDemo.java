package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型.泛型接口;

public class GenericDemo {
    public static void main(String[] args) {

        Genericlmpl<String> g1 = new Genericlmpl<>();
        g1.show("ljh");

        Genericlmpl<Integer> g2 = new Genericlmpl<>();
        g2.show(33);


    }
}
