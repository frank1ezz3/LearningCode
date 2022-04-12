package learningX.itheima_21File.File类概述和构造方法01;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {//三种方法都可
        //    public File(String pathname) {
        File f1 = new File("F:\\shuaideyibi\\java.txt");//只是一个抽象的new，其实没有这个txt
        System.out.println(f1);//重写了toString方法

        System.out.println("---------------------------");
        //    public File(String parent, String child) {
        File f2 = new File("F:\\shuaideyibi","java.txt");//只是一个抽象的new，其实没有这个txt
        System.out.println(f2);//重写了toString方法

        System.out.println("---------------------------");

        File f3 = new File("F:\\shuaideyibi");
        File f4 = new File(f3, "java.txt");
        System.out.println(f4);
    }
}
