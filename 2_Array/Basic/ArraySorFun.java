import java.util.Arrays;
import java.util.Scanner;

public class ArraySorFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
