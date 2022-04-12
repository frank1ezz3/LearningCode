package lanqiaobei2016;
/*
煤球堆山

第一层一个
第二层三个
第三层六个
第四层十个

问100曾有几个
 */
public class A201601煤球数目 {
    public static void main(String[] args) {
        long first = 1;
        long plus = 2;
        long pre =1;
        for (int i = 1; i < 100; i++) {
            first = first +plus+pre;
            pre = pre +plus;
            plus++;
        }
        System.out.println(first);
    }
}
