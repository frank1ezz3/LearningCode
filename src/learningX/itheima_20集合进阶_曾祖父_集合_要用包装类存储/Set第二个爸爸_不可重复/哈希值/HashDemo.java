package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.哈希值;

public class HashDemo {
    public static void main(String[] args) {
        Student s = new Student("李佳豪",30);

        //public int hashCode():返回对象的哈希码值
        System.out.println(s.hashCode());
        System.out.println(s.hashCode());

        System.out.println("----------------------------");

        Student s1 = new Student("李佳豪",30);//默认情况下不同对象哈希值不同
//重写可以改
        //public int hashCode():返回对象的哈希码值
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());

        System.out.println("hello".hashCode());//99162322

        System.out.println("----------------------------");

        System.out.println("重地".hashCode());//滑稽
        System.out.println("通话".hashCode());//String《可 能》重写了hashcode的方法
    }
}
