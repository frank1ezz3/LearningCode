public class mountain_paper {
    public static void main(String[] args) {
        int count = 0;

        double paper = 0.1;

        int zf = 8844430;

        while (paper <= zf) {
            paper *= 2;
            count++;
        }
        System.out.println("需要折叠：" + count + "次");
    }
}
