package learningX.itheima_07继承的基本常识.案例_老师和学生;

public class Demo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.setName("李佳豪");
        t1.setAge(1);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("陆少杰",2);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();


    }
}
