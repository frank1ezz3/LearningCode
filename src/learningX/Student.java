package learningX;

public class Student {

    String name;
    private int age;//private的使用啊啊啊啊啊啊啊啊

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        if (a < 0 || a > 120) {
            System.out.println("你给的年龄有误");
        } else {
            age = a;
        }
    }

    public void show() {
        System.out.println(name + "," + age);
    }
}
