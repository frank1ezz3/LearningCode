package learningX.itheima_19异常.自定义异常;

public class Teacher {
    public void checkScore(int score)throws ScoreException{//这个不代表一定会出异常
        if(score<0||score>100){//throw代表一定有异常
            throw new ScoreException("你的分数有问题啊大哥");//带参 直接在throw里new了
        }else{
            System.out.println("分数正常");
        }
    }
}
//                                                      报错就会显示
//learningX.itheima_19异常.自定义异常.ScoreException: 你的分数有问题啊大哥
//	at learningX.itheima_19异常.自定义异常.Teacher.checkScore(Teacher.java:6)
//	at learningX.itheima_19异常.自定义异常.TeacherDemo.main(TeacherDemo.java:14)
