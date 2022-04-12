package learningX.itheima_20集合进阶_曾祖父_集合_要用包装类存储.Set第二个爸爸_不可重复.TreeSet概述和特点_二儿子_有序;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    @Override
    public int compareTo(Student i) {
//        return -1;
        int num =  this.age - i.age;//this和i换顺序可以改变升降序
        int num2 = num == 0?this.name.compareTo(i.name):num;
        return num2;


    }
}
