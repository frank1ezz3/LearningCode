package 算法.base递归;

public class 反转字符串 {//逐字反转
    public static void main(String[] args) {
        System.out.println(reverse("qwer",3));
    }
    static String reverse(String s,int end){
        if(end == 0 ){
            return ""+s.charAt(0);
        }
        return s.charAt(end)+reverse(s,end-1);
    }
}
