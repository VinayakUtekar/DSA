import java.util.Arrays;
import java.util.Scanner;

public class MatrixSort {
    public static void Sort(int [][] a, int n, int n2){
        int[] flatArray = new int[n * n2];
        int index = 0;
        for (int[] ne : a) {
            for (int val : ne) {
                flatArray[index++] = val;
            }
        }
        Arrays.sort(flatArray);
        index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = flatArray[index++];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int [][] a = new int[n][n2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        Sort(a,n,n2);
        sc.close();
    }
}
