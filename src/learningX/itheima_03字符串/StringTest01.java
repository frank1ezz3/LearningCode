package learningX.itheima_03字符串;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "itheima";
        String password = "czbk";

        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);

            System.out.println("请输入用户名");
            String name = sc.nextLine();

            System.out.println("请输入密码");
            String pwd = sc.nextLine();

            if (name.equals(username) && pwd.equals(password)) {
                System.out.println("登陆成功");
                break;
            } else {
                if (2 - i == 0) {
                    System.out.println("您的帐户被锁定，请与管理员联系");
                } else {
                    System.out.println("登陆失败，你还有" + (2 - i) + "次机会");
                }
            }
        }


    }
}


