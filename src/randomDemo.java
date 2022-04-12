import java.util.Random;

public class randomDemo {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i <= 10; i++) {
            int number = r.nextInt(10);
            System.out.println("number:" + number);//获取10个10以内的数
        }
        int x = r.nextInt(100) + 1;//0-99 所以+1
        System.out.println(x);//获取一个1到100的数
    }
}
