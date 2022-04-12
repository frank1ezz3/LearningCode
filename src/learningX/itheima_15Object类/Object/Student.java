package learningX.itheima_15Object类.Object;

public class Student {
    private String name;
    private int age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //this---s1
        //o---s2
        // 首先比较地址
        if (this == o) return true;
        //判断参数是否为null    ||  判断是否来自同一个类
        if (o == null || getClass() != o.getClass()) return false;
        //向下转型
        Student student = (Student) o;//student==s2

        if (age != student.age) return false;//比较年龄值是否相同
        return name != null ? name.equals(student.name) : student.name == null;//比较姓名
    }

}
