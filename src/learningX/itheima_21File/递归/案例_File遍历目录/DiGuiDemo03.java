package learningX.itheima_21File.递归.案例_File遍历目录;

import java.io.File;

public class DiGuiDemo03 {
    public static void main(String[] args) {
        File srcFile = new File("F:\\javaweb\\jisuanji\\learning");

        getAllFilePath(srcFile);
    }

    public static void getAllFilePath(File srcFile){
        //获取给定目录下的所以文件或目录的File数组
        File[] fileArray = srcFile.listFiles();
        //遍历该File数组，得到每一个File对象
        if(fileArray!=null){
            for(File file : fileArray){
                //判断是否为目录
                if(file.isDirectory()){
                    getAllFilePath(file);//如果是，继续递归调用方法，直到找不到任何目录
                }else{
                    System.out.println(file.getAbsolutePath());//不是直接输出绝对路径
                }
            }
        }
    }
}
