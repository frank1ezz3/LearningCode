package learningX.itheima_11形参和返回值.接口名作为形参和返回值;

public class JumppingOperator {
    public void useJumpping(Jumpping j){//相当于Jumpping j = new Cat();
        j.jump();
    }

    public Jumpping getJumpping(){
        Jumpping j = new Cat();
        return j;
    }
}
