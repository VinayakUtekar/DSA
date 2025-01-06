import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KSmallest2D {
    public static void Find(int [][] a, int k, int n, int n2){
        ArrayList<Integer> g = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                if(!g.contains(a[i][j])){
                    g.add(a[i][j]);
                }
            }
        }
        Collections.sort(g);
        System.out.println(g.get(k-1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int [][] arr = new int [n][n2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        Find(arr,k,n,n2);
        sc.close();
    }
}
