package learningX.itheima_25标准输入输出流.对象序列化流;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID= 42L;//如果要变更类文件里的内容：比如重写了toString
    private String name;
//    private int age;
    private transient int age;//不想被序列化就加个teansient，返回默认值0

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
