package learningX.itheima_01无参带参;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.show();
        System.out.println("----------------");
        Student s1 = new Student("林青霞", 30);
        s1.show();

        System.out.println("----------------");
        s.setName("林青霞");
        s.setAge(30);

        s.show();
        System.out.println("------------------");
        System.out.println(s.getName() + "," + s.getAge());
    }

}
