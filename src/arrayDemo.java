public class arrayDemo {
    public static void main(String[] args) {
//             名          长度为3
        int[] arr = new int[3];

        System.out.println(arr);//内存空间的地址值

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        arr[0]=100;
        arr[2]=200;

        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("-----------------------------------------------------------");
        //                                由系统决定他的长度 简化：int[] arr ={1,2,3}
        int []    arr1   = new        int[]{1,2,3};

        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println("-----------------------------------------------------------");
        for(int x=0;x<arr1.length;x++){
            System.out.println(arr1[x]);
        }
    }
}
