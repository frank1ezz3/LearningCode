package 算法.Algorithm.Test;

import 算法.Algorithm.liner.SequenceList;

public class SequenceListTest {
    public static void main(String[] args) {
        //创建顺序表对象
        SequenceList<String> s1 = new SequenceList<>(10);
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert(1,"詹姆斯");
        //测试获取
        String getResult = s1.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        //测试删除
        String removeResult = s1.remove(0);
        System.out.println("删除的元素是"+removeResult);
        //测试清空
        s1.clear();
        System.out.println("情况后线性表中的元素个数为："+s1.length());
    }
}
