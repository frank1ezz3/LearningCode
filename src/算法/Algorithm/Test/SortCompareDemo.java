package 算法.Algorithm.Test;

import 算法.Algorithm.sort.Insertion;
import 算法.Algorithm.sort.Shell;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import static java.util.Arrays.sort;

public class SortCompareDemo {
    public static void main(String[] args) {
        Integer[] arr = {4,5,6,3,2,1};
        testShell(arr);
        testInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void testShell(Integer[] a){
        long start = System.currentTimeMillis();

        Shell.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

    public static void testInsertion(Integer[] a){
        long start = System.currentTimeMillis();

        Insertion.sort(a);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
