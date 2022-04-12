package learningX.itheima_21File.File类判断和获取功能03;

import java.io.File;

public class FileDemo03 {
    public static void main(String[] args) {
        File f = new File("F:\\shuaideyibi\\java.txt");

        System.out.println(f.isDirectory());//是否为目录
        System.out.println(f.isFile());//是否为文件
        System.out.println(f.exists());//是否存在
        System.out.println("---------------------------------");

        System.out.println(f.getAbsolutePath());//绝对路径名字符串
        System.out.println(f.getPath());//路径名字符串
        System.out.println(f.getName());//文件或目录的名字
        System.out.println("---------------------------------");

        File f2 = new File("F:\\shuaideyibi");
        String[] strArray = f2.list();//String[]这里是这个所以都会遍历
        for(String str : strArray){
            System.out.println(str);
        }
        System.out.println("------------------");
        File[] fileArray = f2.listFiles();//因为这里是File[]，所以可以判断
        for(File file : fileArray){
            if(file.isFile()){
                System.out.println(file.getName());//判断是否为文件
            }
        }


    }
}
