package learningX.itheima_10接口.接口的成员特点;

public class InterImpl extends Object implements Inter{
    public InterImpl(){
        super();
    }

    @Override
    public void method() {
        System.out.println("method");
    }

    @Override
    public void show() {
        System.out.println("show");
    }
}
