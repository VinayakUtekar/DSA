import java.util.Arrays;
import java.util.Scanner;

public class CommonIn3 {
    public static void Find(int [] a, int [] a2, int [] a3){
        Arrays.sort(a);
        Arrays.sort(a2);
        Arrays.sort(a3);

        int i = 0, j = 0, k = 0;
        while (i < a.length && j < a2.length && k < a3.length) {
            if (a[i] == a2[j] && a2[j] == a3[k]) {
                System.out.print(a[i] + " ");
                i++;
                j++;
                k++;
            } 
            else if (a[i] < a2[j]) {
                i++;
            } else if (a2[j] < a3[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[]a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = sc.nextInt();
        }
        int n3 = sc.nextInt();
        int[]a3 = new int[n3];
        for (int i = 0; i < n3; i++) {
            a3[i] = sc.nextInt();
        }
        Find(a,a2,a3);
        sc.close();
    }
}
