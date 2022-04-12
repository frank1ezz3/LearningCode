package learningX.itheima_24字符流案例.复制单级文件夹;

import java.io.*;//失败品 以后再战   runtimeException

public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("F:\\shuaideyibi\\niudeyibi");

        //获取数据源目录File对象的名称（niudeyibi）
        String srcFolderName = srcFolder.getName();

        //创建目的地目录File对象，路径名是模块名+itcast组成（）
        File destFolder = new File("learning", srcFolderName);

        //判断目的地是否有重名的文件夹，没有就创建
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        //获取数据源目录下所有文件的File数组
        File[] listFiles = srcFolder.listFiles();

        //遍历file的到所有的File对象，File对象就是数据源文件
        for(File srcFile:listFiles){
            //数据源文件：F:\shuaideyibi\niudeyibi\\里的文件
            //获取数据源文件file对象的名称。。。
            String srcFileName = srcFile.getName();
            //创建目的地文件File对象，路径名是目的地目录+文件。。。组成
            File destFile = new File(destFolder, srcFileName);
            //复制文件
            copyFile(srcFile,destFile);
        }

    }

    private static void copyFile(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bys = new byte[1024];//1024及其整数倍的容器//一次读一个字符数组
        int len;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }
}
