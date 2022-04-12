package 算法;

import java.util.Scanner;

public class shenyunfu1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Scanner SC = new Scanner(System.in);
        for (int i = 0; i < t; i++) {
            String string = SC.nextLine();
            StringBuilder buffer = new StringBuilder();
            buffer.append(string);
            String str1 = buffer.toString();
            String str2 = buffer.reverse().toString();
            if (str1.equals(str2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        scan.close();
        SC.close();
    }
}