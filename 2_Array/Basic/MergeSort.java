import java.util.Scanner;

public class MergeSort {
    public static void Sort(int[] a, int s, int m, int e) {
        int n1 = m - s + 1;
        int n2 = e - m;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = a[s + i];
        }
        for (int j = 0; j < n2; j++) {
            r[j] = a[m + 1 + j];
        }

        int i = 0, j = 0, k = s;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

    public static void Merge(int[] a, int s, int e) {
        if (s < e) {
            int m = s + (e - s) / 2;
            Merge(a, s, m);         
            Merge(a, m + 1, e);     
            Sort(a, s, m, e);       
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int[] a = new int[nu];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        Merge(a, 0, a.length - 1);

        System.out.println("Sorted array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
