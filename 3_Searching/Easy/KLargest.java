import java.util.Arrays;
import java.util.Scanner;

public class KLargest {
    public static void Find(int [] d, int k){
        Arrays.sort(d); 
        int start = d.length - k; 
        for (int i = start; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Find(arr,k);
        sc.close();
    }
}
