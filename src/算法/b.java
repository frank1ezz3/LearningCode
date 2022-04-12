package 算法;

import java.util.ArrayList;
import java.util.List;

public class b {
    public static void main(String[] args) {

        List<a> list = new ArrayList<a>();

        list.add(new a(1,2));
        list.add(new a(3,4));
        for (a i:list
             ) {
            System.out.println(i);
        }
    }
}
