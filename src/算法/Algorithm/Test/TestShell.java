package 算法.Algorithm.Test;

import 算法.Algorithm.sort.Shell;

import java.util.Arrays;

public class TestShell {
    public static void main(String[] args) {
        Integer[] a = {4,6,8,7,9,2,10,1};
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
