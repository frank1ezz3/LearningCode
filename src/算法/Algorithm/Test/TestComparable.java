package 算法.Algorithm.Test;

import 算法.Algorithm.sort.Student;

public class TestComparable {
    public static void main(String[] args) {
        //创建两个student对象
        Student s1 = new Student();
        s1.setUsername("ljh");
        s1.setAge(12);

        Student s2 = new Student();
        s2.setUsername("lsj");
        s2.setAge(22);

        Comparable max = getMax(s1, s2);
        System.out.println(max);
    }

    public static Comparable getMax(Comparable c1,Comparable c2){

        int result =c1.compareTo(c2);

        if(result>=0){
            return c1;
        }else{
            return c2;
        }

    }
}
