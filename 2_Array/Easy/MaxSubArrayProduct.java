import java.util.Scanner;

public class MaxSubArrayProduct {
    public static void Max(int [] arr){
        int max =arr[0];
        
        for (int i = 0; i < arr.length; i++) {
            int pro = 1;
            for (int j = i; j < arr.length; j++) {
                pro *= arr[j];
                max = Math.max(max, pro);
            }
        }
        System.out.println("Maximum : " + max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Max(arr);
        sc.close();
    }
}
