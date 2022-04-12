package learningX.itheima_15Object类.Object;

public class ObjectDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("李佳豪");
        s1.setAge(2);
        System.out.println(s1);//按下ctrl b

        System.out.println("-------------------------");

        Student s2 = new Student();
        s2.setName("李佳豪");
        s2.setAge(2);
        System.out.println(s2);//按下ctrl b

        System.out.println(s1.equals(s2));
        /*
        public boolean equals(Object obj) {//this ---s1     object ----s2  因为地址值不同所以false
          return (this == obj);
        }
         */

        //如果要比较数值就要重写
    }

}
