import java.util.Scanner;

public class NearKSort {
    public static void Sort(int[] a, int k){
        int i,key,j;
        for (i = 1; i < a.length; i++) {
            key = a[i];
            j = i-1;
            while (j >= 0 && a[j] > key) {
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = key;
        }

        for (int v = 0; v < a.length; v++) {
            System.out.print(a[v] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        Sort(a,k);
        sc.close();
    }
}
