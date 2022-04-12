package learningX.itheima_04StringBuilder;

public class StringBuilderDemo02 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();


//        StringBuilder sb2 = sb.append("helloworld");
        //上面这个append（任意类型）添加数据，并返回对象本身
//        System.out.println("sb:"+sb);
//        System.out.println("sb2:"+sb2);
//        System.out.println(sb==sb2);

        sb.append("hello");
        sb.append("world");
        sb.append("java");
        sb.append(100);

        System.out.println("sb:"+sb);
        System.out.println("------------------------------------");

        sb.append("李").append("佳").append("豪").append("帅");//append就是一个添加方法
        System.out.println("sb:"+sb);
        sb.reverse();//reverse就是一个关键字方法 反转
        System.out.println("sb:"+sb);

    }




}
