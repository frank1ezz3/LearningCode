package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.泛型.泛型类;

public class GenericDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("李佳豪");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
        System.out.println(t.getAge());

        System.out.println("------------------------------");

        Generic<String> g1 = new Generic<>();
        g1.setT("ljh");
        System.out.println(g1.getT());

        Generic<Integer> g2 = new Generic<Integer>();
        g2.setT(30);
        System.out.println(g2.getT());

        Generic<Boolean> g3 = new Generic<>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
