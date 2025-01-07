import java.util.Arrays;
import java.util.Scanner;

public class KSmallestEle {
    public static void Small(int[] a, int k){
        Arrays.sort(a);
        System.out.println(a[k-1]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Small(a,k);
        sc.close();
    }
}
