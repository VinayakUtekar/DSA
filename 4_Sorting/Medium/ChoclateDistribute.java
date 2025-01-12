import java.util.Arrays;
import java.util.Scanner;

public class ChoclateDistribute {
    public static void Find(int [] arr, int s){
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + s -1  < arr.length; i++) {
            int diff = arr[i+s-1] - arr[i];
            if(diff<min){
                min = diff;
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        Find(arr,s);
        sc.close();
    }
}
