package learningX.itheima_11形参和返回值.接口名作为形参和返回值;

import learningX.itheima_10接口.Jumping;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }


}
