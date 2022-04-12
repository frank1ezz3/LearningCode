package learningX.itheima_01无参带参;

public class Student {
    //成员变量
    private String name;
    private int age;

    public Student() {
        System.out.println("无参构造方法");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("带参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
