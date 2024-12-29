import java.util.Scanner;

public class KConcatenateMaxSumSubArray {
    public static void Max(int [] arr){
        int max=arr[0];
        int Sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            Sum = Math.max(arr[i], Sum+arr[i]);
                max = Math.max(max, Sum); 
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
        int k = sc.nextInt();
        int [] fin = new int[n*k];
        for (int i = 0; i < k; i++) {
            System.arraycopy(arr, 0, fin, i * n, n);
        }
        Max(fin);
        sc.close();
    }
}
