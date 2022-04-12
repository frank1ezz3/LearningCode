package learningX.itheima_24字符流案例.集合到文件数据排序改进版;

public class Student {
    private String name;
    private int chinese;
    private int math;
    private int engilsh;

    public Student() {
    }

    public Student(String name, int chinese, int math, int engilsh) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.engilsh = engilsh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEngilsh() {
        return engilsh;
    }

    public void setEngilsh(int engilsh) {
        this.engilsh = engilsh;
    }

    public int getSum() {
        return this.chinese + this.math + this.engilsh;
    }
}
