import java.util.Scanner;

public class SumOfSubarray {
    public static void Sum(int [] a){
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i] * (i+1) * (a.length-i);
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Sum(arr);
        sc.close();
    }
}