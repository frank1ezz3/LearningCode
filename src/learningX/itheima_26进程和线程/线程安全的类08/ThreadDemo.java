package learningX.itheima_26进程和线程.线程安全的类08;

import java.util.*;

//线程安全类
//StringBuffer     Vector      Hashtable

public class ThreadDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2 = new StringBuilder();

        Vector<String> v = new Vector<>();
        ArrayList<String> array = new ArrayList<>();

        Hashtable<String, String> ht = new Hashtable<>();
        HashMap<String, String> hm = new HashMap<>();

        List<String> list = Collections.synchronizedList(new ArrayList<String>());//包装成线程安全类
    }
}
