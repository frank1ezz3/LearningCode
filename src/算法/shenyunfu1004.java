package 算法;

import java.util.ArrayList;
import java.util.Scanner;

public class shenyunfu1004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int s = scan.nextInt();
            for (int j = 0; j < s; j++) {
                Integer z = scan.nextInt();
                list.add(z);
            }

            int maxIndex = 0;
            int w;
            for(w=0;w<list.size();w++){
                if(list.get(w)>maxIndex){
                    maxIndex=list.get(w);
                }
            }
            int f=list.indexOf(maxIndex);

            System.out.println(f+1);

            System.out.println(maxIndex);
        }
        scan.close();
    }
}