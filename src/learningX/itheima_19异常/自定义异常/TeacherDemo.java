package learningX.itheima_19异常.自定义异常;

import java.util.Scanner;

public class TeacherDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入分数：");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        }catch(ScoreException e){
            e.printStackTrace();
        }
    }
}
