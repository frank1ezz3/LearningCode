package lanqiaobei2016;

public class A201602生日蜡烛 {

    public static void main(String[] args) {//等差数列
        for (int i = 1; i < 100; i++) {
            int t =i*(i-1)/2;
            if((236-t)%i==0) System.out.println((236-t)/i+" "+i);
        }
    }




    //拙见-success
//    public static void main(String[] args) {
//
//        for (int i = 0; i < 100; i++) {
//            for (int j = i; j < 100; j++) {
//                int total =0;
//                for (int k = i; k < j; k++) {
//                    total = total+k;
//                    if(total==236) {
//                        System.out.println(i);
//                    }
//                }
//            }
//        }
//    }


}
