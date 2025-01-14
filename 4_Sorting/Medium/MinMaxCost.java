import java.util.Arrays;
import java.util.Scanner;

public class MinMaxCost {
    public static void Min(int[] a, int n, int t){
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = res + a[i];
            n = n-t;
        }
        System.out.println(res);  
    }
    public static void Max(int[] a, int n, int t){
        int res2 = 0, index = 0;
        for (int i = n-1; i >= index ; i--) {
            res2 = res2 + a[i];
            index = index + t;
        }
        System.out.println(res2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int t = sc.nextInt();
        Min(a, n, t);
        Max(a, n, t);
        sc.close();
    }
}
