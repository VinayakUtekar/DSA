import java.util.Scanner;

public class RowSorting2D {
    public static void Sort(int [][] a,int n, int n2){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                for (int j2 = j+1; j2 < n2; j2++) {
                    if(a[i][j] > a[i][j2]){
                        int temp = a[i][j];
                        a[i][j] = a[i][j2];
                        a[i][j2] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(a[i][j] + " ");
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
