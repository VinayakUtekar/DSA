import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void mean(int[] arr){
        int sum =0;
        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
        }
        System.out.println("Mean : " + (double)sum/arr.length);
    }
    public static void median(int [] arr){
        Arrays.sort(arr);
        int len = arr.length;
        if(len%2==1){
            System.out.println("Median: " + arr[len/2]);
        }
        else{
            System.out.println("Median: " + (double)(arr[len/2-1]+arr[(len/2)])/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();
            arr[i] = s;
        }
        mean(arr);
        median(arr);
        sc.close();
    }
}
