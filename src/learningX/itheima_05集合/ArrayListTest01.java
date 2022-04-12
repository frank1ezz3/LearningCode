package learningX.itheima_05集合;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("刘正风");
        array.add("左冷禅");
        array.add("风清扬");

        System.out.println(array);
        /*
        System.out.println(array.get(0));`
        System.out.println(array.get(1));
        System.out.println(array.get(2));
        */
        for(int i=0;i<array.size();i++){
            String s = array.get(i);
            System.out.println(s);
        }

    }
}
