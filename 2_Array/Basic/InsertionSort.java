import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nu = sc.nextInt();
        int [] a = new int[nu];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j = i;
			while(j>0 && a[j-1] > temp) {
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
        for (int i : a) {
            System.out.print(i+" ");
        }
        sc.close();
    }
}
