package 算法;

public class a {
    private int name;
    private int age;

    public a(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public a() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
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
        return "a{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
