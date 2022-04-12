package learningX.itheima_07继承的基本常识.案例_老师和学生2;

public class Teacher extends Person{
    public Teacher (){}
    public Teacher(String name,int age){
        super(name,age);
    }

    public void teach(){
        System.out.println("用爱成就每一位学员");
    }
}
