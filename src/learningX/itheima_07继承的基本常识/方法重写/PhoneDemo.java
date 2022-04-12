package learningX.itheima_07继承的基本常识.方法重写;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("林青霞");

        System.out.println("----------");
        NewPhone np = new NewPhone();
        np.call("林青霞");
    }
}
