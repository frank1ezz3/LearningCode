package learningX.itheima_15Object类;

public class ObjectDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("李佳豪");
        s.setAge(2);
        System.out.println(s);//按下ctrl b
        System.out.println(s.toString()) ;

        /*
        public void println(Object x) {//x=s
            String s = String.valueOf(x);
            synchronized (this) {
                print(s);
                newLine();
            }
        }

        public static String valueOf(Object obj) {  //obj=x
        return (obj == null) ? "null" : obj.toString();
    }

        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());//全路径名
        }


         */

    }
}
