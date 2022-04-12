public class Test02 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 7) {
                System.out.println(i);
            }
        }
    }
}
