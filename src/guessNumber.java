import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {

        Random r = new Random();

        int number = r.nextInt(100) + 1;
        while (true) {
            Scanner sc = new Scanner(System.in);

            System.out.println("输入你要猜的数字：");
            int guessNumber = sc.nextInt();

            if (guessNumber > number) {
                System.out.println("你猜的数字" + guessNumber + "大了");
            } else if (guessNumber < number) {
                System.out.println("你猜的数字" + guessNumber + "小了");
            } else {
                System.out.println("猜中了，你真是个小天才");
                break;
            }
        }

    }
}
